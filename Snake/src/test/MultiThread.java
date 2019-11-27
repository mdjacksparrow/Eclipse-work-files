package test;

import java.util.Random;

class Odd extends Thread
{
	int num;
	
	Odd(int n)
	{
		this.num = n;
	}

	@Override
	public void run() 
	{
		System.out.println("It's odd so cube of "+ num + " is " + num*num*num);
	}
}

class Even extends Thread
{
	int num;
	
	Even(int n)
	{
		this.num = n;
	}

	@Override
	public void run() 
	{
		System.out.println("It's Even " + num);
	}
}

class Demo extends Thread
{

	int range;
	
	Random rd = new Random();
	
	Demo(int n)
	{
		this.range = n;
	}
	@Override
	public void run() 
	{
		int gen;
		try
		{
			for(int i = 0 ; i < range ; i++) 
			{
				gen = rd.nextInt(100);
				System.out.println("Random value is : " + gen);
				
				if(gen % 2 == 0)
				{
					Thread t1 = new Thread(new Even(gen));
					t1.start();
				}else
				{
					Thread t2 = new Thread(new Odd(gen));
					t2.start();
				}
				Thread.sleep(1000);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
			
	}
	
}

public class MultiThread
{

	public static void main(String[] args) 
	{
		Thread o = new Thread(new Demo(5));
		o.start();
	}
}
