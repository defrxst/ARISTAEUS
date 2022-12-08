package com.ahh0628;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Spammer {
    public static boolean spamming; // some shit i forgor :skull:
    public static void Spam() throws IOException, InterruptedException {

        System.out.println("Enter Webhook URL: "); // webhook url
        Scanner scanner = new Scanner(System.in);
        String scannerS = scanner.nextLine();
        DiscordWebhook webhook = new DiscordWebhook(scannerS); // sets the webhook url
        System.out.println("Enter Message: ");
        Scanner scanner2 = new Scanner(System.in);
        String scannerS2 = scanner2.nextLine();
        webhook.setContent(scannerS2);
        System.out.println("Do you want to set a username? Y/N");
        Scanner scannerUsername = new Scanner(System.in); // username scanner
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
                String scannerAvatarSetValue = scannerAvatarSet.nextLine(); // gets avatar image URL
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
                spamming = true;
                while (spamming) {
                    for (int i = 0; i < 10; i++){
                        webhook.execute();
                        TimeUnit.MILLISECONDS.sleep( 1000); // Spams it 10 times, then times out for 6 seconds with a 1-second delay
                        //this is done to avoid faster rate limiting. Might be improved in the future
                    }
                    TimeUnit.MILLISECONDS.sleep(6000);
                }

        }
    }
}
