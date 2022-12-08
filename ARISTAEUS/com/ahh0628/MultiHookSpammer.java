package com.ahh0628;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MultiHookSpammer {
    public static boolean hook1HasMessage;
    public static boolean hook2HasMessage;
    public static boolean hook3HasMessage;
    public static boolean hook4HasMessage;
    public static boolean hook5HasMessage;
    public static void make() {

        try {
            //WEBHOOK ONE
            System.out.println("Enter webhook URL 1: ");
            Scanner scanner1 = new Scanner(System.in);
            String url1 = scanner1.nextLine();
            if(!url1.contains("discord.com/api")) {
                System.out.println("Webhook URL cannot be null!");
                make();
            } else {
                REF.webhook1.url = url1;
                System.out.println("URL 1 is " + REF.webhook1.url);
            }

            System.out.println("Set message for hook 1:");
            Scanner scannerMessage1 = new Scanner(System.in);
            String message1 = scannerMessage1.nextLine();
            if(message1.equals("")) {
                System.out.println("Skipped hook message 1");
                hook1HasMessage = false; // sets hook has message to false
            } else {
                System.out.println("Message for webhook 1 is " + message1);
                hook1HasMessage = true;
                REF.webhook1.setContent(message1);
            }

            //END OF WEBHOOK 1

            //START OF WEBHOOK 2

            System.out.println("Enter webhook URL 2: ");
            Scanner scanner2 = new Scanner(System.in);
            String url2 = scanner2.nextLine();
            if(!url2.contains("discord.com/api")) {
                System.out.println("Webhook URL cannot be null!");
                make();
            } else {
                REF.webhook2.url = url2;
                System.out.println("URL 2 is " + REF.webhook2.url);
            }

            System.out.println("Set message for hook 2:");
            Scanner scannerMessage2 = new Scanner(System.in);
            String message2 = scannerMessage2.nextLine();
            if(message1.equals("")) {
                System.out.println("Skipped message for hook 2");
                hook2HasMessage = false; // sets hook has message to false
                REF.webhook3.setContent("");
            } else {
                hook2HasMessage = true;
                System.out.println("Message for webhook 2 is " + message2);
                REF.webhook2.setContent(message2);
            }
            //END OF WEBHOOK 2

            //START OF WEBHOOK 3

            System.out.println("Enter webhook URL 3: ");
            Scanner scanner3 = new Scanner(System.in);
            String url3 = scanner3.nextLine();
            if(!url3.contains("discord.com/api")) {
                System.out.println("Webhook URL cannot be null!");
                make();
            } else {
                REF.webhook3.url = url3;
                System.out.println("URL 3 is " + REF.webhook3.url);
            }

            System.out.println("Set message for hook 3:");
            Scanner scannerMessage3 = new Scanner(System.in);
            String message3 = scannerMessage3.nextLine();
            if(message3.equals("")) {
                System.out.println("Skipped message for hook 3");
                hook3HasMessage = false; // sets hook has message to false
            } else {
                hook3HasMessage = true;
                System.out.println("Message for webhook 3 is " + message3);
                REF.webhook3.setContent(message3);
            }
            //END OF WEBHOOK 3

            //START OF WEBHOOK 4

            System.out.println("Enter webhook URL 4: ");
            Scanner scanner4 = new Scanner(System.in);
            String url4 = scanner4.nextLine();
            if(!url4.contains("discord.com/api")) {
                System.out.println("Webhook URL cannot be null!");
                make();
            } else {
                REF.webhook4.url = url4;
                System.out.println("URL 4 is " + REF.webhook4.url);
            }

            System.out.println("Set message for hook 4:");
            Scanner scannerMessage4 = new Scanner(System.in);
            String message4 = scannerMessage4.nextLine();
            if(message4.equals("")) {
                System.out.println("Skipped message for hook 4");
                hook4HasMessage = false; // sets hook has message to false
            } else {
                System.out.println("Message for webhook 4 is " + message4);
                hook4HasMessage = true;
                REF.webhook4.setContent(message4);
            }

            //END OF WEBHOOK 4

            //START OF WEBHOOK 5

            System.out.println("Enter webhook URL 5: ");
            Scanner scanner5 = new Scanner(System.in);
            String url5 = scanner5.nextLine();
            if(!url5.contains("discord.com/api")) {
                System.out.println("Webhook URL cannot be null!");
                make();
            } else {
                REF.webhook5.url = url5;
                System.out.println("URL 5 is " + REF.webhook5.url);
            }

            System.out.println("Set message for hook 5:");
            Scanner scannerMessage5 = new Scanner(System.in);
            String message5 = scannerMessage5.nextLine();
            if(message5.equals("")) {
                System.out.println("Skipped message for hook 5");
                hook5HasMessage = false; // sets hook has message to false
            } else {
                System.out.println("Message for webhook 5 is " + message5);
                hook5HasMessage = true;
                REF.webhook5.setContent(message5);
            }

            //END OF WEBHOOK 5

            System.out.println("Execute hooks? y/n");
            Scanner result = new Scanner(System.in);
            String ResultScan = result.nextLine();
            switch(ResultScan) {
                case "y":
                case "Y":
                    while (true) {
                        if (hook1HasMessage) {
                            REF.webhook1.execute();
                            TimeUnit.MILLISECONDS.sleep(200);
                            System.out.println( "[1]" + "Sent message: " + message1);
                            if (hook2HasMessage) {
                                REF.webhook2.execute();
                                TimeUnit.MILLISECONDS.sleep(200);
                                System.out.println("[2]" + "Sent message: " + message2);
                                if (hook3HasMessage) {
                                    REF.webhook3.execute();
                                    TimeUnit.MILLISECONDS.sleep(200);
                                    System.out.println("[3]" + "Sent message: " + message3);
                                    if (hook4HasMessage) {
                                        REF.webhook4.execute();
                                        TimeUnit.MILLISECONDS.sleep(200);
                                        System.out.println("[4]" + "Sent message: " + message4);
                                        if (hook5HasMessage) {
                                            REF.webhook5.execute();
                                            TimeUnit.MILLISECONDS.sleep(2300);
                                            System.out.println("[5]" + "Sent message: " + message5);
                                        }
                                    }

                                }

                            }
                        }
                    }

                default:
                    System.exit(0);
                    break;
            }
            TimeUnit.SECONDS.sleep(2);
            Aristaeus.run();
            } catch (Exception e) {
            e.printStackTrace();
        }

        }
    }
