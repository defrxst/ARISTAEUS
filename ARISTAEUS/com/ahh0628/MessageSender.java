package com.ahh0628;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MessageSender {
    public static void sendMessage() throws IOException, InterruptedException {
        System.out.println("Enter Webhook URL: ");
            Scanner scanner = new Scanner(System.in);
                String URL = scanner.nextLine();
                    DiscordWebhook webhook = new DiscordWebhook(URL);
        System.out.println("Type Message Here: ");
            Scanner scanner2 = new Scanner(System.in);
                 String MESSAGE = scanner.nextLine();
                    webhook.setContent(MESSAGE);
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
        webhook.execute();
        System.out.println("Sent!");
        TimeUnit.SECONDS.sleep(2);
        Aristaeus.run();
    }
}
