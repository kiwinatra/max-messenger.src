package defpackage;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: ra5  reason: default package */
public final class ra5 {
    public static final Pattern c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final ArrayList f;
    public final ArrayList a;
    public final ByteOrder b;

    static {
        pa5 pa5 = new pa5(0);
        pa5.b = 0;
        f = Collections.list(pa5);
    }

    public ra5(ByteOrder byteOrder) {
        pa5 pa5 = new pa5(1);
        pa5.b = 0;
        this.a = Collections.list(pa5);
        this.b = byteOrder;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:67|68|69) */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        java.lang.Double.parseDouble(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
        return new android.util.Pair(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0150, code lost:
        return new android.util.Pair(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x013c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair a(java.lang.String r10) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r10.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r10 = r10.split(r0, r6)
            r0 = r10[r2]
            android.util.Pair r0 = a(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r10.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r10[r3]
            android.util.Pair r1 = a(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r6
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = r6
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r10.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r10 = r10.split(r0, r6)
            int r0 = r10.length
            if (r0 != r4) goto L_0x00ff
            r0 = r10[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r10 = r10[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r4 = 10
            if (r10 < 0) goto L_0x00f5
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r0 = 5
            if (r10 > 0) goto L_0x00eb
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00eb:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00f5:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00ff:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x013c }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r3 = 4
            if (r2 < 0) goto L_0x0124
            r8 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0124
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x0124:
            if (r2 >= 0) goto L_0x0132
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x0132:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x013c:
            java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x014b }
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014b }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014b }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x014b }
            return r10
        L_0x014b:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra5.a(java.lang.String):android.util.Pair");
    }

    public final void b(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        c(str, str2, arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013b, code lost:
        if (r12 != r7) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018c, code lost:
        r11 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x018d, code lost:
        r12 = 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.String r24, java.lang.String r25, java.util.List r26) {
        /*
            r23 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = 0
            r4 = 1
            java.lang.String r5 = "/10000"
            java.lang.String r6 = "DateTime"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0022
            java.lang.String r6 = "DateTimeOriginal"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0022
            java.lang.String r6 = "DateTimeDigitized"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0051
        L_0x0022:
            if (r1 == 0) goto L_0x0051
            java.util.regex.Pattern r6 = d
            java.util.regex.Matcher r6 = r6.matcher(r1)
            boolean r6 = r6.find()
            java.util.regex.Pattern r7 = e
            java.util.regex.Matcher r7 = r7.matcher(r1)
            boolean r7 = r7.find()
            int r8 = r25.length()
            r9 = 19
            if (r8 != r9) goto L_0x0050
            if (r6 != 0) goto L_0x0045
            if (r7 != 0) goto L_0x0045
            goto L_0x0050
        L_0x0045:
            if (r7 == 0) goto L_0x0051
            java.lang.String r6 = "-"
            java.lang.String r7 = ":"
            java.lang.String r1 = r1.replaceAll(r6, r7)
            goto L_0x0051
        L_0x0050:
            return
        L_0x0051:
            java.lang.String r6 = "ISOSpeedRatings"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005b
            java.lang.String r0 = "PhotographicSensitivity"
        L_0x005b:
            r6 = 3
            r7 = 2
            if (r1 == 0) goto L_0x00d9
            java.util.HashSet r8 = defpackage.sa5.e
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L_0x00d9
            java.lang.String r8 = "GPSTimeStamp"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x00bd
            java.util.regex.Pattern r5 = c
            java.util.regex.Matcher r1 = r5.matcher(r1)
            boolean r5 = r1.find()
            if (r5 != 0) goto L_0x007c
            return
        L_0x007c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = r1.group(r4)
            r8.getClass()
            int r8 = java.lang.Integer.parseInt(r8)
            r5.append(r8)
            java.lang.String r8 = "/1,"
            r5.append(r8)
            java.lang.String r9 = r1.group(r7)
            r9.getClass()
            int r9 = java.lang.Integer.parseInt(r9)
            r5.append(r9)
            r5.append(r8)
            java.lang.String r1 = r1.group(r6)
            r1.getClass()
            int r1 = java.lang.Integer.parseInt(r1)
            r5.append(r1)
            java.lang.String r1 = "/1"
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            goto L_0x00d9
        L_0x00bd:
            double r8 = java.lang.Double.parseDouble(r1)     // Catch:{ NumberFormatException -> 0x00d8 }
            r10 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r8 = r8 * r10
            long r8 = (long) r8     // Catch:{ NumberFormatException -> 0x00d8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00d8 }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x00d8 }
            r1.append(r8)     // Catch:{ NumberFormatException -> 0x00d8 }
            r1.append(r5)     // Catch:{ NumberFormatException -> 0x00d8 }
            java.lang.String r1 = r1.toString()     // Catch:{ NumberFormatException -> 0x00d8 }
            goto L_0x00d9
        L_0x00d8:
            return
        L_0x00d9:
            r5 = r3
        L_0x00da:
            eb5[] r8 = defpackage.sa5.c
            r8 = 4
            if (r5 >= r8) goto L_0x037f
            java.util.ArrayList r8 = f
            java.lang.Object r8 = r8.get(r5)
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r8 = r8.get(r0)
            eb5 r8 = (defpackage.eb5) r8
            if (r8 == 0) goto L_0x00fa
            if (r1 != 0) goto L_0x0100
            java.lang.Object r8 = r2.get(r5)
            java.util.Map r8 = (java.util.Map) r8
            r8.remove(r0)
        L_0x00fa:
            r9 = r23
        L_0x00fc:
            r11 = r6
            r12 = r7
            goto L_0x037a
        L_0x0100:
            android.util.Pair r9 = a(r1)
            java.lang.Object r10 = r9.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r11 = -1
            int r12 = r8.c
            if (r12 == r10) goto L_0x013d
            java.lang.Object r10 = r9.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r12 != r10) goto L_0x011c
            goto L_0x013d
        L_0x011c:
            int r8 = r8.d
            if (r8 == r11) goto L_0x0136
            java.lang.Object r10 = r9.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r8 == r10) goto L_0x0134
            java.lang.Object r9 = r9.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r8 != r9) goto L_0x0136
        L_0x0134:
            r12 = r8
            goto L_0x013d
        L_0x0136:
            if (r12 == r4) goto L_0x013d
            r8 = 7
            if (r12 == r8) goto L_0x013d
            if (r12 != r7) goto L_0x00fa
        L_0x013d:
            java.lang.String r8 = "/"
            r9 = r23
            java.nio.ByteOrder r10 = r9.b
            java.lang.String r13 = ","
            switch(r12) {
                case 1: goto L_0x033a;
                case 2: goto L_0x031a;
                case 3: goto L_0x02d5;
                case 4: goto L_0x02b0;
                case 5: goto L_0x0241;
                case 6: goto L_0x0148;
                case 7: goto L_0x031a;
                case 8: goto L_0x0148;
                case 9: goto L_0x01fd;
                case 10: goto L_0x0190;
                case 11: goto L_0x0148;
                case 12: goto L_0x0149;
                default: goto L_0x0148;
            }
        L_0x0148:
            goto L_0x00fc
        L_0x0149:
            java.lang.String[] r8 = r1.split(r13, r11)
            int r11 = r8.length
            double[] r12 = new double[r11]
            r13 = r3
        L_0x0151:
            int r14 = r8.length
            if (r13 >= r14) goto L_0x015e
            r14 = r8[r13]
            double r14 = java.lang.Double.parseDouble(r14)
            r12[r13] = r14
            int r13 = r13 + r4
            goto L_0x0151
        L_0x015e:
            java.lang.Object r8 = r2.get(r5)
            java.util.Map r8 = (java.util.Map) r8
            int[] r13 = defpackage.oa5.f
            r14 = 12
            r13 = r13[r14]
            int r13 = r13 * r11
            byte[] r13 = new byte[r13]
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.wrap(r13)
            r13.order(r10)
            r10 = r3
        L_0x0175:
            if (r10 >= r11) goto L_0x0180
            r6 = r12[r10]
            r13.putDouble(r6)
            int r10 = r10 + r4
            r6 = 3
            r7 = 2
            goto L_0x0175
        L_0x0180:
            oa5 r6 = new oa5
            byte[] r7 = r13.array()
            r6.<init>(r14, r7, r11)
            r8.put(r0, r6)
        L_0x018c:
            r11 = 3
        L_0x018d:
            r12 = 2
            goto L_0x037a
        L_0x0190:
            java.lang.String[] r6 = r1.split(r13, r11)
            int r7 = r6.length
            ap0[] r12 = new defpackage.ap0[r7]
            r13 = r3
        L_0x0198:
            int r14 = r6.length
            if (r13 >= r14) goto L_0x01c5
            r14 = r6[r13]
            java.lang.String[] r14 = r14.split(r8, r11)
            ap0 r21 = new ap0
            r15 = r14[r3]
            r22 = r12
            double r11 = java.lang.Double.parseDouble(r15)
            long r11 = (long) r11
            r14 = r14[r4]
            double r14 = java.lang.Double.parseDouble(r14)
            long r14 = (long) r14
            r16 = 7
            r19 = r14
            r15 = r21
            r17 = r11
            r15.<init>((int) r16, (long) r17, (long) r19)
            r22[r13] = r21
            int r13 = r13 + r4
            r12 = r22
            r11 = -1
            goto L_0x0198
        L_0x01c5:
            r22 = r12
            java.lang.Object r6 = r2.get(r5)
            java.util.Map r6 = (java.util.Map) r6
            int[] r8 = defpackage.oa5.f
            r11 = 10
            r8 = r8[r11]
            int r8 = r8 * r7
            byte[] r8 = new byte[r8]
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r8)
            r8.order(r10)
            r10 = r3
        L_0x01de:
            if (r10 >= r7) goto L_0x01f0
            r12 = r22[r10]
            long r13 = r12.b
            int r13 = (int) r13
            r8.putInt(r13)
            long r12 = r12.c
            int r12 = (int) r12
            r8.putInt(r12)
            int r10 = r10 + r4
            goto L_0x01de
        L_0x01f0:
            oa5 r10 = new oa5
            byte[] r8 = r8.array()
            r10.<init>(r11, r8, r7)
            r6.put(r0, r10)
            goto L_0x018c
        L_0x01fd:
            r6 = r11
            java.lang.String[] r6 = r1.split(r13, r6)
            int r7 = r6.length
            int[] r8 = new int[r7]
            r11 = r3
        L_0x0206:
            int r12 = r6.length
            if (r11 >= r12) goto L_0x0213
            r12 = r6[r11]
            int r12 = java.lang.Integer.parseInt(r12)
            r8[r11] = r12
            int r11 = r11 + r4
            goto L_0x0206
        L_0x0213:
            java.lang.Object r6 = r2.get(r5)
            java.util.Map r6 = (java.util.Map) r6
            int[] r11 = defpackage.oa5.f
            r12 = 9
            r11 = r11[r12]
            int r11 = r11 * r7
            byte[] r11 = new byte[r11]
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.wrap(r11)
            r11.order(r10)
            r10 = r3
        L_0x022a:
            if (r10 >= r7) goto L_0x0233
            r13 = r8[r10]
            r11.putInt(r13)
            int r10 = r10 + r4
            goto L_0x022a
        L_0x0233:
            oa5 r8 = new oa5
            byte[] r10 = r11.array()
            r8.<init>(r12, r10, r7)
            r6.put(r0, r8)
            goto L_0x018c
        L_0x0241:
            r6 = r11
            java.lang.String[] r7 = r1.split(r13, r6)
            int r11 = r7.length
            ap0[] r12 = new defpackage.ap0[r11]
            r13 = r3
        L_0x024a:
            int r14 = r7.length
            if (r13 >= r14) goto L_0x027a
            r14 = r7[r13]
            java.lang.String[] r14 = r14.split(r8, r6)
            ap0 r6 = new ap0
            r15 = r14[r3]
            r22 = r7
            r21 = r8
            double r7 = java.lang.Double.parseDouble(r15)
            long r7 = (long) r7
            r14 = r14[r4]
            double r14 = java.lang.Double.parseDouble(r14)
            long r14 = (long) r14
            r16 = 7
            r19 = r14
            r15 = r6
            r17 = r7
            r15.<init>((int) r16, (long) r17, (long) r19)
            r12[r13] = r6
            int r13 = r13 + r4
            r8 = r21
            r7 = r22
            r6 = -1
            goto L_0x024a
        L_0x027a:
            java.lang.Object r6 = r2.get(r5)
            java.util.Map r6 = (java.util.Map) r6
            int[] r7 = defpackage.oa5.f
            r8 = 5
            r7 = r7[r8]
            int r7 = r7 * r11
            byte[] r7 = new byte[r7]
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            r7.order(r10)
            r10 = r3
        L_0x0290:
            if (r10 >= r11) goto L_0x02a2
            r13 = r12[r10]
            long r14 = r13.b
            int r14 = (int) r14
            r7.putInt(r14)
            long r13 = r13.c
            int r13 = (int) r13
            r7.putInt(r13)
            int r10 = r10 + r4
            goto L_0x0290
        L_0x02a2:
            oa5 r10 = new oa5
            byte[] r7 = r7.array()
            r10.<init>(r8, r7, r11)
            r6.put(r0, r10)
            goto L_0x018c
        L_0x02b0:
            r6 = r11
            java.lang.String[] r6 = r1.split(r13, r6)
            int r7 = r6.length
            long[] r7 = new long[r7]
            r8 = r3
        L_0x02b9:
            int r11 = r6.length
            if (r8 >= r11) goto L_0x02c6
            r11 = r6[r8]
            long r11 = java.lang.Long.parseLong(r11)
            r7[r8] = r11
            int r8 = r8 + r4
            goto L_0x02b9
        L_0x02c6:
            java.lang.Object r6 = r2.get(r5)
            java.util.Map r6 = (java.util.Map) r6
            oa5 r7 = defpackage.oa5.b(r7, r10)
            r6.put(r0, r7)
            goto L_0x018c
        L_0x02d5:
            r6 = r11
            java.lang.String[] r6 = r1.split(r13, r6)
            int r7 = r6.length
            int[] r8 = new int[r7]
            r11 = r3
        L_0x02de:
            int r12 = r6.length
            if (r11 >= r12) goto L_0x02eb
            r12 = r6[r11]
            int r12 = java.lang.Integer.parseInt(r12)
            r8[r11] = r12
            int r11 = r11 + r4
            goto L_0x02de
        L_0x02eb:
            java.lang.Object r6 = r2.get(r5)
            java.util.Map r6 = (java.util.Map) r6
            int[] r11 = defpackage.oa5.f
            r12 = 3
            r11 = r11[r12]
            int r11 = r11 * r7
            byte[] r11 = new byte[r11]
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.wrap(r11)
            r11.order(r10)
            r10 = r3
        L_0x0301:
            if (r10 >= r7) goto L_0x030b
            r12 = r8[r10]
            short r12 = (short) r12
            r11.putShort(r12)
            int r10 = r10 + r4
            goto L_0x0301
        L_0x030b:
            oa5 r8 = new oa5
            byte[] r10 = r11.array()
            r11 = 3
            r8.<init>(r11, r10, r7)
            r6.put(r0, r8)
            goto L_0x018d
        L_0x031a:
            r11 = r6
            java.lang.Object r6 = r2.get(r5)
            java.util.Map r6 = (java.util.Map) r6
            java.nio.charset.Charset r7 = defpackage.oa5.d
            java.lang.String r7 = "\u0000"
            java.lang.String r7 = r1.concat(r7)
            java.nio.charset.Charset r8 = defpackage.oa5.d
            byte[] r7 = r7.getBytes(r8)
            oa5 r8 = new oa5
            int r10 = r7.length
            r12 = 2
            r8.<init>(r12, r7, r10)
            r6.put(r0, r8)
            goto L_0x037a
        L_0x033a:
            r11 = r6
            r12 = r7
            java.lang.Object r6 = r2.get(r5)
            java.util.Map r6 = (java.util.Map) r6
            java.nio.charset.Charset r7 = defpackage.oa5.d
            int r7 = r1.length()
            if (r7 != r4) goto L_0x036a
            char r7 = r1.charAt(r3)
            r8 = 48
            if (r7 < r8) goto L_0x036a
            char r7 = r1.charAt(r3)
            r10 = 49
            if (r7 > r10) goto L_0x036a
            char r7 = r1.charAt(r3)
            int r7 = r7 - r8
            byte r7 = (byte) r7
            byte[] r8 = new byte[r4]
            r8[r3] = r7
            oa5 r7 = new oa5
            r7.<init>(r4, r8, r4)
            goto L_0x0377
        L_0x036a:
            java.nio.charset.Charset r7 = defpackage.oa5.d
            byte[] r7 = r1.getBytes(r7)
            oa5 r8 = new oa5
            int r10 = r7.length
            r8.<init>(r4, r7, r10)
            r7 = r8
        L_0x0377:
            r6.put(r0, r7)
        L_0x037a:
            int r5 = r5 + r4
            r6 = r11
            r7 = r12
            goto L_0x00da
        L_0x037f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra5.c(java.lang.String, java.lang.String, java.util.List):void");
    }

    public final void d(int i) {
        c("Orientation", String.valueOf(i != 0 ? i != 90 ? i != 180 ? i != 270 ? 0 : 8 : 3 : 6 : 1), this.a);
    }
}
