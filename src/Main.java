public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он достиг совершеннолетия.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }

        int gradus = 10;
        if (gradus > 5) {
            System.out.println(" На улице " + gradus + " градусов, сегодня тепло,можно идти без шапки.");
        } else {
            System.out.println(" На улице холодно, нужно надеть шапку.");
        }

        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", придется заплатить штраф.");
        } else {
            System.out.println("Можно ездить спокойно.");
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
            System.out.println("Если возраст ребенка равен " + ageChaild + ", то ему нельзя кататься на атракицоне.");
        }
        int ageChaild1 = 7;
        if (ageChaild1 > 5 && ageChaild1 < 14) {
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
        } else {
            System.out.print("Вагон забит. Мест нет");
        }
        if (standingPlace < 42) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (sittingPlace < 60) {
            System.out.println("В вагоне есть сидячие места");
        }

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(" Число one является большим.");
        } else if (two > one && two > three) {
            System.out.println(" Число two является большим.");
        } else if (three > one && three > two) {
            System.out.println(" Число three является большим.");
        }
    }
}