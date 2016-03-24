class StringLength {
	public static void main(String[] args) {
		String s = "joão";
		System.out.println("Length: " + s.length());
		
		try {
			System.out.println("Bytes: " + s.getBytes("ISO-8859-1").length);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("Bytes: " + s.getBytes("UTF-8").length);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
}