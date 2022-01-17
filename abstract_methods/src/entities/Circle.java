package entities;

import entities.enums.Color;

public class Circle extends Shape{

	private double radius;
	
	public Circle() {
		super();
	}

	public Circle(Color color, double radios) {
		super(color);
		this.radius = radios;
	}

	public double getRadios() {
		return radius;
	}

	public void setRadios(double radios) {
		this.radius = radios;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
