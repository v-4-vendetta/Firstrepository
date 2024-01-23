import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionHandling {
    public static void ioException() {
        try {
            File newFile = new File("C:\\test.txt");
            FileInputStream stream = new FileInputStream(newFile);
        }
        catch (IOException ex) {
            System.out.println("IOException => " + ex.getMessage() + " - " + ex.getStackTrace());
        }
        finally {
            System.out.println("End of the IOException block");
        }
    }

    public static void ArrayIndexOutOfBoundsException(){
        try {
            int[] A = {1,2,3,4,5};
            System.out.println("Array Elements : ");
            for (int i=0; i <= A.length; i++)
            {
                System.out.println(A[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException => " + ex.getMessage() + " - " + ex.getStackTrace());
        }
        finally {
            System.out.println("End of the ArrayIndexOutOfBoundsException block");
        }
    }
    public static void arithmeticException() {
        try {
            int result = 22 / 0;
        }
        catch (ArithmeticException ex) {
            System.out.println("ArithmeticException => " + ex.getMessage() + " - " + ex.getStackTrace());
        }
        finally {
            System.out.println("End of the ArithmeticException block");
        }
    }

    public static void NumberFormatException() {
        try {
            int result = Integer.parseInt("text");
            System.out.println(result);
        }
        catch (ArithmeticException ex) {
            System.out.println("NumberFormatException => " + ex.getMessage() + " - " + ex.getStackTrace());
        }
        finally {
            System.out.println("End of the NumberFormatException block");
        }
    }
    public static void main(String[] args) {
        try {
            ioException();
            ArrayIndexOutOfBoundsException();
            arithmeticException();
            NumberFormatException();
        }
        catch (Exception ex) {
            System.out.println("General Exception => " + ex.getMessage() + " - " + ex.getStackTrace());
        }
        finally {
            System.out.println("End of the Main block");
        }
    }
}
