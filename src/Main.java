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

        int speed = 70;
        int speed1 = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", придется заплатить штраф.");
        }
        if (speed1 <= 60) {
            System.out.println("Если скорость " + speed1 + ", можно ездить спокойно.");
        }
    }
}