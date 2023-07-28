import java.util.Random;

public class Badge {
    private static int totalNumberofEmployyes = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberofEmployyes++;
    }

    private String genRandomString(int limt) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < limt; i++) {
            int randonNumber = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(randonNumber);
            sb.append(randomChar);
        }
        return sb.toString().toUpperCase();
    }

    private String generateBadgeIdCode() {

        return genRandomString(3) + employee.getName() + employee.getSurname() + genRandomString(3);
    }

    public void showBadgeDetails() {
        System.out.println("the total number of employee tracked by the badges is: " + totalNumberofEmployyes);
        System.out.println("employee info: " + employee.getEmployeeDetails());
        System.out.println("the badge id code is: " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }

}
