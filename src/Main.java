import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        {
            String firstName = "Ivanov";
            String middleName = "Ivan";
            String lastName = "Ivanovich";
            String fullName = "Ivanov Ivan Ivanovich";
            System.out.println("Ф. И. О. сотрудника — " + fullName);
        }
        //Задача 2
        {
            String fullName = "Ivanov Ivan Ivanovich";
            System.out.println("Ф. И. О. сотрудника — " + fullName.toUpperCase());
        }
        //Задача 3
        {
            String fullName = "Иванов Семён Семёнович";
            fullName = fullName.replace("ё", "е");
            System.out.println("Ф. И. О. сотрудника — " + fullName);
        }
    }
}