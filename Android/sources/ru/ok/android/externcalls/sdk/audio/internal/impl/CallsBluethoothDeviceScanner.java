package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.annotation.TargetApi;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0003\u0016\u0017\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0006\u0010\u0014\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0012H\u0003R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner;", "", "audioManagerHandler", "Landroid/os/Handler;", "listener", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$Listener;", "(Landroid/os/Handler;Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$Listener;)V", "audioManager", "Landroid/media/AudioManager;", "callback", "Landroid/media/AudioDeviceCallback;", "getCallback", "()Landroid/media/AudioDeviceCallback;", "callback$delegate", "Lkotlin/Lazy;", "createCallback", "createCallbackM", "start", "", "startApiM", "stop", "stopApiM", "BluetoothDeviceIntent", "Companion", "Listener", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CallsBluethoothDeviceScanner {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private AudioManager audioManager;
    private final Handler audioManagerHandler;
    private final Lazy callback$delegate = LazyKt.lazy(new CallsBluethoothDeviceScanner$callback$2(this));
    /* access modifiers changed from: private */
    public final Listener listener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$BluetoothDeviceIntent;", "", "id", "", "name", "", "(ILjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "toString", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BluetoothDeviceIntent {
        private final int id;
        private final String name;

        public BluetoothDeviceIntent(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public final int getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public String toString() {
            int i = this.id;
            String str = this.name;
            return i + ":" + str;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$Companion;", "", "()V", "isSupported", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final boolean isSupported() {
            return true;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$Listener;", "", "onDeviceAvailable", "", "device", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$BluetoothDeviceIntent;", "onDeviceUnavailable", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {
        boolean onDeviceAvailable(BluetoothDeviceIntent bluetoothDeviceIntent);

        boolean onDeviceUnavailable(BluetoothDeviceIntent bluetoothDeviceIntent);
    }

    public CallsBluethoothDeviceScanner(Handler handler, Listener listener2) {
        this.audioManagerHandler = handler;
        this.listener = listener2;
    }

    /* access modifiers changed from: private */
    public final AudioDeviceCallback createCallback() {
        if (Companion.isSupported()) {
            return createCallbackM();
        }
        return null;
    }

    @TargetApi(23)
    private final AudioDeviceCallback createCallbackM() {
        return new CallsBluethoothDeviceScanner$createCallbackM$1(this);
    }

    private final AudioDeviceCallback getCallback() {
        return (AudioDeviceCallback) this.callback$delegate.getValue();
    }

    @JvmStatic
    public static final boolean isSupported() {
        return Companion.isSupported();
    }

    @TargetApi(23)
    private final void startApiM(AudioManager audioManager2) {
        AudioDeviceCallback callback = getCallback();
        if (callback != null) {
            audioManager2.registerAudioDeviceCallback(callback, this.audioManagerHandler);
        }
        this.audioManager = audioManager2;
    }

    @TargetApi(23)
    private final void stopApiM() {
        AudioManager audioManager2;
        AudioDeviceCallback callback = getCallback();
        if (!(callback == null || (audioManager2 = this.audioManager) == null)) {
            audioManager2.unregisterAudioDeviceCallback(callback);
        }
        this.audioManager = null;
    }

    public final void start(AudioManager audioManager2) {
        if (Companion.isSupported() && audioManager2 != null) {
            startApiM(audioManager2);
        }
    }

    public final void stop() {
        if (Companion.isSupported()) {
            stopApiM();
        }
    }
}
