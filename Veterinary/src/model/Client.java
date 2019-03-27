package model;

import java.util.ArrayList;

public class Client{
	private String name;
	private String id;
	private String address;
	private String tel;
	private ArrayList<Pet> pets;

	public Client(String name,String id,String address,String tel){
		this.name=name;
		this.id=id;
		this.address=address;
		this.tel=tel;
		pets=new ArrayList<Pet>();
	}

	public void addPet(Pet x){
		pets.add(x);
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public String getAddress(){
		return address;
	}

	public String getTel(){
		return tel;
	}

	public Pet getPet(int x){
		return pets.get(x);
	}

	public String getPet(){
		String x="";
		int y=1;
		for(int i=0;i<pets.size();i++){
			x+="\n"+y+". "+pets.get(i).getName();
			y++;
		}
		return x;
	}

	public int getPetSize(){
		return pets.size();
	}

	public String getAll(){
		String x="Name: "+name+"\nId: "+id+"\nAddress: "+address+"\nTel: "+tel;
		return x;
	}
}