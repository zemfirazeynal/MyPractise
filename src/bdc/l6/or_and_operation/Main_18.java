package bdc.l6.or_and_operation;

public class Main_18 {
    public static void main(String[] args) {
        if(sendSms()&sendSlack()&sendTelegram()){
            System.out.println("Notifying Completed!");
        }

    }

    public static boolean sendSms() {
        System.out.println("send Sms");
        return false;
    }

    public static boolean sendSlack() {
        System.out.println("send Slack");
        return false;
    }

    public static boolean sendTelegram() {
        System.out.println("send Telegram");
        return false;
    }
}
