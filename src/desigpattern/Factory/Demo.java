package desigpattern.Factory;

import desigpattern.Factory.instance.Shape;

public class Demo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// ��ȡ Circle �Ķ��󣬲��������� draw ����
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// ���� Circle �� draw ����
		shape1.draw();

		// ��ȡ Rectangle �Ķ��󣬲��������� draw ����
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// ���� Rectangle �� draw ����
		shape2.draw();

		// ��ȡ Square �Ķ��󣬲��������� draw ����
		Shape shape3 = shapeFactory.getShape("triangle");

		// ���� Square �� draw ����
		shape3.draw();
	}
}
