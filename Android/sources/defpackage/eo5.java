package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: eo5  reason: default package */
public final class eo5 implements yn1 {
    public final /* synthetic */ go5 X;
    public final /* synthetic */ jo5 Y;
    public final /* synthetic */ y2d a;
    public final /* synthetic */ z47 b;
    public final /* synthetic */ pwd c;
    public final /* synthetic */ File o;
    public final /* synthetic */ AtomicBoolean v;
    public final /* synthetic */ String w;
    public final /* synthetic */ m57 x;
    public final /* synthetic */ f19 y;
    public final /* synthetic */ int z;

    public eo5(jo5 jo5, y2d y2d, k57 k57, pwd pwd, File file, AtomicBoolean atomicBoolean, String str, m57 m57, f19 f19, int i, go5 go5) {
        this.Y = jo5;
        this.a = y2d;
        this.b = k57;
        this.c = pwd;
        this.o = file;
        this.v = atomicBoolean;
        this.w = str;
        this.x = m57;
        this.y = f19;
        this.z = i;
        this.X = go5;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, pwd] */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:14|15|16|17|(1:19)|20|21|(2:23|(1:25)(2:26|(1:29)(2:30|(1:54)(2:34|(2:36|111)(1:53)))))|27|(0)(0)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x007f */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1 A[Catch:{ all -> 0x0042, all -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af A[Catch:{ all -> 0x0042, all -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bd A[Catch:{ all -> 0x0042, all -> 0x014b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.jtc r13, defpackage.k4d r14) {
        /*
            r12 = this;
            java.lang.String r13 = "error uploading, e: "
            ptc r0 = r14.x
            boolean r1 = r14.isSuccessful()     // Catch:{ all -> 0x0042 }
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0045
            if (r0 == 0) goto L_0x0045
            jo5 r13 = r12.Y     // Catch:{ all -> 0x0042 }
            z47 r14 = r12.b     // Catch:{ all -> 0x0042 }
            java.io.File r1 = r12.o     // Catch:{ all -> 0x0042 }
            r13.getClass()     // Catch:{ all -> 0x0042 }
            if (r14 == 0) goto L_0x0039
            java.lang.String r6 = r0.V()     // Catch:{ all -> 0x0042 }
            long r7 = r1.length()     // Catch:{ all -> 0x0042 }
            k57 r14 = (defpackage.k57) r14     // Catch:{ all -> 0x0042 }
            java.util.concurrent.atomic.AtomicBoolean r13 = r14.y     // Catch:{ all -> 0x0042 }
            boolean r13 = r13.get()     // Catch:{ all -> 0x0042 }
            if (r13 == 0) goto L_0x002c
            goto L_0x0039
        L_0x002c:
            ca2 r13 = new ca2     // Catch:{ all -> 0x0042 }
            r9 = 2
            r4 = r13
            r5 = r14
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (long) r7, (int) r9)     // Catch:{ all -> 0x0042 }
            jfd r14 = r14.w     // Catch:{ all -> 0x0042 }
            r14.a(r13)     // Catch:{ all -> 0x0042 }
        L_0x0039:
            jo5 r13 = r12.Y     // Catch:{ all -> 0x0042 }
            pwd r12 = r12.c     // Catch:{ all -> 0x0042 }
            defpackage.jo5.a(r13, r12, r3, r2)     // Catch:{ all -> 0x0042 }
            goto L_0x013f
        L_0x0042:
            r12 = move-exception
            goto L_0x0145
        L_0x0045:
            jo5 r1 = r12.Y     // Catch:{ all -> 0x0042 }
            yqf r1 = r1.c     // Catch:{ all -> 0x0042 }
            int r4 = r14.o     // Catch:{ all -> 0x0042 }
            kotlin.Lazy r1 = r1.a     // Catch:{ all -> 0x0042 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0042 }
            nd r1 = (defpackage.nd) r1     // Catch:{ all -> 0x0042 }
            r1.getClass()     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = "HTTP_ERROR"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0042 }
            r1.f(r5, r4)     // Catch:{ all -> 0x0042 }
            jo5 r1 = r12.Y     // Catch:{ all -> 0x0042 }
            pwd r4 = r12.c     // Catch:{ all -> 0x0042 }
            int r5 = r14.o     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0042 }
            r6 = 1
            defpackage.jo5.a(r1, r4, r6, r5)     // Catch:{ all -> 0x0042 }
            int r1 = r14.o     // Catch:{ all -> 0x0042 }
            jo5 r4 = r12.Y     // Catch:{ all -> 0x0042 }
            r4.getClass()     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "X-Reason"
            lx6 r5 = r14.w     // Catch:{ Exception -> 0x007f }
            java.lang.String r4 = r5.b(r4)     // Catch:{ Exception -> 0x007f }
            if (r4 == 0) goto L_0x007f
            r2 = r4
        L_0x007f:
            u47 r1 = defpackage.b59.A(r1, r2)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "jo5"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r4.<init>(r13)     // Catch:{ all -> 0x0042 }
            r4.append(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r13 = r4.toString()     // Catch:{ all -> 0x0042 }
            defpackage.z68.c(r2, r13, new java.lang.Object[0])     // Catch:{ all -> 0x0042 }
            jo5 r13 = r12.Y     // Catch:{ all -> 0x0042 }
            r13.getClass()     // Catch:{ all -> 0x0042 }
            u47 r13 = defpackage.b59.g     // Catch:{ all -> 0x0042 }
            boolean r13 = r13.equals(r1)     // Catch:{ all -> 0x0042 }
            if (r13 != 0) goto L_0x00ac
            u47 r13 = defpackage.b59.e     // Catch:{ all -> 0x0042 }
            boolean r13 = r13.equals(r1)     // Catch:{ all -> 0x0042 }
            if (r13 == 0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            r13 = r3
            goto L_0x00ad
        L_0x00ac:
            r13 = r6
        L_0x00ad:
            if (r13 == 0) goto L_0x00bd
            jo5 r13 = r12.Y     // Catch:{ all -> 0x0042 }
            z47 r12 = r12.b     // Catch:{ all -> 0x0042 }
            k57 r12 = (defpackage.k57) r12     // Catch:{ all -> 0x0042 }
            r13.getClass()     // Catch:{ all -> 0x0042 }
            defpackage.jo5.f(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x013f
        L_0x00bd:
            u47 r13 = defpackage.b59.c     // Catch:{ all -> 0x0042 }
            boolean r13 = r13.equals(r1)     // Catch:{ all -> 0x0042 }
            if (r13 == 0) goto L_0x0131
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.v     // Catch:{ all -> 0x0042 }
            boolean r13 = r13.compareAndSet(r3, r6)     // Catch:{ all -> 0x0042 }
            if (r13 == 0) goto L_0x0131
            long r7 = defpackage.jo5.e(r14)     // Catch:{ all -> 0x0042 }
            r13 = 0
            int r13 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x0122
            jo5 r13 = r12.Y     // Catch:{ all -> 0x0042 }
            pwd r14 = r12.c     // Catch:{ all -> 0x0042 }
            java.lang.String r14 = r14.a     // Catch:{ all -> 0x0042 }
            pwd r9 = new pwd     // Catch:{ all -> 0x0042 }
            r9.<init>()     // Catch:{ all -> 0x0042 }
            yqf r13 = r13.c     // Catch:{ all -> 0x0042 }
            long r1 = r13.b()     // Catch:{ all -> 0x0042 }
            r9.f = r1     // Catch:{ all -> 0x0042 }
            r9.a = r14     // Catch:{ all -> 0x0042 }
            jo5 r2 = r12.Y     // Catch:{ all -> 0x0042 }
            java.io.File r3 = r12.o     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = r12.w     // Catch:{ all -> 0x0042 }
            m57 r5 = r12.x     // Catch:{ all -> 0x0042 }
            f19 r6 = r12.y     // Catch:{ all -> 0x0042 }
            z47 r13 = r12.b     // Catch:{ all -> 0x0042 }
            int r11 = r12.z     // Catch:{ all -> 0x0042 }
            r10 = r13
            k57 r10 = (defpackage.k57) r10     // Catch:{ all -> 0x0042 }
            y2d r13 = r2.b(r3, r4, r5, r6, r7, r9, r10, r11)     // Catch:{ all -> 0x0042 }
            jo5 r14 = r12.Y     // Catch:{ all -> 0x0042 }
            kotlin.Lazy r14 = r14.b     // Catch:{ all -> 0x0042 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ all -> 0x0042 }
            rla r14 = (defpackage.rla) r14     // Catch:{ all -> 0x0042 }
            jtc r13 = r14.b(r13)     // Catch:{ all -> 0x0042 }
            go5 r14 = r12.X     // Catch:{ all -> 0x0042 }
            monitor-enter(r14)     // Catch:{ all -> 0x0042 }
            boolean r1 = r14.b     // Catch:{ all -> 0x011f }
            if (r1 == 0) goto L_0x0118
            monitor-exit(r14)     // Catch:{ all -> 0x0042 }
            goto L_0x013f
        L_0x0118:
            r14.a = r13     // Catch:{ all -> 0x011f }
            monitor-exit(r14)     // Catch:{ all -> 0x0042 }
            r13.f(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x013f
        L_0x011f:
            r12 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x011f }
            throw r12     // Catch:{ all -> 0x0042 }
        L_0x0122:
            jo5 r13 = r12.Y     // Catch:{ all -> 0x0042 }
            z47 r12 = r12.b     // Catch:{ all -> 0x0042 }
            k57 r12 = (defpackage.k57) r12     // Catch:{ all -> 0x0042 }
            r13.getClass()     // Catch:{ all -> 0x0042 }
            java.lang.String r13 = "upload failed"
            r12.b(r13, r1)     // Catch:{ all -> 0x0042 }
            goto L_0x013f
        L_0x0131:
            jo5 r13 = r12.Y     // Catch:{ all -> 0x0042 }
            z47 r12 = r12.b     // Catch:{ all -> 0x0042 }
            k57 r12 = (defpackage.k57) r12     // Catch:{ all -> 0x0042 }
            r13.getClass()     // Catch:{ all -> 0x0042 }
            java.lang.String r13 = "upload failed"
            r12.b(r13, r1)     // Catch:{ all -> 0x0042 }
        L_0x013f:
            if (r0 == 0) goto L_0x0144
            r0.close()
        L_0x0144:
            return
        L_0x0145:
            if (r0 == 0) goto L_0x014f
            r0.close()     // Catch:{ all -> 0x014b }
            goto L_0x014f
        L_0x014b:
            r13 = move-exception
            r12.addSuppressed(r13)
        L_0x014f:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo5.h(jtc, k4d):void");
    }

    public final void o(jtc jtc, IOException iOException) {
        f19 f19 = jo5.d;
        z68.h("jo5", iOException, "onFailure %s", this.a);
        jo5 jo5 = this.Y;
        nd ndVar = (nd) jo5.c.a.getValue();
        ndVar.getClass();
        ndVar.f("HTTP_ERROR", iOException.getClass().getSimpleName());
        z68.f("jo5", "onFailure", (Throwable) null);
        boolean z2 = iOException instanceof FileNotFoundException;
        z47 z47 = this.b;
        if (z2) {
            ((k57) z47).b("file not found", b59.m);
        } else if ("FILE_ZERO_LENGTH".equals(iOException.getMessage())) {
            ((k57) z47).b("file is zero length", b59.n);
        } else {
            String obj = iOException.toString();
            k57 k57 = (k57) z47;
            u47 u47 = b59.l;
            if (obj != null) {
                u47 = new u47(-1, "UNKNOWN_ERROR", obj);
            }
            k57.b("upload failed", u47);
        }
        jo5.a(jo5, this.c, true, iOException.getMessage());
    }
}
