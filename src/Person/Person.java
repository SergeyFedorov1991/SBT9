package Person;

public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person) {
        boolean marred = false;

        //если пол не равен пытаемся поженить
        if(this.man != person.man) {

            //Если у одного из них есть другой супруг - оформляем развод сначала на супруга(пока есть на нее ссылка)
            // затем на себя
            if(this.spouse != null) {
                this.spouse.divorce();
                this.divorce();
            }
            if(person.spouse != null) {
                person.spouse.divorce();
                person.divorce();
            }

            //женим
            marred = true;
            this.spouse = person;
            person.spouse = this;
        }

        return marred;
    }

    public boolean divorce(){
        boolean isDivorce = false;
        if(this.spouse != null) {
            this.spouse = null;
            isDivorce = true;
        }
        return isDivorce;
    }

    public String info(){
        String sexMan = "Man";
        String sexWoman = "Woman";

        return "Name = '" + name + '\'' +
                ", sex = " + ((man) ? sexMan : sexWoman) +
                ", spouse on = {" + spouse + "}";
    }

}


