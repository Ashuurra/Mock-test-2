package MockTest2;

import java.util.LinkedList;
import java.util.List;

public class main {

    public static void main(String[] args) {        
              List<Ticket> tickets = new LinkedList<>();
              tickets.add(new Ticket("A111", 1240.50));
              tickets.add(new Ticket("A222", 155.8));
              tickets.add(new Ticket("A333", 245.50));
              System.out.printf("Total points: %d", getTotalPoints(tickets));
    }
    
    public static int getTotalPoints(List<Ticket> list) {
        return getTotalPoints(list, 0);
    }

    public static int getTotalPoints(List<Ticket> list, int index) {
    	if (index >= list.size()) {
    		return 0;
    	}
    	return list.get(index).getPoints() + getTotalPoints(list, index + 1);

    }

}
