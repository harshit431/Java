import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_Locale {

	public static void main(String[] args) {
		Locale locale=new Locale(args[0]);
		
		ResourceBundle rb=ResourceBundle.getBundle("Properties//Locale",locale);
		
		System.out.println(rb.getString("hello"));

	}

}
