package com.ahh0628;

import java.io.IOException;
import java.util.Scanner;

public class Aristaeus {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec("cmd /c color 2");
        System.out.println(    "                  $$\\           $$\\                                         \n" +
                "                  \\__|          $$ |                                        \n" +
                " $$$$$$\\  $$$$$$\\ $$\\ $$$$$$$\\$$$$$$\\   $$$$$$\\  $$$$$$\\ $$\\   $$\\ $$$$$$$\\ \n" +
                " \\____$$\\$$  __$$\\$$ $$  _____\\_$$  _|  \\____$$\\$$  __$$\\$$ |  $$ $$  _____|\n" +
                " $$$$$$$ $$ |  \\__$$ \\$$$$$$\\   $$ |    $$$$$$$ $$$$$$$$ $$ |  $$ \\$$$$$$\\  \n" +
                "$$  __$$ $$ |     $$ |\\____$$\\  $$ |$$\\$$  __$$ $$   ____$$ |  $$ |\\____$$\\ \n" +
                "\\$$$$$$$ $$ |     $$ $$$$$$$  | \\$$$$  \\$$$$$$$ \\$$$$$$$\\\\$$$$$$  $$$$$$$  |\n" +
                " \\_______\\__|     \\__\\_______/   \\____/ \\_______|\\_______|\\______/\\_______/ \n" +
                "                                                                          ");
        System.out.println("       1. Webhook Spammer");
        System.out.println("       2. Webhook Deleter");
        System.out.println("       3. Message Sender (incase u don't wanna spam it)");
        System.out.println("       4. Scheduler");
        System.out.println("       5. Webhook Nuker Preset");
        Scanner scanner = new Scanner(System.in);
        int scannerS = scanner.nextInt();
        if (scannerS == 1) {
            Spammer.Spam();
        }
        if (scannerS == 2) {
            Deleter.Delete();
        }
        if (scannerS == 3) {
            MessageSender.sendMessage();
        }
        if (scannerS == 4) {
            Scheduler.Schedule();
        }
        if (scannerS == 5) {
         Nuker_Preset.Nuke();
        }
    }
}
