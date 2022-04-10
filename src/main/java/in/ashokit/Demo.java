package in.ashokit;

import com.ashokit.PasswordService;

public class Demo {
	
	public static void main(String[] args) {
            int i=10;
		String encodedTxt = PasswordService.encode("india@123");
		System.out.println(encodedTxt);
		String decodedTxt = PasswordService.decode(encodedTxt);
		System.out.println(decodedTxt);
int x=20;
	}

}
