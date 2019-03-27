package ui;
import model.Veterinary;
import model.Date;
import model.MiniC;
import model.Client;
import model.Pet;
import java.util.Scanner;

public class Menu{
	private Scanner read;
	private Veterinary vet;
	private Date actual;

	public Menu(){
		vet=new Veterinary();
		read=new Scanner(System.in);
	}

	public void welcome(){
		System.out.println("\n====================================================================================");
		System.out.println("  WWW           WWW     EEEEEEEEEEE   LLLLL           CCCCCCCCC    OOOOOOOO    MMMMM       MMMMM   EEEEEEEEEEE");
		System.out.println("  WWW           WWW	EEEEEEEEEEE   LLLLL          CCCCCCCCCC   OOOO  OOOO   MMMMM       MMMMM   EEEEEEEEEEE ");
		System.out.println("  WWW           WWW	EEEEE         LLLLL          CCCCCC       OOOO  OOOO   MMM MMM   MMM MMM   EEEEE       ");
		System.out.println("  WWW   WWWWW   WWW	EEEEE         LLLLL          CCCCC        OOOO  OOOO   MMM  MMM MMM  MMM   EEEEE       ");
		System.out.println("  WWW  WWW WWW  WWW	EEEEEEEEE     LLLLL          CCCCC        OOOO  OOOO   MMM   MMMMM   MMM   EEEEEEEEE   ");
		System.out.println("  WWW WWW   WWW WWW	EEEEEEEEE     LLLLL          CCCCC        OOOO  OOOO   MMM           MMM   EEEEEEEEE   ");
		System.out.println("  WWWWW       WWWWW	EEEEE         LLLLL          CCCCCC       OOOO  OOOO   MMM           MMM   EEEEE       ");
		System.out.println("  WWWWW       WWWWW	EEEEEEEEEEE   LLLLLLLLLLLL   CCCCCCCCCC   OOOO  OOOO   MMM           MMM   EEEEEEEEEEE ");
		System.out.println("  WWWWW       WWWWW     EEEEEEEEEEE   LLLLLLLLLLLL    CCCCCCCCC    OOOOOOOO    MMM           MMM   EEEEEEEEEEE");
		System.out.println("====================================================================================\n");
		System.out.println("====================================================================================\n");
		System.out.println("Type the actual date.\nDay: ");
		int day=read.nextInt();
		System.out.println("Month: ");
		int month=read.nextInt();
		System.out.println("Year: ");
		int year=read.nextInt();
		actual=new Date(day,month,year);
		options();
	}

	public void options(){
		System.out.println("====================================================================================");
		System.out.println("1. Show mini rooms.\n2. Search client by pet name.\n3. Search client by name.\n4. Show medicines.\n5. Register client.\n6. Add pet to a room.\n7. Remove a pet of a room.\n8. Show hospitalization earnings.\n9. Exit.");
		int op=read.nextInt();
		switch(op){
			case 1:miniR();
				break;
			case 2:searchByPet();
				break;
			case 3:searchByClient();
				break;
			case 4:showMedicines();
				break;
			case 5:registerClient();
				break;
			case 6:addPetRoom();
				break;
			case 7:removePetRoom();
				break;
			case 8:hospiEarnings();
				break;
			case 9:System.exit(0);
			default:System.out.println("Error.");
				System.out.println("====================================================================================");
				System.out.println("====================================================================================");
				System.out.println("====================================================================================");
				System.out.println("====================================================================================");
				System.out.println("====================================================================================");
				welcome();
				break;
		}
	}

	public void miniR(){
		System.out.println("====================================================================================");
		if(vet.getMinic(0).getDisp().equals(MiniC.AVAILABLE)){
			System.out.println("1. Available.");
		}
		else{
			System.out.println("1. Not Available.");
		}
		if(vet.getMinic(1).getDisp().equals(MiniC.AVAILABLE)){
			System.out.println("2. Available.");
		}
		else{
			System.out.println("2. Not Available.");
		}
		if(vet.getMinic(2).getDisp().equals(MiniC.AVAILABLE)){
			System.out.println("3. Available.");
		}
		else{
			System.out.println("3. Not Available.");
		}
		if(vet.getMinic(3).getDisp().equals(MiniC.AVAILABLE)){
			System.out.println("4. Available.");
		}
		else{
			System.out.println("4. Not Available.");
		}
		if(vet.getMinic(4).getDisp().equals(MiniC.AVAILABLE)){
			System.out.println("5. Available.");
		}
		else{
			System.out.println("5. Not Available.");
		}
		if(vet.getMinic(5).getDisp().equals(MiniC.AVAILABLE)){
			System.out.println("6. Available.");
		}
		else{
			System.out.println("6. Not Available.");
		}
		if(vet.getMinic(6).getDisp().equals(MiniC.AVAILABLE)){
			System.out.println("7. Available.");
		}
		else{
			System.out.println("7. Not Available.");
		}
		if(vet.getMinic(7).getDisp().equals(MiniC.AVAILABLE)){
			System.out.println("8. Available.");
		}
		else{
			System.out.println("8. Not Available.");
		}
		options();
	}

	public void searchByPet(){
		System.out.println("====================================================================================");
		System.out.println("Type the pet name.");
		String nameP=read.next();
		System.out.println(vet.byPetName(nameP).getAll());
		System.out.println("Pets: "+vet.byPetName(nameP).getPet());
		int op=read.nextInt();
		System.out.println(vet.byPetName(nameP).getPet(op-1).getAll());
		System.out.println(vet.byPetName(nameP).getPet(op-1).getHistory());
		System.out.println("====================================================================================");
		System.out.println("1. Register pet.\n2. Menu.\n3. Exit.");
		op=read.nextInt();
		switch(op){
			case 1:registerPet(vet.byPetName(nameP).getName());
				break;
			case 2:options();
				break;
			case 3:System.exit(0);
				break;
			default:System.out.println("Error.");
				welcome();
				break;
		}
	}

	public void searchByClient(){
		System.out.println("====================================================================================");
		System.out.println("Type the person name.");
		String nameH=read.next();
		System.out.println(vet.byClientName(nameH).getAll());
		System.out.println("Pets: "+vet.byClientName(nameH).getPet());
		int op=read.nextInt();
		System.out.println(vet.byClientName(nameH).getPet(op-1).getAll());
		System.out.println(vet.byClientName(nameH).getPet(op-1).getHistory());
		System.out.println("====================================================================================");
		System.out.println("1. Register pet.\n2. Menu.\n3. Exit.");
		op=read.nextInt();
		switch(op){
			case 1:registerPet(vet.byClientName(nameH).getName());
				break;
			case 2:options();
				break;
			case 3:System.exit(0);
				break;
			default:System.out.println("Error.");
				welcome();
				break;
		}	
	}

	public void showMedicines(){
		System.out.println("====================================================================================");
		System.out.println(vet.getMedi());
		int op=read.nextInt();
		if(op<=vet.getMediSize()){
			System.out.println(vet.getMedi(op-1).getAll());
		}
		else{
			System.out.println("Error.");
			System.out.println("====================================================================================");
			System.out.println("====================================================================================");
			System.out.println("====================================================================================");
			System.out.println("====================================================================================");
			welcome();
		}
		options();
	}

	public void registerClient(){
		System.out.println("====================================================================================");
		System.out.println("Type name.");
		String name=read.next();
		System.out.println("Type identification.");
		String id=read.next();
		System.out.println("Type address.");
		String address=read.next();
		System.out.println("Type telephone.");
		String tel=read.next();
		vet.addClient(new Client(name,id,address,tel));
		System.out.println("User registered.");
		options();
	}

	public void registerPet(String nameH){
		System.out.println("====================================================================================");
		System.out.println("Type name.");
		String name=read.next();
		System.out.println("Select one type.\n1. Dog.\n2. Cat.\n3. Bird.\n4. Other.");
		int op=read.nextInt();
		String type="";
		switch(op){
			case 1:type=Pet.DOGGO;
				break;
			case 2:type=Pet.CAT;
				break;
			case 3:type=Pet.BIRD;
				break;
			case 4:type=Pet.OTHER_ONE;
				break;
			default:System.out.println("Error.");
			System.out.println("====================================================================================");
			System.out.println("====================================================================================");
			System.out.println("====================================================================================");
			System.out.println("====================================================================================");
			welcome();
			break;
		}
		System.out.println("Type breed.");
		String breed=read.next();
		System.out.println("Type weight (0,0).");
		double weight=read.nextDouble();
		System.out.println("Type age.");
		int age=read.nextInt();
		Pet petX=new Pet(name,type,breed,weight,age);
		vet.byClientName(nameH).addPet(petX);
		System.out.println("Pet registered.");
		options();
	}

	public void addPetRoom(){
		System.out.println("====================================================================================");
		System.out.println("Type the symptoms.");
		String symptom=read.next();
		System.out.println("Type the diagnostic.");
		String diagnostic=read.next();
		System.out.println("Type the name of the pet.");
		String name=read.next();
		System.out.println("Type one room number. You can check the rooms on menu.");
		int room=read.nextInt();
		if(vet.petByPetName(name)==null){
			System.out.println("Error. Pet does not exist.");
			System.out.println("====================================================================================");
			System.out.println("====================================================================================");
			System.out.println("====================================================================================");
			System.out.println("====================================================================================");
			welcome();
		}
		else{
			vet.getMinic(room-1).setPatient(vet.petByPetName(name));
			vet.petByPetName(name).setHospita(true);
			String id=vet.byPetName(name).getId();
			vet.addHistory(id,name,symptom,diagnostic,actual);
			System.out.println("Pet added.");
			options();
		}
	}

	public void removePetRoom(){
		System.out.println("====================================================================================");
		System.out.println("Type the name of the pet.");
		String name=read.next();
		System.out.println("Type the room number.");
		int room=read.nextInt();
		System.out.println("Type the number of days of hospitalization (1).");
		int days=read.nextInt();
		if(vet.petByPetName(name)==null){
			System.out.println("Error. Pet does not exist.");
			System.out.println("====================================================================================");
			System.out.println("====================================================================================");
			System.out.println("====================================================================================");
			System.out.println("====================================================================================");
			welcome();
		}
		else{
			vet.addEarning(vet.petByPetName(name).getHosCost(days));
			vet.getMinic(room-1).endPat();
			vet.petByPetName(name).setHospita(false);
			System.out.println("Done.");
			options();
		}
	}

	public void hospiEarnings(){
		System.out.println("Earnings: "+vet.getEarning());
		options();
	}
}