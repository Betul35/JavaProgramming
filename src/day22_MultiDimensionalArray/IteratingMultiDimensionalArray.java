package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3} , {4,5,6,7} , {8,9,10,11,12} };


        for (int i = 0; i < arr2D.length; i++) { // burada single dimensional arrayin indexlerini yaziyoruz

            for (int j = 0; j < arr2D[i].length; j++) { // burada da index of elements, arr2D[i] diye yaziyoruz ki tum
                                                        // single dimensional arraylarin icindeki elementlere ulasalim deyu
                System.out.print(arr2D[i][j] + " ");

            }

            System.out.println(); // bu da single dimensional array indexleri arasinda append a new line icin
        }

        System.out.println("-----------------------------------------------------------");





    }
}
