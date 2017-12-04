  import input_output.*;
  import java.io.FileNotFoundException;
  import java.io.IOException;

  public class Assembler_Application {
    public static void main(String[] args)throws IOException{
      for(int i=0;i< args.length;i++){
        System.out.println("ROI: "+ Input.args_and_run(args[i]));
      }
    }
  }
