package Online_Code_Samples.Week1;

public class Emmanuel {
    private String firstName;
    private String lastName;
    private String fullName;
    private int age;
    private String email;
    private static int count = 0;

    public Emmanuel(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.fullName = firstName + " " + lastName;
        count++;
    }

    public Emmanuel(String firstName, String lastName, String email){
        this(firstName, lastName, 35, email);
    }

    public Emmanuel(String firstName, String lastName){
        this(firstName, lastName, "vicky@gmail.com");
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Emmanuel firstEmmanuel = new Emmanuel("First", "Last", "emma@mail.com");
        Emmanuel firstAEmmanuel = new Emmanuel("Firstname", "Lastname");


        System.out.println(firstEmmanuel.getFirstName());
        System.out.println(firstEmmanuel.getAge());

        firstEmmanuel.setAge(65);
        System.out.println(firstEmmanuel.getAge());

        System.out.println(firstEmmanuel.getFullName());

        System.out.println(Emmanuel.count);

        System.out.println(getCount());

    }
}
