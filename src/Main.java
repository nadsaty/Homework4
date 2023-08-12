public class Main {
    public static void main(String[] args) {
        int age = 19;
        System.out.printf("Если возраст человека равен " + age + ", то он ");
        if (age >= 18) {
            System.out.printf("совершеннолетний");
        } else {
            System.out.printf("не достиг совершеннолетия, нужно немного подождать");
        }

    }
}