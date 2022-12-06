class StringStripVsTrim {
	public static void main(String a[]) {
		String test = "         test123mmms   ";
		
		System.out.println("Stripped:" + test.strip() +"|eod");
		System.out.println("Trimmed:" + test.trim() +"|eod");
	}
}