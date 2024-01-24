package Task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class main {
    public static void main(String[] args) {
        Buyer ivan = new Buyer("Ivan", 23, "879207447870", "m");
        Buyer sergey = new Buyer("Sergey", 48, "4848545", "m");
        Collections.addAll(Market.BUYERLIST, ivan, sergey);
        Buyer filatova = new Buyer("Filatova", 40, "456789", "w");
        Market.BUYERLIST.add(filatova);

        Product toy = new Product("Toy", 1000.00);
        Product car = new Product("Car", 999.99);
        Product barby = new Product("Barby", 2000.00);
        Product ken = new Product("Ken", 2000.);
        Product crazyFrog = new Product("Crazy Frog", 750.00);
        Collections.addAll(Market.PRODUCTLIST, toy, car, barby, ken, crazyFrog);
        Product puzzle = new Product("Puzzle", 450.00);

//        Market.ORDERLIST.add(Market.getProduct(ivan, puzzle , 10));
//        Market.ORDERLIST.add(Market.getProduct(ivan, car , 3));
//        Market.ORDERLIST.removeIf(Objects::isNull);
//        System.out.println("Количество покупок - " + Market.ORDERLIST.size());

        HolidaySchedule holidaySchedule = new HolidaySchedule();
        holidaySchedule.holidaySchedule(Market.BUYERLIST, PublicHolidays.NEWYEAR);

    }
}
