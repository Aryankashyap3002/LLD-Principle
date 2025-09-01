package Lesson2.Example2.ProblematicCode;

import java.util.List;

    public class NotificationSender {
        public void sendNotifications(List<NotificationType> notificationTypes) {
            for (NotificationType type : notificationTypes) {
                if (type == NotificationType.SMS) {
                    NotificationType.sendSMSNotification();
                } else if (type == NotificationType.WhATSAPP) {
                    NotificationType.sendWHATSAPPNotification();
                } else if (type == NotificationType.EMAIL) {
                    NotificationType.sendEMAILNotification();
                }
            }
        }
}
