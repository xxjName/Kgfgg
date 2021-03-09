import com.am.WritingAm;

import java.util.Scanner;

/***
 * Unit test startup class
 */
public class AlgorithmTest {
    private static Scanner input=new Scanner(System.in);
    /***
     *       ABC  DEF
     * 1      2    3
     *GHI   JKL  MNO
     * 4     5    6
     *PQRS  TUV  WXYZ
     * 7     8    9
     * *     0    #
     */
    public  static void main(String[]  age){
        String number="";
        WritingAm writingAm =new WritingAm();
        while(true){
            System.out.println(" Please input number  ");
            number=input.next();
            if(!number.matches("[0-9]{1,2}")){
                System.out.println("Illegal input! Only 0-99 numbers can be entered, please re-enter:");
            }else{
                writingAm.numberToLetter(number);
                System.out.println("  ");
            }
            System.out.println(" Do you want to continue? Press any key to continue. Please enter no to end");
            if (input.next().equals("no")){
                break;
            }
        }
    }
}
