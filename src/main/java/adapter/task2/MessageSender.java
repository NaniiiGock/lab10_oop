package adapter.task2;
import java.time.LocalDate;
public class MessageSender {
    public void send(String text,Client user,String country) {
        if (user.getLastActiveTime().isAfter(LocalDate.now().minusDays(1))
                && user.getCountry().equals(country)) {
            System.out.println(text + " is sending to " + user.getEmail());
        }
    }
}
