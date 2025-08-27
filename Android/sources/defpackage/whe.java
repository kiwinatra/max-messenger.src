package defpackage;

import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: whe  reason: default package */
public final class whe implements ize {
    public static final Pattern x = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final ff b;
    public final l8b c = new l8b();
    public LinkedHashMap o;
    public float v = -3.4028235E38f;
    public float w = -3.4028235E38f;

    public whe(List list) {
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String q = v0g.q((byte[]) list.get(0));
        n79.g(q.startsWith("Format:"));
        ff c2 = ff.c(q);
        c2.getClass();
        this.b = c2;
        b(new l8b((byte[]) list.get(1)), x22.c);
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            } else if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            } else {
                if (((Long) arrayList.get(size)).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            }
        }
        arrayList.add(i, Long.valueOf(j));
        if (i != 0) {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i - 1));
        }
        arrayList2.add(i, arrayList3);
        return i;
    }

    public static long c(String str) {
        Matcher matcher = x.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = v0g.a;
        return (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:149|150) */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0298, code lost:
        if (r4 != 3) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        defpackage.i8b.V("Ignoring unknown BorderStyle: " + r0);
        r4 = -1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x029a */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.l8b r37, java.nio.charset.Charset r38) {
        /*
            r36 = this;
            r1 = r36
            r2 = 6
            r3 = 3
            r4 = 7
            r5 = -1
            r6 = 2
            r7 = 0
            r8 = 1
        L_0x0009:
            java.lang.String r0 = r37.h(r38)
            if (r0 == 0) goto L_0x02f8
            java.lang.String r9 = "[Script Info]"
            boolean r9 = r9.equalsIgnoreCase(r0)
            r10 = 91
            if (r9 == 0) goto L_0x006d
        L_0x0019:
            java.lang.String r0 = r37.h(r38)
            if (r0 == 0) goto L_0x0009
            int r9 = r37.a()
            if (r9 == 0) goto L_0x002b
            char r9 = r37.c(r38)
            if (r9 == r10) goto L_0x0009
        L_0x002b:
            java.lang.String r9 = ":"
            java.lang.String[] r0 = r0.split(r9)
            int r9 = r0.length
            if (r9 == r6) goto L_0x0035
            goto L_0x0019
        L_0x0035:
            r9 = r0[r7]
            java.lang.String r9 = r9.trim()
            java.lang.String r9 = defpackage.o54.P(r9)
            r9.getClass()
            java.lang.String r11 = "playresx"
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x0060
            java.lang.String r11 = "playresy"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0053
            goto L_0x0019
        L_0x0053:
            r0 = r0[r8]     // Catch:{ NumberFormatException -> 0x0019 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0019 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0019 }
            r1.w = r0     // Catch:{ NumberFormatException -> 0x0019 }
            goto L_0x0019
        L_0x0060:
            r0 = r0[r8]     // Catch:{ NumberFormatException -> 0x0019 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0019 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0019 }
            r1.v = r0     // Catch:{ NumberFormatException -> 0x0019 }
            goto L_0x0019
        L_0x006d:
            java.lang.String r9 = "[V4+ Styles]"
            boolean r9 = r9.equalsIgnoreCase(r0)
            if (r9 == 0) goto L_0x02e2
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r11 = 0
            r12 = r11
        L_0x007c:
            java.lang.String r13 = r37.h(r38)
            if (r13 == 0) goto L_0x02da
            int r0 = r37.a()
            if (r0 == 0) goto L_0x008e
            char r0 = r37.c(r38)
            if (r0 == r10) goto L_0x02da
        L_0x008e:
            java.lang.String r0 = "Format:"
            boolean r0 = r13.startsWith(r0)
            java.lang.String r14 = ","
            if (r0 == 0) goto L_0x0172
            java.lang.String r0 = r13.substring(r4)
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r14)
            r14 = r5
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r12 = r7
        L_0x00b3:
            int r13 = r0.length
            if (r12 >= r13) goto L_0x0161
            r13 = r0[r12]
            java.lang.String r13 = r13.trim()
            java.lang.String r13 = defpackage.o54.P(r13)
            r13.getClass()
            int r24 = r13.hashCode()
            switch(r24) {
                case -1178781136: goto L_0x0134;
                case -1026963764: goto L_0x0129;
                case -192095652: goto L_0x011e;
                case -70925746: goto L_0x0113;
                case 3029637: goto L_0x0108;
                case 3373707: goto L_0x00fd;
                case 366554320: goto L_0x00f2;
                case 767321349: goto L_0x00e7;
                case 1767875043: goto L_0x00da;
                case 1988365454: goto L_0x00cd;
                default: goto L_0x00ca;
            }
        L_0x00ca:
            r4 = r5
            goto L_0x013e
        L_0x00cd:
            java.lang.String r4 = "outlinecolour"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x00d6
            goto L_0x00ca
        L_0x00d6:
            r4 = 9
            goto L_0x013e
        L_0x00da:
            java.lang.String r4 = "alignment"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x00e3
            goto L_0x00ca
        L_0x00e3:
            r4 = 8
            goto L_0x013e
        L_0x00e7:
            java.lang.String r4 = "borderstyle"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x00f0
            goto L_0x00ca
        L_0x00f0:
            r4 = 7
            goto L_0x013e
        L_0x00f2:
            java.lang.String r4 = "fontsize"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x00fb
            goto L_0x00ca
        L_0x00fb:
            r4 = r2
            goto L_0x013e
        L_0x00fd:
            java.lang.String r4 = "name"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x0106
            goto L_0x00ca
        L_0x0106:
            r4 = 5
            goto L_0x013e
        L_0x0108:
            java.lang.String r4 = "bold"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x0111
            goto L_0x00ca
        L_0x0111:
            r4 = 4
            goto L_0x013e
        L_0x0113:
            java.lang.String r4 = "primarycolour"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x011c
            goto L_0x00ca
        L_0x011c:
            r4 = r3
            goto L_0x013e
        L_0x011e:
            java.lang.String r4 = "strikeout"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x0127
            goto L_0x00ca
        L_0x0127:
            r4 = r6
            goto L_0x013e
        L_0x0129:
            java.lang.String r4 = "underline"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x0132
            goto L_0x00ca
        L_0x0132:
            r4 = r8
            goto L_0x013e
        L_0x0134:
            java.lang.String r4 = "italic"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x013d
            goto L_0x00ca
        L_0x013d:
            r4 = r7
        L_0x013e:
            switch(r4) {
                case 0: goto L_0x015b;
                case 1: goto L_0x0158;
                case 2: goto L_0x0155;
                case 3: goto L_0x0152;
                case 4: goto L_0x014f;
                case 5: goto L_0x014d;
                case 6: goto L_0x014a;
                case 7: goto L_0x0147;
                case 8: goto L_0x0145;
                case 9: goto L_0x0142;
                default: goto L_0x0141;
            }
        L_0x0141:
            goto L_0x015d
        L_0x0142:
            r17 = r12
            goto L_0x015d
        L_0x0145:
            r15 = r12
            goto L_0x015d
        L_0x0147:
            r23 = r12
            goto L_0x015d
        L_0x014a:
            r18 = r12
            goto L_0x015d
        L_0x014d:
            r14 = r12
            goto L_0x015d
        L_0x014f:
            r19 = r12
            goto L_0x015d
        L_0x0152:
            r16 = r12
            goto L_0x015d
        L_0x0155:
            r22 = r12
            goto L_0x015d
        L_0x0158:
            r21 = r12
            goto L_0x015d
        L_0x015b:
            r20 = r12
        L_0x015d:
            int r12 = r12 + r8
            r4 = 7
            goto L_0x00b3
        L_0x0161:
            if (r14 == r5) goto L_0x016e
            yhe r4 = new yhe
            int r0 = r0.length
            r13 = r4
            r24 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r12 = r4
            goto L_0x016f
        L_0x016e:
            r12 = r11
        L_0x016f:
            r4 = 7
            goto L_0x007c
        L_0x0172:
            java.lang.String r0 = "Style:"
            boolean r4 = r13.startsWith(r0)
            if (r4 == 0) goto L_0x02d4
            if (r12 != 0) goto L_0x0187
            java.lang.String r0 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.String r0 = r0.concat(r13)
            defpackage.i8b.V(r0)
            goto L_0x02d4
        L_0x0187:
            boolean r0 = r13.startsWith(r0)
            defpackage.n79.g(r0)
            java.lang.String r0 = r13.substring(r2)
            java.lang.String[] r4 = android.text.TextUtils.split(r0, r14)
            int r0 = r4.length
            int r14 = r12.k
            java.lang.String r15 = "'"
            if (r0 == r14) goto L_0x01bc
            int r0 = r4.length
            int r4 = defpackage.v0g.a
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r4 = "Skipping malformed 'Style:' line (expected "
            java.lang.String r2 = " values, found "
            java.lang.String r6 = "): '"
            java.lang.StringBuilder r0 = defpackage.a81.n(r4, r14, r2, r0, r6)
            r0.append(r13)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            defpackage.i8b.V(r0)
        L_0x01b9:
            r2 = r11
            goto L_0x02cd
        L_0x01bc:
            cie r2 = new cie     // Catch:{ RuntimeException -> 0x01d7 }
            int r0 = r12.a     // Catch:{ RuntimeException -> 0x01d7 }
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r26 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            int r0 = r12.b     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == r5) goto L_0x01da
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            int r0 = defpackage.cie.a(r0)     // Catch:{ RuntimeException -> 0x01d7 }
            r27 = r0
            goto L_0x01dc
        L_0x01d7:
            r0 = move-exception
            goto L_0x02b7
        L_0x01da:
            r27 = r5
        L_0x01dc:
            int r0 = r12.c     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == r5) goto L_0x01ed
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.Integer r0 = defpackage.cie.c(r0)     // Catch:{ RuntimeException -> 0x01d7 }
            r28 = r0
            goto L_0x01ef
        L_0x01ed:
            r28 = r11
        L_0x01ef:
            int r0 = r12.d     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == r5) goto L_0x0200
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.Integer r0 = defpackage.cie.c(r0)     // Catch:{ RuntimeException -> 0x01d7 }
            r29 = r0
            goto L_0x0202
        L_0x0200:
            r29 = r11
        L_0x0202:
            int r0 = r12.e     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == r5) goto L_0x022d
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r14 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            float r6 = java.lang.Float.parseFloat(r14)     // Catch:{ NumberFormatException -> 0x0211 }
            goto L_0x022a
        L_0x0211:
            r0 = move-exception
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r7 = "Failed to parse font size: '"
            r0.<init>(r7)     // Catch:{ RuntimeException -> 0x01d7 }
            r0.append(r14)     // Catch:{ RuntimeException -> 0x01d7 }
            r0.append(r15)     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = r0.toString()     // Catch:{ RuntimeException -> 0x01d7 }
            defpackage.i8b.W(r0, r6)     // Catch:{ RuntimeException -> 0x01d7 }
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x022a:
            r30 = r6
            goto L_0x0230
        L_0x022d:
            r30 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0230:
            int r0 = r12.f     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == r5) goto L_0x0243
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            boolean r0 = defpackage.cie.b(r0)     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == 0) goto L_0x0243
            r31 = r8
            goto L_0x0245
        L_0x0243:
            r31 = 0
        L_0x0245:
            int r0 = r12.g     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == r5) goto L_0x0258
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            boolean r0 = defpackage.cie.b(r0)     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == 0) goto L_0x0258
            r32 = r8
            goto L_0x025a
        L_0x0258:
            r32 = 0
        L_0x025a:
            int r0 = r12.h     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == r5) goto L_0x026d
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            boolean r0 = defpackage.cie.b(r0)     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == 0) goto L_0x026d
            r33 = r8
            goto L_0x026f
        L_0x026d:
            r33 = 0
        L_0x026f:
            int r0 = r12.i     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == r5) goto L_0x0282
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            boolean r0 = defpackage.cie.b(r0)     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == 0) goto L_0x0282
            r34 = r8
            goto L_0x0284
        L_0x0282:
            r34 = 0
        L_0x0284:
            int r0 = r12.j     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == r5) goto L_0x02af
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r4 = r0.trim()     // Catch:{ NumberFormatException -> 0x029a }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x029a }
            if (r4 == r8) goto L_0x02ac
            if (r4 == r3) goto L_0x02ac
        L_0x029a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r6 = "Ignoring unknown BorderStyle: "
            r4.<init>(r6)     // Catch:{ RuntimeException -> 0x01d7 }
            r4.append(r0)     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = r4.toString()     // Catch:{ RuntimeException -> 0x01d7 }
            defpackage.i8b.V(r0)     // Catch:{ RuntimeException -> 0x01d7 }
            r4 = r5
        L_0x02ac:
            r35 = r4
            goto L_0x02b1
        L_0x02af:
            r35 = r5
        L_0x02b1:
            r25 = r2
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ RuntimeException -> 0x01d7 }
            goto L_0x02cd
        L_0x02b7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Skipping malformed 'Style:' line: '"
            r2.<init>(r4)
            r2.append(r13)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            defpackage.i8b.W(r2, r0)
            goto L_0x01b9
        L_0x02cd:
            if (r2 == 0) goto L_0x02d4
            java.lang.String r0 = r2.a
            r9.put(r0, r2)
        L_0x02d4:
            r2 = 6
            r4 = 7
            r6 = 2
            r7 = 0
            goto L_0x007c
        L_0x02da:
            r1.o = r9
        L_0x02dc:
            r2 = 6
            r4 = 7
            r6 = 2
            r7 = 0
            goto L_0x0009
        L_0x02e2:
            java.lang.String r2 = "[V4 Styles]"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L_0x02f0
            java.lang.String r0 = "[V4 Styles] are not supported"
            defpackage.i8b.F(r0)
            goto L_0x02dc
        L_0x02f0:
            java.lang.String r2 = "[Events]"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x02dc
        L_0x02f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whe.b(l8b, java.nio.charset.Charset):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0223, code lost:
        r6 = kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0225, code lost:
        switch(r0) {
            case -1: goto L_0x022b;
            case 0: goto L_0x0228;
            case 1: goto L_0x0231;
            case 2: goto L_0x022f;
            case 3: goto L_0x022d;
            case 4: goto L_0x0231;
            case 5: goto L_0x022f;
            case 6: goto L_0x022d;
            case 7: goto L_0x0231;
            case 8: goto L_0x022f;
            case 9: goto L_0x022d;
            default: goto L_0x0228;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0228, code lost:
        defpackage.i2a.m(r0, "Unknown alignment: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x022b, code lost:
        r7 = Integer.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x022d, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x022f, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0231, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0232, code lost:
        switch(r0) {
            case -1: goto L_0x023e;
            case 0: goto L_0x0235;
            case 1: goto L_0x023d;
            case 2: goto L_0x023d;
            case 3: goto L_0x023d;
            case 4: goto L_0x023b;
            case 5: goto L_0x023b;
            case 6: goto L_0x023b;
            case 7: goto L_0x0239;
            case 8: goto L_0x0239;
            case 9: goto L_0x0239;
            default: goto L_0x0235;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0235, code lost:
        defpackage.i2a.m(r0, "Unknown alignment: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0239, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x023b, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x023d, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0241, code lost:
        if (r13 == null) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0245, code lost:
        if (r10 == -3.4028235E38f) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0249, code lost:
        if (r9 == -3.4028235E38f) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x024b, code lost:
        r26 = r13.x / r9;
        r23 = r13.y / r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0256, code lost:
        r0 = 0.05f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x025e, code lost:
        if (r7 == 0) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0260, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0261, code lost:
        if (r7 == 1) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0263, code lost:
        r12 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0264, code lost:
        if (r7 == 2) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0266, code lost:
        r13 = -3.4028235E38f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0268, code lost:
        r13 = 0.95f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x026a, code lost:
        r12 = 2;
        r13 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x026d, code lost:
        r10 = 1;
        r12 = 2;
        r13 = 0.05f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0270, code lost:
        if (r6 == 0) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0272, code lost:
        if (r6 == r10) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0274, code lost:
        if (r6 == r12) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0276, code lost:
        r0 = -3.4028235E38f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0278, code lost:
        r0 = 0.95f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x027a, code lost:
        r0 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x027b, code lost:
        r23 = r0;
        r26 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x027f, code lost:
        r18 = new defpackage.n44(r11, r20, (android.text.Layout.Alignment) null, (android.graphics.Bitmap) null, r23, 0, r6, r26, r7, r28, r29, -3.4028235E38f, -3.4028235E38f, false, -16777216, kotlin.jvm.internal.IntCompanionObject.MIN_VALUE, defpackage.c44.DEFAULT_ASPECT_RATIO);
        r3 = a(r14, r5, r4);
        r1 = a(r1, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02a3, code lost:
        if (r3 >= r1) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02a5, code lost:
        ((java.util.List) r4.get(r3)).add(r18);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0215, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x021a, code lost:
        r20 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ef */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x010e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fb A[Catch:{ RuntimeException -> 0x010e }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(byte[] r38, int r39, int r40, defpackage.hze r41, defpackage.pk3 r42) {
        /*
            r37 = this;
            r0 = r37
            r1 = r39
            r2 = r41
            r3 = r42
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r1 + r40
            l8b r7 = r0.c
            r8 = r38
            r7.E(r6, r8)
            r7.G(r1)
            java.nio.charset.Charset r1 = r7.C()
            if (r1 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            java.nio.charset.Charset r1 = defpackage.x22.c
        L_0x0027:
            boolean r6 = r0.a
            if (r6 != 0) goto L_0x002e
            r0.b(r7, r1)
        L_0x002e:
            if (r6 == 0) goto L_0x0033
            ff r6 = r0.b
            goto L_0x0034
        L_0x0033:
            r6 = 0
        L_0x0034:
            java.lang.String r9 = r7.h(r1)
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 == 0) goto L_0x02bf
            java.lang.String r13 = "Format:"
            boolean r13 = r9.startsWith(r13)
            if (r13 == 0) goto L_0x004c
            ff r6 = defpackage.ff.c(r9)
            goto L_0x0034
        L_0x004c:
            java.lang.String r13 = "Dialogue:"
            boolean r14 = r9.startsWith(r13)
            if (r14 == 0) goto L_0x005f
            if (r6 != 0) goto L_0x0067
            java.lang.String r10 = "Skipping dialogue line before complete format: "
            java.lang.String r9 = r10.concat(r9)
            defpackage.i8b.V(r9)
        L_0x005f:
            r16 = r1
        L_0x0061:
            r17 = r6
            r36 = r7
            goto L_0x02b1
        L_0x0067:
            boolean r13 = r9.startsWith(r13)
            defpackage.n79.g(r13)
            r13 = 9
            java.lang.String r13 = r9.substring(r13)
            java.lang.String r14 = ","
            int r15 = r6.e
            java.lang.String[] r13 = r13.split(r14, r15)
            int r14 = r13.length
            if (r14 == r15) goto L_0x0089
            java.lang.String r10 = "Skipping dialogue line with fewer columns than format: "
            java.lang.String r9 = r10.concat(r9)
            defpackage.i8b.V(r9)
            goto L_0x005f
        L_0x0089:
            int r14 = r6.a
            r14 = r13[r14]
            long r14 = c(r14)
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            java.lang.String r8 = "Skipping invalid timing: "
            if (r16 != 0) goto L_0x009f
            java.lang.String r8 = r8.concat(r9)
            defpackage.i8b.V(r8)
            goto L_0x005f
        L_0x009f:
            int r10 = r6.b
            r10 = r13[r10]
            r16 = r1
            long r1 = c(r10)
            int r10 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x00b5
            java.lang.String r1 = r8.concat(r9)
            defpackage.i8b.V(r1)
            goto L_0x0061
        L_0x00b5:
            java.util.LinkedHashMap r8 = r0.o
            r9 = -1
            if (r8 == 0) goto L_0x00cb
            int r10 = r6.c
            if (r10 == r9) goto L_0x00cb
            r10 = r13[r10]
            java.lang.String r10 = r10.trim()
            java.lang.Object r8 = r8.get(r10)
            cie r8 = (defpackage.cie) r8
            goto L_0x00cc
        L_0x00cb:
            r8 = 0
        L_0x00cc:
            int r10 = r6.d
            r10 = r13[r10]
            java.util.regex.Pattern r11 = defpackage.aie.a
            java.util.regex.Matcher r11 = r11.matcher(r10)
            r12 = r9
            r13 = 0
        L_0x00d8:
            boolean r17 = r11.find()
            if (r17 == 0) goto L_0x0112
            r17 = r6
            r9 = 1
            java.lang.String r6 = r11.group(r9)
            r6.getClass()
            android.graphics.PointF r9 = defpackage.aie.a(r6)     // Catch:{ RuntimeException -> 0x00ef }
            if (r9 == 0) goto L_0x00ef
            r13 = r9
        L_0x00ef:
            java.util.regex.Pattern r9 = defpackage.aie.d     // Catch:{ RuntimeException -> 0x010e }
            java.util.regex.Matcher r6 = r9.matcher(r6)     // Catch:{ RuntimeException -> 0x010e }
            boolean r9 = r6.find()     // Catch:{ RuntimeException -> 0x010e }
            if (r9 == 0) goto L_0x0109
            r9 = 1
            java.lang.String r6 = r6.group(r9)     // Catch:{ RuntimeException -> 0x010e }
            r6.getClass()     // Catch:{ RuntimeException -> 0x010e }
            int r6 = defpackage.cie.a(r6)     // Catch:{ RuntimeException -> 0x010e }
        L_0x0107:
            r9 = -1
            goto L_0x010b
        L_0x0109:
            r6 = -1
            goto L_0x0107
        L_0x010b:
            if (r6 == r9) goto L_0x010e
            r12 = r6
        L_0x010e:
            r6 = r17
            r9 = -1
            goto L_0x00d8
        L_0x0112:
            r17 = r6
            aie r6 = new aie
            java.util.regex.Pattern r6 = defpackage.aie.a
            java.util.regex.Matcher r6 = r6.matcher(r10)
            java.lang.String r9 = ""
            java.lang.String r6 = r6.replaceAll(r9)
            java.lang.String r9 = "\\N"
            java.lang.String r10 = "\n"
            java.lang.String r6 = r6.replace(r9, r10)
            java.lang.String r9 = "\\n"
            java.lang.String r6 = r6.replace(r9, r10)
            java.lang.String r9 = "\\h"
            java.lang.String r10 = " "
            java.lang.String r6 = r6.replace(r9, r10)
            float r9 = r0.v
            float r10 = r0.w
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r6)
            r31 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r34 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == 0) goto L_0x01fe
            java.lang.Integer r6 = r8.c
            if (r6 == 0) goto L_0x0162
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r6 = r6.intValue()
            r0.<init>(r6)
            int r6 = r11.length()
            r36 = r7
            r3 = 33
            r7 = 0
            r11.setSpan(r0, r7, r6, r3)
            goto L_0x0164
        L_0x0162:
            r36 = r7
        L_0x0164:
            int r0 = r8.j
            r3 = 3
            if (r0 != r3) goto L_0x0180
            java.lang.Integer r0 = r8.d
            if (r0 == 0) goto L_0x0180
            android.text.style.BackgroundColorSpan r6 = new android.text.style.BackgroundColorSpan
            int r0 = r0.intValue()
            r6.<init>(r0)
            int r0 = r11.length()
            r3 = 33
            r7 = 0
            r11.setSpan(r6, r7, r0, r3)
        L_0x0180:
            float r0 = r8.e
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0191
            int r6 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0191
            float r0 = r0 / r10
            r3 = r0
            r0 = 1
            goto L_0x0195
        L_0x0191:
            r3 = r31
            r0 = r34
        L_0x0195:
            boolean r6 = r8.g
            boolean r7 = r8.f
            if (r7 == 0) goto L_0x01b2
            if (r6 == 0) goto L_0x01b2
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r7 = 3
            r6.<init>(r7)
            int r7 = r11.length()
            r21 = r0
            r20 = r3
            r0 = 0
            r3 = 33
            r11.setSpan(r6, r0, r7, r3)
            goto L_0x01d8
        L_0x01b2:
            r21 = r0
            r20 = r3
            r0 = 0
            r3 = 33
            if (r7 == 0) goto L_0x01c9
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r7 = 1
            r6.<init>(r7)
            int r7 = r11.length()
            r11.setSpan(r6, r0, r7, r3)
            goto L_0x01d8
        L_0x01c9:
            if (r6 == 0) goto L_0x01d8
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r7 = 2
            r6.<init>(r7)
            int r7 = r11.length()
            r11.setSpan(r6, r0, r7, r3)
        L_0x01d8:
            boolean r6 = r8.h
            if (r6 == 0) goto L_0x01e8
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            int r7 = r11.length()
            r11.setSpan(r6, r0, r7, r3)
        L_0x01e8:
            boolean r6 = r8.i
            if (r6 == 0) goto L_0x01f8
            android.text.style.StrikethroughSpan r6 = new android.text.style.StrikethroughSpan
            r6.<init>()
            int r7 = r11.length()
            r11.setSpan(r6, r0, r7, r3)
        L_0x01f8:
            r29 = r20
            r28 = r21
        L_0x01fc:
            r0 = -1
            goto L_0x0205
        L_0x01fe:
            r36 = r7
            r29 = r31
            r28 = r34
            goto L_0x01fc
        L_0x0205:
            if (r12 == r0) goto L_0x0209
            r0 = r12
            goto L_0x020d
        L_0x0209:
            if (r8 == 0) goto L_0x020d
            int r0 = r8.b
        L_0x020d:
            java.lang.String r3 = "Unknown alignment: "
            switch(r0) {
                case -1: goto L_0x0215;
                case 0: goto L_0x0212;
                case 1: goto L_0x0220;
                case 2: goto L_0x021d;
                case 3: goto L_0x0218;
                case 4: goto L_0x0220;
                case 5: goto L_0x021d;
                case 6: goto L_0x0218;
                case 7: goto L_0x0220;
                case 8: goto L_0x021d;
                case 9: goto L_0x0218;
                default: goto L_0x0212;
            }
        L_0x0212:
            defpackage.i2a.m(r0, r3)
        L_0x0215:
            r20 = 0
            goto L_0x0223
        L_0x0218:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x021a:
            r20 = r6
            goto L_0x0223
        L_0x021d:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x021a
        L_0x0220:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x021a
        L_0x0223:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r0) {
                case -1: goto L_0x022b;
                case 0: goto L_0x0228;
                case 1: goto L_0x0231;
                case 2: goto L_0x022f;
                case 3: goto L_0x022d;
                case 4: goto L_0x0231;
                case 5: goto L_0x022f;
                case 6: goto L_0x022d;
                case 7: goto L_0x0231;
                case 8: goto L_0x022f;
                case 9: goto L_0x022d;
                default: goto L_0x0228;
            }
        L_0x0228:
            defpackage.i2a.m(r0, r3)
        L_0x022b:
            r7 = r6
            goto L_0x0232
        L_0x022d:
            r7 = 2
            goto L_0x0232
        L_0x022f:
            r7 = 1
            goto L_0x0232
        L_0x0231:
            r7 = 0
        L_0x0232:
            switch(r0) {
                case -1: goto L_0x023e;
                case 0: goto L_0x0235;
                case 1: goto L_0x023d;
                case 2: goto L_0x023d;
                case 3: goto L_0x023d;
                case 4: goto L_0x023b;
                case 5: goto L_0x023b;
                case 6: goto L_0x023b;
                case 7: goto L_0x0239;
                case 8: goto L_0x0239;
                case 9: goto L_0x0239;
                default: goto L_0x0235;
            }
        L_0x0235:
            defpackage.i2a.m(r0, r3)
            goto L_0x023e
        L_0x0239:
            r6 = 0
            goto L_0x023e
        L_0x023b:
            r6 = 1
            goto L_0x023e
        L_0x023d:
            r6 = 2
        L_0x023e:
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r13 == 0) goto L_0x0256
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0256
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0256
            float r0 = r13.x
            float r0 = r0 / r9
            float r3 = r13.y
            float r3 = r3 / r10
            r26 = r0
            r23 = r3
            goto L_0x027f
        L_0x0256:
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            r8 = 1056964608(0x3f000000, float:0.5)
            r9 = 1064514355(0x3f733333, float:0.95)
            if (r7 == 0) goto L_0x026d
            r10 = 1
            if (r7 == r10) goto L_0x026a
            r12 = 2
            if (r7 == r12) goto L_0x0268
            r13 = r3
            goto L_0x0270
        L_0x0268:
            r13 = r9
            goto L_0x0270
        L_0x026a:
            r12 = 2
            r13 = r8
            goto L_0x0270
        L_0x026d:
            r10 = 1
            r12 = 2
            r13 = r0
        L_0x0270:
            if (r6 == 0) goto L_0x027b
            if (r6 == r10) goto L_0x027a
            if (r6 == r12) goto L_0x0278
            r0 = r3
            goto L_0x027b
        L_0x0278:
            r0 = r9
            goto L_0x027b
        L_0x027a:
            r0 = r8
        L_0x027b:
            r23 = r0
            r26 = r13
        L_0x027f:
            n44 r0 = new n44
            r18 = r0
            r22 = 0
            r21 = r22
            r32 = 0
            r33 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r35 = 0
            r19 = r11
            r3 = 0
            r24 = r3
            r25 = r6
            r27 = r7
            r30 = r31
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            int r3 = a(r14, r5, r4)
            int r1 = a(r1, r5, r4)
        L_0x02a3:
            if (r3 >= r1) goto L_0x02b1
            java.lang.Object r2 = r4.get(r3)
            java.util.List r2 = (java.util.List) r2
            r2.add(r0)
            int r3 = r3 + 1
            goto L_0x02a3
        L_0x02b1:
            r0 = r37
            r2 = r41
            r3 = r42
            r1 = r16
            r6 = r17
            r7 = r36
            goto L_0x0034
        L_0x02bf:
            r0 = r2
            long r1 = r0.b
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x02d0
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x02d0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L_0x02d1
        L_0x02d0:
            r8 = 0
        L_0x02d1:
            r0 = 0
        L_0x02d2:
            int r3 = r4.size()
            if (r0 >= r3) goto L_0x0341
            java.lang.Object r3 = r4.get(r0)
            r18 = r3
            java.util.List r18 = (java.util.List) r18
            boolean r3 = r18.isEmpty()
            if (r3 == 0) goto L_0x02ec
            if (r0 == 0) goto L_0x02ec
            r7 = r42
            r6 = 1
            goto L_0x0338
        L_0x02ec:
            int r3 = r4.size()
            r6 = 1
            int r3 = r3 - r6
            if (r0 == r3) goto L_0x033b
            java.lang.Object r3 = r5.get(r0)
            java.lang.Long r3 = (java.lang.Long) r3
            long r14 = r3.longValue()
            int r3 = r0 + 1
            java.lang.Object r3 = r5.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r9 = r3.longValue()
            java.lang.Object r3 = r5.get(r0)
            java.lang.Long r3 = (java.lang.Long) r3
            long r16 = r3.longValue()
            long r16 = r9 - r16
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x032d
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x031f
            goto L_0x032d
        L_0x031f:
            if (r8 == 0) goto L_0x032a
            q44 r3 = new q44
            r13 = r3
            r13.<init>(r14, r16, r18)
            r8.add(r3)
        L_0x032a:
            r7 = r42
            goto L_0x0338
        L_0x032d:
            q44 r3 = new q44
            r13 = r3
            r13.<init>(r14, r16, r18)
            r7 = r42
            r7.accept(r3)
        L_0x0338:
            int r0 = r0 + 1
            goto L_0x02d2
        L_0x033b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0341:
            r7 = r42
            if (r8 == 0) goto L_0x0359
            java.util.Iterator r0 = r8.iterator()
        L_0x0349:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0359
            java.lang.Object r1 = r0.next()
            q44 r1 = (defpackage.q44) r1
            r7.accept(r1)
            goto L_0x0349
        L_0x0359:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whe.m(byte[], int, int, hze, pk3):void");
    }

    public final int q() {
        return 1;
    }
}
