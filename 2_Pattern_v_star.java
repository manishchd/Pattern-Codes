/*


*           *
 *         * 
  *       *  
   *     *   
    *   *    
     * *     
      *      

*/

public class Main
{
  public static void main (String[]args)
  {
    printArray(7);
  }

  public static void printArray (int size)
  {
    int constant = (size * 2) - 2;

    for (int outerLoop = 0; outerLoop < size; outerLoop++)
      {
	for (int innerLoop = 0; innerLoop <= constant; innerLoop++)
	  {
	    System.out.print ((outerLoop == innerLoop
			       || (outerLoop != size-1
				   && (outerLoop + innerLoop) ==
				   constant)) ? "*" : " ");
	  }
	    System.out.println ();
      }
  }
 
}
