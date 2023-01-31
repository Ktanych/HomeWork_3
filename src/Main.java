public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte y = 10;
        System.out.println("Значение переменной 'a' с типом byte равно " + y);
        short b = -28;
        System.out.println("Значение переменной 'b' с типом short равно " + b);
        int r = 41789;
        System.out.println("Значение переменной 'r' с типом int равно " + r);
        long g = -928L;
        System.out.println("Значение переменной 'g' c типом long равно " + g);
        float s = 358.34f;
        System.out.println("Значение переменной 's' с типом float равно " + s);
        double x = -307.97531;
        System.out.println("Значение переменной 'x' с типом double равно " + x);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float j = 27.12f;
        System.out.println(j);
        long z = 987678965549L;
        System.out.println(z);
        double y = 2.786;
        System.out.println(y);
        short i = 569;
        System.out.println(i);
        short u = -159;
        System.out.println(u);
        int t = 27897;
        System.out.println(t);
        byte w = 67;
        System.out.println(w);

    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short sheetsPaper = 480;
        int perStudent = sheetsPaper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("Накаждого ученика рассчитано " + perStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottles = 16;
        byte minutes = 2;
        byte in20Minutes = 20;
        int producedinMinute = bottles / minutes;
        int producedin20Minute = in20Minutes * producedinMinute;
        System.out.println("За 20 минут машина произвела " + producedin20Minute + " штук бутылок");

        byte hoursperDay = 24;
        byte minutesperHour = 60;
        int producedperDay = hoursperDay * minutesperHour * producedinMinute;
        System.out.println("За сутки машина произвела " + producedperDay + " штук бутылок");

        int hoursin3Day = producedperDay * 3;
        System.out.println("За 3 дня машина произвела " + hoursin3Day + " штук бутылок");

        byte daysinMonth = 30;
        int producedinMonth = daysinMonth * producedperDay;
        System.out.println("За месяц машина произвела " + producedinMonth + " штук бутылок");

    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalcansPaint = 120;
        byte whitepaintfor1Class = 2;
        byte brownpaintfor1Class = 4;
        int numberofClasses = totalcansPaint / (whitepaintfor1Class + brownpaintfor1Class);
        int totalwhitePaint = numberofClasses * whitepaintfor1Class;
        int totalbrownPaint = totalcansPaint - totalwhitePaint;
        System.out.println("В школе, где " + numberofClasses + " классов, нужно " + totalwhitePaint + " банок белой краски и " + totalbrownPaint + " банок коричневой краски");

    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        int inoneBananaGr = 80;
        short ml100Milk = 2;
        int in100mlMilkGr = 105;
        byte quantityiceCream = 2;
        int inoneiceCreamGr = 100;
        byte eggsPieces = 4;
        int inoneEggGr = 70;
        float sportsBreakfastGr = (bananas * inoneBananaGr) + (ml100Milk * in100mlMilkGr) + (quantityiceCream * inoneiceCreamGr) + (eggsPieces * inoneEggGr);
        int grPerKg = 1000;
        float sportsBreakfastKg = sportsBreakfastGr / grPerKg;
        System.out.println("На рецепт спортзавтрака израсходовано " + sportsBreakfastGr + " граммов продуктов равнозначно " + sportsBreakfastKg + " килограмм");

    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte kg = 7;
        float oneGr = 0.250f;
        float twoGr = 0.500f;
        float day1gr = kg / oneGr;
        System.out.println("Для похудения на 7 кг при ежедневной мин. потере веса в 250 грамм потребуется " + day1gr + " дней");

        float day2gr = kg / twoGr;
        System.out.println("Для похудения на 7 кг при ежедневной мах. потере веса в 500 грамм потребуется " + day2gr + " дней");

        float averageValue = (day1gr + day2gr) / 2;
        System.out.println("Для похудения на 7 кг в среднем потребуется " + averageValue + " день ");

    }
    public static void task8 () {
        System.out.println("Задача 8");
        int mashaZpMonth = 67760;
        int denZpMonth = 83690;
        int krisZpMonth = 76230;
        int mashaZpYear = mashaZpMonth * 12;
        int denZpYear = denZpMonth * 12;
        int krisZpYear = krisZpMonth * 12;
        int mashaZpBoost = mashaZpMonth + (mashaZpMonth / 10);
        int denZpBoost = denZpMonth + (denZpMonth / 10);
        int krisZpBoost = krisZpMonth + (krisZpMonth / 10);
        int mashaYearBoost = mashaZpBoost * 12 - mashaZpYear;
        int denYearBoost = denZpBoost * 12 - denZpYear;
        int krisYearBoost = krisZpBoost * 12 - krisZpYear;
        System.out.println("Маша теперь получает " + mashaZpBoost + " рублей. Годовой доход вырос на " + mashaYearBoost + " рублей");
        System.out.println("Денис теперь получает " + denZpBoost + " рублей. Годовой доход вырос на " + denYearBoost + " рублей");
        System.out.println("Кристина теперь получает " + krisZpBoost + " рублей. Годовой доход вырос на " + krisYearBoost + " рублей");

    }
}