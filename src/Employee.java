/**
 * @author Christian Aguirre
 */
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee(){
        name = "";
        department = "";
        position = "";
        idNumber = 0;

    }


    public Employee(String name, int idNumber, String department, String position){

        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
}
