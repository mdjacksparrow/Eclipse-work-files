import java.util.Scanner;

public class Mc 
{
	public static void main(String[] args) throws Exception
	{
		ShoppingClass obj = new ShoppingClass();
		obj.insert();
		int ch;
		
		do {
			System.out.print("\n------------MENU CARD-------------\n1.\tInsert\n2.\tDelete\n3.\tSearch\n4.\tAvailability\n5.\tExit\n------------MENU CARD-------------\n");
			System.out.print("Enter your choice\t:\t");
			ch = new Scanner(System.in).nextInt();
			switch(ch)
			{
			case 1:
				obj.insert();break;
			case 2:
				obj.delete();break;
			case 3:
				obj.search();break;
			case 4:
				obj.availability();break;
			case 5:
				obj.write.close();
				obj.read.close();
				System.exit(0);
			}
			
		}while(true);
	}
}
