package qa.com.main.function;

import java.util.ArrayList;
import java.util.List;

public class QACafe {
	public static List<String> lunch = new ArrayList<>();

	public static void addOrder(String order) {
		System.out.println("Adding " + order + " to Order");
		lunch.add(order);
		System.out.println("--------------------------------------------");
	}

	public static String returnOrder(int i) {
		System.out.println("Order is : " + lunch.get(i));
		System.out.println("--------------------------------------------");
		return lunch.get(i);

	}

	public static void updateOrder(int i, String order) {
		String a = lunch.get(i);
		lunch.set(i, order);
		System.out.println("Order " + a + " changed to " + lunch.get(i));
		System.out.println("--------------------------------------------");
	}

	public static void deleteOrder(int i) {
		System.out.println("Removing " + lunch.get(i));
		lunch.remove(i);
		System.out.println("--------------------------------------------");

	}

	public static void printOrder() {
		System.out.println(lunch);
		System.out.println("--------------------------------------------");
	}

	public static void clearOrder() {
		lunch.clear();
		System.out.println("All orders cleared");
		System.out.println("--------------------------------------------");
	}


}
