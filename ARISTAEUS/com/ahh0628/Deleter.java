package com.ahh0628;

import java.io.IOException;
import java.util.Scanner;

public class Deleter {
    public static void Delete() throws IOException, InterruptedException {
        System.out.println("Enter Webhook URL To Delete: ");
        Scanner scanner = new Scanner(System.in);
        String URL = scanner.nextLine();
        Process process = Runtime.getRuntime().exec("cmd /c curl -X DELETE "+URL);

        System.out.println("Deleted Webhook!");
        Aristaeus.run();
    }
}
