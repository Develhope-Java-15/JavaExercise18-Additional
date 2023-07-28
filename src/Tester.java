public class Tester {
    public static void main(String[] args) {
        Employee alex = new Employee("Alessandro", "Venuti", "Via roma 71");
        Employee mario = new Employee("Mario", "Rossi", "Piazza veneto 23");

        Badge badgeAlex = new Badge(alex);
        Badge badgeMario = new Badge(mario);

        badgeAlex.showBadgeDetails();

        badgeMario.showBadgeDetails();

        Manager lorenzo = new Manager("Lorenzo", "Catania" , "via misasi 8");

        Badge badgeLorenzo = new Badge(lorenzo);

        badgeLorenzo.showBadgeDetails();
    }
}