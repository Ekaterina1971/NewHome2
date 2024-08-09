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

        int agePerson = 3;
        if (agePerson > 2 && agePerson < 6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад.");
        }
        int agePerson1 = 8;
        if (agePerson1 > 7 && agePerson1 < 17) {
            System.out.println("Если возраст человека равен " + agePerson1 + ", то ему нужно ходить в школу.");
        }
        int agePerson2 = 20;
        if (agePerson2 >= 18 && agePerson2 <= 24) {
            System.out.println("Если возраст человека равен " + agePerson2 + ", то его место в университете.");
        }
        int agePerson3 = 25;
        if (agePerson3 > 24) {
            System.out.println("Если возраст человека равен " + agePerson3 + ", то ему пора ходить на работу.");
        }

        int ageChaild = 4;
        if (ageChaild < 5) {
            System.out.println("Если возрат ребенка равен " + ageChaild + ", то ему нельзя кататься на атракицоне.");
        }
        int ageChaild1 = 7;
        if (ageChaild1 > 5 && ageChaild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChaild1 + ", то он может кататься на атракционе в сопровождении взрослого.");
        }
        int ageChaild2 = 15;
        if (ageChaild2 > 14) {
            System.out.println("Если возраст ребенка равен " + ageChaild2 + ", то можно кататься на атракционе без сопровождения взрослого.");
        }

        int standingPlace = 38;
        int sittingPlace = 55;
        int allPlace = standingPlace + sittingPlace;
        if (allPlace < 102) {
            System.out.println(" В вагоне есть свободные места");
        }
        if (standingPlace < 42) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (sittingPlace < 60) {
            System.out.println("В вагоне есть сидячие места");
        }
    }
}