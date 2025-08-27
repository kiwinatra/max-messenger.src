package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import android.media.AudioDeviceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CallsAudioManagerV3Impl$onCommunicationDeviceChanged$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ AudioDeviceInfo $device;
    final /* synthetic */ CallsAudioManagerV3Impl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallsAudioManagerV3Impl$onCommunicationDeviceChanged$1(CallsAudioManagerV3Impl callsAudioManagerV3Impl, AudioDeviceInfo audioDeviceInfo) {
        super(0);
        this.this$0 = callsAudioManagerV3Impl;
        this.$device = audioDeviceInfo;
    }

    public final void invoke() {
        CallsAudioManager.AudioDeviceType audioDeviceType;
        this.this$0.cancelScheduledSyncWithSystemCommunicationDevice();
        CallsAudioDeviceInfo access$getDeviceForAndroidDevice = this.this$0.getDeviceForAndroidDevice(this.$device);
        CharSequence charSequence = null;
        if (access$getDeviceForAndroidDevice == null || access$getDeviceForAndroidDevice.getDeviceType() == (audioDeviceType = CallsAudioManager.AudioDeviceType.BLUETOOTH) || this.this$0.usedDevice.getDeviceType() != audioDeviceType) {
            this.this$0.cancelScheduledTrySetCommunicationDeviceAgain();
            Logger access$getLogger$p = this.this$0.logger;
            AudioDeviceInfo audioDeviceInfo = this.$device;
            Integer valueOf = audioDeviceInfo != null ? Integer.valueOf(audioDeviceInfo.getId()) : null;
            AudioDeviceInfo audioDeviceInfo2 = this.$device;
            Integer valueOf2 = audioDeviceInfo2 != null ? Integer.valueOf(audioDeviceInfo2.getType()) : null;
            AudioDeviceInfo audioDeviceInfo3 = this.$device;
            if (audioDeviceInfo3 != null) {
                charSequence = audioDeviceInfo3.getProductName();
            }
            access$getLogger$p.d(CallsAudioManagerV3Impl.TAG, "Communication device did change to " + valueOf + ":" + valueOf2 + ":" + charSequence);
            this.this$0.handleCurrentCommunicationDevice(this.$device);
            return;
        }
        Logger access$getLogger$p2 = this.this$0.logger;
        AudioDeviceInfo audioDeviceInfo4 = this.$device;
        Integer valueOf3 = audioDeviceInfo4 != null ? Integer.valueOf(audioDeviceInfo4.getId()) : null;
        AudioDeviceInfo audioDeviceInfo5 = this.$device;
        Integer valueOf4 = audioDeviceInfo5 != null ? Integer.valueOf(audioDeviceInfo5.getType()) : null;
        AudioDeviceInfo audioDeviceInfo6 = this.$device;
        if (audioDeviceInfo6 != null) {
            charSequence = audioDeviceInfo6.getProductName();
        }
        access$getLogger$p2.d(CallsAudioManagerV3Impl.TAG, "Unexpected device reported by system " + valueOf3 + ":" + valueOf4 + ":" + charSequence);
        this.this$0.scheduleSyncWithSystemCommunicationDevice();
    }
}
