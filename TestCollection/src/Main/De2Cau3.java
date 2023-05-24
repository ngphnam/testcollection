package Main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class De2Cau3 {
    public static void cau3() {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2023, 5, 17));
        dates.add(LocalDate.of(2023, 5, 18));
        dates.add(LocalDate.of(2023, 5, 19));
        dates.add(LocalDate.of(2023, 5, 24));
        dates.add(LocalDate.of(2023, 5, 25));
        dates.add(LocalDate.of(2023, 5, 31));
        dates.add(LocalDate.of(2023, 5, 17));
        dates.add(LocalDate.of(2023, 5, 10));
        System.out.println("Các ngày trong list là thứ 4 là: ");
        for (LocalDate date:
             getWednesday(dates)) {
            System.out.println(date);
        }
    }
    private static List<LocalDate> getWednesday(List<LocalDate> dates){
        List<LocalDate> wedDates = new ArrayList<>();
        for (LocalDate wed:
             dates) {
            DayOfWeek wednesday = wed.getDayOfWeek();
            if (wednesday == DayOfWeek.WEDNESDAY) {
                wedDates.add(wed);
            }
        }
        return wedDates;
    }
}
