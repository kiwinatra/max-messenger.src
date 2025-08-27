package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.ExoPlaybackException;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: dy  reason: default package */
public final /* synthetic */ class dy implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Handler.Callback c;

    public /* synthetic */ dy(Object obj, Handler.Callback callback, int i) {
        this.a = i;
        this.b = obj;
        this.c = callback;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.a) {
            case 0:
                ((fy) this.b).getClass();
                ho8 ho8 = (ho8) this.c;
                ho8.getClass();
                if (t0g.a < 30) {
                    Handler handler = ho8.b;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    return;
                }
                io8 io8 = (io8) ho8.c;
                if (ho8 == io8.v2) {
                    if (j == LongCompanionObject.MAX_VALUE) {
                        io8.H1 = true;
                        return;
                    }
                    try {
                        io8.q0(j);
                        io8.y0();
                        io8.J1.f++;
                        io8.x0();
                        io8.a0(j);
                        return;
                    } catch (ExoPlaybackException e) {
                        io8.I1 = e;
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ((gy) this.b).getClass();
                ho8 ho82 = (ho8) this.c;
                ho82.getClass();
                if (v0g.a < 30) {
                    Handler handler2 = ho82.b;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                }
                ho82.a(j);
                return;
            case 2:
                ((o5h) this.b).getClass();
                ho8 ho83 = (ho8) this.c;
                ho83.getClass();
                if (t0g.a < 30) {
                    Handler handler3 = ho83.b;
                    handler3.sendMessageAtFrontOfQueue(Message.obtain(handler3, 0, (int) (j >> 32), (int) j));
                    return;
                }
                io8 io82 = (io8) ho83.c;
                if (ho83 == io82.v2) {
                    if (j == LongCompanionObject.MAX_VALUE) {
                        io82.H1 = true;
                        return;
                    }
                    try {
                        io82.q0(j);
                        io82.y0();
                        io82.J1.f++;
                        io82.x0();
                        io82.a0(j);
                        return;
                    } catch (ExoPlaybackException e2) {
                        io82.I1 = e2;
                        return;
                    }
                } else {
                    return;
                }
            default:
                ((w28) this.b).getClass();
                ho8 ho84 = (ho8) this.c;
                ho84.getClass();
                if (v0g.a < 30) {
                    Handler handler4 = ho84.b;
                    handler4.sendMessageAtFrontOfQueue(Message.obtain(handler4, 0, (int) (j >> 32), (int) j));
                    return;
                }
                ho84.a(j);
                return;
        }
    }
}
