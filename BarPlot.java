/*Name: Kim Kieu Pham 
 * ASU email: ktpham7@asu.edu
 * ClassID: Tue (9:00-10:15)
 * This is BarPlot class, which will draw the bar connect to the square and the line graph 
 * 
 */
import java.awt.*;
public class BarPlot extends DecoratedPlot {
	/*Draw function will continous draw the bar (long height rectangle) connect from the coordinate to the markplot (square box)
	 * by setting the color of the bar to Gray and the loop through the linked list to get the value to connect the point between the 
	 * random value between the coordinates and connect it by increment the x1 by x2 value to keep the line and bar are continous*/
	public void draw(Graphics g) {		
		//super.draw(g);
		int x1 = 0;/*create the x1 start at one to set the starting point*/
		int x2 = (500)/20;/*create the second value to update the x1 value */
		g.setColor(Color.GRAY);
		for (int i = 0 ; i < value.size()-1; i++) {
			g.fillRect(x1 - 5, value.get(i) - 5, 10, 250 - value.get(i));/*draw the bar with size from x1 -5 because we need mark it to the center*/
			x1 = x1 + x2;
		}
		super.draw(g);/*call super draw function in DecoratedPlot to draw the bar on the simple and marked plot*/
	}
}
