package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* renamed from: vcd  reason: default package */
public final class vcd {
    public static final /* synthetic */ int d = 0;
    public final ggd a;
    public final q04 b;
    public final jab c;

    public vcd(ggd ggd, q04 q04, jab jab) {
        this.a = ggd;
        this.b = q04;
        this.c = jab;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00eb, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        defpackage.z68.f("vcd", "onNewResultImpl: failed to save image", r11);
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0125, code lost:
        defpackage.z68.f("vcd", "onNewResultImpl: failed to save image", r11);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0033, B:36:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b6 A[SYNTHETIC, Splitter:B:28:0x00b6] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.vcd r11, java.lang.String r12, boolean r13, boolean r14, kotlin.coroutines.Continuation r15) {
        /*
            r0 = 1
            r1 = 2
            r11.getClass()
            boolean r2 = r15 instanceof defpackage.qcd
            if (r2 == 0) goto L_0x0018
            r2 = r15
            qcd r2 = (defpackage.qcd) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001d
        L_0x0018:
            qcd r2 = new qcd
            r2.<init>(r11, r15)
        L_0x001d:
            java.lang.Object r15 = r2.v
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.x
            java.lang.String r5 = "onNewResultImpl: failed to save image"
            java.lang.String r6 = "vcd"
            r7 = 3
            r8 = 0
            if (r4 == 0) goto L_0x0057
            if (r4 == r0) goto L_0x0048
            if (r4 == r1) goto L_0x0043
            if (r4 != r7) goto L_0x003b
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x0038 }
            goto L_0x0121
        L_0x0038:
            r11 = move-exception
            goto L_0x0125
        L_0x003b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x0038 }
            goto L_0x00d8
        L_0x0048:
            boolean r14 = r2.o
            boolean r13 = r2.c
            qa7 r11 = r2.b
            vcd r12 = r2.a
            kotlin.ResultKt.throwOnFailure(r15)
            r10 = r12
            r12 = r11
            r11 = r10
            goto L_0x00b1
        L_0x0057:
            kotlin.ResultKt.throwOnFailure(r15)
            ggd r15 = r11.a
            me r15 = (defpackage.me) r15
            zs7 r15 = r15.e
            r15.getClass()
            java.lang.String r12 = defpackage.o5a.z(r12)
            qa7 r12 = defpackage.qa7.b(r12)
            if (r12 != 0) goto L_0x0070
        L_0x006d:
            r3 = r8
            goto L_0x012a
        L_0x0070:
            r2.a = r11
            r2.b = r12
            r2.c = r13
            r2.o = r14
            r2.x = r0
            ba7 r15 = defpackage.ld9.B()
            i0 r15 = r15.c(r12)
            lw1 r4 = new lw1
            kotlin.coroutines.Continuation r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r2)
            r4.<init>(r0, r9)
            r4.u()
            kfa r9 = new kfa
            r9.<init>(r4, r0)
            io1 r0 = defpackage.io1.a
            r15.m(r9, r0)
            ek5 r0 = new ek5
            r0.<init>(r15, r1)
            r4.k(r0)
            java.lang.Object r15 = r4.t()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r15 != r0) goto L_0x00ad
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r2)
        L_0x00ad:
            if (r15 != r3) goto L_0x00b1
            goto L_0x012a
        L_0x00b1:
            e69 r15 = (defpackage.e69) r15
            if (r15 != 0) goto L_0x00b6
            goto L_0x006d
        L_0x00b6:
            sqb r0 = new sqb     // Catch:{ all -> 0x0038 }
            r0.<init>(r15)     // Catch:{ all -> 0x0038 }
            kotlin.Lazy r4 = defpackage.i97.d     // Catch:{ all -> 0x0038 }
            h97 r0 = defpackage.ld8.K(r0)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = r0.b     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = "webp"
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.equals(r4, r0, true)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x00db
            r2.a = r8     // Catch:{ all -> 0x0038 }
            r2.b = r8     // Catch:{ all -> 0x0038 }
            r2.x = r1     // Catch:{ all -> 0x0038 }
            java.lang.Object r15 = r11.d(r12, r13, r14, r2)     // Catch:{ all -> 0x0038 }
            if (r15 != r3) goto L_0x00d8
            goto L_0x012a
        L_0x00d8:
            android.net.Uri r15 = (android.net.Uri) r15     // Catch:{ all -> 0x0038 }
            goto L_0x0123
        L_0x00db:
            r2.a = r8     // Catch:{ all -> 0x0038 }
            r2.b = r8     // Catch:{ all -> 0x0038 }
            r2.x = r7     // Catch:{ all -> 0x0038 }
            r11.getClass()     // Catch:{ all -> 0x0038 }
            mqf r12 = new mqf     // Catch:{ all -> 0x00eb }
            if (r13 == 0) goto L_0x00ed
            sq9 r0 = defpackage.sq9.IMAGE_GIF     // Catch:{ all -> 0x00eb }
            goto L_0x00ef
        L_0x00eb:
            r11 = move-exception
            goto L_0x011a
        L_0x00ed:
            sq9 r0 = defpackage.sq9.IMAGE_JPEG     // Catch:{ all -> 0x00eb }
        L_0x00ef:
            if (r14 == 0) goto L_0x010f
            jab r1 = r11.c     // Catch:{ all -> 0x00eb }
            android.content.Context r1 = r1.a     // Catch:{ all -> 0x00eb }
            java.io.File r1 = r1.getCacheDir()     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = r1.getPath()     // Catch:{ all -> 0x00eb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            r2.<init>()     // Catch:{ all -> 0x00eb }
            r2.append(r1)     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = defpackage.jab.b     // Catch:{ all -> 0x00eb }
            r2.append(r1)     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00eb }
            goto L_0x0111
        L_0x010f:
            java.lang.String r1 = android.os.Environment.DIRECTORY_PICTURES     // Catch:{ all -> 0x00eb }
        L_0x0111:
            r12.<init>((defpackage.e69) r15, (defpackage.sq9) r0, (java.lang.String) r1)     // Catch:{ all -> 0x00eb }
            android.net.Uri r11 = r11.c(r12, r13, r14)     // Catch:{ all -> 0x00eb }
            r15 = r11
            goto L_0x011e
        L_0x011a:
            defpackage.z68.f(r6, r5, r11)     // Catch:{ all -> 0x0038 }
            r15 = r8
        L_0x011e:
            if (r15 != r3) goto L_0x0121
            goto L_0x012a
        L_0x0121:
            android.net.Uri r15 = (android.net.Uri) r15     // Catch:{ all -> 0x0038 }
        L_0x0123:
            r3 = r15
            goto L_0x012a
        L_0x0125:
            defpackage.z68.f(r6, r5, r11)
            goto L_0x006d
        L_0x012a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vcd.a(vcd, java.lang.String, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.rcd
            if (r0 == 0) goto L_0x0013
            r0 = r14
            rcd r0 = (defpackage.rcd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            rcd r0 = new rcd
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r10) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0051
        L_0x002a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r14)
            r0.c = r10
            caa r14 = defpackage.caa.a
            q04 r2 = r11.b
            kotlin.coroutines.CoroutineContext r14 = r14.plus(r2)
            tcd r2 = new tcd
            r8 = 0
            r3 = r2
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r14 = defpackage.ev0.I(r14, r2, r0)
            if (r14 != r1) goto L_0x0051
            return r1
        L_0x0051:
            if (r14 == 0) goto L_0x0054
            r9 = r10
        L_0x0054:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vcd.b(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Uri c(hgd hgd, boolean z, boolean z2) {
        ggd ggd = this.a;
        if (z2) {
            String b2 = ggd.b(z);
            jab jab = ((me) ggd).c;
            StringBuilder o = tr1.o(jab.a.getCacheDir().getPath());
            o.append(jab.b);
            String sb = o.toString();
            try {
                File file = new File(sb);
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (IOException e) {
                z68.h("PathHelper", e, g63.j("Failed to create dir=", sb, " due to: ", e.getMessage()), new Object[0]);
            }
            File file2 = new File(sb, b2);
            hgd.m(file2);
            Context context = jab.a;
            String packageName = context.getPackageName();
            return FileProvider.d(context, file2, packageName + ".provider");
        }
        return ((me) ggd).d(hgd, ggd.b(z));
    }

    public final Object d(qa7 qa7, boolean z, boolean z2, qcd qcd) {
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(qcd));
        lw1.u();
        try {
            i0 a2 = ld9.B().a(qa7, (Object) null);
            a2.m(new ucd(a2, lw1, this, z2, z), io1.a);
        } catch (Throwable th) {
            z68.f("vcd", "onNewResultImpl: failed to save image", th);
            lw1.resumeWith(Result.m23constructorimpl((Object) null));
        }
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(qcd);
        }
        return t;
    }
}
