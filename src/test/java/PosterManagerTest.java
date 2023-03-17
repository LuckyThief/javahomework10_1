import org.example.PosterItem;
import org.example.PosterManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    PosterItem item_1 = new PosterItem(1, 11, "Film_1");
    PosterItem item_2 = new PosterItem(2, 22, "Film_2");
    PosterItem item_3 = new PosterItem(3, 33, "Film_3");
    PosterItem item_4 = new PosterItem(4, 44, "Film_4");
    PosterItem item_5 = new PosterItem(5, 55, "Film_5");

    @Test
    public void shouldSave() {
        PosterManager cond = new PosterManager();

        cond.save(item_1);
        cond.save(item_2);
        cond.save(item_3);
        cond.save(item_4);
        cond.save(item_5);

        PosterItem[] expected = {item_1, item_2, item_3, item_4, item_5};
        PosterItem[] actual = cond.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        PosterManager cond = new PosterManager();

        cond.save(item_1);
        cond.save(item_2);
        cond.save(item_3);
        cond.save(item_4);
        cond.save(item_5);

        PosterItem[] expected = {item_1, item_2, item_3, item_4, item_5};
        PosterItem[] actual = cond.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        PosterManager cond = new PosterManager(5);

        cond.save(item_1);
        cond.save(item_2);
        cond.save(item_3);
        cond.save(item_4);
        cond.save(item_5);

        PosterItem[] expected = {item_5, item_4, item_3, item_2, item_1};
        PosterItem[] actual = cond.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLimit_4_Manager_3() {
        PosterManager cond = new PosterManager(4);

        cond.save(item_1);
        cond.save(item_2);
        cond.save(item_3);

        PosterItem[] expected = {item_3, item_2, item_1};
        PosterItem[] actual = cond.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLimit_3_Manager_4() {
        PosterManager cond = new PosterManager(3);

        cond.save(item_1);
        cond.save(item_2);
        cond.save(item_3);
        cond.save(item_4);

        PosterItem[] expected = {item_4, item_3, item_2};
        PosterItem[] actual = cond.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
