package ru.netology;
public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Ivan";
        post.surname = "Ivanov";
        post.patronymic = "Ivanovich";
        post.birthday = new FromDate();
        post.birthday.day = 11;
        post.birthday.month = 11;
        post.birthday.year = 2000;
        post.passport = "1111 № 111111";
        post.phone = "+7 (999) 123 45 67";
        post.subscription = true;


        System.out.println(post.name);
    }
}
