/*
 *  ============================================================================================
 *  enum which defines the type of shapes in A3
 *  YOUR UPI: zgao819
 *  ============================================================================================
 */
import java.util.*;
enum ShapeType { RECTANGLE, OVAL, NESTED;
	private static final Random rand = new Random(30);
	private static final int SIZE = values().length;
	/** returns the shape type
	*	@param index	the index value */
	public static final ShapeType getShapeType(int index) { return values()[index]; }
	/** returns the next shape type  */
	public ShapeType next() {
		return values()[(ordinal() + 1) % values().length];
		}
	/** returns a random shape type  */
	public static ShapeType getRandomShapeType()  {
	    return values()[rand.nextInt(SIZE)];
  }
}