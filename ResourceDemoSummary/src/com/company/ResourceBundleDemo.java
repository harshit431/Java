package com.company;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale locale =new Locale("en","US");
		ResourceBundle rb=ResourceBundle.getBundle("RB",locale);
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("helloJI"));
		System.out.println(rb.getString("helloji"));
		
		System.out.println(Locale.getDefault());
	}

}
