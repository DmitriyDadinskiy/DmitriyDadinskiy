package HomeWork14;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;


//Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив. Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
//Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
//Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы, то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
public class Main {

    public static void main(String[] args) {
        int [] test = {1,2,4,4,5,6,7,8,1};
        System.out.println(Arrays.toString(test));
        checkArr(test);

    }

    public static int [] checkArr (int [] arr){
//subarray - Создает новый  массив, содержащий элементы между начальным и конечным индексами.
//lastIndexOf - поиск элемента массива с конца массива
// getLength - Возвращает длину указанного массива.
        int [] newArray = ArrayUtils.subarray(arr,ArrayUtils.lastIndexOf(arr,4) + 1, ArrayUtils.getLength(arr) +1);
        if (arr.equals(newArray)) throw new RuntimeException("4 not");
        System.out.println(Arrays.toString(newArray));
       return newArray;

    }


    public static boolean[] checkArr2(int[] arr){
return new boolean[]{(ArrayUtils.contains(arr, 1) || ArrayUtils.contains(arr, 4))}; //contains - проверка есть ли значение в массиве.
    }

}
