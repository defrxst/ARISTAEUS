package com.ahh0628;

import java.io.IOException;
import java.util.Scanner;

public class MessageSender {
    public static void sendMessage() throws IOException {
        System.out.println("Enter Webhook URL: ");
            Scanner scanner = new Scanner(System.in);
                String URL = scanner.nextLine();
                    DiscordWebhook webhook = new DiscordWebhook(URL);
        System.out.println("Type Message Here: ");
            Scanner scanner2 = new Scanner(System.in);
                 String MESSAGE = scanner.nextLine();
                    webhook.setContent(MESSAGE);
        webhook.execute();
        System.out.println("Sent!");
    }
}
