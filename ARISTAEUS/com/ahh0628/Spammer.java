package com.ahh0628;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Spammer {
    public static void Spam() throws IOException, InterruptedException {
        System.out.println("Enter Webhook URL: ");
        Scanner scanner = new Scanner(System.in);
        String scannerS = scanner.next();
        DiscordWebhook webhook = new DiscordWebhook(scannerS);
        System.out.println("Enter Message: ");
        Scanner scanner2 = new Scanner(System.in);
        String scannerS2 = scanner2.next();
        webhook.setContent(scannerS2);
        System.out.println("Start Spam? Y/N");
        Scanner scanner3 = new Scanner(System.in);
        String scannerS3 = scanner3.next();
        System.out.println("Spam Started");
        switch (scannerS3) {
            case "y":
            case "Y":
                while(true) {
                    webhook.execute();
                    TimeUnit.MILLISECONDS.sleep(200);
                }
        }
    }
}
