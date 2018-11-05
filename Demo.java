/*
ProgramName: Play Demo
Author: antallen
*/

import newworld.roles.*;

public class Demo{

	public static void main(String[] args){
	
		SwordsMan s1 = new SwordsMan("Peter",100,1);
		/*
		SwordsMan s1 = new SwordsMan();
		s1.setName("Peter");
		s1.setBlood(100);
		s1.setLevel(1);
		*/
		//Magicians m1 = new Magicians("Juli",50,1);
		Magicians m1 = new Magicians();
		m1.setName("Juli");
		m1.setBlood(50);
		m1.setLevel(1);
		
		System.out.println(s1.toString());
		System.out.println(m1.toString());
			
		showBlood(s1);
		showBlood(m1);
		
		drawFight(s1);
		drawFight(m1);
		
	}
	
	public static void showBlood(Role r1){
		System.out.printf("%s : ¦å¶q -> %d%n", r1.getName(), r1.getBlood());
	}
		
	public static void drawFight(Role r2){
		System.out.printf("%s §ðÀ» %s %n",r2.getName(),r2.fight());
		
	}
}