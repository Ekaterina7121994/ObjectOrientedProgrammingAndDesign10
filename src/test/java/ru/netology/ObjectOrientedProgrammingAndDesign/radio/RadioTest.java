package ru.netology.ObjectOrientedProgrammingAndDesign.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void stationSelectionInsideStation() { // выброр станции в грацице
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSelectionAboveMax() { // выброр станции выше max
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(14);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSelectionLessMin() { // выброр станции меньше min
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-4);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSelectionNegativeBoundary() { // выброр станции отрицаельное граничное
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSelectionZeroBoundary() { // выброр станции нулевое
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(7);
        radio.setCurrentRadioStationNumber(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSelectionUnitBoundary() { // выброр станции 1
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSelectionLessMaxBoundary() { // выброр станции 8
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSelectionMaxBoundary() { // выброр станции 9
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSelectionMoreMaxBoundary() { // выброр станции 10
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingStationsForward() { //переключение станции вперед
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingStationsForwardMiddle() { //переключение станции вперед
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingStationsForwardMaxMin() { //переключение станции вперед
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingStationsBackMinMax() { //переключение станции назад c мин на мах
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingStationsBack() { //переключение станции назад
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingStationsBackMaxMin() { //переключение станции назад на мин
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //////
    @Test
    public void increaseVolumeNegative() { // меньше нуля
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() { // увеличение зввука
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMoreMax() { // увеличение зввука
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMoreMin() { // увеличение зввука
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeBeforeMax() { // увеличение зввука до максимума
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeReduce() { // уменьшение зввука
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeToZero() { // уменьшение зввука до нуля
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeFromMax() { // уменьшение зввука до нуля
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reduceVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeMoreMax() { // уменьшение зввука до нуля
        Radio radio = new Radio();
        radio.setCurrentVolume(103);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
