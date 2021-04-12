package com.example.sbet.bootingweb.models;

public class Room {
	
	private long id;
	private String  number, name, info;
	
	public Room(long id, String number, String name, String info) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.info = info;
	}

	public Room() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
	

}
