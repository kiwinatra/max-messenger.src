package ru.ok.android.externcalls.sdk.audio.internal;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000bH\u0003J\b\u0010\u0018\u001a\u00020\u000fH\u0003J\b\u0010\u0019\u001a\u00020\u000fH\u0003J\b\u0010\u001a\u001a\u00020\u000fH\u0007J\b\u0010\u001b\u001a\u00020\u000fH\u0007J\b\u0010\u001c\u001a\u00020\u000fH\u0003R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "", "audioManager", "Landroid/media/AudioManager;", "onMuteListener", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "mainThreadHandler", "Landroid/os/Handler;", "workerThreadHandler", "isDestroyed", "Lkotlin/Function0;", "", "logger", "Lru/ok/android/externcalls/sdk/audio/Logger;", "onFocusLost", "", "onFocusGained", "(Landroid/media/AudioManager;Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;Landroid/os/Handler;Landroid/os/Handler;Lkotlin/jvm/functions/Function0;Lru/ok/android/externcalls/sdk/audio/Logger;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "isFocusGained", "handleFocusUpdate", "focusGained", "forever", "mute", "muteForever", "releaseFocus", "requestFocus", "unmute", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AudioFocusRequestHelper {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    public static final String TAG = "AudioFocusRequestHelper";
    private AudioFocusRequest audioFocusRequest;
    private final AudioManager audioManager;
    private final Function0<Boolean> isDestroyed;
    private boolean isFocusGained;
    private final Logger logger;
    private final Handler mainThreadHandler;
    private final Function0<Unit> onFocusGained;
    private final Function0<Unit> onFocusLost;
    private final CallsAudioManager.OnMuteListener onMuteListener;
    private final Handler workerThreadHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper$Companion;", "", "()V", "TAG", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AudioFocusRequestHelper(AudioManager audioManager2, CallsAudioManager.OnMuteListener onMuteListener2, Handler handler, Handler handler2, Function0<Boolean> function0, Logger logger2, Function0<Unit> function02, Function0<Unit> function03) {
        this.audioManager = audioManager2;
        this.onMuteListener = onMuteListener2;
        this.mainThreadHandler = handler;
        this.workerThreadHandler = handler2;
        this.isDestroyed = function0;
        this.logger = logger2;
        this.onFocusLost = function02;
        this.onFocusGained = function03;
    }

    private final void handleFocusUpdate(boolean z, boolean z2) {
        if (this.isFocusGained == z) {
            Logger logger2 = this.logger;
            logger2.d(TAG, "Focus state didn't change, ignore update to " + z);
            return;
        }
        this.isFocusGained = z;
        if (z) {
            this.onFocusGained.invoke();
            unmute();
            return;
        }
        this.onFocusLost.invoke();
        if (z2) {
            muteForever();
        } else {
            mute();
        }
    }

    public static /* synthetic */ void handleFocusUpdate$default(AudioFocusRequestHelper audioFocusRequestHelper, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        audioFocusRequestHelper.handleFocusUpdate(z, z2);
    }

    private final void mute() {
        if (!this.isDestroyed.invoke().booleanValue()) {
            this.mainThreadHandler.post(new r40(this, 1));
        }
    }

    /* access modifiers changed from: private */
    public static final void mute$lambda$4(AudioFocusRequestHelper audioFocusRequestHelper) {
        CallsAudioManager.OnMuteListener onMuteListener2 = audioFocusRequestHelper.onMuteListener;
        if (onMuteListener2 != null) {
            try {
                onMuteListener2.onMute(true);
            } catch (Throwable th) {
                audioFocusRequestHelper.logger.e(TAG, "Error raise mute event", th);
            }
        }
    }

    private final void muteForever() {
        if (!this.isDestroyed.invoke().booleanValue()) {
            this.mainThreadHandler.post(new r40(this, 0));
        }
    }

    /* access modifiers changed from: private */
    public static final void muteForever$lambda$6(AudioFocusRequestHelper audioFocusRequestHelper) {
        CallsAudioManager.OnMuteListener onMuteListener2 = audioFocusRequestHelper.onMuteListener;
        if (onMuteListener2 != null) {
            try {
                onMuteListener2.onMutedForever();
            } catch (Throwable th) {
                audioFocusRequestHelper.logger.e(TAG, "Error raise mute forever event", th);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void requestFocus$lambda$0(AudioFocusRequestHelper audioFocusRequestHelper, int i) {
        audioFocusRequestHelper.logger.d(TAG, i != -3 ? i != -2 ? i != -1 ? i != 1 ? String.valueOf(i) : "AUDIOFOCUS_GAIN" : "AUDIOFOCUS_LOSS" : "AUDIOFOCUS_LOSS_TRANSIENT" : "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK");
        if (i == -3 || i == -2) {
            handleFocusUpdate$default(audioFocusRequestHelper, false, false, 2, (Object) null);
        } else if (i == -1) {
            audioFocusRequestHelper.handleFocusUpdate(false, true);
        } else if (i != 1) {
            Logger logger2 = audioFocusRequestHelper.logger;
            logger2.e(TAG, "Unexpected audio focus change " + i);
        } else {
            handleFocusUpdate$default(audioFocusRequestHelper, true, false, 2, (Object) null);
        }
    }

    private final void unmute() {
        if (!this.isDestroyed.invoke().booleanValue()) {
            this.mainThreadHandler.post(new r40(this, 2));
        }
    }

    /* access modifiers changed from: private */
    public static final void unmute$lambda$8(AudioFocusRequestHelper audioFocusRequestHelper) {
        CallsAudioManager.OnMuteListener onMuteListener2 = audioFocusRequestHelper.onMuteListener;
        if (onMuteListener2 != null) {
            try {
                onMuteListener2.onMute(false);
            } catch (Throwable th) {
                audioFocusRequestHelper.logger.e(TAG, "Error raise unmute event", th);
            }
        }
    }

    public final void releaseFocus() {
        try {
            AudioFocusRequest audioFocusRequest2 = this.audioFocusRequest;
            if (audioFocusRequest2 != null) {
                this.audioManager.abandonAudioFocusRequest(audioFocusRequest2);
            }
        } catch (Throwable th) {
            this.logger.e(TAG, "Error while releasing audio focus request", th);
        }
        this.audioFocusRequest = null;
        this.isFocusGained = false;
    }

    public final void requestFocus() {
        if (this.isFocusGained) {
            this.logger.d(TAG, "Focus is already gained, ignore request");
            return;
        }
        releaseFocus();
        AudioFocusRequest build = new AudioFocusRequest.Builder(2).setAcceptsDelayedFocusGain(false).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setOnAudioFocusChangeListener(new s40(this), this.workerThreadHandler).build();
        AudioFocusRequest audioFocusRequest2 = null;
        try {
            if (this.audioManager.requestAudioFocus(build) == 1) {
                handleFocusUpdate$default(this, true, false, 2, (Object) null);
                this.logger.d(TAG, "Audio focus request granted");
            } else {
                this.logger.d(TAG, "Audio focus request failed");
                handleFocusUpdate$default(this, false, false, 2, (Object) null);
                build = null;
            }
            audioFocusRequest2 = build;
        } catch (Throwable th) {
            this.logger.e(TAG, "Audio focus request failed with error", th);
            handleFocusUpdate$default(this, false, false, 2, (Object) null);
        }
        this.audioFocusRequest = audioFocusRequest2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AudioFocusRequestHelper(android.media.AudioManager r12, ru.ok.android.externcalls.sdk.audio.CallsAudioManager.OnMuteListener r13, android.os.Handler r14, android.os.Handler r15, kotlin.jvm.functions.Function0 r16, ru.ok.android.externcalls.sdk.audio.Logger r17, kotlin.jvm.functions.Function0 r18, kotlin.jvm.functions.Function0 r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 64
            if (r1 == 0) goto L_0x000a
            ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper$1 r1 = ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper.AnonymousClass1.INSTANCE
            r9 = r1
            goto L_0x000c
        L_0x000a:
            r9 = r18
        L_0x000c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0014
            ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper$2 r0 = ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper.AnonymousClass2.INSTANCE
            r10 = r0
            goto L_0x0016
        L_0x0014:
            r10 = r19
        L_0x0016:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper.<init>(android.media.AudioManager, ru.ok.android.externcalls.sdk.audio.CallsAudioManager$OnMuteListener, android.os.Handler, android.os.Handler, kotlin.jvm.functions.Function0, ru.ok.android.externcalls.sdk.audio.Logger, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
