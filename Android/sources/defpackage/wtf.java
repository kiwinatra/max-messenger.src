package defpackage;

import androidx.media3.extractor.text.SubtitleDecoderException;
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

/* renamed from: wtf  reason: default package */
public final class wtf implements ize {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern o = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern v = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern w = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern x = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern y = Pattern.compile("^(\\d+) (\\d+)$");
    public static final aid z = new aid(1, 30.0f, 1);
    public final XmlPullParserFactory a;

    public wtf() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static auf a(auf auf) {
        return auf == null ? new auf() : auf;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = y.matcher(attributeValue);
        if (!matcher.matches()) {
            i8b.V("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z2 = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z2 = false;
            }
            n79.f("Invalid cell resolution " + parseInt + " " + parseInt2, z2);
            return parseInt2;
        } catch (NumberFormatException unused) {
            i8b.V("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, auf auf) {
        Matcher matcher;
        char c2 = 65535;
        int i = v0g.a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = o;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            i8b.V("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(wj6.l(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            switch (group.hashCode()) {
                case LangUtils.HASH_OFFSET /*37*/:
                    if (group.equals("%")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    auf.j = 3;
                    break;
                case 1:
                    auf.j = 2;
                    break;
                case 2:
                    auf.j = 1;
                    break;
                default:
                    throw new Exception(wj6.k("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            auf.k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(wj6.k("Invalid expression for fontSize: '", str, "'."));
    }

    public static aid e(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i = v0g.a;
            String[] split = attributeValue2.split(" ", -1);
            n79.f("frameRateMultiplier doesn't have 2 parts", split.length == 2);
            f = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
        } else {
            f = 1.0f;
        }
        aid aid = z;
        int i2 = aid.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new aid(i2, ((float) parseInt) * f, attributeValue4 != null ? Integer.parseInt(attributeValue4) : aid.c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x024b A[LOOP:0: B:1:0x000a->B:104:0x024b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x024a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0192  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, defpackage.ft r23, java.util.HashMap r24, java.util.HashMap r25) {
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
            boolean r8 = defpackage.y7e.K(r0, r7)
            if (r8 == 0) goto L_0x0057
            java.lang.String r7 = defpackage.y7e.q(r0, r7)
            auf r8 = new auf
            r8.<init>()
            auf r8 = i(r0, r8)
            if (r7 == 0) goto L_0x004a
            java.lang.String r7 = r7.trim()
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L_0x0031
            java.lang.String[] r7 = new java.lang.String[r5]
            goto L_0x0039
        L_0x0031:
            int r9 = defpackage.v0g.a
            java.lang.String r9 = "\\s+"
            java.lang.String[] r7 = r7.split(r9, r4)
        L_0x0039:
            int r9 = r7.length
            r10 = r5
        L_0x003b:
            if (r10 >= r9) goto L_0x004a
            r11 = r7[r10]
            java.lang.Object r11 = r1.get(r11)
            auf r11 = (defpackage.auf) r11
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
            goto L_0x0242
        L_0x0057:
            java.lang.String r7 = "region"
            boolean r7 = defpackage.y7e.K(r0, r7)
            java.lang.String r8 = "id"
            if (r7 == 0) goto L_0x0215
            java.lang.String r10 = defpackage.y7e.q(r0, r8)
            r7 = 0
            if (r10 != 0) goto L_0x006a
            goto L_0x020a
        L_0x006a:
            java.lang.String r8 = "origin"
            java.lang.String r8 = defpackage.y7e.q(r0, r8)
            if (r8 == 0) goto L_0x0205
            java.util.regex.Pattern r9 = w
            java.util.regex.Matcher r11 = r9.matcher(r8)
            java.util.regex.Pattern r12 = x
            java.util.regex.Matcher r13 = r12.matcher(r8)
            boolean r14 = r11.matches()
            java.lang.String r15 = "Ignoring region with missing tts:extent: "
            java.lang.String r4 = "Ignoring region with malformed origin: "
            r16 = 1120403456(0x42c80000, float:100.0)
            if (r14 == 0) goto L_0x00af
            java.lang.String r13 = r11.group(r6)     // Catch:{ NumberFormatException -> 0x00a6 }
            r13.getClass()     // Catch:{ NumberFormatException -> 0x00a6 }
            float r13 = java.lang.Float.parseFloat(r13)     // Catch:{ NumberFormatException -> 0x00a6 }
            float r13 = r13 / r16
            java.lang.String r11 = r11.group(r3)     // Catch:{ NumberFormatException -> 0x00a6 }
            r11.getClass()     // Catch:{ NumberFormatException -> 0x00a6 }
            float r4 = java.lang.Float.parseFloat(r11)     // Catch:{ NumberFormatException -> 0x00a6 }
            float r4 = r4 / r16
            r11 = r13
            goto L_0x00e1
        L_0x00a6:
            java.lang.String r4 = r4.concat(r8)
            defpackage.i8b.V(r4)
            goto L_0x020a
        L_0x00af:
            boolean r11 = r13.matches()
            if (r11 == 0) goto L_0x01fb
            if (r2 != 0) goto L_0x00c0
            java.lang.String r4 = r15.concat(r8)
            defpackage.i8b.V(r4)
            goto L_0x020a
        L_0x00c0:
            java.lang.String r11 = r13.group(r6)     // Catch:{ NumberFormatException -> 0x01f3 }
            r11.getClass()     // Catch:{ NumberFormatException -> 0x01f3 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x01f3 }
            java.lang.String r13 = r13.group(r3)     // Catch:{ NumberFormatException -> 0x01f3 }
            r13.getClass()     // Catch:{ NumberFormatException -> 0x01f3 }
            int r13 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x01f3 }
            float r11 = (float) r11     // Catch:{ NumberFormatException -> 0x01f3 }
            int r14 = r2.b     // Catch:{ NumberFormatException -> 0x01f3 }
            float r14 = (float) r14     // Catch:{ NumberFormatException -> 0x01f3 }
            float r11 = r11 / r14
            float r13 = (float) r13     // Catch:{ NumberFormatException -> 0x01f3 }
            int r4 = r2.c     // Catch:{ NumberFormatException -> 0x01f3 }
            float r4 = (float) r4
            float r4 = r13 / r4
        L_0x00e1:
            java.lang.String r13 = "extent"
            java.lang.String r13 = defpackage.y7e.q(r0, r13)
            if (r13 == 0) goto L_0x01ed
            java.util.regex.Matcher r9 = r9.matcher(r13)
            java.util.regex.Matcher r12 = r12.matcher(r13)
            boolean r13 = r9.matches()
            java.lang.String r14 = "Ignoring region with malformed extent: "
            if (r13 == 0) goto L_0x0120
            java.lang.String r12 = r9.group(r6)     // Catch:{ NumberFormatException -> 0x0117 }
            r12.getClass()     // Catch:{ NumberFormatException -> 0x0117 }
            float r12 = java.lang.Float.parseFloat(r12)     // Catch:{ NumberFormatException -> 0x0117 }
            float r12 = r12 / r16
            java.lang.String r9 = r9.group(r3)     // Catch:{ NumberFormatException -> 0x0117 }
            r9.getClass()     // Catch:{ NumberFormatException -> 0x0117 }
            float r7 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0117 }
            float r7 = r7 / r16
            r16 = r7
            r15 = r12
            goto L_0x0154
        L_0x0117:
            java.lang.String r4 = r14.concat(r8)
            defpackage.i8b.V(r4)
            goto L_0x020a
        L_0x0120:
            boolean r9 = r12.matches()
            if (r9 == 0) goto L_0x01e3
            if (r2 != 0) goto L_0x0131
            java.lang.String r4 = r15.concat(r8)
            defpackage.i8b.V(r4)
            goto L_0x020a
        L_0x0131:
            java.lang.String r9 = r12.group(r6)     // Catch:{ NumberFormatException -> 0x01db }
            r9.getClass()     // Catch:{ NumberFormatException -> 0x01db }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01db }
            java.lang.String r12 = r12.group(r3)     // Catch:{ NumberFormatException -> 0x01db }
            r12.getClass()     // Catch:{ NumberFormatException -> 0x01db }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x01db }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x01db }
            int r13 = r2.b     // Catch:{ NumberFormatException -> 0x01db }
            float r13 = (float) r13     // Catch:{ NumberFormatException -> 0x01db }
            float r9 = r9 / r13
            float r12 = (float) r12     // Catch:{ NumberFormatException -> 0x01db }
            int r7 = r2.c     // Catch:{ NumberFormatException -> 0x01db }
            float r7 = (float) r7
            float r12 = r12 / r7
            r15 = r9
            r16 = r12
        L_0x0154:
            java.lang.String r7 = "displayAlign"
            java.lang.String r7 = defpackage.y7e.q(r0, r7)
            if (r7 == 0) goto L_0x0181
            java.lang.String r7 = defpackage.o54.P(r7)
            r7.getClass()
            java.lang.String r8 = "center"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x0179
            java.lang.String r8 = "after"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0174
            goto L_0x0181
        L_0x0174:
            float r4 = r4 + r16
            r14 = r3
            r12 = r4
            goto L_0x0183
        L_0x0179:
            r7 = 1073741824(0x40000000, float:2.0)
            float r7 = r16 / r7
            float r7 = r7 + r4
            r14 = r6
            r12 = r7
            goto L_0x0183
        L_0x0181:
            r12 = r4
            r14 = r5
        L_0x0183:
            r4 = 1065353216(0x3f800000, float:1.0)
            r7 = r22
            float r8 = (float) r7
            float r18 = r4 / r8
            java.lang.String r4 = "writingMode"
            java.lang.String r4 = defpackage.y7e.q(r0, r4)
            if (r4 == 0) goto L_0x01cc
            java.lang.String r4 = defpackage.o54.P(r4)
            r4.getClass()
            int r8 = r4.hashCode()
            switch(r8) {
                case 3694: goto L_0x01b8;
                case 3553396: goto L_0x01ad;
                case 3553576: goto L_0x01a2;
                default: goto L_0x01a0;
            }
        L_0x01a0:
            r4 = -1
            goto L_0x01c2
        L_0x01a2:
            java.lang.String r8 = "tbrl"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x01ab
            goto L_0x01a0
        L_0x01ab:
            r4 = r3
            goto L_0x01c2
        L_0x01ad:
            java.lang.String r8 = "tblr"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x01b6
            goto L_0x01a0
        L_0x01b6:
            r4 = r6
            goto L_0x01c2
        L_0x01b8:
            java.lang.String r8 = "tb"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x01c1
            goto L_0x01a0
        L_0x01c1:
            r4 = r5
        L_0x01c2:
            switch(r4) {
                case 0: goto L_0x01c9;
                case 1: goto L_0x01c9;
                case 2: goto L_0x01c6;
                default: goto L_0x01c5;
            }
        L_0x01c5:
            goto L_0x01cc
        L_0x01c6:
            r19 = r6
            goto L_0x01d0
        L_0x01c9:
            r19 = r3
            goto L_0x01d0
        L_0x01cc:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = r4
        L_0x01d0:
            ytf r4 = new ytf
            r13 = 0
            r17 = 1
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r7 = r4
            goto L_0x020a
        L_0x01db:
            java.lang.String r4 = r14.concat(r8)
            defpackage.i8b.V(r4)
            goto L_0x020a
        L_0x01e3:
            java.lang.String r4 = "Ignoring region with unsupported extent: "
            java.lang.String r4 = r4.concat(r8)
            defpackage.i8b.V(r4)
            goto L_0x020a
        L_0x01ed:
            java.lang.String r4 = "Ignoring region without an extent"
            defpackage.i8b.V(r4)
            goto L_0x020a
        L_0x01f3:
            java.lang.String r4 = r4.concat(r8)
            defpackage.i8b.V(r4)
            goto L_0x020a
        L_0x01fb:
            java.lang.String r4 = "Ignoring region with unsupported origin: "
            java.lang.String r4 = r4.concat(r8)
            defpackage.i8b.V(r4)
            goto L_0x020a
        L_0x0205:
            java.lang.String r4 = "Ignoring region without an origin"
            defpackage.i8b.V(r4)
        L_0x020a:
            if (r7 == 0) goto L_0x0051
            java.lang.String r4 = r7.a
            r9 = r24
            r9.put(r4, r7)
            goto L_0x0053
        L_0x0215:
            r9 = r24
            java.lang.String r4 = "metadata"
            boolean r7 = defpackage.y7e.K(r0, r4)
            if (r7 == 0) goto L_0x0053
        L_0x021f:
            r20.next()
            java.lang.String r7 = "image"
            boolean r7 = defpackage.y7e.K(r0, r7)
            if (r7 == 0) goto L_0x023a
            java.lang.String r7 = defpackage.y7e.q(r0, r8)
            if (r7 == 0) goto L_0x023a
            java.lang.String r10 = r20.nextText()
            r11 = r25
            r11.put(r7, r10)
            goto L_0x023c
        L_0x023a:
            r11 = r25
        L_0x023c:
            boolean r7 = defpackage.y7e.H(r0, r4)
            if (r7 == 0) goto L_0x021f
        L_0x0242:
            java.lang.String r4 = "head"
            boolean r4 = defpackage.y7e.H(r0, r4)
            if (r4 == 0) goto L_0x024b
            return
        L_0x024b:
            r4 = -1
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtf.g(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, ft, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.vtf h(org.xmlpull.v1.XmlPullParser r21, defpackage.vtf r22, java.util.HashMap r23, defpackage.aid r24) {
        /*
            r0 = r21
            r11 = r22
            r1 = r24
            r2 = -1
            r3 = 1
            int r4 = r21.getAttributeCount()
            r5 = 0
            auf r7 = i(r0, r5)
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
            int r8 = defpackage.v0g.a
            java.lang.String r8 = "\\s+"
            java.lang.String[] r6 = r6.split(r8, r2)
        L_0x00a6:
            int r8 = r6.length
            if (r8 <= 0) goto L_0x008e
            r12 = r6
            goto L_0x008e
        L_0x00ab:
            long r15 = j(r8, r1)
            goto L_0x008e
        L_0x00b0:
            long r17 = j(r8, r1)
            goto L_0x008e
        L_0x00b5:
            long r19 = j(r8, r1)
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
            vtf r17 = new vtf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtf.h(org.xmlpull.v1.XmlPullParser, vtf, java.util.HashMap, aid):vtf");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: jff} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: android.text.Layout$Alignment} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r12v14, types: [jff] */
    /* JADX WARNING: type inference failed for: r11v69, types: [jff] */
    /* JADX WARNING: type inference failed for: r12v19, types: [jff] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0406, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0499, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.auf i(org.xmlpull.v1.XmlPullParser r19, defpackage.auf r20) {
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
            if (r14 >= r10) goto L_0x051c
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
                case 0: goto L_0x0501;
                case 1: goto L_0x04f4;
                case 2: goto L_0x049c;
                case 3: goto L_0x0433;
                case 4: goto L_0x0421;
                case 5: goto L_0x0409;
                case 6: goto L_0x0386;
                case 7: goto L_0x036d;
                case 8: goto L_0x0322;
                case 9: goto L_0x02fa;
                case 10: goto L_0x02ea;
                case 11: goto L_0x0183;
                case 12: goto L_0x015f;
                case 13: goto L_0x014b;
                case 14: goto L_0x00f1;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            r18 = r3
            goto L_0x03dc
        L_0x00f1:
            auf r0 = a(r0)
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
            goto L_0x0514
        L_0x014b:
            auf r0 = a(r0)
            int r13 = defpackage.o53.a(r12, r11)     // Catch:{ IllegalArgumentException -> 0x0159 }
            r0.d = r13     // Catch:{ IllegalArgumentException -> 0x0159 }
            r13 = 1
            r0.e = r13     // Catch:{ IllegalArgumentException -> 0x0159 }
            goto L_0x0142
        L_0x0159:
            java.lang.String r13 = "Failed parsing background value: "
            defpackage.rae.x(r13, r12)
            goto L_0x0142
        L_0x015f:
            java.lang.String r12 = defpackage.o54.P(r12)
            r12.getClass()
            boolean r13 = r12.equals(r4)
            if (r13 != 0) goto L_0x017b
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L_0x0173
            goto L_0x0142
        L_0x0173:
            auf r0 = a(r0)
            r12 = 2
            r0.n = r12
            goto L_0x0142
        L_0x017b:
            auf r0 = a(r0)
            r12 = 1
            r0.n = r12
            goto L_0x0142
        L_0x0183:
            auf r0 = a(r0)
            java.util.regex.Pattern r13 = defpackage.jff.d
            if (r12 != 0) goto L_0x0191
        L_0x018b:
            r18 = r3
        L_0x018d:
            r1 = r16
            goto L_0x02e1
        L_0x0191:
            java.lang.String r12 = r12.trim()
            java.lang.String r12 = defpackage.o54.P(r12)
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L_0x01a0
            goto L_0x018b
        L_0x01a0:
            java.util.regex.Pattern r13 = defpackage.jff.d
            java.lang.String[] r12 = android.text.TextUtils.split(r12, r13)
            int r13 = r12.length
            if (r13 == 0) goto L_0x01c1
            r15 = 1
            if (r13 == r15) goto L_0x01b8
            int r13 = r12.length
            java.lang.Object r12 = r12.clone()
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            dc7 r12 = defpackage.dc7.o(r13, r12)
            goto L_0x01c3
        L_0x01b8:
            r12 = r12[r11]
            mde r13 = new mde
            r13.<init>(r12)
            r12 = r13
            goto L_0x01c3
        L_0x01c1:
            q0d r12 = defpackage.q0d.X
        L_0x01c3:
            dc7 r13 = defpackage.jff.h
            xxd r13 = defpackage.ryg.E(r13, r12)
            java.lang.String r15 = "outside"
            java.lang.Object r13 = defpackage.b0h.v(r13, r15)
            java.lang.String r13 = (java.lang.String) r13
            int r11 = r13.hashCode()
            r1 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            if (r11 == r1) goto L_0x01f5
            r1 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            if (r11 == r1) goto L_0x01ed
            r1 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r11 == r1) goto L_0x01e5
            goto L_0x01fd
        L_0x01e5:
            boolean r1 = r13.equals(r3)
            if (r1 == 0) goto L_0x01fd
            r1 = 0
            goto L_0x01fe
        L_0x01ed:
            boolean r1 = r13.equals(r15)
            if (r1 == 0) goto L_0x01fd
            r1 = 1
            goto L_0x01fe
        L_0x01f5:
            boolean r1 = r13.equals(r4)
            if (r1 == 0) goto L_0x01fd
            r1 = 2
            goto L_0x01fe
        L_0x01fd:
            r1 = -1
        L_0x01fe:
            if (r1 == 0) goto L_0x0207
            r11 = 1
            if (r1 == r11) goto L_0x0205
            r1 = 1
            goto L_0x0208
        L_0x0205:
            r1 = -2
            goto L_0x0208
        L_0x0207:
            r1 = 2
        L_0x0208:
            dc7 r11 = defpackage.jff.e
            xxd r11 = defpackage.ryg.E(r11, r12)
            boolean r13 = r11.isEmpty()
            if (r13 != 0) goto L_0x0249
            em7 r12 = new em7
            r12.<init>(r11)
            java.lang.Object r11 = r12.next()
            java.lang.String r11 = (java.lang.String) r11
            int r12 = r11.hashCode()
            r13 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r12 == r13) goto L_0x0236
            r13 = 3387192(0x33af38, float:4.746467E-39)
            if (r12 == r13) goto L_0x022e
            goto L_0x023c
        L_0x022e:
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L_0x023c
            r11 = 0
            goto L_0x023d
        L_0x0236:
            java.lang.String r12 = "auto"
            boolean r11 = r11.equals(r12)
        L_0x023c:
            r11 = -1
        L_0x023d:
            jff r12 = new jff
            r13 = 0
            r12.<init>(r11, r13, r1)
            r18 = r3
        L_0x0245:
            r16 = r12
            goto L_0x018d
        L_0x0249:
            r13 = 0
            dc7 r11 = defpackage.jff.g
            xxd r11 = defpackage.ryg.E(r11, r12)
            dc7 r15 = defpackage.jff.f
            xxd r12 = defpackage.ryg.E(r15, r12)
            boolean r15 = r11.isEmpty()
            if (r15 == 0) goto L_0x026e
            boolean r15 = r12.isEmpty()
            if (r15 == 0) goto L_0x026e
            jff r11 = new jff
            r15 = -1
            r11.<init>(r15, r13, r1)
            r18 = r3
            r16 = r11
            goto L_0x018d
        L_0x026e:
            r15 = -1
            java.lang.String r13 = "filled"
            java.lang.Object r11 = defpackage.b0h.v(r11, r13)
            java.lang.String r11 = (java.lang.String) r11
            int r15 = r11.hashCode()
            r18 = r3
            r3 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r15 == r3) goto L_0x0292
            r3 = 3417674(0x34264a, float:4.789181E-39)
            if (r15 == r3) goto L_0x0288
            goto L_0x0296
        L_0x0288:
            java.lang.String r3 = "open"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x0296
            r3 = 2
            goto L_0x0297
        L_0x0292:
            boolean r3 = r11.equals(r13)
        L_0x0296:
            r3 = 1
        L_0x0297:
            java.lang.String r11 = "circle"
            java.lang.Object r12 = defpackage.b0h.v(r12, r11)
            java.lang.String r12 = (java.lang.String) r12
            int r13 = r12.hashCode()
            r15 = -1360216880(0xffffffffaeecbcd0, float:-1.0765577E-10)
            if (r13 == r15) goto L_0x02c7
            r11 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r13 == r11) goto L_0x02bd
            r11 = 99657(0x18549, float:1.39649E-40)
            if (r13 == r11) goto L_0x02b3
            goto L_0x02cf
        L_0x02b3:
            java.lang.String r11 = "dot"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x02cf
            r11 = 0
            goto L_0x02d0
        L_0x02bd:
            java.lang.String r11 = "sesame"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x02cf
            r11 = 1
            goto L_0x02d0
        L_0x02c7:
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x02cf
            r11 = 2
            goto L_0x02d0
        L_0x02cf:
            r11 = -1
        L_0x02d0:
            if (r11 == 0) goto L_0x02d9
            r12 = 1
            if (r11 == r12) goto L_0x02d7
            r11 = 1
            goto L_0x02da
        L_0x02d7:
            r11 = 3
            goto L_0x02da
        L_0x02d9:
            r11 = 2
        L_0x02da:
            jff r12 = new jff
            r12.<init>(r11, r3, r1)
            goto L_0x0245
        L_0x02e1:
            r0.r = r1
        L_0x02e3:
            r1 = 4
            r3 = 2
            r11 = 1
            r13 = 3
        L_0x02e7:
            r15 = 0
            goto L_0x0514
        L_0x02ea:
            r18 = r3
            auf r0 = a(r0)     // Catch:{ SubtitleDecoderException -> 0x02f4 }
            d(r12, r0)     // Catch:{ SubtitleDecoderException -> 0x02f4 }
            goto L_0x02e3
        L_0x02f4:
            java.lang.String r1 = "Failed parsing fontSize value: "
            defpackage.rae.x(r1, r12)
            goto L_0x02e3
        L_0x02fa:
            r18 = r3
            java.lang.String r1 = defpackage.o54.P(r12)
            r1.getClass()
            java.lang.String r3 = "all"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x031a
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0312
            goto L_0x02e3
        L_0x0312:
            auf r0 = a(r0)
            r1 = 0
            r0.q = r1
            goto L_0x02e3
        L_0x031a:
            auf r0 = a(r0)
            r1 = 1
            r0.q = r1
            goto L_0x02e3
        L_0x0322:
            r18 = r3
            auf r1 = a(r0)
            java.util.regex.Pattern r0 = v
            java.util.regex.Matcher r0 = r0.matcher(r12)
            boolean r3 = r0.matches()
            r11 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r3 != 0) goto L_0x033d
            java.lang.String r0 = "Invalid value for shear: "
            defpackage.rae.x(r0, r12)
            goto L_0x0368
        L_0x033d:
            r3 = 1
            java.lang.String r0 = r0.group(r3)     // Catch:{ NumberFormatException -> 0x0356 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0356 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0356 }
            r3 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r0 = java.lang.Math.max(r3, r0)     // Catch:{ NumberFormatException -> 0x0356 }
            r3 = 1120403456(0x42c80000, float:100.0)
            float r11 = java.lang.Math.min(r3, r0)     // Catch:{ NumberFormatException -> 0x0356 }
            goto L_0x0368
        L_0x0356:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r13 = "Failed to parse shear: "
            r3.<init>(r13)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            defpackage.i8b.W(r3, r0)
        L_0x0368:
            r1.s = r11
            r0 = r1
            goto L_0x02e3
        L_0x036d:
            r18 = r3
            auf r0 = a(r0)
            r1 = 0
            int r3 = defpackage.o53.a(r12, r1)     // Catch:{ IllegalArgumentException -> 0x037f }
            r0.b = r3     // Catch:{ IllegalArgumentException -> 0x037f }
            r1 = 1
            r0.c = r1     // Catch:{ IllegalArgumentException -> 0x037f }
            goto L_0x02e3
        L_0x037f:
            java.lang.String r1 = "Failed parsing color value: "
            defpackage.rae.x(r1, r12)
            goto L_0x02e3
        L_0x0386:
            r18 = r3
            java.lang.String r1 = defpackage.o54.P(r12)
            r1.getClass()
            int r3 = r1.hashCode()
            switch(r3) {
                case -618561360: goto L_0x03cf;
                case -410956671: goto L_0x03c4;
                case -250518009: goto L_0x03b9;
                case -136074796: goto L_0x03ae;
                case 3016401: goto L_0x03a3;
                case 3556653: goto L_0x0398;
                default: goto L_0x0396;
            }
        L_0x0396:
            r1 = -1
            goto L_0x03d9
        L_0x0398:
            java.lang.String r3 = "text"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03a1
            goto L_0x0396
        L_0x03a1:
            r1 = 5
            goto L_0x03d9
        L_0x03a3:
            java.lang.String r3 = "base"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03ac
            goto L_0x0396
        L_0x03ac:
            r1 = 4
            goto L_0x03d9
        L_0x03ae:
            java.lang.String r3 = "textContainer"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03b7
            goto L_0x0396
        L_0x03b7:
            r1 = 3
            goto L_0x03d9
        L_0x03b9:
            java.lang.String r3 = "delimiter"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03c2
            goto L_0x0396
        L_0x03c2:
            r1 = 2
            goto L_0x03d9
        L_0x03c4:
            java.lang.String r3 = "container"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03cd
            goto L_0x0396
        L_0x03cd:
            r1 = 1
            goto L_0x03d9
        L_0x03cf:
            java.lang.String r3 = "baseContainer"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03d8
            goto L_0x0396
        L_0x03d8:
            r1 = 0
        L_0x03d9:
            switch(r1) {
                case 0: goto L_0x03fd;
                case 1: goto L_0x03f3;
                case 2: goto L_0x03ea;
                case 3: goto L_0x03e0;
                case 4: goto L_0x03fd;
                case 5: goto L_0x03e0;
                default: goto L_0x03dc;
            }
        L_0x03dc:
            r1 = 4
            r3 = 2
            r13 = 3
            goto L_0x0406
        L_0x03e0:
            auf r0 = a(r0)
            r13 = 3
            r0.m = r13
            r1 = 4
        L_0x03e8:
            r3 = 2
            goto L_0x0406
        L_0x03ea:
            r13 = 3
            auf r0 = a(r0)
            r1 = 4
            r0.m = r1
            goto L_0x03e8
        L_0x03f3:
            r1 = 4
            r13 = 3
            auf r0 = a(r0)
            r3 = 1
            r0.m = r3
            goto L_0x03e8
        L_0x03fd:
            r1 = 4
            r13 = 3
            auf r0 = a(r0)
            r3 = 2
            r0.m = r3
        L_0x0406:
            r11 = 1
            goto L_0x02e7
        L_0x0409:
            r18 = r3
            r1 = 4
            r3 = 2
            r13 = 3
            java.lang.String r11 = "style"
            java.lang.String r15 = r19.getName()
            boolean r11 = r11.equals(r15)
            if (r11 == 0) goto L_0x0406
            auf r0 = a(r0)
            r0.l = r12
            goto L_0x0406
        L_0x0421:
            r18 = r3
            r1 = 4
            r3 = 2
            r13 = 3
            auf r0 = a(r0)
            java.lang.String r11 = "bold"
            boolean r11 = r11.equalsIgnoreCase(r12)
            r0.h = r11
            goto L_0x0406
        L_0x0433:
            r18 = r3
            r1 = 4
            r3 = 2
            r13 = 3
            java.lang.String r11 = defpackage.o54.P(r12)
            r11.getClass()
            int r12 = r11.hashCode()
            switch(r12) {
                case -1461280213: goto L_0x0469;
                case -1026963764: goto L_0x045e;
                case 913457136: goto L_0x0453;
                case 1679736913: goto L_0x0448;
                default: goto L_0x0446;
            }
        L_0x0446:
            r11 = -1
            goto L_0x0473
        L_0x0448:
            java.lang.String r12 = "linethrough"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0451
            goto L_0x0446
        L_0x0451:
            r11 = r13
            goto L_0x0473
        L_0x0453:
            java.lang.String r12 = "nolinethrough"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x045c
            goto L_0x0446
        L_0x045c:
            r11 = r3
            goto L_0x0473
        L_0x045e:
            java.lang.String r12 = "underline"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0467
            goto L_0x0446
        L_0x0467:
            r11 = 1
            goto L_0x0473
        L_0x0469:
            java.lang.String r12 = "nounderline"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0472
            goto L_0x0446
        L_0x0472:
            r11 = 0
        L_0x0473:
            switch(r11) {
                case 0: goto L_0x0492;
                case 1: goto L_0x0489;
                case 2: goto L_0x0480;
                case 3: goto L_0x0478;
                default: goto L_0x0476;
            }
        L_0x0476:
            r15 = 0
            goto L_0x0499
        L_0x0478:
            auf r0 = a(r0)
            r11 = 1
            r0.f = r11
            goto L_0x0476
        L_0x0480:
            r11 = 1
            auf r0 = a(r0)
            r15 = 0
            r0.f = r15
            goto L_0x0499
        L_0x0489:
            r11 = 1
            r15 = 0
            auf r0 = a(r0)
            r0.g = r11
            goto L_0x0499
        L_0x0492:
            r15 = 0
            auf r0 = a(r0)
            r0.g = r15
        L_0x0499:
            r11 = 1
            goto L_0x0514
        L_0x049c:
            r18 = r3
            r15 = r11
            r1 = 4
            r3 = 2
            r13 = 3
            auf r0 = a(r0)
            java.lang.String r11 = defpackage.o54.P(r12)
            r11.getClass()
            int r12 = r11.hashCode()
            switch(r12) {
                case -1364013995: goto L_0x04da;
                case 100571: goto L_0x04d1;
                case 3317767: goto L_0x04c8;
                case 108511772: goto L_0x04bf;
                case 109757538: goto L_0x04b6;
                default: goto L_0x04b4;
            }
        L_0x04b4:
            r11 = -1
            goto L_0x04e2
        L_0x04b6:
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x04bd
            goto L_0x04b4
        L_0x04bd:
            r11 = r1
            goto L_0x04e2
        L_0x04bf:
            boolean r11 = r11.equals(r6)
            if (r11 != 0) goto L_0x04c6
            goto L_0x04b4
        L_0x04c6:
            r11 = r13
            goto L_0x04e2
        L_0x04c8:
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x04cf
            goto L_0x04b4
        L_0x04cf:
            r11 = r3
            goto L_0x04e2
        L_0x04d1:
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x04d8
            goto L_0x04b4
        L_0x04d8:
            r11 = 1
            goto L_0x04e2
        L_0x04da:
            boolean r11 = r11.equals(r9)
            if (r11 != 0) goto L_0x04e1
            goto L_0x04b4
        L_0x04e1:
            r11 = r15
        L_0x04e2:
            switch(r11) {
                case 0: goto L_0x04ee;
                case 1: goto L_0x04eb;
                case 2: goto L_0x04e8;
                case 3: goto L_0x04eb;
                case 4: goto L_0x04e8;
                default: goto L_0x04e5;
            }
        L_0x04e5:
            r11 = r16
            goto L_0x04f1
        L_0x04e8:
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x04e5
        L_0x04eb:
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x04e5
        L_0x04ee:
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x04e5
        L_0x04f1:
            r0.o = r11
            goto L_0x0499
        L_0x04f4:
            r18 = r3
            r15 = r11
            r1 = 4
            r3 = 2
            r13 = 3
            auf r0 = a(r0)
            r0.a = r12
            goto L_0x0499
        L_0x0501:
            r18 = r3
            r15 = r11
            r1 = 4
            r3 = 2
            r13 = 3
            auf r0 = a(r0)
            java.lang.String r11 = "italic"
            boolean r11 = r11.equalsIgnoreCase(r12)
            r0.i = r11
            goto L_0x0499
        L_0x0514:
            int r14 = r14 + r11
            r1 = r19
            r11 = r15
            r3 = r18
            goto L_0x001a
        L_0x051c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtf.i(org.xmlpull.v1.XmlPullParser, auf):auf");
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
    public static long j(java.lang.String r13, defpackage.aid r14) {
        /*
            r0 = 4
            r1 = 3
            java.util.regex.Pattern r2 = b
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
            java.util.regex.Pattern r2 = c
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
            androidx.media3.extractor.text.SubtitleDecoderException r14 = new androidx.media3.extractor.text.SubtitleDecoderException
            java.lang.String r0 = "Malformed time expression: "
            java.lang.String r13 = defpackage.a81.m(r0, r13)
            r14.<init>(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtf.j(java.lang.String, aid):long");
    }

    public static ft k(XmlPullParser xmlPullParser) {
        String q = y7e.q(xmlPullParser, "extent");
        if (q == null) {
            return null;
        }
        Matcher matcher = x.matcher(q);
        if (!matcher.matches()) {
            i8b.V("Ignoring non-pixel tts extent: ".concat(q));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new ft(parseInt, Integer.parseInt(group2), 11);
        } catch (NumberFormatException unused) {
            i8b.V("Ignoring malformed tts extent: ".concat(q));
            return null;
        }
    }

    public final vye f(int i, byte[] bArr, int i2) {
        aid aid;
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new ytf("", -3.4028235E38f, -3.4028235E38f, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, IntCompanionObject.MIN_VALUE, -3.4028235E38f, IntCompanionObject.MIN_VALUE));
            ft ftVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            aid aid2 = z;
            int i3 = 15;
            q13 q13 = null;
            int i4 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                vtf vtf = (vtf) arrayDeque.peek();
                if (i4 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aid2 = e(newPullParser);
                            i3 = c(newPullParser);
                            ftVar = k(newPullParser);
                        }
                        ft ftVar2 = ftVar;
                        aid aid3 = aid2;
                        int i5 = i3;
                        if (!b(name)) {
                            i8b.F("Ignoring unsupported tag: " + newPullParser.getName());
                            i4++;
                            aid2 = aid3;
                        } else {
                            if ("head".equals(name)) {
                                aid = aid3;
                                g(newPullParser, hashMap, i5, ftVar2, hashMap2, hashMap3);
                            } else {
                                aid = aid3;
                                try {
                                    vtf h = h(newPullParser, vtf, hashMap2, aid);
                                    arrayDeque.push(h);
                                    if (vtf != null) {
                                        if (vtf.m == null) {
                                            vtf.m = new ArrayList();
                                        }
                                        vtf.m.add(h);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    i8b.W("Suppressing parser error", e);
                                    i4++;
                                }
                            }
                            aid2 = aid;
                        }
                        ftVar = ftVar2;
                        i3 = i5;
                    } else if (eventType == 4) {
                        vtf.getClass();
                        vtf a2 = vtf.a(newPullParser.getText());
                        if (vtf.m == null) {
                            vtf.m = new ArrayList();
                        }
                        vtf.m.add(a2);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            vtf vtf2 = (vtf) arrayDeque.peek();
                            vtf2.getClass();
                            q13 = new q13(vtf2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i4++;
                } else if (eventType == 3) {
                    i4--;
                }
                newPullParser.next();
            }
            q13.getClass();
            return q13;
        } catch (XmlPullParserException e2) {
            throw new IllegalStateException("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }

    public final void m(byte[] bArr, int i, int i2, hze hze, pk3 pk3) {
        ld9.S(f(i, bArr, i2), hze, pk3);
    }

    public final int q() {
        return 1;
    }
}
