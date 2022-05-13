package qa.com.main.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QAffee {
	public static List<String> orders = new ArrayList<>();

	public static boolean addOrder(String order) {
		System.out.println("Adding " + order + " to Order");
		System.out.println("--------------------------------------------");
		return orders.add(order);
		
	}

	public static String returnOrder(int i) {
		System.out.println("Order is : " + orders.get(i));
		System.out.println("--------------------------------------------");
		return orders.get(i);

	}

	public static String updateOrder(int i, String order) {
		String a = orders.get(i);
		System.out.println("Order " + a + " changed to " + orders.get(i));
		System.out.println("--------------------------------------------");
		return orders.set(i, order);
	}

	public static String deleteOrder(int i) {
		System.out.println("Removing " + orders.get(i));
		System.out.println("--------------------------------------------");
		return orders.remove(i);

	}

	public static List<String> printOrder() {
		System.out.println(orders);
		System.out.println("--------------------------------------------");
		return orders;
	}

	public static boolean clearOrder() {
		System.out.println("All orders cleared");
		System.out.println("--------------------------------------------");
		orders.clear();
		return true;
	}
	public static List<String> sortOrder() {
		Collections.sort(orders);
		System.out.println("Orders after sorting " + orders);
		System.out.println("--------------------------------------------");
		return orders;
	}

}
