package com.example.comicalapp.Common;

import com.example.comicalapp.Model.Chapter;
import com.example.comicalapp.Model.Comic;

import java.util.ArrayList;
import java.util.List;

public class Common {
    public static List<Comic> comicList = new ArrayList<>();
    public static Comic comicSelected;
    public static List<Chapter> chapterList;

    public static Chapter chapterSelected;
    public static int chapterIndex=-1;

    public static String formatString(String name) {
        StringBuilder finalResult = new StringBuilder(name.length() > 15?name.substring(0,15)+"...":name);
        return finalResult.toString();
    }

    public static String[] categories = {
            "Akcja",
            "Przygodowy",
            "Komedia",
            "Gotowanie",
            "Dramat",
            "Fantastyka",
            "Historia",
            "Horror",
            "Thriller",
            "Psychologiczny",
            "Romans",
            "Sci fi",
            "Anime"



    };
}
