package ru.netology.radio;

public class Radio {

    private int numberOfRadioStations = 10;
    private int maxVolumeRadio = 100;
    private int minVolumeRadio = 0;
    private int currentNumberStation;
    private int currentVolumeRadio;

    public Radio(int numberOfRadioStations){
        this.numberOfRadioStations = numberOfRadioStations;

    }
    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public int getMaxVolumeRadio(){
        return maxVolumeRadio;
    }

    public int getMinVolumeRadio(){
        return minVolumeRadio;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public int getCurrentVolumeRadio() {
        return currentVolumeRadio;
    }

    public void setCurrentNumberStation(int newCurrentNumberStation) {
        if (newCurrentNumberStation < 0) {
            return;
        }
        if (newCurrentNumberStation > numberOfRadioStations - 1) {
            newCurrentNumberStation = numberOfRadioStations - 1;
        }
        currentNumberStation = newCurrentNumberStation;
    }

    public void setCurrentVolumeRadio(int newCurrentVolumeRadio) {
        if (newCurrentVolumeRadio < minVolumeRadio) {
            return;
        }
        if (newCurrentVolumeRadio > maxVolumeRadio) {
            newCurrentVolumeRadio = maxVolumeRadio;
        }
        currentVolumeRadio = newCurrentVolumeRadio;
    }

    public void nextStation() {                       // переключение на следующую станцию
        if (currentNumberStation == numberOfRadioStations - 1) {
            currentNumberStation = 0;
        } else {
            currentNumberStation = currentNumberStation + 1;
        }

    }

    public void prevStation() {                       // переключение на предыдущую станцию
        if (currentNumberStation == 0) {
            currentNumberStation = numberOfRadioStations - 1;
        } else {
            currentNumberStation = currentNumberStation - 1;
        }

    }


    public void decreaseVolume() {                    // уменьшение громкости на 1
        if (currentVolumeRadio > minVolumeRadio) {
            currentVolumeRadio = currentVolumeRadio - 1;
        }
    }

    public void increaseVolume() {                   // увеличение громкости на 1
        if (currentVolumeRadio < maxVolumeRadio) {
            currentVolumeRadio = currentVolumeRadio + 1;
        }
    }
}
