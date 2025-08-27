package defpackage;

import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: kva  reason: default package */
public final class kva implements a67 {
    public final eva a;
    public final fva b;
    public final CountDownLatch c = new CountDownLatch(1);
    public final ArrayList d = new ArrayList();
    public final Lazy e = LazyKt.lazy(new cva(this, 0));
    public final Lazy f = LazyKt.lazy(new cva(this, 1));
    public final String g = kva.class.getName();

    public kva(eva eva, fva fva) {
        this.a = eva;
        this.b = fva;
        if (i()) {
            Thread.setDefaultUncaughtExceptionHandler(new dva(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
        a67 a67 = z68.b;
        qua qua = a67 instanceof qua ? (qua) a67 : null;
        z68.b = this;
        if ((c() || eva != null) && qua != null) {
            Iterator it = qua.a.iterator();
            while (it.hasNext()) {
                p78 p78 = (p78) it.next();
                this.b.getClass();
                String str = (String) p78.h.getValue();
                ThreadLocal threadLocal = p78.i;
                j(p78.a.a, p78.b, str, p78.c, ct.F(p78.a, str, p78.c, Long.valueOf(p78.e)), p78.f, p78.e);
            }
            qua.a.clear();
        }
    }

    public final void a(w78 w78, String str, String str2, Object[] objArr, Throwable th) {
        if (c()) {
            super.a(w78, str, str2, objArr, th);
        }
    }

    public final boolean c() {
        fva fva = this.b;
        fva.getClass();
        i94 i94 = (i94) fva.c.invoke();
        i94.getClass();
        return i94 != i94.DISABLED;
    }

    public final void d(w78 w78, String str, String str2, Throwable th) {
        String str3;
        if (c() || this.a != null) {
            Thread currentThread = Thread.currentThread();
            if (((Looper) gif.a.getValue()).isCurrentThread()) {
                str3 = "ui";
            } else {
                String name = currentThread.getName();
                str3 = (name == null || name.length() == 0) ? String.valueOf(currentThread.getId()) : currentThread.getName();
            }
            this.b.getClass();
            ThreadLocal threadLocal = p78.i;
            String c2 = ct.c(str3, str);
            j(w78.a, str, c2, str2, ct.F(w78, c2, str2, Long.valueOf(System.currentTimeMillis())), th, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0200, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r5, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0204, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0206, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x020a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x022a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x022b, code lost:
        kotlin.io.CloseableKt.closeFinally(r11, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x022e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e1, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e5, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fa, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fe, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0109, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010d, code lost:
        throw r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x021a A[LOOP:4: B:126:0x0214->B:128:0x021a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            r0 = 1
            boolean r1 = r11 instanceof defpackage.hva
            if (r1 == 0) goto L_0x0014
            r1 = r11
            hva r1 = (defpackage.hva) r1
            int r2 = r1.o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0014
            int r2 = r2 - r3
            r1.o = r2
            goto L_0x0019
        L_0x0014:
            hva r1 = new hva
            r1.<init>(r10, r11)
        L_0x0019:
            java.lang.Object r11 = r1.b
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.o
            if (r3 == 0) goto L_0x0033
            if (r3 != r0) goto L_0x002b
            kva r10 = r1.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0041
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r11)
            r1.a = r10
            r1.o = r0
            java.lang.Object r11 = r10.k(r1)
            if (r11 != r2) goto L_0x0041
            return r2
        L_0x0041:
            kotlin.Lazy r11 = r10.f
            java.lang.Object r11 = r11.getValue()
            u98 r11 = (defpackage.u98) r11
            java.util.ArrayList r1 = r10.d
            fva r10 = r10.b
            java.util.Collection r2 = r10.a
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r1 = kotlin.collections.CollectionsKt.zip(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r1, 10)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0064:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x011a
            java.lang.Object r3 = r1.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r5 = r3.component1()
            um5 r5 = (defpackage.um5) r5
            java.lang.Object r3 = r3.component2()
            gva r3 = (defpackage.gva) r3
            kotlin.Lazy r6 = r10.b
            java.lang.Object r6 = r6.getValue()
            po5 r6 = (defpackage.po5) r6
            r6.getClass()
            java.lang.String r6 = r6.b()
            java.lang.String r7 = "upload"
            java.io.File r6 = defpackage.po5.g(r6, r7)
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.String r7 = java.io.File.separator
            java.lang.String r3 = r3.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r7)
            r8.append(r3)
            java.lang.String r3 = ".log"
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            java.io.File r6 = r5.g
            java.io.File r7 = new java.io.File
            r7.<init>(r3)
            boolean r3 = r7.exists()
            if (r3 == 0) goto L_0x00c1
            r7.delete()
        L_0x00c1:
            r7.createNewFile()
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0106 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x0106 }
            java.io.File r8 = r5.h
            boolean r9 = r8.exists()     // Catch:{ all -> 0x00dd }
            if (r9 == 0) goto L_0x00e6
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ all -> 0x00dd }
            r9.<init>(r8)     // Catch:{ all -> 0x00dd }
            defpackage.j4b.n(r9, r3)     // Catch:{ all -> 0x00df }
            kotlin.io.CloseableKt.closeFinally(r9, r4)     // Catch:{ all -> 0x00dd }
            goto L_0x00e6
        L_0x00dd:
            r4 = move-exception
            goto L_0x0108
        L_0x00df:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r7 = move-exception
            kotlin.io.CloseableKt.closeFinally(r9, r4)     // Catch:{ all -> 0x00dd }
            throw r7     // Catch:{ all -> 0x00dd }
        L_0x00e6:
            boolean r8 = r6.exists()     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x00ff
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x00dd }
            r8.<init>(r6)     // Catch:{ all -> 0x00dd }
            defpackage.j4b.n(r8, r3)     // Catch:{ all -> 0x00f8 }
            kotlin.io.CloseableKt.closeFinally(r8, r4)     // Catch:{ all -> 0x00dd }
            goto L_0x00ff
        L_0x00f8:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r7 = move-exception
            kotlin.io.CloseableKt.closeFinally(r8, r4)     // Catch:{ all -> 0x00dd }
            throw r7     // Catch:{ all -> 0x00dd }
        L_0x00ff:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00dd }
            kotlin.io.CloseableKt.closeFinally(r3, r4)     // Catch:{ Exception -> 0x0106 }
            r6 = r7
            goto L_0x0115
        L_0x0106:
            r3 = move-exception
            goto L_0x010e
        L_0x0108:
            throw r4     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r7 = move-exception
            kotlin.io.CloseableKt.closeFinally(r3, r4)     // Catch:{ Exception -> 0x0106 }
            throw r7     // Catch:{ Exception -> 0x0106 }
        L_0x010e:
            java.lang.String r4 = r5.f
            java.lang.String r5 = "Exception while merging log files:"
            defpackage.z68.f(r4, r5, r3)
        L_0x0115:
            r2.add(r6)
            goto L_0x0064
        L_0x011a:
            r11.getClass()
            java.io.File r10 = new java.io.File
            java.lang.String r11 = r11.a
            r10.<init>(r11)
            java.io.File[] r10 = r10.listFiles()
            java.lang.String r1 = "logs-"
            if (r10 == 0) goto L_0x0160
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r5 = r10.length
            r6 = 0
        L_0x0133:
            if (r6 >= r5) goto L_0x0146
            r7 = r10[r6]
            java.lang.String r8 = r7.getName()
            boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r1, false, 2, (java.lang.Object) null)
            if (r8 == 0) goto L_0x0144
            r3.add(r7)
        L_0x0144:
            int r6 = r6 + r0
            goto L_0x0133
        L_0x0146:
            java.util.Iterator r10 = r3.iterator()
        L_0x014a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0160
            java.lang.Object r0 = r10.next()
            java.io.File r0 = (java.io.File) r0
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x014a
            r0.delete()
            goto L_0x014a
        L_0x0160:
            java.io.File r10 = new java.io.File
            java.lang.String r0 = java.io.File.separator
            java.time.LocalDateTime r3 = java.time.LocalDateTime.now()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            r5.append(r0)
            r5.append(r1)
            r5.append(r3)
            java.lang.String r11 = ".zip"
            r5.append(r11)
            java.lang.String r11 = r5.toString()
            r10.<init>(r11)
            defpackage.o5a.h(r10)
            boolean r11 = r2.isEmpty()
            if (r11 == 0) goto L_0x0199
            boolean r11 = r10.exists()
            if (r11 == 0) goto L_0x0210
            r10.delete()
            goto L_0x0210
        L_0x0199:
            java.util.zip.ZipOutputStream r11 = new java.util.zip.ZipOutputStream
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r10)
            r11.<init>(r0)
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x01fa }
        L_0x01a7:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x01fa }
            if (r1 == 0) goto L_0x020b
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x01fa }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x01fa }
            boolean r3 = r1.exists()     // Catch:{ all -> 0x01fa }
            if (r3 == 0) goto L_0x01a7
            boolean r3 = r1.isFile()     // Catch:{ all -> 0x01fa }
            if (r3 == 0) goto L_0x01a7
            long r5 = r1.length()     // Catch:{ all -> 0x01fa }
            r7 = 4
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x01ca
            goto L_0x01a7
        L_0x01ca:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x01fa }
            r3.<init>(r1)     // Catch:{ all -> 0x01fa }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ all -> 0x01fc }
            r5.<init>(r3)     // Catch:{ all -> 0x01fc }
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = r1.getPath()     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = r1.getPath()     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = "/"
            int r1 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r1, (java.lang.String) r8, 0, false, 6, (java.lang.Object) null)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = r7.substring(r1)     // Catch:{ all -> 0x01fe }
            r6.<init>(r1)     // Catch:{ all -> 0x01fe }
            r11.putNextEntry(r6)     // Catch:{ all -> 0x01fe }
            r1 = 1024(0x400, float:1.435E-42)
            kotlin.io.ByteStreamsKt.copyTo(r5, r11, r1)     // Catch:{ all -> 0x01fe }
            kotlin.io.CloseableKt.closeFinally(r5, r4)     // Catch:{ all -> 0x01fc }
            kotlin.io.CloseableKt.closeFinally(r3, r4)     // Catch:{ all -> 0x01fa }
            goto L_0x01a7
        L_0x01fa:
            r10 = move-exception
            goto L_0x0229
        L_0x01fc:
            r10 = move-exception
            goto L_0x0205
        L_0x01fe:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0200 }
        L_0x0200:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r5, r10)     // Catch:{ all -> 0x01fc }
            throw r0     // Catch:{ all -> 0x01fc }
        L_0x0205:
            throw r10     // Catch:{ all -> 0x0206 }
        L_0x0206:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r3, r10)     // Catch:{ all -> 0x01fa }
            throw r0     // Catch:{ all -> 0x01fa }
        L_0x020b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01fa }
            kotlin.io.CloseableKt.closeFinally(r11, r4)
        L_0x0210:
            java.util.Iterator r11 = r2.iterator()
        L_0x0214:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0224
            java.lang.Object r0 = r11.next()
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            goto L_0x0214
        L_0x0224:
            java.lang.String r10 = r10.getPath()
            return r10
        L_0x0229:
            throw r10     // Catch:{ all -> 0x022a }
        L_0x022a:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r11, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kva.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ArrayList g() {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            um5 um5 = (um5) it.next();
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, CollectionsKt.listOf(um5.g, um5.h));
        }
        return arrayList2;
    }

    public final synchronized void h() {
        if (i()) {
            if (this.c.getCount() != 0) {
                try {
                    for (gva gva : this.b.a) {
                        this.d.add(new um5(po5.g(((po5) this.b.b.getValue()).c(), "logs").getAbsolutePath() + File.separator + gva.a, gva.e, (d14) this.e.getValue(), gva.d, gva.b, gva.c));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                this.c.countDown();
            }
        }
    }

    public final boolean i() {
        fva fva = this.b;
        fva.getClass();
        i94 i94 = (i94) fva.c.invoke();
        i94.getClass();
        return i94 == i94.FILE_LOGS || i94 == i94.DEV_OPTIONS_MENU;
    }

    public final void j(int i, String str, String str2, String str3, String str4, Throwable th, long j) {
        Regex regex;
        if (c()) {
            if (i()) {
                h();
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    um5 um5 = (um5) it.next();
                    um5.getClass();
                    String str5 = str == null ? "" : str;
                    Regex regex2 = um5.d;
                    if ((regex2 == null || regex2.matches(str5)) && ((regex = um5.e) == null || !regex.matches(str5))) {
                        ev0.v(um5.b, um5.j, (f14) null, new tm5(um5, str4, (Continuation) null), 2);
                    }
                }
            }
            fva fva = this.b;
            fva.getClass();
            if (fva.c.invoke() == i94.DEV_OPTIONS_MENU && j > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Duration.Companion companion = Duration.Companion;
                Duration.m1402toStringimpl(DurationKt.toDuration(currentTimeMillis - j, DurationUnit.MILLISECONDS));
            }
        }
        if (this.a != null) {
            String[] strArr = lq.c;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String str6 = strArr[i2];
                if (str2 == null || !StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) str6, false, 2, (Object) null)) {
                    i2++;
                } else {
                    w78 w78 = w78.c;
                    if (i <= 4) {
                        return;
                    }
                }
            }
            if (!(str3 == null || str3.length() == 0 || lq.d() == null)) {
                pof.a(str2 + ": " + str3);
            }
            w78 w782 = w78.c;
            if (i >= 6 && th != null && lq.d() != null) {
                pof.b((i == 3 ? v78.x : i == 4 ? v78.w : i == 5 ? v78.o : i == 6 ? v78.c : i == 7 ? v78.b : v78.v).a, th, (String) null);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.jva
            if (r0 == 0) goto L_0x0013
            r0 = r8
            jva r0 = (defpackage.jva) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            jva r0 = new jva
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.util.Iterator r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0051
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r8)
            boolean r8 = r7.i()
            r2 = 0
            if (r8 != 0) goto L_0x0042
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            return r7
        L_0x0042:
            java.util.concurrent.CountDownLatch r8 = r7.c     // Catch:{ InterruptedException -> 0x006d }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x006d }
            r5 = 3
            r8.await(r5, r4)     // Catch:{ InterruptedException -> 0x006d }
            java.util.ArrayList r7 = r7.d
            java.util.Iterator r7 = r7.iterator()
        L_0x0051:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0068
            java.lang.Object r8 = r7.next()
            um5 r8 = (defpackage.um5) r8
            r0.a = r7
            r0.o = r3
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L_0x0051
            return r1
        L_0x0068:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r7
        L_0x006d:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kva.k(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
