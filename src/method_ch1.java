public class method_ch1 {

  public static void sayhello() {

    System.out.println("안녕하세요 메소드입니다");
  }

  public static void main(String[] args) {

    System.out.println("호출전");
    sayhello();
    System.out.println("호출후");
  }
}
