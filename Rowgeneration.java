package Ticket;

import java.util.HashSet;
import java.util.Random;

public class Rowgeneration {
	static int[] colBlankCount = new int[9];
	static void randomrowgeneration(int[][] ticket) {
		// TODO Auto-generated method stub
		
			blankgeneration(ticket);
		}
	

	private static void blankgeneration(int[][] ticket) {
		// TODO Auto-generated method stub
		Random random = new Random();
        int[] colBlankCount = new int[9]; // Tracks how many blanks each column has

        for (int row = 0; row < 3; row++) {
            HashSet<Integer> blankPositions = new HashSet<>();

            // Select 4 unique positions while ensuring no column gets blanks in all rows
            while (blankPositions.size() < 4) {
                int col = random.nextInt(9); // Random column index from 0 to 8

                // Ensure the column doesn't already have 3 blanks
                if (colBlankCount[col] < 2) {  
                    blankPositions.add(col);
                }
            }

            // Apply the blanks and update column blank count
            for (int col : blankPositions) {
                ticket[row][col] = -1;
                colBlankCount[col]++;
            }
        }
    }}