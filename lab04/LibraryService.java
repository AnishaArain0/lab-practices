package lab04;

public class LibraryService {

    public static int issueBook(int availableCopies, String title) throws BookUnavailableException {
        if (availableCopies <= 0) {
            throw new BookUnavailableException("'" + title + "' has no copies available.");
        }
        return availableCopies - 1;
    }

    /**
     * Helper method to find a member by their ID.
     */
    public static String findMemberById(int id) {
        return "Member #" + id;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Remaining copies: " + issueBook(3, "Clean Code"));
            System.out.println("Member lookup: " + findMemberById(101));
            issueBook(0, "Clean Code");
        } catch (BookUnavailableException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
