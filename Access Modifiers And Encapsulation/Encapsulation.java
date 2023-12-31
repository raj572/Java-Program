public class Encapsulation{
    public static void main(String[] args) {
        student student1 = new student();
        student1.setName("Essya kabeir");
        student1.setAddress(" Tunisia ");
        student1.setRoll_no(20);

        System.out.println(student1.getAddress());
        System.out.println(student1.getName());
        System.out.println(student1.getRoll_no());
    }
}

class student{
    private String name;
    private String address;
    private int roll_no;


    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setRoll_no(int roll_no){
        this.roll_no = roll_no;
    }

    /*creating getter method to access private attributes */

    public String getName(){
        return name;
    }

        public String getAddress(){
        return address;
    }
        public int getRoll_no(){
        return roll_no;
    }

    //creating setter method for accessing and writing value in private attributes


}