package defpackage;

import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: ee4  reason: default package */
public final class ee4 implements mt4 {
    public static final SparseArray c;
    public final hx0 a;
    public final Executor b;

    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, b(w54.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, b(k07.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, b(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        c = sparseArray;
    }

    public ee4(hx0 hx0, ExecutorService executorService) {
        this.a = hx0;
        executorService.getClass();
        this.b = executorService;
    }

    public static Constructor b(Class cls) {
        try {
            return cls.asSubclass(lt4.class).getConstructor(new Class[]{ir8.class, hx0.class, Executor.class});
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Downloader constructor missing", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: qq8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: sq8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: qq8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: sq8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.lt4 a(defpackage.ht4 r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            android.net.Uri r2 = r1.b
            java.lang.String r3 = r1.c
            int r2 = defpackage.v0g.J(r2, r3)
            java.util.concurrent.Executor r3 = r0.b
            hx0 r0 = r0.a
            r4 = 0
            r5 = 1
            r6 = 0
            android.net.Uri r8 = r1.b
            if (r2 == 0) goto L_0x009b
            if (r2 == r5) goto L_0x009b
            r7 = 2
            if (r2 == r7) goto L_0x009b
            r7 = 4
            if (r2 != r7) goto L_0x008f
            r7c r2 = new r7c
            oq8 r15 = new oq8
            r15.<init>()
            gc4 r7 = new gc4
            r7.<init>()
            java.util.List r12 = java.util.Collections.emptyList()
            k0d r14 = defpackage.k0d.v
            uq8 r13 = new uq8
            r13.<init>()
            ar8 r22 = defpackage.ar8.d
            java.lang.Object r9 = r7.e
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto L_0x0044
            java.lang.Object r9 = r7.d
            java.util.UUID r9 = (java.util.UUID) r9
            if (r9 == 0) goto L_0x0045
        L_0x0044:
            r4 = r5
        L_0x0045:
            defpackage.n79.n(r4)
            if (r8 == 0) goto L_0x006e
            xq8 r4 = new xq8
            java.lang.Object r5 = r7.d
            java.util.UUID r5 = (java.util.UUID) r5
            if (r5 == 0) goto L_0x0057
            tq8 r6 = new tq8
            r6.<init>(r7)
        L_0x0057:
            r10 = r6
            r5 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            r11 = 0
            java.lang.String r1 = r1.w
            r7 = r4
            r6 = r13
            r13 = r1
            r1 = r15
            r15 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r19 = r4
            r4 = r6
            goto L_0x0072
        L_0x006e:
            r4 = r13
            r1 = r15
            r19 = r6
        L_0x0072:
            ir8 r5 = new ir8
            sq8 r6 = new sq8
            r6.<init>(r1)
            wq8 r1 = new wq8
            r1.<init>(r4)
            us8 r21 = defpackage.us8.J
            java.lang.String r17 = ""
            r16 = r5
            r18 = r6
            r20 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2.<init>(r5, r0, r3)
            return r2
        L_0x008f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported type: "
            java.lang.String r1 = defpackage.wj6.h(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x009b:
            android.util.SparseArray r7 = c
            java.lang.Object r7 = r7.get(r2)
            r15 = r7
            java.lang.reflect.Constructor r15 = (java.lang.reflect.Constructor) r15
            if (r15 == 0) goto L_0x014b
            oq8 r14 = new oq8
            r14.<init>()
            gc4 r7 = new gc4
            r7.<init>()
            java.util.Collections.emptyList()
            k0d r16 = defpackage.k0d.v
            uq8 r13 = new uq8
            r13.<init>()
            ar8 r23 = defpackage.ar8.d
            java.util.List r9 = r1.o
            if (r9 == 0) goto L_0x00d1
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L_0x00d1
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r9)
            java.util.List r9 = java.util.Collections.unmodifiableList(r10)
        L_0x00cf:
            r12 = r9
            goto L_0x00d6
        L_0x00d1:
            java.util.List r9 = java.util.Collections.emptyList()
            goto L_0x00cf
        L_0x00d6:
            java.lang.Object r9 = r7.e
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto L_0x00e2
            java.lang.Object r9 = r7.d
            java.util.UUID r9 = (java.util.UUID) r9
            if (r9 == 0) goto L_0x00e3
        L_0x00e2:
            r4 = r5
        L_0x00e3:
            defpackage.n79.n(r4)
            if (r8 == 0) goto L_0x0112
            xq8 r4 = new xq8
            java.lang.Object r5 = r7.d
            java.util.UUID r5 = (java.util.UUID) r5
            if (r5 == 0) goto L_0x00f5
            tq8 r6 = new tq8
            r6.<init>(r7)
        L_0x00f5:
            r10 = r6
            r11 = 0
            java.lang.String r1 = r1.w
            r9 = 0
            r5 = 0
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r4
            r6 = r13
            r13 = r1
            r1 = r14
            r14 = r16
            r24 = r15
            r15 = r5
            r16 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r20 = r4
            r4 = r6
            goto L_0x0118
        L_0x0112:
            r4 = r13
            r1 = r14
            r24 = r15
            r20 = r6
        L_0x0118:
            ir8 r5 = new ir8
            sq8 r6 = new sq8
            r6.<init>(r1)
            wq8 r1 = new wq8
            r1.<init>(r4)
            us8 r22 = defpackage.us8.J
            java.lang.String r18 = ""
            r17 = r5
            r19 = r6
            r21 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23)
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0, r3}     // Catch:{ Exception -> 0x013e }
            r7 = r24
            java.lang.Object r0 = r7.newInstance(r0)     // Catch:{ Exception -> 0x013e }
            lt4 r0 = (defpackage.lt4) r0     // Catch:{ Exception -> 0x013e }
            return r0
        L_0x013e:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r3 = "Failed to instantiate downloader for content type "
            java.lang.String r2 = defpackage.wj6.h(r2, r3)
            r1.<init>(r2, r0)
            throw r1
        L_0x014b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module missing for content type "
            java.lang.String r1 = defpackage.wj6.h(r2, r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee4.a(ht4):lt4");
    }
}
