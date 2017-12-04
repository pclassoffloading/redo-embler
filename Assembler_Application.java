
  import java.io.FileNotFoundException;
  import java.io.IOException;
  import java.util.Scanner;
  import java.io.*;
  import input_output.*;

  public class Assembler_Application {
    public static void main(String[] args)throws IOException{
      for(int i=0;i< args.length;i++){
        System.out.println("ROI: "+ Input.args_and_run(args[i]));
      }
    }
  }
