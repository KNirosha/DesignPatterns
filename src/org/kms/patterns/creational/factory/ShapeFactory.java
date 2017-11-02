package org.kms.patterns.creational.factory;

public class ShapeFactory {
	
	public Shape getShape(String name){
		if(name.toLowerCase().equals("circle")){
			return new Circle();
		}else if(name.toLowerCase().equals("triangle")){
			return new Triangle();
		}else if(name.toLowerCase().equals("rectangle")){
			return new Rectangle();
		}else{
			return null;
		}
		
		
	}

}
