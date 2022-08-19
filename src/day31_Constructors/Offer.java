package day31_Constructors;

public class Offer {
    //ilk attributes leri yaziyoruz
    public String location , CompanyName , jobTitle;
    public double salary;
    public boolean hasBenefit;
    public boolean hasPTO;
    public boolean isWFH;
    public boolean isFullTime;


    //sonra da toString method , right click generate toString
    @Override
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", CompanyName='" + CompanyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }

    //sonra setInfo() create yapiyoruz,

    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit,
                        boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        CompanyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;





    }
}
