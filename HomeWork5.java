/**
 * Java home work for Lesson 5
 * author Denisov Maxim
 * date 25/07/2018
 */
public class HomeWork5 {
    /*
    * Class for employees
    * */
    private static class Person {
        private final String fio;
        private final String post;
        private final String mail;
        private final String telephone;
        private final int salary;
        private final int age;

        Person(String fio, String post, String mail, String telephone, int salary, int age) {
            this.fio = fio;
            this.post = post;
            this.mail = mail;
            this.telephone = telephone;
            this.salary = salary;
            this.age = age;
        }

        //output employee
        void getPersonInfo() {
            System.out.println("FIO - > " + this.fio + "\n" +
                    "FIO - > " + this.fio + "\n" +
                    "post - > " + this.post + "\n" +
                    "mail - > " + this.mail + "\n" +
                    "telephone - > " + this.telephone + "\n" +
                    "salary - > " + this.salary + "\n" +
                    "age - > " + this.age + "\n");
        }
    }

    public static void main(String[] args) {
        //task 1,2
        Person p = new Person("Denisov Maxim Vladimirovich", "programmer", "maxden33@gmail.com", "8-988-959-85-08", 20000, 28);
        //task 3
        p.getPersonInfo();
        //task 4
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person("Petrov Petr", "Engineer", "ivivan2@mailbox.com", "892312312", 30000, 40); // потом для каждой ячейки массива задаем объект
        persArray[2] = new Person("Sidorov Maxim", "Engineer", "ivivan3@mailbox.com", "892312312", 30000, 50); // потом для каждой ячейки массива задаем объект
        persArray[3] = new Person("Kozlov Ilia", "Engineer", "ivivan4@mailbox.com", "892312312", 30000, 60); // потом для каждой ячейки массива задаем объект
        persArray[4] = new Person("Kordonov Slava", "Engineer", "ivivan5@mailbox.com", "892312312", 30000, 70); // потом для каждой ячейки массива задаем объект
        //task5
        for (Person curPerson : persArray) {
            if (curPerson.age > 40) {
                curPerson.getPersonInfo();
            }
        }
    }
}