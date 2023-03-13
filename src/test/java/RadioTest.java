import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation () {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);

        int expected = 5;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStation () {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(12);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNegativeRadioStation () {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-5);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet0RadioStation () {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);

        int expected = 0;
        int actual = rad.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet6RadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);

        int expected = 6;
        int actual = rad.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet9RadioStation () {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int expected = 9;
        int actual = rad.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet3RadioStation () {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(4);

        int expected = 3;
        int actual = rad.prevRadioStation();

        Assertions.assertEquals(expected,actual);
    }
}
