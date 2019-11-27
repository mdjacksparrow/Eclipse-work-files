package myproject;
import java.util.Scanner;

class Student{
	int[][] mark = new int[5][5];
	int[] avg = new int[5];
	int[] tot = new int[5];
	
	
	Scanner get = new Scanner(System.in);
	
	Student(){
		System.out.println("Enter the following details ..");
	}
	
	void calc() {
		
		int total = 0;
		
		for(int i = 0; i < 5;i++)
			{
			System.out.println("Enter " + (i+1)+ " Student Mark :: ");
			
			for(int j = 0; j < 5; j++) {
				System.out.print("Enter  " + (j+1) + " Mark  ");
				this.mark[i][j] = get.nextInt();
				total += mark[i][j];
			}
				tot[i] = total;
				avg[i] = total/5;
			}	
			
	}
	
		
	void display() {
		for(int i = 0;i<5;i++)
			{
				System.out.println("-----------------------------");
				System.out.print("Student "+(i+1));
				System.out.println("Total " + tot[i]);
				System.out.println("Average " + avg[i]);
				System.out.println("-----------------------------");
			}
	}

}


public class MarkOfStudent 
{

	public static void main(String[] args) 
	{
		Student obj = new Student();
		obj.calc();
		obj.display();
	}

}
