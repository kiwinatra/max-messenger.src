package defpackage;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: mye  reason: default package */
public final class mye extends ibe {
    public static final Pattern x0 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern y0 = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder v0 = new StringBuilder();
    public final ArrayList w0 = new ArrayList();

    public static long g(Matcher matcher, int i) {
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

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.uye a(int r30, byte[] r31, boolean r32) {
        /*
            r29 = this;
            r0 = r29
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 32
            long[] r2 = new long[r2]
            g1g r3 = new g1g
            r4 = r30
            r5 = r31
            r3.<init>((int) r4, (byte[]) r5)
            r4 = 0
            r5 = r4
        L_0x0016:
            java.lang.String r6 = r3.i()
            if (r6 == 0) goto L_0x002c
            int r7 = r6.length()
            if (r7 != 0) goto L_0x0023
            goto L_0x0016
        L_0x0023:
            java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x025a }
            java.lang.String r6 = r3.i()
            if (r6 != 0) goto L_0x002f
        L_0x002c:
            r0 = r4
            goto L_0x0266
        L_0x002f:
            java.util.regex.Pattern r7 = x0
            java.util.regex.Matcher r7 = r7.matcher(r6)
            boolean r8 = r7.matches()
            if (r8 == 0) goto L_0x024c
            r6 = 1
            long r8 = g(r7, r6)
            int r10 = r2.length
            if (r5 != r10) goto L_0x0049
            int r10 = r5 * 2
            long[] r2 = java.util.Arrays.copyOf(r2, r10)
        L_0x0049:
            int r10 = r5 + 1
            r2[r5] = r8
            r8 = 6
            long r11 = g(r7, r8)
            int r7 = r2.length
            if (r10 != r7) goto L_0x005b
            int r7 = r10 * 2
            long[] r2 = java.util.Arrays.copyOf(r2, r7)
        L_0x005b:
            int r5 = r5 + 2
            r2[r10] = r11
            java.lang.StringBuilder r7 = r0.v0
            r7.setLength(r4)
            java.util.ArrayList r9 = r0.w0
            r9.clear()
            java.lang.String r10 = r3.i()
        L_0x006d:
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00bb
            int r11 = r7.length()
            if (r11 <= 0) goto L_0x007e
            java.lang.String r11 = "<br>"
            r7.append(r11)
        L_0x007e:
            java.lang.String r10 = r10.trim()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            java.util.regex.Pattern r12 = y0
            java.util.regex.Matcher r10 = r12.matcher(r10)
            r12 = r4
        L_0x008e:
            boolean r13 = r10.find()
            if (r13 == 0) goto L_0x00ae
            java.lang.String r13 = r10.group()
            r9.add(r13)
            int r14 = r10.start()
            int r14 = r14 - r12
            int r13 = r13.length()
            int r15 = r14 + r13
            java.lang.String r8 = ""
            r11.replace(r14, r15, r8)
            int r12 = r12 + r13
            r8 = 6
            goto L_0x008e
        L_0x00ae:
            java.lang.String r8 = r11.toString()
            r7.append(r8)
            java.lang.String r10 = r3.i()
            r8 = 6
            goto L_0x006d
        L_0x00bb:
            java.lang.String r7 = r7.toString()
            android.text.Spanned r11 = android.text.Html.fromHtml(r7)
            r7 = r4
        L_0x00c4:
            int r8 = r9.size()
            if (r7 >= r8) goto L_0x00dc
            java.lang.Object r8 = r9.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = "\\{\\\\an[1-9]\\}"
            boolean r10 = r8.matches(r10)
            if (r10 == 0) goto L_0x00d9
            goto L_0x00dd
        L_0x00d9:
            int r7 = r7 + 1
            goto L_0x00c4
        L_0x00dc:
            r8 = 0
        L_0x00dd:
            r27 = 0
            r14 = 0
            r23 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r26 = -2147483648(0xffffffff80000000, float:-0.0)
            r24 = 0
            r25 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r8 != 0) goto L_0x0107
            m44 r6 = new m44
            r10 = r6
            r12 = r14
            r13 = r14
            r15 = r23
            r16 = r26
            r17 = r26
            r18 = r23
            r19 = r26
            r20 = r26
            r21 = r23
            r22 = r23
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r28 = r2
            goto L_0x023d
        L_0x0107:
            int r7 = r8.hashCode()
            java.lang.String r10 = "{\\an1}"
            java.lang.String r12 = "{\\an2}"
            java.lang.String r13 = "{\\an3}"
            java.lang.String r15 = "{\\an4}"
            r16 = 7
            java.lang.String r4 = "{\\an5}"
            java.lang.String r14 = "{\\an6}"
            java.lang.String r9 = "{\\an7}"
            r18 = 8
            java.lang.String r6 = "{\\an8}"
            java.lang.String r0 = "{\\an9}"
            r20 = -1
            r28 = r2
            switch(r7) {
                case -685620710: goto L_0x016b;
                case -685620679: goto L_0x0163;
                case -685620648: goto L_0x015b;
                case -685620617: goto L_0x0153;
                case -685620586: goto L_0x014a;
                case -685620555: goto L_0x0142;
                case -685620524: goto L_0x013a;
                case -685620493: goto L_0x0131;
                case -685620462: goto L_0x0129;
                default: goto L_0x0128;
            }
        L_0x0128:
            goto L_0x0173
        L_0x0129:
            boolean r7 = r8.equals(r0)
            if (r7 == 0) goto L_0x0173
            r7 = 5
            goto L_0x0175
        L_0x0131:
            boolean r7 = r8.equals(r6)
            if (r7 == 0) goto L_0x0173
            r7 = r18
            goto L_0x0175
        L_0x013a:
            boolean r7 = r8.equals(r9)
            if (r7 == 0) goto L_0x0173
            r7 = 2
            goto L_0x0175
        L_0x0142:
            boolean r7 = r8.equals(r14)
            if (r7 == 0) goto L_0x0173
            r7 = 4
            goto L_0x0175
        L_0x014a:
            boolean r7 = r8.equals(r4)
            if (r7 == 0) goto L_0x0173
            r7 = r16
            goto L_0x0175
        L_0x0153:
            boolean r7 = r8.equals(r15)
            if (r7 == 0) goto L_0x0173
            r7 = 1
            goto L_0x0175
        L_0x015b:
            boolean r7 = r8.equals(r13)
            if (r7 == 0) goto L_0x0173
            r7 = 3
            goto L_0x0175
        L_0x0163:
            boolean r7 = r8.equals(r12)
            if (r7 == 0) goto L_0x0173
            r7 = 6
            goto L_0x0175
        L_0x016b:
            boolean r7 = r8.equals(r10)
            if (r7 == 0) goto L_0x0173
            r7 = 0
            goto L_0x0175
        L_0x0173:
            r7 = r20
        L_0x0175:
            if (r7 == 0) goto L_0x018a
            r2 = 1
            if (r7 == r2) goto L_0x018a
            r2 = 2
            if (r7 == r2) goto L_0x018a
            r2 = 3
            if (r7 == r2) goto L_0x0188
            r2 = 4
            if (r7 == r2) goto L_0x0188
            r2 = 5
            if (r7 == r2) goto L_0x0188
            r2 = 1
            goto L_0x018b
        L_0x0188:
            r2 = 2
            goto L_0x018b
        L_0x018a:
            r2 = 0
        L_0x018b:
            int r7 = r8.hashCode()
            switch(r7) {
                case -685620710: goto L_0x01d5;
                case -685620679: goto L_0x01cd;
                case -685620648: goto L_0x01c5;
                case -685620617: goto L_0x01bd;
                case -685620586: goto L_0x01b4;
                case -685620555: goto L_0x01ab;
                case -685620524: goto L_0x01a3;
                case -685620493: goto L_0x019b;
                case -685620462: goto L_0x0193;
                default: goto L_0x0192;
            }
        L_0x0192:
            goto L_0x01dd
        L_0x0193:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x01dd
            r8 = 5
            goto L_0x01df
        L_0x019b:
            boolean r0 = r8.equals(r6)
            if (r0 == 0) goto L_0x01dd
            r8 = 4
            goto L_0x01df
        L_0x01a3:
            boolean r0 = r8.equals(r9)
            if (r0 == 0) goto L_0x01dd
            r8 = 3
            goto L_0x01df
        L_0x01ab:
            boolean r0 = r8.equals(r14)
            if (r0 == 0) goto L_0x01dd
            r8 = r18
            goto L_0x01df
        L_0x01b4:
            boolean r0 = r8.equals(r4)
            if (r0 == 0) goto L_0x01dd
            r8 = r16
            goto L_0x01df
        L_0x01bd:
            boolean r0 = r8.equals(r15)
            if (r0 == 0) goto L_0x01dd
            r8 = 6
            goto L_0x01df
        L_0x01c5:
            boolean r0 = r8.equals(r13)
            if (r0 == 0) goto L_0x01dd
            r8 = 2
            goto L_0x01df
        L_0x01cd:
            boolean r0 = r8.equals(r12)
            if (r0 == 0) goto L_0x01dd
            r8 = 1
            goto L_0x01df
        L_0x01d5:
            boolean r0 = r8.equals(r10)
            if (r0 == 0) goto L_0x01dd
            r8 = 0
            goto L_0x01df
        L_0x01dd:
            r8 = r20
        L_0x01df:
            if (r8 == 0) goto L_0x01f4
            r0 = 1
            if (r8 == r0) goto L_0x01f4
            r0 = 2
            if (r8 == r0) goto L_0x01f4
            r0 = 3
            if (r8 == r0) goto L_0x01f2
            r0 = 4
            if (r8 == r0) goto L_0x01f2
            r0 = 5
            if (r8 == r0) goto L_0x01f2
            r0 = 1
            goto L_0x01f5
        L_0x01f2:
            r0 = 0
            goto L_0x01f5
        L_0x01f4:
            r0 = 2
        L_0x01f5:
            r4 = 1034147594(0x3da3d70a, float:0.08)
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1064011039(0x3f6b851f, float:0.92)
            if (r2 == 0) goto L_0x0212
            r8 = 1
            if (r2 == r8) goto L_0x020e
            r9 = 2
            if (r2 != r9) goto L_0x0208
            r18 = r7
            goto L_0x0216
        L_0x0208:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x020e:
            r9 = 2
            r18 = r6
            goto L_0x0216
        L_0x0212:
            r8 = 1
            r9 = 2
            r18 = r4
        L_0x0216:
            if (r0 == 0) goto L_0x0226
            if (r0 == r8) goto L_0x0224
            if (r0 != r9) goto L_0x021e
            r15 = r7
            goto L_0x0227
        L_0x021e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0224:
            r15 = r6
            goto L_0x0227
        L_0x0226:
            r15 = r4
        L_0x0227:
            m44 r6 = new m44
            r10 = r6
            r16 = 0
            r4 = 0
            r12 = r4
            r13 = r4
            r14 = r4
            r17 = r0
            r19 = r2
            r20 = r26
            r21 = r23
            r22 = r23
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x023d:
            r1.add(r6)
            m44 r0 = defpackage.m44.A0
            r1.add(r0)
            r0 = r29
            r2 = r28
        L_0x0249:
            r4 = 0
            goto L_0x0016
        L_0x024c:
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0257
            java.lang.String r0 = "Skipping invalid timing: "
            r0.concat(r6)
        L_0x0257:
            r0 = r29
            goto L_0x0249
        L_0x025a:
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0257
            java.lang.String r0 = "Skipping invalid index: "
            r0.concat(r6)
            goto L_0x0257
        L_0x0266:
            m44[] r0 = new defpackage.m44[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            m44[] r0 = (defpackage.m44[]) r0
            long[] r1 = java.util.Arrays.copyOf(r2, r5)
            wsb r2 = new wsb
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mye.a(int, byte[], boolean):uye");
    }
}
