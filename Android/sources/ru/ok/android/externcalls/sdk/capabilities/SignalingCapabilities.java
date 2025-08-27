package ru.ok.android.externcalls.sdk.capabilities;

public class SignalingCapabilities {
    private int value;

    private void setBit(int i, boolean z) {
        if (z) {
            this.value = (1 << i) | this.value;
            return;
        }
        this.value = (~(1 << i)) & this.value;
    }

    public String getSignalingCapabilitiesValue() {
        return Integer.toHexString(this.value);
    }

    public void setAnimojiEnabled(boolean z) {
        setBit(9, z);
    }

    public void setAudienceModeEnabled(boolean z) {
        setBit(11, z);
    }

    public void setContactCallsEnabled(boolean z) {
        setBit(10, z);
    }

    public void setFilterDefaultValues(boolean z) {
        setBit(3, z);
    }

    public void setMuteNotificationForAdmin(boolean z) {
        setBit(5, z);
    }

    public void setScreenTrackConsumerEnabled(boolean z) {
        setBit(4, z);
    }

    public void setScreenTrackProducerEnabled(boolean z) {
        setBit(0, z);
    }

    public void setSessionRoomsEnabled(boolean z) {
        setBit(8, z);
    }

    public void setVideoTracksEnabled(boolean z) {
        setBit(1, z);
    }

    public void setWaitingHallEnabled(boolean z) {
        setBit(2, z);
    }

    public void setWatchTogetherEnabled(boolean z) {
        setBit(6, z);
    }
}
