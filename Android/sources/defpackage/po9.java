package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: po9  reason: default package */
public final class po9 implements mo9 {
    public final Context a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public Integer j;
    public final Lazy k;
    public final ya8 l = new ya8((Object) null);

    public po9(Context context, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8) {
        this.a = context;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        this.e = lazy4;
        this.f = lazy5;
        this.g = lazy7;
        this.h = lazy8;
        this.i = lazy6;
        this.k = LazyKt.lazy(new j35((Object) this, lazy3, 25));
    }

    public final void a() {
        z68.c("po9", "cancelAll", new Object[0]);
        pwa f2 = f();
        e().getClass();
        f2.a(1);
        dl2 dl2 = (dl2) this.c.getValue();
        dl2.getClass();
        String str = dl2.i;
        z68.c(str, "cancelAll", new Object[0]);
        try {
            KProperty kProperty = dl2.h[1];
            kj5 kj5 = (kj5) dl2.b.get();
            kj5.getClass();
            KProperty kProperty2 = kj5.x0[0];
            gfa I = ((OneMeRoomDatabase) ((rj5) kj5.v.get()).a.m()).I();
            I.getClass();
            new na3(new qa3(2, new fc2(10, I)).h(ejd.o)).a();
        } catch (Throwable th) {
            z68.f(str, "cancelAll failure!", th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0110, code lost:
        if (r3.contains(java.lang.Integer.valueOf(((android.service.notification.StatusBarNotification) r0.get(1)).getId())) != false) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(long r21) {
        /*
            r20 = this;
            r1 = r21
            r3 = 3
            r0 = 4
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            java.lang.String r5 = "po9"
            r6 = 0
            if (r4 != 0) goto L_0x0013
            java.lang.String r0 = "cancelServerChatId: failed, serverChatId == 0L"
            defpackage.z68.f(r5, r0, r6)
            return
        L_0x0013:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "cancelServerChatId: serverChatId="
            r4.<init>(r7)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            defpackage.z68.c(r5, r4, new java.lang.Object[0])
            jwa r4 = r20.e()
            r4.getClass()
            int r4 = defpackage.jwa.a(r21)
            pwa r8 = r20.f()
            r8.a(r4)
            r8 = r20
            kotlin.Lazy r9 = r8.c
            java.lang.Object r9 = r9.getValue()
            dl2 r9 = (defpackage.dl2) r9
            r9.getClass()
            java.lang.Long r10 = java.lang.Long.valueOf(r21)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r11 = defpackage.dl2.i
            java.lang.String r12 = "cancel %d"
            defpackage.z68.c(r11, r12, r10)
            r10 = 0
            r12 = 1
            kotlin.reflect.KProperty[] r13 = defpackage.dl2.h     // Catch:{ all -> 0x0097 }
            r13 = r13[r12]     // Catch:{ all -> 0x0097 }
            hs7 r9 = r9.b     // Catch:{ all -> 0x0097 }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x0097 }
            kj5 r9 = (defpackage.kj5) r9     // Catch:{ all -> 0x0097 }
            r9.getClass()     // Catch:{ all -> 0x0097 }
            kotlin.reflect.KProperty[] r13 = defpackage.kj5.x0     // Catch:{ all -> 0x0097 }
            r13 = r13[r10]     // Catch:{ all -> 0x0097 }
            hs7 r9 = r9.v     // Catch:{ all -> 0x0097 }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x0097 }
            rj5 r9 = (defpackage.rj5) r9     // Catch:{ all -> 0x0097 }
            j6d r9 = r9.a     // Catch:{ all -> 0x0097 }
            mka r9 = r9.n()     // Catch:{ all -> 0x0097 }
            mz4 r13 = defpackage.mz4.c     // Catch:{ all -> 0x0097 }
            wbe r9 = r9.i(r13)     // Catch:{ all -> 0x0097 }
            yl4 r13 = new yl4     // Catch:{ all -> 0x0097 }
            r13.<init>((long) r1, (int) r0)     // Catch:{ all -> 0x0097 }
            na3 r14 = new na3     // Catch:{ all -> 0x0097 }
            r14.<init>(r0, r9, r13)     // Catch:{ all -> 0x0097 }
            yl4 r0 = new yl4     // Catch:{ all -> 0x0097 }
            r0.<init>((long) r1, (int) r3)     // Catch:{ all -> 0x0097 }
            bb3 r0 = r14.h(r0)     // Catch:{ all -> 0x0097 }
            na3 r9 = new na3     // Catch:{ all -> 0x0097 }
            r9.<init>(r0)     // Catch:{ all -> 0x0097 }
            r9.a()     // Catch:{ all -> 0x0097 }
            goto L_0x009d
        L_0x0097:
            r0 = move-exception
            java.lang.String r9 = "cancel failure!"
            defpackage.z68.f(r11, r9, r0)
        L_0x009d:
            pwa r0 = r20.f()
            jwa r9 = r20.e()
            r9.getClass()
            jwa r9 = r20.e()
            r9.getClass()
            java.util.List r9 = r0.d(r6)
            y3a r11 = new y3a
            r11.<init>((int) r3, (java.lang.Object) r0)
            java.util.List r0 = defpackage.cjf.q(r9, r11)
            int r3 = r0.size()
            if (r3 != r12) goto L_0x00d0
            java.lang.Object r3 = r0.get(r10)
            android.service.notification.StatusBarNotification r3 = (android.service.notification.StatusBarNotification) r3
            int r3 = r3.getId()
            if (r3 != r12) goto L_0x00d0
        L_0x00ce:
            r10 = r12
            goto L_0x0113
        L_0x00d0:
            int r3 = r0.size()
            r9 = 2
            if (r3 != r9) goto L_0x0113
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r3.add(r9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            java.lang.Object r4 = r0.get(r10)
            android.service.notification.StatusBarNotification r4 = (android.service.notification.StatusBarNotification) r4
            int r4 = r4.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L_0x0113
            java.lang.Object r0 = r0.get(r12)
            android.service.notification.StatusBarNotification r0 = (android.service.notification.StatusBarNotification) r0
            int r0 = r0.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0113
            goto L_0x00ce
        L_0x0113:
            pwa r0 = r20.f()
            jwa r3 = r20.e()
            r3.getClass()
            java.util.List r0 = r0.d(r6)
            r13 = r0
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r17 = 0
            r18 = 0
            java.lang.String r14 = ","
            java.lang.String r15 = "["
            java.lang.String r16 = "]"
            r19 = 56
            java.lang.String r0 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r13, r14, r15, r16, 0, r17, r18, r19, (java.lang.Object) null)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ONEME-3201 cancelServerChatId: activeNotifs="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            defpackage.z68.c(r5, r0, new java.lang.Object[0])
            if (r10 == 0) goto L_0x016a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            r0.append(r1)
            java.lang.String r1 = ", cancel group summary"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.z68.c(r5, r0, new java.lang.Object[0])
            pwa r0 = r20.f()
            jwa r1 = r20.e()
            r1.getClass()
            r0.a(r12)
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po9.b(long):void");
    }

    public final String c(boolean z) {
        String str;
        boolean c2 = ((udg) ((xq) this.b.getValue())).c();
        Lazy lazy = this.f;
        if (c2) {
            oca oca = (oca) lazy.getValue();
            oca.c.getClass();
            if (oca.g("ru.oneme.app.inapp.2") == null) {
                oca.e(oca.d());
            }
            return "ru.oneme.app.inapp.2";
        }
        if (z) {
            oca oca2 = (oca) lazy.getValue();
            oca2.c.getClass();
            str = "ru.oneme.app.dialogs";
            if (oca2.g(str) == null) {
                oca2.e(oca2.c());
            }
        } else {
            oca oca3 = (oca) lazy.getValue();
            oca3.c.getClass();
            str = "ru.oneme.app.chats";
            if (oca3.g(str) == null) {
                oca3.e(oca3.b());
            }
        }
        return str;
    }

    public final eda d(String str) {
        Context context = this.a;
        eda eda = str == null ? new eda(context, (String) null) : new eda(context, str);
        e().getClass();
        eda.F.icon = sfc.ic_notification;
        e().c();
        eda.x = -16745729;
        eda.v = "msg";
        eda.i(16, true);
        return eda;
    }

    public final jwa e() {
        return (jwa) this.d.getValue();
    }

    public final pwa f() {
        return (pwa) this.e.getValue();
    }

    public final void g() {
        z68.c("po9", "notifyAllChats", new Object[0]);
        KProperty[] kPropertyArr = dl2.h;
        fea b2 = ((dl2) this.c.getValue()).b(SetsKt.emptySet());
        Map map = b2.a;
        if (map.isEmpty()) {
            a();
            return;
        }
        i(b2);
        if (!map.isEmpty()) {
            for (Map.Entry value : map.entrySet()) {
                if (!((yk2) value.getValue()).f.isEmpty()) {
                    for (yk2 yk2 : SequencesKt.filter(CollectionsKt.asSequence(map.values()), new wg7(26))) {
                        b(yk2.c);
                    }
                    return;
                }
            }
        }
        a();
    }

    public final void h(Set set) {
        z68.c("po9", "notifyServerChatIds %s", set);
        if (!set.isEmpty()) {
            fea b2 = ((dl2) this.c.getValue()).b(set);
            i(b2);
            for (Number longValue : SequencesKt.filter(CollectionsKt.asSequence(set), new vq7(17, (Object) b2))) {
                b(longValue.longValue());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r12v14, types: [java.lang.Object, ldb] */
    /* JADX WARNING: type inference failed for: r10v19, types: [java.lang.Object, ldb] */
    /* JADX WARNING: type inference failed for: r8v66, types: [java.lang.Object, ldb] */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02ab, code lost:
        if (r8.n == true) goto L_0x02ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x05c8  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x05f3  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x060e  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0757  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x075e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x04b9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(defpackage.fea r46) {
        /*
            r45 = this;
            r0 = r45
            r1 = r46
            r2 = 4
            r3 = 0
            r4 = 1
            java.lang.String r5 = "po9"
            java.lang.String r6 = "show(%s)"
            java.lang.Object[] r7 = new java.lang.Object[]{r46}
            defpackage.z68.c(r5, r6, r7)
            java.util.Map r5 = r1.a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0023
            java.lang.String r2 = "po9"
            java.lang.String r5 = "showBundled: skip, no data"
            defpackage.z68.p(r2, r5)
            goto L_0x0816
        L_0x0023:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Map r9 = r1.a
            java.util.Collection r9 = r9.values()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            ed7 r10 = new ed7
            r10.<init>(r2)
            java.util.List r9 = kotlin.collections.CollectionsKt.sortedWith(r9, r10)
            java.util.Iterator r9 = r9.iterator()
            r10 = r3
        L_0x003e:
            boolean r11 = r9.hasNext()
            r12 = 20
            if (r11 == 0) goto L_0x0768
            java.lang.Object r11 = r9.next()
            yk2 r11 = (defpackage.yk2) r11
            jwa r13 = r45.e()
            long r14 = r11.c
            r13.getClass()
            int r20 = defpackage.jwa.a(r14)
            java.util.List r13 = r11.f
            java.util.Collection r13 = (java.util.Collection) r13
            boolean r13 = r13.isEmpty()
            r13 = r13 ^ r4
            if (r13 == 0) goto L_0x073d
            if (r10 >= r12) goto L_0x0721
            java.util.List r12 = r11.f
            int r12 = r12.size()
            r13 = 10
            if (r12 <= r13) goto L_0x0077
            java.util.List r12 = r11.f
            java.util.List r12 = kotlin.collections.CollectionsKt.takeLast(r12, r13)
            goto L_0x0079
        L_0x0077:
            java.util.List r12 = r11.f
        L_0x0079:
            r14 = r12
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            kotlin.sequences.Sequence r15 = kotlin.collections.CollectionsKt.asSequence(r14)
            wg7 r2 = new wg7
            r13 = 29
            r2.<init>(r13)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.mapNotNull(r15, r2)
            oo9 r13 = new oo9
            r13.<init>(r3)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.filter(r2, r13)
            java.util.Iterator r2 = r2.iterator()
        L_0x0098:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L_0x00b4
            java.lang.Object r13 = r2.next()
            hea r13 = (defpackage.hea) r13
            kotlin.Lazy r15 = r0.g
            java.lang.Object r15 = r15.getValue()
            ou8 r15 = (defpackage.ou8) r15
            java.lang.String r13 = r13.a
            qva r15 = (defpackage.qva) r15
            r15.f(r13, r4)
            goto L_0x0098
        L_0x00b4:
            if (r10 != 0) goto L_0x00bc
            boolean r2 = r11.j
            if (r2 == 0) goto L_0x00bc
            r2 = r4
            goto L_0x00bd
        L_0x00bc:
            r2 = r3
        L_0x00bd:
            java.util.List r13 = r11.f
            java.lang.Object r13 = kotlin.collections.CollectionsKt.first(r13)
            bd9 r13 = (defpackage.bd9) r13
            r22 = r5
            long r4 = r13.i
            java.lang.String r13 = r11.d
            zk2 r15 = defpackage.zk2.a
            zk2 r3 = r11.e
            if (r3 != r15) goto L_0x00d3
            r6 = 1
            goto L_0x00d4
        L_0x00d3:
            r6 = 0
        L_0x00d4:
            java.lang.String r6 = r0.c(r6)
            java.lang.String r7 = "po9"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r8 = new java.lang.Object[]{r6, r8}
            r25 = r9
            java.lang.String r9 = "showBundledForChat: channelId = %s, alert = %b"
            defpackage.z68.c(r7, r9, r8)
            eda r6 = r0.d(r6)
            java.lang.String r7 = r1.e
            r6.r = r7
            android.graphics.Bitmap r7 = r11.h
            r6.k(r7)
            android.app.Notification r7 = r6.F
            long r8 = r11.m
            r7.when = r8
            r17 = r4
            long r4 = r11.c
            java.lang.String r7 = java.lang.String.valueOf(r4)
            r6.B = r7
            r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r26 = r23 - r8
            java.lang.String r7 = java.lang.String.valueOf(r26)
            r6.t = r7
            boolean r7 = r11.k
            if (r7 == 0) goto L_0x023f
            rda r13 = new rda
            kotlin.Lazy r1 = r0.k
            java.lang.Object r1 = r1.getValue()
            ldb r1 = (defpackage.ldb) r1
            r13.<init>(r1)
            if (r3 != r15) goto L_0x0127
            goto L_0x0134
        L_0x0127:
            zk2 r1 = defpackage.zk2.o
            if (r3 != r1) goto L_0x012c
            goto L_0x0134
        L_0x012c:
            java.lang.String r1 = r11.d
            r13.h = r1
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r13.i = r1
        L_0x0134:
            java.util.Iterator r1 = r12.iterator()
        L_0x0138:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0235
            java.lang.Object r3 = r1.next()
            bd9 r3 = (defpackage.bd9) r3
            r12 = r14
            long r14 = r3.g
            r26 = 0
            int r19 = (r14 > r26 ? 1 : (r14 == r26 ? 0 : -1))
            if (r19 == 0) goto L_0x0150
        L_0x014d:
            r19 = r1
            goto L_0x0153
        L_0x0150:
            long r14 = r3.c
            goto L_0x014d
        L_0x0153:
            boolean r1 = r3.n
            if (r1 == 0) goto L_0x0167
            kotlin.Lazy r1 = r0.k
            java.lang.Object r1 = r1.getValue()
            ldb r1 = (defpackage.ldb) r1
            r28 = r8
            r26 = r10
            r27 = r12
            goto L_0x01f4
        L_0x0167:
            ya8 r1 = r0.l
            java.lang.Object r21 = r1.f(r14)
            if (r21 != 0) goto L_0x0194
            r26 = r10
            java.lang.String r10 = r3.f
            r27 = r12
            java.lang.String r12 = java.lang.String.valueOf(r14)
            r28 = r8
            ldb r8 = new ldb
            r8.<init>()
            r8.a = r10
            r9 = 0
            r8.b = r9
            r8.c = r9
            r8.d = r12
            r9 = 0
            r8.e = r9
            r8.f = r9
            r1.i(r14, r8)
            r21 = r8
            goto L_0x019a
        L_0x0194:
            r28 = r8
            r26 = r10
            r27 = r12
        L_0x019a:
            r8 = r21
            ldb r8 = (defpackage.ldb) r8
            androidx.core.graphics.drawable.IconCompat r9 = r8.b
            if (r9 != 0) goto L_0x01c9
            android.graphics.Bitmap r9 = r3.h
            if (r9 == 0) goto L_0x01c9
            androidx.core.graphics.drawable.IconCompat r9 = androidx.core.graphics.drawable.IconCompat.b(r9)
            ldb r10 = new ldb
            r10.<init>()
            java.lang.CharSequence r12 = r8.a
            r10.a = r12
            r10.b = r9
            java.lang.String r9 = r8.c
            r10.c = r9
            java.lang.String r9 = r8.d
            r10.d = r9
            boolean r9 = r8.e
            r10.e = r9
            boolean r8 = r8.f
            r10.f = r8
            r1.i(r14, r10)
            r8 = r10
        L_0x01c9:
            java.lang.CharSequence r9 = r8.a
            java.lang.String r10 = r3.f
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 != 0) goto L_0x01f3
            java.lang.String r9 = r3.f
            java.lang.String r10 = java.lang.String.valueOf(r14)
            androidx.core.graphics.drawable.IconCompat r8 = r8.b
            ldb r12 = new ldb
            r12.<init>()
            r12.a = r9
            r12.b = r8
            r8 = 0
            r12.c = r8
            r12.d = r10
            r8 = 0
            r12.e = r8
            r12.f = r8
            r1.i(r14, r12)
            r1 = r12
            goto L_0x01f4
        L_0x01f3:
            r1 = r8
        L_0x01f4:
            lf6 r8 = r3.j
            java.lang.Object r8 = r8.c
            java.lang.String r8 = (java.lang.String) r8
            qda r9 = new qda
            long r14 = r3.i
            r9.<init>(r8, r14, r1)
            r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r14 = r23 - r14
            java.lang.String r1 = java.lang.String.valueOf(r14)
            r6.t = r1
            hea r1 = r3.l
            if (r1 == 0) goto L_0x021a
            java.lang.String r3 = "image/*"
            r9.e = r3
            android.net.Uri r1 = r1.c
            r9.f = r1
        L_0x021a:
            java.util.ArrayList r1 = r13.e
            r1.add(r9)
            int r3 = r1.size()
            r8 = 25
            if (r3 <= r8) goto L_0x022b
            r3 = 0
            r1.remove(r3)
        L_0x022b:
            r1 = r19
            r10 = r26
            r14 = r27
            r8 = r28
            goto L_0x0138
        L_0x0235:
            r28 = r8
            r26 = r10
            r27 = r14
            r6.q(r13)
            goto L_0x0283
        L_0x023f:
            r28 = r8
            r26 = r10
            r27 = r14
            int r1 = r11.i
            kotlin.jvm.internal.StringCompanionObject r3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            int r3 = defpackage.zjc.tt_new_messages
            java.lang.String[] r8 = defpackage.ghf.c
            android.content.Context r8 = r0.a
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r3 = r8.getQuantityString(r3, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r8 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r8)
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r6.f(r13)
            r6.e(r1)
            cda r3 = new cda
            r8 = 0
            r3.<init>(r8)
            java.lang.CharSequence r1 = defpackage.eda.c(r1)
            r3.f = r1
            java.lang.CharSequence r1 = defpackage.eda.c(r13)
            r3.c = r1
            r6.q(r3)
        L_0x0283:
            if (r2 != 0) goto L_0x0288
            r1 = 1
            r6.C = r1
        L_0x0288:
            pwa r1 = r45.f()
            r1.getClass()
            java.lang.String r2 = "extendChatNotification step 1"
            java.lang.String r3 = "pwa"
            defpackage.z68.c(r3, r2, new java.lang.Object[0])
            java.util.List r2 = r11.f
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L_0x02ad
            java.util.List r8 = r11.f
            java.lang.Object r8 = kotlin.collections.CollectionsKt.lastOrNull(r8)
            bd9 r8 = (defpackage.bd9) r8
            if (r8 == 0) goto L_0x02b1
            boolean r8 = r8.n
            r9 = 1
            if (r8 != r9) goto L_0x02b2
        L_0x02ad:
            r19 = r2
            goto L_0x049c
        L_0x02b1:
            r9 = 1
        L_0x02b2:
            java.util.List r8 = r11.f
            java.lang.Object r8 = kotlin.collections.CollectionsKt.lastOrNull(r8)
            bd9 r8 = (defpackage.bd9) r8
            if (r8 == 0) goto L_0x02c2
            boolean r8 = r8.n
            if (r8 != r9) goto L_0x02c2
            r8 = 1
            goto L_0x02c3
        L_0x02c2:
            r8 = 0
        L_0x02c3:
            kotlin.Lazy r9 = r1.d
            kotlin.Lazy r10 = r1.b
            kotlin.Lazy r12 = r1.g
            if (r8 == 0) goto L_0x02d7
            r31 = r1
            r19 = r2
            r21 = r3
            r33 = r10
            r32 = r11
            goto L_0x0414
        L_0x02d7:
            java.lang.Object r8 = r12.getValue()
            r62 r8 = (defpackage.r62) r8
            a32 r8 = r8.D(r4)
            if (r8 == 0) goto L_0x02f2
            java.lang.Object r13 = r10.getValue()
            jtb r13 = (defpackage.jtb) r13
            ltb r13 = (defpackage.ltb) r13
            vj5 r13 = r13.e
            boolean r8 = r8.V(r13)
            goto L_0x02f3
        L_0x02f2:
            r8 = 0
        L_0x02f3:
            java.lang.Object r13 = r9.getValue()
            jwa r13 = (defpackage.jwa) r13
            r13.getClass()
            int r13 = defpackage.jwa.a(r4)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.String r0 = "android.wearable.EXTENSIONS"
            if (r8 == 0) goto L_0x032c
            int r8 = defpackage.nad.c
            pca r8 = r1.e(r11, r13, r8)
            r19 = r2
            java.lang.String r2 = "flags"
            r21 = r3
            r3 = 7
            android.os.Bundle r2 = defpackage.wj6.g(r3, r2)
            android.os.Bundle r3 = r8.e
            r3.putBundle(r0, r2)
            qca r2 = r8.a()
            r14.add(r2)
            goto L_0x0330
        L_0x032c:
            r19 = r2
            r21 = r3
        L_0x0330:
            int r2 = defpackage.nad.b
            pca r2 = r1.g(r11, r13, r2)
            qca r2 = r2.a()
            r14.add(r2)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            boolean r3 = r14.isEmpty()
            if (r3 != 0) goto L_0x03e7
            java.util.ArrayList r3 = new java.util.ArrayList
            int r8 = r14.size()
            r3.<init>(r8)
            java.util.Iterator r8 = r14.iterator()
        L_0x0355:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x03db
            java.lang.Object r13 = r8.next()
            qca r13 = (defpackage.qca) r13
            int r14 = android.os.Build.VERSION.SDK_INT
            r30 = r8
            androidx.core.graphics.drawable.IconCompat r8 = r13.a()
            if (r8 != 0) goto L_0x036f
            r31 = r1
            r8 = 0
            goto L_0x0376
        L_0x036f:
            r31 = r1
            r1 = 0
            android.graphics.drawable.Icon r8 = defpackage.v67.d(r8, r1)
        L_0x0376:
            java.lang.CharSequence r1 = r13.i
            r32 = r11
            android.app.PendingIntent r11 = r13.j
            android.app.Notification$Action$Builder r1 = defpackage.uda.a(r8, r1, r11)
            android.os.Bundle r8 = r13.a
            if (r8 == 0) goto L_0x038a
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>(r8)
            goto L_0x038f
        L_0x038a:
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
        L_0x038f:
            java.lang.String r8 = "android.support.allowGeneratedReplies"
            r33 = r10
            boolean r10 = r13.d
            r11.putBoolean(r8, r10)
            defpackage.vda.a(r1, r10)
            r8 = 31
            if (r14 < r8) goto L_0x03a4
            boolean r8 = r13.k
            defpackage.wda.a(r1, r8)
        L_0x03a4:
            defpackage.tda.a(r1, r11)
            a1d[] r8 = r13.c
            if (r8 == 0) goto L_0x03ca
            int r10 = r8.length
            android.app.RemoteInput[] r10 = new android.app.RemoteInput[r10]
            r11 = 0
        L_0x03af:
            int r13 = r8.length
            if (r11 >= r13) goto L_0x03bd
            r13 = r8[r11]
            android.app.RemoteInput r13 = defpackage.a1d.a(r13)
            r10[r11] = r13
            r13 = 1
            int r11 = r11 + r13
            goto L_0x03af
        L_0x03bd:
            r13 = 1
            int r8 = r10.length
            r11 = 0
        L_0x03c0:
            if (r11 >= r8) goto L_0x03ca
            r14 = r10[r11]
            defpackage.tda.b(r1, r14)
            int r11 = r11 + r13
            r13 = 1
            goto L_0x03c0
        L_0x03ca:
            android.app.Notification$Action r1 = defpackage.tda.c(r1)
            r3.add(r1)
            r8 = r30
            r1 = r31
            r11 = r32
            r10 = r33
            goto L_0x0355
        L_0x03db:
            r31 = r1
            r33 = r10
            r32 = r11
            java.lang.String r1 = "actions"
            r2.putParcelableArrayList(r1, r3)
            goto L_0x03ed
        L_0x03e7:
            r31 = r1
            r33 = r10
            r32 = r11
        L_0x03ed:
            boolean r1 = r15.isEmpty()
            if (r1 != 0) goto L_0x0404
            int r1 = r15.size()
            android.app.Notification[] r1 = new android.app.Notification[r1]
            java.lang.Object[] r1 = r15.toArray(r1)
            android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
            java.lang.String r3 = "pages"
            r2.putParcelableArray(r3, r1)
        L_0x0404:
            android.os.Bundle r1 = r6.w
            if (r1 != 0) goto L_0x040f
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r6.w = r1
        L_0x040f:
            android.os.Bundle r1 = r6.w
            r1.putBundle(r0, r2)
        L_0x0414:
            if (r7 == 0) goto L_0x049a
            java.lang.Object r0 = r9.getValue()
            jwa r0 = (defpackage.jwa) r0
            r0.getClass()
            int r0 = defpackage.jwa.a(r4)
            java.lang.Object r1 = r12.getValue()
            r62 r1 = (defpackage.r62) r1
            a32 r1 = r1.D(r4)
            if (r1 == 0) goto L_0x043e
            java.lang.Object r2 = r33.getValue()
            jtb r2 = (defpackage.jtb) r2
            ltb r2 = (defpackage.ltb) r2
            vj5 r2 = r2.e
            boolean r1 = r1.V(r2)
            goto L_0x043f
        L_0x043e:
            r1 = 0
        L_0x043f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "extendChatNotification messagingEnabled = "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r3 = r21
            defpackage.z68.c(r3, r2, new java.lang.Object[0])
            if (r1 == 0) goto L_0x0477
            int r1 = defpackage.nad.v1
            r2 = r31
            r11 = r32
            pca r1 = r2.e(r11, r0, r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "extendChatNotification directReplyAction = "
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            defpackage.z68.c(r3, r7, new java.lang.Object[0])
            qca r1 = r1.a()
            r6.a(r1)
            goto L_0x047b
        L_0x0477:
            r2 = r31
            r11 = r32
        L_0x047b:
            int r1 = defpackage.nad.b
            pca r0 = r2.g(r11, r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "extendChatNotification markAsReadAction = "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            defpackage.z68.c(r3, r1, new java.lang.Object[0])
            qca r0 = r0.a()
            r6.a(r0)
            goto L_0x049c
        L_0x049a:
            r11 = r32
        L_0x049c:
            pwa r0 = r45.f()
            r2 = r19
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r1 = r2.iterator()
        L_0x04a8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x04b9
            java.lang.Object r2 = r1.next()
            bd9 r2 = (defpackage.bd9) r2
            java.lang.Long r2 = r2.d
            if (r2 == 0) goto L_0x04a8
            goto L_0x04ba
        L_0x04b9:
            r2 = 0
        L_0x04ba:
            hac r1 = new hac
            zk2 r3 = r11.e
            long r7 = r11.a
            java.lang.String r9 = r11.b
            long r14 = r11.c
            r43 = r14
            long r13 = r11.l
            java.lang.String r12 = r11.n
            r15 = r4
            long r4 = r11.o
            r30 = r1
            r31 = r7
            r33 = r9
            r34 = r43
            r36 = r2
            r37 = r13
            r39 = r12
            r40 = r4
            r42 = r3
            r30.<init>(r31, r33, r34, r36, r37, r39, r40, r42)
            java.lang.Long r3 = java.lang.Long.valueOf(r17)
            r0.getClass()
            if (r2 == 0) goto L_0x0500
            long r4 = r2.longValue()
            zb8 r2 = defpackage.zb8.b
            r2.getClass()
            r2 = 0
            pa4 r3 = defpackage.zb8.n1(r4, r3, r2)
            android.content.Intent r0 = r0.j(r3)
            r17 = r1
            goto L_0x0554
        L_0x0500:
            zb8 r2 = defpackage.zb8.b
            r2.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = ":chats?id="
            java.lang.String r10 = "&type=server&push_id="
            r18 = r0
            r17 = r1
            r0 = r43
            java.lang.StringBuilder r0 = defpackage.tr1.n(r0, r9, r10)
            r0.append(r7)
            java.lang.String r1 = "&push_type="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = "&created_time="
            java.lang.String r7 = "&message_server_id="
            defpackage.tr1.v(r0, r1, r4, r7)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "&load_mark="
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            pa4 r1 = new pa4
            r1.<init>(r0)
            r0 = r18
            android.content.Intent r0 = r0.j(r1)
        L_0x0554:
            java.lang.String r1 = "push_action"
            java.lang.String r2 = "push_action_open_chat"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "push_info"
            r2 = r17
            r0.putExtra(r1, r2)
            pwa r1 = r45.f()
            r1.getClass()
            pwa r1 = r45.f()
            r1.getClass()
            int r2 = ru.ok.tamtam.android.services.NotificationTamService.X
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<ru.ok.tamtam.android.services.NotificationTamService> r3 = ru.ok.tamtam.android.services.NotificationTamService.class
            android.content.Context r1 = r1.a
            r2.<init>(r1, r3)
            java.lang.String r1 = "ru.ok.tamtam.action.NOTIF_CANCEL_BUNDLED"
            r2.setAction(r1)
            java.lang.String r1 = "ru.ok.tamtam.extra.CHAT_SERVER_ID"
            r3 = r15
            r2.putExtra(r1, r3)
            java.lang.String r1 = "ru.ok.tamtam.extra.MARK"
            r3 = r28
            r2.putExtra(r1, r3)
            java.lang.String r1 = "ru.ok.tamtam.extra.PUSH_ID"
            long r3 = r11.a
            r2.putExtra(r1, r3)
            java.lang.String r1 = "ru.ok.tamtam.extra.EVENT_KEY"
            java.lang.String r3 = r11.b
            r2.putExtra(r1, r3)
            java.lang.String r1 = "ru.ok.tamtam.extra.MESSAGE_SERVER_ID"
            long r3 = r11.l
            r2.putExtra(r1, r3)
            pwa r1 = r45.f()
            kotlin.Lazy r3 = r1.d
            java.lang.Object r3 = r3.getValue()
            jwa r3 = (defpackage.jwa) r3
            r3.getClass()
            r21 = 0
            r16 = r1
            r17 = r6
            r18 = r0
            r19 = r2
            r16.k(r17, r18, r19, r20, r21)
            java.util.List r0 = r11.f
            int r0 = r0.size()
            r1 = 10
            if (r0 <= r1) goto L_0x05eb
            java.util.List r0 = r11.f
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.sequences.Sequence r2 = kotlin.collections.CollectionsKt.asSequence(r2)
            int r0 = r0.size()
            int r0 = r0 - r1
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.take(r2, r0)
            wg7 r1 = new wg7
            r2 = 27
            r1.<init>(r2)
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.map(r0, r1)
            r1 = r22
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r1, r0)
            goto L_0x05ed
        L_0x05eb:
            r1 = r22
        L_0x05ed:
            zk2 r0 = defpackage.zk2.a
            zk2 r2 = r11.e
            if (r2 != r0) goto L_0x05f7
            r15 = 1
        L_0x05f4:
            r0 = r45
            goto L_0x05f9
        L_0x05f7:
            r15 = 0
            goto L_0x05f4
        L_0x05f9:
            java.lang.String r2 = r0.c(r15)
            pwa r3 = r45.f()
            r4 = 0
            tea r3 = r3.i(r4)
            android.app.NotificationManager r3 = r3.b
            boolean r3 = defpackage.nea.a(r3)
            if (r3 != 0) goto L_0x063c
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r27, 10)
            r2.<init>(r3)
            java.util.Iterator r3 = r27.iterator()
        L_0x061b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x071a
            java.lang.Object r4 = r3.next()
            bd9 r4 = (defpackage.bd9) r4
            jga r5 = new jga
            long r13 = r4.c
            hx4 r19 = defpackage.hx4.SYSTEM_APP_NOTIF_DISABLED
            long r6 = r4.e
            long r8 = r4.i
            r12 = r5
            r15 = r6
            r17 = r8
            r12.<init>(r13, r15, r17, r19)
            r2.add(r5)
            goto L_0x061b
        L_0x063c:
            kotlin.Lazy r3 = r0.f
            java.lang.Object r3 = r3.getValue()
            oca r3 = (defpackage.oca) r3
            eta r4 = r3.d
            java.lang.String r4 = r4.b(r2)
            if (r4 != 0) goto L_0x064f
        L_0x064c:
            r30 = 1
            goto L_0x0662
        L_0x064f:
            android.app.NotificationManager r3 = r3.i()
            android.app.NotificationChannelGroup r3 = r3.getNotificationChannelGroup(r4)
            if (r3 != 0) goto L_0x065a
            goto L_0x064c
        L_0x065a:
            boolean r3 = r3.isBlocked()
            r4 = 1
            r3 = r3 ^ r4
            r30 = r3
        L_0x0662:
            if (r30 != 0) goto L_0x0696
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r27, 10)
            r2.<init>(r3)
            java.util.Iterator r3 = r27.iterator()
        L_0x0671:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x071a
            java.lang.Object r4 = r3.next()
            bd9 r4 = (defpackage.bd9) r4
            jga r5 = new jga
            long r6 = r4.c
            hx4 r34 = defpackage.hx4.NOTIFICATION_GROUP_CHANNEL_DISABLED
            long r8 = r4.e
            long r12 = r4.i
            r27 = r5
            r28 = r6
            r30 = r8
            r32 = r12
            r27.<init>(r28, r30, r32, r34)
            r2.add(r5)
            goto L_0x0671
        L_0x0696:
            kotlin.Lazy r3 = r0.f
            java.lang.Object r3 = r3.getValue()
            oca r3 = (defpackage.oca) r3
            android.app.NotificationManager r3 = r3.i()
            android.app.NotificationChannel r2 = r3.getNotificationChannel(r2)
            if (r2 != 0) goto L_0x06aa
        L_0x06a8:
            r2 = 1
            goto L_0x06b2
        L_0x06aa:
            int r2 = r2.getImportance()
            if (r2 <= 0) goto L_0x06b1
            goto L_0x06a8
        L_0x06b1:
            r2 = 0
        L_0x06b2:
            if (r2 != 0) goto L_0x06e6
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r27, 10)
            r2.<init>(r3)
            java.util.Iterator r3 = r27.iterator()
        L_0x06c1:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x071a
            java.lang.Object r4 = r3.next()
            bd9 r4 = (defpackage.bd9) r4
            jga r5 = new jga
            long r6 = r4.c
            hx4 r34 = defpackage.hx4.NOTIFICATION_CHANNEL_DISABLED
            long r8 = r4.e
            long r12 = r4.i
            r27 = r5
            r28 = r6
            r30 = r8
            r32 = r12
            r27.<init>(r28, r30, r32, r34)
            r2.add(r5)
            goto L_0x06c1
        L_0x06e6:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r27, 10)
            r2.<init>(r3)
            java.util.Iterator r3 = r27.iterator()
        L_0x06f3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x071a
            java.lang.Object r4 = r3.next()
            bd9 r4 = (defpackage.bd9) r4
            kga r5 = new kga
            long r6 = r4.c
            long r8 = r4.e
            long r12 = r4.i
            boolean r4 = r4.m
            r27 = r5
            r28 = r6
            r30 = r8
            r32 = r4
            r33 = r12
            r27.<init>(r28, r30, r32, r33)
            r2.add(r5)
            goto L_0x06f3
        L_0x071a:
            r1.addAll(r2)
            r2 = 1
            int r10 = r26 + 1
            goto L_0x074b
        L_0x0721:
            r1 = r5
            r25 = r9
            r26 = r10
            java.util.List r2 = r11.f
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.sequences.Sequence r2 = kotlin.collections.CollectionsKt.asSequence(r2)
            wg7 r3 = new wg7
            r4 = 28
            r3.<init>(r4)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.map(r2, r3)
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r1, r2)
            goto L_0x0749
        L_0x073d:
            r1 = r5
            r25 = r9
            r26 = r10
            java.lang.String r2 = "po9"
            java.lang.String r3 = "display messages are empty"
            defpackage.z68.p(r2, r3)
        L_0x0749:
            r10 = r26
        L_0x074b:
            java.util.List r2 = r11.g
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x075e
            java.util.List r2 = r11.g
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
        L_0x075e:
            r5 = r1
            r9 = r25
            r2 = 4
            r3 = 0
            r4 = 1
            r1 = r46
            goto L_0x003e
        L_0x0768:
            r1 = r5
            r26 = r10
            kotlin.Lazy r2 = r0.h
            java.lang.Object r2 = r2.getValue()
            hga r2 = (defpackage.hga) r2
            monitor-enter(r2)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x07cc }
            int r4 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r1, 10)     // Catch:{ all -> 0x07cc }
            r3.<init>(r4)     // Catch:{ all -> 0x07cc }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ all -> 0x07cc }
        L_0x0781:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x07cc }
            if (r5 == 0) goto L_0x07cf
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x07cc }
            lga r5 = (defpackage.lga) r5     // Catch:{ all -> 0x07cc }
            mga r6 = new mga     // Catch:{ all -> 0x07cc }
            long r7 = r5.a     // Catch:{ all -> 0x07cc }
            boolean r9 = r5 instanceof defpackage.kga     // Catch:{ all -> 0x07cc }
            if (r9 == 0) goto L_0x0799
            r9 = r5
            kga r9 = (defpackage.kga) r9     // Catch:{ all -> 0x07cc }
            goto L_0x079a
        L_0x0799:
            r9 = 0
        L_0x079a:
            if (r9 == 0) goto L_0x07a5
            boolean r9 = r9.d     // Catch:{ all -> 0x07cc }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x07cc }
            r34 = r9
            goto L_0x07a7
        L_0x07a5:
            r34 = 0
        L_0x07a7:
            boolean r9 = r5 instanceof defpackage.jga     // Catch:{ all -> 0x07cc }
            if (r9 == 0) goto L_0x07af
            r9 = r5
            jga r9 = (defpackage.jga) r9     // Catch:{ all -> 0x07cc }
            goto L_0x07b0
        L_0x07af:
            r9 = 0
        L_0x07b0:
            if (r9 == 0) goto L_0x07b7
            hx4 r9 = r9.d     // Catch:{ all -> 0x07cc }
            r35 = r9
            goto L_0x07b9
        L_0x07b7:
            r35 = 0
        L_0x07b9:
            long r9 = r5.b     // Catch:{ all -> 0x07cc }
            long r13 = r5.c     // Catch:{ all -> 0x07cc }
            r27 = r6
            r28 = r7
            r30 = r9
            r32 = r13
            r27.<init>(r28, r30, r32, r34, r35)     // Catch:{ all -> 0x07cc }
            r3.add(r6)     // Catch:{ all -> 0x07cc }
            goto L_0x0781
        L_0x07cc:
            r0 = move-exception
            goto L_0x09f7
        L_0x07cf:
            pga r4 = r2.d()     // Catch:{ all -> 0x07cc }
            wbe r4 = r4.b()     // Catch:{ all -> 0x07cc }
            ej5 r5 = new ej5     // Catch:{ all -> 0x07cc }
            r6 = 3
            r5.<init>(r6, r3)     // Catch:{ all -> 0x07cc }
            na3 r3 = new na3     // Catch:{ all -> 0x07cc }
            r6 = 4
            r3.<init>(r6, r4, r5)     // Catch:{ all -> 0x07cc }
            pf6 r4 = defpackage.pf6.w     // Catch:{ all -> 0x07cc }
            bb3 r3 = r3.h(r4)     // Catch:{ all -> 0x07cc }
            na3 r4 = new na3     // Catch:{ all -> 0x07cc }
            r4.<init>(r3)     // Catch:{ all -> 0x07cc }
            r4.a()     // Catch:{ all -> 0x07cc }
            java.util.List r3 = r2.a(r1)     // Catch:{ all -> 0x07cc }
            r4 = 0
            r2.e(r1, r3, r4)     // Catch:{ all -> 0x07cc }
            monitor-exit(r2)
            r3 = r26
            if (r3 < r12) goto L_0x0814
            kotlin.Lazy r1 = r0.h
            java.lang.Object r1 = r1.getValue()
            hga r1 = (defpackage.hga) r1
            iga r1 = r1.c()
            r1.getClass()
            java.lang.String r1 = "onNotificationsMaxCountReached: maxCount=20"
            java.lang.String r2 = defpackage.iga.d
            defpackage.z68.c(r2, r1, new java.lang.Object[0])
        L_0x0814:
            r1 = r46
        L_0x0816:
            java.util.Map r2 = r1.a
            boolean r2 = r2.isEmpty()
            java.lang.String r3 = "showGroupSummary: skip update, no notifications!"
            java.lang.String r4 = "po9"
            if (r2 == 0) goto L_0x0827
            defpackage.z68.p(r4, r3)
            goto L_0x09f6
        L_0x0827:
            int r2 = r1.d
            int r5 = r1.c
            boolean r6 = r1.f
            if (r6 == 0) goto L_0x0843
            if (r5 > 0) goto L_0x0843
            pwa r0 = r45.f()
            r0.a(r2)
            java.lang.String r0 = "showGroupSummary: skip update, no total count, %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r46}
            defpackage.z68.c(r4, r0, r1)
            goto L_0x09f6
        L_0x0843:
            if (r6 == 0) goto L_0x0849
            java.lang.Integer r6 = r0.j
            if (r6 != 0) goto L_0x084b
        L_0x0849:
            r9 = 0
            goto L_0x08a4
        L_0x084b:
            int r6 = r6.intValue()
            if (r5 != r6) goto L_0x0849
            pwa r6 = r45.f()
            jwa r7 = r45.e()
            r7.getClass()
            jwa r7 = r45.e()
            r7.getClass()
            r9 = 0
            java.util.List r6 = r6.d(r9)
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L_0x0876
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0876
            goto L_0x08a4
        L_0x0876:
            java.util.Iterator r6 = r6.iterator()
        L_0x087a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x08a4
            java.lang.Object r7 = r6.next()
            android.service.notification.StatusBarNotification r7 = (android.service.notification.StatusBarNotification) r7     // Catch:{ all -> 0x089d }
            int r7 = r7.getId()     // Catch:{ all -> 0x089d }
            r8 = 1
            if (r7 != r8) goto L_0x087a
            java.lang.String r1 = "showGroupSummary: skip update, same count"
            defpackage.z68.c(r4, r1, new java.lang.Object[0])
            if (r5 != 0) goto L_0x09f6
            pwa r0 = r45.f()
            r0.a(r2)
            goto L_0x09f6
        L_0x089d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x08a4:
            java.util.Map r6 = r1.a
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x08b8
            pwa r0 = r45.f()
            r0.a(r2)
            defpackage.z68.p(r4, r3)
            goto L_0x09f6
        L_0x08b8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "showGroupSummary: total="
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            defpackage.z68.c(r4, r2, new java.lang.Object[0])
            boolean r2 = r6.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x08eb
            java.util.Collection r2 = r6.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = kotlin.collections.CollectionsKt.first(r2)
            yk2 r2 = (defpackage.yk2) r2
            zk2 r2 = r2.e
            zk2 r3 = defpackage.zk2.a
            if (r2 != r3) goto L_0x08e5
            r2 = 1
            goto L_0x08e6
        L_0x08e5:
            r2 = 0
        L_0x08e6:
            java.lang.String r2 = r0.c(r2)
            goto L_0x0928
        L_0x08eb:
            pwa r2 = r45.f()
            jwa r3 = r45.e()
            r3.getClass()
            android.app.NotificationManager r3 = r2.i
            if (r3 != 0) goto L_0x0909
            android.content.Context r3 = r2.a
            java.lang.String r4 = "notification"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            r2.i = r3
            r2.c()
        L_0x0909:
            android.app.NotificationManager r2 = r2.i
            android.service.notification.StatusBarNotification[] r2 = r2.getActiveNotifications()
            int r3 = r2.length
            r4 = 0
        L_0x0911:
            if (r4 >= r3) goto L_0x0927
            r7 = r2[r4]
            int r8 = r7.getId()
            r10 = 1
            if (r8 != r10) goto L_0x0925
            android.app.Notification r2 = r7.getNotification()
            java.lang.String r2 = r2.getChannelId()
            goto L_0x0928
        L_0x0925:
            int r4 = r4 + r10
            goto L_0x0911
        L_0x0927:
            r2 = r9
        L_0x0928:
            if (r2 != 0) goto L_0x092c
            goto L_0x09f6
        L_0x092c:
            kotlin.jvm.internal.StringCompanionObject r3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            int r3 = defpackage.zjc.tt_new_messages
            java.lang.String[] r4 = defpackage.ghf.c
            android.content.Context r4 = r0.a
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r3 = r4.getQuantityString(r3, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r7 = 1
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r7)
            java.lang.String r3 = java.lang.String.format(r3, r4)
            eda r11 = r0.d(r2)
            cda r2 = new cda
            r2.<init>(r7)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.f = r4
            java.lang.CharSequence r3 = defpackage.eda.c(r3)
            r2.d = r3
            r2.a = r7
            r11.q(r2)
            java.lang.String r2 = r1.e
            r11.r = r2
            r11.s = r7
            r11.A = r7
            r2 = 16
            r3 = 0
            r11.i(r2, r3)
            java.util.Collection r2 = r6.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r3 = r2.iterator()
            boolean r2 = r3.hasNext()
            if (r2 != 0) goto L_0x0988
            r2 = r9
            goto L_0x09ad
        L_0x0988:
            java.lang.Object r2 = r3.next()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L_0x0993
            goto L_0x09ad
        L_0x0993:
            r4 = r2
            yk2 r4 = (defpackage.yk2) r4
            long r6 = r4.m
        L_0x0998:
            java.lang.Object r4 = r3.next()
            r8 = r4
            yk2 r8 = (defpackage.yk2) r8
            long r12 = r8.m
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x09a7
            r2 = r4
            r6 = r12
        L_0x09a7:
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L_0x0998
        L_0x09ad:
            yk2 r2 = (defpackage.yk2) r2
            if (r2 == 0) goto L_0x09bf
            long r2 = r2.m
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r7 = r12 - r2
            java.lang.String r6 = java.lang.String.valueOf(r7)
            goto L_0x09c0
        L_0x09bf:
            r6 = r9
        L_0x09c0:
            r11.t = r6
            r2 = 2
            r11.C = r2
            pwa r10 = r45.f()
            pwa r2 = r45.f()
            r4 = 1
            android.content.Intent r12 = r2.f(r4)
            pwa r2 = r45.f()
            r2.getClass()
            int r3 = ru.ok.tamtam.android.services.NotificationTamService.X
            android.content.Intent r13 = new android.content.Intent
            java.lang.Class<ru.ok.tamtam.android.services.NotificationTamService> r3 = ru.ok.tamtam.android.services.NotificationTamService.class
            android.content.Context r2 = r2.a
            r13.<init>(r2, r3)
            java.lang.String r2 = "ru.ok.tamtam.action.NOTIF_CANCEL"
            r13.setAction(r2)
            int r14 = r1.d
            java.lang.String r15 = r1.g
            r10.k(r11, r12, r13, r14, r15)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.j = r1
        L_0x09f6:
            return
        L_0x09f7:
            monitor-exit(r2)     // Catch:{ all -> 0x07cc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po9.i(fea):void");
    }
}
