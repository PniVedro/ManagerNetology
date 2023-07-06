public class Manager {
    private int LimitFilm;

    {
        LimitFilm = 10;
    }

    Manager(int LimitFilm) {
        this.LimitFilm = LimitFilm;
    }

    Manager(String[] Films) {
        this.poster = Films;
    }

    Manager() {
    }

    private String[] poster = new String[0];

    public String[] findAll() {
        return poster;
    }

    public void addNewFilm(String FilmName) {
        String[] tmp = new String[poster.length + 1];
        System.arraycopy(poster, 0, tmp, 0, poster.length);
        tmp[tmp.length - 1] = FilmName;
        poster = tmp;
    }

    public String[] findLast() {
        int tmpIndex = 0;


        String[] tmp;
        if (poster.length > LimitFilm) {
            tmp = new String[LimitFilm];

            for (int i = poster.length - 1; i >= poster.length - LimitFilm; i--) {
                tmp [tmpIndex] = poster [i];
                tmpIndex ++;
            }
        } else {
            tmp = new String[poster.length];
            for (int i = poster.length - 1; i >= 0; i--) {
                tmp [tmpIndex] = poster [i];
                tmpIndex ++;

            }
        }
        return tmp;
    }
}