import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Manager manager = new Manager();


    @Test

    public void shouldAddFilm() {
        manager.addNewFilm("One");
        String[] expected = {"One"};
        String[] actual = manager.getPoster();
        Assertions.assertArrayEquals(expected, actual);
    }


    Manager managerMassive = new Manager(new String[]{"Матрица",
            "Джон Уик",
            "Хоббит",
            "Мстители",
            "Сплит",
            "Форрест Гамп",
            "Мстители",
            "Война",
            "Без перемен"});
    @Test
    public void shouldFindAllFilm() {
        String[] expected = manager.getPoster();
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

}
