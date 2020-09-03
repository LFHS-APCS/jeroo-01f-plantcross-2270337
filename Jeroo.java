/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    
    public void plantCross() {
    setStart();
  	goFirstEdge();
  	threePlantHop();
	  goAroundEdge();
  	goAroundEdge();
  	goAroundEdge();
        }
    // Put any helpermethods here
  public void setStart() {
  hop();
  hop();
  hop();
  hop();
  hop();
  hop();
  turn(RIGHT);
  hop();
  hop();
  hop();
  turn(LEFT);
}

public void threePlant() {
  plant();
  hop();
  plant();
  hop();
  plant();
}

public void threePlantHop() {
  plant();
  hop();
  plant();
  hop();
  plant();
  hop();
}

public void goAroundEdge() {
  turn(RIGHT);
  threePlant();
  turn(RIGHT);
  threePlantHop();
  turn(LEFT);
  threePlantHop();
  
}

public void goFirstEdge() {
	threePlant();
  	turn(RIGHT);
  	threePlantHop();
  	turn(LEFT);
}


    
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
