public class AbstractClass {
    private String name;

    void setName(String name) {
        this.name = name;
    }
}

abstract class PredatorA extends AbstractClass {  // 추상 클래스는 단동으로 객체 생성 불가
    abstract String getFood();

    void printFood() {  // same as default method in interface
        System.out.println(getFood());
    }

    static String ZOO_NAME = "PARKS";  // 추상 클래스에서는 상수에 static 붙여야함

    static int speed() {
        return 30;
    }
}

/*
이제 이걸 가지고 호랑이나 사자 같은 클래스를 더 생성할 수 있다.
ex)
class eagle extends PredatorA implements Barkable{}
이런식으로

추상클래스는 interface에 default method가 생기면서 경계가 모호해졌는데
interface와 달리 일반 class처럼 객체변수, 생성자, private 메서 등을 가질 수 있음
 */