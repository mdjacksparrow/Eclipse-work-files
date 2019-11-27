package test;
import java.util.Scanner;

public class Sortingnames
{

    public static void main(String[] args)
    {
        int num;
        Scanner s = new Scanner(System.in);
        String data[]=new String[10];
        
        System.out.print("\nEnter the no. of  names:");
        num=s.nextInt();
        
        for(int i=0;i<num;i++)
        {
            System.out.printf("\nEnter the %d name :",i+1);
            data[i]=s.next();
        }
        s.close();
        
/*        Example  ::
 * 		  bla
//        ja
//        bla
//        ja
//        
//        i = 0
//         j = 0 < num;   check = data[bla].compareTo(data[bla])
 * 				1 > 0  -> swap;
//         j = 1 < num;	  check = data[bla].compareTo(data[ja])
 * 				1 > 0  -> swap;
//         j = 2 < num;   check = data[bla].compareTo(data[bla])
 * 				1 > 0  -> swap;
//         j = 3 < num;   check = data[bla].compareTo(data[ja])
 * 				1 > 0  -> swap;
 * 		  i = 1
 * 			j = 1 < num;  
        	        	
*/
        for(int i=0;i<num;i++)
            for(int j=i;j<num;j++)
            { 
                int check=data[i].compareTo(data[j]);
                
                if(check > 0)
                {
                   String temp;
                   temp = data[i];
                   data[i]=data[j];
                   data[j]=temp;
                }
            }
        
        for(int i=0;i<num;i++)
            System.out.println(data[i]);
    }
    
}