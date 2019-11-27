package test;

import java.io.*;

public class File 
{

	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader("D:\\ts.txt");
			BufferedReader bf = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("D:\\Out.txt");
			
			String line, n = "";
			char c;
			int char_count = 0, word_count = 0;
			
			while((line = bf.readLine()) != null)
			{
				for(int i = 0; i < line.length(); i++)
				{
					c = line.charAt(i);
					/*
					 * the c can change each and every char
					 */
					char_count++;
					n += c;
					System.out.println(line.charAt(i));
				}
				
				word_count++;
				System.out.println(n);
				fw.write(n);
				n = "";
				fw.append('\n');
			}
			fw.append("words : " + word_count);
			fw.append('\n');
			fw.append("Char : " + char_count);
			System.out.println("words : " + word_count);
			System.out.println("char : " + char_count);
			
			fw.close();
			fr.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
