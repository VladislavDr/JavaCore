package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HolidaySchedule {
    public void holidaySchedule(List<Buyer> buyerList, PublicHolidays publicHolidays){
        List<Buyer> newBuyerList = new ArrayList<>();
        if (publicHolidays == PublicHolidays.FEBRUARY23){
            newBuyerList = buyerList.stream()
                    .filter(e -> e.getSex().equalsIgnoreCase("m"))
                    .toList();
        } else if (publicHolidays == PublicHolidays.NEWYEAR) {
            newBuyerList = buyerList.stream().toList();
        } else if(publicHolidays == PublicHolidays.MARCH8th){
            newBuyerList = buyerList.stream()
                    .filter(e -> e.getSex().equalsIgnoreCase("w"))
                    .toList();
        } else {
            System.out.println("Не с чем поздравлять :(");
        }
        System.out.println(newBuyerList.stream().map(e -> e.getFCs()).toList() + " Поздравляем c днем защитника отечества!");

    }

}
