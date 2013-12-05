package com.maciej.bean;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.maciej.dto.Flower;

@ManagedBean(name="flower")
@RequestScoped
public class FlowerBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String color;
	private int size;
	
	private Flower flowerPlaceholder = new Flower();
	private ArrayList<Flower> flowerList = new ArrayList<Flower>();
	public ArrayList<Flower> getFlowerList(){
		return flowerList;
	}
	
	public String add(){
		flowerPlaceholder.setId( (flowerList.isEmpty())? 1 : flowerList.get(flowerList.size()-1).getId() + 1 );
		flowerPlaceholder.setName(this.name);
		flowerPlaceholder.setColor(this.color);
		flowerPlaceholder.setSize(this.size);
		flowerList.add(flowerPlaceholder);
		flowerPlaceholder = new Flower();
		return null;
	}
	
	public String delete(Flower flower){
		if(!flowerList.isEmpty()){
			flowerList.remove(flower);
		}
		return null;
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
