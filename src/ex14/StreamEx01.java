package ex14;

import java.util.*;

public class StreamEx01 {
    public static void main(String[] args) {
        /**
         * class 와 비슷하지만 Map 이 행위는 가지고 있지 않고 상태만 가지고 있는 모습이라고 이해하면 될 것 같다.
         * 보통 개발자는 데이터 자료형으로 Map 을 잘 안쓰고 class 로 만든다.
         * class 자료형과 Map의 비교! 그 이유는?
         * 1. Map 은 Object 여야지 다양한 자료형을 사용 가능하다.
         * 2. Map 은 오타 가능성이 높다.
         * 3. 다운 캐스팅을 해줘야 한다.
         * 거의 class 를 쓰는게 훨씬 좋다.
         * 거의 Map 은 사용하지 않는다. - 그나마 쓴다하면 자료형이 동일한 경우 상황별로 사용한다.
         * Map 을 꺼내고 사용하려면 다운캐스팅을 꼭 할줄 알아야 한다!
         */
        Map<String, Object> data = new HashMap<>();
        data.put("name", "홍길동");
        data.put("age", 20);

        Map<String, Object> data2 = new HashMap<>();
        data2.put("name", "장보고");
        data2.put("age", 15);

        Map<String, Object> data3 = new HashMap<>();
        data3.put("name", "이순신");
        data3.put("age", 30);

        List<Map<String, Object>> arr = Arrays.asList(data, data2, data3);

        List<Map<String, Object>> newArr = arr.stream().map(d -> {
            int newAge = (Integer) d.get("age") - 1;                // 다운캐스팅을 하고 -1 한 값을 넣는다.
            d.put("age", newAge);                                   // 그런 후 값을 덮어 씌워야지 원하는 값을 얻을 수 있다.

            return d;
        }).toList();

        newArr.stream().forEach(d -> {
            System.out.println(d.get("age"));
        });

        // 위의 3개를 저장하려면 배열, 컬렉션(ArrayList), 벡터 등
        // 데이터가 3개가 고정인 경우 배열을 쓸 수도 있는데
        // 우리는 그냥 "컬렉션(ArrayList)"만 사용하면 된다.
    }
}
