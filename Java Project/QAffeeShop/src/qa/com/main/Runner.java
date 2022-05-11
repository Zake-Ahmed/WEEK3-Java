package qa.com.main;

import qa.com.main.function.QAffee;

public class Runner {
	public  static void main(String[] args) {
		QAffee.addOrder("flat white");
		QAffee.updateOrder(1, "latte");
		
		
	}

}
