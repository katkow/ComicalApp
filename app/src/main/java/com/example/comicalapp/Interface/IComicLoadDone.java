package com.example.comicalapp.Interface;

import com.example.comicalapp.Model.Comic;

import java.util.List;

public interface IComicLoadDone {
    void onComicLoadDoneListener(List<Comic> comicList);

}
