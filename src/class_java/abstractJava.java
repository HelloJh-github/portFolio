package class_java;

import java.util.Arrays;

public class abstractJava {
  public abstract class Animal {
    abstract void eat();
  }


  public static void main(String[] args) {
    char eng = 'A';

    char[] engs = {'A', 'B', 'C', 'D', 'E', 'F'};
    char[] engs2 = new char[6];
    for (int i = 0; i < engs2.length; i++) {

      char sum = eng++;
      engs2[i] = sum;
    }
    System.out.println(engs2[3]);
    System.out.println(Arrays.equals(engs,engs2));
  }
}

