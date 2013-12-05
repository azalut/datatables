package com.maciej.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import com.maciej.dto.Person;
@ManagedBean(name="person")
@SessionScoped
public class PersonBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private ArrayList<Person> people = new ArrayList<Person>(Arrays.asList(
			new Person("maciek", "tulaza", 1500),
			new Person("wojtek", "mirecki", 2500),
			new Person("daniel", "witowski", 3000),
			new Person("michal", "szal", 1200)
	));
	private DataModel<Person> peopleDataModel;
	
	public DataModel<Person> getPeopleDataModel(){
		if(peopleDataModel == null){
			peopleDataModel = new ListDataModel<Person>(people);
		}
		return peopleDataModel;
	}
	
	public String delete(Person person){
		people.remove(person);
		return null;
	}
}
