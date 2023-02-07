package inout.consoleinout;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleInOut {
    public static void run() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println(input.next());  // one token(word)
        input.nextLine();  // buffer 비우기
        System.out.println(input.nextLine());  // one line
        System.out.println(input.nextInt());  // integer

        /*
        next는 토큰형식(단어)으로 입력받아서 어떤 문자, 문장이 오던 구분자(' ', '엔터', 등)가 등장하면 그 전까지만 저장하고 나머지 구분자부터 그 뒤의 문자는 입력 버퍼에 남겨둔다.
        nextInt, ... 도 마찬가지.
        예를 들어
        next()로 'word'라고 치고 엔터를 치면 앞의 'word'를 저장하고 뒤에 친 엔터문자는 버퍼에 그대로 남아있게된다.
        그상태로 nextLine()을 하면 버퍼에 남아있는 엔터문자만 가져가고 끝나버리게 된다.
        그래서 next() 또는 next~~() 이후에는 nextline()을 통해 입력버퍼에 남아있는 엔터문자 등등을 없애주고 다시한번 nextline()을 해줘야한다.
        또는 애초에 그냥 nextline()으로 받고 형변환, 문자열처리 해서 원하는값으로 가져오도록 해야한다.
         */
    }
}
