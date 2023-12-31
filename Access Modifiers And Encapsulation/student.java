class Lif{
    private String name;
    private int roll;
    private String email;
    protected String address;

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }

    //for accessing

    public String getName(){
        return name;
    }
      public int getRoll(){
        return roll;
    }

    public String getEmail(){
        return email;
    }
}

public class student {
    public static void main(String[] args) {
        Lif student1 = new Lif();
        student1.setName("Esya");
        student1.setRoll(211);
        student1.setEmail("essyakabair@gmail.com");
        student1.address = "Tunisia";

        System.out.println(student1.getName());
        System.out.println(student1.getRoll());
        System.out.println(student1.getEmail());
        System.out.println(student1.address);
        
    }
    
}
