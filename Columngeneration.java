package Ticket;
import java.util.*;

public class Columngeneration {
	static void randomcolumngeneration(int[][] ticket) {
		// TODO Auto-generated method stub
		//generate the cols
		
		for(int i=0; i< 9 ; i++) {
			generate(ticket, i);
			
		}
		
	}

	private static void generate(int[][] ticket, int i) {
		// TODO Auto-generated method stub
		
		switch (i) {
		case 0:
			HashSet<Integer> hs= generateRandom(ticket);
			int t=0;
			for(Integer num: hs) {
				ticket[t][i]= num;
				t++;
			}
			sort(ticket, i);
			//sorting 
			break;
			   
		case 1:
			hs= generateRandom(ticket);
			 t=0;
			for(Integer num: hs) {
				ticket[t][i]= num+10;
				t++;
			}
			sort(ticket, i);
			//sorting 
			break;			
		case 2:
			hs= generateRandom(ticket);
			 t=0;
			for(Integer num: hs) {
				ticket[t][i]= num+20;
				t++;
			}
			sort(ticket, i);
			//sorting 
			break;	
		case 3:
			hs= generateRandom(ticket);
			 t=0;
			for(Integer num: hs) {
				ticket[t][i]= num+30;
				t++;
			}
			sort(ticket, i);
			//sorting 
			break;	
		case 4:
			hs= generateRandom(ticket);
			 t=0;
			for(Integer num: hs) {
				ticket[t][i]= num+40;
				t++;
			}
			sort(ticket, i);
			//sorting 
			break;	
		case 5:
			hs= generateRandom(ticket);
			 t=0;
			for(Integer num: hs) {
				ticket[t][i]= num+50;
				t++;
			}
			sort(ticket, i);
			//sorting 
			break;	
		case 6:
			hs= generateRandom(ticket);
			 t=0;
			for(Integer num: hs) {
				ticket[t][i]= num+60;
				t++;
			}
			sort(ticket, i);
			//sorting 
			break;	
		case 7:
			hs= generateRandom(ticket);
			 t=0;
			for(Integer num: hs) {
				ticket[t][i]= num+70;
				t++;
			}
			sort(ticket, i);
			//sorting 
			break;	
		case 8:
			hs= generateRandom(ticket);
			 t=0;
			for(Integer num: hs) {
				ticket[t][i]= num+80;
				t++;
			}
			sort(ticket, i);
			//sorting 
			break;	
		default:
			System.out.println("only 0-8 cols are allowed here ");
		
		}
		
		
	}

	private static HashSet<Integer> generateRandom(int[][] ticket) {
		// TODO Auto-generated method stub
		HashSet<Integer> uniqueNumbers = new HashSet<>();
		Random r= new Random();
		while (uniqueNumbers.size() < 3) {
		int num= r.nextInt(9);
		uniqueNumbers.add(num);	
		}
		return uniqueNumbers;
	}

	private static void sort(int[][] ticket, int i) {
		// TODO Auto-generated method stub
		 int temp=0;
		   int arr[]= new int [3];
		   for(int j=0; j<3; j++) {
			   arr[j]=ticket[temp][i];
		   }
		   Arrays.sort(arr);
		   temp=0;
		   for(int j=0; j<3 ; j++) {
			   ticket[temp][i]=arr[j];
		   }
		
	}

}
