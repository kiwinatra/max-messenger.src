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

/* renamed from: eo8  reason: default package */
public abstract class eo8 {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (t0g.a < 26 && t0g.b.equals("R9") && arrayList.size() == 1 && ((nn8) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(nn8.g("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false));
            }
            Collections.sort(arrayList, new ks3(2, new zc8(11)));
        }
        int i = t0g.a;
        if (i < 21 && arrayList.size() > 1) {
            String str2 = ((nn8) arrayList.get(0)).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new ks3(2, new zc8(13)));
            }
        }
        if (i < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((nn8) arrayList.get(0)).a)) {
            arrayList.add((nn8) arrayList.remove(0));
        }
    }

    public static String b(ca6 ca6) {
        Pair d;
        if ("audio/eac3-joc".equals(ca6.Z)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(ca6.Z) || (d = d(ca6)) == null) {
            return null;
        }
        int intValue = ((Integer) d.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
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
            if (!str2.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(str)) {
                return null;
            }
            return "audio/x-lg-flac";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x04df, code lost:
        if (r6.equals("H123") == false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x04e3, code lost:
        r18 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0578, code lost:
        switch(r18) {
            case 0: goto L_0x061a;
            case 1: goto L_0x0615;
            case 2: goto L_0x0610;
            case 3: goto L_0x060b;
            case 4: goto L_0x0606;
            case 5: goto L_0x0601;
            case 6: goto L_0x05fc;
            case 7: goto L_0x05f7;
            case 8: goto L_0x05f2;
            case 9: goto L_0x05ed;
            case 10: goto L_0x05e8;
            case 11: goto L_0x05e3;
            case 12: goto L_0x05db;
            case 13: goto L_0x05d4;
            case ru.ok.tamtam.nano.Protos.Attaches.Attach.LOCATION :int: goto L_0x05cd;
            case ru.ok.tamtam.nano.Protos.Attaches.Attach.DAILY_MEDIA :int: goto L_0x05c6;
            case 16: goto L_0x05bf;
            case org.apache.http.util.LangUtils.HASH_SEED :int: goto L_0x05b7;
            case 18: goto L_0x05af;
            case 19: goto L_0x05a9;
            case 20: goto L_0x05a3;
            case 21: goto L_0x059d;
            case 22: goto L_0x0595;
            case 23: goto L_0x058d;
            case one.me.common.drawable.SavedMessagesIconDrawable.NORMAL_ICON_SIZE :int: goto L_0x0585;
            case 25: goto L_0x057d;
            default: goto L_0x057b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x057d, code lost:
        r1 = 16777216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0585, code lost:
        r1 = 4194304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x058d, code lost:
        r1 = 1048576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0595, code lost:
        r1 = 262144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x059d, code lost:
        r1 = 65536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x05a3, code lost:
        r1 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x05a9, code lost:
        r1 = java.lang.Integer.valueOf(kotlin.io.ConstantsKt.DEFAULT_BLOCK_SIZE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x05af, code lost:
        r1 = 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x05b7, code lost:
        r1 = 33554432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x05bf, code lost:
        r1 = 8388608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x05c6, code lost:
        r1 = 2097152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x05cd, code lost:
        r1 = 524288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x05d4, code lost:
        r1 = 131072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x05db, code lost:
        r1 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x05e3, code lost:
        r1 = java.lang.Integer.valueOf(kotlin.io.ConstantsKt.DEFAULT_BUFFER_SIZE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x05e8, code lost:
        r1 = 2048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x05ed, code lost:
        r1 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x05f2, code lost:
        r1 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x05f7, code lost:
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x05fc, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0601, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0606, code lost:
        r1 = java.lang.Integer.valueOf(kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x060b, code lost:
        r1 = java.lang.Integer.valueOf(kotlin.uuid.Uuid.SIZE_BITS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0610, code lost:
        r1 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0615, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x061a, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0774, code lost:
        r0 = r0.c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03a9 A[Catch:{ NumberFormatException -> 0x03ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x06c5  */
    /* JADX WARNING: Removed duplicated region for block: B:529:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:547:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair d(defpackage.ca6 r26) {
        /*
            r0 = r26
            java.lang.String r1 = "05"
            java.lang.String r2 = "04"
            java.lang.String r3 = "03"
            java.lang.String r4 = "02"
            java.lang.String r5 = "01"
            java.util.regex.Pattern r6 = a
            r7 = 16
            r14 = 8
            r16 = 5
            r15 = 3
            r8 = 1
            r9 = 4
            r10 = 2
            java.lang.String r12 = r0.z
            r17 = 0
            if (r12 != 0) goto L_0x001f
            return r17
        L_0x001f:
            java.lang.String r13 = "\\."
            java.lang.String[] r12 = r12.split(r13)
            java.lang.String r13 = "video/dolby-vision"
            java.lang.String r11 = r0.Z
            boolean r11 = r13.equals(r11)
            r19 = 2048(0x800, float:2.87E-42)
            r20 = 4096(0x1000, float:5.74E-42)
            r21 = 512(0x200, float:7.175E-43)
            r22 = 256(0x100, float:3.59E-43)
            r23 = 128(0x80, float:1.794E-43)
            r24 = 64
            r25 = 32
            java.lang.String r13 = r0.z
            if (r11 == 0) goto L_0x0240
            int r0 = r12.length
            java.lang.String r11 = "Ignoring malformed Dolby Vision codec string: "
            if (r0 >= r15) goto L_0x0053
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x023f
            r11.concat(r0)
            goto L_0x023f
        L_0x0053:
            r0 = r12[r8]
            java.util.regex.Matcher r0 = r6.matcher(r0)
            boolean r6 = r0.matches()
            if (r6 != 0) goto L_0x006e
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x023f
            r11.concat(r0)
            goto L_0x023f
        L_0x006e:
            java.lang.String r0 = r0.group(r8)
            if (r0 != 0) goto L_0x0078
        L_0x0074:
            r6 = r17
            goto L_0x011e
        L_0x0078:
            int r6 = r0.hashCode()
            switch(r6) {
                case 1536: goto L_0x00df;
                case 1537: goto L_0x00d6;
                case 1538: goto L_0x00cd;
                case 1539: goto L_0x00c4;
                case 1540: goto L_0x00bb;
                case 1541: goto L_0x00b1;
                case 1542: goto L_0x00a6;
                case 1543: goto L_0x009b;
                case 1544: goto L_0x008f;
                case 1545: goto L_0x0082;
                default: goto L_0x007f;
            }
        L_0x007f:
            r6 = -1
            goto L_0x00e9
        L_0x0082:
            java.lang.String r6 = "09"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x008b
            goto L_0x007f
        L_0x008b:
            r6 = 9
            goto L_0x00e9
        L_0x008f:
            java.lang.String r6 = "08"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0098
            goto L_0x007f
        L_0x0098:
            r6 = r14
            goto L_0x00e9
        L_0x009b:
            java.lang.String r6 = "07"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x00a4
            goto L_0x007f
        L_0x00a4:
            r6 = 7
            goto L_0x00e9
        L_0x00a6:
            java.lang.String r6 = "06"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x00af
            goto L_0x007f
        L_0x00af:
            r6 = 6
            goto L_0x00e9
        L_0x00b1:
            boolean r6 = r0.equals(r1)
            if (r6 != 0) goto L_0x00b8
            goto L_0x007f
        L_0x00b8:
            r6 = r16
            goto L_0x00e9
        L_0x00bb:
            boolean r6 = r0.equals(r2)
            if (r6 != 0) goto L_0x00c2
            goto L_0x007f
        L_0x00c2:
            r6 = r9
            goto L_0x00e9
        L_0x00c4:
            boolean r6 = r0.equals(r3)
            if (r6 != 0) goto L_0x00cb
            goto L_0x007f
        L_0x00cb:
            r6 = r15
            goto L_0x00e9
        L_0x00cd:
            boolean r6 = r0.equals(r4)
            if (r6 != 0) goto L_0x00d4
            goto L_0x007f
        L_0x00d4:
            r6 = r10
            goto L_0x00e9
        L_0x00d6:
            boolean r6 = r0.equals(r5)
            if (r6 != 0) goto L_0x00dd
            goto L_0x007f
        L_0x00dd:
            r6 = r8
            goto L_0x00e9
        L_0x00df:
            java.lang.String r6 = "00"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x00e8
            goto L_0x007f
        L_0x00e8:
            r6 = 0
        L_0x00e9:
            switch(r6) {
                case 0: goto L_0x011a;
                case 1: goto L_0x0115;
                case 2: goto L_0x0110;
                case 3: goto L_0x010b;
                case 4: goto L_0x0106;
                case 5: goto L_0x0101;
                case 6: goto L_0x00fc;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00f2;
                case 9: goto L_0x00ed;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            goto L_0x0074
        L_0x00ed:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r21)
            goto L_0x011e
        L_0x00f2:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r22)
            goto L_0x011e
        L_0x00f7:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r23)
            goto L_0x011e
        L_0x00fc:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r24)
            goto L_0x011e
        L_0x0101:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r25)
            goto L_0x011e
        L_0x0106:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            goto L_0x011e
        L_0x010b:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            goto L_0x011e
        L_0x0110:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            goto L_0x011e
        L_0x0115:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            goto L_0x011e
        L_0x011a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
        L_0x011e:
            if (r6 != 0) goto L_0x0131
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x023f
            java.lang.String r1 = "Unknown Dolby Vision profile string: "
            r1.concat(r0)
            goto L_0x023f
        L_0x0131:
            r0 = r12[r10]
            if (r0 != 0) goto L_0x0139
        L_0x0135:
            r1 = r17
            goto L_0x0226
        L_0x0139:
            int r11 = r0.hashCode()
            switch(r11) {
                case 1537: goto L_0x01d5;
                case 1538: goto L_0x01ca;
                case 1539: goto L_0x01bf;
                case 1540: goto L_0x01b5;
                case 1541: goto L_0x01ab;
                case 1542: goto L_0x019f;
                case 1543: goto L_0x0193;
                case 1544: goto L_0x0187;
                case 1545: goto L_0x017a;
                case 1567: goto L_0x016d;
                case 1568: goto L_0x0160;
                case 1569: goto L_0x0153;
                case 1570: goto L_0x0144;
                default: goto L_0x0140;
            }
        L_0x0140:
            r18 = -1
            goto L_0x01df
        L_0x0144:
            java.lang.String r1 = "13"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x014d
            goto L_0x0140
        L_0x014d:
            r1 = 12
            r18 = r1
            goto L_0x01df
        L_0x0153:
            java.lang.String r1 = "12"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x015c
            goto L_0x0140
        L_0x015c:
            r18 = 11
            goto L_0x01df
        L_0x0160:
            java.lang.String r1 = "11"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0169
            goto L_0x0140
        L_0x0169:
            r18 = 10
            goto L_0x01df
        L_0x016d:
            java.lang.String r1 = "10"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0176
            goto L_0x0140
        L_0x0176:
            r18 = 9
            goto L_0x01df
        L_0x017a:
            java.lang.String r1 = "09"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0183
            goto L_0x0140
        L_0x0183:
            r18 = r14
            goto L_0x01df
        L_0x0187:
            java.lang.String r1 = "08"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0190
            goto L_0x0140
        L_0x0190:
            r18 = 7
            goto L_0x01df
        L_0x0193:
            java.lang.String r1 = "07"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x019c
            goto L_0x0140
        L_0x019c:
            r18 = 6
            goto L_0x01df
        L_0x019f:
            java.lang.String r1 = "06"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x01a8
            goto L_0x0140
        L_0x01a8:
            r18 = r16
            goto L_0x01df
        L_0x01ab:
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x01b2
            goto L_0x0140
        L_0x01b2:
            r18 = r9
            goto L_0x01df
        L_0x01b5:
            boolean r1 = r0.equals(r2)
            if (r1 != 0) goto L_0x01bc
            goto L_0x0140
        L_0x01bc:
            r18 = r15
            goto L_0x01df
        L_0x01bf:
            boolean r1 = r0.equals(r3)
            if (r1 != 0) goto L_0x01c7
            goto L_0x0140
        L_0x01c7:
            r18 = r10
            goto L_0x01df
        L_0x01ca:
            boolean r1 = r0.equals(r4)
            if (r1 != 0) goto L_0x01d2
            goto L_0x0140
        L_0x01d2:
            r18 = r8
            goto L_0x01df
        L_0x01d5:
            boolean r1 = r0.equals(r5)
            if (r1 != 0) goto L_0x01dd
            goto L_0x0140
        L_0x01dd:
            r18 = 0
        L_0x01df:
            switch(r18) {
                case 0: goto L_0x0222;
                case 1: goto L_0x021d;
                case 2: goto L_0x0218;
                case 3: goto L_0x0213;
                case 4: goto L_0x020e;
                case 5: goto L_0x0209;
                case 6: goto L_0x0204;
                case 7: goto L_0x01ff;
                case 8: goto L_0x01fa;
                case 9: goto L_0x01f5;
                case 10: goto L_0x01ee;
                case 11: goto L_0x01e9;
                case 12: goto L_0x01e4;
                default: goto L_0x01e2;
            }
        L_0x01e2:
            goto L_0x0135
        L_0x01e4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            goto L_0x0226
        L_0x01e9:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            goto L_0x0226
        L_0x01ee:
            r1 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0226
        L_0x01f5:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            goto L_0x0226
        L_0x01fa:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            goto L_0x0226
        L_0x01ff:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            goto L_0x0226
        L_0x0204:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            goto L_0x0226
        L_0x0209:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            goto L_0x0226
        L_0x020e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L_0x0226
        L_0x0213:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            goto L_0x0226
        L_0x0218:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L_0x0226
        L_0x021d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L_0x0226
        L_0x0222:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
        L_0x0226:
            if (r1 != 0) goto L_0x0238
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x023f
            java.lang.String r1 = "Unknown Dolby Vision level string: "
            r1.concat(r0)
            goto L_0x023f
        L_0x0238:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r6, r1)
            r17 = r0
        L_0x023f:
            return r17
        L_0x0240:
            r1 = 0
            r2 = r12[r1]
            r2.getClass()
            r1 = 16384(0x4000, float:2.2959E-41)
            r3 = 65536(0x10000, float:9.18355E-41)
            r4 = 8192(0x2000, float:1.14794E-41)
            int r5 = r2.hashCode()
            switch(r5) {
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
            r2 = -1
            goto L_0x02a2
        L_0x0255:
            java.lang.String r5 = "vp09"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x025e
            goto L_0x0253
        L_0x025e:
            r2 = 6
            goto L_0x02a2
        L_0x0260:
            java.lang.String r5 = "mp4a"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0269
            goto L_0x0253
        L_0x0269:
            r2 = r16
            goto L_0x02a2
        L_0x026c:
            java.lang.String r5 = "hvc1"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0275
            goto L_0x0253
        L_0x0275:
            r2 = r9
            goto L_0x02a2
        L_0x0277:
            java.lang.String r5 = "hev1"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0280
            goto L_0x0253
        L_0x0280:
            r2 = r15
            goto L_0x02a2
        L_0x0282:
            java.lang.String r5 = "avc2"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x028b
            goto L_0x0253
        L_0x028b:
            r2 = r10
            goto L_0x02a2
        L_0x028d:
            java.lang.String r5 = "avc1"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0296
            goto L_0x0253
        L_0x0296:
            r2 = r8
            goto L_0x02a2
        L_0x0298:
            java.lang.String r5 = "av01"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x02a1
            goto L_0x0253
        L_0x02a1:
            r2 = 0
        L_0x02a2:
            switch(r2) {
                case 0: goto L_0x072c;
                case 1: goto L_0x064c;
                case 2: goto L_0x064c;
                case 3: goto L_0x03c8;
                case 4: goto L_0x03c8;
                case 5: goto L_0x034c;
                case 6: goto L_0x02a6;
                default: goto L_0x02a5;
            }
        L_0x02a5:
            return r17
        L_0x02a6:
            int r0 = r12.length
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            if (r0 >= r15) goto L_0x02ba
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x034b
            r1.concat(r0)
            goto L_0x034b
        L_0x02ba:
            r0 = r12[r8]     // Catch:{ NumberFormatException -> 0x033e }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x033e }
            r2 = r12[r10]     // Catch:{ NumberFormatException -> 0x033e }
            int r1 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x033e }
            if (r0 == 0) goto L_0x02d7
            if (r0 == r8) goto L_0x02d5
            if (r0 == r10) goto L_0x02d3
            if (r0 == r15) goto L_0x02d1
            r0 = -1
        L_0x02cf:
            r2 = -1
            goto L_0x02d9
        L_0x02d1:
            r0 = r14
            goto L_0x02cf
        L_0x02d3:
            r0 = r9
            goto L_0x02cf
        L_0x02d5:
            r0 = r10
            goto L_0x02cf
        L_0x02d7:
            r0 = r8
            goto L_0x02cf
        L_0x02d9:
            if (r0 != r2) goto L_0x02dd
            goto L_0x034b
        L_0x02dd:
            r2 = 10
            if (r1 == r2) goto L_0x0329
            r2 = 11
            if (r1 == r2) goto L_0x0327
            r2 = 20
            if (r1 == r2) goto L_0x0325
            r2 = 21
            if (r1 == r2) goto L_0x0323
            r2 = 30
            if (r1 == r2) goto L_0x030c
            r2 = 31
            if (r1 == r2) goto L_0x0320
            r2 = 40
            if (r1 == r2) goto L_0x031d
            r2 = 41
            if (r1 == r2) goto L_0x031a
            r2 = 50
            if (r1 == r2) goto L_0x0317
            r2 = 51
            if (r1 == r2) goto L_0x0314
            switch(r1) {
                case 60: goto L_0x0311;
                case 61: goto L_0x030e;
                case 62: goto L_0x030b;
                default: goto L_0x0308;
            }
        L_0x0308:
            r1 = -1
            r7 = -1
            goto L_0x032b
        L_0x030b:
            r7 = r4
        L_0x030c:
            r1 = -1
            goto L_0x032b
        L_0x030e:
            r7 = r20
            goto L_0x030c
        L_0x0311:
            r7 = r19
            goto L_0x030c
        L_0x0314:
            r7 = r21
            goto L_0x030c
        L_0x0317:
            r7 = r22
            goto L_0x030c
        L_0x031a:
            r7 = r23
            goto L_0x030c
        L_0x031d:
            r7 = r24
            goto L_0x030c
        L_0x0320:
            r7 = r25
            goto L_0x030c
        L_0x0323:
            r7 = r14
            goto L_0x030c
        L_0x0325:
            r7 = r9
            goto L_0x030c
        L_0x0327:
            r7 = r10
            goto L_0x030c
        L_0x0329:
            r7 = r8
            goto L_0x030c
        L_0x032b:
            if (r7 != r1) goto L_0x032e
            goto L_0x034b
        L_0x032e:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r1.<init>(r0, r2)
            r17 = r1
            goto L_0x034b
        L_0x033e:
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x034b
            r1.concat(r0)
        L_0x034b:
            return r17
        L_0x034c:
            int r0 = r12.length
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            if (r0 == r15) goto L_0x0360
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x03c7
            r1.concat(r0)
            goto L_0x03c7
        L_0x0360:
            r0 = r12[r8]     // Catch:{ NumberFormatException -> 0x03ba }
            int r0 = java.lang.Integer.parseInt(r0, r7)     // Catch:{ NumberFormatException -> 0x03ba }
            java.lang.String r0 = defpackage.uq9.d(r0)     // Catch:{ NumberFormatException -> 0x03ba }
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r0 = r2.equals(r0)     // Catch:{ NumberFormatException -> 0x03ba }
            if (r0 == 0) goto L_0x03c7
            r0 = r12[r10]     // Catch:{ NumberFormatException -> 0x03ba }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x03ba }
            r2 = 17
            if (r0 == r2) goto L_0x03a3
            r5 = 20
            if (r0 == r5) goto L_0x03a5
            r2 = 23
            if (r0 == r2) goto L_0x03a3
            r2 = 29
            if (r0 == r2) goto L_0x03a3
            r2 = 39
            if (r0 == r2) goto L_0x03a3
            r2 = 42
            if (r0 == r2) goto L_0x03a3
            switch(r0) {
                case 1: goto L_0x03a1;
                case 2: goto L_0x039f;
                case 3: goto L_0x039d;
                case 4: goto L_0x039b;
                case 5: goto L_0x0399;
                case 6: goto L_0x0396;
                default: goto L_0x0393;
            }     // Catch:{ NumberFormatException -> 0x03ba }
        L_0x0393:
            r0 = -1
            r9 = -1
            goto L_0x03a7
        L_0x0396:
            r0 = -1
            r9 = 6
            goto L_0x03a7
        L_0x0399:
            r9 = r16
        L_0x039b:
            r0 = -1
            goto L_0x03a7
        L_0x039d:
            r9 = r15
            goto L_0x039b
        L_0x039f:
            r9 = r10
            goto L_0x039b
        L_0x03a1:
            r9 = r8
            goto L_0x039b
        L_0x03a3:
            r9 = r2
            goto L_0x039b
        L_0x03a5:
            r9 = r5
            goto L_0x039b
        L_0x03a7:
            if (r9 == r0) goto L_0x03c7
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x03ba }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ NumberFormatException -> 0x03ba }
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x03ba }
            r0.<init>(r2, r3)     // Catch:{ NumberFormatException -> 0x03ba }
            r17 = r0
            goto L_0x03c7
        L_0x03ba:
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x03c7
            r1.concat(r0)
        L_0x03c7:
            return r17
        L_0x03c8:
            r2 = 11
            r5 = 20
            int r0 = r12.length
            java.lang.String r11 = "Ignoring malformed HEVC codec string: "
            if (r0 >= r9) goto L_0x03e0
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x064b
            r11.concat(r0)
            goto L_0x064b
        L_0x03e0:
            r0 = r12[r8]
            java.util.regex.Matcher r0 = r6.matcher(r0)
            boolean r6 = r0.matches()
            if (r6 != 0) goto L_0x03fb
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x064b
            r11.concat(r0)
            goto L_0x064b
        L_0x03fb:
            java.lang.String r0 = r0.group(r8)
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0409
            r0 = r8
            goto L_0x0412
        L_0x0409:
            java.lang.String r6 = "2"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x063c
            r0 = r10
        L_0x0412:
            r6 = r12[r15]
            if (r6 != 0) goto L_0x041a
        L_0x0416:
            r1 = r17
            goto L_0x061e
        L_0x041a:
            int r11 = r6.hashCode()
            switch(r11) {
                case 70821: goto L_0x056c;
                case 70914: goto L_0x055f;
                case 70917: goto L_0x0552;
                case 71007: goto L_0x0545;
                case 71010: goto L_0x0538;
                case 74665: goto L_0x052b;
                case 74758: goto L_0x051e;
                case 74761: goto L_0x0511;
                case 74851: goto L_0x0503;
                case 74854: goto L_0x04f5;
                case 2193639: goto L_0x04e7;
                case 2193642: goto L_0x04d9;
                case 2193732: goto L_0x04cc;
                case 2193735: goto L_0x04bf;
                case 2193738: goto L_0x04b2;
                case 2193825: goto L_0x04a5;
                case 2193828: goto L_0x0498;
                case 2193831: goto L_0x048c;
                case 2312803: goto L_0x0480;
                case 2312806: goto L_0x0473;
                case 2312896: goto L_0x0466;
                case 2312899: goto L_0x0459;
                case 2312902: goto L_0x044c;
                case 2312989: goto L_0x043f;
                case 2312992: goto L_0x0432;
                case 2312995: goto L_0x0425;
                default: goto L_0x0421;
            }
        L_0x0421:
            r18 = -1
            goto L_0x0578
        L_0x0425:
            java.lang.String r2 = "L186"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x042e
            goto L_0x0421
        L_0x042e:
            r2 = 25
            goto L_0x04e3
        L_0x0432:
            java.lang.String r2 = "L183"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x043b
            goto L_0x0421
        L_0x043b:
            r2 = 24
            goto L_0x04e3
        L_0x043f:
            java.lang.String r2 = "L180"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0448
            goto L_0x0421
        L_0x0448:
            r2 = 23
            goto L_0x04e3
        L_0x044c:
            java.lang.String r2 = "L156"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0455
            goto L_0x0421
        L_0x0455:
            r2 = 22
            goto L_0x04e3
        L_0x0459:
            java.lang.String r2 = "L153"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0462
            goto L_0x0421
        L_0x0462:
            r2 = 21
            goto L_0x04e3
        L_0x0466:
            java.lang.String r2 = "L150"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x046f
            goto L_0x0421
        L_0x046f:
            r18 = r5
            goto L_0x0578
        L_0x0473:
            java.lang.String r2 = "L123"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x047c
            goto L_0x0421
        L_0x047c:
            r2 = 19
            goto L_0x04e3
        L_0x0480:
            java.lang.String r2 = "L120"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0489
            goto L_0x0421
        L_0x0489:
            r2 = 18
            goto L_0x04e3
        L_0x048c:
            java.lang.String r2 = "H186"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0495
            goto L_0x0421
        L_0x0495:
            r2 = 17
            goto L_0x04e3
        L_0x0498:
            java.lang.String r2 = "H183"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x04a1
            goto L_0x0421
        L_0x04a1:
            r18 = r7
            goto L_0x0578
        L_0x04a5:
            java.lang.String r2 = "H180"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x04af
            goto L_0x0421
        L_0x04af:
            r2 = 15
            goto L_0x04e3
        L_0x04b2:
            java.lang.String r2 = "H156"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x04bc
            goto L_0x0421
        L_0x04bc:
            r2 = 14
            goto L_0x04e3
        L_0x04bf:
            java.lang.String r2 = "H153"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x04c9
            goto L_0x0421
        L_0x04c9:
            r2 = 13
            goto L_0x04e3
        L_0x04cc:
            java.lang.String r2 = "H150"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x04d6
            goto L_0x0421
        L_0x04d6:
            r2 = 12
            goto L_0x04e3
        L_0x04d9:
            java.lang.String r5 = "H123"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x04e3
            goto L_0x0421
        L_0x04e3:
            r18 = r2
            goto L_0x0578
        L_0x04e7:
            java.lang.String r2 = "H120"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x04f1
            goto L_0x0421
        L_0x04f1:
            r18 = 10
            goto L_0x0578
        L_0x04f5:
            java.lang.String r2 = "L93"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x04ff
            goto L_0x0421
        L_0x04ff:
            r18 = 9
            goto L_0x0578
        L_0x0503:
            java.lang.String r2 = "L90"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x050d
            goto L_0x0421
        L_0x050d:
            r18 = r14
            goto L_0x0578
        L_0x0511:
            java.lang.String r2 = "L63"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x051b
            goto L_0x0421
        L_0x051b:
            r18 = 7
            goto L_0x0578
        L_0x051e:
            java.lang.String r2 = "L60"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0528
            goto L_0x0421
        L_0x0528:
            r18 = 6
            goto L_0x0578
        L_0x052b:
            java.lang.String r2 = "L30"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0535
            goto L_0x0421
        L_0x0535:
            r18 = r16
            goto L_0x0578
        L_0x0538:
            java.lang.String r2 = "H93"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0542
            goto L_0x0421
        L_0x0542:
            r18 = r9
            goto L_0x0578
        L_0x0545:
            java.lang.String r2 = "H90"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x054f
            goto L_0x0421
        L_0x054f:
            r18 = r15
            goto L_0x0578
        L_0x0552:
            java.lang.String r2 = "H63"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x055c
            goto L_0x0421
        L_0x055c:
            r18 = r10
            goto L_0x0578
        L_0x055f:
            java.lang.String r2 = "H60"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0569
            goto L_0x0421
        L_0x0569:
            r18 = r8
            goto L_0x0578
        L_0x056c:
            java.lang.String r2 = "H30"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0576
            goto L_0x0421
        L_0x0576:
            r18 = 0
        L_0x0578:
            switch(r18) {
                case 0: goto L_0x061a;
                case 1: goto L_0x0615;
                case 2: goto L_0x0610;
                case 3: goto L_0x060b;
                case 4: goto L_0x0606;
                case 5: goto L_0x0601;
                case 6: goto L_0x05fc;
                case 7: goto L_0x05f7;
                case 8: goto L_0x05f2;
                case 9: goto L_0x05ed;
                case 10: goto L_0x05e8;
                case 11: goto L_0x05e3;
                case 12: goto L_0x05db;
                case 13: goto L_0x05d4;
                case 14: goto L_0x05cd;
                case 15: goto L_0x05c6;
                case 16: goto L_0x05bf;
                case 17: goto L_0x05b7;
                case 18: goto L_0x05af;
                case 19: goto L_0x05a9;
                case 20: goto L_0x05a3;
                case 21: goto L_0x059d;
                case 22: goto L_0x0595;
                case 23: goto L_0x058d;
                case 24: goto L_0x0585;
                case 25: goto L_0x057d;
                default: goto L_0x057b;
            }
        L_0x057b:
            goto L_0x0416
        L_0x057d:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x061e
        L_0x0585:
            r1 = 4194304(0x400000, float:5.877472E-39)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x061e
        L_0x058d:
            r1 = 1048576(0x100000, float:1.469368E-39)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x061e
        L_0x0595:
            r1 = 262144(0x40000, float:3.67342E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x061e
        L_0x059d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            goto L_0x061e
        L_0x05a3:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x061e
        L_0x05a9:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            goto L_0x061e
        L_0x05af:
            r2 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L_0x061e
        L_0x05b7:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x061e
        L_0x05bf:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x061e
        L_0x05c6:
            r1 = 2097152(0x200000, float:2.938736E-39)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x061e
        L_0x05cd:
            r1 = 524288(0x80000, float:7.34684E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x061e
        L_0x05d4:
            r1 = 131072(0x20000, float:1.83671E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x061e
        L_0x05db:
            r5 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x061e
        L_0x05e3:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            goto L_0x061e
        L_0x05e8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            goto L_0x061e
        L_0x05ed:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            goto L_0x061e
        L_0x05f2:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            goto L_0x061e
        L_0x05f7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L_0x061e
        L_0x05fc:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L_0x061e
        L_0x0601:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            goto L_0x061e
        L_0x0606:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            goto L_0x061e
        L_0x060b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            goto L_0x061e
        L_0x0610:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            goto L_0x061e
        L_0x0615:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            goto L_0x061e
        L_0x061a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
        L_0x061e:
            if (r1 != 0) goto L_0x0630
            java.lang.String r0 = java.lang.String.valueOf(r6)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x064b
            java.lang.String r1 = "Unknown HEVC level string: "
            r1.concat(r0)
            goto L_0x064b
        L_0x0630:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r0, r1)
            r17 = r2
            goto L_0x064b
        L_0x063c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x064b
            java.lang.String r1 = "Unknown HEVC profile string: "
            r1.concat(r0)
        L_0x064b:
            return r17
        L_0x064c:
            r2 = 1024(0x400, float:1.435E-42)
            r5 = 32768(0x8000, float:4.5918E-41)
            int r0 = r12.length
            java.lang.String r6 = "Ignoring malformed AVC codec string: "
            if (r0 >= r10) goto L_0x0665
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x072b
            r6.concat(r0)
            goto L_0x072b
        L_0x0665:
            r0 = r12[r8]     // Catch:{ NumberFormatException -> 0x071e }
            int r0 = r0.length()     // Catch:{ NumberFormatException -> 0x071e }
            r11 = 6
            if (r0 != r11) goto L_0x0684
            r0 = r12[r8]     // Catch:{ NumberFormatException -> 0x071e }
            r11 = 0
            java.lang.String r0 = r0.substring(r11, r10)     // Catch:{ NumberFormatException -> 0x071e }
            int r0 = java.lang.Integer.parseInt(r0, r7)     // Catch:{ NumberFormatException -> 0x071e }
            r11 = r12[r8]     // Catch:{ NumberFormatException -> 0x071e }
            java.lang.String r11 = r11.substring(r9)     // Catch:{ NumberFormatException -> 0x071e }
            int r6 = java.lang.Integer.parseInt(r11, r7)     // Catch:{ NumberFormatException -> 0x071e }
            goto L_0x0693
        L_0x0684:
            int r0 = r12.length     // Catch:{ NumberFormatException -> 0x071e }
            if (r0 < r15) goto L_0x0710
            r0 = r12[r8]     // Catch:{ NumberFormatException -> 0x071e }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x071e }
            r11 = r12[r10]     // Catch:{ NumberFormatException -> 0x071e }
            int r6 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x071e }
        L_0x0693:
            r11 = 66
            if (r0 == r11) goto L_0x06bf
            r11 = 77
            if (r0 == r11) goto L_0x06b4
            r10 = 88
            if (r0 == r10) goto L_0x06bd
            r10 = 100
            if (r0 == r10) goto L_0x06bb
            r10 = 110(0x6e, float:1.54E-43)
            if (r0 == r10) goto L_0x06b9
            r10 = 122(0x7a, float:1.71E-43)
            if (r0 == r10) goto L_0x06b6
            r10 = 244(0xf4, float:3.42E-43)
            if (r0 == r10) goto L_0x06b2
            r0 = -1
            r10 = -1
            goto L_0x06c1
        L_0x06b2:
            r10 = r24
        L_0x06b4:
            r0 = -1
            goto L_0x06c1
        L_0x06b6:
            r10 = r25
            goto L_0x06b4
        L_0x06b9:
            r10 = r7
            goto L_0x06b4
        L_0x06bb:
            r10 = r14
            goto L_0x06b4
        L_0x06bd:
            r10 = r9
            goto L_0x06b4
        L_0x06bf:
            r10 = r8
            goto L_0x06b4
        L_0x06c1:
            if (r10 != r0) goto L_0x06c5
            goto L_0x072b
        L_0x06c5:
            switch(r6) {
                case 10: goto L_0x06fb;
                case 11: goto L_0x06f9;
                case 12: goto L_0x06f7;
                case 13: goto L_0x06d8;
                default: goto L_0x06c8;
            }
        L_0x06c8:
            switch(r6) {
                case 20: goto L_0x06f4;
                case 21: goto L_0x06f1;
                case 22: goto L_0x06ee;
                default: goto L_0x06cb;
            }
        L_0x06cb:
            switch(r6) {
                case 30: goto L_0x06eb;
                case 31: goto L_0x06e8;
                case 32: goto L_0x06e6;
                default: goto L_0x06ce;
            }
        L_0x06ce:
            switch(r6) {
                case 40: goto L_0x06e3;
                case 41: goto L_0x06e0;
                case 42: goto L_0x06de;
                default: goto L_0x06d1;
            }
        L_0x06d1:
            switch(r6) {
                case 50: goto L_0x06dc;
                case 51: goto L_0x06da;
                case 52: goto L_0x06d7;
                default: goto L_0x06d4;
            }
        L_0x06d4:
            r0 = -1
            r7 = -1
            goto L_0x06fd
        L_0x06d7:
            r7 = r3
        L_0x06d8:
            r0 = -1
            goto L_0x06fd
        L_0x06da:
            r7 = r5
            goto L_0x06d8
        L_0x06dc:
            r7 = r1
            goto L_0x06d8
        L_0x06de:
            r7 = r4
            goto L_0x06d8
        L_0x06e0:
            r7 = r20
            goto L_0x06d8
        L_0x06e3:
            r7 = r19
            goto L_0x06d8
        L_0x06e6:
            r7 = r2
            goto L_0x06d8
        L_0x06e8:
            r7 = r21
            goto L_0x06d8
        L_0x06eb:
            r7 = r22
            goto L_0x06d8
        L_0x06ee:
            r7 = r23
            goto L_0x06d8
        L_0x06f1:
            r7 = r24
            goto L_0x06d8
        L_0x06f4:
            r7 = r25
            goto L_0x06d8
        L_0x06f7:
            r7 = r14
            goto L_0x06d8
        L_0x06f9:
            r7 = r9
            goto L_0x06d8
        L_0x06fb:
            r7 = r8
            goto L_0x06d8
        L_0x06fd:
            if (r7 != r0) goto L_0x0700
            goto L_0x072b
        L_0x0700:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r0.<init>(r1, r2)
            r17 = r0
            goto L_0x072b
        L_0x0710:
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ NumberFormatException -> 0x071e }
            int r1 = r0.length()     // Catch:{ NumberFormatException -> 0x071e }
            if (r1 == 0) goto L_0x072b
            r6.concat(r0)     // Catch:{ NumberFormatException -> 0x071e }
            goto L_0x072b
        L_0x071e:
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x072b
            r6.concat(r0)
        L_0x072b:
            return r17
        L_0x072c:
            r2 = 1024(0x400, float:1.435E-42)
            r5 = 32768(0x8000, float:4.5918E-41)
            int r6 = r12.length
            java.lang.String r11 = "Ignoring malformed AV1 codec string: "
            if (r6 >= r9) goto L_0x0745
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x07e9
            r11.concat(r0)
            goto L_0x07e9
        L_0x0745:
            r6 = r12[r8]     // Catch:{ NumberFormatException -> 0x07dc }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x07dc }
            r1 = r12[r10]     // Catch:{ NumberFormatException -> 0x07dc }
            r2 = 0
            java.lang.String r1 = r1.substring(r2, r10)     // Catch:{ NumberFormatException -> 0x07dc }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x07dc }
            r2 = r12[r15]     // Catch:{ NumberFormatException -> 0x07dc }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x07dc }
            if (r6 == 0) goto L_0x0760
            goto L_0x07e9
        L_0x0760:
            if (r2 == r14) goto L_0x0768
            r6 = 10
            if (r2 == r6) goto L_0x0768
            goto L_0x07e9
        L_0x0768:
            if (r2 != r14) goto L_0x076c
            r0 = r8
            goto L_0x0780
        L_0x076c:
            l53 r0 = r0.G0
            if (r0 == 0) goto L_0x077f
            byte[] r2 = r0.o
            if (r2 != 0) goto L_0x077c
            int r0 = r0.c
            r2 = 7
            if (r0 == r2) goto L_0x077c
            r2 = 6
            if (r0 != r2) goto L_0x077f
        L_0x077c:
            r0 = r20
            goto L_0x0780
        L_0x077f:
            r0 = r10
        L_0x0780:
            switch(r1) {
                case 0: goto L_0x07c7;
                case 1: goto L_0x07c5;
                case 2: goto L_0x07c3;
                case 3: goto L_0x07c1;
                case 4: goto L_0x0789;
                case 5: goto L_0x07be;
                case 6: goto L_0x07bb;
                case 7: goto L_0x07b8;
                case 8: goto L_0x07b5;
                case 9: goto L_0x07b2;
                case 10: goto L_0x07ae;
                case 11: goto L_0x07ab;
                case 12: goto L_0x07a8;
                case 13: goto L_0x07a6;
                case 14: goto L_0x07a2;
                case 15: goto L_0x07a0;
                case 16: goto L_0x079e;
                case 17: goto L_0x079b;
                case 18: goto L_0x0798;
                case 19: goto L_0x0795;
                case 20: goto L_0x0792;
                case 21: goto L_0x078f;
                case 22: goto L_0x078c;
                case 23: goto L_0x0787;
                default: goto L_0x0783;
            }
        L_0x0783:
            r1 = -1
            r7 = -1
            goto L_0x07c9
        L_0x0787:
            r7 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0789:
            r1 = -1
            goto L_0x07c9
        L_0x078c:
            r7 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0789
        L_0x078f:
            r7 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x0789
        L_0x0792:
            r7 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0789
        L_0x0795:
            r7 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0789
        L_0x0798:
            r7 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0789
        L_0x079b:
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0789
        L_0x079e:
            r7 = r3
            goto L_0x0789
        L_0x07a0:
            r7 = r5
            goto L_0x0789
        L_0x07a2:
            r1 = -1
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x07c9
        L_0x07a6:
            r7 = r4
            goto L_0x0789
        L_0x07a8:
            r7 = r20
            goto L_0x0789
        L_0x07ab:
            r7 = r19
            goto L_0x0789
        L_0x07ae:
            r1 = -1
            r7 = 1024(0x400, float:1.435E-42)
            goto L_0x07c9
        L_0x07b2:
            r7 = r21
            goto L_0x0789
        L_0x07b5:
            r7 = r22
            goto L_0x0789
        L_0x07b8:
            r7 = r23
            goto L_0x0789
        L_0x07bb:
            r7 = r24
            goto L_0x0789
        L_0x07be:
            r7 = r25
            goto L_0x0789
        L_0x07c1:
            r7 = r14
            goto L_0x0789
        L_0x07c3:
            r7 = r9
            goto L_0x0789
        L_0x07c5:
            r7 = r10
            goto L_0x0789
        L_0x07c7:
            r7 = r8
            goto L_0x0789
        L_0x07c9:
            if (r7 != r1) goto L_0x07cc
            goto L_0x07e9
        L_0x07cc:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r1.<init>(r0, r2)
            r17 = r1
            goto L_0x07e9
        L_0x07dc:
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x07e9
            r11.concat(r0)
        L_0x07e9:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo8.d(ca6):android.util.Pair");
    }

    public static synchronized List e(boolean z, String str, boolean z2) {
        synchronized (eo8.class) {
            try {
                xn8 xn8 = new xn8(z, str, z2);
                HashMap hashMap = b;
                List list = (List) hashMap.get(xn8);
                if (list != null) {
                    return list;
                }
                int i = t0g.a;
                ArrayList f = f(xn8, i >= 21 ? new bo8(0, z, z2) : new ece(14));
                if (z && f.isEmpty() && 21 <= i && i <= 23) {
                    f = f(xn8, new ece(14));
                    if (!f.isEmpty()) {
                        new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(((nn8) f.get(0)).a).length());
                    }
                }
                a(str, f);
                tb7 p = tb7.p(f);
                hashMap.put(xn8, p);
                return p;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0119 A[Catch:{ Exception -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0132 A[Catch:{ Exception -> 0x0130 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList f(defpackage.xn8 r23, defpackage.zn8 r24) {
        /*
            r1 = r23
            r2 = r24
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0130 }
            r5.<init>()     // Catch:{ Exception -> 0x0130 }
            java.lang.String r14 = r1.a     // Catch:{ Exception -> 0x0130 }
            int r15 = r24.f()     // Catch:{ Exception -> 0x0130 }
            boolean r13 = r24.g()     // Catch:{ Exception -> 0x0130 }
            r16 = 0
            r12 = r16
        L_0x001b:
            if (r12 >= r15) goto L_0x0147
            android.media.MediaCodecInfo r0 = r2.a(r12)     // Catch:{ Exception -> 0x0130 }
            int r6 = defpackage.t0g.a     // Catch:{ Exception -> 0x0130 }
            r7 = 29
            if (r6 < r7) goto L_0x0033
            boolean r8 = r0.isAlias()     // Catch:{ Exception -> 0x0130 }
            if (r8 == 0) goto L_0x0033
        L_0x002d:
            r21 = r12
            r22 = r13
            goto L_0x0128
        L_0x0033:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x0130 }
            boolean r8 = g(r0, r11, r13, r14)     // Catch:{ Exception -> 0x0130 }
            if (r8 != 0) goto L_0x003e
            goto L_0x002d
        L_0x003e:
            java.lang.String r10 = c(r0, r11, r14)     // Catch:{ Exception -> 0x0130 }
            if (r10 != 0) goto L_0x0045
            goto L_0x002d
        L_0x0045:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x0104 }
            boolean r8 = r2.c(r4, r10, r9)     // Catch:{ Exception -> 0x0104 }
            boolean r17 = r2.e(r4, r9)     // Catch:{ Exception -> 0x0104 }
            boolean r7 = r1.c     // Catch:{ Exception -> 0x0104 }
            if (r7 != 0) goto L_0x0057
            if (r17 != 0) goto L_0x002d
        L_0x0057:
            if (r7 == 0) goto L_0x005c
            if (r8 != 0) goto L_0x005c
            goto L_0x002d
        L_0x005c:
            boolean r7 = r2.c(r3, r10, r9)     // Catch:{ Exception -> 0x0104 }
            boolean r8 = r2.e(r3, r9)     // Catch:{ Exception -> 0x0104 }
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
            boolean r8 = r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x0104 }
            r19 = r8
            r17 = 1
            goto L_0x0086
        L_0x007c:
            boolean r8 = h(r0, r14)     // Catch:{ Exception -> 0x0104 }
            r17 = 1
            r8 = r8 ^ 1
            r19 = r8
        L_0x0086:
            boolean r20 = h(r0, r14)     // Catch:{ Exception -> 0x0104 }
            r8 = 29
            if (r6 < r8) goto L_0x0093
            boolean r0 = r0.isVendor()     // Catch:{ Exception -> 0x0104 }
            goto L_0x00b9
        L_0x0093:
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = defpackage.o54.P(r0)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r6 = "omx.google."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0104 }
            if (r6 != 0) goto L_0x00b6
            java.lang.String r6 = "c2.android."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0104 }
            if (r6 != 0) goto L_0x00b6
            java.lang.String r6 = "c2.google."
            boolean r0 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0104 }
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
            if (r13 != 0) goto L_0x00dd
            if (r2 != 0) goto L_0x00dd
        L_0x00c1:
            r2 = 0
            r6 = r11
            r7 = r14
            r8 = r10
            r17 = r10
            r10 = r19
            r18 = r11
            r11 = r20
            r21 = r12
            r12 = r0
            r22 = r13
            r13 = r2
            nn8 r0 = defpackage.nn8.g(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00db }
            r5.add(r0)     // Catch:{ Exception -> 0x00db }
            goto L_0x0128
        L_0x00db:
            r0 = move-exception
            goto L_0x010d
        L_0x00dd:
            r17 = r10
            r18 = r11
            r21 = r12
            r22 = r13
            if (r22 != 0) goto L_0x0128
            if (r7 == 0) goto L_0x0128
            java.lang.String r2 = java.lang.String.valueOf(r18)     // Catch:{ Exception -> 0x00db }
            java.lang.String r6 = ".secure"
            java.lang.String r6 = r2.concat(r6)     // Catch:{ Exception -> 0x00db }
            r13 = 1
            r7 = r14
            r8 = r17
            r10 = r19
            r11 = r20
            r12 = r0
            nn8 r0 = defpackage.nn8.g(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00db }
            r5.add(r0)     // Catch:{ Exception -> 0x00db }
            return r5
        L_0x0104:
            r0 = move-exception
            r17 = r10
            r18 = r11
            r21 = r12
            r22 = r13
        L_0x010d:
            int r2 = defpackage.t0g.a     // Catch:{ Exception -> 0x0130 }
            r6 = 23
            if (r2 > r6) goto L_0x0132
            boolean r2 = r5.isEmpty()     // Catch:{ Exception -> 0x0130 }
            if (r2 != 0) goto L_0x0132
            java.lang.String r0 = java.lang.String.valueOf(r18)     // Catch:{ Exception -> 0x0130 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0130 }
            int r0 = r0 + 46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0130 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0130 }
        L_0x0128:
            int r12 = r21 + 1
            r2 = r24
            r13 = r22
            goto L_0x001b
        L_0x0130:
            r0 = move-exception
            goto L_0x0148
        L_0x0132:
            java.lang.String r1 = java.lang.String.valueOf(r18)     // Catch:{ Exception -> 0x0130 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0130 }
            int r1 = r1 + 25
            int r2 = r17.length()     // Catch:{ Exception -> 0x0130 }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0130 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0130 }
            throw r0     // Catch:{ Exception -> 0x0130 }
        L_0x0147:
            return r5
        L_0x0148:
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException
            java.lang.String r2 = "Failed to query underlying media codecs"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo8.f(xn8, zn8):java.util.ArrayList");
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = t0g.a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = t0g.b;
            if ("a70".equals(str3) || ("Xiaomi".equals(t0g.c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = t0g.b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = t0g.b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(t0g.c))) {
            String str6 = t0g.b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(t0g.c)) {
            String str7 = t0g.b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i > 19 || !t0g.b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
            return i > 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str);
        }
        return false;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (t0g.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (uq9.h(str)) {
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

    public static int i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (c == -1) {
            int i2 = 0;
            List e = e(false, "video/avc", false);
            nn8 nn8 = e.isEmpty() ? null : (nn8) e.get(0);
            if (nn8 != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = nn8.d;
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
                i2 = Math.max(i3, t0g.a >= 21 ? 345600 : 172800);
            }
            c = i2;
        }
        return c;
    }
}
