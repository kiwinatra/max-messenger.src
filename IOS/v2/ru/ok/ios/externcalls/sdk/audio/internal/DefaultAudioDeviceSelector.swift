package ru.ok.android.externcalls.sdk.audio.internal;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.audio.AudioDeviceSelector;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Jh\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/DefaultAudioDeviceSelector;", "Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "logger", "Lru/ok/android/externcalls/sdk/audio/Logger;", "(Lru/ok/android/externcalls/sdk/audio/Logger;)V", "selectPreferableDevice", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "state", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "bluetooth", "", "respectSpeakerEnabled", "hasWiredHeadset", "hasEarpiece", "disabledSpeakerOnce", "disabledBluetoothOnce", "availableAudioDevices", "", "currentDevice", "videoTracker", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "proximityTracker", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultAudioDeviceSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAudioDeviceSelector.kt\nru/ok/android/externcalls/sdk/audio/internal/DefaultAudioDeviceSelector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
public final class DefaultAudioDeviceSelector implements AudioDeviceSelector {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String LOG_TAG = "DefaultAudioDeviceSelector";
    private final Logger logger;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/DefaultAudioDeviceSelector$Companion;", "", "()V", "LOG_TAG", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultAudioDeviceSelector(Logger logger2) {
        this.logger = logger2;
    }

    public CallsAudioManager.AudioDeviceType selectPreferableDevice(CallsAudioManager.State state, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Set<? extends CallsAudioManager.AudioDeviceType> set, CallsAudioManager.AudioDeviceType audioDeviceType, VideoTracker videoTracker, ProximityTracker proximityTracker) {
        CallsAudioManager.AudioDeviceType audioDeviceType2;
        CallsAudioManager.AudioDeviceType audioDeviceType3;
        boolean z7 = false;
        boolean z8 = z && set.contains(CallsAudioManager.AudioDeviceType.BLUETOOTH);
        if ((z2 && audioDeviceType == CallsAudioManager.AudioDeviceType.SPEAKER_PHONE) || videoTracker.preferSpeakerOverEarpiece()) {
            z7 = true;
        }
        this.logger.v(LOG_TAG, "selecting the best device: bt: " + z + ", respectSpeaker: " + z2 + ", bt available: " + z8 + ", speaker: " + z7);
        if (z3) {
            audioDeviceType2 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
        } else if (z8 && (audioDeviceType == (audioDeviceType3 = CallsAudioManager.AudioDeviceType.BLUETOOTH) || !z6)) {
            audioDeviceType2 = audioDeviceType3;
        } else if (!z5 && proximityTracker.getCanUseSpeaker() && z7) {
            audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        } else if (!z4) {
            audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        } else if (state == CallsAudioManager.State.RINGING) {
            this.logger.v(LOG_TAG, "select speaker phone because of RINGING state");
            audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        } else {
            audioDeviceType2 = CallsAudioManager.AudioDeviceType.EARPIECE;
        }
        this.logger.v(LOG_TAG, "prefer " + audioDeviceType2);
        return audioDeviceType2;
    }
}
