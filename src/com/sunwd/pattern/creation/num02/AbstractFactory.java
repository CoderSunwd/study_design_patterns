package com.sunwd.pattern.creation.num02;

public abstract class AbstractFactory {
	
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
	
}