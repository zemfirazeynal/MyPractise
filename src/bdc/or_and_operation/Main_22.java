package bdc.or_and_operation;

public class Main_22 {
    public static void main(String[] args) {
        if((sendSms()&sendSlack()) & (sendTelegram()&sendFacebook())){
            System.out.println("Notifying Completed!");
        }

    }

    public static boolean sendSms() {
        System.out.println("send Sms");
        return true;
    }

    public static boolean sendSlack() {
        System.out.println("send Slack");
        return false;
    }

    public static boolean sendTelegram() {
        System.out.println("send Telegram");
        return true;
    }
    public static boolean sendFacebook() {
        System.out.println("send Facebook");
        return true;
    }
}
