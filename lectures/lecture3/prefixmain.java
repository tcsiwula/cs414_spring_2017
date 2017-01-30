
public class prefixmain {

	public static void main(String args[])  {
		prefix parser;

		if (args.length < 1) {
			System.out.print("Usage: java prefixmain <filename>");
			return;
		}
		try {
			parser = new prefix(new java.io.FileInputStream(args[0]));
		} catch (java.io.FileNotFoundException e) {
			System.out.println("File " + args[0] + " not found.");
			return;
		}
		try {
			parser.expression();
			System.out.println("Parsing Successful");
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			System.out.println("Parsing Failed");
		}
	}
}


