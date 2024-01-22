package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Films;
import ru.netology.domain.FilmManager;

public class FilmManagerTest {

    // указываем один раз данные для нескольких тестов
    Films movie1 = new Films(1, "Бладшот", "боевик", false);
    Films movie2 = new Films(2, "Вперёд", "мультфильм", false);
    Films movie3 = new Films(3, "Отель 'Белград'", "комедия", false);
    Films movie4 = new Films(4, "Джентльмены", "боевик", false);
    Films movie5 = new Films(5, "Человек-невидимка", "ужасы", false);
    Films movie6 = new Films(6, "Тролли. Мировой тур", "мультфильм", true);
    Films movie7 = new Films(7, "Номер один", "комедия", true);

    @Test
    public void shouldAddFilms() {
        FilmManager films = new FilmManager();

        films.add(movie3);
        films.add(movie4);

        Films[] expected = {movie3, movie4};
        Films[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFilms() {
        FilmManager films = new FilmManager();

        films.add(movie1);
        films.add(movie2);
        films.add(movie3);
        films.add(movie4);
        films.add(movie5);
        films.add(movie6);
        films.add(movie7);

        Films[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Films[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        FilmManager films = new FilmManager();

        films.add(movie1);
        films.add(movie2);
        films.add(movie3);
        films.add(movie4);
        films.add(movie5);
        films.add(movie6);
        films.add(movie7);

        Films[] expected = {movie7, movie6, movie5, movie4, movie3};
        Films[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithNewLimit() {
        FilmManager films = new FilmManager(3);

        films.add(movie1);
        films.add(movie2);
        films.add(movie3);
        films.add(movie4);
        films.add(movie5);
        films.add(movie6);
        films.add(movie7);

        Films[] expected = {movie7, movie6, movie5};
        Films[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithLessList() {
        FilmManager films = new FilmManager();

        films.add(movie1);
        films.add(movie2);
        films.add(movie3);
        films.add(movie4);

        Films[] expected = {movie4, movie3, movie2, movie1};
        Films[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindFilm() {
        FilmManager films = new FilmManager();

        Films[] expected = {};
        Films[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindOneFilm() {
        FilmManager films = new FilmManager();

        films.add(movie1);

        Films[] expected = {movie1};
        Films[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
