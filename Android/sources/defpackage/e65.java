package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: e65  reason: default package */
public final class e65 extends MediaCodec.Callback {
    public final gy8 a;
    public final boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public long f = 0;
    public long g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public final /* synthetic */ g65 k;

    /* JADX WARNING: type inference failed for: r1v8, types: [gy8, java.lang.Object] */
    public e65(g65 g65) {
        this.k = g65;
        if (g65.c) {
            ejd ejd = g65.q;
            xjf xjf = g65.p;
            ? obj = new Object();
            obj.o = -1;
            obj.a = ejd;
            obj.b = xjf;
            obj.c = (CameraUseInconsistentTimebaseQuirk) on4.a.g(CameraUseInconsistentTimebaseQuirk.class);
            this.a = obj;
        } else {
            this.a = null;
        }
        if (((CodecStuckOnFlushQuirk) on4.a.g(CodecStuckOnFlushQuirk.class)) != null && "video/mp4v-es".equals(g65.d.getString("mime"))) {
            this.b = false;
        }
    }

    public final void a() {
        g65 g65;
        r55 r55;
        Executor executor;
        if (!this.e) {
            this.e = true;
            Future future = this.k.C;
            if (future != null) {
                future.cancel(false);
                this.k.C = null;
            }
            synchronized (this.k.b) {
                g65 = this.k;
                r55 = g65.r;
                executor = g65.s;
            }
            g65.l(new x55(this, executor, r55));
        }
    }

    public final void b(h55 h55, r55 r55, Executor executor) {
        g65 g65 = this.k;
        g65.n.add(h55);
        hd8.a(hd8.J(h55.v), new npg(this, h55, false, 11), g65.h);
        try {
            executor.execute(new bk4(20, r55, h55));
        } catch (RejectedExecutionException unused) {
            h55.close();
        }
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.k.h.execute(new bk4(17, this, codecException));
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        this.k.h.execute(new l40(this, i2, 8));
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        this.k.h.execute(new w55((Object) this, (Object) bufferInfo, (Object) mediaCodec, i2, 1));
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.k.h.execute(new bk4(18, this, mediaFormat));
    }
}
