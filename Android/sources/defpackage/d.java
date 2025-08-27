package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.EglBase;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoSink;

/* renamed from: d  reason: default package */
public final class d implements x48, lz9 {
    public final i8d A0;
    public final rjf B0;
    public final d9d C0;
    public final p1e D0;
    public dv1 E0 = null;
    public ykb F0;
    public final Integer X;
    public final voc Y;
    public final boolean Z;
    public final EglBase.Context a;
    public final py0 b;
    public final t6e c;
    public final j50 o;
    public final mz9 v;
    public final te1 v0;
    public final Context w;
    public final CopyOnWriteArraySet w0 = new CopyOnWriteArraySet();
    public final String x;
    public volatile v48 x0;
    public final String y;
    public volatile VideoSink y0;
    public final String z;
    public final l48 z0;

    public d(p6e p6e) {
        voc voc = p6e.e;
        this.Y = voc;
        this.c = p6e.a;
        this.o = p6e.b;
        this.X = p6e.j;
        this.w = p6e.d;
        this.v = p6e.c;
        this.a = p6e.l;
        this.Z = p6e.k;
        this.v0 = p6e.f;
        this.b = p6e.g;
        this.z0 = p6e.m;
        this.A0 = p6e.o;
        if (!TextUtils.isEmpty(p6e.i)) {
            this.y = wj6.n(new StringBuilder(), p6e.i, "v0");
            this.z = wj6.n(new StringBuilder(), p6e.i, "a0");
            this.x = p6e.i;
        } else {
            this.y = "ARDAMSv0";
            this.z = "ARDAMSa0";
            this.x = "ARDAMS";
        }
        voc.log("SlmsSource", "local media stream id = " + this.x + " local video track id = " + this.y + " local audio track id = " + this.z);
        this.B0 = p6e.n;
        this.C0 = p6e.p;
        this.D0 = p6e.h;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [u48, java.lang.Object] */
    public final qr0 a() {
        boolean z2 = this.x0 == null;
        if (z2) {
            ? obj = new Object();
            obj.o = false;
            obj.s = null;
            obj.t = false;
            obj.a = this.c.d;
            obj.c = this.c.a;
            obj.b = this.o;
            obj.e = this.x;
            obj.f = this.y;
            obj.g = this.z;
            obj.d = this.w.getApplicationContext();
            obj.h = this.Y;
            obj.i = this.a;
            obj.k = true;
            obj.j = this.b;
            obj.p = this.Z;
            te1 te1 = this.v0;
            obj.l = te1.s;
            l48 l48 = this.z0;
            obj.q = l48;
            obj.m = this.A0;
            obj.s = this.X;
            re1 re1 = te1.B;
            obj.t = re1.a;
            obj.o = re1.k;
            obj.n = this.B0;
            obj.r = this.D0;
            if (obj.a == null || l48 == null || obj.b == null || TextUtils.isEmpty(obj.e) || TextUtils.isEmpty(obj.f) || TextUtils.isEmpty(obj.g) || obj.h == null || obj.j == null || obj.i == null || obj.m == null || obj.n == null || obj.r == null) {
                throw new IllegalStateException();
            }
            this.x0 = new v48(obj);
            this.x0.x = this.F0;
            this.x0.c.add(this);
            if (this.E0 != null) {
                this.x0.l(this.E0);
            }
            VideoSink videoSink = this.y0;
            if (videoSink != null) {
                this.x0.k(videoSink);
            }
            this.x0.d(this.v);
            d9d d9d = this.C0;
            if (d9d != null) {
                v48 v48 = this.x0;
                v48.getClass();
                ((o9g) d9d.b).b = new t48(v48);
            }
        }
        return new qr0((Object) this.x0, z2);
    }

    public final void b(v48 v48) {
        this.Y.log("SlmsSource", "onLocalMediaStreamChanged");
        Iterator it = this.w0.iterator();
        while (it.hasNext()) {
            ((x48) it.next()).b(v48);
        }
    }

    public final int c() {
        v48 v48 = this.x0;
        if (v48 == null) {
            return 0;
        }
        mt1 mt1 = v48.r;
        if (mt1 != null && mt1.k) {
            MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) v48.y.v;
            if (mediaStreamTrack != null ? mediaStreamTrack.enabled() : false) {
                return mt1.i ? 1 : 2;
            }
        }
        ngd ngd = v48.t;
        if (ngd == null || !ngd.d) {
            return 0;
        }
        MediaStreamTrack mediaStreamTrack2 = (MediaStreamTrack) v48.z.v;
        return mediaStreamTrack2 != null ? mediaStreamTrack2.enabled() : false ? 3 : 0;
    }

    public final void j(mz9 mz9) {
        this.Y.log("SlmsSource", "onMediaSettingsChanged, " + mz9);
        this.c.a.execute(new c(1, this, mz9));
    }
}
