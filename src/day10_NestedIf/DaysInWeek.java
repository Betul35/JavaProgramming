package day10_NestedIf;

public class DaysInWeek {

    public static void main(String[] args) {

        int n = 5;  //1~7 arasinda days in week 1== monday, 2==tuesday.....

       String days =  (n==1)? "Monday" : (n==2)? "Tuesday" : (n==3)? "Wednesday" : (n==4)? "Thursday" :
               (n==5)? "Friday" : (n==6)? "Saturday" : "Sunday" ;
        System.out.println(days);

        /*
        ayni zamanda parantezsiz de yazabiliriz, like:
        n==1? "Monday" : n==2? "Tuesday" : n==3? "Wednesday" : n==4? "Thursday" :
               n==5? "Friday" : n==6? "Saturday" : "Sunday" ;
         */








    }
}
