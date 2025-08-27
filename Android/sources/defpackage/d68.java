package defpackage;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpStatus;

/* renamed from: d68  reason: default package */
public final /* synthetic */ class d68 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e68 b;

    public /* synthetic */ d68(e68 e68, int i) {
        this.a = i;
        this.b = e68;
    }

    public final void run() {
        Class<kt6> cls = kt6.class;
        boolean z = false;
        int i = this.a;
        e68 e68 = this.b;
        e68.getClass();
        switch (i) {
            case 0:
                z68.c("e68", "stop", new Object[0]);
                AtomicBoolean atomicBoolean = e68.a;
                if (!atomicBoolean.get()) {
                    z68.c("e68", "stop: not started, return", new Object[0]);
                }
                atomicBoolean.set(false);
                lt6 lt6 = e68.b;
                HashMap hashMap = lt6.b;
                kt6 kt6 = (kt6) hashMap.get(e68);
                if (kt6 != null) {
                    swg swg = lt6.a;
                    swg.getClass();
                    String simpleName = cls.getSimpleName();
                    vzg.j(simpleName, "Listener type must not be empty");
                    swg.b(new f08(kt6, simpleName), 2418).j(ep4.v, mz4.y);
                    hashMap.remove(e68);
                    return;
                }
                return;
            default:
                z68.c("e68", "start", new Object[0]);
                if (e68.a.get()) {
                    z68.c("e68", "start: already started, return", new Object[0]);
                }
                if (!n54.e(e68.d, n54.k)) {
                    z68.c("e68", "start: no permissions", new Object[0]);
                    e68.c.w();
                    return;
                }
                lt6 lt62 = e68.b;
                y58 a2 = e68.a();
                lt62.getClass();
                LocationRequest locationRequest = new LocationRequest();
                int i2 = a2.b;
                if (i2 != 0) {
                    int y = tr1.y(i2);
                    int i3 = 105;
                    if (y != 0) {
                        if (y == 1) {
                            i3 = HttpStatus.SC_PROCESSING;
                        } else if (y != 2) {
                            Locale locale = Locale.ENGLISH;
                            int i4 = a2.b;
                            z68.f("lt6", "Unknown priority " + wj6.u(i4) + " set to PRIORITY_NO_POWER", (Throwable) null);
                        } else {
                            i3 = 100;
                        }
                    }
                    iq.i0(i3);
                    locationRequest.a = i3;
                }
                Long l = a2.c;
                if (l != null) {
                    long longValue = l.longValue();
                    vzg.f("intervalMillis must be greater than or equal to 0", longValue >= 0);
                    long j = locationRequest.c;
                    long j2 = locationRequest.b;
                    if (j == j2 / 6) {
                        locationRequest.c = longValue / 6;
                    }
                    if (locationRequest.z == j2) {
                        locationRequest.z = longValue;
                    }
                    locationRequest.b = longValue;
                }
                Long l2 = a2.d;
                if (l2 != null) {
                    long longValue2 = l2.longValue();
                    Object[] objArr = {l2};
                    if (longValue2 >= 0) {
                        z = true;
                    }
                    vzg.g(z, "illegal fastest interval: %d", objArr);
                    locationRequest.c = longValue2;
                }
                kt6 kt62 = new kt6(e68);
                swg swg2 = lt62.a;
                swg2.getClass();
                Looper myLooper = Looper.myLooper();
                vzg.n(myLooper, "invalid null looper");
                o15 o15 = new o15(myLooper, kt62, cls.getSimpleName());
                he heVar = new he(swg2, o15);
                nbg nbg = new nbg(heVar, locationRequest);
                m7h m7h = new m7h();
                m7h.b = nbg;
                m7h.o = heVar;
                m7h.v = o15;
                m7h.c = 2436;
                f08 f08 = (f08) o15.c;
                vzg.n(f08, "Key must not be null");
                o15 o152 = (o15) m7h.v;
                int i5 = m7h.c;
                fj fjVar = new fj(m7h, o152, i5);
                d6a d6a = new d6a(m7h, f08);
                vzg.n((f08) o152.c, "Listener has already been released.");
                ht6 ht6 = swg2.X;
                ht6.getClass();
                qdf qdf = new qdf();
                ht6.e(qdf, i5, swg2);
                vvg vvg = new vvg(new jwg(new wvg(fjVar, d6a), qdf), ht6.z.get(), swg2);
                ws9 ws9 = ht6.v0;
                ws9.sendMessage(ws9.obtainMessage(8, vvg));
                lt62.b.put(e68, kt62);
                e68.a.set(true);
                return;
        }
    }
}
