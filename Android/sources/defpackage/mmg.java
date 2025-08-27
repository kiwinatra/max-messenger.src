package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: mmg  reason: default package */
public abstract class mmg {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        wzf.n(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, hashMap, "white");
        wzf.n(0, KotlinVersion.MAX_COMPONENT_VALUE, 0, hashMap, "lime");
        wzf.n(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, hashMap, "cyan");
        wzf.n(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, hashMap, "red");
        wzf.n(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0, hashMap, "yellow");
        wzf.n(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE, hashMap, "magenta");
        wzf.n(0, 0, KotlinVersion.MAX_COMPONENT_VALUE, hashMap, "blue");
        wzf.n(0, 0, 0, hashMap, "black");
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        wzf.n(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, hashMap2, "bg_white");
        wzf.n(0, KotlinVersion.MAX_COMPONENT_VALUE, 0, hashMap2, "bg_lime");
        wzf.n(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, hashMap2, "bg_cyan");
        wzf.n(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, hashMap2, "bg_red");
        wzf.n(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0, hashMap2, "bg_yellow");
        wzf.n(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE, hashMap2, "bg_magenta");
        wzf.n(0, 0, KotlinVersion.MAX_COMPONENT_VALUE, hashMap2, "bg_blue");
        wzf.n(0, 0, 0, hashMap2, "bg_black");
        d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r18, defpackage.hmg r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.List r22) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = r22
            int r5 = r1.b
            int r6 = r21.length()
            java.lang.String r7 = r1.a
            r7.getClass()
            r9 = -1
            r11 = 1
            r12 = 33
            int r13 = r7.hashCode()
            switch(r13) {
                case 0: goto L_0x006e;
                case 98: goto L_0x0063;
                case 99: goto L_0x0058;
                case 105: goto L_0x004d;
                case 117: goto L_0x0042;
                case 118: goto L_0x0037;
                case 3314158: goto L_0x002c;
                case 3511770: goto L_0x0021;
                default: goto L_0x001e;
            }
        L_0x001e:
            r7 = r9
            goto L_0x0078
        L_0x0021:
            java.lang.String r13 = "ruby"
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x002a
            goto L_0x001e
        L_0x002a:
            r7 = 7
            goto L_0x0078
        L_0x002c:
            java.lang.String r13 = "lang"
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x0035
            goto L_0x001e
        L_0x0035:
            r7 = 6
            goto L_0x0078
        L_0x0037:
            java.lang.String r13 = "v"
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x0040
            goto L_0x001e
        L_0x0040:
            r7 = 5
            goto L_0x0078
        L_0x0042:
            java.lang.String r13 = "u"
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x004b
            goto L_0x001e
        L_0x004b:
            r7 = 4
            goto L_0x0078
        L_0x004d:
            java.lang.String r13 = "i"
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x0056
            goto L_0x001e
        L_0x0056:
            r7 = 3
            goto L_0x0078
        L_0x0058:
            java.lang.String r13 = "c"
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x0061
            goto L_0x001e
        L_0x0061:
            r7 = 2
            goto L_0x0078
        L_0x0063:
            java.lang.String r13 = "b"
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x006c
            goto L_0x001e
        L_0x006c:
            r7 = r11
            goto L_0x0078
        L_0x006e:
            java.lang.String r13 = ""
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x0077
            goto L_0x001e
        L_0x0077:
            r7 = 0
        L_0x0078:
            switch(r7) {
                case 0: goto L_0x014f;
                case 1: goto L_0x0147;
                case 2: goto L_0x00ff;
                case 3: goto L_0x00f5;
                case 4: goto L_0x00ec;
                case 5: goto L_0x014f;
                case 6: goto L_0x014f;
                case 7: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            return
        L_0x007c:
            int r7 = c(r3, r0, r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r20.size()
            r13.<init>(r14)
            r14 = r20
            r13.addAll(r14)
            baf r14 = defpackage.fmg.c
            java.util.Collections.sort(r13, r14)
            int r14 = r1.b
            r15 = 0
            r16 = 0
        L_0x0098:
            int r10 = r13.size()
            if (r15 >= r10) goto L_0x014f
            java.lang.Object r10 = r13.get(r15)
            fmg r10 = (defpackage.fmg) r10
            hmg r10 = r10.a
            java.lang.String r10 = r10.a
            java.lang.String r4 = "rt"
            boolean r4 = r4.equals(r10)
            if (r4 != 0) goto L_0x00b1
            goto L_0x00e9
        L_0x00b1:
            java.lang.Object r4 = r13.get(r15)
            fmg r4 = (defpackage.fmg) r4
            hmg r10 = r4.a
            int r10 = c(r3, r0, r10)
            if (r10 == r9) goto L_0x00c0
            goto L_0x00c5
        L_0x00c0:
            if (r7 == r9) goto L_0x00c4
            r10 = r7
            goto L_0x00c5
        L_0x00c4:
            r10 = r11
        L_0x00c5:
            hmg r9 = r4.a
            int r9 = r9.b
            int r9 = r9 - r16
            int r4 = r4.b
            int r4 = r4 - r16
            java.lang.CharSequence r17 = r2.subSequence(r9, r4)
            r2.delete(r9, r4)
            vad r4 = new vad
            java.lang.String r8 = r17.toString()
            r4.<init>(r8, r10)
            r2.setSpan(r4, r14, r9, r12)
            int r4 = r17.length()
            int r16 = r4 + r16
            r14 = r9
        L_0x00e9:
            int r15 = r15 + r11
            r9 = -1
            goto L_0x0098
        L_0x00ec:
            android.text.style.UnderlineSpan r4 = new android.text.style.UnderlineSpan
            r4.<init>()
            r2.setSpan(r4, r5, r6, r12)
            goto L_0x014f
        L_0x00f5:
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r7 = 2
            r4.<init>(r7)
            r2.setSpan(r4, r5, r6, r12)
            goto L_0x014f
        L_0x00ff:
            java.util.Set r4 = r1.d
            java.util.Iterator r4 = r4.iterator()
        L_0x0105:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x014f
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.Map r8 = c
            boolean r9 = r8.containsKey(r7)
            if (r9 == 0) goto L_0x012c
            java.lang.Object r7 = r8.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            r8.<init>(r7)
            r2.setSpan(r8, r5, r6, r12)
            goto L_0x0105
        L_0x012c:
            java.util.Map r8 = d
            boolean r9 = r8.containsKey(r7)
            if (r9 == 0) goto L_0x0105
            java.lang.Object r7 = r8.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            android.text.style.BackgroundColorSpan r8 = new android.text.style.BackgroundColorSpan
            r8.<init>(r7)
            r2.setSpan(r8, r5, r6, r12)
            goto L_0x0105
        L_0x0147:
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r4.<init>(r11)
            r2.setSpan(r4, r5, r6, r12)
        L_0x014f:
            java.util.ArrayList r0 = b(r3, r0, r1)
            r1 = 0
        L_0x0154:
            int r3 = r0.size()
            if (r1 >= r3) goto L_0x0242
            java.lang.Object r3 = r0.get(r1)
            jmg r3 = (defpackage.jmg) r3
            bmg r3 = r3.b
            if (r3 != 0) goto L_0x0169
            r7 = -1
            r8 = 2
            r9 = 3
            goto L_0x023f
        L_0x0169:
            int r4 = r3.l
            r7 = -1
            if (r4 != r7) goto L_0x0175
            int r8 = r3.m
            if (r8 != r7) goto L_0x0175
            r4 = -1
        L_0x0173:
            r7 = -1
            goto L_0x0184
        L_0x0175:
            if (r4 != r11) goto L_0x0179
            r4 = r11
            goto L_0x017a
        L_0x0179:
            r4 = 0
        L_0x017a:
            int r7 = r3.m
            if (r7 != r11) goto L_0x0180
            r7 = 2
            goto L_0x0181
        L_0x0180:
            r7 = 0
        L_0x0181:
            r7 = r7 | r4
            r4 = r7
            goto L_0x0173
        L_0x0184:
            if (r4 == r7) goto L_0x01a5
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            int r8 = r3.l
            if (r8 != r7) goto L_0x0192
            int r9 = r3.m
            if (r9 != r7) goto L_0x0192
            r8 = r7
            goto L_0x019f
        L_0x0192:
            if (r8 != r11) goto L_0x0196
            r8 = r11
            goto L_0x0197
        L_0x0196:
            r8 = 0
        L_0x0197:
            int r9 = r3.m
            if (r9 != r11) goto L_0x019d
            r9 = 2
            goto L_0x019e
        L_0x019d:
            r9 = 0
        L_0x019e:
            r8 = r8 | r9
        L_0x019f:
            r4.<init>(r8)
            defpackage.i8b.a(r2, r4, r5, r6)
        L_0x01a5:
            int r4 = r3.j
            if (r4 != r11) goto L_0x01b1
            android.text.style.StrikethroughSpan r4 = new android.text.style.StrikethroughSpan
            r4.<init>()
            r2.setSpan(r4, r5, r6, r12)
        L_0x01b1:
            int r4 = r3.k
            if (r4 != r11) goto L_0x01bd
            android.text.style.UnderlineSpan r4 = new android.text.style.UnderlineSpan
            r4.<init>()
            r2.setSpan(r4, r5, r6, r12)
        L_0x01bd:
            boolean r4 = r3.g
            if (r4 == 0) goto L_0x01d8
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            boolean r8 = r3.g
            if (r8 == 0) goto L_0x01d0
            int r8 = r3.f
            r4.<init>(r8)
            defpackage.i8b.a(r2, r4, r5, r6)
            goto L_0x01d8
        L_0x01d0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Font color not defined"
            r0.<init>(r1)
            throw r0
        L_0x01d8:
            boolean r4 = r3.i
            if (r4 == 0) goto L_0x01f3
            android.text.style.BackgroundColorSpan r4 = new android.text.style.BackgroundColorSpan
            boolean r8 = r3.i
            if (r8 == 0) goto L_0x01eb
            int r8 = r3.h
            r4.<init>(r8)
            defpackage.i8b.a(r2, r4, r5, r6)
            goto L_0x01f3
        L_0x01eb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Background color not defined."
            r0.<init>(r1)
            throw r0
        L_0x01f3:
            java.lang.String r4 = r3.e
            if (r4 == 0) goto L_0x0201
            android.text.style.TypefaceSpan r4 = new android.text.style.TypefaceSpan
            java.lang.String r8 = r3.e
            r4.<init>(r8)
            defpackage.i8b.a(r2, r4, r5, r6)
        L_0x0201:
            int r4 = r3.n
            if (r4 == r11) goto L_0x0226
            r8 = 2
            if (r4 == r8) goto L_0x021a
            r9 = 3
            if (r4 == r9) goto L_0x020c
            goto L_0x0233
        L_0x020c:
            android.text.style.RelativeSizeSpan r4 = new android.text.style.RelativeSizeSpan
            float r10 = r3.o
            r13 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 / r13
            r4.<init>(r10)
            defpackage.i8b.a(r2, r4, r5, r6)
            goto L_0x0233
        L_0x021a:
            r9 = 3
            android.text.style.RelativeSizeSpan r4 = new android.text.style.RelativeSizeSpan
            float r10 = r3.o
            r4.<init>(r10)
            defpackage.i8b.a(r2, r4, r5, r6)
            goto L_0x0233
        L_0x0226:
            r8 = 2
            r9 = 3
            android.text.style.AbsoluteSizeSpan r4 = new android.text.style.AbsoluteSizeSpan
            float r10 = r3.o
            int r10 = (int) r10
            r4.<init>(r10, r11)
            defpackage.i8b.a(r2, r4, r5, r6)
        L_0x0233:
            boolean r3 = r3.q
            if (r3 == 0) goto L_0x023f
            q27 r3 = new q27
            r3.<init>()
            r2.setSpan(r3, r5, r6, r12)
        L_0x023f:
            int r1 = r1 + r11
            goto L_0x0154
        L_0x0242:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mmg.a(java.lang.String, hmg, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    public static ArrayList b(List list, String str, hmg hmg) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            bmg bmg = (bmg) list.get(i2);
            String str2 = hmg.a;
            if (!bmg.a.isEmpty() || !bmg.b.isEmpty() || !bmg.c.isEmpty() || !bmg.d.isEmpty()) {
                int a2 = bmg.a(bmg.d, bmg.a(bmg.b, bmg.a(bmg.a, 0, 1073741824, str), 2, str2), 4, hmg.c);
                if (a2 != -1) {
                    if (hmg.d.containsAll(bmg.c)) {
                        i = a2 + (bmg.c.size() * 4);
                    }
                }
                i = 0;
            } else {
                i = TextUtils.isEmpty(str2);
            }
            if (i > 0) {
                arrayList.add(new jmg(i, bmg));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, hmg hmg) {
        ArrayList b2 = b(list, str, hmg);
        for (int i = 0; i < b2.size(); i++) {
            int i2 = ((jmg) b2.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static dmg d(String str, Matcher matcher, g1g g1g, ArrayList arrayList) {
        lmg lmg = new lmg();
        try {
            String group = matcher.group(1);
            group.getClass();
            lmg.a = rmg.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            lmg.b = rmg.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, lmg);
            StringBuilder sb = new StringBuilder();
            String i = g1g.i();
            while (!TextUtils.isEmpty(i)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(i.trim());
                i = g1g.i();
            }
            lmg.c = f(str, sb.toString(), arrayList);
            return new dmg(lmg.a().a(), lmg.a, lmg.b);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(matcher.group());
            if (valueOf.length() == 0) {
                return null;
            }
            "Skipping cue with bad header: ".concat(valueOf);
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(java.lang.String r18, defpackage.lmg r19) {
        /*
            r0 = r19
            java.lang.String r1 = "start"
            java.lang.String r2 = "end"
            java.lang.String r3 = "middle"
            java.lang.String r4 = "center"
            r6 = 4
            r7 = 3
            r8 = 0
            r9 = -1
            r10 = 2
            r11 = 1
            java.util.regex.Pattern r12 = b
            r13 = r18
            java.util.regex.Matcher r12 = r12.matcher(r13)
        L_0x0018:
            boolean r13 = r12.find()
            if (r13 == 0) goto L_0x0182
            java.lang.String r13 = r12.group(r11)
            r13.getClass()
            java.lang.String r14 = r12.group(r10)
            r14.getClass()
            java.lang.String r15 = "line"
            boolean r15 = r15.equals(r13)     // Catch:{ NumberFormatException -> 0x016d }
            if (r15 == 0) goto L_0x0038
            g(r14, r0)     // Catch:{ NumberFormatException -> 0x016d }
            goto L_0x0018
        L_0x0038:
            java.lang.String r15 = "align"
            boolean r15 = r15.equals(r13)     // Catch:{ NumberFormatException -> 0x016d }
            if (r15 == 0) goto L_0x009d
            int r13 = r14.hashCode()
            switch(r13) {
                case -1364013995: goto L_0x007a;
                case -1074341483: goto L_0x0071;
                case 100571: goto L_0x0068;
                case 3317767: goto L_0x005d;
                case 108511772: goto L_0x0052;
                case 109757538: goto L_0x0049;
                default: goto L_0x0047;
            }
        L_0x0047:
            r13 = r9
            goto L_0x0082
        L_0x0049:
            boolean r13 = r14.equals(r1)
            if (r13 != 0) goto L_0x0050
            goto L_0x0047
        L_0x0050:
            r13 = 5
            goto L_0x0082
        L_0x0052:
            java.lang.String r13 = "right"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x005b
            goto L_0x0047
        L_0x005b:
            r13 = r6
            goto L_0x0082
        L_0x005d:
            java.lang.String r13 = "left"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x0066
            goto L_0x0047
        L_0x0066:
            r13 = r7
            goto L_0x0082
        L_0x0068:
            boolean r13 = r14.equals(r2)
            if (r13 != 0) goto L_0x006f
            goto L_0x0047
        L_0x006f:
            r13 = r10
            goto L_0x0082
        L_0x0071:
            boolean r13 = r14.equals(r3)
            if (r13 != 0) goto L_0x0078
            goto L_0x0047
        L_0x0078:
            r13 = r11
            goto L_0x0082
        L_0x007a:
            boolean r13 = r14.equals(r4)
            if (r13 != 0) goto L_0x0081
            goto L_0x0047
        L_0x0081:
            r13 = r8
        L_0x0082:
            switch(r13) {
                case 0: goto L_0x0090;
                case 1: goto L_0x0090;
                case 2: goto L_0x0098;
                case 3: goto L_0x0096;
                case 4: goto L_0x0094;
                case 5: goto L_0x0092;
                default: goto L_0x0085;
            }
        L_0x0085:
            int r13 = r14.length()     // Catch:{ NumberFormatException -> 0x016d }
            if (r13 == 0) goto L_0x0090
            java.lang.String r13 = "Invalid alignment value: "
            r13.concat(r14)     // Catch:{ NumberFormatException -> 0x016d }
        L_0x0090:
            r13 = r10
            goto L_0x0099
        L_0x0092:
            r13 = r11
            goto L_0x0099
        L_0x0094:
            r13 = 5
            goto L_0x0099
        L_0x0096:
            r13 = r6
            goto L_0x0099
        L_0x0098:
            r13 = r7
        L_0x0099:
            r0.d = r13     // Catch:{ NumberFormatException -> 0x016d }
            goto L_0x0018
        L_0x009d:
            java.lang.String r15 = "position"
            boolean r15 = r15.equals(r13)     // Catch:{ NumberFormatException -> 0x016d }
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == 0) goto L_0x011e
            r13 = 44
            int r13 = r14.indexOf(r13)     // Catch:{ NumberFormatException -> 0x016d }
            if (r13 == r9) goto L_0x0116
            int r15 = r13 + 1
            java.lang.String r15 = r14.substring(r15)     // Catch:{ NumberFormatException -> 0x016d }
            r15.getClass()     // Catch:{ NumberFormatException -> 0x016d }
            int r17 = r15.hashCode()
            switch(r17) {
                case -1842484672: goto L_0x00f0;
                case -1364013995: goto L_0x00e7;
                case -1276788989: goto L_0x00dc;
                case -1074341483: goto L_0x00d3;
                case 100571: goto L_0x00ca;
                case 109757538: goto L_0x00c1;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            r5 = r9
            goto L_0x00fa
        L_0x00c1:
            boolean r17 = r15.equals(r1)
            if (r17 != 0) goto L_0x00c8
            goto L_0x00bf
        L_0x00c8:
            r5 = 5
            goto L_0x00fa
        L_0x00ca:
            boolean r17 = r15.equals(r2)
            if (r17 != 0) goto L_0x00d1
            goto L_0x00bf
        L_0x00d1:
            r5 = r6
            goto L_0x00fa
        L_0x00d3:
            boolean r17 = r15.equals(r3)
            if (r17 != 0) goto L_0x00da
            goto L_0x00bf
        L_0x00da:
            r5 = r7
            goto L_0x00fa
        L_0x00dc:
            java.lang.String r5 = "line-right"
            boolean r5 = r15.equals(r5)
            if (r5 != 0) goto L_0x00e5
            goto L_0x00bf
        L_0x00e5:
            r5 = r10
            goto L_0x00fa
        L_0x00e7:
            boolean r5 = r15.equals(r4)
            if (r5 != 0) goto L_0x00ee
            goto L_0x00bf
        L_0x00ee:
            r5 = r11
            goto L_0x00fa
        L_0x00f0:
            java.lang.String r5 = "line-left"
            boolean r5 = r15.equals(r5)
            if (r5 != 0) goto L_0x00f9
            goto L_0x00bf
        L_0x00f9:
            r5 = r8
        L_0x00fa:
            switch(r5) {
                case 0: goto L_0x010f;
                case 1: goto L_0x010d;
                case 2: goto L_0x010b;
                case 3: goto L_0x010d;
                case 4: goto L_0x010b;
                case 5: goto L_0x010f;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            int r5 = r15.length()     // Catch:{ NumberFormatException -> 0x016d }
            if (r5 == 0) goto L_0x0108
            java.lang.String r5 = "Invalid anchor value: "
            r5.concat(r15)     // Catch:{ NumberFormatException -> 0x016d }
        L_0x0108:
            r5 = r16
            goto L_0x0110
        L_0x010b:
            r5 = r10
            goto L_0x0110
        L_0x010d:
            r5 = r11
            goto L_0x0110
        L_0x010f:
            r5 = r8
        L_0x0110:
            r0.i = r5     // Catch:{ NumberFormatException -> 0x016d }
            java.lang.String r14 = r14.substring(r8, r13)     // Catch:{ NumberFormatException -> 0x016d }
        L_0x0116:
            float r5 = defpackage.rmg.b(r14)     // Catch:{ NumberFormatException -> 0x016d }
            r0.h = r5     // Catch:{ NumberFormatException -> 0x016d }
            goto L_0x0018
        L_0x011e:
            java.lang.String r5 = "size"
            boolean r5 = r5.equals(r13)     // Catch:{ NumberFormatException -> 0x016d }
            if (r5 == 0) goto L_0x012e
            float r5 = defpackage.rmg.b(r14)     // Catch:{ NumberFormatException -> 0x016d }
            r0.j = r5     // Catch:{ NumberFormatException -> 0x016d }
            goto L_0x0018
        L_0x012e:
            java.lang.String r5 = "vertical"
            boolean r5 = r5.equals(r13)     // Catch:{ NumberFormatException -> 0x016d }
            if (r5 == 0) goto L_0x015b
            java.lang.String r5 = "lr"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x0156
            java.lang.String r5 = "rl"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x0154
            int r5 = r14.length()     // Catch:{ NumberFormatException -> 0x016d }
            if (r5 == 0) goto L_0x0151
            java.lang.String r5 = "Invalid 'vertical' value: "
            r5.concat(r14)     // Catch:{ NumberFormatException -> 0x016d }
        L_0x0151:
            r5 = r16
            goto L_0x0157
        L_0x0154:
            r5 = r11
            goto L_0x0157
        L_0x0156:
            r5 = r10
        L_0x0157:
            r0.k = r5     // Catch:{ NumberFormatException -> 0x016d }
            goto L_0x0018
        L_0x015b:
            int r5 = r13.length()     // Catch:{ NumberFormatException -> 0x016d }
            int r5 = r5 + 21
            int r13 = r14.length()     // Catch:{ NumberFormatException -> 0x016d }
            int r5 = r5 + r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x016d }
            r13.<init>(r5)     // Catch:{ NumberFormatException -> 0x016d }
            goto L_0x0018
        L_0x016d:
            java.lang.String r5 = r12.group()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r13 = r5.length()
            if (r13 == 0) goto L_0x0018
            java.lang.String r13 = "Skipping bad cue setting: "
            r13.concat(r5)
            goto L_0x0018
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mmg.e(java.lang.String, lmg):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannedString f(java.lang.String r16, java.lang.String r17, java.util.List r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r4 = -1
            r5 = 2
            r6 = 1
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r11 = 0
        L_0x0019:
            int r12 = r17.length()
            java.lang.String r13 = ""
            if (r11 >= r12) goto L_0x0207
            char r12 = r1.charAt(r11)
            java.lang.String r14 = " "
            r15 = 62
            r3 = 60
            r10 = 38
            if (r12 == r10) goto L_0x0181
            if (r12 == r3) goto L_0x0039
            r7.append(r12)
            int r11 = r11 + r6
        L_0x0035:
            r3 = r6
            r6 = r4
            goto L_0x0202
        L_0x0039:
            int r3 = r11 + 1
            int r10 = r17.length()
            if (r3 < r10) goto L_0x0043
            r11 = r3
            goto L_0x0035
        L_0x0043:
            char r10 = r1.charAt(r3)
            r12 = 47
            if (r10 != r12) goto L_0x004d
            r10 = r6
            goto L_0x004e
        L_0x004d:
            r10 = 0
        L_0x004e:
            int r3 = r1.indexOf(r15, r3)
            if (r3 != r4) goto L_0x0059
            int r3 = r17.length()
            goto L_0x005a
        L_0x0059:
            int r3 = r3 + r6
        L_0x005a:
            int r15 = r3 + -2
            char r4 = r1.charAt(r15)
            if (r4 != r12) goto L_0x0064
            r4 = r6
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            if (r10 == 0) goto L_0x0069
            r12 = r5
            goto L_0x006a
        L_0x0069:
            r12 = r6
        L_0x006a:
            int r11 = r11 + r12
            if (r4 == 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            int r15 = r3 + -1
        L_0x0070:
            java.lang.String r11 = r1.substring(r11, r15)
            java.lang.String r12 = r11.trim()
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0080
            goto L_0x00fe
        L_0x0080:
            java.lang.String r12 = r11.trim()
            boolean r15 = r12.isEmpty()
            r15 = r15 ^ r6
            defpackage.y64.g(r15)
            int r15 = defpackage.t0g.a
            java.lang.String r15 = "[ \\.]"
            java.lang.String[] r12 = r12.split(r15, r5)
            r15 = 0
            r12 = r12[r15]
            r12.getClass()
            int r15 = r12.hashCode()
            switch(r15) {
                case 98: goto L_0x00f1;
                case 99: goto L_0x00e6;
                case 105: goto L_0x00db;
                case 117: goto L_0x00d0;
                case 118: goto L_0x00c5;
                case 3650: goto L_0x00ba;
                case 3314158: goto L_0x00af;
                case 3511770: goto L_0x00a4;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            r15 = -1
            goto L_0x00fb
        L_0x00a4:
            java.lang.String r15 = "ruby"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00ad
            goto L_0x00a1
        L_0x00ad:
            r15 = 7
            goto L_0x00fb
        L_0x00af:
            java.lang.String r15 = "lang"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00b8
            goto L_0x00a1
        L_0x00b8:
            r15 = 6
            goto L_0x00fb
        L_0x00ba:
            java.lang.String r15 = "rt"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00c3
            goto L_0x00a1
        L_0x00c3:
            r15 = 5
            goto L_0x00fb
        L_0x00c5:
            java.lang.String r15 = "v"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00ce
            goto L_0x00a1
        L_0x00ce:
            r15 = 4
            goto L_0x00fb
        L_0x00d0:
            java.lang.String r15 = "u"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00d9
            goto L_0x00a1
        L_0x00d9:
            r15 = 3
            goto L_0x00fb
        L_0x00db:
            java.lang.String r15 = "i"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00e4
            goto L_0x00a1
        L_0x00e4:
            r15 = r5
            goto L_0x00fb
        L_0x00e6:
            java.lang.String r15 = "c"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00ef
            goto L_0x00a1
        L_0x00ef:
            r15 = r6
            goto L_0x00fb
        L_0x00f1:
            java.lang.String r15 = "b"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00fa
            goto L_0x00a1
        L_0x00fa:
            r15 = 0
        L_0x00fb:
            switch(r15) {
                case 0: goto L_0x0102;
                case 1: goto L_0x0102;
                case 2: goto L_0x0102;
                case 3: goto L_0x0102;
                case 4: goto L_0x0102;
                case 5: goto L_0x0102;
                case 6: goto L_0x0102;
                case 7: goto L_0x0102;
                default: goto L_0x00fe;
            }
        L_0x00fe:
            r11 = r3
            r4 = -1
            goto L_0x0019
        L_0x0102:
            if (r10 == 0) goto L_0x0134
        L_0x0104:
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x010c
            goto L_0x017c
        L_0x010c:
            java.lang.Object r4 = r8.pop()
            hmg r4 = (defpackage.hmg) r4
            a(r0, r4, r9, r7, r2)
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto L_0x0128
            fmg r10 = new fmg
            int r11 = r7.length()
            r10.<init>(r4, r11)
            r9.add(r10)
            goto L_0x012b
        L_0x0128:
            r9.clear()
        L_0x012b:
            java.lang.String r4 = r4.a
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x0104
            goto L_0x017c
        L_0x0134:
            if (r4 != 0) goto L_0x017c
            int r4 = r7.length()
            java.lang.String r10 = r11.trim()
            boolean r11 = r10.isEmpty()
            r11 = r11 ^ r6
            defpackage.y64.g(r11)
            int r11 = r10.indexOf(r14)
            r12 = -1
            if (r11 != r12) goto L_0x014f
            r14 = 0
            goto L_0x015c
        L_0x014f:
            java.lang.String r13 = r10.substring(r11)
            java.lang.String r13 = r13.trim()
            r14 = 0
            java.lang.String r10 = r10.substring(r14, r11)
        L_0x015c:
            java.lang.String r11 = "\\."
            java.lang.String[] r10 = r10.split(r11, r12)
            r11 = r10[r14]
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            r14 = r6
        L_0x016a:
            int r15 = r10.length
            if (r14 >= r15) goto L_0x0174
            r15 = r10[r14]
            r12.add(r15)
            int r14 = r14 + r6
            goto L_0x016a
        L_0x0174:
            hmg r10 = new hmg
            r10.<init>(r11, r4, r13, r12)
            r8.push(r10)
        L_0x017c:
            r11 = r3
            r3 = r6
            r6 = -1
            goto L_0x0202
        L_0x0181:
            int r11 = r11 + r6
            r4 = 59
            int r4 = r1.indexOf(r4, r11)
            r13 = 32
            int r5 = r1.indexOf(r13, r11)
            r6 = -1
            if (r4 != r6) goto L_0x0193
            r4 = r5
            goto L_0x019a
        L_0x0193:
            if (r5 != r6) goto L_0x0196
            goto L_0x019a
        L_0x0196:
            int r4 = java.lang.Math.min(r4, r5)
        L_0x019a:
            if (r4 == r6) goto L_0x01fe
            java.lang.String r11 = r1.substring(r11, r4)
            r11.getClass()
            int r12 = r11.hashCode()
            switch(r12) {
                case 3309: goto L_0x01cd;
                case 3464: goto L_0x01c2;
                case 96708: goto L_0x01b7;
                case 3374865: goto L_0x01ac;
                default: goto L_0x01aa;
            }
        L_0x01aa:
            r12 = r6
            goto L_0x01d7
        L_0x01ac:
            java.lang.String r12 = "nbsp"
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto L_0x01b5
            goto L_0x01aa
        L_0x01b5:
            r12 = 3
            goto L_0x01d7
        L_0x01b7:
            java.lang.String r12 = "amp"
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto L_0x01c0
            goto L_0x01aa
        L_0x01c0:
            r12 = 2
            goto L_0x01d7
        L_0x01c2:
            java.lang.String r12 = "lt"
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto L_0x01cb
            goto L_0x01aa
        L_0x01cb:
            r12 = 1
            goto L_0x01d7
        L_0x01cd:
            java.lang.String r12 = "gt"
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto L_0x01d6
            goto L_0x01aa
        L_0x01d6:
            r12 = 0
        L_0x01d7:
            switch(r12) {
                case 0: goto L_0x01f2;
                case 1: goto L_0x01ee;
                case 2: goto L_0x01ea;
                case 3: goto L_0x01e6;
                default: goto L_0x01da;
            }
        L_0x01da:
            int r3 = r11.length()
            int r3 = r3 + 33
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r3)
            goto L_0x01f5
        L_0x01e6:
            r7.append(r13)
            goto L_0x01f5
        L_0x01ea:
            r7.append(r10)
            goto L_0x01f5
        L_0x01ee:
            r7.append(r3)
            goto L_0x01f5
        L_0x01f2:
            r7.append(r15)
        L_0x01f5:
            if (r4 != r5) goto L_0x01fa
            r7.append(r14)
        L_0x01fa:
            r3 = 1
            int r4 = r4 + r3
            r11 = r4
            goto L_0x0202
        L_0x01fe:
            r3 = 1
            r7.append(r12)
        L_0x0202:
            r4 = r6
            r5 = 2
            r6 = r3
            goto L_0x0019
        L_0x0207:
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0217
            java.lang.Object r1 = r8.pop()
            hmg r1 = (defpackage.hmg) r1
            a(r0, r1, r9, r7, r2)
            goto L_0x0207
        L_0x0217:
            hmg r1 = new hmg
            java.util.Set r3 = java.util.Collections.emptySet()
            r4 = 0
            r1.<init>(r13, r4, r13, r3)
            java.util.List r3 = java.util.Collections.emptyList()
            a(r0, r1, r3, r7, r2)
            android.text.SpannedString r0 = android.text.SpannedString.valueOf(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mmg.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, lmg lmg) {
        int i = 2;
        int indexOf = str.indexOf(44);
        char c2 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                    i = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i = 0;
                    break;
                default:
                    if (substring.length() != 0) {
                        "Invalid anchor value: ".concat(substring);
                    }
                    i = IntCompanionObject.MIN_VALUE;
                    break;
            }
            lmg.g = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            lmg.e = rmg.b(str);
            lmg.f = 0;
            return;
        }
        lmg.e = (float) Integer.parseInt(str);
        lmg.f = 1;
    }
}
