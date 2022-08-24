public class Main {
    public static void main(String[] args) {
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName+middleName+lastName;
        System.out.println("ФИО сотрудника - "+fullName);
        fullName = firstName.toUpperCase()+middleName.toUpperCase()+lastName.toUpperCase();
        System.out.println("Данные ФИО сотрудника\n" +
                "для заполнения отчета — "+fullName);
        fullName = firstName+';'+middleName+';'+lastName+';';
        fullName = fullName.replace(" ","");
        System.out.println("Данные ФИО сотрудника\n" +
                "для административного отдела — "+fullName);
        fullName = "Иванов Семён Семёнович";
        String fullNameCope = fullName.replace("ё","е");
        System.out.println("Данные ФИО сотрудника - "+fullNameCope);

    }
}
