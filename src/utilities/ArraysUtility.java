package utilities;

import java.util.Arrays;

public class ArraysUtility {
    
    //print each integer of an integer array in separate lines
    public static void printEachElement(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }
    
    //print each double of a double array in separate lines
    public static void printEachElement(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    //print each char of a char array in separate lines
    public static void printEachElement(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }


    //print each String of a String array in separate lines
    public static void printEachElement(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }


    //returns the maximum number for integer array
    public static int max(int[] num){
        Arrays.sort(num);
        return num[num.length-1];
    }


    //returns the maximum number for double array
    public static double max(double[] num){
        Arrays.sort(num);
        return num[num.length-1];
    }

    //returns the minimum number from integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    //returns the minimum number from double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    //checks if the given integer is contained in the given array, return boolean. contains(int[],int)
    public static boolean contains(int[] array, int element){
        boolean result = false; //simdilik false olarak sayiyoruz, sonra true ise true olacak

        for (int each : array) {
            if (each ==element){
                result = true;
            }
        }
        return result;

    }

    //checks if the given integer is contained in the given array, return boolean. contains(int[],int)
    public static boolean contains(double[] array, double element){
        boolean result = false; //simdilik false olarak sayiyoruz, sonra true ise true olacak

        for (double each : array) {
            if (each ==element){
                result = true;
            }
        }
        return result;

    }

    //checks if the given integer is contained in the given array, return boolean. contains(int[],int)
    public static boolean contains(char[] array, char element){
        boolean result = false; //simdilik false olarak sayiyoruz, sonra true ise true olacak

        for (char each : array) {
            if (each ==element){
                result = true;
            }
        }
        return result;

    }

    //checks if the given integer is contained in the given array, return boolean. contains(int[],int)
    public static boolean contains(String[] array, String element){
        boolean result = false; //simdilik false olarak sayiyoruz, sonra true ise true olacak

        for (String each : array) {
            if (each.equals(element)){
                result = true;
            }
        }
        return result;

    }


    // 1. adds the element to array, returns a new array
    public static int[] addElement(int[] array, int element){

        int[] result = new int[array.length+ 1]; // +1 yapiyoruz ki arrayin sizeini genisletelim ve yeni array elde edelim diye, elementi de eklemek icin

        int i = 0; // arraydeki elementlerin index num larina ulasmak icin
        for (int each : array) {
            result[i++] = each; // index num post increment olacak, ve teker teker tum elementleri create edecegiz
        }
        result[i] = element; // bu da son index number yani son element, bizim ekledigimiz element

        return result;

    }


    //2. adds the element to array, returns a new array
    public static double[] addElement(double[] array, double element){


        double[] result = new double[array.length+1];

        int i = 0;
        for (double each : array) {
            result[i] += each;
            i++; // bunu 1. ornekteki gibi yukariya post increment olarak da yazabiliriz.
        }
        result[i]= element;

        return result;
    }


    //3. adds the element to array, returns a new array
    public static String[] addElement(String[] array, String element){ // //kisayol tum double lari Stringe cevirmek icin: command+r

        String[] result = new String[array.length+1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;

        }
        result[i]= element;

        return result;
    }


    //4. adds the element to array, returns a new array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length+1];

        int i = 0;
        for (char each : array) {
            result[i] = each;
            i++;
        }
        result[i] = element;

        return result;

    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }


    //returns the frequency of the given element from the given double array
    public static double frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }


    //returns the frequency of the given element from the given double array
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given double array
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if (each.equals(element)){
                count++;
            }
        }
        return count;
    }

    //returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result = {}; // empty array veriyoruz ki sonunda unique elementler array olustursun.

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) ==1 ){ //frequency 1 ise element unique dir.
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result = {}; // empty array veriyoruz ki sonunda unique elementler array olustursun.

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) ==1 ){ //frequency 1 ise element unique dir.
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result = {}; // empty array veriyoruz ki sonunda unique elementler array olustursun.

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) ==1 ){ //frequency 1 ise element unique dir.
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result = {}; // empty array veriyoruz ki sonunda unique elementler array olustursun.

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) ==1 ){ //frequency 1 ise element unique dir.
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
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

    //removes the index from the array, returns new array at the end
    public static double[] removeElement(double[] array, int index){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid index: " + index); //burada, eger index number invalid verilirse diye onlem!
            System.exit(0);
        }

        double[] result = new double[array.length-1]; //burada yeni array olusuyor ve 1 elementi cikardigimiz icin lenght -1 oluyor

        int j = 0; //j index number of the result!
        for (int i= 0; i< array.length; i++) {
            if (i==index){
                continue;// eger yazilacak element indexi verilen elemente esitse, skip yap, continue diyoruz.
            }
            result[j++] = array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array at the end
    public static char[] removeElement(char[] array, int index){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid index: " + index); //burada, eger index number invalid verilirse diye onlem!
            System.exit(0);
        }

        char[] result = new char[array.length-1]; //burada yeni array olusuyor ve 1 elementi cikardigimiz icin lenght -1 oluyor

        int j = 0; //j index number of the result!
        for (int i= 0; i< array.length; i++) {
            if (i==index){
                continue;// eger yazilacak element indexi verilen elemente esitse, skip yap, continue diyoruz.
            }
            result[j++] = array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array at the end
    public static String[] removeElement(String[] array, int index){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid index: " + index); //burada, eger index number invalid verilirse diye onlem!
            System.exit(0);
        }

        String[] result = new String[array.length-1]; //burada yeni array olusuyor ve 1 elementi cikardigimiz icin lenght -1 oluyor

        int j = 0; //j index number of the result!
        for (int i= 0; i< array.length; i++) {
            if (i==index){
                continue;// eger yazilacak element indexi verilen elemente esitse, skip yap, continue diyoruz.
            }
            result[j++] = array[i];
        }
        return result;
    }


    //merge the given 2 arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2) {

        double[] result = {};
        for (double each : arr1) {
            result = addElement(result, each);//burada arr1 e elementleri ekliyoruz.
        }

        for (double each : arr2) {
            result = addElement(result, each);
        }

        return result;
    }


    //merge the given 2 arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2) {

        char[] result = {};
        for (char each : arr1) {
            result = addElement(result, each);//burada arr1 e elementleri ekliyoruz.
        }

        for (char each : arr2) {
            result = addElement(result, each);
        }

        return result;
    }


    //merge the given 2 arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2) {

        String[] result = {};
        for (String each : arr1) {
            result = addElement(result, each);//burada arr1 e elementleri ekliyoruz.
        }

        for (String each : arr2) {
            result = addElement(result, each);
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static double[] reverse(double[] array){
        double[] result = new double[array.length]; // yeni bir array olusturduk ,reverse ederek icini dolduracagiz

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) { //burada i arrayin index numberi, j de resultun index numberi
            result[j] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static char[] reverse(char[] array){
        char[] result = new char[array.length]; // yeni bir array olusturduk ,reverse ederek icini dolduracagiz

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) { //burada i arrayin index numberi, j de resultun index numberi
            result[j] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static String[] reverse(String[] array){
        String[] result = new String[array.length]; // yeni bir array olusturduk ,reverse ederek icini dolduracagiz

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) { //burada i arrayin index numberi, j de resultun index numberi
            result[j] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static int[] reverse(int[] array){
        int[] result = new int[array.length]; // yeni bir array olusturduk ,reverse ederek icini dolduracagiz

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) { //burada i arrayin index numberi, j de resultun index numberi
            result[j] = array[i];
        }

        return result;
    }

    //replace the elements of the array at given index with the new element
    public static int[] replaceSpecificElement(int[] array, int index, int newElement){

        if (index<0 || index> array.length-1){

            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new element
    public static double[] replaceSpecificElement(double[] array, int index, double newElement){

        if (index<0 || index> array.length-1){

            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new element
    public static char[] replaceSpecificElement(char[] array, int index, char newElement){

        if (index<0 || index> array.length-1){

            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new element
    public static String[] replaceSpecificElement(String[] array, int index, String newElement){

        if (index<0 || index> array.length-1){

            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }


    //replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }


    //replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }


    //replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(oldValue)){
                array[i] = newValue;
            }
        }
        return array;
    }

    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};
        for (int each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};
        for (double each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};
        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};
        for (String each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }








}
