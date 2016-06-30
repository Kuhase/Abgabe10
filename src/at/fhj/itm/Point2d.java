package at.fhj.itm;

class Point2d {
	
	/**
	 * x = x-Koordinate des Points
	 * y = y-Koordinate des Points
	 */
	protected boolean debug;
	protected double x;
	protected double y;

	/**
	 * Generiere einen neuen Point mit px und py
	 * @param px = x-Koordinate des Points
	 * @param py = y-Koordinate des Points
	 */
	public Point2d (double px, double py){
		this.x = px;
		this.y = py;
	}

	/**
	 * Anfangswert von x und y wird auf 0 gesetzt.
	 */
	public Point2d (){		
		this.x = 0;
		this.y = 0;
	}

	/**
	 * Anfangswert von x und y wird gesetzt.
	 * @param pt liefert x und y Werte.
	 */
	public Point2d (Point2d pt){	
		this.x = pt.getX();
		this.y = pt.getY();
	}

	/**
	 * String s soll ausgegeben werden.
	 * @param s String der ausgegeben wird.
	 */
	public void dprint (String s) {
		if (this.debug)
			System.out.println("Debug: " + s);
	}

	/**
	 * Debug wird auf b gesetzt
	 * @param b ist ein boolean
	 */
	public void setDebug (boolean b) {
		this.debug = b;
	}

	/**
	 * x wird auf neuen Wert gesetzt
	 * @param px ist ein double
	 */
	public void setX(double px) {
		double x  = getX();
		dprint ("setX(): Changing value of X from " + x + " to " + px );
		this.x =px;
	}

	/**
	 * x wird ausgegeben
	 * @return x
	 */
	public double getX() {
		return this.x;
	}

	/**
	 * y wird auf neuen Wert gesetzt
	 * @param py ist ein double
	 */
	public void setY(double py)  {
		double y = getY();
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
		this.y =py;
	}

	/**
	 * 
	 * @return gibt y aus
	 */
	public double getY() {
		return this.y;
	}

	/**
	 * x und y werden auf einen Wert gesetzt
	 * @param px ist x
	 * @param py ist y
	 */
	public void setXY(double px, double py) {
		setX(px);
		setY(py);
	}

	/**
	 * Distanz wird berechnet
	 * @param pt damit wird die Distanz berechnet
	 * @return Distanz wird ausgegeben
	 */
	public double distanceFrom (Point2d pt) {
		double distanceX = pt.getX() - this.x;
		double distanceY = pt.getY() - this.y;
		double distance = Math.sqrt((distanceX*distanceX)+(distanceY*distanceY));
		return distance;
	}

	/**
	 * Distanz vom Nullpunkt weg wird berechnet
	 * @return gibt Distanz aus
	 */
	public double distanceFromOrigin () {
		Point2d pt = new Point2d();
		return distanceFrom(pt);
	}

	/**
	 * x und y werden ausgegeben
	 */
	public String toString() {
		return "x= " + this.x + "\n y= " + this.y;
	}
	
}

