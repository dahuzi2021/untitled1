public class student extends User{
    private String major;
    private int stuGrade;
    public student(){
        super();
    }
    public void setMajor(String major){
        this.major=major;
    }
    public String getMajor(){
        return this.major;
    }
    public String getAddress(){
        return this.address+"xixixi";
    }

}
