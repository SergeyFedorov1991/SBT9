package HomeWork1;


public class Person {
    private final boolean man;
    private final String name;
    private Person spouseOn;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    /**
     * Этот метод проверяет пол людей. Если пол не равен-пытается жениться.
     * * Если у одного из них есть другой супруг-оформите развод(устанавливает супруг = null для мужа и жены.
     * Пример: если у обоих лиц есть супруги - то при разводе 4 супруга будут равны нулю) ,
     * а затем выполняется функция marry ().
     * * @param person-новый муж/жена для этого человека.
     * * @return-возвращает true, если этот человек имеет другой пол, чем переданный человек,
     * и они не являются мужем и женой, ложно в противном случае.
     */

    public boolean marry(Person person) {
        boolean marryed = false;

        if(this.man != person.man) {
            marryed = true;
            this.spouseOn = person;
        }




        return marryed;
    }


    /**
     устанавливает spouse = null, если супруг не является нулевым
     @return true - если статус человека был изменен
     */

    public boolean divorce(){
        if(!(this.spouseOn == null)) {
            this.spouseOn = null;
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "man=" + man +
                ", name='" + name + '\'' +
                ", spouse=" + spouseOn +
                '}';
    }
}


