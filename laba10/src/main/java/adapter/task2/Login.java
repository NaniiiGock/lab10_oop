package adapter.task2;
import java.time.LocalDate;
public class Login {
    public Client login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new TwitterUser("nanigock@gmail.com", "Ukraine", "2022-10-09"));
        }
        else
            if (loginMethod.equals("facebook")) {
                return new FacebookClient(new FacebookUser("nanigock@gmail.com", Country.Ukraine, LocalDate.now()));}
        throw new IllegalArgumentException("No such loginMethod");
    }
}
