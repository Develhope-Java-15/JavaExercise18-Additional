
public class Manager extends Employee {

    public Manager(String newEmployeeName,String newEmployeeSurname, String newEmployeeAddress) {

        super(newEmployeeName,newEmployeeSurname,newEmployeeAddress);

        }

    public void goToWork(){

        System.out.println("Go to work!");
    }
}


