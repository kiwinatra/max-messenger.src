package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.util.regex.Pattern;

/* renamed from: ptc  reason: default package */
public final class ptc implements Closeable {
    public final /* synthetic */ int a = 0;
    public final xu0 b;
    public final long c;
    public final Object o;

    public ptc(rt0 rt0, f19 f19, long j) {
        this.b = rt0;
        this.o = f19;
        this.c = j;
    }

    public final xu0 U() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r4 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0085, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0086, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0089, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r6 >= r7) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String V() {
        /*
            r10 = this;
            xu0 r0 = r10.U()
            f19 r10 = r10.o()     // Catch:{ all -> 0x0083 }
            r1 = 1
            r2 = 2
            r3 = 0
            if (r10 == 0) goto L_0x0048
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8     // Catch:{ all -> 0x0083 }
            java.lang.String[] r10 = r10.c     // Catch:{ all -> 0x0083 }
            kotlin.ranges.IntRange r5 = kotlin.collections.ArraysKt.getIndices((T[]) r10)     // Catch:{ all -> 0x0083 }
            kotlin.ranges.IntProgression r5 = kotlin.ranges.RangesKt.step((kotlin.ranges.IntProgression) r5, (int) r2)     // Catch:{ all -> 0x0083 }
            int r6 = r5.getFirst()     // Catch:{ all -> 0x0083 }
            int r7 = r5.getLast()     // Catch:{ all -> 0x0083 }
            int r5 = r5.getStep()     // Catch:{ all -> 0x0083 }
            if (r5 < 0) goto L_0x002a
            if (r6 > r7) goto L_0x003e
            goto L_0x002c
        L_0x002a:
            if (r6 < r7) goto L_0x003e
        L_0x002c:
            r8 = r10[r6]     // Catch:{ all -> 0x0083 }
            java.lang.String r9 = "charset"
            boolean r8 = kotlin.text.StringsKt__StringsJVMKt.equals(r8, r9, true)     // Catch:{ all -> 0x0083 }
            if (r8 == 0) goto L_0x003a
            int r6 = r6 + r1
            r10 = r10[r6]     // Catch:{ all -> 0x0083 }
            goto L_0x003f
        L_0x003a:
            if (r6 == r7) goto L_0x003e
            int r6 = r6 + r5
            goto L_0x002c
        L_0x003e:
            r10 = r3
        L_0x003f:
            if (r10 == 0) goto L_0x0045
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r10)     // Catch:{ IllegalArgumentException -> 0x0045 }
        L_0x0045:
            if (r4 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8     // Catch:{ all -> 0x0083 }
        L_0x004a:
            b5b r10 = defpackage.u0g.d     // Catch:{ all -> 0x0083 }
            int r10 = r0.f0(r10)     // Catch:{ all -> 0x0083 }
            r5 = -1
            if (r10 == r5) goto L_0x007b
            if (r10 == 0) goto L_0x0079
            if (r10 == r1) goto L_0x0076
            if (r10 == r2) goto L_0x0073
            r1 = 3
            if (r10 == r1) goto L_0x006c
            r1 = 4
            if (r10 != r1) goto L_0x0066
            kotlin.text.Charsets r10 = kotlin.text.Charsets.INSTANCE     // Catch:{ all -> 0x0083 }
            java.nio.charset.Charset r4 = r10.UTF32_LE()     // Catch:{ all -> 0x0083 }
            goto L_0x007b
        L_0x0066:
            java.lang.AssertionError r10 = new java.lang.AssertionError     // Catch:{ all -> 0x0083 }
            r10.<init>()     // Catch:{ all -> 0x0083 }
            throw r10     // Catch:{ all -> 0x0083 }
        L_0x006c:
            kotlin.text.Charsets r10 = kotlin.text.Charsets.INSTANCE     // Catch:{ all -> 0x0083 }
            java.nio.charset.Charset r4 = r10.UTF32_BE()     // Catch:{ all -> 0x0083 }
            goto L_0x007b
        L_0x0073:
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_16LE     // Catch:{ all -> 0x0083 }
            goto L_0x007b
        L_0x0076:
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_16BE     // Catch:{ all -> 0x0083 }
            goto L_0x007b
        L_0x0079:
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0083 }
        L_0x007b:
            java.lang.String r10 = r0.P(r4)     // Catch:{ all -> 0x0083 }
            kotlin.io.CloseableKt.closeFinally(r0, r3)
            return r10
        L_0x0083:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptc.V():java.lang.String");
    }

    public final void close() {
        u0g.c(U());
    }

    public final InputStream m() {
        return U().o0();
    }

    public final long n() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    public final f19 o() {
        Object obj = this.o;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = f19.d;
                try {
                    return ct.l(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            default:
                return (f19) obj;
        }
    }

    public ptc(String str, long j, gtc gtc) {
        this.o = str;
        this.c = j;
        this.b = gtc;
    }
}
