package edu.uprm.cse.datastructures.set.test;

import edu.uprm.cse.datastructures.set.ArraySet;
import edu.uprm.cse.datastructures.set.Set;

public class PExamExcercise {

	//Excersie 1
	public static Set<String> BaseballPlayers = new ArraySet<>(10);
	public static Set<String> BasketballPlayers = new ArraySet<>(10);
	public static Set<String> FootballPlayers = new ArraySet<>(10);
	
	public static void main(String[] args) {
		
		//setup P1
		BasketballPlayers.add("Mark");
		BasketballPlayers.add("Diego");
		BasketballPlayers.add("Tom");
		BasketballPlayers.add("Ian");
		BasketballPlayers.add("Alberto");
		
		BaseballPlayers.add("Mark");
		BaseballPlayers.add("Diego");
		BaseballPlayers.add("Eliut");
		BaseballPlayers.add("Mike");
		BaseballPlayers.add("Roger");
		
		FootballPlayers.add("Marcos");
		FootballPlayers.add("Rogelio");
		FootballPlayers.add("Tom");
		FootballPlayers.add("Manuel");
		FootballPlayers.add("Andrew");
		
		//EVERY SPORT
		System.out.println("(P.1.a) Players that are in all sports: ");
		Object[] AllSports = BaseballPlayers.intersection(BasketballPlayers.intersection(FootballPlayers)).toArray();
		if(AllSports.length == 0) {
			System.out.println("none");
		}
		for (int i = 0; i < AllSports.length; i++) {
			System.out.println(AllSports[i]);
		}
		
		//Check if the set with the players in basketball and football is empty
		System.out.println(" \n(P.1.b) Is the set with the players in basketball and football empty?: ");
		boolean resultb = BasketballPlayers.intersection(FootballPlayers).isEmpty();
		System.out.println(resultb);
		
		//Check if "TOM" is playing football and basketball but not baseball
		System.out.println(" \n(P.1.c) Is Tom playing basketball and football but not baseball?: ");
		boolean resultc = (BasketballPlayers.intersection(FootballPlayers)).difference(BaseballPlayers).isMember("Tom");
		System.out.println(resultc);
	}
	
	
		
}
