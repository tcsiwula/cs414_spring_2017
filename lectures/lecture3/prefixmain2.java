
public class prefixmain2 {

	public static void main(String args[])  {
		prefix2 parser;

		if (args.length < 1) {
			System.out.print("Usage: java prefixmain <filename>");
			return;
		}
		try {
			parser = new prefix2(new java.io.FileInputStream(args[0]));
		} catch (java.io.FileNotFoundException e) {
			System.out.println("File " + args[0] + " not found.");
			return;
		}
		try {
			parser.program();
			System.out.println("Parsing Successful");
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			System.out.println("Parsing Failed");
		}
	}
}


