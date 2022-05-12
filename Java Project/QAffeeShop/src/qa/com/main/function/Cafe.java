package qa.com.main.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class Cafe {
	public static String cafeName="QACafe";
	public  List<Orders> orders = new ArrayList<>();
	
	public  boolean addOrder(Orders order) {
		System.out.println("Adding " + order + " to Order");
		System.out.println("---------------------------------------------------------------------------------------------"
				+ "---------------------------------------");
		return orders.add(order);
		
	}

	public  Orders returnOrder(int i) {
		System.out.println("Order is : " + orders.get(i));
		System.out.println("---------------------------------------------------------------------------------------------"
				+ "---------------------------------------");
		return orders.get(i);

	}

	public  Orders updateOrder(int i, Orders order) {
		Orders a = orders.get(i);
		System.out.println("Order " + a + " changed to " + orders.get(i));
		System.out.println("---------------------------------------------------------------------------------------------"
				+ "---------------------------------------");
		return orders.set(i, order);
	}

	public  Orders deleteOrder(int i) {
		System.out.println("Removing " + orders.get(i));
		System.out.println("---------------------------------------------------------------------------------------------"
				+ "---------------------------------------");
		return orders.remove(i);

	}

	public  List<Orders> printOrder() {
		System.out.println(orders);
		System.out.println("---------------------------------------------------------------------------------------------"
				+ "---------------------------------------");
		return orders;
	}

	public  boolean clearOrder() {
		System.out.println("All orders cleared");
		System.out.println("---------------------------------------------------------------------------------------------"
				+ "---------------------------------------");
		orders.clear();
		return true;
	}
//	public static List<Orders> sortOrder() {
//		Collections.sort(orders.subList( 0, 0));
//		System.out.println("Orders after sorting " + orders);
//		System.out.println("--------------------------------------------");
//		return orders;
//	}

}
