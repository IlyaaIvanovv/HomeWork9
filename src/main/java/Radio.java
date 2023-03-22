public class Radio {

    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio () {
    }

    public Radio (int minRadioStation, int maxRadioStation) {
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMinRadioStation () {
        return minRadioStation;
    }

    public int getMaxRadioStation () {
        return maxRadioStation;
    }

    public void setCurrentRadioStation (int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int nextRadioStation () {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
        return currentRadioStation;
    }

    public int prevRadioStation () {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
        return currentRadioStation;
    }

    public int getVolumeSound() {
        return currentVolume;
    }

    public int getMinVolume () {
        return minVolume;
    }

    public int getMaxVolume () {
        return maxVolume;
    }

    public void setVolumeSound (int newVolumeSound) {
        if (newVolumeSound < minVolume) {
            return;
        }
        if (newVolumeSound > maxVolume) {
            return;
        }
        currentVolume = newVolumeSound;
    }

    public int increaseVolume () {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int reduceVolume () {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
        return currentVolume;
    }
}