package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.uuid.Uuid;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: b64  reason: default package */
public final class b64 extends DefaultHandler implements n8b {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern o = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] v = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public b64() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = t0g.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(new pod(j, j2));
            j += j2;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (fqc.A(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (fqc.A(xmlPullParser)) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        if (r5.equals("fa01") == false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(org.xmlpull.v1.XmlPullParser r9) {
        /*
            r0 = 3
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = -1
            r5 = 0
            java.lang.String r6 = "schemeIdUri"
            java.lang.String r6 = r9.getAttributeValue(r5, r6)
            if (r6 != 0) goto L_0x000f
            r6 = r5
        L_0x000f:
            r6.getClass()
            java.lang.String r7 = "value"
            int r8 = r6.hashCode()
            switch(r8) {
                case -1352850286: goto L_0x003e;
                case -1138141449: goto L_0x0033;
                case -986633423: goto L_0x0028;
                case 2036691300: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            r6 = r4
            goto L_0x0048
        L_0x001d:
            java.lang.String r8 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0026
            goto L_0x001b
        L_0x0026:
            r6 = r0
            goto L_0x0048
        L_0x0028:
            java.lang.String r8 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0031
            goto L_0x001b
        L_0x0031:
            r6 = r2
            goto L_0x0048
        L_0x0033:
            java.lang.String r8 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x003c
            goto L_0x001b
        L_0x003c:
            r6 = r3
            goto L_0x0048
        L_0x003e:
            java.lang.String r8 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0047
            goto L_0x001b
        L_0x0047:
            r6 = r1
        L_0x0048:
            switch(r6) {
                case 0: goto L_0x00a8;
                case 1: goto L_0x005b;
                case 2: goto L_0x004d;
                case 3: goto L_0x005b;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x00ac
        L_0x004d:
            int r0 = k(r9, r7, r4)
            if (r0 < 0) goto L_0x00ac
            int[] r1 = v
            int r2 = r1.length
            if (r0 >= r2) goto L_0x00ac
            r4 = r1[r0]
            goto L_0x00ac
        L_0x005b:
            java.lang.String r5 = r9.getAttributeValue(r5, r7)
            if (r5 != 0) goto L_0x0063
        L_0x0061:
            r2 = r4
            goto L_0x00a6
        L_0x0063:
            java.lang.String r5 = defpackage.o54.P(r5)
            r5.getClass()
            int r6 = r5.hashCode()
            switch(r6) {
                case 1596796: goto L_0x0092;
                case 2937391: goto L_0x0087;
                case 3094035: goto L_0x007c;
                case 3133436: goto L_0x0073;
                default: goto L_0x0071;
            }
        L_0x0071:
            r0 = r4
            goto L_0x009c
        L_0x0073:
            java.lang.String r1 = "fa01"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x009c
            goto L_0x0071
        L_0x007c:
            java.lang.String r0 = "f801"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0085
            goto L_0x0071
        L_0x0085:
            r0 = r2
            goto L_0x009c
        L_0x0087:
            java.lang.String r0 = "a000"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0090
            goto L_0x0071
        L_0x0090:
            r0 = r3
            goto L_0x009c
        L_0x0092:
            java.lang.String r0 = "4000"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x009b
            goto L_0x0071
        L_0x009b:
            r0 = r1
        L_0x009c:
            switch(r0) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x00a6;
                case 2: goto L_0x00a3;
                case 3: goto L_0x00a0;
                default: goto L_0x009f;
            }
        L_0x009f:
            goto L_0x0061
        L_0x00a0:
            r2 = 8
            goto L_0x00a6
        L_0x00a3:
            r2 = 6
            goto L_0x00a6
        L_0x00a5:
            r2 = r3
        L_0x00a6:
            r4 = r2
            goto L_0x00ac
        L_0x00a8:
            int r4 = k(r9, r7, r4)
        L_0x00ac:
            r9.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = defpackage.fqc.z(r9, r0)
            if (r0 == 0) goto L_0x00ac
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b64.c(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "availabilityTimeOffset");
        return attributeValue == null ? j : "INF".equals(attributeValue) ? LongCompanionObject.MAX_VALUE : (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, List list, boolean z) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "dvb:priority");
        int i = 1;
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : IntCompanionObject.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "dvb:weight");
        if (attributeValue2 != null) {
            i = Integer.parseInt(attributeValue2);
        }
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!fqc.z(xmlPullParser, "BaseURL"));
        if (str == null || tf6.T(str)[0] == -1) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                ll0 ll0 = (ll0) list.get(i2);
                String j0 = tf6.j0(ll0.a, str);
                String str2 = attributeValue3 == null ? j0 : attributeValue3;
                if (z) {
                    parseInt = ll0.c;
                    i = ll0.d;
                    str2 = ll0.b;
                }
                arrayList.add(new ll0(j0, str2, parseInt, i));
            }
            return arrayList;
        }
        if (attributeValue3 == null) {
            attributeValue3 = str;
        }
        return gsg.q(new ll0(str, attributeValue3, parseInt, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a3, code lost:
        r2 = null;
        r7 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r13) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "schemeIdUri"
            java.lang.String r2 = r13.getAttributeValue(r1, r2)
            r3 = -1
            r4 = 58
            r5 = 0
            if (r2 == 0) goto L_0x00a9
            java.lang.String r2 = defpackage.o54.P(r2)
            r2.getClass()
            int r6 = r2.hashCode()
            switch(r6) {
                case 489446379: goto L_0x0034;
                case 755418770: goto L_0x0029;
                case 1812765994: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            r2 = r3
            goto L_0x003e
        L_0x001e:
            java.lang.String r6 = "urn:mpeg:dash:mp4protection:2011"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0027
            goto L_0x001c
        L_0x0027:
            r2 = 2
            goto L_0x003e
        L_0x0029:
            java.lang.String r6 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0032
            goto L_0x001c
        L_0x0032:
            r2 = r0
            goto L_0x003e
        L_0x0034:
            java.lang.String r6 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x003d
            goto L_0x001c
        L_0x003d:
            r2 = r5
        L_0x003e:
            switch(r2) {
                case 0: goto L_0x00a6;
                case 1: goto L_0x00a1;
                case 2: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x00a9
        L_0x0043:
            java.lang.String r2 = "value"
            java.lang.String r2 = r13.getAttributeValue(r1, r2)
            int r6 = r13.getAttributeCount()
            r7 = r5
        L_0x004e:
            if (r7 >= r6) goto L_0x006f
            java.lang.String r8 = r13.getAttributeName(r7)
            int r9 = r8.indexOf(r4)
            if (r9 != r3) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            int r9 = r9 + r0
            java.lang.String r8 = r8.substring(r9)
        L_0x0060:
            java.lang.String r9 = "default_KID"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x006d
            java.lang.String r6 = r13.getAttributeValue(r7)
            goto L_0x0070
        L_0x006d:
            int r7 = r7 + r0
            goto L_0x004e
        L_0x006f:
            r6 = r1
        L_0x0070:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x009d
            java.lang.String r7 = "00000000-0000-0000-0000-000000000000"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x009d
            java.lang.String r7 = "\\s+"
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            java.util.UUID[] r7 = new java.util.UUID[r7]
            r8 = r5
        L_0x0088:
            int r9 = r6.length
            if (r8 >= r9) goto L_0x0095
            r9 = r6[r8]
            java.util.UUID r9 = java.util.UUID.fromString(r9)
            r7[r8] = r9
            int r8 = r8 + r0
            goto L_0x0088
        L_0x0095:
            java.util.UUID r6 = defpackage.ww0.b
            byte[] r7 = defpackage.ld9.j(r6, r7, r1)
            r8 = r1
            goto L_0x00ac
        L_0x009d:
            r6 = r1
        L_0x009e:
            r7 = r6
        L_0x009f:
            r8 = r7
            goto L_0x00ac
        L_0x00a1:
            java.util.UUID r6 = defpackage.ww0.d
        L_0x00a3:
            r2 = r1
            r7 = r2
            goto L_0x009f
        L_0x00a6:
            java.util.UUID r6 = defpackage.ww0.e
            goto L_0x00a3
        L_0x00a9:
            r2 = r1
            r6 = r2
            goto L_0x009e
        L_0x00ac:
            r13.next()
            java.lang.String r9 = "ms:laurl"
            boolean r9 = defpackage.fqc.B(r13, r9)
            if (r9 == 0) goto L_0x00bf
            java.lang.String r8 = "licenseUrl"
            java.lang.String r8 = r13.getAttributeValue(r1, r8)
            goto L_0x0129
        L_0x00bf:
            r9 = 4
            if (r7 != 0) goto L_0x0101
            boolean r10 = defpackage.fqc.A(r13)
            if (r10 == 0) goto L_0x0101
            java.lang.String r10 = r13.getName()
            int r11 = r10.indexOf(r4)
            if (r11 != r3) goto L_0x00d3
            goto L_0x00d8
        L_0x00d3:
            int r11 = r11 + r0
            java.lang.String r10 = r10.substring(r11)
        L_0x00d8:
            java.lang.String r11 = "pssh"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0101
            int r10 = r13.next()
            if (r10 != r9) goto L_0x0101
            java.lang.String r6 = r13.getText()
            byte[] r6 = android.util.Base64.decode(r6, r5)
            z9c r7 = defpackage.ld9.O(r6)
            if (r7 != 0) goto L_0x00f6
            r7 = r1
            goto L_0x00f8
        L_0x00f6:
            java.util.UUID r7 = r7.a
        L_0x00f8:
            if (r7 != 0) goto L_0x00fd
            r6 = r7
            r7 = r1
            goto L_0x0129
        L_0x00fd:
            r12 = r7
            r7 = r6
            r6 = r12
            goto L_0x0129
        L_0x0101:
            if (r7 != 0) goto L_0x0126
            java.util.UUID r10 = defpackage.ww0.e
            boolean r11 = r10.equals(r6)
            if (r11 == 0) goto L_0x0126
            java.lang.String r11 = "mspr:pro"
            boolean r11 = defpackage.fqc.B(r13, r11)
            if (r11 == 0) goto L_0x0126
            int r11 = r13.next()
            if (r11 != r9) goto L_0x0126
            java.lang.String r7 = r13.getText()
            byte[] r7 = android.util.Base64.decode(r7, r5)
            byte[] r7 = defpackage.ld9.j(r10, r1, r7)
            goto L_0x0129
        L_0x0126:
            b(r13)
        L_0x0129:
            java.lang.String r9 = "ContentProtection"
            boolean r9 = defpackage.fqc.z(r13, r9)
            if (r9 == 0) goto L_0x00ac
            if (r6 == 0) goto L_0x013a
            vv4 r1 = new vv4
            java.lang.String r13 = "video/mp4"
            r1.<init>(r6, r8, r13, r7)
        L_0x013a:
            android.util.Pair r13 = android.util.Pair.create(r2, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b64.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    public static nm4 h(XmlPullParser xmlPullParser, String str) {
        String str2 = null;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "id");
        if (attributeValue3 != null) {
            str2 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!fqc.z(xmlPullParser, str));
        return new nm4(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = t0g.h.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d = 0.0d;
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        if (group6 != null) {
            d = Double.parseDouble(group6);
        }
        long j2 = (long) ((parseDouble5 + d) * 1000.0d);
        return isEmpty ? -j2 : j2;
    }

    public static float j(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        return !TextUtils.isEmpty(group) ? ((float) parseInt) / ((float) Integer.parseInt(group)) : (float) parseInt;
    }

    public static int k(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long l(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r120v3, resolved type: rod} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r117v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r85v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r94v16, types: [s2d] */
    /* JADX WARNING: type inference failed for: r94v17, types: [u2d] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x09cb, code lost:
        r0 = "audio/eac3-joc";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x09db, code lost:
        if ("audio/eac3-joc".equals(r0) != false) goto L_0x09e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x1033, code lost:
        r33 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x1035, code lost:
        r42 = r9;
        r137 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x10c6, code lost:
        r157.nextToken();
        r2 = r33;
        r9 = r42;
        r10 = r137;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0995  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x09eb  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0beb  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0bee  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0c09  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x0c0c  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0c29  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0c52 A[LOOP:6: B:189:0x0681->B:427:0x0c52, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x0f2a A[LOOP:5: B:128:0x03d0->B:500:0x0f2a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x131a A[LOOP:1: B:40:0x00cf->B:602:0x131a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:607:0x12e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:611:0x0dff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:612:0x08e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:630:0x0a22 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.x54 m(org.xmlpull.v1.XmlPullParser r157, android.net.Uri r158) {
        /*
            r13 = r157
            r10 = 1
            r11 = 0
            java.lang.String[] r0 = new java.lang.String[r11]
            java.lang.String r1 = "profiles"
            r8 = 0
            java.lang.String r1 = r13.getAttributeValue(r8, r1)
            if (r1 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)
        L_0x0016:
            int r1 = r0.length
            r2 = r11
        L_0x0018:
            if (r2 >= r1) goto L_0x0028
            r3 = r0[r2]
            java.lang.String r4 = "urn:dvb:dash:profile:dvb-dash:"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L_0x0026
            r9 = r10
            goto L_0x0029
        L_0x0026:
            int r2 = r2 + r10
            goto L_0x0018
        L_0x0028:
            r9 = r11
        L_0x0029:
            java.lang.String r0 = "availabilityStartTime"
            java.lang.String r0 = r13.getAttributeValue(r8, r0)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x0039
            r17 = r6
            goto L_0x003f
        L_0x0039:
            long r0 = defpackage.t0g.G(r0)
            r17 = r0
        L_0x003f:
            java.lang.String r0 = "mediaPresentationDuration"
            long r19 = i(r13, r0, r6)
            java.lang.String r0 = "minBufferTime"
            long r21 = i(r13, r0, r6)
            java.lang.String r0 = "type"
            java.lang.String r0 = r13.getAttributeValue(r8, r0)
            java.lang.String r1 = "dynamic"
            boolean r23 = r1.equals(r0)
            if (r23 == 0) goto L_0x0062
            java.lang.String r0 = "minimumUpdatePeriod"
            long r0 = i(r13, r0, r6)
            r24 = r0
            goto L_0x0064
        L_0x0062:
            r24 = r6
        L_0x0064:
            if (r23 == 0) goto L_0x006f
            java.lang.String r0 = "timeShiftBufferDepth"
            long r0 = i(r13, r0, r6)
            r26 = r0
            goto L_0x0071
        L_0x006f:
            r26 = r6
        L_0x0071:
            if (r23 == 0) goto L_0x007c
            java.lang.String r0 = "suggestedPresentationDelay"
            long r0 = i(r13, r0, r6)
            r28 = r0
            goto L_0x007e
        L_0x007c:
            r28 = r6
        L_0x007e:
            java.lang.String r0 = "publishTime"
            java.lang.String r0 = r13.getAttributeValue(r8, r0)
            if (r0 != 0) goto L_0x0089
            r30 = r6
            goto L_0x008f
        L_0x0089:
            long r0 = defpackage.t0g.G(r0)
            r30 = r0
        L_0x008f:
            if (r23 == 0) goto L_0x0094
            r0 = 0
            goto L_0x0095
        L_0x0094:
            r0 = r6
        L_0x0095:
            ll0 r2 = new ll0
            java.lang.String r3 = r158.toString()
            java.lang.String r4 = r158.toString()
            if (r9 == 0) goto L_0x00a3
            r5 = r10
            goto L_0x00a5
        L_0x00a3:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a5:
            r2.<init>(r3, r4, r5, r10)
            ll0[] r2 = new defpackage.ll0[]{r2}
            java.util.ArrayList r4 = defpackage.gsg.q(r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r23 == 0) goto L_0x00bf
            r34 = r6
            goto L_0x00c1
        L_0x00bf:
            r34 = 0
        L_0x00c1:
            r37 = r8
            r38 = r37
            r39 = r38
            r40 = r39
            r36 = r11
            r14 = r34
            r35 = r36
        L_0x00cf:
            r157.next()
            java.lang.String r3 = "BaseURL"
            boolean r41 = defpackage.fqc.B(r13, r3)
            if (r41 == 0) goto L_0x0101
            if (r35 != 0) goto L_0x00e2
            long r0 = d(r13, r0)
            r35 = r10
        L_0x00e2:
            java.util.ArrayList r3 = e(r13, r4, r9)
            r2.addAll(r3)
            r84 = r2
            r32 = r4
            r2 = r5
            r33 = r6
            r80 = r9
            r105 = r10
            r41 = r11
            r54 = r14
            r58 = 4
            r69 = -1
            r70 = 0
        L_0x00fe:
            r14 = r13
            goto L_0x12dc
        L_0x0101:
            java.lang.String r10 = "ProgramInformation"
            boolean r42 = defpackage.fqc.B(r13, r10)
            java.lang.String r12 = "lang"
            if (r42 == 0) goto L_0x0185
            java.lang.String r3 = "moreInformationURL"
            java.lang.String r3 = r13.getAttributeValue(r8, r3)
            if (r3 != 0) goto L_0x0116
            r48 = r8
            goto L_0x0118
        L_0x0116:
            r48 = r3
        L_0x0118:
            java.lang.String r3 = r13.getAttributeValue(r8, r12)
            if (r3 != 0) goto L_0x0121
            r49 = r8
            goto L_0x0123
        L_0x0121:
            r49 = r3
        L_0x0123:
            r3 = r8
            r12 = r3
            r37 = r12
        L_0x0127:
            r157.next()
            java.lang.String r11 = "Title"
            boolean r11 = defpackage.fqc.B(r13, r11)
            if (r11 == 0) goto L_0x0137
            java.lang.String r3 = r157.nextText()
            goto L_0x0157
        L_0x0137:
            java.lang.String r11 = "Source"
            boolean r11 = defpackage.fqc.B(r13, r11)
            if (r11 == 0) goto L_0x0145
            java.lang.String r11 = r157.nextText()
            r12 = r11
            goto L_0x0157
        L_0x0145:
            java.lang.String r11 = "Copyright"
            boolean r11 = defpackage.fqc.B(r13, r11)
            if (r11 == 0) goto L_0x0154
            java.lang.String r11 = r157.nextText()
            r37 = r11
            goto L_0x0157
        L_0x0154:
            b(r157)
        L_0x0157:
            boolean r11 = defpackage.fqc.z(r13, r10)
            if (r11 == 0) goto L_0x0183
            l7c r10 = new l7c
            r44 = r10
            r45 = r3
            r46 = r12
            r47 = r37
            r44.<init>(r45, r46, r47, r48, r49)
            r84 = r2
            r32 = r4
            r2 = r5
            r33 = r6
            r80 = r9
            r37 = r10
            r54 = r14
        L_0x0177:
            r41 = 0
            r58 = 4
            r69 = -1
            r70 = 0
            r105 = 1
            goto L_0x00fe
        L_0x0183:
            r11 = 0
            goto L_0x0127
        L_0x0185:
            java.lang.String r10 = "UTCTiming"
            boolean r10 = defpackage.fqc.B(r13, r10)
            java.lang.String r11 = "value"
            java.lang.String r6 = "schemeIdUri"
            if (r10 == 0) goto L_0x01b1
            java.lang.String r3 = r13.getAttributeValue(r8, r6)
            java.lang.String r6 = r13.getAttributeValue(r8, r11)
            ata r7 = new ata
            r10 = 29
            r7.<init>(r10, r3, r6)
            r84 = r2
            r32 = r4
            r2 = r5
            r38 = r7
        L_0x01a7:
            r80 = r9
            r54 = r14
        L_0x01ab:
            r33 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0177
        L_0x01b1:
            java.lang.String r7 = "Location"
            boolean r7 = defpackage.fqc.B(r13, r7)
            if (r7 == 0) goto L_0x01cd
            java.lang.String r3 = r158.toString()
            java.lang.String r6 = r157.nextText()
            android.net.Uri r3 = defpackage.tf6.k0(r3, r6)
            r84 = r2
            r39 = r3
            r32 = r4
            r2 = r5
            goto L_0x01a7
        L_0x01cd:
            java.lang.String r7 = "ServiceDescription"
            boolean r10 = defpackage.fqc.B(r13, r7)
            if (r10 == 0) goto L_0x0274
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r46 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r48 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01ea:
            r157.next()
            java.lang.String r10 = "Latency"
            boolean r10 = defpackage.fqc.B(r13, r10)
            java.lang.String r8 = "max"
            r52 = r0
            java.lang.String r0 = "min"
            if (r10 == 0) goto L_0x0219
            java.lang.String r1 = "target"
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r46 = l(r13, r1, r10)
            long r0 = l(r13, r0, r10)
            long r48 = l(r13, r8, r10)
            r57 = r0
            r61 = r3
            r62 = r6
            r55 = r46
        L_0x0216:
            r59 = r48
            goto L_0x0249
        L_0x0219:
            java.lang.String r1 = "PlaybackRate"
            boolean r1 = defpackage.fqc.B(r13, r1)
            if (r1 == 0) goto L_0x0240
            r1 = 0
            java.lang.String r0 = r13.getAttributeValue(r1, r0)
            if (r0 != 0) goto L_0x022c
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x0231
        L_0x022c:
            float r0 = java.lang.Float.parseFloat(r0)
            r3 = r0
        L_0x0231:
            java.lang.String r0 = r13.getAttributeValue(r1, r8)
            if (r0 != 0) goto L_0x023b
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x0240
        L_0x023b:
            float r0 = java.lang.Float.parseFloat(r0)
            r6 = r0
        L_0x0240:
            r61 = r3
            r62 = r6
            r55 = r11
            r57 = r46
            goto L_0x0216
        L_0x0249:
            boolean r0 = defpackage.fqc.z(r13, r7)
            if (r0 == 0) goto L_0x0265
            uq8 r0 = new uq8
            r54 = r0
            r54.<init>(r55, r57, r59, r61, r62)
            r40 = r0
            r84 = r2
            r32 = r4
            r2 = r5
            r80 = r9
            r54 = r14
            r0 = r52
            goto L_0x01ab
        L_0x0265:
            r0 = r52
            r11 = r55
            r46 = r57
            r48 = r59
            r3 = r61
            r6 = r62
            r8 = 0
            goto L_0x01ea
        L_0x0274:
            r52 = r0
            java.lang.String r10 = "Period"
            boolean r0 = defpackage.fqc.B(r13, r10)
            if (r0 == 0) goto L_0x12bd
            if (r36 != 0) goto L_0x12bd
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0288
            r8 = r2
            goto L_0x0289
        L_0x0288:
            r8 = r4
        L_0x0289:
            java.lang.String r7 = "id"
            r0 = 0
            java.lang.String r47 = r13.getAttributeValue(r0, r7)
            java.lang.String r0 = "start"
            long r48 = i(r13, r0, r14)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r44 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r44 == 0) goto L_0x02a4
            long r44 = r17 + r48
        L_0x02a1:
            r54 = r14
            goto L_0x02a7
        L_0x02a4:
            r44 = r0
            goto L_0x02a1
        L_0x02a7:
            java.lang.String r14 = "duration"
            long r56 = i(r13, r14, r0)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r46 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r58 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r59 = r0
            r63 = r10
            r62 = r11
            r10 = r52
            r50 = 0
            r61 = 0
        L_0x02cc:
            r157.next()
            boolean r64 = defpackage.fqc.B(r13, r3)
            if (r64 == 0) goto L_0x0313
            if (r61 != 0) goto L_0x02dd
            long r10 = d(r13, r10)
            r61 = 1
        L_0x02dd:
            java.util.ArrayList r0 = e(r13, r8, r9)
            r14.addAll(r0)
            r84 = r2
            r89 = r3
            r32 = r4
            r82 = r5
            r93 = r8
            r80 = r9
            r43 = r12
            r79 = r14
            r42 = r15
            r64 = r52
            r52 = r58
            r0 = r63
            r33 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r41 = 0
            r58 = 4
            r69 = -1
            r70 = 0
            r105 = 1
            r15 = r6
            r53 = r7
            r14 = r13
            r13 = r62
            goto L_0x1232
        L_0x0313:
            java.lang.String r1 = "AdaptationSet"
            boolean r0 = defpackage.fqc.B(r13, r1)
            java.lang.String r66 = ""
            r67 = r15
            java.lang.String r15 = "SegmentBase"
            r69 = r10
            java.lang.String r10 = "SegmentList"
            java.lang.String r11 = "SegmentTemplate"
            if (r0 == 0) goto L_0x0f76
            boolean r0 = r14.isEmpty()
            r71 = r1
            if (r0 != 0) goto L_0x0332
            r0 = r14
        L_0x0330:
            r1 = -1
            goto L_0x0334
        L_0x0332:
            r0 = r8
            goto L_0x0330
        L_0x0334:
            int r73 = k(r13, r7, r1)
            int r72 = g(r157)
            java.lang.String r1 = "mimeType"
            r74 = r2
            r2 = 0
            java.lang.String r75 = r13.getAttributeValue(r2, r1)
            r79 = r14
            java.lang.String r14 = "codecs"
            java.lang.String r76 = r13.getAttributeValue(r2, r14)
            java.lang.String r2 = "width"
            r77 = r4
            r78 = r11
            r4 = -1
            int r11 = k(r13, r2, r4)
            r80 = r8
            java.lang.String r8 = "height"
            r81 = r6
            int r6 = k(r13, r8, r4)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = j(r13, r4)
            r82 = r5
            java.lang.String r5 = "audioSamplingRate"
            r83 = r10
            r84 = r15
            r10 = -1
            int r15 = k(r13, r5, r10)
            r10 = 0
            java.lang.String r85 = r13.getAttributeValue(r10, r12)
            r86 = r5
            java.lang.String r5 = "label"
            java.lang.String r5 = r13.getAttributeValue(r10, r5)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r87 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r88 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r89 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r90 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r91 = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r92 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r93 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r94 = r2
            r98 = r6
            r97 = r7
            r95 = r11
            r99 = r50
            r100 = r59
            r6 = r69
            r2 = r72
            r11 = r85
            r72 = -1
            r85 = 0
            r96 = 0
        L_0x03d0:
            r157.next()
            boolean r102 = defpackage.fqc.B(r13, r3)
            if (r102 == 0) goto L_0x043e
            if (r96 != 0) goto L_0x03e4
            long r6 = d(r13, r6)
            r102 = r6
            r96 = 1
            goto L_0x03e6
        L_0x03e4:
            r102 = r6
        L_0x03e6:
            java.util.ArrayList r6 = e(r13, r0, r9)
            r8.addAll(r6)
        L_0x03ed:
            r144 = r10
            r43 = r12
            r113 = r14
            r64 = r52
            r141 = r62
            r142 = r63
            r62 = r69
            r32 = r77
            r155 = r78
            r137 = r81
            r143 = r83
            r77 = r86
            r126 = r89
            r33 = r90
            r52 = r91
            r139 = r93
            r127 = r94
            r42 = r95
            r138 = r97
            r53 = r98
            r6 = r102
            r12 = 4
            r41 = 0
            r105 = 1
            r83 = r0
            r89 = r3
            r98 = r8
            r14 = r13
            r0 = r71
            r93 = r80
            r3 = r88
            r94 = r92
            r71 = r1
            r88 = r4
            r13 = r5
            r80 = r9
            r4 = r87
            r156 = r74
            r74 = r15
            r15 = r84
            r84 = r156
            goto L_0x0df9
        L_0x043e:
            r102 = r6
            java.lang.String r6 = "ContentProtection"
            boolean r7 = defpackage.fqc.B(r13, r6)
            if (r7 == 0) goto L_0x045e
            android.util.Pair r6 = f(r157)
            java.lang.Object r7 = r6.first
            if (r7 == 0) goto L_0x0454
            r85 = r7
            java.lang.String r85 = (java.lang.String) r85
        L_0x0454:
            java.lang.Object r6 = r6.second
            if (r6 == 0) goto L_0x03ed
            vv4 r6 = (defpackage.vv4) r6
            r10.add(r6)
            goto L_0x03ed
        L_0x045e:
            java.lang.String r7 = "ContentComponent"
            boolean r7 = defpackage.fqc.B(r13, r7)
            if (r7 == 0) goto L_0x0491
            r7 = 0
            java.lang.String r6 = r13.getAttributeValue(r7, r12)
            if (r11 != 0) goto L_0x046f
            r11 = r6
            goto L_0x0479
        L_0x046f:
            if (r6 != 0) goto L_0x0472
            goto L_0x0479
        L_0x0472:
            boolean r6 = r11.equals(r6)
            defpackage.y64.j(r6)
        L_0x0479:
            int r6 = g(r157)
            r7 = -1
            if (r2 != r7) goto L_0x0483
            r2 = r6
            goto L_0x03ed
        L_0x0483:
            if (r6 != r7) goto L_0x0487
            goto L_0x03ed
        L_0x0487:
            if (r2 != r6) goto L_0x048b
            r6 = 1
            goto L_0x048c
        L_0x048b:
            r6 = 0
        L_0x048c:
            defpackage.y64.j(r6)
            goto L_0x03ed
        L_0x0491:
            java.lang.String r7 = "Role"
            boolean r104 = defpackage.fqc.B(r13, r7)
            if (r104 == 0) goto L_0x04f3
            nm4 r6 = h(r13, r7)
            r15.add(r6)
            r51 = r2
            r144 = r10
            r145 = r11
            r43 = r12
            r113 = r14
            r64 = r52
            r141 = r62
            r142 = r63
            r62 = r69
            r133 = r71
            r32 = r77
            r155 = r78
            r137 = r81
            r143 = r83
            r77 = r86
            r126 = r89
            r33 = r90
            r52 = r91
            r139 = r93
            r127 = r94
            r42 = r95
            r138 = r97
            r53 = r98
            r12 = 4
            r41 = 0
            r105 = 1
            r83 = r0
        L_0x04d5:
            r71 = r1
            r89 = r3
            r98 = r8
            r14 = r13
            r93 = r80
            r3 = r88
            r94 = r92
            r0 = r100
            r88 = r4
            r13 = r5
            r80 = r9
            r156 = r74
            r74 = r15
            r15 = r84
            r84 = r156
            goto L_0x0df2
        L_0x04f3:
            java.lang.String r7 = "AudioChannelConfiguration"
            boolean r104 = defpackage.fqc.B(r13, r7)
            if (r104 == 0) goto L_0x0503
            int r6 = c(r157)
            r72 = r6
            goto L_0x03ed
        L_0x0503:
            r104 = r0
            java.lang.String r0 = "Accessibility"
            boolean r105 = defpackage.fqc.B(r13, r0)
            if (r105 == 0) goto L_0x054a
            nm4 r0 = h(r13, r0)
            r5.add(r0)
        L_0x0514:
            r51 = r2
            r144 = r10
            r145 = r11
            r43 = r12
            r113 = r14
            r64 = r52
            r141 = r62
            r142 = r63
            r62 = r69
            r133 = r71
            r32 = r77
            r155 = r78
            r137 = r81
            r143 = r83
            r77 = r86
            r126 = r89
            r33 = r90
            r52 = r91
            r139 = r93
            r127 = r94
            r42 = r95
            r138 = r97
            r53 = r98
            r83 = r104
            r12 = 4
            r41 = 0
            r105 = 1
            goto L_0x04d5
        L_0x054a:
            java.lang.String r0 = "EssentialProperty"
            boolean r105 = defpackage.fqc.B(r13, r0)
            if (r105 == 0) goto L_0x055a
            nm4 r0 = h(r13, r0)
            r4.add(r0)
            goto L_0x0514
        L_0x055a:
            r105 = r15
            java.lang.String r15 = "SupplementalProperty"
            boolean r106 = defpackage.fqc.B(r13, r15)
            if (r106 == 0) goto L_0x05be
            nm4 r0 = h(r13, r15)
            r6 = r98
            r6.add(r0)
            r51 = r2
            r98 = r8
            r144 = r10
            r145 = r11
            r43 = r12
            r113 = r14
            r64 = r52
            r141 = r62
            r142 = r63
            r62 = r69
            r133 = r71
            r32 = r77
            r155 = r78
            r137 = r81
            r143 = r83
            r15 = r84
            r77 = r86
            r126 = r89
            r33 = r90
            r52 = r91
            r139 = r93
            r127 = r94
            r42 = r95
            r138 = r97
            r83 = r104
            r12 = 4
            r41 = 0
            r71 = r1
            r89 = r3
            r53 = r6
            r14 = r13
            r84 = r74
            r93 = r80
            r3 = r88
            r94 = r92
            r0 = r100
            r74 = r105
            r105 = 1
            r88 = r4
            r13 = r5
            r80 = r9
            goto L_0x0df2
        L_0x05be:
            r106 = r15
            r156 = r98
            r98 = r6
            r6 = r156
            java.lang.String r15 = "Representation"
            boolean r107 = defpackage.fqc.B(r13, r15)
            r108 = r15
            java.lang.String r15 = "InbandEventStream"
            if (r107 == 0) goto L_0x0cc8
            boolean r107 = r8.isEmpty()
            if (r107 != 0) goto L_0x05e6
            r107 = r8
            r51 = r10
            r109 = r12
            r10 = r97
            r97 = r15
            r8 = 0
            r15 = r107
            goto L_0x05f3
        L_0x05e6:
            r107 = r8
            r51 = r10
            r109 = r12
            r10 = r97
            r8 = 0
            r97 = r15
            r15 = r104
        L_0x05f3:
            java.lang.String r12 = r13.getAttributeValue(r8, r10)
            java.lang.String r8 = "bandwidth"
            r111 = r12
            r12 = -1
            int r8 = k(r13, r8, r12)
            r12 = 0
            java.lang.String r110 = r13.getAttributeValue(r12, r1)
            if (r110 != 0) goto L_0x060a
            r112 = r75
            goto L_0x060c
        L_0x060a:
            r112 = r110
        L_0x060c:
            java.lang.String r110 = r13.getAttributeValue(r12, r14)
            r113 = r14
            if (r110 != 0) goto L_0x0616
            r110 = r76
        L_0x0616:
            r12 = r94
            r156 = r95
            r95 = r10
            r10 = r156
            int r14 = k(r13, r12, r10)
            r114 = r8
            r8 = r92
            r92 = r14
            r156 = r91
            r91 = r10
            r10 = r156
            int r14 = k(r13, r8, r10)
            r115 = r5
            r5 = r90
            r90 = r14
            float r14 = j(r13, r5)
            r116 = r5
            r5 = r86
            r86 = r14
            r14 = r89
            r89 = r12
            int r12 = k(r13, r5, r14)
            r126 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r122 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r123 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r4)
            r124 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r6)
            r125 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r128 = r0
            r127 = r1
            r120 = r10
            r119 = r11
            r129 = r72
            r121 = r99
            r0 = r100
            r10 = r102
            r117 = 0
            r118 = 0
        L_0x0681:
            r157.next()
            boolean r130 = defpackage.fqc.B(r13, r3)
            if (r130 == 0) goto L_0x0704
            if (r118 != 0) goto L_0x0695
            long r10 = d(r13, r10)
            r130 = r2
            r118 = 1
            goto L_0x0697
        L_0x0695:
            r130 = r2
        L_0x0697:
            java.util.ArrayList r2 = e(r13, r15, r9)
            r14.addAll(r2)
        L_0x069e:
            r94 = r8
            r146 = r12
            r144 = r51
            r64 = r52
            r141 = r62
            r142 = r63
            r62 = r69
            r133 = r71
            r32 = r77
            r137 = r81
            r143 = r83
            r135 = r84
            r136 = r88
            r42 = r91
            r139 = r93
            r138 = r95
            r2 = r97
            r83 = r104
            r43 = r109
            r140 = r114
            r33 = r116
            r8 = r117
            r145 = r119
            r52 = r120
            r71 = r127
            r12 = r129
            r134 = r130
            r41 = 0
            r69 = r0
            r88 = r4
            r77 = r5
            r53 = r6
            r95 = r7
            r81 = r14
            r104 = r15
            r84 = r74
            r93 = r80
            r127 = r89
            r14 = r98
            r6 = r106
            r98 = r107
            r0 = r108
            r15 = r111
            r5 = r123
            r7 = r124
            r4 = r128
            r89 = r3
            r80 = r9
            r3 = r122
            r9 = r125
            goto L_0x08da
        L_0x0704:
            r130 = r2
            boolean r2 = defpackage.fqc.B(r13, r7)
            if (r2 == 0) goto L_0x0711
            int r129 = c(r157)
            goto L_0x069e
        L_0x0711:
            r2 = r84
            boolean r84 = defpackage.fqc.B(r13, r2)
            if (r84 == 0) goto L_0x0725
            r84 = r2
            r2 = r121
            rod r2 = (defpackage.rod) r2
            rod r121 = q(r13, r2)
            goto L_0x069e
        L_0x0725:
            r84 = r2
            r2 = r83
            boolean r83 = defpackage.fqc.B(r13, r2)
            if (r83 == 0) goto L_0x07bb
            long r131 = d(r13, r0)
            r1 = r121
            lod r1 = (defpackage.lod) r1
            r64 = r52
            r83 = r104
            r52 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r104 = r15
            r15 = r128
            r0 = r157
            r133 = r71
            r71 = r127
            r135 = r84
            r127 = r89
            r134 = r130
            r89 = r3
            r84 = r74
            r74 = r2
            r2 = r44
            r32 = r77
            r136 = r88
            r33 = r116
            r88 = r4
            r77 = r5
            r4 = r56
            r53 = r6
            r137 = r81
            r138 = r95
            r52 = r120
            r95 = r7
            r81 = r14
            r14 = r98
            r6 = r10
            r94 = r8
            r139 = r93
            r98 = r107
            r140 = r114
            r93 = r80
            r80 = r9
            r8 = r131
            r144 = r51
            r141 = r62
            r142 = r63
            r62 = r69
            r143 = r74
            r15 = r78
            r42 = r91
            r145 = r119
            r41 = 0
            r69 = r10
            r10 = r26
            lod r121 = r(r0, r1, r2, r4, r6, r8, r10)
            r146 = r12
            r10 = r69
            r2 = r97
            r6 = r106
            r0 = r108
            r43 = r109
            r15 = r111
            r8 = r117
            r3 = r122
            r5 = r123
            r7 = r124
            r9 = r125
            r4 = r128
            r12 = r129
            r69 = r131
            goto L_0x08da
        L_0x07bb:
            r143 = r2
            r94 = r8
            r144 = r51
            r64 = r52
            r141 = r62
            r142 = r63
            r62 = r69
            r133 = r71
            r32 = r77
            r137 = r81
            r135 = r84
            r136 = r88
            r42 = r91
            r139 = r93
            r138 = r95
            r83 = r104
            r140 = r114
            r33 = r116
            r145 = r119
            r52 = r120
            r71 = r127
            r134 = r130
            r41 = 0
            r88 = r4
            r77 = r5
            r53 = r6
            r95 = r7
            r69 = r10
            r81 = r14
            r104 = r15
            r84 = r74
            r15 = r78
            r93 = r80
            r127 = r89
            r14 = r98
            r98 = r107
            r89 = r3
            r80 = r9
            boolean r2 = defpackage.fqc.B(r13, r15)
            if (r2 == 0) goto L_0x0849
            long r119 = d(r13, r0)
            r1 = r121
            nod r1 = (defpackage.nod) r1
            r0 = r157
            r2 = r53
            r3 = r44
            r5 = r56
            r7 = r69
            r9 = r119
            r146 = r12
            r78 = r15
            r43 = r109
            r15 = r111
            r11 = r26
            nod r121 = t(r0, r1, r2, r3, r5, r7, r9, r11)
            r10 = r69
            r2 = r97
            r6 = r106
            r0 = r108
            r8 = r117
            r69 = r119
            r3 = r122
            r5 = r123
            r7 = r124
            r9 = r125
            r4 = r128
            r12 = r129
            goto L_0x08da
        L_0x0849:
            r146 = r12
            r78 = r15
            r43 = r109
            r15 = r111
            boolean r2 = defpackage.fqc.B(r13, r14)
            if (r2 == 0) goto L_0x0888
            android.util.Pair r2 = f(r157)
            java.lang.Object r3 = r2.first
            if (r3 == 0) goto L_0x0863
            r117 = r3
            java.lang.String r117 = (java.lang.String) r117
        L_0x0863:
            java.lang.Object r2 = r2.second
            if (r2 == 0) goto L_0x086f
            vv4 r2 = (defpackage.vv4) r2
            r3 = r122
            r3.add(r2)
            goto L_0x0871
        L_0x086f:
            r3 = r122
        L_0x0871:
            r10 = r69
            r2 = r97
            r6 = r106
            r8 = r117
            r5 = r123
            r7 = r124
            r9 = r125
            r4 = r128
        L_0x0881:
            r12 = r129
            r69 = r0
            r0 = r108
            goto L_0x08da
        L_0x0888:
            r2 = r97
            r3 = r122
            boolean r4 = defpackage.fqc.B(r13, r2)
            if (r4 == 0) goto L_0x08a4
            nm4 r4 = h(r13, r2)
            r5 = r123
            r5.add(r4)
            r6 = r106
            r7 = r124
            r9 = r125
            r4 = r128
            goto L_0x08d5
        L_0x08a4:
            r5 = r123
            r4 = r128
            boolean r6 = defpackage.fqc.B(r13, r4)
            if (r6 == 0) goto L_0x08bc
            nm4 r6 = h(r13, r4)
            r7 = r124
            r7.add(r6)
            r6 = r106
            r9 = r125
            goto L_0x08d5
        L_0x08bc:
            r6 = r106
            r7 = r124
            boolean r8 = defpackage.fqc.B(r13, r6)
            if (r8 == 0) goto L_0x08d0
            nm4 r8 = h(r13, r6)
            r9 = r125
            r9.add(r8)
            goto L_0x08d5
        L_0x08d0:
            r9 = r125
            b(r157)
        L_0x08d5:
            r10 = r69
            r8 = r117
            goto L_0x0881
        L_0x08da:
            boolean r1 = defpackage.fqc.z(r13, r0)
            if (r1 == 0) goto L_0x0c52
            boolean r0 = defpackage.uq9.h(r112)
            java.lang.String r1 = "image"
            if (r0 == 0) goto L_0x090f
            if (r110 != 0) goto L_0x08ed
            r0 = 0
        L_0x08eb:
            r4 = 1
            goto L_0x090b
        L_0x08ed:
            java.lang.String[] r0 = defpackage.t0g.L(r110)
            int r2 = r0.length
            r11 = r41
        L_0x08f4:
            if (r11 >= r2) goto L_0x0909
            r4 = r0[r11]
            java.lang.String r4 = defpackage.uq9.c(r4)
            if (r4 == 0) goto L_0x0906
            boolean r6 = defpackage.uq9.h(r4)
            if (r6 == 0) goto L_0x0906
            r0 = r4
            goto L_0x08eb
        L_0x0906:
            r4 = 1
            int r11 = r11 + r4
            goto L_0x08f4
        L_0x0909:
            r4 = 1
            r0 = 0
        L_0x090b:
            r2 = r112
            goto L_0x098d
        L_0x090f:
            r4 = 1
            boolean r0 = defpackage.uq9.j(r112)
            if (r0 == 0) goto L_0x0936
            if (r110 != 0) goto L_0x091a
        L_0x0918:
            r6 = 0
            goto L_0x0934
        L_0x091a:
            java.lang.String[] r0 = defpackage.t0g.L(r110)
            int r2 = r0.length
            r11 = r41
        L_0x0921:
            if (r11 >= r2) goto L_0x0918
            r6 = r0[r11]
            java.lang.String r6 = defpackage.uq9.c(r6)
            if (r6 == 0) goto L_0x0932
            boolean r10 = defpackage.uq9.j(r6)
            if (r10 == 0) goto L_0x0932
            goto L_0x0934
        L_0x0932:
            int r11 = r11 + r4
            goto L_0x0921
        L_0x0934:
            r0 = r6
            goto L_0x090b
        L_0x0936:
            boolean r0 = defpackage.uq9.i(r112)
            if (r0 == 0) goto L_0x0968
            java.lang.String r0 = "application/x-rawcc"
            r2 = r112
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0966
            if (r110 != 0) goto L_0x094a
        L_0x0948:
            r10 = 0
            goto L_0x0964
        L_0x094a:
            java.lang.String[] r0 = defpackage.t0g.L(r110)
            int r6 = r0.length
            r11 = r41
        L_0x0951:
            if (r11 >= r6) goto L_0x0948
            r10 = r0[r11]
            java.lang.String r10 = defpackage.uq9.c(r10)
            if (r10 == 0) goto L_0x0962
            boolean r14 = defpackage.uq9.i(r10)
            if (r14 == 0) goto L_0x0962
            goto L_0x0964
        L_0x0962:
            int r11 = r11 + r4
            goto L_0x0951
        L_0x0964:
            r0 = r10
            goto L_0x098d
        L_0x0966:
            r0 = r2
            goto L_0x098d
        L_0x0968:
            r2 = r112
            java.lang.String r0 = defpackage.uq9.f(r2)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0975
            goto L_0x0966
        L_0x0975:
            java.lang.String r0 = "application/mp4"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x098c
            java.lang.String r0 = defpackage.uq9.c(r110)
            java.lang.String r6 = "text/vtt"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x098d
            java.lang.String r0 = "application/x-mp4-vtt"
            goto L_0x098d
        L_0x098c:
            r0 = 0
        L_0x098d:
            java.lang.String r6 = "audio/eac3"
            boolean r10 = r6.equals(r0)
            if (r10 == 0) goto L_0x09de
            r11 = r41
        L_0x0997:
            int r0 = r9.size()
            java.lang.String r10 = "audio/eac3-joc"
            java.lang.String r14 = "ec+3"
            if (r11 >= r0) goto L_0x09d3
            java.lang.Object r0 = r9.get(r11)
            nm4 r0 = (defpackage.nm4) r0
            java.lang.String r4 = r0.a
            r51 = r6
            java.lang.String r6 = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018"
            boolean r6 = r6.equals(r4)
            java.lang.String r0 = r0.b
            if (r6 == 0) goto L_0x09bd
            java.lang.String r6 = "JOC"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x09cb
        L_0x09bd:
            java.lang.String r6 = "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x09cd
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x09cd
        L_0x09cb:
            r0 = r10
            goto L_0x09d7
        L_0x09cd:
            r0 = 1
            int r11 = r11 + r0
            r4 = r0
            r6 = r51
            goto L_0x0997
        L_0x09d3:
            r51 = r6
            r0 = r51
        L_0x09d7:
            boolean r4 = r10.equals(r0)
            if (r4 == 0) goto L_0x09de
            goto L_0x09e0
        L_0x09de:
            r14 = r110
        L_0x09e0:
            r4 = r41
            r11 = r4
        L_0x09e3:
            int r6 = r105.size()
            java.lang.String r10 = "urn:mpeg:dash:role:2011"
            if (r11 >= r6) goto L_0x0a22
            r6 = r105
            java.lang.Object r51 = r6.get(r11)
            r13 = r51
            nm4 r13 = (defpackage.nm4) r13
            r123 = r5
            java.lang.String r5 = r13.a
            boolean r5 = defpackage.o54.l(r10, r5)
            if (r5 == 0) goto L_0x0a19
            java.lang.String r5 = r13.b
            if (r5 != 0) goto L_0x0a06
        L_0x0a03:
            r5 = r41
            goto L_0x0a18
        L_0x0a06:
            java.lang.String r10 = "forced_subtitle"
            boolean r10 = r5.equals(r10)
            if (r10 != 0) goto L_0x0a17
            java.lang.String r10 = "forced-subtitle"
            boolean r5 = r5.equals(r10)
            if (r5 != 0) goto L_0x0a17
            goto L_0x0a03
        L_0x0a17:
            r5 = 2
        L_0x0a18:
            r4 = r4 | r5
        L_0x0a19:
            r5 = 1
            int r11 = r11 + r5
            r13 = r157
            r105 = r6
            r5 = r123
            goto L_0x09e3
        L_0x0a22:
            r123 = r5
            r6 = r105
            r5 = r41
            r11 = r5
        L_0x0a29:
            int r13 = r6.size()
            if (r11 >= r13) goto L_0x0a4b
            java.lang.Object r13 = r6.get(r11)
            nm4 r13 = (defpackage.nm4) r13
            r105 = r6
            java.lang.String r6 = r13.a
            boolean r6 = defpackage.o54.l(r10, r6)
            if (r6 == 0) goto L_0x0a46
            java.lang.String r6 = r13.b
            int r6 = o(r6)
            r5 = r5 | r6
        L_0x0a46:
            r6 = 1
            int r11 = r11 + r6
            r6 = r105
            goto L_0x0a29
        L_0x0a4b:
            r105 = r6
            r6 = r41
            r11 = r6
        L_0x0a50:
            int r13 = r115.size()
            if (r11 >= r13) goto L_0x0ae6
            r13 = r115
            java.lang.Object r51 = r13.get(r11)
            r122 = r3
            r3 = r51
            nm4 r3 = (defpackage.nm4) r3
            r51 = r8
            java.lang.String r8 = r3.a
            boolean r8 = defpackage.o54.l(r10, r8)
            r69 = r10
            java.lang.String r10 = r3.b
            if (r8 == 0) goto L_0x0a79
            int r3 = o(r10)
            r3 = r3 | r6
        L_0x0a75:
            r6 = r3
        L_0x0a76:
            r3 = 1
            goto L_0x0adb
        L_0x0a79:
            java.lang.String r8 = "urn:tva:metadata:cs:AudioPurposeCS:2007"
            java.lang.String r3 = r3.a
            boolean r3 = defpackage.o54.l(r8, r3)
            if (r3 == 0) goto L_0x0a76
            if (r10 != 0) goto L_0x0a88
        L_0x0a85:
            r10 = r41
            goto L_0x0ad8
        L_0x0a88:
            int r3 = r10.hashCode()
            switch(r3) {
                case 49: goto L_0x0abd;
                case 50: goto L_0x0ab2;
                case 51: goto L_0x0aa7;
                case 52: goto L_0x0a9c;
                case 53: goto L_0x0a8f;
                case 54: goto L_0x0a91;
                default: goto L_0x0a8f;
            }
        L_0x0a8f:
            r3 = -1
            goto L_0x0ac8
        L_0x0a91:
            java.lang.String r3 = "6"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0a9a
            goto L_0x0a8f
        L_0x0a9a:
            r3 = 4
            goto L_0x0ac8
        L_0x0a9c:
            java.lang.String r3 = "4"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0aa5
            goto L_0x0a8f
        L_0x0aa5:
            r3 = 3
            goto L_0x0ac8
        L_0x0aa7:
            java.lang.String r3 = "3"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0ab0
            goto L_0x0a8f
        L_0x0ab0:
            r3 = 2
            goto L_0x0ac8
        L_0x0ab2:
            java.lang.String r3 = "2"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0abb
            goto L_0x0a8f
        L_0x0abb:
            r3 = 1
            goto L_0x0ac8
        L_0x0abd:
            java.lang.String r3 = "1"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0ac6
            goto L_0x0a8f
        L_0x0ac6:
            r3 = r41
        L_0x0ac8:
            switch(r3) {
                case 0: goto L_0x0ad6;
                case 1: goto L_0x0ad3;
                case 2: goto L_0x0ad1;
                case 3: goto L_0x0ace;
                case 4: goto L_0x0acc;
                default: goto L_0x0acb;
            }
        L_0x0acb:
            goto L_0x0a85
        L_0x0acc:
            r10 = 1
            goto L_0x0ad8
        L_0x0ace:
            r10 = 8
            goto L_0x0ad8
        L_0x0ad1:
            r10 = 4
            goto L_0x0ad8
        L_0x0ad3:
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0ad8
        L_0x0ad6:
            r10 = 512(0x200, float:7.175E-43)
        L_0x0ad8:
            r3 = r6 | r10
            goto L_0x0a75
        L_0x0adb:
            int r11 = r11 + r3
            r115 = r13
            r8 = r51
            r10 = r69
            r3 = r122
            goto L_0x0a50
        L_0x0ae6:
            r122 = r3
            r51 = r8
            r13 = r115
            r3 = r5 | r6
            int r5 = p(r7)
            r3 = r3 | r5
            int r5 = p(r9)
            r3 = r3 | r5
            aa6 r5 = new aa6
            r5.<init>()
            r5.a = r15
            r5.j = r2
            r5.k = r0
            r5.h = r14
            r8 = r140
            r5.g = r8
            r5.d = r4
            r5.e = r3
            r3 = r145
            r5.c = r3
            boolean r2 = defpackage.uq9.j(r0)
            if (r2 == 0) goto L_0x0b26
            r2 = r92
            r5.p = r2
            r4 = r90
            r5.q = r4
            r1 = r86
            r5.r = r1
        L_0x0b23:
            r6 = 1
            goto L_0x0be4
        L_0x0b26:
            r4 = r90
            r2 = r92
            boolean r6 = defpackage.uq9.h(r0)
            if (r6 == 0) goto L_0x0b37
            r5.x = r12
            r0 = r146
            r5.y = r0
            goto L_0x0b23
        L_0x0b37:
            boolean r6 = defpackage.uq9.i(r0)
            if (r6 == 0) goto L_0x0bd5
            java.lang.String r1 = "application/cea-608"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0b88
            r11 = r41
        L_0x0b47:
            int r0 = r13.size()
            if (r11 >= r0) goto L_0x0b85
            java.lang.Object r0 = r13.get(r11)
            nm4 r0 = (defpackage.nm4) r0
            java.lang.String r1 = r0.a
            java.lang.String r2 = "urn:scte:dash:cc:cea-608:2015"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0b82
            java.lang.String r0 = r0.b
            if (r0 == 0) goto L_0x0b82
            java.util.regex.Pattern r1 = c
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r2 = r1.matches()
            if (r2 == 0) goto L_0x0b77
            r2 = 1
            java.lang.String r0 = r1.group(r2)
            int r12 = java.lang.Integer.parseInt(r0)
            goto L_0x0b86
        L_0x0b77:
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0b82
            java.lang.String r1 = "Unable to parse CEA-608 channel number from: "
            r1.concat(r0)
        L_0x0b82:
            r0 = 1
            int r11 = r11 + r0
            goto L_0x0b47
        L_0x0b85:
            r12 = -1
        L_0x0b86:
            r6 = 1
            goto L_0x0bd2
        L_0x0b88:
            java.lang.String r1 = "application/cea-708"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0bd0
            r11 = r41
        L_0x0b92:
            int r0 = r13.size()
            if (r11 >= r0) goto L_0x0bd0
            java.lang.Object r0 = r13.get(r11)
            nm4 r0 = (defpackage.nm4) r0
            java.lang.String r1 = r0.a
            java.lang.String r2 = "urn:scte:dash:cc:cea-708:2015"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0bcd
            java.lang.String r0 = r0.b
            if (r0 == 0) goto L_0x0bcd
            java.util.regex.Pattern r1 = o
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r2 = r1.matches()
            if (r2 == 0) goto L_0x0bc2
            r2 = 1
            java.lang.String r0 = r1.group(r2)
            int r12 = java.lang.Integer.parseInt(r0)
            goto L_0x0b86
        L_0x0bc2:
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0bcd
            java.lang.String r1 = "Unable to parse CEA-708 service block number from: "
            r1.concat(r0)
        L_0x0bcd:
            r6 = 1
            int r11 = r11 + r6
            goto L_0x0b92
        L_0x0bd0:
            r6 = 1
            r12 = -1
        L_0x0bd2:
            r5.C = r12
            goto L_0x0be4
        L_0x0bd5:
            r6 = 1
            java.lang.String r0 = defpackage.uq9.f(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0be4
            r5.p = r2
            r5.q = r4
        L_0x0be4:
            ca6 r0 = new ca6
            r0.<init>(r5)
            if (r121 == 0) goto L_0x0bee
            r120 = r121
            goto L_0x0c01
        L_0x0bee:
            rod r1 = new rod
            r147 = 1
            r149 = 0
            r146 = 0
            r151 = 0
            r153 = 0
            r145 = r1
            r145.<init>(r146, r147, r149, r151, r153)
            r120 = r1
        L_0x0c01:
            z54 r1 = new z54
            boolean r2 = r81.isEmpty()
            if (r2 != 0) goto L_0x0c0c
            r119 = r81
            goto L_0x0c0e
        L_0x0c0c:
            r119 = r104
        L_0x0c0e:
            r117 = r1
            r118 = r0
            r121 = r51
            r124 = r7
            r125 = r9
            r117.<init>(r118, r119, r120, r121, r122, r123, r124, r125)
            java.lang.String r0 = r0.Z
            int r2 = defpackage.uq9.g(r0)
            r5 = r134
            r0 = -1
            if (r5 != r0) goto L_0x0c29
        L_0x0c26:
            r0 = r139
            goto L_0x0c37
        L_0x0c29:
            if (r2 != r0) goto L_0x0c2d
        L_0x0c2b:
            r2 = r5
            goto L_0x0c26
        L_0x0c2d:
            if (r5 != r2) goto L_0x0c31
            r10 = r6
            goto L_0x0c33
        L_0x0c31:
            r10 = r41
        L_0x0c33:
            defpackage.y64.j(r10)
            goto L_0x0c2b
        L_0x0c37:
            r0.add(r1)
            r14 = r157
            r139 = r0
            r11 = r3
            r155 = r78
            r4 = r87
            r74 = r105
            r0 = r133
            r15 = r135
            r3 = r136
            r12 = 4
            r105 = r6
            r6 = r102
            goto L_0x0df9
        L_0x0c52:
            r51 = r8
            r1 = r86
            r156 = r92
            r92 = r90
            r90 = r156
            r13 = r157
            r108 = r0
            r97 = r2
            r122 = r3
            r128 = r4
            r123 = r5
            r106 = r6
            r124 = r7
            r125 = r9
            r129 = r12
            r111 = r15
            r116 = r33
            r91 = r42
            r109 = r43
            r117 = r51
            r120 = r52
            r6 = r53
            r52 = r64
            r0 = r69
            r5 = r77
            r9 = r80
            r74 = r84
            r4 = r88
            r3 = r89
            r80 = r93
            r8 = r94
            r7 = r95
            r107 = r98
            r15 = r104
            r89 = r127
            r2 = r134
            r84 = r135
            r88 = r136
            r95 = r138
            r93 = r139
            r114 = r140
            r51 = r144
            r119 = r145
            r12 = r146
            r98 = r14
            r77 = r32
            r69 = r62
            r127 = r71
            r14 = r81
            r104 = r83
            r71 = r133
            r81 = r137
            r62 = r141
            r63 = r142
            r83 = r143
            r156 = r92
            r92 = r90
            r90 = r156
            goto L_0x0681
        L_0x0cc8:
            r98 = r8
            r144 = r10
            r43 = r12
            r12 = r13
            r113 = r14
            r64 = r52
            r141 = r62
            r142 = r63
            r62 = r69
            r133 = r71
            r32 = r77
            r137 = r81
            r143 = r83
            r10 = r84
            r77 = r86
            r136 = r88
            r126 = r89
            r33 = r90
            r52 = r91
            r139 = r93
            r127 = r94
            r42 = r95
            r138 = r97
            r83 = r104
            r41 = 0
            r71 = r1
            r89 = r3
            r88 = r4
            r13 = r5
            r53 = r6
            r3 = r11
            r84 = r74
            r93 = r80
            r94 = r92
            r74 = r105
            r105 = 1
            r5 = r2
            r80 = r9
            r2 = r15
            boolean r0 = defpackage.fqc.B(r12, r10)
            if (r0 == 0) goto L_0x0d30
            r0 = r99
            rod r0 = (defpackage.rod) r0
            rod r99 = q(r12, r0)
            r11 = r3
            r2 = r5
            r15 = r10
            r14 = r12
            r155 = r78
            r4 = r87
            r6 = r102
            r0 = r133
            r3 = r136
        L_0x0d2d:
            r12 = 4
            goto L_0x0df9
        L_0x0d30:
            r14 = r143
            boolean r0 = defpackage.fqc.B(r12, r14)
            if (r0 == 0) goto L_0x0d68
            r0 = r100
            long r100 = d(r12, r0)
            r1 = r99
            lod r1 = (defpackage.lod) r1
            r0 = r157
            r15 = r3
            r2 = r44
            r51 = r5
            r4 = r56
            r6 = r102
            r8 = r100
            r145 = r15
            r15 = r10
            r10 = r26
            lod r99 = r(r0, r1, r2, r4, r6, r8, r10)
            r143 = r14
            r2 = r51
            r155 = r78
            r4 = r87
            r0 = r133
            r3 = r136
            r11 = r145
            r14 = r12
            goto L_0x0d2d
        L_0x0d68:
            r145 = r3
            r51 = r5
            r15 = r10
            r11 = r78
            r0 = r100
            boolean r3 = defpackage.fqc.B(r12, r11)
            if (r3 == 0) goto L_0x0da3
            long r100 = d(r12, r0)
            r1 = r99
            nod r1 = (defpackage.nod) r1
            r0 = r157
            r2 = r53
            r3 = r44
            r5 = r56
            r7 = r102
            r9 = r100
            r155 = r11
            r143 = r14
            r14 = r12
            r11 = r26
            nod r99 = t(r0, r1, r2, r3, r5, r7, r9, r11)
            r2 = r51
            r4 = r87
            r6 = r102
            r0 = r133
            r3 = r136
            r11 = r145
            goto L_0x0d2d
        L_0x0da3:
            r155 = r11
            r143 = r14
            r14 = r12
            boolean r3 = defpackage.fqc.B(r14, r2)
            if (r3 == 0) goto L_0x0db9
            nm4 r2 = h(r14, r2)
            r3 = r136
            r3.add(r2)
            r12 = 4
            goto L_0x0df2
        L_0x0db9:
            r3 = r136
            java.lang.String r2 = "Label"
            boolean r4 = defpackage.fqc.B(r14, r2)
            if (r4 == 0) goto L_0x0de8
            r4 = r66
        L_0x0dc5:
            r157.next()
            int r5 = r157.getEventType()
            r12 = 4
            if (r5 != r12) goto L_0x0dd4
            java.lang.String r4 = r157.getText()
            goto L_0x0dd7
        L_0x0dd4:
            b(r157)
        L_0x0dd7:
            boolean r5 = defpackage.fqc.z(r14, r2)
            if (r5 == 0) goto L_0x0dc5
            r100 = r0
            r2 = r51
        L_0x0de1:
            r6 = r102
            r0 = r133
            r11 = r145
            goto L_0x0df9
        L_0x0de8:
            r12 = 4
            boolean r2 = defpackage.fqc.A(r157)
            if (r2 == 0) goto L_0x0df2
            b(r157)
        L_0x0df2:
            r100 = r0
            r2 = r51
            r4 = r87
            goto L_0x0de1
        L_0x0df9:
            boolean r1 = defpackage.fqc.z(r14, r0)
            if (r1 == 0) goto L_0x0f2a
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r139.size()
            r0.<init>(r1)
            r11 = r41
        L_0x0e0a:
            int r1 = r139.size()
            if (r11 >= r1) goto L_0x0efd
            r1 = r139
            java.lang.Object r5 = r1.get(r11)
            z54 r5 = (defpackage.z54) r5
            ca6 r6 = r5.a
            aa6 r6 = r6.a()
            if (r4 == 0) goto L_0x0e22
            r6.b = r4
        L_0x0e22:
            java.lang.String r7 = r5.d
            if (r7 != 0) goto L_0x0e28
            r7 = r85
        L_0x0e28:
            java.util.ArrayList r8 = r5.e
            r9 = r144
            r8.addAll(r9)
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto L_0x0e90
            int r10 = r8.size()
            int r10 = r10 + -1
        L_0x0e3b:
            if (r10 < 0) goto L_0x0e82
            java.lang.Object r15 = r8.get(r10)
            vv4 r15 = (defpackage.vv4) r15
            byte[] r12 = r15.v
            if (r12 == 0) goto L_0x0e4e
            r139 = r1
        L_0x0e49:
            r51 = r4
        L_0x0e4b:
            r69 = -1
            goto L_0x0e7a
        L_0x0e4e:
            r139 = r1
            r12 = r41
        L_0x0e52:
            int r1 = r8.size()
            if (r12 >= r1) goto L_0x0e49
            java.lang.Object r1 = r8.get(r12)
            vv4 r1 = (defpackage.vv4) r1
            r51 = r4
            byte[] r4 = r1.v
            if (r4 == 0) goto L_0x0e75
            byte[] r4 = r15.v
            if (r4 == 0) goto L_0x0e69
            goto L_0x0e75
        L_0x0e69:
            java.util.UUID r4 = r15.b
            boolean r1 = r1.a(r4)
            if (r1 == 0) goto L_0x0e75
            r8.remove(r10)
            goto L_0x0e4b
        L_0x0e75:
            int r12 = r12 + 1
            r4 = r51
            goto L_0x0e52
        L_0x0e7a:
            int r10 = r10 + -1
            r4 = r51
            r1 = r139
            r12 = 4
            goto L_0x0e3b
        L_0x0e82:
            r139 = r1
            r51 = r4
            r69 = -1
            xv4 r1 = new xv4
            r1.<init>(r7, r8)
            r6.n = r1
            goto L_0x0e96
        L_0x0e90:
            r139 = r1
            r51 = r4
            r69 = -1
        L_0x0e96:
            java.util.ArrayList r1 = r5.f
            r1.addAll(r3)
            ca6 r4 = new ca6
            r4.<init>(r6)
            tod r6 = r5.c
            boolean r7 = r6 instanceof defpackage.rod
            r144 = r9
            long r8 = r5.g
            tb7 r10 = r5.b
            java.util.List r12 = r5.h
            java.util.List r5 = r5.i
            if (r7 == 0) goto L_0x0ecc
            u2d r7 = new u2d
            r99 = r6
            rod r99 = (defpackage.rod) r99
            r101 = r12
            java.util.ArrayList r101 = (java.util.ArrayList) r101
            r102 = r5
            java.util.ArrayList r102 = (java.util.ArrayList) r102
            r94 = r7
            r95 = r8
            r97 = r4
            r98 = r10
            r100 = r1
            r94.<init>(r95, r97, r98, r99, r100, r101, r102)
            goto L_0x0eeb
        L_0x0ecc:
            boolean r7 = r6 instanceof defpackage.jod
            if (r7 == 0) goto L_0x0ef5
            s2d r7 = new s2d
            r99 = r6
            jod r99 = (defpackage.jod) r99
            r101 = r12
            java.util.ArrayList r101 = (java.util.ArrayList) r101
            r102 = r5
            java.util.ArrayList r102 = (java.util.ArrayList) r102
            r94 = r7
            r95 = r8
            r97 = r4
            r98 = r10
            r100 = r1
            r94.<init>(r95, r97, r98, r99, r100, r101, r102)
        L_0x0eeb:
            r0.add(r7)
            int r11 = r11 + 1
            r4 = r51
            r12 = 4
            goto L_0x0e0a
        L_0x0ef5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"
            r0.<init>(r1)
            throw r0
        L_0x0efd:
            r69 = -1
            r9 r1 = new r9
            r72 = r1
            r74 = r2
            r75 = r0
            r76 = r13
            r77 = r88
            r78 = r53
            r72.<init>(r73, r74, r75, r76, r77, r78)
            r12 = r67
            r12.add(r1)
            r42 = r12
            r52 = r58
            r15 = r137
            r53 = r138
            r13 = r141
            r33 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r58 = 4
            r70 = 0
            goto L_0x122b
        L_0x0f2a:
            r51 = r4
            r5 = r13
            r13 = r14
            r90 = r33
            r95 = r42
            r12 = r43
            r87 = r51
            r91 = r52
            r69 = r62
            r1 = r71
            r86 = r77
            r9 = r80
            r4 = r88
            r80 = r93
            r92 = r94
            r8 = r98
            r14 = r113
            r94 = r127
            r81 = r137
            r97 = r138
            r93 = r139
            r62 = r141
            r63 = r142
            r10 = r144
            r78 = r155
            r71 = r0
            r88 = r3
            r77 = r32
            r98 = r53
            r52 = r64
            r0 = r83
            r3 = r89
            r89 = r126
            r83 = r143
            r156 = r84
            r84 = r15
            r15 = r74
            r74 = r156
            goto L_0x03d0
        L_0x0f76:
            r84 = r2
            r89 = r3
            r32 = r4
            r82 = r5
            r137 = r6
            r138 = r7
            r93 = r8
            r80 = r9
            r143 = r10
            r155 = r11
            r43 = r12
            r79 = r14
            r64 = r52
            r141 = r62
            r142 = r63
            r12 = r67
            r62 = r69
            r41 = 0
            r69 = -1
            r105 = 1
            r14 = r13
            java.lang.String r0 = "EventStream"
            boolean r1 = defpackage.fqc.B(r14, r0)
            if (r1 == 0) goto L_0x1179
            r10 = r137
            r13 = 0
            java.lang.String r1 = r14.getAttributeValue(r13, r10)
            if (r1 != 0) goto L_0x0fb2
            r1 = r66
        L_0x0fb2:
            r11 = r141
            java.lang.String r2 = r14.getAttributeValue(r13, r11)
            if (r2 != 0) goto L_0x0fbd
            r15 = r66
            goto L_0x0fbe
        L_0x0fbd:
            r15 = r2
        L_0x0fbe:
            java.lang.String r2 = "timescale"
            r3 = 1
            long r51 = l(r14, r2, r3)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream
            r2 = 512(0x200, float:7.175E-43)
            r7.<init>(r2)
        L_0x0fd2:
            r157.next()
            java.lang.String r2 = "Event"
            boolean r3 = defpackage.fqc.B(r14, r2)
            if (r3 == 0) goto L_0x1112
            r8 = r138
            r5 = 0
            long r66 = l(r14, r8, r5)
            r13 = r46
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r70 = l(r14, r13, r3)
            java.lang.String r3 = "presentationTime"
            long r3 = l(r14, r3, r5)
            r72 = 1000(0x3e8, double:4.94E-321)
            r74 = r51
            long r76 = defpackage.t0g.J(r70, r72, r74)
            r72 = 1000000(0xf4240, double:4.940656E-318)
            r70 = r3
            long r3 = defpackage.t0g.J(r70, r72, r74)
            java.lang.String r5 = "messageData"
            r6 = 0
            java.lang.String r5 = r14.getAttributeValue(r6, r5)
            if (r5 != 0) goto L_0x1011
            r5 = 0
        L_0x1011:
            r7.reset()
            org.xmlpull.v1.XmlSerializer r6 = android.util.Xml.newSerializer()
            java.nio.charset.Charset r33 = defpackage.x22.c
            r138 = r8
            java.lang.String r8 = r33.name()
            r6.setOutput(r7, r8)
            r157.nextToken()
        L_0x1026:
            boolean r8 = defpackage.fqc.z(r14, r2)
            if (r8 != 0) goto L_0x10d1
            int r8 = r157.getEventType()
            switch(r8) {
                case 0: goto L_0x10ba;
                case 1: goto L_0x10b0;
                case 2: goto L_0x1081;
                case 3: goto L_0x1073;
                case 4: goto L_0x106b;
                case 5: goto L_0x1063;
                case 6: goto L_0x105b;
                case 7: goto L_0x1053;
                case 8: goto L_0x104b;
                case 9: goto L_0x1043;
                case 10: goto L_0x103b;
                default: goto L_0x1033;
            }
        L_0x1033:
            r33 = r2
        L_0x1035:
            r42 = r9
            r137 = r10
            goto L_0x10c6
        L_0x103b:
            java.lang.String r8 = r157.getText()
            r6.docdecl(r8)
            goto L_0x1033
        L_0x1043:
            java.lang.String r8 = r157.getText()
            r6.comment(r8)
            goto L_0x1033
        L_0x104b:
            java.lang.String r8 = r157.getText()
            r6.processingInstruction(r8)
            goto L_0x1033
        L_0x1053:
            java.lang.String r8 = r157.getText()
            r6.ignorableWhitespace(r8)
            goto L_0x1033
        L_0x105b:
            java.lang.String r8 = r157.getText()
            r6.entityRef(r8)
            goto L_0x1033
        L_0x1063:
            java.lang.String r8 = r157.getText()
            r6.cdsect(r8)
            goto L_0x1033
        L_0x106b:
            java.lang.String r8 = r157.getText()
            r6.text(r8)
            goto L_0x1033
        L_0x1073:
            java.lang.String r8 = r157.getNamespace()
            r33 = r2
            java.lang.String r2 = r157.getName()
            r6.endTag(r8, r2)
            goto L_0x1035
        L_0x1081:
            r33 = r2
            java.lang.String r2 = r157.getNamespace()
            java.lang.String r8 = r157.getName()
            r6.startTag(r2, r8)
            r2 = r41
        L_0x1090:
            int r8 = r157.getAttributeCount()
            if (r2 >= r8) goto L_0x1035
            java.lang.String r8 = r14.getAttributeNamespace(r2)
            r42 = r9
            java.lang.String r9 = r14.getAttributeName(r2)
            r137 = r10
            java.lang.String r10 = r14.getAttributeValue(r2)
            r6.attribute(r8, r9, r10)
            int r2 = r2 + 1
            r9 = r42
            r10 = r137
            goto L_0x1090
        L_0x10b0:
            r33 = r2
            r42 = r9
            r137 = r10
            r6.endDocument()
            goto L_0x10c6
        L_0x10ba:
            r33 = r2
            r42 = r9
            r137 = r10
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r8 = 0
            r6.startDocument(r8, r2)
        L_0x10c6:
            r157.nextToken()
            r2 = r33
            r9 = r42
            r10 = r137
            goto L_0x1026
        L_0x10d1:
            r42 = r9
            r137 = r10
            r6.flush()
            byte[] r2 = r7.toByteArray()
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            if (r5 != 0) goto L_0x10e4
        L_0x10e2:
            r9 = r2
            goto L_0x10eb
        L_0x10e4:
            java.nio.charset.Charset r2 = defpackage.x22.c
            byte[] r2 = r5.getBytes(r2)
            goto L_0x10e2
        L_0x10eb:
            b95 r8 = new b95
            r2 = r8
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r1
            r4 = r15
            r33 = r12
            r46 = r13
            r70 = 0
            r12 = r5
            r5 = r76
            r68 = r7
            r12 = r8
            r53 = r138
            r7 = r66
            r13 = r42
            r2.<init>(r3, r4, r5, r7, r9)
            android.util.Pair r2 = android.util.Pair.create(r10, r12)
            r13.add(r2)
            goto L_0x1120
        L_0x1112:
            r68 = r7
            r13 = r9
            r137 = r10
            r33 = r12
            r53 = r138
            r70 = 0
            b(r157)
        L_0x1120:
            boolean r2 = defpackage.fqc.z(r14, r0)
            if (r2 == 0) goto L_0x116d
            int r0 = r13.size()
            long[] r0 = new long[r0]
            int r2 = r13.size()
            b95[] r2 = new defpackage.b95[r2]
            r3 = r41
        L_0x1134:
            int r4 = r13.size()
            if (r3 >= r4) goto L_0x1153
            java.lang.Object r4 = r13.get(r3)
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r5 = r4.first
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r0[r3] = r5
            java.lang.Object r4 = r4.second
            b95 r4 = (defpackage.b95) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x1134
        L_0x1153:
            h95 r3 = new h95
            r3.<init>(r1, r15, r0, r2)
            r12 = r58
            r12.add(r3)
            r13 = r11
            r52 = r12
            r42 = r33
            r15 = r137
            r33 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r58 = 4
            goto L_0x122b
        L_0x116d:
            r9 = r13
            r12 = r33
            r138 = r53
            r7 = r68
            r10 = r137
            r13 = 0
            goto L_0x0fd2
        L_0x1179:
            r33 = r12
            r12 = r58
            r53 = r138
            r11 = r141
            r70 = 0
            boolean r0 = defpackage.fqc.B(r14, r15)
            if (r0 == 0) goto L_0x11a4
            r0 = 0
            rod r1 = q(r14, r0)
            r50 = r1
            r13 = r11
            r52 = r12
            r42 = r33
            r10 = r62
            r15 = r137
            r0 = r142
            r33 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r58 = 4
            goto L_0x1232
        L_0x11a4:
            r0 = r143
            boolean r0 = defpackage.fqc.B(r14, r0)
            if (r0 == 0) goto L_0x11dd
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r50 = d(r14, r0)
            r1 = 0
            r0 = r157
            r2 = r44
            r4 = r56
            r6 = r62
            r8 = r50
            r13 = r11
            r15 = r137
            r10 = r26
            lod r0 = r(r0, r1, r2, r4, r6, r8, r10)
            r52 = r12
            r42 = r33
            r59 = r50
            r10 = r62
            r33 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r58 = 4
        L_0x11d8:
            r50 = r0
        L_0x11da:
            r0 = r142
            goto L_0x1232
        L_0x11dd:
            r13 = r11
            r15 = r137
            r0 = r155
            boolean r0 = defpackage.fqc.B(r14, r0)
            if (r0 == 0) goto L_0x1215
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r50 = d(r14, r9)
            lx5 r0 = defpackage.tb7.b
            k0d r2 = defpackage.k0d.v
            r1 = 0
            r0 = r157
            r3 = r44
            r5 = r56
            r7 = r62
            r58 = r9
            r9 = r50
            r52 = r12
            r42 = r33
            r33 = r58
            r58 = 4
            r11 = r26
            nod r0 = t(r0, r1, r2, r3, r5, r7, r9, r11)
            r59 = r50
            r10 = r62
            goto L_0x11d8
        L_0x1215:
            r52 = r12
            r42 = r33
            r33 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r58 = 4
            java.lang.String r0 = "AssetIdentifier"
            boolean r1 = defpackage.fqc.B(r14, r0)
            if (r1 == 0) goto L_0x122e
            h(r14, r0)
        L_0x122b:
            r10 = r62
            goto L_0x11da
        L_0x122e:
            b(r157)
            goto L_0x122b
        L_0x1232:
            boolean r1 = defpackage.fqc.z(r14, r0)
            if (r1 == 0) goto L_0x129b
            fcb r0 = new fcb
            r46 = r0
            r50 = r42
            r51 = r52
            r46.<init>(r47, r48, r50, r51)
            java.lang.Long r1 = java.lang.Long.valueOf(r56)
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            java.lang.Object r1 = r0.first
            fcb r1 = (defpackage.fcb) r1
            long r2 = r1.b
            int r2 = (r2 > r33 ? 1 : (r2 == r33 ? 0 : -1))
            if (r2 != 0) goto L_0x1279
            if (r23 == 0) goto L_0x125c
            r2 = r82
            r10 = r105
            goto L_0x1296
        L_0x125c:
            int r0 = r82.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 47
            r1.<init>(r2)
            java.lang.String r2 = "Unable to determine start of period "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.b(r1, r0)
            throw r0
        L_0x1279:
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            int r0 = (r2 > r33 ? 1 : (r2 == r33 ? 0 : -1))
            if (r0 != 0) goto L_0x128a
            r6 = r33
        L_0x1287:
            r2 = r82
            goto L_0x128f
        L_0x128a:
            long r4 = r1.b
            long r6 = r4 + r2
            goto L_0x1287
        L_0x128f:
            r2.add(r1)
            r54 = r6
            r10 = r36
        L_0x1296:
            r36 = r10
        L_0x1298:
            r0 = r64
            goto L_0x12dc
        L_0x129b:
            r63 = r0
            r62 = r13
            r13 = r14
            r6 = r15
            r4 = r32
            r0 = r33
            r15 = r42
            r12 = r43
            r58 = r52
            r7 = r53
            r52 = r64
            r14 = r79
            r9 = r80
            r5 = r82
            r2 = r84
            r3 = r89
            r8 = r93
            goto L_0x02cc
        L_0x12bd:
            r84 = r2
            r32 = r4
            r2 = r5
            r80 = r9
            r54 = r14
            r64 = r52
            r33 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r41 = 0
            r58 = 4
            r69 = -1
            r70 = 0
            r105 = 1
            r14 = r13
            b(r157)
            goto L_0x1298
        L_0x12dc:
            java.lang.String r3 = "MPD"
            boolean r3 = defpackage.fqc.z(r14, r3)
            if (r3 == 0) goto L_0x131a
            int r0 = (r19 > r33 ? 1 : (r19 == r33 ? 0 : -1))
            if (r0 != 0) goto L_0x12fa
            int r0 = (r54 > r33 ? 1 : (r54 == r33 ? 0 : -1))
            if (r0 == 0) goto L_0x12ef
            r19 = r54
            goto L_0x12fa
        L_0x12ef:
            if (r23 == 0) goto L_0x12f2
            goto L_0x12fa
        L_0x12f2:
            java.lang.String r0 = "Unable to determine duration of static manifest."
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.b(r1, r0)
            throw r0
        L_0x12fa:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x1312
            x54 r0 = new x54
            r16 = r0
            r32 = r37
            r33 = r38
            r34 = r40
            r35 = r39
            r36 = r2
            r16.<init>(r17, r19, r21, r23, r24, r26, r28, r30, r32, r33, r34, r35, r36)
            return r0
        L_0x1312:
            java.lang.String r0 = "No periods found."
            r3 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.b(r3, r0)
            throw r0
        L_0x131a:
            r5 = r2
            r13 = r14
            r4 = r32
            r6 = r33
            r11 = r41
            r14 = r54
            r9 = r80
            r2 = r84
            r10 = r105
            r8 = 0
            goto L_0x00cf
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b64.m(org.xmlpull.v1.XmlPullParser, android.net.Uri):x54");
    }

    public static cpc n(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
            }
            j2 = -1;
        } else {
            j = 0;
            j2 = -1;
        }
        return new cpc(j, attributeValue, j2);
    }

    public static int o(String str) {
        if (str == null) {
            return 0;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c2 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c2 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c2 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c2 = 8;
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c2 = 9;
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c2 = 10;
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c2 = 12;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 3:
            case 5:
                return Uuid.SIZE_BITS;
            case 1:
                return ConstantsKt.MINIMUM_BLOCK_SIZE;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case 8:
                return 256;
            case 9:
                return 64;
            case 10:
                return 8;
            case 11:
                return 32;
            case 12:
                return 4;
            default:
                return 0;
        }
    }

    public static int p(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (o54.l("http://dashif.org/guidelines/trickmode", ((nm4) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: cpc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.rod q(org.xmlpull.v1.XmlPullParser r17, defpackage.rod r18) {
        /*
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 == 0) goto L_0x000b
            long r4 = r1.a
            goto L_0x000c
        L_0x000b:
            r4 = r2
        L_0x000c:
            java.lang.String r6 = "timescale"
            long r9 = l(r0, r6, r4)
            r4 = 0
            if (r1 == 0) goto L_0x0019
            long r6 = r1.b
            goto L_0x001a
        L_0x0019:
            r6 = r4
        L_0x001a:
            java.lang.String r8 = "presentationTimeOffset"
            long r11 = l(r0, r8, r6)
            if (r1 == 0) goto L_0x0025
            long r6 = r1.d
            goto L_0x0026
        L_0x0025:
            r6 = r4
        L_0x0026:
            if (r1 == 0) goto L_0x002a
            long r4 = r1.e
        L_0x002a:
            r8 = 0
            java.lang.String r13 = "indexRange"
            java.lang.String r13 = r0.getAttributeValue(r8, r13)
            if (r13 == 0) goto L_0x004c
            java.lang.String r4 = "-"
            java.lang.String[] r4 = r13.split(r4)
            r5 = 0
            r5 = r4[r5]
            long r5 = java.lang.Long.parseLong(r5)
            r7 = 1
            r4 = r4[r7]
            long r13 = java.lang.Long.parseLong(r4)
            long r13 = r13 - r5
            long r13 = r13 + r2
            r15 = r13
            r13 = r5
            goto L_0x004e
        L_0x004c:
            r15 = r4
            r13 = r6
        L_0x004e:
            if (r1 == 0) goto L_0x0055
            java.lang.Object r1 = r1.c
            r8 = r1
            cpc r8 = (defpackage.cpc) r8
        L_0x0055:
            r17.next()
            java.lang.String r1 = "Initialization"
            boolean r1 = defpackage.fqc.B(r0, r1)
            if (r1 == 0) goto L_0x006a
            java.lang.String r1 = "sourceURL"
            java.lang.String r2 = "range"
            cpc r1 = n(r0, r1, r2)
            r8 = r1
            goto L_0x006d
        L_0x006a:
            b(r17)
        L_0x006d:
            java.lang.String r1 = "SegmentBase"
            boolean r1 = defpackage.fqc.z(r0, r1)
            if (r1 == 0) goto L_0x0055
            rod r0 = new rod
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b64.q(org.xmlpull.v1.XmlPullParser, rod):rod");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: cpc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.lod r(org.xmlpull.v1.XmlPullParser r25, defpackage.lod r26, long r27, long r29, long r31, long r33, long r35) {
        /*
            r0 = r25
            r1 = r26
            r2 = 1
            if (r1 == 0) goto L_0x000b
            long r4 = r1.a
            goto L_0x000c
        L_0x000b:
            r4 = r2
        L_0x000c:
            java.lang.String r6 = "timescale"
            long r9 = l(r0, r6, r4)
            if (r1 == 0) goto L_0x0017
            long r4 = r1.b
            goto L_0x0019
        L_0x0017:
            r4 = 0
        L_0x0019:
            java.lang.String r6 = "presentationTimeOffset"
            long r11 = l(r0, r6, r4)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x0029
            long r6 = r1.e
            goto L_0x002a
        L_0x0029:
            r6 = r4
        L_0x002a:
            java.lang.String r8 = "duration"
            long r15 = l(r0, r8, r6)
            if (r1 == 0) goto L_0x0034
            long r2 = r1.d
        L_0x0034:
            java.lang.String r6 = "startNumber"
            long r13 = l(r0, r6, r2)
            int r2 = (r33 > r4 ? 1 : (r33 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0041
            r2 = r31
            goto L_0x0043
        L_0x0041:
            r2 = r33
        L_0x0043:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x004f
            r18 = r4
            goto L_0x0051
        L_0x004f:
            r18 = r2
        L_0x0051:
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0054:
            r25.next()
            java.lang.String r5 = "Initialization"
            boolean r5 = defpackage.fqc.B(r0, r5)
            if (r5 == 0) goto L_0x006a
            java.lang.String r3 = "sourceURL"
            java.lang.String r5 = "range"
            cpc r3 = n(r0, r3, r5)
            r5 = r29
            goto L_0x0099
        L_0x006a:
            java.lang.String r5 = "SegmentTimeline"
            boolean r5 = defpackage.fqc.B(r0, r5)
            if (r5 == 0) goto L_0x0079
            r5 = r29
            java.util.ArrayList r4 = u(r0, r9, r5)
            goto L_0x0099
        L_0x0079:
            r5 = r29
            java.lang.String r7 = "SegmentURL"
            boolean r7 = defpackage.fqc.B(r0, r7)
            if (r7 == 0) goto L_0x0096
            if (r2 != 0) goto L_0x008a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x008a:
            java.lang.String r7 = "media"
            java.lang.String r8 = "mediaRange"
            cpc r7 = n(r0, r7, r8)
            r2.add(r7)
            goto L_0x0099
        L_0x0096:
            b(r25)
        L_0x0099:
            java.lang.String r7 = "SegmentList"
            boolean r7 = defpackage.fqc.z(r0, r7)
            if (r7 == 0) goto L_0x0054
            if (r1 == 0) goto L_0x00b5
            if (r3 == 0) goto L_0x00a6
            goto L_0x00ab
        L_0x00a6:
            java.lang.Object r0 = r1.c
            r3 = r0
            cpc r3 = (defpackage.cpc) r3
        L_0x00ab:
            if (r4 == 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            java.util.List r4 = r1.f
        L_0x00b0:
            if (r2 == 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            java.util.List r2 = r1.j
        L_0x00b5:
            r20 = r2
            r8 = r3
            r17 = r4
            lod r0 = new lod
            r7 = r0
            long r21 = defpackage.t0g.D(r35)
            long r23 = defpackage.t0g.D(r27)
            r7.<init>(r8, r9, r11, r13, r15, r17, r18, r20, r21, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b64.r(org.xmlpull.v1.XmlPullParser, lod, long, long, long, long, long):lod");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: cpc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.nod t(org.xmlpull.v1.XmlPullParser r28, defpackage.nod r29, java.util.List r30, long r31, long r33, long r35, long r37, long r39) {
        /*
            r0 = r28
            r1 = r29
            r2 = 1
            if (r1 == 0) goto L_0x000b
            long r4 = r1.a
            goto L_0x000c
        L_0x000b:
            r4 = r2
        L_0x000c:
            java.lang.String r6 = "timescale"
            long r9 = l(r0, r6, r4)
            if (r1 == 0) goto L_0x0017
            long r4 = r1.b
            goto L_0x0019
        L_0x0017:
            r4 = 0
        L_0x0019:
            java.lang.String r6 = "presentationTimeOffset"
            long r11 = l(r0, r6, r4)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x0029
            long r6 = r1.e
            goto L_0x002a
        L_0x0029:
            r6 = r4
        L_0x002a:
            java.lang.String r8 = "duration"
            long r17 = l(r0, r8, r6)
            if (r1 == 0) goto L_0x0034
            long r2 = r1.d
        L_0x0034:
            java.lang.String r6 = "startNumber"
            long r13 = l(r0, r6, r2)
            r2 = 0
        L_0x003b:
            int r3 = r30.size()
            if (r2 >= r3) goto L_0x005e
            r3 = r30
            java.lang.Object r6 = r3.get(r2)
            nm4 r6 = (defpackage.nm4) r6
            java.lang.String r7 = r6.a
            java.lang.String r8 = "http://dashif.org/guidelines/last-segment-number"
            boolean r7 = defpackage.o54.l(r8, r7)
            if (r7 == 0) goto L_0x005b
            java.lang.String r2 = r6.b
            long r2 = java.lang.Long.parseLong(r2)
        L_0x0059:
            r15 = r2
            goto L_0x0061
        L_0x005b:
            int r2 = r2 + 1
            goto L_0x003b
        L_0x005e:
            r2 = -1
            goto L_0x0059
        L_0x0061:
            int r2 = (r37 > r4 ? 1 : (r37 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0068
            r2 = r35
            goto L_0x006a
        L_0x0068:
            r2 = r37
        L_0x006a:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0076
            r20 = r4
            goto L_0x0078
        L_0x0076:
            r20 = r2
        L_0x0078:
            r2 = 0
            if (r1 == 0) goto L_0x007e
            m7h r3 = r1.k
            goto L_0x007f
        L_0x007e:
            r3 = r2
        L_0x007f:
            java.lang.String r4 = "media"
            m7h r23 = v(r0, r4, r3)
            if (r1 == 0) goto L_0x008a
            m7h r3 = r1.j
            goto L_0x008b
        L_0x008a:
            r3 = r2
        L_0x008b:
            java.lang.String r4 = "initialization"
            m7h r22 = v(r0, r4, r3)
            r3 = r2
        L_0x0092:
            r28.next()
            java.lang.String r4 = "Initialization"
            boolean r4 = defpackage.fqc.B(r0, r4)
            if (r4 == 0) goto L_0x00a8
            java.lang.String r2 = "sourceURL"
            java.lang.String r4 = "range"
            cpc r2 = n(r0, r2, r4)
            r4 = r33
            goto L_0x00bc
        L_0x00a8:
            java.lang.String r4 = "SegmentTimeline"
            boolean r4 = defpackage.fqc.B(r0, r4)
            if (r4 == 0) goto L_0x00b7
            r4 = r33
            java.util.ArrayList r3 = u(r0, r9, r4)
            goto L_0x00bc
        L_0x00b7:
            r4 = r33
            b(r28)
        L_0x00bc:
            java.lang.String r6 = "SegmentTemplate"
            boolean r6 = defpackage.fqc.z(r0, r6)
            if (r6 == 0) goto L_0x0092
            if (r1 == 0) goto L_0x00d3
            if (r2 == 0) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            java.lang.Object r0 = r1.c
            r2 = r0
            cpc r2 = (defpackage.cpc) r2
        L_0x00ce:
            if (r3 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            java.util.List r3 = r1.f
        L_0x00d3:
            r8 = r2
            r19 = r3
            nod r0 = new nod
            r7 = r0
            long r24 = defpackage.t0g.D(r39)
            long r26 = defpackage.t0g.D(r31)
            r7.<init>(r8, r9, r11, r13, r15, r17, r19, r20, r22, r23, r24, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b64.t(org.xmlpull.v1.XmlPullParser, nod, java.util.List, long, long, long, long, long):nod");
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j, long j2) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (fqc.B(xmlPullParser2, "S")) {
                long l = l(xmlPullParser2, "t", -9223372036854775807L);
                if (z) {
                    j3 = a(arrayList, j3, j4, i, l);
                }
                if (l == -9223372036854775807L) {
                    l = j3;
                }
                long l2 = l(xmlPullParser2, "d", -9223372036854775807L);
                i = k(xmlPullParser2, "r", 0);
                long j5 = l2;
                z = true;
                j4 = j5;
                j3 = l;
            } else {
                b(xmlPullParser);
            }
        } while (!fqc.z(xmlPullParser2, "SegmentTimeline"));
        if (z) {
            a(arrayList, j3, j4, i, t0g.J(j2, j, 1000));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.String[], java.io.Serializable] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.m7h v(org.xmlpull.v1.XmlPullParser r17, java.lang.String r18, defpackage.m7h r19) {
        /*
            r0 = -1
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = r17
            r6 = r18
            java.lang.String r4 = r5.getAttributeValue(r4, r6)
            if (r4 == 0) goto L_0x0133
            r5 = 5
            java.lang.String[] r7 = new java.lang.String[r5]
            r5 = 4
            int[] r8 = new int[r5]
            java.lang.String[] r9 = new java.lang.String[r5]
            java.lang.String r6 = ""
            r7[r1] = r6
            r10 = r1
            r11 = r10
        L_0x001d:
            int r12 = r4.length()
            if (r11 >= r12) goto L_0x012b
            java.lang.String r12 = "$"
            int r13 = r4.indexOf(r12, r11)
            if (r13 != r0) goto L_0x0051
            r12 = r7[r10]
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r11 = r4.substring(r11)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r13 = r11.length()
            if (r13 == 0) goto L_0x0044
            java.lang.String r11 = r12.concat(r11)
            goto L_0x0049
        L_0x0044:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r12)
        L_0x0049:
            r7[r10] = r11
            int r11 = r4.length()
            goto L_0x0128
        L_0x0051:
            if (r13 == r11) goto L_0x0076
            r12 = r7[r10]
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r11 = r4.substring(r11, r13)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r14 = r11.length()
            if (r14 == 0) goto L_0x006c
            java.lang.String r11 = r12.concat(r11)
            goto L_0x0071
        L_0x006c:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r12)
        L_0x0071:
            r7[r10] = r11
            r11 = r13
            goto L_0x0128
        L_0x0076:
            java.lang.String r13 = "$$"
            boolean r13 = r4.startsWith(r13, r11)
            if (r13 == 0) goto L_0x008d
            r13 = r7[r10]
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r13.concat(r12)
            r7[r10] = r12
            int r11 = r11 + r2
            goto L_0x0128
        L_0x008d:
            int r11 = r11 + r3
            int r12 = r4.indexOf(r12, r11)
            java.lang.String r11 = r4.substring(r11, r12)
            java.lang.String r13 = "RepresentationID"
            boolean r13 = r11.equals(r13)
            if (r13 == 0) goto L_0x00a2
            r8[r10] = r3
            goto L_0x0123
        L_0x00a2:
            java.lang.String r13 = "%0"
            int r13 = r11.indexOf(r13)
            if (r13 == r0) goto L_0x00cf
            java.lang.String r14 = r11.substring(r13)
            java.lang.String r15 = "d"
            boolean r16 = r14.endsWith(r15)
            if (r16 != 0) goto L_0x00ca
            java.lang.String r0 = "x"
            boolean r0 = r14.endsWith(r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = "X"
            boolean r0 = r14.endsWith(r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r14 = r14.concat(r15)
        L_0x00ca:
            java.lang.String r11 = r11.substring(r1, r13)
            goto L_0x00d1
        L_0x00cf:
            java.lang.String r14 = "%01d"
        L_0x00d1:
            r11.getClass()
            int r0 = r11.hashCode()
            switch(r0) {
                case -1950496919: goto L_0x00f3;
                case 2606829: goto L_0x00e8;
                case 38199441: goto L_0x00dd;
                default: goto L_0x00db;
            }
        L_0x00db:
            r0 = -1
            goto L_0x00fd
        L_0x00dd:
            java.lang.String r0 = "Bandwidth"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x00e6
            goto L_0x00db
        L_0x00e6:
            r0 = r2
            goto L_0x00fd
        L_0x00e8:
            java.lang.String r0 = "Time"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x00f1
            goto L_0x00db
        L_0x00f1:
            r0 = r3
            goto L_0x00fd
        L_0x00f3:
            java.lang.String r0 = "Number"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x00fc
            goto L_0x00db
        L_0x00fc:
            r0 = r1
        L_0x00fd:
            switch(r0) {
                case 0: goto L_0x011f;
                case 1: goto L_0x011c;
                case 2: goto L_0x0118;
                default: goto L_0x0100;
            }
        L_0x0100:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.length()
            java.lang.String r2 = "Invalid template: "
            if (r1 == 0) goto L_0x010f
            java.lang.String r1 = r2.concat(r4)
            goto L_0x0114
        L_0x010f:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x0114:
            r0.<init>(r1)
            throw r0
        L_0x0118:
            r0 = 3
            r8[r10] = r0
            goto L_0x0121
        L_0x011c:
            r8[r10] = r5
            goto L_0x0121
        L_0x011f:
            r8[r10] = r2
        L_0x0121:
            r9[r10] = r14
        L_0x0123:
            int r10 = r10 + r3
            r7[r10] = r6
            int r12 = r12 + r3
            r11 = r12
        L_0x0128:
            r0 = -1
            goto L_0x001d
        L_0x012b:
            m7h r0 = new m7h
            r11 = 5
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        L_0x0133:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b64.v(org.xmlpull.v1.XmlPullParser, java.lang.String, m7h):m7h");
    }

    public final Object s(Uri uri, l74 l74) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(l74, (String) null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return m(newPullParser, uri);
            }
            throw ParserException.b((Exception) null, "inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            throw ParserException.b(e, (String) null);
        }
    }
}
