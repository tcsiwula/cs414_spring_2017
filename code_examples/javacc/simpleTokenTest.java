class simpleTokenTest {

	public static void main(String args[]) {
		Token t;
		java.io.InputStream infile;
		simpleTokenManager tm;
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
		tm = new simpleTokenManager(new SimpleCharStream(infile));
		t = tm.getNextToken();

		while(t.kind != simpleConstants.EOF) {
			System.out.print("Token : "+ t + " : ");
			System.out.println(simpleConstants.tokenImage[t.kind]);
			t = tm.getNextToken();
		}
	}
}