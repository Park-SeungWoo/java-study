package lambdastream;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

@FunctionalInterface
interface Calculator{
    int sum(int a, int b);
}

public class LambdaPrac {
    public static void run() {

//    Calculator c = (int a, int b) -> a + b;
//    Calculator c = (a, b) -> a + b;  // interface에 타입 명시되어 있어 타입 생략가능
        Calculator c = Integer::sum;  // Integer클래스의 sum 메서드를 사용한다는 뜻임(public static int sum(int a, int b) 임)

        BiFunction<Integer, Integer, Integer> bi = (a, b) -> a + b;  // 따로 interface 구현 없이 동작 <입력 타입 두개, 출력타입>
        BinaryOperator<Integer> bo = (a, b) -> a + b;  // 입출력 타입 동일하면 이렇게 사용가능
        int res = bi.apply(1, 2);  // 사용할 땐 apply 메서드 써야함
        res = bo.apply(2, 3);
    }
}

/*
lambda 함수 이용하면 따로 class 만들어서 구현할 필요 없이 lambda 함수로 구현 가능
but interface의 메서드가 2개이상이라면 lambda함수 사용 불가함
그래서 lambda함수 사용하는 interface는 어노테이션으로 @FunctionalInterface를 사용하는게 좋음(두개이상의 메서드 사용불가하도록 함)

lambda 함수에 대한 내용이 방대해서 추가 공부해야함
 */