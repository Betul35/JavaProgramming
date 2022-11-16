package day45_Interface.shape;

public interface Volume {

    boolean hasVolume= true;

    double volume(); //burada volume ihtiyaci olan class lara bunu vermek icin interface yapiyoruz
                    // ama body vermiyip by default abstract yapiyoruz
                    // classlar kendi body sini kendileri olusturacaklar
}
