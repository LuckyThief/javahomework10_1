import org.example.PosterItem;
import org.example.PosterManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    PosterItem item_1 = new PosterItem(1, 11, "Джентельмены");
    PosterItem item_2 = new PosterItem(2, 22, "Джентельмены_2");
    PosterItem item_3 = new PosterItem(3, 33, "Джентельмены_3");
    PosterItem item_4 = new PosterItem(4, 44, "Джентельмены_4");
    PosterItem item_5 = new PosterItem(5, 55, "Джентельмены_5");
    PosterItem item_6 = new PosterItem(6, 66, "Джентельмены_6");
    PosterItem item_7 = new PosterItem(7, 77, "Джентельмены_7");

    @Test
    public void shouldSave() {
        PosterManager cond = new PosterManager(5);

        cond.save(item_1);
        cond.save(item_2);
        cond.save(item_3);
        cond.save(item_4);
        cond.save(item_5);

        PosterItem[] expected = {item_1, item_2, item_3, item_4, item_5};
        PosterItem[] actual = cond.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        PosterManager cond = new PosterManager(5);

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
    public void shouldFindLastIf_3() {
        PosterManager cond = new PosterManager(3);

        cond.save(item_1);
        cond.save(item_2);
        cond.save(item_3);

        PosterItem[] expected = {item_3, item_2, item_1};
        PosterItem[] actual = cond.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIf_7() {
        PosterManager cond = new PosterManager(7);

        cond.save(item_1);
        cond.save(item_2);
        cond.save(item_3);
        cond.save(item_4);
        cond.save(item_5);


        PosterItem[] expected = {item_5, item_4, item_3, item_2, item_1};
        PosterItem[] actual = cond.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
