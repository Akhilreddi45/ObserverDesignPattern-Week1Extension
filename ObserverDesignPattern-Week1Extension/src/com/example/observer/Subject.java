package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private String data;

	private List<Observer> observers= new ArrayList<>();

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
		updateObservers();
	}

	public void updateObservers() {
		
		for(Observer obs : observers) {
			obs.updateView();
		}
		
	}
	
	public void registerObserver(Observer obs) {
		observers.add(obs);
	}

	


}
