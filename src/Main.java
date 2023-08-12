public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
                System.out.println("нужно надеть шапку");
            } else if (temperature >= 5) {
                System.out.println("можно идти без шапки \n");
            }
        }


        public static void task3 () {
            System.out.println("Задача 3 \n");
            int speed = 40;
            System.out.println("Если скорость " + speed + " км/час, то ");
            if (speed > 60) {
                System.out.println("придется заплатить штраф");
            } else if (speed <= 60) {
                System.out.println("можно ездить спокойно");
        }
    }


    }
