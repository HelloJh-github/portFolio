public class multiArraty04 {
  public static void main(String[] args) {
    String[][] seats = new String[][]{
        {"A", "B", "C"},
        {"A", "B", "C"},
        {"A", "B", "C"},
        {"A", "B", "C"}


    };
    for (int i = 0; i < 3; i++) {//새로기준
      for (int j = 0; j < 3; j++) {
        System.out.print(seats[i][j] + " ");
      }
      System.out.println();

    }
    String[][] seats2 = {
        {"A", "B", "C"},
        {"A", "B", "C", "D"},
        {"A", "B", "C", "D","E"},
    };
    for (int i = 0; i < seats2.length; i++) {//새로기준
      for (int j = 0; seats2[i].length  > j; j++) {
        System.out.print(seats2[i][j] + " ");
      }
      //System.out.println(seats.length;
      System.out.println();
    }
    System.out.println("------------------");
    String[][] seats3 = new String[10][15];
    String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    for (int i = 0; i < seats3.length; i++) {
      for (int j = 0; j < seats3[i].length; j++) {
        seats3[i][j] = eng[i] + (j + 1);
      }

    }
    //표구매

    seats3[7][8] = "__";
    seats3[7][9] = "__";
    for (int i = 0; i < seats3.length; i++) {//새로기준
      for (int j = 0; seats3[i].length  > j; j++) {
        System.out.print(seats3[i][j] + " ");
      }
      //System.out.println(seats.length;
      System.out.println();
    }
  }
}
