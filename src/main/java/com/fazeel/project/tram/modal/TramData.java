package com.fazeel.project.tram.modal;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Tram_TBL")
public class TramData {
	
	public  TramData() {}
	
	@Id
	private int id;
	private String name;
	private String Source;
	private String Destination;
	private int fare;
	private Date time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "TramData [id=" + id + ", name=" + name + ", Source=" + Source + ", Destination=" + Destination
				+ ", fare=" + fare + ", time=" + time + "]";
	}

}
