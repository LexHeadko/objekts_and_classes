public class Main {
    public static void main(String[] args) {
        Author levTolstoi = new Author("Лев","Толстой");
        Author fedorDostoevskii = new Author("Фёдор","Достоевский");
        Book warAndPeace = new Book(levTolstoi, "Война и мир", 1869);
        Book crimeAndPunishment = new Book(fedorDostoevskii, "Преступление и наказание", 1866);
        System.out.println(warAndPeace);
        System.out.println(crimeAndPunishment);
        printSeparator();
        Person person = new Person("Александр", 17);
        System.out.println(person);
        if (person.isAdult()) {
            System.out.println("В бар ещё рано!");
        } else {
            System.out.println("Иди в бар");
        }
        printSeparator();
        person.editAge(5);
        person.increaseAge(1);
        System.out.println(person);
    }

    public static void printSeparator() {
        System.out.println("===============");
    }
}