public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work 10");

        System.out.println();
        System.out.println("Задание-1");
        String firstName = "Ivan";
        String middleName = " Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println();
        System.out.println("Задание-2");
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName1);
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

    }
}