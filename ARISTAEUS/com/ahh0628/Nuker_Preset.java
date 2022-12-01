package com.ahh0628;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Nuker_Preset {
    public static void Nuke() throws IOException, InterruptedException {
        System.out.println("Enter Webhook URL: ");
            Scanner scanner = new Scanner(System.in);
                 String url = scanner.nextLine();
                    DiscordWebhook webhook = new DiscordWebhook(url);
        System.out.println("Enter Message: ");
             Scanner scannerMsg = new Scanner(System.in);
                 String msg = scannerMsg.nextLine();
                    webhook.setContent(msg);
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
        System.out.println("Start Nuking? Y/N");
            Scanner scannerNuking = new Scanner(System.in);
                 String scannerNukingValue = scannerNuking.next();
        switch (scannerNukingValue) {
            case "y":
            case "Y":
                for (int i = 0; i < 10; i++) {
                    webhook.execute();
                         TimeUnit.MILLISECONDS.sleep(150);
                }
                Process process = Runtime.getRuntime().exec("cmd /c curl -X DELETE "+ url);
                System.out.println("Webhook Deleted!");
                System.out.println("Restart Program!");
                TimeUnit.SECONDS.sleep(2);
                break;
            case "n":
            case "N":
                System.exit(0);
        }
    }
}
