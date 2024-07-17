public class asckey_code {
  public static void main(String[] args) {

    // char ch = 'A';
    // System.out.println(ch);
    // System.out.println((int)ch);
    String[][] movieSeats = new String[10][15];
    char[] engs = new char[movieSeats.length];
    char eng = 'A';
    for (int i = 0; i < movieSeats.length; i++) {
      char sum = eng++;
      engs[i] = sum;

      String[] en = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

      System.out.println(engs[i]);
      for (int k = 0; k < movieSeats.length; k++) {
        for (int j = 0; j < movieSeats[i].length; j++) {
         // movieSeats[k][j] = engs[i] + 1;

        }


      }


    }
    for (int i = 0; i < movieSeats.length; i++) {//새로기준
      for (int j = 0; movieSeats[i].length > j; j++) {
        System.out.print(movieSeats[i][j] + " ");
      }
      //System.out.println(seats.length;
      System.out.println();
    }
  }
}
