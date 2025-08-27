package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jo8  reason: default package */
public final class jo8 extends wn8 {
    public static final int[] u2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean v2;
    public static boolean w2;
    public final Context O1;
    public final boolean P1;
    public final m8g Q1;
    public final int R1 = 50;
    public final boolean S1;
    public final y5g T1;
    public final ap0 U1;
    public r3 V1;
    public boolean W1;
    public boolean X1;
    public ed3 Y1;
    public boolean Z1;
    public List a2;
    public Surface b2;
    public unb c2;
    public ode d2;
    public boolean e2;
    public int f2;
    public long g2;
    public int h2;
    public int i2;
    public int j2;
    public long k2;
    public int l2;
    public long m2;
    public v8g n2;
    public v8g o2;
    public int p2;
    public boolean q2;
    public int r2;
    public ho8 s2;
    public pc5 t2;

    public jo8(Context context, gn8 gn8, Handler handler, nc5 nc5) {
        super(2, gn8, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.O1 = applicationContext;
        this.Q1 = new m8g(handler, nc5);
        this.P1 = true;
        this.T1 = new y5g(applicationContext, this);
        this.U1 = new ap0();
        this.S1 = "NVIDIA".equals(v0g.c);
        this.d2 = ode.c;
        this.f2 = 1;
        this.n2 = v8g.e;
        this.r2 = 0;
        this.o2 = null;
        this.p2 = -1000;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        if (r9.equals("video/hevc") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r12 = ((java.lang.Integer) r12.first).intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A0(defpackage.on8 r11, defpackage.ea6 r12) {
        /*
            r0 = 3
            r1 = 4
            java.lang.String r2 = "video/hevc"
            java.lang.String r3 = "video/avc"
            r4 = 2
            r5 = 1
            int r6 = r12.t
            r7 = -1
            if (r6 == r7) goto L_0x00d8
            int r8 = r12.u
            if (r8 != r7) goto L_0x0013
            goto L_0x00d8
        L_0x0013:
            java.lang.String r9 = r12.n
            r9.getClass()
            java.lang.String r10 = "video/dolby-vision"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L_0x0039
            android.util.Pair r12 = defpackage.fo8.d(r12)
            if (r12 == 0) goto L_0x0038
            java.lang.Object r12 = r12.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r9 = 512(0x200, float:7.175E-43)
            if (r12 == r9) goto L_0x0036
            if (r12 == r5) goto L_0x0036
            if (r12 != r4) goto L_0x0038
        L_0x0036:
            r9 = r3
            goto L_0x0039
        L_0x0038:
            r9 = r2
        L_0x0039:
            int r12 = r9.hashCode()
            switch(r12) {
                case -1664118616: goto L_0x007e;
                case -1662735862: goto L_0x0073;
                case -1662541442: goto L_0x006c;
                case 1187890754: goto L_0x0061;
                case 1331836730: goto L_0x0058;
                case 1599127256: goto L_0x004d;
                case 1599127257: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            r4 = r7
            goto L_0x0088
        L_0x0042:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x004b
            goto L_0x0040
        L_0x004b:
            r4 = 6
            goto L_0x0088
        L_0x004d:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x0056
            goto L_0x0040
        L_0x0056:
            r4 = 5
            goto L_0x0088
        L_0x0058:
            boolean r12 = r9.equals(r3)
            if (r12 != 0) goto L_0x005f
            goto L_0x0040
        L_0x005f:
            r4 = r1
            goto L_0x0088
        L_0x0061:
            java.lang.String r12 = "video/mp4v-es"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x006a
            goto L_0x0040
        L_0x006a:
            r4 = r0
            goto L_0x0088
        L_0x006c:
            boolean r12 = r9.equals(r2)
            if (r12 != 0) goto L_0x0088
            goto L_0x0040
        L_0x0073:
            java.lang.String r12 = "video/av01"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x007c
            goto L_0x0040
        L_0x007c:
            r4 = r5
            goto L_0x0088
        L_0x007e:
            java.lang.String r12 = "video/3gpp"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x0087
            goto L_0x0040
        L_0x0087:
            r4 = 0
        L_0x0088:
            switch(r4) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00d4;
                case 2: goto L_0x00ca;
                case 3: goto L_0x00d4;
                case 4: goto L_0x0091;
                case 5: goto L_0x00d4;
                case 6: goto L_0x008c;
                default: goto L_0x008b;
            }
        L_0x008b:
            return r7
        L_0x008c:
            int r6 = r6 * r8
            int r6 = r6 * r0
            int r6 = r6 / 8
            return r6
        L_0x0091:
            java.lang.String r12 = defpackage.v0g.d
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00c9
            java.lang.String r0 = "Amazon"
            java.lang.String r2 = defpackage.v0g.c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = "KFSOWI"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00c9
            java.lang.String r0 = "AFTS"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x00ba
            boolean r11 = r11.f
            if (r11 == 0) goto L_0x00ba
            goto L_0x00c9
        L_0x00ba:
            r11 = 16
            int r12 = defpackage.v0g.g(r6, r11)
            int r11 = defpackage.v0g.g(r8, r11)
            int r11 = r11 * r12
            int r11 = r11 * 768
            int r11 = r11 / r1
            return r11
        L_0x00c9:
            return r7
        L_0x00ca:
            int r6 = r6 * r8
            int r6 = r6 * r0
            int r6 = r6 / r1
            r11 = 2097152(0x200000, float:2.938736E-39)
            int r11 = java.lang.Math.max(r11, r6)
            return r11
        L_0x00d4:
            int r6 = r6 * r8
            int r6 = r6 * r0
            int r6 = r6 / r1
            return r6
        L_0x00d8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo8.A0(on8, ea6):int");
    }

    public static List B0(Context context, rx0 rx0, ea6 ea6, boolean z, boolean z2) {
        List list;
        String str = ea6.n;
        if (str == null) {
            return k0d.v;
        }
        if (v0g.a >= 26 && "video/dolby-vision".equals(str) && !go8.a(context)) {
            String b = fo8.b(ea6);
            if (b == null) {
                list = k0d.v;
            } else {
                rx0.getClass();
                list = fo8.e(z, b, z2);
            }
            if (!list.isEmpty()) {
                return list;
            }
        }
        return fo8.g(rx0, ea6, z, z2);
    }

    public static int C0(on8 on8, ea6 ea6) {
        if (ea6.o == -1) {
            return A0(on8, ea6);
        }
        List list = ea6.q;
        int size = list.size();
        int i = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i += ((byte[]) list.get(i3)).length;
        }
        return ea6.o + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x074f, code lost:
        if (r14.equals("A10-70L") == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x08b7, code lost:
        if (r1.equals("JSN-L21") == false) goto L_0x08b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean z0(java.lang.String r17) {
        /*
            r0 = 26
            r2 = 27
            r3 = 28
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = -1
            r11 = 1
            java.lang.String r12 = "OMX.google"
            r13 = r17
            boolean r12 = r13.startsWith(r12)
            r13 = 0
            if (r12 == 0) goto L_0x001a
            return r13
        L_0x001a:
            java.lang.Class<jo8> r12 = defpackage.jo8.class
            monitor-enter(r12)
            boolean r14 = v2     // Catch:{ all -> 0x08be }
            if (r14 != 0) goto L_0x08c0
            int r14 = defpackage.v0g.a     // Catch:{ all -> 0x08be }
            if (r14 > r3) goto L_0x0092
            java.lang.String r15 = defpackage.v0g.b     // Catch:{ all -> 0x08be }
            r15.getClass()     // Catch:{ all -> 0x08be }
            int r16 = r15.hashCode()
            switch(r16) {
                case -1339091551: goto L_0x0081;
                case -1220081023: goto L_0x0076;
                case -1220066608: goto L_0x006b;
                case -1012436106: goto L_0x0060;
                case -760312546: goto L_0x0055;
                case -64886864: goto L_0x004a;
                case 3415681: goto L_0x003f;
                case 825323514: goto L_0x0034;
                default: goto L_0x0031;
            }
        L_0x0031:
            r1 = r10
            goto L_0x008b
        L_0x0034:
            java.lang.String r1 = "machuca"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x003d
            goto L_0x0031
        L_0x003d:
            r1 = r4
            goto L_0x008b
        L_0x003f:
            java.lang.String r1 = "once"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x0048
            goto L_0x0031
        L_0x0048:
            r1 = r5
            goto L_0x008b
        L_0x004a:
            java.lang.String r1 = "magnolia"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x0053
            goto L_0x0031
        L_0x0053:
            r1 = r6
            goto L_0x008b
        L_0x0055:
            java.lang.String r1 = "aquaman"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x005e
            goto L_0x0031
        L_0x005e:
            r1 = r7
            goto L_0x008b
        L_0x0060:
            java.lang.String r1 = "oneday"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x0069
            goto L_0x0031
        L_0x0069:
            r1 = r8
            goto L_0x008b
        L_0x006b:
            java.lang.String r1 = "dangalUHD"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x0074
            goto L_0x0031
        L_0x0074:
            r1 = r9
            goto L_0x008b
        L_0x0076:
            java.lang.String r1 = "dangalFHD"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x007f
            goto L_0x0031
        L_0x007f:
            r1 = r11
            goto L_0x008b
        L_0x0081:
            java.lang.String r1 = "dangal"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x008a
            goto L_0x0031
        L_0x008a:
            r1 = r13
        L_0x008b:
            switch(r1) {
                case 0: goto L_0x008f;
                case 1: goto L_0x008f;
                case 2: goto L_0x008f;
                case 3: goto L_0x008f;
                case 4: goto L_0x008f;
                case 5: goto L_0x008f;
                case 6: goto L_0x008f;
                case 7: goto L_0x008f;
                default: goto L_0x008e;
            }
        L_0x008e:
            goto L_0x0092
        L_0x008f:
            r13 = r11
            goto L_0x08b9
        L_0x0092:
            if (r14 > r2) goto L_0x009f
            java.lang.String r1 = "HWEML"
            java.lang.String r15 = defpackage.v0g.b     // Catch:{ all -> 0x08be }
            boolean r1 = r1.equals(r15)     // Catch:{ all -> 0x08be }
            if (r1 == 0) goto L_0x009f
            goto L_0x008f
        L_0x009f:
            java.lang.String r1 = defpackage.v0g.d     // Catch:{ all -> 0x08be }
            r1.getClass()     // Catch:{ all -> 0x08be }
            int r15 = r1.hashCode()
            switch(r15) {
                case -349662828: goto L_0x0108;
                case -321033677: goto L_0x00fd;
                case 2006354: goto L_0x00f2;
                case 2006367: goto L_0x00e7;
                case 2006371: goto L_0x00dc;
                case 1785421873: goto L_0x00d1;
                case 1785421876: goto L_0x00c6;
                case 1798172390: goto L_0x00bb;
                case 2119412532: goto L_0x00ae;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            r15 = r10
            goto L_0x0112
        L_0x00ae:
            java.lang.String r15 = "AFTEUFF014"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00b7
            goto L_0x00ab
        L_0x00b7:
            r15 = 8
            goto L_0x0112
        L_0x00bb:
            java.lang.String r15 = "AFTSO001"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00c4
            goto L_0x00ab
        L_0x00c4:
            r15 = r4
            goto L_0x0112
        L_0x00c6:
            java.lang.String r15 = "AFTEU014"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00cf
            goto L_0x00ab
        L_0x00cf:
            r15 = r5
            goto L_0x0112
        L_0x00d1:
            java.lang.String r15 = "AFTEU011"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00da
            goto L_0x00ab
        L_0x00da:
            r15 = r6
            goto L_0x0112
        L_0x00dc:
            java.lang.String r15 = "AFTR"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00e5
            goto L_0x00ab
        L_0x00e5:
            r15 = r7
            goto L_0x0112
        L_0x00e7:
            java.lang.String r15 = "AFTN"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00f0
            goto L_0x00ab
        L_0x00f0:
            r15 = r8
            goto L_0x0112
        L_0x00f2:
            java.lang.String r15 = "AFTA"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00fb
            goto L_0x00ab
        L_0x00fb:
            r15 = r9
            goto L_0x0112
        L_0x00fd:
            java.lang.String r15 = "AFTKMST12"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x0106
            goto L_0x00ab
        L_0x0106:
            r15 = r11
            goto L_0x0112
        L_0x0108:
            java.lang.String r15 = "AFTJMST12"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x0111
            goto L_0x00ab
        L_0x0111:
            r15 = r13
        L_0x0112:
            switch(r15) {
                case 0: goto L_0x008f;
                case 1: goto L_0x008f;
                case 2: goto L_0x008f;
                case 3: goto L_0x008f;
                case 4: goto L_0x008f;
                case 5: goto L_0x008f;
                case 6: goto L_0x008f;
                case 7: goto L_0x008f;
                case 8: goto L_0x008f;
                default: goto L_0x0115;
            }
        L_0x0115:
            if (r14 > r0) goto L_0x08b9
            java.lang.String r14 = defpackage.v0g.b     // Catch:{ all -> 0x08be }
            r14.getClass()     // Catch:{ all -> 0x08be }
            int r15 = r14.hashCode()
            switch(r15) {
                case -2144781245: goto L_0x08a3;
                case -2144781185: goto L_0x0897;
                case -2144781160: goto L_0x088b;
                case -2097309513: goto L_0x087f;
                case -2022874474: goto L_0x0873;
                case -1978993182: goto L_0x0867;
                case -1978990237: goto L_0x085b;
                case -1936688988: goto L_0x084f;
                case -1936688066: goto L_0x0841;
                case -1936688065: goto L_0x0833;
                case -1931988508: goto L_0x0825;
                case -1885099851: goto L_0x0817;
                case -1696512866: goto L_0x0809;
                case -1680025915: goto L_0x07fb;
                case -1615810839: goto L_0x07ed;
                case -1600724499: goto L_0x07df;
                case -1554255044: goto L_0x07d1;
                case -1481772737: goto L_0x07c3;
                case -1481772730: goto L_0x07b5;
                case -1481772729: goto L_0x07a7;
                case -1320080169: goto L_0x0799;
                case -1217592143: goto L_0x078b;
                case -1180384755: goto L_0x077d;
                case -1139198265: goto L_0x076f;
                case -1052835013: goto L_0x0761;
                case -993250464: goto L_0x0753;
                case -993250458: goto L_0x0749;
                case -965403638: goto L_0x073c;
                case -958336948: goto L_0x072f;
                case -879245230: goto L_0x0721;
                case -842500323: goto L_0x0713;
                case -821392978: goto L_0x0705;
                case -797483286: goto L_0x06f7;
                case -794946968: goto L_0x06e9;
                case -788334647: goto L_0x06db;
                case -782144577: goto L_0x06cd;
                case -575125681: goto L_0x06bf;
                case -521118391: goto L_0x06b1;
                case -430914369: goto L_0x06a3;
                case -290434366: goto L_0x0695;
                case -282781963: goto L_0x0687;
                case -277133239: goto L_0x0679;
                case -173639913: goto L_0x066b;
                case -56598463: goto L_0x065d;
                case 2126: goto L_0x064f;
                case 2564: goto L_0x0641;
                case 2715: goto L_0x0633;
                case 2719: goto L_0x0625;
                case 3091: goto L_0x0617;
                case 3483: goto L_0x0609;
                case 73405: goto L_0x05fb;
                case 75537: goto L_0x05ed;
                case 75739: goto L_0x05df;
                case 76779: goto L_0x05d1;
                case 78669: goto L_0x05c3;
                case 79305: goto L_0x05b5;
                case 80618: goto L_0x05a7;
                case 88274: goto L_0x0599;
                case 98846: goto L_0x058b;
                case 98848: goto L_0x057d;
                case 99329: goto L_0x056f;
                case 101481: goto L_0x0561;
                case 1513190: goto L_0x0553;
                case 1514184: goto L_0x0545;
                case 1514185: goto L_0x0537;
                case 2133089: goto L_0x0529;
                case 2133091: goto L_0x051b;
                case 2133120: goto L_0x050d;
                case 2133151: goto L_0x04ff;
                case 2133182: goto L_0x04f1;
                case 2133184: goto L_0x04e3;
                case 2436959: goto L_0x04d5;
                case 2463773: goto L_0x04c7;
                case 2464648: goto L_0x04b9;
                case 2689555: goto L_0x04ab;
                case 3154429: goto L_0x049d;
                case 3284551: goto L_0x048f;
                case 3351335: goto L_0x0481;
                case 3386211: goto L_0x0473;
                case 41325051: goto L_0x0465;
                case 51349633: goto L_0x0457;
                case 51350594: goto L_0x0449;
                case 55178625: goto L_0x043b;
                case 61542055: goto L_0x042d;
                case 65355429: goto L_0x041f;
                case 66214468: goto L_0x0411;
                case 66214470: goto L_0x0403;
                case 66214473: goto L_0x03f5;
                case 66215429: goto L_0x03e7;
                case 66215431: goto L_0x03d9;
                case 66215433: goto L_0x03cb;
                case 66216390: goto L_0x03bd;
                case 76402249: goto L_0x03af;
                case 76404105: goto L_0x03a1;
                case 76404911: goto L_0x0393;
                case 80963634: goto L_0x0385;
                case 82882791: goto L_0x0377;
                case 98715550: goto L_0x0369;
                case 101370885: goto L_0x035b;
                case 102844228: goto L_0x034d;
                case 165221241: goto L_0x033f;
                case 182191441: goto L_0x0331;
                case 245388979: goto L_0x0323;
                case 287431619: goto L_0x0315;
                case 307593612: goto L_0x0307;
                case 308517133: goto L_0x02f9;
                case 316215098: goto L_0x02eb;
                case 316215116: goto L_0x02dd;
                case 316246811: goto L_0x02cf;
                case 316246818: goto L_0x02c1;
                case 407160593: goto L_0x02b3;
                case 507412548: goto L_0x02a5;
                case 793982701: goto L_0x0297;
                case 794038622: goto L_0x0289;
                case 794040393: goto L_0x027b;
                case 835649806: goto L_0x026d;
                case 917340916: goto L_0x025f;
                case 958008161: goto L_0x0251;
                case 1060579533: goto L_0x0243;
                case 1150207623: goto L_0x0235;
                case 1176899427: goto L_0x0227;
                case 1280332038: goto L_0x0219;
                case 1306947716: goto L_0x020b;
                case 1349174697: goto L_0x01fd;
                case 1522194893: goto L_0x01ef;
                case 1691543273: goto L_0x01e1;
                case 1691544261: goto L_0x01d3;
                case 1709443163: goto L_0x01c5;
                case 1865889110: goto L_0x01b7;
                case 1906253259: goto L_0x01a9;
                case 1977196784: goto L_0x019b;
                case 2006372676: goto L_0x018e;
                case 2019281702: goto L_0x0181;
                case 2029784656: goto L_0x0174;
                case 2030379515: goto L_0x0167;
                case 2033393791: goto L_0x015a;
                case 2047190025: goto L_0x014d;
                case 2047252157: goto L_0x0140;
                case 2048319463: goto L_0x0133;
                case 2048855701: goto L_0x0126;
                default: goto L_0x0123;
            }
        L_0x0123:
            r0 = r10
            goto L_0x08ae
        L_0x0126:
            java.lang.String r0 = "HWWAS-H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x012f
            goto L_0x0123
        L_0x012f:
            r0 = 139(0x8b, float:1.95E-43)
            goto L_0x08ae
        L_0x0133:
            java.lang.String r0 = "HWVNS-H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x0123
        L_0x013c:
            r0 = 138(0x8a, float:1.93E-43)
            goto L_0x08ae
        L_0x0140:
            java.lang.String r0 = "ELUGA_Prim"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0149
            goto L_0x0123
        L_0x0149:
            r0 = 137(0x89, float:1.92E-43)
            goto L_0x08ae
        L_0x014d:
            java.lang.String r0 = "ELUGA_Note"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0156
            goto L_0x0123
        L_0x0156:
            r0 = 136(0x88, float:1.9E-43)
            goto L_0x08ae
        L_0x015a:
            java.lang.String r0 = "ASUS_X00AD_2"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0163
            goto L_0x0123
        L_0x0163:
            r0 = 135(0x87, float:1.89E-43)
            goto L_0x08ae
        L_0x0167:
            java.lang.String r0 = "HWCAM-H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0170
            goto L_0x0123
        L_0x0170:
            r0 = 134(0x86, float:1.88E-43)
            goto L_0x08ae
        L_0x0174:
            java.lang.String r0 = "HWBLN-H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x017d
            goto L_0x0123
        L_0x017d:
            r0 = 133(0x85, float:1.86E-43)
            goto L_0x08ae
        L_0x0181:
            java.lang.String r0 = "DM-01K"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x018a
            goto L_0x0123
        L_0x018a:
            r0 = 132(0x84, float:1.85E-43)
            goto L_0x08ae
        L_0x018e:
            java.lang.String r0 = "BRAVIA_ATV3_4K"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0197
            goto L_0x0123
        L_0x0197:
            r0 = 131(0x83, float:1.84E-43)
            goto L_0x08ae
        L_0x019b:
            java.lang.String r0 = "Infinix-X572"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01a5
            goto L_0x0123
        L_0x01a5:
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x08ae
        L_0x01a9:
            java.lang.String r0 = "PB2-670M"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01b3
            goto L_0x0123
        L_0x01b3:
            r0 = 129(0x81, float:1.81E-43)
            goto L_0x08ae
        L_0x01b7:
            java.lang.String r0 = "santoni"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01c1
            goto L_0x0123
        L_0x01c1:
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x08ae
        L_0x01c5:
            java.lang.String r0 = "iball8735_9806"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01cf
            goto L_0x0123
        L_0x01cf:
            r0 = 127(0x7f, float:1.78E-43)
            goto L_0x08ae
        L_0x01d3:
            java.lang.String r0 = "CPH1715"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01dd
            goto L_0x0123
        L_0x01dd:
            r0 = 126(0x7e, float:1.77E-43)
            goto L_0x08ae
        L_0x01e1:
            java.lang.String r0 = "CPH1609"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01eb
            goto L_0x0123
        L_0x01eb:
            r0 = 125(0x7d, float:1.75E-43)
            goto L_0x08ae
        L_0x01ef:
            java.lang.String r0 = "woods_f"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01f9
            goto L_0x0123
        L_0x01f9:
            r0 = 124(0x7c, float:1.74E-43)
            goto L_0x08ae
        L_0x01fd:
            java.lang.String r0 = "htc_e56ml_dtul"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0207
            goto L_0x0123
        L_0x0207:
            r0 = 123(0x7b, float:1.72E-43)
            goto L_0x08ae
        L_0x020b:
            java.lang.String r0 = "EverStar_S"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0215
            goto L_0x0123
        L_0x0215:
            r0 = 122(0x7a, float:1.71E-43)
            goto L_0x08ae
        L_0x0219:
            java.lang.String r0 = "hwALE-H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0223
            goto L_0x0123
        L_0x0223:
            r0 = 121(0x79, float:1.7E-43)
            goto L_0x08ae
        L_0x0227:
            java.lang.String r0 = "itel_S41"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0231
            goto L_0x0123
        L_0x0231:
            r0 = 120(0x78, float:1.68E-43)
            goto L_0x08ae
        L_0x0235:
            java.lang.String r0 = "LS-5017"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x023f
            goto L_0x0123
        L_0x023f:
            r0 = 119(0x77, float:1.67E-43)
            goto L_0x08ae
        L_0x0243:
            java.lang.String r0 = "panell_d"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x024d
            goto L_0x0123
        L_0x024d:
            r0 = 118(0x76, float:1.65E-43)
            goto L_0x08ae
        L_0x0251:
            java.lang.String r0 = "j2xlteins"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x025b
            goto L_0x0123
        L_0x025b:
            r0 = 117(0x75, float:1.64E-43)
            goto L_0x08ae
        L_0x025f:
            java.lang.String r0 = "A7000plus"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0269
            goto L_0x0123
        L_0x0269:
            r0 = 116(0x74, float:1.63E-43)
            goto L_0x08ae
        L_0x026d:
            java.lang.String r0 = "manning"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0277
            goto L_0x0123
        L_0x0277:
            r0 = 115(0x73, float:1.61E-43)
            goto L_0x08ae
        L_0x027b:
            java.lang.String r0 = "GIONEE_WBL7519"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0285
            goto L_0x0123
        L_0x0285:
            r0 = 114(0x72, float:1.6E-43)
            goto L_0x08ae
        L_0x0289:
            java.lang.String r0 = "GIONEE_WBL7365"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0293
            goto L_0x0123
        L_0x0293:
            r0 = 113(0x71, float:1.58E-43)
            goto L_0x08ae
        L_0x0297:
            java.lang.String r0 = "GIONEE_WBL5708"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02a1
            goto L_0x0123
        L_0x02a1:
            r0 = 112(0x70, float:1.57E-43)
            goto L_0x08ae
        L_0x02a5:
            java.lang.String r0 = "QM16XE_U"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02af
            goto L_0x0123
        L_0x02af:
            r0 = 111(0x6f, float:1.56E-43)
            goto L_0x08ae
        L_0x02b3:
            java.lang.String r0 = "Pixi5-10_4G"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02bd
            goto L_0x0123
        L_0x02bd:
            r0 = 110(0x6e, float:1.54E-43)
            goto L_0x08ae
        L_0x02c1:
            java.lang.String r0 = "TB3-850M"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02cb
            goto L_0x0123
        L_0x02cb:
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x08ae
        L_0x02cf:
            java.lang.String r0 = "TB3-850F"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02d9
            goto L_0x0123
        L_0x02d9:
            r0 = 108(0x6c, float:1.51E-43)
            goto L_0x08ae
        L_0x02dd:
            java.lang.String r0 = "TB3-730X"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02e7
            goto L_0x0123
        L_0x02e7:
            r0 = 107(0x6b, float:1.5E-43)
            goto L_0x08ae
        L_0x02eb:
            java.lang.String r0 = "TB3-730F"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02f5
            goto L_0x0123
        L_0x02f5:
            r0 = 106(0x6a, float:1.49E-43)
            goto L_0x08ae
        L_0x02f9:
            java.lang.String r0 = "A7020a48"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0303
            goto L_0x0123
        L_0x0303:
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x08ae
        L_0x0307:
            java.lang.String r0 = "A7010a48"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0311
            goto L_0x0123
        L_0x0311:
            r0 = 104(0x68, float:1.46E-43)
            goto L_0x08ae
        L_0x0315:
            java.lang.String r0 = "griffin"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x031f
            goto L_0x0123
        L_0x031f:
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x08ae
        L_0x0323:
            java.lang.String r0 = "marino_f"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x032d
            goto L_0x0123
        L_0x032d:
            r0 = 102(0x66, float:1.43E-43)
            goto L_0x08ae
        L_0x0331:
            java.lang.String r0 = "CPY83_I00"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x033b
            goto L_0x0123
        L_0x033b:
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x08ae
        L_0x033f:
            java.lang.String r0 = "A2016a40"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0349
            goto L_0x0123
        L_0x0349:
            r0 = 100
            goto L_0x08ae
        L_0x034d:
            java.lang.String r0 = "le_x6"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0357
            goto L_0x0123
        L_0x0357:
            r0 = 99
            goto L_0x08ae
        L_0x035b:
            java.lang.String r0 = "l5460"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0365
            goto L_0x0123
        L_0x0365:
            r0 = 98
            goto L_0x08ae
        L_0x0369:
            java.lang.String r0 = "i9031"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0373
            goto L_0x0123
        L_0x0373:
            r0 = 97
            goto L_0x08ae
        L_0x0377:
            java.lang.String r0 = "X3_HK"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0381
            goto L_0x0123
        L_0x0381:
            r0 = 96
            goto L_0x08ae
        L_0x0385:
            java.lang.String r0 = "V23GB"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x038f
            goto L_0x0123
        L_0x038f:
            r0 = 95
            goto L_0x08ae
        L_0x0393:
            java.lang.String r0 = "Q4310"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x039d
            goto L_0x0123
        L_0x039d:
            r0 = 94
            goto L_0x08ae
        L_0x03a1:
            java.lang.String r0 = "Q4260"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03ab
            goto L_0x0123
        L_0x03ab:
            r0 = 93
            goto L_0x08ae
        L_0x03af:
            java.lang.String r0 = "PRO7S"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03b9
            goto L_0x0123
        L_0x03b9:
            r0 = 92
            goto L_0x08ae
        L_0x03bd:
            java.lang.String r0 = "F3311"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03c7
            goto L_0x0123
        L_0x03c7:
            r0 = 91
            goto L_0x08ae
        L_0x03cb:
            java.lang.String r0 = "F3215"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03d5
            goto L_0x0123
        L_0x03d5:
            r0 = 90
            goto L_0x08ae
        L_0x03d9:
            java.lang.String r0 = "F3213"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03e3
            goto L_0x0123
        L_0x03e3:
            r0 = 89
            goto L_0x08ae
        L_0x03e7:
            java.lang.String r0 = "F3211"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03f1
            goto L_0x0123
        L_0x03f1:
            r0 = 88
            goto L_0x08ae
        L_0x03f5:
            java.lang.String r0 = "F3116"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03ff
            goto L_0x0123
        L_0x03ff:
            r0 = 87
            goto L_0x08ae
        L_0x0403:
            java.lang.String r0 = "F3113"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x040d
            goto L_0x0123
        L_0x040d:
            r0 = 86
            goto L_0x08ae
        L_0x0411:
            java.lang.String r0 = "F3111"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x041b
            goto L_0x0123
        L_0x041b:
            r0 = 85
            goto L_0x08ae
        L_0x041f:
            java.lang.String r0 = "E5643"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0429
            goto L_0x0123
        L_0x0429:
            r0 = 84
            goto L_0x08ae
        L_0x042d:
            java.lang.String r0 = "A1601"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0437
            goto L_0x0123
        L_0x0437:
            r0 = 83
            goto L_0x08ae
        L_0x043b:
            java.lang.String r0 = "Aura_Note_2"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0445
            goto L_0x0123
        L_0x0445:
            r0 = 82
            goto L_0x08ae
        L_0x0449:
            java.lang.String r0 = "602LV"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0453
            goto L_0x0123
        L_0x0453:
            r0 = 81
            goto L_0x08ae
        L_0x0457:
            java.lang.String r0 = "601LV"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0461
            goto L_0x0123
        L_0x0461:
            r0 = 80
            goto L_0x08ae
        L_0x0465:
            java.lang.String r0 = "MEIZU_M5"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x046f
            goto L_0x0123
        L_0x046f:
            r0 = 79
            goto L_0x08ae
        L_0x0473:
            java.lang.String r0 = "p212"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x047d
            goto L_0x0123
        L_0x047d:
            r0 = 78
            goto L_0x08ae
        L_0x0481:
            java.lang.String r0 = "mido"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x048b
            goto L_0x0123
        L_0x048b:
            r0 = 77
            goto L_0x08ae
        L_0x048f:
            java.lang.String r0 = "kate"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0499
            goto L_0x0123
        L_0x0499:
            r0 = 76
            goto L_0x08ae
        L_0x049d:
            java.lang.String r0 = "fugu"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04a7
            goto L_0x0123
        L_0x04a7:
            r0 = 75
            goto L_0x08ae
        L_0x04ab:
            java.lang.String r0 = "XE2X"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04b5
            goto L_0x0123
        L_0x04b5:
            r0 = 74
            goto L_0x08ae
        L_0x04b9:
            java.lang.String r0 = "Q427"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04c3
            goto L_0x0123
        L_0x04c3:
            r0 = 73
            goto L_0x08ae
        L_0x04c7:
            java.lang.String r0 = "Q350"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04d1
            goto L_0x0123
        L_0x04d1:
            r0 = 72
            goto L_0x08ae
        L_0x04d5:
            java.lang.String r0 = "P681"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04df
            goto L_0x0123
        L_0x04df:
            r0 = 71
            goto L_0x08ae
        L_0x04e3:
            java.lang.String r0 = "F04J"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04ed
            goto L_0x0123
        L_0x04ed:
            r0 = 70
            goto L_0x08ae
        L_0x04f1:
            java.lang.String r0 = "F04H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04fb
            goto L_0x0123
        L_0x04fb:
            r0 = 69
            goto L_0x08ae
        L_0x04ff:
            java.lang.String r0 = "F03H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0509
            goto L_0x0123
        L_0x0509:
            r0 = 68
            goto L_0x08ae
        L_0x050d:
            java.lang.String r0 = "F02H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0517
            goto L_0x0123
        L_0x0517:
            r0 = 67
            goto L_0x08ae
        L_0x051b:
            java.lang.String r0 = "F01J"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0525
            goto L_0x0123
        L_0x0525:
            r0 = 66
            goto L_0x08ae
        L_0x0529:
            java.lang.String r0 = "F01H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0533
            goto L_0x0123
        L_0x0533:
            r0 = 65
            goto L_0x08ae
        L_0x0537:
            java.lang.String r0 = "1714"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0541
            goto L_0x0123
        L_0x0541:
            r0 = 64
            goto L_0x08ae
        L_0x0545:
            java.lang.String r0 = "1713"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x054f
            goto L_0x0123
        L_0x054f:
            r0 = 63
            goto L_0x08ae
        L_0x0553:
            java.lang.String r0 = "1601"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x055d
            goto L_0x0123
        L_0x055d:
            r0 = 62
            goto L_0x08ae
        L_0x0561:
            java.lang.String r0 = "flo"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x056b
            goto L_0x0123
        L_0x056b:
            r0 = 61
            goto L_0x08ae
        L_0x056f:
            java.lang.String r0 = "deb"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0579
            goto L_0x0123
        L_0x0579:
            r0 = 60
            goto L_0x08ae
        L_0x057d:
            java.lang.String r0 = "cv3"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0587
            goto L_0x0123
        L_0x0587:
            r0 = 59
            goto L_0x08ae
        L_0x058b:
            java.lang.String r0 = "cv1"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0595
            goto L_0x0123
        L_0x0595:
            r0 = 58
            goto L_0x08ae
        L_0x0599:
            java.lang.String r0 = "Z80"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05a3
            goto L_0x0123
        L_0x05a3:
            r0 = 57
            goto L_0x08ae
        L_0x05a7:
            java.lang.String r0 = "QX1"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05b1
            goto L_0x0123
        L_0x05b1:
            r0 = 56
            goto L_0x08ae
        L_0x05b5:
            java.lang.String r0 = "PLE"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05bf
            goto L_0x0123
        L_0x05bf:
            r0 = 55
            goto L_0x08ae
        L_0x05c3:
            java.lang.String r0 = "P85"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05cd
            goto L_0x0123
        L_0x05cd:
            r0 = 54
            goto L_0x08ae
        L_0x05d1:
            java.lang.String r0 = "MX6"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05db
            goto L_0x0123
        L_0x05db:
            r0 = 53
            goto L_0x08ae
        L_0x05df:
            java.lang.String r0 = "M5c"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05e9
            goto L_0x0123
        L_0x05e9:
            r0 = 52
            goto L_0x08ae
        L_0x05ed:
            java.lang.String r0 = "M04"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05f7
            goto L_0x0123
        L_0x05f7:
            r0 = 51
            goto L_0x08ae
        L_0x05fb:
            java.lang.String r0 = "JGZ"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0605
            goto L_0x0123
        L_0x0605:
            r0 = 50
            goto L_0x08ae
        L_0x0609:
            java.lang.String r0 = "mh"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0613
            goto L_0x0123
        L_0x0613:
            r0 = 49
            goto L_0x08ae
        L_0x0617:
            java.lang.String r0 = "b5"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0621
            goto L_0x0123
        L_0x0621:
            r0 = 48
            goto L_0x08ae
        L_0x0625:
            java.lang.String r0 = "V5"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x062f
            goto L_0x0123
        L_0x062f:
            r0 = 47
            goto L_0x08ae
        L_0x0633:
            java.lang.String r0 = "V1"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x063d
            goto L_0x0123
        L_0x063d:
            r0 = 46
            goto L_0x08ae
        L_0x0641:
            java.lang.String r0 = "Q5"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x064b
            goto L_0x0123
        L_0x064b:
            r0 = 45
            goto L_0x08ae
        L_0x064f:
            java.lang.String r0 = "C1"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0659
            goto L_0x0123
        L_0x0659:
            r0 = 44
            goto L_0x08ae
        L_0x065d:
            java.lang.String r0 = "woods_fn"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0667
            goto L_0x0123
        L_0x0667:
            r0 = 43
            goto L_0x08ae
        L_0x066b:
            java.lang.String r0 = "ELUGA_A3_Pro"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0675
            goto L_0x0123
        L_0x0675:
            r0 = 42
            goto L_0x08ae
        L_0x0679:
            java.lang.String r0 = "Z12_PRO"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0683
            goto L_0x0123
        L_0x0683:
            r0 = 41
            goto L_0x08ae
        L_0x0687:
            java.lang.String r0 = "BLACK-1X"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0691
            goto L_0x0123
        L_0x0691:
            r0 = 40
            goto L_0x08ae
        L_0x0695:
            java.lang.String r0 = "taido_row"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x069f
            goto L_0x0123
        L_0x069f:
            r0 = 39
            goto L_0x08ae
        L_0x06a3:
            java.lang.String r0 = "Pixi4-7_3G"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06ad
            goto L_0x0123
        L_0x06ad:
            r0 = 38
            goto L_0x08ae
        L_0x06b1:
            java.lang.String r0 = "GIONEE_GBL7360"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06bb
            goto L_0x0123
        L_0x06bb:
            r0 = 37
            goto L_0x08ae
        L_0x06bf:
            java.lang.String r0 = "GiONEE_CBL7513"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06c9
            goto L_0x0123
        L_0x06c9:
            r0 = 36
            goto L_0x08ae
        L_0x06cd:
            java.lang.String r0 = "OnePlus5T"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06d7
            goto L_0x0123
        L_0x06d7:
            r0 = 35
            goto L_0x08ae
        L_0x06db:
            java.lang.String r0 = "whyred"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06e5
            goto L_0x0123
        L_0x06e5:
            r0 = 34
            goto L_0x08ae
        L_0x06e9:
            java.lang.String r0 = "watson"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06f3
            goto L_0x0123
        L_0x06f3:
            r0 = 33
            goto L_0x08ae
        L_0x06f7:
            java.lang.String r0 = "SVP-DTV15"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0701
            goto L_0x0123
        L_0x0701:
            r0 = 32
            goto L_0x08ae
        L_0x0705:
            java.lang.String r0 = "A7000-a"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x070f
            goto L_0x0123
        L_0x070f:
            r0 = 31
            goto L_0x08ae
        L_0x0713:
            java.lang.String r0 = "nicklaus_f"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x071d
            goto L_0x0123
        L_0x071d:
            r0 = 30
            goto L_0x08ae
        L_0x0721:
            java.lang.String r0 = "tcl_eu"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x072b
            goto L_0x0123
        L_0x072b:
            r0 = 29
            goto L_0x08ae
        L_0x072f:
            java.lang.String r0 = "ELUGA_Ray_X"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0739
            goto L_0x0123
        L_0x0739:
            r0 = r3
            goto L_0x08ae
        L_0x073c:
            java.lang.String r0 = "s905x018"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0746
            goto L_0x0123
        L_0x0746:
            r0 = r2
            goto L_0x08ae
        L_0x0749:
            java.lang.String r2 = "A10-70L"
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L_0x08ae
            goto L_0x0123
        L_0x0753:
            java.lang.String r0 = "A10-70F"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x075d
            goto L_0x0123
        L_0x075d:
            r0 = 25
            goto L_0x08ae
        L_0x0761:
            java.lang.String r0 = "namath"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x076b
            goto L_0x0123
        L_0x076b:
            r0 = 24
            goto L_0x08ae
        L_0x076f:
            java.lang.String r0 = "Slate_Pro"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0779
            goto L_0x0123
        L_0x0779:
            r0 = 23
            goto L_0x08ae
        L_0x077d:
            java.lang.String r0 = "iris60"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0787
            goto L_0x0123
        L_0x0787:
            r0 = 22
            goto L_0x08ae
        L_0x078b:
            java.lang.String r0 = "BRAVIA_ATV2"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0795
            goto L_0x0123
        L_0x0795:
            r0 = 21
            goto L_0x08ae
        L_0x0799:
            java.lang.String r0 = "GiONEE_GBL7319"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07a3
            goto L_0x0123
        L_0x07a3:
            r0 = 20
            goto L_0x08ae
        L_0x07a7:
            java.lang.String r0 = "panell_dt"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07b1
            goto L_0x0123
        L_0x07b1:
            r0 = 19
            goto L_0x08ae
        L_0x07b5:
            java.lang.String r0 = "panell_ds"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07bf
            goto L_0x0123
        L_0x07bf:
            r0 = 18
            goto L_0x08ae
        L_0x07c3:
            java.lang.String r0 = "panell_dl"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07cd
            goto L_0x0123
        L_0x07cd:
            r0 = 17
            goto L_0x08ae
        L_0x07d1:
            java.lang.String r0 = "vernee_M5"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07db
            goto L_0x0123
        L_0x07db:
            r0 = 16
            goto L_0x08ae
        L_0x07df:
            java.lang.String r0 = "pacificrim"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07e9
            goto L_0x0123
        L_0x07e9:
            r0 = 15
            goto L_0x08ae
        L_0x07ed:
            java.lang.String r0 = "Phantom6"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07f7
            goto L_0x0123
        L_0x07f7:
            r0 = 14
            goto L_0x08ae
        L_0x07fb:
            java.lang.String r0 = "ComioS1"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0805
            goto L_0x0123
        L_0x0805:
            r0 = 13
            goto L_0x08ae
        L_0x0809:
            java.lang.String r0 = "XT1663"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0813
            goto L_0x0123
        L_0x0813:
            r0 = 12
            goto L_0x08ae
        L_0x0817:
            java.lang.String r0 = "RAIJIN"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0821
            goto L_0x0123
        L_0x0821:
            r0 = 11
            goto L_0x08ae
        L_0x0825:
            java.lang.String r0 = "AquaPowerM"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x082f
            goto L_0x0123
        L_0x082f:
            r0 = 10
            goto L_0x08ae
        L_0x0833:
            java.lang.String r0 = "PGN611"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x083d
            goto L_0x0123
        L_0x083d:
            r0 = 9
            goto L_0x08ae
        L_0x0841:
            java.lang.String r0 = "PGN610"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x084b
            goto L_0x0123
        L_0x084b:
            r0 = 8
            goto L_0x08ae
        L_0x084f:
            java.lang.String r0 = "PGN528"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0859
            goto L_0x0123
        L_0x0859:
            r0 = r4
            goto L_0x08ae
        L_0x085b:
            java.lang.String r0 = "NX573J"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0865
            goto L_0x0123
        L_0x0865:
            r0 = r5
            goto L_0x08ae
        L_0x0867:
            java.lang.String r0 = "NX541J"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0871
            goto L_0x0123
        L_0x0871:
            r0 = r6
            goto L_0x08ae
        L_0x0873:
            java.lang.String r0 = "CP8676_I02"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x087d
            goto L_0x0123
        L_0x087d:
            r0 = r7
            goto L_0x08ae
        L_0x087f:
            java.lang.String r0 = "K50a40"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0889
            goto L_0x0123
        L_0x0889:
            r0 = r8
            goto L_0x08ae
        L_0x088b:
            java.lang.String r0 = "GIONEE_SWW1631"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0895
            goto L_0x0123
        L_0x0895:
            r0 = r9
            goto L_0x08ae
        L_0x0897:
            java.lang.String r0 = "GIONEE_SWW1627"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x08a1
            goto L_0x0123
        L_0x08a1:
            r0 = r11
            goto L_0x08ae
        L_0x08a3:
            java.lang.String r0 = "GIONEE_SWW1609"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x08ad
            goto L_0x0123
        L_0x08ad:
            r0 = r13
        L_0x08ae:
            switch(r0) {
                case 0: goto L_0x008f;
                case 1: goto L_0x008f;
                case 2: goto L_0x008f;
                case 3: goto L_0x008f;
                case 4: goto L_0x008f;
                case 5: goto L_0x008f;
                case 6: goto L_0x008f;
                case 7: goto L_0x008f;
                case 8: goto L_0x008f;
                case 9: goto L_0x008f;
                case 10: goto L_0x008f;
                case 11: goto L_0x008f;
                case 12: goto L_0x008f;
                case 13: goto L_0x008f;
                case 14: goto L_0x008f;
                case 15: goto L_0x008f;
                case 16: goto L_0x008f;
                case 17: goto L_0x008f;
                case 18: goto L_0x008f;
                case 19: goto L_0x008f;
                case 20: goto L_0x008f;
                case 21: goto L_0x008f;
                case 22: goto L_0x008f;
                case 23: goto L_0x008f;
                case 24: goto L_0x008f;
                case 25: goto L_0x008f;
                case 26: goto L_0x008f;
                case 27: goto L_0x008f;
                case 28: goto L_0x008f;
                case 29: goto L_0x008f;
                case 30: goto L_0x008f;
                case 31: goto L_0x008f;
                case 32: goto L_0x008f;
                case 33: goto L_0x008f;
                case 34: goto L_0x008f;
                case 35: goto L_0x008f;
                case 36: goto L_0x008f;
                case 37: goto L_0x008f;
                case 38: goto L_0x008f;
                case 39: goto L_0x008f;
                case 40: goto L_0x008f;
                case 41: goto L_0x008f;
                case 42: goto L_0x008f;
                case 43: goto L_0x008f;
                case 44: goto L_0x008f;
                case 45: goto L_0x008f;
                case 46: goto L_0x008f;
                case 47: goto L_0x008f;
                case 48: goto L_0x008f;
                case 49: goto L_0x008f;
                case 50: goto L_0x008f;
                case 51: goto L_0x008f;
                case 52: goto L_0x008f;
                case 53: goto L_0x008f;
                case 54: goto L_0x008f;
                case 55: goto L_0x008f;
                case 56: goto L_0x008f;
                case 57: goto L_0x008f;
                case 58: goto L_0x008f;
                case 59: goto L_0x008f;
                case 60: goto L_0x008f;
                case 61: goto L_0x008f;
                case 62: goto L_0x008f;
                case 63: goto L_0x008f;
                case 64: goto L_0x008f;
                case 65: goto L_0x008f;
                case 66: goto L_0x008f;
                case 67: goto L_0x008f;
                case 68: goto L_0x008f;
                case 69: goto L_0x008f;
                case 70: goto L_0x008f;
                case 71: goto L_0x008f;
                case 72: goto L_0x008f;
                case 73: goto L_0x008f;
                case 74: goto L_0x008f;
                case 75: goto L_0x008f;
                case 76: goto L_0x008f;
                case 77: goto L_0x008f;
                case 78: goto L_0x008f;
                case 79: goto L_0x008f;
                case 80: goto L_0x008f;
                case 81: goto L_0x008f;
                case 82: goto L_0x008f;
                case 83: goto L_0x008f;
                case 84: goto L_0x008f;
                case 85: goto L_0x008f;
                case 86: goto L_0x008f;
                case 87: goto L_0x008f;
                case 88: goto L_0x008f;
                case 89: goto L_0x008f;
                case 90: goto L_0x008f;
                case 91: goto L_0x008f;
                case 92: goto L_0x008f;
                case 93: goto L_0x008f;
                case 94: goto L_0x008f;
                case 95: goto L_0x008f;
                case 96: goto L_0x008f;
                case 97: goto L_0x008f;
                case 98: goto L_0x008f;
                case 99: goto L_0x008f;
                case 100: goto L_0x008f;
                case 101: goto L_0x008f;
                case 102: goto L_0x008f;
                case 103: goto L_0x008f;
                case 104: goto L_0x008f;
                case 105: goto L_0x008f;
                case 106: goto L_0x008f;
                case 107: goto L_0x008f;
                case 108: goto L_0x008f;
                case 109: goto L_0x008f;
                case 110: goto L_0x008f;
                case 111: goto L_0x008f;
                case 112: goto L_0x008f;
                case 113: goto L_0x008f;
                case 114: goto L_0x008f;
                case 115: goto L_0x008f;
                case 116: goto L_0x008f;
                case 117: goto L_0x008f;
                case 118: goto L_0x008f;
                case 119: goto L_0x008f;
                case 120: goto L_0x008f;
                case 121: goto L_0x008f;
                case 122: goto L_0x008f;
                case 123: goto L_0x008f;
                case 124: goto L_0x008f;
                case 125: goto L_0x008f;
                case 126: goto L_0x008f;
                case 127: goto L_0x008f;
                case 128: goto L_0x008f;
                case 129: goto L_0x008f;
                case 130: goto L_0x008f;
                case 131: goto L_0x008f;
                case 132: goto L_0x008f;
                case 133: goto L_0x008f;
                case 134: goto L_0x008f;
                case 135: goto L_0x008f;
                case 136: goto L_0x008f;
                case 137: goto L_0x008f;
                case 138: goto L_0x008f;
                case 139: goto L_0x008f;
                default: goto L_0x08b1;
            }
        L_0x08b1:
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008f
        L_0x08b9:
            w2 = r13     // Catch:{ all -> 0x08be }
            v2 = r11     // Catch:{ all -> 0x08be }
            goto L_0x08c0
        L_0x08be:
            r0 = move-exception
            goto L_0x08c4
        L_0x08c0:
            monitor-exit(r12)     // Catch:{ all -> 0x08be }
            boolean r0 = w2
            return r0
        L_0x08c4:
            monitor-exit(r12)     // Catch:{ all -> 0x08be }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo8.z0(java.lang.String):boolean");
    }

    public final void C(float f, float f3) {
        super.C(f, f3);
        ed3 ed3 = this.Y1;
        if (ed3 != null) {
            g6g g6g = ed3.q.o;
            g6g.getClass();
            n79.g(f > c44.DEFAULT_ASPECT_RATIO);
            y5g y5g = g6g.b;
            if (f != y5g.k) {
                y5g.k = f;
                f6g f6g = y5g.b;
                f6g.g = f;
                f6g.k = 0;
                f6g.n = -1;
                f6g.l = -1;
                f6g.d(false);
                return;
            }
            return;
        }
        y5g y5g2 = this.T1;
        if (f != y5g2.k) {
            y5g2.k = f;
            f6g f6g2 = y5g2.b;
            f6g2.g = f;
            f6g2.k = 0;
            f6g2.n = -1;
            f6g2.l = -1;
            f6g2.d(false);
        }
    }

    public final void D0() {
        if (this.h2 > 0) {
            this.x.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.g2;
            int i = this.h2;
            m8g m8g = this.Q1;
            Handler handler = (Handler) m8g.a;
            if (handler != null) {
                handler.post(new i8g(m8g, i, j, 1));
            }
            this.h2 = 0;
            this.g2 = elapsedRealtime;
        }
    }

    public final void E0(v8g v8g) {
        if (!v8g.equals(v8g.e) && !v8g.equals(this.o2)) {
            this.o2 = v8g;
            this.Q1.c(v8g);
        }
    }

    public final void F0() {
        int i;
        in8 in8;
        if (this.q2 && (i = v0g.a) >= 23 && (in8 = this.U0) != null) {
            this.s2 = new ho8(this, in8);
            if (i >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                in8.setParameters(bundle);
            }
        }
    }

    public final ea4 G(on8 on8, ea6 ea6, ea6 ea62) {
        ea4 b = on8.b(ea6, ea62);
        r3 r3Var = this.V1;
        r3Var.getClass();
        int i = ea62.t;
        int i3 = r3Var.a;
        int i4 = b.e;
        if (i > i3 || ea62.u > r3Var.b) {
            i4 |= 256;
        }
        if (C0(on8, ea62) > r3Var.c) {
            i4 |= 64;
        }
        int i5 = i4;
        return new ea4(on8.a, ea6, ea62, i5 != 0 ? 0 : b.d, i5);
    }

    public final void G0() {
        Surface surface = this.b2;
        unb unb = this.c2;
        if (surface == unb) {
            this.b2 = null;
        }
        if (unb != null) {
            unb.release();
            this.c2 = null;
        }
    }

    public final MediaCodecDecoderException H(IllegalStateException illegalStateException, on8 on8) {
        Surface surface = this.b2;
        MediaCodecDecoderException mediaCodecDecoderException = new MediaCodecDecoderException(illegalStateException, on8);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecDecoderException;
    }

    public final void H0(in8 in8, int i) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        in8.releaseOutputBuffer(i, true);
        Trace.endSection();
        this.J1.f++;
        boolean z = false;
        this.i2 = 0;
        if (this.Y1 == null) {
            E0(this.n2);
            y5g y5g = this.T1;
            if (y5g.e != 3) {
                z = true;
            }
            y5g.e = 3;
            y5g.l.getClass();
            y5g.g = v0g.S(SystemClock.elapsedRealtime());
            if (z && (surface = this.b2) != null) {
                m8g m8g = this.Q1;
                Handler handler = (Handler) m8g.a;
                if (handler != null) {
                    handler.post(new ca2((Object) m8g, (Object) surface, SystemClock.elapsedRealtime(), 8));
                }
                this.e2 = true;
            }
        }
    }

    public final void I0(in8 in8, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        in8.c(i, j);
        Trace.endSection();
        this.J1.f++;
        boolean z = false;
        this.i2 = 0;
        if (this.Y1 == null) {
            E0(this.n2);
            y5g y5g = this.T1;
            if (y5g.e != 3) {
                z = true;
            }
            y5g.e = 3;
            y5g.l.getClass();
            y5g.g = v0g.S(SystemClock.elapsedRealtime());
            if (z && (surface = this.b2) != null) {
                m8g m8g = this.Q1;
                Handler handler = (Handler) m8g.a;
                if (handler != null) {
                    handler.post(new ca2((Object) m8g, (Object) surface, SystemClock.elapsedRealtime(), 8));
                }
                this.e2 = true;
            }
        }
    }

    public final boolean J0(on8 on8) {
        return v0g.a >= 23 && !this.q2 && !z0(on8.a) && (!on8.f || unb.a(this.O1));
    }

    public final void K0(in8 in8, int i) {
        Trace.beginSection("skipVideoBuffer");
        in8.releaseOutputBuffer(i, false);
        Trace.endSection();
        this.J1.g++;
    }

    public final void L0(int i, int i3) {
        z94 z94 = this.J1;
        z94.i += i;
        int i4 = i + i3;
        z94.h += i4;
        this.h2 += i4;
        int i5 = this.i2 + i4;
        this.i2 = i5;
        z94.j = Math.max(i5, z94.j);
        int i6 = this.R1;
        if (i6 > 0 && this.h2 >= i6) {
            D0();
        }
    }

    public final void M0(long j) {
        z94 z94 = this.J1;
        z94.l += j;
        z94.m++;
        this.k2 += j;
        this.l2++;
    }

    public final int Q(ba4 ba4) {
        return (v0g.a < 34 || !this.q2 || ba4.x >= this.Z) ? 0 : 32;
    }

    public final boolean R() {
        return this.q2 && v0g.a < 23;
    }

    public final float S(float f, ea6[] ea6Arr) {
        float f3 = -1.0f;
        for (ea6 ea6 : ea6Arr) {
            float f4 = ea6.v;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f) {
            return -1.0f;
        }
        return f3 * f;
    }

    public final ArrayList T(rx0 rx0, ea6 ea6, boolean z) {
        return fo8.h(ea6, B0(this.O1, rx0, ea6, z, this.q2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0220  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.en8 U(defpackage.on8 r24, defpackage.ea6 r25, android.media.MediaCrypto r26, float r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r3 = r25
            r2 = r27
            unb r4 = r0.c2
            boolean r5 = r1.f
            if (r4 == 0) goto L_0x0015
            boolean r4 = r4.a
            if (r4 == r5) goto L_0x0015
            r23.G0()
        L_0x0015:
            ea6[] r4 = r0.X
            r4.getClass()
            int r6 = r3.t
            int r7 = C0(r24, r25)
            int r8 = r4.length
            r9 = 1
            float r11 = r3.v
            int r12 = r3.t
            m53 r13 = r3.A
            int r14 = r3.u
            r15 = -1
            if (r8 != r9) goto L_0x0049
            if (r7 == r15) goto L_0x003e
            int r4 = A0(r24, r25)
            if (r4 == r15) goto L_0x003e
            float r7 = (float) r7
            r8 = 1069547520(0x3fc00000, float:1.5)
            float r7 = r7 * r8
            int r7 = (int) r7
            int r7 = java.lang.Math.min(r7, r4)
        L_0x003e:
            r3 r4 = new r3
            r4.<init>(r6, r14, r7)
            r20 = r5
            r16 = r13
            goto L_0x01aa
        L_0x0049:
            int r8 = r4.length
            r10 = r14
            r9 = 0
            r16 = 0
        L_0x004e:
            if (r9 >= r8) goto L_0x00a3
            r15 = r4[r9]
            r18 = r4
            if (r13 == 0) goto L_0x0065
            m53 r4 = r15.A
            if (r4 != 0) goto L_0x0065
            ba6 r4 = r15.a()
            r4.z = r13
            ea6 r15 = new ea6
            r15.<init>(r4)
        L_0x0065:
            ea4 r4 = r1.b(r3, r15)
            int r4 = r4.d
            if (r4 == 0) goto L_0x0094
            int r4 = r15.u
            r19 = r8
            int r8 = r15.t
            r20 = r5
            r5 = -1
            if (r8 == r5) goto L_0x007e
            if (r4 != r5) goto L_0x007b
            goto L_0x007e
        L_0x007b:
            r17 = 0
            goto L_0x0080
        L_0x007e:
            r17 = 1
        L_0x0080:
            r16 = r16 | r17
            int r6 = java.lang.Math.max(r6, r8)
            int r10 = java.lang.Math.max(r10, r4)
            int r4 = C0(r1, r15)
            int r4 = java.lang.Math.max(r7, r4)
            r7 = r4
            goto L_0x0099
        L_0x0094:
            r20 = r5
            r19 = r8
            r5 = -1
        L_0x0099:
            int r9 = r9 + 1
            r15 = r5
            r4 = r18
            r8 = r19
            r5 = r20
            goto L_0x004e
        L_0x00a3:
            r20 = r5
            if (r16 == 0) goto L_0x01a3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Resolutions unknown. Codec max resolution: "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r5 = "x"
            r4.append(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            defpackage.i8b.V(r4)
            if (r14 <= r12) goto L_0x00c4
            r4 = 1
            goto L_0x00c5
        L_0x00c4:
            r4 = 0
        L_0x00c5:
            if (r4 == 0) goto L_0x00c9
            r8 = r14
            goto L_0x00ca
        L_0x00c9:
            r8 = r12
        L_0x00ca:
            if (r4 == 0) goto L_0x00ce
            r9 = r12
            goto L_0x00cf
        L_0x00ce:
            r9 = r14
        L_0x00cf:
            float r15 = (float) r9
            float r2 = (float) r8
            float r15 = r15 / r2
            int[] r2 = u2
            r16 = r13
            r13 = 0
        L_0x00d7:
            r3 = 9
            r17 = 0
            if (r13 >= r3) goto L_0x0166
            r3 = r2[r13]
            r18 = r2
            float r2 = (float) r3
            float r2 = r2 * r15
            int r2 = (int) r2
            if (r3 <= r8) goto L_0x0166
            if (r2 > r9) goto L_0x00ea
            goto L_0x0166
        L_0x00ea:
            r19 = r8
            int r8 = defpackage.v0g.a
            r21 = r9
            r9 = 21
            if (r8 < r9) goto L_0x0134
            if (r4 == 0) goto L_0x00f8
            r8 = r2
            goto L_0x00f9
        L_0x00f8:
            r8 = r3
        L_0x00f9:
            if (r4 == 0) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r3 = r2
        L_0x00fd:
            android.media.MediaCodecInfo$CodecCapabilities r2 = r1.d
            if (r2 != 0) goto L_0x0106
        L_0x0101:
            r22 = r15
            r15 = r17
            goto L_0x0126
        L_0x0106:
            android.media.MediaCodecInfo$VideoCapabilities r2 = r2.getVideoCapabilities()
            if (r2 != 0) goto L_0x010d
            goto L_0x0101
        L_0x010d:
            int r9 = r2.getWidthAlignment()
            int r2 = r2.getHeightAlignment()
            r22 = r15
            android.graphics.Point r15 = new android.graphics.Point
            int r8 = defpackage.v0g.g(r8, r9)
            int r8 = r8 * r9
            int r3 = defpackage.v0g.g(r3, r2)
            int r3 = r3 * r2
            r15.<init>(r8, r3)
        L_0x0126:
            if (r15 == 0) goto L_0x015a
            int r2 = r15.x
            int r3 = r15.y
            double r8 = (double) r11
            boolean r2 = r1.f(r2, r3, r8)
            if (r2 == 0) goto L_0x015a
            goto L_0x0168
        L_0x0134:
            r22 = r15
            r8 = 16
            int r3 = defpackage.v0g.g(r3, r8)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0166 }
            int r3 = r3 * r8
            int r2 = defpackage.v0g.g(r2, r8)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0166 }
            int r2 = r2 * r8
            int r8 = r3 * r2
            int r9 = defpackage.fo8.k()     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0166 }
            if (r8 > r9) goto L_0x015a
            android.graphics.Point r8 = new android.graphics.Point     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0166 }
            if (r4 == 0) goto L_0x0150
            r9 = r2
            goto L_0x0151
        L_0x0150:
            r9 = r3
        L_0x0151:
            if (r4 == 0) goto L_0x0154
            goto L_0x0155
        L_0x0154:
            r3 = r2
        L_0x0155:
            r8.<init>(r9, r3)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0166 }
            r15 = r8
            goto L_0x0168
        L_0x015a:
            int r13 = r13 + 1
            r2 = r18
            r8 = r19
            r9 = r21
            r15 = r22
            goto L_0x00d7
        L_0x0166:
            r15 = r17
        L_0x0168:
            if (r15 == 0) goto L_0x01a5
            int r2 = r15.x
            int r6 = java.lang.Math.max(r6, r2)
            int r2 = r15.y
            int r10 = java.lang.Math.max(r10, r2)
            ba6 r2 = r25.a()
            r2.s = r6
            r2.t = r10
            ea6 r3 = new ea6
            r3.<init>(r2)
            int r2 = A0(r1, r3)
            int r7 = java.lang.Math.max(r7, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Codec max resolution adjusted to: "
            r2.<init>(r3)
            r2.append(r6)
            r2.append(r5)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            defpackage.i8b.V(r2)
            goto L_0x01a5
        L_0x01a3:
            r16 = r13
        L_0x01a5:
            r3 r4 = new r3
            r4.<init>(r6, r10, r7)
        L_0x01aa:
            r0.V1 = r4
            boolean r2 = r0.q2
            if (r2 == 0) goto L_0x01b3
            int r2 = r0.r2
            goto L_0x01b4
        L_0x01b3:
            r2 = 0
        L_0x01b4:
            android.media.MediaFormat r3 = new android.media.MediaFormat
            r3.<init>()
            java.lang.String r5 = "mime"
            java.lang.String r6 = r1.c
            r3.setString(r5, r6)
            java.lang.String r5 = "width"
            r3.setInteger(r5, r12)
            java.lang.String r5 = "height"
            r3.setInteger(r5, r14)
            r5 = r25
            java.util.List r6 = r5.q
            defpackage.hsg.C(r3, r6)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r7 == 0) goto L_0x01dc
            java.lang.String r7 = "frame-rate"
            r3.setFloat(r7, r11)
        L_0x01dc:
            java.lang.String r7 = "rotation-degrees"
            int r8 = r5.w
            defpackage.hsg.x(r3, r7, r8)
            r7 = r16
            defpackage.hsg.w(r3, r7)
            java.lang.String r7 = "video/dolby-vision"
            java.lang.String r8 = r5.n
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0205
            android.util.Pair r7 = defpackage.fo8.d(r25)
            if (r7 == 0) goto L_0x0205
            java.lang.Object r7 = r7.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.String r8 = "profile"
            defpackage.hsg.x(r3, r8, r7)
        L_0x0205:
            int r7 = r4.a
            java.lang.String r8 = "max-width"
            r3.setInteger(r8, r7)
            java.lang.String r7 = "max-height"
            int r8 = r4.b
            r3.setInteger(r7, r8)
            java.lang.String r7 = "max-input-size"
            int r4 = r4.c
            defpackage.hsg.x(r3, r7, r4)
            int r4 = defpackage.v0g.a
            r7 = 23
            if (r4 < r7) goto L_0x0231
            java.lang.String r7 = "priority"
            r8 = 0
            r3.setInteger(r7, r8)
            r7 = r27
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0231
            java.lang.String r6 = "operating-rate"
            r3.setFloat(r6, r7)
        L_0x0231:
            boolean r6 = r0.S1
            if (r6 == 0) goto L_0x0242
            java.lang.String r6 = "no-post-process"
            r7 = 1
            r3.setInteger(r6, r7)
            java.lang.String r6 = "auto-frc"
            r8 = 0
            r3.setInteger(r6, r8)
            goto L_0x0243
        L_0x0242:
            r7 = 1
        L_0x0243:
            if (r2 == 0) goto L_0x024f
            java.lang.String r6 = "tunneled-playback"
            r3.setFeatureEnabled(r6, r7)
            java.lang.String r6 = "audio-session-id"
            r3.setInteger(r6, r2)
        L_0x024f:
            r2 = 35
            if (r4 < r2) goto L_0x0260
            int r2 = r0.p2
            int r2 = -r2
            r4 = 0
            int r2 = java.lang.Math.max(r4, r2)
            java.lang.String r4 = "importance"
            r3.setInteger(r4, r2)
        L_0x0260:
            android.view.Surface r2 = r0.b2
            if (r2 != 0) goto L_0x0283
            boolean r2 = r23.J0(r24)
            if (r2 == 0) goto L_0x027d
            unb r2 = r0.c2
            if (r2 != 0) goto L_0x0278
            android.content.Context r2 = r0.O1
            r4 = r20
            unb r2 = defpackage.unb.b(r2, r4)
            r0.c2 = r2
        L_0x0278:
            unb r2 = r0.c2
            r0.b2 = r2
            goto L_0x0283
        L_0x027d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0283:
            ed3 r2 = r0.Y1
            if (r2 == 0) goto L_0x0295
            android.content.Context r2 = r2.a
            boolean r2 = defpackage.v0g.M(r2)
            if (r2 != 0) goto L_0x0295
            java.lang.String r2 = "allow-frame-drop"
            r4 = 0
            r3.setInteger(r2, r4)
        L_0x0295:
            ed3 r2 = r0.Y1
            if (r2 == 0) goto L_0x02c1
            boolean r0 = r2.c()
            defpackage.n79.n(r0)
            x5g r0 = r2.e
            defpackage.n79.o(r0)
            gk4 r0 = (defpackage.gk4) r0
            th7 r0 = r0.d
            android.util.SparseArray r0 = r0.g
            r2 = 1
            boolean r4 = defpackage.v0g.l(r0, r2)
            defpackage.n79.n(r4)
            java.lang.Object r0 = r0.get(r2)
            sh7 r0 = (defpackage.sh7) r0
            q2 r0 = r0.a
            android.view.Surface r0 = r0.H()
        L_0x02bf:
            r4 = r0
            goto L_0x02c4
        L_0x02c1:
            android.view.Surface r0 = r0.b2
            goto L_0x02bf
        L_0x02c4:
            en8 r6 = new en8
            r0 = r6
            r1 = r24
            r2 = r3
            r3 = r25
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo8.U(on8, ea6, android.media.MediaCrypto, float):en8");
    }

    public final void V(ba4 ba4) {
        if (this.X1) {
            ByteBuffer byteBuffer = ba4.y;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s3 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b != -75 || s != 60 || s3 != 1 || b3 != 4) {
                    return;
                }
                if (b4 == 0 || b4 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    in8 in8 = this.U0;
                    in8.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    in8.setParameters(bundle);
                }
            }
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r11, java.lang.Object r12) {
        /*
            r10 = this;
            y5g r0 = r10.T1
            r1 = 0
            r2 = 1
            if (r11 == r2) goto L_0x00e8
            r3 = 7
            if (r11 == r3) goto L_0x00d7
            r3 = 10
            if (r11 == r3) goto L_0x00bf
            r3 = 16
            if (r11 == r3) goto L_0x0092
            r1 = 4
            if (r11 == r1) goto L_0x007e
            r1 = 5
            if (r11 == r1) goto L_0x0066
            r0 = 13
            if (r11 == r0) goto L_0x0046
            r0 = 14
            if (r11 == r0) goto L_0x0029
            r0 = 11
            if (r11 != r0) goto L_0x0196
            vc5 r12 = (defpackage.vc5) r12
            r10.P0 = r12
            goto L_0x0196
        L_0x0029:
            r12.getClass()
            ode r12 = (defpackage.ode) r12
            int r11 = r12.a
            if (r11 == 0) goto L_0x0196
            int r11 = r12.b
            if (r11 == 0) goto L_0x0196
            r10.d2 = r12
            ed3 r11 = r10.Y1
            if (r11 == 0) goto L_0x0196
            android.view.Surface r10 = r10.b2
            defpackage.n79.o(r10)
            r11.f(r10, r12)
            goto L_0x0196
        L_0x0046:
            r12.getClass()
            java.util.List r12 = (java.util.List) r12
            r10.a2 = r12
            ed3 r10 = r10.Y1
            if (r10 == 0) goto L_0x0196
            java.util.ArrayList r11 = r10.c
            boolean r0 = r11.equals(r12)
            if (r0 == 0) goto L_0x005b
            goto L_0x0196
        L_0x005b:
            r11.clear()
            r11.addAll(r12)
            r10.d()
            goto L_0x0196
        L_0x0066:
            r12.getClass()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r10 = r12.intValue()
            f6g r11 = r0.b
            int r12 = r11.h
            if (r12 != r10) goto L_0x0077
            goto L_0x0196
        L_0x0077:
            r11.h = r10
            r11.d(r2)
            goto L_0x0196
        L_0x007e:
            r12.getClass()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r10.f2 = r11
            in8 r10 = r10.U0
            if (r10 == 0) goto L_0x0196
            r10.h(r11)
            goto L_0x0196
        L_0x0092:
            r12.getClass()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r10.p2 = r11
            in8 r11 = r10.U0
            if (r11 != 0) goto L_0x00a3
            goto L_0x0196
        L_0x00a3:
            int r12 = defpackage.v0g.a
            r0 = 35
            if (r12 < r0) goto L_0x0196
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            int r10 = r10.p2
            int r10 = -r10
            int r10 = java.lang.Math.max(r1, r10)
            java.lang.String r0 = "importance"
            r12.putInt(r0, r10)
            r11.setParameters(r12)
            goto L_0x0196
        L_0x00bf:
            r12.getClass()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            int r12 = r10.r2
            if (r12 == r11) goto L_0x0196
            r10.r2 = r11
            boolean r11 = r10.q2
            if (r11 == 0) goto L_0x0196
            r10.n0()
            goto L_0x0196
        L_0x00d7:
            r12.getClass()
            pc5 r12 = (defpackage.pc5) r12
            r10.t2 = r12
            ed3 r10 = r10.Y1
            if (r10 == 0) goto L_0x0196
            fd3 r10 = r10.q
            r10.z = r12
            goto L_0x0196
        L_0x00e8:
            boolean r11 = r12 instanceof android.view.Surface
            r3 = 0
            if (r11 == 0) goto L_0x00f0
            android.view.Surface r12 = (android.view.Surface) r12
            goto L_0x00f1
        L_0x00f0:
            r12 = r3
        L_0x00f1:
            if (r12 != 0) goto L_0x010d
            unb r11 = r10.c2
            if (r11 == 0) goto L_0x00f9
            r12 = r11
            goto L_0x010d
        L_0x00f9:
            on8 r11 = r10.b1
            if (r11 == 0) goto L_0x010d
            boolean r4 = r10.J0(r11)
            if (r4 == 0) goto L_0x010d
            android.content.Context r12 = r10.O1
            boolean r11 = r11.f
            unb r12 = defpackage.unb.b(r12, r11)
            r10.c2 = r12
        L_0x010d:
            android.view.Surface r11 = r10.b2
            m8g r5 = r10.Q1
            if (r11 == r12) goto L_0x016c
            r10.b2 = r12
            ed3 r11 = r10.Y1
            if (r11 != 0) goto L_0x011c
            r0.h(r12)
        L_0x011c:
            r10.e2 = r1
            int r11 = r10.y
            in8 r1 = r10.U0
            if (r1 == 0) goto L_0x013e
            ed3 r4 = r10.Y1
            if (r4 != 0) goto L_0x013e
            int r4 = defpackage.v0g.a
            r6 = 23
            if (r4 < r6) goto L_0x0138
            if (r12 == 0) goto L_0x0138
            boolean r4 = r10.W1
            if (r4 != 0) goto L_0x0138
            r1.j(r12)
            goto L_0x013e
        L_0x0138:
            r10.n0()
            r10.Y()
        L_0x013e:
            if (r12 == 0) goto L_0x0152
            unb r1 = r10.c2
            if (r12 == r1) goto L_0x0152
            v8g r12 = r10.o2
            if (r12 == 0) goto L_0x014b
            r5.c(r12)
        L_0x014b:
            r12 = 2
            if (r11 != r12) goto L_0x0168
            r0.c(r2)
            goto L_0x0168
        L_0x0152:
            r10.o2 = r3
            ed3 r11 = r10.Y1
            if (r11 == 0) goto L_0x0168
            fd3 r11 = r11.q
            r11.getClass()
            ode r12 = defpackage.ode.c
            int r0 = r12.a
            int r12 = r12.b
            r11.b(r3, r0, r12)
            r11.Z = r3
        L_0x0168:
            r10.F0()
            goto L_0x0196
        L_0x016c:
            if (r12 == 0) goto L_0x0196
            unb r11 = r10.c2
            if (r12 == r11) goto L_0x0196
            v8g r11 = r10.o2
            if (r11 == 0) goto L_0x0179
            r5.c(r11)
        L_0x0179:
            android.view.Surface r6 = r10.b2
            if (r6 == 0) goto L_0x0196
            boolean r10 = r10.e2
            if (r10 == 0) goto L_0x0196
            java.lang.Object r10 = r5.a
            android.os.Handler r10 = (android.os.Handler) r10
            if (r10 == 0) goto L_0x0196
            long r7 = android.os.SystemClock.elapsedRealtime()
            ca2 r11 = new ca2
            r9 = 8
            r4 = r11
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (long) r7, (int) r9)
            r10.post(r11)
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo8.a(int, java.lang.Object):void");
    }

    public final void a0(Exception exc) {
        i8b.p("Video codec error", exc);
        m8g m8g = this.Q1;
        Handler handler = (Handler) m8g.a;
        if (handler != null) {
            handler.post(new s6e(29, m8g, exc));
        }
    }

    public final void b0(long j, String str, long j3) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        m8g m8g = this.Q1;
        Handler handler = (Handler) m8g.a;
        if (handler != null) {
            handler.post(new d70(m8g, str, j, j3, 3));
        }
        this.W1 = z0(str);
        on8 on8 = this.b1;
        on8.getClass();
        boolean z = false;
        if (v0g.a >= 29 && "video/x-vnd.on2.vp9".equals(on8.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = on8.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.X1 = z;
        F0();
    }

    public final void c0(String str) {
        m8g m8g = this.Q1;
        Handler handler = (Handler) m8g.a;
        if (handler != null) {
            handler.post(new l8g(0, m8g, str));
        }
    }

    public final ea4 d0(ox0 ox0) {
        ea4 d0 = super.d0(ox0);
        ea6 ea6 = (ea6) ox0.b;
        ea6.getClass();
        m8g m8g = this.Q1;
        Handler handler = (Handler) m8g.a;
        if (handler != null) {
            handler.post(new o6d((Object) m8g, (Object) ea6, (Object) d0, 16));
        }
        return d0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0081, code lost:
        if (r9.Y1 == null) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e0(defpackage.ea6 r10, android.media.MediaFormat r11) {
        /*
            r9 = this;
            in8 r0 = r9.U0
            if (r0 == 0) goto L_0x0009
            int r1 = r9.f2
            r0.h(r1)
        L_0x0009:
            boolean r0 = r9.q2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0014
            int r11 = r10.t
            int r0 = r10.u
            goto L_0x0064
        L_0x0014:
            r11.getClass()
            java.lang.String r0 = "crop-right"
            boolean r3 = r11.containsKey(r0)
            java.lang.String r4 = "crop-top"
            java.lang.String r5 = "crop-bottom"
            java.lang.String r6 = "crop-left"
            if (r3 == 0) goto L_0x0039
            boolean r3 = r11.containsKey(r6)
            if (r3 == 0) goto L_0x0039
            boolean r3 = r11.containsKey(r5)
            if (r3 == 0) goto L_0x0039
            boolean r3 = r11.containsKey(r4)
            if (r3 == 0) goto L_0x0039
            r3 = r2
            goto L_0x003a
        L_0x0039:
            r3 = r1
        L_0x003a:
            if (r3 == 0) goto L_0x0047
            int r0 = r11.getInteger(r0)
            int r6 = r11.getInteger(r6)
            int r0 = r0 - r6
            int r0 = r0 + r2
            goto L_0x004d
        L_0x0047:
            java.lang.String r0 = "width"
            int r0 = r11.getInteger(r0)
        L_0x004d:
            if (r3 == 0) goto L_0x005b
            int r3 = r11.getInteger(r5)
            int r11 = r11.getInteger(r4)
            int r3 = r3 - r11
            int r3 = r3 + r2
            r11 = r3
            goto L_0x0061
        L_0x005b:
            java.lang.String r3 = "height"
            int r11 = r11.getInteger(r3)
        L_0x0061:
            r8 = r0
            r0 = r11
            r11 = r8
        L_0x0064:
            float r3 = r10.x
            int r4 = defpackage.v0g.a
            r5 = 21
            int r6 = r10.w
            if (r4 < r5) goto L_0x007f
            r7 = 90
            if (r6 == r7) goto L_0x0076
            r7 = 270(0x10e, float:3.78E-43)
            if (r6 != r7) goto L_0x0084
        L_0x0076:
            r6 = 1065353216(0x3f800000, float:1.0)
            float r3 = r6 / r3
            r6 = r1
            r8 = r0
            r0 = r11
            r11 = r8
            goto L_0x0085
        L_0x007f:
            ed3 r7 = r9.Y1
            if (r7 != 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r6 = r1
        L_0x0085:
            v8g r7 = new v8g
            r7.<init>(r3, r11, r0, r6)
            r9.n2 = r7
            ed3 r7 = r9.Y1
            if (r7 == 0) goto L_0x013f
            ba6 r9 = r10.a()
            r9.s = r11
            r9.t = r0
            r9.v = r6
            r9.w = r3
            ea6 r9 = r9.a()
            boolean r10 = r7.c()
            defpackage.n79.n(r10)
            fd3 r10 = r7.q
            y5g r10 = r10.c
            float r11 = r9.v
            r10.g(r11)
            r10 = 0
            if (r4 >= r5) goto L_0x0119
            r11 = -1
            int r0 = r9.w
            if (r0 == r11) goto L_0x0119
            if (r0 == 0) goto L_0x0119
            hh8 r11 = r7.d
            if (r11 == 0) goto L_0x00c6
            ea6 r11 = r7.f
            if (r11 == 0) goto L_0x00c6
            int r11 = r11.w
            if (r11 == r0) goto L_0x011b
        L_0x00c6:
            float r11 = (float) r0
            java.lang.reflect.Constructor r0 = defpackage.hsg.k     // Catch:{ Exception -> 0x0112 }
            if (r0 == 0) goto L_0x00d3
            java.lang.reflect.Method r0 = defpackage.hsg.l     // Catch:{ Exception -> 0x0112 }
            if (r0 == 0) goto L_0x00d3
            java.lang.reflect.Method r0 = defpackage.hsg.m     // Catch:{ Exception -> 0x0112 }
            if (r0 != 0) goto L_0x00f1
        L_0x00d3:
            java.lang.Class<tdd> r0 = defpackage.tdd.class
            java.lang.reflect.Constructor r3 = r0.getConstructor(r10)     // Catch:{ Exception -> 0x0112 }
            defpackage.hsg.k = r3     // Catch:{ Exception -> 0x0112 }
            java.lang.Class r3 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0112 }
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch:{ Exception -> 0x0112 }
            java.lang.String r4 = "setRotationDegrees"
            java.lang.reflect.Method r3 = r0.getMethod(r4, r3)     // Catch:{ Exception -> 0x0112 }
            defpackage.hsg.l = r3     // Catch:{ Exception -> 0x0112 }
            java.lang.String r3 = "build"
            java.lang.reflect.Method r0 = r0.getMethod(r3, r10)     // Catch:{ Exception -> 0x0112 }
            defpackage.hsg.m = r0     // Catch:{ Exception -> 0x0112 }
        L_0x00f1:
            java.lang.reflect.Constructor r0 = defpackage.hsg.k     // Catch:{ Exception -> 0x0112 }
            java.lang.Object r0 = r0.newInstance(r10)     // Catch:{ Exception -> 0x0112 }
            java.lang.reflect.Method r3 = defpackage.hsg.l     // Catch:{ Exception -> 0x0112 }
            java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch:{ Exception -> 0x0112 }
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch:{ Exception -> 0x0112 }
            r3.invoke(r0, r11)     // Catch:{ Exception -> 0x0112 }
            java.lang.reflect.Method r11 = defpackage.hsg.m     // Catch:{ Exception -> 0x0112 }
            java.lang.Object r10 = r11.invoke(r0, r10)     // Catch:{ Exception -> 0x0112 }
            r10.getClass()     // Catch:{ Exception -> 0x0112 }
            hh8 r10 = (defpackage.hh8) r10     // Catch:{ Exception -> 0x0112 }
            r7.d = r10
            goto L_0x011b
        L_0x0112:
            r9 = move-exception
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r9)
            throw r10
        L_0x0119:
            r7.d = r10
        L_0x011b:
            r7.g = r2
            r7.f = r9
            boolean r9 = r7.m
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 != 0) goto L_0x0130
            r7.d()
            r7.m = r2
            r7.n = r10
            goto L_0x0146
        L_0x0130:
            long r3 = r7.l
            int r9 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x0137
            r1 = r2
        L_0x0137:
            defpackage.n79.n(r1)
            long r9 = r7.l
            r7.n = r9
            goto L_0x0146
        L_0x013f:
            y5g r9 = r9.T1
            float r10 = r10.v
            r9.g(r10)
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo8.e0(ea6, android.media.MediaFormat):void");
    }

    public final void g0(long j) {
        super.g0(j);
        if (!this.q2) {
            this.j2--;
        }
    }

    public final void h() {
        ed3 ed3 = this.Y1;
        if (ed3 != null) {
            y5g y5g = ed3.q.c;
            if (y5g.e == 0) {
                y5g.e = 1;
                return;
            }
            return;
        }
        y5g y5g2 = this.T1;
        if (y5g2.e == 0) {
            y5g2.e = 1;
        }
    }

    public final void h0() {
        ed3 ed3 = this.Y1;
        if (ed3 != null) {
            long j = this.K1.c;
            ed3.j |= (ed3.h == j && ed3.i == 0) ? false : true;
            ed3.h = j;
            ed3.i = 0;
        } else {
            this.T1.d(2);
        }
        F0();
    }

    public final void i0(ba4 ba4) {
        Surface surface;
        boolean z = this.q2;
        if (!z) {
            this.j2++;
        }
        if (v0g.a < 23 && z) {
            long j = ba4.x;
            y0(j);
            E0(this.n2);
            this.J1.f++;
            y5g y5g = this.T1;
            boolean z2 = y5g.e != 3;
            y5g.e = 3;
            y5g.l.getClass();
            y5g.g = v0g.S(SystemClock.elapsedRealtime());
            if (z2 && (surface = this.b2) != null) {
                m8g m8g = this.Q1;
                Handler handler = (Handler) m8g.a;
                if (handler != null) {
                    handler.post(new ca2((Object) m8g, (Object) surface, SystemClock.elapsedRealtime(), 8));
                }
                this.e2 = true;
            }
            g0(j);
        }
    }

    public final void j0(ea6 ea6) {
        ed3 ed3 = this.Y1;
        if (ed3 != null && !ed3.c()) {
            try {
                this.Y1.b(ea6);
            } catch (VideoSink$VideoSinkException e) {
                throw g(e, ea6, false, 7000);
            }
        }
    }

    public final String l() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l0(long r17, long r19, defpackage.in8 r21, java.nio.ByteBuffer r22, int r23, int r24, int r25, long r26, boolean r28, boolean r29, defpackage.ea6 r30) {
        /*
            r16 = this;
            r1 = r16
            r0 = r21
            r2 = r23
            r21.getClass()
            un8 r3 = r1.K1
            long r4 = r3.c
            long r14 = r26 - r4
            ap0 r13 = r1.U1
            y5g r4 = r1.T1
            long r10 = r3.b
            r3 = r4
            r4 = r26
            r6 = r17
            r8 = r19
            r12 = r29
            int r3 = r3.a(r4, r6, r8, r10, r12, r13)
            r4 = 4
            r5 = 0
            if (r3 != r4) goto L_0x0027
            return r5
        L_0x0027:
            r4 = 1
            if (r28 == 0) goto L_0x0030
            if (r29 != 0) goto L_0x0030
            r1.K0(r0, r2)
            return r4
        L_0x0030:
            android.view.Surface r6 = r1.b2
            unb r7 = r1.c2
            r8 = 30000(0x7530, double:1.4822E-319)
            ap0 r10 = r1.U1
            if (r6 != r7) goto L_0x004e
            ed3 r6 = r1.Y1
            if (r6 != 0) goto L_0x004e
            long r6 = r10.b
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x004d
            r1.K0(r0, r2)
            long r2 = r10.b
            r1.M0(r2)
            return r4
        L_0x004d:
            return r5
        L_0x004e:
            ed3 r6 = r1.Y1
            r7 = 21
            if (r6 == 0) goto L_0x00fd
            r8 = r17
            r11 = r19
            r6.e(r8, r11)     // Catch:{ VideoSink$VideoSinkException -> 0x00f2 }
            ed3 r3 = r1.Y1
            boolean r6 = r3.c()
            defpackage.n79.n(r6)
            r6 = -1
            int r8 = r3.b
            if (r8 == r6) goto L_0x006b
            r6 = r4
            goto L_0x006c
        L_0x006b:
            r6 = r5
        L_0x006c:
            defpackage.n79.n(r6)
            long r9 = r3.n
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            fd3 r13 = r3.q
            if (r6 == 0) goto L_0x0095
            int r6 = r13.v0
            if (r6 != 0) goto L_0x0092
            g6g r6 = r13.o
            long r14 = r6.j
            int r6 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0092
            int r6 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x0092
            r3.d()
            r3.n = r11
            goto L_0x0095
        L_0x0092:
            r8 = r11
            r10 = r8
            goto L_0x00e1
        L_0x0095:
            x5g r6 = r3.e
            defpackage.n79.o(r6)
            gk4 r6 = (defpackage.gk4) r6
            th7 r6 = r6.d
            q2 r6 = r6.k
            if (r6 == 0) goto L_0x00a7
            int r6 = r6.I()
            goto L_0x00a8
        L_0x00a7:
            r6 = r5
        L_0x00a8:
            if (r6 < r8) goto L_0x00ab
            goto L_0x0092
        L_0x00ab:
            x5g r6 = r3.e
            defpackage.n79.o(r6)
            gk4 r6 = (defpackage.gk4) r6
            boolean r6 = r6.b()
            if (r6 != 0) goto L_0x00b9
            goto L_0x0092
        L_0x00b9:
            long r8 = r3.i
            long r14 = r26 - r8
            boolean r6 = r3.j
            if (r6 == 0) goto L_0x00d2
            long r11 = r3.h
            r13.x0 = r8
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            g6g r8 = r13.o
            akf r8 = r8.e
            r8.a(r14, r6)
            r3.j = r5
        L_0x00d2:
            r3.l = r14
            if (r29 == 0) goto L_0x00d8
            r3.k = r14
        L_0x00d8:
            r8 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r26
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e1:
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x00e6
            return r5
        L_0x00e6:
            int r3 = defpackage.v0g.a
            if (r3 < r7) goto L_0x00ee
            r1.I0(r0, r2, r8)
            goto L_0x00f1
        L_0x00ee:
            r1.H0(r0, r2)
        L_0x00f1:
            return r4
        L_0x00f2:
            r0 = move-exception
            r2 = r0
            ea6 r0 = r2.a
            r3 = 7001(0x1b59, float:9.81E-42)
            androidx.media3.exoplayer.ExoPlaybackException r0 = r1.g(r2, r0, r5, r3)
            throw r0
        L_0x00fd:
            if (r3 == 0) goto L_0x0183
            if (r3 == r4) goto L_0x0132
            r6 = 2
            if (r3 == r6) goto L_0x011e
            r6 = 3
            if (r3 == r6) goto L_0x0115
            r0 = 5
            if (r3 != r0) goto L_0x010b
            return r5
        L_0x010b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r0.<init>(r1)
            throw r0
        L_0x0115:
            r1.K0(r0, r2)
            long r2 = r10.b
            r1.M0(r2)
            return r4
        L_0x011e:
            java.lang.String r3 = "dropVideoBuffer"
            android.os.Trace.beginSection(r3)
            r0.releaseOutputBuffer(r2, r5)
            android.os.Trace.endSection()
            r1.L0(r5, r4)
            long r2 = r10.b
            r1.M0(r2)
            return r4
        L_0x0132:
            long r8 = r10.c
            long r10 = r10.b
            int r3 = defpackage.v0g.a
            if (r3 < r7) goto L_0x0155
            long r5 = r1.m2
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0144
            r1.K0(r0, r2)
            goto L_0x014e
        L_0x0144:
            pc5 r3 = r1.t2
            if (r3 == 0) goto L_0x014b
            r3.d(r14, r8)
        L_0x014b:
            r1.I0(r0, r2, r8)
        L_0x014e:
            r1.M0(r10)
            r1.m2 = r8
        L_0x0153:
            r5 = r4
            goto L_0x0182
        L_0x0155:
            r6 = 30000(0x7530, double:1.4822E-319)
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0182
            r6 = 11000(0x2af8, double:5.4347E-320)
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0174
            r6 = 10000(0x2710, double:4.9407E-320)
            long r6 = r10 - r6
            r12 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r12
            java.lang.Thread.sleep(r6)     // Catch:{ InterruptedException -> 0x016c }
            goto L_0x0174
        L_0x016c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0182
        L_0x0174:
            pc5 r3 = r1.t2
            if (r3 == 0) goto L_0x017b
            r3.d(r14, r8)
        L_0x017b:
            r1.H0(r0, r2)
            r1.M0(r10)
            goto L_0x0153
        L_0x0182:
            return r5
        L_0x0183:
            c7f r3 = r1.x
            r3.getClass()
            long r5 = java.lang.System.nanoTime()
            pc5 r3 = r1.t2
            if (r3 == 0) goto L_0x0193
            r3.d(r14, r5)
        L_0x0193:
            int r3 = defpackage.v0g.a
            if (r3 < r7) goto L_0x019b
            r1.I0(r0, r2, r5)
            goto L_0x019e
        L_0x019b:
            r1.H0(r0, r2)
        L_0x019e:
            long r2 = r10.b
            r1.M0(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo8.l0(long, long, in8, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, ea6):boolean");
    }

    public final boolean n() {
        if (this.F1) {
            ed3 ed3 = this.Y1;
            if (ed3 != null) {
                if (ed3.c()) {
                    long j = ed3.k;
                    if (j != -9223372036854775807L) {
                        fd3 fd3 = ed3.q;
                        if (fd3.v0 == 0) {
                            long j3 = fd3.o.j;
                            if (j3 == -9223372036854775807L || j3 < j) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0.o.b.b(true) != false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p() {
        /*
            r4 = this;
            boolean r0 = super.p()
            r1 = 1
            if (r0 == 0) goto L_0x0023
            ed3 r0 = r4.Y1
            if (r0 == 0) goto L_0x0021
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x0023
            fd3 r0 = r0.q
            int r2 = r0.v0
            if (r2 != 0) goto L_0x0023
            g6g r0 = r0.o
            y5g r0 = r0.b
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L_0x0023
        L_0x0021:
            r0 = r1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0037
            unb r2 = r4.c2
            if (r2 == 0) goto L_0x002e
            android.view.Surface r3 = r4.b2
            if (r3 == r2) goto L_0x0036
        L_0x002e:
            in8 r2 = r4.U0
            if (r2 == 0) goto L_0x0036
            boolean r2 = r4.q2
            if (r2 == 0) goto L_0x0037
        L_0x0036:
            return r1
        L_0x0037:
            y5g r4 = r4.T1
            boolean r4 = r4.b(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo8.p():boolean");
    }

    public final void p0() {
        super.p0();
        this.j2 = 0;
    }

    public final void q() {
        m8g m8g = this.Q1;
        this.o2 = null;
        ed3 ed3 = this.Y1;
        if (ed3 != null) {
            ed3.q.c.d(0);
        } else {
            this.T1.d(0);
        }
        F0();
        this.e2 = false;
        this.s2 = null;
        try {
            super.q();
            z94 z94 = this.J1;
            m8g.getClass();
            synchronized (z94) {
            }
            Handler handler = (Handler) m8g.a;
            if (handler != null) {
                handler.post(new k8g(m8g, z94, 1));
            }
            m8g.c(v8g.e);
        } catch (Throwable th) {
            z94 z942 = this.J1;
            m8g.getClass();
            synchronized (z942) {
                Handler handler2 = (Handler) m8g.a;
                if (handler2 != null) {
                    handler2.post(new k8g(m8g, z942, 1));
                }
                m8g.c(v8g.e);
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v20, types: [ce, java.lang.Object] */
    public final void r(boolean z, boolean z2) {
        this.J1 = new z94(1);
        s1d s1d = this.o;
        s1d.getClass();
        boolean z3 = true;
        boolean z4 = s1d.b;
        n79.n(!z4 || this.r2 != 0);
        if (this.q2 != z4) {
            this.q2 = z4;
            n0();
        }
        z94 z94 = this.J1;
        m8g m8g = this.Q1;
        Handler handler = (Handler) m8g.a;
        if (handler != null) {
            handler.post(new k8g(m8g, z94, 0));
        }
        boolean z5 = this.Z1;
        y5g y5g = this.T1;
        if (!z5) {
            if ((this.a2 != null || !this.P1) && this.Y1 == null) {
                Context context = this.O1;
                ? obj = new Object();
                obj.b = context.getApplicationContext();
                obj.c = y5g;
                obj.w = c7f.a;
                c7f c7f = this.x;
                c7f.getClass();
                obj.w = c7f;
                n79.n(!obj.a);
                if (((cd3) obj.v) == null) {
                    if (((bd3) obj.o) == null) {
                        obj.o = new Object();
                    }
                    obj.v = new cd3((bd3) obj.o);
                }
                fd3 fd3 = new fd3(obj);
                obj.a = true;
                this.Y1 = fd3.b;
            }
            this.Z1 = true;
        }
        ed3 ed3 = this.Y1;
        if (ed3 != null) {
            grg grg = new grg(26, this);
            dp4 dp4 = dp4.a;
            ed3.o = grg;
            ed3.p = dp4;
            pc5 pc5 = this.t2;
            if (pc5 != null) {
                ed3.q.z = pc5;
            }
            if (this.b2 != null && !this.d2.equals(ode.c)) {
                this.Y1.f(this.b2, this.d2);
            }
            ed3 ed32 = this.Y1;
            float f = this.S0;
            g6g g6g = ed32.q.o;
            g6g.getClass();
            if (f <= c44.DEFAULT_ASPECT_RATIO) {
                z3 = false;
            }
            n79.g(z3);
            y5g y5g2 = g6g.b;
            if (f != y5g2.k) {
                y5g2.k = f;
                f6g f6g = y5g2.b;
                f6g.g = f;
                f6g.k = 0;
                f6g.n = -1;
                f6g.l = -1;
                f6g.d(false);
            }
            List list = this.a2;
            if (list != null) {
                ed3 ed33 = this.Y1;
                ArrayList arrayList = ed33.c;
                if (!arrayList.equals(list)) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    ed33.d();
                }
            }
            this.Y1.q.c.e = z2;
            return;
        }
        c7f c7f2 = this.x;
        c7f2.getClass();
        y5g.l = c7f2;
        y5g.e = z2 ? 1 : 0;
    }

    public final void s(long j, boolean z) {
        ed3 ed3 = this.Y1;
        if (ed3 != null) {
            ed3.a(true);
            ed3 ed32 = this.Y1;
            long j3 = this.K1.c;
            ed32.j |= (ed32.h == j3 && ed32.i == 0) ? false : true;
            ed32.h = j3;
            ed32.i = 0;
        }
        super.s(j, z);
        ed3 ed33 = this.Y1;
        y5g y5g = this.T1;
        if (ed33 == null) {
            f6g f6g = y5g.b;
            f6g.k = 0;
            f6g.n = -1;
            f6g.l = -1;
            y5g.h = -9223372036854775807L;
            y5g.f = -9223372036854775807L;
            y5g.d(1);
            y5g.i = -9223372036854775807L;
        }
        if (z) {
            y5g.c(false);
        }
        F0();
        this.i2 = 0;
    }

    public final void t() {
        ed3 ed3 = this.Y1;
        if (ed3 != null && this.P1) {
            fd3 fd3 = ed3.q;
            if (fd3.w0 != 2) {
                k7f k7f = fd3.X;
                if (k7f != null) {
                    k7f.a.removeCallbacksAndMessages((Object) null);
                }
                mub mub = fd3.Y;
                if (mub != null) {
                    mub.release();
                }
                fd3.Z = null;
                fd3.w0 = 2;
            }
        }
    }

    public final boolean t0(on8 on8) {
        return this.b2 != null || J0(on8);
    }

    public final void u() {
        try {
            I();
            n0();
            aw4 aw4 = this.O0;
            if (aw4 != null) {
                aw4.f((gw4) null);
            }
            this.O0 = null;
            this.Z1 = false;
            if (this.c2 != null) {
                G0();
            }
        } catch (Throwable th) {
            this.Z1 = false;
            if (this.c2 != null) {
                G0();
            }
            throw th;
        }
    }

    public final void v() {
        this.h2 = 0;
        this.x.getClass();
        this.g2 = SystemClock.elapsedRealtime();
        this.k2 = 0;
        this.l2 = 0;
        ed3 ed3 = this.Y1;
        if (ed3 != null) {
            ed3.q.c.e();
        } else {
            this.T1.e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int v0(defpackage.rx0 r11, defpackage.ea6 r12) {
        /*
            r10 = this;
            java.lang.String r0 = r12.n
            boolean r0 = defpackage.vq9.k(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            int r10 = defpackage.pk0.b(r1, r1, r1, r1)
            return r10
        L_0x000e:
            yv4 r0 = r12.r
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            android.content.Context r10 = r10.O1
            java.util.List r3 = B0(r10, r11, r12, r0, r1)
            if (r0 == 0) goto L_0x0028
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0028
            java.util.List r3 = B0(r10, r11, r12, r1, r1)
        L_0x0028:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0033
            int r10 = defpackage.pk0.b(r2, r1, r1, r1)
            return r10
        L_0x0033:
            int r4 = r12.K
            if (r4 == 0) goto L_0x0040
            r5 = 2
            if (r4 != r5) goto L_0x003b
            goto L_0x0040
        L_0x003b:
            int r10 = defpackage.pk0.b(r5, r1, r1, r1)
            return r10
        L_0x0040:
            java.lang.Object r4 = r3.get(r1)
            on8 r4 = (defpackage.on8) r4
            boolean r5 = r4.d(r12)
            if (r5 != 0) goto L_0x0066
            r6 = r2
        L_0x004d:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0066
            java.lang.Object r7 = r3.get(r6)
            on8 r7 = (defpackage.on8) r7
            boolean r8 = r7.d(r12)
            if (r8 == 0) goto L_0x0063
            r3 = r1
            r5 = r2
            r4 = r7
            goto L_0x0067
        L_0x0063:
            int r6 = r6 + 1
            goto L_0x004d
        L_0x0066:
            r3 = r2
        L_0x0067:
            if (r5 == 0) goto L_0x006b
            r6 = 4
            goto L_0x006c
        L_0x006b:
            r6 = 3
        L_0x006c:
            boolean r7 = r4.e(r12)
            if (r7 == 0) goto L_0x0075
            r7 = 16
            goto L_0x0077
        L_0x0075:
            r7 = 8
        L_0x0077:
            boolean r4 = r4.g
            if (r4 == 0) goto L_0x007e
            r4 = 64
            goto L_0x007f
        L_0x007e:
            r4 = r1
        L_0x007f:
            if (r3 == 0) goto L_0x0084
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x0085
        L_0x0084:
            r3 = r1
        L_0x0085:
            int r8 = defpackage.v0g.a
            r9 = 26
            if (r8 < r9) goto L_0x009d
            java.lang.String r8 = "video/dolby-vision"
            java.lang.String r9 = r12.n
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x009d
            boolean r8 = defpackage.go8.a(r10)
            if (r8 != 0) goto L_0x009d
            r3 = 256(0x100, float:3.59E-43)
        L_0x009d:
            if (r5 == 0) goto L_0x00c1
            java.util.List r10 = B0(r10, r11, r12, r0, r2)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x00c1
            java.util.ArrayList r10 = defpackage.fo8.h(r12, r10)
            java.lang.Object r10 = r10.get(r1)
            on8 r10 = (defpackage.on8) r10
            boolean r11 = r10.d(r12)
            if (r11 == 0) goto L_0x00c1
            boolean r10 = r10.e(r12)
            if (r10 == 0) goto L_0x00c1
            r1 = 32
        L_0x00c1:
            r10 = r6 | r7
            r10 = r10 | r1
            r10 = r10 | r4
            r10 = r10 | r3
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo8.v0(rx0, ea6):int");
    }

    public final void w() {
        D0();
        int i = this.l2;
        if (i != 0) {
            long j = this.k2;
            m8g m8g = this.Q1;
            Handler handler = (Handler) m8g.a;
            if (handler != null) {
                handler.post(new qof(m8g, j, i, 9));
            }
            this.k2 = 0;
            this.l2 = 0;
        }
        ed3 ed3 = this.Y1;
        if (ed3 != null) {
            ed3.q.c.f();
        } else {
            this.T1.f();
        }
    }

    public final void z(long j, long j3) {
        super.z(j, j3);
        ed3 ed3 = this.Y1;
        if (ed3 != null) {
            try {
                ed3.e(j, j3);
            } catch (VideoSink$VideoSinkException e) {
                throw g(e, e.a, false, 7001);
            }
        }
    }
}
