package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;


public class RadioTest {

    @Test
    public void shouldSetStationNumber() {
        Radio number = new Radio();
        number.setCurrentNumberStation(10);
        int expected = 9;
        int actual = number.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeRadio() {
        Radio vol = new Radio();
        vol.setCurrentVolumeRadio(8);
        int expected = 8;
        int actual = vol.getCurrentVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxNumberStation() {
        Radio number = new Radio();
        number.setCurrentNumberStation(10);
        int expected = 9;
        int actual = number.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxVolumeRadio() {
        Radio vol = new Radio();
        vol.setCurrentVolumeRadio(11);
        int expected = 10;
        int actual = vol.getCurrentVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderMinNumberStation() {
        Radio number = new Radio();
        number.setCurrentNumberStation(-1);
        int expected = 0;
        int actual = number.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderMinVolumeRadio() {
        Radio vol = new Radio();
        vol.setCurrentVolumeRadio(-1);
        int expected = 0;
        int actual = vol.getCurrentVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuoldSetNextRadioStation() {
        Radio station = new Radio();
        station.setCurrentNumberStation(4);
        int prevRadioStation = station.getCurrentNumberStation();
        station.nextStation();
        int expected = prevRadioStation + 1;
        int actual = station.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextRadioStationAfterMax() {
        Radio station = new Radio();
        station.setCurrentNumberStation(9);

        station.nextStation();
        int expected = 0;
        int actual = station.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shuoldSetPrevRadioStation() {
        Radio station = new Radio();
        station.setCurrentNumberStation(4);
        int prevRadioStation = station.getCurrentNumberStation();
        station.prevStation();
        int expected = prevRadioStation - 1;
        int actual = station.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevRadioStationAfterMin() {
        Radio station = new Radio();
        station.setCurrentNumberStation(0);
        station.prevStation();
        int expected = 9;
        int actual = station.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolumeRadio(5);
        int prevVolumeRadio = vol.getCurrentVolumeRadio();
        vol.decreaseVolume();
        int expected = prevVolumeRadio - 1;
        int actual = vol.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeUnderZero() {
        Radio vol = new Radio();
        vol.setCurrentVolumeRadio(0);
        vol.decreaseVolume();
        int expected = 0;
        int actual = vol.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolumeRadio(5);
        int prevVolumeRadio = vol.getCurrentVolumeRadio();
        vol.increaseVolume();
        int expected = prevVolumeRadio + 1;
        int actual = vol.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeUnderMax() {
        Radio vol = new Radio();
        vol.setCurrentVolumeRadio(10);
        vol.increaseVolume();
        int expected = 10;
        int actual = vol.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }
}
