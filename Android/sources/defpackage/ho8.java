package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: ho8  reason: default package */
public final class ho8 implements Handler.Callback {
    public final /* synthetic */ int a = 0;
    public final Handler b;
    public final /* synthetic */ Object c;

    public ho8(io8 io8, hn8 hn8) {
        this.c = io8;
        Handler m = t0g.m(this);
        this.b = m;
        hn8.q(this, m);
    }

    public void a(long j) {
        Surface surface;
        jo8 jo8 = (jo8) this.c;
        if (this == jo8.s2 && jo8.U0 != null) {
            if (j == LongCompanionObject.MAX_VALUE) {
                jo8.H1 = true;
                return;
            }
            try {
                jo8.y0(j);
                jo8.E0(jo8.n2);
                jo8.J1.f++;
                y5g y5g = jo8.T1;
                boolean z = y5g.e != 3;
                y5g.e = 3;
                y5g.l.getClass();
                y5g.g = v0g.S(SystemClock.elapsedRealtime());
                if (z && (surface = jo8.b2) != null) {
                    m8g m8g = jo8.Q1;
                    Handler handler = (Handler) m8g.a;
                    if (handler != null) {
                        handler.post(new ca2((Object) m8g, (Object) surface, SystemClock.elapsedRealtime(), 8));
                    }
                    jo8.e2 = true;
                }
                jo8.g0(j);
            } catch (ExoPlaybackException e) {
                jo8.I1 = e;
            }
        }
    }

    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                int i = message.arg1;
                int i2 = message.arg2;
                int i3 = t0g.a;
                long j = (((long) i2) & 4294967295L) | ((((long) i) & 4294967295L) << 32);
                io8 io8 = (io8) this.c;
                if (this != io8.v2) {
                    return true;
                }
                if (j == LongCompanionObject.MAX_VALUE) {
                    io8.H1 = true;
                    return true;
                }
                try {
                    io8.q0(j);
                    io8.y0();
                    io8.J1.f++;
                    io8.x0();
                    io8.a0(j);
                    return true;
                } catch (com.google.android.exoplayer2.ExoPlaybackException e) {
                    io8.I1 = e;
                    return true;
                }
            default:
                if (message.what != 0) {
                    return false;
                }
                int i4 = message.arg1;
                int i5 = message.arg2;
                int i6 = v0g.a;
                a((((long) i5) & 4294967295L) | ((((long) i4) & 4294967295L) << 32));
                return true;
        }
    }

    public ho8(jo8 jo8, in8 in8) {
        this.c = jo8;
        Handler o = v0g.o(this);
        this.b = o;
        in8.t(this, o);
    }
}
