import java.time.LocalDateTime;

public class LogListArrayListTest {
    public static void main(String[] args) {
        PhoneLog log1 = new PhoneLog("");
    }
}

class PhoneLog {
    String logType;
    LocalDateTime localDateTime;
    String identity;
    float duration;

    public PhoneLog(String logType, LocalDateTime localDateTime, String identity, float duration) {
        this.logType = logType;
        this.localDateTime = localDateTime;
        this.identity = identity;
        this.duration = duration;
    }

}