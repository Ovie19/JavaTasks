import java.util.Scanner;

public class NokiaPhoneDemo {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);
        char menuType = 'A'; // A -> Main Menu B -> Sub Menu C -> Sub sub menu
        int menuChoice = 0, subMenuChoice = 0, subSubMenuChoice = 0;
        boolean exit = false;


        // Strings for sub menu
        String phoneBookMenu = "1. Search\n2. Service Nos\n3. Add name\n4. Erase\n5. Edit\n" +
                               "6. Assign tone\n7. Send b'card\n8. Options\n9. Speed dials\n" +
                               "10. Voice tags";
        String messagesMenu = "1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n" +
                               "5. Templates\n6. Smileys\n7. Message settings\n8. Info service\n" +
                               "9. Voice mailbox number\n10. Service command editor";
        String callRegisterMenu = "1. Missed calls\n2. Received callss\n3. Dialled numbers\n" +
                                "4. Erase recent call lists\n5. Show call duration\n6. Show call costs\n" +
                                "7. Call cost settings\n8. Prepaid credit";
        String tonesMenu = "1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n" +
                           "5. Message alert tone\n6. Keypad tones\n7. Warning and game tones\n" +
                           "8. Vibrating alert\n9. Screen saver";
        String settingsMenu = "1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings";
        String clockMenu = "1. Alarm clock\n2. Clock settings\n3. Date setting\n4. Stopwatch\n" +
                           "5. Countdown timer\n6. Auto update of date and time";
                      
        while(!exit) {
            if (menuType == 'A') {
                System.out.println("\nNokia 3310 Menu");
                System.out.println("1. Phone book\n2. Messages\n3. Chat");
                System.out.println("4. Call register\n5. Tones\n6. Settings");
                System.out.println("7. Call divert\n8. Games\n9. Calculator");
                System.out.println("10. Reminder\n11. Clock\n12. Profiles");        
                System.out.print("13. SIM services\n\n0. Exit\nEnter choice: ");
                menuChoice = inputCollector.nextInt();
                if (menuChoice == 0) {
                    exit = true;
                } else {
                    menuType = 'B';
                }
            }

            if (menuType == 'B' && subSubMenuChoice == 0) {
                switch(menuChoice) {
                    case 1:
                        System.out.println("\nPhone book");
                        System.out.println(phoneBookMenu);
                        System.out.println("0. Return to menu");
                        System.out.print("Enter choice: ");
                        subMenuChoice = inputCollector.nextInt();
                        if (subMenuChoice == 0) {
                            menuType = 'A';
                        } else {menuType = 'C';}
                        break;
                    case 2:
                        System.out.println("\nMessages");
                        System.out.println(messagesMenu);
                        System.out.println("0. Return to menu");
                        System.out.print("Enter choice: ");
                        subMenuChoice = inputCollector.nextInt();
                        if (subMenuChoice == 0) {
                            menuType = 'A';
                        } else {menuType = 'C';}
                        break;   
                    case 3:
                        System.out.println("\nChat");
                        System.out.println("0. Return to menu");
                        System.out.print("Enter choice: ");
                        subMenuChoice = inputCollector.nextInt();
                        if (subMenuChoice == 0) {
                            menuType = 'A';
                        }
                        break;      
                    case 4:
                        System.out.println("\nCall register");
                        System.out.println(callRegisterMenu);
                        System.out.println("0. Return to menu");
                        System.out.print("Enter choice: ");
                        subMenuChoice = inputCollector.nextInt();
                        if (subMenuChoice == 0) {
                            menuType = 'A';
                        } else {
                            menuType = 'C';
                        }
                        break;      
                    case 5:
                        System.out.println("\nTones");
                        System.out.println(tonesMenu);
                        System.out.println("0. Return to menu");
                        System.out.print("Enter choice: ");
                        subMenuChoice = inputCollector.nextInt();
                        if (subMenuChoice == 0) {
                            menuType = 'A';
                        } else {
                            menuType = 'C';
                        }
                        break;      
                    case 6:
                        System.out.println("\nSettings");
                        System.out.println(settingsMenu);
                        System.out.println("0. Return to menu");
                        System.out.print("Enter choice: ");
                        subMenuChoice = inputCollector.nextInt();
                        if (subMenuChoice == 0) {
                            menuType = 'A';
                        } else {
                            menuType = 'C';
                        }
                        break;   
                    case 7:
                        System.out.println("\nCall divert");
                        System.out.println("0. Return to menu");
                        System.out.print("Enter choice: ");
                        subMenuChoice = inputCollector.nextInt();
                        if (subMenuChoice == 0) {
                            menuType = 'A';
                        } 
                        break;   
                    case 8:
                        System.out.println("\nGames");
                        System.out.println("0. Return to menu");
                        System.out.print("Enter choice: ");
                        subMenuChoice = inputCollector.nextInt();
                        if (subMenuChoice == 0) {
                            menuType = 'A';
                        }
                        break;    
                    case 9:
                        System.out.println("\nCalculator");
                        System.out.println("0. Return to menu");
                        System.out.print("Enter choice: ");
                        subMenuChoice = inputCollector.nextInt();
                        if (subMenuChoice == 0) {
                            menuType = 'A';
                        }
                        break;     
                    case 10:
                        System.out.println("\nReminder");
                        System.out.println("0. Return to menu");
                        System.out.print("Enter choice: ");
                        subMenuChoice = inputCollector.nextInt();
                        if (subMenuChoice == 0) {
                            menuType = 'A';
                        }
                        break;     
                    case 11:
                        System.out.println("\nClock");
                        System.out.println(clockMenu);
                        System.out.println("0. Return to menu");
                        System.out.print("Enter choice: ");
                        subMenuChoice = inputCollector.nextInt();
                        if (subMenuChoice == 0) {
                            menuType = 'A';
                        } else {
                            menuType = 'C';
                        }
                        break;        
                    case 12:
                        System.out.println("\nProfiles");
                        System.out.println("0. Return to menu");
                        System.out.print("Enter choice: ");
                        subMenuChoice = inputCollector.nextInt();
                        if (subMenuChoice == 0) {
                            menuType = 'A';
                        }
                        break;     
                    case 13:
                        System.out.println("\nSIM services");
                        System.out.println("0. Return to menu");
                        System.out.print("Enter choice: ");
                        subMenuChoice = inputCollector.nextInt();
                        if (subMenuChoice == 0) {
                            menuType = 'A';
                        }
                        break;      
                }
            }

            if (menuType == 'C') {

                // PHONE BOOK
                if (menuChoice == 1) {
                    switch(subMenuChoice) {
                        case 1:
                            System.out.println("\nSearch");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 2:
                            System.out.println("\nService Nos.");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 3:
                            System.out.println("\nAdd name");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 4:
                            System.out.println("\nErase");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 5:
                            System.out.println("\nEdit");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 6:
                            System.out.println("\nAssign tone");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 7:
                            System.out.println("\nSend b'card");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 8:
                            System.out.println("\nOptions");
                            System.out.println("1. Type of view\n2. Memory status");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            } else {
                                if (subSubMenuChoice == 1) { 
                                    System.out.println("\nType of view");
                                }
                                if (subSubMenuChoice == 2) { 
                                    System.out.println("\nMemory status");
                                }
                                System.out.print("Enter 0 to go back: ");
                                subSubMenuChoice = inputCollector.nextInt();
                            }
                            break;
                        case 9:
                            System.out.println("\nSpeed dials");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 10:
                            System.out.println("\nVoice tags");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                    }
                }

                // MESSAGES
                if (menuChoice == 2) {
                    switch(subMenuChoice) {
                        case 1:
                            System.out.println("\nWrite messages");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 2:
                            System.out.println("\nInbox");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 3:
                            System.out.println("\nOutbox");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 4:
                            System.out.println("\nPicture messages");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 5:
                            System.out.println("\nTemplates");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 6:
                            System.out.println("\nSmileys");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 7:
                            System.out.println("\nMessage settings");
                            System.out.println("1. Set 1\n2. Common");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }else {
                                if (subSubMenuChoice == 1) { 
                                    System.out.println("\nSet 1");
                                }
                                if (subSubMenuChoice == 2) { 
                                    System.out.println("\nCommon");
                                }
                                System.out.print("Enter 0 to go back: ");
                                subSubMenuChoice = inputCollector.nextInt();
                            }
                            break;
                        case 8:
                            System.out.println("\nInfo service");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            } 
                            break;
                        case 9:
                            System.out.println("\nVoice mailbox number");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 10:
                            System.out.println("\nService command editor");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                    }
                }

                // CALL REGISTERS
                if (menuChoice == 4) {
                    switch(subMenuChoice) {
                        case 1:
                            System.out.println("\nMissed calls");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 2:
                            System.out.println("\nReceived calls");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 3:
                            System.out.println("\nDialled numbers");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 4:
                            System.out.println("\nErase recent call lists");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 5:
                            System.out.println("\nShow call duration");
                            System.out.println("1. Last call duration\n2. All calls' duration\n3. Received calls' duration"+
                                "\n4. Dialled calls' duration\n5. Clear timers");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            } else {
                                if (subSubMenuChoice == 1) { 
                                    System.out.println("\nLast call duration");
                                }
                                if (subSubMenuChoice == 2) { 
                                    System.out.println("\nAll calls' duration");
                                }
                                if (subSubMenuChoice == 3) { 
                                    System.out.println("\nReceived calls' duration");
                                }
                                if (subSubMenuChoice == 4) { 
                                    System.out.println("\nDialled calls' duration");
                                }
                                if (subSubMenuChoice == 5) { 
                                    System.out.println("\nClear timers");
                                }
                                System.out.print("Enter 0 to go back: ");
                                subSubMenuChoice = inputCollector.nextInt();
                            }
                            break;
                        case 6:
                            System.out.println("\nShow call costs");
                            System.out.println("1. Last call cost\n2. All calls' cost\n3. Clear counters");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            } else {
                                if (subSubMenuChoice == 1) { 
                                    System.out.println("\nLast call cost");
                                }
                                if (subSubMenuChoice == 2) { 
                                    System.out.println("\nAll calls' cost");
                                }
                                if (subSubMenuChoice == 3) { 
                                    System.out.println("\nClear counters");
                                }
                                System.out.print("Enter 0 to go back: ");
                                subSubMenuChoice = inputCollector.nextInt();
                            }
                            break;
                        case 7:
                            System.out.println("\nCall cost settings");
                            System.out.println("1. Call cost limit\n2. Show costs in");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            } else {
                                if (subSubMenuChoice == 1) { 
                                    System.out.println("\nCall cost limit");
                                }
                                if (subSubMenuChoice == 2) { 
                                    System.out.println("\nShow costs in");
                                }
                                System.out.print("Enter 0 to go back: ");
                                subSubMenuChoice = inputCollector.nextInt();
                            }
                            break;
                        case 8:
                            System.out.println("\nPrepaid");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                    }                    
                }
    
                // TONES
                if (menuChoice == 5) {
                    switch(subMenuChoice) {
                        case 1:
                            System.out.println("\nRinging tone");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 2:
                            System.out.println("\nRinging volume");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 3:
                            System.out.println("\nIncoming call alert");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 4:
                            System.out.println("\nComposer");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 5:
                            System.out.println("\nMessage alert tone");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 6:
                            System.out.println("\nKeypad tones");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 7:
                            System.out.println("\nWarning and game tones");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 8:
                            System.out.println("\nVibrating alert");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 9:
                            System.out.println("\nScreen saver");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                    }                    
                }

                // SETTINGS
                if (menuChoice == 6) {
                    switch(subMenuChoice) {
                        case 1:
                            System.out.println("\nCall settings");
                            System.out.println("1. Automatic redial\n2. Speed dialling\n3. Call waiting options");
                            System.out.println("4. Own number sending\n5. Phone line in use\n6. Automatic answer");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            } else {
                                if (subSubMenuChoice == 1) { 
                                    System.out.println("\nAutomatic redial");
                                }
                                if (subSubMenuChoice == 2) { 
                                    System.out.println("\nSpeed dialling");
                                }
                                if (subSubMenuChoice == 3) { 
                                    System.out.println("\nCall waiting options");
                                }
                                if (subSubMenuChoice == 4) { 
                                    System.out.println("\nOwn number sending");
                                }
                                if (subSubMenuChoice == 5) { 
                                    System.out.println("\nPhone line in use");
                                }
                                if (subSubMenuChoice == 6) { 
                                    System.out.println("\nAutomatic answer");
                                }
                                System.out.print("Enter 0 to go back: ");
                                subSubMenuChoice = inputCollector.nextInt();
                            }
                            break;
                        case 2:
                            System.out.println("\nPhone settings");
                            System.out.println("1. Language\n2. Cell info display\n3. Welcome note");
                            System.out.println("4. Network selection\n5. Lights\n6. Confirm SIM service actions");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            } else {
                                if (subSubMenuChoice == 1) { 
                                    System.out.println("\nLanguage");
                                }
                                if (subSubMenuChoice == 2) { 
                                    System.out.println("\nCell info display");
                                }
                                if (subSubMenuChoice == 3) { 
                                    System.out.println("\nWelcome note");
                                }
                                if (subSubMenuChoice == 4) { 
                                    System.out.println("\nNetwork selection");
                                }
                                if (subSubMenuChoice == 5) { 
                                    System.out.println("\nLights");
                                }
                                if (subSubMenuChoice == 6) { 
                                    System.out.println("\nConfirm SIM service actions");
                                }
                                System.out.print("Enter 0 to go back: ");
                                subSubMenuChoice = inputCollector.nextInt();
                            }
                            break;
                        case 3:
                            System.out.println("\nSecurity settings");
                            System.out.println("1. PIN code request\n2. Call barring service\n3. Fixed dialling");
                            System.out.println("4. Closed user group\n5. Phone security\n6. Change access codes");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            } else {
                                if (subSubMenuChoice == 1) { 
                                    System.out.println("\nPIN code request");
                                }
                                if (subSubMenuChoice == 2) { 
                                    System.out.println("\nCall barring service");
                                }
                                if (subSubMenuChoice == 3) { 
                                    System.out.println("\nFixed dialling");
                                }
                                if (subSubMenuChoice == 4) { 
                                    System.out.println("\nClosed user group");
                                }
                                if (subSubMenuChoice == 5) { 
                                    System.out.println("\nPhone security");
                                }
                                if (subSubMenuChoice == 6) { 
                                    System.out.println("\nChange access codes");
                                }
                                System.out.print("Enter 0 to go back: ");
                                subSubMenuChoice = inputCollector.nextInt();
                            }
                            break;
                        case 4:
                            System.out.println("\nRestore factory settings");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                    }                    
                }
                if (menuChoice == 6) {
                    switch(subMenuChoice) {
                        case 1:
                            System.out.println("\nCall settings");
                            System.out.println("1. Automatic redial\n2. Speed dialling\n3. Call waiting options");
                            System.out.println("4. Own number sending\n5. Phone line in use\n6. Automatic answer");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            } else {
                                if (subSubMenuChoice == 1) { 
                                    System.out.println("\nAutomatic redial");
                                }
                                if (subSubMenuChoice == 2) { 
                                    System.out.println("\nSpeed dialling");
                                }
                                if (subSubMenuChoice == 3) { 
                                    System.out.println("\nCall waiting options");
                                }
                                if (subSubMenuChoice == 4) { 
                                    System.out.println("\nOwn number sending");
                                }
                                if (subSubMenuChoice == 5) { 
                                    System.out.println("\nPhone line in use");
                                }
                                if (subSubMenuChoice == 6) { 
                                    System.out.println("\nAutomatic answer");
                                }
                                System.out.print("Enter 0 to go back: ");
                                subSubMenuChoice = inputCollector.nextInt();
                            }
                            break;
                        case 2:
                            System.out.println("\nPhone settings");
                            System.out.println("1. Language\n2. Cell info display\n3. Welcome note");
                            System.out.println("4. Network selection\n5. Lights\n6. Confirm SIM service actions");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            } else {
                                if (subSubMenuChoice == 1) { 
                                    System.out.println("\nLanguage");
                                }
                                if (subSubMenuChoice == 2) { 
                                    System.out.println("\nCell info display");
                                }
                                if (subSubMenuChoice == 3) { 
                                    System.out.println("\nWelcome note");
                                }
                                if (subSubMenuChoice == 4) { 
                                    System.out.println("\nNetwork selection");
                                }
                                if (subSubMenuChoice == 5) { 
                                    System.out.println("\nLights");
                                }
                                if (subSubMenuChoice == 6) { 
                                    System.out.println("\nConfirm SIM service actions");
                                }
                                System.out.print("Enter 0 to go back: ");
                                subSubMenuChoice = inputCollector.nextInt();
                            }
                            break;
                        case 3:
                            System.out.println("\nSecurity settings");
                            System.out.println("1. PIN code request\n2. Call barring service\n3. Fixed dialling");
                            System.out.println("4. Closed user group\n5. Phone security\n6. Change access codes");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            } else {
                                if (subSubMenuChoice == 1) { 
                                    System.out.println("\nPIN code request");
                                }
                                if (subSubMenuChoice == 2) { 
                                    System.out.println("\nCall barring service");
                                }
                                if (subSubMenuChoice == 3) { 
                                    System.out.println("\nFixed dialling");
                                }
                                if (subSubMenuChoice == 4) { 
                                    System.out.println("\nClosed user group");
                                }
                                if (subSubMenuChoice == 5) { 
                                    System.out.println("\nPhone security");
                                }
                                if (subSubMenuChoice == 6) { 
                                    System.out.println("\nChange access codes");
                                }
                                System.out.print("Enter 0 to go back: ");
                                subSubMenuChoice = inputCollector.nextInt();
                            }
                            break;
                        case 4:
                            System.out.println("\nRestore factory settings");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                    }                    
                }
                
                // CLOCK
                if (menuChoice == 11) {
                    switch(subMenuChoice) {
                        case 1:
                            System.out.println("\nAlarm clock");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 2:
                            System.out.println("\nClock settings");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 3:
                            System.out.println("\nDate setting");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 4:
                            System.out.println("\nStopwatch");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                        case 5:
                            System.out.println("\nCountdown timer");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                           
                            break;
                        case 6:
                            System.out.println("\nAuto update of date and time");
                            System.out.println("0. Return to menu");
                            System.out.print("Enter choice: ");
                            subSubMenuChoice = inputCollector.nextInt();
                            if (subSubMenuChoice == 0) {
                                menuType = 'B';
                            }
                            break;
                    }                    
                }
            }
        }
    }
}
