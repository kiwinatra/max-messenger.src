package defpackage;

import java.io.File;
import java.net.URI;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.text.Charsets;
import one.me.sdk.transfer.exceptions.TamHttpErrorException;

/* renamed from: do5  reason: default package */
public final class do5 {
    public final myf a;
    public final String b;
    public final yqf c;
    public final String d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final URI h;
    public final File i;
    public final long j;
    public final pwd k;
    public final a0a l;
    public final Lazy m;
    public final a0a n;
    public final Lazy o;
    public final qm7 p;
    public final jx3 q;
    public long r;
    public String s;
    public final tyf t;
    public final boolean u;

    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, pwd] */
    public do5(String str, String str2, gaf gaf, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, myf myf, String str3, yqf yqf) {
        String str4 = str2;
        Lazy lazy5 = lazy3;
        this.a = myf;
        this.b = str3;
        this.c = yqf;
        String name = do5.class.getName();
        this.d = name;
        this.e = lazy;
        this.f = lazy4;
        this.g = lazy5;
        String str5 = str;
        this.h = new URI(str);
        File file = new File(str4);
        this.i = file;
        long length = file.length();
        this.j = length;
        ? obj = new Object();
        obj.f = yqf.b();
        int ordinal = myf.ordinal();
        obj.a = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? a81.m("HTTP_UPLOAD_", myf.name()) : "HTTP_UPLOAD_FILE" : "HTTP_UPLOAD_VIDEO" : "HTTP_UPLOAD_AUDIO" : "HTTP_UPLOAD_IMAGE";
        this.k = obj;
        this.l = cvg.a();
        this.m = LazyKt.lazy(new tn5(this, 0));
        this.n = cvg.a();
        this.o = LazyKt.lazy(new ur(13, lazy5));
        this.p = kv0.b();
        this.q = e14.a(((osa) gaf).b());
        this.t = new tyf(lazy2, yqf, length, myf);
        this.u = true;
        if (!file.exists()) {
            z68.f(name, "File by path not found=" + str4, (Throwable) null);
            throw new TamHttpErrorException("File not found", b59.m);
        } else if (length == 0) {
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.x, name, "Upload failed: trying to upload file with zero length", (Throwable) null);
            }
            throw new TamHttpErrorException("File is zero length", b59.n);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.do5 r8, defpackage.ulf r9, defpackage.cxf r10, java.nio.channels.AsynchronousFileChannel r11, defpackage.vn5 r12, kotlin.coroutines.Continuation r13) {
        /*
            boolean r0 = r13 instanceof defpackage.ao5
            if (r0 == 0) goto L_0x0013
            r0 = r13
            ao5 r0 = (defpackage.ao5) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            ao5 r0 = new ao5
            r0.<init>(r8, r13)
        L_0x0018:
            java.lang.Object r13 = r0.w
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.y
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0068
            if (r2 == r6) goto L_0x005a
            if (r2 == r5) goto L_0x0047
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00c3
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003c:
            cxf r8 = r0.c
            ulf r9 = r0.b
            do5 r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00b4
        L_0x0047:
            kotlin.jvm.functions.Function2 r8 = r0.v
            java.nio.channels.AsynchronousFileChannel r9 = r0.o
            cxf r10 = r0.c
            ulf r11 = r0.b
            do5 r12 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)
            r2 = r10
            r5 = r11
            r6 = r12
            r12 = r8
            r11 = r9
            goto L_0x009a
        L_0x005a:
            kotlin.jvm.functions.Function2 r12 = r0.v
            java.nio.channels.AsynchronousFileChannel r11 = r0.o
            cxf r10 = r0.c
            ulf r9 = r0.b
            do5 r8 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0084
        L_0x0068:
            kotlin.ResultKt.throwOnFailure(r13)
            java.net.URI r13 = r8.h
            java.lang.String r13 = r13.getHost()
            r0.a = r8
            r0.b = r9
            r0.c = r10
            r0.o = r11
            r0.v = r12
            r0.y = r6
            java.lang.Object r13 = r9.b(r13, r0)
            if (r13 != r1) goto L_0x0084
            goto L_0x00c5
        L_0x0084:
            r0.a = r8
            r0.b = r9
            r0.c = r10
            r0.o = r11
            r0.v = r12
            r0.y = r5
            java.lang.Object r13 = r8.f(r9, r10, r0)
            if (r13 != r1) goto L_0x0097
            goto L_0x00c5
        L_0x0097:
            r6 = r8
            r5 = r9
            r2 = r10
        L_0x009a:
            r0.a = r6
            r0.b = r5
            r0.c = r2
            r0.o = r7
            r0.v = r7
            r0.y = r4
            r8 = r6
            r9 = r5
            r10 = r2
            r13 = r0
            java.lang.Object r8 = r8.e(r9, r10, r11, r12, r13)
            if (r8 != r1) goto L_0x00b1
            goto L_0x00c5
        L_0x00b1:
            r8 = r2
            r9 = r5
            r10 = r6
        L_0x00b4:
            r0.a = r7
            r0.b = r7
            r0.c = r7
            r0.y = r3
            java.lang.Object r8 = r10.d(r9, r8, r0)
            if (r8 != r1) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00c5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do5.a(do5, ulf, cxf, java.nio.channels.AsynchronousFileChannel, vn5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static String b(String str) {
        int i2;
        int length = str.length();
        int i3 = 0;
        while (true) {
            i2 = -1;
            if (i3 >= length) {
                i3 = -1;
                break;
            } else if (str.charAt(i3) == '{') {
                break;
            } else {
                i3++;
            }
        }
        int length2 = str.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i4 = length2 - 1;
                if (str.charAt(length2) == '}') {
                    i2 = length2;
                    break;
                } else if (i4 < 0) {
                    break;
                } else {
                    length2 = i4;
                }
            }
        }
        return str.substring(i3, i2 + 1);
    }

    public final void c(cxf cxf, long j2, long j3, long j4) {
        StringBuilder sb = new StringBuilder();
        StringBuilder n2 = tr1.n(j2, "Content-Range: bytes ", "-");
        n2.append((j2 + j3) - 1);
        n2.append("/");
        n2.append(j4);
        n2.append("\n");
        sb.append(n2.toString());
        sb.append("Content-Length: " + j3 + "\n");
        sb.append(10);
        String sb2 = sb.toString();
        if (this.u) {
            String str = this.d;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                w78 w78 = w78.o;
                a67.d(w78, str, cxf + ": remained headers " + sb2, (Throwable) null);
            }
        }
        ((ByteBuffer) this.o.getValue()).clear();
        ((ByteBuffer) this.o.getValue()).put(sb2.getBytes(Charsets.UTF_8));
        ((ByteBuffer) this.o.getValue()).flip();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.ulf r8, defpackage.cxf r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.zn5
            if (r0 == 0) goto L_0x0013
            r0 = r10
            zn5 r0 = (defpackage.zn5) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            zn5 r0 = new zn5
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            cxf r9 = r0.c
            ulf r8 = r0.b
            do5 r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0065
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Lazy r10 = r8.j
            java.lang.Object r10 = r10.getValue()
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            r10.clear()
            kotlin.Lazy r10 = r8.j
            java.lang.Object r10 = r10.getValue()
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r0.w = r3
            rlf r2 = r8.g
            if (r2 == 0) goto L_0x021b
            nw0 r4 = new nw0
            r4.<init>((java.nio.ByteBuffer) r10)
            java.lang.Object r10 = r2.h(r4, r0)
            if (r10 != r1) goto L_0x0065
            return r1
        L_0x0065:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            u47 r0 = defpackage.b59.l
            if (r10 <= 0) goto L_0x0213
            kotlin.Lazy r8 = r8.j
            java.lang.Object r8 = r8.getValue()
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            byte[] r8 = r8.array()
            java.nio.charset.Charset r10 = kotlin.text.Charsets.UTF_8
            java.lang.String r1 = new java.lang.String
            r1.<init>(r8, r10)
            boolean r8 = r7.u
            r10 = 0
            if (r8 == 0) goto L_0x00ad
            java.lang.String r8 = r7.d
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x008e
            goto L_0x00ad
        L_0x008e:
            boolean r4 = r2.c()
            if (r4 == 0) goto L_0x00ad
            w78 r4 = defpackage.w78.o
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            java.lang.String r6 = " Got response = "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r2.d(r4, r8, r5, r10)
        L_0x00ad:
            myf r8 = r7.a
            int r8 = r8.ordinal()
            if (r8 == 0) goto L_0x00c3
            r2 = 4
            if (r8 == r2) goto L_0x00ba
            r8 = r10
            goto L_0x00cb
        L_0x00ba:
            java.lang.String r8 = b(r1)
            java.lang.String r8 = defpackage.o54.s(r8)
            goto L_0x00cb
        L_0x00c3:
            java.lang.String r8 = b(r1)
            java.lang.String r8 = defpackage.o54.p(r8)
        L_0x00cb:
            r7.s = r8
            kotlin.sequences.Sequence r8 = kotlin.text.StringsKt__StringsKt.lineSequence(r1)
            java.lang.Object r8 = kotlin.sequences.SequencesKt.first(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.CharSequence r8 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r8)
            java.lang.String r8 = r8.toString()
            int r2 = r8.length()
            int r2 = r2 + -3
            int r4 = r8.length()
            java.lang.String r2 = r8.substring(r2, r4)
            java.lang.Integer r2 = kotlin.text.StringsKt.toIntOrNull(r2)
            if (r2 == 0) goto L_0x01ee
            kotlin.ranges.IntRange r8 = new kotlin.ranges.IntRange
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 299(0x12b, float:4.19E-43)
            r8.<init>(r4, r5)
            int r4 = r2.intValue()
            boolean r8 = r8.contains((int) r4)
            if (r8 == 0) goto L_0x0142
            pwd r8 = r7.k
            r0 = 0
            r8.d = r0
            r8.e = r10
            yqf r0 = r7.c
            long r1 = r0.b()
            r8.g = r1
            iq5 r8 = r8.a()
            r0.a(r8)
            java.lang.String r7 = r7.d
            a67 r8 = defpackage.z68.b
            if (r8 != 0) goto L_0x0123
            goto L_0x013f
        L_0x0123:
            boolean r0 = r8.c()
            if (r0 == 0) goto L_0x013f
            w78 r0 = defpackage.w78.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r9 = " Got successful response"
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r8.d(r0, r7, r9, r10)
        L_0x013f:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L_0x0142:
            yqf r8 = r7.c
            int r9 = r2.intValue()
            kotlin.Lazy r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            nd r8 = (defpackage.nd) r8
            r8.getClass()
            java.lang.String r4 = "HTTP_ERROR"
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.f(r4, r9)
            pwd r8 = r7.k
            java.lang.String r9 = r2.toString()
            r8.d = r3
            r8.e = r9
            yqf r7 = r7.c
            long r3 = r7.b()
            r8.g = r3
            iq5 r8 = r8.a()
            r7.a(r8)
            kotlin.sequences.Sequence r7 = kotlin.text.StringsKt__StringsKt.lineSequence(r1)
            java.util.Iterator r7 = r7.iterator()
        L_0x017d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0193
            java.lang.Object r8 = r7.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r1 = "X-Reason"
            boolean r9 = kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r9, r1, false, 2, (java.lang.Object) null)
            if (r9 == 0) goto L_0x017d
            goto L_0x0194
        L_0x0193:
            r8 = r10
        L_0x0194:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x01a0
            java.lang.String r7 = ":"
            java.lang.String r7 = kotlin.text.StringsKt__StringsKt.substringAfter$default((java.lang.String) r8, (java.lang.String) r7, (java.lang.String) null, 2, (java.lang.Object) null)
            if (r7 != 0) goto L_0x01a2
        L_0x01a0:
            java.lang.String r7 = "'Empty'"
        L_0x01a2:
            kotlin.ranges.IntRange r8 = new kotlin.ranges.IntRange
            r9 = 500(0x1f4, float:7.0E-43)
            r1 = 599(0x257, float:8.4E-43)
            r8.<init>(r9, r1)
            int r9 = r2.intValue()
            boolean r8 = r8.contains((int) r9)
            if (r8 != 0) goto L_0x01e0
            kotlin.ranges.IntRange r8 = new kotlin.ranges.IntRange
            r9 = 400(0x190, float:5.6E-43)
            r1 = 499(0x1f3, float:6.99E-43)
            r8.<init>(r9, r1)
            int r9 = r2.intValue()
            boolean r8 = r8.contains((int) r9)
            if (r8 == 0) goto L_0x01d4
            one.me.sdk.transfer.exceptions.TamHttpUrlExpiredException r8 = new one.me.sdk.transfer.exceptions.TamHttpUrlExpiredException
            java.lang.String r9 = "Expired url, reason="
            java.lang.String r7 = r9.concat(r7)
            r8.<init>(r7, r10)
            throw r8
        L_0x01d4:
            one.me.sdk.transfer.exceptions.TamHttpErrorException r8 = new one.me.sdk.transfer.exceptions.TamHttpErrorException
            java.lang.String r9 = "Server error, reason="
            java.lang.String r7 = r9.concat(r7)
            r8.<init>(r7, r0)
            throw r8
        L_0x01e0:
            one.me.sdk.transfer.exceptions.TamHttpErrorException r8 = new one.me.sdk.transfer.exceptions.TamHttpErrorException
            java.lang.String r9 = "Internal error, reason="
            java.lang.String r7 = r9.concat(r7)
            u47 r9 = defpackage.b59.d
            r8.<init>(r7, r9)
            throw r8
        L_0x01ee:
            java.lang.String r7 = r7.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r9 = " Got unknown response code="
            r1.append(r9)
            r1.append(r8)
            java.lang.String r9 = r1.toString()
            defpackage.z68.f(r7, r9, r10)
            one.me.sdk.transfer.exceptions.TamHttpErrorException r7 = new one.me.sdk.transfer.exceptions.TamHttpErrorException
            java.lang.String r9 = "Unknown code "
            java.lang.String r8 = r9.concat(r8)
            r7.<init>(r8, r0)
            throw r7
        L_0x0213:
            one.me.sdk.transfer.exceptions.TamHttpErrorException r7 = new one.me.sdk.transfer.exceptions.TamHttpErrorException
            java.lang.String r8 = "Empty response"
            r7.<init>(r8, r0)
            throw r7
        L_0x021b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Required value was null."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do5.d(ulf, cxf, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0142 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.ulf r20, defpackage.cxf r21, java.nio.channels.AsynchronousFileChannel r22, kotlin.jvm.functions.Function2 r23, kotlin.coroutines.Continuation r24) {
        /*
            r19 = this;
            r0 = r24
            boolean r1 = r0 instanceof defpackage.bo5
            if (r1 == 0) goto L_0x0017
            r1 = r0
            bo5 r1 = (defpackage.bo5) r1
            int r2 = r1.z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.z = r2
            r2 = r19
            goto L_0x001e
        L_0x0017:
            bo5 r1 = new bo5
            r2 = r19
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.x
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.z
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x0087
            if (r4 == r8) goto L_0x0073
            if (r4 == r7) goto L_0x0062
            if (r4 == r6) goto L_0x004f
            if (r4 != r5) goto L_0x0047
            kotlin.jvm.functions.Function2 r2 = r1.v
            java.nio.channels.AsynchronousFileChannel r4 = r1.o
            cxf r9 = r1.c
            ulf r10 = r1.b
            do5 r11 = r1.a
            kotlin.ResultKt.throwOnFailure(r0)
            r7 = r1
            r1 = r9
            r9 = r2
        L_0x0044:
            r2 = r11
            goto L_0x019b
        L_0x0047:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004f:
            kotlin.jvm.functions.Function2 r2 = r1.v
            java.nio.channels.AsynchronousFileChannel r4 = r1.o
            cxf r9 = r1.c
            ulf r10 = r1.b
            do5 r11 = r1.a
            kotlin.ResultKt.throwOnFailure(r0)
            r7 = r1
            r1 = r9
            r9 = r2
            r2 = r0
            goto L_0x0167
        L_0x0062:
            int r2 = r1.w
            kotlin.jvm.functions.Function2 r4 = r1.v
            java.nio.channels.AsynchronousFileChannel r9 = r1.o
            cxf r10 = r1.c
            ulf r11 = r1.b
            do5 r12 = r1.a
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0143
        L_0x0073:
            kotlin.jvm.functions.Function2 r2 = r1.v
            java.nio.channels.AsynchronousFileChannel r4 = r1.o
            cxf r9 = r1.c
            ulf r10 = r1.b
            do5 r11 = r1.a
            kotlin.ResultKt.throwOnFailure(r0)
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r4
            r4 = r2
            goto L_0x011d
        L_0x0087:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r20
            r4 = r22
            r9 = r23
            r10 = r1
            r1 = r21
        L_0x0093:
            long r11 = r1.b
            long r13 = r1.c
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x00c6
            boolean r0 = r2.u
            if (r0 == 0) goto L_0x00c3
            java.lang.String r0 = r2.d
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x00a6
            goto L_0x00c3
        L_0x00a6:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x00c3
            w78 r3 = defpackage.w78.o
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " wrote body content"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = 0
            r2.d(r3, r0, r1, r4)
        L_0x00c3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00c6:
            java.nio.ByteBuffer r11 = r0.c()
            r11.clear()
            java.nio.ByteBuffer r11 = r0.c()
            long r12 = r1.a
            long r14 = r1.c
            long r12 = r12 + r14
            r10.a = r2
            r10.b = r0
            r10.c = r1
            r10.o = r4
            r10.v = r9
            r10.z = r8
            lw1 r14 = new lw1
            kotlin.coroutines.Continuation r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r10)
            r14.<init>(r8, r15)
            r14.u()
            ev r15 = defpackage.ev.b
            r19 = r4
            r20 = r11
            r21 = r12
            r23 = r14
            r24 = r15
            r19.read(r20, r21, r23, r24)
            java.lang.Object r11 = r14.t()
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r12) goto L_0x010a
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r10)
        L_0x010a:
            if (r11 != r3) goto L_0x010d
            return r3
        L_0x010d:
            r12 = r2
            r16 = r11
            r11 = r0
            r0 = r16
            r17 = r10
            r10 = r1
            r1 = r17
            r18 = r9
            r9 = r4
            r4 = r18
        L_0x011d:
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.nio.ByteBuffer r0 = r11.c()
            r0.flip()
            java.nio.ByteBuffer r0 = r11.c()
            r1.a = r12
            r1.b = r11
            r1.c = r10
            r1.o = r9
            r1.v = r4
            r1.w = r2
            r1.z = r7
            java.lang.Object r0 = r11.d(r0, r1)
            if (r0 != r3) goto L_0x0143
            return r3
        L_0x0143:
            long r13 = r10.c
            long r7 = (long) r2
            long r13 = r13 + r7
            r10.c = r13
            tyf r2 = r12.t
            r1.a = r12
            r1.b = r11
            r1.c = r10
            r1.o = r9
            r1.v = r4
            r1.z = r6
            java.lang.Object r2 = r2.h(r1)
            if (r2 != r3) goto L_0x015e
            return r3
        L_0x015e:
            r7 = r1
            r1 = r10
            r10 = r11
            r11 = r12
            r16 = r9
            r9 = r4
            r4 = r16
        L_0x0167:
            java.lang.Number r2 = (java.lang.Number) r2
            long r12 = r2.longValue()
            pwd r2 = r11.k
            int r8 = (int) r12
            r2.b = r8
            float r2 = (float) r12
            long r12 = r11.j
            float r8 = (float) r12
            float r2 = r2 / r8
            r8 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0184
            r0 = r10
            r2 = r11
        L_0x017f:
            r8 = 1
            r10 = r7
            r7 = 2
            goto L_0x0093
        L_0x0184:
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r2)
            r7.a = r11
            r7.b = r10
            r7.c = r1
            r7.o = r4
            r7.v = r9
            r7.z = r5
            java.lang.Object r2 = r9.invoke(r2, r7)
            if (r2 != r3) goto L_0x0044
            return r3
        L_0x019b:
            r0 = r10
            goto L_0x017f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do5.e(ulf, cxf, java.nio.channels.AsynchronousFileChannel, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [xz9] */
    /* JADX WARNING: type inference failed for: r0v19, types: [xz9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(defpackage.ulf r19, defpackage.cxf r20, kotlin.coroutines.Continuation r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof defpackage.co5
            if (r2 == 0) goto L_0x0017
            r2 = r1
            co5 r2 = (defpackage.co5) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001c
        L_0x0017:
            co5 r2 = new co5
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.v
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.x
            r5 = 0
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L_0x0088
            if (r4 == r9) goto L_0x0074
            if (r4 == r8) goto L_0x0061
            if (r4 == r7) goto L_0x004e
            if (r4 != r6) goto L_0x0046
            java.lang.Object r0 = r2.c
            r3 = r0
            xz9 r3 = (defpackage.xz9) r3
            java.lang.Object r0 = r2.b
            cxf r0 = (defpackage.cxf) r0
            do5 r2 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ all -> 0x0043 }
            goto L_0x0118
        L_0x0043:
            r0 = move-exception
            goto L_0x0150
        L_0x0046:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004e:
            xz9 r0 = r2.o
            java.lang.Object r4 = r2.c
            cxf r4 = (defpackage.cxf) r4
            java.lang.Object r7 = r2.b
            ulf r7 = (defpackage.ulf) r7
            do5 r8 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r0
            r0 = r4
            goto L_0x00ef
        L_0x0061:
            xz9 r4 = r2.o
            java.lang.Object r0 = r2.c
            cxf r0 = (defpackage.cxf) r0
            java.lang.Object r8 = r2.b
            ulf r8 = (defpackage.ulf) r8
            do5 r9 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ all -> 0x0071 }
            goto L_0x00ca
        L_0x0071:
            r0 = move-exception
            goto L_0x015a
        L_0x0074:
            xz9 r0 = r2.o
            java.lang.Object r4 = r2.c
            cxf r4 = (defpackage.cxf) r4
            java.lang.Object r9 = r2.b
            ulf r9 = (defpackage.ulf) r9
            do5 r10 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r0
            r0 = r10
            r10 = r4
            r4 = r9
            goto L_0x00a2
        L_0x0088:
            kotlin.ResultKt.throwOnFailure(r1)
            a0a r1 = r0.l
            r2.a = r0
            r4 = r19
            r2.b = r4
            r10 = r20
            r2.c = r10
            r2.o = r1
            r2.x = r9
            java.lang.Object r9 = r1.d(r2)
            if (r9 != r3) goto L_0x00a2
            return r3
        L_0x00a2:
            kotlin.Lazy r9 = r0.m     // Catch:{ all -> 0x0158 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x0158 }
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9     // Catch:{ all -> 0x0158 }
            r9.mark()     // Catch:{ all -> 0x0158 }
            kotlin.Lazy r9 = r0.m     // Catch:{ all -> 0x0158 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x0158 }
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9     // Catch:{ all -> 0x0158 }
            r2.a = r0     // Catch:{ all -> 0x0158 }
            r2.b = r4     // Catch:{ all -> 0x0158 }
            r2.c = r10     // Catch:{ all -> 0x0158 }
            r2.o = r1     // Catch:{ all -> 0x0158 }
            r2.x = r8     // Catch:{ all -> 0x0158 }
            java.lang.Object r8 = r4.d(r9, r2)     // Catch:{ all -> 0x0158 }
            if (r8 != r3) goto L_0x00c6
            return r3
        L_0x00c6:
            r9 = r0
            r8 = r4
            r0 = r10
            r4 = r1
        L_0x00ca:
            kotlin.Lazy r1 = r9.m     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0071 }
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch:{ all -> 0x0071 }
            r1.reset()     // Catch:{ all -> 0x0071 }
            a0a r4 = (defpackage.a0a) r4
            r4.e(r5)
            a0a r1 = r9.n
            r2.a = r9
            r2.b = r8
            r2.c = r0
            r2.o = r1
            r2.x = r7
            java.lang.Object r4 = r1.d(r2)
            if (r4 != r3) goto L_0x00ed
            return r3
        L_0x00ed:
            r7 = r8
            r8 = r9
        L_0x00ef:
            long r12 = r0.a     // Catch:{ all -> 0x014e }
            long r14 = r0.b     // Catch:{ all -> 0x014e }
            long r9 = r8.j     // Catch:{ all -> 0x014e }
            r16 = r9
            r10 = r8
            r11 = r0
            r10.c(r11, r12, r14, r16)     // Catch:{ all -> 0x014e }
            kotlin.Lazy r4 = r8.o     // Catch:{ all -> 0x014e }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x014e }
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4     // Catch:{ all -> 0x014e }
            r2.a = r8     // Catch:{ all -> 0x014e }
            r2.b = r0     // Catch:{ all -> 0x014e }
            r2.c = r1     // Catch:{ all -> 0x014e }
            r2.o = r5     // Catch:{ all -> 0x014e }
            r2.x = r6     // Catch:{ all -> 0x014e }
            java.lang.Object r2 = r7.d(r4, r2)     // Catch:{ all -> 0x014e }
            if (r2 != r3) goto L_0x0115
            return r3
        L_0x0115:
            r3 = r1
            r1 = r2
            r2 = r8
        L_0x0118:
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x0043 }
            r1.longValue()     // Catch:{ all -> 0x0043 }
            a0a r3 = (defpackage.a0a) r3
            r3.e(r5)
            boolean r1 = r2.u
            if (r1 == 0) goto L_0x0149
            java.lang.String r1 = r2.d
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x012d
            goto L_0x0149
        L_0x012d:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0149
            w78 r3 = defpackage.w78.o
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = " wrote headers"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.d(r3, r1, r0, r5)
        L_0x0149:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x014c:
            r3 = r1
            goto L_0x0150
        L_0x014e:
            r0 = move-exception
            goto L_0x014c
        L_0x0150:
            a0a r3 = (defpackage.a0a) r3
            r3.e(r5)
            throw r0
        L_0x0156:
            r4 = r1
            goto L_0x015a
        L_0x0158:
            r0 = move-exception
            goto L_0x0156
        L_0x015a:
            a0a r4 = (defpackage.a0a) r4
            r4.e(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do5.f(ulf, cxf, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
