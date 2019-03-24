// methods for chengxishiDesigner
public class chengxishiDesigner 
{
    private String lastName;
    private String firstName;
    private int age;
    private double salary;
    private char status;
    private String favoriteTv;
    private int season;

    public chengxishiDesigner(String passedlastName, String passedfirstName, int passedage, double passedsalary, char passedstatus, String passedfavoriteTv, int passedseason)
	{
        lastName = passedlastName;
        firstName = passedfirstName;
        age = passedage;
        salary = passedsalary;
        status = passedstatus;
        favoriteTv = passedfavoriteTv;
        season = passedseason;

    }

    public String getLastName() 
	{
        return lastName;
    }

    public String getFirstName() 
	{
        return firstName;
    }

    public int getAge() 
	{
        return age;
    }

    public double getSalary() 
	{
        return salary;
    }

    public char getStatus() 
	{
        return status;
    }

    public String getFavoriteTv() 
	{
        return favoriteTv;
    }

    public int getSeason() 
	{
        return season;
    }

    public void display()
	{
        System.out.println(toString());
    }

    public String toString() 
	{
        return "chengxishiDesigner{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", status=" + status +
                ", favoriteTv='" + favoriteTv + '\'' +
                ", season=" + season +
                '}';
    }
}
