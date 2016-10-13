import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class StringLength {
	public static void main(String[] args) {		
		String stringDefaultCharset = "joão";
		System.out.println("Length em default charset: " + stringDefaultCharset.length());
		System.out.println("Length levando em conta a quantidade de caracteres: " + stringDefaultCharset.codePointCount(0,stringDefaultCharset.length()));
		System.out.println("Default Charset da nossa JVM: "+ Charset.defaultCharset());

		String stringUTF8 = new String(stringDefaultCharset.getBytes(),Charset.forName("UTF-8"));
		System.out.println("Length em UTF-8: " + stringUTF8.length());
		System.out.println("Length levando em conta a quantidade de caracteres: " + stringUTF8.codePointCount(0,stringUTF8.length()));

		String stringISO88591 = new String(stringDefaultCharset.getBytes(),Charset.forName("ISO-8859-1"));
		System.out.println("Length em ISO 8859-1: " + stringISO88591.length());
		System.out.println("Length levando em conta a quantidade de caracteres: " + stringISO88591.codePointCount(0,stringISO88591.length()));
	}	
}