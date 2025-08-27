package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.IntCompanionObject;
import org.apache.http.util.LangUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: ttf  reason: default package */
public final class ttf extends ibe {
    public static final Pattern A0 = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern B0 = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern C0 = Pattern.compile("^(\\d+) (\\d+)$");
    public static final aid D0 = new aid(1, 30.0f, 1);
    public static final jq5 E0 = new jq5(15, 11);
    public static final Pattern w0 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern x0 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern y0 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern z0 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public final XmlPullParserFactory v0;

    public ttf() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.v0 = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static ztf g(ztf ztf) {
        return ztf == null ? new ztf() : ztf;
    }

    public static boolean h(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static jq5 i(XmlPullParser xmlPullParser, jq5 jq5) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return jq5;
        }
        Matcher matcher = C0.matcher(attributeValue);
        if (!matcher.matches()) {
            if (attributeValue.length() != 0) {
                "Ignoring malformed cell resolution: ".concat(attributeValue);
            }
            return jq5;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new jq5(parseInt2, 11);
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid cell resolution ");
            sb.append(parseInt);
            sb.append(" ");
            sb.append(parseInt2);
            throw new Exception(sb.toString());
        } catch (NumberFormatException unused) {
            if (attributeValue.length() != 0) {
                "Ignoring malformed cell resolution: ".concat(attributeValue);
            }
            return jq5;
        }
    }

    public static void j(String str, ztf ztf) {
        Matcher matcher;
        char c = 65535;
        int i = t0g.a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = y0;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
        } else {
            int length2 = split.length;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Invalid number of entries for fontSize: ");
            sb.append(length2);
            sb.append(".");
            throw new Exception(sb.toString());
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            switch (group.hashCode()) {
                case LangUtils.HASH_OFFSET /*37*/:
                    if (group.equals("%")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    ztf.j = 3;
                    break;
                case 1:
                    ztf.j = 2;
                    break;
                case 2:
                    ztf.j = 1;
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder(group.length() + 30);
                    sb2.append("Invalid unit for fontSize: '");
                    sb2.append(group);
                    sb2.append("'.");
                    throw new Exception(sb2.toString());
            }
            String group2 = matcher.group(1);
            group2.getClass();
            ztf.k = Float.parseFloat(group2);
            return;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + 36);
        sb3.append("Invalid expression for fontSize: '");
        sb3.append(str);
        sb3.append("'.");
        throw new Exception(sb3.toString());
    }

    public static aid k(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i = t0g.a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                f = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
            } else {
                throw new Exception("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f = 1.0f;
        }
        aid aid = D0;
        int i2 = aid.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new aid(i2, ((float) parseInt) * f, attributeValue4 != null ? Integer.parseInt(attributeValue4) : aid.c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x025a A[LOOP:0: B:1:0x000a->B:120:0x025a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0259 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, defpackage.jq5 r22, defpackage.ft r23, java.util.HashMap r24, java.util.HashMap r25) {
        /*
            r0 = r20
            r1 = r21
            r2 = r23
            r3 = 2
            r4 = -1
            r5 = 0
            r6 = 1
        L_0x000a:
            r20.next()
            java.lang.String r7 = "style"
            boolean r8 = defpackage.fqc.B(r0, r7)
            if (r8 == 0) goto L_0x0057
            java.lang.String r7 = defpackage.fqc.m(r0, r7)
            ztf r8 = new ztf
            r8.<init>()
            ztf r8 = o(r0, r8)
            if (r7 == 0) goto L_0x004a
            java.lang.String r7 = r7.trim()
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L_0x0031
            java.lang.String[] r7 = new java.lang.String[r5]
            goto L_0x0039
        L_0x0031:
            int r9 = defpackage.t0g.a
            java.lang.String r9 = "\\s+"
            java.lang.String[] r7 = r7.split(r9, r4)
        L_0x0039:
            int r9 = r7.length
            r10 = r5
        L_0x003b:
            if (r10 >= r9) goto L_0x004a
            r11 = r7[r10]
            java.lang.Object r11 = r1.get(r11)
            ztf r11 = (defpackage.ztf) r11
            r8.a(r11)
            int r10 = r10 + r6
            goto L_0x003b
        L_0x004a:
            java.lang.String r7 = r8.l
            if (r7 == 0) goto L_0x0051
            r1.put(r7, r8)
        L_0x0051:
            r9 = r24
        L_0x0053:
            r11 = r25
            goto L_0x0251
        L_0x0057:
            java.lang.String r7 = "region"
            boolean r7 = defpackage.fqc.B(r0, r7)
            java.lang.String r8 = "id"
            if (r7 == 0) goto L_0x0224
            java.lang.String r10 = defpackage.fqc.m(r0, r8)
            r7 = 0
            if (r10 != 0) goto L_0x006a
            goto L_0x0219
        L_0x006a:
            java.lang.String r8 = "origin"
            java.lang.String r8 = defpackage.fqc.m(r0, r8)
            if (r8 == 0) goto L_0x0219
            java.util.regex.Pattern r9 = A0
            java.util.regex.Matcher r11 = r9.matcher(r8)
            java.util.regex.Pattern r12 = B0
            java.util.regex.Matcher r13 = r12.matcher(r8)
            boolean r14 = r11.matches()
            java.lang.String r15 = "Ignoring region with missing tts:extent: "
            java.lang.String r4 = "Ignoring region with malformed origin: "
            r16 = 1120403456(0x42c80000, float:100.0)
            if (r14 == 0) goto L_0x00b1
            java.lang.String r13 = r11.group(r6)     // Catch:{ NumberFormatException -> 0x00a6 }
            r13.getClass()     // Catch:{ NumberFormatException -> 0x00a6 }
            float r13 = java.lang.Float.parseFloat(r13)     // Catch:{ NumberFormatException -> 0x00a6 }
            float r13 = r13 / r16
            java.lang.String r11 = r11.group(r3)     // Catch:{ NumberFormatException -> 0x00a6 }
            r11.getClass()     // Catch:{ NumberFormatException -> 0x00a6 }
            float r4 = java.lang.Float.parseFloat(r11)     // Catch:{ NumberFormatException -> 0x00a6 }
            float r4 = r4 / r16
            r11 = r13
            goto L_0x00e5
        L_0x00a6:
            int r9 = r8.length()
            if (r9 == 0) goto L_0x0219
            r4.concat(r8)
            goto L_0x0219
        L_0x00b1:
            boolean r11 = r13.matches()
            if (r11 == 0) goto L_0x020e
            if (r2 != 0) goto L_0x00c4
            int r4 = r8.length()
            if (r4 == 0) goto L_0x0219
            r15.concat(r8)
            goto L_0x0219
        L_0x00c4:
            java.lang.String r11 = r13.group(r6)     // Catch:{ NumberFormatException -> 0x0204 }
            r11.getClass()     // Catch:{ NumberFormatException -> 0x0204 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0204 }
            java.lang.String r13 = r13.group(r3)     // Catch:{ NumberFormatException -> 0x0204 }
            r13.getClass()     // Catch:{ NumberFormatException -> 0x0204 }
            int r13 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x0204 }
            float r11 = (float) r11     // Catch:{ NumberFormatException -> 0x0204 }
            int r14 = r2.b     // Catch:{ NumberFormatException -> 0x0204 }
            float r14 = (float) r14     // Catch:{ NumberFormatException -> 0x0204 }
            float r11 = r11 / r14
            float r13 = (float) r13     // Catch:{ NumberFormatException -> 0x0204 }
            int r4 = r2.c     // Catch:{ NumberFormatException -> 0x0204 }
            float r4 = (float) r4
            float r4 = r13 / r4
        L_0x00e5:
            java.lang.String r13 = "extent"
            java.lang.String r13 = defpackage.fqc.m(r0, r13)
            if (r13 == 0) goto L_0x0201
            java.util.regex.Matcher r9 = r9.matcher(r13)
            java.util.regex.Matcher r12 = r12.matcher(r13)
            boolean r13 = r9.matches()
            java.lang.String r14 = "Ignoring region with malformed extent: "
            if (r13 == 0) goto L_0x0126
            java.lang.String r12 = r9.group(r6)     // Catch:{ NumberFormatException -> 0x011b }
            r12.getClass()     // Catch:{ NumberFormatException -> 0x011b }
            float r12 = java.lang.Float.parseFloat(r12)     // Catch:{ NumberFormatException -> 0x011b }
            float r12 = r12 / r16
            java.lang.String r9 = r9.group(r3)     // Catch:{ NumberFormatException -> 0x011b }
            r9.getClass()     // Catch:{ NumberFormatException -> 0x011b }
            float r7 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x011b }
            float r7 = r7 / r16
            r16 = r7
            r15 = r12
            goto L_0x015c
        L_0x011b:
            int r4 = r8.length()
            if (r4 == 0) goto L_0x0219
            r14.concat(r8)
            goto L_0x0219
        L_0x0126:
            boolean r9 = r12.matches()
            if (r9 == 0) goto L_0x01f3
            if (r2 != 0) goto L_0x0139
            int r4 = r8.length()
            if (r4 == 0) goto L_0x0219
            r15.concat(r8)
            goto L_0x0219
        L_0x0139:
            java.lang.String r9 = r12.group(r6)     // Catch:{ NumberFormatException -> 0x01e7 }
            r9.getClass()     // Catch:{ NumberFormatException -> 0x01e7 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01e7 }
            java.lang.String r12 = r12.group(r3)     // Catch:{ NumberFormatException -> 0x01e7 }
            r12.getClass()     // Catch:{ NumberFormatException -> 0x01e7 }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x01e7 }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x01e7 }
            int r13 = r2.b     // Catch:{ NumberFormatException -> 0x01e7 }
            float r13 = (float) r13     // Catch:{ NumberFormatException -> 0x01e7 }
            float r9 = r9 / r13
            float r12 = (float) r12     // Catch:{ NumberFormatException -> 0x01e7 }
            int r7 = r2.c     // Catch:{ NumberFormatException -> 0x01e7 }
            float r7 = (float) r7
            float r12 = r12 / r7
            r15 = r9
            r16 = r12
        L_0x015c:
            java.lang.String r7 = "displayAlign"
            java.lang.String r7 = defpackage.fqc.m(r0, r7)
            if (r7 == 0) goto L_0x018d
            java.lang.String r7 = defpackage.o54.P(r7)
            r7.getClass()
            java.lang.String r8 = "center"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x0183
            java.lang.String r8 = "after"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x017c
            goto L_0x018d
        L_0x017c:
            float r4 = r4 + r16
            r14 = r3
            r12 = r4
        L_0x0180:
            r4 = r22
            goto L_0x0190
        L_0x0183:
            r7 = 1073741824(0x40000000, float:2.0)
            float r7 = r16 / r7
            float r7 = r7 + r4
            r4 = r22
            r14 = r6
            r12 = r7
            goto L_0x0190
        L_0x018d:
            r12 = r4
            r14 = r5
            goto L_0x0180
        L_0x0190:
            int r7 = r4.b
            float r7 = (float) r7
            r8 = 1065353216(0x3f800000, float:1.0)
            float r18 = r8 / r7
            java.lang.String r7 = "writingMode"
            java.lang.String r7 = defpackage.fqc.m(r0, r7)
            if (r7 == 0) goto L_0x01d9
            java.lang.String r7 = defpackage.o54.P(r7)
            r7.getClass()
            int r8 = r7.hashCode()
            switch(r8) {
                case 3694: goto L_0x01c5;
                case 3553396: goto L_0x01ba;
                case 3553576: goto L_0x01af;
                default: goto L_0x01ad;
            }
        L_0x01ad:
            r7 = -1
            goto L_0x01cf
        L_0x01af:
            java.lang.String r8 = "tbrl"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x01b8
            goto L_0x01ad
        L_0x01b8:
            r7 = r3
            goto L_0x01cf
        L_0x01ba:
            java.lang.String r8 = "tblr"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x01c3
            goto L_0x01ad
        L_0x01c3:
            r7 = r6
            goto L_0x01cf
        L_0x01c5:
            java.lang.String r8 = "tb"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x01ce
            goto L_0x01ad
        L_0x01ce:
            r7 = r5
        L_0x01cf:
            switch(r7) {
                case 0: goto L_0x01d6;
                case 1: goto L_0x01d6;
                case 2: goto L_0x01d3;
                default: goto L_0x01d2;
            }
        L_0x01d2:
            goto L_0x01d9
        L_0x01d3:
            r19 = r6
            goto L_0x01dd
        L_0x01d6:
            r19 = r3
            goto L_0x01dd
        L_0x01d9:
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = r7
        L_0x01dd:
            xtf r7 = new xtf
            r13 = 0
            r17 = 1
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0219
        L_0x01e7:
            r4 = r22
            int r9 = r8.length()
            if (r9 == 0) goto L_0x0219
            r14.concat(r8)
            goto L_0x0219
        L_0x01f3:
            r4 = r22
            int r9 = r8.length()
            if (r9 == 0) goto L_0x0219
            java.lang.String r9 = "Ignoring region with unsupported extent: "
            r9.concat(r8)
            goto L_0x0219
        L_0x0201:
            r4 = r22
            goto L_0x0219
        L_0x0204:
            int r9 = r8.length()
            if (r9 == 0) goto L_0x0219
            r4.concat(r8)
            goto L_0x0219
        L_0x020e:
            int r4 = r8.length()
            if (r4 == 0) goto L_0x0219
            java.lang.String r4 = "Ignoring region with unsupported origin: "
            r4.concat(r8)
        L_0x0219:
            if (r7 == 0) goto L_0x0051
            java.lang.String r4 = r7.a
            r9 = r24
            r9.put(r4, r7)
            goto L_0x0053
        L_0x0224:
            r9 = r24
            java.lang.String r4 = "metadata"
            boolean r7 = defpackage.fqc.B(r0, r4)
            if (r7 == 0) goto L_0x0053
        L_0x022e:
            r20.next()
            java.lang.String r7 = "image"
            boolean r7 = defpackage.fqc.B(r0, r7)
            if (r7 == 0) goto L_0x0249
            java.lang.String r7 = defpackage.fqc.m(r0, r8)
            if (r7 == 0) goto L_0x0249
            java.lang.String r10 = r20.nextText()
            r11 = r25
            r11.put(r7, r10)
            goto L_0x024b
        L_0x0249:
            r11 = r25
        L_0x024b:
            boolean r7 = defpackage.fqc.z(r0, r4)
            if (r7 == 0) goto L_0x022e
        L_0x0251:
            java.lang.String r4 = "head"
            boolean r4 = defpackage.fqc.z(r0, r4)
            if (r4 == 0) goto L_0x025a
            return
        L_0x025a:
            r4 = -1
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttf.m(org.xmlpull.v1.XmlPullParser, java.util.HashMap, jq5, ft, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.utf n(org.xmlpull.v1.XmlPullParser r21, defpackage.utf r22, java.util.HashMap r23, defpackage.aid r24) {
        /*
            r0 = r21
            r11 = r22
            r1 = r24
            r2 = -1
            r3 = 1
            int r4 = r21.getAttributeCount()
            r5 = 0
            ztf r7 = o(r0, r5)
            java.lang.String r6 = ""
            r10 = 0
            r12 = r5
            r14 = r12
            r13 = r6
            r5 = r10
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0027:
            if (r5 >= r4) goto L_0x00c6
            java.lang.String r6 = r0.getAttributeName(r5)
            java.lang.String r8 = r0.getAttributeValue(r5)
            r6.getClass()
            int r9 = r6.hashCode()
            switch(r9) {
                case -934795532: goto L_0x0074;
                case 99841: goto L_0x0069;
                case 100571: goto L_0x005e;
                case 93616297: goto L_0x0053;
                case 109780401: goto L_0x0048;
                case 1292595405: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            r6 = r2
            goto L_0x007e
        L_0x003d:
            java.lang.String r9 = "backgroundImage"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0046
            goto L_0x003b
        L_0x0046:
            r6 = 5
            goto L_0x007e
        L_0x0048:
            java.lang.String r9 = "style"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0051
            goto L_0x003b
        L_0x0051:
            r6 = 4
            goto L_0x007e
        L_0x0053:
            java.lang.String r9 = "begin"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x005c
            goto L_0x003b
        L_0x005c:
            r6 = 3
            goto L_0x007e
        L_0x005e:
            java.lang.String r9 = "end"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0067
            goto L_0x003b
        L_0x0067:
            r6 = 2
            goto L_0x007e
        L_0x0069:
            java.lang.String r9 = "dur"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0072
            goto L_0x003b
        L_0x0072:
            r6 = r3
            goto L_0x007e
        L_0x0074:
            java.lang.String r9 = "region"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x007d
            goto L_0x003b
        L_0x007d:
            r6 = r10
        L_0x007e:
            switch(r6) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x00b5;
                case 2: goto L_0x00b0;
                case 3: goto L_0x00ab;
                case 4: goto L_0x0091;
                case 5: goto L_0x0082;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x008e
        L_0x0082:
            java.lang.String r6 = "#"
            boolean r6 = r8.startsWith(r6)
            if (r6 == 0) goto L_0x008e
            java.lang.String r14 = r8.substring(r3)
        L_0x008e:
            r6 = r23
            goto L_0x00c3
        L_0x0091:
            java.lang.String r6 = r8.trim()
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x009e
            java.lang.String[] r6 = new java.lang.String[r10]
            goto L_0x00a6
        L_0x009e:
            int r8 = defpackage.t0g.a
            java.lang.String r8 = "\\s+"
            java.lang.String[] r6 = r6.split(r8, r2)
        L_0x00a6:
            int r8 = r6.length
            if (r8 <= 0) goto L_0x008e
            r12 = r6
            goto L_0x008e
        L_0x00ab:
            long r15 = p(r8, r1)
            goto L_0x008e
        L_0x00b0:
            long r17 = p(r8, r1)
            goto L_0x008e
        L_0x00b5:
            long r19 = p(r8, r1)
            goto L_0x008e
        L_0x00ba:
            r6 = r23
            boolean r9 = r6.containsKey(r8)
            if (r9 == 0) goto L_0x00c3
            r13 = r8
        L_0x00c3:
            int r5 = r5 + r3
            goto L_0x0027
        L_0x00c6:
            if (r11 == 0) goto L_0x00df
            long r1 = r11.d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00e4
            int r5 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00d8
            long r15 = r15 + r1
        L_0x00d8:
            int r5 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00e4
            long r17 = r17 + r1
            goto L_0x00e4
        L_0x00df:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e4:
            int r1 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x00fb
            int r1 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00f1
            long r19 = r15 + r19
            r5 = r19
            goto L_0x00fd
        L_0x00f1:
            if (r11 == 0) goto L_0x00fb
            long r1 = r11.e
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00fb
            r5 = r1
            goto L_0x00fd
        L_0x00fb:
            r5 = r17
        L_0x00fd:
            java.lang.String r1 = r21.getName()
            utf r17 = new utf
            r2 = 0
            r0 = r17
            r3 = r15
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r22
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttf.n(org.xmlpull.v1.XmlPullParser, utf, java.util.HashMap, aid):utf");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: iff} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: android.text.Layout$Alignment} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r12v15, types: [iff] */
    /* JADX WARNING: type inference failed for: r11v69, types: [iff] */
    /* JADX WARNING: type inference failed for: r12v20, types: [iff] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02ed, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02f1, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0436, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x04c9, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0544, code lost:
        r14 = r14 + r11;
        r1 = r19;
        r11 = r15;
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0142, code lost:
        r18 = r3;
        r15 = r11;
        r11 = 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ztf o(org.xmlpull.v1.XmlPullParser r19, defpackage.ztf r20) {
        /*
            r1 = r19
            java.lang.String r2 = "none"
            java.lang.String r3 = "after"
            java.lang.String r4 = "before"
            java.lang.String r5 = "start"
            java.lang.String r6 = "right"
            java.lang.String r7 = "left"
            java.lang.String r8 = "end"
            java.lang.String r9 = "center"
            int r10 = r19.getAttributeCount()
            r11 = 0
            r0 = r20
            r14 = r11
        L_0x001a:
            if (r14 >= r10) goto L_0x054c
            java.lang.String r12 = r1.getAttributeValue(r14)
            java.lang.String r13 = r1.getAttributeName(r14)
            r13.getClass()
            r16 = 0
            int r17 = r13.hashCode()
            switch(r17) {
                case -1550943582: goto L_0x00df;
                case -1224696685: goto L_0x00d3;
                case -1065511464: goto L_0x00c7;
                case -879295043: goto L_0x00bb;
                case -734428249: goto L_0x00af;
                case 3355: goto L_0x00a4;
                case 3511770: goto L_0x0099;
                case 94842723: goto L_0x008e;
                case 109403361: goto L_0x0081;
                case 110138194: goto L_0x0074;
                case 365601008: goto L_0x0067;
                case 921125321: goto L_0x005a;
                case 1115953443: goto L_0x004d;
                case 1287124693: goto L_0x0040;
                case 1754920356: goto L_0x0033;
                default: goto L_0x0030;
            }
        L_0x0030:
            r13 = -1
            goto L_0x00ea
        L_0x0033:
            java.lang.String r15 = "multiRowAlign"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x003c
            goto L_0x0030
        L_0x003c:
            r13 = 14
            goto L_0x00ea
        L_0x0040:
            java.lang.String r15 = "backgroundColor"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x0049
            goto L_0x0030
        L_0x0049:
            r13 = 13
            goto L_0x00ea
        L_0x004d:
            java.lang.String r15 = "rubyPosition"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x0056
            goto L_0x0030
        L_0x0056:
            r13 = 12
            goto L_0x00ea
        L_0x005a:
            java.lang.String r15 = "textEmphasis"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x0063
            goto L_0x0030
        L_0x0063:
            r13 = 11
            goto L_0x00ea
        L_0x0067:
            java.lang.String r15 = "fontSize"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x0070
            goto L_0x0030
        L_0x0070:
            r13 = 10
            goto L_0x00ea
        L_0x0074:
            java.lang.String r15 = "textCombine"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x007d
            goto L_0x0030
        L_0x007d:
            r13 = 9
            goto L_0x00ea
        L_0x0081:
            java.lang.String r15 = "shear"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x008a
            goto L_0x0030
        L_0x008a:
            r13 = 8
            goto L_0x00ea
        L_0x008e:
            java.lang.String r15 = "color"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x0097
            goto L_0x0030
        L_0x0097:
            r13 = 7
            goto L_0x00ea
        L_0x0099:
            java.lang.String r15 = "ruby"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x00a2
            goto L_0x0030
        L_0x00a2:
            r13 = 6
            goto L_0x00ea
        L_0x00a4:
            java.lang.String r15 = "id"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x00ad
            goto L_0x0030
        L_0x00ad:
            r13 = 5
            goto L_0x00ea
        L_0x00af:
            java.lang.String r15 = "fontWeight"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x00b9
            goto L_0x0030
        L_0x00b9:
            r13 = 4
            goto L_0x00ea
        L_0x00bb:
            java.lang.String r15 = "textDecoration"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x00c5
            goto L_0x0030
        L_0x00c5:
            r13 = 3
            goto L_0x00ea
        L_0x00c7:
            java.lang.String r15 = "textAlign"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x00d1
            goto L_0x0030
        L_0x00d1:
            r13 = 2
            goto L_0x00ea
        L_0x00d3:
            java.lang.String r15 = "fontFamily"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x00dd
            goto L_0x0030
        L_0x00dd:
            r13 = 1
            goto L_0x00ea
        L_0x00df:
            java.lang.String r15 = "fontStyle"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x00e9
            goto L_0x0030
        L_0x00e9:
            r13 = r11
        L_0x00ea:
            switch(r13) {
                case 0: goto L_0x0531;
                case 1: goto L_0x0524;
                case 2: goto L_0x04cc;
                case 3: goto L_0x0463;
                case 4: goto L_0x0451;
                case 5: goto L_0x0439;
                case 6: goto L_0x03b6;
                case 7: goto L_0x0393;
                case 8: goto L_0x0336;
                case 9: goto L_0x030e;
                case 10: goto L_0x02f4;
                case 11: goto L_0x018d;
                case 12: goto L_0x0169;
                case 13: goto L_0x014b;
                case 14: goto L_0x00f1;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            r18 = r3
            goto L_0x040c
        L_0x00f1:
            ztf r0 = g(r0)
            java.lang.String r12 = defpackage.o54.P(r12)
            r12.getClass()
            int r13 = r12.hashCode()
            switch(r13) {
                case -1364013995: goto L_0x0129;
                case 100571: goto L_0x0120;
                case 3317767: goto L_0x0117;
                case 108511772: goto L_0x010e;
                case 109757538: goto L_0x0105;
                default: goto L_0x0103;
            }
        L_0x0103:
            r12 = -1
            goto L_0x0131
        L_0x0105:
            boolean r12 = r12.equals(r5)
            if (r12 != 0) goto L_0x010c
            goto L_0x0103
        L_0x010c:
            r12 = 4
            goto L_0x0131
        L_0x010e:
            boolean r12 = r12.equals(r6)
            if (r12 != 0) goto L_0x0115
            goto L_0x0103
        L_0x0115:
            r12 = 3
            goto L_0x0131
        L_0x0117:
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L_0x011e
            goto L_0x0103
        L_0x011e:
            r12 = 2
            goto L_0x0131
        L_0x0120:
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L_0x0127
            goto L_0x0103
        L_0x0127:
            r12 = 1
            goto L_0x0131
        L_0x0129:
            boolean r12 = r12.equals(r9)
            if (r12 != 0) goto L_0x0130
            goto L_0x0103
        L_0x0130:
            r12 = r11
        L_0x0131:
            switch(r12) {
                case 0: goto L_0x013d;
                case 1: goto L_0x013a;
                case 2: goto L_0x0137;
                case 3: goto L_0x013a;
                case 4: goto L_0x0137;
                default: goto L_0x0134;
            }
        L_0x0134:
            r12 = r16
            goto L_0x0140
        L_0x0137:
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x0134
        L_0x013a:
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0134
        L_0x013d:
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0134
        L_0x0140:
            r0.p = r12
        L_0x0142:
            r18 = r3
            r15 = r11
            r1 = 4
            r3 = 2
            r11 = 1
            r13 = 3
            goto L_0x0544
        L_0x014b:
            ztf r0 = g(r0)
            int r13 = defpackage.n53.a(r12, r11)     // Catch:{ IllegalArgumentException -> 0x0159 }
            r0.d = r13     // Catch:{ IllegalArgumentException -> 0x0159 }
            r13 = 1
            r0.e = r13     // Catch:{ IllegalArgumentException -> 0x0159 }
            goto L_0x0142
        L_0x0159:
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r13 = r12.length()
            if (r13 == 0) goto L_0x0142
            java.lang.String r13 = "Failed parsing background value: "
            r13.concat(r12)
            goto L_0x0142
        L_0x0169:
            java.lang.String r12 = defpackage.o54.P(r12)
            r12.getClass()
            boolean r13 = r12.equals(r4)
            if (r13 != 0) goto L_0x0185
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L_0x017d
            goto L_0x0142
        L_0x017d:
            ztf r0 = g(r0)
            r12 = 2
            r0.n = r12
            goto L_0x0142
        L_0x0185:
            ztf r0 = g(r0)
            r12 = 1
            r0.n = r12
            goto L_0x0142
        L_0x018d:
            ztf r0 = g(r0)
            java.util.regex.Pattern r13 = defpackage.iff.d
            if (r12 != 0) goto L_0x019b
        L_0x0195:
            r18 = r3
        L_0x0197:
            r1 = r16
            goto L_0x02eb
        L_0x019b:
            java.lang.String r12 = r12.trim()
            java.lang.String r12 = defpackage.o54.P(r12)
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L_0x01aa
            goto L_0x0195
        L_0x01aa:
            java.util.regex.Pattern r13 = defpackage.iff.d
            java.lang.String[] r12 = android.text.TextUtils.split(r12, r13)
            int r13 = r12.length
            if (r13 == 0) goto L_0x01cb
            r15 = 1
            if (r13 == r15) goto L_0x01c2
            int r13 = r12.length
            java.lang.Object r12 = r12.clone()
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            dc7 r12 = defpackage.dc7.o(r13, r12)
            goto L_0x01cd
        L_0x01c2:
            r12 = r12[r11]
            mde r13 = new mde
            r13.<init>(r12)
            r12 = r13
            goto L_0x01cd
        L_0x01cb:
            q0d r12 = defpackage.q0d.X
        L_0x01cd:
            dc7 r13 = defpackage.iff.h
            xxd r13 = defpackage.ryg.E(r13, r12)
            java.lang.String r15 = "outside"
            java.lang.Object r13 = defpackage.b0h.v(r13, r15)
            java.lang.String r13 = (java.lang.String) r13
            int r11 = r13.hashCode()
            r1 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            if (r11 == r1) goto L_0x01ff
            r1 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            if (r11 == r1) goto L_0x01f7
            r1 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r11 == r1) goto L_0x01ef
            goto L_0x0207
        L_0x01ef:
            boolean r1 = r13.equals(r3)
            if (r1 == 0) goto L_0x0207
            r1 = 0
            goto L_0x0208
        L_0x01f7:
            boolean r1 = r13.equals(r15)
            if (r1 == 0) goto L_0x0207
            r1 = 1
            goto L_0x0208
        L_0x01ff:
            boolean r1 = r13.equals(r4)
            if (r1 == 0) goto L_0x0207
            r1 = 2
            goto L_0x0208
        L_0x0207:
            r1 = -1
        L_0x0208:
            if (r1 == 0) goto L_0x0211
            r11 = 1
            if (r1 == r11) goto L_0x020f
            r1 = 1
            goto L_0x0212
        L_0x020f:
            r1 = -2
            goto L_0x0212
        L_0x0211:
            r1 = 2
        L_0x0212:
            dc7 r11 = defpackage.iff.e
            xxd r11 = defpackage.ryg.E(r11, r12)
            boolean r13 = r11.isEmpty()
            if (r13 != 0) goto L_0x0253
            em7 r12 = new em7
            r12.<init>(r11)
            java.lang.Object r11 = r12.next()
            java.lang.String r11 = (java.lang.String) r11
            int r12 = r11.hashCode()
            r13 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r12 == r13) goto L_0x0240
            r13 = 3387192(0x33af38, float:4.746467E-39)
            if (r12 == r13) goto L_0x0238
            goto L_0x0246
        L_0x0238:
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L_0x0246
            r11 = 0
            goto L_0x0247
        L_0x0240:
            java.lang.String r12 = "auto"
            boolean r11 = r11.equals(r12)
        L_0x0246:
            r11 = -1
        L_0x0247:
            iff r12 = new iff
            r13 = 0
            r12.<init>(r11, r13, r1)
            r18 = r3
        L_0x024f:
            r16 = r12
            goto L_0x0197
        L_0x0253:
            r13 = 0
            dc7 r11 = defpackage.iff.g
            xxd r11 = defpackage.ryg.E(r11, r12)
            dc7 r15 = defpackage.iff.f
            xxd r12 = defpackage.ryg.E(r15, r12)
            boolean r15 = r11.isEmpty()
            if (r15 == 0) goto L_0x0278
            boolean r15 = r12.isEmpty()
            if (r15 == 0) goto L_0x0278
            iff r11 = new iff
            r15 = -1
            r11.<init>(r15, r13, r1)
            r18 = r3
            r16 = r11
            goto L_0x0197
        L_0x0278:
            r15 = -1
            java.lang.String r13 = "filled"
            java.lang.Object r11 = defpackage.b0h.v(r11, r13)
            java.lang.String r11 = (java.lang.String) r11
            int r15 = r11.hashCode()
            r18 = r3
            r3 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r15 == r3) goto L_0x029c
            r3 = 3417674(0x34264a, float:4.789181E-39)
            if (r15 == r3) goto L_0x0292
            goto L_0x02a0
        L_0x0292:
            java.lang.String r3 = "open"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x02a0
            r3 = 2
            goto L_0x02a1
        L_0x029c:
            boolean r3 = r11.equals(r13)
        L_0x02a0:
            r3 = 1
        L_0x02a1:
            java.lang.String r11 = "circle"
            java.lang.Object r12 = defpackage.b0h.v(r12, r11)
            java.lang.String r12 = (java.lang.String) r12
            int r13 = r12.hashCode()
            r15 = -1360216880(0xffffffffaeecbcd0, float:-1.0765577E-10)
            if (r13 == r15) goto L_0x02d1
            r11 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r13 == r11) goto L_0x02c7
            r11 = 99657(0x18549, float:1.39649E-40)
            if (r13 == r11) goto L_0x02bd
            goto L_0x02d9
        L_0x02bd:
            java.lang.String r11 = "dot"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x02d9
            r11 = 0
            goto L_0x02da
        L_0x02c7:
            java.lang.String r11 = "sesame"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x02d9
            r11 = 1
            goto L_0x02da
        L_0x02d1:
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x02d9
            r11 = 2
            goto L_0x02da
        L_0x02d9:
            r11 = -1
        L_0x02da:
            if (r11 == 0) goto L_0x02e3
            r12 = 1
            if (r11 == r12) goto L_0x02e1
            r11 = 1
            goto L_0x02e4
        L_0x02e1:
            r11 = 3
            goto L_0x02e4
        L_0x02e3:
            r11 = 2
        L_0x02e4:
            iff r12 = new iff
            r12.<init>(r11, r3, r1)
            goto L_0x024f
        L_0x02eb:
            r0.r = r1
        L_0x02ed:
            r1 = 4
            r3 = 2
            r11 = 1
            r13 = 3
        L_0x02f1:
            r15 = 0
            goto L_0x0544
        L_0x02f4:
            r18 = r3
            ztf r0 = g(r0)     // Catch:{ SubtitleDecoderException -> 0x02fe }
            j(r12, r0)     // Catch:{ SubtitleDecoderException -> 0x02fe }
            goto L_0x02ed
        L_0x02fe:
            java.lang.String r1 = java.lang.String.valueOf(r12)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x02ed
            java.lang.String r3 = "Failed parsing fontSize value: "
            r3.concat(r1)
            goto L_0x02ed
        L_0x030e:
            r18 = r3
            java.lang.String r1 = defpackage.o54.P(r12)
            r1.getClass()
            java.lang.String r3 = "all"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x032e
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0326
            goto L_0x02ed
        L_0x0326:
            ztf r0 = g(r0)
            r1 = 0
            r0.q = r1
            goto L_0x02ed
        L_0x032e:
            ztf r0 = g(r0)
            r1 = 1
            r0.q = r1
            goto L_0x02ed
        L_0x0336:
            r18 = r3
            ztf r1 = g(r0)
            java.util.regex.Pattern r0 = z0
            java.util.regex.Matcher r0 = r0.matcher(r12)
            boolean r3 = r0.matches()
            r11 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r3 != 0) goto L_0x035b
            java.lang.String r0 = java.lang.String.valueOf(r12)
            int r3 = r0.length()
            if (r3 == 0) goto L_0x038e
            java.lang.String r3 = "Invalid value for shear: "
            r3.concat(r0)
            goto L_0x038e
        L_0x035b:
            r3 = 1
            java.lang.String r0 = r0.group(r3)     // Catch:{ NumberFormatException -> 0x0374 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0374 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0374 }
            r3 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r0 = java.lang.Math.max(r3, r0)     // Catch:{ NumberFormatException -> 0x0374 }
            r3 = 1120403456(0x42c80000, float:100.0)
            float r11 = java.lang.Math.min(r3, r0)     // Catch:{ NumberFormatException -> 0x0374 }
            goto L_0x038e
        L_0x0374:
            r0 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r12)
            int r12 = r3.length()
            java.lang.String r13 = "Failed to parse shear: "
            if (r12 == 0) goto L_0x0386
            java.lang.String r3 = r13.concat(r3)
            goto L_0x038b
        L_0x0386:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r13)
        L_0x038b:
            defpackage.iq.a(r3, r0)
        L_0x038e:
            r1.s = r11
            r0 = r1
            goto L_0x02ed
        L_0x0393:
            r18 = r3
            ztf r0 = g(r0)
            r1 = 0
            int r3 = defpackage.n53.a(r12, r1)     // Catch:{ IllegalArgumentException -> 0x03a5 }
            r0.b = r3     // Catch:{ IllegalArgumentException -> 0x03a5 }
            r1 = 1
            r0.c = r1     // Catch:{ IllegalArgumentException -> 0x03a5 }
            goto L_0x02ed
        L_0x03a5:
            java.lang.String r1 = java.lang.String.valueOf(r12)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x02ed
            java.lang.String r3 = "Failed parsing color value: "
            r3.concat(r1)
            goto L_0x02ed
        L_0x03b6:
            r18 = r3
            java.lang.String r1 = defpackage.o54.P(r12)
            r1.getClass()
            int r3 = r1.hashCode()
            switch(r3) {
                case -618561360: goto L_0x03ff;
                case -410956671: goto L_0x03f4;
                case -250518009: goto L_0x03e9;
                case -136074796: goto L_0x03de;
                case 3016401: goto L_0x03d3;
                case 3556653: goto L_0x03c8;
                default: goto L_0x03c6;
            }
        L_0x03c6:
            r1 = -1
            goto L_0x0409
        L_0x03c8:
            java.lang.String r3 = "text"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03d1
            goto L_0x03c6
        L_0x03d1:
            r1 = 5
            goto L_0x0409
        L_0x03d3:
            java.lang.String r3 = "base"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03dc
            goto L_0x03c6
        L_0x03dc:
            r1 = 4
            goto L_0x0409
        L_0x03de:
            java.lang.String r3 = "textContainer"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03e7
            goto L_0x03c6
        L_0x03e7:
            r1 = 3
            goto L_0x0409
        L_0x03e9:
            java.lang.String r3 = "delimiter"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03f2
            goto L_0x03c6
        L_0x03f2:
            r1 = 2
            goto L_0x0409
        L_0x03f4:
            java.lang.String r3 = "container"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03fd
            goto L_0x03c6
        L_0x03fd:
            r1 = 1
            goto L_0x0409
        L_0x03ff:
            java.lang.String r3 = "baseContainer"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0408
            goto L_0x03c6
        L_0x0408:
            r1 = 0
        L_0x0409:
            switch(r1) {
                case 0: goto L_0x042d;
                case 1: goto L_0x0423;
                case 2: goto L_0x041a;
                case 3: goto L_0x0410;
                case 4: goto L_0x042d;
                case 5: goto L_0x0410;
                default: goto L_0x040c;
            }
        L_0x040c:
            r1 = 4
            r3 = 2
            r13 = 3
            goto L_0x0436
        L_0x0410:
            ztf r0 = g(r0)
            r13 = 3
            r0.m = r13
            r1 = 4
        L_0x0418:
            r3 = 2
            goto L_0x0436
        L_0x041a:
            r13 = 3
            ztf r0 = g(r0)
            r1 = 4
            r0.m = r1
            goto L_0x0418
        L_0x0423:
            r1 = 4
            r13 = 3
            ztf r0 = g(r0)
            r3 = 1
            r0.m = r3
            goto L_0x0418
        L_0x042d:
            r1 = 4
            r13 = 3
            ztf r0 = g(r0)
            r3 = 2
            r0.m = r3
        L_0x0436:
            r11 = 1
            goto L_0x02f1
        L_0x0439:
            r18 = r3
            r1 = 4
            r3 = 2
            r13 = 3
            java.lang.String r11 = "style"
            java.lang.String r15 = r19.getName()
            boolean r11 = r11.equals(r15)
            if (r11 == 0) goto L_0x0436
            ztf r0 = g(r0)
            r0.l = r12
            goto L_0x0436
        L_0x0451:
            r18 = r3
            r1 = 4
            r3 = 2
            r13 = 3
            ztf r0 = g(r0)
            java.lang.String r11 = "bold"
            boolean r11 = r11.equalsIgnoreCase(r12)
            r0.h = r11
            goto L_0x0436
        L_0x0463:
            r18 = r3
            r1 = 4
            r3 = 2
            r13 = 3
            java.lang.String r11 = defpackage.o54.P(r12)
            r11.getClass()
            int r12 = r11.hashCode()
            switch(r12) {
                case -1461280213: goto L_0x0499;
                case -1026963764: goto L_0x048e;
                case 913457136: goto L_0x0483;
                case 1679736913: goto L_0x0478;
                default: goto L_0x0476;
            }
        L_0x0476:
            r11 = -1
            goto L_0x04a3
        L_0x0478:
            java.lang.String r12 = "linethrough"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0481
            goto L_0x0476
        L_0x0481:
            r11 = r13
            goto L_0x04a3
        L_0x0483:
            java.lang.String r12 = "nolinethrough"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x048c
            goto L_0x0476
        L_0x048c:
            r11 = r3
            goto L_0x04a3
        L_0x048e:
            java.lang.String r12 = "underline"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0497
            goto L_0x0476
        L_0x0497:
            r11 = 1
            goto L_0x04a3
        L_0x0499:
            java.lang.String r12 = "nounderline"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x04a2
            goto L_0x0476
        L_0x04a2:
            r11 = 0
        L_0x04a3:
            switch(r11) {
                case 0: goto L_0x04c2;
                case 1: goto L_0x04b9;
                case 2: goto L_0x04b0;
                case 3: goto L_0x04a8;
                default: goto L_0x04a6;
            }
        L_0x04a6:
            r15 = 0
            goto L_0x04c9
        L_0x04a8:
            ztf r0 = g(r0)
            r11 = 1
            r0.f = r11
            goto L_0x04a6
        L_0x04b0:
            r11 = 1
            ztf r0 = g(r0)
            r15 = 0
            r0.f = r15
            goto L_0x04c9
        L_0x04b9:
            r11 = 1
            r15 = 0
            ztf r0 = g(r0)
            r0.g = r11
            goto L_0x04c9
        L_0x04c2:
            r15 = 0
            ztf r0 = g(r0)
            r0.g = r15
        L_0x04c9:
            r11 = 1
            goto L_0x0544
        L_0x04cc:
            r18 = r3
            r15 = r11
            r1 = 4
            r3 = 2
            r13 = 3
            ztf r0 = g(r0)
            java.lang.String r11 = defpackage.o54.P(r12)
            r11.getClass()
            int r12 = r11.hashCode()
            switch(r12) {
                case -1364013995: goto L_0x050a;
                case 100571: goto L_0x0501;
                case 3317767: goto L_0x04f8;
                case 108511772: goto L_0x04ef;
                case 109757538: goto L_0x04e6;
                default: goto L_0x04e4;
            }
        L_0x04e4:
            r11 = -1
            goto L_0x0512
        L_0x04e6:
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x04ed
            goto L_0x04e4
        L_0x04ed:
            r11 = r1
            goto L_0x0512
        L_0x04ef:
            boolean r11 = r11.equals(r6)
            if (r11 != 0) goto L_0x04f6
            goto L_0x04e4
        L_0x04f6:
            r11 = r13
            goto L_0x0512
        L_0x04f8:
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x04ff
            goto L_0x04e4
        L_0x04ff:
            r11 = r3
            goto L_0x0512
        L_0x0501:
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x0508
            goto L_0x04e4
        L_0x0508:
            r11 = 1
            goto L_0x0512
        L_0x050a:
            boolean r11 = r11.equals(r9)
            if (r11 != 0) goto L_0x0511
            goto L_0x04e4
        L_0x0511:
            r11 = r15
        L_0x0512:
            switch(r11) {
                case 0: goto L_0x051e;
                case 1: goto L_0x051b;
                case 2: goto L_0x0518;
                case 3: goto L_0x051b;
                case 4: goto L_0x0518;
                default: goto L_0x0515;
            }
        L_0x0515:
            r11 = r16
            goto L_0x0521
        L_0x0518:
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x0515
        L_0x051b:
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0515
        L_0x051e:
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0515
        L_0x0521:
            r0.o = r11
            goto L_0x04c9
        L_0x0524:
            r18 = r3
            r15 = r11
            r1 = 4
            r3 = 2
            r13 = 3
            ztf r0 = g(r0)
            r0.a = r12
            goto L_0x04c9
        L_0x0531:
            r18 = r3
            r15 = r11
            r1 = 4
            r3 = 2
            r13 = 3
            ztf r0 = g(r0)
            java.lang.String r11 = "italic"
            boolean r11 = r11.equalsIgnoreCase(r12)
            r0.i = r11
            goto L_0x04c9
        L_0x0544:
            int r14 = r14 + r11
            r1 = r19
            r11 = r15
            r3 = r18
            goto L_0x001a
        L_0x054c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttf.o(org.xmlpull.v1.XmlPullParser, ztf):ztf");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a9, code lost:
        if (r13.equals("ms") == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e0, code lost:
        r8 = r8 / r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e8, code lost:
        r8 = r8 * r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long p(java.lang.String r13, defpackage.aid r14) {
        /*
            r0 = 4
            r1 = 3
            java.util.regex.Pattern r2 = w0
            java.util.regex.Matcher r2 = r2.matcher(r13)
            boolean r3 = r2.matches()
            r4 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x007b
            java.lang.String r13 = r2.group(r7)
            r13.getClass()
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r2.group(r6)
            r13.getClass()
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r2.group(r1)
            r13.getClass()
            long r9 = java.lang.Long.parseLong(r13)
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r2.group(r0)
            r0 = 0
            if (r13 == 0) goto L_0x004e
            double r9 = java.lang.Double.parseDouble(r13)
            goto L_0x004f
        L_0x004e:
            r9 = r0
        L_0x004f:
            double r7 = r7 + r9
            r13 = 5
            java.lang.String r13 = r2.group(r13)
            if (r13 == 0) goto L_0x0061
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r3 = r14.a
            float r13 = r13 / r3
            double r9 = (double) r13
            goto L_0x0062
        L_0x0061:
            r9 = r0
        L_0x0062:
            double r7 = r7 + r9
            r13 = 6
            java.lang.String r13 = r2.group(r13)
            if (r13 == 0) goto L_0x0077
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.b
            double r2 = (double) r13
            double r0 = r0 / r2
            float r13 = r14.a
            double r13 = (double) r13
            double r0 = r0 / r13
        L_0x0077:
            double r7 = r7 + r0
            double r7 = r7 * r4
            long r13 = (long) r7
            return r13
        L_0x007b:
            java.util.regex.Pattern r2 = x0
            java.util.regex.Matcher r2 = r2.matcher(r13)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L_0x00f7
            java.lang.String r13 = r2.group(r7)
            r13.getClass()
            double r8 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r2.group(r6)
            r13.getClass()
            r2 = -1
            int r3 = r13.hashCode()
            switch(r3) {
                case 102: goto L_0x00cd;
                case 104: goto L_0x00c2;
                case 109: goto L_0x00b7;
                case 116: goto L_0x00ac;
                case 3494: goto L_0x00a3;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            r0 = r2
            goto L_0x00d7
        L_0x00a3:
            java.lang.String r1 = "ms"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00d7
            goto L_0x00a1
        L_0x00ac:
            java.lang.String r0 = "t"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00b5
            goto L_0x00a1
        L_0x00b5:
            r0 = r1
            goto L_0x00d7
        L_0x00b7:
            java.lang.String r0 = "m"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00c0
            goto L_0x00a1
        L_0x00c0:
            r0 = r6
            goto L_0x00d7
        L_0x00c2:
            java.lang.String r0 = "h"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00cb
            goto L_0x00a1
        L_0x00cb:
            r0 = r7
            goto L_0x00d7
        L_0x00cd:
            java.lang.String r0 = "f"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00d6
            goto L_0x00a1
        L_0x00d6:
            r0 = 0
        L_0x00d7:
            switch(r0) {
                case 0: goto L_0x00f0;
                case 1: goto L_0x00ea;
                case 2: goto L_0x00e6;
                case 3: goto L_0x00e2;
                case 4: goto L_0x00db;
                default: goto L_0x00da;
            }
        L_0x00da:
            goto L_0x00f4
        L_0x00db:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x00e0:
            double r8 = r8 / r13
            goto L_0x00f4
        L_0x00e2:
            int r13 = r14.c
            double r13 = (double) r13
            goto L_0x00e0
        L_0x00e6:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
        L_0x00e8:
            double r8 = r8 * r13
            goto L_0x00f4
        L_0x00ea:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            goto L_0x00e8
        L_0x00f0:
            float r13 = r14.a
            double r13 = (double) r13
            goto L_0x00e0
        L_0x00f4:
            double r8 = r8 * r4
            long r13 = (long) r8
            return r13
        L_0x00f7:
            com.google.android.exoplayer2.text.SubtitleDecoderException r14 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r0 = r13.length()
            java.lang.String r1 = "Malformed time expression: "
            if (r0 == 0) goto L_0x010a
            java.lang.String r13 = r1.concat(r13)
            goto L_0x010f
        L_0x010a:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r1)
        L_0x010f:
            r14.<init>(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttf.p(java.lang.String, aid):long");
    }

    public static ft q(XmlPullParser xmlPullParser) {
        String m = fqc.m(xmlPullParser, "extent");
        if (m == null) {
            return null;
        }
        Matcher matcher = B0.matcher(m);
        if (!matcher.matches()) {
            if (m.length() != 0) {
                "Ignoring non-pixel tts extent: ".concat(m);
            }
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new ft(parseInt, Integer.parseInt(group2), 10);
        } catch (NumberFormatException unused) {
            if (m.length() != 0) {
                "Ignoring malformed tts extent: ".concat(m);
            }
            return null;
        }
    }

    public final uye a(int i, byte[] bArr, boolean z) {
        aid aid;
        try {
            XmlPullParser newPullParser = this.v0.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new xtf("", -3.4028235E38f, -3.4028235E38f, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, IntCompanionObject.MIN_VALUE, -3.4028235E38f, IntCompanionObject.MIN_VALUE));
            ft ftVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            aid aid2 = D0;
            jq5 jq5 = E0;
            int i2 = 0;
            soc soc = null;
            jq5 jq52 = jq5;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                utf utf = (utf) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aid2 = k(newPullParser);
                            jq52 = i(newPullParser, jq5);
                            ftVar = q(newPullParser);
                        }
                        jq5 jq53 = jq52;
                        ft ftVar2 = ftVar;
                        aid aid3 = aid2;
                        if (!h(name)) {
                            String valueOf = String.valueOf(newPullParser.getName());
                            if (valueOf.length() != 0) {
                                "Ignoring unsupported tag: ".concat(valueOf);
                            }
                            i2++;
                            aid2 = aid3;
                        } else {
                            if ("head".equals(name)) {
                                aid = aid3;
                                m(newPullParser, hashMap, jq53, ftVar2, hashMap2, hashMap3);
                            } else {
                                aid = aid3;
                                try {
                                    utf n = n(newPullParser, utf, hashMap2, aid);
                                    arrayDeque.push(n);
                                    if (utf != null) {
                                        if (utf.m == null) {
                                            utf.m = new ArrayList();
                                        }
                                        utf.m.add(n);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    iq.a("Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            aid2 = aid;
                        }
                        jq52 = jq53;
                        ftVar = ftVar2;
                    } else if (eventType == 4) {
                        utf.getClass();
                        utf a = utf.a(newPullParser.getText());
                        if (utf.m == null) {
                            utf.m = new ArrayList();
                        }
                        utf.m.add(a);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            utf utf2 = (utf) arrayDeque.peek();
                            utf2.getClass();
                            soc = new soc(utf2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (soc != null) {
                return soc;
            }
            throw new Exception("No TTML subtitles found");
        } catch (XmlPullParserException e2) {
            throw new Exception("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }
}
