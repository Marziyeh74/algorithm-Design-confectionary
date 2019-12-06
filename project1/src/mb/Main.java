
package mb;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {

		Scanner input  = new Scanner (System.in);
		int number ;// the number of issues
		int n;
		
		number = input.nextInt();
		//for(int i=0; i<number ; i++)


		//
		for(int j = 0; j< number ; j++)
		{
			//System.out.println();
			n = input.nextInt();
			//issues.add(new Node());
			Cake[] cakes = new Cake[n];
			
			//issues.get(j).info = n;
			//.get(j).next = cakes;
			for(int  i = 0; i < n; i++)
			{
                cakes[i] = new Cake();
				cakes[i].t = input.nextLong();
                cakes[i].s = input.nextLong();
                cakes[i].number = i+1;
                                
			}
			
			Arrays.sort(cakes);
                        
            for(int i =0 ; i<n; i++)
            	System.out.printf("%d ",cakes[i].number);
				
            System.out.println();

		}

		
        }
}



		// TODO Auto-generated method stub

	

	



