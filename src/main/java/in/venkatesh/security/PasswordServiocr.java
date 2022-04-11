package in.venkatesh.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordServiocr {
	
	

	int a=10;

	int x=60;

	public static String encode(String txt) {

		Encoder encoder = Base64.getEncoder();

		String encodetxt = encoder.encodeToString(txt.getBytes());// converting the txt into bytes

		return encodetxt;

	}

	public static String decode(String encodetxt) {
		Decoder decoder = Base64.getDecoder();

		byte[] decode = decoder.decode(encodetxt);// we need to convert the obtained byte code array to string

		return new String(decode);
	}

	public static void main(String[] args) {
		
		String encode = PasswordServiocr.encode("venkatesh");
		
		System.out.println(encode);
		
		String decode = PasswordServiocr.decode(encode);
		
		System.out.println(decode);
		

	}
}
