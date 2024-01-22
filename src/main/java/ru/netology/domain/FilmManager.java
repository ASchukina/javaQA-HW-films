package ru.netology.domain;

import ru.netology.domain.Films;

public class FilmManager {

    private Films[] films = new Films[0];
    // изначально менеджер не содержит фильмов

    private int filmLimit;

    public FilmManager() {
        filmLimit = 5;
    }

    public FilmManager(int filmLimit) {
        this.filmLimit = filmLimit;
    }

    public void add(Films film) {
        Films[] tmp = new Films[films.length + 1];
        // новый массив, который на единицу больше, чем старый массив
        for (int i = 0; i < films.length; i++) {
            // копируем из старого массива в новый
            tmp[i] = films[i];
            // копируем в новый массив все элементы из старого массива
        }
        tmp[tmp.length - 1] = film; // заполняем самую последнюю ячейку, в параметре film содержится тот элемент, который нас просят добавить
        films = tmp; // присваиваем полю новый массив
    }

    public Films[] findAll() {
        return films;
    }

    public Films[] findLast() {
        int resultLength = films.length;
        if (resultLength >= filmLimit) {
            resultLength = filmLimit;
        } else {
            resultLength = films.length;
        }
        Films[] result = new Films[resultLength];
        for (int i = 0; i < result.length; i++) {
            int film1 = films.length - 1 - i;
            result[i] = films[film1];
        }
        return result;
    }

}
