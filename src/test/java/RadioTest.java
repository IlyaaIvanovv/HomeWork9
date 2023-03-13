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
    public void shouldSetRadioStationAboveMax () {
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

    @Test
    public void shouldSetVolumeSound () {
        Radio rad = new Radio();

        rad.setVolumeSound(55);

        int expected = 55;
        int actual = rad.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeSoundAboveMax () {
        Radio rad = new Radio();

        rad.setVolumeSound(120);

        int expected = 0;
        int actual = rad.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNegativeVolumeSound () {
        Radio rad = new Radio();

        rad.setVolumeSound(-50);

        int expected = 0;
        int actual = rad.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeSound () {
        Radio rad = new Radio();

        rad.setVolumeSound(55);

        int expected = 56;
        int actual = rad.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolumeSound () {
        Radio rad = new Radio();

        rad.setVolumeSound(100);

        int expected = 100;
        int actual = rad.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetReduceVolumeSound () {
        Radio rad = new Radio();

        rad.setVolumeSound(55);

        int expected = 54;
        int actual = rad.reduceVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolumeSound () {
        Radio rad = new Radio();

        rad.setVolumeSound(-1);

        int expected = 0;
        int actual = rad.reduceVolume();

        Assertions.assertEquals(expected, actual);
    }
}
