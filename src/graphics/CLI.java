package graphics;

import java.util.Scanner;

public class CLI
{
	private Object inventory;
	
	public static void main(String[] args)
	{
		//RUN IS NEEDED
	}

	public String input()
	{
		return new Scanner(System.in).nextLine();
	}
	
	public void output(String output)
	{
		System.out.print(output);
	}	
	
	public void errorOutput(Exception e)
	{
		System.err.println("Fehler: " +e.toString());
	}
}
