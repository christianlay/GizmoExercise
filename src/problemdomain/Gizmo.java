package problemdomain;

public class Gizmo {
	private int id;
	private String name;
	private int qty;
	private double price;
	
	public Gizmo(){
		
	}
	public Gizmo(int id,String name,int qty, double price){
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return id + ";" + name + ";" + qty + ";" + price + "]";
	}
	
}
