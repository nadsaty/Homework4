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


        public static void task5 () {
            System.out.println("Задача 5 \n");
            int howOldKid = 16;
            System.out.println("Если возраст равен " + howOldKid + ", то ему ");
            if (howOldKid < 5) {
                System.out.println("нельзя кататься на аттракционе \n");
            } else if (howOldKid >= 5 && howOldKid < 14) {
                System.out.println("можно кататься на аттракционе в сопровождении взрослого \n");
            } else if (howOldKid >= 14) {
                System.out.println("можно кататься на аттракционе без сопровождения взрослого \n");
            }
        }


        public static void task6 () {
            System.out.println("Задача 6 \n");
            int totalSeats = 102;
            int sitting = 60;
            int howManyPeople = 66;
            System.out.println("В вагоне ");
            if (howManyPeople < sitting) {
                System.out.println("есть сидячие места \n");
            } else if (howManyPeople > sitting && howManyPeople < totalSeats) {
                System.out.println("есть только стоячие места \n");
            } else if (howManyPeople >= totalSeats) {
                System.out.println("нет мест \n");
            }
        }


        public static void task7 () {
            System.out.println("Задача 7 \n");
            int one = 55;
            int two = 41;
            int three = 23;
            System.out.println("Из трех чисел большее - ");
            if (one > two && one > three) {
                System.out.println(one);
            } else if (two > one && two > three) {
                System.out.println(two);
            } else if (three > one && three > two) {
                System.out.println(three);
            }
        }


    }
