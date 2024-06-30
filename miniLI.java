class User {
    String name;
    String address;
    int age;
    String mailid;

    User(String name, String address, int age, String mailid) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mailid = mailid;
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Email: " + mailid);
    }
}

class Book {
    String bookId;
    String title;
    String author;
    boolean isAvailable;

    Book(String bookId, String title, String author, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    void printDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }
}

class Card {
    String cardId;
    String userId;
    String issueDate;
    String expiryDate;

    Card(String cardId, String userId, String issueDate, String expiryDate) {
        this.cardId = cardId;
        this.userId = userId;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    void printDetails() {
        System.out.println("Card ID: " + cardId);
        System.out.println("User ID: " + userId);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Expiry Date: " + expiryDate);
    }
}

class ReminderMessage {
    String messageId;
    String userId;
    String message;
    String date;

    ReminderMessage(String messageId, String userId, String message, String date) {
        this.messageId = messageId;
        this.userId = userId;
        this.message = message;
        this.date = date;
    }

    void printDetails() {
        System.out.println("Message ID: " + messageId);
        System.out.println("User ID: " + userId);
        System.out.println("Message: " + message);
        System.out.println("Date: " + date);
    }
}

public class miniLI {
    public static void main(String[] args) {
        User ob1 = new User("Snekha", "Tiruppur", 20, "snekhasdf@gmail.com");
        User ob2 = new User("Agilesh", "Tiruppur", 22, "asfrg0df@gmail.com");
        User ob3 = new User("Dinesh", "Erode", 57, "ssfb2asdf@gmail.com");

        Book book1 = new Book("B001", "Java Programming", "Jane Smith", true);
        Book book2 = new Book("B002", "Data Structures", "John Doe", false);

        Card card1 = new Card("C001", "U001", "2024-01-01", "2025-01-01");
        Card card2 = new Card("C002", "U002", "2024-02-01", "2025-02-01");

        ReminderMessage reminder1 = new ReminderMessage("M001", "U001", "Return book by tomorrow", "2024-07-01");
        ReminderMessage reminder2 = new ReminderMessage("M002", "U002", "Your card will expire soon", "2024-06-30");

        System.out.println("User Details:");
        System.out.println();
        ob1.print();
        System.out.println();
        ob2.print();
        System.out.println();
        ob3.print();
        System.out.println();

        System.out.println("Book Details:");
        System.out.println();
        book1.printDetails();
        System.out.println();
        book2.printDetails();
        System.out.println();

        System.out.println("Card Details:");
        System.out.println();
        card1.printDetails();
        System.out.println();
        card2.printDetails();
        System.out.println();

        System.out.println("Reminder Message Details:");
        System.out.println();
        reminder1.printDetails();
        System.out.println();
        reminder2.printDetails();
    }
}
