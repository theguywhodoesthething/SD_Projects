package labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2 implements Runnable {
  private int id;
  private String filename;
  private Thread  t = null;

  public ReadFile2(String fn, int i) {
    id = i;
    filename = fn;
    t = new Thread(this);
  }

  @Override
  public void run() {
    String line = null;
    int count = 0;

    try (BufferedReader input = new BufferedReader(new FileReader(
        filename))) {

      while ((line = input.readLine()) != null) {
        System.out.println("Object " + id + "->" + line);
        if ((++count % 5) == 0)
          Thread.yield();
      }
    }
    catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }
  
  public void startThread() {
	  this.t.start();
  }
  
  public static void main(String[] args) {
    ReadFile2[] readers = new ReadFile2[3];

    for (int i = 0; i < readers.length; i++) {
      // read source code file
      readers[i] = new ReadFile2("solutions/ReadFile.java", i);
      readers[i].startThread();
    }
  }  
}
