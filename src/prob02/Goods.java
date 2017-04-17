package prob02;

public class Goods {
	
	private String name;
	private int price;
	private int countStrock;
	
	public Goods(String name, int price, int countStock){
		this.name = name;
		this.price = price;
		this.countStrock = countStock;
	}
	
	public void show(){
		System.out.println(name + " " + price + " " + countStrock);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStrock() {
		return countStrock;
	}

	public void setCountStrock(int countStrock) {
		this.countStrock = countStrock;
	}
	
	
	
}
