import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.MovieManager;

public class MovieManagerTest {


    @Test
    public void test1() {
        MovieManager manager = new MovieManager(5);

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");

        String[] actual = manager.findAll();
        String[] expected = new String[]{"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        Assertions.assertArrayEquals(actual, expected);

    }


    @Test
    public void test2() {
        MovieManager manager = new MovieManager(5);

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");

        String[] actual = manager.findLast();
        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void test3() {
        MovieManager manager = new MovieManager(5);

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");


        String[] actual = manager.findAll();
        String[] expected = new String[]{"Film 1", "Film 2", "Film 3", "Film 4"};
        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void test4() {
        MovieManager manager = new MovieManager(5);

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");


        String[] actual = manager.findAll();
        String[] expected = new String[]{"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test5() {
        MovieManager manager = new MovieManager(5);

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");


        String[] actual = manager.findLast();
        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test6() {
        MovieManager manager = new MovieManager(5);

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");


        String[] actual = manager.findAll();
        String[] expected = new String[]{"Film 1", "Film 2", "Film 3", "Film 4"};
        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void test7() {
        MovieManager manager = new MovieManager(5);

        manager.add("Film 1");


        String[] actual = manager.findLast();
        String[] expected = {"Film 1"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test8() {
        MovieManager manager = new MovieManager(5);

        manager.add("Film 1");


        String[] actual = manager.findAll();
        String[] expected = new String[]{"Film 1"};
        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void test9() {
        MovieManager manager = new MovieManager(5);

        manager.add("Film 0");


        String[] actual = manager.findLast();
        String[] expected = {"Film 0"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test10() {
        MovieManager manager = new MovieManager(5);

        manager.add("Film 0");


        String[] actual = manager.findAll();
        String[] expected = new String[]{"Film 0"};
        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void test13() {

        MovieManager manager = new MovieManager(5);

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");


        String[] actual = manager.findLast();
        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test12() {
        MovieManager manager = new MovieManager(5);

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");


        String[] actual = manager.findAll();
        String[] expected = new String[]{"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};
        Assertions.assertArrayEquals(actual, expected);

    }
}