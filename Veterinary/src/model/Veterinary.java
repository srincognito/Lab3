package model;

import java.util.ArrayList;

public class Veterinary{
	public final static int ROOM=8;
	private MiniC[] minic;
	private ArrayList<Medicine> medi;
	private ArrayList<Client> clients;
	private String name;
	private double earnings;

	public Veterinary(){
		name="Mi pequenha mascota";
		minic=new MiniC[ROOM];
		minic[0]=new MiniC();
		minic[1]=new MiniC();
		minic[2]=new MiniC();
		minic[3]=new MiniC();
		minic[4]=new MiniC();
		minic[5]=new MiniC();
		minic[6]=new MiniC();
		minic[7]=new MiniC();
		medi=new ArrayList<Medicine>();
		addMedicine(new Medicine("Besamezasona",3.5,"Each 6 hours",40000));
		addMedicine(new Medicine("Tocamicina",4,"Each 4 hours",35000));
		clients=new ArrayList<Client>();
		addClient(new Client("Condorito","1115486325","Cll 9 #8-37","2288565"));
		addClient(new Client("Juan","9908145289","Kra 15 #78-52","3235467893"));
		clients.get(0).addPet(new Pet("Coco",Pet.CAT,"Pitbull",15.6,4));
		earnings=0;
	}

	public String getName(){
		return name;
	}

	public MiniC getMinic(int x){
		return minic[x];
	}

	public Medicine getMedi(int x){
		return medi.get(x);
	}

	public int getMediSize(){
		return medi.size();
	}

	public String getMedi(){
		String x="";
		int y=1;
		for(int i=0;i<medi.size();i++){
			x+="\n"+y+". "+medi.get(i).getName();
			y++;
		}
		return x;
	}

	public Client getClient(int x){
		return clients.get(x);
	}

	public void addMedicine(Medicine x){
		medi.add(x);
	}

	public void addClient(Client x){
		clients.add(x);
	}

	public void addEarning(double x){
		earnings+=x;
	}

	public double getEarning(){
		return earnings;
	}

	public boolean addHistory(String id,String nameP,String symptom,String diagnostic,Date entry){
		boolean x=false;
		for(int i=0;i<clients.size();i++){
			if(id.equals(clients.get(i).getId())){
				for(int j=0;j<clients.get(i).getPetSize();j++){
					if(nameP.equals(clients.get(i).getPet(j).getName())){
						String info=clients.get(i).getPet(j).getAll()+"\n"+clients.get(i).getAll();
						History his=new History(info,symptom,diagnostic,entry);
						clients.get(i).getPet(j).addHistory(his);
						x=true;
					}
				}
			}
		}
		return x;
	}

	public Client byPetName(String nameP){
		Client x=null;
		for(int i=0;i<clients.size();i++){
			for(int j=0;j<clients.get(i).getPetSize();j++){
				if(nameP.equals(clients.get(i).getPet(j).getName())){
					x=clients.get(i);
					break;
				}
			}
		}
		return x;
	}

	public Client byClientName(String nameH){
		Client x=null;
		for(int i=0;i<clients.size();i++){
			if(nameH.equals(clients.get(i).getName())){
				x=clients.get(i);
				break;
			}
		}
		return x;
	}

	public Pet petByPetName(String nameP){
		Pet x=null;
		for(int i=0;i<clients.size();i++){
			for(int j=0;j<clients.get(i).getPetSize();j++){
				if(nameP.equals(clients.get(i).getPet(j).getName())){
					x=clients.get(i).getPet(j);
					break;
				}
			}
		}
		return x;
	}
}