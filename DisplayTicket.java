package Ticket;

public class DisplayTicket {
 
	static void displayTicket(int[][] ticket) {
		// TODO Auto-generated method stub
		for (int[] row : ticket) {
            for (int num : row) {
                System.out.print((num == -1 ? " - " : num + " ") + "\t");
            }
            System.out.println();
        }
    }
	
	
}
