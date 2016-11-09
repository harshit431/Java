import java.util.Locale;
import java.util.ResourceBundle;

public class Resource_Bundle_Locale_Demo2  {
	
	public static void main(String args[])
	{
		Locale locale=new Locale(args[0],"CA");
		ResourceBundle rb=ResourceBundle.getBundle("Locales", locale);
		System.out.println(rb.getObject("helloji"));
		
	}

}


