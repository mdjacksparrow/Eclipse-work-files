package test;

public class SynThread 
{ 
 @SuppressWarnings("unused")
public static void main(String args[]) 
 { 
  share s = new share(); 
  MyThread m1 = new MyThread(s, "Thread1"); 
  MyThread m2 = new MyThread(s, "Thread2"); 
  MyThread m3 = new MyThread(s, "Thread3"); 
 } 
}
class MyThread extends Thread 
{ 
 share s; 
 MyThread(share s, String str) 
 { 
  super(str); 
  this.s = s; 
  start(); 
 } 
 public void run() 
 { 
  s.doword(Thread.currentThread().getName()); 
 } 
}
class share 
{ 
 public void doword(String str) 
 { 
	 synchronized(this)
	 {
		  for (int i = 0; i < 5; i++) 
		  { 
		   System.out.println("Started:" + str); 
		   try 
		   { 
		    Thread.sleep(1000); 
		   } 
		   catch (Exception e) 
		   { 
		   }}}
	 };
} 
