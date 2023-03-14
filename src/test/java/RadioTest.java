import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio(10, 0,100);

    @Test
    public void shouldSetRadioStation () {
        rad.setCurrentRadioStation(5);
        Assertions.assertEquals(5, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetMinRadioStation () {
        rad.setCurrentRadioStation(0);
        Assertions.assertEquals(0, rad.getMinRadioStation());
    }

    @Test
    public void shouldSetMaxRadioStation () {
        rad.setCurrentRadioStation(9);
        Assertions.assertEquals(9,rad.getMaxRadioStation());
    }

    @Test
    public void shouldSetRadioStationAboveMax () {
        rad.setCurrentRadioStation(11);
        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetNegativeRadioStation () {
        rad.setCurrentRadioStation(-2);
        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSet0RadioStation () {
        rad.setCurrentRadioStation(9);
        Assertions.assertEquals(0, rad.nextRadioStation());
    }

    @Test
    public void shouldSet6RadioStation() {
        rad.setCurrentRadioStation(5);
        Assertions.assertEquals(6, rad.nextRadioStation());
    }

    @Test
    public void shouldSet9RadioStation () {
        rad.setCurrentRadioStation(-1);
        Assertions.assertEquals(9, rad.prevRadioStation());
    }

    @Test
    public void shouldSet3RadioStation () {
        rad.setCurrentRadioStation(4);
        Assertions.assertEquals(3,rad.prevRadioStation());
    }

    @Test
    public void shouldSetVolumeSound () {
        rad.setVolumeSound(55);
        Assertions.assertEquals(55, rad.getVolumeSound());
    }

    @Test
    public void shouldSetMinVolume () {
        rad.setVolumeSound(0);
        Assertions.assertEquals(0,rad.getMinVolume());
    }

    @Test
    public void shouldSetMaxVolume () {
        rad.setVolumeSound(100);
        Assertions.assertEquals(100, rad.getMaxVolume());
    }

    @Test
    public void shouldNotSetVolumeSoundAboveMax () {
        rad.setVolumeSound(110);
        Assertions.assertEquals(0, rad.getVolumeSound());
    }

    @Test
    public void shouldSetNegativeVolumeSound () {
        rad.setVolumeSound(-10);
        Assertions.assertEquals(0, rad.getVolumeSound());
    }

    @Test
    public void shouldSetIncreaseVolumeSound () {
        rad.setVolumeSound(55);
        Assertions.assertEquals(56, rad.increaseVolume());
    }

    @Test
    public void shouldSetMaxVolumeSound () {
        rad.setVolumeSound(100);
        Assertions.assertEquals(100, rad.increaseVolume());
    }

    @Test
    public void shouldSetReduceVolumeSound () {
        rad.setVolumeSound(55);
        Assertions.assertEquals(54, rad.reduceVolume());
    }

    @Test
    public void shouldSetMinVolumeSound () {
        rad.setVolumeSound(-1);
        Assertions.assertEquals(0, rad.reduceVolume());
    }
}