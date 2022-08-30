import java.util.Scanner;

public class Biography {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        System.out.println("Представьтесь пожалуйста!(Имя)");
        String name = myScanner.nextLine();

        System.out.println("Укажите пожалуйста свою фамилию, и отчество:");
        String surname = myScanner.nextLine();

        System.out.println("Сколько вам лет?");
        String age = myScanner.nextLine();

        System.out.println("В каком городе вы родились?");
        String city = myScanner.nextLine();

        System.out.println("По какому адрессу вы проживаете?");
        String address = myScanner.nextLine();

        System.out.println("Ваш сотовый номер телефона?");
        String phoneNumber = myScanner.nextLine();

        System.out.println("Ваш домашний номер телефона");
        String homeNumber = myScanner.nextLine();

        System.out.println("Какое у вас образование?");
        String education = myScanner.nextLine();

        System.out.println("Какая у вас профессия?");
        String work = myScanner.nextLine();

        System.out.println("Как давно вы работаете?");
        String time = myScanner.nextLine();

        System.out.println("Имя пользователя: \n" + name + "\n" +
                "Фамилия, и Отчество пользователя: \n" + surname + "\n" +
                "Возраст пользователя: \n" + age + "\n" +
                "Город в котором родился пользователь: \n" + city + "\n" +
                "Адресс проживания пользователя: \n" + address + "\n" +
                "Сотовый номер телефона пользователя: \n" + phoneNumber + "\n" +
                "Домашний номер телефона пользователя: \n" + homeNumber + "\n" +
                "Образование пользователя: \n" + education + "\n" +
                "Профессия пользователя: \n " + work + "\n" +
                "Стаж работы пользователя: \n" + time + "\n");


    }

}
