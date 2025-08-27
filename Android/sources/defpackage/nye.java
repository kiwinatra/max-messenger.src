package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: nye  reason: default package */
public final class nye implements ize {
    public static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern v = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final l8b c = new l8b();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.n44 a(android.text.Spanned r23, java.lang.String r24) {
        /*
            r0 = r24
            r17 = 0
            r4 = 0
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 0
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 != 0) goto L_0x0027
            n44 r18 = new n44
            r0 = r18
            r1 = r23
            r2 = r4
            r3 = r4
            r5 = r13
            r6 = r16
            r7 = r16
            r8 = r13
            r9 = r16
            r10 = r16
            r11 = r13
            r12 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r18
        L_0x0027:
            int r1 = r24.hashCode()
            r2 = 2
            r3 = 1
            java.lang.String r5 = "{\\an1}"
            java.lang.String r7 = "{\\an2}"
            java.lang.String r8 = "{\\an3}"
            java.lang.String r9 = "{\\an4}"
            java.lang.String r11 = "{\\an5}"
            java.lang.String r12 = "{\\an6}"
            java.lang.String r6 = "{\\an7}"
            r19 = 8
            java.lang.String r10 = "{\\an8}"
            java.lang.String r15 = "{\\an9}"
            r20 = -1
            r21 = 0
            r14 = 3
            r13 = 4
            r4 = 5
            switch(r1) {
                case -685620710: goto L_0x008d;
                case -685620679: goto L_0x0085;
                case -685620648: goto L_0x007d;
                case -685620617: goto L_0x0075;
                case -685620586: goto L_0x006d;
                case -685620555: goto L_0x0065;
                case -685620524: goto L_0x005d;
                case -685620493: goto L_0x0054;
                case -685620462: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0096
        L_0x004c:
            boolean r1 = r0.equals(r15)
            if (r1 == 0) goto L_0x0096
            r1 = r4
            goto L_0x0098
        L_0x0054:
            boolean r1 = r0.equals(r10)
            if (r1 == 0) goto L_0x0096
            r1 = r19
            goto L_0x0098
        L_0x005d:
            boolean r1 = r0.equals(r6)
            if (r1 == 0) goto L_0x0096
            r1 = r2
            goto L_0x0098
        L_0x0065:
            boolean r1 = r0.equals(r12)
            if (r1 == 0) goto L_0x0096
            r1 = r13
            goto L_0x0098
        L_0x006d:
            boolean r1 = r0.equals(r11)
            if (r1 == 0) goto L_0x0096
            r1 = 7
            goto L_0x0098
        L_0x0075:
            boolean r1 = r0.equals(r9)
            if (r1 == 0) goto L_0x0096
            r1 = r3
            goto L_0x0098
        L_0x007d:
            boolean r1 = r0.equals(r8)
            if (r1 == 0) goto L_0x0096
            r1 = r14
            goto L_0x0098
        L_0x0085:
            boolean r1 = r0.equals(r7)
            if (r1 == 0) goto L_0x0096
            r1 = 6
            goto L_0x0098
        L_0x008d:
            boolean r1 = r0.equals(r5)
            if (r1 == 0) goto L_0x0096
            r1 = r21
            goto L_0x0098
        L_0x0096:
            r1 = r20
        L_0x0098:
            if (r1 == 0) goto L_0x00a8
            if (r1 == r3) goto L_0x00a8
            if (r1 == r2) goto L_0x00a8
            if (r1 == r14) goto L_0x00a6
            if (r1 == r13) goto L_0x00a6
            if (r1 == r4) goto L_0x00a6
            r1 = r3
            goto L_0x00aa
        L_0x00a6:
            r1 = r2
            goto L_0x00aa
        L_0x00a8:
            r1 = r21
        L_0x00aa:
            int r22 = r24.hashCode()
            switch(r22) {
                case -685620710: goto L_0x00f3;
                case -685620679: goto L_0x00eb;
                case -685620648: goto L_0x00e3;
                case -685620617: goto L_0x00db;
                case -685620586: goto L_0x00d3;
                case -685620555: goto L_0x00ca;
                case -685620524: goto L_0x00c2;
                case -685620493: goto L_0x00ba;
                case -685620462: goto L_0x00b2;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            goto L_0x00fc
        L_0x00b2:
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00fc
            r6 = r4
            goto L_0x00fe
        L_0x00ba:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00fc
            r6 = r13
            goto L_0x00fe
        L_0x00c2:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00fc
            r6 = r14
            goto L_0x00fe
        L_0x00ca:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00fc
            r6 = r19
            goto L_0x00fe
        L_0x00d3:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00fc
            r6 = 7
            goto L_0x00fe
        L_0x00db:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00fc
            r6 = 6
            goto L_0x00fe
        L_0x00e3:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00fc
            r6 = r2
            goto L_0x00fe
        L_0x00eb:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00fc
            r6 = r3
            goto L_0x00fe
        L_0x00f3:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00fc
            r6 = r21
            goto L_0x00fe
        L_0x00fc:
            r6 = r20
        L_0x00fe:
            if (r6 == 0) goto L_0x010f
            if (r6 == r3) goto L_0x010f
            if (r6 == r2) goto L_0x010f
            if (r6 == r14) goto L_0x010c
            if (r6 == r13) goto L_0x010c
            if (r6 == r4) goto L_0x010c
            r7 = r3
            goto L_0x0110
        L_0x010c:
            r7 = r21
            goto L_0x0110
        L_0x010f:
            r7 = r2
        L_0x0110:
            r0 = 1034147594(0x3da3d70a, float:0.08)
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1064011039(0x3f6b851f, float:0.92)
            if (r1 == 0) goto L_0x0128
            if (r1 == r3) goto L_0x0126
            if (r1 != r2) goto L_0x0120
            r8 = r5
            goto L_0x0129
        L_0x0120:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0126:
            r8 = r4
            goto L_0x0129
        L_0x0128:
            r8 = r0
        L_0x0129:
            if (r7 == 0) goto L_0x0138
            if (r7 == r3) goto L_0x0136
            if (r7 != r2) goto L_0x0130
            goto L_0x0139
        L_0x0130:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0136:
            r5 = r4
            goto L_0x0139
        L_0x0138:
            r5 = r0
        L_0x0139:
            n44 r18 = new n44
            r0 = r18
            r6 = 0
            r21 = r1
            r1 = r23
            r4 = 0
            r2 = r4
            r3 = r4
            r9 = r21
            r10 = r16
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r11 = r13
            r12 = r13
            r14 = 0
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nye.a(android.text.Spanned, java.lang.String):n44");
    }

    public static long b(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    public final void m(byte[] bArr, int i, int i2, hze hze, pk3 pk3) {
        pk3 pk32;
        String str;
        nye nye = this;
        int i3 = i;
        hze hze2 = hze;
        pk3 pk33 = pk3;
        l8b l8b = nye.c;
        l8b.E(i3 + i2, bArr);
        l8b.G(i3);
        Charset C = l8b.C();
        if (C == null) {
            C = x22.c;
        }
        long j = hze2.b;
        ArrayList<q44> arrayList = (j == -9223372036854775807L || !hze2.a) ? null : new ArrayList<>();
        while (true) {
            String h = l8b.h(C);
            if (h == null) {
                break;
            } else if (h.length() != 0) {
                try {
                    Integer.parseInt(h);
                    String h2 = l8b.h(C);
                    if (h2 == null) {
                        i8b.V("Unexpected end");
                        break;
                    }
                    Matcher matcher = o.matcher(h2);
                    if (matcher.matches()) {
                        long b2 = b(matcher, 1);
                        long b3 = b(matcher, 6);
                        StringBuilder sb = nye.a;
                        sb.setLength(0);
                        ArrayList arrayList2 = nye.b;
                        arrayList2.clear();
                        String h3 = l8b.h(C);
                        while (!TextUtils.isEmpty(h3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String trim = h3.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = v.matcher(trim);
                            int i4 = 0;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList2.add(group);
                                Matcher matcher3 = matcher2;
                                int start = matcher2.start() - i4;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i4 += length;
                                matcher2 = matcher3;
                                pk3 pk34 = pk3;
                                b3 = b3;
                            }
                            sb.append(sb2.toString());
                            pk3 pk35 = pk3;
                            b3 = b3;
                            h3 = l8b.h(C);
                        }
                        long j2 = b3;
                        Spanned fromHtml = Html.fromHtml(sb.toString());
                        int i5 = 0;
                        while (true) {
                            if (i5 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i5);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i5++;
                        }
                        if (j == -9223372036854775807L || b2 >= j) {
                            pk32 = pk3;
                            pk32.accept(new q44(b2, j2 - b2, tb7.t(a(fromHtml, str))));
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new q44(b2, j2 - b2, tb7.t(a(fromHtml, str))));
                            }
                            pk32 = pk3;
                        }
                    } else {
                        pk32 = pk33;
                        i8b.V("Skipping invalid timing: ".concat(h2));
                    }
                    pk33 = pk32;
                    nye = this;
                } catch (NumberFormatException unused) {
                    pk32 = pk33;
                    i8b.V("Skipping invalid index: ".concat(h));
                }
            }
        }
        pk3 pk36 = pk33;
        if (arrayList != null) {
            for (q44 accept : arrayList) {
                pk36.accept(accept);
            }
        }
    }

    public final int q() {
        return 1;
    }
}
