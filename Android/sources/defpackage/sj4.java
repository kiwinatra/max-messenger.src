package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import org.webrtc.MediaStreamTrack;

/* renamed from: sj4  reason: default package */
public final class sj4 extends pe8 implements q1d {
    public static final f5b j = f5b.a(new v00(20));
    public final Object c;
    public final Context d;
    public final pf6 e;
    public final boolean f;
    public ej4 g;
    public final lf6 h;
    public i30 i;

    public sj4(Context context) {
        this(context, new pf6(7));
    }

    public static int c(int i2, int i3) {
        return (i2 == 0 || i2 != i3) ? Integer.bitCount(i2 & i3) : IntCompanionObject.MAX_VALUE;
    }

    public static void d(upf upf, kqf kqf, HashMap hashMap) {
        for (int i2 = 0; i2 < upf.a; i2++) {
            dqf dqf = (dqf) kqf.A.get(upf.a(i2));
            if (dqf != null) {
                spf spf = dqf.a;
                dqf dqf2 = (dqf) hashMap.get(Integer.valueOf(spf.c));
                if (dqf2 == null || (dqf2.b.isEmpty() && !dqf.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(spf.c), dqf);
                }
            }
        }
    }

    public static int e(ea6 ea6, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(ea6.d)) {
            return 4;
        }
        String h2 = h(str);
        String h3 = h(ea6.d);
        if (h3 == null || h2 == null) {
            return (!z || h3 != null) ? 0 : 1;
        }
        if (h3.startsWith(h2) || h2.startsWith(h3)) {
            return 3;
        }
        int i2 = v0g.a;
        return h3.split("-", 2)[0].equals(h2.split("-", 2)[0]) ? 2 : 0;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean i(ej4 ej4, int i2, ea6 ea6) {
        if ((i2 & 3584) == 0) {
            return false;
        }
        gqf gqf = ej4.s;
        if (gqf.c && (i2 & 2048) == 0) {
            return false;
        }
        if (!gqf.b) {
            return true;
        }
        return !(ea6.E != 0 || ea6.F != 0) || ((i2 & 1024) != 0);
    }

    public static Pair j(int i2, ne8 ne8, int[][][] iArr, lj4 lj4, Comparator comparator) {
        Object obj;
        boolean z;
        ne8 ne82 = ne8;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < ne82.a) {
            if (i2 == ne82.b[i3]) {
                upf upf = ne82.c[i3];
                int i4 = 0;
                while (i4 < upf.a) {
                    spf a = upf.a(i4);
                    k0d j2 = lj4.j(i3, a, iArr[i3][i4]);
                    int i5 = a.a;
                    boolean[] zArr = new boolean[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        nj4 nj4 = (nj4) j2.get(i6);
                        int a2 = nj4.a();
                        if (!zArr[i6] && a2 != 0) {
                            if (a2 == 1) {
                                obj = tb7.t(nj4);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nj4);
                                int i7 = i6 + 1;
                                while (i7 < i5) {
                                    nj4 nj42 = (nj4) j2.get(i7);
                                    if (nj42.a() != 2 || !nj4.b(nj42)) {
                                        z = true;
                                    } else {
                                        arrayList2.add(nj42);
                                        z = true;
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    boolean z2 = z;
                                    ne8 ne83 = ne8;
                                }
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i6++;
                        ne8 ne84 = ne8;
                    }
                    i4++;
                    ne8 ne85 = ne8;
                }
            }
            lj4 lj42 = lj4;
            i3++;
            ne82 = ne8;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((nj4) list.get(i8)).c;
        }
        nj4 nj43 = (nj4) list.get(0);
        return Pair.create(new kd5(nj43.b, iArr2), Integer.valueOf(nj43.a));
    }

    public final void a(i30 i30) {
        boolean z;
        synchronized (this.c) {
            z = !this.i.equals(i30);
            this.i = i30;
        }
        if (z) {
            g();
        }
    }

    public final void b(kqf kqf) {
        if (kqf instanceof ej4) {
            k((ej4) kqf);
        }
        cj4 cj4 = new cj4(f());
        cj4.d(kqf);
        k(new ej4(cj4));
    }

    public final ej4 f() {
        ej4 ej4;
        synchronized (this.c) {
            ej4 = this.g;
        }
        return ej4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r1 = r3.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            ej4 r1 = r3.g     // Catch:{ all -> 0x001d }
            boolean r1 = r1.s0     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001f
            boolean r1 = r3.f     // Catch:{ all -> 0x001d }
            if (r1 != 0) goto L_0x001f
            int r1 = defpackage.v0g.a     // Catch:{ all -> 0x001d }
            r2 = 32
            if (r1 < r2) goto L_0x001f
            lf6 r1 = r3.h     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001f
            boolean r1 = r1.b     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001f
            r1 = 1
            goto L_0x0020
        L_0x001d:
            r3 = move-exception
            goto L_0x0031
        L_0x001f:
            r1 = 0
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0030
            lqf r3 = r3.a
            if (r3 == 0) goto L_0x0030
            fd5 r3 = (defpackage.fd5) r3
            k7f r3 = r3.y
            r0 = 10
            r3.f(r0)
        L_0x0030:
            return
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sj4.g():void");
    }

    public final void k(ej4 ej4) {
        boolean z;
        ej4.getClass();
        synchronized (this.c) {
            z = !this.g.equals(ej4);
            this.g = ej4;
        }
        if (z) {
            if (ej4.s0 && this.d == null) {
                i8b.V("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            lqf lqf = this.a;
            if (lqf != null) {
                ((fd5) lqf).y.f(10);
            }
        }
    }

    public sj4(Context context, pf6 pf6) {
        String str = ej4.z0;
        ej4 ej4 = new ej4(new cj4(context));
        this.c = new Object();
        lf6 lf6 = null;
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = pf6;
        this.g = ej4;
        this.i = i30.g;
        boolean z = context != null && v0g.P(context);
        this.f = z;
        if (!z && context != null && v0g.a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            this.h = audioManager != null ? new lf6(audioManager.getSpatializer()) : lf6;
        }
        if (this.g.s0 && context == null) {
            i8b.V("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
