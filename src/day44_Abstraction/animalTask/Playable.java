package day44_Abstraction.animalTask;

public interface Playable {

    static boolean isFriendly = true;

    public abstract void play(); //public ve abstract i burada vermek necessary degil, default olarak veriyor zaten

}

/*
    Interface te method lar by default public oluyor,
    variable lar ise static


 */
