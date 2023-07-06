import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Manager managerMassive = new Manager(new String[]{"Матрица",
                "Джон Уик",
                "Хоббит",
                "Мстители",
                "Сплит",
                "Форрест Гамп",
                "Мстители",
                "Война",
                "Без перемен"});
        String[] expected = {"Матрица",
                "Джон Уик",
                "Хоббит",
                "Мстители",
                "Сплит",
                "Форрест Гамп",
                "Мстители",
                "Война",
                "Без перемен"};
        String[] actual = managerMassive.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

}
