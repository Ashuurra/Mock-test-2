package MockTest2;

public class Ticket {
	private String tickno;
	private double price;


public Ticket(String tickno, Double price){
	this.tickno = tickno;
	this.price = price;
	}


public String getTickno() {
	return tickno;
}


public void setTickno(String tickno) {
	this.tickno = tickno;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}

public int getPoints() {
	return (int) ((price / 100) * 3);
	}

}
