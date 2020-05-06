package ua.edu.sumdu.ta.saurav.pr1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task {
	private String title;
	private boolean active;
	private int time;
	private int start;
	private int end;
	private int repeat;
	
	/**
	 * @Saurav
	 * Constructor used to initialize title and time.*/
	public Task(String title, int time){
		this.setTitle(title);
		this.setTime(time);
	}
	
	/**
	 * @Saurav
	 * Constructor used to initialize variable for repeatitive task.*/
	public Task(String title, int start, int end, int repeat){
		this.setTitle(title);
		this.setTime(start, end, repeat);
	}
	
	/**
	 * @Saurav
	 * Get the title for Task*/
	public String gettitle() {
		return title;
		
	}
	
	/**
	 * @Saurav
	 * set the title for Task*/
	public void setTitle(String title) {
		this.title= title;
	}
	
	/**
	 * @Saurav
	 * To check whether Task is active or not*/
	public boolean isActive() {
		return active;
		
	}
	
	public void setActive(boolean active) {
		this.active= active;
	}
	
	public void setTime(int time) {
		this.time= time;
		this.repeat =0;
		if(isRepeated()) {
			this.start= time;
			this.repeat= getRepeatInterval();
			this.end= getEndTime();
		}
		
		
	}
	
	public void setTime(int start, int end, int repeat) {
		this.start= start;
		this.end= end;
		this.repeat= repeat;
		
		if(repeat == 0 && end ==0)
		{
			this.time= start;
		}
		
	
	}
	
	 /**
	   * @Saurav
	   * the time the notification starts (for a repetitive task) or the time of the only notification (for one-time task)*/
	public int getTime() {
		if(isRepeated())
			return start;
		else
			return time;
	}
	
	 /**
	   * @Saurav
	   * the time the notification starts (for a repetitive task) or or the time of the only notification (for one-time task)*/
	public int getStartTime() {
		if(start > 0 && isRepeated())
			return start;
		else
			return time;
	}
	 /**
	   * @Saurav
	   * the time the notification ends (for a repetitive task) or or the time of the only notification (for one-time task)*/
	public int getEndTime() {
		if( end > 0 && isRepeated()) 
			return end;
		else
			return time;
		
	}
	
	 /**
	   * @Saurav
	   * a time interval to repeat the task notification (for a repetitive task) or 0 (for one-time task)*/
  public int getRepeatInterval() {
	if( repeat > 0)
		return repeat;
	else
		return 0;
  }

  /**
   * @Saurav
   * says whether the task is repetitive*/
  public boolean isRepeated() {
	if(getRepeatInterval() > 0 && getRepeatInterval() != 0 ) 
		return true;
	else {
		return false;
	}
   }
  
  /**
   * @Saurav
   * Method to check the task status*/
  public String toString() {
	  
	  if(isActive())
	  {
		  if(isRepeated())
			  return "Task " + title + " from " + start+ " to "+ end+" every " +repeat+" seconds ";
		  else
			  return "Task " +title +  " at " +time; 
	  }
	  else
		  return "Task " + title + " is inactive";
  }
  
  public int nextTimeAfter(int notifyTime) {
	  int result = -1;
	  if(isRepeated()) {
		  if(notifyTime < end ) {
			  result = start;
			  while(notifyTime > result) {
				  result = result+ repeat;
			  }
		  }
	  }
	  else {
		  if(notifyTime < time)
			  result = time;
	  }
	  
	  return result;
  }
  
  public boolean equals(Task t) {
	  boolean flag = false;
	  if(t == null)
		  flag = false;
	  if(this == t)
		  flag= true;
	  
	  Map<String, Object> map1= new HashMap();
	  map1.put("Title", t.gettitle());
	  map1.put("StartTime", t.getTime());
	  map1.put("RepeatTime", t.getRepeatInterval());
	  map1.put("EndTime", t.getEndTime());
	  
	  Map<String, Object> map2= new HashMap();
	  map2.put("Title", this.gettitle());
	  map2.put("StartTime", this.getTime());
	  map2.put("RepeatTime", this.getRepeatInterval());
	  map2.put("EndTime", this.getEndTime());
	  
	  if(t.isRepeated()) {
		  
		  if(new ArrayList<Object>( map1.values() ).equals(new ArrayList<Object>( map2.values())))
			  flag = true;
		  else
			  flag = false;  
	  }else {
		  if(map1.get("Title").equals(map2.get("Title")) && map1.get("StartTime") == map2.get("StartTime")) {
			  flag = true;
		  }
		  else
			  flag= false;
	  }
	  return flag;
  }

}
