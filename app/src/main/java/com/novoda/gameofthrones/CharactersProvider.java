package com.novoda.gameofthrones;

import java.util.ArrayList;
import java.util.List;

class CharactersProvider {
    static List<Character> getCharacters() {
        List<Character> characters = new ArrayList<>();

        characters.add(new Character("Daenerys Targaryen", "https://en.wikipedia.org/wiki/Daenerys_Targaryen"));
        characters.add(new Character("Jon Snow", "https://en.wikipedia.org/wiki/Jon_Snow_(character)"));
        characters.add(new Character("Tyrion Lannister", "https://en.wikipedia.org/wiki/Tyrion_Lannister"));
        characters.add(new Character("Cersei Lannister", "https://en.wikipedia.org/wiki/Cersei_Lannister"));
        characters.add(new Character("Jaime Lannister", "https://en.wikipedia.org/wiki/Jaime_Lannister"));
        characters.add(new Character("Sansa Stark", "https://en.wikipedia.org/wiki/Sansa_Stark"));
        characters.add(new Character("Arya Stark", "https://en.wikipedia.org/wiki/Arya_Stark"));
        characters.add(new Character("Ned Stark", "https://en.wikipedia.org/wiki/Ned_Stark"));
        characters.add(new Character("Theon Greyjoy", "https://en.wikipedia.org/wiki/Theon_Greyjoy"));
        characters.add(new Character("Robert Baratheon", "https://en.wikipedia.org/wiki/Robert_Baratheon"));
        characters.add(new Character("Stannis Baratheon", "https://en.wikipedia.org/wiki/Stannis_Baratheon"));
        characters.add(new Character("Jorah Mormont", "https://en.wikipedia.org/wiki/Jorah_Mormont"));
        characters.add(new Character("Margaery Tyrell", "https://en.wikipedia.org/wiki/Margaery_Tyrell"));
        characters.add(new Character("Olenna Tyrell", "https://en.wikipedia.org/wiki/Olenna_Tyrell"));
        characters.add(new Character("Gregor Clegane", "https://en.wikipedia.org/wiki/Gregor_Clegane"));
        characters.add(new Character("Sandor Clegane", "https://en.wikipedia.org/wiki/Sandor_Clegane"));

        return characters;
    }
}
