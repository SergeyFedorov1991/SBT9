package HomeWork1;

public class Persons {
    public static void main(String[] args) {
        Person sergey = new Person(true, "Sergey");
        Person andrey = new Person(true, "Andrey");
        Person alexandra = new Person(false, "Alexandra");
        Person mary = new Person(false, "Mary");

        System.out.println("Изначально имеем 4 персоны:");
        System.out.println(sergey.toString());
        System.out.println(andrey.toString());
        System.out.println(alexandra.toString());
        System.out.println(mary.toString());

        System.out.println("Пытаемся поженить м/ж");
        sergey.marry(alexandra);
        System.out.println(sergey.toString());
        System.out.println(alexandra.toString());

    }
}
