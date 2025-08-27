package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.json.HTTP;

/* renamed from: utf  reason: default package */
public final class utf {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final ztf f;
    public final String[] g;
    public final String h;
    public final String i;
    public final utf j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public utf(String str, String str2, long j2, long j3, ztf ztf, String[] strArr, String str3, String str4, utf utf) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = ztf;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j2;
        this.e = j3;
        str3.getClass();
        this.h = str3;
        this.j = utf;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static utf a(String str) {
        return new utf((String) null, str.replaceAll(HTTP.CRLF, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, (ztf) null, (String[]) null, "", (String) null, (utf) null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            k44 k44 = new k44();
            k44.a = new SpannableStringBuilder();
            treeMap.put(str, k44);
        }
        CharSequence charSequence = ((k44) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final utf b(int i2) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (utf) arrayList.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.i != null)) {
            long j2 = this.d;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.m != null) {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                ((utf) this.m.get(i2)).d(treeSet, z || equals);
            }
        }
    }

    public final boolean f(long j2) {
        long j3 = this.d;
        int i2 = (j3 > -9223372036854775807L ? 1 : (j3 == -9223372036854775807L ? 0 : -1));
        long j4 = this.e;
        return (i2 == 0 && j4 == -9223372036854775807L) || (j3 <= j2 && j4 == -9223372036854775807L) || ((j3 == -9223372036854775807L && j2 < j4) || (j3 <= j2 && j2 < j4));
    }

    public final void g(long j2, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (!f(j2) || !"div".equals(this.a) || (str2 = this.i) == null) {
            for (int i2 = 0; i2 < c(); i2++) {
                b(i2).g(j2, str, arrayList);
            }
            return;
        }
        arrayList.add(new Pair(str, str2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0262 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(long r18, java.util.Map r20, java.util.Map r21, java.lang.String r22, java.util.TreeMap r23) {
        /*
            r17 = this;
            r0 = r17
            r8 = r20
            r1 = -1
            r9 = 1
            boolean r2 = r17.f(r18)
            if (r2 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.String r2 = ""
            java.lang.String r3 = r0.h
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001a
            r10 = r22
            goto L_0x001b
        L_0x001a:
            r10 = r3
        L_0x001b:
            java.util.HashMap r2 = r0.l
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0025:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0266
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.util.HashMap r6 = r0.k
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x004a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L_0x004b
        L_0x004a:
            r6 = 0
        L_0x004b:
            java.lang.Object r3 = r3.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r6 == r3) goto L_0x025d
            r11 = r23
            java.lang.Object r5 = r11.get(r5)
            k44 r5 = (defpackage.k44) r5
            r5.getClass()
            r12 = r21
            java.lang.Object r7 = r12.get(r10)
            xtf r7 = (defpackage.xtf) r7
            r7.getClass()
            ztf r13 = r0.f
            java.lang.String[] r14 = r0.g
            ztf r13 = defpackage.cvg.J(r13, r14, r8)
            java.lang.CharSequence r14 = r5.a
            android.text.SpannableStringBuilder r14 = (android.text.SpannableStringBuilder) r14
            if (r14 != 0) goto L_0x0082
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            r14.<init>()
            r5.a = r14
        L_0x0082:
            if (r13 == 0) goto L_0x0261
            int r15 = r13.h
            if (r15 != r1) goto L_0x008e
            int r4 = r13.i
            if (r4 != r1) goto L_0x008e
            r4 = r1
            goto L_0x009b
        L_0x008e:
            if (r15 != r9) goto L_0x0092
            r4 = r9
            goto L_0x0093
        L_0x0092:
            r4 = 0
        L_0x0093:
            int r15 = r13.i
            if (r15 != r9) goto L_0x0099
            r15 = 2
            goto L_0x009a
        L_0x0099:
            r15 = 0
        L_0x009a:
            r4 = r4 | r15
        L_0x009b:
            if (r4 == r1) goto L_0x00c4
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            int r15 = r13.h
            if (r15 != r1) goto L_0x00ab
            int r9 = r13.i
            if (r9 != r1) goto L_0x00aa
            r15 = r1
            r9 = 1
            goto L_0x00bb
        L_0x00aa:
            r9 = 1
        L_0x00ab:
            if (r15 != r9) goto L_0x00b0
            r16 = r9
            goto L_0x00b2
        L_0x00b0:
            r16 = 0
        L_0x00b2:
            int r15 = r13.i
            if (r15 != r9) goto L_0x00b8
            r15 = 2
            goto L_0x00b9
        L_0x00b8:
            r15 = 0
        L_0x00b9:
            r15 = r16 | r15
        L_0x00bb:
            r4.<init>(r15)
            r15 = 33
            r14.setSpan(r4, r6, r3, r15)
            goto L_0x00c6
        L_0x00c4:
            r15 = 33
        L_0x00c6:
            int r4 = r13.f
            if (r4 != r9) goto L_0x00d2
            android.text.style.StrikethroughSpan r4 = new android.text.style.StrikethroughSpan
            r4.<init>()
            r14.setSpan(r4, r6, r3, r15)
        L_0x00d2:
            int r4 = r13.g
            if (r4 != r9) goto L_0x00de
            android.text.style.UnderlineSpan r4 = new android.text.style.UnderlineSpan
            r4.<init>()
            r14.setSpan(r4, r6, r3, r15)
        L_0x00de:
            boolean r4 = r13.c
            if (r4 == 0) goto L_0x00f9
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            boolean r9 = r13.c
            if (r9 == 0) goto L_0x00f1
            int r9 = r13.b
            r4.<init>(r9)
            defpackage.i8b.a(r14, r4, r6, r3)
            goto L_0x00f9
        L_0x00f1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Font color has not been defined."
            r0.<init>(r1)
            throw r0
        L_0x00f9:
            boolean r4 = r13.e
            if (r4 == 0) goto L_0x0114
            android.text.style.BackgroundColorSpan r4 = new android.text.style.BackgroundColorSpan
            boolean r9 = r13.e
            if (r9 == 0) goto L_0x010c
            int r9 = r13.d
            r4.<init>(r9)
            defpackage.i8b.a(r14, r4, r6, r3)
            goto L_0x0114
        L_0x010c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Background color has not been defined."
            r0.<init>(r1)
            throw r0
        L_0x0114:
            java.lang.String r4 = r13.a
            if (r4 == 0) goto L_0x0122
            android.text.style.TypefaceSpan r4 = new android.text.style.TypefaceSpan
            java.lang.String r9 = r13.a
            r4.<init>(r9)
            defpackage.i8b.a(r14, r4, r6, r3)
        L_0x0122:
            iff r4 = r13.r
            r9 = 3
            if (r4 == 0) goto L_0x014a
            int r15 = r4.a
            if (r15 != r1) goto L_0x013a
            int r7 = r7.j
            r15 = 2
            if (r7 == r15) goto L_0x0136
            r15 = 1
            if (r7 != r15) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r7 = 1
            goto L_0x0137
        L_0x0136:
            r7 = r9
        L_0x0137:
            r15 = r7
            r7 = 1
            goto L_0x013c
        L_0x013a:
            int r7 = r4.b
        L_0x013c:
            r1 = -2
            int r4 = r4.c
            if (r4 != r1) goto L_0x0142
            r4 = 1
        L_0x0142:
            kff r1 = new kff
            r1.<init>(r15, r7, r4)
            defpackage.i8b.a(r14, r1, r6, r3)
        L_0x014a:
            int r1 = r13.m
            r4 = 2
            if (r1 == r4) goto L_0x0162
            if (r1 == r9) goto L_0x0157
            r4 = 4
            if (r1 == r4) goto L_0x0157
        L_0x0154:
            r4 = -1
            goto L_0x01fa
        L_0x0157:
            wl4 r1 = new wl4
            r1.<init>()
            r4 = 33
            r14.setSpan(r1, r6, r3, r4)
            goto L_0x0154
        L_0x0162:
            utf r1 = r0.j
        L_0x0164:
            if (r1 == 0) goto L_0x0179
            ztf r7 = r1.f
            java.lang.String[] r15 = r1.g
            ztf r7 = defpackage.cvg.J(r7, r15, r8)
            if (r7 == 0) goto L_0x0176
            int r7 = r7.m
            r15 = 1
            if (r7 != r15) goto L_0x0176
            goto L_0x017a
        L_0x0176:
            utf r1 = r1.j
            goto L_0x0164
        L_0x0179:
            r1 = 0
        L_0x017a:
            if (r1 != 0) goto L_0x017d
            goto L_0x0154
        L_0x017d:
            java.util.ArrayDeque r7 = new java.util.ArrayDeque
            r7.<init>()
            r7.push(r1)
        L_0x0185:
            boolean r15 = r7.isEmpty()
            if (r15 != 0) goto L_0x01b6
            java.lang.Object r15 = r7.pop()
            utf r15 = (defpackage.utf) r15
            ztf r4 = r15.f
            java.lang.String[] r9 = r15.g
            ztf r4 = defpackage.cvg.J(r4, r9, r8)
            if (r4 == 0) goto L_0x01a2
            int r4 = r4.m
            r9 = 3
            if (r4 != r9) goto L_0x01a2
            r4 = r15
            goto L_0x01b7
        L_0x01a2:
            int r4 = r15.c()
            r9 = 1
            int r4 = r4 - r9
        L_0x01a8:
            if (r4 < 0) goto L_0x01b4
            utf r9 = r15.b(r4)
            r7.push(r9)
            r9 = -1
            int r4 = r4 + r9
            goto L_0x01a8
        L_0x01b4:
            r9 = 3
            goto L_0x0185
        L_0x01b6:
            r4 = 0
        L_0x01b7:
            if (r4 != 0) goto L_0x01ba
            goto L_0x0154
        L_0x01ba:
            int r7 = r4.c()
            r9 = 1
            if (r7 != r9) goto L_0x0154
            r7 = 0
            utf r9 = r4.b(r7)
            java.lang.String r9 = r9.b
            if (r9 == 0) goto L_0x0154
            utf r7 = r4.b(r7)
            java.lang.String r7 = r7.b
            int r9 = defpackage.t0g.a
            ztf r9 = r4.f
            java.lang.String[] r4 = r4.g
            ztf r4 = defpackage.cvg.J(r9, r4, r8)
            if (r4 == 0) goto L_0x01e0
            int r9 = r4.n
            r4 = -1
            goto L_0x01e2
        L_0x01e0:
            r4 = -1
            r9 = -1
        L_0x01e2:
            if (r9 != r4) goto L_0x01f0
            ztf r15 = r1.f
            java.lang.String[] r1 = r1.g
            ztf r1 = defpackage.cvg.J(r15, r1, r8)
            if (r1 == 0) goto L_0x01f0
            int r9 = r1.n
        L_0x01f0:
            vad r1 = new vad
            r1.<init>(r7, r9)
            r7 = 33
            r14.setSpan(r1, r6, r3, r7)
        L_0x01fa:
            int r1 = r13.q
            r7 = 1
            if (r1 != r7) goto L_0x0207
            q27 r1 = new q27
            r1.<init>()
            defpackage.i8b.a(r14, r1, r6, r3)
        L_0x0207:
            int r1 = r13.j
            r9 = 1120403456(0x42c80000, float:100.0)
            if (r1 == r7) goto L_0x022b
            r7 = 2
            if (r1 == r7) goto L_0x0220
            r7 = 3
            if (r1 == r7) goto L_0x0214
            goto L_0x0237
        L_0x0214:
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan
            float r7 = r13.k
            float r7 = r7 / r9
            r1.<init>(r7)
            defpackage.i8b.a(r14, r1, r6, r3)
            goto L_0x0237
        L_0x0220:
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan
            float r7 = r13.k
            r1.<init>(r7)
            defpackage.i8b.a(r14, r1, r6, r3)
            goto L_0x0237
        L_0x022b:
            android.text.style.AbsoluteSizeSpan r1 = new android.text.style.AbsoluteSizeSpan
            float r7 = r13.k
            int r7 = (int) r7
            r15 = 1
            r1.<init>(r7, r15)
            defpackage.i8b.a(r14, r1, r6, r3)
        L_0x0237:
            java.lang.String r1 = "p"
            java.lang.String r3 = r0.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0262
            float r1 = r13.s
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0250
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r1 = r1 * r3
            float r1 = r1 / r9
            r5.q = r1
        L_0x0250:
            android.text.Layout$Alignment r1 = r13.o
            if (r1 == 0) goto L_0x0256
            r5.c = r1
        L_0x0256:
            android.text.Layout$Alignment r1 = r13.p
            if (r1 == 0) goto L_0x0262
            r5.d = r1
            goto L_0x0262
        L_0x025d:
            r12 = r21
            r11 = r23
        L_0x0261:
            r4 = r1
        L_0x0262:
            r1 = r4
            r9 = 1
            goto L_0x0025
        L_0x0266:
            r12 = r21
            r11 = r23
            r7 = 0
            r9 = r7
        L_0x026c:
            int r1 = r17.c()
            if (r9 >= r1) goto L_0x0285
            utf r1 = r0.b(r9)
            r2 = r18
            r4 = r20
            r5 = r21
            r6 = r10
            r7 = r23
            r1.h(r2, r4, r5, r6, r7)
            r1 = 1
            int r9 = r9 + r1
            goto L_0x026c
        L_0x0285:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.utf.h(long, java.util.Map, java.util.Map, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j2, boolean z, String str, TreeMap treeMap) {
        TreeMap treeMap2 = treeMap;
        HashMap hashMap = this.k;
        hashMap.clear();
        HashMap hashMap2 = this.l;
        hashMap2.clear();
        String str2 = this.a;
        if (!"metadata".equals(str2)) {
            String str3 = this.h;
            String str4 = "".equals(str3) ? str : str3;
            if (this.c && z) {
                SpannableStringBuilder e2 = e(str4, treeMap2);
                String str5 = this.b;
                str5.getClass();
                e2.append(str5);
            } else if ("br".equals(str2) && z) {
                e(str4, treeMap2).append(10);
            } else if (f(j2)) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    CharSequence charSequence = ((k44) entry.getValue()).a;
                    charSequence.getClass();
                    hashMap.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(str2);
                for (int i2 = 0; i2 < c(); i2++) {
                    b(i2).i(j2, z || equals, str4, treeMap);
                }
                if (equals) {
                    SpannableStringBuilder e3 = e(str4, treeMap2);
                    int length = e3.length() - 1;
                    while (length >= 0 && e3.charAt(length) == ' ') {
                        length--;
                    }
                    if (length >= 0 && e3.charAt(length) != 10) {
                        e3.append(10);
                    }
                }
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    CharSequence charSequence2 = ((k44) entry2.getValue()).a;
                    charSequence2.getClass();
                    hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
