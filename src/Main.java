public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он достиг совершеннолетия.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }

        int gradus = 10;
        if (gradus > 5) {
            System.out.println(" На улице " + gradus + " градусов, сегодня тепло,можно идти без шапки.");
        }
        int gradus1 = 4;
        if (gradus1 < 5) {
            System.out.println(" На улице " + gradus1 + " градусов, на улице холодно, нужно надеть шапку.");
        }


    }
}