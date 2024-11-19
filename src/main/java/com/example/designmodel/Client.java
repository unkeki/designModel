package com.example.designmodel;

public class Client {
    public static void main(String[] args) {
        PettyGirl aa = new PettyGirl("aa");
        AbstractSearcher searcher = new Searcher((IGoodBodyGirl) aa);
        searcher.show();
    }
}
