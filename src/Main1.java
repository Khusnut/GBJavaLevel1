public class Main1
{
    public static void main(String[] args)
    {
        // 4. Создать массив из 5 сотрудников.
        Employee[] employees = {
                new Employee(
                        "Василий Петров Иванович",
                        "Продавец",
                        "test@mail.ru",
                        "+7-999-999-99-99",
                        100000,
                        41),
                new Employee(
                        "Tulkin Evgeny Borisovich",
                        "Administrator",
                        "sampleTwo@mail.ru",
                        "+7-999-888-77-66",
                        80000,
                        25),
                new Employee(
                        "Lubotkina Alexandra Viktorovna",
                        "Secretary",
                        "sampleThree@mail.ru",
                        "+7-989-111-22-33",
                        50000,
                        20),
                new Employee(
                        "Bulatova Anastasia Krasotkina",
                        "Programmer",
                        "sampleFour@mail.ru",
                        "+7-999-222-33-44",
                        150000,
                        20),
                new Employee(
                        "Ivanov Evgeniy Evgenievich",
                        "IT-administrator",
                        "sampleFour@mail.ru",
                        "+7-444-222-33-00",
                        130000,
                        20)
        };

        // 5. С помощью цикла
        // вывести информацию
        // только о сотрудниках старше 40 лет.
        int minAge = 40;
        for (Employee employee : employees)
        {
            if (employee.age > minAge)
            {
                employee.printInfo();
                System.out.println();
            }
        }
    }
}