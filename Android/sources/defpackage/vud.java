package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import kotlin.collections.CollectionsKt;
import kotlin.time.DurationKt;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: vud  reason: default package */
public final class vud extends gud implements hdb, c68 {
    public final long b;
    public final long c;
    public final boolean o;
    public final String v = vud.class.getName();
    public long w;
    public or7 x;

    public vud(long j, long j2, boolean z) {
        this.b = j;
        this.c = j2;
        this.o = z;
    }

    public final void A() {
        String str = this.v;
        z68.c(str, "Reach max timeout", new Object[0]);
        l().d(this);
        s().d(this.b);
        fa9 o2 = o();
        long j = this.c;
        ha9 r = o2.r(j);
        if (r != null && r.Y != qe9.DELETED) {
            l20 a = r.a(g20.v0);
            long j2 = r.z;
            if (a != null) {
                o().z(r, oa9.ERROR);
                o().w(r, a.q, d20.b);
                u().c(new twf(0, r.z, this.c));
                r62 e = e();
                if (!e.k.contains(Long.valueOf(j2))) {
                    m().d(r.z, r.o, this.c);
                    return;
                }
                return;
            }
            z68.f(str, "Reach max timeout: WTF, no location attach in message", (Throwable) null);
            fa9 o3 = o();
            o3.getClass();
            o3.d(j2, Collections.singletonList(Long.valueOf(j)));
            u().c(new kv9(j2, CollectionsKt.listOf(Long.valueOf(j)), (bl4) null));
        }
    }

    public final void B(s58 s58) {
        z68.c(this.v, "onSuccess: %s", s58);
        jbd.c(this.x);
        l().d(this);
        jbd.a.r(new p00(20, this, s58), new d6a(6, (Object) this));
    }

    public final void L(s58 s58) {
        int i;
        String str = this.v;
        z68.c(str, "onLocation: %s", s58);
        if (this.o) {
            B(s58);
            return;
        }
        hud hud = this.a;
        if (hud == null) {
            hud = null;
        }
        ((fn4) hud.d.getValue()).getClass();
        if (SystemClock.elapsedRealtime() - this.w > ((long) 30000)) {
            z68.c(str, "onLocation: accuracy timeout reached, use minRequiredAccuracy", new Object[0]);
            i = HttpStatus.SC_MULTIPLE_CHOICES;
        } else {
            i = 30;
        }
        float f = s58.o;
        if (f < ((float) i)) {
            B(s58);
        } else {
            z68.c(str, "onLocation: accuracy %f is not enough, continue listening for location updates", Float.valueOf(f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = defpackage.qe9.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r3 = this;
            fa9 r0 = r3.o()
            long r1 = r3.c
            ha9 r3 = r0.r(r1)
            if (r3 == 0) goto L_0x001b
            qe9 r0 = defpackage.qe9.DELETED
            qe9 r1 = r3.Y
            if (r1 == r0) goto L_0x001b
            boolean r3 = r3.B()
            if (r3 != 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 1
            return r3
        L_0x001b:
            r3 = 3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vud.b():int");
    }

    public final void c() {
        z68.c(this.v, "onMaxFailCount: remove task, mark message as error", new Object[0]);
        jbd.c(this.x);
        ha9 r = o().r(this.c);
        if (r != null) {
            o().z(r, oa9.ERROR);
            l().d(this);
            s().d(this.b);
        }
    }

    public final byte[] d() {
        Tasks.LocationRequest locationRequest = new Tasks.LocationRequest();
        locationRequest.requestId = this.b;
        locationRequest.messageId = this.c;
        locationRequest.liveLocation = this.o;
        return ad9.toByteArray(locationRequest);
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final long getId() {
        return this.b;
    }

    public final idb getType() {
        return idb.TYPE_LOCATION_REQUEST;
    }

    public final void w() {
        z68.c(this.v, "onServiceNotAvailable, fail task", new Object[0]);
        l().d(this);
        jbd.a(new uud(this, 0), ((kbf) r()).a(), (x6) null, new z3a(6, this), (lfd) null);
        jbd.c(this.x);
        A();
    }

    public final void z() {
        z68.c(this.v, "Process request location for message: " + this.c, new Object[0]);
        hud hud = this.a;
        if (hud == null) {
            hud = null;
        }
        ((fn4) hud.d.getValue()).getClass();
        this.w = SystemClock.elapsedRealtime();
        l().b(this);
        jbd.c(this.x);
        if (!this.o) {
            this.x = jbd.e((long) 60000, new uud(this, 1), new ykb(4, this));
        }
    }
}
