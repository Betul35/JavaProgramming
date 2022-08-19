package day21_ForEachLoop;

public class Items {

    public static void main(String[] args) {

    String[] items = {"Shoes","Jacket","Gloves","Airpods","Ipad","Iphone 12 case"};
    //                  0,      1,        2,        3,      4,          5
    double[] prices = {99.99,  15.0, 34.6 , 789.70 , 12 , 56 };
     //                  0,      1,   2,      3,      4,   5
    int[] itemID = {5432,5674,7777,80785,34235,65326,};
    //               0,   1,   2,    3,     4,   5    farkettiysek hepsinin index numaralari ayni!


        // for each loop kullanamayiz, zira bir for each loop ta anca 1 array run yapabiliriz,
        // burada 3 unu ayni anda run yapmak icin for loop kullaniyoruz.

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int id = itemID[i];

            System.out.println(item+ " - " +id+" - "+ "£"+price);
        }






        /*
        itemName- itemId- price olarak yaz
         */
    }
}
