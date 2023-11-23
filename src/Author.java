public class Author {
    private String firstName;
    private String surName;

    public Author(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "Имя автора: " + firstName +
                " Фамилия автора: " + surName + " ";
    }

}

