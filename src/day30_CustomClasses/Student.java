package day30_CustomClasses;

public class Student {

    // ilk once attributes leri yaziypruz

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;


    //sonra setInfo declare yapiyoruz. ama bu sefer 'this' keyword ile yazacagiz

    public void setInfo(String name,char gender,int age,int ID,char grade){
        this.name = name; //burada this i yazmamizin sebebi su yukardaki name i falan point yapmak icin
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade; //bunun kisa yolu saga tikla generate den Consructor u sec, ama oradaki
                            // return type i void ile sonrasini da setInfo olarak degistir

    }


    //sonra toStringe generate yapiyoruz.

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name + " is coding");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }




}
