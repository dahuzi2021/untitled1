public class User {
    String address;
    int stu;
    public User(){
        this.stu=123456;
    }
    public void setStu(int stu){
        this.stu=stu;
    }
    public int getStu(){
        return this.stu;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }
}
