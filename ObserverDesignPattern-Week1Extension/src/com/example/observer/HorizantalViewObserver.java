package com.example.observer;

public class HorizantalViewObserver extends Observer {

	public HorizantalViewObserver(String viewName, Subject sub) {
		super(viewName, sub);
	}

	@Override
	public void updateView() {
		
		String data = sub.getData();
		
		System.out.println("********************************************************");
		
		System.out.println("horizantal View : "+data);
		
		System.out.println("********************************************************");

		
	}

}
