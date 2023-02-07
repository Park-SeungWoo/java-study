import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

class DataStructure {
    static void run() {
        // 문자열 다뤄보기
//        String s = "hello";
//        String t = new String("hello");
//        System.out.println(s == t);  // 같은 객체인지 확인
//        System.out.println(s.equals(t));  // 같은 문자열인지 확인
//        s = "Hello JAVA";
//        System.out.println(s.contains("JAVA"));
//        System.out.println(s.indexOf("JAVA"));
//        System.out.println(s.charAt(6));
//        System.out.println(s.replaceAll("JAVA", "WORLD"));
//        System.out.println(s.substring(0, 4));
//        System.out.println(s.toUpperCase());
//        System.out.println(s.toLowerCase());
//        String[] sa = s.split(" ");
//        System.out.println(sa[0]);
//        int a = 100;
//        System.out.println(String.format("score : %d", a));
//        System.out.printf("score : %d", a);

        // stringbuffer
//        StringBuffer sb = new StringBuffer();  // sb.append(s); 이런건 안됨
//        sb.append("hello");
//        sb.append(' ');
//        sb.append("JAVA");
//        String ss = sb.toString();
//        System.out.println(ss);
//
//        String so = "hello";
//        so += ' ';
//        so += "JAVA";
//        System.out.println(so); // same as sb

        /*
            stringbuffer 사용하면 string보다 무거운 객체를 생성해서 일반적으로는 string 사용이 우수
            but, string에서 += 으로 append하면 추가 할 때마다 자동으로 추가되는 문자열에 대해 string객체를 더 생성해서 차라리 무거운 stringbuffer 객체 하나 생성하고 append하는게 좋음
            so, 문자열 추가나 변경 많을 경우 stringbuffer가 좋고,
            그렇지 않으면 string을 쓰는게 좋음
         */
        /*
            stringbuilder도 있는데 이건 stringbuffer랑 똑같은거임 하지만 저것보단 좀 가벼움
            but, stringbuffer는 multi thread 상황에서 안전하고 stringbuilder는 성능이 우수
            so, 동기화 필요없는 상황에서는 builder, 아니면 buffer 쓰기
         */

        /*
        insert랑 substring 메서드도 있음
         */

        // array
//        int[] odds = {1, 3, 5, 7, 9};
//        System.out.println(odds.length);
//        System.out.println(Arrays.toString(odds));  // 배열 출력시 이렇게

        // list
//        ArrayList<Integer> al = new ArrayList<>();  // 이런식으로 <>표시로 제네릭스 표현식을 사용하지 않으면 내용물은 모두 object 객체로 인식돼 get으로 꺼내올 때 type casting을 해서 가져와줘야함.
//        al.add(0, 100);
//        al.add(200);
//        System.out.println(al);
//        System.out.println(al.get(0));
//        System.out.println(al.size());
//        System.out.println(al.contains(100));
//        System.out.println(al.remove(Integer.valueOf(100)));  // 객체로 접근해 해당 객체 삭제, 삭제 성공 실패 return (객체니깐 string은 그냥 "100" 이렇게 쓰면 됨)
//        al.add(100);
//        System.out.println(al.remove(0));  // index로 접근해 삭제, 삭제 후 list 내용 return
//
//        String[] sa = {"aa", "b", "c"};
//        ArrayList<String> ar2al = new ArrayList<>(Arrays.asList(sa));  // array to list, but in int type, it's difficult.
//        System.out.println(ar2al);
//
//        String res = String.join(",", ar2al);
//        System.out.println(res);
//
//        ar2al.sort(Comparator.naturalOrder());  // 오름차순 정렬

        // map := dictionary
//        HashMap<String, String> m = new HashMap<>();
//        m.put("key", "item");
//        m.put("sex", "male");
//        m.put("age", "24");
//        System.out.println(m.get("sex"));  // 없으면 null return
//        System.out.println(m.getOrDefault("addr", "no address"));  // 없으면 default값 return 하도록
//        System.out.println(m.containsKey("age"));
//        System.out.println(m.remove("key"));  // 해당 아이템 삭제하고 해당 값 출력 여기선 (key, item) 삭제 후 item 출력
//        System.out.println(m.size());
//        System.out.println(m.keySet());  // .keys() in python
        /*
        Map의 특징은 순서에 상관없이 key로 value를 가져오는 것이다.
        하지만 입력된 순서대로 데이터를 꺼내고 싶을 때도 있고,
        key로 정렬 해야하는 상황이 있을 수 있다.
        이럴땐 linked hash map 이나 tree map을 사용하면 됨.
        LinkedHashMap: 입력된 순서대로 데이터 저장 (linked list 특징 생각하면 될듯)
        TreeMap: key에 대해 오름차순으로 정렬되어 데이터 저장 (tree 구조 생각하면 될듯)
         */

        //
    }
}
