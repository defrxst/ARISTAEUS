package com.ahh0628;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Scheduler {
    public static void Schedule () throws IOException, InterruptedException {
        System.out.println("Discord Webhook URL: ");
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        DiscordWebhook webhook = new DiscordWebhook(url);
        System.out.println("Write Message to write every X seconds");
        Scanner scanner = new Scanner(System.in);
        String msg = scanner.nextLine();
        webhook.setContent(msg);
        System.out.println("How long do you want the delay to be? (seconds)");
        Scanner timeScanner = new Scanner(System.in);
        int delay = Integer.parseInt(timeScanner.nextLine());
        System.out.println("Start Scheduler? Y/N");
        Scanner YORNScanner = new Scanner(System.in);
        String yOrN = YORNScanner.nextLine();
        switch(yOrN) {
            case "Y":
            case "y":
                while (true)   {
                    webhook.execute();
                    System.out.println("Sent Message: " + msg);
                    TimeUnit.SECONDS.sleep(delay);
                }
            case "N":
            case "n":
                System.exit(0);
                break;
        }
    }
}
