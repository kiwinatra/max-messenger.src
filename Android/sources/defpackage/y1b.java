package defpackage;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* renamed from: y1b  reason: default package */
public final class y1b implements l4f {
    public static final Pattern e = Pattern.compile("^bytes \\*/([0-9]+)");
    public static final Pattern f = Pattern.compile(".*filename=\".*\\.(\\w+)\".*");
    public final yqf a;
    public final Lazy b;
    public final String c = y1b.class.getName();
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public y1b(Lazy lazy, yqf yqf) {
        this.a = yqf;
        this.b = lazy;
    }

    public static String e(k4d k4d) {
        String a2 = k4d.a(k4d, "Content-Disposition");
        if (!(a2 == null || a2.length() == 0)) {
            Matcher matcher = f.matcher(a2);
            if (matcher.matches()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static File f(File file, String str) {
        if (file != null) {
            return new File(file.getParent(), g63.i(file.getName(), "_part_", str));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: y2d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: y1b} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0267, code lost:
        return defpackage.i4f.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cc, code lost:
        return defpackage.i4f.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r4 = (defpackage.k4d) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b7, code lost:
        r0 = r1;
        r1 = r2;
        r2 = r7;
        r3 = r11;
        r11 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r18, java.io.File r19, defpackage.j4f r20, java.lang.String r21, boolean r22, kotlin.coroutines.Continuation r23) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r20
            r4 = r23
            boolean r5 = r4 instanceof defpackage.s1b
            if (r5 == 0) goto L_0x001d
            r5 = r4
            s1b r5 = (defpackage.s1b) r5
            int r6 = r5.X
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.X = r6
            goto L_0x0022
        L_0x001d:
            s1b r5 = new s1b
            r5.<init>(r1, r4)
        L_0x0022:
            java.lang.Object r4 = r5.y
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r7 = r5.X
            r8 = 0
            r9 = 0
            r10 = 1
            switch(r7) {
                case 0: goto L_0x0090;
                case 1: goto L_0x008b;
                case 2: goto L_0x0087;
                case 3: goto L_0x007e;
                case 4: goto L_0x005b;
                case 5: goto L_0x0046;
                case 6: goto L_0x0041;
                case 7: goto L_0x0038;
                default: goto L_0x0030;
            }
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            java.lang.Object r0 = r5.a
            y1b r0 = (defpackage.y1b) r0
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x0233
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x020b
        L_0x0046:
            boolean r0 = r5.x
            java.lang.Object r1 = r5.v
            q1b r1 = (defpackage.q1b) r1
            java.io.File r2 = r5.o
            j4f r3 = r5.c
            java.io.File r7 = r5.b
            java.lang.Object r11 = r5.a
            y1b r11 = (defpackage.y1b) r11
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x01ef
        L_0x005b:
            boolean r1 = r5.x
            q1b r2 = r5.w
            java.lang.Object r0 = r5.v
            r3 = r0
            y2d r3 = (defpackage.y2d) r3
            java.io.File r7 = r5.o
            j4f r11 = r5.c
            java.io.File r12 = r5.b
            java.lang.Object r0 = r5.a
            r13 = r0
            y1b r13 = (defpackage.y1b) r13
            kotlin.ResultKt.throwOnFailure(r4)     // Catch:{ IOException -> 0x0074 }
            goto L_0x01b5
        L_0x0074:
            r0 = move-exception
            r4 = r3
            r3 = r11
            r11 = r2
            r2 = r12
            r15 = r13
            r13 = r1
            r1 = r15
            goto L_0x01c2
        L_0x007e:
            java.lang.Object r0 = r5.a
            java.io.File r0 = (java.io.File) r0
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x024c
        L_0x0087:
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x00ca
        L_0x008b:
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x0265
        L_0x0090:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.String r4 = r1.c
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x009a
            goto L_0x00ab
        L_0x009a:
            boolean r11 = r7.c()
            if (r11 == 0) goto L_0x00ab
            w78 r11 = defpackage.w78.o
            java.lang.String r12 = "File download. url = "
            java.lang.String r12 = defpackage.a81.m(r12, r0)
            r7.d(r11, r4, r12, r9)
        L_0x00ab:
            if (r0 == 0) goto L_0x0253
            int r4 = r18.length()
            if (r4 != 0) goto L_0x00b5
            goto L_0x0253
        L_0x00b5:
            if (r2 != 0) goto L_0x00cd
            java.lang.String r0 = r1.c
            java.lang.String r1 = "File download. Output file is null"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            if (r3 == 0) goto L_0x00ca
            r0 = 2
            r5.X = r0
            kotlin.Unit r0 = r20.a()
            if (r0 != r6) goto L_0x00ca
            return r6
        L_0x00ca:
            i4f r0 = defpackage.i4f.c
            return r0
        L_0x00cd:
            r4 = r21
            java.io.File r7 = f(r2, r4)
            java.util.concurrent.ConcurrentHashMap r4 = r1.d
            java.lang.String r11 = r7.getAbsolutePath()
            java.lang.Object r4 = r4.get(r11)
            q1b r4 = (defpackage.q1b) r4
            if (r4 == 0) goto L_0x0113
            java.util.concurrent.CopyOnWriteArrayList r4 = r4.b
            int r11 = r4.size()
            r12 = r8
        L_0x00e8:
            if (r12 >= r11) goto L_0x0113
            java.lang.Object r13 = r4.get(r12)
            j4f r13 = (defpackage.j4f) r13
            if (r13 == 0) goto L_0x00f7
            java.lang.String r13 = r13.getDownloadContext()
            goto L_0x00f8
        L_0x00f7:
            r13 = r9
        L_0x00f8:
            if (r3 == 0) goto L_0x00ff
            java.lang.String r14 = r20.getDownloadContext()
            goto L_0x0100
        L_0x00ff:
            r14 = r9
        L_0x0100:
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
            if (r13 == 0) goto L_0x0110
            java.lang.String r0 = "File download. File already downloading in listener context, do nothing"
            java.lang.String r1 = r1.c
            defpackage.z68.c(r1, r0, new java.lang.Object[0])
            i4f r0 = defpackage.i4f.a
            return r0
        L_0x0110:
            int r12 = r12 + 1
            goto L_0x00e8
        L_0x0113:
            java.lang.String r4 = r1.c     // Catch:{ IllegalArgumentException -> 0x023d }
            java.lang.String r11 = "File download. Start"
            defpackage.z68.c(r4, r11, new java.lang.Object[0])     // Catch:{ IllegalArgumentException -> 0x023d }
            hr6 r4 = new hr6     // Catch:{ IllegalArgumentException -> 0x023d }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x023d }
            r4.C(r0)     // Catch:{ IllegalArgumentException -> 0x023d }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ IllegalArgumentException -> 0x023d }
            java.lang.String r0 = r0.toString()     // Catch:{ IllegalArgumentException -> 0x023d }
            r4.A(r0)     // Catch:{ IllegalArgumentException -> 0x023d }
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x0169
            long r11 = r7.length()
            r13 = 0
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0169
            java.lang.String r0 = r1.c
            long r11 = r7.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "resume download file, downloaded size: "
            r13.<init>(r14)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            defpackage.z68.c(r0, r11, new java.lang.Object[0])
            long r11 = r7.length()
            java.lang.String r0 = "bytes="
            java.lang.String r13 = "-"
            java.lang.String r0 = defpackage.wj6.j(r11, r0, r13)
            java.lang.Object r11 = r4.c
            e4 r11 = (defpackage.e4) r11
            java.lang.String r12 = "Range"
            r11.k(r12, r0)
        L_0x0169:
            y2d r4 = r4.c()
            kotlin.Lazy r0 = r1.b
            java.lang.Object r0 = r0.getValue()
            rla r0 = (defpackage.rla) r0
            jtc r0 = r0.b(r4)
            q1b r11 = new q1b
            r11.<init>(r0)
            java.util.concurrent.CopyOnWriteArrayList r12 = r11.b
            r12.add(r3)
            java.util.concurrent.ConcurrentHashMap r12 = r1.d
            java.lang.String r13 = r7.getAbsolutePath()
            r12.put(r13, r11)
            c28 r12 = new c28     // Catch:{ IOException -> 0x01bf }
            r13 = 22
            r12.<init>(r13, r0)     // Catch:{ IOException -> 0x01bf }
            r5.a = r1     // Catch:{ IOException -> 0x01bf }
            r5.b = r2     // Catch:{ IOException -> 0x01bf }
            r5.c = r3     // Catch:{ IOException -> 0x01bf }
            r5.o = r7     // Catch:{ IOException -> 0x01bf }
            r5.v = r4     // Catch:{ IOException -> 0x01bf }
            r5.w = r11     // Catch:{ IOException -> 0x01bf }
            r13 = r22
            r5.x = r13     // Catch:{ IOException -> 0x01bd }
            r0 = 4
            r5.X = r0     // Catch:{ IOException -> 0x01bd }
            java.lang.Object r0 = defpackage.ryg.W(r12, r5)     // Catch:{ IOException -> 0x01bd }
            if (r0 != r6) goto L_0x01ad
            return r6
        L_0x01ad:
            r12 = r2
            r2 = r11
            r11 = r3
            r3 = r4
            r4 = r0
            r15 = r13
            r13 = r1
            r1 = r15
        L_0x01b5:
            k4d r4 = (defpackage.k4d) r4     // Catch:{ IOException -> 0x0074 }
            r0 = r1
            r1 = r2
            r2 = r7
            r3 = r11
            r11 = r13
            goto L_0x01f1
        L_0x01bd:
            r0 = move-exception
            goto L_0x01c2
        L_0x01bf:
            r0 = move-exception
            r13 = r22
        L_0x01c2:
            r5.a = r1
            r5.b = r2
            r5.c = r3
            r5.o = r7
            r5.v = r11
            r5.w = r9
            r5.x = r13
            r12 = 5
            r5.X = r12
            r17 = r1
            r18 = r0
            r19 = r4
            r20 = r11
            r21 = r7
            r22 = r5
            java.lang.Object r0 = r17.h(r18, r19, r20, r21, r22)
            if (r0 != r6) goto L_0x01e6
            return r6
        L_0x01e6:
            r0 = r13
            r15 = r11
            r11 = r1
            r1 = r15
            r16 = r7
            r7 = r2
            r2 = r16
        L_0x01ef:
            r12 = r7
            r4 = r9
        L_0x01f1:
            if (r4 != 0) goto L_0x020e
            if (r3 == 0) goto L_0x020b
            r5.a = r9
            r5.b = r9
            r5.c = r9
            r5.o = r9
            r5.v = r9
            r5.w = r9
            r0 = 6
            r5.X = r0
            kotlin.Unit r0 = r3.e(r10, r8)
            if (r0 != r6) goto L_0x020b
            return r6
        L_0x020b:
            i4f r0 = defpackage.i4f.c
            return r0
        L_0x020e:
            r5.a = r11
            r5.b = r9
            r5.c = r9
            r5.o = r9
            r5.v = r9
            r5.w = r9
            r3 = 7
            r5.X = r3
            r17 = r11
            r18 = r4
            r19 = r1
            r20 = r2
            r21 = r12
            r22 = r0
            r23 = r5
            java.lang.Object r0 = r17.i(r18, r19, r20, r21, r22, r23)
            if (r0 != r6) goto L_0x0232
            return r6
        L_0x0232:
            r0 = r11
        L_0x0233:
            java.lang.String r0 = r0.c
            java.lang.String r1 = "File download. Stop"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            i4f r0 = defpackage.i4f.b
            return r0
        L_0x023d:
            if (r3 == 0) goto L_0x024d
            r5.a = r7
            r0 = 3
            r5.X = r0
            kotlin.Unit r0 = r20.a()
            if (r0 != r6) goto L_0x024b
            return r6
        L_0x024b:
            r0 = r7
        L_0x024c:
            r7 = r0
        L_0x024d:
            r7.delete()
            i4f r0 = defpackage.i4f.c
            return r0
        L_0x0253:
            java.lang.String r0 = r1.c
            java.lang.String r1 = "File download. Error empty url"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            if (r3 == 0) goto L_0x0265
            r5.X = r10
            kotlin.Unit r0 = r20.a()
            if (r0 != r6) goto L_0x0265
            return r6
        L_0x0265:
            i4f r0 = defpackage.i4f.c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1b.a(java.lang.String, java.io.File, j4f, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.io.File r8, java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.r1b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            r1b r0 = (defpackage.r1b) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            r1b r0 = new r1b
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.util.Iterator r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0081
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r10)
            java.util.concurrent.ConcurrentHashMap r10 = r7.d
            java.io.File r8 = f(r8, r9)
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.Object r8 = r10.get(r8)
            q1b r8 = (defpackage.q1b) r8
            java.lang.String r7 = r7.c
            a67 r10 = defpackage.z68.b
            if (r10 != 0) goto L_0x004d
            goto L_0x0074
        L_0x004d:
            boolean r2 = r10.c()
            if (r2 == 0) goto L_0x0074
            w78 r2 = defpackage.w78.o
            if (r8 == 0) goto L_0x0059
            r4 = r3
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "File download. Cancel download, attachId:"
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r9 = ", task exist:"
            r5.append(r9)
            r5.append(r4)
            java.lang.String r9 = r5.toString()
            r4 = 0
            r10.d(r2, r7, r9, r4)
        L_0x0074:
            if (r8 == 0) goto L_0x009a
            jtc r7 = r8.a
            r7.e()
            java.util.concurrent.CopyOnWriteArrayList r7 = r8.b
            java.util.Iterator r7 = r7.iterator()
        L_0x0081:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x009a
            java.lang.Object r8 = r7.next()
            j4f r8 = (defpackage.j4f) r8
            if (r8 == 0) goto L_0x0081
            r0.a = r7
            r0.o = r3
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L_0x0081
            return r1
        L_0x009a:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1b.b(java.io.File, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object c(File file, String str, Continuation continuation) {
        String absolutePath = f(file, str).getAbsolutePath();
        q1b q1b = (q1b) this.d.get(absolutePath);
        String str2 = this.c;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            boolean z = q1b != null;
            a67.d(w78, str2, "File download. Silent cancel download, attachId:" + str + ", task exist:" + z, (Throwable) null);
        }
        if (q1b != null) {
            q1b.a.e();
            j(q1b, absolutePath);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6 A[Catch:{ IOException -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3 A[SYNTHETIC, Splitter:B:37:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00db A[SYNTHETIC, Splitter:B:49:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0134 A[Catch:{ all -> 0x012e, IOException -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.io.File r17, java.io.File r18, java.lang.String r19, kotlin.coroutines.Continuation r20) {
        /*
            r16 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof defpackage.t1b
            if (r2 == 0) goto L_0x0019
            r2 = r1
            t1b r2 = (defpackage.t1b) r2
            int r3 = r2.v0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.v0 = r3
            r3 = r16
            goto L_0x0020
        L_0x0019:
            t1b r2 = new t1b
            r3 = r16
            r2.<init>(r3, r1)
        L_0x0020:
            java.lang.Object r1 = r2.Y
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.v0
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x005e
            if (r5 != r8) goto L_0x0056
            long r9 = r2.X
            byte[] r0 = r2.z
            java.io.InputStream r3 = r2.y
            java.io.OutputStream r5 = r2.x
            java.io.Closeable r11 = r2.w
            java.io.Closeable r12 = r2.v
            java.io.File r13 = r2.o
            java.io.File r14 = r2.c
            java.io.File r15 = r2.b
            y1b r6 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ all -> 0x0051 }
            r1 = r0
            r0 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r3
            r3 = r6
            r6 = r11
            r11 = r5
            r5 = r8
            goto L_0x00fe
        L_0x0051:
            r0 = move-exception
            r1 = r0
            r3 = r6
            goto L_0x0123
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005e:
            kotlin.ResultKt.throwOnFailure(r1)
            if (r0 == 0) goto L_0x009e
            int r1 = r19.length()     // Catch:{ IOException -> 0x009c }
            if (r1 != 0) goto L_0x006a
            goto L_0x009e
        L_0x006a:
            java.lang.String r1 = r18.getName()     // Catch:{ IOException -> 0x009c }
            r5 = 6
            r6 = 46
            int r5 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r1, (char) r6, (int) r7, false, (int) r5, (java.lang.Object) null)     // Catch:{ IOException -> 0x009c }
            if (r5 < 0) goto L_0x007b
            java.lang.String r1 = r1.substring(r7, r5)     // Catch:{ IOException -> 0x009c }
        L_0x007b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009c }
            r5.<init>()     // Catch:{ IOException -> 0x009c }
            r5.append(r1)     // Catch:{ IOException -> 0x009c }
            java.lang.String r1 = "."
            r5.append(r1)     // Catch:{ IOException -> 0x009c }
            r5.append(r0)     // Catch:{ IOException -> 0x009c }
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x009c }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x009c }
            java.io.File r5 = r18.getParentFile()     // Catch:{ IOException -> 0x009c }
            r1.<init>(r5, r0)     // Catch:{ IOException -> 0x009c }
            goto L_0x00a0
        L_0x0099:
            r14 = 0
            goto L_0x0140
        L_0x009c:
            r0 = move-exception
            goto L_0x0099
        L_0x009e:
            r1 = r18
        L_0x00a0:
            java.io.File r0 = r1.getParentFile()     // Catch:{ IOException -> 0x009c }
            if (r0 == 0) goto L_0x00b0
            java.lang.String r1 = r1.getName()     // Catch:{ IOException -> 0x009c }
            java.io.File r0 = defpackage.wc8.p(r0, r1)     // Catch:{ IOException -> 0x009c }
            r14 = r0
            goto L_0x00b1
        L_0x00b0:
            r14 = 0
        L_0x00b1:
            if (r14 == 0) goto L_0x0134
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00c4 }
            r0 = r17
            r12.<init>(r0)     // Catch:{ IOException -> 0x00c4 }
            java.io.File r1 = r14.getParentFile()     // Catch:{ IOException -> 0x00c4 }
            if (r1 == 0) goto L_0x00c7
            r1.mkdirs()     // Catch:{ IOException -> 0x00c4 }
            goto L_0x00c7
        L_0x00c4:
            r0 = move-exception
            goto L_0x0140
        L_0x00c7:
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00c4 }
            r11.<init>(r14, r8)     // Catch:{ IOException -> 0x00c4 }
            r1 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x0121 }
            int r5 = r12.read(r1)     // Catch:{ all -> 0x0121 }
            r9 = 0
            r6 = r11
            r13 = r12
            r15 = r14
        L_0x00d9:
            if (r5 < 0) goto L_0x010c
            r11.write(r1, r7, r5)     // Catch:{ all -> 0x0106 }
            long r7 = (long) r5     // Catch:{ all -> 0x0106 }
            long r9 = r9 + r7
            r2.a = r3     // Catch:{ all -> 0x0106 }
            r2.b = r0     // Catch:{ all -> 0x0106 }
            r2.c = r15     // Catch:{ all -> 0x0106 }
            r2.o = r14     // Catch:{ all -> 0x0106 }
            r2.v = r13     // Catch:{ all -> 0x0106 }
            r2.w = r6     // Catch:{ all -> 0x0106 }
            r2.x = r11     // Catch:{ all -> 0x0106 }
            r2.y = r12     // Catch:{ all -> 0x0106 }
            r2.z = r1     // Catch:{ all -> 0x0106 }
            r2.X = r9     // Catch:{ all -> 0x0106 }
            r5 = 1
            r2.v0 = r5     // Catch:{ all -> 0x0106 }
            java.lang.Object r7 = defpackage.f6e.M(r2)     // Catch:{ all -> 0x0106 }
            if (r7 != r4) goto L_0x00fe
            return r4
        L_0x00fe:
            int r7 = r12.read(r1)     // Catch:{ all -> 0x0106 }
            r8 = r5
            r5 = r7
            r7 = 0
            goto L_0x00d9
        L_0x0106:
            r0 = move-exception
            r1 = r0
            r11 = r6
            r12 = r13
            r14 = r15
            goto L_0x0123
        L_0x010c:
            r11.flush()     // Catch:{ all -> 0x0106 }
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r6, r1)     // Catch:{ all -> 0x011d }
            kotlin.io.CloseableKt.closeFinally(r13, r1)     // Catch:{ IOException -> 0x011a }
            r0.delete()     // Catch:{ IOException -> 0x011a }
            goto L_0x014b
        L_0x011a:
            r0 = move-exception
            r14 = r15
            goto L_0x0140
        L_0x011d:
            r0 = move-exception
            r1 = r0
            r14 = r15
            goto L_0x012d
        L_0x0121:
            r0 = move-exception
            r1 = r0
        L_0x0123:
            throw r1     // Catch:{ all -> 0x0124 }
        L_0x0124:
            r0 = move-exception
            r2 = r0
            kotlin.io.CloseableKt.closeFinally(r11, r1)     // Catch:{ all -> 0x012a }
            throw r2     // Catch:{ all -> 0x012a }
        L_0x012a:
            r0 = move-exception
            r1 = r0
            r13 = r12
        L_0x012d:
            throw r1     // Catch:{ all -> 0x012e }
        L_0x012e:
            r0 = move-exception
            r2 = r0
            kotlin.io.CloseableKt.closeFinally(r13, r1)     // Catch:{ IOException -> 0x00c4 }
            throw r2     // Catch:{ IOException -> 0x00c4 }
        L_0x0134:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x00c4 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00c4 }
            throw r1     // Catch:{ IOException -> 0x00c4 }
        L_0x0140:
            java.lang.String r1 = r3.c
            java.lang.String r0 = r0.getMessage()
            r2 = 0
            defpackage.z68.f(r1, r0, r2)
            r15 = r14
        L_0x014b:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1b.d(java.io.File, java.io.File, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.io.File} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0270 A[SYNTHETIC] */
    public final java.lang.Object g(defpackage.ptc r19, long r20, java.io.File r22, defpackage.k4d r23, defpackage.q1b r24, java.io.File r25, boolean r26, kotlin.coroutines.Continuation r27) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r27
            boolean r7 = r6 instanceof defpackage.u1b
            if (r7 == 0) goto L_0x001f
            r7 = r6
            u1b r7 = (defpackage.u1b) r7
            int r8 = r7.w
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r8 & r9
            if (r10 == 0) goto L_0x001f
            int r8 = r8 - r9
            r7.w = r8
            goto L_0x0024
        L_0x001f:
            u1b r7 = new u1b
            r7.<init>(r0, r6)
        L_0x0024:
            java.lang.Object r6 = r7.o
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r9 = r7.w
            r10 = 3
            r11 = 4
            r12 = 2
            r13 = 1
            if (r9 == 0) goto L_0x0081
            if (r9 == r13) goto L_0x007b
            if (r9 == r12) goto L_0x006e
            if (r9 == r10) goto L_0x005b
            if (r9 != r11) goto L_0x0053
            java.util.Iterator r1 = r7.c
            java.lang.Object r0 = r7.b
            r2 = r0
            java.io.File r2 = (java.io.File) r2
            y1b r3 = r7.a
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x0049 }
            r4 = r11
            goto L_0x0254
        L_0x0049:
            r0 = move-exception
            r4 = r11
        L_0x004b:
            r17 = r2
            r2 = r1
            r1 = r3
            r3 = r17
            goto L_0x0264
        L_0x0053:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005b:
            java.util.Iterator r1 = r7.c
            java.lang.Object r0 = r7.b
            r2 = r0
            java.io.File r2 = (java.io.File) r2
            y1b r3 = r7.a
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x006a }
            r4 = r10
            goto L_0x01f2
        L_0x006a:
            r0 = move-exception
            r4 = r10
            goto L_0x01f9
        L_0x006e:
            java.lang.Object r0 = r7.b
            q1b r0 = (defpackage.q1b) r0
            y1b r1 = r7.a
            kotlin.ResultKt.throwOnFailure(r6)
            r5 = r0
            r0 = r1
            goto L_0x01c3
        L_0x007b:
            kotlin.ResultKt.throwOnFailure(r6)
            r1 = r13
            goto L_0x0121
        L_0x0081:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = r23.isSuccessful()
            r6 = r6 ^ r13
            r9 = 0
            if (r6 != 0) goto L_0x0099
            if (r19 == 0) goto L_0x0099
            r14 = 0
            int r14 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x0099
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
            return r0
        L_0x0099:
            java.lang.String r14 = r0.c
            a67 r15 = defpackage.z68.b
            if (r15 != 0) goto L_0x00a0
            goto L_0x00d7
        L_0x00a0:
            boolean r16 = r15.c()
            if (r16 == 0) goto L_0x00d7
            w78 r11 = defpackage.w78.x
            long r12 = r22.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r9 = "File download. responseFailed="
            r10.<init>(r9)
            r10.append(r6)
            java.lang.String r9 = "\n                |response.body().contentLength()="
            r10.append(r9)
            r10.append(r1)
            java.lang.String r1 = "\n                |tempOutputFile.length()="
            r10.append(r1)
            r10.append(r12)
            java.lang.String r1 = "\n                |"
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            java.lang.String r1 = kotlin.text.StringsKt__IndentKt.trimMargin$default(r1, (java.lang.String) null, 1, (java.lang.Object) null)
            r2 = 0
            r15.d(r11, r14, r1, r2)
        L_0x00d7:
            if (r6 == 0) goto L_0x0126
            int r1 = r4.o
            yqf r2 = r0.a
            kotlin.Lazy r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            nd r2 = (defpackage.nd) r2
            r2.getClass()
            java.lang.String r6 = "HTTP_ERROR"
            java.lang.String r9 = java.lang.String.valueOf(r1)
            r2.f(r6, r9)
            r2 = 403(0x193, float:5.65E-43)
            if (r1 == r2) goto L_0x00f9
            r2 = 400(0x190, float:5.6E-43)
            if (r1 != r2) goto L_0x0126
        L_0x00f9:
            java.lang.String r2 = r0.c
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x0100
            goto L_0x0112
        L_0x0100:
            boolean r6 = r4.c()
            if (r6 == 0) goto L_0x0112
            w78 r6 = defpackage.w78.x
            java.lang.String r9 = "File download. Url expired try to get new one. Code = "
            java.lang.String r1 = defpackage.wj6.h(r1, r9)
            r9 = 0
            r4.d(r6, r2, r1, r9)
        L_0x0112:
            jtc r1 = r5.a
            r1.e()
            r1 = 1
            r7.w = r1
            java.lang.Object r0 = r0.k(r5, r3, r7)
            if (r0 != r8) goto L_0x0121
            return r8
        L_0x0121:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            return r0
        L_0x0126:
            yqf r1 = r0.a
            java.lang.String r2 = "Exception in FileDownloader onResponse"
            r1.d(r2)
            long r1 = r22.length()
            int r6 = r4.o
            r9 = 416(0x1a0, float:5.83E-43)
            if (r6 != r9) goto L_0x020b
            lx6 r6 = r4.w
            java.lang.String r9 = "Content-Range"
            java.lang.String r6 = r6.b(r9)
            if (r6 == 0) goto L_0x0142
            goto L_0x0143
        L_0x0142:
            r6 = 0
        L_0x0143:
            java.lang.String r9 = r0.c
            a67 r10 = defpackage.z68.b
            if (r10 != 0) goto L_0x014a
            goto L_0x0161
        L_0x014a:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x0161
            w78 r11 = defpackage.w78.o
            if (r6 == 0) goto L_0x0156
            r12 = 1
            goto L_0x0157
        L_0x0156:
            r12 = 0
        L_0x0157:
            java.lang.String r13 = "File download. Try compare range with localLength, range exist:"
            java.lang.String r12 = defpackage.i2a.i(r13, r12)
            r13 = 0
            r10.d(r11, r9, r12, r13)
        L_0x0161:
            if (r6 == 0) goto L_0x020b
            java.util.regex.Pattern r9 = e
            java.util.regex.Matcher r6 = r9.matcher(r6)
            boolean r9 = r6.find()
            if (r9 == 0) goto L_0x020b
            r9 = 1
            java.lang.String r6 = r6.group(r9)
            if (r6 == 0) goto L_0x017f
            long r9 = java.lang.Long.parseLong(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            goto L_0x0180
        L_0x017f:
            r6 = 0
        L_0x0180:
            java.lang.String r9 = r0.c
            a67 r10 = defpackage.z68.b
            if (r10 != 0) goto L_0x0187
            goto L_0x01a1
        L_0x0187:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x01a1
            w78 r11 = defpackage.w78.o
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "File download. Compare current range:"
            r12.<init>(r13)
            r12.append(r6)
            java.lang.String r12 = r12.toString()
            r13 = 0
            r10.d(r11, r9, r12, r13)
        L_0x01a1:
            if (r6 == 0) goto L_0x020b
            long r9 = r6.longValue()
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x020b
            if (r26 == 0) goto L_0x01b2
            java.lang.String r9 = e(r23)
            goto L_0x01b3
        L_0x01b2:
            r9 = 0
        L_0x01b3:
            r7.a = r0
            r7.b = r5
            r1 = 2
            r7.w = r1
            r1 = r25
            java.lang.Object r6 = r0.d(r3, r1, r9, r7)
            if (r6 != r8) goto L_0x01c3
            return r8
        L_0x01c3:
            java.io.File r6 = (java.io.File) r6
            java.util.concurrent.CopyOnWriteArrayList r1 = r5.b
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
            r2 = r6
        L_0x01cd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0205
            java.lang.Object r0 = r1.next()
            j4f r0 = (defpackage.j4f) r0
            java.lang.String r4 = r3.c
            java.lang.String r5 = "File download. File already fully downloaded"
            defpackage.z68.c(r4, r5, new java.lang.Object[0])
            if (r0 == 0) goto L_0x0203
            r7.a = r3     // Catch:{ all -> 0x01f7 }
            r7.b = r2     // Catch:{ all -> 0x01f7 }
            r7.c = r1     // Catch:{ all -> 0x01f7 }
            r4 = 3
            r7.w = r4     // Catch:{ all -> 0x01f5 }
            java.lang.Object r0 = r0.f(r2, r7)     // Catch:{ all -> 0x01f5 }
            if (r0 != r8) goto L_0x01f2
            return r8
        L_0x01f2:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01f5 }
            goto L_0x01cd
        L_0x01f5:
            r0 = move-exception
            goto L_0x01f9
        L_0x01f7:
            r0 = move-exception
            r4 = 3
        L_0x01f9:
            java.lang.String r5 = r3.c
            java.lang.String r6 = "File download. onResponse: failed to notify listener on download completed"
            defpackage.z68.f(r5, r6, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x01cd
        L_0x0203:
            r4 = 3
            goto L_0x01cd
        L_0x0205:
            r1 = 1
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            return r0
        L_0x020b:
            java.lang.String r1 = r0.c
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x0212
            goto L_0x0228
        L_0x0212:
            boolean r6 = r2.c()
            if (r6 == 0) goto L_0x0228
            w78 r6 = defpackage.w78.x
            int r4 = r4.o
            java.lang.String r9 = "File download. Server response code = "
            java.lang.String r10 = ", download failed"
            java.lang.String r4 = defpackage.a81.j(r4, r9, r10)
            r9 = 0
            r2.d(r6, r1, r4, r9)
        L_0x0228:
            java.util.concurrent.CopyOnWriteArrayList r1 = r5.b
            java.util.Iterator r1 = r1.iterator()
            r2 = r1
            r1 = r0
        L_0x0230:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0270
            java.lang.Object r0 = r2.next()
            j4f r0 = (defpackage.j4f) r0
            if (r0 == 0) goto L_0x026e
            r7.a = r1     // Catch:{ all -> 0x0262 }
            r7.b = r3     // Catch:{ all -> 0x0262 }
            r7.c = r2     // Catch:{ all -> 0x0262 }
            r4 = 4
            r7.w = r4     // Catch:{ all -> 0x0260 }
            kotlin.Unit r0 = r0.a()     // Catch:{ all -> 0x0260 }
            if (r0 != r8) goto L_0x024e
            return r8
        L_0x024e:
            r17 = r3
            r3 = r1
            r1 = r2
            r2 = r17
        L_0x0254:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x025d }
            r17 = r2
            r2 = r1
            r1 = r3
            r3 = r17
            goto L_0x0230
        L_0x025d:
            r0 = move-exception
            goto L_0x004b
        L_0x0260:
            r0 = move-exception
            goto L_0x0264
        L_0x0262:
            r0 = move-exception
            r4 = 4
        L_0x0264:
            java.lang.String r5 = r1.c
            java.lang.String r6 = "File download. onResponse: failed to notify listener on download failed"
            defpackage.z68.f(r5, r6, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0230
        L_0x026e:
            r4 = 4
            goto L_0x0230
        L_0x0270:
            r3.delete()
            r1 = 1
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1b.g(ptc, long, java.io.File, k4d, q1b, java.io.File, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082 A[Catch:{ all -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d5 A[EDGE_INSN: B:62:0x00d5->B:52:0x00d5 ?: BREAK  , SYNTHETIC] */
    public final java.lang.Object h(java.io.IOException r8, defpackage.y2d r9, defpackage.q1b r10, java.io.File r11, kotlin.coroutines.Continuation r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.v1b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            v1b r0 = (defpackage.v1b) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            v1b r0 = new v1b
            r0.<init>(r7, r12)
        L_0x0018:
            java.lang.Object r12 = r0.w
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 != r3) goto L_0x003d
            java.util.Iterator r7 = r0.v
            java.io.File r8 = r0.o
            q1b r9 = r0.c
            java.io.IOException r10 = r0.b
            y1b r11 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x0034 }
            goto L_0x00bf
        L_0x0034:
            r12 = move-exception
            r5 = r11
            r11 = r8
            r8 = r5
            r6 = r10
            r10 = r9
            r9 = r6
            goto L_0x00c9
        L_0x003d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r12 = r7.c     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = "File download. Exception while download request: %s"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch:{ all -> 0x00e1 }
            defpackage.z68.h(r12, r8, r2, r9)     // Catch:{ all -> 0x00e1 }
            yqf r9 = r7.a     // Catch:{ all -> 0x00e1 }
            kotlin.Lazy r9 = r9.a     // Catch:{ all -> 0x00e1 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x00e1 }
            nd r9 = (defpackage.nd) r9     // Catch:{ all -> 0x00e1 }
            if (r8 != 0) goto L_0x0062
            java.lang.String r12 = "0"
            goto L_0x006d
        L_0x0062:
            r9.getClass()     // Catch:{ all -> 0x00e1 }
            java.lang.Class r12 = r8.getClass()     // Catch:{ all -> 0x00e1 }
            java.lang.String r12 = r12.getSimpleName()     // Catch:{ all -> 0x00e1 }
        L_0x006d:
            java.lang.String r2 = "HTTP_ERROR"
            r9.f(r2, r12)     // Catch:{ all -> 0x00e1 }
            java.util.concurrent.CopyOnWriteArrayList r9 = r10.b     // Catch:{ all -> 0x00e1 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x00e1 }
            r5 = r8
            r8 = r7
            r7 = r9
            r9 = r5
        L_0x007c:
            boolean r12 = r7.hasNext()     // Catch:{ all -> 0x00d3 }
            if (r12 == 0) goto L_0x00d5
            java.lang.Object r12 = r7.next()     // Catch:{ all -> 0x00d3 }
            j4f r12 = (defpackage.j4f) r12     // Catch:{ all -> 0x00d3 }
            if (r12 == 0) goto L_0x007c
            r8.getClass()     // Catch:{ all -> 0x00c8 }
            boolean r2 = r9 instanceof java.net.SocketException     // Catch:{ all -> 0x00c8 }
            r4 = 0
            if (r2 != 0) goto L_0x00a5
            java.lang.Throwable r2 = r9.getCause()     // Catch:{ all -> 0x00c8 }
            boolean r2 = r2 instanceof java.net.SocketException     // Catch:{ all -> 0x00c8 }
            if (r2 != 0) goto L_0x00a5
            boolean r2 = r9 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x00c8 }
            if (r2 != 0) goto L_0x00a5
            boolean r2 = r9 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r2 = r4
            goto L_0x00a6
        L_0x00a5:
            r2 = r3
        L_0x00a6:
            r0.a = r8     // Catch:{ all -> 0x00c8 }
            r0.b = r9     // Catch:{ all -> 0x00c8 }
            r0.c = r10     // Catch:{ all -> 0x00c8 }
            r0.o = r11     // Catch:{ all -> 0x00c8 }
            r0.v = r7     // Catch:{ all -> 0x00c8 }
            r0.y = r3     // Catch:{ all -> 0x00c8 }
            kotlin.Unit r12 = r12.e(r2, r4)     // Catch:{ all -> 0x00c8 }
            if (r12 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            r5 = r11
            r11 = r8
            r8 = r5
            r6 = r10
            r10 = r9
            r9 = r6
        L_0x00bf:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0034 }
            r5 = r11
            r11 = r8
            r8 = r5
            r6 = r10
            r10 = r9
            r9 = r6
            goto L_0x007c
        L_0x00c8:
            r12 = move-exception
        L_0x00c9:
            java.lang.String r2 = r8.c     // Catch:{ all -> 0x00d3 }
            java.lang.String r4 = "File download. Failed to notify listener on exception"
            defpackage.z68.f(r2, r4, r12)     // Catch:{ all -> 0x00d3 }
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00d3 }
            goto L_0x007c
        L_0x00d3:
            r7 = move-exception
            goto L_0x00e3
        L_0x00d5:
            java.lang.String r7 = r11.getAbsolutePath()
            r8.j(r10, r7)
            goto L_0x00eb
        L_0x00dd:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x00e3
        L_0x00e1:
            r8 = move-exception
            goto L_0x00dd
        L_0x00e3:
            java.lang.String r9 = r8.c     // Catch:{ all -> 0x00ee }
            java.lang.String r12 = "File download. Failed to process on failure"
            defpackage.z68.f(r9, r12, r7)     // Catch:{ all -> 0x00ee }
            goto L_0x00d5
        L_0x00eb:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L_0x00ee:
            r7 = move-exception
            java.lang.String r9 = r11.getAbsolutePath()
            r8.j(r10, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1b.h(java.io.IOException, y2d, q1b, java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.system.ErrnoException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlin.Unit} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v38, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v37, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v30, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v33, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v48, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v71, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: java.io.Closeable} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:(1:341)|342|(14:348|(1:350)|351|353|(1:355)(1:356)|(2:358|(1:360)(1:361))|364|(6:366|367|368|369|370|(1:372))|363|367|368|369|370|(0))|352|353|(0)(0)|(0)|364|(0)|363|367|368|369|370|(0)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(46:192|193|194|190|191|180|177|129|130|132|133|(0)|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|(0)(0)|168) */
    /* JADX WARNING: Can't wrap try/catch for region: R(50:192|193|194|190|191|180|177|203|204|205|129|130|(0)|132|133|(0)|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|(0)(0)|168) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x023b, code lost:
        r30 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x023e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x023f, code lost:
        r30 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r0 = new kotlin.jvm.internal.Ref.LongRef();
        r9 = r5.length();
        r0.element = r9;
        r2.element += r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0253, code lost:
        if (r3 == null) goto L_0x0642;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0255, code lost:
        r13 = r3.m();
        r3 = defpackage.mh3.$EnumSwitchMapping$0[r8.a.c().ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0268, code lost:
        if (r3 == 1) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x026b, code lost:
        if (r3 == 2) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x026e, code lost:
        if (r3 == 3) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0270, code lost:
        r3 = kotlin.io.ConstantsKt.DEFAULT_BLOCK_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0273, code lost:
        r3 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0276, code lost:
        r3 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x027a, code lost:
        r9 = r5.getParentFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x027e, code lost:
        if (r9 == null) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9.mkdirs());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r12 = new java.io.FileOutputStream(r5, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r3 = new byte[r3];
        r10 = r13.read(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0293, code lost:
        r11 = r5;
        r9 = r13;
        r21 = r14;
        r17 = 0;
        r14 = r12;
        r16 = r9;
        r13 = r14;
        r12 = r10;
        r10 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a4, code lost:
        if (r12 >= 0) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a6, code lost:
        r30 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r31 = r3;
        r32 = r4;
        r0.element += (long) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b8, code lost:
        r8 = r32;
        r4 = r9;
        r18 = r17;
        r7 = r21;
        r9 = r6.b.iterator();
        r17 = r12;
        r3 = r14;
        r12 = r0;
        r14 = r5;
        r5 = r1;
        r1 = r13;
        r13 = r31;
        r28 = r2;
        r2 = r30;
        r30 = r28;
        r29 = r15;
        r15 = r10;
        r10 = r16;
        r16 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        r21 = (defpackage.j4f) r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02e4, code lost:
        if (r21 == null) goto L_0x042d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02e6, code lost:
        r31 = r8;
        r32 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r8 = r12.element;
        r0 = (float) r8;
        r23 = r8;
        r8 = r13.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f1, code lost:
        r33 = r10;
        r22 = (r0 / ((float) r8)) * ((float) 100);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r7.a = r2;
        r7.b = r5;
        r7.c = r6;
        r7.o = r14;
        r7.v = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        r7.w = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        r7.x = r12;
        r7.y = r11;
        r7.z = r4;
        r7.X = r3;
        r7.Y = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0310, code lost:
        r10 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r7.Z = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0314, code lost:
        r33 = r10;
        r10 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        r7.v0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x031a, code lost:
        r31 = r3;
        r3 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r7.w0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0320, code lost:
        r32 = r3;
        r3 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        r7.x0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0326, code lost:
        r34 = r3;
        r30 = r4;
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        r7.y0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x032e, code lost:
        r18 = r11;
        r11 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r7.z0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0334, code lost:
        r17 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        r7.C0 = 2;
        r0 = r21.b(r22, r23, r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0341, code lost:
        r8 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0343, code lost:
        if (r0 == r8) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0345, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0346, code lost:
        r16 = r31;
        r9 = r33;
        r22 = r7;
        r21 = r13;
        r19 = r17;
        r17 = r30;
        r7 = r32;
        r13 = r1;
        r1 = r2;
        r2 = r3;
        r4 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x035b, code lost:
        r0 = r9;
        r12 = r19;
        r9 = r7;
        r7 = r22;
        r28 = r2;
        r2 = r1;
        r1 = r13;
        r3 = r16;
        r13 = r21;
        r16 = r11;
        r11 = r18;
        r18 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0371, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0372, code lost:
        r12 = r0;
        r30 = r10;
        r10 = r17;
        r17 = r19;
        r28 = r2;
        r2 = r1;
        r1 = r13;
        r3 = r16;
        r13 = r21;
        r16 = r11;
        r11 = r9;
        r9 = r7;
        r7 = r22;
        r21 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x038b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x038c, code lost:
        r8 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x038e, code lost:
        r9 = r32;
        r12 = r0;
        r21 = r3;
        r16 = r11;
        r3 = r31;
        r11 = r33;
        r4 = r34;
        r28 = r10;
        r10 = r30;
        r30 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03a3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03a4, code lost:
        r17 = r12;
        r8 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03ab, code lost:
        r18 = r11;
        r8 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03af, code lost:
        r11 = r17;
        r17 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03b4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03b5, code lost:
        r34 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03b7, code lost:
        r30 = r4;
        r8 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03bb, code lost:
        r3 = r18;
        r18 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03c0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03c1, code lost:
        r34 = r30;
        r32 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03c5, code lost:
        r30 = r4;
        r8 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03c9, code lost:
        r3 = r18;
        r18 = r11;
        r11 = r17;
        r17 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03d2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03d3, code lost:
        r34 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03d5, code lost:
        r31 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03d8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03d9, code lost:
        r34 = r30;
        r30 = r4;
        r33 = r10;
        r8 = r16;
        r10 = r31;
        r31 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03e6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03e7, code lost:
        r34 = r30;
        r10 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03ec, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03ed, code lost:
        r34 = r30;
        r10 = r31;
        r31 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03f4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03f5, code lost:
        r34 = r30;
        r30 = r4;
        r33 = r10;
        r8 = r16;
        r10 = r31;
        r31 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x042d, code lost:
        r31 = r3;
        r32 = r9;
        r33 = r10;
        r3 = r18;
        r10 = r8;
        r18 = r11;
        r8 = r16;
        r11 = r17;
        r17 = r12;
        r0 = r33;
        r16 = r11;
        r11 = r18;
        r17 = r4;
        r18 = r3;
        r3 = r31;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0450, code lost:
        r30 = r4;
        r4 = r17;
        r17 = r16;
        r16 = r8;
        r8 = r10;
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x045c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x045d, code lost:
        r8 = r16;
        r13 = r4;
        r12 = r3;
        r3 = r0;
        r16 = r2;
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04c8, code lost:
        r18 = r3;
        r21 = r7;
        r4 = r10;
        r0 = r12;
        r10 = r15;
        r7 = r33;
        r3 = r34;
        r28 = r14;
        r14 = r2;
        r2 = r5;
        r5 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        r12 = r7.read(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04dd, code lost:
        r15 = r8;
        r8 = r16;
        r16 = r7;
        r7 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r13;
        r13 = r17;
        r17 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04ec, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04ed, code lost:
        r3 = r0;
        r1 = r8;
        r13 = r9;
        r12 = r14;
        r14 = r21;
        r9 = r5;
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0510, code lost:
        r16 = r30;
        r3 = r0;
        r13 = r9;
        r12 = r14;
        r14 = r21;
        r2 = 0;
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0519, code lost:
        r5 = r1;
        r1 = r8;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x051d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x051e, code lost:
        r8 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0520, code lost:
        r30 = r8;
        r8 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        r13.flush();
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r14, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r9, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x052f, code lost:
        if (r2 != false) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
        r30.getClass();
        r0 = e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0538, code lost:
        r2 = r30;
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x053d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x053f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0541, code lost:
        r8 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0545, code lost:
        r12 = r1;
        r1 = r8;
        r14 = r21;
        r2 = 0;
        r8 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x054e, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        r3.a = r2;
        r3.b = r1;
        r3.c = r6;
        r3.o = r5;
        r3.v = null;
        r3.w = null;
        r3.x = null;
        r3.y = null;
        r3.z = null;
        r3.X = null;
        r3.Y = null;
        r3.Z = null;
        r3.v0 = null;
        r3.C0 = 4;
        r0 = r2.d(r5, r10, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0572, code lost:
        if (r0 == r8) goto L_0x0574;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0574, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0575, code lost:
        r14 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        r3 = r6.b.iterator();
        r4 = (java.io.File) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0585, code lost:
        r0 = (defpackage.j4f) r3.next();
        defpackage.z68.c(r2.c, "File download. Completed", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:?, code lost:
        r14.a = r2;
        r14.b = r1;
        r14.c = r6;
        r14.o = r5;
        r14.v = r4;
        r14.w = r3;
        r14.C0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05a7, code lost:
        if (r0.f(r4, r14) == r8) goto L_0x05a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05a9, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05aa, code lost:
        r28 = r5;
        r5 = r1;
        r1 = r3;
        r3 = r28;
        r29 = r6;
        r6 = r2;
        r2 = r4;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:?, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05b8, code lost:
        r28 = r3;
        r3 = r1;
        r1 = r5;
        r5 = r28;
        r29 = r4;
        r4 = r2;
        r2 = r6;
        r6 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05c5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05c8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05d3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05d4, code lost:
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05d7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05d8, code lost:
        r12 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05d9, code lost:
        r1 = r8;
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05e9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05ea, code lost:
        r12 = r1;
        r14 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05ed, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05ee, code lost:
        r2 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05f1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05f2, code lost:
        r2 = r30;
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x05f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x05f8, code lost:
        r16 = r30;
        r14 = r21;
        r13 = r9;
        r2 = 0;
        r3 = r0;
        r9 = r5;
        r5 = r1;
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0606, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0607, code lost:
        r16 = r30;
        r13 = r9;
        r12 = r14;
        r2 = 0;
        r14 = r21;
        r9 = r5;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0615, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0616, code lost:
        r1 = r15;
        r2 = 0;
        r3 = r0;
        r9 = r5;
        r16 = r8;
        r5 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x063b, code lost:
        r12 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x063e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x063f, code lost:
        r1 = r15;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0642, code lost:
        r1 = r15;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x064f, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0650, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0652, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0653, code lost:
        r30 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x067e, code lost:
        r0 = (defpackage.j4f) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0684, code lost:
        if (r0 != null) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:?, code lost:
        r8.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x069b, code lost:
        if ((r4 instanceof java.net.SocketTimeoutException) != false) goto L_0x069d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x069e, code lost:
        r9 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x06a0, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x06a1, code lost:
        r7 = r4.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06a7, code lost:
        if ((r7 instanceof android.system.ErrnoException) == false) goto L_0x06ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06a9, code lost:
        r10 = (android.system.ErrnoException) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x06ad, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x06ae, code lost:
        if (r10 == null) goto L_0x06b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06b2, code lost:
        if ((r4 instanceof android.system.ErrnoException) != false) goto L_0x06b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06b4, code lost:
        r10 = (android.system.ErrnoException) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06b8, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x06b9, code lost:
        if (r10 == null) goto L_0x06bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x06bb, code lost:
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x06c1, code lost:
        if (r10.errno == android.system.OsConstants.ENOSPC) goto L_0x06c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x06c3, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x06c4, code lost:
        r14.a = r8;
        r14.b = r12;
        r14.c = r6;
        r14.o = r5;
        r14.v = r4;
        r14.w = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:?, code lost:
        r14.x = null;
        r14.y = null;
        r14.z = null;
        r14.X = null;
        r14.Y = null;
        r14.Z = null;
        r14.v0 = null;
        r14.w0 = null;
        r14.C0 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x06e8, code lost:
        if (r0.e(r9, r7) == r1) goto L_0x06ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x06ea, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x06eb, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x06ee, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x06f0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f4, code lost:
        if (((java.lang.Boolean) r0).booleanValue() == false) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f8, code lost:
        r8.j(r6, r5.getAbsolutePath());
        defpackage.u0g.c(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0202, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0205, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r0 = r8.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r7 = defpackage.z68.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x020c, code lost:
        if (r7 != null) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x020e, code lost:
        r30 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0215, code lost:
        if (r7.c() == false) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0217, code lost:
        r9 = defpackage.w78.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0219, code lost:
        r30 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r7.d(r9, r0, "File download. Response content length: " + r2.element, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x022e, code lost:
        r1 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0232, code lost:
        r12 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0236, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0238, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02dc A[SYNTHETIC, Splitter:B:132:0x02dc] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0345 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x04c7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0585 A[Catch:{ Exception -> 0x05d7, all -> 0x05d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x05d3 A[ExcHandler: all (th java.lang.Throwable), PHI: r1 r2 r5 r6 
      PHI: (r1v17 k4d) = (r1v18 k4d), (r1v18 k4d), (r1v21 k4d), (r1v43 k4d) binds: [B:281:0x05c9, B:282:?, B:265:0x0576, B:260:0x0550] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v12 y1b) = (r2v13 y1b), (r2v13 y1b), (r2v16 y1b), (r2v42 y1b) binds: [B:281:0x05c9, B:282:?, B:265:0x0576, B:260:0x0550] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v14 java.io.File) = (r5v15 java.io.File), (r5v15 java.io.File), (r5v18 java.io.File), (r5v27 java.io.File) binds: [B:281:0x05c9, B:282:?, B:265:0x0576, B:260:0x0550] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v12 q1b) = (r6v13 q1b), (r6v13 q1b), (r6v16 q1b), (r6v23 q1b) binds: [B:281:0x05c9, B:282:?, B:265:0x0576, B:260:0x0550] A[DONT_GENERATE, DONT_INLINE], Splitter:B:265:0x0576] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x067e A[Catch:{ all -> 0x0203 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x06a9 A[Catch:{ all -> 0x06f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x06ad A[Catch:{ all -> 0x06f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x06b0 A[Catch:{ all -> 0x06f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x06c3 A[Catch:{ all -> 0x06f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x06ea A[Catch:{ all -> 0x06ee }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x05dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0700 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0236 A[ExcHandler: all (th java.lang.Throwable), PHI: r30 
      PHI: (r30v31 k4d) = (r30v29 k4d), (r30v29 k4d), (r30v29 k4d), (r30v29 k4d), (r30v29 k4d), (r30v29 k4d), (r30v32 k4d), (r30v32 k4d) binds: [B:103:0x0243, B:325:0x0646, B:119:0x0287, B:120:?, B:117:0x0280, B:118:?, B:93:0x021b, B:94:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:103:0x0243] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x023a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:73:0x01ee] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(defpackage.k4d r31, defpackage.q1b r32, java.io.File r33, java.io.File r34, boolean r35, kotlin.coroutines.Continuation r36) {
        /*
            r30 = this;
            r11 = r30
            r12 = r31
            r0 = r36
            java.lang.String r13 = "File download. Response content length: "
            boolean r1 = r0 instanceof defpackage.w1b
            if (r1 == 0) goto L_0x001c
            r1 = r0
            w1b r1 = (defpackage.w1b) r1
            int r2 = r1.C0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001c
            int r2 = r2 - r3
            r1.C0 = r2
        L_0x001a:
            r14 = r1
            goto L_0x0022
        L_0x001c:
            w1b r1 = new w1b
            r1.<init>(r11, r0)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r0 = r14.A0
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.C0
            r16 = 0
            switch(r1) {
                case 0: goto L_0x0181;
                case 1: goto L_0x015e;
                case 2: goto L_0x00f2;
                case 3: goto L_0x00a9;
                case 4: goto L_0x0087;
                case 5: goto L_0x0061;
                case 6: goto L_0x0037;
                default: goto L_0x002f;
            }
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0037:
            java.lang.Object r1 = r14.w
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.io.Serializable r2 = r14.v
            java.lang.Exception r2 = (java.lang.Exception) r2
            java.io.File r3 = r14.o
            q1b r4 = r14.c
            k4d r5 = r14.b
            y1b r6 = r14.a
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x0055 }
            r12 = r5
            r8 = r6
            r10 = 0
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r1 = r15
            r2 = 0
            goto L_0x06eb
        L_0x0055:
            r0 = move-exception
            r12 = r5
            r8 = r6
            r10 = 0
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r1 = r15
            r2 = 0
            goto L_0x06f2
        L_0x0061:
            java.lang.Object r1 = r14.w
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.io.Serializable r2 = r14.v
            java.io.File r2 = (java.io.File) r2
            java.io.File r3 = r14.o
            q1b r4 = r14.c
            k4d r5 = r14.b
            y1b r6 = r14.a
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x0077 }
            r8 = r15
            goto L_0x05b6
        L_0x0077:
            r0 = move-exception
            r8 = r15
        L_0x0079:
            r28 = r3
            r3 = r1
            r1 = r5
            r5 = r28
            r29 = r4
            r4 = r2
            r2 = r6
            r6 = r29
            goto L_0x05c9
        L_0x0087:
            java.io.File r1 = r14.o
            q1b r2 = r14.c
            k4d r3 = r14.b
            y1b r4 = r14.a
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ Exception -> 0x00a0, all -> 0x0099 }
            r5 = r1
            r6 = r2
            r1 = r3
            r2 = r4
            r8 = r15
            goto L_0x0576
        L_0x0099:
            r0 = move-exception
            r5 = r1
            r6 = r2
            r1 = r3
            r8 = r4
            goto L_0x070d
        L_0x00a0:
            r0 = move-exception
            r5 = r1
            r6 = r2
            r12 = r3
            r8 = r4
        L_0x00a5:
            r1 = r15
        L_0x00a6:
            r2 = 0
            goto L_0x0668
        L_0x00a9:
            long r1 = r14.y0
            boolean r3 = r14.x0
            byte[] r4 = r14.v0
            java.io.InputStream r5 = r14.Z
            java.io.OutputStream r11 = r14.Y
            java.io.Closeable r12 = r14.X
            java.io.Closeable r13 = r14.z
            java.io.File r6 = r14.y
            kotlin.jvm.internal.Ref$LongRef r7 = r14.x
            java.lang.Object r8 = r14.w
            kotlin.jvm.internal.Ref$LongRef r8 = (kotlin.jvm.internal.Ref.LongRef) r8
            java.io.Serializable r10 = r14.v
            java.io.File r10 = (java.io.File) r10
            java.io.File r9 = r14.o
            r16 = r1
            q1b r1 = r14.c
            k4d r2 = r14.b
            r30 = r1
            y1b r1 = r14.a
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x00e7 }
            r0 = r7
            r21 = r14
            r18 = r16
            r16 = r1
            r7 = r5
            r5 = r9
            r17 = r11
            r14 = r12
            r9 = r13
            r1 = 3
            r11 = r6
            r13 = r8
            r8 = r15
            r6 = r30
            goto L_0x04d9
        L_0x00e7:
            r0 = move-exception
            r6 = r30
            r3 = r0
            r16 = r1
            r5 = r2
            r1 = r15
        L_0x00ef:
            r2 = 0
            goto L_0x061e
        L_0x00f2:
            int r1 = r14.z0
            long r2 = r14.y0
            boolean r4 = r14.x0
            java.util.Iterator r5 = r14.w0
            byte[] r6 = r14.v0
            java.io.InputStream r7 = r14.Z
            java.io.OutputStream r8 = r14.Y
            java.io.Closeable r9 = r14.X
            java.io.Closeable r10 = r14.z
            java.io.File r11 = r14.y
            kotlin.jvm.internal.Ref$LongRef r12 = r14.x
            java.lang.Object r13 = r14.w
            kotlin.jvm.internal.Ref$LongRef r13 = (kotlin.jvm.internal.Ref.LongRef) r13
            r16 = r1
            java.io.Serializable r1 = r14.v
            java.io.File r1 = (java.io.File) r1
            r30 = r1
            java.io.File r1 = r14.o
            r17 = r1
            q1b r1 = r14.c
            r31 = r1
            k4d r1 = r14.b
            r32 = r1
            y1b r1 = r14.a
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x0143 }
            r18 = r11
            r19 = r12
            r21 = r13
            r22 = r14
            r11 = r16
            r14 = r17
            r12 = 2
            r13 = r8
            r16 = r9
            r17 = r10
            r8 = r15
            r15 = r30
            r10 = r6
            r9 = r7
            r6 = r31
            r7 = r5
            r5 = r32
            goto L_0x0359
        L_0x0143:
            r0 = move-exception
            r21 = r2
            r3 = r9
            r18 = r11
            r2 = r1
            r9 = r5
            r11 = r7
            r1 = r8
            r7 = r14
            r8 = r15
            r14 = r17
            r15 = r30
            r5 = r32
            r30 = r6
            r17 = r12
            r6 = r31
            r12 = r0
            goto L_0x0402
        L_0x015e:
            boolean r1 = r14.x0
            kotlin.jvm.internal.Ref$LongRef r2 = r14.x
            java.lang.Object r3 = r14.w
            ptc r3 = (defpackage.ptc) r3
            java.io.Serializable r4 = r14.v
            java.io.File r4 = (java.io.File) r4
            java.io.File r5 = r14.o
            q1b r6 = r14.c
            k4d r7 = r14.b
            y1b r8 = r14.a
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ Exception -> 0x017d, all -> 0x0179 }
            r12 = r7
            r11 = 0
            goto L_0x01ee
        L_0x0179:
            r0 = move-exception
            r1 = r7
            goto L_0x070d
        L_0x017d:
            r0 = move-exception
            r12 = r7
            goto L_0x00a5
        L_0x0181:
            kotlin.ResultKt.throwOnFailure(r0)
            ptc r0 = r12.x     // Catch:{ Exception -> 0x065f, all -> 0x0656 }
            kotlin.jvm.internal.Ref$LongRef r10 = new kotlin.jvm.internal.Ref$LongRef     // Catch:{ Exception -> 0x065f, all -> 0x0656 }
            r10.<init>()     // Catch:{ Exception -> 0x065f, all -> 0x0656 }
            if (r0 == 0) goto L_0x01a4
            long r1 = r0.n()     // Catch:{ Exception -> 0x019c, all -> 0x0193 }
            r3 = r1
            goto L_0x01a6
        L_0x0193:
            r0 = move-exception
            r6 = r32
            r5 = r33
            r8 = r11
        L_0x0199:
            r1 = r12
            goto L_0x070d
        L_0x019c:
            r0 = move-exception
            r6 = r32
            r5 = r33
            r8 = r11
            goto L_0x00a5
        L_0x01a4:
            r3 = r16
        L_0x01a6:
            r10.element = r3     // Catch:{ Exception -> 0x065f, all -> 0x0656 }
            r14.a = r11     // Catch:{ Exception -> 0x065f, all -> 0x0656 }
            r14.b = r12     // Catch:{ Exception -> 0x065f, all -> 0x0656 }
            r9 = r32
            r14.c = r9     // Catch:{ Exception -> 0x065f, all -> 0x0656 }
            r8 = r33
            r14.o = r8     // Catch:{ Exception -> 0x065f, all -> 0x0656 }
            r7 = r34
            r14.v = r7     // Catch:{ Exception -> 0x065f, all -> 0x0656 }
            r14.w = r0     // Catch:{ Exception -> 0x065f, all -> 0x0656 }
            r14.x = r10     // Catch:{ Exception -> 0x065f, all -> 0x0656 }
            r6 = r35
            r14.x0 = r6     // Catch:{ Exception -> 0x065f, all -> 0x0656 }
            r5 = 1
            r14.C0 = r5     // Catch:{ Exception -> 0x065f, all -> 0x0656 }
            r1 = r30
            r2 = r0
            r20 = r5
            r5 = r33
            r11 = 2
            r6 = r31
            r7 = r32
            r8 = r34
            r11 = r20
            r9 = r35
            r18 = r10
            r11 = 0
            r10 = r14
            java.lang.Object r1 = r1.g(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x065f, all -> 0x0656 }
            if (r1 != r15) goto L_0x01e0
            return r15
        L_0x01e0:
            r8 = r30
            r6 = r32
            r5 = r33
            r4 = r34
            r3 = r0
            r0 = r1
            r2 = r18
            r1 = r35
        L_0x01ee:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x023e, all -> 0x023a }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x023e, all -> 0x023a }
            if (r0 == 0) goto L_0x0208
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x0205 }
            java.lang.String r1 = r5.getAbsolutePath()
            r8.j(r6, r1)
            defpackage.u0g.c(r12)
            return r0
        L_0x0203:
            r0 = move-exception
            goto L_0x0199
        L_0x0205:
            r0 = move-exception
            goto L_0x00a5
        L_0x0208:
            java.lang.String r0 = r8.c     // Catch:{ Exception -> 0x023e, all -> 0x023a }
            a67 r7 = defpackage.z68.b     // Catch:{ Exception -> 0x0652, all -> 0x023a }
            if (r7 != 0) goto L_0x0211
        L_0x020e:
            r30 = r12
            goto L_0x0243
        L_0x0211:
            boolean r9 = r7.c()     // Catch:{ Exception -> 0x023e, all -> 0x023a }
            if (r9 == 0) goto L_0x020e
            w78 r9 = defpackage.w78.o     // Catch:{ Exception -> 0x023e, all -> 0x023a }
            r30 = r12
            long r11 = r2.element     // Catch:{ Exception -> 0x0238, all -> 0x0236 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0238, all -> 0x0236 }
            r10.<init>(r13)     // Catch:{ Exception -> 0x0238, all -> 0x0236 }
            r10.append(r11)     // Catch:{ Exception -> 0x0238, all -> 0x0236 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0238, all -> 0x0236 }
            r11 = 0
            r7.d(r9, r0, r10, r11)     // Catch:{ Exception -> 0x0238, all -> 0x0236 }
            goto L_0x0243
        L_0x022e:
            r1 = r30
            goto L_0x070d
        L_0x0232:
            r12 = r30
            goto L_0x00a5
        L_0x0236:
            r0 = move-exception
            goto L_0x022e
        L_0x0238:
            r0 = move-exception
            goto L_0x0232
        L_0x023a:
            r0 = move-exception
            r30 = r12
            goto L_0x022e
        L_0x023e:
            r0 = move-exception
            r30 = r12
            goto L_0x00a5
        L_0x0243:
            kotlin.jvm.internal.Ref$LongRef r0 = new kotlin.jvm.internal.Ref$LongRef     // Catch:{ Exception -> 0x063e, all -> 0x0236 }
            r0.<init>()     // Catch:{ Exception -> 0x063e, all -> 0x0236 }
            long r9 = r5.length()     // Catch:{ Exception -> 0x063e, all -> 0x0236 }
            r0.element = r9     // Catch:{ Exception -> 0x063e, all -> 0x0236 }
            long r11 = r2.element     // Catch:{ Exception -> 0x063e, all -> 0x0236 }
            long r11 = r11 + r9
            r2.element = r11     // Catch:{ Exception -> 0x063e, all -> 0x0236 }
            if (r3 == 0) goto L_0x0642
            java.io.InputStream r13 = r3.m()     // Catch:{ Exception -> 0x063e, all -> 0x0236 }
            yqf r3 = r8.a     // Catch:{ Exception -> 0x063e, all -> 0x0236 }
            mi3 r3 = r3.c()     // Catch:{ Exception -> 0x063e, all -> 0x0236 }
            int[] r7 = defpackage.mh3.$EnumSwitchMapping$0     // Catch:{ Exception -> 0x063e, all -> 0x0236 }
            int r3 = r3.ordinal()     // Catch:{ Exception -> 0x063e, all -> 0x0236 }
            r3 = r7[r3]     // Catch:{ Exception -> 0x063e, all -> 0x0236 }
            r7 = 1
            if (r3 == r7) goto L_0x0276
            r7 = 2
            if (r3 == r7) goto L_0x0276
            r7 = 3
            if (r3 == r7) goto L_0x0273
            r3 = 4096(0x1000, float:5.74E-42)
            goto L_0x027a
        L_0x0273:
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x027a
        L_0x0276:
            r7 = 3
            r3 = 32768(0x8000, float:4.5918E-41)
        L_0x027a:
            java.io.File r9 = r5.getParentFile()     // Catch:{ Exception -> 0x063e, all -> 0x0236 }
            if (r9 == 0) goto L_0x0287
            boolean r9 = r9.mkdirs()     // Catch:{ Exception -> 0x0238, all -> 0x0236 }
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)     // Catch:{ Exception -> 0x0238, all -> 0x0236 }
        L_0x0287:
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x063e, all -> 0x0236 }
            r9 = 1
            r12.<init>(r5, r9)     // Catch:{ Exception -> 0x063e, all -> 0x0236 }
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0615 }
            int r10 = r13.read(r3)     // Catch:{ all -> 0x0615 }
            r11 = r5
            r9 = r13
            r21 = r14
            r17 = r16
            r14 = r12
            r16 = r9
            r13 = r14
            r12 = r10
            r10 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r30
        L_0x02a4:
            if (r12 < 0) goto L_0x0520
            r30 = r8
            long r7 = r0.element     // Catch:{ all -> 0x051d }
            r31 = r3
            r32 = r4
            long r3 = (long) r12     // Catch:{ all -> 0x051d }
            long r7 = r7 + r3
            r0.element = r7     // Catch:{ all -> 0x051d }
            java.util.concurrent.CopyOnWriteArrayList r3 = r6.b     // Catch:{ all -> 0x051d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x051d }
            r8 = r32
            r4 = r9
            r18 = r17
            r7 = r21
            r9 = r3
            r17 = r12
            r3 = r14
            r12 = r0
            r14 = r5
            r5 = r1
            r1 = r13
            r13 = r31
            r28 = r2
            r2 = r30
            r30 = r28
            r29 = r15
            r15 = r10
            r10 = r16
            r16 = r29
        L_0x02d6:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0508 }
            if (r0 == 0) goto L_0x046e
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x045c }
            r21 = r0
            j4f r21 = (defpackage.j4f) r21     // Catch:{ all -> 0x045c }
            if (r21 == 0) goto L_0x042d
            r31 = r8
            r32 = r9
            long r8 = r12.element     // Catch:{ all -> 0x03f4 }
            float r0 = (float) r8     // Catch:{ all -> 0x03f4 }
            r23 = r8
            long r8 = r13.element     // Catch:{ all -> 0x03f4 }
            r33 = r10
            float r10 = (float) r8
            float r0 = r0 / r10
            r10 = 100
            float r10 = (float) r10
            float r22 = r0 * r10
            r7.a = r2     // Catch:{ all -> 0x03e6 }
            r7.b = r5     // Catch:{ all -> 0x03e6 }
            r7.c = r6     // Catch:{ all -> 0x03e6 }
            r7.o = r14     // Catch:{ all -> 0x03e6 }
            r7.v = r15     // Catch:{ all -> 0x03e6 }
            r7.w = r13     // Catch:{ all -> 0x03ec }
            r7.x = r12     // Catch:{ all -> 0x03e6 }
            r7.y = r11     // Catch:{ all -> 0x03e6 }
            r7.z = r4     // Catch:{ all -> 0x03e6 }
            r7.X = r3     // Catch:{ all -> 0x03e6 }
            r7.Y = r1     // Catch:{ all -> 0x03e6 }
            r10 = r33
            r7.Z = r10     // Catch:{ all -> 0x03d8 }
            r33 = r10
            r10 = r31
            r7.v0 = r10     // Catch:{ all -> 0x03d2 }
            r31 = r3
            r3 = r32
            r7.w0 = r3     // Catch:{ all -> 0x03c0 }
            r32 = r3
            r3 = r30
            r7.x0 = r3     // Catch:{ all -> 0x03b4 }
            r34 = r3
            r30 = r4
            r3 = r18
            r7.y0 = r3     // Catch:{ all -> 0x03aa }
            r18 = r11
            r11 = r17
            r7.z0 = r11     // Catch:{ all -> 0x03a3 }
            r17 = r12
            r12 = 2
            r7.C0 = r12     // Catch:{ all -> 0x038b }
            r25 = r8
            r27 = r7
            java.lang.Object r0 = r21.b(r22, r23, r25, r27)     // Catch:{ all -> 0x038b }
            r8 = r16
            if (r0 != r8) goto L_0x0346
            return r8
        L_0x0346:
            r16 = r31
            r9 = r33
            r22 = r7
            r21 = r13
            r19 = r17
            r17 = r30
            r7 = r32
            r13 = r1
            r1 = r2
            r2 = r3
            r4 = r34
        L_0x0359:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0371 }
            r0 = r9
            r12 = r19
            r9 = r7
            r7 = r22
            r28 = r2
            r2 = r1
            r1 = r13
            r3 = r16
            r13 = r21
            r16 = r11
            r11 = r18
            r18 = r28
            goto L_0x0450
        L_0x0371:
            r0 = move-exception
            r12 = r0
            r30 = r10
            r10 = r17
            r17 = r19
            r28 = r2
            r2 = r1
            r1 = r13
            r3 = r16
            r13 = r21
            r16 = r11
            r11 = r9
            r9 = r7
            r7 = r22
            r21 = r28
            goto L_0x0402
        L_0x038b:
            r0 = move-exception
            r8 = r16
        L_0x038e:
            r9 = r32
            r12 = r0
            r21 = r3
            r16 = r11
            r3 = r31
            r11 = r33
            r4 = r34
            r28 = r10
            r10 = r30
            r30 = r28
            goto L_0x0402
        L_0x03a3:
            r0 = move-exception
            r17 = r12
            r8 = r16
        L_0x03a8:
            r12 = 2
            goto L_0x038e
        L_0x03aa:
            r0 = move-exception
            r18 = r11
            r8 = r16
        L_0x03af:
            r11 = r17
            r17 = r12
            goto L_0x03a8
        L_0x03b4:
            r0 = move-exception
            r34 = r3
        L_0x03b7:
            r30 = r4
            r8 = r16
        L_0x03bb:
            r3 = r18
            r18 = r11
            goto L_0x03af
        L_0x03c0:
            r0 = move-exception
            r34 = r30
            r32 = r3
        L_0x03c5:
            r30 = r4
            r8 = r16
        L_0x03c9:
            r3 = r18
            r18 = r11
            r11 = r17
            r17 = r12
            goto L_0x03a8
        L_0x03d2:
            r0 = move-exception
            r34 = r30
        L_0x03d5:
            r31 = r3
            goto L_0x03c5
        L_0x03d8:
            r0 = move-exception
            r34 = r30
            r30 = r4
            r33 = r10
            r8 = r16
            r10 = r31
            r31 = r3
            goto L_0x03c9
        L_0x03e6:
            r0 = move-exception
            r34 = r30
            r10 = r31
            goto L_0x03d5
        L_0x03ec:
            r0 = move-exception
            r34 = r30
            r10 = r31
            r31 = r3
            goto L_0x03b7
        L_0x03f4:
            r0 = move-exception
            r34 = r30
            r30 = r4
            r33 = r10
            r8 = r16
            r10 = r31
            r31 = r3
            goto L_0x03bb
        L_0x0402:
            java.lang.String r0 = r2.c     // Catch:{ all -> 0x0421 }
            r31 = r1
            java.lang.String r1 = "File download. onResponse: failed to notify listener on download progress"
            defpackage.z68.f(r0, r1, r12)     // Catch:{ all -> 0x0421 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0421 }
            r1 = r31
            r12 = r17
            r17 = r16
            r16 = r8
            r8 = r30
            r30 = r4
            r4 = r10
            r10 = r11
            r11 = r18
            r18 = r21
            goto L_0x02d6
        L_0x0421:
            r0 = move-exception
            r16 = r2
            r12 = r3
            r1 = r8
            r13 = r10
            r9 = r14
            r2 = 0
            r3 = r0
        L_0x042a:
            r14 = r7
            goto L_0x061e
        L_0x042d:
            r34 = r30
            r31 = r3
            r30 = r4
            r32 = r9
            r33 = r10
            r3 = r18
            r10 = r8
            r18 = r11
            r8 = r16
            r11 = r17
            r17 = r12
            r0 = r33
            r16 = r11
            r11 = r18
            r17 = r30
            r18 = r3
            r3 = r31
            r4 = r34
        L_0x0450:
            r30 = r4
            r4 = r17
            r17 = r16
            r16 = r8
            r8 = r10
            r10 = r0
            goto L_0x02d6
        L_0x045c:
            r0 = move-exception
            r31 = r3
            r30 = r4
            r8 = r16
            r13 = r30
            r12 = r31
            r3 = r0
            r16 = r2
            r1 = r8
        L_0x046b:
            r9 = r14
            r2 = 0
            goto L_0x042a
        L_0x046e:
            r34 = r30
            r31 = r3
            r30 = r4
            r33 = r10
            r3 = r18
            r10 = r8
            r18 = r11
            r8 = r16
            r11 = r17
            r17 = r12
            r12 = 0
            r1.write(r10, r12, r11)     // Catch:{ all -> 0x0500 }
            r9 = r13
            long r12 = (long) r11     // Catch:{ all -> 0x0500 }
            long r3 = r3 + r12
            r7.a = r2     // Catch:{ all -> 0x0500 }
            r7.b = r5     // Catch:{ all -> 0x0500 }
            r7.c = r6     // Catch:{ all -> 0x0500 }
            r7.o = r14     // Catch:{ all -> 0x0500 }
            r7.v = r15     // Catch:{ all -> 0x0500 }
            r13 = r9
            r7.w = r13     // Catch:{ all -> 0x0500 }
            r12 = r17
            r7.x = r12     // Catch:{ all -> 0x0500 }
            r11 = r18
            r7.y = r11     // Catch:{ all -> 0x0500 }
            r9 = r30
            r7.z = r9     // Catch:{ all -> 0x04fe }
            r16 = r2
            r2 = r31
            r7.X = r2     // Catch:{ all -> 0x04f7 }
            r7.Y = r1     // Catch:{ all -> 0x04f7 }
            r17 = r1
            r1 = r33
            r7.Z = r1     // Catch:{ all -> 0x04f7 }
            r7.v0 = r10     // Catch:{ all -> 0x04f7 }
            r33 = r1
            r1 = 0
            r7.w0 = r1     // Catch:{ all -> 0x04f7 }
            r1 = r34
            r7.x0 = r1     // Catch:{ all -> 0x04f7 }
            r7.y0 = r3     // Catch:{ all -> 0x04f7 }
            r34 = r1
            r1 = 3
            r7.C0 = r1     // Catch:{ all -> 0x04f7 }
            java.lang.Object r0 = defpackage.f6e.M(r7)     // Catch:{ all -> 0x04f7 }
            if (r0 != r8) goto L_0x04c8
            return r8
        L_0x04c8:
            r18 = r3
            r21 = r7
            r4 = r10
            r0 = r12
            r10 = r15
            r7 = r33
            r3 = r34
            r28 = r14
            r14 = r2
            r2 = r5
            r5 = r28
        L_0x04d9:
            int r12 = r7.read(r4)     // Catch:{ all -> 0x04ec }
            r15 = r8
            r8 = r16
            r16 = r7
            r7 = r1
            r1 = r2
            r2 = r3
            r3 = r13
            r13 = r17
            r17 = r18
            goto L_0x02a4
        L_0x04ec:
            r0 = move-exception
            r3 = r0
            r1 = r8
            r13 = r9
            r12 = r14
            r14 = r21
            r9 = r5
            r5 = r2
            goto L_0x00ef
        L_0x04f7:
            r0 = move-exception
        L_0x04f8:
            r3 = r0
            r12 = r2
            r1 = r8
            r13 = r9
            goto L_0x046b
        L_0x04fe:
            r0 = move-exception
            goto L_0x0503
        L_0x0500:
            r0 = move-exception
            r9 = r30
        L_0x0503:
            r16 = r2
            r2 = r31
            goto L_0x04f8
        L_0x0508:
            r0 = move-exception
            r9 = r4
            r8 = r16
            r16 = r2
            r2 = r3
            goto L_0x04f8
        L_0x0510:
            r16 = r30
            r3 = r0
            r13 = r9
            r12 = r14
            r14 = r21
            r2 = 0
            r9 = r5
        L_0x0519:
            r5 = r1
            r1 = r8
            goto L_0x061e
        L_0x051d:
            r0 = move-exception
            r8 = r15
            goto L_0x0510
        L_0x0520:
            r30 = r8
            r8 = r15
            r13.flush()     // Catch:{ all -> 0x0606 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0606 }
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r14, r3)     // Catch:{ all -> 0x05f7 }
            kotlin.io.CloseableKt.closeFinally(r9, r3)     // Catch:{ Exception -> 0x05f1, all -> 0x05ed }
            if (r2 == 0) goto L_0x054e
            r30.getClass()     // Catch:{ Exception -> 0x053f, all -> 0x053d }
            java.lang.String r0 = e(r1)     // Catch:{ Exception -> 0x053f, all -> 0x053d }
        L_0x0538:
            r2 = r30
            r3 = r21
            goto L_0x0550
        L_0x053d:
            r0 = move-exception
            goto L_0x0541
        L_0x053f:
            r0 = move-exception
            goto L_0x0545
        L_0x0541:
            r8 = r30
            goto L_0x070d
        L_0x0545:
            r12 = r1
            r1 = r8
            r14 = r21
            r2 = 0
            r8 = r30
            goto L_0x0668
        L_0x054e:
            r0 = 0
            goto L_0x0538
        L_0x0550:
            r3.a = r2     // Catch:{ Exception -> 0x05e9, all -> 0x05d3 }
            r3.b = r1     // Catch:{ Exception -> 0x05e9, all -> 0x05d3 }
            r3.c = r6     // Catch:{ Exception -> 0x05e9, all -> 0x05d3 }
            r3.o = r5     // Catch:{ Exception -> 0x05e9, all -> 0x05d3 }
            r4 = 0
            r3.v = r4     // Catch:{ Exception -> 0x05e9, all -> 0x05d3 }
            r3.w = r4     // Catch:{ Exception -> 0x05e9, all -> 0x05d3 }
            r3.x = r4     // Catch:{ Exception -> 0x05e9, all -> 0x05d3 }
            r3.y = r4     // Catch:{ Exception -> 0x05e9, all -> 0x05d3 }
            r3.z = r4     // Catch:{ Exception -> 0x05e9, all -> 0x05d3 }
            r3.X = r4     // Catch:{ Exception -> 0x05e9, all -> 0x05d3 }
            r3.Y = r4     // Catch:{ Exception -> 0x05e9, all -> 0x05d3 }
            r3.Z = r4     // Catch:{ Exception -> 0x05e9, all -> 0x05d3 }
            r3.v0 = r4     // Catch:{ Exception -> 0x05e9, all -> 0x05d3 }
            r4 = 4
            r3.C0 = r4     // Catch:{ Exception -> 0x05e9, all -> 0x05d3 }
            java.lang.Object r0 = r2.d(r5, r10, r0, r3)     // Catch:{ Exception -> 0x05e9, all -> 0x05d3 }
            if (r0 != r8) goto L_0x0575
            return r8
        L_0x0575:
            r14 = r3
        L_0x0576:
            java.io.File r0 = (java.io.File) r0     // Catch:{ Exception -> 0x05d7, all -> 0x05d3 }
            java.util.concurrent.CopyOnWriteArrayList r3 = r6.b     // Catch:{ Exception -> 0x05d7, all -> 0x05d3 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x05d7, all -> 0x05d3 }
            r4 = r0
        L_0x057f:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x05d7, all -> 0x05d3 }
            if (r0 == 0) goto L_0x05dd
            java.lang.Object r0 = r3.next()     // Catch:{ Exception -> 0x05d7, all -> 0x05d3 }
            j4f r0 = (defpackage.j4f) r0     // Catch:{ Exception -> 0x05d7, all -> 0x05d3 }
            java.lang.String r7 = r2.c     // Catch:{ Exception -> 0x05d7, all -> 0x05d3 }
            java.lang.String r9 = "File download. Completed"
            defpackage.z68.c(r7, r9, new java.lang.Object[0])     // Catch:{ Exception -> 0x05d7, all -> 0x05d3 }
            if (r0 == 0) goto L_0x057f
            r14.a = r2     // Catch:{ all -> 0x05c8 }
            r14.b = r1     // Catch:{ all -> 0x05c8 }
            r14.c = r6     // Catch:{ all -> 0x05c8 }
            r14.o = r5     // Catch:{ all -> 0x05c8 }
            r14.v = r4     // Catch:{ all -> 0x05c8 }
            r14.w = r3     // Catch:{ all -> 0x05c8 }
            r7 = 5
            r14.C0 = r7     // Catch:{ all -> 0x05c8 }
            java.lang.Object r0 = r0.f(r4, r14)     // Catch:{ all -> 0x05c8 }
            if (r0 != r8) goto L_0x05aa
            return r8
        L_0x05aa:
            r28 = r5
            r5 = r1
            r1 = r3
            r3 = r28
            r29 = r6
            r6 = r2
            r2 = r4
            r4 = r29
        L_0x05b6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x05c5 }
            r28 = r3
            r3 = r1
            r1 = r5
            r5 = r28
            r29 = r4
            r4 = r2
            r2 = r6
            r6 = r29
            goto L_0x057f
        L_0x05c5:
            r0 = move-exception
            goto L_0x0079
        L_0x05c8:
            r0 = move-exception
        L_0x05c9:
            java.lang.String r7 = r2.c     // Catch:{ Exception -> 0x05d7, all -> 0x05d3 }
            java.lang.String r9 = "File download. onResponse: failed to notify listener on download fully completed"
            defpackage.z68.f(r7, r9, r0)     // Catch:{ Exception -> 0x05d7, all -> 0x05d3 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x05d7, all -> 0x05d3 }
            goto L_0x057f
        L_0x05d3:
            r0 = move-exception
        L_0x05d4:
            r8 = r2
            goto L_0x070d
        L_0x05d7:
            r0 = move-exception
            r12 = r1
        L_0x05d9:
            r1 = r8
            r8 = r2
            goto L_0x00a6
        L_0x05dd:
            java.lang.String r0 = r5.getAbsolutePath()
            r2.j(r6, r0)
            defpackage.u0g.c(r1)
            goto L_0x070a
        L_0x05e9:
            r0 = move-exception
        L_0x05ea:
            r12 = r1
            r14 = r3
            goto L_0x05d9
        L_0x05ed:
            r0 = move-exception
            r2 = r30
            goto L_0x05d4
        L_0x05f1:
            r0 = move-exception
            r2 = r30
            r3 = r21
            goto L_0x05ea
        L_0x05f7:
            r0 = move-exception
            r2 = r30
            r3 = r21
            r16 = r2
            r14 = r3
            r13 = r9
            r2 = 0
            r3 = r0
            r9 = r5
            r5 = r1
            r1 = r8
            goto L_0x0627
        L_0x0606:
            r0 = move-exception
            r2 = r30
            r3 = r21
            r16 = r2
            r13 = r9
            r12 = r14
            r2 = 0
            r14 = r3
            r9 = r5
            r3 = r0
            goto L_0x0519
        L_0x0615:
            r0 = move-exception
            r1 = r15
            r2 = 0
            r3 = r0
            r9 = r5
            r16 = r8
            r5 = r30
        L_0x061e:
            throw r3     // Catch:{ all -> 0x061f }
        L_0x061f:
            r0 = move-exception
            r4 = r0
            kotlin.io.CloseableKt.closeFinally(r12, r3)     // Catch:{ all -> 0x0625 }
            throw r4     // Catch:{ all -> 0x0625 }
        L_0x0625:
            r0 = move-exception
            r3 = r0
        L_0x0627:
            throw r3     // Catch:{ all -> 0x0628 }
        L_0x0628:
            r0 = move-exception
            r4 = r0
            kotlin.io.CloseableKt.closeFinally(r13, r3)     // Catch:{ Exception -> 0x0635, all -> 0x062e }
            throw r4     // Catch:{ Exception -> 0x0635, all -> 0x062e }
        L_0x062e:
            r0 = move-exception
            r1 = r5
            r5 = r9
            r8 = r16
            goto L_0x070d
        L_0x0635:
            r0 = move-exception
            r12 = r5
            r5 = r9
            r8 = r16
            goto L_0x0668
        L_0x063b:
            r12 = r30
            goto L_0x0668
        L_0x063e:
            r0 = move-exception
        L_0x063f:
            r1 = r15
            r2 = 0
            goto L_0x063b
        L_0x0642:
            r1 = r15
            r2 = 0
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0650, all -> 0x0236 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0650, all -> 0x0236 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0650, all -> 0x0236 }
            throw r3     // Catch:{ Exception -> 0x0650, all -> 0x0236 }
        L_0x0650:
            r0 = move-exception
            goto L_0x063b
        L_0x0652:
            r0 = move-exception
            r30 = r12
            goto L_0x063f
        L_0x0656:
            r0 = move-exception
            r8 = r30
            r6 = r32
            r5 = r33
            goto L_0x0199
        L_0x065f:
            r0 = move-exception
            r1 = r15
            r2 = 0
            r8 = r30
            r6 = r32
            r5 = r33
        L_0x0668:
            java.lang.String r3 = r8.c     // Catch:{ all -> 0x0203 }
            java.lang.String r4 = "File download. Exception while downloading file"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0203 }
            defpackage.z68.h(r3, r0, r4, r7)     // Catch:{ all -> 0x0203 }
            java.util.concurrent.CopyOnWriteArrayList r3 = r6.b     // Catch:{ all -> 0x0203 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0203 }
            r4 = r0
        L_0x0678:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0203 }
            if (r0 == 0) goto L_0x0700
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0203 }
            j4f r0 = (defpackage.j4f) r0     // Catch:{ all -> 0x0203 }
            if (r0 == 0) goto L_0x06fd
            r8.getClass()     // Catch:{ all -> 0x06f0 }
            boolean r7 = r4 instanceof java.net.SocketException     // Catch:{ all -> 0x06f0 }
            if (r7 != 0) goto L_0x06a0
            java.lang.Throwable r7 = r4.getCause()     // Catch:{ all -> 0x06f0 }
            boolean r7 = r7 instanceof java.net.SocketException     // Catch:{ all -> 0x06f0 }
            if (r7 != 0) goto L_0x06a0
            boolean r7 = r4 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x06f0 }
            if (r7 != 0) goto L_0x06a0
            boolean r7 = r4 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x06f0 }
            if (r7 == 0) goto L_0x069e
            goto L_0x06a0
        L_0x069e:
            r9 = r2
            goto L_0x06a1
        L_0x06a0:
            r9 = 1
        L_0x06a1:
            java.lang.Throwable r7 = r4.getCause()     // Catch:{ all -> 0x06f0 }
            boolean r10 = r7 instanceof android.system.ErrnoException     // Catch:{ all -> 0x06f0 }
            if (r10 == 0) goto L_0x06ad
            r10 = r7
            android.system.ErrnoException r10 = (android.system.ErrnoException) r10     // Catch:{ all -> 0x06f0 }
            goto L_0x06ae
        L_0x06ad:
            r10 = 0
        L_0x06ae:
            if (r10 != 0) goto L_0x06bd
            boolean r7 = r4 instanceof android.system.ErrnoException     // Catch:{ all -> 0x06f0 }
            if (r7 == 0) goto L_0x06b8
            r10 = r4
            android.system.ErrnoException r10 = (android.system.ErrnoException) r10     // Catch:{ all -> 0x06f0 }
            goto L_0x06b9
        L_0x06b8:
            r10 = 0
        L_0x06b9:
            if (r10 != 0) goto L_0x06bd
        L_0x06bb:
            r7 = r2
            goto L_0x06c4
        L_0x06bd:
            int r7 = r10.errno     // Catch:{ all -> 0x06f0 }
            int r10 = android.system.OsConstants.ENOSPC     // Catch:{ all -> 0x06f0 }
            if (r7 != r10) goto L_0x06bb
            r7 = 1
        L_0x06c4:
            r14.a = r8     // Catch:{ all -> 0x06f0 }
            r14.b = r12     // Catch:{ all -> 0x06f0 }
            r14.c = r6     // Catch:{ all -> 0x06f0 }
            r14.o = r5     // Catch:{ all -> 0x06f0 }
            r14.v = r4     // Catch:{ all -> 0x06f0 }
            r14.w = r3     // Catch:{ all -> 0x06f0 }
            r10 = 0
            r14.x = r10     // Catch:{ all -> 0x06ee }
            r14.y = r10     // Catch:{ all -> 0x06ee }
            r14.z = r10     // Catch:{ all -> 0x06ee }
            r14.X = r10     // Catch:{ all -> 0x06ee }
            r14.Y = r10     // Catch:{ all -> 0x06ee }
            r14.Z = r10     // Catch:{ all -> 0x06ee }
            r14.v0 = r10     // Catch:{ all -> 0x06ee }
            r14.w0 = r10     // Catch:{ all -> 0x06ee }
            r11 = 6
            r14.C0 = r11     // Catch:{ all -> 0x06ee }
            kotlin.Unit r0 = r0.e(r9, r7)     // Catch:{ all -> 0x06ee }
            if (r0 != r1) goto L_0x06eb
            return r1
        L_0x06eb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x06ee }
            goto L_0x0678
        L_0x06ee:
            r0 = move-exception
            goto L_0x06f2
        L_0x06f0:
            r0 = move-exception
            r10 = 0
        L_0x06f2:
            java.lang.String r7 = r8.c     // Catch:{ all -> 0x0203 }
            java.lang.String r9 = "File download. onResponse: failed to notify listener on download interrupted"
            defpackage.z68.f(r7, r9, r0)     // Catch:{ all -> 0x0203 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0203 }
            goto L_0x0678
        L_0x06fd:
            r10 = 0
            goto L_0x0678
        L_0x0700:
            java.lang.String r0 = r5.getAbsolutePath()
            r8.j(r6, r0)
            defpackage.u0g.c(r12)
        L_0x070a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x070d:
            java.lang.String r2 = r5.getAbsolutePath()
            r8.j(r6, r2)
            defpackage.u0g.c(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1b.i(k4d, q1b, java.io.File, java.io.File, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void j(q1b q1b, String str) {
        q1b.b.clear();
        this.d.remove(str);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e A[SYNTHETIC] */
    public final java.lang.Object k(defpackage.q1b r6, java.io.File r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.x1b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            x1b r0 = (defpackage.x1b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            x1b r0 = new x1b
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.util.Iterator r5 = r0.b
            y1b r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x002d }
            goto L_0x0061
        L_0x002d:
            r7 = move-exception
            goto L_0x0064
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r8)
            r7.delete()
            java.util.concurrent.CopyOnWriteArrayList r6 = r6.b
            java.util.Iterator r6 = r6.iterator()
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x0046:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x006e
            java.lang.Object r7 = r5.next()
            j4f r7 = (defpackage.j4f) r7
            if (r7 == 0) goto L_0x0046
            r0.a = r6     // Catch:{ all -> 0x002d }
            r0.b = r5     // Catch:{ all -> 0x002d }
            r0.v = r3     // Catch:{ all -> 0x002d }
            kotlin.Unit r7 = r7.d()     // Catch:{ all -> 0x002d }
            if (r7 != r1) goto L_0x0061
            return r1
        L_0x0061:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002d }
            goto L_0x0046
        L_0x0064:
            java.lang.String r8 = r6.c
            java.lang.String r2 = "File download. Failed to notify listener on url expired"
            defpackage.z68.f(r8, r2, r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            goto L_0x0046
        L_0x006e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1b.k(q1b, java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
