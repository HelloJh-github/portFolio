public class parameter_ch1 {
  public static void power(int number) { //매개변수
    int result = number * number;
    System.out.println(number + "의 2승은 " + result);
  }

  public static void main(String[] args) {
    power(4);
  }
}
