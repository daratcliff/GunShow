package workout;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Gunshowfinal extends GunShow{
	
	private static Object name;
	static LocalDateTime time = LocalDateTime.now();
	
	public void Gun(Object name) {
		setName(name);
	}
	
	public void setName(Object name) {
		this.name = name;
	}
	
	public static Object getName() {
		return name;
	}
	
	public static void Endmessage(){
		System.out.println("Thank for being apart of the Gunshow workout session on 12/06/2019");
	}
	
	public void date() {
		Date date = new Date();
		System.out.print(date.toString());
		
	}

}
