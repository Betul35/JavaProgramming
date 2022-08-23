package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple","Iphone12",7.6,10000,"Black");

        Samsung samsung = new Samsung("samsung", "brick",6.7,900,"black");

        System.out.println(iphone);
        System.out.println(samsung);

        iphone.call(911);
        iphone.text(6847935);
        iphone.faceTime(414324);
        iphone.faceTime("dfhwje@dbvd.com");

        samsung.call(458632);
        samsung.freeze();
        samsung.text(486903464);

    }

}
