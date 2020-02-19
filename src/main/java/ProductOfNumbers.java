import lombok.Getter;

import java.util.Arrays;

/**
 * ProductOfNumbers
 *
 * @author mirror6
 * @date 2020/2/16
 * @description
 */
@Getter
public class ProductOfNumbers {

    private int[] array;
    //方法调用的次数
    private int count;
    //数组中元素
    private int index;

    public ProductOfNumbers() {
        this.array = new int[1];
        this.count = 0;
        this.index = 0;
    }

    public void add(int num) {
        if (index == array.length) {
            Arrays.copyOf(array, array.length + 1);
        }
        System.out.println(array.length);
        if (0 <= num && num < 100) {
            array[index] = num;
            count++;
            index++;
        }
    }

    public int getProduct(int k) {
        int result = 1;
        int size = array.length;
        for (int i = size - index; i < size; i++) {
            result = result * array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ProductOfNumbers numbers = new ProductOfNumbers();
        numbers.add(3);
        numbers.add(0);
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        System.out.println(Arrays.toString(numbers.getArray()));
        System.out.println(numbers.getProduct(2));
        System.out.println(numbers.getProduct(3));
        System.out.println(numbers.getProduct(4));
        numbers.add(8);
        System.out.println(numbers.getProduct(2));
    }
}
