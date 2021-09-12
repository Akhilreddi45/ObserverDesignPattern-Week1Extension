package com.example.observer;

public class Application {

	public static void main(String[] args) {

		Subject sub = new Subject();

		HorizantalViewObserver hObs = new HorizantalViewObserver("horizantal View", sub);
		VerticalViewObserver vObs = new VerticalViewObserver("Vertical View", sub);

		sub.setData("Apple,Banana,Orange");

		System.out.println(" Second message");

		sub.setData("task1,task2,task3,task4,task5");

	}

}
