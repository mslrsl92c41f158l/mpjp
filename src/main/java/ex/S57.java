package ex;

public class S57 {
	/**
	 * Average speed
	 * 
	 * @param distance in meters
	 * @param time     in seconds
	 * @return speed in meters per second
	 */
	public static double speed(double distance, double time) {
		return distance / time;
	}

	/**
	 * Distance between (x0, y0) and (x1, y1)
	 * 
	 * @param x0 first point x
	 * @param y0 first point y
	 * @param x1 second point x
	 * @param y1 second point y
	 * @return distance
	 */
	public static double distance(int x0, int y0, int x1, int y1) {
		int a = (x1 - x0);
		int b = (y1 - y0);
		double c = Math.pow(a, 2) + Math.pow(b, 2);

		return Math.sqrt(c);

	}

	/**
	 * Engine capacity
	 * 
	 * @param bore   in mm
	 * @param stroke in mm
	 * @param nr     number of cylinders
	 * @return the engine capacity in cm^3
	 */
	public static double engineCapacity(double bore, double stroke, int nr) {

		return (Math.pow(bore / 2,2) * (stroke * Math.PI)) / 1000;
	}

	// somma delle cifre in un numero
	/**
	 * Add up all the digits in an integer
	 * 
	 * @param value
	 * @return sum of digits
	 */
	public static int digitSum(int value) {
		int sum = 0;
		value = Math.abs(value);
		while (value != 0) {
			sum += value /10;
			value /= 10;
		}
			return sum;	

	}
}
