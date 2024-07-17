package animal;

public class Aimal {
  String name;
  int age;
  int since;
  boolean alive;
  boolean sleep;

  Animal(String name, int age, int since, boolean alive, boolean sleep) {
    this.name = name;
    this.age = age;
    this.since = since;
    this.alive = alive;
    this.sleep = sleep;
  }


  public void information() {
    System.out.println("이름 : " + name);
    System.out.println("나이 :" + age);
    System.out.println("태어난 년도 :" + since);
    System.out.println("생사 여부 :" + alive);
    System.out.println("자는지 :" + sleep);

  }

  }
