import processing.core.PApplet;

public class UsingProcessing extends PApplet {
	
	// Main method to get the Processing sketch running
	public static void main(String[] args) {
		// Start a PApplet application by telling it to use this class
		PApplet.main("UsingProcessing");
	}
	
	// Set size of the screen
	public void settings()
	{
		size(300,300);
	}
	
	// Runs at the start of the sketch
	public void setup()
	{
		fill(120,50,240);
	}
	
	public void draw()
	{
		ellipse(width/2, height/2 , second() , second());
	}
}
