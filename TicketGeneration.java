package Ticket;
//creating ticket 
public class TicketGeneration {

	public static void main(String[] args) {
    //2d matrix 
		int ticket[][]= new int [3][9];
		//initialize the 2d matrix 
		for(int i=0; i< 3; i++) {
			for(int j=0 ; j< 9 ; j++) {
				ticket[i][j]=-1;
			}
		}
		DisplayTicket d = new DisplayTicket();
		//Column generation 
		Columngeneration c = new Columngeneration();
		c.randomcolumngeneration(ticket);
		//Row generation
		Rowgeneration r= new Rowgeneration();
		r.randomrowgeneration(ticket);
		d.displayTicket(ticket);
		
}

	

	
	
}