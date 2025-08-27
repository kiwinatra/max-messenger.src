package defpackage;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* renamed from: fo8  reason: default package */
public abstract class fo8 {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (v0g.a < 26 && v0g.b.equals("R9") && arrayList.size() == 1 && ((on8) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(on8.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false));
            }
            Collections.sort(arrayList, new ks3(3, new zc8(12)));
        }
        int i = v0g.a;
        if (i < 21 && arrayList.size() > 1) {
            String str2 = ((on8) arrayList.get(0)).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new ks3(3, new zc8(14)));
            }
        }
        if (i < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((on8) arrayList.get(0)).a)) {
            arrayList.add((on8) arrayList.remove(0));
        }
    }

    public static String b(ea6 ea6) {
        Pair d;
        if ("audio/eac3-joc".equals(ea6.n)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(ea6.n) || (d = d(ea6)) == null) {
            return null;
        }
        int intValue = ((Integer) d.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        if (intValue == 1024) {
            return "video/av01";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (!str2.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(str)) {
                return null;
            }
            return "audio/lg-ac3";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x04b4, code lost:
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0557, code lost:
        switch(r17) {
            case 0: goto L_0x05ea;
            case 1: goto L_0x05e3;
            case 2: goto L_0x05de;
            case 3: goto L_0x05d9;
            case 4: goto L_0x05d4;
            case 5: goto L_0x05cf;
            case 6: goto L_0x05c9;
            case 7: goto L_0x05c4;
            case 8: goto L_0x05bf;
            case 9: goto L_0x05ba;
            case 10: goto L_0x05b5;
            case 11: goto L_0x05b0;
            case 12: goto L_0x05ab;
            case 13: goto L_0x05a4;
            case ru.ok.tamtam.nano.Protos.Attaches.Attach.LOCATION :int: goto L_0x059f;
            case ru.ok.tamtam.nano.Protos.Attaches.Attach.DAILY_MEDIA :int: goto L_0x059a;
            case 16: goto L_0x0595;
            case org.apache.http.util.LangUtils.HASH_SEED :int: goto L_0x058e;
            case 18: goto L_0x0588;
            case 19: goto L_0x0582;
            case 20: goto L_0x057c;
            case 21: goto L_0x0576;
            case 22: goto L_0x0570;
            case 23: goto L_0x056a;
            case one.me.common.drawable.SavedMessagesIconDrawable.NORMAL_ICON_SIZE :int: goto L_0x0564;
            case 25: goto L_0x055c;
            default: goto L_0x055a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x055c, code lost:
        r2 = 16777216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0564, code lost:
        r2 = 4194304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x056a, code lost:
        r2 = 1048576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0570, code lost:
        r2 = 262144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0576, code lost:
        r2 = 65536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x057c, code lost:
        r2 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0582, code lost:
        r2 = java.lang.Integer.valueOf(kotlin.io.ConstantsKt.DEFAULT_BLOCK_SIZE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0588, code lost:
        r2 = 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x058e, code lost:
        r2 = 33554432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0595, code lost:
        r2 = 8388608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x059a, code lost:
        r2 = 2097152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x059f, code lost:
        r2 = 524288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x05a4, code lost:
        r2 = 131072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x05ab, code lost:
        r2 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x05b0, code lost:
        r2 = java.lang.Integer.valueOf(kotlin.io.ConstantsKt.DEFAULT_BUFFER_SIZE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x05b5, code lost:
        r2 = 2048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x05ba, code lost:
        r2 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x05bf, code lost:
        r2 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x05c4, code lost:
        r2 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x05c9, code lost:
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x05cf, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x05d4, code lost:
        r2 = java.lang.Integer.valueOf(kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x05d9, code lost:
        r2 = java.lang.Integer.valueOf(kotlin.uuid.Uuid.SIZE_BITS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x05de, code lost:
        r2 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x05e3, code lost:
        r2 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x05ea, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0730, code lost:
        r0 = r0.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ea, code lost:
        r13 = r12;
     */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x039b A[Catch:{ NumberFormatException -> 0x03ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:505:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair d(defpackage.ea6 r32) {
        /*
            r0 = r32
            java.lang.String r1 = "08"
            java.lang.String r2 = "07"
            java.lang.String r3 = "06"
            java.lang.String r4 = "05"
            java.lang.String r5 = "04"
            java.lang.String r6 = "03"
            java.lang.String r7 = "02"
            java.lang.String r8 = "01"
            r9 = 16
            r16 = 5
            r15 = 3
            r10 = 1
            java.lang.String r11 = r0.j
            r18 = 0
            if (r11 != 0) goto L_0x001f
            return r18
        L_0x001f:
            java.lang.String r13 = "\\."
            java.lang.String[] r11 = r11.split(r13)
            java.lang.String r13 = "video/dolby-vision"
            java.lang.String r12 = r0.n
            boolean r12 = r13.equals(r12)
            java.util.regex.Pattern r13 = a
            r19 = 1024(0x400, float:1.435E-42)
            r20 = 2048(0x800, float:2.87E-42)
            r21 = 4096(0x1000, float:5.74E-42)
            r22 = 512(0x200, float:7.175E-43)
            r23 = 256(0x100, float:3.59E-43)
            r24 = 128(0x80, float:1.794E-43)
            r25 = 64
            r26 = 32
            java.lang.String r14 = r0.j
            if (r12 == 0) goto L_0x022d
            int r0 = r11.length
            java.lang.String r12 = "Ignoring malformed Dolby Vision codec string: "
            if (r0 >= r15) goto L_0x004d
            defpackage.rae.x(r12, r14)
            goto L_0x022c
        L_0x004d:
            r0 = r11[r10]
            java.util.regex.Matcher r0 = r13.matcher(r0)
            boolean r13 = r0.matches()
            if (r13 != 0) goto L_0x005e
            defpackage.rae.x(r12, r14)
            goto L_0x022c
        L_0x005e:
            java.lang.String r0 = r0.group(r10)
            if (r0 != 0) goto L_0x0069
        L_0x0064:
            r13 = r18
        L_0x0066:
            r12 = 2
            goto L_0x0125
        L_0x0069:
            int r12 = r0.hashCode()
            switch(r12) {
                case 1536: goto L_0x00d7;
                case 1537: goto L_0x00ce;
                case 1538: goto L_0x00c5;
                case 1539: goto L_0x00bc;
                case 1540: goto L_0x00b3;
                case 1541: goto L_0x00a9;
                case 1542: goto L_0x00a0;
                case 1543: goto L_0x0097;
                case 1544: goto L_0x008d;
                case 1545: goto L_0x0080;
                case 1567: goto L_0x0073;
                default: goto L_0x0070;
            }
        L_0x0070:
            r12 = -1
            goto L_0x00e1
        L_0x0073:
            java.lang.String r12 = "10"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x007c
            goto L_0x0070
        L_0x007c:
            r12 = 10
            goto L_0x00e1
        L_0x0080:
            java.lang.String r12 = "09"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x0089
            goto L_0x0070
        L_0x0089:
            r12 = 9
            goto L_0x00e1
        L_0x008d:
            boolean r12 = r0.equals(r1)
            if (r12 != 0) goto L_0x0094
            goto L_0x0070
        L_0x0094:
            r12 = 8
            goto L_0x00e1
        L_0x0097:
            boolean r12 = r0.equals(r2)
            if (r12 != 0) goto L_0x009e
            goto L_0x0070
        L_0x009e:
            r12 = 7
            goto L_0x00e1
        L_0x00a0:
            boolean r12 = r0.equals(r3)
            if (r12 != 0) goto L_0x00a7
            goto L_0x0070
        L_0x00a7:
            r12 = 6
            goto L_0x00e1
        L_0x00a9:
            boolean r12 = r0.equals(r4)
            if (r12 != 0) goto L_0x00b0
            goto L_0x0070
        L_0x00b0:
            r12 = r16
            goto L_0x00e1
        L_0x00b3:
            boolean r12 = r0.equals(r5)
            if (r12 != 0) goto L_0x00ba
            goto L_0x0070
        L_0x00ba:
            r12 = 4
            goto L_0x00e1
        L_0x00bc:
            boolean r12 = r0.equals(r6)
            if (r12 != 0) goto L_0x00c3
            goto L_0x0070
        L_0x00c3:
            r12 = r15
            goto L_0x00e1
        L_0x00c5:
            boolean r12 = r0.equals(r7)
            if (r12 != 0) goto L_0x00cc
            goto L_0x0070
        L_0x00cc:
            r12 = 2
            goto L_0x00e1
        L_0x00ce:
            boolean r12 = r0.equals(r8)
            if (r12 != 0) goto L_0x00d5
            goto L_0x0070
        L_0x00d5:
            r12 = r10
            goto L_0x00e1
        L_0x00d7:
            java.lang.String r12 = "00"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x00e0
            goto L_0x0070
        L_0x00e0:
            r12 = 0
        L_0x00e1:
            switch(r12) {
                case 0: goto L_0x0120;
                case 1: goto L_0x011a;
                case 2: goto L_0x0113;
                case 3: goto L_0x010b;
                case 4: goto L_0x0106;
                case 5: goto L_0x0101;
                case 6: goto L_0x00fc;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00f2;
                case 9: goto L_0x00ed;
                case 10: goto L_0x00e6;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            goto L_0x0064
        L_0x00e6:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r19)
        L_0x00ea:
            r13 = r12
            goto L_0x0066
        L_0x00ed:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r22)
            goto L_0x00ea
        L_0x00f2:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r23)
            goto L_0x00ea
        L_0x00f7:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r24)
            goto L_0x00ea
        L_0x00fc:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r25)
            goto L_0x00ea
        L_0x0101:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r26)
            goto L_0x00ea
        L_0x0106:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            goto L_0x00ea
        L_0x010b:
            r12 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            goto L_0x0066
        L_0x0113:
            r12 = 4
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            goto L_0x0066
        L_0x011a:
            r12 = 2
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            goto L_0x0125
        L_0x0120:
            r12 = 2
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
        L_0x0125:
            if (r13 != 0) goto L_0x012e
            java.lang.String r1 = "Unknown Dolby Vision profile string: "
            defpackage.rae.x(r1, r0)
            goto L_0x022c
        L_0x012e:
            r0 = r11[r12]
            if (r0 != 0) goto L_0x0136
        L_0x0132:
            r1 = r18
            goto L_0x021d
        L_0x0136:
            int r11 = r0.hashCode()
            switch(r11) {
                case 1537: goto L_0x01ca;
                case 1538: goto L_0x01bf;
                case 1539: goto L_0x01b5;
                case 1540: goto L_0x01ab;
                case 1541: goto L_0x01a1;
                case 1542: goto L_0x0197;
                case 1543: goto L_0x018d;
                case 1544: goto L_0x0183;
                case 1545: goto L_0x0177;
                case 1567: goto L_0x016a;
                case 1568: goto L_0x015d;
                case 1569: goto L_0x0150;
                case 1570: goto L_0x0141;
                default: goto L_0x013d;
            }
        L_0x013d:
            r17 = -1
            goto L_0x01d4
        L_0x0141:
            java.lang.String r1 = "13"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x014a
            goto L_0x013d
        L_0x014a:
            r1 = 12
            r17 = r1
            goto L_0x01d4
        L_0x0150:
            java.lang.String r1 = "12"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0159
            goto L_0x013d
        L_0x0159:
            r17 = 11
            goto L_0x01d4
        L_0x015d:
            java.lang.String r1 = "11"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0166
            goto L_0x013d
        L_0x0166:
            r17 = 10
            goto L_0x01d4
        L_0x016a:
            java.lang.String r1 = "10"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0173
            goto L_0x013d
        L_0x0173:
            r17 = 9
            goto L_0x01d4
        L_0x0177:
            java.lang.String r1 = "09"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0180
            goto L_0x013d
        L_0x0180:
            r17 = 8
            goto L_0x01d4
        L_0x0183:
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x018a
            goto L_0x013d
        L_0x018a:
            r17 = 7
            goto L_0x01d4
        L_0x018d:
            boolean r1 = r0.equals(r2)
            if (r1 != 0) goto L_0x0194
            goto L_0x013d
        L_0x0194:
            r17 = 6
            goto L_0x01d4
        L_0x0197:
            boolean r1 = r0.equals(r3)
            if (r1 != 0) goto L_0x019e
            goto L_0x013d
        L_0x019e:
            r17 = r16
            goto L_0x01d4
        L_0x01a1:
            boolean r1 = r0.equals(r4)
            if (r1 != 0) goto L_0x01a8
            goto L_0x013d
        L_0x01a8:
            r17 = 4
            goto L_0x01d4
        L_0x01ab:
            boolean r1 = r0.equals(r5)
            if (r1 != 0) goto L_0x01b2
            goto L_0x013d
        L_0x01b2:
            r17 = r15
            goto L_0x01d4
        L_0x01b5:
            boolean r1 = r0.equals(r6)
            if (r1 != 0) goto L_0x01bc
            goto L_0x013d
        L_0x01bc:
            r17 = 2
            goto L_0x01d4
        L_0x01bf:
            boolean r1 = r0.equals(r7)
            if (r1 != 0) goto L_0x01c7
            goto L_0x013d
        L_0x01c7:
            r17 = r10
            goto L_0x01d4
        L_0x01ca:
            boolean r1 = r0.equals(r8)
            if (r1 != 0) goto L_0x01d2
            goto L_0x013d
        L_0x01d2:
            r17 = 0
        L_0x01d4:
            switch(r17) {
                case 0: goto L_0x0219;
                case 1: goto L_0x0213;
                case 2: goto L_0x020d;
                case 3: goto L_0x0206;
                case 4: goto L_0x0201;
                case 5: goto L_0x01fc;
                case 6: goto L_0x01f7;
                case 7: goto L_0x01f2;
                case 8: goto L_0x01ed;
                case 9: goto L_0x01e8;
                case 10: goto L_0x01e3;
                case 11: goto L_0x01de;
                case 12: goto L_0x01d9;
                default: goto L_0x01d7;
            }
        L_0x01d7:
            goto L_0x0132
        L_0x01d9:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            goto L_0x021d
        L_0x01de:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            goto L_0x021d
        L_0x01e3:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            goto L_0x021d
        L_0x01e8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            goto L_0x021d
        L_0x01ed:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            goto L_0x021d
        L_0x01f2:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            goto L_0x021d
        L_0x01f7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            goto L_0x021d
        L_0x01fc:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            goto L_0x021d
        L_0x0201:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L_0x021d
        L_0x0206:
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x021d
        L_0x020d:
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x021d
        L_0x0213:
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x021d
        L_0x0219:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
        L_0x021d:
            if (r1 != 0) goto L_0x0225
            java.lang.String r1 = "Unknown Dolby Vision level string: "
            defpackage.rae.x(r1, r0)
            goto L_0x022c
        L_0x0225:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r13, r1)
            r18 = r0
        L_0x022c:
            return r18
        L_0x022d:
            r1 = 0
            r2 = r11[r1]
            r2.getClass()
            r3 = 524288(0x80000, float:7.34684E-40)
            r4 = 2097152(0x200000, float:2.938736E-39)
            r5 = 8388608(0x800000, float:1.17549435E-38)
            r6 = 262144(0x40000, float:3.67342E-40)
            r7 = 1048576(0x100000, float:1.469368E-39)
            r8 = 4194304(0x400000, float:5.877472E-39)
            r12 = 20
            r27 = 32768(0x8000, float:4.5918E-41)
            r28 = 16384(0x4000, float:2.2959E-41)
            m53 r0 = r0.A
            r29 = 65536(0x10000, float:9.18355E-41)
            r30 = 8192(0x2000, float:1.14794E-41)
            int r31 = r2.hashCode()
            switch(r31) {
                case 3004662: goto L_0x0298;
                case 3006243: goto L_0x028d;
                case 3006244: goto L_0x0282;
                case 3199032: goto L_0x0277;
                case 3214780: goto L_0x026c;
                case 3356560: goto L_0x0260;
                case 3624515: goto L_0x0255;
                default: goto L_0x0253;
            }
        L_0x0253:
            r1 = -1
            goto L_0x02a2
        L_0x0255:
            java.lang.String r1 = "vp09"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x025e
            goto L_0x0253
        L_0x025e:
            r1 = 6
            goto L_0x02a2
        L_0x0260:
            java.lang.String r1 = "mp4a"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0269
            goto L_0x0253
        L_0x0269:
            r1 = r16
            goto L_0x02a2
        L_0x026c:
            java.lang.String r1 = "hvc1"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0275
            goto L_0x0253
        L_0x0275:
            r1 = 4
            goto L_0x02a2
        L_0x0277:
            java.lang.String r1 = "hev1"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0280
            goto L_0x0253
        L_0x0280:
            r1 = r15
            goto L_0x02a2
        L_0x0282:
            java.lang.String r1 = "avc2"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x028b
            goto L_0x0253
        L_0x028b:
            r1 = 2
            goto L_0x02a2
        L_0x028d:
            java.lang.String r1 = "avc1"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0296
            goto L_0x0253
        L_0x0296:
            r1 = r10
            goto L_0x02a2
        L_0x0298:
            java.lang.String r1 = "av01"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x02a1
            goto L_0x0253
        L_0x02a1:
            r1 = 0
        L_0x02a2:
            switch(r1) {
                case 0: goto L_0x06e9;
                case 1: goto L_0x0609;
                case 2: goto L_0x0609;
                case 3: goto L_0x03b0;
                case 4: goto L_0x03b0;
                case 5: goto L_0x0347;
                case 6: goto L_0x02a6;
                default: goto L_0x02a5;
            }
        L_0x02a5:
            return r18
        L_0x02a6:
            int r0 = r11.length
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            if (r0 >= r15) goto L_0x02b0
            defpackage.rae.x(r1, r14)
            goto L_0x0346
        L_0x02b0:
            r0 = r11[r10]     // Catch:{ NumberFormatException -> 0x0343 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0343 }
            r2 = 2
            r3 = r11[r2]     // Catch:{ NumberFormatException -> 0x0343 }
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0343 }
            if (r0 == 0) goto L_0x02cf
            if (r0 == r10) goto L_0x02cd
            if (r0 == r2) goto L_0x02cb
            if (r0 == r15) goto L_0x02c8
            r2 = -1
        L_0x02c6:
            r3 = -1
            goto L_0x02d1
        L_0x02c8:
            r2 = 8
            goto L_0x02c6
        L_0x02cb:
            r2 = 4
            goto L_0x02c6
        L_0x02cd:
            r2 = 2
            goto L_0x02c6
        L_0x02cf:
            r2 = r10
            goto L_0x02c6
        L_0x02d1:
            if (r2 != r3) goto L_0x02da
            java.lang.String r1 = "Unknown VP9 profile: "
            defpackage.i2a.m(r0, r1)
            goto L_0x0346
        L_0x02da:
            r0 = 10
            if (r1 == r0) goto L_0x0329
            r0 = 11
            if (r1 == r0) goto L_0x0326
            if (r1 == r12) goto L_0x0323
            r0 = 21
            if (r1 == r0) goto L_0x031f
            r0 = 30
            if (r1 == r0) goto L_0x0308
            r0 = 31
            if (r1 == r0) goto L_0x031c
            r0 = 40
            if (r1 == r0) goto L_0x0319
            r0 = 41
            if (r1 == r0) goto L_0x0316
            r0 = 50
            if (r1 == r0) goto L_0x0313
            r0 = 51
            if (r1 == r0) goto L_0x0310
            switch(r1) {
                case 60: goto L_0x030d;
                case 61: goto L_0x030a;
                case 62: goto L_0x0306;
                default: goto L_0x0303;
            }
        L_0x0303:
            r0 = -1
            r9 = -1
            goto L_0x032b
        L_0x0306:
            r9 = r30
        L_0x0308:
            r0 = -1
            goto L_0x032b
        L_0x030a:
            r9 = r21
            goto L_0x0308
        L_0x030d:
            r9 = r20
            goto L_0x0308
        L_0x0310:
            r9 = r22
            goto L_0x0308
        L_0x0313:
            r9 = r23
            goto L_0x0308
        L_0x0316:
            r9 = r24
            goto L_0x0308
        L_0x0319:
            r9 = r25
            goto L_0x0308
        L_0x031c:
            r9 = r26
            goto L_0x0308
        L_0x031f:
            r0 = -1
            r9 = 8
            goto L_0x032b
        L_0x0323:
            r0 = -1
            r9 = 4
            goto L_0x032b
        L_0x0326:
            r0 = -1
            r9 = 2
            goto L_0x032b
        L_0x0329:
            r9 = r10
            goto L_0x0308
        L_0x032b:
            if (r9 != r0) goto L_0x0333
            java.lang.String r0 = "Unknown VP9 level: "
            defpackage.i2a.m(r1, r0)
            goto L_0x0346
        L_0x0333:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r0.<init>(r1, r2)
            r18 = r0
            goto L_0x0346
        L_0x0343:
            defpackage.rae.x(r1, r14)
        L_0x0346:
            return r18
        L_0x0347:
            int r0 = r11.length
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            if (r0 == r15) goto L_0x0351
            defpackage.rae.x(r1, r14)
            goto L_0x03af
        L_0x0351:
            r0 = r11[r10]     // Catch:{ NumberFormatException -> 0x03ac }
            int r0 = java.lang.Integer.parseInt(r0, r9)     // Catch:{ NumberFormatException -> 0x03ac }
            java.lang.String r0 = defpackage.vq9.d(r0)     // Catch:{ NumberFormatException -> 0x03ac }
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r0 = r2.equals(r0)     // Catch:{ NumberFormatException -> 0x03ac }
            if (r0 == 0) goto L_0x03af
            r0 = 2
            r2 = r11[r0]     // Catch:{ NumberFormatException -> 0x03ac }
            int r0 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x03ac }
            r2 = 17
            if (r0 == r2) goto L_0x0395
            if (r0 == r12) goto L_0x0397
            r2 = 23
            if (r0 == r2) goto L_0x0395
            r2 = 29
            if (r0 == r2) goto L_0x0395
            r2 = 39
            if (r0 == r2) goto L_0x0395
            r2 = 42
            if (r0 == r2) goto L_0x0395
            switch(r0) {
                case 1: goto L_0x0393;
                case 2: goto L_0x0390;
                case 3: goto L_0x038b;
                case 4: goto L_0x038d;
                case 5: goto L_0x0389;
                case 6: goto L_0x0386;
                default: goto L_0x0383;
            }     // Catch:{ NumberFormatException -> 0x03ac }
        L_0x0383:
            r0 = -1
            r15 = -1
            goto L_0x0399
        L_0x0386:
            r0 = -1
            r15 = 6
            goto L_0x0399
        L_0x0389:
            r15 = r16
        L_0x038b:
            r0 = -1
            goto L_0x0399
        L_0x038d:
            r0 = -1
            r15 = 4
            goto L_0x0399
        L_0x0390:
            r0 = -1
            r15 = 2
            goto L_0x0399
        L_0x0393:
            r15 = r10
            goto L_0x038b
        L_0x0395:
            r15 = r2
            goto L_0x038b
        L_0x0397:
            r15 = r12
            goto L_0x038b
        L_0x0399:
            if (r15 == r0) goto L_0x03af
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x03ac }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ NumberFormatException -> 0x03ac }
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x03ac }
            r0.<init>(r2, r3)     // Catch:{ NumberFormatException -> 0x03ac }
            r18 = r0
            goto L_0x03af
        L_0x03ac:
            defpackage.rae.x(r1, r14)
        L_0x03af:
            return r18
        L_0x03b0:
            r1 = 11
            int r2 = r11.length
            java.lang.String r12 = "Ignoring malformed HEVC codec string: "
            r1 = 4
            if (r2 >= r1) goto L_0x03bd
            defpackage.rae.x(r12, r14)
            goto L_0x0608
        L_0x03bd:
            r1 = r11[r10]
            java.util.regex.Matcher r1 = r13.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L_0x03ce
            defpackage.rae.x(r12, r14)
            goto L_0x0608
        L_0x03ce:
            java.lang.String r1 = r1.group(r10)
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x03dc
            r0 = r10
            goto L_0x03ef
        L_0x03dc:
            java.lang.String r2 = "2"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0603
            if (r0 == 0) goto L_0x03ee
            int r0 = r0.c
            r1 = 6
            if (r0 != r1) goto L_0x03ee
            r0 = r21
            goto L_0x03ef
        L_0x03ee:
            r0 = 2
        L_0x03ef:
            r1 = r11[r15]
            if (r1 != 0) goto L_0x03f7
        L_0x03f3:
            r2 = r18
            goto L_0x05ef
        L_0x03f7:
            int r2 = r1.hashCode()
            switch(r2) {
                case 70821: goto L_0x054b;
                case 70914: goto L_0x053e;
                case 70917: goto L_0x0531;
                case 71007: goto L_0x0524;
                case 71010: goto L_0x0517;
                case 74665: goto L_0x050a;
                case 74758: goto L_0x04fd;
                case 74761: goto L_0x04f0;
                case 74851: goto L_0x04e2;
                case 74854: goto L_0x04d4;
                case 2193639: goto L_0x04c6;
                case 2193642: goto L_0x04b8;
                case 2193732: goto L_0x04a8;
                case 2193735: goto L_0x049b;
                case 2193738: goto L_0x048e;
                case 2193825: goto L_0x0481;
                case 2193828: goto L_0x0474;
                case 2193831: goto L_0x0468;
                case 2312803: goto L_0x045c;
                case 2312806: goto L_0x0450;
                case 2312896: goto L_0x0443;
                case 2312899: goto L_0x0436;
                case 2312902: goto L_0x0429;
                case 2312989: goto L_0x041c;
                case 2312992: goto L_0x040f;
                case 2312995: goto L_0x0402;
                default: goto L_0x03fe;
            }
        L_0x03fe:
            r17 = -1
            goto L_0x0557
        L_0x0402:
            java.lang.String r2 = "L186"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x040b
            goto L_0x03fe
        L_0x040b:
            r2 = 25
            goto L_0x04b4
        L_0x040f:
            java.lang.String r2 = "L183"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0418
            goto L_0x03fe
        L_0x0418:
            r2 = 24
            goto L_0x04b4
        L_0x041c:
            java.lang.String r2 = "L180"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0425
            goto L_0x03fe
        L_0x0425:
            r2 = 23
            goto L_0x04b4
        L_0x0429:
            java.lang.String r2 = "L156"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0432
            goto L_0x03fe
        L_0x0432:
            r2 = 22
            goto L_0x04b4
        L_0x0436:
            java.lang.String r2 = "L153"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x043f
            goto L_0x03fe
        L_0x043f:
            r2 = 21
            goto L_0x04b4
        L_0x0443:
            java.lang.String r2 = "L150"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x044c
            goto L_0x03fe
        L_0x044c:
            r2 = 20
            goto L_0x04b4
        L_0x0450:
            java.lang.String r2 = "L123"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0459
            goto L_0x03fe
        L_0x0459:
            r2 = 19
            goto L_0x04b4
        L_0x045c:
            java.lang.String r2 = "L120"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0465
            goto L_0x03fe
        L_0x0465:
            r2 = 18
            goto L_0x04b4
        L_0x0468:
            java.lang.String r2 = "H186"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0471
            goto L_0x03fe
        L_0x0471:
            r2 = 17
            goto L_0x04b4
        L_0x0474:
            java.lang.String r2 = "H183"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x047d
            goto L_0x03fe
        L_0x047d:
            r17 = r9
            goto L_0x0557
        L_0x0481:
            java.lang.String r2 = "H180"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x048b
            goto L_0x03fe
        L_0x048b:
            r2 = 15
            goto L_0x04b4
        L_0x048e:
            java.lang.String r2 = "H156"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0498
            goto L_0x03fe
        L_0x0498:
            r2 = 14
            goto L_0x04b4
        L_0x049b:
            java.lang.String r2 = "H153"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x04a5
            goto L_0x03fe
        L_0x04a5:
            r2 = 13
            goto L_0x04b4
        L_0x04a8:
            java.lang.String r2 = "H150"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x04b2
            goto L_0x03fe
        L_0x04b2:
            r2 = 12
        L_0x04b4:
            r17 = r2
            goto L_0x0557
        L_0x04b8:
            java.lang.String r2 = "H123"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x04c2
            goto L_0x03fe
        L_0x04c2:
            r17 = 11
            goto L_0x0557
        L_0x04c6:
            java.lang.String r2 = "H120"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x04d0
            goto L_0x03fe
        L_0x04d0:
            r17 = 10
            goto L_0x0557
        L_0x04d4:
            java.lang.String r2 = "L93"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x04de
            goto L_0x03fe
        L_0x04de:
            r17 = 9
            goto L_0x0557
        L_0x04e2:
            java.lang.String r2 = "L90"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x04ec
            goto L_0x03fe
        L_0x04ec:
            r17 = 8
            goto L_0x0557
        L_0x04f0:
            java.lang.String r2 = "L63"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x04fa
            goto L_0x03fe
        L_0x04fa:
            r17 = 7
            goto L_0x0557
        L_0x04fd:
            java.lang.String r2 = "L60"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0507
            goto L_0x03fe
        L_0x0507:
            r17 = 6
            goto L_0x0557
        L_0x050a:
            java.lang.String r2 = "L30"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0514
            goto L_0x03fe
        L_0x0514:
            r17 = r16
            goto L_0x0557
        L_0x0517:
            java.lang.String r2 = "H93"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0521
            goto L_0x03fe
        L_0x0521:
            r17 = 4
            goto L_0x0557
        L_0x0524:
            java.lang.String r2 = "H90"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x052e
            goto L_0x03fe
        L_0x052e:
            r17 = r15
            goto L_0x0557
        L_0x0531:
            java.lang.String r2 = "H63"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x053b
            goto L_0x03fe
        L_0x053b:
            r17 = 2
            goto L_0x0557
        L_0x053e:
            java.lang.String r2 = "H60"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0548
            goto L_0x03fe
        L_0x0548:
            r17 = r10
            goto L_0x0557
        L_0x054b:
            java.lang.String r2 = "H30"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0555
            goto L_0x03fe
        L_0x0555:
            r17 = 0
        L_0x0557:
            switch(r17) {
                case 0: goto L_0x05ea;
                case 1: goto L_0x05e3;
                case 2: goto L_0x05de;
                case 3: goto L_0x05d9;
                case 4: goto L_0x05d4;
                case 5: goto L_0x05cf;
                case 6: goto L_0x05c9;
                case 7: goto L_0x05c4;
                case 8: goto L_0x05bf;
                case 9: goto L_0x05ba;
                case 10: goto L_0x05b5;
                case 11: goto L_0x05b0;
                case 12: goto L_0x05ab;
                case 13: goto L_0x05a4;
                case 14: goto L_0x059f;
                case 15: goto L_0x059a;
                case 16: goto L_0x0595;
                case 17: goto L_0x058e;
                case 18: goto L_0x0588;
                case 19: goto L_0x0582;
                case 20: goto L_0x057c;
                case 21: goto L_0x0576;
                case 22: goto L_0x0570;
                case 23: goto L_0x056a;
                case 24: goto L_0x0564;
                case 25: goto L_0x055c;
                default: goto L_0x055a;
            }
        L_0x055a:
            goto L_0x03f3
        L_0x055c:
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05ef
        L_0x0564:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x05ef
        L_0x056a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x05ef
        L_0x0570:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto L_0x05ef
        L_0x0576:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r29)
            goto L_0x05ef
        L_0x057c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
            goto L_0x05ef
        L_0x0582:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            goto L_0x05ef
        L_0x0588:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            goto L_0x05ef
        L_0x058e:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05ef
        L_0x0595:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x05ef
        L_0x059a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            goto L_0x05ef
        L_0x059f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x05ef
        L_0x05a4:
            r2 = 131072(0x20000, float:1.83671E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05ef
        L_0x05ab:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r27)
            goto L_0x05ef
        L_0x05b0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r30)
            goto L_0x05ef
        L_0x05b5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            goto L_0x05ef
        L_0x05ba:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            goto L_0x05ef
        L_0x05bf:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)
            goto L_0x05ef
        L_0x05c4:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x05ef
        L_0x05c9:
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05ef
        L_0x05cf:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x05ef
        L_0x05d4:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
            goto L_0x05ef
        L_0x05d9:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)
            goto L_0x05ef
        L_0x05de:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r26)
            goto L_0x05ef
        L_0x05e3:
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05ef
        L_0x05ea:
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x05ef:
            if (r2 != 0) goto L_0x05f7
            java.lang.String r0 = "Unknown HEVC level string: "
            defpackage.rae.x(r0, r1)
            goto L_0x0608
        L_0x05f7:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r0, r2)
            r18 = r1
            goto L_0x0608
        L_0x0603:
            java.lang.String r0 = "Unknown HEVC profile string: "
            defpackage.rae.x(r0, r1)
        L_0x0608:
            return r18
        L_0x0609:
            int r0 = r11.length
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            r2 = 2
            if (r0 >= r2) goto L_0x0614
            defpackage.rae.x(r1, r14)
            goto L_0x06e8
        L_0x0614:
            r0 = r11[r10]     // Catch:{ NumberFormatException -> 0x06e5 }
            int r0 = r0.length()     // Catch:{ NumberFormatException -> 0x06e5 }
            r3 = 6
            if (r0 != r3) goto L_0x0634
            r0 = r11[r10]     // Catch:{ NumberFormatException -> 0x06e5 }
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r2)     // Catch:{ NumberFormatException -> 0x06e5 }
            int r0 = java.lang.Integer.parseInt(r0, r9)     // Catch:{ NumberFormatException -> 0x06e5 }
            r2 = r11[r10]     // Catch:{ NumberFormatException -> 0x06e5 }
            r3 = 4
            java.lang.String r2 = r2.substring(r3)     // Catch:{ NumberFormatException -> 0x06e5 }
            int r1 = java.lang.Integer.parseInt(r2, r9)     // Catch:{ NumberFormatException -> 0x06e5 }
            goto L_0x0644
        L_0x0634:
            int r0 = r11.length     // Catch:{ NumberFormatException -> 0x06e5 }
            if (r0 < r15) goto L_0x06d5
            r0 = r11[r10]     // Catch:{ NumberFormatException -> 0x06e5 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x06e5 }
            r2 = 2
            r3 = r11[r2]     // Catch:{ NumberFormatException -> 0x06e5 }
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x06e5 }
        L_0x0644:
            r2 = 66
            if (r0 == r2) goto L_0x0672
            r2 = 77
            if (r0 == r2) goto L_0x0670
            r2 = 88
            if (r0 == r2) goto L_0x066e
            r2 = 100
            if (r0 == r2) goto L_0x066b
            r2 = 110(0x6e, float:1.54E-43)
            if (r0 == r2) goto L_0x0669
            r2 = 122(0x7a, float:1.71E-43)
            if (r0 == r2) goto L_0x0666
            r2 = 244(0xf4, float:3.42E-43)
            if (r0 == r2) goto L_0x0663
            r2 = -1
        L_0x0661:
            r3 = -1
            goto L_0x0674
        L_0x0663:
            r2 = r25
            goto L_0x0661
        L_0x0666:
            r2 = r26
            goto L_0x0661
        L_0x0669:
            r2 = r9
            goto L_0x0661
        L_0x066b:
            r2 = 8
            goto L_0x0661
        L_0x066e:
            r2 = 4
            goto L_0x0661
        L_0x0670:
            r2 = 2
            goto L_0x0661
        L_0x0672:
            r2 = r10
            goto L_0x0661
        L_0x0674:
            if (r2 != r3) goto L_0x067d
            java.lang.String r1 = "Unknown AVC profile: "
            defpackage.i2a.m(r0, r1)
            goto L_0x06e8
        L_0x067d:
            switch(r1) {
                case 10: goto L_0x06bb;
                case 11: goto L_0x06b8;
                case 12: goto L_0x06b4;
                case 13: goto L_0x0691;
                default: goto L_0x0680;
            }
        L_0x0680:
            switch(r1) {
                case 20: goto L_0x06b1;
                case 21: goto L_0x06ae;
                case 22: goto L_0x06ab;
                default: goto L_0x0683;
            }
        L_0x0683:
            switch(r1) {
                case 30: goto L_0x06a8;
                case 31: goto L_0x06a5;
                case 32: goto L_0x06a2;
                default: goto L_0x0686;
            }
        L_0x0686:
            switch(r1) {
                case 40: goto L_0x069f;
                case 41: goto L_0x069c;
                case 42: goto L_0x0699;
                default: goto L_0x0689;
            }
        L_0x0689:
            switch(r1) {
                case 50: goto L_0x0696;
                case 51: goto L_0x0693;
                case 52: goto L_0x068f;
                default: goto L_0x068c;
            }
        L_0x068c:
            r0 = -1
            r9 = -1
            goto L_0x06bd
        L_0x068f:
            r9 = r29
        L_0x0691:
            r0 = -1
            goto L_0x06bd
        L_0x0693:
            r9 = r27
            goto L_0x0691
        L_0x0696:
            r9 = r28
            goto L_0x0691
        L_0x0699:
            r9 = r30
            goto L_0x0691
        L_0x069c:
            r9 = r21
            goto L_0x0691
        L_0x069f:
            r9 = r20
            goto L_0x0691
        L_0x06a2:
            r9 = r19
            goto L_0x0691
        L_0x06a5:
            r9 = r22
            goto L_0x0691
        L_0x06a8:
            r9 = r23
            goto L_0x0691
        L_0x06ab:
            r9 = r24
            goto L_0x0691
        L_0x06ae:
            r9 = r25
            goto L_0x0691
        L_0x06b1:
            r9 = r26
            goto L_0x0691
        L_0x06b4:
            r0 = -1
            r9 = 8
            goto L_0x06bd
        L_0x06b8:
            r0 = -1
            r9 = 4
            goto L_0x06bd
        L_0x06bb:
            r9 = r10
            goto L_0x0691
        L_0x06bd:
            if (r9 != r0) goto L_0x06c5
            java.lang.String r0 = "Unknown AVC level: "
            defpackage.i2a.m(r1, r0)
            goto L_0x06e8
        L_0x06c5:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r0.<init>(r1, r2)
            r18 = r0
            goto L_0x06e8
        L_0x06d5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x06e5 }
            r0.<init>(r1)     // Catch:{ NumberFormatException -> 0x06e5 }
            r0.append(r14)     // Catch:{ NumberFormatException -> 0x06e5 }
            java.lang.String r0 = r0.toString()     // Catch:{ NumberFormatException -> 0x06e5 }
            defpackage.i8b.V(r0)     // Catch:{ NumberFormatException -> 0x06e5 }
            goto L_0x06e8
        L_0x06e5:
            defpackage.rae.x(r1, r14)
        L_0x06e8:
            return r18
        L_0x06e9:
            r2 = 131072(0x20000, float:1.83671E-40)
            int r1 = r11.length
            java.lang.String r12 = "Ignoring malformed AV1 codec string: "
            r13 = 4
            if (r1 >= r13) goto L_0x06f6
            defpackage.rae.x(r12, r14)
            goto L_0x07a0
        L_0x06f6:
            r1 = r11[r10]     // Catch:{ NumberFormatException -> 0x079d }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x079d }
            r2 = 2
            r3 = r11[r2]     // Catch:{ NumberFormatException -> 0x079d }
            r4 = 0
            java.lang.String r3 = r3.substring(r4, r2)     // Catch:{ NumberFormatException -> 0x079d }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x079d }
            r4 = r11[r15]     // Catch:{ NumberFormatException -> 0x079d }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x079d }
            if (r1 == 0) goto L_0x0717
            java.lang.String r0 = "Unknown AV1 profile: "
            defpackage.i2a.m(r1, r0)
            goto L_0x07a0
        L_0x0717:
            r1 = 8
            if (r4 == r1) goto L_0x0726
            r11 = 10
            if (r4 == r11) goto L_0x0726
            java.lang.String r0 = "Unknown AV1 bit depth: "
            defpackage.i2a.m(r4, r0)
            goto L_0x07a0
        L_0x0726:
            if (r4 != r1) goto L_0x072a
            r12 = r10
            goto L_0x073c
        L_0x072a:
            if (r0 == 0) goto L_0x073b
            byte[] r4 = r0.d
            if (r4 != 0) goto L_0x0738
            int r0 = r0.c
            r4 = 7
            if (r0 == r4) goto L_0x0738
            r4 = 6
            if (r0 != r4) goto L_0x073b
        L_0x0738:
            r12 = r21
            goto L_0x073c
        L_0x073b:
            r12 = r2
        L_0x073c:
            switch(r3) {
                case 0: goto L_0x0783;
                case 1: goto L_0x0781;
                case 2: goto L_0x077f;
                case 3: goto L_0x077d;
                case 4: goto L_0x0744;
                case 5: goto L_0x077a;
                case 6: goto L_0x0777;
                case 7: goto L_0x0774;
                case 8: goto L_0x0771;
                case 9: goto L_0x076e;
                case 10: goto L_0x076b;
                case 11: goto L_0x0768;
                case 12: goto L_0x0765;
                case 13: goto L_0x0762;
                case 14: goto L_0x075f;
                case 15: goto L_0x075c;
                case 16: goto L_0x0759;
                case 17: goto L_0x0755;
                case 18: goto L_0x0753;
                case 19: goto L_0x074f;
                case 20: goto L_0x074d;
                case 21: goto L_0x0749;
                case 22: goto L_0x0747;
                case 23: goto L_0x0743;
                default: goto L_0x073f;
            }
        L_0x073f:
            r0 = -1
            r9 = -1
            goto L_0x0785
        L_0x0743:
            r9 = r5
        L_0x0744:
            r0 = -1
            goto L_0x0785
        L_0x0747:
            r9 = r8
            goto L_0x0744
        L_0x0749:
            r0 = -1
            r9 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x0785
        L_0x074d:
            r9 = r7
            goto L_0x0744
        L_0x074f:
            r0 = -1
            r9 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0785
        L_0x0753:
            r9 = r6
            goto L_0x0744
        L_0x0755:
            r0 = -1
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0785
        L_0x0759:
            r9 = r29
            goto L_0x0744
        L_0x075c:
            r9 = r27
            goto L_0x0744
        L_0x075f:
            r9 = r28
            goto L_0x0744
        L_0x0762:
            r9 = r30
            goto L_0x0744
        L_0x0765:
            r9 = r21
            goto L_0x0744
        L_0x0768:
            r9 = r20
            goto L_0x0744
        L_0x076b:
            r9 = r19
            goto L_0x0744
        L_0x076e:
            r9 = r22
            goto L_0x0744
        L_0x0771:
            r9 = r23
            goto L_0x0744
        L_0x0774:
            r9 = r24
            goto L_0x0744
        L_0x0777:
            r9 = r25
            goto L_0x0744
        L_0x077a:
            r9 = r26
            goto L_0x0744
        L_0x077d:
            r9 = r1
            goto L_0x0744
        L_0x077f:
            r9 = r13
            goto L_0x0744
        L_0x0781:
            r9 = r2
            goto L_0x0744
        L_0x0783:
            r9 = r10
            goto L_0x0744
        L_0x0785:
            if (r9 != r0) goto L_0x078d
            java.lang.String r0 = "Unknown AV1 level: "
            defpackage.i2a.m(r3, r0)
            goto L_0x07a0
        L_0x078d:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r0.<init>(r1, r2)
            r18 = r0
            goto L_0x07a0
        L_0x079d:
            defpackage.rae.x(r12, r14)
        L_0x07a0:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo8.d(ea6):android.util.Pair");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: bo8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: bo8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: bo8} */
    /* JADX WARNING: type inference failed for: r8v5, types: [java.lang.Object, ao8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.List e(boolean r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.String r0 = "MediaCodecList API didn't list secure decoder for: "
            java.lang.Class<fo8> r1 = defpackage.fo8.class
            monitor-enter(r1)
            yn8 r2 = new yn8     // Catch:{ all -> 0x0023 }
            r2.<init>(r8, r9, r10)     // Catch:{ all -> 0x0023 }
            java.util.HashMap r3 = b     // Catch:{ all -> 0x0023 }
            java.lang.Object r4 = r3.get(r2)     // Catch:{ all -> 0x0023 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0023 }
            if (r4 == 0) goto L_0x0016
            monitor-exit(r1)
            return r4
        L_0x0016:
            int r4 = defpackage.v0g.a     // Catch:{ all -> 0x0023 }
            r5 = 21
            if (r4 < r5) goto L_0x0025
            bo8 r6 = new bo8     // Catch:{ all -> 0x0023 }
            r7 = 1
            r6.<init>(r7, r8, r10)     // Catch:{ all -> 0x0023 }
            goto L_0x002a
        L_0x0023:
            r8 = move-exception
            goto L_0x0077
        L_0x0025:
            bk3 r6 = new bk3     // Catch:{ all -> 0x0023 }
            r6.<init>()     // Catch:{ all -> 0x0023 }
        L_0x002a:
            java.util.ArrayList r10 = f(r2, r6)     // Catch:{ all -> 0x0023 }
            if (r8 == 0) goto L_0x006b
            boolean r8 = r10.isEmpty()     // Catch:{ all -> 0x0023 }
            if (r8 == 0) goto L_0x006b
            if (r5 > r4) goto L_0x006b
            r8 = 23
            if (r4 > r8) goto L_0x006b
            bk3 r8 = new bk3     // Catch:{ all -> 0x0023 }
            r8.<init>()     // Catch:{ all -> 0x0023 }
            java.util.ArrayList r10 = f(r2, r8)     // Catch:{ all -> 0x0023 }
            boolean r8 = r10.isEmpty()     // Catch:{ all -> 0x0023 }
            if (r8 != 0) goto L_0x006b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0023 }
            r8.<init>(r0)     // Catch:{ all -> 0x0023 }
            r8.append(r9)     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = ". Assuming: "
            r8.append(r0)     // Catch:{ all -> 0x0023 }
            r0 = 0
            java.lang.Object r0 = r10.get(r0)     // Catch:{ all -> 0x0023 }
            on8 r0 = (defpackage.on8) r0     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.a     // Catch:{ all -> 0x0023 }
            r8.append(r0)     // Catch:{ all -> 0x0023 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0023 }
            defpackage.i8b.V(r8)     // Catch:{ all -> 0x0023 }
        L_0x006b:
            a(r9, r10)     // Catch:{ all -> 0x0023 }
            tb7 r8 = defpackage.tb7.p(r10)     // Catch:{ all -> 0x0023 }
            r3.put(r2, r8)     // Catch:{ all -> 0x0023 }
            monitor-exit(r1)
            return r8
        L_0x0077:
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo8.e(boolean, java.lang.String, boolean):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x012b A[Catch:{ Exception -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0150 A[Catch:{ Exception -> 0x014e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList f(defpackage.yn8 r23, defpackage.ao8 r24) {
        /*
            r1 = r23
            r2 = r24
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x014e }
            r5.<init>()     // Catch:{ Exception -> 0x014e }
            java.lang.String r14 = r1.a     // Catch:{ Exception -> 0x014e }
            int r15 = r24.f()     // Catch:{ Exception -> 0x014e }
            boolean r13 = r24.g()     // Catch:{ Exception -> 0x014e }
            r16 = 0
            r12 = r16
        L_0x001b:
            if (r12 >= r15) goto L_0x0174
            android.media.MediaCodecInfo r0 = r2.a(r12)     // Catch:{ Exception -> 0x014e }
            int r6 = defpackage.v0g.a     // Catch:{ Exception -> 0x014e }
            r7 = 29
            if (r6 < r7) goto L_0x0033
            boolean r8 = r0.isAlias()     // Catch:{ Exception -> 0x014e }
            if (r8 == 0) goto L_0x0033
        L_0x002d:
            r18 = r12
            r22 = r13
            goto L_0x0144
        L_0x0033:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x014e }
            boolean r8 = i(r0, r11, r13, r14)     // Catch:{ Exception -> 0x014e }
            if (r8 != 0) goto L_0x003e
            goto L_0x002d
        L_0x003e:
            java.lang.String r10 = c(r0, r11, r14)     // Catch:{ Exception -> 0x014e }
            if (r10 != 0) goto L_0x0045
            goto L_0x002d
        L_0x0045:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x0117 }
            boolean r8 = r2.c(r4, r10, r9)     // Catch:{ Exception -> 0x0117 }
            boolean r17 = r2.e(r4, r9)     // Catch:{ Exception -> 0x0117 }
            boolean r7 = r1.c     // Catch:{ Exception -> 0x0117 }
            if (r7 != 0) goto L_0x0057
            if (r17 != 0) goto L_0x002d
        L_0x0057:
            if (r7 == 0) goto L_0x005c
            if (r8 != 0) goto L_0x005c
            goto L_0x002d
        L_0x005c:
            boolean r7 = r2.c(r3, r10, r9)     // Catch:{ Exception -> 0x0117 }
            boolean r8 = r2.e(r3, r9)     // Catch:{ Exception -> 0x0117 }
            boolean r2 = r1.b
            if (r2 != 0) goto L_0x006a
            if (r8 != 0) goto L_0x002d
        L_0x006a:
            if (r2 == 0) goto L_0x006f
            if (r7 != 0) goto L_0x006f
            goto L_0x002d
        L_0x006f:
            r8 = 29
            if (r6 < r8) goto L_0x007c
            boolean r8 = r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x0117 }
            r19 = r8
            r17 = 1
            goto L_0x0086
        L_0x007c:
            boolean r8 = j(r0, r14)     // Catch:{ Exception -> 0x0117 }
            r17 = 1
            r8 = r8 ^ 1
            r19 = r8
        L_0x0086:
            boolean r20 = j(r0, r14)     // Catch:{ Exception -> 0x0117 }
            r8 = 29
            if (r6 < r8) goto L_0x0093
            boolean r0 = r0.isVendor()     // Catch:{ Exception -> 0x0117 }
            goto L_0x00b9
        L_0x0093:
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r0 = defpackage.o54.P(r0)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r6 = "omx.google."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0117 }
            if (r6 != 0) goto L_0x00b6
            java.lang.String r6 = "c2.android."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0117 }
            if (r6 != 0) goto L_0x00b6
            java.lang.String r6 = "c2.google."
            boolean r0 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0117 }
            if (r0 != 0) goto L_0x00b6
            r8 = r17
            goto L_0x00b8
        L_0x00b6:
            r8 = r16
        L_0x00b8:
            r0 = r8
        L_0x00b9:
            if (r13 == 0) goto L_0x00bd
            if (r2 == r7) goto L_0x00c1
        L_0x00bd:
            if (r13 != 0) goto L_0x00e0
            if (r2 != 0) goto L_0x00e0
        L_0x00c1:
            r2 = 0
            r6 = r11
            r7 = r14
            r8 = r10
            r17 = r10
            r10 = r19
            r21 = r11
            r11 = r20
            r18 = r12
            r12 = r0
            r22 = r13
            r13 = r2
            on8 r0 = defpackage.on8.h(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00dc }
            r5.add(r0)     // Catch:{ Exception -> 0x00dc }
            goto L_0x0144
        L_0x00dc:
            r0 = move-exception
            r1 = r21
            goto L_0x011f
        L_0x00e0:
            r17 = r10
            r21 = r11
            r18 = r12
            r22 = r13
            if (r22 != 0) goto L_0x0144
            if (r7 == 0) goto L_0x0144
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dc }
            r2.<init>()     // Catch:{ Exception -> 0x00dc }
            r13 = r21
            r2.append(r13)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r6 = ".secure"
            r2.append(r6)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x0114 }
            r2 = 1
            r7 = r14
            r8 = r17
            r10 = r19
            r11 = r20
            r12 = r0
            r1 = r13
            r13 = r2
            on8 r0 = defpackage.on8.h(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0112 }
            r5.add(r0)     // Catch:{ Exception -> 0x0112 }
            return r5
        L_0x0112:
            r0 = move-exception
            goto L_0x011f
        L_0x0114:
            r0 = move-exception
            r1 = r13
            goto L_0x011f
        L_0x0117:
            r0 = move-exception
            r17 = r10
            r1 = r11
            r18 = r12
            r22 = r13
        L_0x011f:
            int r2 = defpackage.v0g.a     // Catch:{ Exception -> 0x014e }
            r6 = 23
            if (r2 > r6) goto L_0x0150
            boolean r2 = r5.isEmpty()     // Catch:{ Exception -> 0x014e }
            if (r2 != 0) goto L_0x0150
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014e }
            r0.<init>()     // Catch:{ Exception -> 0x014e }
            java.lang.String r2 = "Skipping codec "
            r0.append(r2)     // Catch:{ Exception -> 0x014e }
            r0.append(r1)     // Catch:{ Exception -> 0x014e }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x014e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x014e }
            defpackage.i8b.o(r0)     // Catch:{ Exception -> 0x014e }
        L_0x0144:
            int r12 = r18 + 1
            r1 = r23
            r2 = r24
            r13 = r22
            goto L_0x001b
        L_0x014e:
            r0 = move-exception
            goto L_0x0175
        L_0x0150:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014e }
            r2.<init>()     // Catch:{ Exception -> 0x014e }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x014e }
            r2.append(r1)     // Catch:{ Exception -> 0x014e }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x014e }
            r1 = r17
            r2.append(r1)     // Catch:{ Exception -> 0x014e }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x014e }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x014e }
            defpackage.i8b.o(r1)     // Catch:{ Exception -> 0x014e }
            throw r0     // Catch:{ Exception -> 0x014e }
        L_0x0174:
            return r5
        L_0x0175:
            androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException r1 = new androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException
            java.lang.String r2 = "Failed to query underlying media codecs"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo8.f(yn8, ao8):java.util.ArrayList");
    }

    public static k0d g(rx0 rx0, ea6 ea6, boolean z, boolean z2) {
        Iterable iterable;
        String str = ea6.n;
        rx0.getClass();
        List e = e(z, str, z2);
        String b2 = b(ea6);
        if (b2 == null) {
            iterable = k0d.v;
        } else {
            rx0.getClass();
            iterable = e(z, b2, z2);
        }
        qb7 o = tb7.o();
        o.e(e);
        o.e(iterable);
        return o.j();
    }

    public static ArrayList h(ea6 ea6, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new ks3(3, new td8(3, ea6)));
        return arrayList;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = v0g.a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(v0g.c))) {
            String str3 = v0g.b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(v0g.c)) {
            String str4 = v0g.b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i != 19 || !v0g.b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
            return i > 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str);
        }
        return false;
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str) {
        if (v0g.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (vq9.h(str)) {
            return true;
        }
        String P = o54.P(mediaCodecInfo.getName());
        if (P.startsWith("arc.")) {
            return false;
        }
        if (P.startsWith("omx.google.") || P.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((!P.startsWith("omx.sec.") || !P.contains(".sw.")) && !P.equals("omx.qcom.video.decoder.hevcswvdec") && !P.startsWith("c2.android.") && !P.startsWith("c2.google.")) {
            return !P.startsWith("omx.") && !P.startsWith("c2.");
        }
        return true;
    }

    public static int k() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (c == -1) {
            int i2 = 0;
            List e = e(false, "video/avc", false);
            on8 on8 = e.isEmpty() ? null : (on8) e.get(0);
            if (on8 != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = on8.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = codecProfileLevelArr[i2].level;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case Uuid.SIZE_BITS /*128*/:
                            case 256:
                                i = 414720;
                                break;
                            case ConstantsKt.MINIMUM_BLOCK_SIZE /*512*/:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case ConstantsKt.DEFAULT_BLOCK_SIZE /*4096*/:
                                i = 2097152;
                                break;
                            case ConstantsKt.DEFAULT_BUFFER_SIZE /*8192*/:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, v0g.a >= 21 ? 345600 : 172800);
            }
            c = i2;
        }
        return c;
    }
}
