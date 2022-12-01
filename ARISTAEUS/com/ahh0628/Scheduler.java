package com.ahh0628;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Scheduler {
    public static void Schedule () throws IOException, InterruptedException {
        System.out.println("Discord Webhook URL: ");
          Scanner sc = new Scanner(System.in); // also i like indents, it lets me read the code easier. IF YOU DON'T LIKE IT, DEAL WITH IT CUNT
                String url = sc.nextLine();
                    DiscordWebhook webhook = new DiscordWebhook(url); // set the webhook url
        System.out.println("Write Message to write every X seconds");
            Scanner scanner = new Scanner(System.in);
                String msg = scanner.nextLine();
                  webhook.setContent(msg); // set webhook content
        System.out.println("How long do you want the delay to be? (seconds)");
            Scanner timeScanner = new Scanner(System.in);
                int delay = Integer.parseInt(timeScanner.nextLine()); // set delay in seconds
        System.out.println("Do you want to set a username? Y/N");
            Scanner scannerUsername = new Scanner(System.in);
                String scannerUsernameValue = scannerUsername.next();
        switch (scannerUsernameValue) {
            case "y":
            case "Y":
                System.out.println("Set Username: ");
                    Scanner scannerUsernameSet = new Scanner(System.in);
                        String scannerUsernameSetValue = scannerUsernameSet.nextLine();
                             System.out.println("Username set to " + scannerUsernameSetValue);
                webhook.setUsername(scannerUsernameSetValue);
                break;
            case "n":
            case "N":
                webhook.setUsername("");
                break;
        }
        System.out.println("Do you want to set a avatar? Y/N");
            Scanner scannerAvatar = new Scanner(System.in);
                String scannerAvatarValue = scannerAvatar.next();
        switch (scannerAvatarValue) {
            case "y":
            case "Y":
                System.out.println("Avatar URL: ");
                     Scanner scannerAvatarSet = new Scanner(System.in);
                          String scannerAvatarSetValue = scannerAvatarSet.nextLine();
                webhook.setAvatarUrl(scannerAvatarSetValue);
                break;
            case "n":
            case "N":
                webhook.setAvatarUrl("");
                break;
        }
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
