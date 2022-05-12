package qa.com.main.function;

public class Orders {
	public int orderNum;
	public String drink;
	public String meal;
	public float price;
	public boolean takeway;
	
	
	
	public Orders(int orderNum, String drink, String meal, float price, boolean takeway) {
		
		this.orderNum = orderNum;
		this.drink = drink;
		this.meal = meal;
		this.price = price;
		this.takeway = takeway;
	}


	@Override
	public String toString() {
		return "Orders [orderNum=" + orderNum + ", drink=" + drink + ", meal=" + meal + ", price=" + price
				+ ", takeway=" + takeway + "]";
	}
	
	
	
	

}
