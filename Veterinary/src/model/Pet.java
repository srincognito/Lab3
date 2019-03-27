package model;

import java.util.ArrayList;

public class Pet{
	public final static String DOGGO="Dog";
	public final static String CAT="Cat";
	public final static String BIRD="Bird";
	public final static String OTHER_ONE="Other";
	private ArrayList<History> chistory;
	private String name;
	private String type;
	private String breed;
	private double weight;
	private int age;
	private boolean hospita;

	public Pet(String name,String type,String breed,double weight,int age){
		this.name=name;
		this.type=type;
		this.breed=breed;
		this.weight=weight;
		this.age=age;
		hospita=false;
		chistory=new ArrayList<History>();
	}

	public String getName(){
		return name;
	}

	public String getType(){
		return type;
	}

	public String getBreed(){
		return breed;
	}

	public double getWeight(){
		return weight;
	}

	public int getAge(){
		return age;
	}

	public double getHosCost(int y){
		double x;
		if(type.equals(CAT)){
			if(weight<=3){
				x=10000;
			}
			else if(weight>3&&weight<=10){
				x=12000;
			}
			else if(weight>10&&weight<=20){
				x=15000;
			}
			else{
				x=20000;
			}
		}
		else if(type.equals(DOGGO)){
			if(weight<=3){
				x=15000;
			}
			else if(weight>3&&weight<=10){
				x=17000;
			}
			else if(weight>10&&weight<=20){
				x=20000;
			}
			else{
				x=25000;
			}
		}
		else if(type.equals(BIRD)){
			if(weight<=3){
				x=10000;
			}
			else if(weight>3&&weight<=10){
				x=12000;
			}
			else if(weight>10&&weight<=20){
				x=20000;
			}
			else{
				x=25000;
			}
		}
		else{
			if(weight<=3){
				x=10000;
			}
			else if(weight>3&&weight<=10){
				x=17000;
			}
			else if(weight>10&&weight<=20){
				x=30000;
			}
			else{
				x=33000;
			}
		}
		x=x*y;
		return x;
	}

	public void addHistory(History x){
		chistory.add(x);
	}

	public void setHospita(boolean x){
		hospita=x;
	}

	public String getHistory(){
		String x="";
		for(int i=0;i<chistory.size();i++){
			x+="\n"+chistory.get(i).getAll();
		}
		return x;
	}

	public String getAll(){
		String x="Name: "+name+"\nType: "+type+"\nBreed: "+breed+"\nWeight: "+weight+"\nAge: "+age;
		return x;
	}
}