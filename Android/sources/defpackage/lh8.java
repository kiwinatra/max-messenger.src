package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.uuid.Uuid;

/* renamed from: lh8  reason: default package */
public final class lh8 implements tf5 {
    public static final byte[] n1 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] o1 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(x22.c);
    public static final byte[] p1 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] q1 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID r1 = new UUID(72057594037932032L, -9223371306706625679L);
    public static final Map s1;
    public long A0;
    public long B0 = -1;
    public long C0 = -9223372036854775807L;
    public long D0 = -9223372036854775807L;
    public long E0 = -9223372036854775807L;
    public jh8 F0;
    public boolean G0;
    public int H0;
    public long I0;
    public boolean J0;
    public long K0 = -1;
    public long L0 = -1;
    public long M0 = -9223372036854775807L;
    public pa8 N0;
    public pa8 O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public long S0;
    public long T0;
    public int U0;
    public int V0;
    public int[] W0;
    public final l8b X;
    public int X0;
    public final l8b Y;
    public int Y0;
    public final l8b Z;
    public int Z0;
    public final se4 a;
    public int a1;
    public final g1g b;
    public boolean b1;
    public final SparseArray c;
    public long c1;
    public int d1;
    public int e1;
    public int f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public int j1;
    public byte k1;
    public boolean l1;
    public xf5 m1;
    public final boolean o;
    public final boolean v;
    public final l8b v0;
    public final gze w;
    public final l8b w0;
    public final l8b x;
    public final l8b x0;
    public final l8b y;
    public final l8b y0;
    public final l8b z;
    public ByteBuffer z0;

    static {
        int i = v0g.a;
        HashMap hashMap = new HashMap();
        a81.q(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        a81.q(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        s1 = Collections.unmodifiableMap(hashMap);
    }

    public lh8(int i, gze gze) {
        se4 se4 = new se4(1);
        this.a = se4;
        se4.g = new y35(26, (Object) this);
        this.w = gze;
        boolean z2 = false;
        this.o = (i & 1) == 0;
        this.v = (i & 2) == 0 ? true : z2;
        this.b = new g1g(1, false);
        this.c = new SparseArray();
        this.z = new l8b(4);
        this.X = new l8b(ByteBuffer.allocate(4).putInt(-1).array());
        this.Y = new l8b(4);
        this.x = new l8b(b0h.b);
        this.y = new l8b(4);
        this.Z = new l8b();
        this.v0 = new l8b();
        this.w0 = new l8b(8);
        this.x0 = new l8b();
        this.y0 = new l8b();
        this.W0 = new int[1];
    }

    public static byte[] e(long j, String str, long j2) {
        n79.g(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))});
        int i4 = v0g.a;
        return format.getBytes(x22.c);
    }

    public final void U(xf5 xf5) {
        this.m1 = xf5;
        if (this.v) {
            xf5 = new jk3(xf5, this.w);
        }
        this.m1 = xf5;
    }

    public final void a(int i) {
        if (this.N0 == null || this.O0 == null) {
            throw ParserException.a("Element " + i + " must be in a Cues", (RuntimeException) null);
        }
    }

    public final void b(int i) {
        if (this.F0 == null) {
            throw ParserException.a("Element " + i + " must be in a TrackEntry", (RuntimeException) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.jh8 r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 2
            java.lang.String r3 = "S_TEXT/WEBVTT"
            java.lang.String r4 = "S_TEXT/ASS"
            r5 = 0
            java.lang.String r6 = "S_TEXT/UTF8"
            etf r7 = r1.U
            r15 = 1
            if (r7 == 0) goto L_0x0022
            zpf r8 = r1.Y
            xpf r14 = r1.j
            r9 = r19
            r11 = r21
            r12 = r22
            r13 = r23
            r7.d(r8, r9, r11, r12, r13, r14)
            goto L_0x00f2
        L_0x0022:
            java.lang.String r7 = r1.b
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x003a
            java.lang.String r7 = r1.b
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x003a
            java.lang.String r7 = r1.b
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x0054
        L_0x003a:
            int r7 = r0.V0
            if (r7 <= r15) goto L_0x0044
            java.lang.String r3 = "Skipping subtitle sample in laced block."
            defpackage.i8b.V(r3)
            goto L_0x0054
        L_0x0044:
            long r7 = r0.T0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x0058
            java.lang.String r3 = "Skipping subtitle sample with no duration."
            defpackage.i8b.V(r3)
        L_0x0054:
            r3 = r22
            goto L_0x00cc
        L_0x0058:
            java.lang.String r9 = r1.b
            l8b r10 = r0.v0
            byte[] r11 = r10.a
            r9.getClass()
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = -1
            int r16 = r9.hashCode()
            switch(r16) {
                case 738597099: goto L_0x007e;
                case 1045209816: goto L_0x0075;
                case 1422270023: goto L_0x006c;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x0086
        L_0x006c:
            boolean r3 = r9.equals(r6)
            if (r3 != 0) goto L_0x0073
            goto L_0x0086
        L_0x0073:
            r14 = r2
            goto L_0x0086
        L_0x0075:
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L_0x007c
            goto L_0x0086
        L_0x007c:
            r14 = r15
            goto L_0x0086
        L_0x007e:
            boolean r3 = r9.equals(r4)
            if (r3 != 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r14 = r5
        L_0x0086:
            switch(r14) {
                case 0: goto L_0x00a1;
                case 1: goto L_0x0098;
                case 2: goto L_0x008f;
                default: goto L_0x0089;
            }
        L_0x0089:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x008f:
            java.lang.String r3 = "%02d:%02d:%02d,%03d"
            byte[] r3 = e(r7, r3, r12)
            r4 = 19
            goto L_0x00ab
        L_0x0098:
            java.lang.String r3 = "%02d:%02d:%02d.%03d"
            byte[] r3 = e(r7, r3, r12)
            r4 = 25
            goto L_0x00ab
        L_0x00a1:
            java.lang.String r3 = "%01d:%02d:%02d:%02d"
            r12 = 10000(0x2710, double:4.9407E-320)
            byte[] r3 = e(r7, r3, r12)
            r4 = 21
        L_0x00ab:
            int r6 = r3.length
            java.lang.System.arraycopy(r3, r5, r11, r4, r6)
            int r3 = r10.b
        L_0x00b1:
            int r4 = r10.c
            if (r3 >= r4) goto L_0x00c1
            byte[] r4 = r10.a
            byte r4 = r4[r3]
            if (r4 != 0) goto L_0x00bf
            r10.F(r3)
            goto L_0x00c1
        L_0x00bf:
            int r3 = r3 + r15
            goto L_0x00b1
        L_0x00c1:
            zpf r3 = r1.Y
            int r4 = r10.c
            r3.b(r10, r4, r5)
            int r3 = r10.c
            int r3 = r22 + r3
        L_0x00cc:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r4 = r21 & r4
            if (r4 == 0) goto L_0x00e4
            int r4 = r0.V0
            l8b r6 = r0.y0
            if (r4 <= r15) goto L_0x00dc
            r6.D(r5)
            goto L_0x00e4
        L_0x00dc:
            int r4 = r6.c
            zpf r5 = r1.Y
            r5.b(r6, r4, r2)
            int r3 = r3 + r4
        L_0x00e4:
            r10 = r3
            zpf r6 = r1.Y
            xpf r12 = r1.j
            r7 = r19
            r9 = r21
            r11 = r23
            r6.a(r7, r9, r10, r11, r12)
        L_0x00f2:
            r0.Q0 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh8.c(jh8, long, int, int, int):void");
    }

    public final void d(long j, long j2) {
        this.M0 = -9223372036854775807L;
        this.R0 = 0;
        se4 se4 = this.a;
        se4.c = 0;
        se4.b.clear();
        g1g g1g = (g1g) se4.f;
        g1g.b = 0;
        g1g.c = 0;
        g1g g1g2 = this.b;
        g1g2.b = 0;
        g1g2.c = 0;
        h();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i < sparseArray.size()) {
                etf etf = ((jh8) sparseArray.valueAt(i)).U;
                if (etf != null) {
                    etf.b = false;
                    etf.c = 0;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void f(hf4 hf4, int i) {
        l8b l8b = this.z;
        if (l8b.c < i) {
            byte[] bArr = l8b.a;
            if (bArr.length < i) {
                l8b.b(Math.max(bArr.length * 2, i));
            }
            byte[] bArr2 = l8b.a;
            int i2 = l8b.c;
            hf4.j(bArr2, i2, i - i2, false);
            l8b.F(i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v37, resolved type: k0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v38, resolved type: k0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v41, resolved type: k0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v52, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v37, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03cb, code lost:
        r8 = r5;
        r7 = r31;
        r5 = r32;
        r6 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0435, code lost:
        switch(r8) {
            case 0: goto L_0x0447;
            case 1: goto L_0x0447;
            case 2: goto L_0x0447;
            case 3: goto L_0x0447;
            case 4: goto L_0x0447;
            case 5: goto L_0x0447;
            case 6: goto L_0x0447;
            case 7: goto L_0x0447;
            case 8: goto L_0x0447;
            case 9: goto L_0x0447;
            case 10: goto L_0x0447;
            case 11: goto L_0x0447;
            case 12: goto L_0x0447;
            case 13: goto L_0x0447;
            case ru.ok.tamtam.nano.Protos.Attaches.Attach.LOCATION :int: goto L_0x0447;
            case ru.ok.tamtam.nano.Protos.Attaches.Attach.DAILY_MEDIA :int: goto L_0x0447;
            case 16: goto L_0x0447;
            case org.apache.http.util.LangUtils.HASH_SEED :int: goto L_0x0447;
            case 18: goto L_0x0447;
            case 19: goto L_0x0447;
            case 20: goto L_0x0447;
            case 21: goto L_0x0447;
            case 22: goto L_0x0447;
            case 23: goto L_0x0447;
            case one.me.common.drawable.SavedMessagesIconDrawable.NORMAL_ICON_SIZE :int: goto L_0x0447;
            case 25: goto L_0x0447;
            case 26: goto L_0x0447;
            case 27: goto L_0x0447;
            case 28: goto L_0x0447;
            case 29: goto L_0x0447;
            case 30: goto L_0x0447;
            case 31: goto L_0x0447;
            case 32: goto L_0x0447;
            default: goto L_0x0438;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0438, code lost:
        r32 = r2;
        r33 = r3;
        r17 = r4;
        r35 = r5;
        r31 = r10;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0447, code lost:
        r8 = r9.m1;
        r23 = r9;
        r9 = "video/x-unknown";
        r26 = r12;
        r24 = r8;
        r25 = r0.c;
        r27 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x046d, code lost:
        switch(r1.hashCode()) {
            case -2095576542: goto L_0x0653;
            case -2095575984: goto L_0x0648;
            case -1985379776: goto L_0x063d;
            case -1784763192: goto L_0x0632;
            case -1730367663: goto L_0x0627;
            case -1482641358: goto L_0x061c;
            case -1482641357: goto L_0x060f;
            case -1373388978: goto L_0x0602;
            case -933872740: goto L_0x05f2;
            case -538363189: goto L_0x05e2;
            case -538363109: goto L_0x05d2;
            case -425012669: goto L_0x05c2;
            case -356037306: goto L_0x05b2;
            case 62923557: goto L_0x05a2;
            case 62923603: goto L_0x0592;
            case 62927045: goto L_0x0582;
            case 82318131: goto L_0x0572;
            case 82338133: goto L_0x0562;
            case 82338134: goto L_0x0552;
            case 99146302: goto L_0x0542;
            case 444813526: goto L_0x0532;
            case 542569478: goto L_0x0522;
            case 635596514: goto L_0x0512;
            case 725948237: goto L_0x0502;
            case 725957860: goto L_0x04f2;
            case 738597099: goto L_0x04e2;
            case 855502857: goto L_0x04d2;
            case 1045209816: goto L_0x04c2;
            case 1422270023: goto L_0x04b2;
            case 1809237540: goto L_0x04a2;
            case 1950749482: goto L_0x0492;
            case 1950789798: goto L_0x0482;
            case 1951062397: goto L_0x0475;
            default: goto L_0x0470;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0470, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0472, code lost:
        r10 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0479, code lost:
        if (r1.equals(r10) != false) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x047c, code lost:
        r31 = r10;
        r10 = ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0482, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x048a, code lost:
        if (r1.equals("A_FLAC") != false) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x048e, code lost:
        r10 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0492, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x049a, code lost:
        if (r1.equals("A_EAC3") != false) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x049e, code lost:
        r10 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04a2, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04aa, code lost:
        if (r1.equals("V_MPEG2") != false) goto L_0x04ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04ae, code lost:
        r10 = 29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04b2, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04ba, code lost:
        if (r1.equals("S_TEXT/UTF8") != false) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04be, code lost:
        r10 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04c2, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04ca, code lost:
        if (r1.equals("S_TEXT/WEBVTT") != false) goto L_0x04ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04ce, code lost:
        r10 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04d2, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04da, code lost:
        if (r1.equals("V_MPEGH/ISO/HEVC") != false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04de, code lost:
        r10 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04e2, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04ea, code lost:
        if (r1.equals("S_TEXT/ASS") != false) goto L_0x04ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04ee, code lost:
        r10 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04f2, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04fa, code lost:
        if (r1.equals("A_PCM/INT/LIT") != false) goto L_0x04fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04fe, code lost:
        r10 = 24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0502, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x050a, code lost:
        if (r1.equals("A_PCM/INT/BIG") != false) goto L_0x050e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x050e, code lost:
        r10 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0512, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x051a, code lost:
        if (r1.equals("A_PCM/FLOAT/IEEE") != false) goto L_0x051e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x051e, code lost:
        r10 = 22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0522, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x052a, code lost:
        if (r1.equals("A_DTS/EXPRESS") != false) goto L_0x052e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x052e, code lost:
        r10 = 21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0532, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x053a, code lost:
        if (r1.equals("V_THEORA") != false) goto L_0x053e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x053e, code lost:
        r10 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0542, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x054a, code lost:
        if (r1.equals("S_HDMV/PGS") != false) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x054e, code lost:
        r10 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0552, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x055a, code lost:
        if (r1.equals("V_VP9") != false) goto L_0x055e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x055e, code lost:
        r10 = 18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0562, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x056a, code lost:
        if (r1.equals("V_VP8") != false) goto L_0x056e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x056e, code lost:
        r10 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0572, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x057a, code lost:
        if (r1.equals("V_AV1") != false) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x057e, code lost:
        r10 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0582, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x058a, code lost:
        if (r1.equals("A_DTS") != false) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x058e, code lost:
        r10 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0592, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x059a, code lost:
        if (r1.equals("A_AC3") != false) goto L_0x059e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x059e, code lost:
        r10 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05a2, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05aa, code lost:
        if (r1.equals("A_AAC") != false) goto L_0x05ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05ae, code lost:
        r10 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05b2, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05ba, code lost:
        if (r1.equals("A_DTS/LOSSLESS") != false) goto L_0x05be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05be, code lost:
        r10 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05c2, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05ca, code lost:
        if (r1.equals("S_VOBSUB") != false) goto L_0x05ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05ce, code lost:
        r10 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05d2, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05da, code lost:
        if (r1.equals("V_MPEG4/ISO/AVC") != false) goto L_0x05de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05de, code lost:
        r10 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05e2, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05ea, code lost:
        if (r1.equals("V_MPEG4/ISO/ASP") != false) goto L_0x05ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05ee, code lost:
        r10 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05f2, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05fa, code lost:
        if (r1.equals("S_DVBSUB") != false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05fe, code lost:
        r10 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0602, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x060a, code lost:
        if (r1.equals("V_MS/VFW/FOURCC") != false) goto L_0x060d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x060d, code lost:
        r10 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x060f, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0617, code lost:
        if (r1.equals("A_MPEG/L3") != false) goto L_0x061a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x061a, code lost:
        r10 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x061c, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0622, code lost:
        if (r1.equals(r2) != false) goto L_0x0625;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0625, code lost:
        r10 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0627, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x062d, code lost:
        if (r1.equals(r3) != false) goto L_0x0630;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0630, code lost:
        r10 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0632, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0638, code lost:
        if (r1.equals(r4) != false) goto L_0x063b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x063b, code lost:
        r10 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x063d, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0643, code lost:
        if (r1.equals(r5) != false) goto L_0x0646;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0646, code lost:
        r10 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0648, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x064e, code lost:
        if (r1.equals(r6) != false) goto L_0x0651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0651, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0653, code lost:
        r31 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0659, code lost:
        if (r1.equals(r7) != false) goto L_0x065d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x065d, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x065e, code lost:
        switch(r10) {
            case 0: goto L_0x0a80;
            case 1: goto L_0x0a80;
            case 2: goto L_0x0a09;
            case 3: goto L_0x09f7;
            case 4: goto L_0x096a;
            case 5: goto L_0x095d;
            case 6: goto L_0x0948;
            case 7: goto L_0x0888;
            case 8: goto L_0x086e;
            case 9: goto L_0x0a80;
            case 10: goto L_0x084f;
            case 11: goto L_0x083d;
            case 12: goto L_0x0835;
            case 13: goto L_0x0809;
            case ru.ok.tamtam.nano.Protos.Attaches.Attach.LOCATION :int: goto L_0x07ff;
            case ru.ok.tamtam.nano.Protos.Attaches.Attach.DAILY_MEDIA :int: goto L_0x07f5;
            case 16: goto L_0x07eb;
            case org.apache.http.util.LangUtils.HASH_SEED :int: goto L_0x07e1;
            case 18: goto L_0x07d7;
            case 19: goto L_0x07ce;
            case 20: goto L_0x07c8;
            case 21: goto L_0x07f5;
            case 22: goto L_0x079e;
            case 23: goto L_0x075f;
            case one.me.common.drawable.SavedMessagesIconDrawable.NORMAL_ICON_SIZE :int: goto L_0x072f;
            case 25: goto L_0x071c;
            case 26: goto L_0x06f5;
            case 27: goto L_0x06ed;
            case 28: goto L_0x06e5;
            case 29: goto L_0x06de;
            case 30: goto L_0x06d0;
            case 31: goto L_0x06b8;
            case 32: goto L_0x0669;
            default: goto L_0x0661;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0668, code lost:
        throw androidx.media3.common.ParserException.a("Unrecognized codec identifier.", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0669, code lost:
        r1 = new java.util.ArrayList(3);
        r1.add(r0.a(r0.b));
        r10 = java.nio.ByteBuffer.allocate(8);
        r14 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r32 = r2;
        r33 = r3;
        r1.add(r10.order(r14).putLong(r0.S).array());
        r1.add(java.nio.ByteBuffer.allocate(8).order(r14).putLong(r0.T).array());
        r9 = "audio/opus";
        r10 = r1;
        r17 = r4;
        r3 = -1;
        r14 = null;
        r4 = 5760;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x06b8, code lost:
        r32 = r2;
        r33 = r3;
        r9 = "audio/flac";
        r10 = java.util.Collections.singletonList(r0.a(r1));
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x06cb, code lost:
        r3 = -1;
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x06cd, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x06d0, code lost:
        r32 = r2;
        r33 = r3;
        r9 = "audio/eac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x06d6, code lost:
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x06da, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x06db, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06dc, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x06de, code lost:
        r32 = r2;
        r33 = r3;
        r9 = "video/mpeg2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06e5, code lost:
        r32 = r2;
        r33 = r3;
        r17 = r4;
        r9 = "application/x-subrip";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x06ed, code lost:
        r32 = r2;
        r33 = r3;
        r17 = r4;
        r9 = "text/vtt";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x06f5, code lost:
        r32 = r2;
        r33 = r3;
        r1 = defpackage.ey6.a(new defpackage.l8b(r0.a(r0.b)));
        r0.Z = r1.b;
        r9 = "video/hevc";
        r2 = r1.a;
        r1 = r1.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0712, code lost:
        r14 = r1;
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0714, code lost:
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0716, code lost:
        r3 = -1;
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x071c, code lost:
        r32 = r2;
        r33 = r3;
        r10 = defpackage.tb7.u(o1, r0.a(r1));
        r17 = r4;
        r9 = "text/x-ssa";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x072f, code lost:
        r32 = r2;
        r33 = r3;
        r1 = defpackage.v0g.C(r0.Q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0739, code lost:
        if (r1 != 0) goto L_0x0756;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x073b, code lost:
        defpackage.i8b.V("Unsupported little endian PCM bit depth: " + r0.Q + ". Setting mimeType to audio/x-unknown");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0751, code lost:
        r17 = r4;
        r9 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0756, code lost:
        r3 = r1;
        r17 = r4;
        r9 = "audio/raw";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x075f, code lost:
        r32 = r2;
        r33 = r3;
        r1 = r0.Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0767, code lost:
        if (r1 != 8) goto L_0x0772;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0769, code lost:
        r17 = r4;
        r9 = "audio/raw";
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0774, code lost:
        if (r1 != 16) goto L_0x0779;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0776, code lost:
        r1 = 268435456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x077b, code lost:
        if (r1 != 24) goto L_0x0780;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x077d, code lost:
        r1 = 1342177280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0782, code lost:
        if (r1 != 32) goto L_0x0787;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0784, code lost:
        r1 = 1610612736;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0787, code lost:
        defpackage.i8b.V("Unsupported big endian PCM bit depth: " + r0.Q + ". Setting mimeType to audio/x-unknown");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x079e, code lost:
        r32 = r2;
        r33 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x07a6, code lost:
        if (r0.Q != 32) goto L_0x07b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x07a8, code lost:
        r17 = r4;
        r9 = "audio/raw";
        r3 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x07b1, code lost:
        defpackage.i8b.V("Unsupported floating point PCM bit depth: " + r0.Q + ". Setting mimeType to audio/x-unknown");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x07c8, code lost:
        r32 = r2;
        r33 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x07ce, code lost:
        r32 = r2;
        r33 = r3;
        r17 = r4;
        r9 = "application/pgs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x07d7, code lost:
        r32 = r2;
        r33 = r3;
        r9 = "video/x-vnd.on2.vp9";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x07e1, code lost:
        r32 = r2;
        r33 = r3;
        r9 = "video/x-vnd.on2.vp8";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x07eb, code lost:
        r32 = r2;
        r33 = r3;
        r9 = "video/av01";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x07f5, code lost:
        r32 = r2;
        r33 = r3;
        r9 = "audio/vnd.dts";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x07ff, code lost:
        r32 = r2;
        r33 = r3;
        r9 = "audio/ac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0809, code lost:
        r32 = r2;
        r33 = r3;
        r1 = java.util.Collections.singletonList(r0.a(r1));
        r3 = r0.k;
        r2 = defpackage.iq.T(new defpackage.ky1(r3, (byte) 0, r3.length, 2), false);
        r0.R = r2.a;
        r0.P = r2.b;
        r9 = "audio/mp4a-latm";
        r10 = r1;
        r14 = r2.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0835, code lost:
        r32 = r2;
        r33 = r3;
        r9 = "audio/vnd.dts.hd";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x083d, code lost:
        r32 = r2;
        r33 = r3;
        r10 = defpackage.tb7.t(r0.a(r1));
        r17 = r4;
        r9 = "application/vobsub";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x084f, code lost:
        r32 = r2;
        r33 = r3;
        r1 = defpackage.ke0.a(new defpackage.l8b(r0.a(r0.b)));
        r0.Z = r1.b;
        r9 = "video/avc";
        r2 = r1.a;
        r1 = r1.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x086e, code lost:
        r32 = r2;
        r33 = r3;
        r3 = new byte[4];
        java.lang.System.arraycopy(r0.a(r1), 0, r3, 0, 4);
        r10 = defpackage.tb7.t(r3);
        r17 = r4;
        r9 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0888, code lost:
        r32 = r2;
        r33 = r3;
        r1 = new defpackage.l8b(r0.a(r0.b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:?, code lost:
        r1.H(16);
        r28 = r1.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x08a5, code lost:
        if (r28 != 1482049860) goto L_0x08bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x08ab, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:?, code lost:
        r1 = new android.util.Pair("video/divx", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x08af, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x08b6, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x08b9, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x08c1, code lost:
        if (r28 != 859189832) goto L_0x08cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x08c7, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:?, code lost:
        r1 = new android.util.Pair("video/3gpp", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x08d1, code lost:
        if (r28 != 826496599) goto L_0x0921;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:?, code lost:
        r3 = r1.b + 20;
        r1 = r1.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x08dd, code lost:
        if (r3 >= (r1.length - 4)) goto L_0x0917;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x08e1, code lost:
        if (r1[r3] != 0) goto L_0x0912;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x08e3, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x08e8, code lost:
        if (r1[r3 + 1] != 0) goto L_0x090f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x08ef, code lost:
        if (r1[r3 + 2] != 1) goto L_0x090f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x08f8, code lost:
        if (r1[r3 + 3] != 15) goto L_0x090d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x08fa, code lost:
        r1 = new android.util.Pair("video/wvc1", java.util.Collections.singletonList(java.util.Arrays.copyOfRange(r1, r3, r1.length)));
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x090d, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0915, code lost:
        r3 = r3 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:?, code lost:
        throw androidx.media3.common.ParserException.a("Failed to find FourCC VC1 initialization data", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x091f, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0921, code lost:
        defpackage.i8b.V("Unknown FourCC. Setting mimeType to video/x-unknown");
        r3 = null;
        r1 = new android.util.Pair(r9, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0930, code lost:
        r9 = (java.lang.String) r1.first;
        r14 = r3;
        r17 = r4;
        r10 = r1.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0947, code lost:
        throw androidx.media3.common.ParserException.a("Error parsing FourCC private data", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0948, code lost:
        r32 = r2;
        r33 = r3;
        r9 = "audio/mpeg";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0954, code lost:
        r17 = r4;
        r3 = -1;
        r4 = kotlin.io.ConstantsKt.DEFAULT_BLOCK_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x095d, code lost:
        r32 = r2;
        r33 = r3;
        r9 = "audio/mpeg-L2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x096a, code lost:
        r32 = r2;
        r33 = r3;
        r1 = r0.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x097e, code lost:
        if (r1[0] != 2) goto L_0x09ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0980, code lost:
        r2 = 0;
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0982, code lost:
        r17 = r4;
        r10 = r1[r9] & kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0989, code lost:
        if (r10 != 255) goto L_0x0991;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x098b, code lost:
        r2 = r2 + kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
        r9 = r9 + 1;
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0991, code lost:
        r9 = r9 + 1;
        r2 = r2 + r10;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0995, code lost:
        r14 = r1[r9] & kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0998, code lost:
        if (r14 != 255) goto L_0x099e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x099a, code lost:
        r10 = r10 + kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x099e, code lost:
        r9 = r9 + 1;
        r10 = r10 + r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x09a3, code lost:
        if (r1[r9] != 1) goto L_0x09e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x09a5, code lost:
        r4 = new byte[r2];
        java.lang.System.arraycopy(r1, r9, r4, 0, r2);
        r9 = r9 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x09af, code lost:
        if (r1[r9] != 3) goto L_0x09e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x09b1, code lost:
        r9 = r9 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x09b5, code lost:
        if (r1[r9] != 5) goto L_0x09da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x09b7, code lost:
        r2 = new byte[(r1.length - r9)];
        java.lang.System.arraycopy(r1, r9, r2, 0, r1.length - r9);
        r1 = new java.util.ArrayList(2);
        r1.add(r4);
        r1.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x09cd, code lost:
        r9 = "audio/vorbis";
        r10 = r1;
        r4 = 8192;
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x09d8, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x09da, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x09df, code lost:
        throw androidx.media3.common.ParserException.a("Error parsing vorbis codec private", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x09e5, code lost:
        throw androidx.media3.common.ParserException.a("Error parsing vorbis codec private", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x09eb, code lost:
        throw androidx.media3.common.ParserException.a("Error parsing vorbis codec private", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x09f1, code lost:
        throw androidx.media3.common.ParserException.a("Error parsing vorbis codec private", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x09f6, code lost:
        throw androidx.media3.common.ParserException.a("Error parsing vorbis codec private", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x09f7, code lost:
        r32 = r2;
        r33 = r3;
        r17 = r4;
        r0.U = new defpackage.etf(1);
        r9 = "audio/true-hd";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0a09, code lost:
        r32 = r2;
        r33 = r3;
        r17 = r4;
        r3 = new defpackage.l8b(r0.a(r0.b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:?, code lost:
        r4 = r3.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0a21, code lost:
        if (r4 != 1) goto L_0x0a26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0a29, code lost:
        if (r4 != 65534) goto L_0x0a70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0a2b, code lost:
        r3.G(24);
        r9 = r3.o();
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0a3c, code lost:
        if (r9 != r4.getMostSignificantBits()) goto L_0x0a72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0a48, code lost:
        if (r3.o() != r4.getLeastSignificantBits()) goto L_0x0a72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0a4a, code lost:
        r3 = defpackage.v0g.C(r0.Q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0a50, code lost:
        if (r3 != 0) goto L_0x0a6c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0a52, code lost:
        defpackage.i8b.V("Unsupported PCM bit depth: " + r0.Q + ". Setting mimeType to audio/x-unknown");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0a68, code lost:
        r9 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0a6c, code lost:
        r9 = "audio/raw";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0a72, code lost:
        defpackage.i8b.V("Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0a7f, code lost:
        throw androidx.media3.common.ParserException.a("Error parsing MS/ACM codec private", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0a80, code lost:
        r32 = r2;
        r33 = r3;
        r17 = r4;
        r3 = r0.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0a8c, code lost:
        if (r3 != null) goto L_0x0a90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0a8e, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0a90, code lost:
        r3 = java.util.Collections.singletonList(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0a94, code lost:
        r9 = "video/mp4v-es";
        r10 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0a9b, code lost:
        if (r0.O == null) goto L_0x0aae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0a9d, code lost:
        r1 = defpackage.er4.a(new defpackage.l8b(r0.O));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0aa8, code lost:
        if (r1 == null) goto L_0x0aae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0aaa, code lost:
        r14 = r1.a;
        r9 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0aae, code lost:
        r1 = r0.W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0ab2, code lost:
        if (r0.V == false) goto L_0x0ab6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0ab4, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0ab6, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0ab7, code lost:
        r1 = r1 | r2;
        r2 = new defpackage.ba6();
        r19 = defpackage.vq9.h(r9);
        r35 = r5;
        r5 = s1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0ac5, code lost:
        if (r19 == false) goto L_0x0ad6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0ac7, code lost:
        r2.A = r0.P;
        r2.B = r0.R;
        r2.C = r3;
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0ada, code lost:
        if (defpackage.vq9.k(r9) == false) goto L_0x0c76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0ade, code lost:
        if (r0.r != 0) goto L_0x0af2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0ae0, code lost:
        r3 = r0.p;
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0ae3, code lost:
        if (r3 != -1) goto L_0x0ae7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0ae5, code lost:
        r3 = r0.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0ae7, code lost:
        r0.p = r3;
        r3 = r0.q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0aeb, code lost:
        if (r3 != -1) goto L_0x0aef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0aed, code lost:
        r3 = r0.n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0aef, code lost:
        r0.q = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0af2, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0af3, code lost:
        r3 = r0.p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0af7, code lost:
        if (r3 == r8) goto L_0x0b07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0af9, code lost:
        r12 = r0.q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0afb, code lost:
        if (r12 == r8) goto L_0x0b07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0afd, code lost:
        r3 = ((float) (r0.n * r3)) / ((float) (r0.m * r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0b07, code lost:
        r3 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0b0a, code lost:
        if (r0.y == false) goto L_0x0bf2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0b10, code lost:
        if (r0.E == -1.0f) goto L_0x0b48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0b16, code lost:
        if (r0.F == -1.0f) goto L_0x0b48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0b1c, code lost:
        if (r0.G == -1.0f) goto L_0x0b48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0b22, code lost:
        if (r0.H == -1.0f) goto L_0x0b48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0b28, code lost:
        if (r0.I == -1.0f) goto L_0x0b48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0b2e, code lost:
        if (r0.J == -1.0f) goto L_0x0b48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0b34, code lost:
        if (r0.K == -1.0f) goto L_0x0b48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0b3a, code lost:
        if (r0.L == -1.0f) goto L_0x0b48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0b40, code lost:
        if (r0.M == -1.0f) goto L_0x0b48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0b46, code lost:
        if (r0.N != -1.0f) goto L_0x0b4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0b48, code lost:
        r8 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0b4c, code lost:
        r8 = 25;
        r11 = new byte[25];
        r12 = java.nio.ByteBuffer.wrap(r11).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r12.put((byte) 0);
        r12.putShort((short) ((int) ((r0.E * 50000.0f) + 0.5f)));
        r12.putShort((short) ((int) ((r0.F * 50000.0f) + 0.5f)));
        r12.putShort((short) ((int) ((r0.G * 50000.0f) + 0.5f)));
        r12.putShort((short) ((int) ((r0.H * 50000.0f) + 0.5f)));
        r12.putShort((short) ((int) ((r0.I * 50000.0f) + 0.5f)));
        r12.putShort((short) ((int) ((r0.J * 50000.0f) + 0.5f)));
        r12.putShort((short) ((int) ((r0.K * 50000.0f) + 0.5f)));
        r12.putShort((short) ((int) ((r0.L * 50000.0f) + 0.5f)));
        r12.putShort((short) ((int) (r0.M + 0.5f)));
        r12.putShort((short) ((int) (r0.N + 0.5f)));
        r12.putShort((short) r0.C);
        r12.putShort((short) r0.D);
        r42 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0bd4, code lost:
        r42 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0bd6, code lost:
        r11 = r0.z;
        r12 = r0.B;
        r13 = r0.A;
        r15 = r0.o;
        r11 = new defpackage.m53(r11, r12, r13, r15, r15, r42);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0bf2, code lost:
        r8 = 25;
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0bf5, code lost:
        r12 = r0.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0bf7, code lost:
        if (r12 == null) goto L_0x0c0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0bfd, code lost:
        if (r5.containsKey(r12) == false) goto L_0x0c0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0bff, code lost:
        r12 = ((java.lang.Integer) r5.get(r0.a)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0c0c, code lost:
        r12 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0c0f, code lost:
        if (r0.s != 0) goto L_0x0c5d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0c18, code lost:
        if (java.lang.Float.compare(r0.t, defpackage.c44.DEFAULT_ASPECT_RATIO) != 0) goto L_0x0c5d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0c20, code lost:
        if (java.lang.Float.compare(r0.u, defpackage.c44.DEFAULT_ASPECT_RATIO) != 0) goto L_0x0c5d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0c28, code lost:
        if (java.lang.Float.compare(r0.v, defpackage.c44.DEFAULT_ASPECT_RATIO) != 0) goto L_0x0c2c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0c2a, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0c34, code lost:
        if (java.lang.Float.compare(r0.v, 90.0f) != 0) goto L_0x0c39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0c36, code lost:
        r12 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0c41, code lost:
        if (java.lang.Float.compare(r0.v, -180.0f) == 0) goto L_0x0c5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0c4b, code lost:
        if (java.lang.Float.compare(r0.v, 180.0f) != 0) goto L_0x0c4e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0c56, code lost:
        if (java.lang.Float.compare(r0.v, -90.0f) != 0) goto L_0x0c5d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0c58, code lost:
        r12 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0c5b, code lost:
        r12 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0c5d, code lost:
        r2.s = r0.m;
        r2.t = r0.n;
        r2.w = r3;
        r2.v = r12;
        r2.x = r0.w;
        r2.y = r0.x;
        r2.z = r11;
        r3 = r8;
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0c7c, code lost:
        if ("application/x-subrip".equals(r9) != false) goto L_0x0ca7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0c82, code lost:
        if ("text/x-ssa".equals(r9) != false) goto L_0x0ca7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0c88, code lost:
        if ("text/vtt".equals(r9) != false) goto L_0x0ca7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0c8e, code lost:
        if ("application/vobsub".equals(r9) != false) goto L_0x0ca7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0c94, code lost:
        if ("application/pgs".equals(r9) != false) goto L_0x0ca7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0c9c, code lost:
        if (r27.equals(r9) == false) goto L_0x0c9f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0ca6, code lost:
        throw androidx.media3.common.ParserException.a("Unexpected MIME type.", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0ca7, code lost:
        r8 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0ca8, code lost:
        r11 = r0.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0caa, code lost:
        if (r11 == null) goto L_0x0cb6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0cb0, code lost:
        if (r5.containsKey(r11) != false) goto L_0x0cb6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0cb2, code lost:
        r2.b = r0.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0cb6, code lost:
        r2.a = java.lang.Integer.toString(r25);
        r2.m = defpackage.vq9.l(r9);
        r2.n = r4;
        r2.d = r0.X;
        r2.e = r1;
        r2.p = r10;
        r2.i = r14;
        r2.q = r0.l;
        r1 = new defpackage.ea6(r2);
        r2 = r24.B(r0.c, r8);
        r0.Y = r2;
        r2.e(r1);
        r26.put(r0.c, r0);
        r9 = r23;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0cee, code lost:
        r9.F0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0232, code lost:
        r7 = r31;
        r5 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0236, code lost:
        r6 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0238, code lost:
        r8 = 65535;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.vf5 r44, defpackage.yl4 r45) {
        /*
            r43 = this;
            r0 = r43
            r1 = r45
            java.lang.String r2 = "A_MPEG/L2"
            java.lang.String r3 = "A_VORBIS"
            java.lang.String r4 = "A_TRUEHD"
            java.lang.String r5 = "A_MS/ACM"
            java.lang.String r6 = "V_MPEG4/ISO/SP"
            java.lang.String r7 = "V_MPEG4/ISO/AP"
            java.lang.String r10 = "A_OPUS"
            r11 = 0
            r0.Q0 = r11
            r19 = 1
        L_0x0017:
            if (r19 == 0) goto L_0x10e0
            boolean r9 = r0.Q0
            if (r9 != 0) goto L_0x10e0
            se4 r9 = r0.a
            java.lang.Object r12 = r9.g
            y35 r12 = (defpackage.y35) r12
            defpackage.n79.o(r12)
        L_0x0026:
            java.util.ArrayDeque r12 = r9.b
            java.lang.Object r19 = r12.peek()
            r14 = r19
            re4 r14 = (defpackage.re4) r14
            r19 = r12
            r8 = 374648427(0x1654ae6b, float:1.718026E-25)
            r15 = 357149030(0x1549a966, float:4.072526E-26)
            if (r14 == 0) goto L_0x0d97
            r12 = r44
            hf4 r12 = (defpackage.hf4) r12
            long r11 = r12.o
            long r13 = r14.b
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L_0x0d97
            java.lang.Object r9 = r9.g
            y35 r9 = (defpackage.y35) r9
            java.lang.Object r11 = r19.pop()
            re4 r11 = (defpackage.re4) r11
            int r11 = r11.a
            java.lang.Object r9 = r9.b
            lh8 r9 = (defpackage.lh8) r9
            xf5 r12 = r9.m1
            defpackage.n79.o(r12)
            android.util.SparseArray r12 = r9.c
            r13 = 160(0xa0, float:2.24E-43)
            r24 = 0
            if (r11 == r13) goto L_0x0cf9
            r13 = 174(0xae, float:2.44E-43)
            if (r11 == r13) goto L_0x021c
            r13 = 19899(0x4dbb, float:2.7884E-41)
            if (r11 == r13) goto L_0x01f8
            r13 = 25152(0x6240, float:3.5245E-41)
            if (r11 == r13) goto L_0x01c3
            r13 = 28032(0x6d80, float:3.9281E-41)
            if (r11 == r13) goto L_0x01a7
            if (r11 == r15) goto L_0x0184
            if (r11 == r8) goto L_0x016a
            r8 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r11 == r8) goto L_0x008a
            r32 = r2
            r33 = r3
            r17 = r4
            r35 = r5
            r2 = r10
            r1 = 0
        L_0x0086:
            r3 = 25
            goto L_0x0d8d
        L_0x008a:
            boolean r8 = r9.G0
            if (r8 != 0) goto L_0x014f
            xf5 r8 = r9.m1
            pa8 r11 = r9.N0
            pa8 r12 = r9.O0
            long r13 = r9.B0
            r20 = -1
            int r13 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r13 == 0) goto L_0x00b3
            long r13 = r9.E0
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r13 == 0) goto L_0x00b3
            if (r11 == 0) goto L_0x00b3
            int r13 = r11.b
            if (r13 == 0) goto L_0x00b3
            if (r12 == 0) goto L_0x00b3
            int r14 = r12.b
            if (r14 == r13) goto L_0x00bb
        L_0x00b3:
            r32 = r5
            r33 = r6
            r31 = r7
            goto L_0x0140
        L_0x00bb:
            int[] r14 = new int[r13]
            long[] r15 = new long[r13]
            long[] r1 = new long[r13]
            long[] r0 = new long[r13]
            r31 = r7
            r7 = 0
        L_0x00c6:
            if (r7 >= r13) goto L_0x00e3
            long r26 = r11.b(r7)
            r0[r7] = r26
            r32 = r5
            r33 = r6
            long r5 = r9.B0
            long r26 = r12.b(r7)
            long r26 = r26 + r5
            r15[r7] = r26
            r5 = 1
            int r7 = r7 + r5
            r5 = r32
            r6 = r33
            goto L_0x00c6
        L_0x00e3:
            r32 = r5
            r33 = r6
            r5 = 1
            r6 = 0
        L_0x00e9:
            int r7 = r13 + -1
            if (r6 >= r7) goto L_0x0103
            int r7 = r6 + 1
            r11 = r15[r7]
            r26 = r15[r6]
            long r11 = r11 - r26
            int r5 = (int) r11
            r14[r6] = r5
            r11 = r0[r7]
            r26 = r0[r6]
            long r11 = r11 - r26
            r1[r6] = r11
            r6 = r7
            r5 = 1
            goto L_0x00e9
        L_0x0103:
            long r5 = r9.B0
            long r11 = r9.A0
            long r5 = r5 + r11
            r11 = r15[r7]
            long r5 = r5 - r11
            int r5 = (int) r5
            r14[r7] = r5
            long r5 = r9.E0
            r11 = r0[r7]
            long r5 = r5 - r11
            r1[r7] = r5
            int r11 = (r5 > r24 ? 1 : (r5 == r24 ? 0 : -1))
            if (r11 > 0) goto L_0x013a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Discarding last cue point with unexpected duration: "
            r11.<init>(r12)
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            defpackage.i8b.V(r5)
            int[] r14 = java.util.Arrays.copyOf(r14, r7)
            long[] r15 = java.util.Arrays.copyOf(r15, r7)
            long[] r1 = java.util.Arrays.copyOf(r1, r7)
            long[] r0 = java.util.Arrays.copyOf(r0, r7)
        L_0x013a:
            p03 r5 = new p03
            r5.<init>(r14, r15, r1, r0)
            goto L_0x0147
        L_0x0140:
            me0 r5 = new me0
            long r0 = r9.E0
            r5.<init>(r0)
        L_0x0147:
            r8.M(r5)
            r0 = 1
            r9.G0 = r0
        L_0x014d:
            r0 = 0
            goto L_0x0156
        L_0x014f:
            r32 = r5
            r33 = r6
            r31 = r7
            goto L_0x014d
        L_0x0156:
            r9.N0 = r0
            r9.O0 = r0
        L_0x015a:
            r17 = r4
            r7 = r31
            r35 = r32
            r6 = r33
            r1 = 0
            r32 = r2
            r33 = r3
            r2 = r10
            goto L_0x0086
        L_0x016a:
            r32 = r5
            r33 = r6
            r31 = r7
            r0 = 0
            int r1 = r12.size()
            if (r1 == 0) goto L_0x017d
            xf5 r0 = r9.m1
            r0.v()
            goto L_0x015a
        L_0x017d:
            java.lang.String r1 = "No valid tracks were found"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x0184:
            r32 = r5
            r33 = r6
            r31 = r7
            long r0 = r9.C0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x019a
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r9.C0 = r0
        L_0x019a:
            long r0 = r9.D0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x015a
            long r0 = r9.i(r0)
            r9.E0 = r0
            goto L_0x015a
        L_0x01a7:
            r32 = r5
            r33 = r6
            r31 = r7
            r9.b(r11)
            jh8 r0 = r9.F0
            boolean r1 = r0.h
            if (r1 == 0) goto L_0x015a
            byte[] r0 = r0.i
            if (r0 != 0) goto L_0x01bb
            goto L_0x015a
        L_0x01bb:
            java.lang.String r0 = "Combining encryption and compression is not supported"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x01c3:
            r32 = r5
            r33 = r6
            r31 = r7
            r9.b(r11)
            jh8 r0 = r9.F0
            boolean r1 = r0.h
            if (r1 == 0) goto L_0x015a
            xpf r1 = r0.j
            if (r1 == 0) goto L_0x01f0
            yv4 r5 = new yv4
            wv4 r6 = new wv4
            java.util.UUID r7 = defpackage.zw0.a
            java.lang.String r8 = "video/webm"
            byte[] r1 = r1.b
            r9 = 0
            r6.<init>(r7, r9, r8, r1)
            wv4[] r1 = new defpackage.wv4[]{r6}
            r6 = 1
            r5.<init>(r9, r6, r1)
            r0.l = r5
            goto L_0x015a
        L_0x01f0:
            r9 = 0
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r9)
            throw r0
        L_0x01f8:
            r32 = r5
            r33 = r6
            r31 = r7
            int r0 = r9.H0
            r1 = -1
            if (r0 == r1) goto L_0x0214
            long r5 = r9.I0
            r7 = -1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0214
            r1 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r0 != r1) goto L_0x015a
            r9.K0 = r5
            goto L_0x015a
        L_0x0214:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x021c:
            r32 = r5
            r33 = r6
            r31 = r7
            jh8 r0 = r9.F0
            defpackage.n79.o(r0)
            java.lang.String r1 = r0.b
            if (r1 == 0) goto L_0x0cf1
            int r5 = r1.hashCode()
            switch(r5) {
                case -2095576542: goto L_0x0426;
                case -2095575984: goto L_0x0414;
                case -1985379776: goto L_0x0404;
                case -1784763192: goto L_0x03f4;
                case -1730367663: goto L_0x03e4;
                case -1482641358: goto L_0x03d4;
                case -1482641357: goto L_0x03c0;
                case -1373388978: goto L_0x03b4;
                case -933872740: goto L_0x03a0;
                case -538363189: goto L_0x0393;
                case -538363109: goto L_0x0386;
                case -425012669: goto L_0x0379;
                case -356037306: goto L_0x036c;
                case 62923557: goto L_0x035f;
                case 62923603: goto L_0x0351;
                case 62927045: goto L_0x033d;
                case 82318131: goto L_0x0329;
                case 82338133: goto L_0x031b;
                case 82338134: goto L_0x030d;
                case 99146302: goto L_0x02ff;
                case 444813526: goto L_0x02eb;
                case 542569478: goto L_0x02dd;
                case 635596514: goto L_0x02cf;
                case 725948237: goto L_0x02c1;
                case 725957860: goto L_0x02ad;
                case 738597099: goto L_0x029a;
                case 855502857: goto L_0x028d;
                case 1045209816: goto L_0x0280;
                case 1422270023: goto L_0x0273;
                case 1809237540: goto L_0x0266;
                case 1950749482: goto L_0x0259;
                case 1950789798: goto L_0x024c;
                case 1951062397: goto L_0x023b;
                default: goto L_0x0232;
            }
        L_0x0232:
            r7 = r31
            r5 = r32
        L_0x0236:
            r6 = r33
        L_0x0238:
            r8 = -1
            goto L_0x0435
        L_0x023b:
            boolean r5 = r1.equals(r10)
            if (r5 != 0) goto L_0x0242
            goto L_0x0232
        L_0x0242:
            r7 = r31
            r5 = r32
            r6 = r33
            r8 = 32
            goto L_0x0435
        L_0x024c:
            java.lang.String r5 = "A_FLAC"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0255
            goto L_0x0232
        L_0x0255:
            r5 = 31
            goto L_0x03cb
        L_0x0259:
            java.lang.String r5 = "A_EAC3"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0262
            goto L_0x0232
        L_0x0262:
            r5 = 30
            goto L_0x03cb
        L_0x0266:
            java.lang.String r5 = "V_MPEG2"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x026f
            goto L_0x0232
        L_0x026f:
            r5 = 29
            goto L_0x03cb
        L_0x0273:
            java.lang.String r5 = "S_TEXT/UTF8"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x027c
            goto L_0x0232
        L_0x027c:
            r5 = 28
            goto L_0x03cb
        L_0x0280:
            java.lang.String r5 = "S_TEXT/WEBVTT"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0289
            goto L_0x0232
        L_0x0289:
            r5 = 27
            goto L_0x03cb
        L_0x028d:
            java.lang.String r5 = "V_MPEGH/ISO/HEVC"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0296
            goto L_0x0232
        L_0x0296:
            r5 = 26
            goto L_0x03cb
        L_0x029a:
            java.lang.String r5 = "S_TEXT/ASS"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x02a3
            goto L_0x0232
        L_0x02a3:
            r7 = r31
            r5 = r32
            r6 = r33
            r8 = 25
            goto L_0x0435
        L_0x02ad:
            java.lang.String r5 = "A_PCM/INT/LIT"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x02b7
            goto L_0x0232
        L_0x02b7:
            r7 = r31
            r5 = r32
            r6 = r33
            r8 = 24
            goto L_0x0435
        L_0x02c1:
            java.lang.String r5 = "A_PCM/INT/BIG"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x02cb
            goto L_0x0232
        L_0x02cb:
            r5 = 23
            goto L_0x03cb
        L_0x02cf:
            java.lang.String r5 = "A_PCM/FLOAT/IEEE"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x02d9
            goto L_0x0232
        L_0x02d9:
            r5 = 22
            goto L_0x03cb
        L_0x02dd:
            java.lang.String r5 = "A_DTS/EXPRESS"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x02e7
            goto L_0x0232
        L_0x02e7:
            r5 = 21
            goto L_0x03cb
        L_0x02eb:
            java.lang.String r5 = "V_THEORA"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x02f5
            goto L_0x0232
        L_0x02f5:
            r7 = r31
            r5 = r32
            r6 = r33
            r8 = 20
            goto L_0x0435
        L_0x02ff:
            java.lang.String r5 = "S_HDMV/PGS"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0309
            goto L_0x0232
        L_0x0309:
            r5 = 19
            goto L_0x03cb
        L_0x030d:
            java.lang.String r5 = "V_VP9"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0317
            goto L_0x0232
        L_0x0317:
            r5 = 18
            goto L_0x03cb
        L_0x031b:
            java.lang.String r5 = "V_VP8"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0325
            goto L_0x0232
        L_0x0325:
            r5 = 17
            goto L_0x03cb
        L_0x0329:
            java.lang.String r5 = "V_AV1"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0333
            goto L_0x0232
        L_0x0333:
            r7 = r31
            r5 = r32
            r6 = r33
            r8 = 16
            goto L_0x0435
        L_0x033d:
            java.lang.String r5 = "A_DTS"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0347
            goto L_0x0232
        L_0x0347:
            r7 = r31
            r5 = r32
            r6 = r33
            r8 = 15
            goto L_0x0435
        L_0x0351:
            java.lang.String r5 = "A_AC3"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x035b
            goto L_0x0232
        L_0x035b:
            r5 = 14
            goto L_0x03cb
        L_0x035f:
            java.lang.String r5 = "A_AAC"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0369
            goto L_0x0232
        L_0x0369:
            r5 = 13
            goto L_0x03cb
        L_0x036c:
            java.lang.String r5 = "A_DTS/LOSSLESS"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0376
            goto L_0x0232
        L_0x0376:
            r5 = 12
            goto L_0x03cb
        L_0x0379:
            java.lang.String r5 = "S_VOBSUB"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0383
            goto L_0x0232
        L_0x0383:
            r5 = 11
            goto L_0x03cb
        L_0x0386:
            java.lang.String r5 = "V_MPEG4/ISO/AVC"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0390
            goto L_0x0232
        L_0x0390:
            r5 = 10
            goto L_0x03cb
        L_0x0393:
            java.lang.String r5 = "V_MPEG4/ISO/ASP"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x039d
            goto L_0x0232
        L_0x039d:
            r5 = 9
            goto L_0x03cb
        L_0x03a0:
            java.lang.String r5 = "S_DVBSUB"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x03aa
            goto L_0x0232
        L_0x03aa:
            r7 = r31
            r5 = r32
            r6 = r33
            r8 = 8
            goto L_0x0435
        L_0x03b4:
            java.lang.String r5 = "V_MS/VFW/FOURCC"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x03be
            goto L_0x0232
        L_0x03be:
            r5 = 7
            goto L_0x03cb
        L_0x03c0:
            java.lang.String r5 = "A_MPEG/L3"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x03ca
            goto L_0x0232
        L_0x03ca:
            r5 = 6
        L_0x03cb:
            r8 = r5
            r7 = r31
            r5 = r32
            r6 = r33
            goto L_0x0435
        L_0x03d4:
            boolean r5 = r1.equals(r2)
            if (r5 != 0) goto L_0x03dc
            goto L_0x0232
        L_0x03dc:
            r7 = r31
            r5 = r32
            r6 = r33
            r8 = 5
            goto L_0x0435
        L_0x03e4:
            boolean r5 = r1.equals(r3)
            if (r5 != 0) goto L_0x03ec
            goto L_0x0232
        L_0x03ec:
            r7 = r31
            r5 = r32
            r6 = r33
            r8 = 4
            goto L_0x0435
        L_0x03f4:
            boolean r5 = r1.equals(r4)
            if (r5 != 0) goto L_0x03fc
            goto L_0x0232
        L_0x03fc:
            r7 = r31
            r5 = r32
            r6 = r33
            r8 = 3
            goto L_0x0435
        L_0x0404:
            r5 = r32
            boolean r6 = r1.equals(r5)
            r7 = r31
            if (r6 != 0) goto L_0x0410
            goto L_0x0236
        L_0x0410:
            r6 = r33
            r8 = 2
            goto L_0x0435
        L_0x0414:
            r5 = r32
            r6 = r33
            boolean r7 = r1.equals(r6)
            if (r7 != 0) goto L_0x0422
            r7 = r31
            goto L_0x0238
        L_0x0422:
            r7 = r31
            r8 = 1
            goto L_0x0435
        L_0x0426:
            r7 = r31
            r5 = r32
            r6 = r33
            boolean r8 = r1.equals(r7)
            if (r8 != 0) goto L_0x0434
            goto L_0x0238
        L_0x0434:
            r8 = 0
        L_0x0435:
            switch(r8) {
                case 0: goto L_0x0447;
                case 1: goto L_0x0447;
                case 2: goto L_0x0447;
                case 3: goto L_0x0447;
                case 4: goto L_0x0447;
                case 5: goto L_0x0447;
                case 6: goto L_0x0447;
                case 7: goto L_0x0447;
                case 8: goto L_0x0447;
                case 9: goto L_0x0447;
                case 10: goto L_0x0447;
                case 11: goto L_0x0447;
                case 12: goto L_0x0447;
                case 13: goto L_0x0447;
                case 14: goto L_0x0447;
                case 15: goto L_0x0447;
                case 16: goto L_0x0447;
                case 17: goto L_0x0447;
                case 18: goto L_0x0447;
                case 19: goto L_0x0447;
                case 20: goto L_0x0447;
                case 21: goto L_0x0447;
                case 22: goto L_0x0447;
                case 23: goto L_0x0447;
                case 24: goto L_0x0447;
                case 25: goto L_0x0447;
                case 26: goto L_0x0447;
                case 27: goto L_0x0447;
                case 28: goto L_0x0447;
                case 29: goto L_0x0447;
                case 30: goto L_0x0447;
                case 31: goto L_0x0447;
                case 32: goto L_0x0447;
                default: goto L_0x0438;
            }
        L_0x0438:
            r32 = r2
            r33 = r3
            r17 = r4
            r35 = r5
            r31 = r10
            r0 = 0
            r3 = 25
            goto L_0x0cee
        L_0x0447:
            xf5 r8 = r9.m1
            int r11 = r0.c
            java.lang.String r14 = "application/dvbsubs"
            java.lang.String r15 = "application/vobsub"
            java.lang.String r13 = "application/pgs"
            r23 = r9
            java.lang.String r9 = "video/x-unknown"
            r26 = r12
            java.lang.String r12 = "text/x-ssa"
            r24 = r8
            java.lang.String r8 = "text/vtt"
            r25 = r11
            java.lang.String r11 = "application/x-subrip"
            r27 = r14
            java.lang.String r14 = ". Setting mimeType to audio/x-unknown"
            java.lang.String r28 = "audio/raw"
            java.lang.String r29 = "audio/x-unknown"
            int r30 = r1.hashCode()
            switch(r30) {
                case -2095576542: goto L_0x0653;
                case -2095575984: goto L_0x0648;
                case -1985379776: goto L_0x063d;
                case -1784763192: goto L_0x0632;
                case -1730367663: goto L_0x0627;
                case -1482641358: goto L_0x061c;
                case -1482641357: goto L_0x060f;
                case -1373388978: goto L_0x0602;
                case -933872740: goto L_0x05f2;
                case -538363189: goto L_0x05e2;
                case -538363109: goto L_0x05d2;
                case -425012669: goto L_0x05c2;
                case -356037306: goto L_0x05b2;
                case 62923557: goto L_0x05a2;
                case 62923603: goto L_0x0592;
                case 62927045: goto L_0x0582;
                case 82318131: goto L_0x0572;
                case 82338133: goto L_0x0562;
                case 82338134: goto L_0x0552;
                case 99146302: goto L_0x0542;
                case 444813526: goto L_0x0532;
                case 542569478: goto L_0x0522;
                case 635596514: goto L_0x0512;
                case 725948237: goto L_0x0502;
                case 725957860: goto L_0x04f2;
                case 738597099: goto L_0x04e2;
                case 855502857: goto L_0x04d2;
                case 1045209816: goto L_0x04c2;
                case 1422270023: goto L_0x04b2;
                case 1809237540: goto L_0x04a2;
                case 1950749482: goto L_0x0492;
                case 1950789798: goto L_0x0482;
                case 1951062397: goto L_0x0475;
                default: goto L_0x0470;
            }
        L_0x0470:
            r31 = r10
        L_0x0472:
            r10 = -1
            goto L_0x065e
        L_0x0475:
            boolean r30 = r1.equals(r10)
            if (r30 != 0) goto L_0x047c
            goto L_0x0470
        L_0x047c:
            r31 = r10
            r10 = 32
            goto L_0x065e
        L_0x0482:
            r31 = r10
            java.lang.String r10 = "A_FLAC"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x048e
            goto L_0x065b
        L_0x048e:
            r10 = 31
            goto L_0x065e
        L_0x0492:
            r31 = r10
            java.lang.String r10 = "A_EAC3"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x049e
            goto L_0x065b
        L_0x049e:
            r10 = 30
            goto L_0x065e
        L_0x04a2:
            r31 = r10
            java.lang.String r10 = "V_MPEG2"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x04ae
            goto L_0x065b
        L_0x04ae:
            r10 = 29
            goto L_0x065e
        L_0x04b2:
            r31 = r10
            java.lang.String r10 = "S_TEXT/UTF8"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x04be
            goto L_0x065b
        L_0x04be:
            r10 = 28
            goto L_0x065e
        L_0x04c2:
            r31 = r10
            java.lang.String r10 = "S_TEXT/WEBVTT"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x04ce
            goto L_0x065b
        L_0x04ce:
            r10 = 27
            goto L_0x065e
        L_0x04d2:
            r31 = r10
            java.lang.String r10 = "V_MPEGH/ISO/HEVC"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x04de
            goto L_0x065b
        L_0x04de:
            r10 = 26
            goto L_0x065e
        L_0x04e2:
            r31 = r10
            java.lang.String r10 = "S_TEXT/ASS"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x04ee
            goto L_0x065b
        L_0x04ee:
            r10 = 25
            goto L_0x065e
        L_0x04f2:
            r31 = r10
            java.lang.String r10 = "A_PCM/INT/LIT"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x04fe
            goto L_0x065b
        L_0x04fe:
            r10 = 24
            goto L_0x065e
        L_0x0502:
            r31 = r10
            java.lang.String r10 = "A_PCM/INT/BIG"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x050e
            goto L_0x065b
        L_0x050e:
            r10 = 23
            goto L_0x065e
        L_0x0512:
            r31 = r10
            java.lang.String r10 = "A_PCM/FLOAT/IEEE"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x051e
            goto L_0x065b
        L_0x051e:
            r10 = 22
            goto L_0x065e
        L_0x0522:
            r31 = r10
            java.lang.String r10 = "A_DTS/EXPRESS"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x052e
            goto L_0x065b
        L_0x052e:
            r10 = 21
            goto L_0x065e
        L_0x0532:
            r31 = r10
            java.lang.String r10 = "V_THEORA"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x053e
            goto L_0x065b
        L_0x053e:
            r10 = 20
            goto L_0x065e
        L_0x0542:
            r31 = r10
            java.lang.String r10 = "S_HDMV/PGS"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x054e
            goto L_0x065b
        L_0x054e:
            r10 = 19
            goto L_0x065e
        L_0x0552:
            r31 = r10
            java.lang.String r10 = "V_VP9"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x055e
            goto L_0x065b
        L_0x055e:
            r10 = 18
            goto L_0x065e
        L_0x0562:
            r31 = r10
            java.lang.String r10 = "V_VP8"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x056e
            goto L_0x065b
        L_0x056e:
            r10 = 17
            goto L_0x065e
        L_0x0572:
            r31 = r10
            java.lang.String r10 = "V_AV1"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x057e
            goto L_0x065b
        L_0x057e:
            r10 = 16
            goto L_0x065e
        L_0x0582:
            r31 = r10
            java.lang.String r10 = "A_DTS"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x058e
            goto L_0x065b
        L_0x058e:
            r10 = 15
            goto L_0x065e
        L_0x0592:
            r31 = r10
            java.lang.String r10 = "A_AC3"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x059e
            goto L_0x065b
        L_0x059e:
            r10 = 14
            goto L_0x065e
        L_0x05a2:
            r31 = r10
            java.lang.String r10 = "A_AAC"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x05ae
            goto L_0x065b
        L_0x05ae:
            r10 = 13
            goto L_0x065e
        L_0x05b2:
            r31 = r10
            java.lang.String r10 = "A_DTS/LOSSLESS"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x05be
            goto L_0x065b
        L_0x05be:
            r10 = 12
            goto L_0x065e
        L_0x05c2:
            r31 = r10
            java.lang.String r10 = "S_VOBSUB"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x05ce
            goto L_0x065b
        L_0x05ce:
            r10 = 11
            goto L_0x065e
        L_0x05d2:
            r31 = r10
            java.lang.String r10 = "V_MPEG4/ISO/AVC"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x05de
            goto L_0x065b
        L_0x05de:
            r10 = 10
            goto L_0x065e
        L_0x05e2:
            r31 = r10
            java.lang.String r10 = "V_MPEG4/ISO/ASP"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x05ee
            goto L_0x065b
        L_0x05ee:
            r10 = 9
            goto L_0x065e
        L_0x05f2:
            r31 = r10
            java.lang.String r10 = "S_DVBSUB"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x05fe
            goto L_0x065b
        L_0x05fe:
            r10 = 8
            goto L_0x065e
        L_0x0602:
            r31 = r10
            java.lang.String r10 = "V_MS/VFW/FOURCC"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x060d
            goto L_0x065b
        L_0x060d:
            r10 = 7
            goto L_0x065e
        L_0x060f:
            r31 = r10
            java.lang.String r10 = "A_MPEG/L3"
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x061a
            goto L_0x065b
        L_0x061a:
            r10 = 6
            goto L_0x065e
        L_0x061c:
            r31 = r10
            boolean r10 = r1.equals(r2)
            if (r10 != 0) goto L_0x0625
            goto L_0x065b
        L_0x0625:
            r10 = 5
            goto L_0x065e
        L_0x0627:
            r31 = r10
            boolean r10 = r1.equals(r3)
            if (r10 != 0) goto L_0x0630
            goto L_0x065b
        L_0x0630:
            r10 = 4
            goto L_0x065e
        L_0x0632:
            r31 = r10
            boolean r10 = r1.equals(r4)
            if (r10 != 0) goto L_0x063b
            goto L_0x065b
        L_0x063b:
            r10 = 3
            goto L_0x065e
        L_0x063d:
            r31 = r10
            boolean r10 = r1.equals(r5)
            if (r10 != 0) goto L_0x0646
            goto L_0x065b
        L_0x0646:
            r10 = 2
            goto L_0x065e
        L_0x0648:
            r31 = r10
            boolean r10 = r1.equals(r6)
            if (r10 != 0) goto L_0x0651
            goto L_0x065b
        L_0x0651:
            r10 = 1
            goto L_0x065e
        L_0x0653:
            r31 = r10
            boolean r10 = r1.equals(r7)
            if (r10 != 0) goto L_0x065d
        L_0x065b:
            goto L_0x0472
        L_0x065d:
            r10 = 0
        L_0x065e:
            switch(r10) {
                case 0: goto L_0x0a80;
                case 1: goto L_0x0a80;
                case 2: goto L_0x0a09;
                case 3: goto L_0x09f7;
                case 4: goto L_0x096a;
                case 5: goto L_0x095d;
                case 6: goto L_0x0948;
                case 7: goto L_0x0888;
                case 8: goto L_0x086e;
                case 9: goto L_0x0a80;
                case 10: goto L_0x084f;
                case 11: goto L_0x083d;
                case 12: goto L_0x0835;
                case 13: goto L_0x0809;
                case 14: goto L_0x07ff;
                case 15: goto L_0x07f5;
                case 16: goto L_0x07eb;
                case 17: goto L_0x07e1;
                case 18: goto L_0x07d7;
                case 19: goto L_0x07ce;
                case 20: goto L_0x07c8;
                case 21: goto L_0x07f5;
                case 22: goto L_0x079e;
                case 23: goto L_0x075f;
                case 24: goto L_0x072f;
                case 25: goto L_0x071c;
                case 26: goto L_0x06f5;
                case 27: goto L_0x06ed;
                case 28: goto L_0x06e5;
                case 29: goto L_0x06de;
                case 30: goto L_0x06d0;
                case 31: goto L_0x06b8;
                case 32: goto L_0x0669;
                default: goto L_0x0661;
            }
        L_0x0661:
            java.lang.String r0 = "Unrecognized codec identifier."
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0669:
            java.util.ArrayList r1 = new java.util.ArrayList
            r9 = 3
            r1.<init>(r9)
            java.lang.String r9 = r0.b
            byte[] r9 = r0.a(r9)
            r1.add(r9)
            r9 = 8
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r9)
            java.nio.ByteOrder r14 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r10 = r10.order(r14)
            r32 = r2
            r33 = r3
            long r2 = r0.S
            java.nio.ByteBuffer r2 = r10.putLong(r2)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r9)
            java.nio.ByteBuffer r2 = r2.order(r14)
            long r9 = r0.T
            java.nio.ByteBuffer r2 = r2.putLong(r9)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.lang.String r9 = "audio/opus"
            r2 = 5760(0x1680, float:8.071E-42)
            r10 = r1
            r17 = r4
            r3 = -1
            r14 = 0
            r4 = r2
            r2 = 24
            goto L_0x0a99
        L_0x06b8:
            r32 = r2
            r33 = r3
            byte[] r1 = r0.a(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r9 = "audio/flac"
            r10 = r1
            r17 = r4
        L_0x06c9:
            r2 = 24
        L_0x06cb:
            r3 = -1
            r4 = -1
        L_0x06cd:
            r14 = 0
            goto L_0x0a99
        L_0x06d0:
            r32 = r2
            r33 = r3
            java.lang.String r9 = "audio/eac3"
        L_0x06d6:
            r17 = r4
        L_0x06d8:
            r2 = 24
        L_0x06da:
            r3 = -1
        L_0x06db:
            r4 = -1
        L_0x06dc:
            r10 = 0
            goto L_0x06cd
        L_0x06de:
            r32 = r2
            r33 = r3
            java.lang.String r9 = "video/mpeg2"
            goto L_0x06d6
        L_0x06e5:
            r32 = r2
            r33 = r3
            r17 = r4
            r9 = r11
            goto L_0x06d8
        L_0x06ed:
            r32 = r2
            r33 = r3
            r17 = r4
            r9 = r8
            goto L_0x06d8
        L_0x06f5:
            r32 = r2
            r33 = r3
            l8b r1 = new l8b
            java.lang.String r2 = r0.b
            byte[] r2 = r0.a(r2)
            r1.<init>((byte[]) r2)
            ey6 r1 = defpackage.ey6.a(r1)
            int r2 = r1.b
            r0.Z = r2
            java.lang.String r9 = "video/hevc"
            java.util.List r2 = r1.a
            java.lang.String r1 = r1.j
        L_0x0712:
            r14 = r1
            r10 = r2
        L_0x0714:
            r17 = r4
        L_0x0716:
            r2 = 24
            r3 = -1
            r4 = -1
            goto L_0x0a99
        L_0x071c:
            r32 = r2
            r33 = r3
            byte[] r1 = r0.a(r1)
            byte[] r2 = o1
            k0d r1 = defpackage.tb7.u(r2, r1)
            r10 = r1
            r17 = r4
            r9 = r12
            goto L_0x06c9
        L_0x072f:
            r32 = r2
            r33 = r3
            int r1 = r0.Q
            int r1 = defpackage.v0g.C(r1)
            if (r1 != 0) goto L_0x0756
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported little endian PCM bit depth: "
            r1.<init>(r2)
            int r2 = r0.Q
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            defpackage.i8b.V(r1)
        L_0x0751:
            r17 = r4
            r9 = r29
            goto L_0x06d8
        L_0x0756:
            r3 = r1
            r17 = r4
            r9 = r28
            r2 = 24
            goto L_0x06db
        L_0x075f:
            r32 = r2
            r33 = r3
            int r1 = r0.Q
            r2 = 8
            if (r1 != r2) goto L_0x0772
            r17 = r4
            r9 = r28
            r2 = 24
            r3 = 3
            goto L_0x06db
        L_0x0772:
            r2 = 16
            if (r1 != r2) goto L_0x0779
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0756
        L_0x0779:
            r2 = 24
            if (r1 != r2) goto L_0x0780
            r1 = 1342177280(0x50000000, float:8.5899346E9)
            goto L_0x0756
        L_0x0780:
            r2 = 32
            if (r1 != r2) goto L_0x0787
            r1 = 1610612736(0x60000000, float:3.6893488E19)
            goto L_0x0756
        L_0x0787:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported big endian PCM bit depth: "
            r1.<init>(r2)
            int r2 = r0.Q
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            defpackage.i8b.V(r1)
            goto L_0x0751
        L_0x079e:
            r32 = r2
            r33 = r3
            int r1 = r0.Q
            r2 = 32
            if (r1 != r2) goto L_0x07b1
            r17 = r4
            r9 = r28
            r2 = 24
            r3 = 4
            goto L_0x06db
        L_0x07b1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported floating point PCM bit depth: "
            r1.<init>(r3)
            int r3 = r0.Q
            r1.append(r3)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            defpackage.i8b.V(r1)
            goto L_0x0751
        L_0x07c8:
            r32 = r2
            r33 = r3
            goto L_0x06d6
        L_0x07ce:
            r32 = r2
            r33 = r3
            r17 = r4
            r9 = r13
            goto L_0x06d8
        L_0x07d7:
            r32 = r2
            r33 = r3
            r2 = 32
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            goto L_0x06d6
        L_0x07e1:
            r32 = r2
            r33 = r3
            r2 = 32
            java.lang.String r9 = "video/x-vnd.on2.vp8"
            goto L_0x06d6
        L_0x07eb:
            r32 = r2
            r33 = r3
            r2 = 32
            java.lang.String r9 = "video/av01"
            goto L_0x06d6
        L_0x07f5:
            r32 = r2
            r33 = r3
            r2 = 32
            java.lang.String r9 = "audio/vnd.dts"
            goto L_0x06d6
        L_0x07ff:
            r32 = r2
            r33 = r3
            r2 = 32
            java.lang.String r9 = "audio/ac3"
            goto L_0x06d6
        L_0x0809:
            r32 = r2
            r33 = r3
            r2 = 32
            byte[] r1 = r0.a(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            byte[] r3 = r0.k
            ky1 r9 = new ky1
            int r10 = r3.length
            r2 = 2
            r14 = 0
            r9.<init>((byte[]) r3, (byte) r14, (int) r10, (int) r2)
            e r2 = defpackage.iq.T(r9, r14)
            int r3 = r2.a
            r0.R = r3
            int r3 = r2.b
            r0.P = r3
            java.lang.String r9 = "audio/mp4a-latm"
            java.lang.String r2 = r2.c
            r10 = r1
            r14 = r2
            goto L_0x0714
        L_0x0835:
            r32 = r2
            r33 = r3
            java.lang.String r9 = "audio/vnd.dts.hd"
            goto L_0x06d6
        L_0x083d:
            r32 = r2
            r33 = r3
            byte[] r1 = r0.a(r1)
            k0d r1 = defpackage.tb7.t(r1)
            r10 = r1
            r17 = r4
            r9 = r15
            goto L_0x06c9
        L_0x084f:
            r32 = r2
            r33 = r3
            l8b r1 = new l8b
            java.lang.String r2 = r0.b
            byte[] r2 = r0.a(r2)
            r1.<init>((byte[]) r2)
            ke0 r1 = defpackage.ke0.a(r1)
            int r2 = r1.b
            r0.Z = r2
            java.lang.String r9 = "video/avc"
            java.util.List r2 = r1.a
            java.lang.String r1 = r1.l
            goto L_0x0712
        L_0x086e:
            r32 = r2
            r33 = r3
            r2 = 4
            byte[] r3 = new byte[r2]
            byte[] r1 = r0.a(r1)
            r9 = 0
            java.lang.System.arraycopy(r1, r9, r3, r9, r2)
            k0d r1 = defpackage.tb7.t(r3)
            r10 = r1
            r17 = r4
            r9 = r27
            goto L_0x06c9
        L_0x0888:
            r32 = r2
            r33 = r3
            l8b r1 = new l8b
            java.lang.String r2 = r0.b
            byte[] r2 = r0.a(r2)
            r1.<init>((byte[]) r2)
            r2 = 16
            r1.H(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
            long r28 = r1.l()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
            r34 = 1482049860(0x58564944, double:7.322299212E-315)
            int r3 = (r28 > r34 ? 1 : (r28 == r34 ? 0 : -1))
            if (r3 != 0) goto L_0x08bc
            android.util.Pair r1 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
            java.lang.String r3 = "video/divx"
            r9 = 0
            r1.<init>(r3, r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b6 }
        L_0x08af:
            r3 = 0
            r10 = 20
            r14 = 15
            goto L_0x0930
        L_0x08b6:
            r3 = r9
            goto L_0x0941
        L_0x08b9:
            r3 = 0
            goto L_0x0941
        L_0x08bc:
            r34 = 859189832(0x33363248, double:4.244961792E-315)
            int r3 = (r28 > r34 ? 1 : (r28 == r34 ? 0 : -1))
            if (r3 != 0) goto L_0x08cc
            android.util.Pair r1 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
            java.lang.String r3 = "video/3gpp"
            r9 = 0
            r1.<init>(r3, r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b6 }
            goto L_0x08af
        L_0x08cc:
            r34 = 826496599(0x31435657, double:4.08343576E-315)
            int r3 = (r28 > r34 ? 1 : (r28 == r34 ? 0 : -1))
            if (r3 != 0) goto L_0x0921
            int r3 = r1.b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
            r10 = 20
            int r3 = r3 + r10
            byte[] r1 = r1.a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
        L_0x08da:
            int r9 = r1.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
            r14 = 4
            int r9 = r9 - r14
            if (r3 >= r9) goto L_0x0917
            byte r9 = r1[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
            if (r9 != 0) goto L_0x0912
            r9 = 1
            int r14 = r3 + 1
            byte r14 = r1[r14]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
            if (r14 != 0) goto L_0x090f
            r14 = 2
            int r18 = r3 + 2
            byte r14 = r1[r18]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
            if (r14 != r9) goto L_0x090f
            r9 = 3
            int r14 = r3 + 3
            byte r9 = r1[r14]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
            r14 = 15
            if (r9 != r14) goto L_0x090d
            int r9 = r1.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r3, r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
            java.lang.String r9 = "video/wvc1"
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
            r3.<init>(r9, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
            r1 = r3
            r3 = 0
            goto L_0x0930
        L_0x090d:
            r9 = 1
            goto L_0x0915
        L_0x090f:
            r14 = 15
            goto L_0x0915
        L_0x0912:
            r14 = 15
            goto L_0x090d
        L_0x0915:
            int r3 = r3 + r9
            goto L_0x08da
        L_0x0917:
            java.lang.String r0 = "Failed to find FourCC VC1 initialization data"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x091f }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x08b9 }
        L_0x091f:
            r3 = r1
            goto L_0x0941
        L_0x0921:
            r10 = 20
            r14 = 15
            java.lang.String r1 = "Unknown FourCC. Setting mimeType to video/x-unknown"
            defpackage.i8b.V(r1)
            android.util.Pair r1 = new android.util.Pair
            r3 = 0
            r1.<init>(r9, r3)
        L_0x0930:
            java.lang.Object r9 = r1.first
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r1 = r1.second
            r22 = r1
            java.util.List r22 = (java.util.List) r22
            r14 = r3
            r17 = r4
            r10 = r22
            goto L_0x0716
        L_0x0941:
            java.lang.String r0 = "Error parsing FourCC private data"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r3)
            throw r0
        L_0x0948:
            r32 = r2
            r33 = r3
            r2 = 16
            r10 = 20
            r14 = 15
            java.lang.String r9 = "audio/mpeg"
        L_0x0954:
            r17 = r4
            r2 = 24
            r3 = -1
            r4 = 4096(0x1000, float:5.74E-42)
            goto L_0x06dc
        L_0x095d:
            r32 = r2
            r33 = r3
            r2 = 16
            r10 = 20
            r14 = 15
            java.lang.String r9 = "audio/mpeg-L2"
            goto L_0x0954
        L_0x096a:
            r32 = r2
            r33 = r3
            r2 = 16
            r10 = 20
            r14 = 15
            byte[] r1 = r0.a(r1)
            java.lang.String r3 = "Error parsing vorbis codec private"
            r9 = 0
            byte r2 = r1[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            r9 = 2
            if (r2 != r9) goto L_0x09ec
            r2 = 0
            r9 = 1
        L_0x0982:
            byte r10 = r1[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            r17 = r4
            r4 = 255(0xff, float:3.57E-43)
            r10 = r10 & r4
            if (r10 != r4) goto L_0x0991
            int r2 = r2 + r4
            r10 = 1
            int r9 = r9 + r10
            r4 = r17
            goto L_0x0982
        L_0x0991:
            r14 = 1
            int r9 = r9 + r14
            int r2 = r2 + r10
            r10 = 0
        L_0x0995:
            byte r14 = r1[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            r14 = r14 & r4
            if (r14 != r4) goto L_0x099e
            int r10 = r10 + r4
            r14 = 1
            int r9 = r9 + r14
            goto L_0x0995
        L_0x099e:
            r4 = 1
            int r9 = r9 + r4
            int r10 = r10 + r14
            byte r14 = r1[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            if (r14 != r4) goto L_0x09e6
            byte[] r4 = new byte[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            r14 = 0
            java.lang.System.arraycopy(r1, r9, r4, r14, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            int r9 = r9 + r2
            byte r2 = r1[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            r14 = 3
            if (r2 != r14) goto L_0x09e0
            int r9 = r9 + r10
            byte r2 = r1[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            r10 = 5
            if (r2 != r10) goto L_0x09da
            int r2 = r1.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            int r2 = r2 - r9
            byte[] r2 = new byte[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            int r10 = r1.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            int r10 = r10 - r9
            r14 = 0
            java.lang.System.arraycopy(r1, r9, r2, r14, r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            r9 = 2
            r1.<init>(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            r1.add(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            r1.add(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09d8 }
            java.lang.String r9 = "audio/vorbis"
            r2 = 8192(0x2000, float:1.14794E-41)
            r10 = r1
            r4 = r2
            r2 = 24
            r3 = -1
            goto L_0x06cd
        L_0x09d8:
            r0 = 0
            goto L_0x09f2
        L_0x09da:
            r0 = 0
            androidx.media3.common.ParserException r1 = androidx.media3.common.ParserException.a(r3, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09f2 }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09f2 }
        L_0x09e0:
            r0 = 0
            androidx.media3.common.ParserException r1 = androidx.media3.common.ParserException.a(r3, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09f2 }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09f2 }
        L_0x09e6:
            r0 = 0
            androidx.media3.common.ParserException r1 = androidx.media3.common.ParserException.a(r3, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09f2 }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09f2 }
        L_0x09ec:
            r0 = 0
            androidx.media3.common.ParserException r1 = androidx.media3.common.ParserException.a(r3, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09f2 }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09f2 }
        L_0x09f2:
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r3, r0)
            throw r0
        L_0x09f7:
            r32 = r2
            r33 = r3
            r17 = r4
            etf r1 = new etf
            r2 = 1
            r1.<init>(r2)
            r0.U = r1
            java.lang.String r9 = "audio/true-hd"
            goto L_0x06d8
        L_0x0a09:
            r32 = r2
            r33 = r3
            r17 = r4
            r1 = 15
            r2 = 1
            l8b r3 = new l8b
            java.lang.String r4 = r0.b
            byte[] r4 = r0.a(r4)
            r3.<init>((byte[]) r4)
            int r4 = r3.n()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0a78 }
            if (r4 != r2) goto L_0x0a26
            r2 = 24
            goto L_0x0a4a
        L_0x0a26:
            r2 = 65534(0xfffe, float:9.1833E-41)
            if (r4 != r2) goto L_0x0a70
            r2 = 24
            r3.G(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0a78 }
            long r9 = r3.o()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0a78 }
            java.util.UUID r4 = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0a78 }
            long r35 = r4.getMostSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0a78 }
            int r9 = (r9 > r35 ? 1 : (r9 == r35 ? 0 : -1))
            if (r9 != 0) goto L_0x0a72
            long r9 = r3.o()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0a78 }
            long r3 = r4.getLeastSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0a78 }
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0a72
        L_0x0a4a:
            int r3 = r0.Q
            int r3 = defpackage.v0g.C(r3)
            if (r3 != 0) goto L_0x0a6c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unsupported PCM bit depth: "
            r3.<init>(r4)
            int r4 = r0.Q
            r3.append(r4)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            defpackage.i8b.V(r3)
        L_0x0a68:
            r9 = r29
            goto L_0x06da
        L_0x0a6c:
            r9 = r28
            goto L_0x06db
        L_0x0a70:
            r2 = 24
        L_0x0a72:
            java.lang.String r3 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
            defpackage.i8b.V(r3)
            goto L_0x0a68
        L_0x0a78:
            java.lang.String r0 = "Error parsing MS/ACM codec private"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0a80:
            r32 = r2
            r33 = r3
            r17 = r4
            r1 = 15
            r2 = 24
            byte[] r3 = r0.k
            if (r3 != 0) goto L_0x0a90
            r3 = 0
            goto L_0x0a94
        L_0x0a90:
            java.util.List r3 = java.util.Collections.singletonList(r3)
        L_0x0a94:
            java.lang.String r9 = "video/mp4v-es"
            r10 = r3
            goto L_0x06cb
        L_0x0a99:
            byte[] r1 = r0.O
            if (r1 == 0) goto L_0x0aae
            l8b r1 = new l8b
            byte[] r2 = r0.O
            r1.<init>((byte[]) r2)
            er4 r1 = defpackage.er4.a(r1)
            if (r1 == 0) goto L_0x0aae
            java.lang.String r14 = r1.a
            java.lang.String r9 = "video/dolby-vision"
        L_0x0aae:
            boolean r1 = r0.W
            boolean r2 = r0.V
            if (r2 == 0) goto L_0x0ab6
            r2 = 2
            goto L_0x0ab7
        L_0x0ab6:
            r2 = 0
        L_0x0ab7:
            r1 = r1 | r2
            ba6 r2 = new ba6
            r2.<init>()
            boolean r19 = defpackage.vq9.h(r9)
            r35 = r5
            java.util.Map r5 = s1
            if (r19 == 0) goto L_0x0ad6
            int r8 = r0.P
            r2.A = r8
            int r8 = r0.R
            r2.B = r8
            r2.C = r3
            r3 = 25
            r8 = 1
            goto L_0x0ca8
        L_0x0ad6:
            boolean r3 = defpackage.vq9.k(r9)
            if (r3 == 0) goto L_0x0c76
            int r3 = r0.r
            if (r3 != 0) goto L_0x0af2
            int r3 = r0.p
            r8 = -1
            if (r3 != r8) goto L_0x0ae7
            int r3 = r0.m
        L_0x0ae7:
            r0.p = r3
            int r3 = r0.q
            if (r3 != r8) goto L_0x0aef
            int r3 = r0.n
        L_0x0aef:
            r0.q = r3
            goto L_0x0af3
        L_0x0af2:
            r8 = -1
        L_0x0af3:
            int r3 = r0.p
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r3 == r8) goto L_0x0b07
            int r12 = r0.q
            if (r12 == r8) goto L_0x0b07
            int r8 = r0.n
            int r8 = r8 * r3
            float r3 = (float) r8
            int r8 = r0.m
            int r8 = r8 * r12
            float r8 = (float) r8
            float r3 = r3 / r8
            goto L_0x0b08
        L_0x0b07:
            r3 = r11
        L_0x0b08:
            boolean r8 = r0.y
            if (r8 == 0) goto L_0x0bf2
            float r8 = r0.E
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0b48
            float r8 = r0.F
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0b48
            float r8 = r0.G
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0b48
            float r8 = r0.H
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0b48
            float r8 = r0.I
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0b48
            float r8 = r0.J
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0b48
            float r8 = r0.K
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0b48
            float r8 = r0.L
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0b48
            float r8 = r0.M
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0b48
            float r8 = r0.N
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x0b4c
        L_0x0b48:
            r8 = 25
            goto L_0x0bd4
        L_0x0b4c:
            r8 = 25
            byte[] r11 = new byte[r8]
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.wrap(r11)
            java.nio.ByteOrder r13 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r12 = r12.order(r13)
            r13 = 0
            r12.put(r13)
            float r13 = r0.E
            r15 = 1195593728(0x47435000, float:50000.0)
            float r13 = r13 * r15
            r16 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r16
            int r13 = (int) r13
            short r13 = (short) r13
            r12.putShort(r13)
            float r13 = r0.F
            float r13 = r13 * r15
            float r13 = r13 + r16
            int r13 = (int) r13
            short r13 = (short) r13
            r12.putShort(r13)
            float r13 = r0.G
            float r13 = r13 * r15
            float r13 = r13 + r16
            int r13 = (int) r13
            short r13 = (short) r13
            r12.putShort(r13)
            float r13 = r0.H
            float r13 = r13 * r15
            float r13 = r13 + r16
            int r13 = (int) r13
            short r13 = (short) r13
            r12.putShort(r13)
            float r13 = r0.I
            float r13 = r13 * r15
            float r13 = r13 + r16
            int r13 = (int) r13
            short r13 = (short) r13
            r12.putShort(r13)
            float r13 = r0.J
            float r13 = r13 * r15
            float r13 = r13 + r16
            int r13 = (int) r13
            short r13 = (short) r13
            r12.putShort(r13)
            float r13 = r0.K
            float r13 = r13 * r15
            float r13 = r13 + r16
            int r13 = (int) r13
            short r13 = (short) r13
            r12.putShort(r13)
            float r13 = r0.L
            float r13 = r13 * r15
            float r13 = r13 + r16
            int r13 = (int) r13
            short r13 = (short) r13
            r12.putShort(r13)
            float r13 = r0.M
            float r13 = r13 + r16
            int r13 = (int) r13
            short r13 = (short) r13
            r12.putShort(r13)
            float r13 = r0.N
            float r13 = r13 + r16
            int r13 = (int) r13
            short r13 = (short) r13
            r12.putShort(r13)
            int r13 = r0.C
            short r13 = (short) r13
            r12.putShort(r13)
            int r13 = r0.D
            short r13 = (short) r13
            r12.putShort(r13)
            r42 = r11
            goto L_0x0bd6
        L_0x0bd4:
            r42 = 0
        L_0x0bd6:
            int r11 = r0.z
            int r12 = r0.B
            int r13 = r0.A
            int r15 = r0.o
            m53 r16 = new m53
            r36 = r16
            r37 = r11
            r38 = r12
            r39 = r13
            r40 = r15
            r41 = r15
            r36.<init>(r37, r38, r39, r40, r41, r42)
            r11 = r16
            goto L_0x0bf5
        L_0x0bf2:
            r8 = 25
            r11 = 0
        L_0x0bf5:
            java.lang.String r12 = r0.a
            if (r12 == 0) goto L_0x0c0c
            boolean r12 = r5.containsKey(r12)
            if (r12 == 0) goto L_0x0c0c
            java.lang.String r12 = r0.a
            java.lang.Object r12 = r5.get(r12)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            goto L_0x0c0d
        L_0x0c0c:
            r12 = -1
        L_0x0c0d:
            int r13 = r0.s
            if (r13 != 0) goto L_0x0c5d
            float r13 = r0.t
            r15 = 0
            int r13 = java.lang.Float.compare(r13, r15)
            if (r13 != 0) goto L_0x0c5d
            float r13 = r0.u
            int r13 = java.lang.Float.compare(r13, r15)
            if (r13 != 0) goto L_0x0c5d
            float r13 = r0.v
            int r13 = java.lang.Float.compare(r13, r15)
            if (r13 != 0) goto L_0x0c2c
            r12 = 0
            goto L_0x0c5d
        L_0x0c2c:
            float r13 = r0.v
            r15 = 1119092736(0x42b40000, float:90.0)
            int r13 = java.lang.Float.compare(r13, r15)
            if (r13 != 0) goto L_0x0c39
            r12 = 90
            goto L_0x0c5d
        L_0x0c39:
            float r13 = r0.v
            r15 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r13 = java.lang.Float.compare(r13, r15)
            if (r13 == 0) goto L_0x0c5b
            float r13 = r0.v
            r15 = 1127481344(0x43340000, float:180.0)
            int r13 = java.lang.Float.compare(r13, r15)
            if (r13 != 0) goto L_0x0c4e
            goto L_0x0c5b
        L_0x0c4e:
            float r13 = r0.v
            r15 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r13 = java.lang.Float.compare(r13, r15)
            if (r13 != 0) goto L_0x0c5d
            r12 = 270(0x10e, float:3.78E-43)
            goto L_0x0c5d
        L_0x0c5b:
            r12 = 180(0xb4, float:2.52E-43)
        L_0x0c5d:
            int r13 = r0.m
            r2.s = r13
            int r13 = r0.n
            r2.t = r13
            r2.w = r3
            r2.v = r12
            byte[] r3 = r0.w
            r2.x = r3
            int r3 = r0.x
            r2.y = r3
            r2.z = r11
            r3 = r8
            r8 = 2
            goto L_0x0ca8
        L_0x0c76:
            r3 = 25
            boolean r11 = r11.equals(r9)
            if (r11 != 0) goto L_0x0ca7
            boolean r11 = r12.equals(r9)
            if (r11 != 0) goto L_0x0ca7
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0ca7
            boolean r8 = r15.equals(r9)
            if (r8 != 0) goto L_0x0ca7
            boolean r8 = r13.equals(r9)
            if (r8 != 0) goto L_0x0ca7
            r8 = r27
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0c9f
            goto L_0x0ca7
        L_0x0c9f:
            java.lang.String r0 = "Unexpected MIME type."
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0ca7:
            r8 = 3
        L_0x0ca8:
            java.lang.String r11 = r0.a
            if (r11 == 0) goto L_0x0cb6
            boolean r5 = r5.containsKey(r11)
            if (r5 != 0) goto L_0x0cb6
            java.lang.String r5 = r0.a
            r2.b = r5
        L_0x0cb6:
            java.lang.String r5 = java.lang.Integer.toString(r25)
            r2.a = r5
            java.lang.String r5 = defpackage.vq9.l(r9)
            r2.m = r5
            r2.n = r4
            java.lang.String r4 = r0.X
            r2.d = r4
            r2.e = r1
            r2.p = r10
            r2.i = r14
            yv4 r1 = r0.l
            r2.q = r1
            ea6 r1 = new ea6
            r1.<init>(r2)
            int r2 = r0.c
            r4 = r24
            zpf r2 = r4.B(r2, r8)
            r0.Y = r2
            r2.e(r1)
            int r1 = r0.c
            r2 = r26
            r2.put(r1, r0)
            r9 = r23
            r0 = 0
        L_0x0cee:
            r9.F0 = r0
            goto L_0x0d0b
        L_0x0cf1:
            r0 = 0
            java.lang.String r1 = "CodecId is missing in TrackEntry element"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x0cf9:
            r32 = r2
            r33 = r3
            r17 = r4
            r35 = r5
            r31 = r10
            r2 = r12
            r3 = 25
            int r0 = r9.R0
            r1 = 2
            if (r0 == r1) goto L_0x0d10
        L_0x0d0b:
            r2 = r31
            r1 = 0
            goto L_0x0d8d
        L_0x0d10:
            int r0 = r9.X0
            java.lang.Object r0 = r2.get(r0)
            jh8 r0 = (defpackage.jh8) r0
            zpf r1 = r0.Y
            r1.getClass()
            long r1 = r9.c1
            int r1 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r1 <= 0) goto L_0x0d4d
            java.lang.String r1 = r0.b
            r2 = r31
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0d4f
            r1 = 8
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r4.order(r1)
            long r4 = r9.c1
            java.nio.ByteBuffer r1 = r1.putLong(r4)
            byte[] r1 = r1.array()
            l8b r4 = r9.y0
            r4.getClass()
            int r5 = r1.length
            r4.E(r5, r1)
            goto L_0x0d4f
        L_0x0d4d:
            r2 = r31
        L_0x0d4f:
            r1 = 0
            r4 = 0
        L_0x0d51:
            int r5 = r9.V0
            if (r1 >= r5) goto L_0x0d5d
            int[] r5 = r9.W0
            r5 = r5[r1]
            int r4 = r4 + r5
            r5 = 1
            int r1 = r1 + r5
            goto L_0x0d51
        L_0x0d5d:
            r1 = 0
        L_0x0d5e:
            int r5 = r9.V0
            if (r1 >= r5) goto L_0x0d8a
            long r10 = r9.S0
            int r5 = r0.e
            int r5 = r5 * r1
            int r5 = r5 / 1000
            long r12 = (long) r5
            long r26 = r10 + r12
            int r5 = r9.Z0
            if (r1 != 0) goto L_0x0d76
            boolean r8 = r9.b1
            if (r8 != 0) goto L_0x0d76
            r8 = 1
            r5 = r5 | r8
        L_0x0d76:
            r28 = r5
            int[] r5 = r9.W0
            r29 = r5[r1]
            int r4 = r4 - r29
            r24 = r9
            r25 = r0
            r30 = r4
            r24.c(r25, r26, r28, r29, r30)
            r5 = 1
            int r1 = r1 + r5
            goto L_0x0d5e
        L_0x0d8a:
            r1 = 0
            r9.R0 = r1
        L_0x0d8d:
            r1 = 2
            r8 = 8
            r10 = 3
            r11 = 5
            r14 = 4
        L_0x0d93:
            r19 = 1
            goto L_0x1079
        L_0x0d97:
            r32 = r2
            r33 = r3
            r17 = r4
            r35 = r5
            r2 = r10
            r1 = 0
            r3 = 25
            int r0 = r9.c
            java.lang.Object r4 = r9.f
            g1g r4 = (defpackage.g1g) r4
            if (r0 != 0) goto L_0x0e18
            r0 = r44
            hf4 r0 = (defpackage.hf4) r0
            r5 = 1
            r10 = 4
            long r11 = r4.C(r0, r5, r1, r10)
            r13 = -2
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 != 0) goto L_0x0df6
            r0.w = r1
        L_0x0dbd:
            r0 = r44
            hf4 r0 = (defpackage.hf4) r0
            byte[] r5 = r9.a
            r0.q(r5, r1, r10, r1)
            byte r11 = r5[r1]
            int r11 = defpackage.g1g.f(r11)
            r12 = -1
            if (r11 == r12) goto L_0x0dfa
            if (r11 > r10) goto L_0x0dfa
            long r12 = defpackage.g1g.b(r11, r5, r1)
            int r1 = (int) r12
            java.lang.Object r5 = r9.g
            y35 r5 = (defpackage.y35) r5
            java.lang.Object r5 = r5.b
            lh8 r5 = (defpackage.lh8) r5
            r5.getClass()
            if (r1 == r15) goto L_0x0df2
            r5 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r1 == r5) goto L_0x0df2
            r5 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r1 == r5) goto L_0x0df2
            if (r1 != r8) goto L_0x0df0
            goto L_0x0df2
        L_0x0df0:
            r1 = 1
            goto L_0x0dfe
        L_0x0df2:
            r0.z(r11)
            long r11 = (long) r1
        L_0x0df6:
            r1 = 1
            r13 = -1
            goto L_0x0e04
        L_0x0dfa:
            r5 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            goto L_0x0df0
        L_0x0dfe:
            r0.z(r1)
            r1 = 0
            r10 = 4
            goto L_0x0dbd
        L_0x0e04:
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0e12
            r1 = 2
            r8 = 8
            r10 = 3
            r11 = 5
            r14 = 4
            r19 = 0
            goto L_0x1079
        L_0x0e12:
            int r0 = (int) r11
            r9.d = r0
            r9.c = r1
            goto L_0x0e19
        L_0x0e18:
            r1 = 1
        L_0x0e19:
            int r0 = r9.c
            if (r0 != r1) goto L_0x0e2e
            r0 = r44
            hf4 r0 = (defpackage.hf4) r0
            r5 = 0
            r8 = 8
            long r10 = r4.C(r0, r5, r1, r8)
            r9.e = r10
            r0 = 2
            r9.c = r0
            goto L_0x0e30
        L_0x0e2e:
            r8 = 8
        L_0x0e30:
            java.lang.Object r0 = r9.g
            y35 r0 = (defpackage.y35) r0
            int r1 = r9.d
            java.lang.Object r0 = r0.b
            lh8 r0 = (defpackage.lh8) r0
            r0.getClass()
            switch(r1) {
                case 131: goto L_0x0e4a;
                case 134: goto L_0x0e48;
                case 136: goto L_0x0e4a;
                case 155: goto L_0x0e4a;
                case 159: goto L_0x0e4a;
                case 160: goto L_0x0e46;
                case 161: goto L_0x0e44;
                case 163: goto L_0x0e44;
                case 165: goto L_0x0e44;
                case 166: goto L_0x0e46;
                case 174: goto L_0x0e46;
                case 176: goto L_0x0e4a;
                case 179: goto L_0x0e4a;
                case 181: goto L_0x0e42;
                case 183: goto L_0x0e46;
                case 186: goto L_0x0e4a;
                case 187: goto L_0x0e46;
                case 215: goto L_0x0e4a;
                case 224: goto L_0x0e46;
                case 225: goto L_0x0e46;
                case 231: goto L_0x0e4a;
                case 238: goto L_0x0e4a;
                case 241: goto L_0x0e4a;
                case 251: goto L_0x0e4a;
                case 16868: goto L_0x0e46;
                case 16871: goto L_0x0e4a;
                case 16877: goto L_0x0e44;
                case 16980: goto L_0x0e4a;
                case 16981: goto L_0x0e44;
                case 17026: goto L_0x0e48;
                case 17029: goto L_0x0e4a;
                case 17143: goto L_0x0e4a;
                case 17545: goto L_0x0e42;
                case 18401: goto L_0x0e4a;
                case 18402: goto L_0x0e44;
                case 18407: goto L_0x0e46;
                case 18408: goto L_0x0e4a;
                case 19899: goto L_0x0e46;
                case 20529: goto L_0x0e4a;
                case 20530: goto L_0x0e4a;
                case 20532: goto L_0x0e46;
                case 20533: goto L_0x0e46;
                case 21358: goto L_0x0e48;
                case 21419: goto L_0x0e44;
                case 21420: goto L_0x0e4a;
                case 21432: goto L_0x0e4a;
                case 21680: goto L_0x0e4a;
                case 21682: goto L_0x0e4a;
                case 21690: goto L_0x0e4a;
                case 21930: goto L_0x0e4a;
                case 21936: goto L_0x0e46;
                case 21938: goto L_0x0e4a;
                case 21945: goto L_0x0e4a;
                case 21946: goto L_0x0e4a;
                case 21947: goto L_0x0e4a;
                case 21948: goto L_0x0e4a;
                case 21949: goto L_0x0e4a;
                case 21968: goto L_0x0e46;
                case 21969: goto L_0x0e42;
                case 21970: goto L_0x0e42;
                case 21971: goto L_0x0e42;
                case 21972: goto L_0x0e42;
                case 21973: goto L_0x0e42;
                case 21974: goto L_0x0e42;
                case 21975: goto L_0x0e42;
                case 21976: goto L_0x0e42;
                case 21977: goto L_0x0e42;
                case 21978: goto L_0x0e42;
                case 21998: goto L_0x0e4a;
                case 22186: goto L_0x0e4a;
                case 22203: goto L_0x0e4a;
                case 25152: goto L_0x0e46;
                case 25188: goto L_0x0e4a;
                case 25506: goto L_0x0e44;
                case 28032: goto L_0x0e46;
                case 30113: goto L_0x0e46;
                case 30114: goto L_0x0e4a;
                case 30320: goto L_0x0e46;
                case 30321: goto L_0x0e4a;
                case 30322: goto L_0x0e44;
                case 30323: goto L_0x0e42;
                case 30324: goto L_0x0e42;
                case 30325: goto L_0x0e42;
                case 2274716: goto L_0x0e48;
                case 2352003: goto L_0x0e4a;
                case 2807729: goto L_0x0e4a;
                case 290298740: goto L_0x0e46;
                case 357149030: goto L_0x0e46;
                case 374648427: goto L_0x0e46;
                case 408125543: goto L_0x0e46;
                case 440786851: goto L_0x0e46;
                case 475249515: goto L_0x0e46;
                case 524531317: goto L_0x0e46;
                default: goto L_0x0e40;
            }
        L_0x0e40:
            r0 = 0
            goto L_0x0e4b
        L_0x0e42:
            r0 = 5
            goto L_0x0e4b
        L_0x0e44:
            r0 = 4
            goto L_0x0e4b
        L_0x0e46:
            r0 = 1
            goto L_0x0e4b
        L_0x0e48:
            r0 = 3
            goto L_0x0e4b
        L_0x0e4a:
            r0 = 2
        L_0x0e4b:
            if (r0 == 0) goto L_0x10bd
            r1 = 1
            if (r0 == r1) goto L_0x1048
            r4 = 8
            r1 = 2
            if (r0 == r1) goto L_0x1012
            r10 = 3
            if (r0 == r10) goto L_0x0f68
            r11 = 4
            if (r0 == r11) goto L_0x0f51
            r11 = 5
            if (r0 != r11) goto L_0x0f3d
            long r12 = r9.e
            r14 = 4
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0e81
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0e6b
            goto L_0x0e81
        L_0x0e6b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid float size: "
            r0.<init>(r1)
            long r1 = r9.e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0e81:
            java.lang.Object r0 = r9.g
            y35 r0 = (defpackage.y35) r0
            int r4 = r9.d
            int r5 = (int) r12
            r12 = r44
            hf4 r12 = (defpackage.hf4) r12
            long r12 = r9.b(r12, r5)
            r14 = 4
            if (r5 != r14) goto L_0x0e9a
            int r5 = (int) r12
            float r5 = java.lang.Float.intBitsToFloat(r5)
            double r12 = (double) r5
            goto L_0x0e9e
        L_0x0e9a:
            double r12 = java.lang.Double.longBitsToDouble(r12)
        L_0x0e9e:
            java.lang.Object r0 = r0.b
            lh8 r0 = (defpackage.lh8) r0
            r5 = 181(0xb5, float:2.54E-43)
            if (r4 == r5) goto L_0x0f2f
            r5 = 17545(0x4489, float:2.4586E-41)
            if (r4 == r5) goto L_0x0f2b
            switch(r4) {
                case 21969: goto L_0x0f22;
                case 21970: goto L_0x0f19;
                case 21971: goto L_0x0f10;
                case 21972: goto L_0x0f07;
                case 21973: goto L_0x0efe;
                case 21974: goto L_0x0ef5;
                case 21975: goto L_0x0eec;
                case 21976: goto L_0x0ee3;
                case 21977: goto L_0x0eda;
                case 21978: goto L_0x0ed1;
                default: goto L_0x0ead;
            }
        L_0x0ead:
            switch(r4) {
                case 30323: goto L_0x0ec8;
                case 30324: goto L_0x0ebf;
                case 30325: goto L_0x0eb6;
                default: goto L_0x0eb0;
            }
        L_0x0eb0:
            r0.getClass()
        L_0x0eb3:
            r0 = 0
            goto L_0x0f39
        L_0x0eb6:
            r0.b(r4)
            jh8 r0 = r0.F0
            float r4 = (float) r12
            r0.v = r4
            goto L_0x0eb3
        L_0x0ebf:
            r0.b(r4)
            jh8 r0 = r0.F0
            float r4 = (float) r12
            r0.u = r4
            goto L_0x0eb3
        L_0x0ec8:
            r0.b(r4)
            jh8 r0 = r0.F0
            float r4 = (float) r12
            r0.t = r4
            goto L_0x0eb3
        L_0x0ed1:
            r0.b(r4)
            jh8 r0 = r0.F0
            float r4 = (float) r12
            r0.N = r4
            goto L_0x0eb3
        L_0x0eda:
            r0.b(r4)
            jh8 r0 = r0.F0
            float r4 = (float) r12
            r0.M = r4
            goto L_0x0eb3
        L_0x0ee3:
            r0.b(r4)
            jh8 r0 = r0.F0
            float r4 = (float) r12
            r0.L = r4
            goto L_0x0eb3
        L_0x0eec:
            r0.b(r4)
            jh8 r0 = r0.F0
            float r4 = (float) r12
            r0.K = r4
            goto L_0x0eb3
        L_0x0ef5:
            r0.b(r4)
            jh8 r0 = r0.F0
            float r4 = (float) r12
            r0.J = r4
            goto L_0x0eb3
        L_0x0efe:
            r0.b(r4)
            jh8 r0 = r0.F0
            float r4 = (float) r12
            r0.I = r4
            goto L_0x0eb3
        L_0x0f07:
            r0.b(r4)
            jh8 r0 = r0.F0
            float r4 = (float) r12
            r0.H = r4
            goto L_0x0eb3
        L_0x0f10:
            r0.b(r4)
            jh8 r0 = r0.F0
            float r4 = (float) r12
            r0.G = r4
            goto L_0x0eb3
        L_0x0f19:
            r0.b(r4)
            jh8 r0 = r0.F0
            float r4 = (float) r12
            r0.F = r4
            goto L_0x0eb3
        L_0x0f22:
            r0.b(r4)
            jh8 r0 = r0.F0
            float r4 = (float) r12
            r0.E = r4
            goto L_0x0eb3
        L_0x0f2b:
            long r4 = (long) r12
            r0.D0 = r4
            goto L_0x0eb3
        L_0x0f2f:
            r0.b(r4)
            jh8 r0 = r0.F0
            int r4 = (int) r12
            r0.R = r4
            goto L_0x0eb3
        L_0x0f39:
            r9.c = r0
            goto L_0x0d93
        L_0x0f3d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid element type "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0f51:
            r14 = r11
            r11 = 5
            java.lang.Object r0 = r9.g
            y35 r0 = (defpackage.y35) r0
            int r4 = r9.d
            long r12 = r9.e
            int r5 = (int) r12
            r12 = r44
            hf4 r12 = (defpackage.hf4) r12
            r0.o(r4, r5, r12)
            r0 = 0
            r9.c = r0
            goto L_0x0d93
        L_0x0f68:
            r11 = 5
            r14 = 4
            long r4 = r9.e
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0ffc
            java.lang.Object r0 = r9.g
            y35 r0 = (defpackage.y35) r0
            int r12 = r9.d
            int r4 = (int) r4
            if (r4 != 0) goto L_0x0f7f
            java.lang.String r4 = ""
            goto L_0x0f9c
        L_0x0f7f:
            byte[] r5 = new byte[r4]
            r13 = r44
            hf4 r13 = (defpackage.hf4) r13
            r15 = 0
            r13.j(r5, r15, r4, r15)
        L_0x0f89:
            if (r4 <= 0) goto L_0x0f95
            r13 = 1
            int r15 = r4 + -1
            byte r13 = r5[r15]
            if (r13 != 0) goto L_0x0f95
            r13 = -1
            int r4 = r4 + r13
            goto L_0x0f89
        L_0x0f95:
            java.lang.String r13 = new java.lang.String
            r15 = 0
            r13.<init>(r5, r15, r4)
            r4 = r13
        L_0x0f9c:
            java.lang.Object r0 = r0.b
            lh8 r0 = (defpackage.lh8) r0
            r0.getClass()
            r5 = 134(0x86, float:1.88E-43)
            if (r12 == r5) goto L_0x0ff0
            r5 = 17026(0x4282, float:2.3859E-41)
            if (r12 == r5) goto L_0x0fc6
            r5 = 21358(0x536e, float:2.9929E-41)
            if (r12 == r5) goto L_0x0fbe
            r5 = 2274716(0x22b59c, float:3.187556E-39)
            if (r12 == r5) goto L_0x0fb6
        L_0x0fb4:
            r0 = 0
            goto L_0x0ff8
        L_0x0fb6:
            r0.b(r12)
            jh8 r0 = r0.F0
            r0.X = r4
            goto L_0x0fb4
        L_0x0fbe:
            r0.b(r12)
            jh8 r0 = r0.F0
            r0.a = r4
            goto L_0x0fb4
        L_0x0fc6:
            java.lang.String r0 = "webm"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0fb4
            java.lang.String r0 = "matroska"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0fd7
            goto L_0x0fb4
        L_0x0fd7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DocType "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " not supported"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0ff0:
            r0.b(r12)
            jh8 r0 = r0.F0
            r0.b = r4
            goto L_0x0fb4
        L_0x0ff8:
            r9.c = r0
            goto L_0x0d93
        L_0x0ffc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "String element size: "
            r0.<init>(r1)
            long r1 = r9.e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x1012:
            r10 = 3
            r11 = 5
            r14 = 4
            long r12 = r9.e
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x1032
            java.lang.Object r0 = r9.g
            y35 r0 = (defpackage.y35) r0
            int r4 = r9.d
            int r5 = (int) r12
            r12 = r44
            hf4 r12 = (defpackage.hf4) r12
            long r12 = r9.b(r12, r5)
            r0.p(r4, r12)
            r0 = 0
            r9.c = r0
            goto L_0x0d93
        L_0x1032:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid integer size: "
            r0.<init>(r1)
            long r1 = r9.e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x1048:
            r1 = 2
            r10 = 3
            r11 = 5
            r14 = 4
            r0 = r44
            hf4 r0 = (defpackage.hf4) r0
            long r4 = r0.o
            long r12 = r9.e
            long r12 = r12 + r4
            re4 r0 = new re4
            int r15 = r9.d
            r0.<init>(r15, r12)
            r12 = r19
            r12.push(r0)
            java.lang.Object r0 = r9.g
            r22 = r0
            y35 r22 = (defpackage.y35) r22
            int r0 = r9.d
            long r12 = r9.e
            r23 = r0
            r24 = r4
            r26 = r12
            r22.t(r23, r24, r26)
            r0 = 0
            r9.c = r0
            goto L_0x0d93
        L_0x1079:
            if (r19 == 0) goto L_0x10aa
            r0 = r44
            hf4 r0 = (defpackage.hf4) r0
            long r4 = r0.o
            r0 = r43
            boolean r9 = r0.J0
            if (r9 == 0) goto L_0x1094
            r0.L0 = r4
            long r1 = r0.K0
            r4 = r45
            r4.b = r1
            r1 = 0
            r0.J0 = r1
        L_0x1092:
            r0 = 1
            goto L_0x10a9
        L_0x1094:
            r4 = r45
            boolean r5 = r0.G0
            if (r5 == 0) goto L_0x10ae
            long r12 = r0.L0
            r31 = r2
            r1 = -1
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x10b0
            r4.b = r12
            r0.L0 = r1
            goto L_0x1092
        L_0x10a9:
            return r0
        L_0x10aa:
            r0 = r43
            r4 = r45
        L_0x10ae:
            r31 = r2
        L_0x10b0:
            r1 = r4
            r4 = r17
            r10 = r31
            r2 = r32
            r3 = r33
            r5 = r35
            goto L_0x0017
        L_0x10bd:
            r10 = 3
            r11 = 5
            r14 = 4
            r0 = r43
            r4 = r45
            r31 = r2
            long r1 = r9.e
            int r1 = (int) r1
            r2 = r44
            hf4 r2 = (defpackage.hf4) r2
            r2.z(r1)
            r1 = 0
            r9.c = r1
            r1 = r4
            r4 = r17
            r10 = r31
            r2 = r32
            r3 = r33
            r5 = r35
            goto L_0x0026
        L_0x10e0:
            if (r19 != 0) goto L_0x1106
            r11 = 0
        L_0x10e3:
            android.util.SparseArray r1 = r0.c
            int r2 = r1.size()
            if (r11 >= r2) goto L_0x1104
            java.lang.Object r1 = r1.valueAt(r11)
            jh8 r1 = (defpackage.jh8) r1
            zpf r2 = r1.Y
            r2.getClass()
            etf r2 = r1.U
            if (r2 == 0) goto L_0x1101
            zpf r3 = r1.Y
            xpf r1 = r1.j
            r2.b(r3, r1)
        L_0x1101:
            r1 = 1
            int r11 = r11 + r1
            goto L_0x10e3
        L_0x1104:
            r2 = -1
            return r2
        L_0x1106:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh8.g(vf5, yl4):int");
    }

    public final void h() {
        this.d1 = 0;
        this.e1 = 0;
        this.f1 = 0;
        this.g1 = false;
        this.h1 = false;
        this.i1 = false;
        this.j1 = 0;
        this.k1 = 0;
        this.l1 = false;
        this.Z.D(0);
    }

    public final long i(long j) {
        long j2 = this.C0;
        if (j2 != -9223372036854775807L) {
            int i = v0g.a;
            return v0g.a0(j, j2, 1000, RoundingMode.FLOOR);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", (RuntimeException) null);
    }

    public final int j(hf4 hf4, jh8 jh8, int i, boolean z2) {
        int i2;
        int i3;
        int i4;
        hf4 hf42 = hf4;
        jh8 jh82 = jh8;
        int i5 = i;
        if ("S_TEXT/UTF8".equals(jh82.b)) {
            k(hf42, n1, i5);
            int i6 = this.e1;
            h();
            return i6;
        } else if ("S_TEXT/ASS".equals(jh82.b)) {
            k(hf42, p1, i5);
            int i7 = this.e1;
            h();
            return i7;
        } else if ("S_TEXT/WEBVTT".equals(jh82.b)) {
            k(hf42, q1, i5);
            int i8 = this.e1;
            h();
            return i8;
        } else {
            zpf zpf = jh82.Y;
            boolean z3 = this.g1;
            boolean z4 = true;
            l8b l8b = this.Z;
            if (!z3) {
                boolean z5 = jh82.h;
                l8b l8b2 = this.z;
                if (z5) {
                    this.Z0 &= -1073741825;
                    boolean z6 = this.h1;
                    int i9 = Uuid.SIZE_BITS;
                    if (!z6) {
                        hf42.j(l8b2.a, 0, 1, false);
                        this.d1++;
                        byte b2 = l8b2.a[0];
                        if ((b2 & ByteCompanionObject.MIN_VALUE) != 128) {
                            this.k1 = b2;
                            this.h1 = true;
                        } else {
                            throw ParserException.a("Extension bit is set in signal byte", (RuntimeException) null);
                        }
                    }
                    byte b3 = this.k1;
                    if ((b3 & 1) == 1) {
                        boolean z7 = (b3 & 2) == 2;
                        this.Z0 |= 1073741824;
                        if (!this.l1) {
                            l8b l8b3 = this.w0;
                            hf42.j(l8b3.a, 0, 8, false);
                            this.d1 += 8;
                            this.l1 = true;
                            byte[] bArr = l8b2.a;
                            if (!z7) {
                                i9 = 0;
                            }
                            bArr[0] = (byte) (i9 | 8);
                            l8b2.G(0);
                            zpf.b(l8b2, 1, 1);
                            this.e1++;
                            l8b3.G(0);
                            zpf.b(l8b3, 8, 1);
                            this.e1 += 8;
                        }
                        if (z7) {
                            if (!this.i1) {
                                hf42.j(l8b2.a, 0, 1, false);
                                this.d1++;
                                l8b2.G(0);
                                this.j1 = l8b2.u();
                                this.i1 = true;
                            }
                            int i10 = this.j1 * 4;
                            l8b2.D(i10);
                            hf42.j(l8b2.a, 0, i10, false);
                            this.d1 += i10;
                            short s = (short) ((this.j1 / 2) + 1);
                            int i11 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.z0;
                            if (byteBuffer == null || byteBuffer.capacity() < i11) {
                                this.z0 = ByteBuffer.allocate(i11);
                            }
                            this.z0.position(0);
                            this.z0.putShort(s);
                            int i12 = 0;
                            int i13 = 0;
                            while (true) {
                                i4 = this.j1;
                                if (i12 >= i4) {
                                    break;
                                }
                                int y2 = l8b2.y();
                                if (i12 % 2 == 0) {
                                    this.z0.putShort((short) (y2 - i13));
                                } else {
                                    this.z0.putInt(y2 - i13);
                                }
                                i12++;
                                i13 = y2;
                            }
                            int i14 = (i5 - this.d1) - i13;
                            if (i4 % 2 == 1) {
                                this.z0.putInt(i14);
                            } else {
                                this.z0.putShort((short) i14);
                                this.z0.putInt(0);
                            }
                            byte[] array = this.z0.array();
                            l8b l8b4 = this.x0;
                            l8b4.E(i11, array);
                            zpf.b(l8b4, i11, 1);
                            this.e1 += i11;
                        }
                    }
                } else {
                    byte[] bArr2 = jh82.i;
                    if (bArr2 != null) {
                        l8b.E(bArr2.length, bArr2);
                    }
                }
                if ("A_OPUS".equals(jh82.b) ? z2 : jh82.f > 0) {
                    this.Z0 |= 268435456;
                    this.y0.D(0);
                    int i15 = (l8b.c + i5) - this.d1;
                    l8b2.D(4);
                    byte[] bArr3 = l8b2.a;
                    bArr3[0] = (byte) ((i15 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                    bArr3[1] = (byte) ((i15 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    bArr3[2] = (byte) ((i15 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    bArr3[3] = (byte) (i15 & KotlinVersion.MAX_COMPONENT_VALUE);
                    zpf.b(l8b2, 4, 2);
                    this.e1 += 4;
                }
                this.g1 = true;
            }
            int i16 = i5 + l8b.c;
            if (!"V_MPEG4/ISO/AVC".equals(jh82.b) && !"V_MPEGH/ISO/HEVC".equals(jh82.b)) {
                if (jh82.U != null) {
                    if (l8b.c != 0) {
                        z4 = false;
                    }
                    n79.n(z4);
                    jh82.U.f(hf42);
                }
                while (true) {
                    int i17 = this.d1;
                    if (i17 >= i16) {
                        break;
                    }
                    int i18 = i16 - i17;
                    int a2 = l8b.a();
                    if (a2 > 0) {
                        i3 = Math.min(i18, a2);
                        zpf.b(l8b, i3, 0);
                    } else {
                        i3 = zpf.c(hf42, i18, false);
                    }
                    this.d1 += i3;
                    this.e1 += i3;
                }
            } else {
                l8b l8b5 = this.y;
                byte[] bArr4 = l8b5.a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i19 = jh82.Z;
                int i20 = 4 - i19;
                while (this.d1 < i16) {
                    int i21 = this.f1;
                    if (i21 == 0) {
                        int min = Math.min(i19, l8b.a());
                        hf42.j(bArr4, i20 + min, i19 - min, false);
                        if (min > 0) {
                            l8b.e(i20, bArr4, min);
                        }
                        this.d1 += i19;
                        l8b5.G(0);
                        this.f1 = l8b5.y();
                        l8b l8b6 = this.x;
                        l8b6.G(0);
                        zpf.b(l8b6, 4, 0);
                        this.e1 += 4;
                    } else {
                        int a3 = l8b.a();
                        if (a3 > 0) {
                            i2 = Math.min(i21, a3);
                            zpf.b(l8b, i2, 0);
                        } else {
                            i2 = zpf.c(hf42, i21, false);
                        }
                        this.d1 += i2;
                        this.e1 += i2;
                        this.f1 -= i2;
                    }
                }
            }
            if ("A_VORBIS".equals(jh82.b)) {
                l8b l8b7 = this.X;
                l8b7.G(0);
                zpf.b(l8b7, 4, 0);
                this.e1 += 4;
            }
            int i22 = this.e1;
            h();
            return i22;
        }
    }

    public final void k(hf4 hf4, byte[] bArr, int i) {
        int length = bArr.length + i;
        l8b l8b = this.v0;
        byte[] bArr2 = l8b.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            l8b.E(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        hf4.j(l8b.a, bArr.length, i, false);
        l8b.G(0);
        l8b.F(length);
    }

    public final boolean n(vf5 vf5) {
        long J;
        int i;
        ni0 ni0 = new ni0(21);
        long j = ((hf4) vf5).c;
        int i2 = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        long j2 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (i2 != 0 && j <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j2 = j;
        }
        int i3 = (int) j2;
        l8b l8b = (l8b) ni0.c;
        hf4 hf4 = (hf4) vf5;
        hf4.q(l8b.a, 0, 4, false);
        ni0.b = 4;
        for (long w2 = l8b.w(); w2 != 440786851; w2 = ((w2 << 8) & -256) | ((long) (l8b.a[0] & UByte.MAX_VALUE))) {
            int i4 = ni0.b + 1;
            ni0.b = i4;
            if (i4 == i3) {
                return false;
            }
            hf4.q(l8b.a, 0, 1, false);
        }
        long J2 = ni0.J(hf4);
        long j3 = (long) ni0.b;
        if (J2 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j3 + J2 >= j) {
            return false;
        }
        while (true) {
            int i5 = (((long) ni0.b) > (j3 + J2) ? 1 : (((long) ni0.b) == (j3 + J2) ? 0 : -1));
            if (i5 >= 0) {
                return i5 == 0;
            }
            if (ni0.J(hf4) == Long.MIN_VALUE || J < 0 || J > 2147483647L) {
                return false;
            }
            if (i != 0) {
                int J3 = (int) (J = ni0.J(hf4));
                hf4.a(J3, false);
                ni0.b += J3;
            }
        }
    }

    public final void release() {
    }
}
