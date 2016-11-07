import java.util.Scanner;

public class Tokenised_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b,b2;
		int i;
		String s,hits="";
		Scanner scanner=new Scanner(args[0]);
		Scanner scanner1=new Scanner(args[0]);

		while(b=scanner.hasNext())
		{
			s=scanner.next();
			hits=hits+"b";
		}
		
		
		while(b2=scanner1.hasNext())
		{if(scanner1.hasNextInt())
		{
			i=scanner1.nextInt();
			hits=hits+"i";
		}
		else if(scanner1.hasNextBoolean())
		{
			b2=scanner1.nextBoolean();
			hits=hits+"b";
		}
		else
		{
			scanner1.next();
			hits=hits+"s2";
		}
	}
		System.out.println("The value of the hits are  "+hits);
	}

}
