package ex03;

public class PizzaTopping {
    public static void main(String[] args) {
        String[] topping = {"Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon"};

        // 1. String s 에 topping의 값을 하나씩 저장하면서 출력하는 방식
        for (String s : topping) { // 변수 topping의 첫 번째 요소부터 마지막 요소 까지 차례로 대입한다!
            System.out.print(s + " ");
        }
        System.out.println();
        // 2. 전통적인 방식
        for (int i = 0; i < topping.length; i++) { // length는 배열의 크기를 알고싶을때 사용한다!
            System.out.print(topping[i] + " ");
        }
    }
}
