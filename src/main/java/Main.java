public class Main {
    public static void main(String[] args) {
        FormDate date = new FormDate();
        date.day = 5;
        date.month = 5;
        date.year = 2000;

        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.birthday = date;
        post.subscription = true;
        post.passport = "4444 № 44444444"
        post.phone =  "+7 (999)-999-99-99"
    }
}
