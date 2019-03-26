/*
	OOD require candidates to sketch out the classes and methods to implememnt technical 
	problems or real-life objects. 

	Step1: Handle Ambiguity
	You should inquire who is going to use it and how they are going to use it. Depend on 
	the question, you may even want to go though "six Ws": who, what, where, when, how, why


	Step2: Define the Core Objects
	Now we know what we're designing, we should consider what the "core objects" in a 
	system are. 
	Suppose we are asked to do the object-oriented design for restaurant.
	Our core objects might be Table, Guest, Party, Order, Meal...


	Step3:Analyze Relationships
	Having more or less decided on our core objects, we now want to analyze the 
	relationship betweens the objects. Which objects are members of which other objects? 
	Do any objects inherit fron any others? Are relationships many-to-many or one-to-many?
	
	For example, in the restaurant question:
	1. Party should have an array of Guests
	2. Server and Host inherit from Employee
	3. Each Table has one Party, but each Party may have multiple Tables
	4. There is one Host for the Restaurant

	Step4: Investigate Actions (key actions and 检查之前的过程)
	At this point, you should have the basic outline of your OOD. What remains is to 
	consider the key actions that the objects will take and how they relate to each other. 
	You may find that you have forgotten some objects, and you will need to update your design. 

	For example, a Party walks into the Restaurant, and a Guest requests a Table from the 
	Host. The Host looks up the Restaurant, and if it exist, assigns the Party to Table. 


	Design Pattern - Singleton and Factory Method design pattern
	The Singleton pattern ensures that a class has only one instance and ensures access to 
	the instance through the application. It can be useful in cases where you have 
	a "global" object with exactly one instance.

	For example, we may want to implement Restaurant s.t. it has exactly one instance of 
	Restaurant.
*/

public class Restaurant{
	private static Restaurant _instance = null;
	protected Restaurant() {...}
	public static Restaurant getInstance(){
		if(_instance == null){
			_instance = new Restaurant();
		}
		return _instance;
	}
}

/*
	Factory Method
	It offers an interface for creating an instance of a class, with its subclass deciding
	which class to instantiate. You might want to implement this with the creator class 
	being abstract and not providing an implementation for the Factory method. Or, you could
	have the Creator class be a concrete class that provides an implementation for the
	Factory method. In this case, the Factory method would take a parameter representing
	which class to instantiate. 
*/


public class CardGame{
	public static CardGame createCardGame(GameType type){
		if(type == GameType.Poker){
			return new PokerGame();
		}else if(type == GameType.BlackJack){
			return new BlackJackGame();
		}

		return null;
	}
}

























