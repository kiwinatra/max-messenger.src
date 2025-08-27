package ru.ok.android.externcalls.sdk.audio;

import android.content.Context;
import android.os.Build;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.audio.internal.DefaultAudioDeviceSelector;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.externcalls.sdk.audio.internal.stubs.LoggerStub;
import ru.ok.android.externcalls.sdk.audio.internal.stubs.VideoTrackerStub;
import ru.ok.android.externcalls.sdk.audio.internal.tracer.TracerLiteFacade;
import ru.ok.android.externcalls.sdk.audio.internal.tracer.TracerLogger;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\u0007&'()*+,J:\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0014H'J0\u0010\u0016\u001a\u00020\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u0014H'J0\u0010\u0018\u001a\u00020\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u0014H'J\b\u0010\u0019\u001a\u00020\u000eH&J2\u0010\u001a\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0014H'J\b\u0010\u001b\u001a\u00020\u000eH'J:\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0014H'J:\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0014H'J\u0012\u0010 \u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010\"H'JD\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0014H'R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager;", "", "availableAudioDevices", "", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "getAvailableAudioDevices", "()Ljava/util/List;", "currentDevice", "getCurrentDevice", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "isHeadsetConnected", "", "()Z", "changeStateAsync", "", "state", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "onComplete", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "", "hasBluetoothHeadsetAsync", "onSuccess", "hasWiredHeadsetAsync", "notifyBluetoothPermissionGranted", "releaseAsync", "requestAudioFocusAsync", "setAudioDeviceAsync", "audioDevice", "setAudioDeviceTypeAsync", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "setOnAudioDeviceChangeListener", "listener", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "setSpeakerEnabledAsync", "enabled", "byVideoTurnedOn", "AudioDeviceInfoChangedEvent", "AudioDeviceType", "Builder", "DisabledAudioDeviceUsagePolicy", "OnAudioDeviceInfoChangeListener", "OnMuteListener", "State", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CallsAudioManager {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceInfoChangedEvent;", "", "oldDevice", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "newDevice", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;)V", "getNewDevice", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "getOldDevice", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AudioDeviceInfoChangedEvent {
        private final CallsAudioDeviceInfo newDevice;
        private final CallsAudioDeviceInfo oldDevice;

        public AudioDeviceInfoChangedEvent(CallsAudioDeviceInfo callsAudioDeviceInfo, CallsAudioDeviceInfo callsAudioDeviceInfo2) {
            this.oldDevice = callsAudioDeviceInfo;
            this.newDevice = callsAudioDeviceInfo2;
        }

        public static /* synthetic */ AudioDeviceInfoChangedEvent copy$default(AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent, CallsAudioDeviceInfo callsAudioDeviceInfo, CallsAudioDeviceInfo callsAudioDeviceInfo2, int i, Object obj) {
            if ((i & 1) != 0) {
                callsAudioDeviceInfo = audioDeviceInfoChangedEvent.oldDevice;
            }
            if ((i & 2) != 0) {
                callsAudioDeviceInfo2 = audioDeviceInfoChangedEvent.newDevice;
            }
            return audioDeviceInfoChangedEvent.copy(callsAudioDeviceInfo, callsAudioDeviceInfo2);
        }

        public final CallsAudioDeviceInfo component1() {
            return this.oldDevice;
        }

        public final CallsAudioDeviceInfo component2() {
            return this.newDevice;
        }

        public final AudioDeviceInfoChangedEvent copy(CallsAudioDeviceInfo callsAudioDeviceInfo, CallsAudioDeviceInfo callsAudioDeviceInfo2) {
            return new AudioDeviceInfoChangedEvent(callsAudioDeviceInfo, callsAudioDeviceInfo2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioDeviceInfoChangedEvent)) {
                return false;
            }
            AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent = (AudioDeviceInfoChangedEvent) obj;
            return Intrinsics.areEqual((Object) this.oldDevice, (Object) audioDeviceInfoChangedEvent.oldDevice) && Intrinsics.areEqual((Object) this.newDevice, (Object) audioDeviceInfoChangedEvent.newDevice);
        }

        public final CallsAudioDeviceInfo getNewDevice() {
            return this.newDevice;
        }

        public final CallsAudioDeviceInfo getOldDevice() {
            return this.oldDevice;
        }

        public int hashCode() {
            return this.newDevice.hashCode() + (this.oldDevice.hashCode() * 31);
        }

        public String toString() {
            CallsAudioDeviceInfo callsAudioDeviceInfo = this.oldDevice;
            CallsAudioDeviceInfo callsAudioDeviceInfo2 = this.newDevice;
            return "AudioDeviceInfoChangedEvent(oldDevice=" + callsAudioDeviceInfo + ", newDevice=" + callsAudioDeviceInfo2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u001f\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0007\"\u00020\u0000¢\u0006\u0002\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "", "(Ljava/lang/String;I)V", "isHeadsetDevice", "", "oneOf", "devices", "", "([Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)Z", "BLUETOOTH", "WIRED_HEADSET", "EARPIECE", "SPEAKER_PHONE", "NONE", "BLUETOOTH_INTENT", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum AudioDeviceType {
        BLUETOOTH,
        WIRED_HEADSET,
        EARPIECE,
        SPEAKER_PHONE,
        NONE,
        BLUETOOTH_INTENT;

        static {
            AudioDeviceType[] $values;
            $ENTRIES = EnumEntriesKt.enumEntries((E[]) $values);
        }

        public static EnumEntries<AudioDeviceType> getEntries() {
            return $ENTRIES;
        }

        public final boolean isHeadsetDevice() {
            return oneOf(WIRED_HEADSET, BLUETOOTH);
        }

        public final boolean oneOf(AudioDeviceType... audioDeviceTypeArr) {
            return ArraysKt.contains((T[]) audioDeviceTypeArr, this);
        }
    }

    @SourceDebugExtension({"SMAP\nCallsAudioManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallsAudioManager.kt\nru/ok/android/externcalls/sdk/audio/CallsAudioManager$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000eJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$Builder;", "", "()V", "context", "Landroid/content/Context;", "disabledAudioDeviceUsagePolicy", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$DisabledAudioDeviceUsagePolicy;", "logger", "Lru/ok/android/externcalls/sdk/audio/Logger;", "onMuteListener", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "proximityTracker", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "trackProximityWhenSpeakerEnabled", "", "videoTracker", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "build", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager;", "setContext", "setDisabledAudioDeviceUsagePolicy", "handler", "setLogger", "setOnMuteListener", "setProximityTracker", "setTrackProximityWhenSpeakerEnabled", "track", "setVideoTracker", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private Context context;
        private DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy;
        private Logger logger = new LoggerStub();
        private OnMuteListener onMuteListener;
        private ProximityTracker proximityTracker = ProximityTracker.Companion.getNOOP$calls_audiomanager_release();
        private boolean trackProximityWhenSpeakerEnabled;
        private VideoTracker videoTracker = new VideoTrackerStub();

        public final CallsAudioManager build() {
            Context context2 = this.context;
            if (context2 != null) {
                DefaultAudioDeviceSelector defaultAudioDeviceSelector = new DefaultAudioDeviceSelector(this.logger);
                TracerLiteFacade tracerLiteFacade = new TracerLiteFacade(context2);
                if (Build.VERSION.SDK_INT < 31) {
                    return new CallsAudioManagerV2Impl(context2, this.proximityTracker, this.trackProximityWhenSpeakerEnabled, this.videoTracker, defaultAudioDeviceSelector, this.onMuteListener, new TracerLogger(tracerLiteFacade, this.logger));
                }
                ProximityTracker proximityTracker2 = this.proximityTracker;
                boolean z = this.trackProximityWhenSpeakerEnabled;
                VideoTracker videoTracker2 = this.videoTracker;
                DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy2 = this.disabledAudioDeviceUsagePolicy;
                if (disabledAudioDeviceUsagePolicy2 == null) {
                    disabledAudioDeviceUsagePolicy2 = new CallsAudioManager$Builder$build$1();
                }
                return new CallsAudioManagerV3Impl(context2, proximityTracker2, z, videoTracker2, defaultAudioDeviceSelector, disabledAudioDeviceUsagePolicy2, this.onMuteListener, new TracerLogger(tracerLiteFacade, this.logger));
            }
            throw new IllegalArgumentException("Context must not be null".toString());
        }

        public final Builder setContext(Context context2) {
            this.context = context2;
            return this;
        }

        public final Builder setDisabledAudioDeviceUsagePolicy(DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy2) {
            this.disabledAudioDeviceUsagePolicy = disabledAudioDeviceUsagePolicy2;
            return this;
        }

        public final Builder setLogger(Logger logger2) {
            this.logger = logger2;
            return this;
        }

        public final Builder setOnMuteListener(OnMuteListener onMuteListener2) {
            this.onMuteListener = onMuteListener2;
            return this;
        }

        public final Builder setProximityTracker(ProximityTracker proximityTracker2) {
            if (proximityTracker2 == null) {
                proximityTracker2 = ProximityTracker.Companion.getNOOP$calls_audiomanager_release();
            }
            this.proximityTracker = proximityTracker2;
            return this;
        }

        public final Builder setTrackProximityWhenSpeakerEnabled(boolean z) {
            this.trackProximityWhenSpeakerEnabled = z;
            return this;
        }

        public final Builder setVideoTracker(VideoTracker videoTracker2) {
            this.videoTracker = videoTracker2;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$DisabledAudioDeviceUsagePolicy;", "", "isAvailableForAutoSelect", "", "deviceType", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface DisabledAudioDeviceUsagePolicy {
        boolean isAvailableForAutoSelect(AudioDeviceType audioDeviceType) {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "", "onAudioDeviceChanged", "", "event", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceInfoChangedEvent;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnAudioDeviceInfoChangeListener {
        void onAudioDeviceChanged(AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "", "onMute", "", "mute", "", "onMutedForever", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnMuteListener {
        void onMute(boolean z);

        void onMutedForever();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "", "(Ljava/lang/String;I)V", "IDLE", "DIALING", "RINGING", "CONVERSATION", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum State {
        IDLE,
        DIALING,
        RINGING,
        CONVERSATION;

        static {
            State[] $values;
            $ENTRIES = EnumEntriesKt.enumEntries((E[]) $values);
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }
    }

    static /* synthetic */ void changeStateAsync$default(CallsAudioManager callsAudioManager, State state, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            callsAudioManager.changeStateAsync(state, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeStateAsync");
    }

    static /* synthetic */ void releaseAsync$default(CallsAudioManager callsAudioManager, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            callsAudioManager.releaseAsync(function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: releaseAsync");
    }

    static /* synthetic */ void setAudioDeviceAsync$default(CallsAudioManager callsAudioManager, CallsAudioDeviceInfo callsAudioDeviceInfo, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            callsAudioManager.setAudioDeviceAsync(callsAudioDeviceInfo, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAudioDeviceAsync");
    }

    static /* synthetic */ void setAudioDeviceTypeAsync$default(CallsAudioManager callsAudioManager, AudioDeviceType audioDeviceType, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            callsAudioManager.setAudioDeviceTypeAsync(audioDeviceType, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAudioDeviceTypeAsync");
    }

    static /* synthetic */ void setSpeakerEnabledAsync$default(CallsAudioManager callsAudioManager, boolean z, boolean z2, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                function0 = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            callsAudioManager.setSpeakerEnabledAsync(z, z2, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSpeakerEnabledAsync");
    }

    void changeStateAsync(State state, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    List<CallsAudioDeviceInfo> getAvailableAudioDevices();

    CallsAudioDeviceInfo getCurrentDevice();

    void hasBluetoothHeadsetAsync(Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12);

    void hasWiredHeadsetAsync(Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12);

    boolean isHeadsetConnected();

    void notifyBluetoothPermissionGranted();

    void releaseAsync(Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void requestAudioFocusAsync();

    void setAudioDeviceAsync(CallsAudioDeviceInfo callsAudioDeviceInfo, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void setAudioDeviceTypeAsync(AudioDeviceType audioDeviceType, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void setOnAudioDeviceChangeListener(OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener);

    void setSpeakerEnabledAsync(boolean z, boolean z2, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);
}
