package Menu;

import Manager.Sales;

public class Food {
	int cost;
	String name;
	boolean istopping;
	boolean toppingchoice;
	int count;
	public Food(int cost, String name, boolean istopping) {
		super();
		this.cost = cost;
		this.name = name;
		this.istopping = istopping;
	}
	public void toSales() {
		if(this.name.contentEquals("신라면")) {
			Sales.Noodle++;
		}else if(this.name.contentEquals("박지성피카츄")) {
			Sales.Pika++;
		}else if(this.name.contentEquals("닥터페퍼")) {
			Sales.Beverage++;
		}
		
	}
}
