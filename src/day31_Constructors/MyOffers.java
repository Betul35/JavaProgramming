package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

      Offer offer1 = new Offer();
       // System.out.println(offer1); //bunu yazdirinca null olarak verecek, cunku set yapmamiz gerekiyor once, cunku default values bunlar
        offer1.setInfo("VA", "Amazon", "SDET", 11000,true,true,true,true);
        System.out.println(offer1);

        Offer offer2 = new Offer();
        offer2.setInfo("CA","Sony","QA",12000,true,false,true,false);
        System.out.println(offer2);

        Offer offer3 = new Offer();
        offer3.setInfo("London","Apple","Developer", 90000,false, true, true,false);
        System.out.println(offer3);

        Offer offer4 = new Offer();
        offer4.setInfo("VA","CapitalOne","SM", 75000,false,true,true, true);
        System.out.println(offer4);

        Offer offer5 = new Offer();
        offer5.setInfo("TX","Dell","QA",85000,false,true,true,true);
        System.out.println(offer5);

        //simdi how many offers are full time onu bulacagiz, array ile

        Offer[] myOffers = {offer1,offer2,offer3,offer4,offer5}; //offerlari arrayde topladik

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList( myOffers ) );
        fullTimeOffers.removeIf( p -> !p.isFullTime ); // remove if the offer is NOT full time diyoruz burada
        System.out.println(fullTimeOffers.size()); //how many full time offer var onu buluyoruz size ile


        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList( myOffers ) );
        localOffers.removeIf( p -> !(p.location.equals("VA") || p.location.equals("CA")) ); //local offer VA, VA olmayanlari cikartacak
        System.out.println(localOffers.size() );

        //sonra da bu offer lar nelermis onlari ogrenelim.

        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.CompanyName + " : " + localOffer.salary);
        }









    }

}
