package defpackage;

import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: vhe  reason: default package */
public final class vhe extends ibe {
    public static final Pattern A0 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean v0;
    public final ff w0;
    public LinkedHashMap x0;
    public float y0 = -3.4028235E38f;
    public float z0 = -3.4028235E38f;

    public vhe(List list) {
        if (list == null || list.isEmpty()) {
            this.v0 = false;
            this.w0 = null;
            return;
        }
        this.v0 = true;
        String n = t0g.n((byte[]) list.get(0));
        y64.g(n.startsWith("Format:"));
        ff b = ff.b(n);
        b.getClass();
        this.w0 = b;
        h(new g1g((byte[]) list.get(1)));
    }

    public static int g(long j, ArrayList arrayList, ArrayList arrayList2) {
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

    public static long i(String str) {
        Matcher matcher = A0.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = t0g.a;
        return (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01fb, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01fd, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ff, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0200, code lost:
        switch(r0) {
            case 1: goto L_0x0208;
            case 2: goto L_0x0208;
            case 3: goto L_0x0208;
            case 4: goto L_0x0206;
            case 5: goto L_0x0206;
            case 6: goto L_0x0206;
            case 7: goto L_0x0204;
            case 8: goto L_0x0204;
            case 9: goto L_0x0204;
            default: goto L_0x0203;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0204, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0206, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0208, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x020c, code lost:
        if (r13 == null) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0210, code lost:
        if (r10 == -3.4028235E38f) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0214, code lost:
        if (r7 == -3.4028235E38f) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0216, code lost:
        r24 = r13.x / r7;
        r21 = r13.y / r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0221, code lost:
        r5 = 0.05f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0229, code lost:
        if (r4 == 0) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x022b, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x022c, code lost:
        if (r4 == 1) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x022e, code lost:
        r12 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x022f, code lost:
        if (r4 == 2) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0231, code lost:
        r13 = -3.4028235E38f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0233, code lost:
        r13 = 0.95f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0235, code lost:
        r12 = 2;
        r13 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0238, code lost:
        r10 = 1;
        r12 = 2;
        r13 = 0.05f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x023b, code lost:
        if (r3 == 0) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x023d, code lost:
        if (r3 == r10) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x023f, code lost:
        if (r3 == r12) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0241, code lost:
        r5 = -3.4028235E38f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0243, code lost:
        r5 = 0.95f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0245, code lost:
        r5 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0246, code lost:
        r21 = r5;
        r24 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x024a, code lost:
        r16 = new defpackage.m44(r11, r18, (android.text.Layout.Alignment) null, (android.graphics.Bitmap) null, r21, 0, r3, r24, r4, r26, r27, -3.4028235E38f, -3.4028235E38f, false, -16777216, kotlin.jvm.internal.IntCompanionObject.MIN_VALUE, defpackage.c44.DEFAULT_ASPECT_RATIO);
        r3 = g(r8, r2, r1);
        r4 = g(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x026e, code lost:
        if (r3 >= r4) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0270, code lost:
        ((java.util.List) r1.get(r3)).add(r16);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01eb, code lost:
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f4, code lost:
        r3 = kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f6, code lost:
        switch(r0) {
            case 1: goto L_0x01ff;
            case 2: goto L_0x01fd;
            case 3: goto L_0x01fb;
            case 4: goto L_0x01ff;
            case 5: goto L_0x01fd;
            case 6: goto L_0x01fb;
            case 7: goto L_0x01ff;
            case 8: goto L_0x01fd;
            case 9: goto L_0x01fb;
            default: goto L_0x01f9;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f9, code lost:
        r4 = Integer.MIN_VALUE;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e0 */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x00ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ec A[Catch:{ RuntimeException -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.uye a(int r37, byte[] r38, boolean r39) {
        /*
            r36 = this;
            r0 = r36
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            g1g r3 = new g1g
            r4 = r37
            r5 = r38
            r3.<init>((int) r4, (byte[]) r5)
            boolean r4 = r0.v0
            if (r4 != 0) goto L_0x001c
            r0.h(r3)
        L_0x001c:
            if (r4 == 0) goto L_0x0021
            ff r4 = r0.w0
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            java.lang.String r6 = r3.i()
            if (r6 == 0) goto L_0x0284
            java.lang.String r7 = "Format:"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0035
            ff r4 = defpackage.ff.b(r6)
            goto L_0x0022
        L_0x0035:
            java.lang.String r7 = "Dialogue:"
            boolean r8 = r6.startsWith(r7)
            if (r8 == 0) goto L_0x004a
            if (r4 != 0) goto L_0x0050
            int r7 = r6.length()
            if (r7 == 0) goto L_0x004a
            java.lang.String r7 = "Skipping dialogue line before complete format: "
            r7.concat(r6)
        L_0x004a:
            r34 = r3
            r35 = r4
            goto L_0x027c
        L_0x0050:
            boolean r7 = r6.startsWith(r7)
            defpackage.y64.g(r7)
            r7 = 9
            java.lang.String r7 = r6.substring(r7)
            java.lang.String r8 = ","
            int r9 = r4.e
            java.lang.String[] r7 = r7.split(r8, r9)
            int r8 = r7.length
            if (r8 == r9) goto L_0x0074
            int r7 = r6.length()
            if (r7 == 0) goto L_0x004a
            java.lang.String r7 = "Skipping dialogue line with fewer columns than format: "
            r7.concat(r6)
            goto L_0x004a
        L_0x0074:
            int r8 = r4.a
            r8 = r7[r8]
            long r8 = i(r8)
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r13 = "Skipping invalid timing: "
            if (r12 != 0) goto L_0x0091
            int r7 = r6.length()
            if (r7 == 0) goto L_0x004a
            r13.concat(r6)
            goto L_0x004a
        L_0x0091:
            int r12 = r4.b
            r12 = r7[r12]
            long r14 = i(r12)
            int r10 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x00a7
            int r7 = r6.length()
            if (r7 == 0) goto L_0x004a
            r13.concat(r6)
            goto L_0x004a
        L_0x00a7:
            java.util.LinkedHashMap r6 = r0.x0
            r10 = -1
            if (r6 == 0) goto L_0x00bd
            int r11 = r4.c
            if (r11 == r10) goto L_0x00bd
            r11 = r7[r11]
            java.lang.String r11 = r11.trim()
            java.lang.Object r6 = r6.get(r11)
            bie r6 = (defpackage.bie) r6
            goto L_0x00be
        L_0x00bd:
            r6 = 0
        L_0x00be:
            int r11 = r4.d
            r7 = r7[r11]
            java.util.regex.Pattern r11 = defpackage.zhe.a
            java.util.regex.Matcher r11 = r11.matcher(r7)
            r12 = r10
            r13 = 0
        L_0x00ca:
            boolean r16 = r11.find()
            r5 = 1
            if (r16 == 0) goto L_0x0101
            java.lang.String r10 = r11.group(r5)
            r10.getClass()
            android.graphics.PointF r16 = defpackage.zhe.a(r10)     // Catch:{ RuntimeException -> 0x00e0 }
            if (r16 == 0) goto L_0x00e0
            r13 = r16
        L_0x00e0:
            java.util.regex.Pattern r5 = defpackage.zhe.d     // Catch:{ RuntimeException -> 0x00ff }
            java.util.regex.Matcher r5 = r5.matcher(r10)     // Catch:{ RuntimeException -> 0x00ff }
            boolean r10 = r5.find()     // Catch:{ RuntimeException -> 0x00ff }
            if (r10 == 0) goto L_0x00fa
            r10 = 1
            java.lang.String r5 = r5.group(r10)     // Catch:{ RuntimeException -> 0x00ff }
            r5.getClass()     // Catch:{ RuntimeException -> 0x00ff }
            int r5 = defpackage.bie.a(r5)     // Catch:{ RuntimeException -> 0x00ff }
        L_0x00f8:
            r10 = -1
            goto L_0x00fc
        L_0x00fa:
            r5 = -1
            goto L_0x00f8
        L_0x00fc:
            if (r5 == r10) goto L_0x00ff
            r12 = r5
        L_0x00ff:
            r10 = -1
            goto L_0x00ca
        L_0x0101:
            zhe r5 = new zhe
            java.util.regex.Pattern r5 = defpackage.zhe.a
            java.util.regex.Matcher r5 = r5.matcher(r7)
            java.lang.String r7 = ""
            java.lang.String r5 = r5.replaceAll(r7)
            java.lang.String r7 = "\\N"
            java.lang.String r10 = "\n"
            java.lang.String r5 = r5.replace(r7, r10)
            java.lang.String r7 = "\\n"
            java.lang.String r5 = r5.replace(r7, r10)
            java.lang.String r7 = "\\h"
            java.lang.String r10 = " "
            java.lang.String r5 = r5.replace(r7, r10)
            float r7 = r0.y0
            float r10 = r0.z0
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r5)
            r29 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r32 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L_0x01d2
            java.lang.Integer r5 = r6.c
            if (r5 == 0) goto L_0x0151
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r5 = r5.intValue()
            r0.<init>(r5)
            int r5 = r11.length()
            r34 = r3
            r35 = r4
            r3 = 0
            r4 = 33
            r11.setSpan(r0, r3, r5, r4)
            goto L_0x0155
        L_0x0151:
            r34 = r3
            r35 = r4
        L_0x0155:
            float r0 = r6.d
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0165
            int r4 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0165
            float r0 = r0 / r10
            r3 = 1
            goto L_0x0169
        L_0x0165:
            r0 = r29
            r3 = r32
        L_0x0169:
            boolean r4 = r6.f
            boolean r5 = r6.e
            if (r5 == 0) goto L_0x0186
            if (r4 == 0) goto L_0x0186
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r5 = 3
            r4.<init>(r5)
            int r5 = r11.length()
            r19 = r0
            r18 = r3
            r0 = 0
            r3 = 33
            r11.setSpan(r4, r0, r5, r3)
            goto L_0x01ac
        L_0x0186:
            r19 = r0
            r18 = r3
            r0 = 0
            r3 = 33
            if (r5 == 0) goto L_0x019d
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r5 = 1
            r4.<init>(r5)
            int r5 = r11.length()
            r11.setSpan(r4, r0, r5, r3)
            goto L_0x01ac
        L_0x019d:
            if (r4 == 0) goto L_0x01ac
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r5 = 2
            r4.<init>(r5)
            int r5 = r11.length()
            r11.setSpan(r4, r0, r5, r3)
        L_0x01ac:
            boolean r4 = r6.g
            if (r4 == 0) goto L_0x01bc
            android.text.style.UnderlineSpan r4 = new android.text.style.UnderlineSpan
            r4.<init>()
            int r5 = r11.length()
            r11.setSpan(r4, r0, r5, r3)
        L_0x01bc:
            boolean r4 = r6.h
            if (r4 == 0) goto L_0x01cc
            android.text.style.StrikethroughSpan r4 = new android.text.style.StrikethroughSpan
            r4.<init>()
            int r5 = r11.length()
            r11.setSpan(r4, r0, r5, r3)
        L_0x01cc:
            r26 = r18
            r27 = r19
        L_0x01d0:
            r0 = -1
            goto L_0x01db
        L_0x01d2:
            r34 = r3
            r35 = r4
            r27 = r29
            r26 = r32
            goto L_0x01d0
        L_0x01db:
            if (r12 == r0) goto L_0x01df
            r0 = r12
            goto L_0x01e3
        L_0x01df:
            if (r6 == 0) goto L_0x01e3
            int r0 = r6.b
        L_0x01e3:
            switch(r0) {
                case 1: goto L_0x01f1;
                case 2: goto L_0x01ee;
                case 3: goto L_0x01e9;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01ee;
                case 6: goto L_0x01e9;
                case 7: goto L_0x01f1;
                case 8: goto L_0x01ee;
                case 9: goto L_0x01e9;
                default: goto L_0x01e6;
            }
        L_0x01e6:
            r18 = 0
            goto L_0x01f4
        L_0x01e9:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x01eb:
            r18 = r3
            goto L_0x01f4
        L_0x01ee:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x01eb
        L_0x01f1:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x01eb
        L_0x01f4:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r0) {
                case 1: goto L_0x01ff;
                case 2: goto L_0x01fd;
                case 3: goto L_0x01fb;
                case 4: goto L_0x01ff;
                case 5: goto L_0x01fd;
                case 6: goto L_0x01fb;
                case 7: goto L_0x01ff;
                case 8: goto L_0x01fd;
                case 9: goto L_0x01fb;
                default: goto L_0x01f9;
            }
        L_0x01f9:
            r4 = r3
            goto L_0x0200
        L_0x01fb:
            r4 = 2
            goto L_0x0200
        L_0x01fd:
            r4 = 1
            goto L_0x0200
        L_0x01ff:
            r4 = 0
        L_0x0200:
            switch(r0) {
                case 1: goto L_0x0208;
                case 2: goto L_0x0208;
                case 3: goto L_0x0208;
                case 4: goto L_0x0206;
                case 5: goto L_0x0206;
                case 6: goto L_0x0206;
                case 7: goto L_0x0204;
                case 8: goto L_0x0204;
                case 9: goto L_0x0204;
                default: goto L_0x0203;
            }
        L_0x0203:
            goto L_0x0209
        L_0x0204:
            r3 = 0
            goto L_0x0209
        L_0x0206:
            r3 = 1
            goto L_0x0209
        L_0x0208:
            r3 = 2
        L_0x0209:
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r13 == 0) goto L_0x0221
            int r5 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0221
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0221
            float r0 = r13.x
            float r0 = r0 / r7
            float r5 = r13.y
            float r5 = r5 / r10
            r24 = r0
            r21 = r5
            goto L_0x024a
        L_0x0221:
            r5 = 1028443341(0x3d4ccccd, float:0.05)
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1064514355(0x3f733333, float:0.95)
            if (r4 == 0) goto L_0x0238
            r10 = 1
            if (r4 == r10) goto L_0x0235
            r12 = 2
            if (r4 == r12) goto L_0x0233
            r13 = r0
            goto L_0x023b
        L_0x0233:
            r13 = r7
            goto L_0x023b
        L_0x0235:
            r12 = 2
            r13 = r6
            goto L_0x023b
        L_0x0238:
            r10 = 1
            r12 = 2
            r13 = r5
        L_0x023b:
            if (r3 == 0) goto L_0x0246
            if (r3 == r10) goto L_0x0245
            if (r3 == r12) goto L_0x0243
            r5 = r0
            goto L_0x0246
        L_0x0243:
            r5 = r7
            goto L_0x0246
        L_0x0245:
            r5 = r6
        L_0x0246:
            r21 = r5
            r24 = r13
        L_0x024a:
            m44 r0 = new m44
            r16 = r0
            r20 = 0
            r19 = r20
            r30 = 0
            r31 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r33 = 0
            r17 = r11
            r5 = 0
            r22 = r5
            r23 = r3
            r25 = r4
            r28 = r29
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            int r3 = g(r8, r2, r1)
            int r4 = g(r14, r2, r1)
        L_0x026e:
            if (r3 >= r4) goto L_0x027c
            java.lang.Object r5 = r1.get(r3)
            java.util.List r5 = (java.util.List) r5
            r5.add(r0)
            int r3 = r3 + 1
            goto L_0x026e
        L_0x027c:
            r0 = r36
            r3 = r34
            r4 = r35
            goto L_0x0022
        L_0x0284:
            w8b r0 = new w8b
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhe.a(int, byte[], boolean):uye");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0270  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.g1g r33) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            r3 = 6
            r4 = 7
            r5 = -1
            r6 = 2
            r7 = 0
            r8 = 1
        L_0x000a:
            java.lang.String r0 = r33.i()
            if (r0 == 0) goto L_0x0294
            java.lang.String r9 = "[Script Info]"
            boolean r9 = r9.equalsIgnoreCase(r0)
            r10 = 91
            if (r9 == 0) goto L_0x0072
        L_0x001a:
            java.lang.String r0 = r33.i()
            if (r0 == 0) goto L_0x000a
            int r9 = r33.c()
            if (r9 == 0) goto L_0x0030
            byte[] r9 = r2.a
            int r11 = r2.b
            byte r9 = r9[r11]
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r9 == r10) goto L_0x000a
        L_0x0030:
            java.lang.String r9 = ":"
            java.lang.String[] r0 = r0.split(r9)
            int r9 = r0.length
            if (r9 == r6) goto L_0x003a
            goto L_0x001a
        L_0x003a:
            r9 = r0[r7]
            java.lang.String r9 = r9.trim()
            java.lang.String r9 = defpackage.o54.P(r9)
            r9.getClass()
            java.lang.String r11 = "playresx"
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x0065
            java.lang.String r11 = "playresy"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0058
            goto L_0x001a
        L_0x0058:
            r0 = r0[r8]     // Catch:{ NumberFormatException -> 0x001a }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x001a }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x001a }
            r1.z0 = r0     // Catch:{ NumberFormatException -> 0x001a }
            goto L_0x001a
        L_0x0065:
            r0 = r0[r8]     // Catch:{ NumberFormatException -> 0x001a }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x001a }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x001a }
            r1.y0 = r0     // Catch:{ NumberFormatException -> 0x001a }
            goto L_0x001a
        L_0x0072:
            java.lang.String r9 = "[V4+ Styles]"
            boolean r9 = r9.equalsIgnoreCase(r0)
            if (r9 == 0) goto L_0x0283
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r11 = 0
            r12 = r11
        L_0x0081:
            java.lang.String r13 = r33.i()
            if (r13 == 0) goto L_0x027b
            int r0 = r33.c()
            if (r0 == 0) goto L_0x0097
            byte[] r0 = r2.a
            int r14 = r2.b
            byte r0 = r0[r14]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == r10) goto L_0x027b
        L_0x0097:
            java.lang.String r0 = "Format:"
            boolean r0 = r13.startsWith(r0)
            java.lang.String r14 = ","
            if (r0 == 0) goto L_0x0157
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
            r12 = r7
        L_0x00b8:
            int r13 = r0.length
            if (r12 >= r13) goto L_0x0146
            r13 = r0[r12]
            java.lang.String r13 = r13.trim()
            java.lang.String r13 = defpackage.o54.P(r13)
            r13.getClass()
            int r22 = r13.hashCode()
            switch(r22) {
                case -1178781136: goto L_0x011f;
                case -1026963764: goto L_0x0114;
                case -192095652: goto L_0x0109;
                case -70925746: goto L_0x00fe;
                case 3029637: goto L_0x00f3;
                case 3373707: goto L_0x00e8;
                case 366554320: goto L_0x00dd;
                case 1767875043: goto L_0x00d2;
                default: goto L_0x00cf;
            }
        L_0x00cf:
            r4 = r5
            goto L_0x0129
        L_0x00d2:
            java.lang.String r4 = "alignment"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x00db
            goto L_0x00cf
        L_0x00db:
            r4 = 7
            goto L_0x0129
        L_0x00dd:
            java.lang.String r4 = "fontsize"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x00e6
            goto L_0x00cf
        L_0x00e6:
            r4 = r3
            goto L_0x0129
        L_0x00e8:
            java.lang.String r4 = "name"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x00f1
            goto L_0x00cf
        L_0x00f1:
            r4 = 5
            goto L_0x0129
        L_0x00f3:
            java.lang.String r4 = "bold"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x00fc
            goto L_0x00cf
        L_0x00fc:
            r4 = 4
            goto L_0x0129
        L_0x00fe:
            java.lang.String r4 = "primarycolour"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x0107
            goto L_0x00cf
        L_0x0107:
            r4 = 3
            goto L_0x0129
        L_0x0109:
            java.lang.String r4 = "strikeout"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x0112
            goto L_0x00cf
        L_0x0112:
            r4 = r6
            goto L_0x0129
        L_0x0114:
            java.lang.String r4 = "underline"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x011d
            goto L_0x00cf
        L_0x011d:
            r4 = r8
            goto L_0x0129
        L_0x011f:
            java.lang.String r4 = "italic"
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x0128
            goto L_0x00cf
        L_0x0128:
            r4 = r7
        L_0x0129:
            switch(r4) {
                case 0: goto L_0x0140;
                case 1: goto L_0x013d;
                case 2: goto L_0x013a;
                case 3: goto L_0x0137;
                case 4: goto L_0x0134;
                case 5: goto L_0x0132;
                case 6: goto L_0x012f;
                case 7: goto L_0x012d;
                default: goto L_0x012c;
            }
        L_0x012c:
            goto L_0x0142
        L_0x012d:
            r15 = r12
            goto L_0x0142
        L_0x012f:
            r17 = r12
            goto L_0x0142
        L_0x0132:
            r14 = r12
            goto L_0x0142
        L_0x0134:
            r18 = r12
            goto L_0x0142
        L_0x0137:
            r16 = r12
            goto L_0x0142
        L_0x013a:
            r21 = r12
            goto L_0x0142
        L_0x013d:
            r20 = r12
            goto L_0x0142
        L_0x0140:
            r19 = r12
        L_0x0142:
            int r12 = r12 + r8
            r4 = 7
            goto L_0x00b8
        L_0x0146:
            if (r14 == r5) goto L_0x0153
            xhe r4 = new xhe
            int r0 = r0.length
            r13 = r4
            r22 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r12 = r4
            goto L_0x0154
        L_0x0153:
            r12 = r11
        L_0x0154:
            r4 = 7
            goto L_0x0081
        L_0x0157:
            java.lang.String r0 = "Style:"
            boolean r4 = r13.startsWith(r0)
            if (r4 == 0) goto L_0x0275
            if (r12 != 0) goto L_0x016e
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0275
            java.lang.String r0 = "Skipping 'Style:' line before 'Format:' line: "
            r0.concat(r13)
            goto L_0x0275
        L_0x016e:
            boolean r0 = r13.startsWith(r0)
            defpackage.y64.g(r0)
            java.lang.String r0 = r13.substring(r3)
            java.lang.String[] r4 = android.text.TextUtils.split(r0, r14)
            int r0 = r4.length
            java.lang.String r14 = "'"
            int r15 = r12.i
            if (r0 == r15) goto L_0x018b
            int r0 = defpackage.t0g.a
            java.util.Locale r0 = java.util.Locale.US
        L_0x0188:
            r15 = r11
            goto L_0x026e
        L_0x018b:
            bie r15 = new bie     // Catch:{ RuntimeException -> 0x01a6 }
            int r0 = r12.a     // Catch:{ RuntimeException -> 0x01a6 }
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01a6 }
            java.lang.String r24 = r0.trim()     // Catch:{ RuntimeException -> 0x01a6 }
            int r0 = r12.b     // Catch:{ RuntimeException -> 0x01a6 }
            if (r0 == r5) goto L_0x01a9
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01a6 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01a6 }
            int r0 = defpackage.bie.a(r0)     // Catch:{ RuntimeException -> 0x01a6 }
            r25 = r0
            goto L_0x01ab
        L_0x01a6:
            r0 = move-exception
            goto L_0x024f
        L_0x01a9:
            r25 = r5
        L_0x01ab:
            int r0 = r12.c     // Catch:{ RuntimeException -> 0x01a6 }
            if (r0 == r5) goto L_0x01bc
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01a6 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01a6 }
            java.lang.Integer r0 = defpackage.bie.c(r0)     // Catch:{ RuntimeException -> 0x01a6 }
            r26 = r0
            goto L_0x01be
        L_0x01bc:
            r26 = r11
        L_0x01be:
            int r0 = r12.d     // Catch:{ RuntimeException -> 0x01a6 }
            r16 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r0 == r5) goto L_0x01f3
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01a6 }
            java.lang.String r3 = r0.trim()     // Catch:{ RuntimeException -> 0x01a6 }
            float r16 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x01d0 }
            goto L_0x01f3
        L_0x01d0:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x01a6 }
            int r0 = r0.length()     // Catch:{ RuntimeException -> 0x01a6 }
            int r0 = r0 + 29
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01a6 }
            r7.<init>(r0)     // Catch:{ RuntimeException -> 0x01a6 }
            java.lang.String r0 = "Failed to parse font size: '"
            r7.append(r0)     // Catch:{ RuntimeException -> 0x01a6 }
            r7.append(r3)     // Catch:{ RuntimeException -> 0x01a6 }
            r7.append(r14)     // Catch:{ RuntimeException -> 0x01a6 }
            java.lang.String r0 = r7.toString()     // Catch:{ RuntimeException -> 0x01a6 }
            defpackage.iq.a(r0, r6)     // Catch:{ RuntimeException -> 0x01a6 }
        L_0x01f3:
            r27 = r16
            int r0 = r12.e     // Catch:{ RuntimeException -> 0x01a6 }
            if (r0 == r5) goto L_0x0208
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01a6 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01a6 }
            boolean r0 = defpackage.bie.b(r0)     // Catch:{ RuntimeException -> 0x01a6 }
            if (r0 == 0) goto L_0x0208
            r28 = r8
            goto L_0x020a
        L_0x0208:
            r28 = 0
        L_0x020a:
            int r0 = r12.f     // Catch:{ RuntimeException -> 0x01a6 }
            if (r0 == r5) goto L_0x021d
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01a6 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01a6 }
            boolean r0 = defpackage.bie.b(r0)     // Catch:{ RuntimeException -> 0x01a6 }
            if (r0 == 0) goto L_0x021d
            r29 = r8
            goto L_0x021f
        L_0x021d:
            r29 = 0
        L_0x021f:
            int r0 = r12.g     // Catch:{ RuntimeException -> 0x01a6 }
            if (r0 == r5) goto L_0x0232
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01a6 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01a6 }
            boolean r0 = defpackage.bie.b(r0)     // Catch:{ RuntimeException -> 0x01a6 }
            if (r0 == 0) goto L_0x0232
            r30 = r8
            goto L_0x0234
        L_0x0232:
            r30 = 0
        L_0x0234:
            int r0 = r12.h     // Catch:{ RuntimeException -> 0x01a6 }
            if (r0 == r5) goto L_0x0247
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01a6 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01a6 }
            boolean r0 = defpackage.bie.b(r0)     // Catch:{ RuntimeException -> 0x01a6 }
            if (r0 == 0) goto L_0x0247
            r31 = r8
            goto L_0x0249
        L_0x0247:
            r31 = 0
        L_0x0249:
            r23 = r15
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ RuntimeException -> 0x01a6 }
            goto L_0x026e
        L_0x024f:
            int r3 = r13.length()
            int r3 = r3 + 36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Skipping malformed 'Style:' line: '"
            r4.append(r3)
            r4.append(r13)
            r4.append(r14)
            java.lang.String r3 = r4.toString()
            defpackage.iq.a(r3, r0)
            goto L_0x0188
        L_0x026e:
            if (r15 == 0) goto L_0x0275
            java.lang.String r0 = r15.a
            r9.put(r0, r15)
        L_0x0275:
            r3 = 6
            r4 = 7
            r6 = 2
            r7 = 0
            goto L_0x0081
        L_0x027b:
            r1.x0 = r9
        L_0x027d:
            r3 = 6
            r4 = 7
            r6 = 2
            r7 = 0
            goto L_0x000a
        L_0x0283:
            java.lang.String r3 = "[V4 Styles]"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x028c
            goto L_0x027d
        L_0x028c:
            java.lang.String r3 = "[Events]"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x027d
        L_0x0294:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhe.h(g1g):void");
    }
}
