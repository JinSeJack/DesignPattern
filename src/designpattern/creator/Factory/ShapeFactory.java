package designpattern.creator.Factory;

import desigpattern.Factory.instance.Circle;
import desigpattern.Factory.instance.Rectangle;
import desigpattern.Factory.instance.Shape;
import desigpattern.Factory.instance.Triangle;

public class ShapeFactory {
	public ShapeFactory(){
		
	}
	
	public Shape getShape(String shapeType){
		Shape s = null;
		if(shapeType == null){
	         return null;
	      }        
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      } else if(shapeType.equalsIgnoreCase("triangle")){
	         return new Triangle();
	      }
		return s;
	}
}
