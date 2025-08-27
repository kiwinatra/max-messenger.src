package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner;

@SourceDebugExtension({"SMAP\nCallsBluethoothDeviceScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallsBluethoothDeviceScanner.kt\nru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$createCallbackM$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,94:1\n13309#2,2:95\n13309#2,2:97\n*S KotlinDebug\n*F\n+ 1 CallsBluethoothDeviceScanner.kt\nru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$createCallbackM$1\n*L\n71#1:95,2\n80#1:97,2\n*E\n"})
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00032\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\n"}, d2 = {"ru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$createCallbackM$1", "Landroid/media/AudioDeviceCallback;", "onAudioDevicesAdded", "", "addedDevices", "", "Landroid/media/AudioDeviceInfo;", "([Landroid/media/AudioDeviceInfo;)V", "onAudioDevicesRemoved", "removedDevices", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CallsBluethoothDeviceScanner$createCallbackM$1 extends AudioDeviceCallback {
    final /* synthetic */ CallsBluethoothDeviceScanner this$0;

    public CallsBluethoothDeviceScanner$createCallbackM$1(CallsBluethoothDeviceScanner callsBluethoothDeviceScanner) {
        this.this$0 = callsBluethoothDeviceScanner;
    }

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (audioDeviceInfoArr != null) {
            CallsBluethoothDeviceScanner callsBluethoothDeviceScanner = this.this$0;
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 7) {
                    boolean onDeviceAvailable = callsBluethoothDeviceScanner.listener.onDeviceAvailable(new CallsBluethoothDeviceScanner.BluetoothDeviceIntent(audioDeviceInfo.getId(), audioDeviceInfo.getProductName().toString()));
                }
            }
        }
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (audioDeviceInfoArr != null) {
            CallsBluethoothDeviceScanner callsBluethoothDeviceScanner = this.this$0;
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 7) {
                    boolean onDeviceUnavailable = callsBluethoothDeviceScanner.listener.onDeviceUnavailable(new CallsBluethoothDeviceScanner.BluetoothDeviceIntent(audioDeviceInfo.getId(), audioDeviceInfo.getProductName().toString()));
                }
            }
        }
    }
}
