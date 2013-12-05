package com.maciej.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name="dummy")
@SessionScoped
public class DummyBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int number;
	private String samochod, model;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSamochod() {
		return samochod;
	}
	public void setSamochod(String samochod) {
		this.samochod = samochod;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
