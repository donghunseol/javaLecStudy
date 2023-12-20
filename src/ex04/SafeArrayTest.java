package ex04;

class SafeArray {
    private int[] a;
    public int lenght;

    public SafeArray(int size) {
        a = new int[size];
        lenght = size;
    }

    public int get(int index) {
        if (index >= 0 && index < lenght) {
            return a[index];
        }
        return -1;
    }

    public void put(int index, int value) {
        if (index >= 0 && index < lenght) {
            a[index] = value;
        } else {
            System.out.println("잘못된 인덱스 " + index);
        }
    }
}

public class SafeArrayTest {
    public static void main(String[] args) {
        SafeArray array = new SafeArray(3);

        for (int i = 0; i < array.lenght + 1; i++) {
            array.put(i, i * 10);
        }

        for (int i = 0; i < array.lenght; i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}
