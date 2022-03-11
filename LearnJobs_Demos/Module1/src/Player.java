/*
 * variable : class variable
 * methods : 
 * blocks : used initiate the static variable
 * HW: static instantiation block 
 * 
 */
public class Player {
	String playerName, playerCountry;
	static int counter;//class variable, shared across all the objects of this class 
	
	//parameterized constructor
	public Player(String playerName,String playerCountry) {
		this.playerName=playerName;
		this.playerCountry=playerCountry;
		counter++;
	}
	
	static {
		counter=3;
		
	}
	//static methods are used acess the static members. They are invoked by classname.staticmethod
	//if invocation is in the same class, you can infact remove the class name. 
	public static void showPlayerCount() {
		System.out.println("total players :"+counter);
	}
	
	public void displayPlayer() {
		System.out.println("Player :"+this.playerName+" , "+this.playerCountry);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Inside main!!");
		
		Player player1=new Player("Virat","India");
		Player player2=new Player("Rohit","India");
		Player player3=new Player("Rahul","India");
		player1.displayPlayer();
		player2.displayPlayer();
		player3.displayPlayer();
		
		showPlayerCount();
	}

}
