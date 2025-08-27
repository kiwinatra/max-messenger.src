package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
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

/* renamed from: c64  reason: default package */
public final class c64 extends DefaultHandler implements o8b {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern o = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] v = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public c64() {
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
            int i3 = v0g.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(new qod(j, j2));
            j += j2;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (y7e.J(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (y7e.J(xmlPullParser)) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        if (r0 == 0) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b5, code lost:
        if (r8.equals("fa01") == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00fe, code lost:
        if (r0 < 33) goto L_0x00ef;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(org.xmlpull.v1.XmlPullParser r12) {
        /*
            r0 = 6
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            r7 = -1
            r8 = 0
            java.lang.String r9 = "schemeIdUri"
            java.lang.String r9 = r12.getAttributeValue(r8, r9)
            if (r9 != 0) goto L_0x0012
            r9 = r8
        L_0x0012:
            r9.getClass()
            java.lang.String r10 = "value"
            int r11 = r9.hashCode()
            switch(r11) {
                case -2128649360: goto L_0x0062;
                case -1352850286: goto L_0x0057;
                case -1138141449: goto L_0x004c;
                case -986633423: goto L_0x0041;
                case -79006963: goto L_0x0036;
                case 312179081: goto L_0x002b;
                case 2036691300: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            r9 = r7
            goto L_0x006c
        L_0x0020:
            java.lang.String r11 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0029
            goto L_0x001e
        L_0x0029:
            r9 = r0
            goto L_0x006c
        L_0x002b:
            java.lang.String r11 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0034
            goto L_0x001e
        L_0x0034:
            r9 = r1
            goto L_0x006c
        L_0x0036:
            java.lang.String r11 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x003f
            goto L_0x001e
        L_0x003f:
            r9 = r2
            goto L_0x006c
        L_0x0041:
            java.lang.String r11 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x004a
            goto L_0x001e
        L_0x004a:
            r9 = r3
            goto L_0x006c
        L_0x004c:
            java.lang.String r11 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0055
            goto L_0x001e
        L_0x0055:
            r9 = r5
            goto L_0x006c
        L_0x0057:
            java.lang.String r11 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0060
            goto L_0x001e
        L_0x0060:
            r9 = r6
            goto L_0x006c
        L_0x0062:
            java.lang.String r11 = "urn:dts:dash:audio_channel_configuration:2012"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x006b
            goto L_0x001e
        L_0x006b:
            r9 = r4
        L_0x006c:
            switch(r9) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00f1;
                case 2: goto L_0x0096;
                case 3: goto L_0x0087;
                case 4: goto L_0x00f6;
                case 5: goto L_0x0071;
                case 6: goto L_0x0096;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0101
        L_0x0071:
            java.lang.String r0 = r12.getAttributeValue(r8, r10)
            if (r0 != 0) goto L_0x0079
            goto L_0x0101
        L_0x0079:
            r1 = 16
            int r0 = java.lang.Integer.parseInt(r0, r1)
            int r0 = java.lang.Integer.bitCount(r0)
            if (r0 != 0) goto L_0x00ef
            goto L_0x0101
        L_0x0087:
            int r0 = l(r12, r10, r7)
            if (r0 < 0) goto L_0x0101
            int[] r1 = v
            int r2 = r1.length
            if (r0 >= r2) goto L_0x0101
            r7 = r1[r0]
            goto L_0x0101
        L_0x0096:
            java.lang.String r8 = r12.getAttributeValue(r8, r10)
            if (r8 != 0) goto L_0x009f
        L_0x009c:
            r0 = r7
            goto L_0x00ef
        L_0x009f:
            java.lang.String r8 = defpackage.o54.P(r8)
            r8.getClass()
            int r9 = r8.hashCode()
            switch(r9) {
                case 1596796: goto L_0x00d9;
                case 2937391: goto L_0x00ce;
                case 3094034: goto L_0x00c3;
                case 3094035: goto L_0x00b8;
                case 3133436: goto L_0x00af;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            r2 = r7
            goto L_0x00e3
        L_0x00af:
            java.lang.String r3 = "fa01"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x00e3
            goto L_0x00ad
        L_0x00b8:
            java.lang.String r2 = "f801"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00c1
            goto L_0x00ad
        L_0x00c1:
            r2 = r3
            goto L_0x00e3
        L_0x00c3:
            java.lang.String r2 = "f800"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00cc
            goto L_0x00ad
        L_0x00cc:
            r2 = r5
            goto L_0x00e3
        L_0x00ce:
            java.lang.String r2 = "a000"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00d7
            goto L_0x00ad
        L_0x00d7:
            r2 = r6
            goto L_0x00e3
        L_0x00d9:
            java.lang.String r2 = "4000"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00e2
            goto L_0x00ad
        L_0x00e2:
            r2 = r4
        L_0x00e3:
            switch(r2) {
                case 0: goto L_0x00ee;
                case 1: goto L_0x00ec;
                case 2: goto L_0x00ea;
                case 3: goto L_0x00ef;
                case 4: goto L_0x00e7;
                default: goto L_0x00e6;
            }
        L_0x00e6:
            goto L_0x009c
        L_0x00e7:
            r0 = 8
            goto L_0x00ef
        L_0x00ea:
            r0 = r1
            goto L_0x00ef
        L_0x00ec:
            r0 = r5
            goto L_0x00ef
        L_0x00ee:
            r0 = r6
        L_0x00ef:
            r7 = r0
            goto L_0x0101
        L_0x00f1:
            int r7 = l(r12, r10, r7)
            goto L_0x0101
        L_0x00f6:
            int r0 = l(r12, r10, r7)
            if (r0 <= 0) goto L_0x0101
            r1 = 33
            if (r0 >= r1) goto L_0x0101
            goto L_0x00ef
        L_0x0101:
            r12.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = defpackage.y7e.H(r12, r0)
            if (r0 == 0) goto L_0x0101
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c64.c(org.xmlpull.v1.XmlPullParser):int");
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
        } while (!y7e.H(xmlPullParser, "BaseURL"));
        if (str == null || hi7.w(str)[0] == -1) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                ml0 ml0 = (ml0) list.get(i2);
                String T = hi7.T(ml0.a, str);
                String str2 = attributeValue3 == null ? T : attributeValue3;
                if (z) {
                    parseInt = ml0.c;
                    i = ml0.d;
                    str2 = ml0.b;
                }
                arrayList.add(new ml0(T, str2, parseInt, i));
            }
            return arrayList;
        }
        if (attributeValue3 == null) {
            attributeValue3 = str;
        }
        return gsg.q(new ml0(str, attributeValue3, parseInt, i));
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
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
            if (r2 == 0) goto L_0x00bc
            java.lang.String r2 = defpackage.o54.P(r2)
            r2.getClass()
            int r6 = r2.hashCode()
            switch(r6) {
                case -1980789791: goto L_0x003f;
                case 489446379: goto L_0x0034;
                case 755418770: goto L_0x0029;
                case 1812765994: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            r2 = r3
            goto L_0x0049
        L_0x001e:
            java.lang.String r6 = "urn:mpeg:dash:mp4protection:2011"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0027
            goto L_0x001c
        L_0x0027:
            r2 = 3
            goto L_0x0049
        L_0x0029:
            java.lang.String r6 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0032
            goto L_0x001c
        L_0x0032:
            r2 = 2
            goto L_0x0049
        L_0x0034:
            java.lang.String r6 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x003d
            goto L_0x001c
        L_0x003d:
            r2 = r0
            goto L_0x0049
        L_0x003f:
            java.lang.String r6 = "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0048
            goto L_0x001c
        L_0x0048:
            r2 = r5
        L_0x0049:
            switch(r2) {
                case 0: goto L_0x00b9;
                case 1: goto L_0x00b6;
                case 2: goto L_0x00b1;
                case 3: goto L_0x004e;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x00bc
        L_0x004e:
            java.lang.String r2 = "value"
            java.lang.String r2 = r13.getAttributeValue(r1, r2)
            int r6 = r13.getAttributeCount()
            r7 = r5
        L_0x0059:
            if (r7 >= r6) goto L_0x007a
            java.lang.String r8 = r13.getAttributeName(r7)
            int r9 = r8.indexOf(r4)
            if (r9 != r3) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            int r9 = r9 + r0
            java.lang.String r8 = r8.substring(r9)
        L_0x006b:
            java.lang.String r9 = "default_KID"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0078
            java.lang.String r6 = r13.getAttributeValue(r7)
            goto L_0x007b
        L_0x0078:
            int r7 = r7 + r0
            goto L_0x0059
        L_0x007a:
            r6 = r1
        L_0x007b:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x00a8
            java.lang.String r7 = "00000000-0000-0000-0000-000000000000"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x00a8
            java.lang.String r7 = "\\s+"
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            java.util.UUID[] r7 = new java.util.UUID[r7]
            r8 = r5
        L_0x0093:
            int r9 = r6.length
            if (r8 >= r9) goto L_0x00a0
            r9 = r6[r8]
            java.util.UUID r9 = java.util.UUID.fromString(r9)
            r7[r8] = r9
            int r8 = r8 + r0
            goto L_0x0093
        L_0x00a0:
            java.util.UUID r6 = defpackage.zw0.b
            byte[] r7 = defpackage.m5a.h(r6, r7, r1)
            r8 = r1
            goto L_0x00bf
        L_0x00a8:
            java.lang.String r6 = "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute."
            defpackage.i8b.V(r6)
            r6 = r1
        L_0x00ae:
            r7 = r6
        L_0x00af:
            r8 = r7
            goto L_0x00bf
        L_0x00b1:
            java.util.UUID r6 = defpackage.zw0.d
        L_0x00b3:
            r2 = r1
            r7 = r2
            goto L_0x00af
        L_0x00b6:
            java.util.UUID r6 = defpackage.zw0.e
            goto L_0x00b3
        L_0x00b9:
            java.util.UUID r6 = defpackage.zw0.c
            goto L_0x00b3
        L_0x00bc:
            r2 = r1
            r6 = r2
            goto L_0x00ae
        L_0x00bf:
            r13.next()
            java.lang.String r9 = "clearkey:Laurl"
            boolean r9 = defpackage.y7e.K(r13, r9)
            r10 = 4
            if (r9 != 0) goto L_0x00d3
            java.lang.String r9 = "dashif:Laurl"
            boolean r9 = defpackage.y7e.K(r13, r9)
            if (r9 == 0) goto L_0x00df
        L_0x00d3:
            int r9 = r13.next()
            if (r9 != r10) goto L_0x00df
            java.lang.String r8 = r13.getText()
            goto L_0x015d
        L_0x00df:
            java.lang.String r9 = "ms:laurl"
            boolean r9 = defpackage.y7e.K(r13, r9)
            if (r9 == 0) goto L_0x00ef
            java.lang.String r8 = "licenseUrl"
            java.lang.String r8 = r13.getAttributeValue(r1, r8)
            goto L_0x015d
        L_0x00ef:
            if (r7 != 0) goto L_0x0135
            boolean r9 = defpackage.y7e.J(r13)
            if (r9 == 0) goto L_0x0135
            java.lang.String r9 = r13.getName()
            int r11 = r9.indexOf(r4)
            if (r11 != r3) goto L_0x0102
            goto L_0x0107
        L_0x0102:
            int r11 = r11 + r0
            java.lang.String r9 = r9.substring(r11)
        L_0x0107:
            java.lang.String r11 = "pssh"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x0135
            int r9 = r13.next()
            if (r9 != r10) goto L_0x0135
            java.lang.String r6 = r13.getText()
            byte[] r6 = android.util.Base64.decode(r6, r5)
            z9c r7 = defpackage.m5a.N(r6)
            if (r7 != 0) goto L_0x0125
            r7 = r1
            goto L_0x0127
        L_0x0125:
            java.util.UUID r7 = r7.a
        L_0x0127:
            if (r7 != 0) goto L_0x0131
            java.lang.String r6 = "Skipping malformed cenc:pssh data"
            defpackage.i8b.V(r6)
            r6 = r7
            r7 = r1
            goto L_0x015d
        L_0x0131:
            r12 = r7
            r7 = r6
            r6 = r12
            goto L_0x015d
        L_0x0135:
            if (r7 != 0) goto L_0x015a
            java.util.UUID r9 = defpackage.zw0.e
            boolean r11 = r9.equals(r6)
            if (r11 == 0) goto L_0x015a
            java.lang.String r11 = "mspr:pro"
            boolean r11 = defpackage.y7e.K(r13, r11)
            if (r11 == 0) goto L_0x015a
            int r11 = r13.next()
            if (r11 != r10) goto L_0x015a
            java.lang.String r7 = r13.getText()
            byte[] r7 = android.util.Base64.decode(r7, r5)
            byte[] r7 = defpackage.m5a.h(r9, r1, r7)
            goto L_0x015d
        L_0x015a:
            b(r13)
        L_0x015d:
            java.lang.String r9 = "ContentProtection"
            boolean r9 = defpackage.y7e.H(r13, r9)
            if (r9 == 0) goto L_0x00bf
            if (r6 == 0) goto L_0x016e
            wv4 r1 = new wv4
            java.lang.String r13 = "video/mp4"
            r1.<init>(r6, r8, r13, r7)
        L_0x016e:
            android.util.Pair r13 = android.util.Pair.create(r2, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c64.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
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
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static om4 h(XmlPullParser xmlPullParser, String str) {
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
        } while (!y7e.H(xmlPullParser, str));
        return new om4(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = v0g.i.matcher(attributeValue);
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

    public static float k(XmlPullParser xmlPullParser, float f) {
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

    public static int l(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long m(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v6, resolved type: mod} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v66, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v67, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v68, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r122v3, resolved type: sod} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v77, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r119v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v68, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v70, resolved type: java.lang.Exception} */
    /* JADX WARNING: type inference failed for: r15v69 */
    /* JADX WARNING: type inference failed for: r100v8, types: [t2d] */
    /* JADX WARNING: type inference failed for: r100v9, types: [v2d] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x09bd, code lost:
        if ("audio/eac3-joc".equals(r0) != false) goto L_0x09c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x10fa, code lost:
        r86 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x10fc, code lost:
        r88 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x1183, code lost:
        r163.nextToken();
        r4 = r86;
        r6 = r88;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0980  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x09cd  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0c38  */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x0c3b  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0c56  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0c59  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0c75  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0c79  */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0ca8 A[LOOP:6: B:187:0x069e->B:440:0x0ca8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:536:0x0fe0 A[LOOP:5: B:125:0x03e6->B:536:0x0fe0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:637:0x13c9 A[LOOP:1: B:40:0x00cf->B:637:0x13c9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:642:0x1395 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:646:0x0e3c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:647:0x08fa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:661:0x09fd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.y54 n(org.xmlpull.v1.XmlPullParser r163, android.net.Uri r164) {
        /*
            r13 = r163
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
            long r0 = defpackage.v0g.V(r0)
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
            long r0 = defpackage.v0g.V(r0)
            r30 = r0
        L_0x008f:
            if (r23 == 0) goto L_0x0094
            r0 = 0
            goto L_0x0095
        L_0x0094:
            r0 = r6
        L_0x0095:
            ml0 r2 = new ml0
            java.lang.String r3 = r164.toString()
            java.lang.String r4 = r164.toString()
            if (r9 == 0) goto L_0x00a3
            r5 = r10
            goto L_0x00a5
        L_0x00a3:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a5:
            r2.<init>(r3, r4, r5, r10)
            ml0[] r2 = new defpackage.ml0[]{r2}
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
            r163.next()
            java.lang.String r3 = "BaseURL"
            boolean r41 = defpackage.y7e.K(r13, r3)
            if (r41 == 0) goto L_0x0101
            if (r35 != 0) goto L_0x00e2
            long r0 = d(r13, r0)
            r35 = r10
        L_0x00e2:
            java.util.ArrayList r3 = e(r13, r4, r9)
            r2.addAll(r3)
            r71 = r2
            r32 = r4
            r2 = r5
            r68 = r6
            r95 = r9
            r99 = r10
            r41 = r11
            r46 = r14
            r42 = 4
            r43 = -1
            r62 = 0
        L_0x00fe:
            r15 = r8
            goto L_0x138d
        L_0x0101:
            java.lang.String r11 = "ProgramInformation"
            boolean r42 = defpackage.y7e.K(r13, r11)
            java.lang.String r12 = "lang"
            if (r42 == 0) goto L_0x018c
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
            r163.next()
            java.lang.String r6 = "Title"
            boolean r6 = defpackage.y7e.K(r13, r6)
            if (r6 == 0) goto L_0x0137
            java.lang.String r3 = r163.nextText()
            goto L_0x0157
        L_0x0137:
            java.lang.String r6 = "Source"
            boolean r6 = defpackage.y7e.K(r13, r6)
            if (r6 == 0) goto L_0x0145
            java.lang.String r6 = r163.nextText()
            r12 = r6
            goto L_0x0157
        L_0x0145:
            java.lang.String r6 = "Copyright"
            boolean r6 = defpackage.y7e.K(r13, r6)
            if (r6 == 0) goto L_0x0154
            java.lang.String r6 = r163.nextText()
            r37 = r6
            goto L_0x0157
        L_0x0154:
            b(r163)
        L_0x0157:
            boolean r6 = defpackage.y7e.H(r13, r11)
            if (r6 == 0) goto L_0x0186
            m7c r6 = new m7c
            r44 = r6
            r45 = r3
            r46 = r12
            r47 = r37
            r44.<init>(r45, r46, r47, r48, r49)
            r71 = r2
            r32 = r4
            r2 = r5
            r37 = r6
        L_0x0171:
            r95 = r9
            r99 = r10
            r46 = r14
            r41 = 0
            r42 = 4
            r43 = -1
            r62 = 0
            r68 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00fe
        L_0x0186:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0127
        L_0x018c:
            java.lang.String r6 = "UTCTiming"
            boolean r6 = defpackage.y7e.K(r13, r6)
            java.lang.String r11 = "value"
            java.lang.String r7 = "schemeIdUri"
            if (r6 == 0) goto L_0x01ad
            java.lang.String r3 = r13.getAttributeValue(r8, r7)
            java.lang.String r6 = r13.getAttributeValue(r8, r11)
            te4 r7 = new te4
            r7.<init>(r3, r6, r10)
            r71 = r2
            r32 = r4
            r2 = r5
            r38 = r7
            goto L_0x0171
        L_0x01ad:
            java.lang.String r6 = "Location"
            boolean r6 = defpackage.y7e.K(r13, r6)
            if (r6 == 0) goto L_0x01c9
            java.lang.String r3 = r164.toString()
            java.lang.String r6 = r163.nextText()
            android.net.Uri r3 = defpackage.hi7.V(r3, r6)
            r71 = r2
            r39 = r3
            r32 = r4
            r2 = r5
            goto L_0x0171
        L_0x01c9:
            java.lang.String r6 = "ServiceDescription"
            boolean r42 = defpackage.y7e.K(r13, r6)
            if (r42 == 0) goto L_0x027f
            r42 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = r42
            r7 = r3
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r44 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r46 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01e6:
            r163.next()
            java.lang.String r10 = "Latency"
            boolean r10 = defpackage.y7e.K(r13, r10)
            java.lang.String r8 = "max"
            r52 = r0
            java.lang.String r0 = "min"
            if (r10 == 0) goto L_0x0215
            java.lang.String r1 = "target"
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r44 = m(r13, r1, r10)
            long r0 = m(r13, r0, r10)
            long r46 = m(r13, r8, r10)
            r57 = r0
            r61 = r3
            r62 = r7
            r55 = r44
        L_0x0212:
            r59 = r46
            goto L_0x0243
        L_0x0215:
            java.lang.String r1 = "PlaybackRate"
            boolean r1 = defpackage.y7e.K(r13, r1)
            if (r1 == 0) goto L_0x023a
            r1 = 0
            java.lang.String r0 = r13.getAttributeValue(r1, r0)
            if (r0 != 0) goto L_0x0227
            r3 = r42
            goto L_0x022c
        L_0x0227:
            float r0 = java.lang.Float.parseFloat(r0)
            r3 = r0
        L_0x022c:
            java.lang.String r0 = r13.getAttributeValue(r1, r8)
            if (r0 != 0) goto L_0x0235
            r7 = r42
            goto L_0x023a
        L_0x0235:
            float r0 = java.lang.Float.parseFloat(r0)
            r7 = r0
        L_0x023a:
            r61 = r3
            r62 = r7
            r55 = r11
            r57 = r44
            goto L_0x0212
        L_0x0243:
            boolean r0 = defpackage.y7e.H(r13, r6)
            if (r0 == 0) goto L_0x026f
            uq8 r0 = new uq8
            r54 = r0
            r54.<init>(r55, r57, r59, r61, r62)
            r40 = r0
            r71 = r2
            r32 = r4
            r2 = r5
            r95 = r9
            r46 = r14
            r0 = r52
            r15 = 0
            r41 = 0
            r42 = 4
            r43 = -1
            r62 = 0
            r68 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r99 = 1
            goto L_0x138d
        L_0x026f:
            r0 = r52
            r11 = r55
            r44 = r57
            r46 = r59
            r3 = r61
            r7 = r62
            r8 = 0
            r10 = 1
            goto L_0x01e6
        L_0x027f:
            r52 = r0
            java.lang.String r10 = "Period"
            boolean r0 = defpackage.y7e.K(r13, r10)
            if (r0 == 0) goto L_0x136e
            if (r36 != 0) goto L_0x136e
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0293
            r8 = r2
            goto L_0x0294
        L_0x0293:
            r8 = r4
        L_0x0294:
            java.lang.String r6 = "id"
            r0 = 0
            java.lang.String r55 = r13.getAttributeValue(r0, r6)
            java.lang.String r0 = "start"
            long r56 = i(r13, r0, r14)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r42 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r42 == 0) goto L_0x02af
            long r44 = r17 + r56
        L_0x02ac:
            r46 = r14
            goto L_0x02b2
        L_0x02af:
            r44 = r0
            goto L_0x02ac
        L_0x02b2:
            java.lang.String r14 = "duration"
            long r50 = i(r13, r14, r0)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r42 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r59 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r60 = r0
            r63 = r10
            r62 = r11
            r10 = r52
            r54 = 0
            r58 = 0
        L_0x02d7:
            r163.next()
            boolean r64 = defpackage.y7e.K(r13, r3)
            if (r64 == 0) goto L_0x0320
            if (r58 != 0) goto L_0x02e8
            long r10 = d(r13, r10)
            r58 = 1
        L_0x02e8:
            java.util.ArrayList r0 = e(r13, r8, r9)
            r14.addAll(r0)
            r71 = r2
            r85 = r3
            r32 = r4
            r83 = r5
            r33 = r7
            r96 = r8
            r95 = r9
            r81 = r14
            r67 = r15
            r66 = r42
            r64 = r52
            r34 = r59
            r16 = r62
            r0 = r63
            r15 = 0
            r41 = 0
            r42 = 4
            r43 = -1
            r62 = 0
            r68 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r99 = 1
            r59 = r6
            r14 = r12
            goto L_0x12e8
        L_0x0320:
            java.lang.String r1 = "AdaptationSet"
            boolean r0 = defpackage.y7e.K(r13, r1)
            java.lang.String r66 = ""
            r67 = r15
            java.lang.String r15 = "SegmentBase"
            r69 = r10
            java.lang.String r10 = "SegmentList"
            java.lang.String r11 = "SegmentTemplate"
            if (r0 == 0) goto L_0x102d
            boolean r0 = r14.isEmpty()
            r72 = r1
            r71 = r2
            if (r0 != 0) goto L_0x0340
            r0 = r14
            goto L_0x0341
        L_0x0340:
            r0 = r8
        L_0x0341:
            r1 = -1
            long r74 = m(r13, r6, r1)
            int r1 = g(r163)
            java.lang.String r2 = "mimeType"
            r73 = r1
            r1 = 0
            java.lang.String r76 = r13.getAttributeValue(r1, r2)
            r81 = r14
            java.lang.String r14 = "codecs"
            java.lang.String r77 = r13.getAttributeValue(r1, r14)
            java.lang.String r1 = "width"
            r78 = r4
            r79 = r11
            r4 = -1
            int r11 = l(r13, r1, r4)
            r80 = r8
            java.lang.String r8 = "height"
            r82 = r7
            int r7 = l(r13, r8, r4)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = k(r13, r4)
            r83 = r5
            java.lang.String r5 = "audioSamplingRate"
            r84 = r10
            r85 = r15
            r10 = -1
            int r15 = l(r13, r5, r10)
            r10 = 0
            java.lang.String r86 = r13.getAttributeValue(r10, r12)
            r87 = r5
            java.lang.String r5 = "label"
            java.lang.String r5 = r13.getAttributeValue(r10, r5)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r88 = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r89 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r90 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r91 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r92 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r93 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r94 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r95 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r96 = r1
            r99 = r6
            r100 = r7
            r97 = r11
            r101 = r54
            r102 = r60
            r6 = r69
            r1 = r73
            r11 = r86
            r73 = 0
            r86 = -1
            r98 = 0
        L_0x03e6:
            r163.next()
            boolean r104 = defpackage.y7e.K(r13, r3)
            if (r104 == 0) goto L_0x0452
            if (r98 != 0) goto L_0x03fa
            long r6 = d(r13, r6)
            r104 = r6
            r98 = 1
            goto L_0x03fc
        L_0x03fa:
            r104 = r6
        L_0x03fc:
            java.util.ArrayList r6 = e(r13, r0, r9)
            r8.addAll(r6)
        L_0x0403:
            r129 = r2
            r16 = r5
        L_0x0407:
            r148 = r10
            r10 = r12
            r115 = r14
            r64 = r52
            r144 = r62
            r145 = r63
            r48 = r69
            r32 = r78
            r161 = r79
            r140 = r82
            r14 = r84
            r78 = r87
            r6 = r88
            r138 = r89
            r128 = r91
            r33 = r92
            r52 = r93
            r142 = r95
            r62 = r97
            r141 = r99
            r53 = r100
            r12 = 0
            r41 = 0
            r99 = 1
            r84 = r0
            r89 = r4
            r97 = r8
            r95 = r9
            r69 = r11
            r63 = r15
            r0 = r72
            r15 = r85
            r72 = r96
            r11 = 4
            r85 = r3
            r96 = r80
            r3 = r90
            r80 = r94
            goto L_0x0e36
        L_0x0452:
            r104 = r6
            java.lang.String r6 = "ContentProtection"
            boolean r7 = defpackage.y7e.K(r13, r6)
            if (r7 == 0) goto L_0x0472
            android.util.Pair r6 = f(r163)
            java.lang.Object r7 = r6.first
            if (r7 == 0) goto L_0x0468
            r73 = r7
            java.lang.String r73 = (java.lang.String) r73
        L_0x0468:
            java.lang.Object r6 = r6.second
            if (r6 == 0) goto L_0x0403
            wv4 r6 = (defpackage.wv4) r6
            r10.add(r6)
            goto L_0x0403
        L_0x0472:
            java.lang.String r7 = "ContentComponent"
            boolean r7 = defpackage.y7e.K(r13, r7)
            if (r7 == 0) goto L_0x04a5
            r7 = 0
            java.lang.String r6 = r13.getAttributeValue(r7, r12)
            if (r11 != 0) goto L_0x0483
            r11 = r6
            goto L_0x048d
        L_0x0483:
            if (r6 != 0) goto L_0x0486
            goto L_0x048d
        L_0x0486:
            boolean r6 = r11.equals(r6)
            defpackage.n79.n(r6)
        L_0x048d:
            int r6 = g(r163)
            r7 = -1
            if (r1 != r7) goto L_0x0497
            r1 = r6
            goto L_0x0403
        L_0x0497:
            if (r6 != r7) goto L_0x049b
            goto L_0x0403
        L_0x049b:
            if (r1 != r6) goto L_0x049f
            r6 = 1
            goto L_0x04a0
        L_0x049f:
            r6 = 0
        L_0x04a0:
            defpackage.n79.n(r6)
            goto L_0x0403
        L_0x04a5:
            java.lang.String r7 = "Role"
            boolean r106 = defpackage.y7e.K(r13, r7)
            if (r106 == 0) goto L_0x0507
            om4 r6 = h(r13, r7)
            r15.add(r6)
            r129 = r2
            r16 = r5
            r148 = r10
            r10 = r12
            r115 = r14
            r64 = r52
            r144 = r62
            r145 = r63
            r48 = r69
            r136 = r72
            r32 = r78
            r161 = r79
            r140 = r82
            r14 = r84
            r78 = r87
            r6 = r88
            r138 = r89
            r128 = r91
            r33 = r92
            r52 = r93
            r142 = r95
            r72 = r96
            r62 = r97
            r141 = r99
            r53 = r100
            r12 = 0
            r41 = 0
            r99 = 1
            r84 = r0
        L_0x04ec:
            r70 = r1
            r89 = r4
            r97 = r8
            r95 = r9
            r69 = r11
            r63 = r15
            r96 = r80
            r15 = r85
            r80 = r94
            r0 = r102
            r11 = 4
            r85 = r3
            r3 = r90
            goto L_0x0e30
        L_0x0507:
            java.lang.String r7 = "AudioChannelConfiguration"
            boolean r106 = defpackage.y7e.K(r13, r7)
            if (r106 == 0) goto L_0x051b
            int r6 = c(r163)
            r129 = r2
            r16 = r5
            r86 = r6
            goto L_0x0407
        L_0x051b:
            r106 = r0
            java.lang.String r0 = "Accessibility"
            boolean r107 = defpackage.y7e.K(r13, r0)
            if (r107 == 0) goto L_0x0565
            om4 r0 = h(r13, r0)
            r5.add(r0)
        L_0x052c:
            r129 = r2
            r16 = r5
            r148 = r10
            r10 = r12
            r115 = r14
            r64 = r52
            r144 = r62
            r145 = r63
            r48 = r69
            r136 = r72
            r32 = r78
            r161 = r79
            r140 = r82
            r14 = r84
            r78 = r87
            r6 = r88
            r138 = r89
            r128 = r91
            r33 = r92
            r52 = r93
            r142 = r95
            r72 = r96
            r62 = r97
            r141 = r99
            r53 = r100
            r84 = r106
            r12 = 0
            r41 = 0
            r99 = 1
            goto L_0x04ec
        L_0x0565:
            java.lang.String r0 = "EssentialProperty"
            boolean r107 = defpackage.y7e.K(r13, r0)
            if (r107 == 0) goto L_0x0575
            om4 r0 = h(r13, r0)
            r4.add(r0)
            goto L_0x052c
        L_0x0575:
            r107 = r15
            java.lang.String r15 = "SupplementalProperty"
            boolean r108 = defpackage.y7e.K(r13, r15)
            if (r108 == 0) goto L_0x05db
            om4 r0 = h(r13, r15)
            r6 = r100
            r6.add(r0)
            r129 = r2
            r16 = r5
            r148 = r10
            r10 = r12
            r115 = r14
            r64 = r52
            r144 = r62
            r145 = r63
            r48 = r69
            r136 = r72
            r32 = r78
            r161 = r79
            r140 = r82
            r14 = r84
            r15 = r85
            r78 = r87
            r138 = r89
            r128 = r91
            r33 = r92
            r52 = r93
            r142 = r95
            r72 = r96
            r62 = r97
            r141 = r99
            r84 = r106
            r63 = r107
            r12 = 0
            r41 = 0
            r99 = 1
            r70 = r1
            r85 = r3
            r89 = r4
            r53 = r6
            r97 = r8
            r95 = r9
            r69 = r11
            r96 = r80
            r6 = r88
            r3 = r90
            r80 = r94
            r0 = r102
            r11 = 4
            goto L_0x0e30
        L_0x05db:
            r108 = r15
            r162 = r100
            r100 = r6
            r6 = r162
            java.lang.String r15 = "Representation"
            boolean r109 = defpackage.y7e.K(r13, r15)
            r110 = r15
            java.lang.String r15 = "InbandEventStream"
            if (r109 == 0) goto L_0x0d12
            boolean r109 = r8.isEmpty()
            if (r109 != 0) goto L_0x0603
            r109 = r8
            r49 = r10
            r111 = r12
            r10 = r99
            r99 = r15
            r8 = 0
            r15 = r109
            goto L_0x0610
        L_0x0603:
            r109 = r8
            r49 = r10
            r111 = r12
            r10 = r99
            r8 = 0
            r99 = r15
            r15 = r106
        L_0x0610:
            java.lang.String r12 = r13.getAttributeValue(r8, r10)
            java.lang.String r8 = "bandwidth"
            r113 = r12
            r12 = -1
            int r8 = l(r13, r8, r12)
            r12 = 0
            java.lang.String r112 = r13.getAttributeValue(r12, r2)
            if (r112 != 0) goto L_0x0627
            r114 = r76
            goto L_0x0629
        L_0x0627:
            r114 = r112
        L_0x0629:
            java.lang.String r112 = r13.getAttributeValue(r12, r14)
            r115 = r14
            if (r112 != 0) goto L_0x0633
            r112 = r77
        L_0x0633:
            r12 = r96
            r162 = r97
            r97 = r10
            r10 = r162
            int r14 = l(r13, r12, r10)
            r116 = r8
            r8 = r94
            r94 = r14
            r162 = r93
            r93 = r10
            r10 = r162
            int r14 = l(r13, r8, r10)
            r117 = r5
            r5 = r92
            r92 = r14
            float r14 = k(r13, r5)
            r118 = r5
            r5 = r87
            r87 = r14
            r14 = r91
            r91 = r12
            int r12 = l(r13, r5, r14)
            r128 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r124 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r125 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r4)
            r126 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r6)
            r127 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r130 = r0
            r129 = r1
            r122 = r10
            r121 = r11
            r131 = r86
            r123 = r101
            r0 = r102
            r10 = r104
            r119 = 0
            r120 = 0
        L_0x069e:
            r163.next()
            boolean r132 = defpackage.y7e.K(r13, r3)
            if (r132 == 0) goto L_0x0721
            if (r120 != 0) goto L_0x06b2
            long r10 = d(r13, r10)
            r132 = r2
            r120 = 1
            goto L_0x06b4
        L_0x06b2:
            r132 = r2
        L_0x06b4:
            java.util.ArrayList r2 = e(r13, r15, r9)
            r14.addAll(r2)
        L_0x06bb:
            r152 = r12
            r148 = r49
            r64 = r52
            r144 = r62
            r145 = r63
            r48 = r69
            r136 = r72
            r32 = r78
            r96 = r80
            r140 = r82
            r146 = r84
            r137 = r85
            r147 = r88
            r138 = r89
            r139 = r90
            r72 = r91
            r62 = r93
            r142 = r95
            r141 = r97
            r2 = r99
            r84 = r106
            r97 = r109
            r150 = r111
            r151 = r113
            r143 = r116
            r33 = r118
            r149 = r121
            r52 = r122
            r135 = r129
            r12 = r131
            r129 = r132
            r41 = 0
            r85 = r3
            r89 = r4
            r78 = r5
            r53 = r6
            r90 = r7
            r80 = r8
            r95 = r9
            r82 = r14
            r106 = r15
            r14 = r100
            r6 = r108
            r15 = r110
            r8 = r119
            r3 = r124
            r5 = r125
            r7 = r126
            r9 = r127
            r4 = r130
            goto L_0x08f4
        L_0x0721:
            r132 = r2
            boolean r2 = defpackage.y7e.K(r13, r7)
            if (r2 == 0) goto L_0x072e
            int r131 = c(r163)
            goto L_0x06bb
        L_0x072e:
            r2 = r85
            boolean r85 = defpackage.y7e.K(r13, r2)
            if (r85 == 0) goto L_0x0742
            r85 = r2
            r2 = r123
            sod r2 = (defpackage.sod) r2
            sod r123 = r(r13, r2)
            goto L_0x06bb
        L_0x0742:
            r85 = r2
            r2 = r84
            boolean r84 = defpackage.y7e.K(r13, r2)
            if (r84 == 0) goto L_0x07da
            long r133 = d(r13, r0)
            r1 = r123
            mod r1 = (defpackage.mod) r1
            r64 = r52
            r84 = r106
            r52 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r106 = r15
            r15 = r130
            r0 = r163
            r136 = r72
            r72 = r91
            r135 = r129
            r91 = r2
            r137 = r85
            r129 = r132
            r85 = r3
            r2 = r44
            r32 = r78
            r138 = r89
            r139 = r90
            r33 = r118
            r89 = r4
            r78 = r5
            r4 = r50
            r53 = r6
            r90 = r7
            r140 = r82
            r141 = r97
            r52 = r122
            r82 = r14
            r14 = r100
            r6 = r10
            r96 = r80
            r142 = r95
            r97 = r109
            r143 = r116
            r80 = r8
            r95 = r9
            r8 = r133
            r148 = r49
            r144 = r62
            r145 = r63
            r48 = r69
            r15 = r79
            r147 = r88
            r146 = r91
            r62 = r93
            r149 = r121
            r41 = 0
            r69 = r10
            r10 = r26
            mod r123 = s(r0, r1, r2, r4, r6, r8, r10)
            r152 = r12
            r10 = r69
            r2 = r99
            r6 = r108
            r15 = r110
            r150 = r111
            r151 = r113
            r8 = r119
            r3 = r124
            r5 = r125
            r7 = r126
            r9 = r127
            r4 = r130
            r12 = r131
            r0 = r133
            goto L_0x08f4
        L_0x07da:
            r146 = r2
            r148 = r49
            r64 = r52
            r144 = r62
            r145 = r63
            r48 = r69
            r136 = r72
            r32 = r78
            r96 = r80
            r140 = r82
            r137 = r85
            r147 = r88
            r138 = r89
            r139 = r90
            r72 = r91
            r62 = r93
            r142 = r95
            r141 = r97
            r84 = r106
            r97 = r109
            r143 = r116
            r33 = r118
            r149 = r121
            r52 = r122
            r135 = r129
            r129 = r132
            r41 = 0
            r85 = r3
            r89 = r4
            r78 = r5
            r53 = r6
            r90 = r7
            r80 = r8
            r95 = r9
            r69 = r10
            r82 = r14
            r106 = r15
            r15 = r79
            r14 = r100
            boolean r2 = defpackage.y7e.K(r13, r15)
            if (r2 == 0) goto L_0x086b
            long r121 = d(r13, r0)
            r1 = r123
            ood r1 = (defpackage.ood) r1
            r0 = r163
            r2 = r53
            r3 = r44
            r5 = r50
            r7 = r69
            r9 = r121
            r152 = r12
            r79 = r15
            r150 = r111
            r151 = r113
            r15 = -1
            r11 = r26
            ood r123 = t(r0, r1, r2, r3, r5, r7, r9, r11)
            r10 = r69
            r2 = r99
            r6 = r108
            r15 = r110
            r8 = r119
            r0 = r121
            r3 = r124
        L_0x085f:
            r5 = r125
            r7 = r126
            r9 = r127
            r4 = r130
        L_0x0867:
            r12 = r131
            goto L_0x08f4
        L_0x086b:
            r152 = r12
            r79 = r15
            r150 = r111
            r151 = r113
            r15 = -1
            boolean r2 = defpackage.y7e.K(r13, r14)
            if (r2 == 0) goto L_0x089f
            android.util.Pair r2 = f(r163)
            java.lang.Object r3 = r2.first
            if (r3 == 0) goto L_0x0886
            r119 = r3
            java.lang.String r119 = (java.lang.String) r119
        L_0x0886:
            java.lang.Object r2 = r2.second
            if (r2 == 0) goto L_0x0892
            wv4 r2 = (defpackage.wv4) r2
            r3 = r124
            r3.add(r2)
            goto L_0x0894
        L_0x0892:
            r3 = r124
        L_0x0894:
            r10 = r69
            r2 = r99
            r6 = r108
            r15 = r110
            r8 = r119
            goto L_0x085f
        L_0x089f:
            r2 = r99
            r3 = r124
            boolean r4 = defpackage.y7e.K(r13, r2)
            if (r4 == 0) goto L_0x08bb
            om4 r4 = h(r13, r2)
            r5 = r125
            r5.add(r4)
            r6 = r108
            r7 = r126
            r9 = r127
            r4 = r130
            goto L_0x08ec
        L_0x08bb:
            r5 = r125
            r4 = r130
            boolean r6 = defpackage.y7e.K(r13, r4)
            if (r6 == 0) goto L_0x08d3
            om4 r6 = h(r13, r4)
            r7 = r126
            r7.add(r6)
            r6 = r108
            r9 = r127
            goto L_0x08ec
        L_0x08d3:
            r6 = r108
            r7 = r126
            boolean r8 = defpackage.y7e.K(r13, r6)
            if (r8 == 0) goto L_0x08e7
            om4 r8 = h(r13, r6)
            r9 = r127
            r9.add(r8)
            goto L_0x08ec
        L_0x08e7:
            r9 = r127
            b(r163)
        L_0x08ec:
            r10 = r69
            r15 = r110
            r8 = r119
            goto L_0x0867
        L_0x08f4:
            boolean r63 = defpackage.y7e.H(r13, r15)
            if (r63 == 0) goto L_0x0ca8
            boolean r0 = defpackage.vq9.h(r114)
            if (r0 == 0) goto L_0x0926
            if (r112 != 0) goto L_0x0905
            r0 = 0
        L_0x0903:
            r2 = 1
            goto L_0x0923
        L_0x0905:
            java.lang.String[] r0 = defpackage.v0g.e0(r112)
            int r1 = r0.length
            r11 = r41
        L_0x090c:
            if (r11 >= r1) goto L_0x0921
            r2 = r0[r11]
            java.lang.String r2 = defpackage.vq9.c(r2)
            if (r2 == 0) goto L_0x091e
            boolean r4 = defpackage.vq9.h(r2)
            if (r4 == 0) goto L_0x091e
            r0 = r2
            goto L_0x0903
        L_0x091e:
            r2 = 1
            int r11 = r11 + r2
            goto L_0x090c
        L_0x0921:
            r2 = 1
            r0 = 0
        L_0x0923:
            r1 = r114
            goto L_0x0978
        L_0x0926:
            r2 = 1
            boolean r0 = defpackage.vq9.k(r114)
            if (r0 == 0) goto L_0x094d
            if (r112 != 0) goto L_0x0931
        L_0x092f:
            r4 = 0
            goto L_0x094b
        L_0x0931:
            java.lang.String[] r0 = defpackage.v0g.e0(r112)
            int r1 = r0.length
            r11 = r41
        L_0x0938:
            if (r11 >= r1) goto L_0x092f
            r4 = r0[r11]
            java.lang.String r4 = defpackage.vq9.c(r4)
            if (r4 == 0) goto L_0x0949
            boolean r6 = defpackage.vq9.k(r4)
            if (r6 == 0) goto L_0x0949
            goto L_0x094b
        L_0x0949:
            int r11 = r11 + r2
            goto L_0x0938
        L_0x094b:
            r0 = r4
            goto L_0x0923
        L_0x094d:
            boolean r0 = defpackage.vq9.j(r114)
            if (r0 == 0) goto L_0x0957
        L_0x0953:
            r0 = r114
            r1 = r0
            goto L_0x0978
        L_0x0957:
            boolean r0 = defpackage.vq9.i(r114)
            if (r0 == 0) goto L_0x095e
            goto L_0x0953
        L_0x095e:
            java.lang.String r0 = "application/mp4"
            r1 = r114
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0977
            java.lang.String r0 = defpackage.vq9.c(r112)
            java.lang.String r4 = "text/vtt"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0978
            java.lang.String r0 = "application/x-mp4-vtt"
            goto L_0x0978
        L_0x0977:
            r0 = 0
        L_0x0978:
            java.lang.String r4 = "audio/eac3"
            boolean r6 = r4.equals(r0)
            if (r6 == 0) goto L_0x09c0
            r11 = r41
        L_0x0982:
            int r0 = r9.size()
            java.lang.String r6 = "audio/eac3-joc"
            java.lang.String r10 = "ec+3"
            if (r11 >= r0) goto L_0x09b8
            java.lang.Object r0 = r9.get(r11)
            om4 r0 = (defpackage.om4) r0
            java.lang.String r14 = r0.a
            java.lang.String r15 = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018"
            boolean r15 = r15.equals(r14)
            java.lang.String r0 = r0.b
            if (r15 == 0) goto L_0x09a6
            java.lang.String r15 = "JOC"
            boolean r15 = r15.equals(r0)
            if (r15 != 0) goto L_0x09b4
        L_0x09a6:
            java.lang.String r15 = "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x09b6
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x09b6
        L_0x09b4:
            r0 = r6
            goto L_0x09b9
        L_0x09b6:
            int r11 = r11 + r2
            goto L_0x0982
        L_0x09b8:
            r0 = r4
        L_0x09b9:
            boolean r4 = r6.equals(r0)
            if (r4 == 0) goto L_0x09c0
            goto L_0x09c2
        L_0x09c0:
            r10 = r112
        L_0x09c2:
            r4 = r41
            r11 = r4
        L_0x09c5:
            int r6 = r107.size()
            java.lang.String r14 = "urn:mpeg:dash:role:2011"
            if (r11 >= r6) goto L_0x09fd
            r6 = r107
            java.lang.Object r15 = r6.get(r11)
            om4 r15 = (defpackage.om4) r15
            java.lang.String r2 = r15.a
            boolean r2 = defpackage.o54.l(r14, r2)
            if (r2 == 0) goto L_0x09f8
            java.lang.String r2 = r15.b
            if (r2 != 0) goto L_0x09e4
        L_0x09e1:
            r2 = r41
            goto L_0x09f6
        L_0x09e4:
            java.lang.String r14 = "forced_subtitle"
            boolean r14 = r2.equals(r14)
            if (r14 != 0) goto L_0x09f5
            java.lang.String r14 = "forced-subtitle"
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L_0x09f5
            goto L_0x09e1
        L_0x09f5:
            r2 = 2
        L_0x09f6:
            r2 = r2 | r4
            r4 = r2
        L_0x09f8:
            r2 = 1
            int r11 = r11 + r2
            r107 = r6
            goto L_0x09c5
        L_0x09fd:
            r6 = r107
            r2 = r41
            r11 = r2
        L_0x0a02:
            int r15 = r6.size()
            if (r11 >= r15) goto L_0x0a24
            java.lang.Object r15 = r6.get(r11)
            om4 r15 = (defpackage.om4) r15
            r107 = r6
            java.lang.String r6 = r15.a
            boolean r6 = defpackage.o54.l(r14, r6)
            if (r6 == 0) goto L_0x0a1f
            java.lang.String r6 = r15.b
            int r6 = p(r6)
            r2 = r2 | r6
        L_0x0a1f:
            r6 = 1
            int r11 = r11 + r6
            r6 = r107
            goto L_0x0a02
        L_0x0a24:
            r107 = r6
            r6 = r41
            r11 = r6
        L_0x0a29:
            int r15 = r117.size()
            if (r11 >= r15) goto L_0x0abb
            r15 = r117
            java.lang.Object r63 = r15.get(r11)
            r13 = r63
            om4 r13 = (defpackage.om4) r13
            r125 = r5
            java.lang.String r5 = r13.a
            boolean r5 = defpackage.o54.l(r14, r5)
            r63 = r14
            java.lang.String r14 = r13.b
            if (r5 == 0) goto L_0x0a50
            int r5 = p(r14)
        L_0x0a4b:
            r5 = r5 | r6
            r6 = r5
        L_0x0a4d:
            r5 = 1
            goto L_0x0ab0
        L_0x0a50:
            java.lang.String r5 = "urn:tva:metadata:cs:AudioPurposeCS:2007"
            java.lang.String r13 = r13.a
            boolean r5 = defpackage.o54.l(r5, r13)
            if (r5 == 0) goto L_0x0a4d
            if (r14 != 0) goto L_0x0a5f
        L_0x0a5c:
            r5 = r41
            goto L_0x0a4b
        L_0x0a5f:
            int r5 = r14.hashCode()
            switch(r5) {
                case 49: goto L_0x0a94;
                case 50: goto L_0x0a89;
                case 51: goto L_0x0a7e;
                case 52: goto L_0x0a73;
                case 53: goto L_0x0a66;
                case 54: goto L_0x0a68;
                default: goto L_0x0a66;
            }
        L_0x0a66:
            r5 = -1
            goto L_0x0a9f
        L_0x0a68:
            java.lang.String r5 = "6"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x0a71
            goto L_0x0a66
        L_0x0a71:
            r5 = 4
            goto L_0x0a9f
        L_0x0a73:
            java.lang.String r5 = "4"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x0a7c
            goto L_0x0a66
        L_0x0a7c:
            r5 = 3
            goto L_0x0a9f
        L_0x0a7e:
            java.lang.String r5 = "3"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x0a87
            goto L_0x0a66
        L_0x0a87:
            r5 = 2
            goto L_0x0a9f
        L_0x0a89:
            java.lang.String r5 = "2"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x0a92
            goto L_0x0a66
        L_0x0a92:
            r5 = 1
            goto L_0x0a9f
        L_0x0a94:
            java.lang.String r5 = "1"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x0a9d
            goto L_0x0a66
        L_0x0a9d:
            r5 = r41
        L_0x0a9f:
            switch(r5) {
                case 0: goto L_0x0aad;
                case 1: goto L_0x0aaa;
                case 2: goto L_0x0aa8;
                case 3: goto L_0x0aa5;
                case 4: goto L_0x0aa3;
                default: goto L_0x0aa2;
            }
        L_0x0aa2:
            goto L_0x0a5c
        L_0x0aa3:
            r5 = 1
            goto L_0x0a4b
        L_0x0aa5:
            r5 = 8
            goto L_0x0a4b
        L_0x0aa8:
            r5 = 4
            goto L_0x0a4b
        L_0x0aaa:
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0a4b
        L_0x0aad:
            r5 = 512(0x200, float:7.175E-43)
            goto L_0x0a4b
        L_0x0ab0:
            int r11 = r11 + r5
            r13 = r163
            r117 = r15
            r14 = r63
            r5 = r125
            goto L_0x0a29
        L_0x0abb:
            r125 = r5
            r15 = r117
            r2 = r2 | r6
            int r5 = q(r7)
            r2 = r2 | r5
            int r5 = q(r9)
            r2 = r2 | r5
            r11 = r41
        L_0x0acc:
            int r5 = r7.size()
            if (r11 >= r5) goto L_0x0b21
            java.lang.Object r5 = r7.get(r11)
            om4 r5 = (defpackage.om4) r5
            java.lang.String r6 = r5.a
            java.lang.String r13 = "http://dashif.org/thumbnail_tile"
            boolean r6 = defpackage.o54.l(r13, r6)
            if (r6 != 0) goto L_0x0af0
            java.lang.String r6 = "http://dashif.org/guidelines/thumbnail_tile"
            java.lang.String r13 = r5.a
            boolean r6 = defpackage.o54.l(r6, r13)
            if (r6 == 0) goto L_0x0aed
            goto L_0x0af0
        L_0x0aed:
            r5 = 1
            r13 = 2
            goto L_0x0b1f
        L_0x0af0:
            java.lang.String r5 = r5.b
            if (r5 == 0) goto L_0x0b1d
            int r6 = defpackage.v0g.a
            java.lang.String r6 = "x"
            r13 = -1
            java.lang.String[] r5 = r5.split(r6, r13)
            int r6 = r5.length
            r13 = 2
            if (r6 == r13) goto L_0x0b03
        L_0x0b01:
            r5 = 1
            goto L_0x0b1f
        L_0x0b03:
            r6 = r5[r41]     // Catch:{ NumberFormatException -> 0x0b01 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0b01 }
            r14 = 1
            r5 = r5[r14]     // Catch:{ NumberFormatException -> 0x0b01 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0b01 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0b01 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0b01 }
            android.util.Pair r5 = android.util.Pair.create(r6, r5)     // Catch:{ NumberFormatException -> 0x0b01 }
            goto L_0x0b23
        L_0x0b1d:
            r13 = 2
            goto L_0x0b01
        L_0x0b1f:
            int r11 = r11 + r5
            goto L_0x0acc
        L_0x0b21:
            r13 = 2
            r5 = 0
        L_0x0b23:
            ba6 r6 = new ba6
            r6.<init>()
            r11 = r151
            r6.a = r11
            java.lang.String r1 = defpackage.vq9.l(r1)
            r6.l = r1
            java.lang.String r1 = defpackage.vq9.l(r0)
            r6.m = r1
            r6.i = r10
            r1 = r143
            r6.h = r1
            r6.e = r4
            r6.f = r2
            r1 = r149
            r6.d = r1
            if (r5 == 0) goto L_0x0b51
            java.lang.Object r2 = r5.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x0b52
        L_0x0b51:
            r2 = -1
        L_0x0b52:
            r6.H = r2
            if (r5 == 0) goto L_0x0b5f
            java.lang.Object r2 = r5.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x0b60
        L_0x0b5f:
            r2 = -1
        L_0x0b60:
            r6.I = r2
            boolean r2 = defpackage.vq9.k(r0)
            if (r2 == 0) goto L_0x0b77
            r5 = r94
            r6.s = r5
            r2 = r92
            r6.t = r2
            r0 = r87
            r6.u = r0
        L_0x0b74:
            r4 = 1
            goto L_0x0c31
        L_0x0b77:
            r2 = r92
            r5 = r94
            boolean r4 = defpackage.vq9.h(r0)
            if (r4 == 0) goto L_0x0b88
            r6.A = r12
            r0 = r152
            r6.B = r0
            goto L_0x0b74
        L_0x0b88:
            boolean r4 = defpackage.vq9.j(r0)
            if (r4 == 0) goto L_0x0c26
            java.lang.String r2 = "application/cea-608"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0bd9
            r11 = r41
        L_0x0b98:
            int r0 = r15.size()
            if (r11 >= r0) goto L_0x0bd6
            java.lang.Object r0 = r15.get(r11)
            om4 r0 = (defpackage.om4) r0
            java.lang.String r2 = r0.a
            java.lang.String r4 = "urn:scte:dash:cc:cea-608:2015"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0bd3
            java.lang.String r0 = r0.b
            if (r0 == 0) goto L_0x0bd3
            java.util.regex.Pattern r2 = c
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r4 = r2.matches()
            if (r4 == 0) goto L_0x0bc8
            r4 = 1
            java.lang.String r0 = r2.group(r4)
            int r12 = java.lang.Integer.parseInt(r0)
            goto L_0x0bd7
        L_0x0bc8:
            r4 = 1
            java.lang.String r2 = "Unable to parse CEA-608 channel number from: "
            java.lang.String r0 = r2.concat(r0)
            defpackage.i8b.V(r0)
            goto L_0x0bd4
        L_0x0bd3:
            r4 = 1
        L_0x0bd4:
            int r11 = r11 + r4
            goto L_0x0b98
        L_0x0bd6:
            r12 = -1
        L_0x0bd7:
            r4 = 1
            goto L_0x0c23
        L_0x0bd9:
            java.lang.String r2 = "application/cea-708"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c21
            r11 = r41
        L_0x0be3:
            int r0 = r15.size()
            if (r11 >= r0) goto L_0x0c21
            java.lang.Object r0 = r15.get(r11)
            om4 r0 = (defpackage.om4) r0
            java.lang.String r2 = r0.a
            java.lang.String r4 = "urn:scte:dash:cc:cea-708:2015"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0c1e
            java.lang.String r0 = r0.b
            if (r0 == 0) goto L_0x0c1e
            java.util.regex.Pattern r2 = o
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r4 = r2.matches()
            if (r4 == 0) goto L_0x0c13
            r4 = 1
            java.lang.String r0 = r2.group(r4)
            int r12 = java.lang.Integer.parseInt(r0)
            goto L_0x0c23
        L_0x0c13:
            r4 = 1
            java.lang.String r2 = "Unable to parse CEA-708 service block number from: "
            java.lang.String r0 = r2.concat(r0)
            defpackage.i8b.V(r0)
            goto L_0x0c1f
        L_0x0c1e:
            r4 = 1
        L_0x0c1f:
            int r11 = r11 + r4
            goto L_0x0be3
        L_0x0c21:
            r4 = 1
            r12 = -1
        L_0x0c23:
            r6.F = r12
            goto L_0x0c31
        L_0x0c26:
            r4 = 1
            boolean r0 = defpackage.vq9.i(r0)
            if (r0 == 0) goto L_0x0c31
            r6.s = r5
            r6.t = r2
        L_0x0c31:
            ea6 r0 = new ea6
            r0.<init>(r6)
            if (r123 == 0) goto L_0x0c3b
            r122 = r123
            goto L_0x0c4e
        L_0x0c3b:
            sod r2 = new sod
            r153 = 1
            r155 = 0
            r152 = 0
            r157 = 0
            r159 = 0
            r151 = r2
            r151.<init>(r152, r153, r155, r157, r159)
            r122 = r2
        L_0x0c4e:
            a64 r2 = new a64
            boolean r5 = r82.isEmpty()
            if (r5 != 0) goto L_0x0c59
            r121 = r82
            goto L_0x0c5b
        L_0x0c59:
            r121 = r106
        L_0x0c5b:
            r119 = r2
            r120 = r0
            r123 = r8
            r124 = r3
            r126 = r7
            r127 = r9
            r119.<init>(r120, r121, r122, r123, r124, r125, r126, r127)
            java.lang.String r0 = r0.n
            int r0 = defpackage.vq9.g(r0)
            r3 = r135
            r5 = -1
            if (r3 != r5) goto L_0x0c79
            r3 = r0
        L_0x0c76:
            r0 = r142
            goto L_0x0c86
        L_0x0c79:
            if (r0 != r5) goto L_0x0c7c
            goto L_0x0c76
        L_0x0c7c:
            if (r3 != r0) goto L_0x0c80
            r10 = r4
            goto L_0x0c82
        L_0x0c80:
            r10 = r41
        L_0x0c82:
            defpackage.n79.n(r10)
            goto L_0x0c76
        L_0x0c86:
            r0.add(r2)
            r13 = r163
            r142 = r0
            r69 = r1
            r1 = r3
            r99 = r4
            r16 = r15
            r161 = r79
            r63 = r107
            r0 = r136
            r15 = r137
        L_0x0c9c:
            r3 = r139
            r14 = r146
        L_0x0ca0:
            r6 = r147
            r10 = r150
            r11 = 4
            r12 = 0
            goto L_0x0e36
        L_0x0ca8:
            r125 = r5
            r93 = r87
            r5 = r94
            r13 = r163
            r99 = r2
            r124 = r3
            r130 = r4
            r108 = r6
            r126 = r7
            r119 = r8
            r127 = r9
            r131 = r12
            r100 = r14
            r110 = r15
            r118 = r33
            r69 = r48
            r122 = r52
            r6 = r53
            r52 = r64
            r91 = r72
            r5 = r78
            r8 = r80
            r14 = r82
            r3 = r85
            r4 = r89
            r7 = r90
            r9 = r95
            r80 = r96
            r109 = r97
            r15 = r106
            r2 = r129
            r129 = r135
            r72 = r136
            r85 = r137
            r89 = r138
            r90 = r139
            r82 = r140
            r97 = r141
            r95 = r142
            r116 = r143
            r63 = r145
            r88 = r147
            r49 = r148
            r121 = r149
            r111 = r150
            r113 = r151
            r12 = r152
            r78 = r32
            r93 = r62
            r106 = r84
            r62 = r144
            r84 = r146
            goto L_0x069e
        L_0x0d12:
            r129 = r2
            r16 = r5
            r148 = r10
            r150 = r12
            r12 = r13
            r115 = r14
            r2 = r15
            r64 = r52
            r144 = r62
            r145 = r63
            r48 = r69
            r136 = r72
            r32 = r78
            r140 = r82
            r146 = r84
            r10 = r85
            r78 = r87
            r147 = r88
            r138 = r89
            r139 = r90
            r128 = r91
            r33 = r92
            r52 = r93
            r142 = r95
            r72 = r96
            r62 = r97
            r141 = r99
            r84 = r106
            r63 = r107
            r13 = 2
            r41 = 0
            r99 = 1
            r70 = r1
            r85 = r3
            r89 = r4
            r53 = r6
            r97 = r8
            r95 = r9
            r69 = r11
            r96 = r80
            r80 = r94
            boolean r0 = defpackage.y7e.K(r12, r10)
            if (r0 == 0) goto L_0x0d79
            r0 = r101
            sod r0 = (defpackage.sod) r0
            sod r101 = r(r12, r0)
            r15 = r10
            r13 = r12
            r1 = r70
            r161 = r79
            r0 = r136
            goto L_0x0c9c
        L_0x0d79:
            r14 = r146
            boolean r0 = defpackage.y7e.K(r12, r14)
            if (r0 == 0) goto L_0x0da7
            r0 = r102
            long r102 = d(r12, r0)
            r1 = r101
            mod r1 = (defpackage.mod) r1
            r0 = r163
            r2 = r44
            r4 = r50
            r6 = r104
            r8 = r102
            r15 = r10
            r10 = r26
            mod r101 = s(r0, r1, r2, r4, r6, r8, r10)
            r13 = r12
            r1 = r70
            r161 = r79
        L_0x0da1:
            r0 = r136
            r3 = r139
            goto L_0x0ca0
        L_0x0da7:
            r15 = r10
            r11 = r79
            r0 = r102
            boolean r3 = defpackage.y7e.K(r12, r11)
            if (r3 == 0) goto L_0x0dd2
            long r102 = d(r12, r0)
            r1 = r101
            ood r1 = (defpackage.ood) r1
            r0 = r163
            r2 = r53
            r3 = r44
            r5 = r50
            r7 = r104
            r9 = r102
            r161 = r11
            r13 = r12
            r11 = r26
            ood r101 = t(r0, r1, r2, r3, r5, r7, r9, r11)
            r1 = r70
            goto L_0x0da1
        L_0x0dd2:
            r161 = r11
            r13 = r12
            boolean r3 = defpackage.y7e.K(r13, r2)
            if (r3 == 0) goto L_0x0deb
            om4 r2 = h(r13, r2)
            r3 = r139
            r3.add(r2)
            r6 = r147
            r10 = r150
            r11 = 4
            r12 = 0
            goto L_0x0e30
        L_0x0deb:
            r3 = r139
            java.lang.String r2 = "Label"
            boolean r4 = defpackage.y7e.K(r13, r2)
            if (r4 == 0) goto L_0x0e21
            r10 = r150
            r12 = 0
            java.lang.String r4 = r13.getAttributeValue(r12, r10)
            r5 = r66
        L_0x0dfe:
            r163.next()
            int r6 = r163.getEventType()
            r11 = 4
            if (r6 != r11) goto L_0x0e0d
            java.lang.String r5 = r163.getText()
            goto L_0x0e10
        L_0x0e0d:
            b(r163)
        L_0x0e10:
            boolean r6 = defpackage.y7e.H(r13, r2)
            if (r6 == 0) goto L_0x0dfe
            lr7 r2 = new lr7
            r2.<init>(r4, r5)
            r6 = r147
            r6.add(r2)
            goto L_0x0e30
        L_0x0e21:
            r6 = r147
            r10 = r150
            r11 = 4
            r12 = 0
            boolean r2 = defpackage.y7e.J(r163)
            if (r2 == 0) goto L_0x0e30
            b(r163)
        L_0x0e30:
            r102 = r0
            r1 = r70
            r0 = r136
        L_0x0e36:
            boolean r2 = defpackage.y7e.H(r13, r0)
            if (r2 == 0) goto L_0x0fe0
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r142.size()
            r0.<init>(r2)
            r2 = r41
        L_0x0e47:
            int r4 = r142.size()
            if (r2 >= r4) goto L_0x0fac
            r4 = r142
            java.lang.Object r5 = r4.get(r2)
            a64 r5 = (defpackage.a64) r5
            ea6 r7 = r5.a
            ba6 r7 = r7.a()
            r8 = r138
            if (r8 == 0) goto L_0x0e68
            boolean r9 = r6.isEmpty()
            if (r9 == 0) goto L_0x0e68
            r7.b = r8
            goto L_0x0e6e
        L_0x0e68:
            tb7 r9 = defpackage.tb7.p(r6)
            r7.c = r9
        L_0x0e6e:
            java.lang.String r9 = r5.d
            if (r9 != 0) goto L_0x0e74
            r9 = r73
        L_0x0e74:
            java.util.ArrayList r14 = r5.e
            r15 = r148
            r14.addAll(r15)
            boolean r33 = r14.isEmpty()
            if (r33 != 0) goto L_0x0f38
            r11 = r41
        L_0x0e83:
            int r12 = r14.size()
            if (r11 >= r12) goto L_0x0eac
            java.lang.Object r12 = r14.get(r11)
            wv4 r12 = (defpackage.wv4) r12
            r142 = r4
            java.util.UUID r4 = defpackage.zw0.c
            r147 = r6
            java.util.UUID r6 = r12.b
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0ea5
            java.lang.String r4 = r12.c
            if (r4 == 0) goto L_0x0ea5
            r14.remove(r11)
            goto L_0x0eb1
        L_0x0ea5:
            int r11 = r11 + 1
            r4 = r142
            r6 = r147
            goto L_0x0e83
        L_0x0eac:
            r142 = r4
            r147 = r6
            r4 = 0
        L_0x0eb1:
            if (r4 != 0) goto L_0x0eb8
        L_0x0eb3:
            r138 = r8
            r150 = r10
            goto L_0x0ef0
        L_0x0eb8:
            r11 = r41
        L_0x0eba:
            int r6 = r14.size()
            if (r11 >= r6) goto L_0x0eb3
            java.lang.Object r6 = r14.get(r11)
            wv4 r6 = (defpackage.wv4) r6
            java.util.UUID r12 = defpackage.zw0.b
            r138 = r8
            java.util.UUID r8 = r6.b
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L_0x0ee7
            java.lang.String r8 = r6.c
            if (r8 != 0) goto L_0x0ee7
            wv4 r8 = new wv4
            java.util.UUID r12 = defpackage.zw0.c
            r150 = r10
            java.lang.String r10 = r6.o
            byte[] r6 = r6.v
            r8.<init>(r12, r4, r10, r6)
            r14.set(r11, r8)
            goto L_0x0ee9
        L_0x0ee7:
            r150 = r10
        L_0x0ee9:
            int r11 = r11 + 1
            r8 = r138
            r10 = r150
            goto L_0x0eba
        L_0x0ef0:
            int r4 = r14.size()
            int r4 = r4 + -1
        L_0x0ef6:
            if (r4 < 0) goto L_0x0f2e
            java.lang.Object r6 = r14.get(r4)
            wv4 r6 = (defpackage.wv4) r6
            byte[] r8 = r6.v
            if (r8 == 0) goto L_0x0f05
        L_0x0f02:
            r43 = -1
            goto L_0x0f2b
        L_0x0f05:
            r11 = r41
        L_0x0f07:
            int r8 = r14.size()
            if (r11 >= r8) goto L_0x0f02
            java.lang.Object r8 = r14.get(r11)
            wv4 r8 = (defpackage.wv4) r8
            byte[] r10 = r8.v
            if (r10 == 0) goto L_0x0f28
            byte[] r10 = r6.v
            if (r10 == 0) goto L_0x0f1c
            goto L_0x0f28
        L_0x0f1c:
            java.util.UUID r10 = r6.b
            boolean r8 = r8.a(r10)
            if (r8 == 0) goto L_0x0f28
            r14.remove(r4)
            goto L_0x0f02
        L_0x0f28:
            int r11 = r11 + 1
            goto L_0x0f07
        L_0x0f2b:
            int r4 = r4 + -1
            goto L_0x0ef6
        L_0x0f2e:
            r43 = -1
            yv4 r4 = new yv4
            r4.<init>(r9, r14)
            r7.q = r4
            goto L_0x0f42
        L_0x0f38:
            r142 = r4
            r147 = r6
            r138 = r8
            r150 = r10
            r43 = -1
        L_0x0f42:
            java.util.ArrayList r4 = r5.f
            r4.addAll(r3)
            ea6 r6 = new ea6
            r6.<init>(r7)
            tod r7 = r5.c
            boolean r8 = r7 instanceof defpackage.sod
            long r9 = r5.g
            tb7 r11 = r5.b
            java.util.List r12 = r5.h
            java.util.List r5 = r5.i
            if (r8 == 0) goto L_0x0f76
            v2d r8 = new v2d
            r105 = r7
            sod r105 = (defpackage.sod) r105
            r107 = r12
            java.util.ArrayList r107 = (java.util.ArrayList) r107
            r108 = r5
            java.util.ArrayList r108 = (java.util.ArrayList) r108
            r100 = r8
            r101 = r9
            r103 = r6
            r104 = r11
            r106 = r4
            r100.<init>(r101, r103, r104, r105, r106, r107, r108)
            goto L_0x0f95
        L_0x0f76:
            boolean r8 = r7 instanceof defpackage.kod
            if (r8 == 0) goto L_0x0fa4
            t2d r8 = new t2d
            r105 = r7
            kod r105 = (defpackage.kod) r105
            r107 = r12
            java.util.ArrayList r107 = (java.util.ArrayList) r107
            r108 = r5
            java.util.ArrayList r108 = (java.util.ArrayList) r108
            r100 = r8
            r101 = r9
            r103 = r6
            r104 = r11
            r106 = r4
            r100.<init>(r101, r103, r104, r105, r106, r107, r108)
        L_0x0f95:
            r0.add(r8)
            int r2 = r2 + 1
            r148 = r15
            r6 = r147
            r10 = r150
            r11 = 4
            r12 = 0
            goto L_0x0e47
        L_0x0fa4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"
            r0.<init>(r1)
            throw r0
        L_0x0fac:
            r150 = r10
            r43 = -1
            s9 r2 = new s9
            r73 = r2
            r76 = r1
            r77 = r0
            r78 = r16
            r79 = r89
            r80 = r53
            r73.<init>(r74, r76, r77, r78, r79, r80)
            r12 = r67
            r12.add(r2)
            r67 = r12
            r66 = r42
            r34 = r59
            r33 = r140
            r59 = r141
            r16 = r144
        L_0x0fd2:
            r14 = r150
            r15 = 0
            r42 = 4
            r62 = 0
            r68 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x12e1
        L_0x0fe0:
            r43 = -1
            r90 = r3
            r88 = r6
            r12 = r10
            r5 = r16
            r92 = r33
            r93 = r52
            r100 = r53
            r52 = r64
            r11 = r69
            r87 = r78
            r94 = r80
            r3 = r85
            r4 = r89
            r9 = r95
            r80 = r96
            r8 = r97
            r6 = r104
            r91 = r128
            r2 = r129
            r89 = r138
            r82 = r140
            r99 = r141
            r95 = r142
            r10 = r148
            r79 = r161
            r85 = r15
            r78 = r32
            r69 = r48
            r97 = r62
            r15 = r63
            r96 = r72
            r62 = r144
            r63 = r145
            r72 = r0
            r0 = r84
            r84 = r14
            r14 = r115
            goto L_0x03e6
        L_0x102d:
            r71 = r2
            r85 = r3
            r32 = r4
            r83 = r5
            r141 = r6
            r140 = r7
            r96 = r8
            r95 = r9
            r161 = r11
            r150 = r12
            r81 = r14
            r64 = r52
            r144 = r62
            r145 = r63
            r12 = r67
            r48 = r69
            r41 = 0
            r43 = -1
            r99 = 1
            r14 = r10
            java.lang.String r0 = "EventStream"
            boolean r1 = defpackage.y7e.K(r13, r0)
            if (r1 == 0) goto L_0x1222
            r10 = r140
            r1 = 0
            java.lang.String r2 = r13.getAttributeValue(r1, r10)
            if (r2 != 0) goto L_0x1067
            r2 = r66
        L_0x1067:
            r11 = r144
            java.lang.String r3 = r13.getAttributeValue(r1, r11)
            if (r3 != 0) goto L_0x1071
            r3 = r66
        L_0x1071:
            java.lang.String r1 = "timescale"
            r4 = 1
            long r4 = m(r13, r1, r4)
            java.lang.String r1 = "presentationTimeOffset"
            r8 = 0
            long r6 = m(r13, r1, r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.io.ByteArrayOutputStream r14 = new java.io.ByteArrayOutputStream
            r15 = 512(0x200, float:7.175E-43)
            r14.<init>(r15)
        L_0x108d:
            r163.next()
            java.lang.String r15 = "Event"
            boolean r16 = defpackage.y7e.K(r13, r15)
            if (r16 == 0) goto L_0x11be
            r67 = r12
            r12 = r141
            long r52 = m(r13, r12, r8)
            r12 = r42
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r72 = m(r13, r12, r8)
            java.lang.String r8 = "presentationTime"
            r140 = r10
            r9 = 0
            long r62 = m(r13, r8, r9)
            int r8 = defpackage.v0g.a
            java.math.RoundingMode r8 = java.math.RoundingMode.FLOOR
            r74 = 1000(0x3e8, double:4.94E-321)
            r76 = r4
            r78 = r8
            long r68 = defpackage.v0g.a0(r72, r74, r76, r78)
            long r72 = r62 - r6
            r74 = 1000000(0xf4240, double:4.940656E-318)
            r76 = r4
            r78 = r8
            long r62 = defpackage.v0g.a0(r72, r74, r76, r78)
            java.lang.String r8 = "messageData"
            r9 = 0
            java.lang.String r8 = r13.getAttributeValue(r9, r8)
            if (r8 != 0) goto L_0x10da
            r8 = 0
        L_0x10da:
            r14.reset()
            org.xmlpull.v1.XmlSerializer r9 = android.util.Xml.newSerializer()
            java.nio.charset.Charset r10 = defpackage.x22.c
            java.lang.String r10 = r10.name()
            r9.setOutput(r14, r10)
            r163.nextToken()
        L_0x10ed:
            boolean r10 = defpackage.y7e.H(r13, r15)
            if (r10 != 0) goto L_0x118c
            int r10 = r163.getEventType()
            switch(r10) {
                case 0: goto L_0x1179;
                case 1: goto L_0x1171;
                case 2: goto L_0x1146;
                case 3: goto L_0x1138;
                case 4: goto L_0x1130;
                case 5: goto L_0x1128;
                case 6: goto L_0x1120;
                case 7: goto L_0x1118;
                case 8: goto L_0x1110;
                case 9: goto L_0x1108;
                case 10: goto L_0x1100;
                default: goto L_0x10fa;
            }
        L_0x10fa:
            r86 = r4
        L_0x10fc:
            r88 = r6
            goto L_0x1183
        L_0x1100:
            java.lang.String r10 = r163.getText()
            r9.docdecl(r10)
            goto L_0x10fa
        L_0x1108:
            java.lang.String r10 = r163.getText()
            r9.comment(r10)
            goto L_0x10fa
        L_0x1110:
            java.lang.String r10 = r163.getText()
            r9.processingInstruction(r10)
            goto L_0x10fa
        L_0x1118:
            java.lang.String r10 = r163.getText()
            r9.ignorableWhitespace(r10)
            goto L_0x10fa
        L_0x1120:
            java.lang.String r10 = r163.getText()
            r9.entityRef(r10)
            goto L_0x10fa
        L_0x1128:
            java.lang.String r10 = r163.getText()
            r9.cdsect(r10)
            goto L_0x10fa
        L_0x1130:
            java.lang.String r10 = r163.getText()
            r9.text(r10)
            goto L_0x10fa
        L_0x1138:
            java.lang.String r10 = r163.getNamespace()
            r86 = r4
            java.lang.String r4 = r163.getName()
            r9.endTag(r10, r4)
            goto L_0x10fc
        L_0x1146:
            r86 = r4
            java.lang.String r4 = r163.getNamespace()
            java.lang.String r5 = r163.getName()
            r9.startTag(r4, r5)
            r4 = r41
        L_0x1155:
            int r5 = r163.getAttributeCount()
            if (r4 >= r5) goto L_0x10fc
            java.lang.String r5 = r13.getAttributeNamespace(r4)
            java.lang.String r10 = r13.getAttributeName(r4)
            r88 = r6
            java.lang.String r6 = r13.getAttributeValue(r4)
            r9.attribute(r5, r10, r6)
            int r4 = r4 + 1
            r6 = r88
            goto L_0x1155
        L_0x1171:
            r86 = r4
            r88 = r6
            r9.endDocument()
            goto L_0x1183
        L_0x1179:
            r86 = r4
            r88 = r6
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r5 = 0
            r9.startDocument(r5, r4)
        L_0x1183:
            r163.nextToken()
            r4 = r86
            r6 = r88
            goto L_0x10ed
        L_0x118c:
            r86 = r4
            r88 = r6
            r9.flush()
            byte[] r4 = r14.toByteArray()
            java.lang.Long r5 = java.lang.Long.valueOf(r62)
            if (r8 != 0) goto L_0x11a0
        L_0x119d:
            r79 = r4
            goto L_0x11a7
        L_0x11a0:
            java.nio.charset.Charset r4 = defpackage.x22.c
            byte[] r4 = r8.getBytes(r4)
            goto L_0x119d
        L_0x11a7:
            c95 r4 = new c95
            r72 = r4
            r73 = r2
            r74 = r3
            r75 = r68
            r77 = r52
            r72.<init>(r73, r74, r75, r77, r79)
            android.util.Pair r4 = android.util.Pair.create(r5, r4)
            r1.add(r4)
            goto L_0x11cb
        L_0x11be:
            r86 = r4
            r88 = r6
            r140 = r10
            r67 = r12
            r12 = r42
            b(r163)
        L_0x11cb:
            boolean r4 = defpackage.y7e.H(r13, r0)
            if (r4 == 0) goto L_0x1214
            int r0 = r1.size()
            long[] r0 = new long[r0]
            int r4 = r1.size()
            c95[] r4 = new defpackage.c95[r4]
            r5 = r41
        L_0x11df:
            int r6 = r1.size()
            if (r5 >= r6) goto L_0x11fe
            java.lang.Object r6 = r1.get(r5)
            android.util.Pair r6 = (android.util.Pair) r6
            java.lang.Object r7 = r6.first
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            r0[r5] = r7
            java.lang.Object r6 = r6.second
            c95 r6 = (defpackage.c95) r6
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x11df
        L_0x11fe:
            i95 r1 = new i95
            r1.<init>(r2, r3, r0, r4)
            r10 = r59
            r10.add(r1)
            r34 = r10
            r16 = r11
            r66 = r12
            r33 = r140
            r59 = r141
            goto L_0x0fd2
        L_0x1214:
            r42 = r12
            r12 = r67
            r4 = r86
            r6 = r88
            r10 = r140
            r8 = 0
            goto L_0x108d
        L_0x1222:
            r67 = r12
            r12 = r42
            r10 = r59
            r11 = r144
            boolean r0 = defpackage.y7e.K(r13, r15)
            if (r0 == 0) goto L_0x1252
            r15 = 0
            sod r0 = r(r13, r15)
            r54 = r0
            r34 = r10
            r16 = r11
            r66 = r12
            r10 = r48
            r33 = r140
            r59 = r141
            r0 = r145
            r14 = r150
            r42 = 4
            r62 = 0
        L_0x124b:
            r68 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x12e8
        L_0x1252:
            r15 = 0
            boolean r0 = defpackage.y7e.K(r13, r14)
            if (r0 == 0) goto L_0x128c
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r52 = d(r13, r8)
            r1 = 0
            r0 = r163
            r2 = r44
            r4 = r50
            r6 = r48
            r62 = 0
            r8 = r52
            r34 = r10
            r16 = r11
            r33 = r140
            r14 = r150
            r42 = 4
            r10 = r26
            mod r0 = s(r0, r1, r2, r4, r6, r8, r10)
            r54 = r0
            r66 = r12
            r10 = r48
            r60 = r52
            r59 = r141
            r0 = r145
            goto L_0x124b
        L_0x128c:
            r34 = r10
            r16 = r11
            r33 = r140
            r14 = r150
            r0 = r161
            r42 = 4
            r62 = 0
            boolean r0 = defpackage.y7e.K(r13, r0)
            if (r0 == 0) goto L_0x12cd
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r52 = d(r13, r9)
            lx5 r0 = defpackage.tb7.b
            k0d r2 = defpackage.k0d.v
            r1 = 0
            r0 = r163
            r3 = r44
            r5 = r50
            r7 = r48
            r68 = r9
            r9 = r52
            r66 = r12
            r59 = r141
            r11 = r26
            ood r0 = t(r0, r1, r2, r3, r5, r7, r9, r11)
            r54 = r0
            r10 = r48
            r60 = r52
        L_0x12ca:
            r0 = r145
            goto L_0x12e8
        L_0x12cd:
            r66 = r12
            r59 = r141
            r68 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r0 = "AssetIdentifier"
            boolean r1 = defpackage.y7e.K(r13, r0)
            if (r1 == 0) goto L_0x12e4
            h(r13, r0)
        L_0x12e1:
            r10 = r48
            goto L_0x12ca
        L_0x12e4:
            b(r163)
            goto L_0x12e1
        L_0x12e8:
            boolean r1 = defpackage.y7e.H(r13, r0)
            if (r1 == 0) goto L_0x134b
            gcb r0 = new gcb
            r54 = r0
            r58 = r67
            r59 = r34
            r54.<init>(r55, r56, r58, r59)
            java.lang.Long r1 = java.lang.Long.valueOf(r50)
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            java.lang.Object r1 = r0.first
            gcb r1 = (defpackage.gcb) r1
            long r2 = r1.b
            int r2 = (r2 > r68 ? 1 : (r2 == r68 ? 0 : -1))
            if (r2 != 0) goto L_0x1329
            if (r23 == 0) goto L_0x1312
            r2 = r83
            r10 = r99
            goto L_0x1346
        L_0x1312:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to determine start of period "
            r0.<init>(r1)
            int r1 = r83.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.b(r15, r0)
            throw r0
        L_0x1329:
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            int r0 = (r2 > r68 ? 1 : (r2 == r68 ? 0 : -1))
            if (r0 != 0) goto L_0x133a
            r6 = r68
        L_0x1337:
            r2 = r83
            goto L_0x133f
        L_0x133a:
            long r4 = r1.b
            long r6 = r4 + r2
            goto L_0x1337
        L_0x133f:
            r2.add(r1)
            r46 = r6
            r10 = r36
        L_0x1346:
            r36 = r10
        L_0x1348:
            r0 = r64
            goto L_0x138d
        L_0x134b:
            r63 = r0
            r12 = r14
            r62 = r16
            r4 = r32
            r7 = r33
            r6 = r59
            r52 = r64
            r42 = r66
            r15 = r67
            r0 = r68
            r2 = r71
            r14 = r81
            r5 = r83
            r3 = r85
            r9 = r95
            r8 = r96
            r59 = r34
            goto L_0x02d7
        L_0x136e:
            r71 = r2
            r32 = r4
            r2 = r5
            r95 = r9
            r46 = r14
            r64 = r52
            r15 = 0
            r41 = 0
            r42 = 4
            r43 = -1
            r62 = 0
            r68 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r99 = 1
            b(r163)
            goto L_0x1348
        L_0x138d:
            java.lang.String r3 = "MPD"
            boolean r3 = defpackage.y7e.H(r13, r3)
            if (r3 == 0) goto L_0x13c9
            int r0 = (r19 > r68 ? 1 : (r19 == r68 ? 0 : -1))
            if (r0 != 0) goto L_0x13aa
            int r0 = (r46 > r68 ? 1 : (r46 == r68 ? 0 : -1))
            if (r0 == 0) goto L_0x13a0
            r19 = r46
            goto L_0x13aa
        L_0x13a0:
            if (r23 == 0) goto L_0x13a3
            goto L_0x13aa
        L_0x13a3:
            java.lang.String r0 = "Unable to determine duration of static manifest."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.b(r15, r0)
            throw r0
        L_0x13aa:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x13c2
            y54 r0 = new y54
            r16 = r0
            r32 = r37
            r33 = r38
            r34 = r40
            r35 = r39
            r36 = r2
            r16.<init>(r17, r19, r21, r23, r24, r26, r28, r30, r32, r33, r34, r35, r36)
            return r0
        L_0x13c2:
            java.lang.String r0 = "No periods found."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.b(r15, r0)
            throw r0
        L_0x13c9:
            r5 = r2
            r8 = r15
            r4 = r32
            r11 = r41
            r14 = r46
            r6 = r68
            r2 = r71
            r9 = r95
            r10 = r99
            goto L_0x00cf
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c64.n(org.xmlpull.v1.XmlPullParser, android.net.Uri):y54");
    }

    public static dpc o(XmlPullParser xmlPullParser, String str, String str2) {
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
        return new dpc(j, attributeValue, j2);
    }

    public static int p(String str) {
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

    public static int q(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (o54.l("http://dashif.org/guidelines/trickmode", ((om4) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: dpc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.sod r(org.xmlpull.v1.XmlPullParser r17, defpackage.sod r18) {
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
            long r9 = m(r0, r6, r4)
            r4 = 0
            if (r1 == 0) goto L_0x0019
            long r6 = r1.b
            goto L_0x001a
        L_0x0019:
            r6 = r4
        L_0x001a:
            java.lang.String r8 = "presentationTimeOffset"
            long r11 = m(r0, r8, r6)
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
            dpc r8 = (defpackage.dpc) r8
        L_0x0055:
            r17.next()
            java.lang.String r1 = "Initialization"
            boolean r1 = defpackage.y7e.K(r0, r1)
            if (r1 == 0) goto L_0x006a
            java.lang.String r1 = "sourceURL"
            java.lang.String r2 = "range"
            dpc r1 = o(r0, r1, r2)
            r8 = r1
            goto L_0x006d
        L_0x006a:
            b(r17)
        L_0x006d:
            java.lang.String r1 = "SegmentBase"
            boolean r1 = defpackage.y7e.H(r0, r1)
            if (r1 == 0) goto L_0x0055
            sod r0 = new sod
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c64.r(org.xmlpull.v1.XmlPullParser, sod):sod");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: dpc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.mod s(org.xmlpull.v1.XmlPullParser r25, defpackage.mod r26, long r27, long r29, long r31, long r33, long r35) {
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
            long r9 = m(r0, r6, r4)
            if (r1 == 0) goto L_0x0017
            long r4 = r1.b
            goto L_0x0019
        L_0x0017:
            r4 = 0
        L_0x0019:
            java.lang.String r6 = "presentationTimeOffset"
            long r11 = m(r0, r6, r4)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x0029
            long r6 = r1.e
            goto L_0x002a
        L_0x0029:
            r6 = r4
        L_0x002a:
            java.lang.String r8 = "duration"
            long r15 = m(r0, r8, r6)
            if (r1 == 0) goto L_0x0034
            long r2 = r1.d
        L_0x0034:
            java.lang.String r6 = "startNumber"
            long r13 = m(r0, r6, r2)
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
            boolean r5 = defpackage.y7e.K(r0, r5)
            if (r5 == 0) goto L_0x006a
            java.lang.String r3 = "sourceURL"
            java.lang.String r5 = "range"
            dpc r3 = o(r0, r3, r5)
            r5 = r29
            goto L_0x0099
        L_0x006a:
            java.lang.String r5 = "SegmentTimeline"
            boolean r5 = defpackage.y7e.K(r0, r5)
            if (r5 == 0) goto L_0x0079
            r5 = r29
            java.util.ArrayList r4 = u(r0, r9, r5)
            goto L_0x0099
        L_0x0079:
            r5 = r29
            java.lang.String r7 = "SegmentURL"
            boolean r7 = defpackage.y7e.K(r0, r7)
            if (r7 == 0) goto L_0x0096
            if (r2 != 0) goto L_0x008a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x008a:
            java.lang.String r7 = "media"
            java.lang.String r8 = "mediaRange"
            dpc r7 = o(r0, r7, r8)
            r2.add(r7)
            goto L_0x0099
        L_0x0096:
            b(r25)
        L_0x0099:
            java.lang.String r7 = "SegmentList"
            boolean r7 = defpackage.y7e.H(r0, r7)
            if (r7 == 0) goto L_0x0054
            if (r1 == 0) goto L_0x00b5
            if (r3 == 0) goto L_0x00a6
            goto L_0x00ab
        L_0x00a6:
            java.lang.Object r0 = r1.c
            r3 = r0
            dpc r3 = (defpackage.dpc) r3
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
            mod r0 = new mod
            r7 = r0
            long r21 = defpackage.v0g.S(r35)
            long r23 = defpackage.v0g.S(r27)
            r7.<init>(r8, r9, r11, r13, r15, r17, r18, r20, r21, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c64.s(org.xmlpull.v1.XmlPullParser, mod, long, long, long, long, long):mod");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: dpc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ood t(org.xmlpull.v1.XmlPullParser r28, defpackage.ood r29, java.util.List r30, long r31, long r33, long r35, long r37, long r39) {
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
            long r9 = m(r0, r6, r4)
            if (r1 == 0) goto L_0x0017
            long r4 = r1.b
            goto L_0x0019
        L_0x0017:
            r4 = 0
        L_0x0019:
            java.lang.String r6 = "presentationTimeOffset"
            long r11 = m(r0, r6, r4)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x0029
            long r6 = r1.e
            goto L_0x002a
        L_0x0029:
            r6 = r4
        L_0x002a:
            java.lang.String r8 = "duration"
            long r17 = m(r0, r8, r6)
            if (r1 == 0) goto L_0x0034
            long r2 = r1.d
        L_0x0034:
            java.lang.String r6 = "startNumber"
            long r13 = m(r0, r6, r2)
            r2 = 0
        L_0x003b:
            int r3 = r30.size()
            if (r2 >= r3) goto L_0x005e
            r3 = r30
            java.lang.Object r6 = r3.get(r2)
            om4 r6 = (defpackage.om4) r6
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
            l15 r3 = r1.k
            goto L_0x007f
        L_0x007e:
            r3 = r2
        L_0x007f:
            java.lang.String r4 = "media"
            l15 r23 = v(r0, r4, r3)
            if (r1 == 0) goto L_0x008a
            l15 r3 = r1.j
            goto L_0x008b
        L_0x008a:
            r3 = r2
        L_0x008b:
            java.lang.String r4 = "initialization"
            l15 r22 = v(r0, r4, r3)
            r3 = r2
        L_0x0092:
            r28.next()
            java.lang.String r4 = "Initialization"
            boolean r4 = defpackage.y7e.K(r0, r4)
            if (r4 == 0) goto L_0x00a8
            java.lang.String r2 = "sourceURL"
            java.lang.String r4 = "range"
            dpc r2 = o(r0, r2, r4)
            r4 = r33
            goto L_0x00bc
        L_0x00a8:
            java.lang.String r4 = "SegmentTimeline"
            boolean r4 = defpackage.y7e.K(r0, r4)
            if (r4 == 0) goto L_0x00b7
            r4 = r33
            java.util.ArrayList r3 = u(r0, r9, r4)
            goto L_0x00bc
        L_0x00b7:
            r4 = r33
            b(r28)
        L_0x00bc:
            java.lang.String r6 = "SegmentTemplate"
            boolean r6 = defpackage.y7e.H(r0, r6)
            if (r6 == 0) goto L_0x0092
            if (r1 == 0) goto L_0x00d3
            if (r2 == 0) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            java.lang.Object r0 = r1.c
            r2 = r0
            dpc r2 = (defpackage.dpc) r2
        L_0x00ce:
            if (r3 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            java.util.List r3 = r1.f
        L_0x00d3:
            r8 = r2
            r19 = r3
            ood r0 = new ood
            r7 = r0
            long r24 = defpackage.v0g.S(r39)
            long r26 = defpackage.v0g.S(r31)
            r7.<init>(r8, r9, r11, r13, r15, r17, r19, r20, r22, r23, r24, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c64.t(org.xmlpull.v1.XmlPullParser, ood, java.util.List, long, long, long, long, long):ood");
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
            if (y7e.K(xmlPullParser2, "S")) {
                long m = m(xmlPullParser2, "t", -9223372036854775807L);
                if (z) {
                    j3 = a(arrayList, j3, j4, i, m);
                }
                if (m == -9223372036854775807L) {
                    m = j3;
                }
                long m2 = m(xmlPullParser2, "d", -9223372036854775807L);
                i = l(xmlPullParser2, "r", 0);
                long j5 = m2;
                z = true;
                j4 = j5;
                j3 = m;
            } else {
                b(xmlPullParser);
            }
        } while (!y7e.H(xmlPullParser2, "SegmentTimeline"));
        if (z) {
            int i2 = v0g.a;
            a(arrayList, j3, j4, i, v0g.a0(j2, j, 1000, RoundingMode.FLOOR));
        }
        return arrayList;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.l15 v(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, defpackage.l15 r14) {
        /*
            r0 = -1
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            java.lang.String r12 = r12.getAttributeValue(r4, r13)
            if (r12 == 0) goto L_0x015f
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r5 = ""
            r13.add(r5)
            r6 = r1
        L_0x0020:
            int r7 = r12.length()
            if (r6 >= r7) goto L_0x0159
            java.lang.String r7 = "$"
            int r8 = r12.indexOf(r7, r6)
            if (r8 != r0) goto L_0x0057
            int r7 = r14.size()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r9 = r14.size()
            java.lang.Object r9 = r13.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r8.append(r9)
            java.lang.String r6 = r12.substring(r6)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r13.set(r7, r6)
            int r6 = r12.length()
            goto L_0x0020
        L_0x0057:
            if (r8 == r6) goto L_0x007f
            int r7 = r14.size()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r14.size()
            java.lang.Object r10 = r13.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r9.append(r10)
            java.lang.String r6 = r12.substring(r6, r8)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r13.set(r7, r6)
            r6 = r8
            goto L_0x0020
        L_0x007f:
            java.lang.String r8 = "$$"
            boolean r8 = r12.startsWith(r8, r6)
            if (r8 == 0) goto L_0x00aa
            int r8 = r14.size()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r14.size()
            java.lang.Object r10 = r13.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r13.set(r8, r7)
            int r6 = r6 + r2
            goto L_0x0020
        L_0x00aa:
            r4.add(r5)
            int r6 = r6 + r3
            int r7 = r12.indexOf(r7, r6)
            java.lang.String r6 = r12.substring(r6, r7)
            java.lang.String r8 = "RepresentationID"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x00c7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r14.add(r6)
            goto L_0x0152
        L_0x00c7:
            java.lang.String r8 = "%0"
            int r8 = r6.indexOf(r8)
            if (r8 == r0) goto L_0x00f4
            java.lang.String r9 = r6.substring(r8)
            java.lang.String r10 = "d"
            boolean r11 = r9.endsWith(r10)
            if (r11 != 0) goto L_0x00ef
            java.lang.String r11 = "x"
            boolean r11 = r9.endsWith(r11)
            if (r11 != 0) goto L_0x00ef
            java.lang.String r11 = "X"
            boolean r11 = r9.endsWith(r11)
            if (r11 != 0) goto L_0x00ef
            java.lang.String r9 = r9.concat(r10)
        L_0x00ef:
            java.lang.String r6 = r6.substring(r1, r8)
            goto L_0x00f6
        L_0x00f4:
            java.lang.String r9 = "%01d"
        L_0x00f6:
            r6.getClass()
            int r8 = r6.hashCode()
            switch(r8) {
                case -1950496919: goto L_0x0118;
                case 2606829: goto L_0x010d;
                case 38199441: goto L_0x0102;
                default: goto L_0x0100;
            }
        L_0x0100:
            r6 = r0
            goto L_0x0122
        L_0x0102:
            java.lang.String r8 = "Bandwidth"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x010b
            goto L_0x0100
        L_0x010b:
            r6 = r2
            goto L_0x0122
        L_0x010d:
            java.lang.String r8 = "Time"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0116
            goto L_0x0100
        L_0x0116:
            r6 = r3
            goto L_0x0122
        L_0x0118:
            java.lang.String r8 = "Number"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0121
            goto L_0x0100
        L_0x0121:
            r6 = r1
        L_0x0122:
            switch(r6) {
                case 0: goto L_0x0143;
                case 1: goto L_0x013a;
                case 2: goto L_0x0131;
                default: goto L_0x0125;
            }
        L_0x0125:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Invalid template: "
            java.lang.String r12 = r14.concat(r12)
            r13.<init>(r12)
            throw r13
        L_0x0131:
            r6 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.add(r6)
            goto L_0x014a
        L_0x013a:
            r6 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.add(r6)
            goto L_0x014a
        L_0x0143:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r14.add(r6)
        L_0x014a:
            int r6 = r14.size()
            int r6 = r6 - r3
            r4.set(r6, r9)
        L_0x0152:
            r13.add(r5)
            int r7 = r7 + r3
            r6 = r7
            goto L_0x0020
        L_0x0159:
            l15 r12 = new l15
            r12.<init>(r13, r14, r4)
            return r12
        L_0x015f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c64.v(org.xmlpull.v1.XmlPullParser, java.lang.String, l15):l15");
    }

    public final Object j(Uri uri, l74 l74) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(l74, (String) null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return n(newPullParser, uri);
            }
            throw ParserException.b((Exception) null, "inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            throw ParserException.b(e, (String) null);
        }
    }
}
