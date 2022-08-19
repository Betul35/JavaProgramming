package day26_CustomMethodPractice;

import java.util.Arrays;

public class RemoveElements1 { //bu birinci cozum yolu

    public static void main(String[] args) {

        int[] numbers = {100,200,300,400,500,600};
        numbers = removeElement(numbers,1); // index numberi 1 olan 200 u cikariyor, skip ediyor, new array olarak assign back yapmaliyiz.
        System.out.println(Arrays.toString(numbers));
    }

//removes the index from the array, returns new array at the end
    public static int[] removeElement(int[] array, int index){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid index: " + index); //burada, eger index number invalid verilirse diye onlem!
            System.exit(0);
        }

        int[] result = new int[array.length-1]; //burada yeni array olusuyor ve 1 elementi cikardigimiz icin lenght -1 oluyor

        int j = 0; //j index number of the result!
        for (int i= 0; i< array.length; i++) {
            if (i==index){
                continue;// eger yazilacak element indexi verilen elemente esitse, skip yap, continue diyoruz.
            }
            result[j++] = array[i];
        }
        return result;
    }



}
/*
2. Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the element at the given index of the array and returns the new array


			2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the element at the given index of the array and returns the new array

			2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the element at the given index of the array and returns the new array
 */