public class Manager {
    private int LimitFilm;

    {
        LimitFilm = 5;
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

    public String[] getPoster() {
        return poster;
    }

    public void addNewFilm(String FilmName) {
        String[] tmp = new String[poster.length + 1];
        System.arraycopy(poster, 0, tmp, 0, poster.length);
        tmp[tmp.length - 1] = FilmName;
        poster = tmp;
    }

    public String[] findAll() {
        for (String s : poster) {

            System.out.println(s);
        }
    }
    public void findLast() {
        if (poster.length > LimitFilm) {
            for (int i = poster.length - 1; i >= poster.length - LimitFilm; i--) {
                System.out.println(poster[i]);
            }


        } else {
            for (int i = poster.length - 1; i >= 0; i--) {
                System.out.println(poster[i]);
            }
        }


    }
}
