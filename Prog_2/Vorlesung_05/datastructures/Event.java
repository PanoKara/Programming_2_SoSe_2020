package datastructures;

import java.util.Calendar;

public class Event {
	
	private String eventName;
	private String eventPlace;
	private Calendar time;
	
	public Event(String eventName, String eventPlace, Calendar time) {
		super();
		this.eventName = eventName;
		this.eventPlace = eventPlace;
		this.time = time;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventPlace() {
		return eventPlace;
	}

	public void setEventPlace(String eventPlace) {
		this.eventPlace = eventPlace;
	}

	public Calendar getTime() {
		return time;
	}

	public void setTime(Calendar time) {
		this.time = time;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (eventName == null) {
			if (other.eventName != null)
				return false;
		} else if (!eventName.equals(other.eventName))
			return false;
		if (eventPlace == null) {
			if (other.eventPlace != null)
				return false;
		} else if (!eventPlace.equals(other.eventPlace))
			return false;
		if (time != other.time)
			return false;
		return true;
	}
	
	
	
	
	

}
