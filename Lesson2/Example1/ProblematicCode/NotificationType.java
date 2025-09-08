package Lesson2.Example1.ProblematicCode;

public enum NotificationType {
    SMS,
    EMAIL,
    WhATSAPP;

    public static void sendSMSNotification () {
        System.out.println("Sending SMS");
    }

    public static void sendEMAILNotification () {
        System.out.println("Sending EMAIL");
    }

    public static void sendWHATSAPPNotification () {
        System.out.println("Sending WHATSAPP");
    }
}
