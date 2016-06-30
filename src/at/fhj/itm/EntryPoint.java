package at.fhj.itm;


public class EntryPoint {

	public static void main(String[] args) {
		ICommandLinePoint calc = new CommandLinePoint();
		
		if(args.length != calc.getMinArguments()){
			System.out.println(calc.getUsage());
			return;
		}
		
		try
		{
			double result = calc.calcCommandLine(args);
			System.out.println(result);
		}
		catch(MathOperationException ex)
		{
			System.out.print("Invalid math operation: " + ex.getMessage());
		}
		catch(ArithmeticException ex)
		{
			
		}
		
	}

}
