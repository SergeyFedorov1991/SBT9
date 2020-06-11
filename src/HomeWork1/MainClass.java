package HomeWork1;

public class MainClass {
    public static void main(String[] args) {
        Person sergey = new Person(true, "Sergey");
        Person andrey = new Person(true, "Andrey");
        Person alexandra = new Person(false, "Alexandra");
        Person mary = new Person(false, "Mary");

        System.out.println("Изначально имеем 4 персоны:");
        System.out.println(sergey.info());
        System.out.println(andrey.info());
        System.out.println(alexandra.info());
        System.out.println(mary.info());

        System.out.println("\nПытаемся поженить м/ж");
        sergey.marry(alexandra);
        System.out.println(sergey.info());
        System.out.println(alexandra.info());

        System.out.println("\nПытаемся поженить женатого на другой женщине");
        sergey.marry(mary);
        System.out.println(sergey.info());
        System.out.println(mary.info());
        System.out.println(alexandra.info());

        System.out.println("\nДля начала разведем всех для наглядности");
        sergey.divorce();
        andrey.divorce();
        alexandra.divorce();
        mary.divorce();

        System.out.println("\nПытаемся поженить людей одного пола ");
        sergey.marry(andrey);
        alexandra.marry(mary);
        System.out.println(sergey.info());
        System.out.println(andrey.info());
        System.out.println(alexandra.info());
        System.out.println(mary.info());


    }
}
