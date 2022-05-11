package qa.com.main.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QAffee {
	public static List<String> orders = new ArrayList<>();

	public static void addOrder(String order) {
		System.out.println("Adding " + order + " to Order");
		orders.add(order);
		System.out.println("--------------------------------------------");
	}

	public static String returnOrder(int i) {
		System.out.println("Order is : " + orders.get(i));
		System.out.println("--------------------------------------------");
		return orders.get(i);

	}

	public static void updateOrder(int i, String order) {
		String a = orders.get(i);
		orders.set(i, order);
		System.out.println("Order " + a + " changed to " + orders.get(i));
		System.out.println("--------------------------------------------");
	}

	public static void deleteOrder(int i) {
		System.out.println("Removing " + orders.get(i));
		orders.remove(i);
		System.out.println("--------------------------------------------");

	}

	public static void printOrder() {
		System.out.println(orders);
		System.out.println("--------------------------------------------");
	}

	public static void clearOrder() {
		orders.clear();
		System.out.println("All orders cleared");
		System.out.println("--------------------------------------------");
	}
	public static void sortOrder() {
		Collections.sort(orders);
		System.out.println("Orders after sorting " + orders);
		System.out.println("--------------------------------------------");
	}

}
