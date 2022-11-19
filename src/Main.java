import java.util.HashSet;

public class Main {
    public static void main(String[] args)  {

        //Есть массив целых чисел.
        // Точно известно, что каждое число в нем встречается 2 раза и есть только одно число,
        // которое встречается 1 раз.
        //Найдите это число
//        int[] arr1 = {1,2,1,3,2,4,4};
//        int[] arr2 = {3,1,2,1,2,4,4};
//        int[] arr3 = {1,2,1,2,4,4,3};
        int[] arr1 = {1,1,3,4,4};
        int[] arr2 = {3,1,1,4,4};
        int[] arr3 = {1,1,4,4,3};

        variant3(arr1);
        variant3(arr2);
        variant3(arr3);

//        System.out.println("##### Пример битовых операций");
//        System.out.println(0 ^ 0);
//        System.out.println(1 ^ 1);
//        System.out.println(0 ^ 1);
//        System.out.println(1 ^ 0);




    }
    //ганартировано O(n)
    public static void variant3(int[] arr){
        //xor:
        //0 ^ 0 = 0
        //1 ^ 1 = 0
        //1 ^ 0 = 1
        //0 ^ 1 = 1

        //     1 1 3 4 4 -> 3
        //xor: 1 = 1
        //xor: 1 = 1
        //xor: 0 = 0
        //xor: 0 = 0
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res ^=arr[i];
        }
        System.out.println(res);
    }

    //O(n) в случшем или O(n*logn) в среднем
    public static void variant2(int[] arr){
        HashSet<Integer> unqiue = new HashSet<>();
        //1 4 3 1 4
        for (int num : arr) {
            if (!unqiue.contains(num)) {
                unqiue.add(num);
            } else {
                unqiue.remove(num);
            }
        }
        System.out.println(unqiue);
    }

    //O(n) в случшем или O(n*logn) в среднем
    public static void variant1(int[] arr){
        //int[] arr1 = {1,1,3,4,4};
        HashSet<Integer> unqiue = new HashSet<>();
        int summa = 0;
        for (int num : arr) {
            if (!unqiue.contains(num)) {
                summa += num;
                unqiue.add(num);
            } else {
                summa -= num;
            }
        }
        System.out.println(summa);
    }


}

