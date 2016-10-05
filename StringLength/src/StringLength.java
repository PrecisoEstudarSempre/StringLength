import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class StringLength {
	public static void main(String[] args) {
		String s = "ãããã";
		System.out.println("Length: " + s.length());
		
		try {
			System.out.println("Bytes em ISO-8859-1: " + s.getBytes("ISO-8859-1").length);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("Bytes em UTF-8: " + s.getBytes("UTF-8").length);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("Bytes em UTF-16: " + s.getBytes("UTF-16").length);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("Bytes em windows-1252: " + s.getBytes("windows-1252").length);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		System.out.println("Bytes em chamada de getBytes sem argumentos: " + s.getBytes().length);

		System.out.println("Default Charset da nossa JVM: "+ Charset.defaultCharset());
	}
	
}