package ru.netology.ObjectOrientedProgrammingAndDesign.radio;

public class Radio {

    // Станции
    private int currentVolume;  //текущий громкость
    private int currentRadioStationNumber;//текущий номер радиостанции
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsQuantity) {
        this.maxStation = stationsQuantity - 1;

    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void next() {     //следующий
        if (currentRadioStationNumber != maxStation) {  //
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prev() {   //предыдущий
        if (currentRadioStationNumber != 0) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = maxStation;
        }
    }


    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {   //установите текущий номер радиостанции
        if (currentRadioStationNumber < 0) {
            return;
        }
        if (currentRadioStationNumber > maxStation) {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }


    // Громкость


    public void increaseVolume() {   //увеличьте громкость
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {   //уменьшите громкость
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }


}
