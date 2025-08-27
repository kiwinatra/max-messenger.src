package defpackage;

import java.io.File;
import java.util.regex.Pattern;

/* renamed from: wae  reason: default package */
public final class wae extends yx0 {
    public static final Pattern x = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern y = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern z = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cf, code lost:
        if (r16.renameTo(r1) == false) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.wae b(java.io.File r16, long r17, long r19, defpackage.d23 r21) {
        /*
            r0 = r21
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r2 = r1.endsWith(r2)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L_0x00dc
            java.lang.String r1 = r16.getName()
            java.util.regex.Pattern r2 = y
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r7 = r2.matches()
            if (r7 == 0) goto L_0x0089
            java.lang.String r1 = r2.group(r5)
            r1.getClass()
            int r7 = defpackage.v0g.a
            int r7 = r1.length()
            r8 = 0
            r9 = r8
            r10 = r9
        L_0x0032:
            if (r9 >= r7) goto L_0x003f
            char r11 = r1.charAt(r9)
            r12 = 37
            if (r11 != r12) goto L_0x003d
            int r10 = r10 + r5
        L_0x003d:
            int r9 = r9 + r5
            goto L_0x0032
        L_0x003f:
            if (r10 != 0) goto L_0x0042
            goto L_0x009e
        L_0x0042:
            int r9 = r10 * 2
            int r9 = r7 - r9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r9)
            java.util.regex.Pattern r12 = defpackage.v0g.j
            java.util.regex.Matcher r12 = r12.matcher(r1)
        L_0x0051:
            if (r10 <= 0) goto L_0x0078
            boolean r13 = r12.find()
            if (r13 == 0) goto L_0x0078
            java.lang.String r13 = r12.group(r5)
            r13.getClass()
            r14 = 16
            int r13 = java.lang.Integer.parseInt(r13, r14)
            char r13 = (char) r13
            int r14 = r12.start()
            r11.append(r1, r8, r14)
            r11.append(r13)
            int r8 = r12.end()
            int r10 = r10 + -1
            goto L_0x0051
        L_0x0078:
            if (r8 >= r7) goto L_0x007d
            r11.append(r1, r8, r7)
        L_0x007d:
            int r1 = r11.length()
            if (r1 == r9) goto L_0x0084
            goto L_0x009d
        L_0x0084:
            java.lang.String r1 = r11.toString()
            goto L_0x009e
        L_0x0089:
            java.util.regex.Pattern r2 = x
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r1 = r2.matches()
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = r2.group(r5)
            r1.getClass()
            goto L_0x009e
        L_0x009d:
            r1 = r6
        L_0x009e:
            if (r1 != 0) goto L_0x00a2
        L_0x00a0:
            r1 = r6
            goto L_0x00d2
        L_0x00a2:
            java.io.File r7 = r16.getParentFile()
            defpackage.n79.o(r7)
            fy0 r1 = r0.k(r1)
            java.lang.String r8 = r2.group(r4)
            r8.getClass()
            long r9 = java.lang.Long.parseLong(r8)
            java.lang.String r2 = r2.group(r3)
            r2.getClass()
            long r11 = java.lang.Long.parseLong(r2)
            int r8 = r1.a
            java.io.File r1 = c(r7, r8, r9, r11)
            r2 = r16
            boolean r2 = r2.renameTo(r1)
            if (r2 != 0) goto L_0x00d2
            goto L_0x00a0
        L_0x00d2:
            if (r1 != 0) goto L_0x00d5
            return r6
        L_0x00d5:
            java.lang.String r2 = r1.getName()
            r15 = r1
            r1 = r2
            goto L_0x00df
        L_0x00dc:
            r2 = r16
            r15 = r2
        L_0x00df:
            java.util.regex.Pattern r2 = z
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L_0x00ec
            return r6
        L_0x00ec:
            java.lang.String r2 = r1.group(r5)
            r2.getClass()
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.Object r0 = r0.b
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r0 = r0.get(r2)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x0105
            return r6
        L_0x0105:
            r9 = -1
            int r0 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0111
            long r9 = r15.length()
            r11 = r9
            goto L_0x0113
        L_0x0111:
            r11 = r17
        L_0x0113:
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x011a
            return r6
        L_0x011a:
            java.lang.String r0 = r1.group(r4)
            r0.getClass()
            long r9 = java.lang.Long.parseLong(r0)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x013b
            java.lang.String r0 = r1.group(r3)
            r0.getClass()
            long r0 = java.lang.Long.parseLong(r0)
            r13 = r0
            goto L_0x013d
        L_0x013b:
            r13 = r19
        L_0x013d:
            wae r0 = new wae
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wae.b(java.io.File, long, long, d23):wae");
    }

    public static File c(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, wj6.m(sb, j2, ".v3.exo"));
    }
}
