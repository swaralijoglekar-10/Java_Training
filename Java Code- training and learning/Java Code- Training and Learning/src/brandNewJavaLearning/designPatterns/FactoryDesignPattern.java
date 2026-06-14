package brandNewJavaLearning.designPatterns;

// Factory design pattern

class NotificationFactory{

    public Notification getNotificationObject(String notificationType) {
        if (notificationType == null) {
            throw new IllegalArgumentException("Notification type cannot be null");
        }
        switch (notificationType) {
            case "Email":
                return new Email();
            case "SMS":
                return new SMS();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + notificationType);
        }
    }
}

class Test_1{
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.getNotificationObject("SMS");
        notification.sendNotification();
    }
}

interface Notification{
    public void sendNotification();
}

class Email implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("Email sent!");
    }
}

class SMS implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("SMS sent!");
    }
}



