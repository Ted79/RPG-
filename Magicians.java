/*
ProgramName : Magicians Role
Author : antallen
Date : 2018/10/22
Version: 0.1
*/
package newworld.roles;

public class Magicians extends Role{
	
	/*
	public Magicians(String name, int blood, int level){
		this.name = name;
		this.blood = blood;
		this.level = level;
	}
	*/
	@Override
	public String fight(){
		return "魔法攻擊中....";
	}
	@Override
	public String toString(){
		return "魔法師: " + super.toString();
	}
	public void secure(){
		System.out.println("魔法治療中....");
	}
		
}