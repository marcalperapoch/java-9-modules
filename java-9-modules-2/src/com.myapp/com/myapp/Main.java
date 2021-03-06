package com.myapp;

import com.myapp.service.Repository;
import com.myapp.service.RepositoryService;

public class Main {

    public static void main(String[] args) {
        final Repository repository = RepositoryService.getRepository();
        final String value = repository.getValue("key2");
        System.out.println(String.format("\n\nGetting value \"%s\" from Repository (%s)\n", value, repository.getClass()));
    }
}