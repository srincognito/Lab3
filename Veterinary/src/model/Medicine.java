package model;

public class Medicine{
	private String name;
	private String frec;
	private double dose;
	private double cost;

	public Medicine(String name,double dose,String frec,double cost){
		this.name=name;
		this.frec=frec;
		this.dose=dose;
		this.cost=cost;
	}

	public String getName(){
		return name;
	}

	public String getFrec(){
		return frec;
	}

	public double getDose(){
		return dose;
	}

	public double getCost(){
		return cost;
	}

	public String getAll(){
		String x="Name: "+name+"\nFrecuency: "+frec+"\nDose: "+dose+"\nCost: "+cost;
		return x;
	}
}