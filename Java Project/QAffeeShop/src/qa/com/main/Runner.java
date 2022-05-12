package qa.com.main;

import qa.com.main.function.*;

public class Runner {
	public  static void main(String[] args) {
//		QAffee.addOrder("Venti Latte");
//		QAffee.addOrder("soy");
//		QAffee.addOrder("cappucino");
//		QAffee.printOrder();
//		QAffee.addOrder("flat white");
//		QAffee.updateOrder(1, "latte");
//		QAffee.deleteOrder(0);
//		QAffee.printOrder();
//		QAffee.sortOrder();
		Cafe highStreet = new Cafe();
		Orders n12353= new Orders(12353, "Venti Latte", "Tuna sandwich", 5.43f, false);
		System.out.println(Cafe.cafeName);
		highStreet.addOrder(n12353);
		System.out.println(n12353);
		
		

		
	}

}
