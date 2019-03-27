package model;

public class MiniC{
	public final static String AVAILABLE="Available";
	public final static String NOT_AVAILABLE="Not available";
	private String disp;
	private Pet patient;

	public MiniC(){
		disp=AVAILABLE;
	}

	public void setPatient(Pet x){
		patient=x;
		disp=NOT_AVAILABLE;
	}

	public Pet getPatient(){
		return patient;
	}

	public String getDisp(){
		return disp;
	}

	public void endPat(){
		disp=AVAILABLE;
		patient=null;
	}
}