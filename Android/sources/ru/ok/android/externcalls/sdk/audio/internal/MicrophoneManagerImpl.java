package ru.ok.android.externcalls.sdk.audio.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R$\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00058V@VX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/MicrophoneManagerImpl;", "Lru/ok/android/externcalls/sdk/audio/MicrophoneManager;", "Lhz0;", "call", "Lkotlin/Function0;", "", "isPrepared", "<init>", "(Lhz0;Lkotlin/jvm/functions/Function0;)V", "", "delay", "Lmq9;", "callback", "", "registerAudioSampleCallback", "(JLmq9;)V", "removeAudioSampleCallback", "(Lmq9;)V", "Lhz0;", "Lkotlin/jvm/functions/Function0;", "value", "isMicEnabled", "()Z", "setMicEnabled", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class MicrophoneManagerImpl implements MicrophoneManager {
    private final hz0 call;
    private final Function0<Boolean> isPrepared;

    public MicrophoneManagerImpl(hz0 hz0, Function0<Boolean> function0) {
        this.call = hz0;
        this.isPrepared = function0;
    }

    public boolean isMicEnabled() {
        return this.call.w1.e;
    }

    public void registerAudioSampleCallback(long j, mq9 mq9) {
        t6e t6e = this.call.i1;
        t6e.getClass();
        t6e.a.execute(new ca2((Object) t6e, (Object) mq9, j, 6));
    }

    public void removeAudioSampleCallback(mq9 mq9) {
        t6e t6e = this.call.i1;
        t6e.getClass();
        t6e.a.execute(new s6e(0, t6e, mq9));
    }

    public void setMicEnabled(boolean z) {
        if (this.isPrepared.invoke().booleanValue()) {
            this.call.E(!z);
        }
    }
}
