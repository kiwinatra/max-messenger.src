package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.my.tracker.obfuscated.h;
import com.my.tracker.obfuscated.p1;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vd0  reason: default package */
public final /* synthetic */ class vd0 implements qk3, mja, u2f, i08, vma {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    public /* synthetic */ vd0(yd0 yd0, String str, int i, Context context) {
        this.a = 1;
        this.b = yd0;
        this.v = str;
        this.c = i;
        this.o = context;
    }

    public void a(Object obj) {
        int i = this.c;
        p1 p1Var = (p1) this.b;
        ((h) this.v).a(i, p1Var, (String) this.o, (kq) obj);
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                Drawable c2 = ((yd0) this.b).c((Context) this.o);
                int i = this.c;
                c2.setBounds(0, 0, i, i);
                c2.draw((Canvas) this.v);
                return;
            default:
                w62 w62 = (w62) obj;
                y62 a2 = ((z62) this.v).a();
                a2.a = this.c;
                z62 a3 = a2.a();
                ((my2) this.b).getClass();
                HashSet hashSet = b10.z0;
                Set set = (Set) this.o;
                if (Intrinsics.areEqual((Object) hashSet, (Object) set)) {
                    w62.q = a3;
                    return;
                } else if (Intrinsics.areEqual((Object) b10.A0, (Object) set)) {
                    w62.r = a3;
                    return;
                } else if (Intrinsics.areEqual((Object) b10.B0, (Object) set)) {
                    w62.s = a3;
                    return;
                } else if (Intrinsics.areEqual((Object) b10.C0, (Object) set)) {
                    w62.t = a3;
                    return;
                } else if (Intrinsics.areEqual((Object) b10.D0, (Object) set)) {
                    w62.u = a3;
                    return;
                } else if (Intrinsics.areEqual((Object) b10.E0, (Object) set)) {
                    w62.v = a3;
                    return;
                } else if (Intrinsics.areEqual((Object) b10.F0, (Object) set)) {
                    w62.w = a3;
                    return;
                } else {
                    return;
                }
        }
    }

    public void c(yha yha) {
        yd0 yd0 = (yd0) this.b;
        ra7 d = ra7.d(yd0.b((String) this.v, false));
        int i = this.c;
        d.d = i <= 0 ? null : new v3d(c44.DEFAULT_ASPECT_RATIO, i, i, 12);
        d.g = oa7.a;
        d.l = new o6b(false);
        i0 a2 = ld9.B().a(d.a(), (Object) null);
        a2.m(new xd0(yha, yd0, (Context) this.o, a2), io1.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get() {
        /*
            r36 = this;
            r0 = r36
            java.lang.Object r2 = r0.v
            r62 r2 = (defpackage.r62) r2
            jtb r3 = r2.n
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Object r6 = r0.b
            java.util.List r6 = (java.util.List) r6
            int r7 = r6.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r8 = "storeChatsFromServer: chats.size() = %d"
            java.lang.String r9 = "r62"
            defpackage.z68.c(r9, r8, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = r6.size()
            r7.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r10 = r6.size()
            r8.<init>(r10)
            ws r15 = new ws
            r10 = 0
            r15.<init>((int) r10)
            ws r14 = new ws
            r14.<init>((int) r10)
            ws r13 = new ws
            r13.<init>((int) r10)
            ts r12 = new ts
            r12.<init>(r10)
            hs7 r11 = r2.l
            java.lang.Object r16 = r11.get()
            s74 r16 = (defpackage.s74) r16
            a74 r16 = (defpackage.a74) r16
            r16.a()
            r1 = r3
            ltb r1 = (defpackage.ltb) r1     // Catch:{ all -> 0x00ac }
            cud r1 = r1.b     // Catch:{ all -> 0x00ac }
            r1.getClass()     // Catch:{ all -> 0x00ac }
            ru.ok.tamtam.android.prefs.PmsKey r10 = ru.ok.tamtam.android.prefs.PmsKey.f24chatspreloadperiod     // Catch:{ all -> 0x00ac }
            r18 = r4
            r4 = 15
            long r4 = (long) r4     // Catch:{ all -> 0x00ac }
            long r4 = r1.r(r10, r4)     // Catch:{ all -> 0x00ac }
            int r1 = (int) r4     // Catch:{ all -> 0x00ac }
            long r4 = (long) r1     // Catch:{ all -> 0x00ac }
            r20 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 * r20
            r1 = r3
            ltb r1 = (defpackage.ltb) r1     // Catch:{ all -> 0x00ac }
            a33 r1 = r1.a     // Catch:{ all -> 0x00ac }
            long r20 = r1.m()     // Catch:{ all -> 0x00ac }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x00ac }
            r22 = 0
            r24 = r4
            r4 = r22
        L_0x0084:
            boolean r10 = r1.hasNext()     // Catch:{ all -> 0x00ac }
            r17 = r6
            if (r10 == 0) goto L_0x020b
            java.lang.Object r10 = r1.next()     // Catch:{ all -> 0x00ac }
            b32 r10 = (defpackage.b32) r10     // Catch:{ all -> 0x00ac }
            if (r10 != 0) goto L_0x00ae
            java.lang.String r10 = "storeChatsFromServer: chatFromServer is null!"
            r16 = r1
            r6 = 0
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x00ac }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r6)     // Catch:{ all -> 0x00ac }
            r6 = 0
            defpackage.z68.n(r9, r6, r10, r1)     // Catch:{ all -> 0x00ac }
            r1 = r16
            r6 = r17
            goto L_0x0084
        L_0x00a8:
            r32 = r11
            goto L_0x030f
        L_0x00ac:
            r0 = move-exception
            goto L_0x00a8
        L_0x00ae:
            r16 = r1
            java.util.Map r1 = r10.o     // Catch:{ all -> 0x00ac }
            r27 = r14
            r6 = r15
            long r14 = r10.a     // Catch:{ all -> 0x00ac }
            r28 = r12
            java.lang.String r12 = "storeChatsFromServer: Chat(%d, %s, %d)"
            r29 = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x00ac }
            r30 = r8
            java.lang.String r8 = r10.w     // Catch:{ all -> 0x00ac }
            r31 = r7
            int r7 = r10.Z     // Catch:{ all -> 0x00ac }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00ac }
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r8, r7}     // Catch:{ all -> 0x00ac }
            defpackage.z68.c(r9, r12, r6)     // Catch:{ all -> 0x00ac }
            java.lang.Object r6 = r0.o
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L_0x00e5
            java.lang.Long r7 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x00ac }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x00ac }
            rp2 r6 = (defpackage.rp2) r6     // Catch:{ all -> 0x00ac }
            goto L_0x00e6
        L_0x00e5:
            r6 = 0
        L_0x00e6:
            java.lang.Object r7 = r11.get()     // Catch:{ all -> 0x00ac }
            s74 r7 = (defpackage.s74) r7     // Catch:{ all -> 0x00ac }
            a74 r7 = (defpackage.a74) r7     // Catch:{ all -> 0x00ac }
            f6d r7 = r7.b     // Catch:{ all -> 0x00ac }
            n72 r7 = r7.e(r14)     // Catch:{ all -> 0x00ac }
            if (r7 != 0) goto L_0x0110
            int r8 = r10.V0     // Catch:{ all -> 0x00ac }
            r12 = 2
            if (r8 != r12) goto L_0x00fd
            r8 = 1
            goto L_0x00fe
        L_0x00fd:
            r8 = 0
        L_0x00fe:
            if (r8 == 0) goto L_0x0110
            java.lang.Object r7 = r11.get()     // Catch:{ all -> 0x00ac }
            s74 r7 = (defpackage.s74) r7     // Catch:{ all -> 0x00ac }
            a74 r7 = (defpackage.a74) r7     // Catch:{ all -> 0x00ac }
            f6d r7 = r7.b     // Catch:{ all -> 0x00ac }
            long r14 = r10.X     // Catch:{ all -> 0x00ac }
            n72 r7 = r7.f(r14)     // Catch:{ all -> 0x00ac }
        L_0x0110:
            if (r7 == 0) goto L_0x0119
            m72 r7 = r7.c     // Catch:{ all -> 0x00ac }
            long r14 = r7.p0     // Catch:{ all -> 0x00ac }
            long r7 = r7.q0     // Catch:{ all -> 0x00ac }
            goto L_0x011c
        L_0x0119:
            r7 = r22
            r14 = r7
        L_0x011c:
            a32 r6 = r2.m0(r10, r6)     // Catch:{ all -> 0x00ac }
            a32 r12 = r2.a     // Catch:{ all -> 0x00ac }
            if (r12 != 0) goto L_0x0141
            if (r6 == 0) goto L_0x0141
            r12 = r3
            ltb r12 = (defpackage.ltb) r12     // Catch:{ all -> 0x00ac }
            a33 r12 = r12.a     // Catch:{ all -> 0x00ac }
            r32 = r11
            long r11 = r12.s()     // Catch:{ all -> 0x013e }
            r33 = r3
            m72 r3 = r6.b     // Catch:{ all -> 0x013e }
            boolean r3 = r3.h(r11)     // Catch:{ all -> 0x013e }
            if (r3 == 0) goto L_0x0145
            r2.a = r6     // Catch:{ all -> 0x013e }
            goto L_0x0145
        L_0x013e:
            r0 = move-exception
            goto L_0x030f
        L_0x0141:
            r33 = r3
            r32 = r11
        L_0x0145:
            if (r6 == 0) goto L_0x01ee
            m72 r3 = r6.b
            long r11 = r10.T0     // Catch:{ all -> 0x013e }
            r34 = r2
            r26 = r3
            long r2 = r10.U0     // Catch:{ all -> 0x013e }
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            long r14 = r6.a
            if (r11 != 0) goto L_0x015b
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0162
        L_0x015b:
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x013e }
            r13.add(r2)     // Catch:{ all -> 0x013e }
        L_0x0162:
            long r2 = r10.Y     // Catch:{ all -> 0x013e }
            boolean r7 = r1.isEmpty()     // Catch:{ all -> 0x013e }
            if (r7 != 0) goto L_0x017c
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x013e }
            java.lang.Object r1 = java.util.Collections.max(r1)     // Catch:{ all -> 0x013e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x013e }
            long r7 = r1.longValue()     // Catch:{ all -> 0x013e }
            long r2 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x013e }
        L_0x017c:
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0181
            r4 = r2
        L_0x0181:
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x013e }
            r2 = r31
            r2.add(r1)     // Catch:{ all -> 0x013e }
            r1 = r30
            r1.add(r6)     // Catch:{ all -> 0x013e }
            r3 = r26
            long r7 = r3.a     // Catch:{ all -> 0x013e }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x013e }
            r8 = r29
            r8.add(r7)     // Catch:{ all -> 0x013e }
            r7 = r34
            hs7 r10 = r7.w     // Catch:{ all -> 0x013e }
            java.lang.Object r10 = r10.get()     // Catch:{ all -> 0x013e }
            jqg r10 = (defpackage.jqg) r10     // Catch:{ all -> 0x013e }
            svd r11 = new svd     // Catch:{ all -> 0x013e }
            r11.<init>(r14)     // Catch:{ all -> 0x013e }
            r10.a(r11)     // Catch:{ all -> 0x013e }
            boolean r10 = r6.i0()     // Catch:{ all -> 0x013e }
            if (r10 == 0) goto L_0x01eb
            boolean r6 = r6.f0()     // Catch:{ all -> 0x013e }
            if (r6 == 0) goto L_0x01eb
            r6 = r27
            int r10 = r6.c     // Catch:{ all -> 0x013e }
            int r11 = r0.c
            if (r10 < r11) goto L_0x01ce
            long r10 = r3.k     // Catch:{ all -> 0x013e }
            long r10 = r20 - r10
            int r10 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
            if (r10 >= 0) goto L_0x01cb
            goto L_0x01ce
        L_0x01cb:
            r12 = r28
            goto L_0x01f9
        L_0x01ce:
            java.lang.Long r10 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x013e }
            r6.add(r10)     // Catch:{ all -> 0x013e }
            long r10 = r3.L     // Catch:{ all -> 0x013e }
            int r12 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r12 == 0) goto L_0x01cb
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x013e }
            long r11 = r3.a     // Catch:{ all -> 0x013e }
            java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x013e }
            r12 = r28
            r12.put(r10, r3)     // Catch:{ all -> 0x013e }
            goto L_0x01f9
        L_0x01eb:
            r6 = r27
            goto L_0x01cb
        L_0x01ee:
            r7 = r2
            r6 = r27
            r12 = r28
            r8 = r29
            r1 = r30
            r2 = r31
        L_0x01f9:
            r14 = r6
            r15 = r8
            r6 = r17
            r11 = r32
            r3 = r33
            r8 = r1
            r1 = r16
            r35 = r7
            r7 = r2
            r2 = r35
            goto L_0x0084
        L_0x020b:
            r33 = r3
            r1 = r8
            r32 = r11
            r6 = r14
            r8 = r15
            r35 = r7
            r7 = r2
            r2 = r35
            java.lang.String r0 = "storeChatsFromServer end, time = %dms"
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x013e }
            long r10 = r10 - r18
            java.lang.Long r3 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x013e }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x013e }
            defpackage.z68.c(r9, r0, r3)     // Catch:{ all -> 0x013e }
            java.lang.Object r0 = r32.get()     // Catch:{ all -> 0x013e }
            s74 r0 = (defpackage.s74) r0     // Catch:{ all -> 0x013e }
            a74 r0 = (defpackage.a74) r0     // Catch:{ all -> 0x013e }
            r0.c()     // Catch:{ all -> 0x013e }
            java.lang.Object r0 = r32.get()
            s74 r0 = (defpackage.s74) r0
            a74 r0 = (defpackage.a74) r0
            r0.b()
            int r0 = r17.size()
            if (r0 != 0) goto L_0x025c
            r3 = r33
            ltb r3 = (defpackage.ltb) r3
            a33 r0 = r3.a
            long r10 = r0.o()
            int r0 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r0 != 0) goto L_0x025c
            r4 = 1
            a33 r0 = r3.a
            r0.v(r4)
            goto L_0x026f
        L_0x025c:
            r3 = r33
            ltb r3 = (defpackage.ltb) r3
            a33 r0 = r3.a
            long r10 = r0.o()
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x026f
            a33 r0 = r3.a
            r0.v(r4)
        L_0x026f:
            bl4 r0 = defpackage.bl4.REGULAR
            kotlin.collections.SetsKt.emptySet()
            xy2 r3 = new xy2
            r4 = 1
            r16 = 0
            r5 = 0
            r15 = 0
            r10 = r3
            r11 = r2
            r14 = r12
            r12 = r4
            r4 = r13
            r13 = r5
            r5 = r6
            r6 = r14
            r14 = r0
            r17 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            sv0 r8 = r7.m
            r8.c(r3)
            xme r8 = r7.E
            r8.getClass()
            r10 = 0
            r8.m(r10, r3)
            q62 r3 = r7.G
            if (r3 == 0) goto L_0x029e
            r3.c(r1)
        L_0x029e:
            boolean r1 = r5.isEmpty()
            java.lang.String r3 = "syncMessages"
            if (r1 != 0) goto L_0x02bf
            int r1 = r5.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r8 = "storeChatsFromServer: chatsToSync = %d"
            defpackage.z68.c(r9, r8, r1)
            ktg r1 = new ktg
            r8 = 17
            r1.<init>(r7, r0, r5, r8)
            r7.p0(r3, r1)
        L_0x02bf:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x02e0
            int r0 = r5.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "storeChatsFromServer: chatsWithScheduledMessagesForSync = %d"
            defpackage.z68.c(r9, r1, r0)
            bl4 r0 = defpackage.bl4.DELAYED
            ktg r1 = new ktg
            r5 = 17
            r1.<init>(r7, r0, r4, r5)
            r7.p0(r3, r1)
        L_0x02e0:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0304
            int r0 = r6.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "storeChatsFromServer: pinsToSync = %d"
            defpackage.z68.c(r9, r1, r0)
            r7.f()
            ir1 r0 = new ir1
            r1 = 8
            r0.<init>(r1, r7, r6)
            java.lang.String r1 = "syncPins"
            r7.p0(r1, r0)
        L_0x0304:
            java.lang.String r0 = "storeChatsFromServer: finished"
            defpackage.z68.c(r9, r0, new java.lang.Object[0])
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            return r0
        L_0x030f:
            java.lang.Object r1 = r32.get()
            s74 r1 = (defpackage.s74) r1
            a74 r1 = (defpackage.a74) r1
            r1.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd0.get():java.lang.Object");
    }

    public void invoke(Object obj) {
        ud udVar = (ud) obj;
        udVar.getClass();
        int i = this.c;
        udVar.B((td) this.v, (uob) this.b, (uob) this.o, i);
    }

    public /* synthetic */ vd0(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.v = obj;
        this.c = i;
        this.b = obj2;
        this.o = obj3;
    }

    public /* synthetic */ vd0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.v = obj;
        this.b = obj2;
        this.o = obj3;
        this.c = i;
    }
}
