package fundamentos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {

	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date x1 = new Date();
		//Date x2 = new Date(System.currentTimeMillis());
		
		java.util.Date y1 = sdf1.parse("25/06/2018");
		java.util.Date y2 = sdf1.parse("25/06/2018 15:42:07");
		
		//System.out.println(y1);
		//System.out.println(y2);
		
		//System.out.println(sdf2.format(x2));
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		
	}

}
