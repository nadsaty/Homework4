public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
        public static void task1 () {
            System.out.println("Задача 1 \n");
            int age = 19;
            System.out.println("Если возраст человека равен " + age + ", то он ");
            if (age >= 18) {
                System.out.println("совершеннолетний \n");
            } else {
                System.out.println("не достиг совершеннолетия, нужно немного подождать \n");
            }
        }

        public static void task2 () {
            System.out.println("Задача 2 \n");
            int temperature = 7;
            System.out.println("На улице " + temperature + " градусов, ");
            if (temperature < 5) {
                System.out.println("нужно надеть шапку \n");
            } else if (temperature >= 5) {
                System.out.println("можно идти без шапки \n");
            }
        }


    }
