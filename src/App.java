import processing.core.*;

public class App extends PApplet{
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    // This method sets the size of the window.
    public void settings() {
        size(700, 700);
    }

    // This method runs once at the beginning and sets up initial properties.
    public void setup() {
        // Sets the background color to light gray.
        background(135, 206, 235);
    }

    // This method will continuously draw things on the screen.
    public void draw() {
        fill(25, 165, 0);
        rect(50, 50, 200, 100);
        fill(25, 15, 0);
        rect(50, 150, 50, 100);
        stroke(255, 0, 0); // Red stroke color
        strokeWeight(5); // Stroke thickness of 5 pixels
        // Draw a circle at (400, 300) with a diameter of 100
        fill(255, 255, 0); // Yellow fill for the circle
        ellipse(400, 300, 100, 100);
    }
    


}
