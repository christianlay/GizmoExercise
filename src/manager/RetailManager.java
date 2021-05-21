package manager;
import java.util.*;
import java.io.*;
import problemdomain.Gizmo;

public class RetailManager {
	private final String FILE_PATH = "res/gizmos.txt"; 
	private ArrayList<Gizmo>gizmos;
	private Scanner in;
	
	public RetailManager() throws FileNotFoundException {
		gizmos = new ArrayList<>();
		loadGizmoFromFile();
		displayMenu();
		saveGizmoListToFile();
}		
	private void loadGizmosFromFile() throws FileNotFoundException{
		File f = new File("res/gizmos.txt");
		in = new Scanner(f);
		while(in.hasNext()) {
			String line = in.nextLine();
			String[] fields = line.split(";");
			int id = Integer.parseInt(fields[0]);
			String name = fields[1];
			int qty = Integer.parseInt(fields[2]);
			double price = Double.parseDouble(fields[3]);
			
			Gizmo gizmo = new Gizmo(id,name,qty,price);
			gizmos.add(gizmo);
		}
	}
	
	private void printGizmos() {
		for(Gizmo gizmo:gizmos) {
			System.out.println(gizmo);
		}
	}
	
	private void loadGizmoFromFile() {
		
	}
	
	private void saveGizmoListToFile () throws FileNotFoundException  {
		PrintWriter out = new PrintWriter(new PrintWriter(FILE_PATH));
		for(Gizmo gizmo:gizmos) {
			out.println(gizmo);
		}
		out.close();
	}
	
	private void displayMenu() {
		System.out.println("1. add");
		System.out.println("1. add");
		System.out.println("1. add");
		System.out.println("1. add");
		
		in = new Scanner(System.in);
		int choice = in.nextInt();
		in.nextLine();
		
		switch(choice) {
		case 1: {
			addGizmo();
			break;
		}
		case 2: {
			deleteGizmo();
			break;
		}
		case 3:{
			searchGizmo();
			break;
		}
		case 4: {
			updateGizmo();
			break;
		}
		}
	}
	private void updateGizmo() {
		// TODO Auto-generated method stub
		
	}
	private void searchGizmo() {
		// TODO Auto-generated method stub
		System.out.println("Enter the name: ");
		String name = in.nextLine();
		for(int i=0;i<gizmos.size();i++) {
			if(gizmos.get(i).getName().equalsIgnoreCase(name)) {
				System.out.println(gizmos.get(i));
				return;
			}
		}
		System.out.println(name +"Gizmo was not found");
	}
	private void deleteGizmo() {
		// TODO Auto-generated method stub
		
	}
	private void addGizmo() {
		// TODO Auto-generated method stub
		System.out.println("enter the gizmo info in the following format: name; quantity; price");
		String line = in.nextLine();
		String[] fields = line.split(";"); 
		int id = gizmos.get(gizmos.size()-1).getId()+1;
		String name = fields[1];
		int qty = Integer.parseInt(fields[2]);
		double price = Double.parseDouble(fields[3]);
		Gizmo gizmo = new Gizmo(id,name,qty,price);
		gizmos.add(gizmo);
	}
}
