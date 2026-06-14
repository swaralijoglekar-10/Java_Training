package brandNewJavaLearning;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTime {
    public static void main(String[] args) {

        LocalDate joiningDate = LocalDate.of(2022, 9, 30);
        LocalDate presentDate = LocalDate.now();

        long yearsOfService = Period.between(joiningDate, presentDate).getYears();
        System.out.println(yearsOfService);

        long yearsOfService2 = ChronoUnit.YEARS.between(joiningDate, presentDate);
        System.out.println(yearsOfService2);

    }
}
