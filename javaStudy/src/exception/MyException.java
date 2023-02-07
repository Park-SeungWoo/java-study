package exception;

public class MyException extends java.lang.Exception {
    MyException() {
    }

    MyException(String error) {
        super(error);
    }
}

/*
Exception을 상속받을 떄 내가 모르고 Exception이라는 클래스를 만들어서 저기 저렇게 생김 원래는 그냥 Exception이라고 해도 됨
또 Exception 이나 Runtimeexception을 상속받을 수 있는데
차이는
runtimeexception은 실행시 발생하는 예외
그냥 exception은 컴파일시 발생하는 예외
즉 exception은 프로그램 작성시 이미 예측 가능 한 예외일때 사용하고 (사용자의 오입력 등)
runtimeexception은 발생 할 수도 안할 수도 있는 예외일때 사용함 (프로그래머의 실수 등)
그래소 exception을 checked exception, runtimeexception을 unchecked exception이라고 하기도 함.
exception은 컴파일 시 예외 처리 체크 함 처리 안되어있으면 컴파일 불가
runtime~는 체크 안해서 해도 되고 안해도 됨.(개발자가 실수 할 수 있을만한 부분을 갖다가 예외 처리하는거임 그러니깐 개발자가 주의하면 아무문제 없는거니 예외 처리 해도 그만 안해도 그만)
 */
