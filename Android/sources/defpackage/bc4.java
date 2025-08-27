package defpackage;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* renamed from: bc4  reason: default package */
public final class bc4 extends Thread {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bc4(Object obj, ConditionVariable conditionVariable, int i) {
        super("ExoPlayer:SimpleCacheInit");
        this.a = i;
        this.c = obj;
        this.b = conditionVariable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                rc4 rc4 = (rc4) this.c;
                AudioTrack audioTrack = (AudioTrack) this.b;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    return;
                } finally {
                    rc4.h.open();
                }
            case 1:
                synchronized (((sae) this.c)) {
                    ((ConditionVariable) this.b).open();
                    sae.a((sae) this.c);
                    ((sae) this.c).b.getClass();
                }
                return;
            default:
                synchronized (((tae) this.c)) {
                    ((ConditionVariable) this.b).open();
                    tae.a((tae) this.c);
                    ((tae) this.c).b.getClass();
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bc4(rc4 rc4, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.a = 0;
        this.c = rc4;
        this.b = audioTrack;
    }
}
