package Lesson2.Example1.BetterCode;

import java.util.List;


public class NotificationsSenter {
    public void sendNotifications(List<Notifications> notifications) {
        for(Notifications notification : notifications) {
            notification.send();
        }
    }
}
