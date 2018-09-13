package com.novoda.gameofthrones;

class Character {
    private final String name;
    private final String wikipediaUrl;

    Character(String name, String wikipediaUrl) {
        this.name = name;
        this.wikipediaUrl = wikipediaUrl;
    }

    String getWikipediaUrl() {
        return wikipediaUrl;
    }

    String getName() {
        return name;
    }
}
