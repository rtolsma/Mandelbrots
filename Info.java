import acm.program.*;
public class Info extends DialogProgram{

	static public double width, height, iterations;
	static public boolean reset;
	public void run() {
		reset=readBoolean("Reset?");
		if(!reset) {
		width=readDouble("Enter the new Width");
		height=readDouble("Enter the new height");
		iterations=readDouble("enter the number of iterations");
		}
	}
	
}
