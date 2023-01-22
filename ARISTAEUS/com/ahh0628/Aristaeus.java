package com.ahh0628;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Aristaeus {
    public static void main(String[] args) throws IOException, InterruptedException {
      run();
    }
    public static void run() throws IOException, InterruptedException {
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
        System.out.println("       6. Multiple Hooks (beta)");
        System.out.println("       7. Multiple Hook Spammer (extra beta)");
        System.out.println("       8. About");
        Scanner scanner = new Scanner(System.in);
        int scannerS = scanner.nextInt();
        switch(scannerS) {
            case 1:
                Spammer.Spam();
            case 2:
                Deleter.Delete();
            case 3:
                MessageSender.sendMessage();
            case 4:
                Scheduler.Schedule();
            case 5:
                Nuker_Preset.Nuke();
            case 6:
                MultipleHooks.make();
            case 7:
                MultiHookSpammer.make();
            case 8:
                System.out.println("made by defrost#0628 this is a webhook multitool that I made in Java. \n" +
                        "It features a 1 hook and multiple hook spammer/sender. \n" +
                        "More coming soon! \n\n\n\n" );
                TimeUnit.SECONDS.sleep(5);
                run();
        }
    }
}
