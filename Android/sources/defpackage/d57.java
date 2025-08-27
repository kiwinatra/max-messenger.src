package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.protocol.HTTP;

/* renamed from: d57  reason: default package */
public abstract class d57 {
    static {
        new vw0(BasicHeaderValueFormatter.UNSAFE_CHARS.getBytes(Charsets.UTF_8)).b = BasicHeaderValueFormatter.UNSAFE_CHARS;
        new vw0("\t ,=".getBytes(Charsets.UTF_8)).b = "\t ,=";
    }

    public static final boolean a(k4d k4d) {
        if (Intrinsics.areEqual((Object) k4d.a.c, (Object) HttpHead.METHOD_NAME)) {
            return false;
        }
        int i = k4d.o;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && u0g.j(k4d) == -1) {
            String b = k4d.w.b(HTTP.TRANSFER_ENCODING);
            if (b == null) {
                b = null;
            }
            return StringsKt__StringsJVMKt.equals(HTTP.CHUNK_CODING, b, true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x022b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(defpackage.ejd r35, defpackage.m57 r36, defpackage.lx6 r37) {
        /*
            r0 = r37
            r1 = 1
            ejd r2 = defpackage.ejd.c
            r3 = r35
            if (r3 != r2) goto L_0x000a
            return
        L_0x000a:
            java.util.regex.Pattern r2 = defpackage.qz3.j
            int r2 = r37.size()
            r4 = 0
            r6 = r4
            r7 = 0
        L_0x0013:
            r8 = 2
            if (r6 >= r2) goto L_0x0032
            java.lang.String r9 = r0.d(r6)
            java.lang.String r10 = "Set-Cookie"
            boolean r9 = kotlin.text.StringsKt__StringsJVMKt.equals(r10, r9, true)
            if (r9 == 0) goto L_0x0030
            if (r7 != 0) goto L_0x0029
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r8)
        L_0x0029:
            java.lang.String r8 = r0.f(r6)
            r7.add(r8)
        L_0x0030:
            int r6 = r6 + r1
            goto L_0x0013
        L_0x0032:
            if (r7 == 0) goto L_0x003a
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)
        L_0x0038:
            r2 = r0
            goto L_0x003f
        L_0x003a:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0038
        L_0x003f:
            int r6 = r2.size()
            r7 = r4
            r9 = 0
        L_0x0045:
            if (r7 >= r6) goto L_0x0232
            java.lang.Object r0 = r2.get(r7)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            long r11 = java.lang.System.currentTimeMillis()
            r13 = 59
            r14 = 6
            int r0 = defpackage.u0g.g(r10, r13, r4, r4, r14)
            r15 = 61
            int r5 = defpackage.u0g.g(r10, r15, r4, r0, r8)
            if (r5 != r0) goto L_0x0067
            r1 = r36
            r10 = r4
        L_0x0064:
            r0 = 0
            goto L_0x021f
        L_0x0067:
            java.lang.String r17 = defpackage.u0g.x(r4, r5, r10)
            int r16 = r17.length()
            if (r16 != 0) goto L_0x0072
            goto L_0x0079
        L_0x0072:
            int r8 = defpackage.u0g.l(r17)
            r4 = -1
            if (r8 == r4) goto L_0x007f
        L_0x0079:
            r1 = r36
        L_0x007b:
            r0 = 0
            r10 = 0
            goto L_0x021f
        L_0x007f:
            int r5 = r5 + r1
            java.lang.String r18 = defpackage.u0g.x(r5, r0, r10)
            int r5 = defpackage.u0g.l(r18)
            if (r5 == r4) goto L_0x008b
            goto L_0x0079
        L_0x008b:
            int r0 = r0 + r1
            int r4 = r10.length()
            r19 = -1
            r21 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r26 = r1
            r27 = r19
            r29 = r21
            r5 = 0
            r8 = 0
            r23 = 0
            r24 = 0
            r25 = 0
        L_0x00a5:
            r31 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r33 = -9223372036854775808
            if (r0 >= r4) goto L_0x016e
            int r14 = defpackage.u0g.e(r13, r0, r4, r10)
            int r13 = defpackage.u0g.e(r15, r0, r14, r10)
            java.lang.String r0 = defpackage.u0g.x(r0, r13, r10)
            if (r13 >= r14) goto L_0x00c2
            int r13 = r13 + r1
            java.lang.String r13 = defpackage.u0g.x(r13, r14, r10)
            goto L_0x00c4
        L_0x00c2:
            java.lang.String r13 = ""
        L_0x00c4:
            java.lang.String r15 = "expires"
            boolean r15 = kotlin.text.StringsKt__StringsJVMKt.equals(r0, r15, true)
            if (r15 == 0) goto L_0x00d8
            int r0 = r13.length()     // Catch:{ IllegalArgumentException -> 0x014c }
            long r29 = defpackage.te8.r(r0, r13)     // Catch:{ IllegalArgumentException -> 0x014c }
            r25 = r1
            goto L_0x0165
        L_0x00d8:
            java.lang.String r15 = "max-age"
            boolean r15 = kotlin.text.StringsKt__StringsJVMKt.equals(r0, r15, true)
            if (r15 == 0) goto L_0x0110
            long r27 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x00f0 }
            r31 = 0
            int r0 = (r27 > r31 ? 1 : (r27 == r31 ? 0 : -1))
            if (r0 > 0) goto L_0x00eb
            goto L_0x00ed
        L_0x00eb:
            r33 = r27
        L_0x00ed:
            r27 = r33
            goto L_0x010b
        L_0x00f0:
            r0 = move-exception
            r15 = r0
            kotlin.text.Regex r0 = new kotlin.text.Regex     // Catch:{  }
            java.lang.String r1 = "-?\\d+"
            r0.<init>((java.lang.String) r1)     // Catch:{  }
            boolean r0 = r0.matches(r13)     // Catch:{  }
            if (r0 == 0) goto L_0x010f
            java.lang.String r0 = "-"
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r13, r0, false, 2, (java.lang.Object) null)     // Catch:{  }
            if (r0 == 0) goto L_0x0109
            r31 = r33
        L_0x0109:
            r27 = r31
        L_0x010b:
            r1 = 1
            r25 = 1
            goto L_0x0165
        L_0x010f:
            throw r15     // Catch:{  }
        L_0x0110:
            java.lang.String r1 = "domain"
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r0, r1, true)
            if (r1 == 0) goto L_0x0143
            java.lang.String r0 = "."
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.endsWith$default(r13, r0, false, 2, (java.lang.Object) null)     // Catch:{ IllegalArgumentException -> 0x014c }
            r15 = 1
            r1 = r1 ^ r15
            if (r1 == 0) goto L_0x0137
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt.removePrefix((java.lang.String) r13, (java.lang.CharSequence) r0)     // Catch:{ IllegalArgumentException -> 0x014c }
            java.lang.String r0 = defpackage.o54.O(r0)     // Catch:{ IllegalArgumentException -> 0x014c }
            if (r0 == 0) goto L_0x0131
            r5 = r0
            r1 = 1
            r26 = 0
            goto L_0x0165
        L_0x0131:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x014c }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x014c }
            throw r0     // Catch:{ IllegalArgumentException -> 0x014c }
        L_0x0137:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x014c }
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x014c }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x014c }
            throw r0     // Catch:{ IllegalArgumentException -> 0x014c }
        L_0x0143:
            java.lang.String r1 = "path"
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r0, r1, true)
            if (r1 == 0) goto L_0x014e
            r8 = r13
        L_0x014c:
            r1 = 1
            goto L_0x0165
        L_0x014e:
            java.lang.String r1 = "secure"
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r0, r1, true)
            if (r1 == 0) goto L_0x015a
            r1 = 1
            r23 = 1
            goto L_0x0165
        L_0x015a:
            java.lang.String r1 = "httponly"
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.equals(r0, r1, true)
            if (r0 == 0) goto L_0x014c
            r1 = 1
            r24 = 1
        L_0x0165:
            int r0 = r14 + 1
            r13 = 59
            r14 = 6
            r15 = 61
            goto L_0x00a5
        L_0x016e:
            int r0 = (r27 > r33 ? 1 : (r27 == r33 ? 0 : -1))
            if (r0 != 0) goto L_0x0177
            r1 = r36
            r19 = r33
            goto L_0x01a2
        L_0x0177:
            int r0 = (r27 > r19 ? 1 : (r27 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x019e
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0189
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r31 = r27 * r0
        L_0x0189:
            long r31 = r11 + r31
            int r0 = (r31 > r11 ? 1 : (r31 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0199
            int r0 = (r31 > r21 ? 1 : (r31 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0194
            goto L_0x0199
        L_0x0194:
            r1 = r36
            r19 = r31
            goto L_0x01a2
        L_0x0199:
            r1 = r36
            r19 = r21
            goto L_0x01a2
        L_0x019e:
            r1 = r36
            r19 = r29
        L_0x01a2:
            java.lang.String r0 = r1.e
            if (r5 != 0) goto L_0x01a8
            r5 = r0
            goto L_0x01d0
        L_0x01a8:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x01af
            goto L_0x01d0
        L_0x01af:
            boolean r4 = kotlin.text.StringsKt__StringsJVMKt.endsWith$default(r0, r5, false, 2, (java.lang.Object) null)
            if (r4 == 0) goto L_0x021c
            int r4 = r0.length()
            int r10 = r5.length()
            int r4 = r4 - r10
            r10 = 1
            int r4 = r4 - r10
            char r4 = r0.charAt(r4)
            r10 = 46
            if (r4 != r10) goto L_0x021c
            kotlin.text.Regex r4 = defpackage.u0g.f
            boolean r4 = r4.matches(r0)
            if (r4 != 0) goto L_0x021c
        L_0x01d0:
            int r0 = r0.length()
            int r4 = r5.length()
            if (r0 == r4) goto L_0x01e4
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.g
            java.lang.String r0 = r0.a(r5)
            if (r0 != 0) goto L_0x01e4
            goto L_0x007b
        L_0x01e4:
            java.lang.String r0 = "/"
            if (r8 == 0) goto L_0x01f3
            boolean r4 = kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r8, r0, false, 2, (java.lang.Object) null)
            if (r4 != 0) goto L_0x01ef
            goto L_0x01f3
        L_0x01ef:
            r22 = r8
            r10 = 0
            goto L_0x0212
        L_0x01f3:
            java.lang.String r4 = r36.b()
            r8 = 47
            r10 = 0
            r11 = 6
            int r8 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r4, (char) r8, (int) r10, false, (int) r11, (java.lang.Object) null)
            if (r8 == 0) goto L_0x0210
            if (r4 == 0) goto L_0x0208
            java.lang.String r0 = r4.substring(r10, r8)
            goto L_0x0210
        L_0x0208:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x0210:
            r22 = r0
        L_0x0212:
            qz3 r0 = new qz3
            r16 = r0
            r21 = r5
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26)
            goto L_0x021f
        L_0x021c:
            r10 = 0
            goto L_0x0064
        L_0x021f:
            if (r0 == 0) goto L_0x022b
            if (r9 != 0) goto L_0x0228
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0228:
            r9.add(r0)
        L_0x022b:
            r4 = 1
            int r7 = r7 + r4
            r1 = r4
            r4 = r10
            r8 = 2
            goto L_0x0045
        L_0x0232:
            if (r9 == 0) goto L_0x0239
            java.util.List r0 = java.util.Collections.unmodifiableList(r9)
            goto L_0x023d
        L_0x0239:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x023d:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0244
            return
        L_0x0244:
            r35.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d57.b(ejd, m57, lx6):void");
    }
}
