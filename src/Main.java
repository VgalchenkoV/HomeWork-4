public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte age = 18;
        byte ageSmail = 17;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        }
        if (ageSmail < 18){
            System.out.println("Если возраст человека равен " + ageSmail + " то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        byte temperature = 4;
        byte warm = 6;
        if (temperature < 5){
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        }
        if (warm > 5) {
            System.out.println("На улице " + warm + " градусов, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte speed = 61;
        byte allowedSpeed = 59;
        if (speed > 60){
            System.out.println("Если скорость " + speed + " то, придется заплатить штраф");
        }
        if (allowedSpeed < 60){
            System.out.println("Если скорость " + allowedSpeed + " то, можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 30;
        if (age >= 2 && age <= 6){
            System.out.println("Если возраст человека равен " + age + " то, ему нужно ходить в детский садик");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то, ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то, ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " то, ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 20;
        if (age < 5){
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе");
        }else if (age < 5 && age < 14){
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }else if (age > 14){
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int CapacityOfOneCar = 102;
        int seating = 60;
        int standingPlaces = CapacityOfOneCar - seating;

        int seatsUsed = 21;
        int otherUsed = 14;
        if (seating < otherUsed){
            System.out.println("Есть ещё " + (seating - seatsUsed) + " сидячих мест");
        }else {
            System.out.println("Сидячих мест нет");
        }
        if (otherUsed < standingPlaces){
            System.out.println("Есть ещё " + (standingPlaces - otherUsed) + " сидячих мест");
        }else {
            System.out.println("Стоячих мест нет");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= 3) {
            System.out.println("Самое большое число " + one);
        } else {
            System.out.println(one + " Не самое большое число");
        }
        if (two >= 3) {
            System.out.println("Самое большое число " + two);
        } else {
            System.out.println(two + " Не самое большое число");
        }
        if (three >= 3) {
            System.out.println("Самое большое число " + three);
        } else {
            System.out.println(three + " Не самое большое число");
        }
    }
}