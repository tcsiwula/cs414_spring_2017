class simple2TokenTest {

	public static void main(String args[]) {
		Token t;
		java.io.InputStream infile;
		simple2TokenManager tm;
		boolean loop = true;
		if (args.length < 1) {
			System.out.print("Enter filename as command line argument \n");
			return;
		}
		try {
			infile = new java.io.FileInputStream(args[0]);
		} catch (java.io.FileNotFoundException e) {
			System.out.println("File " + args[0] + " not found.");
			return;
		}
		tm = new simple2TokenManager(new SimpleCharStream(infile));
		t = tm.getNextToken();

		while(t.kind != simple2Constants.EOF) {
			System.out.print("Token : "+ t + " : ");
			System.out.println(simple2Constants.tokenImage[t.kind]);
			t = tm.getNextToken();
		}
	}
}