package Observer;

import java.util.ArrayList;
import java.util.List;

public class FooClassObserver {

    private String bar;

    private List<FooObserver> notifications = new ArrayList<>();

    public List<FooObserver> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<FooObserver> notifications) {
        this.notifications = notifications;
    }
}
