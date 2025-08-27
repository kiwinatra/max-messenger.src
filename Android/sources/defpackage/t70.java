package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.util.Set;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: t70  reason: default package */
public final class t70 implements ez6 {
    public long a;
    public long b;
    public long c;
    public final Object o;
    public final Object v;

    public t70(Lazy lazy, long j, long j2, long j3, Set set) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = set;
        this.v = lazy;
    }

    public dz6 k() {
        yc2 yc2 = new yc2(this, (Continuation) null);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        a32 a32 = (a32) ev0.C(emptyCoroutineContext, yc2);
        return new zc2((z62) ev0.C(emptyCoroutineContext, new ad2(this, a32, (Continuation) null)), a32, this);
    }

    public t70(AudioTrack audioTrack) {
        this.o = audioTrack;
        this.v = new AudioTimestamp();
    }
}
