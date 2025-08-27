package defpackage;

import android.os.HandlerThread;

/* renamed from: ey  reason: default package */
public final /* synthetic */ class ey implements s2f {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ ey(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(fy.d(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 1:
                return new HandlerThread(gy.p(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 2:
                return new HandlerThread(fy.d(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
            default:
                return new HandlerThread(gy.p(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
