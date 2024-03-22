package bdc.or_and_operation;

public class Main_6 {
    public static void main(String[] args) {
        if(sendSms()||sendSlack()|sendTelegram()){
            System.out.println("Notifying Completed!");
        }

    }

    public static boolean sendSms() {
        System.out.println("send Sms");
        return false;
    }

    public static boolean sendSlack() {
        System.out.println("send Slack");
        return true;
    }

    public static boolean sendTelegram() {
        System.out.println("send Telegram");
        return true;
    }
}
