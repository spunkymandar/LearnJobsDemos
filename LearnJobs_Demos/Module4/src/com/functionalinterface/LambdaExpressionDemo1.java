package com.functionalinterface;

interface Drawable{
	public void draw(int x);
}

public class LambdaExpressionDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declarative way of programming
		Drawable circle=x->System.out.println("circle is being drawn ");
		Drawable reactangle=x->System.out.println("rectangle is being drawan");
		//empList.forEach(person->System.out.println(person));
		circle.draw(10);
		reactangle.draw(20);
		
	}

}
