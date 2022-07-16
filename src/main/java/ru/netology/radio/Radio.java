package ru.netology.radio;

public class Radio {
    public int currentNumberStation;
    public int currentVolumeRadio;

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
        if (newCurrentNumberStation > 9) {
            newCurrentNumberStation = 9;
        }
        currentNumberStation = newCurrentNumberStation;
    }

    public void setCurrentVolumeRadio(int newCurrentVolumeRadio) {
        if (newCurrentVolumeRadio < 0) {
            return;
        }
        if (newCurrentVolumeRadio > 10) {
            newCurrentVolumeRadio = 10;
        }
        currentVolumeRadio = newCurrentVolumeRadio;
    }

    public void nextStation() {                       // переключение на следующую станцию
        if (currentNumberStation == 9) {
            currentNumberStation = 0;
        } else {
            currentNumberStation = currentNumberStation + 1;
        }

    }

    public void prevStation() {                       // переключение на предыдущую станцию
        if (currentNumberStation == 0) {
            currentNumberStation = 9;
        } else {
            currentNumberStation = currentNumberStation - 1;
        }

    }


    public void decreaseVolume() {                    // уменьшение громкости на 1
        if (currentVolumeRadio > 0) {
            currentVolumeRadio = currentVolumeRadio - 1;
        }
    }

    public void increaseVolume() {                   // увеличение громкости на 1
        if (currentVolumeRadio < 10) {
            currentVolumeRadio = currentVolumeRadio + 1;
        }
    }
}
