public class Book {
    private String bookName;
    private Author authorName;

    private int publishingYear;

    public Book(Author authorName, String bookName, int publishingYear) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Название кники: " + bookName + " " +
                authorName.toString() +
                "Год публикации: " + publishingYear;
    }
}
