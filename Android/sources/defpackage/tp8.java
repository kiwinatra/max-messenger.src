package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: tp8  reason: default package */
public final class tp8 implements po8 {
    public final Context a;
    public final qo8 b;
    public final oxd c;
    public final m56 d;
    public final rp8 e;
    public final fo0 f;
    public xe8 g;
    public lm8 h;
    public boolean i;
    public boolean j;
    public sp8 k = new sp8();
    public sp8 l = new sp8();
    public ni3 m;
    public long n;
    public long o;

    /* JADX WARNING: type inference failed for: r0v2, types: [ni3, java.lang.Object] */
    public tp8(Context context, qo8 qo8, oxd oxd, Looper looper, ox0 ox0) {
        ? obj = new Object();
        obj.a = ppb.F.l(bbc.g);
        obj.b = zvd.b;
        obj.c = pob.b;
        obj.d = k0d.v;
        obj.e = Bundle.EMPTY;
        obj.f = null;
        this.m = obj;
        this.d = new m56(looper, c7f.a, (k08) new pp8(this));
        this.a = context;
        this.b = qo8;
        this.e = new rp8(this, looper);
        this.c = oxd;
        this.f = ox0;
        this.n = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    public static List I0(List list) {
        if (list == null) {
            return Collections.emptyList();
        }
        fj fjVar = kne.l;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static mob J0(mob mob) {
        mob mob2 = mob;
        if (mob2 == null) {
            return null;
        }
        if (mob2.o > c44.DEFAULT_ASPECT_RATIO) {
            return mob2;
        }
        i8b.V("Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList arrayList = new ArrayList();
        AbstractCollection abstractCollection = mob2.z;
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        return new mob(mob2.a, mob2.b, mob2.c, 1.0f, mob2.v, mob2.w, mob2.x, mob2.y, arrayList, mob2.X, mob2.Y);
    }

    public static uob K0(int i2, ir8 ir8, long j2, boolean z) {
        return new uob((Object) null, i2, ir8, (Object) null, i2, j2, j2, z ? 0 : -1, z ? 0 : -1);
    }

    public final void A() {
        P0(d0(), 0);
    }

    public final long A0() {
        return ((ppb) this.m.a).A;
    }

    public final i30 B() {
        return ((ppb) this.m.a).o;
    }

    public final zvd B0() {
        return (zvd) this.m.b;
    }

    public final void C(int i2, boolean z) {
        if (v0g.a < 23) {
            i8b.V("Session doesn't support setting mute state at API level less than 23");
            return;
        }
        if (z != m0()) {
            ppb c2 = ((ppb) this.m.a).c(i(), z);
            ni3 ni3 = this.m;
            S0(new ni3(c2, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, (Bundle) ni3.e, (iwd) null), (Integer) null, (Integer) null);
        }
        ((uo8) this.g.b).a.adjustVolume(z ? -100 : 100, i2);
    }

    public final int C0() {
        return -1;
    }

    public final in4 D() {
        return ((ppb) this.m.a).q;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [zz7, java.lang.Object] */
    public final zz7 D0(yvd yvd, Bundle bundle) {
        zvd zvd = (zvd) this.m.b;
        zvd.getClass();
        boolean contains = zvd.a.contains(yvd);
        String str = yvd.b;
        if (contains) {
            this.g.r().T(str, bundle);
            return o5a.F(new swd(0));
        }
        ? obj = new Object();
        so8 so8 = new so8(1, this.b.v, obj);
        xe8 xe8 = this.g;
        xe8.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((uo8) xe8.b).a.sendCommand(str, bundle, so8);
            return obj;
        }
        throw new IllegalArgumentException("command must neither be null nor empty");
    }

    public final void E() {
        V(1);
    }

    public final int E0() {
        return -1;
    }

    public final void F(int i2, int i3) {
        int i4;
        in4 D = D();
        if (D.b <= i2 && ((i4 = D.c) == 0 || i2 <= i4)) {
            ppb c2 = ((ppb) this.m.a).c(i2, m0());
            ni3 ni3 = this.m;
            S0(new ni3(c2, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, (Bundle) ni3.e, (iwd) null), (Integer) null, (Integer) null);
        }
        ((uo8) this.g.b).a.setVolumeTo(i2, i3);
    }

    public final void F0(ir8 ir8) {
        p(ir8, -9223372036854775807L);
    }

    public final boolean G() {
        return this.j;
    }

    public final tb7 G0() {
        return (tb7) this.m.d;
    }

    public final void H(int i2) {
        int i3 = i();
        int i4 = D().c;
        if (i4 == 0 || i3 + 1 <= i4) {
            ppb c2 = ((ppb) this.m.a).c(i3 + 1, m0());
            ni3 ni3 = this.m;
            S0(new ni3(c2, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, (Bundle) ni3.e, (iwd) null), (Integer) null, (Integer) null);
        }
        ((uo8) this.g.b).a.adjustVolume(1, i2);
    }

    public final void H0(int i2, List list) {
        ArrayList arrayList = new ArrayList();
        uy0 uy0 = new uy0(this, new AtomicInteger(0), list, arrayList, i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            byte[] bArr = ((ir8) list.get(i3)).d.k;
            if (bArr == null) {
                arrayList.add((Object) null);
                uy0.run();
            } else {
                zz7 n2 = this.f.n(bArr);
                arrayList.add(n2);
                Handler handler = this.b.v;
                Objects.requireNonNull(handler);
                n2.d(uy0, new oc4(handler, 0));
            }
        }
    }

    public final int I() {
        return -1;
    }

    public final void J(kqf kqf) {
    }

    public final void K(int i2) {
        L(i2, i2 + 1);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [qb7, jb7] */
    public final void L(int i2, int i3) {
        n79.g(i2 >= 0 && i3 >= i2);
        int p = l0().p();
        int min = Math.min(i3, p);
        if (i2 < p && i2 != min) {
            bbc bbc = (bbc) ((ppb) this.m.a).j;
            bbc.getClass();
            ? jb7 = new jb7(4);
            tb7 tb7 = bbc.e;
            jb7.e(tb7.subList(0, i2));
            jb7.e(tb7.subList(min, tb7.size()));
            bbc bbc2 = new bbc(jb7.j(), bbc.f);
            int d0 = d0();
            int i4 = min - i2;
            if (d0 >= i2) {
                d0 = d0 < min ? -1 : d0 - i4;
            }
            if (d0 == -1) {
                d0 = v0g.j(i2, 0, bbc2.p() - 1);
                i8b.V("Currently playing item is removed. Assumes item at " + d0 + " is the new current item");
            }
            ppb m2 = ((ppb) this.m.a).m(bbc2, d0);
            ni3 ni3 = this.m;
            S0(new ni3(m2, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, (Bundle) ni3.e, (iwd) null), (Integer) null, (Integer) null);
            if (N0()) {
                while (i2 < min && i2 < this.k.d.size()) {
                    this.g.z(((mx8) this.k.d.get(i2)).a);
                    i2++;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v32, resolved type: zvd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v48, resolved type: tb7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: abc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: ir8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: ir8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: abc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: abc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: ir8} */
    /* JADX WARNING: type inference failed for: r0v2, types: [ss8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v52, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARNING: type inference failed for: r9v42, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L0(boolean r86, defpackage.sp8 r87) {
        /*
            r85 = this;
            r0 = r85
            r2 = r87
            boolean r4 = r0.i
            if (r4 != 0) goto L_0x07bd
            boolean r4 = r0.j
            if (r4 != 0) goto L_0x000e
            goto L_0x07bd
        L_0x000e:
            sp8 r4 = r0.k
            ni3 r5 = r0.m
            xe8 r6 = r0.g
            java.lang.Object r6 = r6.b
            uo8 r6 = (defpackage.uo8) r6
            android.media.session.MediaController r6 = r6.a
            java.lang.String r6 = r6.getPackageName()
            xe8 r7 = r0.g
            java.lang.Object r7 = r7.b
            uo8 r7 = (defpackage.uo8) r7
            android.media.session.MediaController r7 = r7.a
            long r7 = r7.getFlags()
            xe8 r9 = r0.g
            java.lang.Object r9 = r9.b
            uo8 r9 = (defpackage.uo8) r9
            ox8 r9 = r9.e
            h67 r9 = r9.a()
            if (r9 == 0) goto L_0x003a
            r9 = 1
            goto L_0x003b
        L_0x003a:
            r9 = 0
        L_0x003b:
            xe8 r11 = r0.g
            java.lang.Object r11 = r11.b
            uo8 r11 = (defpackage.uo8) r11
            android.media.session.MediaController r11 = r11.a
            int r11 = r11.getRatingType()
            qo8 r12 = r0.b
            long r13 = r12.w
            xe8 r15 = r0.g
            int r1 = defpackage.v0g.a
            r10 = 30
            if (r1 >= r10) goto L_0x0055
        L_0x0053:
            r1 = 0
            goto L_0x0066
        L_0x0055:
            java.lang.Object r1 = r15.b
            uo8 r1 = (defpackage.uo8) r1
            android.media.session.MediaController r1 = r1.a
            android.media.session.MediaController$PlaybackInfo r1 = r1.getPlaybackInfo()
            if (r1 != 0) goto L_0x0062
            goto L_0x0053
        L_0x0062:
            java.lang.String r1 = r1.getVolumeControlId()
        L_0x0066:
            java.util.List r10 = r4.d
            java.util.List r15 = r2.d
            if (r10 == r15) goto L_0x006e
            r10 = 1
            goto L_0x006f
        L_0x006e:
            r10 = 0
        L_0x006f:
            java.lang.String r3 = "initialCapacity"
            if (r10 == 0) goto L_0x00ce
            bbc r18 = defpackage.bbc.g
            r18 = r12
            r12 = 4
            defpackage.m5a.m(r12, r3)
            r19 = r1
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r20 = r6
            r21 = r13
            r6 = 0
            r12 = 0
        L_0x0085:
            int r13 = r15.size()
            if (r12 >= r13) goto L_0x00c1
            java.lang.Object r13 = r15.get(r12)
            mx8 r13 = (defpackage.mx8) r13
            dc7 r14 = defpackage.ft7.a
            zp8 r14 = r13.a
            ir8 r24 = defpackage.ft7.h(r14)
            abc r14 = new abc
            r27 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r29 = r7
            long r7 = r13.b
            r23 = r14
            r25 = r7
            r23.<init>(r24, r25, r27)
            r7 = 1
            int r8 = r6 + 1
            int r13 = r1.length
            if (r13 >= r8) goto L_0x00ba
            int r13 = r1.length
            int r13 = defpackage.jb7.h(r13, r8)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r13)
        L_0x00ba:
            r1[r6] = r14
            int r12 = r12 + r7
            r6 = r8
            r7 = r29
            goto L_0x0085
        L_0x00c1:
            r29 = r7
            bbc r7 = new bbc
            k0d r1 = defpackage.tb7.n(r6, r1)
            r6 = 0
            r7.<init>(r1, r6)
            goto L_0x00e9
        L_0x00ce:
            r19 = r1
            r20 = r6
            r29 = r7
            r18 = r12
            r21 = r13
            java.lang.Object r1 = r5.a
            ppb r1 = (defpackage.ppb) r1
            jkf r1 = r1.j
            bbc r1 = (defpackage.bbc) r1
            bbc r7 = new bbc
            tb7 r6 = r1.e
            abc r1 = r1.f
            r7.<init>(r6, r1)
        L_0x00e9:
            vs8 r1 = r4.c
            vs8 r6 = r2.c
            if (r1 != r6) goto L_0x00f4
            if (r86 == 0) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            r1 = 0
            goto L_0x00f5
        L_0x00f4:
            r1 = 1
        L_0x00f5:
            mob r8 = r4.b
            if (r8 != 0) goto L_0x00fc
            r14 = -1
            goto L_0x00fe
        L_0x00fc:
            long r14 = r8.X
        L_0x00fe:
            mob r12 = r2.b
            if (r12 != 0) goto L_0x0108
            r25 = r8
            r13 = r9
            r8 = -1
            goto L_0x010d
        L_0x0108:
            r25 = r8
            r13 = r9
            long r8 = r12.X
        L_0x010d:
            int r14 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r14 != 0) goto L_0x0119
            if (r86 == 0) goto L_0x0114
            goto L_0x0119
        L_0x0114:
            r15 = r12
            r26 = r13
            r14 = 0
            goto L_0x011d
        L_0x0119:
            r15 = r12
            r26 = r13
            r14 = 1
        L_0x011d:
            long r12 = defpackage.ft7.d(r6)
            if (r1 != 0) goto L_0x013d
            if (r14 != 0) goto L_0x013d
            if (r10 == 0) goto L_0x0128
            goto L_0x013d
        L_0x0128:
            java.lang.Object r1 = r5.a
            ppb r1 = (defpackage.ppb) r1
            qwd r8 = r1.c
            uob r8 = r8.a
            int r8 = r8.b
            us8 r1 = r1.z
            r75 = r1
            r24 = r3
            r23 = r15
            r1 = 0
            goto L_0x0207
        L_0x013d:
            java.util.List r10 = r2.d
            if (r10 == 0) goto L_0x0147
            r23 = -1
            int r23 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r23 != 0) goto L_0x014c
        L_0x0147:
            r24 = r3
            r23 = r15
            goto L_0x016d
        L_0x014c:
            r23 = r15
            r15 = 0
        L_0x014f:
            int r0 = r10.size()
            if (r15 >= r0) goto L_0x016b
            java.lang.Object r0 = r10.get(r15)
            mx8 r0 = (defpackage.mx8) r0
            r24 = r3
            long r2 = r0.b
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0164
            goto L_0x016e
        L_0x0164:
            r0 = 1
            int r15 = r15 + r0
            r2 = r87
            r3 = r24
            goto L_0x014f
        L_0x016b:
            r24 = r3
        L_0x016d:
            r15 = -1
        L_0x016e:
            if (r6 == 0) goto L_0x0172
            r0 = 1
            goto L_0x0173
        L_0x0172:
            r0 = 0
        L_0x0173:
            if (r0 == 0) goto L_0x017c
            if (r1 == 0) goto L_0x017c
            us8 r2 = defpackage.ft7.k(r6, r11)
            goto L_0x0199
        L_0x017c:
            if (r0 != 0) goto L_0x0193
            if (r14 == 0) goto L_0x0193
            r2 = -1
            if (r15 != r2) goto L_0x0186
            us8 r2 = defpackage.us8.J
            goto L_0x0199
        L_0x0186:
            java.lang.Object r2 = r10.get(r15)
            mx8 r2 = (defpackage.mx8) r2
            zp8 r2 = r2.a
            us8 r2 = defpackage.ft7.j(r2, r11)
            goto L_0x0199
        L_0x0193:
            java.lang.Object r2 = r5.a
            ppb r2 = (defpackage.ppb) r2
            us8 r2 = r2.z
        L_0x0199:
            tb7 r3 = r7.e
            r8 = -1
            if (r15 != r8) goto L_0x01df
            if (r1 == 0) goto L_0x01dc
            if (r0 == 0) goto L_0x01d4
            java.lang.String r0 = "Adding a fake MediaItem at the end of the list because there's no QueueItem with the active queue id and current Timeline should have currently playing MediaItem."
            defpackage.i8b.V(r0)
            android.os.Bundle r0 = r6.a
            java.lang.String r1 = "android.media.metadata.MEDIA_ID"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = r0.toString()
            goto L_0x01b7
        L_0x01b6:
            r0 = 0
        L_0x01b7:
            ir8 r32 = defpackage.ft7.i(r0, r6, r11)
            bbc r7 = new bbc
            abc r0 = new abc
            r33 = -1
            r31 = r0
            r35 = r12
            r31.<init>(r32, r33, r35)
            r7.<init>(r3, r0)
            int r0 = r7.p()
            r1 = 1
            int r0 = r0 - r1
            r15 = r0
            r1 = 0
            goto L_0x0204
        L_0x01d4:
            bbc r7 = new bbc
            r1 = 0
            r7.<init>(r3, r1)
        L_0x01da:
            r15 = 0
            goto L_0x0204
        L_0x01dc:
            r1 = 0
            r8 = -1
            goto L_0x01e0
        L_0x01df:
            r1 = 0
        L_0x01e0:
            if (r15 == r8) goto L_0x01da
            bbc r7 = new bbc
            r7.<init>(r3, r1)
            if (r0 == 0) goto L_0x0204
            int r0 = r7.p()
            if (r15 < r0) goto L_0x01f1
            r0 = r1
            goto L_0x01f7
        L_0x01f1:
            abc r0 = r7.v(r15)
            ir8 r0 = r0.a
        L_0x01f7:
            r0.getClass()
            java.lang.String r0 = r0.a
            ir8 r0 = defpackage.ft7.i(r0, r6, r11)
            bbc r7 = r7.s(r15, r0, r12)
        L_0x0204:
            r75 = r2
            r8 = r15
        L_0x0207:
            java.lang.CharSequence r0 = r4.e
            r2 = r87
            java.lang.CharSequence r3 = r2.e
            if (r0 != r3) goto L_0x0218
            java.lang.Object r0 = r5.a
            ppb r0 = (defpackage.ppb) r0
            us8 r0 = r0.m
        L_0x0215:
            r62 = r0
            goto L_0x022b
        L_0x0218:
            if (r3 != 0) goto L_0x021d
            us8 r0 = defpackage.us8.J
            goto L_0x0215
        L_0x021d:
            ss8 r0 = new ss8
            r0.<init>()
            r0.a = r3
            us8 r3 = new us8
            r3.<init>(r0)
            r0 = r3
            goto L_0x0215
        L_0x022b:
            int r0 = r2.f
            int r0 = defpackage.ft7.s(r0)
            int r3 = r2.g
            boolean r58 = defpackage.ft7.u(r3)
            r4 = r23
            r3 = r25
            if (r3 == r4) goto L_0x0330
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            k0d r9 = defpackage.yvd.d
            r10 = 0
        L_0x0245:
            int r11 = r9.o
            if (r10 >= r11) goto L_0x025e
            yvd r11 = new yvd
            java.lang.Object r14 = r9.get(r10)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r11.<init>(r14)
            r3.add(r11)
            r11 = 1
            int r10 = r10 + r11
            goto L_0x0245
        L_0x025e:
            if (r26 != 0) goto L_0x027a
            java.util.Iterator r9 = r3.iterator()
        L_0x0264:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x027a
            java.lang.Object r10 = r9.next()
            yvd r10 = (defpackage.yvd) r10
            int r11 = r10.a
            r14 = 40010(0x9c4a, float:5.6066E-41)
            if (r11 != r14) goto L_0x0264
            r3.remove(r10)
        L_0x027a:
            if (r4 == 0) goto L_0x02a1
            java.util.AbstractCollection r9 = r4.z
            if (r9 == 0) goto L_0x02a1
            java.util.Iterator r9 = r9.iterator()
        L_0x0284:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x02a1
            java.lang.Object r10 = r9.next()
            lob r10 = (defpackage.lob) r10
            java.lang.String r11 = r10.a
            yvd r14 = new yvd
            android.os.Bundle r10 = r10.o
            if (r10 != 0) goto L_0x029a
            android.os.Bundle r10 = android.os.Bundle.EMPTY
        L_0x029a:
            r14.<init>(r11, r10)
            r3.add(r14)
            goto L_0x0284
        L_0x02a1:
            zvd r9 = new zvd
            r9.<init>(r3)
            if (r4 != 0) goto L_0x02b0
            lx5 r3 = defpackage.tb7.b
            k0d r3 = defpackage.k0d.v
        L_0x02ac:
            r24 = r9
            goto L_0x032d
        L_0x02b0:
            java.util.AbstractCollection r3 = r4.z
            if (r3 != 0) goto L_0x02b9
            lx5 r3 = defpackage.tb7.b
            k0d r3 = defpackage.k0d.v
            goto L_0x02ac
        L_0x02b9:
            r11 = r24
            r10 = 4
            defpackage.m5a.m(r10, r11)
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.util.Iterator r3 = r3.iterator()
            r10 = 0
        L_0x02c6:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto L_0x0327
            java.lang.Object r14 = r3.next()
            lob r14 = (defpackage.lob) r14
            java.lang.String r15 = r14.a
            android.os.Bundle r1 = r14.o
            if (r1 == 0) goto L_0x02e6
            r23 = r3
            java.lang.String r3 = "androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT"
            r24 = r9
            r9 = 0
            int r3 = r1.getInt(r3, r9)
            r34 = r3
            goto L_0x02ec
        L_0x02e6:
            r23 = r3
            r24 = r9
            r34 = 0
        L_0x02ec:
            android.os.Bundle r38 = android.os.Bundle.EMPTY
            yvd r3 = new yvd
            if (r1 != 0) goto L_0x02f4
            r1 = r38
        L_0x02f4:
            r3.<init>(r15, r1)
            e63 r1 = new e63
            java.lang.CharSequence r9 = r14.b
            r39 = 1
            r33 = -1
            int r14 = r14.c
            r36 = 0
            r31 = r1
            r32 = r3
            r35 = r14
            r37 = r9
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)
            r3 = 1
            int r9 = r10 + 1
            int r3 = r11.length
            if (r3 >= r9) goto L_0x031e
            int r3 = r11.length
            int r3 = defpackage.jb7.h(r3, r9)
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r11, r3)
            r11 = r3
        L_0x031e:
            r11[r10] = r1
            r10 = r9
            r3 = r23
            r9 = r24
            r1 = 0
            goto L_0x02c6
        L_0x0327:
            r24 = r9
            k0d r3 = defpackage.tb7.n(r10, r11)
        L_0x032d:
            r9 = r24
            goto L_0x033a
        L_0x0330:
            java.lang.Object r1 = r5.b
            r9 = r1
            zvd r9 = (defpackage.zvd) r9
            java.lang.Object r1 = r5.d
            r3 = r1
            tb7 r3 = (defpackage.tb7) r3
        L_0x033a:
            vo8 r1 = r2.a
            if (r1 == 0) goto L_0x0341
            int r10 = r1.c
            goto L_0x0342
        L_0x0341:
            r10 = 0
        L_0x0342:
            vq5 r11 = new vq5
            r14 = 1
            r11.<init>(r14)
            if (r4 != 0) goto L_0x034f
            r25 = r3
            r14 = 0
            goto L_0x0353
        L_0x034f:
            long r14 = r4.v
            r25 = r3
        L_0x0353:
            r2 = 4
            boolean r27 = defpackage.ft7.y(r14, r2)
            if (r27 == 0) goto L_0x0366
            r2 = 2
            boolean r2 = defpackage.ft7.y(r14, r2)
            if (r2 != 0) goto L_0x0364
            goto L_0x0366
        L_0x0364:
            r2 = 1
            goto L_0x036f
        L_0x0366:
            r2 = 512(0x200, double:2.53E-321)
            boolean r2 = defpackage.ft7.y(r14, r2)
            if (r2 == 0) goto L_0x0372
            goto L_0x0364
        L_0x036f:
            r11.a(r2)
        L_0x0372:
            r2 = 16384(0x4000, double:8.0948E-320)
            boolean r2 = defpackage.ft7.y(r14, r2)
            r3 = 2
            if (r2 == 0) goto L_0x037e
            r11.a(r3)
        L_0x037e:
            r2 = r4
            r3 = 32768(0x8000, double:1.61895E-319)
            boolean r3 = defpackage.ft7.y(r14, r3)
            if (r3 == 0) goto L_0x0390
            r3 = 1024(0x400, double:5.06E-321)
            boolean r3 = defpackage.ft7.y(r14, r3)
            if (r3 != 0) goto L_0x03b2
        L_0x0390:
            r3 = 65536(0x10000, double:3.2379E-319)
            boolean r3 = defpackage.ft7.y(r14, r3)
            if (r3 == 0) goto L_0x03a1
            r3 = 2048(0x800, double:1.0118E-320)
            boolean r3 = defpackage.ft7.y(r14, r3)
            if (r3 != 0) goto L_0x03b2
        L_0x03a1:
            r3 = 131072(0x20000, double:6.47582E-319)
            boolean r3 = defpackage.ft7.y(r14, r3)
            if (r3 == 0) goto L_0x03bc
            r3 = 8192(0x2000, double:4.0474E-320)
            boolean r3 = defpackage.ft7.y(r14, r3)
            if (r3 == 0) goto L_0x03bc
        L_0x03b2:
            r3 = 31
            r4 = 2
            int[] r3 = new int[]{r3, r4}
            r11.c(r3)
        L_0x03bc:
            r3 = 8
            boolean r3 = defpackage.ft7.y(r14, r3)
            if (r3 == 0) goto L_0x03c9
            r3 = 11
            r11.a(r3)
        L_0x03c9:
            r3 = 64
            boolean r3 = defpackage.ft7.y(r14, r3)
            if (r3 == 0) goto L_0x03d6
            r3 = 12
            r11.a(r3)
        L_0x03d6:
            r3 = 256(0x100, double:1.265E-321)
            boolean r3 = defpackage.ft7.y(r14, r3)
            r4 = 5
            r84 = r9
            if (r3 == 0) goto L_0x03e9
            r3 = 4
            int[] r9 = new int[]{r4, r3}
            r11.c(r9)
        L_0x03e9:
            r3 = r5
            r4 = 32
            boolean r4 = defpackage.ft7.y(r14, r4)
            if (r4 == 0) goto L_0x03fd
            r4 = 9
            r5 = 8
            int[] r4 = new int[]{r4, r5}
            r11.c(r4)
        L_0x03fd:
            r4 = 16
            boolean r4 = defpackage.ft7.y(r14, r4)
            r5 = 7
            if (r4 == 0) goto L_0x040e
            r4 = 6
            int[] r9 = new int[]{r5, r4}
            r11.c(r9)
        L_0x040e:
            r4 = r6
            r5 = 4194304(0x400000, double:2.0722615E-317)
            boolean r5 = defpackage.ft7.y(r14, r5)
            if (r5 == 0) goto L_0x041d
            r5 = 13
            r11.a(r5)
        L_0x041d:
            r5 = 1
            boolean r5 = defpackage.ft7.y(r14, r5)
            r6 = 3
            if (r5 == 0) goto L_0x0429
            r11.a(r6)
        L_0x0429:
            r5 = 34
            r9 = 26
            r6 = 1
            if (r10 != r6) goto L_0x0439
            int[] r5 = new int[]{r9, r5}
            r11.c(r5)
        L_0x0437:
            r5 = 6
            goto L_0x0448
        L_0x0439:
            r6 = 2
            if (r10 != r6) goto L_0x0437
            r6 = 25
            r10 = 33
            int[] r5 = new int[]{r9, r5, r6, r10}
            r11.c(r5)
            goto L_0x0437
        L_0x0448:
            int[] r5 = new int[r5]
            r5 = {23, 17, 18, 16, 21, 32} // fill-array
            r11.c(r5)
            r5 = 4
            long r5 = r29 & r5
            r9 = 0
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x046c
            r5 = 20
            r11.a(r5)
            r5 = 4096(0x1000, double:2.0237E-320)
            boolean r5 = defpackage.ft7.y(r14, r5)
            if (r5 == 0) goto L_0x046c
            r5 = 10
            r11.a(r5)
        L_0x046c:
            if (r26 == 0) goto L_0x048a
            r5 = 262144(0x40000, double:1.295163E-318)
            boolean r5 = defpackage.ft7.y(r14, r5)
            if (r5 == 0) goto L_0x047c
            r5 = 15
            r11.a(r5)
        L_0x047c:
            r5 = 2097152(0x200000, double:1.0361308E-317)
            boolean r5 = defpackage.ft7.y(r14, r5)
            if (r5 == 0) goto L_0x048a
            r5 = 14
            r11.a(r5)
        L_0x048a:
            pob r5 = new pob
            xq5 r6 = r11.e()
            r5.<init>(r6)
            androidx.media3.common.PlaybackException r50 = defpackage.ft7.m(r2)
            if (r2 != 0) goto L_0x04a0
            r6 = 0
            r11 = r85
        L_0x049c:
            r9 = r21
            goto L_0x0564
        L_0x04a0:
            int r6 = r2.a
            r9 = 7
            if (r6 == r9) goto L_0x04a9
            int r6 = r2.w
            if (r6 != 0) goto L_0x04ad
        L_0x04a9:
            r11 = r85
            goto L_0x0561
        L_0x04ad:
            int r6 = defpackage.ft7.t(r6)
            iwd r9 = new iwd
            java.lang.CharSequence r10 = r2.x
            if (r10 == 0) goto L_0x04bf
            java.lang.String r10 = r10.toString()
            r11 = r85
            goto L_0x0554
        L_0x04bf:
            r10 = -100
            r11 = r85
            android.content.Context r14 = r11.a
            if (r6 == r10) goto L_0x054e
            r10 = 1
            if (r6 == r10) goto L_0x0547
            r10 = -6
            if (r6 == r10) goto L_0x0540
            r10 = -5
            if (r6 == r10) goto L_0x0539
            r10 = -4
            if (r6 == r10) goto L_0x0532
            r10 = -3
            if (r6 == r10) goto L_0x052b
            r10 = -2
            if (r6 == r10) goto L_0x0524
            switch(r6) {
                case -110: goto L_0x051d;
                case -109: goto L_0x0516;
                case -108: goto L_0x050f;
                case -107: goto L_0x0508;
                case -106: goto L_0x0501;
                case -105: goto L_0x04fa;
                case -104: goto L_0x04f3;
                case -103: goto L_0x04ec;
                case -102: goto L_0x04e4;
                default: goto L_0x04dc;
            }
        L_0x04dc:
            int r10 = defpackage.llc.error_message_fallback
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x04e4:
            int r10 = defpackage.llc.error_message_authentication_expired
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x04ec:
            int r10 = defpackage.llc.error_message_premium_account_required
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x04f3:
            int r10 = defpackage.llc.error_message_concurrent_stream_limit
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x04fa:
            int r10 = defpackage.llc.error_message_parental_control_restricted
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0501:
            int r10 = defpackage.llc.error_message_not_available_in_region
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0508:
            int r10 = defpackage.llc.error_message_skip_limit_reached
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x050f:
            int r10 = defpackage.llc.error_message_setup_required
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0516:
            int r10 = defpackage.llc.error_message_end_of_playlist
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x051d:
            int r10 = defpackage.llc.error_message_content_already_playing
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0524:
            int r10 = defpackage.llc.error_message_invalid_state
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x052b:
            int r10 = defpackage.llc.error_message_bad_value
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0532:
            int r10 = defpackage.llc.error_message_permission_denied
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0539:
            int r10 = defpackage.llc.error_message_io
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0540:
            int r10 = defpackage.llc.error_message_not_supported
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0547:
            int r10 = defpackage.llc.error_message_info_cancelled
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x054e:
            int r10 = defpackage.llc.error_message_disconnected
            java.lang.String r10 = r14.getString(r10)
        L_0x0554:
            android.os.Bundle r14 = r2.Y
            if (r14 == 0) goto L_0x0559
            goto L_0x055b
        L_0x0559:
            android.os.Bundle r14 = android.os.Bundle.EMPTY
        L_0x055b:
            r9.<init>(r10, r6, r14)
            r6 = r9
            goto L_0x049c
        L_0x0561:
            r6 = 0
            goto L_0x049c
        L_0x0564:
            long r14 = defpackage.ft7.c(r2, r4, r9)
            long r47 = defpackage.ft7.a(r2, r4, r9)
            r16 = r5
            r21 = r6
            long r5 = defpackage.ft7.a(r2, r4, r9)
            r26 = r12
            long r11 = defpackage.ft7.d(r4)
            int r40 = defpackage.kne.h(r5, r11)
            long r5 = defpackage.ft7.a(r2, r4, r9)
            long r11 = defpackage.ft7.c(r2, r4, r9)
            long r41 = r5 - r11
            if (r4 != 0) goto L_0x058c
        L_0x058a:
            r5 = 0
            goto L_0x0599
        L_0x058c:
            java.lang.String r5 = "android.media.metadata.ADVERTISEMENT"
            long r5 = r4.a(r5)
            r11 = 0
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x058a
            r5 = 1
        L_0x0599:
            if (r2 != 0) goto L_0x05a0
            gob r6 = defpackage.gob.d
        L_0x059d:
            r56 = r6
            goto L_0x05a8
        L_0x05a0:
            gob r6 = new gob
            float r11 = r2.o
            r6.<init>(r11)
            goto L_0x059d
        L_0x05a8:
            if (r1 != 0) goto L_0x05af
            i30 r6 = defpackage.i30.g
        L_0x05ac:
            r64 = r6
            goto L_0x05d0
        L_0x05af:
            k30 r6 = r1.b
            if (r6 != 0) goto L_0x05b6
            i30 r6 = defpackage.i30.g
            goto L_0x05ac
        L_0x05b6:
            j30 r6 = r6.a
            int r33 = r6.a()
            int r34 = r6.b()
            int r35 = r6.c()
            i30 r6 = new i30
            r36 = 1
            r37 = 0
            r32 = r6
            r32.<init>(r33, r34, r35, r36, r37)
            goto L_0x05ac
        L_0x05d0:
            if (r2 != 0) goto L_0x05d5
        L_0x05d2:
            r69 = 0
            goto L_0x05dd
        L_0x05d5:
            int r6 = r2.a
            switch(r6) {
                case 3: goto L_0x05db;
                case 4: goto L_0x05db;
                case 5: goto L_0x05db;
                case 6: goto L_0x05db;
                case 7: goto L_0x05da;
                case 8: goto L_0x05da;
                case 9: goto L_0x05db;
                case 10: goto L_0x05db;
                case 11: goto L_0x05db;
                default: goto L_0x05da;
            }
        L_0x05da:
            goto L_0x05d2
        L_0x05db:
            r69 = 1
        L_0x05dd:
            if (r2 != 0) goto L_0x05e1
        L_0x05df:
            r6 = 1
            goto L_0x0616
        L_0x05e1:
            int r6 = r2.a     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            switch(r6) {
                case 0: goto L_0x05df;
                case 1: goto L_0x05df;
                case 2: goto L_0x05fe;
                case 3: goto L_0x05fc;
                case 4: goto L_0x05fa;
                case 5: goto L_0x05fa;
                case 6: goto L_0x05fa;
                case 7: goto L_0x05df;
                case 8: goto L_0x05df;
                case 9: goto L_0x05fa;
                case 10: goto L_0x05fa;
                case 11: goto L_0x05fa;
                default: goto L_0x05e6;
            }     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
        L_0x05e6:
            androidx.media3.session.LegacyConversions$ConversionException r9 = new androidx.media3.session.LegacyConversions$ConversionException     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            java.lang.String r11 = "Invalid state of PlaybackStateCompat: "
            r10.<init>(r11)     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            r10.append(r6)     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            java.lang.String r6 = r10.toString()     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            r9.<init>(r6)     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            throw r9     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
        L_0x05fa:
            r6 = 2
            goto L_0x0616
        L_0x05fc:
            r6 = 3
            goto L_0x0616
        L_0x05fe:
            long r11 = defpackage.ft7.d(r4)     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r11 > r28 ? 1 : (r11 == r28 ? 0 : -1))
            if (r6 != 0) goto L_0x060c
            goto L_0x05fc
        L_0x060c:
            long r9 = defpackage.ft7.c(r2, r4, r9)     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0615
            goto L_0x05fc
        L_0x0615:
            r6 = 4
        L_0x0616:
            r72 = r6
            goto L_0x0642
        L_0x0619:
            int r6 = r2.a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Received invalid playback state "
            r9.<init>(r10)
            r9.append(r6)
            java.lang.String r6 = " from package "
            r9.append(r6)
            r6 = r20
            r9.append(r6)
            java.lang.String r6 = ". Keeping the previous state."
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            defpackage.i8b.o(r6)
            java.lang.Object r6 = r3.a
            ppb r6 = (defpackage.ppb) r6
            int r6 = r6.y
            goto L_0x0616
        L_0x0642:
            if (r2 != 0) goto L_0x0647
            r73 = 0
            goto L_0x0651
        L_0x0647:
            int r6 = r2.a
            r9 = 3
            if (r6 != r9) goto L_0x064e
            r6 = 1
            goto L_0x064f
        L_0x064e:
            r6 = 0
        L_0x064f:
            r73 = r6
        L_0x0651:
            if (r1 != 0) goto L_0x0658
            in4 r6 = defpackage.in4.e
        L_0x0655:
            r66 = r6
            goto L_0x067d
        L_0x0658:
            he3 r6 = new he3
            int r9 = r1.a
            r10 = 2
            if (r9 != r10) goto L_0x0661
            r9 = 1
            goto L_0x0662
        L_0x0661:
            r9 = 0
        L_0x0662:
            r6.<init>(r9)
            int r10 = r1.d
            r6.c = r10
            if (r9 != 0) goto L_0x0670
            if (r19 != 0) goto L_0x066e
            goto L_0x0670
        L_0x066e:
            r9 = 0
            goto L_0x0671
        L_0x0670:
            r9 = 1
        L_0x0671:
            defpackage.n79.g(r9)
            r9 = r19
            r6.d = r9
            in4 r6 = r6.b()
            goto L_0x0655
        L_0x067d:
            if (r1 != 0) goto L_0x0682
            r67 = 0
            goto L_0x0686
        L_0x0682:
            int r6 = r1.e
            r67 = r6
        L_0x0686:
            if (r1 != 0) goto L_0x068b
            r68 = 0
            goto L_0x0694
        L_0x068b:
            int r1 = r1.e
            if (r1 != 0) goto L_0x0691
            r1 = 1
            goto L_0x0692
        L_0x0691:
            r1 = 0
        L_0x0692:
            r68 = r1
        L_0x0694:
            java.lang.Object r1 = r3.a
            ppb r1 = (defpackage.ppb) r1
            long r9 = r1.A
            int r3 = r7.p()
            if (r8 < r3) goto L_0x06a2
            r6 = 0
            goto L_0x06a8
        L_0x06a2:
            abc r3 = r7.v(r8)
            ir8 r6 = r3.a
        L_0x06a8:
            uob r32 = K0(r8, r6, r14, r5)
            qwd r31 = new qwd
            r52 = r31
            long r34 = android.os.SystemClock.elapsedRealtime()
            r43 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r33 = r5
            r36 = r26
            r38 = r47
            r45 = r26
            r31.<init>(r32, r33, r34, r36, r38, r40, r41, r43, r45, r47)
            ppb r3 = new ppb
            r49 = r3
            uob r54 = defpackage.qwd.k
            r53 = r54
            v8g r59 = defpackage.v8g.e
            o44 r65 = defpackage.o44.c
            qqf r82 = defpackage.qqf.b
            kqf r83 = defpackage.kqf.C
            long r5 = r1.B
            r78 = r5
            long r5 = r1.C
            r80 = r5
            r51 = 0
            r55 = 0
            r61 = 0
            r63 = 1065353216(0x3f800000, float:1.0)
            r70 = 1
            r71 = 0
            r74 = 0
            r57 = r0
            r60 = r7
            r76 = r9
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r78, r80, r82, r83)
            ni3 r5 = new ni3
            r6 = r87
            android.os.Bundle r1 = r6.h
            r31 = r5
            r32 = r3
            r33 = r84
            r34 = r16
            r35 = r25
            r36 = r1
            r37 = r21
            r31.<init>(r32, r33, r34, r35, r36, r37)
            r1 = r85
            sp8 r8 = r1.k
            ni3 r9 = r1.m
            r10 = r18
            long r10 = r10.w
            java.lang.Object r12 = r9.a
            ppb r12 = (defpackage.ppb) r12
            jkf r12 = r12.j
            boolean r12 = r12.q()
            boolean r13 = r7.q()
            if (r12 == 0) goto L_0x072a
            if (r13 == 0) goto L_0x072a
            r0 = 0
            r3 = 0
            goto L_0x07a4
        L_0x072a:
            if (r12 == 0) goto L_0x073a
            if (r13 != 0) goto L_0x073a
            r12 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r12 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            goto L_0x07a4
        L_0x073a:
            r12 = 3
            java.lang.Object r9 = r9.a
            ppb r9 = (defpackage.ppb) r9
            ir8 r9 = r9.s()
            defpackage.n79.o(r9)
            boolean r7 = r7.r(r9)
            if (r7 != 0) goto L_0x0756
            r7 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            goto L_0x07a4
        L_0x0756:
            ir8 r3 = r3.s()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x079a
            mob r3 = r8.b
            vs8 r7 = r8.c
            long r7 = defpackage.ft7.c(r3, r7, r10)
            long r2 = defpackage.ft7.c(r2, r4, r10)
            r9 = 0
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0781
            r4 = 1
            if (r0 != r4) goto L_0x0781
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r17 = r0
            goto L_0x0797
        L_0x0781:
            long r7 = r7 - r2
            long r2 = java.lang.Math.abs(r7)
            r7 = 100
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0795
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = r0
        L_0x0792:
            r17 = 0
            goto L_0x0797
        L_0x0795:
            r3 = 0
            goto L_0x0792
        L_0x0797:
            r0 = r17
            goto L_0x07a4
        L_0x079a:
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x07a4:
            android.util.Pair r0 = android.util.Pair.create(r3, r0)
            java.lang.Object r2 = r0.first
            r4 = r2
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r0 = r0.second
            r7 = r0
            java.lang.Integer r7 = (java.lang.Integer) r7
            r0 = r85
            r1 = r86
            r2 = r87
            r3 = r5
            r5 = r7
            r0.R0(r1, r2, r3, r4, r5)
        L_0x07bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp8.L0(boolean, sp8):void");
    }

    public final void M() {
        this.g.r().h.skipToPrevious();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if ((!((defpackage.ppb) r13.m.a).j.q()) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void M0() {
        /*
            r13 = this;
            hkf r0 = new hkf
            r0.<init>()
            boolean r1 = r13.N0()
            r2 = 0
            if (r1 == 0) goto L_0x001d
            ni3 r1 = r13.m
            java.lang.Object r1 = r1.a
            ppb r1 = (defpackage.ppb) r1
            jkf r1 = r1.j
            boolean r1 = r1.q()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r3 = r2
        L_0x001e:
            defpackage.n79.n(r3)
            ni3 r1 = r13.m
            java.lang.Object r1 = r1.a
            ppb r1 = (defpackage.ppb) r1
            jkf r3 = r1.j
            bbc r3 = (defpackage.bbc) r3
            qwd r1 = r1.c
            uob r1 = r1.a
            int r1 = r1.b
            r4 = 0
            r3.n(r1, r0, r4)
            ir8 r6 = r0.c
            long r7 = r3.u(r1)
            r9 = -1
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0066
            ni3 r6 = r13.m
            java.lang.Object r6 = r6.a
            ppb r6 = (defpackage.ppb) r6
            boolean r6 = r6.t
            if (r6 == 0) goto L_0x0059
            xe8 r6 = r13.g
            xo8 r6 = r6.r()
            android.media.session.MediaController$TransportControls r6 = r6.h
            r6.play()
            goto L_0x0104
        L_0x0059:
            xe8 r6 = r13.g
            xo8 r6 = r6.r()
            android.media.session.MediaController$TransportControls r6 = r6.h
            r6.prepare()
            goto L_0x0104
        L_0x0066:
            ar8 r7 = r6.f
            android.net.Uri r8 = r7.a
            if (r8 == 0) goto L_0x009f
            ni3 r6 = r13.m
            java.lang.Object r6 = r6.a
            ppb r6 = (defpackage.ppb) r6
            boolean r6 = r6.t
            if (r6 == 0) goto L_0x008b
            xe8 r6 = r13.g
            xo8 r6 = r6.r()
            android.net.Uri r8 = r7.a
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x0084
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x0084:
            android.media.session.MediaController$TransportControls r6 = r6.h
            r6.playFromUri(r8, r7)
            goto L_0x0104
        L_0x008b:
            xe8 r6 = r13.g
            xo8 r6 = r6.r()
            android.net.Uri r8 = r7.a
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x0099
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x0099:
            android.media.session.MediaController$TransportControls r6 = r6.h
            r6.prepareFromUri(r8, r7)
            goto L_0x0104
        L_0x009f:
            java.lang.String r8 = r7.b
            if (r8 == 0) goto L_0x00d5
            ni3 r6 = r13.m
            java.lang.Object r6 = r6.a
            ppb r6 = (defpackage.ppb) r6
            boolean r6 = r6.t
            if (r6 == 0) goto L_0x00c1
            xe8 r6 = r13.g
            xo8 r6 = r6.r()
            java.lang.String r8 = r7.b
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x00bb
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x00bb:
            android.media.session.MediaController$TransportControls r6 = r6.h
            r6.playFromSearch(r8, r7)
            goto L_0x0104
        L_0x00c1:
            xe8 r6 = r13.g
            xo8 r6 = r6.r()
            java.lang.String r8 = r7.b
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x00cf
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x00cf:
            android.media.session.MediaController$TransportControls r6 = r6.h
            r6.prepareFromSearch(r8, r7)
            goto L_0x0104
        L_0x00d5:
            ni3 r8 = r13.m
            java.lang.Object r8 = r8.a
            ppb r8 = (defpackage.ppb) r8
            boolean r8 = r8.t
            java.lang.String r6 = r6.a
            if (r8 == 0) goto L_0x00f3
            xe8 r8 = r13.g
            xo8 r8 = r8.r()
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x00ed
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x00ed:
            android.media.session.MediaController$TransportControls r8 = r8.h
            r8.playFromMediaId(r6, r7)
            goto L_0x0104
        L_0x00f3:
            xe8 r8 = r13.g
            xo8 r8 = r8.r()
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x00ff
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x00ff:
            android.media.session.MediaController$TransportControls r8 = r8.h
            r8.prepareFromMediaId(r6, r7)
        L_0x0104:
            ni3 r6 = r13.m
            java.lang.Object r6 = r6.a
            ppb r6 = (defpackage.ppb) r6
            qwd r6 = r6.c
            uob r6 = r6.a
            long r6 = r6.f
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x012b
            xe8 r6 = r13.g
            xo8 r6 = r6.r()
            ni3 r7 = r13.m
            java.lang.Object r7 = r7.a
            ppb r7 = (defpackage.ppb) r7
            qwd r7 = r7.c
            uob r7 = r7.a
            long r7 = r7.f
            android.media.session.MediaController$TransportControls r6 = r6.h
            r6.seekTo(r7)
        L_0x012b:
            ni3 r6 = r13.m
            java.lang.Object r6 = r6.c
            pob r6 = (defpackage.pob) r6
            r7 = 20
            boolean r6 = r6.a(r7)
            if (r6 == 0) goto L_0x015e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = r2
        L_0x013f:
            int r8 = r3.p()
            if (r7 >= r8) goto L_0x015b
            if (r7 == r1) goto L_0x0158
            long r11 = r3.u(r7)
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0150
            goto L_0x0158
        L_0x0150:
            r3.n(r7, r0, r4)
            ir8 r8 = r0.c
            r6.add(r8)
        L_0x0158:
            int r7 = r7 + 1
            goto L_0x013f
        L_0x015b:
            r13.H0(r2, r6)
        L_0x015e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp8.M0():void");
    }

    public final PlaybackException N() {
        return ((ppb) this.m.a).a;
    }

    public final boolean N0() {
        return ((ppb) this.m.a).y != 1;
    }

    public final void O(boolean z) {
        ppb ppb = (ppb) this.m.a;
        if (ppb.t != z) {
            this.n = kne.z(ppb, this.n, this.o, this.b.w);
            this.o = SystemClock.elapsedRealtime();
            ppb d2 = ((ppb) this.m.a).d(1, 0, z);
            ni3 ni3 = this.m;
            S0(new ni3(d2, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, (Bundle) ni3.e, (iwd) null), (Integer) null, (Integer) null);
            if (N0() && (!((ppb) this.m.a).j.q())) {
                if (z) {
                    this.g.r().h.play();
                } else {
                    this.g.r().h.pause();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0090 A[SYNTHETIC, Splitter:B:20:0x0090] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O0() {
        /*
            r12 = this;
            boolean r0 = r12.i
            if (r0 != 0) goto L_0x00af
            boolean r0 = r12.j
            if (r0 == 0) goto L_0x000a
            goto L_0x00af
        L_0x000a:
            r0 = 1
            r12.j = r0
            sp8 r10 = new sp8
            xe8 r1 = r12.g
            vo8 r2 = r1.p()
            xe8 r1 = r12.g
            mob r1 = r1.q()
            mob r3 = J0(r1)
            xe8 r1 = r12.g
            java.lang.Object r1 = r1.b
            uo8 r1 = (defpackage.uo8) r1
            android.media.session.MediaController r1 = r1.a
            android.media.MediaMetadata r1 = r1.getMetadata()
            r4 = 0
            if (r1 == 0) goto L_0x0049
            ts r5 = defpackage.vs8.c
            android.os.Parcel r5 = android.os.Parcel.obtain()
            r6 = 0
            r1.writeToParcel(r5, r6)
            r5.setDataPosition(r6)
            android.os.Parcelable$Creator<vs8> r6 = defpackage.vs8.CREATOR
            java.lang.Object r6 = r6.createFromParcel(r5)
            vs8 r6 = (defpackage.vs8) r6
            r5.recycle()
            r6.b = r1
            goto L_0x004a
        L_0x0049:
            r6 = r4
        L_0x004a:
            xe8 r1 = r12.g
            java.lang.Object r1 = r1.b
            uo8 r1 = (defpackage.uo8) r1
            android.media.session.MediaController r1 = r1.a
            java.util.List r1 = r1.getQueue()
            if (r1 == 0) goto L_0x005c
            java.util.ArrayList r4 = defpackage.mx8.a(r1)
        L_0x005c:
            java.util.List r5 = I0(r4)
            xe8 r1 = r12.g
            java.lang.Object r1 = r1.b
            uo8 r1 = (defpackage.uo8) r1
            android.media.session.MediaController r1 = r1.a
            java.lang.CharSequence r7 = r1.getQueueTitle()
            xe8 r1 = r12.g
            java.lang.Object r1 = r1.b
            uo8 r1 = (defpackage.uo8) r1
            ox8 r1 = r1.e
            h67 r1 = r1.a()
            r4 = -1
            if (r1 == 0) goto L_0x0081
            int r1 = r1.getRepeatMode()     // Catch:{ RemoteException -> 0x0081 }
            r8 = r1
            goto L_0x0082
        L_0x0081:
            r8 = r4
        L_0x0082:
            xe8 r1 = r12.g
            java.lang.Object r1 = r1.b
            uo8 r1 = (defpackage.uo8) r1
            ox8 r1 = r1.e
            h67 r1 = r1.a()
            if (r1 == 0) goto L_0x0096
            int r1 = r1.getShuffleMode()     // Catch:{ RemoteException -> 0x0096 }
            r9 = r1
            goto L_0x0097
        L_0x0096:
            r9 = r4
        L_0x0097:
            xe8 r1 = r12.g
            java.lang.Object r1 = r1.b
            uo8 r1 = (defpackage.uo8) r1
            android.media.session.MediaController r1 = r1.a
            android.os.Bundle r11 = r1.getExtras()
            r1 = r10
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r12.L0(r0, r10)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp8.O0():void");
    }

    public final void P(int i2) {
        P0(i2, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P0(int r36, long r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            r4 = 1
            if (r1 < 0) goto L_0x000b
            r6 = r4
            goto L_0x000c
        L_0x000b:
            r6 = 0
        L_0x000c:
            defpackage.n79.g(r6)
            int r6 = r35.d0()
            ni3 r7 = r0.m
            java.lang.Object r7 = r7.a
            ppb r7 = (defpackage.ppb) r7
            jkf r7 = r7.j
            boolean r8 = r7.q()
            if (r8 != 0) goto L_0x0027
            int r8 = r7.p()
            if (r1 >= r8) goto L_0x002d
        L_0x0027:
            boolean r8 = r35.k()
            if (r8 == 0) goto L_0x002e
        L_0x002d:
            return
        L_0x002e:
            r8 = 2
            if (r1 == r6) goto L_0x005a
            ni3 r10 = r0.m
            java.lang.Object r10 = r10.a
            ppb r10 = (defpackage.ppb) r10
            jkf r10 = r10.j
            bbc r10 = (defpackage.bbc) r10
            long r10 = r10.u(r1)
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x0055
            xe8 r6 = r0.g
            xo8 r6 = r6.r()
            android.media.session.MediaController$TransportControls r6 = r6.h
            r6.skipToQueueItem(r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            goto L_0x005c
        L_0x0055:
            java.lang.String r10 = "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex="
            defpackage.i2a.m(r1, r10)
        L_0x005a:
            r1 = r6
            r6 = 0
        L_0x005c:
            long r10 = r35.h()
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x006c
            r2 = r10
            r14 = 0
            goto L_0x007b
        L_0x006c:
            xe8 r14 = r0.g
            xo8 r14 = r14.r()
            android.media.session.MediaController$TransportControls r14 = r14.h
            r14.seekTo(r2)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
        L_0x007b:
            r8 = 0
            if (r6 != 0) goto L_0x00a7
            long r4 = r35.T()
            long r15 = r35.e()
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x008d
            r4 = r2
            goto L_0x0091
        L_0x008d:
            long r4 = java.lang.Math.max(r2, r4)
        L_0x0091:
            int r10 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x0097
            r10 = 0
            goto L_0x009c
        L_0x0097:
            r10 = 100
            long r10 = r10 * r4
            long r10 = r10 / r15
            int r10 = (int) r10
        L_0x009c:
            long r11 = r4 - r2
            r33 = r4
            r26 = r10
            r27 = r11
            r31 = r15
            goto L_0x00af
        L_0x00a7:
            r27 = r8
            r33 = r27
            r31 = r12
            r26 = 0
        L_0x00af:
            boolean r4 = r7.q()
            if (r4 != 0) goto L_0x00c2
            hkf r4 = new hkf
            r4.<init>()
            hkf r4 = r7.n(r1, r4, r8)
            ir8 r4 = r4.c
        L_0x00c0:
            r5 = 0
            goto L_0x00c4
        L_0x00c2:
            r4 = 0
            goto L_0x00c0
        L_0x00c4:
            uob r18 = K0(r1, r4, r2, r5)
            ni3 r1 = r0.m
            java.lang.Object r1 = r1.a
            ppb r1 = (defpackage.ppb) r1
            qwd r2 = new qwd
            r17 = r2
            long r20 = android.os.SystemClock.elapsedRealtime()
            r29 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r19 = 0
            r22 = r31
            r24 = r33
            r17.<init>(r18, r19, r20, r22, r24, r26, r27, r29, r31, r33)
            ppb r1 = r1.j(r2)
            int r2 = r1.y
            r3 = 1
            if (r2 == r3) goto L_0x00f3
            r2 = 2
            r3 = 0
            ppb r1 = r1.f(r2, r3)
        L_0x00f3:
            r8 = r1
            ni3 r1 = new ni3
            ni3 r2 = r0.m
            java.lang.Object r3 = r2.b
            r9 = r3
            zvd r9 = (defpackage.zvd) r9
            java.lang.Object r3 = r2.e
            r12 = r3
            android.os.Bundle r12 = (android.os.Bundle) r12
            r13 = 0
            java.lang.Object r3 = r2.c
            r10 = r3
            pob r10 = (defpackage.pob) r10
            java.lang.Object r2 = r2.d
            r11 = r2
            tb7 r11 = (defpackage.tb7) r11
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.S0(r1, r14, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp8.P0(int, long):void");
    }

    public final long Q() {
        return ((ppb) this.m.a).B;
    }

    public final void Q0(List list) {
        t0(0, -9223372036854775807L, list);
    }

    public final long R() {
        return h();
    }

    public final void R0(boolean z, sp8 sp8, ni3 ni3, Integer num, Integer num2) {
        sp8 sp82 = this.k;
        ni3 ni32 = this.m;
        if (sp82 != sp8) {
            this.k = new sp8(sp8);
        }
        this.l = this.k;
        this.m = ni3;
        boolean z2 = false;
        qo8 qo8 = this.b;
        tb7 tb7 = (tb7) ni3.d;
        if (z) {
            qo8.E0();
            if (!((tb7) ni32.d).equals(tb7)) {
                if (Looper.myLooper() == qo8.v.getLooper()) {
                    z2 = true;
                }
                n79.n(z2);
                oo8 oo8 = qo8.o;
                oo8.getClass();
                oo8.s();
                oo8.g();
                return;
            }
            return;
        }
        jkf jkf = ((ppb) ni32.a).j;
        ppb ppb = (ppb) ni3.a;
        boolean equals = jkf.equals(ppb.j);
        m56 m56 = this.d;
        if (!equals) {
            m56.j(0, new op8(ni3, 4));
        }
        if (!v0g.a(sp82.e, sp8.e)) {
            m56.j(15, new op8(ni3, 5));
        }
        if (num != null) {
            m56.j(11, new u00((Object) ni32, (Object) ni3, (Object) num, 16));
        }
        if (num2 != null) {
            m56.j(1, new g18(10, ni3, num2));
        }
        mob mob = sp82.b;
        boolean z3 = mob != null && mob.a == 7;
        mob mob2 = sp8.b;
        boolean z4 = mob2 != null && mob2.a == 7;
        if (!z3 || !z4 ? z3 != z4 : mob.w != mob2.w || !TextUtils.equals(mob.x, mob2.x)) {
            PlaybackException m2 = ft7.m(mob2);
            m56.j(10, new jp8(2, m2));
            if (m2 != null) {
                m56.j(10, new jp8(3, m2));
            }
        }
        if (sp82.c != sp8.c) {
            m56.j(14, new pp8(this));
        }
        ppb ppb2 = (ppb) ni32.a;
        if (ppb2.y != ppb.y) {
            m56.j(4, new op8(ni3, 6));
        }
        if (ppb2.t != ppb.t) {
            m56.j(5, new op8(ni3, 7));
        }
        if (ppb2.v != ppb.v) {
            m56.j(7, new op8(ni3, 8));
        }
        if (!ppb2.g.equals(ppb.g)) {
            m56.j(12, new op8(ni3, 9));
        }
        if (ppb2.h != ppb.h) {
            m56.j(8, new op8(ni3, 10));
        }
        if (ppb2.i != ppb.i) {
            m56.j(9, new op8(ni3, 11));
        }
        if (!ppb2.o.equals(ppb.o)) {
            m56.j(20, new op8(ni3, 0));
        }
        if (!ppb2.q.equals(ppb.q)) {
            m56.j(29, new op8(ni3, 1));
        }
        if (!(ppb2.r == ppb.r && ppb2.s == ppb.s)) {
            m56.j(30, new op8(ni3, 2));
        }
        if (!((pob) ni32.c).equals((pob) ni3.c)) {
            m56.j(13, new op8(ni3, 3));
        }
        if (!((zvd) ni32.b).equals((zvd) ni3.b)) {
            qo8.getClass();
            n79.n(Looper.myLooper() == qo8.v.getLooper());
            qo8.o.b();
        }
        if (!((tb7) ni32.d).equals(tb7)) {
            qo8.getClass();
            n79.n(Looper.myLooper() == qo8.v.getLooper());
            oo8 oo82 = qo8.o;
            oo82.getClass();
            oo8.s();
            oo82.g();
        }
        if (((iwd) ni3.f) != null) {
            qo8.getClass();
            if (Looper.myLooper() == qo8.v.getLooper()) {
                z2 = true;
            }
            n79.n(z2);
            qo8.o.getClass();
        }
        m56.h();
    }

    public final void S(int i2, List list) {
        n79.g(i2 >= 0);
        if (!list.isEmpty()) {
            bbc bbc = (bbc) ((ppb) this.m.a).j;
            if (bbc.q()) {
                t0(0, -9223372036854775807L, list);
                return;
            }
            int min = Math.min(i2, l0().p());
            bbc t = bbc.t(min, list);
            int d0 = d0();
            int size = list.size();
            if (d0 >= min) {
                d0 += size;
            }
            ppb m2 = ((ppb) this.m.a).m(t, d0);
            ni3 ni3 = this.m;
            S0(new ni3(m2, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, (Bundle) ni3.e, (iwd) null), (Integer) null, (Integer) null);
            if (N0()) {
                H0(min, list);
            }
        }
    }

    public final void S0(ni3 ni3, Integer num, Integer num2) {
        R0(false, this.k, ni3, num, num2);
    }

    public final long T() {
        return ((ppb) this.m.a).c.e;
    }

    public final void U() {
        this.g.r().h.skipToNext();
    }

    public final void V(int i2) {
        int i3 = i() - 1;
        if (i3 >= D().b) {
            ppb c2 = ((ppb) this.m.a).c(i3, m0());
            ni3 ni3 = this.m;
            S0(new ni3(c2, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, (Bundle) ni3.e, (iwd) null), (Integer) null, (Integer) null);
        }
        ((uo8) this.g.b).a.adjustVolume(-1, i2);
    }

    public final qqf W() {
        return qqf.b;
    }

    public final boolean X() {
        return this.j;
    }

    public final us8 Y() {
        return ((ppb) this.m.a).m;
    }

    public final o44 Z() {
        i8b.V("Session doesn't support getting Cue");
        return o44.c;
    }

    public final boolean a() {
        return ((ppb) this.m.a).v;
    }

    public final void a0(i30 i30, boolean z) {
        i8b.V("Legacy session doesn't support setting audio attributes remotely");
    }

    public final float b() {
        return 1.0f;
    }

    public final void b0(us8 us8) {
        i8b.V("Session doesn't support setting playlist metadata");
    }

    public final gob c() {
        return ((ppb) this.m.a).g;
    }

    public final int c0() {
        return -1;
    }

    public final void connect() {
        oxd oxd = this.c;
        int type = oxd.a.getType();
        qo8 qo8 = this.b;
        if (type == 0) {
            Object c2 = oxd.a.c();
            n79.o(c2);
            qo8.H0(new uo5(26, (Object) this, (Object) (ox8) c2));
            qo8.v.post(new qp8(this, 0));
            return;
        }
        qo8.H0(new qp8(this, 1));
    }

    public final boolean d() {
        return false;
    }

    public final int d0() {
        return ((ppb) this.m.a).c.a.b;
    }

    public final long e() {
        return ((ppb) this.m.a).c.d;
    }

    public final void e0(boolean z) {
        C(1, z);
    }

    public final void f(gob gob) {
        if (!gob.equals(c())) {
            ppb e2 = ((ppb) this.m.a).e(gob);
            ni3 ni3 = this.m;
            S0(new ni3(e2, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, (Bundle) ni3.e, (iwd) null), (Integer) null, (Integer) null);
        }
        xo8 r = this.g.r();
        float f2 = gob.a;
        if (f2 != c44.DEFAULT_ASPECT_RATIO) {
            r.h.setPlaybackSpeed(f2);
            return;
        }
        throw new IllegalArgumentException("speed must not be zero");
    }

    public final void f0(sob sob) {
        this.d.l(sob);
    }

    public final void g(float f2) {
        i8b.V("Session doesn't support setting player volume");
    }

    public final void g0(List list, int i2, int i3) {
        n79.g(i2 >= 0 && i2 <= i3);
        int p = ((bbc) ((ppb) this.m.a).j).p();
        if (i2 <= p) {
            int min = Math.min(i3, p);
            S(min, list);
            L(i2, min);
        }
    }

    public final int getPlaybackState() {
        return ((ppb) this.m.a).y;
    }

    public final int getRepeatMode() {
        return ((ppb) this.m.a).h;
    }

    public final long h() {
        long z = kne.z((ppb) this.m.a, this.n, this.o, this.b.w);
        this.n = z;
        return z;
    }

    public final void h0(int i2, int i3) {
        i0(i2, i2 + 1, i3);
    }

    public final int i() {
        ppb ppb = (ppb) this.m.a;
        if (ppb.q.a == 1) {
            return ppb.r;
        }
        xe8 xe8 = this.g;
        if (xe8 == null) {
            return 0;
        }
        vo8 p = xe8.p();
        dc7 dc7 = ft7.a;
        if (p == null) {
            return 0;
        }
        return p.e;
    }

    public final void i0(int i2, int i3, int i4) {
        n79.g(i2 >= 0 && i2 <= i3 && i4 >= 0);
        bbc bbc = (bbc) ((ppb) this.m.a).j;
        int p = bbc.p();
        int min = Math.min(i3, p);
        int i5 = min - i2;
        int i6 = p - i5;
        int i7 = i6 - 1;
        int min2 = Math.min(i4, i6);
        if (i2 < p && i2 != min && i2 != min2) {
            int d0 = d0();
            if (d0 >= i2) {
                d0 = d0 < min ? -1 : d0 - i5;
            }
            if (d0 == -1) {
                d0 = v0g.j(i2, 0, i7);
                i8b.V("Currently playing item will be removed and added back to mimic move. Assumes item at " + d0 + " would be the new current item");
            }
            if (d0 >= min2) {
                d0 += i5;
            }
            ArrayList arrayList = new ArrayList(bbc.e);
            v0g.R(arrayList, i2, min, min2);
            ppb m2 = ((ppb) this.m.a).m(new bbc(tb7.p(arrayList), bbc.f), d0);
            ni3 ni3 = this.m;
            S0(new ni3(m2, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, (Bundle) ni3.e, (iwd) null), (Integer) null, (Integer) null);
            if (N0()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i8 = 0; i8 < i5; i8++) {
                    arrayList2.add((mx8) this.k.d.get(i2));
                    this.g.z(((mx8) this.k.d.get(i2)).a);
                }
                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                    this.g.e(((mx8) arrayList2.get(i9)).a, i9 + min2);
                }
            }
        }
    }

    public final boolean isConnected() {
        return this.j;
    }

    public final void j(Surface surface) {
        i8b.V("Session doesn't support setting Surface");
    }

    public final int j0() {
        return 0;
    }

    public final boolean k() {
        return ((ppb) this.m.a).c.b;
    }

    public final void k0(List list) {
        S(IntCompanionObject.MAX_VALUE, list);
    }

    public final long l() {
        return -9223372036854775807L;
    }

    public final jkf l0() {
        return ((ppb) this.m.a).j;
    }

    public final long m() {
        return ((ppb) this.m.a).c.g;
    }

    public final boolean m0() {
        ppb ppb = (ppb) this.m.a;
        if (ppb.q.a == 1) {
            return ppb.s;
        }
        xe8 xe8 = this.g;
        if (xe8 != null) {
            vo8 p = xe8.p();
            dc7 dc7 = ft7.a;
            if (p != null && p.e == 0) {
                return true;
            }
        }
        return false;
    }

    public final void n(int i2, long j2) {
        P0(i2, j2);
    }

    public final void n0(int i2, ir8 ir8) {
        g0(tb7.t(ir8), i2, i2 + 1);
    }

    public final pob o() {
        return (pob) this.m.c;
    }

    public final void o0(ir8 ir8) {
        F0(ir8);
    }

    public final void p(ir8 ir8, long j2) {
        t0(0, j2, tb7.t(ir8));
    }

    public final void p0() {
        H(1);
    }

    public final void pause() {
        O(false);
    }

    public final void play() {
        O(true);
    }

    public final void prepare() {
        ppb ppb = (ppb) this.m.a;
        if (ppb.y == 1) {
            ppb f2 = ppb.f(ppb.j.q() ? 4 : 2, (PlaybackException) null);
            ni3 ni3 = this.m;
            S0(new ni3(f2, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, (Bundle) ni3.e, (iwd) null), (Integer) null, (Integer) null);
            if (!((ppb) this.m.a).j.q()) {
                M0();
            }
        }
    }

    public final boolean q() {
        return ((ppb) this.m.a).t;
    }

    public final boolean q0() {
        return ((ppb) this.m.a).i;
    }

    public final void r() {
        L(0, IntCompanionObject.MAX_VALUE);
    }

    public final kqf r0() {
        return kqf.C;
    }

    public final void release() {
        Messenger messenger;
        if (!this.i) {
            this.i = true;
            lm8 lm8 = this.h;
            if (lm8 != null) {
                jm8 jm8 = lm8.a;
                dm4 dm4 = jm8.f;
                if (!(dm4 == null || (messenger = jm8.g) == null)) {
                    try {
                        dm4.u(7, (Bundle) null, messenger);
                    } catch (RemoteException unused) {
                    }
                }
                jm8.b.disconnect();
                this.h = null;
            }
            xe8 xe8 = this.g;
            if (xe8 != null) {
                rp8 rp8 = this.e;
                if (rp8 != null) {
                    if (((Set) xe8.c).remove(rp8)) {
                        try {
                            ((uo8) xe8.b).b(rp8);
                        } finally {
                            rp8.j((Handler) null);
                        }
                    }
                    rp8.d.removeCallbacksAndMessages((Object) null);
                    this.g = null;
                } else {
                    throw new IllegalArgumentException("callback must not be null");
                }
            }
            this.j = false;
            this.d.k();
        }
    }

    public final void s(boolean z) {
        if (z != q0()) {
            ppb k2 = ((ppb) this.m.a).k(z);
            ni3 ni3 = this.m;
            S0(new ni3(k2, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, (Bundle) ni3.e, (iwd) null), (Integer) null, (Integer) null);
        }
        xo8 r = this.g.r();
        dc7 dc7 = ft7.a;
        Bundle bundle = new Bundle();
        bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE, z ? 1 : 0);
        r.T(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE, bundle);
    }

    public final long s0() {
        return T();
    }

    public final void seekTo(long j2) {
        P0(d0(), j2);
    }

    public final void setPlaybackSpeed(float f2) {
        if (f2 != c().a) {
            ppb e2 = ((ppb) this.m.a).e(new gob(f2));
            ni3 ni3 = this.m;
            S0(new ni3(e2, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, (Bundle) ni3.e, (iwd) null), (Integer) null, (Integer) null);
        }
        xo8 r = this.g.r();
        if (f2 != c44.DEFAULT_ASPECT_RATIO) {
            r.h.setPlaybackSpeed(f2);
            return;
        }
        throw new IllegalArgumentException("speed must not be zero");
    }

    public final void setRepeatMode(int i2) {
        if (i2 != getRepeatMode()) {
            ppb i3 = ((ppb) this.m.a).i(i2);
            ni3 ni3 = this.m;
            S0(new ni3(i3, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, (Bundle) ni3.e, (iwd) null), (Integer) null, (Integer) null);
        }
        xo8 r = this.g.r();
        int n2 = ft7.n(i2);
        Bundle bundle = new Bundle();
        bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE, n2);
        r.T(MediaSessionCompat.ACTION_SET_REPEAT_MODE, bundle);
    }

    public final void stop() {
        ppb ppb = (ppb) this.m.a;
        if (ppb.y != 1) {
            qwd qwd = ppb.c;
            uob uob = qwd.a;
            long j2 = uob.f;
            long j3 = qwd.d;
            ppb j4 = ppb.j(new qwd(uob, false, SystemClock.elapsedRealtime(), j3, j2, kne.h(j2, j3), 0, -9223372036854775807L, j3, j2));
            ppb ppb2 = (ppb) this.m.a;
            if (ppb2.y != 1) {
                j4 = j4.f(1, ppb2.a);
            }
            ni3 ni3 = this.m;
            S0(new ni3(j4, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, (Bundle) ni3.e, (iwd) null), (Integer) null, (Integer) null);
            this.g.r().h.stop();
        }
    }

    public final int t() {
        return ((ppb) this.m.a).c.f;
    }

    public final void t0(int i2, long j2, List list) {
        int i3 = i2;
        List list2 = list;
        if (list.isEmpty()) {
            r();
            return;
        }
        ppb n2 = ((ppb) this.m.a).n(bbc.g.t(0, list2), new qwd(K0(i3, (ir8) list2.get(i3), j2 == -9223372036854775807L ? 0 : j2, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0, 0, 0, -9223372036854775807L, -9223372036854775807L, 0), 0);
        ni3 ni3 = this.m;
        S0(new ni3(n2, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, (Bundle) ni3.e, (iwd) null), (Integer) null, (Integer) null);
        if (N0()) {
            M0();
        }
    }

    public final long u() {
        return ((ppb) this.m.a).C;
    }

    public final void u0(int i2) {
        F(i2, 1);
    }

    public final void v(sob sob) {
        this.d.c(sob);
    }

    public final void v0() {
        this.g.r().h.skipToNext();
    }

    public final long w() {
        return e();
    }

    public final void w0() {
        this.g.r().h.fastForward();
    }

    public final int x() {
        return d0();
    }

    public final void x0() {
        this.g.r().h.rewind();
    }

    public final v8g y() {
        i8b.V("Session doesn't support getting VideoSize");
        return v8g.e;
    }

    public final us8 y0() {
        ir8 s = ((ppb) this.m.a).s();
        return s == null ? us8.J : s.d;
    }

    public final void z() {
        this.g.r().h.skipToPrevious();
    }

    public final void z0(List list) {
        Q0(list);
    }
}
