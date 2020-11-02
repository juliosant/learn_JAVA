package courseJava.classRoom;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import courseJava.classRoom.entities.Circle;
import courseJava.classRoom.entities.Rectangle;
import courseJava.classRoom.entities.Shape;
import courseJava.classRoom.enums.Color;

public class Day09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CLASSES E MÉTODOS ABSTRATOS
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Rectangle");
		System.out.print("Color: ");
		Color color = Color.valueOf(sc.next());
		System.out.print("Width: ");
		Double width = sc.nextDouble();
		System.out.print("Height: ");
		Double height = sc.nextDouble();
		Shape rect = new Rectangle(color, width, height);
		
		System.out.println();
		
		System.out.println("Circle");
		System.out.print("Color: ");
		color = Color.valueOf(sc.next());
		System.out.print("Radius: ");
		Double radius = sc.nextDouble();
		Shape circ = new Circle(color, radius);
		
		System.out.println("Area rectangle: " + String.format("%.2f", rect.area()));
		System.out.println("Color is " + rect.getColor());
		System.out.println("Area circle: " + String.format("%.2f", circ.area()));
		System.out.println("Color is " + circ.getColor());
		*/
		
		List<Shape> shapes = new ArrayList<>();
		
		System.out.println("How many the shapes do you want to show?");
		int qtyShapes = sc.nextInt();
		
		
		for(int i=0; i<qtyShapes; i++) {
			System.out.println("Shape #"+(i+1)+" data:");
			System.out.print("Rectangle or Circle (r/c)?");
			char shapeOption = sc.next().toLowerCase().charAt(0);
			
			System.out.print("Color: ");
			Color color = Color.valueOf(sc.next());
			
			if(shapeOption == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				shapes.add(new Rectangle(color, width, height));
				
			}
			else if(shapeOption == 'c') {
				System.out.print("Radius:");
				Double radius = sc.nextDouble();
				shapes.add(new Circle(color, radius));
			}
			
			else {
				System.out.println("Invalid. Try again!");
			}
		}
		
		for(Shape shape : shapes) {
			System.out.println("Area: " + shape.area());
			System.out.println("Color: " + shape.getColor());
		}
		sc.close();
	}

}
