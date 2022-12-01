package com.ahh0628;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Spammer {
    public static void Spam() throws IOException, InterruptedException {
        System.out.println("Enter Webhook URL: ");
        Scanner scanner = new Scanner(System.in);
        String scannerS = scanner.nextLine();
        DiscordWebhook webhook = new DiscordWebhook(scannerS);
        System.out.println("Enter Message: ");
        Scanner scanner2 = new Scanner(System.in);
        String scannerS2 = scanner2.nextLine();
        webhook.setContent(scannerS2);
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
