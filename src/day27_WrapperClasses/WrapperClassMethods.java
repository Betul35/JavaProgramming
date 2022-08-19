package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123"; // asagida integer a cevirecek ve calculations larda kullanabilecegiz
        int num = Integer.parseInt(str); //primitive is being assigned by other primitive, burada bir wrapper class yok

        System.out.println(num+1); //124
        System.out.println(str +1); //1231

        System.out.println("---------------------");

        String str2 = "10.5";
        double num2 = Double.parseDouble(str2); //burada double yani bir primitive, numaraya ceviriliyor
        System.out.println(num2+1); //11.5

        System.out.println("---------------------");
        
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;

        System.out.println("longMax = " + longMax);
        System.out.println("longMin = " + longMin);

        System.out.println("---------------------");

        String s1 = "True";
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);

        System.out.println("--------------------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2); //Integer it returns me integer wrapper class
        int y = Integer.valueOf(s2); //Integer

        System.out.println(x);
        System.out.println(y);
        
        //parse method: converts String to primitive
        //valueOf method: converts String to wrapper class

        System.out.println("--------------------------------------------------");
        
        //isDigit()
        char ch1 = 0;
        
        boolean r2 = Character.isDigit(ch1); //true
        
        //isLetter()
        boolean r3 = Character.isLetter(ch1); //false
        
        boolean r4 = !Character.isLetterOrDigit(ch1); // bu da digit ve letter degilse, yani special character ise true
        
        //upperCase
        boolean r5 = Character.isUpperCase(ch1);
        
        //lowerCase()
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println("------------------------------------------------------");
        
        String s = "agh4589hkroH489th3"; // burada digitleri bulup birbiriyle toplayacagiz
        
        int sum = 0;

        for (char each : s.toCharArray()) {
            
            if (Character.isDigit(each)){
                sum += Integer.parseInt(""+ each);
            }
            
        }
        System.out.println("sum = " + sum);
        
        




    }

}
