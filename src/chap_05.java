public class chap_05 {
  public static void main(String[] args) {
    String[] seatA = {"A", "B", "C"}; //배열 선언과 동시에 초기화
    System.out.println(seatA[2]); // 배열순번 출력
    //3*5의 배열을 만듬
    String[][] seats = new String[][] {
        {"A", "B", "C"},
        {"A", "B", "C"},
        {"A", "B", "C"},
        {"A", "B", "C"}


    };
    System.out.println(seats[0][2]);

    String[][] seats2 = {
        {"A", "B", "C"},
        {"A", "B", "C" ,"D"},
        {"A", "B", "C" , "D " , "E"},
    };
  }

}
