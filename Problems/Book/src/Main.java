class Book {
    String title;
    int yearOfPublishing;
    String[] authors = null;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }
}