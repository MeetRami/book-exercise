/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Meet Rami
 * @version 10/2/2017
 */


class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = ("");
        borrowed = 0;
    }
    
    public void setRefNumber(String ref)
    {
        refNumber = ref;
        if(ref.length() < 3)
        System.out.println("Reference number must be at least length of 3!");
    }
    
    public void setBorrowed(int bookBorrowed)
    {
        if(bookBorrowed > 0) {
            borrowed = bookBorrowed + 1;
        }
        else {
            System.out.println("Book Borrowed cannot be Negative!: ");
        }
    }

    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public void printAuthor()
    {
        System.out.println("Author of the Book is: " + author);
    }
    
    public void printTitle()
    {
        System.out.println("Title of the Book is: " + title);
    }
    
    public void printDetails()
    {
        System.out.println("Author:" + author);
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        if(refNumber.length() == 0)
        {
            System.out.println("zzz");
        }
    }
    
    
    
    
}
