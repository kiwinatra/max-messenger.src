package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import one.me.sdk.transfer.exceptions.TamHttpErrorException;
import one.me.sdk.transfer.exceptions.TamHttpUrlExpiredException;

/* renamed from: tyf  reason: default package */
public final class tyf {
    public static final f19 h = ct.l("application/octet-stream");
    public final long a;
    public final myf b;
    public final String c = tyf.class.getName();
    public final Lazy d;
    public final a0a e;
    public final oz9 f;
    public final long g;

    static {
        Pattern pattern = f19.d;
    }

    public tyf(Lazy lazy, yqf yqf, long j, myf myf) {
        this.a = j;
        this.b = myf;
        this.d = lazy;
        this.e = cvg.a();
        this.f = new oz9();
        int i = mh3.$EnumSwitchMapping$0[yqf.c().ordinal()];
        this.g = (i == 1 || i == 2) ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE : i != 3 ? PlaybackStateCompat.ACTION_PREPARE : PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050 A[Catch:{ all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[Catch:{ all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.oyf
            if (r0 == 0) goto L_0x0013
            r0 = r5
            oyf r0 = (defpackage.oyf) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            oyf r0 = new oyf
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            a0a r4 = r0.b
            tyf r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r5)
            r5 = r4
            r4 = r0
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.a = r4
            a0a r5 = r4.e
            r0.b = r5
            r0.v = r3
            java.lang.Object r0 = r5.d(r0)
            if (r0 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r0 = 0
            myf r1 = r4.b     // Catch:{ all -> 0x0055 }
            myf r2 = defpackage.myf.c     // Catch:{ all -> 0x0055 }
            if (r1 != r2) goto L_0x0057
            cxf r4 = r4.b()     // Catch:{ all -> 0x0055 }
            goto L_0x005b
        L_0x0055:
            r4 = move-exception
            goto L_0x005f
        L_0x0057:
            cxf r4 = r4.c()     // Catch:{ all -> 0x0055 }
        L_0x005b:
            r5.e(r0)
            return r4
        L_0x005f:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyf.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final cxf b() {
        long j;
        oz9 oz9 = this.f;
        boolean z = oz9.b == 0;
        long j2 = this.a;
        long j3 = this.g;
        if (z) {
            cxf cxf = new cxf(0, Math.min(j3, j2));
            oz9.c(cxf);
            return cxf;
        }
        int i = 0;
        for (int i2 = 1; i < oz9.b - i2; i2 = 1) {
            cxf cxf2 = (cxf) oz9.a(i);
            int i3 = i + 1;
            cxf cxf3 = (cxf) oz9.a(i3);
            long j4 = cxf2.b;
            if (j4 == cxf2.c && cxf3.b == cxf3.c && cxf2.a + j4 == cxf3.a) {
                oz9.d(i3);
                oz9.d(i);
                long j5 = j4 + cxf3.b;
                oz9.b(i, new cxf(cxf2.a, j5, j5));
            } else {
                i = i3;
            }
        }
        int i4 = 0;
        while (true) {
            cxf cxf4 = null;
            if (i4 >= oz9.b) {
                return null;
            }
            cxf cxf5 = (cxf) oz9.a(i4);
            if (i4 != oz9.b - 1) {
                cxf4 = (cxf) oz9.a(i4 + 1);
            }
            long j6 = cxf5.a + cxf5.b;
            if (cxf4 == null) {
                if (j6 < j2) {
                    j = Math.min(j3, j2 - j6);
                }
                j = -1;
            } else {
                long j7 = cxf4.a;
                if (j6 < j7) {
                    j = Math.min(j3, j7 - j6);
                }
                j = -1;
            }
            if (j > 0) {
                cxf cxf6 = new cxf(j6, j);
                oz9.b(i4 + 1, cxf6);
                return cxf6;
            }
            i4++;
        }
    }

    public final cxf c() {
        oz9 oz9 = this.f;
        int i = oz9.b;
        long j = this.a;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                return null;
            }
            if (i != 0) {
                z = false;
            }
            if (!z) {
                long j2 = ((cxf) oz9.a[0]).b;
                if (j2 == j) {
                    return null;
                }
                cxf cxf = new cxf(j2, j - j2);
                oz9.c(cxf);
                return cxf;
            }
            throw new NoSuchElementException("ObjectList is empty.");
        }
        cxf cxf2 = new cxf(0, j);
        oz9.c(cxf2);
        return cxf2;
    }

    public final void d(k4d k4d) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            String b2 = k4d.w.b("X-Reason");
            if (b2 == null) {
                b2 = null;
            }
            obj = Result.m23constructorimpl(b2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m29isFailureimpl(obj)) {
            obj = null;
        }
        u47 A = b59.A(k4d.o, (String) obj);
        boolean isSuccessful = k4d.isSuccessful();
        String str = this.c;
        if (isSuccessful || Intrinsics.areEqual((Object) A, (Object) b59.b) || Intrinsics.areEqual((Object) A, (Object) b59.c)) {
            z68.p(str, "getErrorUploadPositionFromResponse not loaded yet, starting upload from 0");
        } else if (Intrinsics.areEqual((Object) A, (Object) b59.g) || Intrinsics.areEqual((Object) A, (Object) b59.e)) {
            z68.p(str, "getErrorUploadPositionFromResponse forbidden or bad request: error=" + A);
            throw new TamHttpUrlExpiredException();
        } else {
            z68.f(str, "getErrorUploadPositionFromResponse error=" + A, (Throwable) null);
            throw new TamHttpErrorException("Failed receiving upload status", A);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.m57 r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.pyf
            if (r0 == 0) goto L_0x0013
            r0 = r14
            pyf r0 = (defpackage.pyf) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            pyf r0 = new pyf
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            tyf r12 = r0.a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00c8
        L_0x002d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r14)
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 20
            r2.<init>(r5)
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            if (r5 != 0) goto L_0x0054
            r14.remove(r6)
            goto L_0x0066
        L_0x0054:
            boolean r7 = r14.isEmpty()
            if (r7 == 0) goto L_0x005f
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
        L_0x005f:
            java.lang.Object r5 = r6.cast(r5)
            r14.put(r6, r5)
        L_0x0066:
            java.lang.String r5 = "x-uploading-mode"
            defpackage.ct.e(r5)
            java.lang.String r6 = "parallel"
            defpackage.ct.g(r6, r5)
            r2.add(r5)
            java.lang.CharSequence r5 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r6)
            java.lang.String r5 = r5.toString()
            r2.add(r5)
            if (r13 == 0) goto L_0x0184
            lx6 r9 = new lx6
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r5)
            if (r2 == 0) goto L_0x017c
            java.lang.String[] r2 = (java.lang.String[]) r2
            r9.<init>(r2)
            byte[] r2 = defpackage.u0g.a
            boolean r2 = r14.isEmpty()
            if (r2 == 0) goto L_0x009d
            java.util.Map r14 = kotlin.collections.MapsKt.emptyMap()
        L_0x009b:
            r11 = r14
            goto L_0x00a7
        L_0x009d:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r14)
            java.util.Map r14 = java.util.Collections.unmodifiableMap(r2)
            goto L_0x009b
        L_0x00a7:
            y2d r14 = new y2d
            java.lang.String r8 = "GET"
            r10 = 0
            r6 = r14
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            kotlin.Lazy r13 = r12.d
            java.lang.Object r13 = r13.getValue()
            rla r13 = (defpackage.rla) r13
            jtc r13 = r13.b(r14)
            r0.a = r12
            r0.o = r4
            java.lang.Object r14 = defpackage.vzg.c(r13, r0)
            if (r14 != r1) goto L_0x00c8
            return r1
        L_0x00c8:
            k4d r14 = (defpackage.k4d) r14
            lx6 r13 = r14.w
            java.lang.String r0 = "Range"
            java.lang.String r13 = r13.b(r0)
            if (r13 == 0) goto L_0x0171
            int r0 = r13.length()
            if (r0 != 0) goto L_0x00dc
            goto L_0x0171
        L_0x00dc:
            java.lang.String r14 = r12.c
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x00e3
            goto L_0x00f5
        L_0x00e3:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x00f5
            w78 r1 = defpackage.w78.o
            java.lang.String r2 = "initChunksForFile: got headers from server = "
            java.lang.String r2 = r2.concat(r13)
            r5 = 0
            r0.d(r1, r14, r2, r5)
        L_0x00f5:
            java.lang.String r14 = ","
            java.lang.String[] r14 = new java.lang.String[]{r14}
            r0 = 6
            java.util.List r13 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r13, (java.lang.String[]) r14, (boolean) r3, 0, (int) r0, (java.lang.Object) null)
            java.util.Iterator r13 = r13.iterator()
        L_0x0104:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0179
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            int r1 = r14.length()
            if (r1 != 0) goto L_0x0117
            goto L_0x0104
        L_0x0117:
            java.lang.String r1 = "/"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.List r14 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r14, (java.lang.String[]) r1, (boolean) r3, 0, (int) r0, (java.lang.Object) null)
            int r1 = r14.size()
            r2 = 2
            if (r1 != r2) goto L_0x0104
            java.lang.Object r1 = r14.get(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0135
            goto L_0x0104
        L_0x0135:
            java.lang.Object r14 = r14.get(r3)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.String r1 = "-"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.List r14 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r14, (java.lang.String[]) r1, (boolean) r3, 0, (int) r0, (java.lang.Object) null)
            int r1 = r14.size()
            if (r1 != r2) goto L_0x0104
            java.lang.Object r1 = r14.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            long r6 = java.lang.Long.parseLong(r1)
            java.lang.Object r14 = r14.get(r4)
            java.lang.String r14 = (java.lang.String) r14
            long r1 = java.lang.Long.parseLong(r14)
            long r1 = r1 - r6
            r8 = 1
            long r10 = r1 + r8
            cxf r14 = new cxf
            r5 = r14
            r8 = r10
            r5.<init>(r6, r8, r10)
            oz9 r1 = r12.f
            r1.c(r14)
            goto L_0x0104
        L_0x0171:
            r12.d(r14)
            r12 = 0
            kotlin.coroutines.jvm.internal.Boxing.boxLong(r12)
        L_0x0179:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x017c:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r13 = "null cannot be cast to non-null type kotlin.Array<T>"
            r12.<init>(r13)
            throw r12
        L_0x0184:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "url == null"
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyf.e(m57, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(defpackage.m57 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.qyf
            if (r0 == 0) goto L_0x0013
            r0 = r6
            qyf r0 = (defpackage.qyf) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            qyf r0 = new qyf
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            tyf r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x006e
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r6)
            hr6 r6 = new hr6
            r6.<init>()
            r6.a = r5
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            r6.A(r5)
            fo5 r5 = new fo5
            r2 = 1
            r5.<init>(r2)
            java.lang.String r2 = "POST"
            r6.r(r2, r5)
            y2d r5 = r6.c()
            kotlin.Lazy r6 = r4.d
            java.lang.Object r6 = r6.getValue()
            rla r6 = (defpackage.rla) r6
            jtc r5 = r6.b(r5)
            r0.a = r4
            r0.o = r3
            java.lang.Object r6 = defpackage.vzg.c(r5, r0)
            if (r6 != r1) goto L_0x006e
            return r1
        L_0x006e:
            k4d r6 = (defpackage.k4d) r6
            boolean r5 = r6.isSuccessful()
            r0 = 0
            if (r5 == 0) goto L_0x0097
            r4.getClass()
            lx6 r5 = r6.w
            java.lang.String r6 = "X-Last-Known-Byte"
            java.lang.String r5 = r5.b(r6)
            if (r5 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r5 = 0
        L_0x0087:
            if (r5 == 0) goto L_0x009a
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0091 }
            r2 = 1
            long r5 = r5 + r2
            goto L_0x009b
        L_0x0091:
            one.me.sdk.transfer.exceptions.TamHttpUrlExpiredException r4 = new one.me.sdk.transfer.exceptions.TamHttpUrlExpiredException
            r4.<init>()
            throw r4
        L_0x0097:
            r4.d(r6)
        L_0x009a:
            r5 = r0
        L_0x009b:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00a9
            oz9 r4 = r4.f
            cxf r2 = new cxf
            r2.<init>(r0, r5)
            r4.c(r2)
        L_0x00a9:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyf.f(m57, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083 A[Catch:{ IOException -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0 A[Catch:{ IOException -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b5 A[Catch:{ all -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b6 A[Catch:{ all -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(defpackage.m57 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            java.lang.String r0 = "requestInitialChunks: for type="
            boolean r1 = r12 instanceof defpackage.ryf
            if (r1 == 0) goto L_0x0015
            r1 = r12
            ryf r1 = (defpackage.ryf) r1
            int r2 = r1.w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.w = r2
            goto L_0x001a
        L_0x0015:
            ryf r1 = new ryf
            r1.<init>(r10, r12)
        L_0x001a:
            java.lang.Object r12 = r1.o
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.w
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x005b
            if (r3 == r7) goto L_0x004d
            if (r3 == r6) goto L_0x0046
            if (r3 != r5) goto L_0x003e
            java.lang.Object r10 = r1.b
            xz9 r10 = (defpackage.xz9) r10
            tyf r11 = r1.a
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ IOException -> 0x003b }
            goto L_0x0097
        L_0x0038:
            r11 = move-exception
            goto L_0x00fc
        L_0x003b:
            r11 = move-exception
            goto L_0x00df
        L_0x003e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0046:
            java.lang.Object r10 = r1.b
            xz9 r10 = (defpackage.xz9) r10
            tyf r11 = r1.a
            goto L_0x0034
        L_0x004d:
            a0a r10 = r1.c
            java.lang.Object r11 = r1.b
            m57 r11 = (defpackage.m57) r11
            tyf r3 = r1.a
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r10
            r10 = r3
            goto L_0x006f
        L_0x005b:
            kotlin.ResultKt.throwOnFailure(r12)
            a0a r12 = r10.e
            r1.a = r10
            r1.b = r11
            r1.c = r12
            r1.w = r7
            java.lang.Object r3 = r12.d(r1)
            if (r3 != r2) goto L_0x006f
            return r2
        L_0x006f:
            oz9 r3 = r10.f     // Catch:{ all -> 0x009a }
            java.lang.Object[] r7 = r3.a     // Catch:{ all -> 0x00fa }
            int r8 = r3.b     // Catch:{ all -> 0x00fa }
            r9 = 0
            kotlin.collections.ArraysKt___ArraysJvmKt.fill((T[]) r7, r4, (int) r9, (int) r8)     // Catch:{ all -> 0x00fa }
            r3.b = r9     // Catch:{ all -> 0x00fa }
            myf r3 = r10.b     // Catch:{ IOException -> 0x009d }
            int r3 = r3.ordinal()     // Catch:{ IOException -> 0x009d }
            if (r3 == 0) goto L_0x00a0
            r6 = 4
            if (r3 == r6) goto L_0x00af
            r1.a = r10     // Catch:{ IOException -> 0x009d }
            r1.b = r12     // Catch:{ IOException -> 0x009d }
            r1.c = r4     // Catch:{ IOException -> 0x009d }
            r1.w = r5     // Catch:{ IOException -> 0x009d }
            java.lang.Object r11 = r10.e(r11, r1)     // Catch:{ IOException -> 0x009d }
            if (r11 != r2) goto L_0x0095
            return r2
        L_0x0095:
            r11 = r10
            r10 = r12
        L_0x0097:
            r12 = r10
            r10 = r11
            goto L_0x00af
        L_0x009a:
            r11 = move-exception
        L_0x009b:
            r10 = r12
            goto L_0x00fc
        L_0x009d:
            r11 = move-exception
            r10 = r12
            goto L_0x00df
        L_0x00a0:
            r1.a = r10     // Catch:{ IOException -> 0x009d }
            r1.b = r12     // Catch:{ IOException -> 0x009d }
            r1.c = r4     // Catch:{ IOException -> 0x009d }
            r1.w = r6     // Catch:{ IOException -> 0x009d }
            java.lang.Object r11 = r10.f(r11, r1)     // Catch:{ IOException -> 0x009d }
            if (r11 != r2) goto L_0x0095
            return r2
        L_0x00af:
            java.lang.String r11 = r10.c     // Catch:{ all -> 0x009a }
            a67 r1 = defpackage.z68.b     // Catch:{ all -> 0x009a }
            if (r1 != 0) goto L_0x00b6
            goto L_0x00d7
        L_0x00b6:
            boolean r2 = r1.c()     // Catch:{ all -> 0x009a }
            if (r2 == 0) goto L_0x00d7
            w78 r2 = defpackage.w78.o     // Catch:{ all -> 0x009a }
            myf r3 = r10.b     // Catch:{ all -> 0x009a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r5.<init>(r0)     // Catch:{ all -> 0x009a }
            r5.append(r3)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = " chunks are="
            r5.append(r0)     // Catch:{ all -> 0x009a }
            r5.append(r10)     // Catch:{ all -> 0x009a }
            java.lang.String r10 = r5.toString()     // Catch:{ all -> 0x009a }
            r1.d(r2, r11, r10, r4)     // Catch:{ all -> 0x009a }
        L_0x00d7:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x009a }
            a0a r12 = (defpackage.a0a) r12
            r12.e(r4)
            return r10
        L_0x00df:
            one.me.sdk.transfer.exceptions.TamHttpErrorException r12 = new one.me.sdk.transfer.exceptions.TamHttpErrorException     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "Failed during retrieving upload position"
            u47 r1 = defpackage.b59.l     // Catch:{ all -> 0x0038 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0038 }
            if (r11 != 0) goto L_0x00ec
            goto L_0x00f4
        L_0x00ec:
            u47 r1 = new u47     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "UNKNOWN_ERROR"
            r3 = -1
            r1.<init>(r3, r2, r11)     // Catch:{ all -> 0x0038 }
        L_0x00f4:
            r12.<init>(r0, r1)     // Catch:{ all -> 0x0038 }
            throw r12     // Catch:{ all -> 0x0038 }
        L_0x00f8:
            r11 = r10
            goto L_0x009b
        L_0x00fa:
            r10 = move-exception
            goto L_0x00f8
        L_0x00fc:
            a0a r10 = (defpackage.a0a) r10
            r10.e(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyf.g(m57, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[Catch:{ all -> 0x005f }, LOOP:0: B:18:0x0053->B:19:0x0055, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.syf
            if (r0 == 0) goto L_0x0013
            r0 = r8
            syf r0 = (defpackage.syf) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            syf r0 = new syf
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            a0a r7 = r0.b
            tyf r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            r7 = r0
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.a = r7
            a0a r8 = r7.e
            r0.b = r8
            r0.v = r3
            java.lang.Object r0 = r8.d(r0)
            if (r0 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r0 = 0
            oz9 r7 = r7.f     // Catch:{ all -> 0x005f }
            java.lang.Object[] r1 = r7.a     // Catch:{ all -> 0x005f }
            int r7 = r7.b     // Catch:{ all -> 0x005f }
            r2 = 0
            r4 = 0
        L_0x0053:
            if (r4 >= r7) goto L_0x0061
            r5 = r1[r4]     // Catch:{ all -> 0x005f }
            cxf r5 = (defpackage.cxf) r5     // Catch:{ all -> 0x005f }
            long r5 = r5.c     // Catch:{ all -> 0x005f }
            long r2 = r2 + r5
            int r4 = r4 + 1
            goto L_0x0053
        L_0x005f:
            r7 = move-exception
            goto L_0x0069
        L_0x0061:
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r2)     // Catch:{ all -> 0x005f }
            r8.e(r0)
            return r7
        L_0x0069:
            r8.e(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyf.h(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String toString() {
        StringBuilder o = tr1.o("(");
        oz9 oz9 = this.f;
        Object[] objArr = oz9.a;
        int i = oz9.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxf cxf = (cxf) objArr[i2];
            if (o.length() > 1) {
                o.append(",");
            }
            o.append(cxf.a);
            o.append("-");
            o.append((cxf.a + cxf.b) - 1);
        }
        o.append(")");
        return o.toString();
    }
}
