package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;

/* renamed from: qj3  reason: default package */
public abstract class qj3 implements z8b {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object o;
    public Object v;

    public qj3(yu9 yu9, voc voc, xab xab, wie wie) {
        this.a = yu9;
        this.b = voc;
        this.o = xab;
        this.c = new Handler(Looper.getMainLooper());
        this.v = wie;
    }

    public abstract void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack);

    public abstract void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack);

    public abstract void d();

    public abstract void e(ue1 ue1, String str);

    public abstract void f();

    public abstract MediaSource g();

    public abstract MediaStreamTrack h(String str, MediaSource mediaSource);

    public abstract Object i();

    public String j() {
        return getClass().getSimpleName();
    }

    public abstract void k(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

    public void l() {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.v;
        voc voc = (voc) this.c;
        if (mediaStreamTrack != null) {
            String j = j();
            voc.log(j, this + ": An attempt to create track, while got one, ignore");
        } else if (((MediaSource) this.o) != null) {
            String j2 = j();
            voc.log(j2, this + ": An attempt to create source, while got one, ignore");
        } else {
            MediaSource g = g();
            this.o = g;
            MediaStreamTrack h = g != null ? h((String) this.a, g) : null;
            this.v = h;
            if (h != null) {
                b((MediaStream) this.b, h);
            }
        }
    }

    public void m() {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.v;
        if (mediaStreamTrack != null) {
            c((MediaStream) this.b, mediaStreamTrack);
        }
        MediaStreamTrack mediaStreamTrack2 = (MediaStreamTrack) this.v;
        voc voc = (voc) this.c;
        if (mediaStreamTrack2 != null) {
            mediaStreamTrack2.dispose();
            String j = j();
            String c2 = ur9.c(mediaStreamTrack2);
            voc.log(j, this + ": " + c2 + " was disposed");
        }
        this.v = null;
        MediaSource mediaSource = (MediaSource) this.o;
        if (mediaSource != null) {
            mediaSource.dispose();
            String j2 = j();
            String c3 = ur9.c(mediaSource);
            voc.log(j2, this + ": " + c3 + " was disposed");
        }
        this.o = null;
    }

    public void n(cj3 cj3) {
        synchronized (this.c) {
            try {
                if (((LinkedHashSet) this.v).remove(cj3) && ((LinkedHashSet) this.v).isEmpty()) {
                    s();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(boolean z) {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.v;
        if (mediaStreamTrack != null) {
            mediaStreamTrack.setEnabled(z);
        }
    }

    public abstract void p(String str, ln1 ln1, List list);

    public void q(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.o;
            if (obj2 == null || !Intrinsics.areEqual(obj2, obj)) {
                this.o = obj;
                ((ky6) ((g6d) ((wdf) this.a)).o).execute(new ir1(14, CollectionsKt.toList((LinkedHashSet) this.v), this));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public abstract void r();

    public abstract void s();

    public void t(RtpSender rtpSender) {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.v;
        if (rtpSender != null && mediaStreamTrack != null && rtpSender.track() != mediaStreamTrack) {
            String j = j();
            String c2 = ur9.c(mediaStreamTrack);
            String c3 = ur9.c(rtpSender);
            ((voc) this.c).log(j, this + ": bind " + c2 + " with " + c3);
            rtpSender.setTrack(mediaStreamTrack, false);
        }
    }

    public qj3(String str, MediaStream mediaStream, voc voc) {
        this.a = str;
        this.b = mediaStream;
        this.c = voc;
    }

    public qj3(Context context, g6d g6d) {
        this.a = g6d;
        this.b = context.getApplicationContext();
        this.c = new Object();
        this.v = new LinkedHashSet();
    }
}
