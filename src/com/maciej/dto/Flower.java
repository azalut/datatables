package com.maciej.dto;

public class Flower {
	private int id;
	private String name;
	private String color;
	private int size;
	
	public Flower() {
		super();
	}

	public Flower(String name, String color, int size) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
	}
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}
