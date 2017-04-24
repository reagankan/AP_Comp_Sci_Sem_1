/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.keepOnlyBlue();
    beach.explore();
  }
  /** Method to test negate */
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.negate();
    beach.explore();
  }
  /** Method to test negate */
  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.grayscale();
    beach.explore();
  }
  /** Method to test negate */
  public static void testFixUnderwater()
  {
    Picture beach = new Picture("water.jpg");
	beach.fixUnderwater();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("beach.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  /** Method to test mirrorHorizontalBotToTop */
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("beach.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  /** Method to test mirrorDiagonal*/
  public static void testMirrorDiagonal()
  {
    Picture caterpillar = new Picture("beach.jpg");
    caterpillar.explore();
    caterpillar.mirrorDiagonal();
    caterpillar.explore();
  }
  /** Method to test mirrorArms */
  public static void testMirrorArms()
  {
    Picture temple = new Picture("snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  /** Method to test mirrorGull */
  public static void testMirrorGull()
  {
    Picture temple = new Picture("seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  /** Method to test copy by overlaying several layers of flowers on the moon*/
  public static void testCopy()
  {
    Picture moon = new Picture("moon-surface.jpg");
	Picture flower = new Picture("flower1.jpg");
	Picture ele = new Picture("kitten2.jpg");
	ele.explore();
	
    moon.explore();
    moon.copy(flower,0,32,25,65);
    moon.explore();
	moon.copy(ele,127,207,204,309);
    moon.explore();
	moon.copy(ele,254,352,298,465);
    moon.explore();
  }
  /** Method to test copy by overlaying several layers of flowers on the moon*/
  public static void testMyCollage()
  {
    Picture beach = new Picture("beach.jpg");
	beach.myCollage(beach);
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
	canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
	swan.edgeDetection(7);
    swan.explore();
  }
  /** Method to test edgeDetection2 */
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
	swan = swan.edgeDetection2(7);
    swan.explore();
  }
  /** Method to test edgeDetection3 */
  public static void testEdgeDetection3()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
	swan = swan.edgeDetection3(7);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
	//Uncomment list of commands to view the methods Reagan Kan wrote.
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testGrayscale();
	//testNegate();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorDiagonal();
	//testMirrorArms();
    //testMirrorGull();
	//testCopy();
	//testMyCollage();
	//testEdgeDetection2();
	//testEdgeDetection3();
    //testMirrorTemple();
    //testCollage();
    //testEdgeDetection();
	
    //Uncomment list of commands to view the methods AP wrote.
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}