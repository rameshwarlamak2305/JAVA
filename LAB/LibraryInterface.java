// LibraryUser interface with methods
 interface LibraryUser {
    void registerAccount(int age);

    void requestBook(String bookType);
}

// KidUser class implementing LibraryUser interface
 class KidUser implements LibraryUser {
    private int age;
    private String bookType;

    // registerAccount method implementation for KidUser class
    public void registerAccount(int age) {
        this.age = age;
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    // requestBook method implementation for KidUser class
    public void requestBook(String bookType) {
        this.bookType = bookType;
        if (bookType.equals("Kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

// AdultUser class implementing LibraryUser interface
 class AdultUser implements LibraryUser {
    private int age;
    private String bookType;

    // registerAccount method implementation for AdultUser class
    public void registerAccount(int age) {
        this.age = age;
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    // requestBook method implementation for AdultUser class
    public void requestBook(String bookType) {
        this.bookType = bookType;
        if (bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

// LibraryInterfaceDemo class for testing
 class LibraryInterface {
    public static void main(String[] args) {
        // Test case #1: KidUser
        KidUser kidUser = new KidUser();
        kidUser.registerAccount(10);
        kidUser.requestBook("Kids");

        kidUser = new KidUser();
        kidUser.registerAccount(18);
        kidUser.requestBook("Fiction");

        // Test case #2: AdultUser
        AdultUser adultUser = new AdultUser();
        adultUser.registerAccount(5);
        adultUser.requestBook("Kids");

        adultUser = new AdultUser();
        adultUser.registerAccount(23);
        adultUser.requestBook("Fiction");
    }
}
