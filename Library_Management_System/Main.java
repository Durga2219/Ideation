import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        library library1 = new library();

        int choice;

        do {

            System.out.println("LIBRARY MANAGEMENT SYSTEM");
            System.out.println("1. Add Book");
            System.out.println("2. Add Reference Book");
            System.out.println("3. Add Member");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Display Available Books");
            System.out.println("7. Display Members");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            try {

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:

                        System.out.print("Enter Book ID: ");
                        int bookId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Book Title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter Author Name: ");
                        String author = sc.nextLine();

                        Book book = new Book(bookId, title, author);
                        library1.addBook(book);
                        break;

                    case 2:

                        System.out.print("Enter Book ID: ");
                        int refId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Book Title: ");
                        String refTitle = sc.nextLine();

                        System.out.print("Enter Author Name: ");
                        String refAuthor = sc.nextLine();

                        System.out.print("Enter Category: ");
                        String category = sc.nextLine();

                        ReferenceBook referenceBook =
                                new ReferenceBook(refId, refTitle, refAuthor, category);

                        library1.addBook(referenceBook);
                        break;

                    case 3:

                        System.out.print("Enter Member ID: ");
                        int memberId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Member Name: ");
                        String memberName = sc.nextLine();

                        Member member = new Member(memberId, memberName);

                        library1.addMember(member);
                        break;

                    case 4:

                        System.out.print("Enter Book ID to Issue: ");
                        int issueId = sc.nextInt();

                        try {
                            library1.issueBook(issueId);
                        } catch (BookNotAvailableException e) {
                            System.out.println(e.getMessage());
                        }

                        break;

                    case 5:

                        System.out.print("Enter Book ID to Return: ");
                        int returnId = sc.nextInt();

                        try {
                            library1.returnBook(returnId);
                        } catch (BookNotIssuedException e) {
                            System.out.println(e.getMessage());
                        }

                        break;

                    case 6:

                        library1.displayAvailableBooks();
                        break;

                    case 7:

                        library1.displayMembers();
                        break;

                    case 8:

                        System.out.println("Thank you for using Library Management System.");
                        break;

                    default:

                        System.out.println("Invalid Choice.");

                }

            } catch (InputMismatchException e) {

                System.out.println("Invalid Input! Please enter numbers only.");
                sc.nextLine();
                choice = 0;
            }

        } while (choice != 8);

        sc.close();
    }
}