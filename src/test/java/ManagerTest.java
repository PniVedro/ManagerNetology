import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class ManagerTest {


    @Test

    public void shouldAddFilm() {
        Manager manager = new Manager();
        manager.addNewFilm("One");
        String[] expected = {"One"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFilm() {
        Manager managerMassive = new Manager(new String[]{"Матрица", "Джон Уик", "Хоббит", "Мстители", "Сплит", "Форрест Гамп", "Мстители", "Война", "Без перемен"});
        String[] expected = {"Матрица", "Джон Уик", "Хоббит", "Мстители", "Сплит", "Форрест Гамп", "Мстители", "Война", "Без перемен"};
        String[] actual = managerMassive.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldChangeLimitFilms() {
        Manager manager = new Manager(10);
        int expected = 10;
        int actual = manager.getLimitFilm();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFrom5() {
        Manager managerMassive = new Manager(new String[]{"Матрица", "Джон Уик", "Хоббит", "Мстители", "Сплит", "Форрест Гамп", "Мстители", "Война", "Без перемен"});
        String[] expected = {"Без перемен", "Война", "Мстители", "Форрест Гамп", "Сплит"};
        String[] actual = managerMassive.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFrom10() {
        Manager managerMassive = new Manager(new String[]{"Матрица", "Джон Уик", "Хоббит", "Мстители", "Сплит", "Форрест Гамп", "Мстители", "Война", "Без перемен"});
        managerMassive.setLimitFilm(10);
        String[] expected = {"Без перемен", "Война", "Мстители", "Форрест Гамп", "Сплит", "Мстители", "Хоббит", "Джон Уик", "Матрица"};
        String[] actual = managerMassive.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
