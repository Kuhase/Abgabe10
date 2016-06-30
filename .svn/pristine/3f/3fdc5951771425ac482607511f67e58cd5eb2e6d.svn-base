package at.fhj.itm;

/**
 * Calculator that can interpret results directly from the command line
 * @author gseuchter
 *
 */
public class CommandLinePoint extends Point2d implements ICommandLinePoint {

	@Override
	public int getMinArguments() {
		return 4; //4 noetig, um Distanz der Punkte ausrechnen zu knnen.
	}

	@Override
	public String getUsage() {
		return "usage <operation> <integer> <integer>\n\t operations: (add|sub|mul|div)";
	}

	/**
	 * zwei neue Punkte werden erstellt, damit wird dann die Distanz berechnet und ausgegeben.
	 */
	@Override
	public double calcCommandLine(String[] args) throws NumberFormatException,
			IllegalArgumentException, MathOperationException {
		if(args.length != getMinArguments()){
			throw new IllegalArgumentException("Wrong number of parameters");
		}
		
		//zwei Punkte erstellen
		Point2d p1 = new Point2d(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		Point2d p2 = new Point2d(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		
		
		return p1.distanceFrom(p2);
	}

}
