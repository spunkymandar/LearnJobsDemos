
public class WrapperDemo {
	
	public static void main(String[] args) {
		//primitives -> int, double, float, char, byte, short
		int value1=10;
		
		//Wrapper object ->counterpart objects of primitive
		//Integer,Float, Double,Char, Byte, Short
		
		Integer i=new Integer(10);//boxing
		
		Integer y=10;//autoboxing : conversion of primitive to objects
		
		int ans=y.intValue();//unboxing 
		
		Integer number1=new Integer(10);
		Integer number2=new Integer(20);
		
		int ans1=number1+number2;//auto unboxing
		
		
		
		
	}

}
