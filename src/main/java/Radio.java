public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation (int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int nextRadioStation () {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
        return currentRadioStation;
    }

    public int prevRadioStation () {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
        return currentRadioStation;
    }

    public int getVolumeSound() {
        return currentVolume;
    }

    public void setVolumeSound (int newVolumeSound) {
        if (newVolumeSound < 0) {
            return;
        }
        if (newVolumeSound > 100) {
            return;
        }
        currentVolume = newVolumeSound;
    }

    public int increaseVolume () {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public int reduceVolume () {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
        return currentVolume;
    }
}
