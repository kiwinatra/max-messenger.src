package defpackage;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: j7g  reason: default package */
public final class j7g extends qm implements lcf, hdb {
    public final String X;
    public final boolean Y;
    public final String Z = j7g.class.getName();
    public final long o;
    public final long v;
    public final Lazy v0 = LazyKt.lazy(new lce(17, this));
    public final long w;
    public final long x;
    public final String y;
    public final boolean z;

    public j7g(long j, long j2, long j3, long j4, long j5, String str, boolean z2, String str2, boolean z3) {
        super(j);
        this.o = j2;
        this.v = j3;
        this.w = j4;
        this.x = j5;
        this.y = str;
        this.z = z2;
        this.X = str2;
        this.Y = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = defpackage.qe9.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r4 = this;
            long r0 = r4.x
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x001a
            fa9 r4 = r4.o()
            ha9 r4 = r4.r(r0)
            if (r4 == 0) goto L_0x0018
            qe9 r0 = defpackage.qe9.DELETED
            qe9 r4 = r4.Y
            if (r4 != r0) goto L_0x001a
        L_0x0018:
            r4 = 3
            return r4
        L_0x001a:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j7g.b():int");
    }

    public final void c() {
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.VideoPlay videoPlay = new Tasks.VideoPlay();
        videoPlay.requestId = this.a;
        videoPlay.videoId = this.o;
        videoPlay.chatServerId = this.v;
        videoPlay.messageServerId = this.w;
        videoPlay.messageId = this.x;
        String str = this.y;
        if (str != null) {
            videoPlay.attachLocalId = str;
        }
        videoPlay.startDownload = this.z;
        videoPlay.token = this.X;
        return ad9.toByteArray(videoPlay);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [odf, java.lang.Object] */
    public final void e(ibf ibf) {
        k7g k7g = (k7g) ibf;
        if (this.z) {
            Map map = k7g.c;
            int i = j4b.A;
            if (map.size() != 1 || !map.containsKey("EXTERNAL")) {
                ? obj = new Object();
                obj.a = this.x;
                obj.b = this.y;
                obj.c = this.o;
                obj.g = j4b.y(k7g.c);
                obj.h = true;
                pdf pdf = new pdf(obj);
                rm rmVar = this.c;
                if (rmVar == null) {
                    rmVar = null;
                }
                ((uk5) rmVar.L.getValue()).a(pdf);
                return;
            }
            return;
        }
        k().c(new l7g(this.a, this.o, this.x, this.y, k7g.c));
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        return new jw9(this.o, this.v, this.w, this.X);
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_VIDEO_PLAY;
    }

    public final void h(qaf qaf) {
        ha9 r = o().r(this.x);
        if (r == null || r.Y == qe9.DELETED) {
            k().c(new hj0(this.a, qaf));
            c();
            return;
        }
        if (Intrinsics.areEqual((Object) "attachment.token.expired", (Object) qaf.b)) {
            z68.f(this.Z, "videoPlayCmd failed with token expired, retry videoPlayCmd", (Throwable) null);
            if (this.Y) {
                k().c(new hj0(this.a, qaf));
            } else {
                m7g m7g = (m7g) this.v0.getValue();
                synchronized (m7g) {
                    if (m7g.b == -1) {
                        m7g.a.k().d(m7g);
                        rl i = m7g.a.i();
                        j7g j7g = m7g.a;
                        m7g.b = ((jna) i).K(j7g.v, CollectionsKt.listOf(Long.valueOf(j7g.w)));
                    }
                }
            }
        } else if (Intrinsics.areEqual((Object) "video.not.found", (Object) qaf.b)) {
            z68.f(this.Z, "videoPlayCmd failed, set attach status to ERROR", (Throwable) null);
            o().x(this.x, this.y, new hxf(15));
            k().c(new twf(0, r.z, r.b));
        }
        if (!m58.A(qaf.b)) {
            c();
        }
    }
}
