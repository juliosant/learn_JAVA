package courseJava.classRoom.entities;

import courseJava.classRoom.enums.Color;

public abstract class Shape {
	private Color color;
	
	public Shape() {
		
	}
	
	
	public Shape(Color collor) {
		this.color = collor;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color collor) {
		this.color = collor;
	}


	public abstract Double area(); //métoodo abstrato não tem corpo. Só precisa ser sobrescrito em uma subclasse.
}
