package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.json.HTTP;

/* renamed from: vtf  reason: default package */
public final class vtf {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final auf f;
    public final String[] g;
    public final String h;
    public final String i;
    public final vtf j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public vtf(String str, String str2, long j2, long j3, auf auf, String[] strArr, String str3, String str4, vtf vtf) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = auf;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j2;
        this.e = j3;
        str3.getClass();
        this.h = str3;
        this.j = vtf;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static vtf a(String str) {
        return new vtf((String) null, str.replaceAll(HTTP.CRLF, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, (auf) null, (String[]) null, "", (String) null, (vtf) null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            l44 l44 = new l44();
            l44.a = new SpannableStringBuilder();
            treeMap.put(str, l44);
        }
        CharSequence charSequence = ((l44) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final vtf b(int i2) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (vtf) arrayList.get(i2);
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
                ((vtf) this.m.get(i2)).d(treeSet, z || equals);
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

    /* JADX WARNING: Removed duplicated region for block: B:136:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02c1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(long r20, java.util.Map r22, java.util.Map r23, java.lang.String r24, java.util.TreeMap r25) {
        /*
            r19 = this;
            r0 = r19
            r8 = r22
            r1 = -1
            r9 = 1
            boolean r2 = r19.f(r20)
            if (r2 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.String r2 = ""
            java.lang.String r3 = r0.h
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001a
            r10 = r24
            goto L_0x001b
        L_0x001a:
            r10 = r3
        L_0x001b:
            java.util.HashMap r2 = r0.l
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0025:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02c7
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
            if (r6 == r3) goto L_0x02bb
            r11 = r25
            java.lang.Object r5 = r11.get(r5)
            l44 r5 = (defpackage.l44) r5
            r5.getClass()
            r12 = r23
            java.lang.Object r7 = r12.get(r10)
            ytf r7 = (defpackage.ytf) r7
            r7.getClass()
            auf r13 = r0.f
            java.lang.String[] r14 = r0.g
            auf r13 = defpackage.vzg.F(r13, r14, r8)
            java.lang.CharSequence r14 = r5.a
            android.text.SpannableStringBuilder r14 = (android.text.SpannableStringBuilder) r14
            if (r14 != 0) goto L_0x0082
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            r14.<init>()
            r5.a = r14
        L_0x0082:
            if (r13 == 0) goto L_0x02bf
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
            defpackage.h88.e(r14, r4, r6, r3)
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
            defpackage.h88.e(r14, r4, r6, r3)
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
            defpackage.h88.e(r14, r4, r6, r3)
        L_0x0122:
            jff r4 = r13.r
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
            lff r1 = new lff
            r1.<init>(r15, r7, r4)
            defpackage.h88.e(r14, r1, r6, r3)
        L_0x014a:
            int r1 = r13.m
            r4 = 2
            if (r1 == r4) goto L_0x0162
            if (r1 == r9) goto L_0x0157
            r4 = 4
            if (r1 == r4) goto L_0x0157
        L_0x0154:
            r15 = -1
            goto L_0x0201
        L_0x0157:
            xl4 r1 = new xl4
            r1.<init>()
            r4 = 33
            r14.setSpan(r1, r6, r3, r4)
            goto L_0x0154
        L_0x0162:
            vtf r1 = r0.j
        L_0x0164:
            if (r1 == 0) goto L_0x0179
            auf r7 = r1.f
            java.lang.String[] r15 = r1.g
            auf r7 = defpackage.vzg.F(r7, r15, r8)
            if (r7 == 0) goto L_0x0176
            int r7 = r7.m
            r15 = 1
            if (r7 != r15) goto L_0x0176
            goto L_0x017a
        L_0x0176:
            vtf r1 = r1.j
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
            vtf r15 = (defpackage.vtf) r15
            auf r4 = r15.f
            java.lang.String[] r9 = r15.g
            auf r4 = defpackage.vzg.F(r4, r9, r8)
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
            vtf r9 = r15.b(r4)
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
            if (r7 != r9) goto L_0x01fb
            r7 = 0
            vtf r9 = r4.b(r7)
            java.lang.String r9 = r9.b
            if (r9 == 0) goto L_0x01fb
            vtf r9 = r4.b(r7)
            java.lang.String r9 = r9.b
            int r15 = defpackage.v0g.a
            auf r15 = r4.f
            java.lang.String[] r4 = r4.g
            auf r4 = defpackage.vzg.F(r15, r4, r8)
            if (r4 == 0) goto L_0x01e0
            int r4 = r4.n
        L_0x01de:
            r15 = -1
            goto L_0x01e2
        L_0x01e0:
            r4 = -1
            goto L_0x01de
        L_0x01e2:
            if (r4 != r15) goto L_0x01f0
            auf r7 = r1.f
            java.lang.String[] r1 = r1.g
            auf r1 = defpackage.vzg.F(r7, r1, r8)
            if (r1 == 0) goto L_0x01f0
            int r4 = r1.n
        L_0x01f0:
            wad r1 = new wad
            r1.<init>(r9, r4)
            r4 = 33
            r14.setSpan(r1, r6, r3, r4)
            goto L_0x0201
        L_0x01fb:
            r15 = -1
            java.lang.String r1 = "Skipping rubyText node without exactly one text child."
            defpackage.i8b.F(r1)
        L_0x0201:
            int r1 = r13.q
            r4 = 1
            if (r1 != r4) goto L_0x020e
            r27 r1 = new r27
            r1.<init>()
            defpackage.h88.e(r14, r1, r6, r3)
        L_0x020e:
            int r1 = r13.j
            r7 = 1120403456(0x42c80000, float:100.0)
            if (r1 == r4) goto L_0x0285
            r4 = 2
            if (r1 == r4) goto L_0x0278
            r4 = 3
            if (r1 == r4) goto L_0x021e
            r17 = r2
            goto L_0x0293
        L_0x021e:
            float r1 = r13.k
            float r1 = r1 / r7
            java.lang.Class<android.text.style.RelativeSizeSpan> r4 = android.text.style.RelativeSizeSpan.class
            java.lang.Object[] r4 = r14.getSpans(r6, r3, r4)
            android.text.style.RelativeSizeSpan[] r4 = (android.text.style.RelativeSizeSpan[]) r4
            int r9 = r4.length
            r15 = 0
        L_0x022b:
            if (r15 >= r9) goto L_0x026b
            r7 = r4[r15]
            r17 = r2
            int r2 = r14.getSpanStart(r7)
            if (r2 > r6) goto L_0x0243
            int r2 = r14.getSpanEnd(r7)
            if (r2 < r3) goto L_0x0243
            float r2 = r7.getSizeChange()
            float r2 = r2 * r1
            r1 = r2
        L_0x0243:
            int r2 = r14.getSpanStart(r7)
            if (r2 != r6) goto L_0x025e
            int r2 = r14.getSpanEnd(r7)
            if (r2 != r3) goto L_0x025e
            int r2 = r14.getSpanFlags(r7)
            r18 = r4
            r4 = 33
            if (r2 != r4) goto L_0x025c
            r14.removeSpan(r7)
        L_0x025c:
            r2 = 1
            goto L_0x0263
        L_0x025e:
            r18 = r4
            r4 = 33
            goto L_0x025c
        L_0x0263:
            int r15 = r15 + r2
            r2 = r17
            r4 = r18
            r7 = 1120403456(0x42c80000, float:100.0)
            goto L_0x022b
        L_0x026b:
            r17 = r2
            r4 = 33
            android.text.style.RelativeSizeSpan r2 = new android.text.style.RelativeSizeSpan
            r2.<init>(r1)
            r14.setSpan(r2, r6, r3, r4)
            goto L_0x0293
        L_0x0278:
            r17 = r2
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan
            float r2 = r13.k
            r1.<init>(r2)
            defpackage.h88.e(r14, r1, r6, r3)
            goto L_0x0293
        L_0x0285:
            r17 = r2
            android.text.style.AbsoluteSizeSpan r1 = new android.text.style.AbsoluteSizeSpan
            float r2 = r13.k
            int r2 = (int) r2
            r4 = 1
            r1.<init>(r2, r4)
            defpackage.h88.e(r14, r1, r6, r3)
        L_0x0293:
            java.lang.String r1 = "p"
            java.lang.String r2 = r0.a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c1
            float r1 = r13.s
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x02ae
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r1 = r1 * r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            r5.q = r1
        L_0x02ae:
            android.text.Layout$Alignment r1 = r13.o
            if (r1 == 0) goto L_0x02b4
            r5.c = r1
        L_0x02b4:
            android.text.Layout$Alignment r1 = r13.p
            if (r1 == 0) goto L_0x02c1
            r5.d = r1
            goto L_0x02c1
        L_0x02bb:
            r12 = r23
            r11 = r25
        L_0x02bf:
            r17 = r2
        L_0x02c1:
            r2 = r17
            r1 = -1
            r9 = 1
            goto L_0x0025
        L_0x02c7:
            r12 = r23
            r11 = r25
            r9 = 0
        L_0x02cc:
            int r1 = r19.c()
            if (r9 >= r1) goto L_0x02e5
            vtf r1 = r0.b(r9)
            r2 = r20
            r4 = r22
            r5 = r23
            r6 = r10
            r7 = r25
            r1.h(r2, r4, r5, r6, r7)
            r1 = 1
            int r9 = r9 + r1
            goto L_0x02cc
        L_0x02e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtf.h(long, java.util.Map, java.util.Map, java.lang.String, java.util.TreeMap):void");
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
                    CharSequence charSequence = ((l44) entry.getValue()).a;
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
                    CharSequence charSequence2 = ((l44) entry2.getValue()).a;
                    charSequence2.getClass();
                    hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
