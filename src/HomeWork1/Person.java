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

        //если пол не равен пытаемся поженить
        if(this.man != person.man) {

            //Если у одного из них есть другой супруг - оформляем развод сначала на супруга(пока есть на нее ссылка)
            // затем на себя
            if(this.spouseOn != null) {
                this.spouseOn.divorce();
                this.divorce();
            }
            if(person.spouseOn != null) {
                person.spouseOn.divorce();
                person.divorce();
            }

            //женим
            marryed = true;
            this.spouseOn = person;
            person.spouseOn = this;
        }

        return marryed;
    }


    /**
     устанавливает spouse = null, если супруг не является нулевым
     @return true - если статус человека был изменен
     */

    public boolean divorce(){
        if(this.spouseOn != null) {
            this.spouseOn = null;
            return true;
        } else
            return false;
    }

    public String info(){
        String sexMan = "Man";
        String sexWoman = "Woman";

        return "Name = '" + name + '\'' +
                ", sex = " + ((man) ? sexMan : sexWoman) +
                ", spouse on = {" + spouseOn + "}";
    }

}


