package org.kms.patterns.creational.factory;

public class FactoryPatternWithInterface {
	
	public static void main(String[] args) {
		ShapeFactory shapefactory= new ShapeFactory();
		// client class uses the interface and factory class to get actual class object.
		Shape circle= shapefactory.getShape("circlE");
		System.out.println(circle.draw());;
		Shape reCtangle= shapefactory.getShape("reCtangle");
		System.out.println(reCtangle.draw());
		Shape Triangle= shapefactory.getShape("Triangle");
		System.out.println(Triangle.draw());
		
	}

}
