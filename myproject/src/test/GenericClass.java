package test;

import java.util.*;

class DynamicList
{

	Scanner get = new Scanner(System.in);
	ArrayList<String> s;
	
	DynamicList(ArrayList<String> list)
	{
		this.s = list;
	}
	
	void append() 
	{
		s.add(this.getData());
	}
	
	void insert(int pos)
	{
		try 
		{
		String name = this.getData();
		s.add(--pos,name);
		}
		
		catch(Exception e)
		{
			System.out.println("Invalid Position! Try again!");
		}
	}
	
	void search()
	{
		String data = this.getData();		
		boolean found = s.contains(data);
		
		if(found)
			System.out.println("The " + data + " was FOUND !");

		else
			System.out.println("NOT found!");
	}
	
	void listOut()
	{
		System.out.print("Enter Your Character\t:\t");
		char c = get.nextLine().charAt(0);
		
		for(String name :s)
			if(name.charAt(0) == c)
					System.out.println(name);		
	}
	
	void display()
	{
		for(String name: s)
			System.out.println(name);
	}
	
	String getData()
	{
		System.out.print("Enter Your String\t:\t");
		String data = get.nextLine();
		return data;
	}
}


public class GenericClass 
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		
		DynamicList obj = new DynamicList(list);
		
		int ch;

		try {
			
		do {
			System.out.print("\n-----------------------------------------\n1.\tAppend\n2.\tInsert\n3\tSearch\n4.\tList Out First Letter\n5.\tDisplay\n6.\tExit\n-----------------------------------------\n");
			
			System.out.print("Enter Your Choices\t:\t");
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			ch = scanner.nextInt();
			
			switch(ch)
			{
				case 1:
					obj.append();
					break;
				case 2:
					System.out.print("Enter Position\t:\t");		
					int pos = scanner.nextInt();
					obj.insert(pos);
					break;
				case 3:
					obj.search();
					break;
				case 4:
					obj.listOut();
					break;
				case 5:
					obj.display();
					break;
				case 6:
					System.exit(0);
				default:
					System.out.println("Invalid Option! Try again!");
			}
		}while(true);
		}
		catch(Exception e)
		{
			System.out.println("Invalid Option !");
		}
	}

}
