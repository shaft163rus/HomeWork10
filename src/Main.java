public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        
    }

    private static void task3() {
        System.out.println();
        String firstName = "Сёмен";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName ;
        System.out.printf("ФИО сотрудника — %s", fullName.replace('ё', 'е'));
    }

    private static void task2() {
        System.out.println();
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName ;
        System.out.printf("ФИО сотрудника — %s", fullName.toUpperCase());

    }

    private static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName ;
        System.out.printf("ФИО сотрудника — %s", fullName);


    }


}