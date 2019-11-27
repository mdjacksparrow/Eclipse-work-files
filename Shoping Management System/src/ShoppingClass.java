import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ShoppingClass 
{
	FileWriter write;
	FileReader read;
	Scanner get = new Scanner(System.in);
	public ShoppingClass() throws Exception
	{
		write = new FileWriter("C:\\Users\\ELCOT\\workspace\\Shoping Management System\\src\\Data.txt");
		read = new FileReader("C:\\Users\\ELCOT\\workspace\\Shoping Management System\\src\\Data.txt");
	}

	public void insert() throws Exception 
	{
		System.out.println("Enter data:");
		String data = get.nextLine();
		write.write(data);
		write.write("\n");
	}

	public void delete() throws Exception 
	{

	}

	public void search() throws Exception 
	{

	}

	public void availability() throws Exception 
	{

	} 
	
}
