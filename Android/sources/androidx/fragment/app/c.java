package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.uuid.Uuid;

public abstract class c {
    public rc6 A;
    public final wc6 B;
    public final p9a C;
    public d9 D;
    public d9 E;
    public d9 F;
    public ArrayDeque G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public FragmentManagerViewModel P;
    public final cf Q;
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final f c = new f();
    public ArrayList d = new ArrayList();
    public ArrayList e;
    public final sc6 f = new sc6(this);
    public fma g;
    public xe0 h = null;
    public final wx3 i = new wx3(5, (Object) this);
    public final AtomicInteger j = new AtomicInteger();
    public final Map k = Collections.synchronizedMap(new HashMap());
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());
    public final ArrayList n = new ArrayList();
    public final wsb o;
    public final CopyOnWriteArrayList p;
    public final uc6 q;
    public final uc6 r;
    public final uc6 s;
    public final uc6 t;
    public final vc6 u;
    public int v;
    public oc6 w;
    public ld8 x;
    public a y;
    public a z;

    /* JADX WARNING: type inference failed for: r1v9, types: [wsb, java.lang.Object] */
    public c() {
        ? obj = new Object();
        obj.a = this;
        obj.b = new CopyOnWriteArrayList();
        this.o = obj;
        this.p = new CopyOnWriteArrayList();
        this.q = new uc6(this, 0);
        this.r = new uc6(this, 1);
        this.s = new uc6(this, 2);
        this.t = new uc6(this, 3);
        this.u = new vc6(this);
        this.v = -1;
        this.A = null;
        this.B = new wc6(0, this);
        this.C = new p9a(12);
        this.G = new ArrayDeque();
        this.Q = new cf(24, this);
    }

    public static HashSet G(xe0 xe0) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < xe0.a.size(); i2++) {
            a aVar = ((md6) xe0.a.get(i2)).b;
            if (aVar != null && xe0.g) {
                hashSet.add(aVar);
            }
        }
        return hashSet;
    }

    public static boolean M(a aVar) {
        if (aVar.O0 && aVar.P0) {
            return true;
        }
        Iterator it = aVar.F0.c.e().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2 != null) {
                z2 = M(aVar2);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean O(a aVar) {
        if (aVar == null) {
            return true;
        }
        return aVar.P0 && (aVar.D0 == null || O(aVar.G0));
    }

    public static boolean P(a aVar) {
        if (aVar == null) {
            return true;
        }
        c cVar = aVar.D0;
        return aVar.equals(cVar.z) && P(cVar.y);
    }

    public final boolean A(boolean z2) {
        boolean z3;
        z(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.M;
            ArrayList arrayList2 = this.N;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.a.size();
                        z3 = false;
                        for (int i2 = 0; i2 < size; i2++) {
                            z3 |= ((bd6) this.a.get(i2)).a(arrayList, arrayList2);
                        }
                    } finally {
                        this.a.clear();
                        this.w.x0.removeCallbacks(this.Q);
                    }
                }
            }
            if (z3) {
                z4 = true;
                this.b = true;
                try {
                    Z(this.M, this.N);
                } finally {
                    d();
                }
            } else {
                m0();
                v();
                this.c.b.values().removeAll(Collections.singleton((Object) null));
                return z4;
            }
        }
    }

    public final void B(bd6 bd6, boolean z2) {
        if (!z2 || (this.w != null && !this.K)) {
            z(z2);
            if (bd6.a(this.M, this.N)) {
                this.b = true;
                try {
                    Z(this.M, this.N);
                } finally {
                    d();
                }
            }
            m0();
            v();
            this.c.b.values().removeAll(Collections.singleton((Object) null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: androidx.fragment.app.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0265, code lost:
        r16 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0267, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02fb, code lost:
        r7 = r7 - 1;
        r11 = r3;
        r3 = r16;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(java.util.ArrayList r24, java.util.ArrayList r25, int r26, int r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            java.lang.Object r5 = r1.get(r3)
            xe0 r5 = (defpackage.xe0) r5
            boolean r5 = r5.p
            java.util.ArrayList r6 = r0.O
            if (r6 != 0) goto L_0x001e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.O = r6
            goto L_0x0021
        L_0x001e:
            r6.clear()
        L_0x0021:
            java.util.ArrayList r6 = r0.O
            androidx.fragment.app.f r7 = r0.c
            java.util.List r8 = r7.f()
            r6.addAll(r8)
            androidx.fragment.app.a r6 = r0.z
            r9 = r3
            r10 = 0
        L_0x0030:
            r12 = 1
            if (r9 >= r4) goto L_0x018a
            java.lang.Object r14 = r1.get(r9)
            xe0 r14 = (defpackage.xe0) r14
            java.lang.Object r15 = r2.get(r9)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L_0x013b
            java.util.ArrayList r15 = r0.O
            r8 = 0
        L_0x0048:
            java.util.ArrayList r13 = r14.a
            int r11 = r13.size()
            if (r8 >= r11) goto L_0x0138
            java.lang.Object r11 = r13.get(r8)
            md6 r11 = (defpackage.md6) r11
            int r3 = r11.a
            if (r3 == r12) goto L_0x0124
            r12 = 2
            if (r3 == r12) goto L_0x00a3
            r12 = 3
            if (r3 == r12) goto L_0x0088
            r12 = 6
            if (r3 == r12) goto L_0x0088
            r12 = 7
            if (r3 == r12) goto L_0x0083
            r12 = 8
            if (r3 == r12) goto L_0x006b
            goto L_0x007e
        L_0x006b:
            md6 r3 = new md6
            r2 = 9
            r12 = 0
            r3.<init>(r2, r6, r12)
            r13.add(r8, r3)
            r2 = 1
            r11.c = r2
            int r8 = r8 + 1
            androidx.fragment.app.a r2 = r11.b
            r6 = r2
        L_0x007e:
            r21 = r7
            r1 = 1
            goto L_0x012c
        L_0x0083:
            r21 = r7
            r1 = 1
            goto L_0x0127
        L_0x0088:
            androidx.fragment.app.a r2 = r11.b
            r15.remove(r2)
            androidx.fragment.app.a r2 = r11.b
            if (r2 != r6) goto L_0x007e
            md6 r3 = new md6
            r6 = 9
            r3.<init>(r6, r2)
            r13.add(r8, r3)
            int r8 = r8 + 1
            r21 = r7
            r1 = 1
            r6 = 0
            goto L_0x012c
        L_0x00a3:
            androidx.fragment.app.a r2 = r11.b
            int r3 = r2.I0
            int r12 = r15.size()
            r17 = 1
            int r12 = r12 + -1
            r19 = 0
        L_0x00b1:
            if (r12 < 0) goto L_0x0111
            java.lang.Object r20 = r15.get(r12)
            r21 = r7
            r7 = r20
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            int r1 = r7.I0
            if (r1 != r3) goto L_0x0105
            if (r7 != r2) goto L_0x00c9
            r18 = r3
            r1 = 1
            r19 = 1
            goto L_0x0108
        L_0x00c9:
            if (r7 != r6) goto L_0x00dd
            md6 r1 = new md6
            r18 = r3
            r3 = 9
            r6 = 0
            r1.<init>(r3, r7, r6)
            r13.add(r8, r1)
            int r8 = r8 + 1
            r1 = r6
            r6 = 0
            goto L_0x00e2
        L_0x00dd:
            r18 = r3
            r1 = 0
            r3 = 9
        L_0x00e2:
            md6 r3 = new md6
            r22 = r6
            r6 = 3
            r3.<init>(r6, r7, r1)
            int r1 = r11.d
            r3.d = r1
            int r1 = r11.f
            r3.f = r1
            int r1 = r11.e
            r3.e = r1
            int r1 = r11.g
            r3.g = r1
            r13.add(r8, r3)
            r15.remove(r7)
            r1 = 1
            int r8 = r8 + r1
            r6 = r22
            goto L_0x0108
        L_0x0105:
            r18 = r3
            r1 = 1
        L_0x0108:
            int r12 = r12 + -1
            r1 = r24
            r3 = r18
            r7 = r21
            goto L_0x00b1
        L_0x0111:
            r21 = r7
            r1 = 1
            if (r19 == 0) goto L_0x011c
            r13.remove(r8)
            int r8 = r8 + -1
            goto L_0x012c
        L_0x011c:
            r11.a = r1
            r11.c = r1
            r15.add(r2)
            goto L_0x012c
        L_0x0124:
            r21 = r7
            r1 = r12
        L_0x0127:
            androidx.fragment.app.a r2 = r11.b
            r15.add(r2)
        L_0x012c:
            int r8 = r8 + r1
            r2 = r25
            r3 = r26
            r12 = r1
            r7 = r21
            r1 = r24
            goto L_0x0048
        L_0x0138:
            r21 = r7
            goto L_0x0174
        L_0x013b:
            r21 = r7
            r1 = r12
            java.util.ArrayList r2 = r0.O
            java.util.ArrayList r3 = r14.a
            int r7 = r3.size()
            int r7 = r7 - r1
        L_0x0147:
            if (r7 < 0) goto L_0x0174
            java.lang.Object r8 = r3.get(r7)
            md6 r8 = (defpackage.md6) r8
            int r11 = r8.a
            if (r11 == r1) goto L_0x016a
            r1 = 3
            if (r11 == r1) goto L_0x0164
            switch(r11) {
                case 6: goto L_0x0164;
                case 7: goto L_0x016b;
                case 8: goto L_0x0162;
                case 9: goto L_0x015f;
                case 10: goto L_0x015a;
                default: goto L_0x0159;
            }
        L_0x0159:
            goto L_0x0170
        L_0x015a:
            iu7 r11 = r8.h
            r8.i = r11
            goto L_0x0170
        L_0x015f:
            androidx.fragment.app.a r6 = r8.b
            goto L_0x0170
        L_0x0162:
            r6 = 0
            goto L_0x0170
        L_0x0164:
            androidx.fragment.app.a r8 = r8.b
            r2.add(r8)
            goto L_0x0170
        L_0x016a:
            r1 = 3
        L_0x016b:
            androidx.fragment.app.a r8 = r8.b
            r2.remove(r8)
        L_0x0170:
            int r7 = r7 + -1
            r1 = 1
            goto L_0x0147
        L_0x0174:
            if (r10 != 0) goto L_0x017d
            boolean r1 = r14.g
            if (r1 == 0) goto L_0x017b
            goto L_0x017d
        L_0x017b:
            r10 = 0
            goto L_0x017e
        L_0x017d:
            r10 = 1
        L_0x017e:
            int r9 = r9 + 1
            r1 = r24
            r2 = r25
            r3 = r26
            r7 = r21
            goto L_0x0030
        L_0x018a:
            r21 = r7
            java.util.ArrayList r1 = r0.O
            r1.clear()
            if (r5 != 0) goto L_0x01d2
            int r1 = r0.v
            r2 = 1
            if (r1 < r2) goto L_0x01d2
            r1 = r26
        L_0x019a:
            if (r1 >= r4) goto L_0x01d2
            r2 = r24
            java.lang.Object r3 = r2.get(r1)
            xe0 r3 = (defpackage.xe0) r3
            java.util.ArrayList r3 = r3.a
            java.util.Iterator r3 = r3.iterator()
        L_0x01aa:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01cd
            java.lang.Object r5 = r3.next()
            md6 r5 = (defpackage.md6) r5
            androidx.fragment.app.a r5 = r5.b
            if (r5 == 0) goto L_0x01c8
            androidx.fragment.app.c r6 = r5.D0
            if (r6 == 0) goto L_0x01c8
            androidx.fragment.app.e r5 = r0.g(r5)
            r6 = r21
            r6.g(r5)
            goto L_0x01ca
        L_0x01c8:
            r6 = r21
        L_0x01ca:
            r21 = r6
            goto L_0x01aa
        L_0x01cd:
            r6 = r21
            int r1 = r1 + 1
            goto L_0x019a
        L_0x01d2:
            r2 = r24
            r1 = r26
        L_0x01d6:
            r3 = -1
            if (r1 >= r4) goto L_0x040a
            java.lang.Object r5 = r2.get(r1)
            xe0 r5 = (defpackage.xe0) r5
            r6 = r25
            java.lang.Object r7 = r6.get(r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.String r8 = "FragmentManager"
            java.lang.String r9 = "Unknown cmd: "
            if (r7 == 0) goto L_0x0302
            r5.d(r3)
            java.util.ArrayList r3 = r5.a
            int r7 = r3.size()
            r11 = 1
            int r7 = r7 - r11
        L_0x01fc:
            if (r7 < 0) goto L_0x0406
            java.lang.Object r12 = r3.get(r7)
            md6 r12 = (defpackage.md6) r12
            androidx.fragment.app.a r13 = r12.b
            if (r13 == 0) goto L_0x0245
            kc6 r14 = r13.V0
            if (r14 != 0) goto L_0x020d
            goto L_0x0213
        L_0x020d:
            kc6 r14 = r13.L1()
            r14.a = r11
        L_0x0213:
            int r11 = r5.f
            r14 = 8194(0x2002, float:1.1482E-41)
            r15 = 4097(0x1001, float:5.741E-42)
            if (r11 == r15) goto L_0x022f
            if (r11 == r14) goto L_0x022e
            r14 = 4100(0x1004, float:5.745E-42)
            r15 = 8197(0x2005, float:1.1486E-41)
            if (r11 == r15) goto L_0x022f
            r15 = 4099(0x1003, float:5.744E-42)
            if (r11 == r15) goto L_0x022e
            if (r11 == r14) goto L_0x022b
            r14 = 0
            goto L_0x022f
        L_0x022b:
            r14 = 8197(0x2005, float:1.1486E-41)
            goto L_0x022f
        L_0x022e:
            r14 = r15
        L_0x022f:
            kc6 r11 = r13.V0
            if (r11 != 0) goto L_0x0236
            if (r14 != 0) goto L_0x0236
            goto L_0x023d
        L_0x0236:
            r13.L1()
            kc6 r11 = r13.V0
            r11.f = r14
        L_0x023d:
            r13.L1()
            kc6 r11 = r13.V0
            r11.getClass()
        L_0x0245:
            int r11 = r12.a
            androidx.fragment.app.c r14 = r5.r
            switch(r11) {
                case 1: goto L_0x02e7;
                case 2: goto L_0x024c;
                case 3: goto L_0x02d6;
                case 4: goto L_0x02ae;
                case 5: goto L_0x0299;
                case 6: goto L_0x0288;
                case 7: goto L_0x0273;
                case 8: goto L_0x026e;
                case 9: goto L_0x026a;
                case 10: goto L_0x0260;
                default: goto L_0x024c;
            }
        L_0x024c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            int r2 = r12.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0260:
            iu7 r11 = r12.h
            r14.h0(r13, r11)
        L_0x0265:
            r16 = r3
        L_0x0267:
            r3 = 1
            goto L_0x02fb
        L_0x026a:
            r14.i0(r13)
            goto L_0x0265
        L_0x026e:
            r11 = 0
            r14.i0(r11)
            goto L_0x0265
        L_0x0273:
            int r11 = r12.d
            int r15 = r12.e
            r16 = r3
            int r3 = r12.f
            int r12 = r12.g
            r13.K2(r11, r15, r3, r12)
            r3 = 1
            r14.e0(r13, r3)
            r14.h(r13)
            goto L_0x0267
        L_0x0288:
            r16 = r3
            int r3 = r12.d
            int r11 = r12.e
            int r15 = r12.f
            int r12 = r12.g
            r13.K2(r3, r11, r15, r12)
            r14.c(r13)
            goto L_0x0267
        L_0x0299:
            r16 = r3
            int r3 = r12.d
            int r11 = r12.e
            int r15 = r12.f
            int r12 = r12.g
            r13.K2(r3, r11, r15, r12)
            r3 = 1
            r14.e0(r13, r3)
            r14.L(r13)
            goto L_0x0267
        L_0x02ae:
            r16 = r3
            int r3 = r12.d
            int r11 = r12.e
            int r15 = r12.f
            int r12 = r12.g
            r13.K2(r3, r11, r15, r12)
            r14.getClass()
            r3 = 2
            boolean r11 = android.util.Log.isLoggable(r8, r3)
            if (r11 == 0) goto L_0x02c8
            java.util.Objects.toString(r13)
        L_0x02c8:
            boolean r3 = r13.K0
            if (r3 == 0) goto L_0x0267
            r3 = 0
            r13.K0 = r3
            boolean r3 = r13.W0
            r11 = 1
            r3 = r3 ^ r11
            r13.W0 = r3
            goto L_0x0267
        L_0x02d6:
            r16 = r3
            int r3 = r12.d
            int r11 = r12.e
            int r15 = r12.f
            int r12 = r12.g
            r13.K2(r3, r11, r15, r12)
            r14.a(r13)
            goto L_0x0267
        L_0x02e7:
            r16 = r3
            int r3 = r12.d
            int r11 = r12.e
            int r15 = r12.f
            int r12 = r12.g
            r13.K2(r3, r11, r15, r12)
            r3 = 1
            r14.e0(r13, r3)
            r14.Y(r13)
        L_0x02fb:
            int r7 = r7 + -1
            r11 = r3
            r3 = r16
            goto L_0x01fc
        L_0x0302:
            r3 = 1
            r5.d(r3)
            java.util.ArrayList r3 = r5.a
            int r7 = r3.size()
            r12 = 0
        L_0x030d:
            if (r12 >= r7) goto L_0x0406
            java.lang.Object r11 = r3.get(r12)
            md6 r11 = (defpackage.md6) r11
            androidx.fragment.app.a r13 = r11.b
            if (r13 == 0) goto L_0x033d
            kc6 r14 = r13.V0
            if (r14 != 0) goto L_0x031e
            goto L_0x0325
        L_0x031e:
            kc6 r14 = r13.L1()
            r15 = 0
            r14.a = r15
        L_0x0325:
            int r14 = r5.f
            kc6 r15 = r13.V0
            if (r15 != 0) goto L_0x032e
            if (r14 != 0) goto L_0x032e
            goto L_0x0335
        L_0x032e:
            r13.L1()
            kc6 r15 = r13.V0
            r15.f = r14
        L_0x0335:
            r13.L1()
            kc6 r14 = r13.V0
            r14.getClass()
        L_0x033d:
            int r14 = r11.a
            androidx.fragment.app.c r15 = r5.r
            switch(r14) {
                case 1: goto L_0x03e8;
                case 2: goto L_0x0344;
                case 3: goto L_0x03d5;
                case 4: goto L_0x03c1;
                case 5: goto L_0x0397;
                case 6: goto L_0x0384;
                case 7: goto L_0x036c;
                case 8: goto L_0x0368;
                case 9: goto L_0x0363;
                case 10: goto L_0x0358;
                default: goto L_0x0344;
            }
        L_0x0344:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            int r2 = r11.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0358:
            iu7 r11 = r11.i
            r15.h0(r13, r11)
        L_0x035d:
            r16 = r3
            r18 = r5
            goto L_0x03fe
        L_0x0363:
            r11 = 0
            r15.i0(r11)
            goto L_0x035d
        L_0x0368:
            r15.i0(r13)
            goto L_0x035d
        L_0x036c:
            int r14 = r11.d
            r16 = r3
            int r3 = r11.e
            r18 = r5
            int r5 = r11.f
            int r11 = r11.g
            r13.K2(r14, r3, r5, r11)
            r3 = 0
            r15.e0(r13, r3)
            r15.c(r13)
            goto L_0x03fe
        L_0x0384:
            r16 = r3
            r18 = r5
            int r3 = r11.d
            int r5 = r11.e
            int r14 = r11.f
            int r11 = r11.g
            r13.K2(r3, r5, r14, r11)
            r15.h(r13)
            goto L_0x03fe
        L_0x0397:
            r16 = r3
            r18 = r5
            int r3 = r11.d
            int r5 = r11.e
            int r14 = r11.f
            int r11 = r11.g
            r13.K2(r3, r5, r14, r11)
            r3 = 0
            r15.e0(r13, r3)
            r5 = 2
            boolean r11 = android.util.Log.isLoggable(r8, r5)
            if (r11 == 0) goto L_0x03b4
            java.util.Objects.toString(r13)
        L_0x03b4:
            boolean r11 = r13.K0
            if (r11 == 0) goto L_0x03fe
            r13.K0 = r3
            boolean r3 = r13.W0
            r11 = 1
            r3 = r3 ^ r11
            r13.W0 = r3
            goto L_0x03fe
        L_0x03c1:
            r16 = r3
            r18 = r5
            r5 = 2
            int r3 = r11.d
            int r14 = r11.e
            int r5 = r11.f
            int r11 = r11.g
            r13.K2(r3, r14, r5, r11)
            r15.L(r13)
            goto L_0x03fe
        L_0x03d5:
            r16 = r3
            r18 = r5
            int r3 = r11.d
            int r5 = r11.e
            int r14 = r11.f
            int r11 = r11.g
            r13.K2(r3, r5, r14, r11)
            r15.Y(r13)
            goto L_0x03fe
        L_0x03e8:
            r16 = r3
            r18 = r5
            int r3 = r11.d
            int r5 = r11.e
            int r14 = r11.f
            int r11 = r11.g
            r13.K2(r3, r5, r14, r11)
            r3 = 0
            r15.e0(r13, r3)
            r15.a(r13)
        L_0x03fe:
            int r12 = r12 + 1
            r3 = r16
            r5 = r18
            goto L_0x030d
        L_0x0406:
            int r1 = r1 + 1
            goto L_0x01d6
        L_0x040a:
            r6 = r25
            int r1 = r4 + -1
            java.lang.Object r1 = r6.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.util.ArrayList r5 = r0.n
            if (r10 == 0) goto L_0x048b
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x048b
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.util.Iterator r8 = r24.iterator()
        L_0x042b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x043f
            java.lang.Object r9 = r8.next()
            xe0 r9 = (defpackage.xe0) r9
            java.util.HashSet r9 = G(r9)
            r7.addAll(r9)
            goto L_0x042b
        L_0x043f:
            xe0 r8 = r0.h
            if (r8 != 0) goto L_0x048b
            java.util.Iterator r8 = r5.iterator()
        L_0x0447:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0467
            java.lang.Object r9 = r8.next()
            defpackage.rae.w(r9)
            java.util.Iterator r9 = r7.iterator()
            boolean r11 = r9.hasNext()
            if (r11 != 0) goto L_0x045f
            goto L_0x0447
        L_0x045f:
            java.lang.Object r0 = r9.next()
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            r0 = 0
            throw r0
        L_0x0467:
            java.util.Iterator r8 = r5.iterator()
        L_0x046b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x048b
            java.lang.Object r9 = r8.next()
            defpackage.rae.w(r9)
            java.util.Iterator r9 = r7.iterator()
            boolean r11 = r9.hasNext()
            if (r11 != 0) goto L_0x0483
            goto L_0x046b
        L_0x0483:
            java.lang.Object r0 = r9.next()
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            r0 = 0
            throw r0
        L_0x048b:
            r7 = r26
        L_0x048d:
            if (r7 >= r4) goto L_0x04d8
            java.lang.Object r8 = r2.get(r7)
            xe0 r8 = (defpackage.xe0) r8
            if (r1 == 0) goto L_0x04b7
            java.util.ArrayList r9 = r8.a
            int r9 = r9.size()
            r11 = 1
            int r9 = r9 - r11
        L_0x049f:
            if (r9 < 0) goto L_0x04d5
            java.util.ArrayList r11 = r8.a
            java.lang.Object r11 = r11.get(r9)
            md6 r11 = (defpackage.md6) r11
            androidx.fragment.app.a r11 = r11.b
            if (r11 == 0) goto L_0x04b4
            androidx.fragment.app.e r11 = r0.g(r11)
            r11.k()
        L_0x04b4:
            int r9 = r9 + -1
            goto L_0x049f
        L_0x04b7:
            java.util.ArrayList r8 = r8.a
            java.util.Iterator r8 = r8.iterator()
        L_0x04bd:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x04d5
            java.lang.Object r9 = r8.next()
            md6 r9 = (defpackage.md6) r9
            androidx.fragment.app.a r9 = r9.b
            if (r9 == 0) goto L_0x04bd
            androidx.fragment.app.e r9 = r0.g(r9)
            r9.k()
            goto L_0x04bd
        L_0x04d5:
            int r7 = r7 + 1
            goto L_0x048d
        L_0x04d8:
            int r7 = r0.v
            r8 = 1
            r0.R(r7, r8)
            r7 = r26
            java.util.HashSet r0 = r0.f(r2, r7, r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x04e8:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x04fd
            java.lang.Object r8 = r0.next()
            tge r8 = (defpackage.tge) r8
            r8.d = r1
            r8.i()
            r8.e()
            goto L_0x04e8
        L_0x04fd:
            if (r7 >= r4) goto L_0x0538
            java.lang.Object r0 = r2.get(r7)
            xe0 r0 = (defpackage.xe0) r0
            java.lang.Object r1 = r6.get(r7)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0517
            int r1 = r0.t
            if (r1 < 0) goto L_0x0517
            r0.t = r3
        L_0x0517:
            java.util.ArrayList r1 = r0.q
            if (r1 == 0) goto L_0x0535
            r12 = 0
        L_0x051c:
            java.util.ArrayList r1 = r0.q
            int r1 = r1.size()
            if (r12 >= r1) goto L_0x0532
            java.util.ArrayList r1 = r0.q
            java.lang.Object r1 = r1.get(r12)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            int r12 = r12 + 1
            goto L_0x051c
        L_0x0532:
            r1 = 0
            r0.q = r1
        L_0x0535:
            int r7 = r7 + 1
            goto L_0x04fd
        L_0x0538:
            if (r10 == 0) goto L_0x054b
            int r0 = r5.size()
            if (r0 > 0) goto L_0x0541
            goto L_0x054b
        L_0x0541:
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            defpackage.rae.w(r0)
            r0 = 0
            throw r0
        L_0x054b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.C(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final a D(int i2) {
        f fVar = this.c;
        ArrayList arrayList = fVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (aVar != null && aVar.H0 == i2) {
                return aVar;
            }
        }
        for (e eVar : fVar.b.values()) {
            if (eVar != null) {
                a aVar2 = eVar.c;
                if (aVar2.H0 == i2) {
                    return aVar2;
                }
            }
        }
        return null;
    }

    public final a E(String str) {
        f fVar = this.c;
        if (str != null) {
            ArrayList arrayList = fVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                if (aVar != null && str.equals(aVar.J0)) {
                    return aVar;
                }
            }
        }
        if (str != null) {
            for (e eVar : fVar.b.values()) {
                if (eVar != null) {
                    a aVar2 = eVar.c;
                    if (str.equals(aVar2.J0)) {
                        return aVar2;
                    }
                }
            }
        } else {
            fVar.getClass();
        }
        return null;
    }

    public final void F() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            tge tge = (tge) it.next();
            if (tge.e) {
                tge.e = false;
                tge.e();
            }
        }
    }

    public final a H(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        a b2 = this.c.b(string);
        if (b2 != null) {
            return b2;
        }
        l0(new IllegalStateException(g63.j("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public final ViewGroup I(a aVar) {
        ViewGroup viewGroup = aVar.R0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (aVar.I0 > 0 && this.x.i0()) {
            View h0 = this.x.h0(aVar.I0);
            if (h0 instanceof ViewGroup) {
                return (ViewGroup) h0;
            }
        }
        return null;
    }

    public final rc6 J() {
        rc6 rc6 = this.A;
        if (rc6 != null) {
            return rc6;
        }
        a aVar = this.y;
        return aVar != null ? aVar.D0.J() : this.B;
    }

    public final p9a K() {
        a aVar = this.y;
        return aVar != null ? aVar.D0.K() : this.C;
    }

    public final void L(a aVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
        }
        if (!aVar.K0) {
            aVar.K0 = true;
            aVar.W0 = true ^ aVar.W0;
            j0(aVar);
        }
    }

    public final boolean N() {
        a aVar = this.y;
        if (aVar == null) {
            return true;
        }
        return aVar.a2() && this.y.Q1().N();
    }

    public final boolean Q() {
        return this.I || this.J;
    }

    public final void R(int i2, boolean z2) {
        HashMap hashMap;
        oc6 oc6;
        if (this.w == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.v) {
            this.v = i2;
            f fVar = this.c;
            Iterator it = fVar.a.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = fVar.b;
                if (!hasNext) {
                    break;
                }
                e eVar = (e) hashMap.get(((a) it.next()).w);
                if (eVar != null) {
                    eVar.k();
                }
            }
            for (e eVar2 : hashMap.values()) {
                if (eVar2 != null) {
                    eVar2.k();
                    a aVar = eVar2.c;
                    if (aVar.v0 && !aVar.c2()) {
                        fVar.h(eVar2);
                    }
                }
            }
            k0();
            if (this.H && (oc6 = this.w) != null && this.v == 7) {
                oc6.z0.invalidateMenu();
                this.H = false;
            }
        }
    }

    public final void S() {
        if (this.w != null) {
            this.I = false;
            this.J = false;
            this.P.h = false;
            for (a aVar : this.c.f()) {
                if (aVar != null) {
                    aVar.F0.S();
                }
            }
        }
    }

    public final void T() {
        y(new cd6(this, -1, 0), false);
    }

    public final boolean U() {
        return V(-1, 0);
    }

    public final boolean V(int i2, int i3) {
        A(false);
        z(true);
        a aVar = this.z;
        if (aVar != null && i2 < 0 && aVar.N1().U()) {
            return true;
        }
        boolean W = W(this.M, this.N, i2, i3);
        if (W) {
            this.b = true;
            try {
                Z(this.M, this.N);
            } finally {
                d();
            }
        }
        m0();
        v();
        this.c.b.values().removeAll(Collections.singleton((Object) null));
        return W;
    }

    public final boolean W(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        boolean z2 = (i3 & 1) != 0;
        int i4 = -1;
        if (!this.d.isEmpty()) {
            if (i2 < 0) {
                i4 = z2 ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    xe0 xe0 = (xe0) this.d.get(size);
                    if (i2 >= 0 && i2 == xe0.t) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            xe0 xe02 = (xe0) this.d.get(size - 1);
                            if (i2 < 0 || i2 != xe02.t) {
                                break;
                            }
                            size--;
                        }
                    } else if (size != this.d.size() - 1) {
                        size++;
                    }
                }
                i4 = size;
            }
        }
        if (i4 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i4; size2--) {
            arrayList.add((xe0) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void X(Bundle bundle, String str, a aVar) {
        if (aVar.D0 == this) {
            bundle.putString(str, aVar.w);
        } else {
            l0(new IllegalStateException(g63.g(aVar, "Fragment ", " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void Y(a aVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
            int i2 = aVar.C0;
        }
        boolean z2 = !aVar.c2();
        if (!aVar.L0 || z2) {
            f fVar = this.c;
            synchronized (fVar.a) {
                fVar.a.remove(aVar);
            }
            aVar.Z = false;
            if (M(aVar)) {
                this.H = true;
            }
            aVar.v0 = true;
            j0(aVar);
        }
    }

    public final void Z(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!((xe0) arrayList.get(i2)).p) {
                        if (i3 != i2) {
                            C(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                            while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((xe0) arrayList.get(i3)).p) {
                                i3++;
                            }
                        }
                        C(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    C(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final e a(a aVar) {
        String str = aVar.Z0;
        if (str != null) {
            ld6.d(aVar, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            aVar.toString();
        }
        e g2 = g(aVar);
        aVar.D0 = this;
        f fVar = this.c;
        fVar.g(g2);
        if (!aVar.L0) {
            fVar.a(aVar);
            aVar.v0 = false;
            if (aVar.S0 == null) {
                aVar.W0 = false;
            }
            if (M(aVar)) {
                this.H = true;
            }
        }
        return g2;
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object, md6] */
    public final void a0(Bundle bundle) {
        wsb wsb;
        int i2;
        e eVar;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4 = bundle;
        for (String next : bundle.keySet()) {
            if (next.startsWith("result_") && (bundle3 = bundle4.getBundle(next)) != null) {
                bundle3.setClassLoader(this.w.w0.getClassLoader());
                this.l.put(next.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String next2 : bundle.keySet()) {
            if (next2.startsWith("fragment_") && (bundle2 = bundle4.getBundle(next2)) != null) {
                bundle2.setClassLoader(this.w.w0.getClassLoader());
                hashMap.put(next2.substring(9), bundle2);
            }
        }
        f fVar = this.c;
        HashMap hashMap2 = fVar.c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        fd6 fd6 = (fd6) bundle4.getParcelable("state");
        if (fd6 != null) {
            HashMap hashMap3 = fVar.b;
            hashMap3.clear();
            Iterator it = fd6.a.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                wsb = this.o;
                if (!hasNext) {
                    break;
                }
                Bundle i3 = fVar.i((String) it.next(), (Bundle) null);
                if (i3 != null) {
                    a aVar = (a) this.P.c.get(((id6) i3.getParcelable("state")).b);
                    if (aVar != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            aVar.toString();
                        }
                        eVar = new e(wsb, fVar, aVar, i3);
                    } else {
                        eVar = new e(this.o, this.c, this.w.w0.getClassLoader(), J(), i3);
                    }
                    a aVar2 = eVar.c;
                    aVar2.b = i3;
                    aVar2.D0 = this;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        aVar2.toString();
                    }
                    eVar.m(this.w.w0.getClassLoader());
                    fVar.g(eVar);
                    eVar.e = this.v;
                }
            }
            FragmentManagerViewModel fragmentManagerViewModel = this.P;
            fragmentManagerViewModel.getClass();
            Iterator it2 = new ArrayList(fragmentManagerViewModel.c.values()).iterator();
            while (it2.hasNext()) {
                a aVar3 = (a) it2.next();
                if (hashMap3.get(aVar3.w) == null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        aVar3.toString();
                        Objects.toString(fd6.a);
                    }
                    this.P.l(aVar3);
                    aVar3.D0 = this;
                    e eVar2 = new e(wsb, fVar, aVar3);
                    eVar2.e = 1;
                    eVar2.k();
                    aVar3.v0 = true;
                    eVar2.k();
                }
            }
            ArrayList<String> arrayList = fd6.b;
            fVar.a.clear();
            if (arrayList != null) {
                for (String str : arrayList) {
                    a b2 = fVar.b(str);
                    if (b2 != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            b2.toString();
                        }
                        fVar.a(b2);
                    } else {
                        throw new IllegalStateException(wj6.k("No instantiated fragment for (", str, ")"));
                    }
                }
            }
            if (fd6.c != null) {
                this.d = new ArrayList(fd6.c.length);
                int i4 = 0;
                while (true) {
                    ye0[] ye0Arr = fd6.c;
                    if (i4 >= ye0Arr.length) {
                        break;
                    }
                    ye0 ye0 = ye0Arr[i4];
                    ye0.getClass();
                    xe0 xe0 = new xe0(this);
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        int[] iArr = ye0.a;
                        if (i5 >= iArr.length) {
                            break;
                        }
                        ? obj = new Object();
                        int i7 = i5 + 1;
                        obj.a = iArr[i5];
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Objects.toString(xe0);
                            int i8 = iArr[i7];
                        }
                        obj.h = iu7.values()[ye0.c[i6]];
                        obj.i = iu7.values()[ye0.o[i6]];
                        int i9 = i5 + 2;
                        obj.c = iArr[i7] != 0;
                        int i10 = iArr[i9];
                        obj.d = i10;
                        int i11 = iArr[i5 + 3];
                        obj.e = i11;
                        int i12 = i5 + 5;
                        int i13 = iArr[i5 + 4];
                        obj.f = i13;
                        i5 += 6;
                        int i14 = iArr[i12];
                        obj.g = i14;
                        xe0.b = i10;
                        xe0.c = i11;
                        xe0.d = i13;
                        xe0.e = i14;
                        xe0.b(obj);
                        i6++;
                    }
                    xe0.f = ye0.v;
                    xe0.i = ye0.w;
                    xe0.g = true;
                    xe0.j = ye0.y;
                    xe0.k = ye0.z;
                    xe0.l = ye0.X;
                    xe0.m = ye0.Y;
                    xe0.n = ye0.Z;
                    xe0.o = ye0.v0;
                    xe0.p = ye0.w0;
                    xe0.t = ye0.x;
                    int i15 = 0;
                    while (true) {
                        ArrayList arrayList2 = ye0.b;
                        if (i15 >= arrayList2.size()) {
                            break;
                        }
                        String str2 = (String) arrayList2.get(i15);
                        if (str2 != null) {
                            ((md6) xe0.a.get(i15)).b = fVar.b(str2);
                        }
                        i15++;
                    }
                    xe0.d(1);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        xe0.toString();
                        PrintWriter printWriter = new PrintWriter(new e88());
                        xe0.i("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.d.add(xe0);
                    i4++;
                }
                i2 = 0;
            } else {
                i2 = 0;
                this.d = new ArrayList();
            }
            this.j.set(fd6.o);
            String str3 = fd6.v;
            if (str3 != null) {
                a b3 = fVar.b(str3);
                this.z = b3;
                r(b3);
            }
            ArrayList arrayList3 = fd6.w;
            if (arrayList3 != null) {
                for (int i16 = i2; i16 < arrayList3.size(); i16++) {
                    this.k.put((String) arrayList3.get(i16), (ze0) fd6.x.get(i16));
                }
            }
            this.G = new ArrayDeque(fd6.y);
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [androidx.fragment.app.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.oc6 r6, defpackage.ld8 r7, androidx.fragment.app.a r8) {
        /*
            r5 = this;
            oc6 r0 = r5.w
            if (r0 != 0) goto L_0x017b
            r5.w = r6
            r5.x = r7
            r5.y = r8
            java.util.concurrent.CopyOnWriteArrayList r7 = r5.p
            if (r8 == 0) goto L_0x0017
            yc6 r0 = new yc6
            r0.<init>(r8)
            r7.add(r0)
            goto L_0x001e
        L_0x0017:
            boolean r0 = r6 instanceof defpackage.gd6
            if (r0 == 0) goto L_0x001e
            r7.add(r6)
        L_0x001e:
            androidx.fragment.app.a r7 = r5.y
            if (r7 == 0) goto L_0x0025
            r5.m0()
        L_0x0025:
            boolean r7 = r6 instanceof defpackage.gma
            if (r7 == 0) goto L_0x003b
            androidx.fragment.app.b r7 = r6.z0
            fma r7 = r7.getOnBackPressedDispatcher()
            r5.g = r7
            if (r8 == 0) goto L_0x0035
            r0 = r8
            goto L_0x0036
        L_0x0035:
            r0 = r6
        L_0x0036:
            wx3 r1 = r5.i
            r7.a(r0, r1)
        L_0x003b:
            if (r8 == 0) goto L_0x005c
            androidx.fragment.app.c r6 = r8.D0
            androidx.fragment.app.FragmentManagerViewModel r6 = r6.P
            java.util.HashMap r7 = r6.d
            java.lang.String r0 = r8.w
            java.lang.Object r0 = r7.get(r0)
            androidx.fragment.app.FragmentManagerViewModel r0 = (androidx.fragment.app.FragmentManagerViewModel) r0
            if (r0 != 0) goto L_0x0059
            androidx.fragment.app.FragmentManagerViewModel r0 = new androidx.fragment.app.FragmentManagerViewModel
            boolean r6 = r6.f
            r0.<init>(r6)
            java.lang.String r6 = r8.w
            r7.put(r6, r0)
        L_0x0059:
            r5.P = r0
            goto L_0x009e
        L_0x005c:
            boolean r7 = r6 instanceof defpackage.hbg
            if (r7 == 0) goto L_0x0096
            androidx.fragment.app.b r6 = r6.z0
            gbg r6 = r6.getViewModelStore()
            w34 r7 = defpackage.w34.b
            o5h r0 = new o5h
            androidx.fragment.app.d r1 = androidx.fragment.app.FragmentManagerViewModel.i
            r0.<init>(r6, r1, r7)
            java.lang.Class<androidx.fragment.app.FragmentManagerViewModel> r6 = androidx.fragment.app.FragmentManagerViewModel.class
            kotlin.reflect.KClass r6 = kotlin.jvm.JvmClassMappingKt.getKotlinClass(r6)
            java.lang.String r7 = r6.getQualifiedName()
            if (r7 == 0) goto L_0x008a
            java.lang.String r1 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r7 = r1.concat(r7)
            yag r6 = r0.x(r6, r7)
            androidx.fragment.app.FragmentManagerViewModel r6 = (androidx.fragment.app.FragmentManagerViewModel) r6
            r5.P = r6
            goto L_0x009e
        L_0x008a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Local and anonymous classes can not be ViewModels"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x0096:
            androidx.fragment.app.FragmentManagerViewModel r6 = new androidx.fragment.app.FragmentManagerViewModel
            r7 = 0
            r6.<init>(r7)
            r5.P = r6
        L_0x009e:
            androidx.fragment.app.FragmentManagerViewModel r6 = r5.P
            boolean r7 = r5.Q()
            r6.h = r7
            androidx.fragment.app.FragmentManagerViewModel r6 = r5.P
            androidx.fragment.app.f r7 = r5.c
            r7.d = r6
            oc6 r6 = r5.w
            boolean r7 = r6 instanceof defpackage.odd
            if (r7 == 0) goto L_0x00d1
            if (r8 != 0) goto L_0x00d1
            androidx.fragment.app.b r6 = r6.z0
            mdd r6 = r6.getSavedStateRegistry()
            pb3 r7 = new pb3
            r0 = r5
            ed6 r0 = (defpackage.ed6) r0
            r1 = 2
            r7.<init>(r1, r0)
            java.lang.String r0 = "android:support:fragments"
            r6.c(r0, r7)
            android.os.Bundle r6 = r6.a(r0)
            if (r6 == 0) goto L_0x00d1
            r5.a0(r6)
        L_0x00d1:
            oc6 r6 = r5.w
            boolean r7 = r6 instanceof defpackage.f9
            if (r7 == 0) goto L_0x0141
            androidx.fragment.app.b r6 = r6.z0
            e9 r6 = r6.getActivityResultRegistry()
            if (r8 == 0) goto L_0x00ed
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = r8.w
            java.lang.String r1 = ":"
            java.lang.String r7 = defpackage.wj6.n(r7, r0, r1)
            goto L_0x00ef
        L_0x00ed:
            java.lang.String r7 = ""
        L_0x00ef:
            java.lang.String r0 = "FragmentManager:"
            java.lang.String r7 = defpackage.a81.m(r0, r7)
            java.lang.String r0 = "StartActivityForResult"
            java.lang.String r0 = defpackage.tr1.j(r7, r0)
            x8 r1 = new x8
            r2 = 1
            r1.<init>(r2)
            xv1 r2 = new xv1
            r3 = r5
            ed6 r3 = (defpackage.ed6) r3
            r4 = 21
            r2.<init>((int) r4, (java.lang.Object) r3)
            d9 r0 = r6.c(r0, r1, r2)
            r5.D = r0
            java.lang.String r0 = "StartIntentSenderForResult"
            java.lang.String r0 = defpackage.tr1.j(r7, r0)
            x8 r1 = new x8
            r2 = 3
            r1.<init>(r2)
            y35 r2 = new y35
            r4 = 21
            r2.<init>((int) r4, (java.lang.Object) r3)
            d9 r0 = r6.c(r0, r1, r2)
            r5.E = r0
            java.lang.String r0 = "RequestPermissions"
            java.lang.String r7 = defpackage.tr1.j(r7, r0)
            x8 r0 = new x8
            r1 = 0
            r0.<init>(r1)
            b8d r1 = new b8d
            r1.<init>((java.lang.Object) r3)
            d9 r6 = r6.c(r7, r0, r1)
            r5.F = r6
        L_0x0141:
            oc6 r6 = r5.w
            boolean r7 = r6 instanceof defpackage.jma
            if (r7 == 0) goto L_0x014c
            uc6 r7 = r5.q
            r6.E0(r7)
        L_0x014c:
            oc6 r6 = r5.w
            boolean r7 = r6 instanceof defpackage.yma
            if (r7 == 0) goto L_0x0157
            uc6 r7 = r5.r
            r6.H0(r7)
        L_0x0157:
            oc6 r6 = r5.w
            boolean r7 = r6 instanceof defpackage.oma
            if (r7 == 0) goto L_0x0162
            uc6 r7 = r5.s
            r6.F0(r7)
        L_0x0162:
            oc6 r6 = r5.w
            boolean r7 = r6 instanceof defpackage.pma
            if (r7 == 0) goto L_0x016d
            uc6 r7 = r5.t
            r6.G0(r7)
        L_0x016d:
            oc6 r6 = r5.w
            boolean r7 = r6 instanceof defpackage.o69
            if (r7 == 0) goto L_0x017a
            if (r8 != 0) goto L_0x017a
            vc6 r5 = r5.u
            r6.D0(r5)
        L_0x017a:
            return
        L_0x017b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already attached"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.b(oc6, ld8, androidx.fragment.app.a):void");
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [android.os.Parcelable, fd6, java.lang.Object] */
    public final Bundle b0() {
        ArrayList arrayList;
        ye0[] ye0Arr;
        Bundle bundle = new Bundle();
        F();
        x();
        A(true);
        this.I = true;
        this.P.h = true;
        f fVar = this.c;
        fVar.getClass();
        HashMap hashMap = fVar.b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (e eVar : hashMap.values()) {
            if (eVar != null) {
                a aVar = eVar.c;
                fVar.i(aVar.w, eVar.o());
                arrayList2.add(aVar.w);
                if (Log.isLoggable("FragmentManager", 2)) {
                    aVar.toString();
                    Objects.toString(aVar.b);
                }
            }
        }
        HashMap hashMap2 = this.c.c;
        if (!hashMap2.isEmpty()) {
            f fVar2 = this.c;
            synchronized (fVar2.a) {
                try {
                    if (fVar2.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(fVar2.a.size());
                        Iterator it = fVar2.a.iterator();
                        while (it.hasNext()) {
                            a aVar2 = (a) it.next();
                            arrayList.add(aVar2.w);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                aVar2.toString();
                            }
                        }
                    }
                } finally {
                    while (true) {
                    }
                }
            }
            int size = this.d.size();
            if (size > 0) {
                ye0Arr = new ye0[size];
                for (int i2 = 0; i2 < size; i2++) {
                    ye0Arr[i2] = new ye0((xe0) this.d.get(i2));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(this.d.get(i2));
                    }
                }
            } else {
                ye0Arr = null;
            }
            ? obj = new Object();
            obj.v = null;
            ArrayList arrayList3 = new ArrayList();
            obj.w = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            obj.x = arrayList4;
            obj.a = arrayList2;
            obj.b = arrayList;
            obj.c = ye0Arr;
            obj.o = this.j.get();
            a aVar3 = this.z;
            if (aVar3 != null) {
                obj.v = aVar3.w;
            }
            arrayList3.addAll(this.k.keySet());
            arrayList4.addAll(this.k.values());
            obj.y = new ArrayList(this.G);
            bundle.putParcelable("state", obj);
            for (String str : this.l.keySet()) {
                bundle.putBundle(a81.m("result_", str), (Bundle) this.l.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(a81.m("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        }
        return bundle;
    }

    public final void c(a aVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
        }
        if (aVar.L0) {
            aVar.L0 = false;
            if (!aVar.Z) {
                this.c.a(aVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    aVar.toString();
                }
                if (M(aVar)) {
                    this.H = true;
                }
            }
        }
    }

    public final mc6 c0(a aVar) {
        e eVar = (e) this.c.b.get(aVar.w);
        if (eVar != null) {
            a aVar2 = eVar.c;
            if (aVar2.equals(aVar)) {
                if (aVar2.a > -1) {
                    return new mc6(eVar.o());
                }
                return null;
            }
        }
        l0(new IllegalStateException(g63.g(aVar, "Fragment ", " is not currently in the FragmentManager")));
        throw null;
    }

    public final void d() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    public final void d0() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.w.x0.removeCallbacks(this.Q);
                    this.w.x0.post(this.Q);
                    m0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet e() {
        tge tge;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((e) it.next()).c.R0;
            if (viewGroup != null) {
                p9a K2 = K();
                Object tag = viewGroup.getTag(whc.special_effects_controller_view_tag);
                if (tag instanceof tge) {
                    tge = (tge) tag;
                } else {
                    K2.getClass();
                    tge = new tge(viewGroup);
                    viewGroup.setTag(whc.special_effects_controller_view_tag, tge);
                }
                hashSet.add(tge);
            }
        }
        return hashSet;
    }

    public final void e0(a aVar, boolean z2) {
        ViewGroup I2 = I(aVar);
        if (I2 != null && (I2 instanceof FragmentContainerView)) {
            ((FragmentContainerView) I2).setDrawDisappearingViewsLast(!z2);
        }
    }

    public final HashSet f(ArrayList arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        tge tge;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator it = ((xe0) arrayList.get(i2)).a.iterator();
            while (it.hasNext()) {
                a aVar = ((md6) it.next()).b;
                if (!(aVar == null || (viewGroup = aVar.R0) == null)) {
                    p9a K2 = K();
                    Object tag = viewGroup.getTag(whc.special_effects_controller_view_tag);
                    if (tag instanceof tge) {
                        tge = (tge) tag;
                    } else {
                        K2.getClass();
                        tge = new tge(viewGroup);
                        viewGroup.setTag(whc.special_effects_controller_view_tag, tge);
                    }
                    hashSet.add(tge);
                }
            }
            i2++;
        }
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f0(java.lang.String r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.util.Map r0 = r3.m
            java.lang.Object r0 = r0.get(r4)
            ad6 r0 = (defpackage.ad6) r0
            if (r0 == 0) goto L_0x001c
            iu7 r1 = defpackage.iu7.o
            ju7 r2 = r0.a
            lv7 r2 = (defpackage.lv7) r2
            iu7 r2 = r2.d
            boolean r1 = r2.a(r1)
            if (r1 == 0) goto L_0x001c
            r0.b(r4, r5)
            goto L_0x0021
        L_0x001c:
            java.util.Map r3 = r3.l
            r3.put(r4, r5)
        L_0x0021:
            java.lang.String r3 = "FragmentManager"
            r4 = 2
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x002d
            java.util.Objects.toString(r5)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.f0(java.lang.String, android.os.Bundle):void");
    }

    public final e g(a aVar) {
        String str = aVar.w;
        f fVar = this.c;
        e eVar = (e) fVar.b.get(str);
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this.o, fVar, aVar);
        eVar2.m(this.w.w0.getClassLoader());
        eVar2.e = this.v;
        return eVar2;
    }

    public final void g0(String str, jv7 jv7, hd6 hd6) {
        ju7 lifecycle = jv7.getLifecycle();
        if (((lv7) lifecycle).d != iu7.a) {
            xc6 xc6 = new xc6(this, str, hd6, lifecycle);
            ad6 ad6 = (ad6) this.m.put(str, new ad6(lifecycle, hd6, xc6));
            if (ad6 != null) {
                ad6.a.b(ad6.c);
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                lifecycle.toString();
                Objects.toString(hd6);
            }
            lifecycle.a(xc6);
        }
    }

    public final void h(a aVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
        }
        if (!aVar.L0) {
            aVar.L0 = true;
            if (aVar.Z) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    aVar.toString();
                }
                f fVar = this.c;
                synchronized (fVar.a) {
                    fVar.a.remove(aVar);
                }
                aVar.Z = false;
                if (M(aVar)) {
                    this.H = true;
                }
                j0(aVar);
            }
        }
    }

    public final void h0(a aVar, iu7 iu7) {
        if (!aVar.equals(this.c.b(aVar.w)) || !(aVar.E0 == null || aVar.D0 == this)) {
            throw new IllegalArgumentException("Fragment " + aVar + " is not an active fragment of FragmentManager " + this);
        }
        aVar.a1 = iu7;
    }

    public final void i(boolean z2, Configuration configuration) {
        if (!z2 || !(this.w instanceof jma)) {
            for (a aVar : this.c.f()) {
                if (aVar != null) {
                    aVar.onConfigurationChanged(configuration);
                    if (z2) {
                        aVar.F0.i(true, configuration);
                    }
                }
            }
            return;
        }
        l0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        throw null;
    }

    public final void i0(a aVar) {
        if (aVar != null) {
            if (!aVar.equals(this.c.b(aVar.w)) || !(aVar.E0 == null || aVar.D0 == this)) {
                throw new IllegalArgumentException("Fragment " + aVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        a aVar2 = this.z;
        this.z = aVar;
        r(aVar2);
        r(this.z);
    }

    public final boolean j() {
        if (this.v < 1) {
            return false;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                if (!aVar.K0 ? aVar.F0.j() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void j0(a aVar) {
        ViewGroup I2 = I(aVar);
        if (I2 != null) {
            kc6 kc6 = aVar.V0;
            boolean z2 = false;
            if ((kc6 == null ? 0 : kc6.e) + (kc6 == null ? 0 : kc6.d) + (kc6 == null ? 0 : kc6.c) + (kc6 == null ? 0 : kc6.b) > 0) {
                if (I2.getTag(whc.visible_removing_fragment_view_tag) == null) {
                    I2.setTag(whc.visible_removing_fragment_view_tag, aVar);
                }
                a aVar2 = (a) I2.getTag(whc.visible_removing_fragment_view_tag);
                kc6 kc62 = aVar.V0;
                if (kc62 != null) {
                    z2 = kc62.a;
                }
                if (aVar2.V0 != null) {
                    aVar2.L1().a = z2;
                }
            }
        }
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        boolean z2;
        boolean z3;
        if (this.v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z4 = false;
        for (a aVar : this.c.f()) {
            if (aVar != null && O(aVar)) {
                if (!aVar.K0) {
                    if (!aVar.O0 || !aVar.P0) {
                        z3 = false;
                    } else {
                        aVar.j2(menu, menuInflater);
                        z3 = true;
                    }
                    z2 = z3 | aVar.F0.k(menu, menuInflater);
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aVar);
                    z4 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                a aVar2 = (a) this.e.get(i2);
                if (arrayList == null || !arrayList.contains(aVar2)) {
                    aVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z4;
    }

    public final void k0() {
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            a aVar = eVar.c;
            if (aVar.T0) {
                if (this.b) {
                    this.L = true;
                } else {
                    aVar.T0 = false;
                    eVar.k();
                }
            }
        }
    }

    public final void l() {
        boolean z2 = true;
        this.K = true;
        A(true);
        x();
        oc6 oc6 = this.w;
        boolean z3 = oc6 instanceof hbg;
        f fVar = this.c;
        if (z3) {
            z2 = fVar.d.g;
        } else {
            Context context = oc6.w0;
            if (context instanceof Activity) {
                z2 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z2) {
            for (ze0 ze0 : this.k.values()) {
                for (String k2 : ze0.a) {
                    fVar.d.k(k2, false);
                }
            }
        }
        u(-1);
        oc6 oc62 = this.w;
        if (oc62 instanceof yma) {
            oc62.M0(this.r);
        }
        oc6 oc63 = this.w;
        if (oc63 instanceof jma) {
            oc63.J0(this.q);
        }
        oc6 oc64 = this.w;
        if (oc64 instanceof oma) {
            oc64.K0(this.s);
        }
        oc6 oc65 = this.w;
        if (oc65 instanceof pma) {
            oc65.L0(this.t);
        }
        oc6 oc66 = this.w;
        if ((oc66 instanceof o69) && this.y == null) {
            oc66.I0(this.u);
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            this.i.e();
            this.g = null;
        }
        d9 d9Var = this.D;
        if (d9Var != null) {
            d9Var.b();
            this.E.b();
            this.F.b();
        }
    }

    public final void l0(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new e88());
        oc6 oc6 = this.w;
        if (oc6 != null) {
            try {
                oc6.z0.dump("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            w("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw illegalStateException;
    }

    public final void m(boolean z2) {
        if (!z2 || !(this.w instanceof yma)) {
            for (a aVar : this.c.f()) {
                if (aVar != null) {
                    aVar.onLowMemory();
                    if (z2) {
                        aVar.F0.m(true);
                    }
                }
            }
            return;
        }
        l0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        r0 = r5.d.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r5.h == null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if ((r0 + r1) <= 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (P(r5.y) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (android.util.Log.isLoggable("FragmentManager", 3) == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        r5.i.f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m0() {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.a
            monitor-enter(r0)
            java.util.ArrayList r1 = r5.a     // Catch:{ all -> 0x001e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x001e }
            r2 = 1
            r3 = 3
            if (r1 != 0) goto L_0x0022
            wx3 r1 = r5.i     // Catch:{ all -> 0x001e }
            r1.f(r2)     // Catch:{ all -> 0x001e }
            java.lang.String r1 = "FragmentManager"
            boolean r1 = android.util.Log.isLoggable(r1, r3)     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x0020
            r5.toString()     // Catch:{ all -> 0x001e }
            goto L_0x0020
        L_0x001e:
            r5 = move-exception
            goto L_0x004f
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            java.util.ArrayList r0 = r5.d
            int r0 = r0.size()
            xe0 r1 = r5.h
            r4 = 0
            if (r1 == 0) goto L_0x0030
            r1 = r2
            goto L_0x0031
        L_0x0030:
            r1 = r4
        L_0x0031:
            int r0 = r0 + r1
            if (r0 <= 0) goto L_0x003d
            androidx.fragment.app.a r0 = r5.y
            boolean r0 = P(r0)
            if (r0 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r2 = r4
        L_0x003e:
            java.lang.String r0 = "FragmentManager"
            boolean r0 = android.util.Log.isLoggable(r0, r3)
            if (r0 == 0) goto L_0x0049
            r5.toString()
        L_0x0049:
            wx3 r5 = r5.i
            r5.f(r2)
            return
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.m0():void");
    }

    public final void n(boolean z2, boolean z3) {
        if (!z3 || !(this.w instanceof oma)) {
            for (a aVar : this.c.f()) {
                if (aVar != null && z3) {
                    aVar.F0.n(z2, true);
                }
            }
            return;
        }
        l0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        throw null;
    }

    public final void o() {
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.p2(aVar.b2());
                aVar.F0.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.v < 1) {
            return false;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                if (!aVar.K0 ? (!aVar.O0 || !aVar.P0 || !aVar.s2(menuItem)) ? aVar.F0.p(menuItem) : true : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.v >= 1) {
            for (a aVar : this.c.f()) {
                if (aVar != null && !aVar.K0) {
                    aVar.F0.q();
                }
            }
        }
    }

    public final void r(a aVar) {
        if (aVar != null) {
            if (aVar.equals(this.c.b(aVar.w))) {
                aVar.D0.getClass();
                boolean P2 = P(aVar);
                Boolean bool = aVar.Y;
                if (bool == null || bool.booleanValue() != P2) {
                    aVar.Y = Boolean.valueOf(P2);
                    ed6 ed6 = aVar.F0;
                    ed6.m0();
                    ed6.r(ed6.z);
                }
            }
        }
    }

    public final void s(boolean z2, boolean z3) {
        if (!z3 || !(this.w instanceof pma)) {
            for (a aVar : this.c.f()) {
                if (aVar != null && z3) {
                    aVar.F0.s(z2, true);
                }
            }
            return;
        }
        l0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        throw null;
    }

    public final boolean t(Menu menu) {
        boolean z2;
        boolean z3;
        if (this.v < 1) {
            return false;
        }
        boolean z4 = false;
        for (a aVar : this.c.f()) {
            if (aVar != null && O(aVar)) {
                if (!aVar.K0) {
                    if (!aVar.O0 || !aVar.P0) {
                        z3 = false;
                    } else {
                        aVar.u2(menu);
                        z3 = true;
                    }
                    z2 = aVar.F0.t(menu) | z3;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z4 = true;
                }
            }
        }
        return z4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a aVar = this.y;
        if (aVar != null) {
            sb.append(aVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            oc6 oc6 = this.w;
            if (oc6 != null) {
                sb.append(oc6.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: finally extract failed */
    public final void u(int i2) {
        try {
            this.b = true;
            for (e eVar : this.c.b.values()) {
                if (eVar != null) {
                    eVar.e = i2;
                }
            }
            R(i2, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((tge) it.next()).h();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.L) {
            this.L = false;
            k0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String j2 = tr1.j(str, "    ");
        f fVar = this.c;
        fVar.getClass();
        String str2 = str + "    ";
        HashMap hashMap = fVar.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (e eVar : hashMap.values()) {
                printWriter.print(str);
                if (eVar != null) {
                    a aVar = eVar.c;
                    printWriter.println(aVar);
                    aVar.K1(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = fVar.a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((a) arrayList.get(i2)).toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(((a) this.e.get(i3)).toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                xe0 xe0 = (xe0) this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(xe0.toString());
                xe0.i(j2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.j.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println((bd6) this.a.get(i5));
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((tge) it.next()).h();
        }
    }

    public final void y(bd6 bd6, boolean z2) {
        if (!z2) {
            if (this.w == null) {
                if (this.K) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Q()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            try {
                if (this.w != null) {
                    this.a.add(bd6);
                    d0();
                } else if (!z2) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z2) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.w == null) {
            if (this.K) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.w.x0.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (!z2 && Q()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }
}
