package defpackage;

import org.webrtc.JniCommon;

/* renamed from: jz8  reason: default package */
public final /* synthetic */ class jz8 implements Runnable {
    public final /* synthetic */ long a;

    public /* synthetic */ jz8(long j) {
        this.a = j;
    }

    public final void run() {
        JniCommon.nativeReleaseRef(this.a);
    }
}
