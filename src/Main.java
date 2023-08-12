public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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


        public static void task3 () {
            System.out.println("Задача 3 \n");
            int speed = 40;
            System.out.println("Если скорость " + speed + " км/час, то ");
            if (speed > 60) {
                System.out.println("придется заплатить штраф \n");
            } else if (speed <= 60) {
                System.out.println("можно ездить спокойно \n");
        }
    }


        public static void task4 () {
            System.out.println("Задача 4 \n");
            int howOld = 55;
            System.out.println("Если возраст человека равен " + howOld + ", то ");
            if ( howOld < 2) {
                System.out.println("ему пора спать \n");
            } else if (howOld >= 2 && howOld <= 6) {
                System.out.println("ему нужно ходить в детский сад \n");
            } else if (howOld >= 7 && howOld < 18) {
                System.out.println("ему нужно ходить в школу \n");
            } else if (howOld > 18 && howOld < 24) {
                System.out.println("ему нужно ходить в университет \n");
            } else if (howOld >= 24 && howOld < 60) {
                System.out.println("ему пора ходить на работу \n");
            } else if (howOld > 60) {
                System.out.println("он может отдохнуть \n");
            }
        }


    }
