import java.util.StringTokenizer;

public class Tokenised_StringTokeniser {
	
	public static void main(String args[])
	{
		StringTokenizer st=new StringTokenizer("a bc d e");
		System.out.println("\n"+st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(">"+st.nextToken()+"<");
		}
		System.out.println("The new count is"+st.countTokens());
		
		StringTokenizer str=new StringTokenizer("a b cab a ba d","a");
		System.out.println(str.countTokens());
		
		while(str.hasMoreTokens())
		{
			System.out.println(">"+str.nextToken()+"<");
		}
		
		System.out.println("The new count is"+str.countTokens());
		
		
	}

}
