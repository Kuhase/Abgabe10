package at.fhj.itm;


/**
 *  Exception thrown by the calculator if an calculator operation was illegal e.g. dividing by zero
 * @author Gerhard Seuchter
 *
 */
public class MathOperationException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MathOperationException(String message) {
		super(message);
	}
	public MathOperationException(String message, Throwable cause) {
		super(message,cause);
	}
}
