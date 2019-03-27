package model;

import java.util.ArrayList;

public class History{
	public final static String OPEN="Open";
	public final static String CLOSED="Closed";
	private String info;
	private String symptom;
	private String diagnostic;
	private String status;
	private Date entry;
	private ArrayList<Medicine> medi;

	public History(String info,String symptom,String diagnostic,Date entry){
		this.info=info;
		this.symptom=symptom;
		this.diagnostic=diagnostic;
		this.entry=entry;
		status=OPEN;
		medi=new ArrayList<Medicine>();
	}

	public String getSymptom(){
		return symptom;
	}

	public String getDiagnostic(){
		return diagnostic;
	}

	public String getStatus(){
		return status;
	}

	public Date getEntry(){
		return entry;
	}

	public String getInfo(){
		return info;
	}

	public Medicine getMedi(int x){
		return medi.get(x);
	}

	public void addMedicine(Medicine x){
		medi.add(x);
		status=CLOSED;
	}

	public String getAll(){
		String x=info+"\n==============================================================================\nSymptoms: "+symptom+"\nDiagnostic: "+diagnostic+"\nStatus: "+status+"\nEntry date: "+entry.getDay()+"/"+entry.getMonth()+"/"+entry.getYear()+"\n==============================================================================";
		return x;
	}
}