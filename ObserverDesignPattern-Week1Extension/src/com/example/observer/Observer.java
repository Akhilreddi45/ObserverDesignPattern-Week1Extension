package com.example.observer;

public abstract class Observer {
	
	protected String viewName;
	
	protected Subject sub;

	public Observer(String viewName, Subject sub) {
		super();
		this.viewName = viewName;
		this.sub = sub;
		sub.registerObserver(this);
	}
	
	abstract public void updateView();
	

}
