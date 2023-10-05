import java.util.Scanner;

public class phone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("0: Sh20 (30mins, 3hrs)");
            System.out.println("1: Sh10 (15mins, 1hr)");
            System.out.println("2: Sh20 (15Mins, midnight)");
            System.out.println("3: Okoa 50");
            System.out.println("4: Okoa 20");
            System.out.println("5: Okoa 10");
            System.out.println("6: Okoa 5");
            System.out.println("7: Okoa 20 (900MB, 1hr)");
            System.out.println("8: Okoa Internet");
            System.out.println("9: More");
            System.out.println("99: Exit");
            System.out.println("Enter your choice from the above");

            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    processOption0();
                    break;
                case 1:
                    processOption1();
                    break;
                case 2:
                    processOption2();
                    break;
                case 3:
                    processOption3();
                    break;
                case 4:
                    processOption4();
                    break;
                case 5:
                    processOption5();
                    break;
                case 6:
                    processOption6();
                    break;
                case 7:
                    processOption7();
                    break;
                case 8:
                    processOption8();
                    break;
                case 9:
                    processOption9();
                    break;
                case 99:
                    System.out.println("Exiting the program. Goodbye!");
                    return; 
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void processOption0() {
        while (true) {
            System.out.println("Existing Unpaid okoa: 0");
            System.out.println("New Okoa request: 20");
            System.out.println("TOTAL DEBT will be: 20");
            System.out.println("1: Accept");
            System.out.println("2: Decline");
            System.out.println("0: BACK to Main Menu");

            int subChoice = new Scanner(System.in).nextInt();
            switch (subChoice) {
                case 1:
                    System.out.println("Accepted Sh20 (30mins, 3hrs)");
                    return;
                case 2:
                    System.out.println("Declined Sh20 (30mins, 3hrs)");
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void processOption1() {
        while (true) {
            System.out.println("Existing Unpaid okoa: 0");
            System.out.println("New Okoa request: 10");
            System.out.println("TOTAL DEBT will be: 10");
            System.out.println("1: Accept");
            System.out.println("2: Decline");
            System.out.println("0: BACK to Main Menu");

            int subChoice = new Scanner(System.in).nextInt();
            switch (subChoice) {
                case 1:
                    System.out.println("Accepted Sh10 (15mins, 1hr)");
                    return;
                case 2:
                    System.out.println("Declined Sh10 (15mins, 1hr)");
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void processOption2() {
        while (true) {
            System.out.println("Existing Unpaid okoa: 0");
            System.out.println("New Okoa request: 20");
            System.out.println("TOTAL DEBT will be: 20");
            System.out.println("1: Accept");
            System.out.println("2: Decline");
            System.out.println("0: BACK to Main Menu");

            int subChoice = new Scanner(System.in).nextInt();
            switch (subChoice) {
                case 1:
                    System.out.println("Accepted Sh20 (15Mins, midnight)");
                    return;
                case 2:
                    System.out.println("Declined Sh20 (15Mins, midnight)");
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void processOption3() {
        while (true) {
            System.out.println("Existing Unpaid okoa: 0");
            System.out.println("New Okoa request: 50");
            System.out.println("TOTAL DEBT will be: 50");
            System.out.println("1: Accept");
            System.out.println("2: Decline");
            System.out.println("0: BACK to Main Menu");

            int subChoice = new Scanner(System.in).nextInt();
            switch (subChoice) {
                case 1:
                    System.out.println("Accepted Okoa 50");
                    return;
                case 2:
                    System.out.println("Declined Okoa 50");
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void processOption4() {
        while (true) {
            System.out.println("Existing Unpaid okoa: 0");
            System.out.println("New Okoa request: 20");
            System.out.println("TOTAL DEBT will be: 20");
            System.out.println("1: Accept");
            System.out.println("2: Decline");
            System.out.println("0: BACK to Main Menu");

            int subChoice = new Scanner(System.in).nextInt();
            switch (subChoice) {
                case 1:
                    System.out.println("Accepted Okoa 20");
                    return;
                case 2:
                    System.out.println("Declined Okoa 20");
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void processOption5() {
        while (true) {
            System.out.println("Existing Unpaid okoa: 0");
            System.out.println("New Okoa request: 10");
            System.out.println("TOTAL DEBT will be: 10");
            System.out.println("1: Accept");
            System.out.println("2: Decline");
            System.out.println("0: BACK to Main Menu");

            int subChoice = new Scanner(System.in).nextInt();
            switch (subChoice) {
                case 1:
                    System.out.println("Accepted Okoa 10");
                    return;
                case 2:
                    System.out.println("Declined Okoa 10");
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void processOption6() {
        while (true) {
            System.out.println("Existing Unpaid okoa: 0");
            System.out.println("New Okoa request: 5");
            System.out.println("TOTAL DEBT will be: 5");
            System.out.println("1: Accept");
            System.out.println("2: Decline");
            System.out.println("0: BACK to Main Menu");

            int subChoice = new Scanner(System.in).nextInt();
            switch (subChoice) {
                case 1:
                    System.out.println("Accepted Okoa 5");
                    return;
                case 2:
                    System.out.println("Declined Okoa 5");
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void processOption7() {
        while (true) {
            System.out.println("Okoa 900MB@Sh20 for 1hr");
            System.out.println("1: Accept");
            System.out.println("2: Decline");
            System.out.println("0: BACK to Main Menu");

            int subChoice = new Scanner(System.in).nextInt();
            switch (subChoice) {
                case 1:
                    System.out.println("Accepted Okoa 900MB@Sh20 for 1hr");
                    return;
                case 2:
                    System.out.println("Declined Okoa 900MB@Sh20 for 1hr");
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void processOption8() {
        while (true) {
            System.out.println("Okoa bundle");
            System.out.println("1: Sh20 (900MB, 1hr)");
            System.out.println("2: Sh 50 (1400MB, 3hrs)");
            System.out.println("3: Sh 50 (270MB, 24hrs)");
            System.out.println("4: Sh 20 (90MB, 24hrs)");
            System.out.println("5: Sh 10 (30MB, 24hrs)");
            System.out.println("6: Sh 5 (10MB, 24hrs)");
            System.out.println("0: BACK to Main Menu");

            int subChoice = new Scanner(System.in).nextInt();
            switch (subChoice) {
                case 1:
                    System.out.println("Selected Sh20 (900MB, 1hr)");
                    return;
                case 2:
                    System.out.println("Selected Sh50 (1400MB, 3hrs)");
                    return;
                case 3:
                    System.out.println("Selected Sh50 (270MB, 24hrs)");
                    return;
                case 4:
                    System.out.println("Selected Sh20 (90MB, 24hrs)");
                    return;
                case 5:
                    System.out.println("Selected Sh10 (30MB, 24hrs)");
                    return;
                case 6:
                    System.out.println("Selected Sh5 (10MB, 24hrs)");
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void processOption9() {
        while (true) {
            System.out.println("9: Okoa Minutes");
            System.out.println("10: Okoa SMS");
            System.out.println("#: Check Balance");
            System.out.println("0: BACK to Main Menu");

            int subChoice = new Scanner(System.in).nextInt();
            switch (subChoice) {
                case 9:
                    System.out.println("Selected Okoa Minutes");
                    return;
                case 10:
                    System.out.println("Selected Okoa SMS");
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
