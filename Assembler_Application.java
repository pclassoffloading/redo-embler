  import java.io.FileNotFoundException;
  import java.io.IOException;
  import java.util.Scanner;
  import java.io.*;

  interface Bank{public static float rateOfInterest(){return 9.15f;}}

  public class Assembler_Application{
    public static void main(String[] args){
        System.out.println("ROI: "+ Bank.rateOfInterest());
    }
  }
