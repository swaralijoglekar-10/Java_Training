package brandNewJavaLearning.designPatterns;

class Book {

    private final String name;
    private final String author;
    private final int pages;

    // Private constructor to enforce the use of the Builder
    private Book(Builder builder) {
        this.name = builder.name;
        this.author = builder.author;
        this.pages = builder.pages;
    }

    // Getters for accessing the fields
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    // Static nested Builder class
    public static class Builder {
        private String name;
        private String author;
        private int pages;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setPages(int pages) {
            this.pages = pages;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Book book1 = new Book.Builder()
                .setName("Atomic Habits")
                .setAuthor("James Clear")
                .setPages(300)
                .build();

        Book book2 = new Book.Builder()
                .setName("The Secret Adversary")
                .setPages(350)
                .build();

        System.out.println("Book 1: " + book1.getName() + ", " + book1.getAuthor() + ", " + book1.getPages() + " pages");
        System.out.println("Book 2: " + book2.getName() + ", " + book2.getAuthor() + ", " + book2.getPages() + " pages");
    }
}