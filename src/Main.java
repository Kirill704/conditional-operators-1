//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он недостиг совершеннолетия, нужно немного подождать");
        }

        byte temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        byte speed = 90;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }

        byte ageAct = 18;
        if (ageAct >= 2 && ageAct <= 6) {
            System.out.println("Если возраст человека равен " + ageAct + ", то ему нужно ходить в детский сад");
        }
        if (ageAct >= 7 && ageAct <= 17) {
            System.out.println("Если возраст человека равен " + ageAct + ", то ему нужно ходить в школу");
        }
        if (ageAct >= 18 && ageAct <= 24) {
            System.out.println("Если возраст человека равен " + ageAct + ", то ему нужно ходить в университет");
        }
        if (ageAct > 24) {
            System.out.println("Если возраст человека равен " + ageAct + ", то ему нужно ходить на работу");
        }

        byte ageAttract = 15;
        if (ageAttract < 5) {
            System.out.println("Если возраст ребенка равен " + ageAttract + ", то ему нельзя кататься на аттракционе");
        } else {
            if (ageAttract >= 5 && ageAttract < 14) {
                System.out.println("Если возраст ребенка равен " + ageAttract + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + ageAttract + ", то ему можно кататься на аттракционе без сопровождения взрослого");
            }
        }

        byte sitPlacesSold = 50;
        byte stayPlacesSold = 30;
        int sitPlacesFree = 60 - sitPlacesSold;
        int stayPlacesFree = 102 - 60 - stayPlacesSold;
        if (sitPlacesFree == 0 && stayPlacesFree == 0) {
            System.out.println("Вагон полон");
        } else {
            System.out.println("В вагоне свободно " + sitPlacesFree + " сидячих мест и " + stayPlacesFree + " стоячих мест");
        }

        int one = 100;
        int two = 200;
        int three = 330;
        if (one > two && one > three) {
            System.out.println("One большее и равно " + one);
        } else {
            if (two > one && two > three) {
                System.out.println("Two большее и равно " + two);
            } else {
                System.out.println("Three большее и равно " + three);
            }
        }
    }
}