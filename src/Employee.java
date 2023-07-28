public class Employee {
    private String name;
    private String surname;
    private String address;

    public Employee(String newEmployeeName,String newEmployeeSurname, String newEmployeeAddress) {
        this.name=newEmployeeName;
        this.surname=newEmployeeSurname;
        this.address=newEmployeeAddress;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
public String getEmployeeDetails(){
return "\nfullName: "+name+" "+surname+"\nAddress: "+address;
}
}
