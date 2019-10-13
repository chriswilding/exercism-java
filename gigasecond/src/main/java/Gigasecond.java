import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    private static final long gigasecond = 1000000000;

    private final LocalDateTime dateTime;

    Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
        dateTime = moment.plusSeconds(gigasecond);
    }

    LocalDateTime getDateTime() {
        return dateTime;
    }

}
