package com.example.observer;

public class VerticalViewObserver extends Observer {

	public VerticalViewObserver(String viewName, Subject sub) {
		super(viewName, sub);
	}

	@Override
	public void updateView() {
		String data = sub.getData();

		String[] dArray = data.split(",");

		System.out.println("********************************************************");

		System.out.println("Vertical View : ");

		for (String st : dArray) {
			System.out.println(st);
		}

		System.out.println("********************************************************");

	}

}
