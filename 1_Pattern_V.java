// U                                     U
//  T                                   T 
//   S                                 S  
//    R                               R   
//     Q                             Q    
//      P                           P     
//       O                         O      
//        N                       N       
//         M                     M        
//          L                   L         
//           K                 K          
//            J               J           
//             I             I            
//              H           H             
//               G         G              
//                F       F               
//                 E     E                
//                  D   D                 
//                   C C                  
//                    B     



public class Main
{
  public static void main (String[]args)
  {
    printArray (20);
  }

  public static void printArray (int size)
  {
    int constant = (size * 2) - 2;
    int charValue = 'A'+20;

    for (int outerLoop = 0; outerLoop < size; outerLoop++)
      {
	for (int innerLoop = 0; innerLoop <= constant; innerLoop++)
	  {
	    System.out.print ((outerLoop == innerLoop
			       || (outerLoop != size-1
				   && (outerLoop + innerLoop) ==
				   constant)) ? printCharacter(outerLoop,charValue) : " ");
	  }
	    System.out.println ();
      }
  }
  
  public static String printCharacter(int value, int charValue){
      System.out.printf("%c", charValue-value);
      return "";
  }
  
}
