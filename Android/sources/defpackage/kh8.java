package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
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

/* renamed from: kh8  reason: default package */
public final class kh8 implements sf5 {
    public static final byte[] b0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] c0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(x22.c);
    public static final byte[] d0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] e0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID f0 = new UUID(72057594037932032L, -9223371306706625679L);
    public static final Map g0;
    public long A = -1;
    public long B = -9223372036854775807L;
    public pa8 C;
    public pa8 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public byte Y;
    public boolean Z;
    public final se4 a;
    public wf5 a0;
    public final g1g b;
    public final SparseArray c;
    public final boolean d;
    public final g1g e;
    public final g1g f;
    public final g1g g;
    public final g1g h;
    public final g1g i;
    public final g1g j;
    public final g1g k;
    public final g1g l;
    public final g1g m;
    public final g1g n;
    public ByteBuffer o;
    public long p;
    public long q = -1;
    public long r = -9223372036854775807L;
    public long s = -9223372036854775807L;
    public long t = -9223372036854775807L;
    public ih8 u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z = -1;

    static {
        int i2 = t0g.a;
        HashMap hashMap = new HashMap();
        a81.q(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        a81.q(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        g0 = Collections.unmodifiableMap(hashMap);
    }

    public kh8(int i2) {
        se4 se4 = new se4(0);
        this.a = se4;
        se4.g = new xv1(27, (Object) this);
        this.d = (i2 & 1) == 0;
        this.b = new g1g(0, false);
        this.c = new SparseArray();
        this.g = new g1g(4);
        this.h = new g1g(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new g1g(4);
        this.e = new g1g(vzg.b);
        this.f = new g1g(4);
        this.j = new g1g(3, false);
        this.k = new g1g(3, false);
        this.l = new g1g(8);
        this.m = new g1g(3, false);
        this.n = new g1g(3, false);
        this.L = new int[1];
    }

    public static byte[] e(long j2, String str, long j3) {
        y64.g(j2 != -9223372036854775807L);
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - (((long) (i2 * 3600)) * 1000000);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - (((long) (i3 * 60)) * 1000000);
        int i4 = (int) (j5 / 1000000);
        String format = String.format(Locale.US, str, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (((long) i4) * 1000000)) / j3))});
        int i5 = t0g.a;
        return format.getBytes(x22.c);
    }

    public final void a(int i2) {
        if (this.C == null || this.D == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i2);
            sb.append(" must be in a Cues");
            throw ParserException.a(sb.toString(), (RuntimeException) null);
        }
    }

    public final void b(int i2) {
        if (this.u == null) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Element ");
            sb.append(i2);
            sb.append(" must be in a TrackEntry");
            throw ParserException.a(sb.toString(), (RuntimeException) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.ih8 r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            java.lang.String r3 = "S_TEXT/WEBVTT"
            java.lang.String r4 = "S_TEXT/ASS"
            java.lang.String r5 = "S_TEXT/UTF8"
            etf r6 = r1.T
            r9 = 1
            if (r6 == 0) goto L_0x0022
            ypf r2 = r1.X
            wpf r8 = r1.j
            r1 = r6
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r1.c(r2, r3, r5, r6, r7, r8)
            goto L_0x00ee
        L_0x0022:
            java.lang.String r6 = r1.b
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x003a
            java.lang.String r6 = r1.b
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L_0x003a
            java.lang.String r6 = r1.b
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x004a
        L_0x003a:
            int r6 = r0.K
            if (r6 <= r9) goto L_0x003f
            goto L_0x004a
        L_0x003f:
            long r6 = r0.I
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x004e
        L_0x004a:
            r2 = r22
            goto L_0x00c2
        L_0x004e:
            java.lang.String r8 = r1.b
            g1g r10 = r0.k
            byte[] r11 = r10.a
            r8.getClass()
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = -1
            int r15 = r8.hashCode()
            switch(r15) {
                case 738597099: goto L_0x0074;
                case 1045209816: goto L_0x006b;
                case 1422270023: goto L_0x0062;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x007c
        L_0x0062:
            boolean r3 = r8.equals(r5)
            if (r3 != 0) goto L_0x0069
            goto L_0x007c
        L_0x0069:
            r14 = 2
            goto L_0x007c
        L_0x006b:
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x0072
            goto L_0x007c
        L_0x0072:
            r14 = r9
            goto L_0x007c
        L_0x0074:
            boolean r3 = r8.equals(r4)
            if (r3 != 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r14 = r2
        L_0x007c:
            switch(r14) {
                case 0: goto L_0x0097;
                case 1: goto L_0x008e;
                case 2: goto L_0x0085;
                default: goto L_0x007f;
            }
        L_0x007f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0085:
            java.lang.String r3 = "%02d:%02d:%02d,%03d"
            byte[] r3 = e(r6, r3, r12)
            r4 = 19
            goto L_0x00a1
        L_0x008e:
            java.lang.String r3 = "%02d:%02d:%02d.%03d"
            byte[] r3 = e(r6, r3, r12)
            r4 = 25
            goto L_0x00a1
        L_0x0097:
            java.lang.String r3 = "%01d:%02d:%02d:%02d"
            r4 = 10000(0x2710, double:4.9407E-320)
            byte[] r3 = e(r6, r3, r4)
            r4 = 21
        L_0x00a1:
            int r5 = r3.length
            java.lang.System.arraycopy(r3, r2, r11, r4, r5)
            int r2 = r10.b
        L_0x00a7:
            int r3 = r10.c
            if (r2 >= r3) goto L_0x00b7
            byte[] r3 = r10.a
            byte r3 = r3[r2]
            if (r3 != 0) goto L_0x00b5
            r10.G(r2)
            goto L_0x00b7
        L_0x00b5:
            int r2 = r2 + r9
            goto L_0x00a7
        L_0x00b7:
            ypf r2 = r1.X
            int r3 = r10.c
            r2.c(r3, r10)
            int r2 = r10.c
            int r2 = r22 + r2
        L_0x00c2:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r21 & r3
            if (r3 == 0) goto L_0x00de
            int r3 = r0.K
            if (r3 <= r9) goto L_0x00d4
            r3 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r3 = r21 & r3
            r14 = r2
            r13 = r3
            goto L_0x00e1
        L_0x00d4:
            g1g r3 = r0.n
            int r4 = r3.c
            ypf r5 = r1.X
            r5.c(r4, r3)
            int r2 = r2 + r4
        L_0x00de:
            r13 = r21
            r14 = r2
        L_0x00e1:
            ypf r10 = r1.X
            wpf r1 = r1.j
            r11 = r19
            r15 = r23
            r16 = r1
            r10.b(r11, r13, r14, r15, r16)
        L_0x00ee:
            r0.F = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh8.c(ih8, long, int, int, int):void");
    }

    public final void d(long j2, long j3) {
        this.B = -9223372036854775807L;
        this.G = 0;
        se4 se4 = this.a;
        se4.c = 0;
        se4.b.clear();
        g1g g1g = (g1g) se4.f;
        g1g.b = 0;
        g1g.c = 0;
        g1g g1g2 = this.b;
        g1g2.b = 0;
        g1g2.c = 0;
        j();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i2 < sparseArray.size()) {
                etf etf = ((ih8) sparseArray.valueAt(i2)).T;
                if (etf != null) {
                    etf.b = false;
                    etf.c = 0;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void f(gf4 gf4, int i2) {
        g1g g1g = this.g;
        if (g1g.c < i2) {
            byte[] bArr = g1g.a;
            if (bArr.length < i2) {
                g1g.d(Math.max(bArr.length * 2, i2));
            }
            byte[] bArr2 = g1g.a;
            int i3 = g1g.c;
            gf4.j(bArr2, i3, i2 - i3, false);
            g1g.G(i2);
        }
    }

    public final void g(wf5 wf5) {
        this.a0 = wf5;
    }

    public final boolean h(uf5 uf5) {
        long H2;
        int i2;
        ni0 ni0 = new ni0(20);
        gf4 gf4 = (gf4) uf5;
        long j2 = gf4.c;
        int i3 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        long j3 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (i3 != 0 && j2 <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j3 = j2;
        }
        int i4 = (int) j3;
        g1g g1g = (g1g) ni0.c;
        gf4.q(g1g.a, 0, 4, false);
        ni0.b = 4;
        for (long w2 = g1g.w(); w2 != 440786851; w2 = ((w2 << 8) & -256) | ((long) (g1g.a[0] & UByte.MAX_VALUE))) {
            int i5 = ni0.b + 1;
            ni0.b = i5;
            if (i5 == i4) {
                return false;
            }
            gf4.q(g1g.a, 0, 1, false);
        }
        long H3 = ni0.H(gf4);
        long j4 = (long) ni0.b;
        if (H3 == Long.MIN_VALUE) {
            return false;
        }
        if (i3 != 0 && j4 + H3 >= j2) {
            return false;
        }
        while (true) {
            int i6 = (((long) ni0.b) > (j4 + H3) ? 1 : (((long) ni0.b) == (j4 + H3) ? 0 : -1));
            if (i6 >= 0) {
                return i6 == 0;
            }
            if (ni0.H(gf4) == Long.MIN_VALUE || H2 < 0 || H2 > 2147483647L) {
                return false;
            }
            if (i2 != 0) {
                int H4 = (int) (H2 = ni0.H(gf4));
                gf4.a(H4, false);
                ni0.b += H4;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v54, resolved type: k0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v55, resolved type: k0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v60, resolved type: k0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v63, resolved type: k0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v64, resolved type: k0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v67, resolved type: k0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v90, resolved type: k0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v91, resolved type: k0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v92, resolved type: k0d} */
    /* JADX WARNING: type inference failed for: r2v7, types: [ih8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r4v26, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03a1, code lost:
        r9 = r6;
        r6 = r38;
        r7 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03fa, code lost:
        switch(r9) {
            case 0: goto L_0x040c;
            case 1: goto L_0x040c;
            case 2: goto L_0x040c;
            case 3: goto L_0x040c;
            case 4: goto L_0x040c;
            case 5: goto L_0x040c;
            case 6: goto L_0x040c;
            case 7: goto L_0x040c;
            case 8: goto L_0x040c;
            case 9: goto L_0x040c;
            case 10: goto L_0x040c;
            case 11: goto L_0x040c;
            case 12: goto L_0x040c;
            case 13: goto L_0x040c;
            case ru.ok.tamtam.nano.Protos.Attaches.Attach.LOCATION :int: goto L_0x040c;
            case ru.ok.tamtam.nano.Protos.Attaches.Attach.DAILY_MEDIA :int: goto L_0x040c;
            case 16: goto L_0x040c;
            case org.apache.http.util.LangUtils.HASH_SEED :int: goto L_0x040c;
            case 18: goto L_0x040c;
            case 19: goto L_0x040c;
            case 20: goto L_0x040c;
            case 21: goto L_0x040c;
            case 22: goto L_0x040c;
            case 23: goto L_0x040c;
            case one.me.common.drawable.SavedMessagesIconDrawable.NORMAL_ICON_SIZE :int: goto L_0x040c;
            case 25: goto L_0x040c;
            case 26: goto L_0x040c;
            case 27: goto L_0x040c;
            case 28: goto L_0x040c;
            case 29: goto L_0x040c;
            case 30: goto L_0x040c;
            case 31: goto L_0x040c;
            case 32: goto L_0x040c;
            default: goto L_0x03fd;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03fd, code lost:
        r40 = r0;
        r38 = r2;
        r39 = r3;
        r41 = r4;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x040c, code lost:
        r12 = "video/x-unknown";
        r21 = r8;
        r22 = r10;
        r25 = r8.a0;
        r28 = r1.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x042e, code lost:
        switch(r5.hashCode()) {
            case -2095576542: goto L_0x0617;
            case -2095575984: goto L_0x060c;
            case -1985379776: goto L_0x0601;
            case -1784763192: goto L_0x05f6;
            case -1730367663: goto L_0x05eb;
            case -1482641358: goto L_0x05e0;
            case -1482641357: goto L_0x05d3;
            case -1373388978: goto L_0x05c6;
            case -933872740: goto L_0x05b6;
            case -538363189: goto L_0x05a6;
            case -538363109: goto L_0x0596;
            case -425012669: goto L_0x0586;
            case -356037306: goto L_0x0576;
            case 62923557: goto L_0x0566;
            case 62923603: goto L_0x0556;
            case 62927045: goto L_0x0546;
            case 82318131: goto L_0x0536;
            case 82338133: goto L_0x0526;
            case 82338134: goto L_0x0516;
            case 99146302: goto L_0x0506;
            case 444813526: goto L_0x04f6;
            case 542569478: goto L_0x04e6;
            case 635596514: goto L_0x04d6;
            case 725948237: goto L_0x04c6;
            case 725957860: goto L_0x04b6;
            case 738597099: goto L_0x04a6;
            case 855502857: goto L_0x0496;
            case 1045209816: goto L_0x0486;
            case 1422270023: goto L_0x0476;
            case 1809237540: goto L_0x0466;
            case 1950749482: goto L_0x0456;
            case 1950789798: goto L_0x0446;
            case 1951062397: goto L_0x0436;
            default: goto L_0x0431;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0431, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0433, code lost:
        r13 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0436, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x043e, code lost:
        if (r5.equals("A_OPUS") != false) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0442, code lost:
        r13 = ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0446, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x044e, code lost:
        if (r5.equals("A_FLAC") != false) goto L_0x0452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0452, code lost:
        r13 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0456, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x045e, code lost:
        if (r5.equals("A_EAC3") != false) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0462, code lost:
        r13 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0466, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x046e, code lost:
        if (r5.equals("V_MPEG2") != false) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0472, code lost:
        r13 = 29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0476, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x047e, code lost:
        if (r5.equals("S_TEXT/UTF8") != false) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0482, code lost:
        r13 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0486, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x048e, code lost:
        if (r5.equals("S_TEXT/WEBVTT") != false) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0492, code lost:
        r13 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0496, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x049e, code lost:
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L_0x04a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04a2, code lost:
        r13 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04a6, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04ae, code lost:
        if (r5.equals("S_TEXT/ASS") != false) goto L_0x04b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04b2, code lost:
        r13 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04b6, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04be, code lost:
        if (r5.equals("A_PCM/INT/LIT") != false) goto L_0x04c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04c2, code lost:
        r13 = 24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04c6, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04ce, code lost:
        if (r5.equals("A_PCM/INT/BIG") != false) goto L_0x04d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04d2, code lost:
        r13 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04d6, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04de, code lost:
        if (r5.equals("A_PCM/FLOAT/IEEE") != false) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04e2, code lost:
        r13 = 22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04e6, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04ee, code lost:
        if (r5.equals("A_DTS/EXPRESS") != false) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04f2, code lost:
        r13 = 21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04f6, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04fe, code lost:
        if (r5.equals("V_THEORA") != false) goto L_0x0502;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0502, code lost:
        r13 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0506, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x050e, code lost:
        if (r5.equals("S_HDMV/PGS") != false) goto L_0x0512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0512, code lost:
        r13 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0516, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x051e, code lost:
        if (r5.equals("V_VP9") != false) goto L_0x0522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0522, code lost:
        r13 = 18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0526, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x052e, code lost:
        if (r5.equals("V_VP8") != false) goto L_0x0532;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0532, code lost:
        r13 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0536, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x053e, code lost:
        if (r5.equals("V_AV1") != false) goto L_0x0542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0542, code lost:
        r13 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0546, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x054e, code lost:
        if (r5.equals("A_DTS") != false) goto L_0x0552;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0552, code lost:
        r13 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0556, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x055e, code lost:
        if (r5.equals("A_AC3") != false) goto L_0x0562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0562, code lost:
        r13 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0566, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x056e, code lost:
        if (r5.equals("A_AAC") != false) goto L_0x0572;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0572, code lost:
        r13 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0576, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x057e, code lost:
        if (r5.equals("A_DTS/LOSSLESS") != false) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0582, code lost:
        r13 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0586, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x058e, code lost:
        if (r5.equals("S_VOBSUB") != false) goto L_0x0592;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0592, code lost:
        r13 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0596, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x059e, code lost:
        if (r5.equals("V_MPEG4/ISO/AVC") != false) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05a2, code lost:
        r13 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05a6, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05ae, code lost:
        if (r5.equals("V_MPEG4/ISO/ASP") != false) goto L_0x05b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05b2, code lost:
        r13 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05b6, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05be, code lost:
        if (r5.equals("S_DVBSUB") != false) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05c2, code lost:
        r13 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05c6, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05ce, code lost:
        if (r5.equals("V_MS/VFW/FOURCC") != false) goto L_0x05d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05d1, code lost:
        r13 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05d3, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05db, code lost:
        if (r5.equals("A_MPEG/L3") != false) goto L_0x05de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05de, code lost:
        r13 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05e0, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05e6, code lost:
        if (r5.equals(r2) != false) goto L_0x05e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05e9, code lost:
        r13 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05eb, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05f1, code lost:
        if (r5.equals(r3) != false) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05f4, code lost:
        r13 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05f6, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05fc, code lost:
        if (r5.equals(r4) != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05ff, code lost:
        r13 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0601, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0607, code lost:
        if (r5.equals(r0) != false) goto L_0x060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x060a, code lost:
        r13 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x060c, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0612, code lost:
        if (r5.equals(r6) != false) goto L_0x0615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0615, code lost:
        r13 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0617, code lost:
        r29 = "application/dvbsubs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x061d, code lost:
        if (r5.equals(r7) != false) goto L_0x0621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0621, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0622, code lost:
        switch(r13) {
            case 0: goto L_0x09c9;
            case 1: goto L_0x09c9;
            case 2: goto L_0x096c;
            case 3: goto L_0x0954;
            case 4: goto L_0x08c3;
            case 5: goto L_0x08b6;
            case 6: goto L_0x089f;
            case 7: goto L_0x07e1;
            case 8: goto L_0x07c7;
            case 9: goto L_0x09c9;
            case 10: goto L_0x07aa;
            case 11: goto L_0x0798;
            case 12: goto L_0x0790;
            case 13: goto L_0x0764;
            case ru.ok.tamtam.nano.Protos.Attaches.Attach.LOCATION :int: goto L_0x075c;
            case ru.ok.tamtam.nano.Protos.Attaches.Attach.DAILY_MEDIA :int: goto L_0x0754;
            case 16: goto L_0x074c;
            case org.apache.http.util.LangUtils.HASH_SEED :int: goto L_0x0744;
            case 18: goto L_0x073c;
            case 19: goto L_0x0733;
            case 20: goto L_0x072d;
            case 21: goto L_0x0754;
            case 22: goto L_0x071c;
            case 23: goto L_0x0705;
            case one.me.common.drawable.SavedMessagesIconDrawable.NORMAL_ICON_SIZE :int: goto L_0x06ef;
            case 25: goto L_0x06dc;
            case 26: goto L_0x06b8;
            case 27: goto L_0x06b0;
            case 28: goto L_0x06a8;
            case 29: goto L_0x06a1;
            case 30: goto L_0x0693;
            case 31: goto L_0x067d;
            case 32: goto L_0x062d;
            default: goto L_0x0625;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x062c, code lost:
        throw com.google.android.exoplayer2.ParserException.a("Unrecognized codec identifier.", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x062d, code lost:
        r5 = new java.util.ArrayList(3);
        r5.add(r1.a(r1.b));
        r12 = java.nio.ByteBuffer.allocate(8);
        r13 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r38 = r2;
        r39 = r3;
        r5.add(r12.order(r13).putLong(r1.R).array());
        r5.add(java.nio.ByteBuffer.allocate(8).order(r13).putLong(r1.S).array());
        r12 = "audio/opus";
        r40 = r0;
        r3 = 5760;
        r0 = -1;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0678, code lost:
        r11 = null;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x067d, code lost:
        r38 = r2;
        r39 = r3;
        r12 = "audio/flac";
        r40 = r0;
        r5 = java.util.Collections.singletonList(r1.a(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x068e, code lost:
        r0 = -1;
        r3 = -1;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0693, code lost:
        r38 = r2;
        r39 = r3;
        r12 = "audio/eac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0699, code lost:
        r40 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x069b, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x069c, code lost:
        r3 = -1;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x06a1, code lost:
        r38 = r2;
        r39 = r3;
        r12 = "video/mpeg2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06a8, code lost:
        r38 = r2;
        r39 = r3;
        r40 = r0;
        r12 = "application/x-subrip";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x06b0, code lost:
        r38 = r2;
        r39 = r3;
        r40 = r0;
        r12 = "text/vtt";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06b8, code lost:
        r38 = r2;
        r39 = r3;
        r2 = defpackage.dy6.a(new defpackage.g1g(r1.a(r5)));
        r1.Y = r2.b;
        r12 = "video/hevc";
        r3 = r2.a;
        r2 = r2.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x06d3, code lost:
        r40 = r0;
        r11 = r2;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x06d7, code lost:
        r0 = -1;
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x06dc, code lost:
        r38 = r2;
        r39 = r3;
        r40 = r0;
        r5 = defpackage.tb7.u(c0, r1.a(r5));
        r12 = "text/x-ssa";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x06ef, code lost:
        r38 = r2;
        r39 = r3;
        r2 = defpackage.t0g.u(r1.P);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x06f9, code lost:
        if (r2 != 0) goto L_0x06ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06fb, code lost:
        r40 = r0;
        r12 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06ff, code lost:
        r40 = r0;
        r0 = r2;
        r12 = "audio/raw";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0705, code lost:
        r38 = r2;
        r39 = r3;
        r2 = r1.P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x070d, code lost:
        if (r2 != 8) goto L_0x0715;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x070f, code lost:
        r40 = r0;
        r12 = "audio/raw";
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0717, code lost:
        if (r2 != 16) goto L_0x06fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0719, code lost:
        r2 = 268435456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x071c, code lost:
        r38 = r2;
        r39 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0724, code lost:
        if (r1.P != 32) goto L_0x06fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0726, code lost:
        r40 = r0;
        r12 = "audio/raw";
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x072d, code lost:
        r38 = r2;
        r39 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0733, code lost:
        r38 = r2;
        r39 = r3;
        r40 = r0;
        r12 = "application/pgs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x073c, code lost:
        r38 = r2;
        r39 = r3;
        r12 = "video/x-vnd.on2.vp9";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0744, code lost:
        r38 = r2;
        r39 = r3;
        r12 = "video/x-vnd.on2.vp8";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x074c, code lost:
        r38 = r2;
        r39 = r3;
        r12 = "video/av01";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0754, code lost:
        r38 = r2;
        r39 = r3;
        r12 = "audio/vnd.dts";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x075c, code lost:
        r38 = r2;
        r39 = r3;
        r12 = "audio/ac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0764, code lost:
        r38 = r2;
        r39 = r3;
        r2 = java.util.Collections.singletonList(r1.a(r5));
        r3 = r1.k;
        r3 = defpackage.q8.J(new defpackage.ky1(r3, (byte) 0, r3.length, 1), false);
        r1.Q = r3.a;
        r1.O = r3.b;
        r12 = "audio/mp4a-latm";
        r40 = r0;
        r5 = r2;
        r11 = r3.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0790, code lost:
        r38 = r2;
        r39 = r3;
        r12 = "audio/vnd.dts.hd";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0798, code lost:
        r38 = r2;
        r39 = r3;
        r40 = r0;
        r5 = defpackage.tb7.t(r1.a(r5));
        r12 = "application/vobsub";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x07aa, code lost:
        r38 = r2;
        r39 = r3;
        r2 = defpackage.je0.a(new defpackage.g1g(r1.a(r5)));
        r1.Y = r2.b;
        r12 = "video/avc";
        r3 = r2.a;
        r2 = r2.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x07c7, code lost:
        r38 = r2;
        r39 = r3;
        r3 = new byte[4];
        java.lang.System.arraycopy(r1.a(r5), 0, r3, 0, 4);
        r40 = r0;
        r5 = defpackage.tb7.t(r3);
        r12 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x07e1, code lost:
        r38 = r2;
        r39 = r3;
        r2 = new defpackage.g1g(r1.a(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:?, code lost:
        r2.I(16);
        r30 = r2.m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x07fc, code lost:
        if (r30 != 1482049860) goto L_0x0814;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0802, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
        r2 = new android.util.Pair("video/divx", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0806, code lost:
        r5 = r2;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x080e, code lost:
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0811, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0819, code lost:
        if (r30 != 859189832) goto L_0x0824;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x081f, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:?, code lost:
        r2 = new android.util.Pair("video/3gpp", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0829, code lost:
        if (r30 != 826496599) goto L_0x0878;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:?, code lost:
        r5 = r2.b + 20;
        r2 = r2.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0835, code lost:
        if (r5 >= (r2.length - 4)) goto L_0x0870;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0839, code lost:
        if (r2[r5] != 0) goto L_0x086b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x083b, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0840, code lost:
        if (r2[r5 + 1] != 0) goto L_0x0868;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0847, code lost:
        if (r2[r5 + 2] != 1) goto L_0x0868;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0850, code lost:
        if (r2[r5 + 3] != 15) goto L_0x0866;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0852, code lost:
        r5 = new android.util.Pair("video/wvc1", java.util.Collections.singletonList(java.util.Arrays.copyOfRange(r2, r5, r2.length)));
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0866, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x086e, code lost:
        r5 = r5 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0872, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0877, code lost:
        throw com.google.android.exoplayer2.ParserException.a("Failed to find FourCC VC1 initialization data", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0878, code lost:
        r2 = null;
        r5 = new android.util.Pair(r12, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0882, code lost:
        r12 = r5.first;
        r40 = r0;
        r11 = r2;
        r5 = r5.second;
        r0 = -1;
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x089e, code lost:
        throw com.google.android.exoplayer2.ParserException.a("Error parsing FourCC private data", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x089f, code lost:
        r38 = r2;
        r39 = r3;
        r12 = "audio/mpeg";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x08ab, code lost:
        r40 = r0;
        r0 = -1;
        r3 = kotlin.io.ConstantsKt.DEFAULT_BLOCK_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x08b2, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x08b3, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x08b6, code lost:
        r38 = r2;
        r39 = r3;
        r12 = "audio/mpeg-L2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x08c3, code lost:
        r38 = r2;
        r39 = r3;
        r2 = r1.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x08d7, code lost:
        if (r2[0] != 2) goto L_0x0949;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x08d9, code lost:
        r11 = 0;
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x08db, code lost:
        r3 = r2[r12] & kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x08e0, code lost:
        if (r3 != 255) goto L_0x08e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x08e2, code lost:
        r11 = r11 + kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x08e8, code lost:
        r12 = r12 + 1;
        r11 = r11 + r3;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x08ec, code lost:
        r40 = r0;
        r13 = r2[r12] & kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x08f3, code lost:
        if (r13 != 255) goto L_0x08fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x08f5, code lost:
        r3 = r3 + kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
        r12 = r12 + 1;
        r0 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x08fb, code lost:
        r12 = r12 + 1;
        r3 = r3 + r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0900, code lost:
        if (r2[r12] != 1) goto L_0x0943;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0902, code lost:
        r0 = new byte[r11];
        java.lang.System.arraycopy(r2, r12, r0, 0, r11);
        r12 = r12 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x090c, code lost:
        if (r2[r12] != 3) goto L_0x093d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x090e, code lost:
        r12 = r12 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0912, code lost:
        if (r2[r12] != 5) goto L_0x0937;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0914, code lost:
        r3 = new byte[(r2.length - r12)];
        java.lang.System.arraycopy(r2, r12, r3, 0, r2.length - r12);
        r2 = new java.util.ArrayList(2);
        r2.add(r0);
        r2.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x092a, code lost:
        r12 = "audio/vorbis";
        r3 = 8192;
        r5 = r2;
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0935, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0937, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x093c, code lost:
        throw com.google.android.exoplayer2.ParserException.a("Error parsing vorbis codec private", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0942, code lost:
        throw com.google.android.exoplayer2.ParserException.a("Error parsing vorbis codec private", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0948, code lost:
        throw com.google.android.exoplayer2.ParserException.a("Error parsing vorbis codec private", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x094e, code lost:
        throw com.google.android.exoplayer2.ParserException.a("Error parsing vorbis codec private", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0953, code lost:
        throw com.google.android.exoplayer2.ParserException.a("Error parsing vorbis codec private", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0954, code lost:
        r40 = r0;
        r38 = r2;
        r39 = r3;
        r1.T = new defpackage.etf(0);
        r12 = "audio/true-hd";
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0969, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x096c, code lost:
        r40 = r0;
        r38 = r2;
        r39 = r3;
        r0 = new defpackage.g1g(r1.a(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:?, code lost:
        r2 = r0.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0982, code lost:
        if (r2 != 1) goto L_0x0987;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x098a, code lost:
        if (r2 != 65534) goto L_0x09b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x098c, code lost:
        r0.H(24);
        r12 = r0.p();
        r3 = f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x099d, code lost:
        if (r12 != r3.getMostSignificantBits()) goto L_0x09bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x09a9, code lost:
        if (r0.p() != r3.getLeastSignificantBits()) goto L_0x09bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x09ab, code lost:
        r0 = defpackage.t0g.u(r1.P);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x09b1, code lost:
        if (r0 != 0) goto L_0x09b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x09b3, code lost:
        r12 = "audio/x-unknown";
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x09b6, code lost:
        r12 = "audio/raw";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x09bb, code lost:
        "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat("audio/x-unknown");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x09c8, code lost:
        throw com.google.android.exoplayer2.ParserException.a("Error parsing MS/ACM codec private", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x09c9, code lost:
        r40 = r0;
        r38 = r2;
        r39 = r3;
        r0 = r1.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x09d5, code lost:
        if (r0 != null) goto L_0x09d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x09d7, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x09d9, code lost:
        r0 = java.util.Collections.singletonList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x09dd, code lost:
        r12 = "video/mp4v-es";
        r5 = r0;
        r0 = -1;
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x09e4, code lost:
        r13 = r1.N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x09e6, code lost:
        if (r13 == null) goto L_0x09f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x09e8, code lost:
        r2 = defpackage.dr4.a(new defpackage.g1g(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x09f1, code lost:
        if (r2 == null) goto L_0x09f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x09f3, code lost:
        r11 = r2.a;
        r12 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x09f7, code lost:
        r2 = r1.V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x09fb, code lost:
        if (r1.U == false) goto L_0x09ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x09fd, code lost:
        r13 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x09ff, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0a00, code lost:
        r2 = r2 | r13;
        r13 = new defpackage.aa6();
        r19 = defpackage.uq9.h(r12);
        r41 = r4;
        r4 = g0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0a0e, code lost:
        if (r19 == false) goto L_0x0a1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0a10, code lost:
        r13.x = r1.O;
        r13.y = r1.Q;
        r13.z = r0;
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0a23, code lost:
        if (defpackage.uq9.j(r12) == false) goto L_0x0bac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0a27, code lost:
        if (r1.q != 0) goto L_0x0a3b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0a29, code lost:
        r0 = r1.o;
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0a2c, code lost:
        if (r0 != -1) goto L_0x0a30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0a2e, code lost:
        r0 = r1.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0a30, code lost:
        r1.o = r0;
        r0 = r1.p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0a34, code lost:
        if (r0 != -1) goto L_0x0a38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0a36, code lost:
        r0 = r1.n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0a38, code lost:
        r1.p = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0a3b, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0a3c, code lost:
        r0 = r1.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0a3e, code lost:
        if (r0 == r8) goto L_0x0a4e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0a40, code lost:
        r9 = r1.p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0a42, code lost:
        if (r9 == r8) goto L_0x0a4e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0a44, code lost:
        r0 = ((float) (r1.n * r0)) / ((float) (r1.m * r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0a4e, code lost:
        r0 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0a52, code lost:
        if (r1.x == false) goto L_0x0b29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0a5a, code lost:
        if (r1.D == -1.0f) goto L_0x0a92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0a60, code lost:
        if (r1.E == -1.0f) goto L_0x0a92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0a66, code lost:
        if (r1.F == -1.0f) goto L_0x0a92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0a6c, code lost:
        if (r1.G == -1.0f) goto L_0x0a92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0a72, code lost:
        if (r1.H == -1.0f) goto L_0x0a92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0a78, code lost:
        if (r1.I == -1.0f) goto L_0x0a92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0a7e, code lost:
        if (r1.J == -1.0f) goto L_0x0a92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0a84, code lost:
        if (r1.K == -1.0f) goto L_0x0a92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0a8a, code lost:
        if (r1.L == -1.0f) goto L_0x0a92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0a90, code lost:
        if (r1.M != -1.0f) goto L_0x0a96;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0a96, code lost:
        r9 = new byte[25];
        r10 = java.nio.ByteBuffer.wrap(r9).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r10.put((byte) 0);
        r10.putShort((short) ((int) ((r1.D * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) ((r1.E * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) ((r1.F * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) ((r1.G * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) ((r1.H * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) ((r1.I * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) ((r1.J * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) ((r1.K * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) (r1.L + 0.5f)));
        r10.putShort((short) ((int) (r1.M + 0.5f)));
        r10.putShort((short) r1.B);
        r10.putShort((short) r1.C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0b1c, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0b1d, code lost:
        r10 = new defpackage.l53(r1.y, r1.A, r1.z, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0b29, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0b2a, code lost:
        r8 = r1.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0b2c, code lost:
        if (r8 == null) goto L_0x0b41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0b32, code lost:
        if (r4.containsKey(r8) == false) goto L_0x0b41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0b34, code lost:
        r8 = ((java.lang.Integer) r4.get(r1.a)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0b41, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0b44, code lost:
        if (r1.r != 0) goto L_0x0b92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0b4d, code lost:
        if (java.lang.Float.compare(r1.s, defpackage.c44.DEFAULT_ASPECT_RATIO) != 0) goto L_0x0b92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0b55, code lost:
        if (java.lang.Float.compare(r1.t, defpackage.c44.DEFAULT_ASPECT_RATIO) != 0) goto L_0x0b92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0b5d, code lost:
        if (java.lang.Float.compare(r1.u, defpackage.c44.DEFAULT_ASPECT_RATIO) != 0) goto L_0x0b61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0b5f, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0b69, code lost:
        if (java.lang.Float.compare(r1.t, 90.0f) != 0) goto L_0x0b6e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0b6b, code lost:
        r8 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0b76, code lost:
        if (java.lang.Float.compare(r1.t, -180.0f) == 0) goto L_0x0b90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0b80, code lost:
        if (java.lang.Float.compare(r1.t, 180.0f) != 0) goto L_0x0b83;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0b8b, code lost:
        if (java.lang.Float.compare(r1.t, -90.0f) != 0) goto L_0x0b92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0b8d, code lost:
        r8 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0b90, code lost:
        r8 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0b92, code lost:
        r13.p = r1.m;
        r13.q = r1.n;
        r13.t = r0;
        r13.s = r8;
        r13.u = r1.v;
        r13.v = r1.w;
        r13.w = r10;
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0bb2, code lost:
        if ("application/x-subrip".equals(r12) != false) goto L_0x0bdd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0bb8, code lost:
        if ("text/x-ssa".equals(r12) != false) goto L_0x0bdd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0bbe, code lost:
        if ("text/vtt".equals(r12) != false) goto L_0x0bdd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0bc4, code lost:
        if ("application/vobsub".equals(r12) != false) goto L_0x0bdd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0bca, code lost:
        if ("application/pgs".equals(r12) != false) goto L_0x0bdd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0bd2, code lost:
        if (r29.equals(r12) == false) goto L_0x0bd5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0bdc, code lost:
        throw com.google.android.exoplayer2.ParserException.a("Unexpected MIME type.", (java.lang.RuntimeException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0bdd, code lost:
        r8 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0bde, code lost:
        r9 = r1.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0be0, code lost:
        if (r9 == null) goto L_0x0bec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0be6, code lost:
        if (r4.containsKey(r9) != false) goto L_0x0bec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0be8, code lost:
        r13.b = r1.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0bec, code lost:
        r13.a = java.lang.Integer.toString(r28);
        r13.k = r12;
        r13.l = r3;
        r13.c = r1.W;
        r13.d = r2;
        r13.m = r5;
        r13.h = r11;
        r13.n = r1.l;
        r2 = r13.a();
        r3 = r25.B(r1.c, r8);
        r1.X = r3;
        r3.d(r2);
        r22.put(r1.c, r1);
        r8 = r21;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0c1f, code lost:
        r8.u = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0213, code lost:
        r6 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0215, code lost:
        r7 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0217, code lost:
        r9 = 65535;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.uf5 r43, defpackage.yl4 r44) {
        /*
            r42 = this;
            r0 = r42
            r1 = r44
            java.lang.String r2 = "A_MPEG/L2"
            java.lang.String r3 = "A_VORBIS"
            java.lang.String r4 = "A_TRUEHD"
            java.lang.String r5 = "A_MS/ACM"
            java.lang.String r6 = "V_MPEG4/ISO/SP"
            java.lang.String r7 = "V_MPEG4/ISO/AP"
            r11 = 0
            r0.F = r11
            r19 = 1
        L_0x0015:
            if (r19 == 0) goto L_0x10fd
            boolean r15 = r0.F
            if (r15 != 0) goto L_0x10fd
            se4 r15 = r0.a
            java.lang.Object r11 = r15.g
            xv1 r11 = (defpackage.xv1) r11
            defpackage.y64.k(r11)
        L_0x0024:
            java.util.ArrayDeque r11 = r15.b
            java.lang.Object r19 = r11.peek()
            r10 = r19
            qe4 r10 = (defpackage.qe4) r10
            r14 = 357149030(0x1549a966, float:4.072526E-26)
            if (r10 == 0) goto L_0x0c93
            r13 = r43
            gf4 r13 = (defpackage.gf4) r13
            long r12 = r13.o
            long r8 = r10.b
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x0c93
            java.lang.Object r8 = r15.g
            xv1 r8 = (defpackage.xv1) r8
            java.lang.Object r9 = r11.pop()
            qe4 r9 = (defpackage.qe4) r9
            int r9 = r9.a
            java.lang.Object r8 = r8.b
            kh8 r8 = (defpackage.kh8) r8
            wf5 r10 = r8.a0
            defpackage.y64.k(r10)
            android.util.SparseArray r10 = r8.c
            r11 = 160(0xa0, float:2.24E-43)
            if (r9 == r11) goto L_0x0c2a
            r11 = 174(0xae, float:2.44E-43)
            if (r9 == r11) goto L_0x01fe
            r11 = 19899(0x4dbb, float:2.7884E-41)
            if (r9 == r11) goto L_0x01db
            r11 = 25152(0x6240, float:3.5245E-41)
            if (r9 == r11) goto L_0x01a7
            r11 = 28032(0x6d80, float:3.9281E-41)
            if (r9 == r11) goto L_0x018c
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 == r14) goto L_0x016f
            r13 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r9 == r13) goto L_0x0156
            r13 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r9 == r13) goto L_0x0089
            r38 = r2
            r39 = r3
            r41 = r4
            r40 = r5
            r0 = 25
            r17 = 15
            goto L_0x0c89
        L_0x0089:
            boolean r9 = r8.v
            if (r9 != 0) goto L_0x013a
            wf5 r9 = r8.a0
            pa8 r10 = r8.C
            pa8 r13 = r8.D
            long r14 = r8.q
            r23 = -1
            int r14 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r14 == 0) goto L_0x00ad
            long r14 = r8.t
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x00ad
            if (r10 == 0) goto L_0x00ad
            int r11 = r10.b
            if (r11 == 0) goto L_0x00ad
            if (r13 == 0) goto L_0x00ad
            int r12 = r13.b
            if (r12 == r11) goto L_0x00b4
        L_0x00ad:
            r0 = r5
            r38 = r6
            r39 = r7
            goto L_0x012b
        L_0x00b4:
            int[] r12 = new int[r11]
            long[] r14 = new long[r11]
            long[] r15 = new long[r11]
            long[] r1 = new long[r11]
            r0 = 0
        L_0x00bd:
            if (r0 >= r11) goto L_0x00da
            long r25 = r10.b(r0)
            r1[r0] = r25
            r38 = r6
            r39 = r7
            long r6 = r8.q
            long r25 = r13.b(r0)
            long r25 = r25 + r6
            r14[r0] = r25
            r6 = 1
            int r0 = r0 + r6
            r6 = r38
            r7 = r39
            goto L_0x00bd
        L_0x00da:
            r38 = r6
            r39 = r7
            r6 = 1
            r0 = 0
        L_0x00e0:
            int r7 = r11 + -1
            if (r0 >= r7) goto L_0x00fc
            int r7 = r0 + 1
            r25 = r14[r7]
            r28 = r14[r0]
            r6 = r11
            long r10 = r25 - r28
            int r10 = (int) r10
            r12[r0] = r10
            r10 = r1[r7]
            r25 = r1[r0]
            long r10 = r10 - r25
            r15[r0] = r10
            r11 = r6
            r0 = r7
            r6 = 1
            goto L_0x00e0
        L_0x00fc:
            long r10 = r8.q
            r0 = r5
            long r5 = r8.p
            long r10 = r10 + r5
            r5 = r14[r7]
            long r10 = r10 - r5
            int r5 = (int) r10
            r12[r7] = r5
            long r5 = r8.t
            r10 = r1[r7]
            long r5 = r5 - r10
            r15[r7] = r5
            r10 = 0
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x0125
            int[] r12 = java.util.Arrays.copyOf(r12, r7)
            long[] r14 = java.util.Arrays.copyOf(r14, r7)
            long[] r15 = java.util.Arrays.copyOf(r15, r7)
            long[] r1 = java.util.Arrays.copyOf(r1, r7)
        L_0x0125:
            o03 r5 = new o03
            r5.<init>(r12, r14, r15, r1)
            goto L_0x0132
        L_0x012b:
            tq5 r5 = new tq5
            long r6 = r8.t
            r5.<init>(r6)
        L_0x0132:
            r9.K(r5)
            r1 = 1
            r8.v = r1
        L_0x0138:
            r1 = 0
            goto L_0x0140
        L_0x013a:
            r0 = r5
            r38 = r6
            r39 = r7
            goto L_0x0138
        L_0x0140:
            r8.C = r1
            r8.D = r1
        L_0x0144:
            r40 = r0
            r41 = r4
            r6 = r38
            r7 = r39
            r0 = 25
            r17 = 15
            r38 = r2
            r39 = r3
            goto L_0x0c89
        L_0x0156:
            r0 = r5
            r38 = r6
            r39 = r7
            r1 = 0
            int r5 = r10.size()
            if (r5 == 0) goto L_0x0168
            wf5 r1 = r8.a0
            r1.v()
            goto L_0x0144
        L_0x0168:
            java.lang.String r0 = "No valid tracks were found"
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x016f:
            r0 = r5
            r38 = r6
            r39 = r7
            long r5 = r8.r
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x017f
            r5 = 1000000(0xf4240, double:4.940656E-318)
            r8.r = r5
        L_0x017f:
            long r5 = r8.s
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x0144
            long r5 = r8.k(r5)
            r8.t = r5
            goto L_0x0144
        L_0x018c:
            r0 = r5
            r38 = r6
            r39 = r7
            r8.b(r9)
            ih8 r1 = r8.u
            boolean r5 = r1.h
            if (r5 == 0) goto L_0x0144
            byte[] r1 = r1.i
            if (r1 != 0) goto L_0x019f
            goto L_0x0144
        L_0x019f:
            java.lang.String r0 = "Combining encryption and compression is not supported"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x01a7:
            r0 = r5
            r38 = r6
            r39 = r7
            r8.b(r9)
            ih8 r1 = r8.u
            boolean r5 = r1.h
            if (r5 == 0) goto L_0x0144
            wpf r5 = r1.j
            if (r5 == 0) goto L_0x01d3
            xv4 r6 = new xv4
            vv4 r7 = new vv4
            java.util.UUID r8 = defpackage.ww0.a
            java.lang.String r9 = "video/webm"
            byte[] r5 = r5.b
            r10 = 0
            r7.<init>(r8, r10, r9, r5)
            vv4[] r5 = new defpackage.vv4[]{r7}
            r7 = 1
            r6.<init>(r10, r7, r5)
            r1.l = r6
            goto L_0x0144
        L_0x01d3:
            r10 = 0
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r10)
            throw r0
        L_0x01db:
            r0 = r5
            r38 = r6
            r39 = r7
            int r1 = r8.w
            r5 = -1
            if (r1 == r5) goto L_0x01f6
            long r5 = r8.x
            r9 = -1
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x01f6
            r7 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r1 != r7) goto L_0x0144
            r8.z = r5
            goto L_0x0144
        L_0x01f6:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x01fe:
            r0 = r5
            r38 = r6
            r39 = r7
            ih8 r1 = r8.u
            defpackage.y64.k(r1)
            java.lang.String r5 = r1.b
            if (r5 == 0) goto L_0x0c22
            int r6 = r5.hashCode()
            switch(r6) {
                case -2095576542: goto L_0x03ed;
                case -2095575984: goto L_0x03df;
                case -1985379776: goto L_0x03d1;
                case -1784763192: goto L_0x03c3;
                case -1730367663: goto L_0x03b5;
                case -1482641358: goto L_0x03a7;
                case -1482641357: goto L_0x0396;
                case -1373388978: goto L_0x038a;
                case -933872740: goto L_0x0378;
                case -538363189: goto L_0x036b;
                case -538363109: goto L_0x035e;
                case -425012669: goto L_0x0351;
                case -356037306: goto L_0x0344;
                case 62923557: goto L_0x0337;
                case 62923603: goto L_0x0329;
                case 62927045: goto L_0x0317;
                case 82318131: goto L_0x0305;
                case 82338133: goto L_0x02f7;
                case 82338134: goto L_0x02e9;
                case 99146302: goto L_0x02db;
                case 444813526: goto L_0x02c9;
                case 542569478: goto L_0x02bb;
                case 635596514: goto L_0x02a9;
                case 725948237: goto L_0x029b;
                case 725957860: goto L_0x028a;
                case 738597099: goto L_0x0279;
                case 855502857: goto L_0x026c;
                case 1045209816: goto L_0x025f;
                case 1422270023: goto L_0x0252;
                case 1809237540: goto L_0x0245;
                case 1950749482: goto L_0x0238;
                case 1950789798: goto L_0x022b;
                case 1951062397: goto L_0x021a;
                default: goto L_0x0213;
            }
        L_0x0213:
            r6 = r38
        L_0x0215:
            r7 = r39
        L_0x0217:
            r9 = -1
            goto L_0x03fa
        L_0x021a:
            java.lang.String r6 = "A_OPUS"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0223
            goto L_0x0213
        L_0x0223:
            r6 = r38
            r7 = r39
            r9 = 32
            goto L_0x03fa
        L_0x022b:
            java.lang.String r6 = "A_FLAC"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0234
            goto L_0x0213
        L_0x0234:
            r6 = 31
            goto L_0x03a1
        L_0x0238:
            java.lang.String r6 = "A_EAC3"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0241
            goto L_0x0213
        L_0x0241:
            r6 = 30
            goto L_0x03a1
        L_0x0245:
            java.lang.String r6 = "V_MPEG2"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x024e
            goto L_0x0213
        L_0x024e:
            r6 = 29
            goto L_0x03a1
        L_0x0252:
            java.lang.String r6 = "S_TEXT/UTF8"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x025b
            goto L_0x0213
        L_0x025b:
            r6 = 28
            goto L_0x03a1
        L_0x025f:
            java.lang.String r6 = "S_TEXT/WEBVTT"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0268
            goto L_0x0213
        L_0x0268:
            r6 = 27
            goto L_0x03a1
        L_0x026c:
            java.lang.String r6 = "V_MPEGH/ISO/HEVC"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0275
            goto L_0x0213
        L_0x0275:
            r6 = 26
            goto L_0x03a1
        L_0x0279:
            java.lang.String r6 = "S_TEXT/ASS"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0282
            goto L_0x0213
        L_0x0282:
            r6 = r38
            r7 = r39
            r9 = 25
            goto L_0x03fa
        L_0x028a:
            java.lang.String r6 = "A_PCM/INT/LIT"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0293
            goto L_0x0213
        L_0x0293:
            r6 = r38
            r7 = r39
            r9 = 24
            goto L_0x03fa
        L_0x029b:
            java.lang.String r6 = "A_PCM/INT/BIG"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x02a5
            goto L_0x0213
        L_0x02a5:
            r6 = 23
            goto L_0x03a1
        L_0x02a9:
            java.lang.String r6 = "A_PCM/FLOAT/IEEE"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x02b3
            goto L_0x0213
        L_0x02b3:
            r6 = r38
            r7 = r39
            r9 = 22
            goto L_0x03fa
        L_0x02bb:
            java.lang.String r6 = "A_DTS/EXPRESS"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x02c5
            goto L_0x0213
        L_0x02c5:
            r6 = 21
            goto L_0x03a1
        L_0x02c9:
            java.lang.String r6 = "V_THEORA"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x02d3
            goto L_0x0213
        L_0x02d3:
            r6 = r38
            r7 = r39
            r9 = 20
            goto L_0x03fa
        L_0x02db:
            java.lang.String r6 = "S_HDMV/PGS"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x02e5
            goto L_0x0213
        L_0x02e5:
            r6 = 19
            goto L_0x03a1
        L_0x02e9:
            java.lang.String r6 = "V_VP9"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x02f3
            goto L_0x0213
        L_0x02f3:
            r6 = 18
            goto L_0x03a1
        L_0x02f7:
            java.lang.String r6 = "V_VP8"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0301
            goto L_0x0213
        L_0x0301:
            r6 = 17
            goto L_0x03a1
        L_0x0305:
            java.lang.String r6 = "V_AV1"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x030f
            goto L_0x0213
        L_0x030f:
            r6 = r38
            r7 = r39
            r9 = 16
            goto L_0x03fa
        L_0x0317:
            java.lang.String r6 = "A_DTS"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0321
            goto L_0x0213
        L_0x0321:
            r6 = r38
            r7 = r39
            r9 = 15
            goto L_0x03fa
        L_0x0329:
            java.lang.String r6 = "A_AC3"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0333
            goto L_0x0213
        L_0x0333:
            r6 = 14
            goto L_0x03a1
        L_0x0337:
            java.lang.String r6 = "A_AAC"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0341
            goto L_0x0213
        L_0x0341:
            r6 = 13
            goto L_0x03a1
        L_0x0344:
            java.lang.String r6 = "A_DTS/LOSSLESS"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x034e
            goto L_0x0213
        L_0x034e:
            r6 = 12
            goto L_0x03a1
        L_0x0351:
            java.lang.String r6 = "S_VOBSUB"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x035b
            goto L_0x0213
        L_0x035b:
            r6 = 11
            goto L_0x03a1
        L_0x035e:
            java.lang.String r6 = "V_MPEG4/ISO/AVC"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0368
            goto L_0x0213
        L_0x0368:
            r6 = 10
            goto L_0x03a1
        L_0x036b:
            java.lang.String r6 = "V_MPEG4/ISO/ASP"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0375
            goto L_0x0213
        L_0x0375:
            r6 = 9
            goto L_0x03a1
        L_0x0378:
            java.lang.String r6 = "S_DVBSUB"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0382
            goto L_0x0213
        L_0x0382:
            r6 = r38
            r7 = r39
            r9 = 8
            goto L_0x03fa
        L_0x038a:
            java.lang.String r6 = "V_MS/VFW/FOURCC"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0394
            goto L_0x0213
        L_0x0394:
            r6 = 7
            goto L_0x03a1
        L_0x0396:
            java.lang.String r6 = "A_MPEG/L3"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x03a0
            goto L_0x0213
        L_0x03a0:
            r6 = 6
        L_0x03a1:
            r9 = r6
            r6 = r38
            r7 = r39
            goto L_0x03fa
        L_0x03a7:
            boolean r6 = r5.equals(r2)
            if (r6 != 0) goto L_0x03af
            goto L_0x0213
        L_0x03af:
            r6 = r38
            r7 = r39
            r9 = 5
            goto L_0x03fa
        L_0x03b5:
            boolean r6 = r5.equals(r3)
            if (r6 != 0) goto L_0x03bd
            goto L_0x0213
        L_0x03bd:
            r6 = r38
            r7 = r39
            r9 = 4
            goto L_0x03fa
        L_0x03c3:
            boolean r6 = r5.equals(r4)
            if (r6 != 0) goto L_0x03cb
            goto L_0x0213
        L_0x03cb:
            r6 = r38
            r7 = r39
            r9 = 3
            goto L_0x03fa
        L_0x03d1:
            boolean r6 = r5.equals(r0)
            if (r6 != 0) goto L_0x03d9
            goto L_0x0213
        L_0x03d9:
            r6 = r38
            r7 = r39
            r9 = 2
            goto L_0x03fa
        L_0x03df:
            r6 = r38
            boolean r7 = r5.equals(r6)
            if (r7 != 0) goto L_0x03e9
            goto L_0x0215
        L_0x03e9:
            r7 = r39
            r9 = 1
            goto L_0x03fa
        L_0x03ed:
            r6 = r38
            r7 = r39
            boolean r9 = r5.equals(r7)
            if (r9 != 0) goto L_0x03f9
            goto L_0x0217
        L_0x03f9:
            r9 = 0
        L_0x03fa:
            switch(r9) {
                case 0: goto L_0x040c;
                case 1: goto L_0x040c;
                case 2: goto L_0x040c;
                case 3: goto L_0x040c;
                case 4: goto L_0x040c;
                case 5: goto L_0x040c;
                case 6: goto L_0x040c;
                case 7: goto L_0x040c;
                case 8: goto L_0x040c;
                case 9: goto L_0x040c;
                case 10: goto L_0x040c;
                case 11: goto L_0x040c;
                case 12: goto L_0x040c;
                case 13: goto L_0x040c;
                case 14: goto L_0x040c;
                case 15: goto L_0x040c;
                case 16: goto L_0x040c;
                case 17: goto L_0x040c;
                case 18: goto L_0x040c;
                case 19: goto L_0x040c;
                case 20: goto L_0x040c;
                case 21: goto L_0x040c;
                case 22: goto L_0x040c;
                case 23: goto L_0x040c;
                case 24: goto L_0x040c;
                case 25: goto L_0x040c;
                case 26: goto L_0x040c;
                case 27: goto L_0x040c;
                case 28: goto L_0x040c;
                case 29: goto L_0x040c;
                case 30: goto L_0x040c;
                case 31: goto L_0x040c;
                case 32: goto L_0x040c;
                default: goto L_0x03fd;
            }
        L_0x03fd:
            r40 = r0
            r38 = r2
            r39 = r3
            r41 = r4
            r0 = 25
            r1 = 0
            r17 = 15
            goto L_0x0c1f
        L_0x040c:
            wf5 r9 = r8.a0
            int r11 = r1.c
            java.lang.String r13 = "application/dvbsubs"
            java.lang.String r14 = "application/vobsub"
            java.lang.String r15 = "application/pgs"
            java.lang.String r12 = "video/x-unknown"
            r21 = r8
            java.lang.String r8 = "text/x-ssa"
            r22 = r10
            java.lang.String r10 = "text/vtt"
            r25 = r9
            java.lang.String r9 = "application/x-subrip"
            java.lang.String r26 = "audio/raw"
            r28 = r11
            java.lang.String r11 = "audio/x-unknown"
            int r29 = r5.hashCode()
            switch(r29) {
                case -2095576542: goto L_0x0617;
                case -2095575984: goto L_0x060c;
                case -1985379776: goto L_0x0601;
                case -1784763192: goto L_0x05f6;
                case -1730367663: goto L_0x05eb;
                case -1482641358: goto L_0x05e0;
                case -1482641357: goto L_0x05d3;
                case -1373388978: goto L_0x05c6;
                case -933872740: goto L_0x05b6;
                case -538363189: goto L_0x05a6;
                case -538363109: goto L_0x0596;
                case -425012669: goto L_0x0586;
                case -356037306: goto L_0x0576;
                case 62923557: goto L_0x0566;
                case 62923603: goto L_0x0556;
                case 62927045: goto L_0x0546;
                case 82318131: goto L_0x0536;
                case 82338133: goto L_0x0526;
                case 82338134: goto L_0x0516;
                case 99146302: goto L_0x0506;
                case 444813526: goto L_0x04f6;
                case 542569478: goto L_0x04e6;
                case 635596514: goto L_0x04d6;
                case 725948237: goto L_0x04c6;
                case 725957860: goto L_0x04b6;
                case 738597099: goto L_0x04a6;
                case 855502857: goto L_0x0496;
                case 1045209816: goto L_0x0486;
                case 1422270023: goto L_0x0476;
                case 1809237540: goto L_0x0466;
                case 1950749482: goto L_0x0456;
                case 1950789798: goto L_0x0446;
                case 1951062397: goto L_0x0436;
                default: goto L_0x0431;
            }
        L_0x0431:
            r29 = r13
        L_0x0433:
            r13 = -1
            goto L_0x0622
        L_0x0436:
            r29 = r13
            java.lang.String r13 = "A_OPUS"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0442
            goto L_0x061f
        L_0x0442:
            r13 = 32
            goto L_0x0622
        L_0x0446:
            r29 = r13
            java.lang.String r13 = "A_FLAC"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0452
            goto L_0x061f
        L_0x0452:
            r13 = 31
            goto L_0x0622
        L_0x0456:
            r29 = r13
            java.lang.String r13 = "A_EAC3"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0462
            goto L_0x061f
        L_0x0462:
            r13 = 30
            goto L_0x0622
        L_0x0466:
            r29 = r13
            java.lang.String r13 = "V_MPEG2"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0472
            goto L_0x061f
        L_0x0472:
            r13 = 29
            goto L_0x0622
        L_0x0476:
            r29 = r13
            java.lang.String r13 = "S_TEXT/UTF8"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0482
            goto L_0x061f
        L_0x0482:
            r13 = 28
            goto L_0x0622
        L_0x0486:
            r29 = r13
            java.lang.String r13 = "S_TEXT/WEBVTT"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0492
            goto L_0x061f
        L_0x0492:
            r13 = 27
            goto L_0x0622
        L_0x0496:
            r29 = r13
            java.lang.String r13 = "V_MPEGH/ISO/HEVC"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x04a2
            goto L_0x061f
        L_0x04a2:
            r13 = 26
            goto L_0x0622
        L_0x04a6:
            r29 = r13
            java.lang.String r13 = "S_TEXT/ASS"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x04b2
            goto L_0x061f
        L_0x04b2:
            r13 = 25
            goto L_0x0622
        L_0x04b6:
            r29 = r13
            java.lang.String r13 = "A_PCM/INT/LIT"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x04c2
            goto L_0x061f
        L_0x04c2:
            r13 = 24
            goto L_0x0622
        L_0x04c6:
            r29 = r13
            java.lang.String r13 = "A_PCM/INT/BIG"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x04d2
            goto L_0x061f
        L_0x04d2:
            r13 = 23
            goto L_0x0622
        L_0x04d6:
            r29 = r13
            java.lang.String r13 = "A_PCM/FLOAT/IEEE"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x04e2
            goto L_0x061f
        L_0x04e2:
            r13 = 22
            goto L_0x0622
        L_0x04e6:
            r29 = r13
            java.lang.String r13 = "A_DTS/EXPRESS"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x04f2
            goto L_0x061f
        L_0x04f2:
            r13 = 21
            goto L_0x0622
        L_0x04f6:
            r29 = r13
            java.lang.String r13 = "V_THEORA"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0502
            goto L_0x061f
        L_0x0502:
            r13 = 20
            goto L_0x0622
        L_0x0506:
            r29 = r13
            java.lang.String r13 = "S_HDMV/PGS"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0512
            goto L_0x061f
        L_0x0512:
            r13 = 19
            goto L_0x0622
        L_0x0516:
            r29 = r13
            java.lang.String r13 = "V_VP9"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0522
            goto L_0x061f
        L_0x0522:
            r13 = 18
            goto L_0x0622
        L_0x0526:
            r29 = r13
            java.lang.String r13 = "V_VP8"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0532
            goto L_0x061f
        L_0x0532:
            r13 = 17
            goto L_0x0622
        L_0x0536:
            r29 = r13
            java.lang.String r13 = "V_AV1"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0542
            goto L_0x061f
        L_0x0542:
            r13 = 16
            goto L_0x0622
        L_0x0546:
            r29 = r13
            java.lang.String r13 = "A_DTS"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0552
            goto L_0x061f
        L_0x0552:
            r13 = 15
            goto L_0x0622
        L_0x0556:
            r29 = r13
            java.lang.String r13 = "A_AC3"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0562
            goto L_0x061f
        L_0x0562:
            r13 = 14
            goto L_0x0622
        L_0x0566:
            r29 = r13
            java.lang.String r13 = "A_AAC"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0572
            goto L_0x061f
        L_0x0572:
            r13 = 13
            goto L_0x0622
        L_0x0576:
            r29 = r13
            java.lang.String r13 = "A_DTS/LOSSLESS"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0582
            goto L_0x061f
        L_0x0582:
            r13 = 12
            goto L_0x0622
        L_0x0586:
            r29 = r13
            java.lang.String r13 = "S_VOBSUB"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0592
            goto L_0x061f
        L_0x0592:
            r13 = 11
            goto L_0x0622
        L_0x0596:
            r29 = r13
            java.lang.String r13 = "V_MPEG4/ISO/AVC"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x05a2
            goto L_0x061f
        L_0x05a2:
            r13 = 10
            goto L_0x0622
        L_0x05a6:
            r29 = r13
            java.lang.String r13 = "V_MPEG4/ISO/ASP"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x05b2
            goto L_0x061f
        L_0x05b2:
            r13 = 9
            goto L_0x0622
        L_0x05b6:
            r29 = r13
            java.lang.String r13 = "S_DVBSUB"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x05c2
            goto L_0x061f
        L_0x05c2:
            r13 = 8
            goto L_0x0622
        L_0x05c6:
            r29 = r13
            java.lang.String r13 = "V_MS/VFW/FOURCC"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x05d1
            goto L_0x061f
        L_0x05d1:
            r13 = 7
            goto L_0x0622
        L_0x05d3:
            r29 = r13
            java.lang.String r13 = "A_MPEG/L3"
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x05de
            goto L_0x061f
        L_0x05de:
            r13 = 6
            goto L_0x0622
        L_0x05e0:
            r29 = r13
            boolean r13 = r5.equals(r2)
            if (r13 != 0) goto L_0x05e9
            goto L_0x061f
        L_0x05e9:
            r13 = 5
            goto L_0x0622
        L_0x05eb:
            r29 = r13
            boolean r13 = r5.equals(r3)
            if (r13 != 0) goto L_0x05f4
            goto L_0x061f
        L_0x05f4:
            r13 = 4
            goto L_0x0622
        L_0x05f6:
            r29 = r13
            boolean r13 = r5.equals(r4)
            if (r13 != 0) goto L_0x05ff
            goto L_0x061f
        L_0x05ff:
            r13 = 3
            goto L_0x0622
        L_0x0601:
            r29 = r13
            boolean r13 = r5.equals(r0)
            if (r13 != 0) goto L_0x060a
            goto L_0x061f
        L_0x060a:
            r13 = 2
            goto L_0x0622
        L_0x060c:
            r29 = r13
            boolean r13 = r5.equals(r6)
            if (r13 != 0) goto L_0x0615
            goto L_0x061f
        L_0x0615:
            r13 = 1
            goto L_0x0622
        L_0x0617:
            r29 = r13
            boolean r13 = r5.equals(r7)
            if (r13 != 0) goto L_0x0621
        L_0x061f:
            goto L_0x0433
        L_0x0621:
            r13 = 0
        L_0x0622:
            switch(r13) {
                case 0: goto L_0x09c9;
                case 1: goto L_0x09c9;
                case 2: goto L_0x096c;
                case 3: goto L_0x0954;
                case 4: goto L_0x08c3;
                case 5: goto L_0x08b6;
                case 6: goto L_0x089f;
                case 7: goto L_0x07e1;
                case 8: goto L_0x07c7;
                case 9: goto L_0x09c9;
                case 10: goto L_0x07aa;
                case 11: goto L_0x0798;
                case 12: goto L_0x0790;
                case 13: goto L_0x0764;
                case 14: goto L_0x075c;
                case 15: goto L_0x0754;
                case 16: goto L_0x074c;
                case 17: goto L_0x0744;
                case 18: goto L_0x073c;
                case 19: goto L_0x0733;
                case 20: goto L_0x072d;
                case 21: goto L_0x0754;
                case 22: goto L_0x071c;
                case 23: goto L_0x0705;
                case 24: goto L_0x06ef;
                case 25: goto L_0x06dc;
                case 26: goto L_0x06b8;
                case 27: goto L_0x06b0;
                case 28: goto L_0x06a8;
                case 29: goto L_0x06a1;
                case 30: goto L_0x0693;
                case 31: goto L_0x067d;
                case 32: goto L_0x062d;
                default: goto L_0x0625;
            }
        L_0x0625:
            java.lang.String r0 = "Unrecognized codec identifier."
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x062d:
            java.util.ArrayList r5 = new java.util.ArrayList
            r11 = 3
            r5.<init>(r11)
            java.lang.String r11 = r1.b
            byte[] r11 = r1.a(r11)
            r5.add(r11)
            r11 = 8
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r11)
            java.nio.ByteOrder r13 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r12 = r12.order(r13)
            r38 = r2
            r39 = r3
            long r2 = r1.R
            java.nio.ByteBuffer r2 = r12.putLong(r2)
            byte[] r2 = r2.array()
            r5.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r11)
            java.nio.ByteBuffer r2 = r2.order(r13)
            long r11 = r1.S
            java.nio.ByteBuffer r2 = r2.putLong(r11)
            byte[] r2 = r2.array()
            r5.add(r2)
            java.lang.String r12 = "audio/opus"
            r2 = 5760(0x1680, float:8.071E-42)
            r40 = r0
            r3 = r2
            r0 = -1
            r2 = 24
        L_0x0678:
            r11 = 0
        L_0x0679:
            r17 = 15
            goto L_0x09e4
        L_0x067d:
            r38 = r2
            r39 = r3
            byte[] r2 = r1.a(r5)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.lang.String r12 = "audio/flac"
            r40 = r0
            r5 = r2
        L_0x068e:
            r0 = -1
            r2 = 24
            r3 = -1
            goto L_0x0678
        L_0x0693:
            r38 = r2
            r39 = r3
            java.lang.String r12 = "audio/eac3"
        L_0x0699:
            r40 = r0
        L_0x069b:
            r0 = -1
        L_0x069c:
            r2 = 24
            r3 = -1
            r5 = 0
            goto L_0x0678
        L_0x06a1:
            r38 = r2
            r39 = r3
            java.lang.String r12 = "video/mpeg2"
            goto L_0x0699
        L_0x06a8:
            r38 = r2
            r39 = r3
            r40 = r0
            r12 = r9
            goto L_0x069b
        L_0x06b0:
            r38 = r2
            r39 = r3
            r40 = r0
            r12 = r10
            goto L_0x069b
        L_0x06b8:
            r38 = r2
            r39 = r3
            g1g r2 = new g1g
            byte[] r3 = r1.a(r5)
            r2.<init>((byte[]) r3)
            dy6 r2 = defpackage.dy6.a(r2)
            int r3 = r2.b
            r1.Y = r3
            java.lang.String r12 = "video/hevc"
            java.util.List r3 = r2.a
            java.lang.String r2 = r2.d
        L_0x06d3:
            r40 = r0
            r11 = r2
            r5 = r3
        L_0x06d7:
            r0 = -1
            r2 = 24
            r3 = -1
            goto L_0x0679
        L_0x06dc:
            r38 = r2
            r39 = r3
            byte[] r2 = r1.a(r5)
            byte[] r3 = c0
            k0d r2 = defpackage.tb7.u(r3, r2)
            r40 = r0
            r5 = r2
            r12 = r8
            goto L_0x068e
        L_0x06ef:
            r38 = r2
            r39 = r3
            int r2 = r1.P
            int r2 = defpackage.t0g.u(r2)
            if (r2 != 0) goto L_0x06ff
        L_0x06fb:
            r40 = r0
            r12 = r11
            goto L_0x069b
        L_0x06ff:
            r40 = r0
            r0 = r2
            r12 = r26
            goto L_0x069c
        L_0x0705:
            r38 = r2
            r39 = r3
            int r2 = r1.P
            r3 = 8
            if (r2 != r3) goto L_0x0715
            r40 = r0
            r12 = r26
            r0 = 3
            goto L_0x069c
        L_0x0715:
            r3 = 16
            if (r2 != r3) goto L_0x06fb
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x06ff
        L_0x071c:
            r38 = r2
            r39 = r3
            int r2 = r1.P
            r3 = 32
            if (r2 != r3) goto L_0x06fb
            r40 = r0
            r12 = r26
            r0 = 4
            goto L_0x069c
        L_0x072d:
            r38 = r2
            r39 = r3
            goto L_0x0699
        L_0x0733:
            r38 = r2
            r39 = r3
            r40 = r0
            r12 = r15
            goto L_0x069b
        L_0x073c:
            r38 = r2
            r39 = r3
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            goto L_0x0699
        L_0x0744:
            r38 = r2
            r39 = r3
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            goto L_0x0699
        L_0x074c:
            r38 = r2
            r39 = r3
            java.lang.String r12 = "video/av01"
            goto L_0x0699
        L_0x0754:
            r38 = r2
            r39 = r3
            java.lang.String r12 = "audio/vnd.dts"
            goto L_0x0699
        L_0x075c:
            r38 = r2
            r39 = r3
            java.lang.String r12 = "audio/ac3"
            goto L_0x0699
        L_0x0764:
            r38 = r2
            r39 = r3
            byte[] r2 = r1.a(r5)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            byte[] r3 = r1.k
            ky1 r5 = new ky1
            int r11 = r3.length
            r12 = 0
            r13 = 1
            r5.<init>((byte[]) r3, (byte) r12, (int) r11, (int) r13)
            e r3 = defpackage.q8.J(r5, r12)
            int r5 = r3.a
            r1.Q = r5
            int r5 = r3.b
            r1.O = r5
            java.lang.String r12 = "audio/mp4a-latm"
            java.lang.String r3 = r3.c
            r40 = r0
            r5 = r2
            r11 = r3
            goto L_0x06d7
        L_0x0790:
            r38 = r2
            r39 = r3
            java.lang.String r12 = "audio/vnd.dts.hd"
            goto L_0x0699
        L_0x0798:
            r38 = r2
            r39 = r3
            byte[] r2 = r1.a(r5)
            k0d r2 = defpackage.tb7.t(r2)
            r40 = r0
            r5 = r2
            r12 = r14
            goto L_0x068e
        L_0x07aa:
            r38 = r2
            r39 = r3
            g1g r2 = new g1g
            byte[] r3 = r1.a(r5)
            r2.<init>((byte[]) r3)
            je0 r2 = defpackage.je0.a(r2)
            int r3 = r2.b
            r1.Y = r3
            java.lang.String r12 = "video/avc"
            java.util.List r3 = r2.a
            java.lang.String r2 = r2.f
            goto L_0x06d3
        L_0x07c7:
            r38 = r2
            r39 = r3
            r2 = 4
            byte[] r3 = new byte[r2]
            byte[] r5 = r1.a(r5)
            r11 = 0
            java.lang.System.arraycopy(r5, r11, r3, r11, r2)
            k0d r2 = defpackage.tb7.t(r3)
            r40 = r0
            r5 = r2
            r12 = r29
            goto L_0x068e
        L_0x07e1:
            r38 = r2
            r39 = r3
            g1g r2 = new g1g
            byte[] r3 = r1.a(r5)
            r2.<init>((byte[]) r3)
            r3 = 16
            r2.I(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
            long r30 = r2.m()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
            r32 = 1482049860(0x58564944, double:7.322299212E-315)
            int r5 = (r30 > r32 ? 1 : (r30 == r32 ? 0 : -1))
            if (r5 != 0) goto L_0x0814
            android.util.Pair r2 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
            java.lang.String r5 = "video/divx"
            r11 = 0
            r2.<init>(r5, r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x080e }
        L_0x0806:
            r5 = r2
            r2 = 0
            r13 = 20
            r17 = 15
            goto L_0x0882
        L_0x080e:
            r2 = r11
            goto L_0x0898
        L_0x0811:
            r2 = 0
            goto L_0x0898
        L_0x0814:
            r32 = 859189832(0x33363248, double:4.244961792E-315)
            int r5 = (r30 > r32 ? 1 : (r30 == r32 ? 0 : -1))
            if (r5 != 0) goto L_0x0824
            android.util.Pair r2 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
            java.lang.String r5 = "video/3gpp"
            r11 = 0
            r2.<init>(r5, r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x080e }
            goto L_0x0806
        L_0x0824:
            r32 = 826496599(0x31435657, double:4.08343576E-315)
            int r5 = (r30 > r32 ? 1 : (r30 == r32 ? 0 : -1))
            if (r5 != 0) goto L_0x0878
            int r5 = r2.b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
            r13 = 20
            int r5 = r5 + r13
            byte[] r2 = r2.a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
        L_0x0832:
            int r11 = r2.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
            r12 = 4
            int r11 = r11 - r12
            if (r5 >= r11) goto L_0x0870
            byte r11 = r2[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
            if (r11 != 0) goto L_0x086b
            r11 = 1
            int r12 = r5 + 1
            byte r12 = r2[r12]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
            if (r12 != 0) goto L_0x0868
            r12 = 2
            int r18 = r5 + 2
            byte r12 = r2[r18]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
            if (r12 != r11) goto L_0x0868
            r11 = 3
            int r12 = r5 + 3
            byte r11 = r2[r12]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
            r12 = 15
            if (r11 != r12) goto L_0x0866
            int r11 = r2.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
            byte[] r2 = java.util.Arrays.copyOfRange(r2, r5, r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
            android.util.Pair r5 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
            java.lang.String r11 = "video/wvc1"
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
            r5.<init>(r11, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0811 }
            r17 = r12
            r2 = 0
            goto L_0x0882
        L_0x0866:
            r11 = 1
            goto L_0x086e
        L_0x0868:
            r12 = 15
            goto L_0x086e
        L_0x086b:
            r12 = 15
            goto L_0x0866
        L_0x086e:
            int r5 = r5 + r11
            goto L_0x0832
        L_0x0870:
            java.lang.String r0 = "Failed to find FourCC VC1 initialization data"
            r2 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0898 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0898 }
        L_0x0878:
            r2 = 0
            r13 = 20
            r17 = 15
            android.util.Pair r5 = new android.util.Pair
            r5.<init>(r12, r2)
        L_0x0882:
            java.lang.Object r11 = r5.first
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.second
            r27 = r5
            java.util.List r27 = (java.util.List) r27
            r40 = r0
            r11 = r2
            r5 = r27
            r0 = -1
            r2 = 24
            r3 = -1
            goto L_0x09e4
        L_0x0898:
            java.lang.String r0 = "Error parsing FourCC private data"
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r2)
            throw r0
        L_0x089f:
            r38 = r2
            r39 = r3
            r3 = 16
            r13 = 20
            r17 = 15
            java.lang.String r12 = "audio/mpeg"
        L_0x08ab:
            r40 = r0
            r0 = -1
            r2 = 24
            r3 = 4096(0x1000, float:5.74E-42)
        L_0x08b2:
            r5 = 0
        L_0x08b3:
            r11 = 0
            goto L_0x09e4
        L_0x08b6:
            r38 = r2
            r39 = r3
            r3 = 16
            r13 = 20
            r17 = 15
            java.lang.String r12 = "audio/mpeg-L2"
            goto L_0x08ab
        L_0x08c3:
            r38 = r2
            r39 = r3
            r3 = 16
            r13 = 20
            r17 = 15
            byte[] r2 = r1.a(r5)
            java.lang.String r5 = "Error parsing vorbis codec private"
            r11 = 0
            byte r12 = r2[r11]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            r11 = 2
            if (r12 != r11) goto L_0x0949
            r11 = 0
            r12 = 1
        L_0x08db:
            byte r3 = r2[r12]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            r13 = 255(0xff, float:3.57E-43)
            r3 = r3 & r13
            if (r3 != r13) goto L_0x08e8
            int r11 = r11 + r13
            r3 = 1
            int r12 = r12 + r3
            r13 = 20
            goto L_0x08db
        L_0x08e8:
            r13 = 1
            int r12 = r12 + r13
            int r11 = r11 + r3
            r3 = 0
        L_0x08ec:
            byte r13 = r2[r12]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            r40 = r0
            r0 = 255(0xff, float:3.57E-43)
            r13 = r13 & r0
            if (r13 != r0) goto L_0x08fb
            int r3 = r3 + r0
            r13 = 1
            int r12 = r12 + r13
            r0 = r40
            goto L_0x08ec
        L_0x08fb:
            r0 = 1
            int r12 = r12 + r0
            int r3 = r3 + r13
            byte r13 = r2[r12]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            if (r13 != r0) goto L_0x0943
            byte[] r0 = new byte[r11]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            r13 = 0
            java.lang.System.arraycopy(r2, r12, r0, r13, r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            int r12 = r12 + r11
            byte r11 = r2[r12]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            r13 = 3
            if (r11 != r13) goto L_0x093d
            int r12 = r12 + r3
            byte r3 = r2[r12]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            r11 = 5
            if (r3 != r11) goto L_0x0937
            int r3 = r2.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            int r3 = r3 - r12
            byte[] r3 = new byte[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            int r11 = r2.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            int r11 = r11 - r12
            r13 = 0
            java.lang.System.arraycopy(r2, r12, r3, r13, r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            r11 = 2
            r2.<init>(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            r2.add(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            r2.add(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0935 }
            java.lang.String r12 = "audio/vorbis"
            r0 = 8192(0x2000, float:1.14794E-41)
            r3 = r0
            r5 = r2
            r0 = -1
            r2 = 24
            goto L_0x08b3
        L_0x0935:
            r0 = 0
            goto L_0x094f
        L_0x0937:
            r0 = 0
            com.google.android.exoplayer2.ParserException r1 = com.google.android.exoplayer2.ParserException.a(r5, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x094f }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x094f }
        L_0x093d:
            r0 = 0
            com.google.android.exoplayer2.ParserException r1 = com.google.android.exoplayer2.ParserException.a(r5, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x094f }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x094f }
        L_0x0943:
            r0 = 0
            com.google.android.exoplayer2.ParserException r1 = com.google.android.exoplayer2.ParserException.a(r5, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x094f }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x094f }
        L_0x0949:
            r0 = 0
            com.google.android.exoplayer2.ParserException r1 = com.google.android.exoplayer2.ParserException.a(r5, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x094f }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x094f }
        L_0x094f:
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r5, r0)
            throw r0
        L_0x0954:
            r40 = r0
            r38 = r2
            r39 = r3
            r17 = 15
            etf r0 = new etf
            r2 = 0
            r0.<init>(r2)
            r1.T = r0
            java.lang.String r12 = "audio/true-hd"
            r0 = -1
            r2 = 24
        L_0x0969:
            r3 = -1
            goto L_0x08b2
        L_0x096c:
            r40 = r0
            r38 = r2
            r39 = r3
            r17 = 15
            g1g r0 = new g1g
            byte[] r2 = r1.a(r5)
            r0.<init>((byte[]) r2)
            int r2 = r0.o()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09c1 }
            r3 = 1
            if (r2 != r3) goto L_0x0987
            r2 = 24
            goto L_0x09ab
        L_0x0987:
            r3 = 65534(0xfffe, float:9.1833E-41)
            if (r2 != r3) goto L_0x09b9
            r2 = 24
            r0.H(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09c1 }
            long r12 = r0.p()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09c1 }
            java.util.UUID r3 = f0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09c1 }
            long r30 = r3.getMostSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09c1 }
            int r5 = (r12 > r30 ? 1 : (r12 == r30 ? 0 : -1))
            if (r5 != 0) goto L_0x09bb
            long r12 = r0.p()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09c1 }
            long r30 = r3.getLeastSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x09c1 }
            int r0 = (r12 > r30 ? 1 : (r12 == r30 ? 0 : -1))
            if (r0 != 0) goto L_0x09bb
        L_0x09ab:
            int r0 = r1.P
            int r0 = defpackage.t0g.u(r0)
            if (r0 != 0) goto L_0x09b6
        L_0x09b3:
            r12 = r11
            r0 = -1
            goto L_0x0969
        L_0x09b6:
            r12 = r26
            goto L_0x0969
        L_0x09b9:
            r2 = 24
        L_0x09bb:
            java.lang.String r0 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            r0.concat(r11)
            goto L_0x09b3
        L_0x09c1:
            java.lang.String r0 = "Error parsing MS/ACM codec private"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x09c9:
            r40 = r0
            r38 = r2
            r39 = r3
            r2 = 24
            r17 = 15
            byte[] r0 = r1.k
            if (r0 != 0) goto L_0x09d9
            r0 = 0
            goto L_0x09dd
        L_0x09d9:
            java.util.List r0 = java.util.Collections.singletonList(r0)
        L_0x09dd:
            java.lang.String r12 = "video/mp4v-es"
            r5 = r0
            r0 = -1
            r3 = -1
            goto L_0x08b3
        L_0x09e4:
            byte[] r13 = r1.N
            if (r13 == 0) goto L_0x09f7
            g1g r2 = new g1g
            r2.<init>((byte[]) r13)
            dr4 r2 = defpackage.dr4.a(r2)
            if (r2 == 0) goto L_0x09f7
            java.lang.String r11 = r2.a
            java.lang.String r12 = "video/dolby-vision"
        L_0x09f7:
            boolean r2 = r1.V
            boolean r13 = r1.U
            if (r13 == 0) goto L_0x09ff
            r13 = 2
            goto L_0x0a00
        L_0x09ff:
            r13 = 0
        L_0x0a00:
            r2 = r2 | r13
            aa6 r13 = new aa6
            r13.<init>()
            boolean r19 = defpackage.uq9.h(r12)
            r41 = r4
            java.util.Map r4 = g0
            if (r19 == 0) goto L_0x0a1f
            int r8 = r1.O
            r13.x = r8
            int r8 = r1.Q
            r13.y = r8
            r13.z = r0
            r0 = 25
            r8 = 1
            goto L_0x0bde
        L_0x0a1f:
            boolean r0 = defpackage.uq9.j(r12)
            if (r0 == 0) goto L_0x0bac
            int r0 = r1.q
            if (r0 != 0) goto L_0x0a3b
            int r0 = r1.o
            r8 = -1
            if (r0 != r8) goto L_0x0a30
            int r0 = r1.m
        L_0x0a30:
            r1.o = r0
            int r0 = r1.p
            if (r0 != r8) goto L_0x0a38
            int r0 = r1.n
        L_0x0a38:
            r1.p = r0
            goto L_0x0a3c
        L_0x0a3b:
            r8 = -1
        L_0x0a3c:
            int r0 = r1.o
            if (r0 == r8) goto L_0x0a4e
            int r9 = r1.p
            if (r9 == r8) goto L_0x0a4e
            int r8 = r1.n
            int r8 = r8 * r0
            float r0 = (float) r8
            int r8 = r1.m
            int r8 = r8 * r9
            float r8 = (float) r8
            float r0 = r0 / r8
            goto L_0x0a50
        L_0x0a4e:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0a50:
            boolean r8 = r1.x
            if (r8 == 0) goto L_0x0b29
            float r8 = r1.D
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0a92
            float r8 = r1.E
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0a92
            float r8 = r1.F
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0a92
            float r8 = r1.G
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0a92
            float r8 = r1.H
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0a92
            float r8 = r1.I
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0a92
            float r8 = r1.J
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0a92
            float r8 = r1.K
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0a92
            float r8 = r1.L
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0a92
            float r8 = r1.M
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0a96
        L_0x0a92:
            r8 = 25
            goto L_0x0b1c
        L_0x0a96:
            r8 = 25
            byte[] r9 = new byte[r8]
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r9)
            java.nio.ByteOrder r14 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r10 = r10.order(r14)
            r14 = 0
            r10.put(r14)
            float r14 = r1.D
            r15 = 1195593728(0x47435000, float:50000.0)
            float r14 = r14 * r15
            r16 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 + r16
            int r14 = (int) r14
            short r14 = (short) r14
            r10.putShort(r14)
            float r14 = r1.E
            float r14 = r14 * r15
            float r14 = r14 + r16
            int r14 = (int) r14
            short r14 = (short) r14
            r10.putShort(r14)
            float r14 = r1.F
            float r14 = r14 * r15
            float r14 = r14 + r16
            int r14 = (int) r14
            short r14 = (short) r14
            r10.putShort(r14)
            float r14 = r1.G
            float r14 = r14 * r15
            float r14 = r14 + r16
            int r14 = (int) r14
            short r14 = (short) r14
            r10.putShort(r14)
            float r14 = r1.H
            float r14 = r14 * r15
            float r14 = r14 + r16
            int r14 = (int) r14
            short r14 = (short) r14
            r10.putShort(r14)
            float r14 = r1.I
            float r14 = r14 * r15
            float r14 = r14 + r16
            int r14 = (int) r14
            short r14 = (short) r14
            r10.putShort(r14)
            float r14 = r1.J
            float r14 = r14 * r15
            float r14 = r14 + r16
            int r14 = (int) r14
            short r14 = (short) r14
            r10.putShort(r14)
            float r14 = r1.K
            float r14 = r14 * r15
            float r14 = r14 + r16
            int r14 = (int) r14
            short r14 = (short) r14
            r10.putShort(r14)
            float r14 = r1.L
            float r14 = r14 + r16
            int r14 = (int) r14
            short r14 = (short) r14
            r10.putShort(r14)
            float r14 = r1.M
            float r14 = r14 + r16
            int r14 = (int) r14
            short r14 = (short) r14
            r10.putShort(r14)
            int r14 = r1.B
            short r14 = (short) r14
            r10.putShort(r14)
            int r14 = r1.C
            short r14 = (short) r14
            r10.putShort(r14)
            goto L_0x0b1d
        L_0x0b1c:
            r9 = 0
        L_0x0b1d:
            l53 r10 = new l53
            int r14 = r1.y
            int r15 = r1.A
            int r8 = r1.z
            r10.<init>(r14, r15, r8, r9)
            goto L_0x0b2a
        L_0x0b29:
            r10 = 0
        L_0x0b2a:
            java.lang.String r8 = r1.a
            if (r8 == 0) goto L_0x0b41
            boolean r8 = r4.containsKey(r8)
            if (r8 == 0) goto L_0x0b41
            java.lang.String r8 = r1.a
            java.lang.Object r8 = r4.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L_0x0b42
        L_0x0b41:
            r8 = -1
        L_0x0b42:
            int r9 = r1.r
            if (r9 != 0) goto L_0x0b92
            float r9 = r1.s
            r14 = 0
            int r9 = java.lang.Float.compare(r9, r14)
            if (r9 != 0) goto L_0x0b92
            float r9 = r1.t
            int r9 = java.lang.Float.compare(r9, r14)
            if (r9 != 0) goto L_0x0b92
            float r9 = r1.u
            int r9 = java.lang.Float.compare(r9, r14)
            if (r9 != 0) goto L_0x0b61
            r8 = 0
            goto L_0x0b92
        L_0x0b61:
            float r9 = r1.t
            r14 = 1119092736(0x42b40000, float:90.0)
            int r9 = java.lang.Float.compare(r9, r14)
            if (r9 != 0) goto L_0x0b6e
            r8 = 90
            goto L_0x0b92
        L_0x0b6e:
            float r9 = r1.t
            r14 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r9 = java.lang.Float.compare(r9, r14)
            if (r9 == 0) goto L_0x0b90
            float r9 = r1.t
            r14 = 1127481344(0x43340000, float:180.0)
            int r9 = java.lang.Float.compare(r9, r14)
            if (r9 != 0) goto L_0x0b83
            goto L_0x0b90
        L_0x0b83:
            float r9 = r1.t
            r14 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r9 = java.lang.Float.compare(r9, r14)
            if (r9 != 0) goto L_0x0b92
            r8 = 270(0x10e, float:3.78E-43)
            goto L_0x0b92
        L_0x0b90:
            r8 = 180(0xb4, float:2.52E-43)
        L_0x0b92:
            int r9 = r1.m
            r13.p = r9
            int r9 = r1.n
            r13.q = r9
            r13.t = r0
            r13.s = r8
            byte[] r0 = r1.v
            r13.u = r0
            int r0 = r1.w
            r13.v = r0
            r13.w = r10
            r0 = 25
            r8 = 2
            goto L_0x0bde
        L_0x0bac:
            r0 = 25
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x0bdd
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x0bdd
            boolean r8 = r10.equals(r12)
            if (r8 != 0) goto L_0x0bdd
            boolean r8 = r14.equals(r12)
            if (r8 != 0) goto L_0x0bdd
            boolean r8 = r15.equals(r12)
            if (r8 != 0) goto L_0x0bdd
            r8 = r29
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0bd5
            goto L_0x0bdd
        L_0x0bd5:
            java.lang.String r0 = "Unexpected MIME type."
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x0bdd:
            r8 = 3
        L_0x0bde:
            java.lang.String r9 = r1.a
            if (r9 == 0) goto L_0x0bec
            boolean r4 = r4.containsKey(r9)
            if (r4 != 0) goto L_0x0bec
            java.lang.String r4 = r1.a
            r13.b = r4
        L_0x0bec:
            java.lang.String r4 = java.lang.Integer.toString(r28)
            r13.a = r4
            r13.k = r12
            r13.l = r3
            java.lang.String r3 = r1.W
            r13.c = r3
            r13.d = r2
            r13.m = r5
            r13.h = r11
            xv4 r2 = r1.l
            r13.n = r2
            ca6 r2 = r13.a()
            int r3 = r1.c
            r4 = r25
            ypf r3 = r4.B(r3, r8)
            r1.X = r3
            r3.d(r2)
            int r2 = r1.c
            r3 = r22
            r3.put(r2, r1)
            r8 = r21
            r1 = 0
        L_0x0c1f:
            r8.u = r1
            goto L_0x0c89
        L_0x0c22:
            r1 = 0
            java.lang.String r0 = "CodecId is missing in TrackEntry element"
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x0c2a:
            r38 = r2
            r39 = r3
            r41 = r4
            r40 = r5
            r3 = r10
            r0 = 25
            r17 = 15
            int r1 = r8.G
            r2 = 2
            if (r1 == r2) goto L_0x0c3d
            goto L_0x0c89
        L_0x0c3d:
            r1 = 0
            r2 = 0
        L_0x0c3f:
            int r4 = r8.K
            if (r1 >= r4) goto L_0x0c4b
            int[] r4 = r8.L
            r4 = r4[r1]
            int r2 = r2 + r4
            r4 = 1
            int r1 = r1 + r4
            goto L_0x0c3f
        L_0x0c4b:
            int r1 = r8.M
            java.lang.Object r1 = r3.get(r1)
            ih8 r1 = (defpackage.ih8) r1
            ypf r3 = r1.X
            r3.getClass()
            r3 = 0
        L_0x0c59:
            int r4 = r8.K
            if (r3 >= r4) goto L_0x0c86
            long r4 = r8.H
            int r9 = r1.e
            int r9 = r9 * r3
            r10 = 1000(0x3e8, float:1.401E-42)
            int r9 = r9 / r10
            long r9 = (long) r9
            long r33 = r4 + r9
            int r4 = r8.O
            if (r3 != 0) goto L_0x0c72
            boolean r5 = r8.Q
            if (r5 != 0) goto L_0x0c72
            r5 = 1
            r4 = r4 | r5
        L_0x0c72:
            r35 = r4
            int[] r4 = r8.L
            r36 = r4[r3]
            int r2 = r2 - r36
            r31 = r8
            r32 = r1
            r37 = r2
            r31.c(r32, r33, r35, r36, r37)
            r4 = 1
            int r3 = r3 + r4
            goto L_0x0c59
        L_0x0c86:
            r2 = 0
            r8.G = r2
        L_0x0c89:
            r0 = 0
            r10 = 32
            r12 = 4
        L_0x0c8d:
            r13 = 22
        L_0x0c8f:
            r19 = 1
            goto L_0x109a
        L_0x0c93:
            r38 = r2
            r39 = r3
            r41 = r4
            r40 = r5
            r0 = 25
            r17 = 15
            int r1 = r15.c
            r2 = 524531317(0x1f43b675, float:4.144378E-20)
            java.lang.Object r3 = r15.f
            g1g r3 = (defpackage.g1g) r3
            if (r1 != 0) goto L_0x0d15
            r1 = r43
            gf4 r1 = (defpackage.gf4) r1
            r4 = 0
            r5 = 1
            r8 = 4
            long r9 = r3.B(r1, r5, r4, r8)
            r12 = -2
            int r5 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0cf3
            r1.y()
        L_0x0cbe:
            byte[] r5 = r15.a
            r1.m(r4, r5, r8)
            byte r9 = r5[r4]
            int r9 = defpackage.g1g.e(r9)
            r10 = -1
            if (r9 == r10) goto L_0x0cf7
            if (r9 > r8) goto L_0x0cf7
            long r12 = defpackage.g1g.a(r9, r5, r4)
            int r4 = (int) r12
            java.lang.Object r5 = r15.g
            xv1 r5 = (defpackage.xv1) r5
            java.lang.Object r5 = r5.b
            kh8 r5 = (defpackage.kh8) r5
            r5.getClass()
            if (r4 == r14) goto L_0x0cef
            if (r4 == r2) goto L_0x0cef
            r5 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r4 == r5) goto L_0x0cef
            r5 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r4 != r5) goto L_0x0ced
            goto L_0x0cef
        L_0x0ced:
            r4 = 1
            goto L_0x0cfb
        L_0x0cef:
            r1.z(r9)
            long r9 = (long) r4
        L_0x0cf3:
            r4 = 1
            r12 = -1
            goto L_0x0d01
        L_0x0cf7:
            r5 = 374648427(0x1654ae6b, float:1.718026E-25)
            goto L_0x0ced
        L_0x0cfb:
            r1.z(r4)
            r4 = 0
            r8 = 4
            goto L_0x0cbe
        L_0x0d01:
            int r1 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x0d0f
            r0 = 0
            r10 = 32
            r12 = 4
            r13 = 22
            r19 = 0
            goto L_0x109a
        L_0x0d0f:
            int r1 = (int) r9
            r15.d = r1
            r15.c = r4
            goto L_0x0d16
        L_0x0d15:
            r4 = 1
        L_0x0d16:
            int r1 = r15.c
            if (r1 != r4) goto L_0x0d2b
            r1 = r43
            gf4 r1 = (defpackage.gf4) r1
            r5 = 0
            r8 = 8
            long r9 = r3.B(r1, r5, r4, r8)
            r15.e = r9
            r1 = 2
            r15.c = r1
            goto L_0x0d2d
        L_0x0d2b:
            r8 = 8
        L_0x0d2d:
            java.lang.Object r1 = r15.g
            xv1 r1 = (defpackage.xv1) r1
            int r3 = r15.d
            java.lang.Object r1 = r1.b
            kh8 r1 = (defpackage.kh8) r1
            r1.getClass()
            switch(r3) {
                case 131: goto L_0x0d47;
                case 134: goto L_0x0d45;
                case 136: goto L_0x0d47;
                case 155: goto L_0x0d47;
                case 159: goto L_0x0d47;
                case 160: goto L_0x0d43;
                case 161: goto L_0x0d41;
                case 163: goto L_0x0d41;
                case 165: goto L_0x0d41;
                case 166: goto L_0x0d43;
                case 174: goto L_0x0d43;
                case 176: goto L_0x0d47;
                case 179: goto L_0x0d47;
                case 181: goto L_0x0d3f;
                case 183: goto L_0x0d43;
                case 186: goto L_0x0d47;
                case 187: goto L_0x0d43;
                case 215: goto L_0x0d47;
                case 224: goto L_0x0d43;
                case 225: goto L_0x0d43;
                case 231: goto L_0x0d47;
                case 238: goto L_0x0d47;
                case 241: goto L_0x0d47;
                case 251: goto L_0x0d47;
                case 16868: goto L_0x0d43;
                case 16871: goto L_0x0d47;
                case 16877: goto L_0x0d41;
                case 16980: goto L_0x0d47;
                case 16981: goto L_0x0d41;
                case 17026: goto L_0x0d45;
                case 17029: goto L_0x0d47;
                case 17143: goto L_0x0d47;
                case 17545: goto L_0x0d3f;
                case 18401: goto L_0x0d47;
                case 18402: goto L_0x0d41;
                case 18407: goto L_0x0d43;
                case 18408: goto L_0x0d47;
                case 19899: goto L_0x0d43;
                case 20529: goto L_0x0d47;
                case 20530: goto L_0x0d47;
                case 20532: goto L_0x0d43;
                case 20533: goto L_0x0d43;
                case 21358: goto L_0x0d45;
                case 21419: goto L_0x0d41;
                case 21420: goto L_0x0d47;
                case 21432: goto L_0x0d47;
                case 21680: goto L_0x0d47;
                case 21682: goto L_0x0d47;
                case 21690: goto L_0x0d47;
                case 21930: goto L_0x0d47;
                case 21936: goto L_0x0d43;
                case 21945: goto L_0x0d47;
                case 21946: goto L_0x0d47;
                case 21947: goto L_0x0d47;
                case 21948: goto L_0x0d47;
                case 21949: goto L_0x0d47;
                case 21968: goto L_0x0d43;
                case 21969: goto L_0x0d3f;
                case 21970: goto L_0x0d3f;
                case 21971: goto L_0x0d3f;
                case 21972: goto L_0x0d3f;
                case 21973: goto L_0x0d3f;
                case 21974: goto L_0x0d3f;
                case 21975: goto L_0x0d3f;
                case 21976: goto L_0x0d3f;
                case 21977: goto L_0x0d3f;
                case 21978: goto L_0x0d3f;
                case 21998: goto L_0x0d47;
                case 22186: goto L_0x0d47;
                case 22203: goto L_0x0d47;
                case 25152: goto L_0x0d43;
                case 25188: goto L_0x0d47;
                case 25506: goto L_0x0d41;
                case 28032: goto L_0x0d43;
                case 30113: goto L_0x0d43;
                case 30320: goto L_0x0d43;
                case 30321: goto L_0x0d47;
                case 30322: goto L_0x0d41;
                case 30323: goto L_0x0d3f;
                case 30324: goto L_0x0d3f;
                case 30325: goto L_0x0d3f;
                case 2274716: goto L_0x0d45;
                case 2352003: goto L_0x0d47;
                case 2807729: goto L_0x0d47;
                case 290298740: goto L_0x0d43;
                case 357149030: goto L_0x0d43;
                case 374648427: goto L_0x0d43;
                case 408125543: goto L_0x0d43;
                case 440786851: goto L_0x0d43;
                case 475249515: goto L_0x0d43;
                case 524531317: goto L_0x0d43;
                default: goto L_0x0d3d;
            }
        L_0x0d3d:
            r1 = 0
            goto L_0x0d48
        L_0x0d3f:
            r1 = 5
            goto L_0x0d48
        L_0x0d41:
            r1 = 4
            goto L_0x0d48
        L_0x0d43:
            r1 = 1
            goto L_0x0d48
        L_0x0d45:
            r1 = 3
            goto L_0x0d48
        L_0x0d47:
            r1 = 2
        L_0x0d48:
            if (r1 == 0) goto L_0x10db
            r3 = 1
            if (r1 == r3) goto L_0x0f71
            r2 = 8
            r4 = 2
            if (r1 == r4) goto L_0x0f34
            r5 = 3
            if (r1 == r5) goto L_0x0e73
            r9 = 4
            if (r1 == r9) goto L_0x0e59
            r9 = 5
            if (r1 != r9) goto L_0x0e40
            long r10 = r15.e
            r12 = 4
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0d81
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0d68
            goto L_0x0d81
        L_0x0d68:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Invalid float size: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x0d81:
            java.lang.Object r1 = r15.g
            xv1 r1 = (defpackage.xv1) r1
            int r2 = r15.d
            int r3 = (int) r10
            r10 = r43
            gf4 r10 = (defpackage.gf4) r10
            long r10 = r15.a(r10, r3)
            r12 = 4
            if (r3 != r12) goto L_0x0d9a
            int r3 = (int) r10
            float r3 = java.lang.Float.intBitsToFloat(r3)
            double r10 = (double) r3
            goto L_0x0d9e
        L_0x0d9a:
            double r10 = java.lang.Double.longBitsToDouble(r10)
        L_0x0d9e:
            java.lang.Object r1 = r1.b
            kh8 r1 = (defpackage.kh8) r1
            r3 = 181(0xb5, float:2.54E-43)
            if (r2 == r3) goto L_0x0e2f
            r3 = 17545(0x4489, float:2.4586E-41)
            if (r2 == r3) goto L_0x0e2b
            switch(r2) {
                case 21969: goto L_0x0e22;
                case 21970: goto L_0x0e19;
                case 21971: goto L_0x0e10;
                case 21972: goto L_0x0e07;
                case 21973: goto L_0x0dfe;
                case 21974: goto L_0x0df5;
                case 21975: goto L_0x0dec;
                case 21976: goto L_0x0de3;
                case 21977: goto L_0x0dda;
                case 21978: goto L_0x0dd1;
                default: goto L_0x0dad;
            }
        L_0x0dad:
            switch(r2) {
                case 30323: goto L_0x0dc8;
                case 30324: goto L_0x0dbf;
                case 30325: goto L_0x0db6;
                default: goto L_0x0db0;
            }
        L_0x0db0:
            r1.getClass()
        L_0x0db3:
            r1 = 0
            goto L_0x0e39
        L_0x0db6:
            r1.b(r2)
            ih8 r1 = r1.u
            float r2 = (float) r10
            r1.u = r2
            goto L_0x0db3
        L_0x0dbf:
            r1.b(r2)
            ih8 r1 = r1.u
            float r2 = (float) r10
            r1.t = r2
            goto L_0x0db3
        L_0x0dc8:
            r1.b(r2)
            ih8 r1 = r1.u
            float r2 = (float) r10
            r1.s = r2
            goto L_0x0db3
        L_0x0dd1:
            r1.b(r2)
            ih8 r1 = r1.u
            float r2 = (float) r10
            r1.M = r2
            goto L_0x0db3
        L_0x0dda:
            r1.b(r2)
            ih8 r1 = r1.u
            float r2 = (float) r10
            r1.L = r2
            goto L_0x0db3
        L_0x0de3:
            r1.b(r2)
            ih8 r1 = r1.u
            float r2 = (float) r10
            r1.K = r2
            goto L_0x0db3
        L_0x0dec:
            r1.b(r2)
            ih8 r1 = r1.u
            float r2 = (float) r10
            r1.J = r2
            goto L_0x0db3
        L_0x0df5:
            r1.b(r2)
            ih8 r1 = r1.u
            float r2 = (float) r10
            r1.I = r2
            goto L_0x0db3
        L_0x0dfe:
            r1.b(r2)
            ih8 r1 = r1.u
            float r2 = (float) r10
            r1.H = r2
            goto L_0x0db3
        L_0x0e07:
            r1.b(r2)
            ih8 r1 = r1.u
            float r2 = (float) r10
            r1.G = r2
            goto L_0x0db3
        L_0x0e10:
            r1.b(r2)
            ih8 r1 = r1.u
            float r2 = (float) r10
            r1.F = r2
            goto L_0x0db3
        L_0x0e19:
            r1.b(r2)
            ih8 r1 = r1.u
            float r2 = (float) r10
            r1.E = r2
            goto L_0x0db3
        L_0x0e22:
            r1.b(r2)
            ih8 r1 = r1.u
            float r2 = (float) r10
            r1.D = r2
            goto L_0x0db3
        L_0x0e2b:
            long r2 = (long) r10
            r1.s = r2
            goto L_0x0db3
        L_0x0e2f:
            r1.b(r2)
            ih8 r1 = r1.u
            int r2 = (int) r10
            r1.Q = r2
            goto L_0x0db3
        L_0x0e39:
            r15.c = r1
            r0 = r1
            r10 = 32
            goto L_0x0c8d
        L_0x0e40:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r10 = 32
            r0.<init>(r10)
            java.lang.String r2 = "Invalid element type "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x0e59:
            r12 = r9
            r9 = 5
            r10 = 32
            java.lang.Object r1 = r15.g
            xv1 r1 = (defpackage.xv1) r1
            int r2 = r15.d
            long r13 = r15.e
            int r3 = (int) r13
            r11 = r43
            gf4 r11 = (defpackage.gf4) r11
            r1.k(r2, r3, r11)
            r1 = 0
            r15.c = r1
            r0 = r1
            goto L_0x0c8d
        L_0x0e73:
            r9 = 5
            r10 = 32
            r12 = 4
            long r1 = r15.e
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 > 0) goto L_0x0f1b
            java.lang.Object r3 = r15.g
            xv1 r3 = (defpackage.xv1) r3
            int r11 = r15.d
            int r1 = (int) r1
            if (r1 != 0) goto L_0x0e8c
            java.lang.String r1 = ""
            goto L_0x0ea8
        L_0x0e8c:
            byte[] r2 = new byte[r1]
            r13 = r43
            gf4 r13 = (defpackage.gf4) r13
            r14 = 0
            r13.readFully(r2, r14, r1)
        L_0x0e96:
            if (r1 <= 0) goto L_0x0ea2
            r13 = 1
            int r16 = r1 + -1
            byte r13 = r2[r16]
            if (r13 != 0) goto L_0x0ea2
            r13 = -1
            int r1 = r1 + r13
            goto L_0x0e96
        L_0x0ea2:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r2, r14, r1)
            r1 = r13
        L_0x0ea8:
            java.lang.Object r2 = r3.b
            kh8 r2 = (defpackage.kh8) r2
            r2.getClass()
            r3 = 134(0x86, float:1.88E-43)
            if (r11 == r3) goto L_0x0f0c
            r3 = 17026(0x4282, float:2.3859E-41)
            if (r11 == r3) goto L_0x0ed4
            r3 = 21358(0x536e, float:2.9929E-41)
            if (r11 == r3) goto L_0x0ecc
            r3 = 2274716(0x22b59c, float:3.187556E-39)
            if (r11 == r3) goto L_0x0ec4
        L_0x0ec0:
            r1 = 0
            r13 = 22
            goto L_0x0f16
        L_0x0ec4:
            r2.b(r11)
            ih8 r2 = r2.u
            r2.W = r1
            goto L_0x0ec0
        L_0x0ecc:
            r2.b(r11)
            ih8 r2 = r2.u
            r2.a = r1
            goto L_0x0ec0
        L_0x0ed4:
            java.lang.String r2 = "webm"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0f08
            java.lang.String r2 = "matroska"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0ee5
            goto L_0x0ec0
        L_0x0ee5:
            int r0 = r1.length()
            r13 = 22
            int r0 = r0 + r13
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "DocType "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " not supported"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x0f08:
            r13 = 22
        L_0x0f0a:
            r1 = 0
            goto L_0x0f16
        L_0x0f0c:
            r13 = 22
            r2.b(r11)
            ih8 r2 = r2.u
            r2.b = r1
            goto L_0x0f0a
        L_0x0f16:
            r15.c = r1
            r0 = r1
            goto L_0x0c8f
        L_0x0f1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 41
            r0.<init>(r3)
            java.lang.String r3 = "String element size: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x0f34:
            r5 = 3
            r9 = 5
            r10 = 32
            r12 = 4
            r13 = 22
            long r0 = r15.e
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0f58
            java.lang.Object r2 = r15.g
            xv1 r2 = (defpackage.xv1) r2
            int r3 = r15.d
            int r0 = (int) r0
            r1 = r43
            gf4 r1 = (defpackage.gf4) r1
            long r0 = r15.a(r1, r0)
            r2.p(r3, r0)
            r0 = 0
            r15.c = r0
            goto L_0x0c8f
        L_0x0f58:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 42
            r2.<init>(r3)
            java.lang.String r3 = "Invalid integer size: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x0f71:
            r4 = 2
            r5 = 3
            r9 = 5
            r10 = 32
            r12 = 4
            r13 = 22
            r0 = r43
            gf4 r0 = (defpackage.gf4) r0
            long r0 = r0.h()
            long r4 = r15.e
            long r4 = r4 + r0
            qe4 r3 = new qe4
            int r14 = r15.d
            r3.<init>(r14, r4)
            r11.push(r3)
            java.lang.Object r3 = r15.g
            xv1 r3 = (defpackage.xv1) r3
            int r4 = r15.d
            long r8 = r15.e
            java.lang.Object r3 = r3.b
            kh8 r3 = (defpackage.kh8) r3
            wf5 r5 = r3.a0
            defpackage.y64.k(r5)
            r5 = 160(0xa0, float:2.24E-43)
            if (r4 == r5) goto L_0x1093
            r5 = 174(0xae, float:2.44E-43)
            if (r4 == r5) goto L_0x1034
            r5 = 187(0xbb, float:2.62E-43)
            if (r4 == r5) goto L_0x102e
            r5 = 19899(0x4dbb, float:2.7884E-41)
            if (r4 == r5) goto L_0x1026
            r5 = 20533(0x5035, float:2.8773E-41)
            if (r4 == r5) goto L_0x101d
            r5 = 21968(0x55d0, float:3.0784E-41)
            if (r4 == r5) goto L_0x1014
            r5 = 408125543(0x18538067, float:2.7335937E-24)
            if (r4 == r5) goto L_0x0ffa
            r5 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r4 == r5) goto L_0x0fea
            if (r4 == r2) goto L_0x0fc6
        L_0x0fc3:
            r0 = 0
            goto L_0x1096
        L_0x0fc6:
            boolean r0 = r3.v
            if (r0 != 0) goto L_0x0fc3
            boolean r0 = r3.d
            if (r0 == 0) goto L_0x0fda
            long r0 = r3.z
            r4 = -1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0fda
            r0 = 1
            r3.y = r0
            goto L_0x0fc3
        L_0x0fda:
            r0 = 1
            wf5 r1 = r3.a0
            tq5 r2 = new tq5
            long r4 = r3.t
            r2.<init>(r4)
            r1.K(r2)
            r3.v = r0
            goto L_0x0fc3
        L_0x0fea:
            pa8 r0 = new pa8
            r1 = 0
            r0.<init>(r1)
            r3.C = r0
            pa8 r0 = new pa8
            r0.<init>(r1)
            r3.D = r0
            goto L_0x0fc3
        L_0x0ffa:
            long r4 = r3.q
            r19 = -1
            int r2 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r2 == 0) goto L_0x100f
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x1007
            goto L_0x100f
        L_0x1007:
            java.lang.String r0 = "Multiple Segment elements not supported"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x100f:
            r3.q = r0
            r3.p = r8
            goto L_0x0fc3
        L_0x1014:
            r3.b(r4)
            ih8 r0 = r3.u
            r1 = 1
            r0.x = r1
            goto L_0x0fc3
        L_0x101d:
            r1 = 1
            r3.b(r4)
            ih8 r0 = r3.u
            r0.h = r1
            goto L_0x0fc3
        L_0x1026:
            r0 = -1
            r3.w = r0
            r1 = -1
            r3.x = r1
            goto L_0x0fc3
        L_0x102e:
            r0 = -1
            r1 = 0
            r3.E = r1
            r0 = r1
            goto L_0x1096
        L_0x1034:
            r0 = -1
            r1 = 0
            ih8 r2 = new ih8
            r2.<init>()
            r2.m = r0
            r2.n = r0
            r2.o = r0
            r2.p = r0
            r2.q = r1
            r2.r = r0
            r4 = 0
            r2.s = r4
            r2.t = r4
            r2.u = r4
            r4 = 0
            r2.v = r4
            r2.w = r0
            r2.x = r1
            r2.y = r0
            r2.z = r0
            r2.A = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r2.B = r0
            r0 = 200(0xc8, float:2.8E-43)
            r2.C = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.D = r0
            r2.E = r0
            r2.F = r0
            r2.G = r0
            r2.H = r0
            r2.I = r0
            r2.J = r0
            r2.K = r0
            r2.L = r0
            r2.M = r0
            r0 = 1
            r2.O = r0
            r1 = -1
            r2.P = r1
            r1 = 8000(0x1f40, float:1.121E-41)
            r2.Q = r1
            r4 = 0
            r2.R = r4
            r2.S = r4
            r2.V = r0
            java.lang.String r0 = "eng"
            r2.W = r0
            r3.u = r2
            goto L_0x0fc3
        L_0x1093:
            r0 = 0
            r3.Q = r0
        L_0x1096:
            r15.c = r0
            goto L_0x0c8f
        L_0x109a:
            if (r19 == 0) goto L_0x10ca
            r1 = r43
            gf4 r1 = (defpackage.gf4) r1
            long r1 = r1.h()
            r3 = r42
            boolean r4 = r3.y
            if (r4 == 0) goto L_0x10b6
            r3.A = r1
            long r1 = r3.z
            r4 = r44
            r4.b = r1
            r3.y = r0
        L_0x10b4:
            r0 = 1
            goto L_0x10c9
        L_0x10b6:
            r4 = r44
            boolean r0 = r3.v
            if (r0 == 0) goto L_0x10ce
            long r0 = r3.A
            r8 = -1
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x10ce
            r4.b = r0
            r3.A = r8
            goto L_0x10b4
        L_0x10c9:
            return r0
        L_0x10ca:
            r3 = r42
            r4 = r44
        L_0x10ce:
            r0 = r3
            r1 = r4
            r2 = r38
            r3 = r39
            r5 = r40
            r4 = r41
            r11 = 0
            goto L_0x0015
        L_0x10db:
            r10 = 32
            r12 = 4
            r13 = 22
            r3 = r42
            r4 = r44
            long r0 = r15.e
            int r0 = (int) r0
            r1 = r43
            gf4 r1 = (defpackage.gf4) r1
            r1.z(r0)
            r0 = 0
            r15.c = r0
            r0 = r3
            r1 = r4
            r2 = r38
            r3 = r39
            r5 = r40
            r4 = r41
            goto L_0x0024
        L_0x10fd:
            r3 = r0
            if (r19 != 0) goto L_0x1124
            r11 = 0
        L_0x1101:
            android.util.SparseArray r0 = r3.c
            int r1 = r0.size()
            if (r11 >= r1) goto L_0x1122
            java.lang.Object r0 = r0.valueAt(r11)
            ih8 r0 = (defpackage.ih8) r0
            ypf r1 = r0.X
            r1.getClass()
            etf r1 = r0.T
            if (r1 == 0) goto L_0x111f
            ypf r2 = r0.X
            wpf r0 = r0.j
            r1.a(r2, r0)
        L_0x111f:
            r0 = 1
            int r11 = r11 + r0
            goto L_0x1101
        L_0x1122:
            r1 = -1
            return r1
        L_0x1124:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh8.i(uf5, yl4):int");
    }

    public final void j() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = 0;
        this.Z = false;
        this.j.E(0);
    }

    public final long k(long j2) {
        long j3 = this.r;
        if (j3 != -9223372036854775807L) {
            return t0g.J(j2, j3, 1000);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", (RuntimeException) null);
    }

    public final int l(gf4 gf4, ih8 ih8, int i2) {
        int i3;
        int i4;
        int i5;
        if ("S_TEXT/UTF8".equals(ih8.b)) {
            m(gf4, b0, i2);
            int i6 = this.S;
            j();
            return i6;
        } else if ("S_TEXT/ASS".equals(ih8.b)) {
            m(gf4, d0, i2);
            int i7 = this.S;
            j();
            return i7;
        } else if ("S_TEXT/WEBVTT".equals(ih8.b)) {
            m(gf4, e0, i2);
            int i8 = this.S;
            j();
            return i8;
        } else {
            ypf ypf = ih8.X;
            boolean z2 = this.U;
            boolean z3 = true;
            g1g g1g = this.j;
            if (!z2) {
                boolean z4 = ih8.h;
                g1g g1g2 = this.g;
                if (z4) {
                    this.O &= -1073741825;
                    boolean z5 = this.V;
                    int i9 = Uuid.SIZE_BITS;
                    if (!z5) {
                        gf4.j(g1g2.a, 0, 1, false);
                        this.R++;
                        byte b2 = g1g2.a[0];
                        if ((b2 & ByteCompanionObject.MIN_VALUE) != 128) {
                            this.Y = b2;
                            this.V = true;
                        } else {
                            throw ParserException.a("Extension bit is set in signal byte", (RuntimeException) null);
                        }
                    }
                    byte b3 = this.Y;
                    if ((b3 & 1) == 1) {
                        boolean z6 = (b3 & 2) == 2;
                        this.O |= 1073741824;
                        if (!this.Z) {
                            g1g g1g3 = this.l;
                            gf4.j(g1g3.a, 0, 8, false);
                            this.R += 8;
                            this.Z = true;
                            byte[] bArr = g1g2.a;
                            if (!z6) {
                                i9 = 0;
                            }
                            bArr[0] = (byte) (i9 | 8);
                            g1g2.H(0);
                            ypf.c(1, g1g2);
                            this.S++;
                            g1g3.H(0);
                            ypf.c(8, g1g3);
                            this.S += 8;
                        }
                        if (z6) {
                            if (!this.W) {
                                gf4.j(g1g2.a, 0, 1, false);
                                this.R++;
                                g1g2.H(0);
                                this.X = g1g2.v();
                                this.W = true;
                            }
                            int i10 = this.X * 4;
                            g1g2.E(i10);
                            gf4.j(g1g2.a, 0, i10, false);
                            this.R += i10;
                            short s2 = (short) ((this.X / 2) + 1);
                            int i11 = (s2 * 6) + 2;
                            ByteBuffer byteBuffer = this.o;
                            if (byteBuffer == null || byteBuffer.capacity() < i11) {
                                this.o = ByteBuffer.allocate(i11);
                            }
                            this.o.position(0);
                            this.o.putShort(s2);
                            int i12 = 0;
                            int i13 = 0;
                            while (true) {
                                i5 = this.X;
                                if (i12 >= i5) {
                                    break;
                                }
                                int y2 = g1g2.y();
                                if (i12 % 2 == 0) {
                                    this.o.putShort((short) (y2 - i13));
                                } else {
                                    this.o.putInt(y2 - i13);
                                }
                                i12++;
                                i13 = y2;
                            }
                            int i14 = (i2 - this.R) - i13;
                            if (i5 % 2 == 1) {
                                this.o.putInt(i14);
                            } else {
                                this.o.putShort((short) i14);
                                this.o.putInt(0);
                            }
                            byte[] array = this.o.array();
                            g1g g1g4 = this.m;
                            g1g4.F(i11, array);
                            ypf.c(i11, g1g4);
                            this.S += i11;
                        }
                    }
                } else {
                    byte[] bArr2 = ih8.i;
                    if (bArr2 != null) {
                        g1g.F(bArr2.length, bArr2);
                    }
                }
                if (ih8.f > 0) {
                    this.O |= 268435456;
                    this.n.E(0);
                    g1g2.E(4);
                    byte[] bArr3 = g1g2.a;
                    bArr3[0] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                    bArr3[1] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    bArr3[2] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    bArr3[3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
                    ypf.c(4, g1g2);
                    this.S += 4;
                }
                this.U = true;
            }
            int i15 = i2 + g1g.c;
            if (!"V_MPEG4/ISO/AVC".equals(ih8.b) && !"V_MPEGH/ISO/HEVC".equals(ih8.b)) {
                if (ih8.T != null) {
                    if (g1g.c != 0) {
                        z3 = false;
                    }
                    y64.j(z3);
                    ih8.T.e(gf4);
                }
                while (true) {
                    int i16 = this.R;
                    if (i16 >= i15) {
                        break;
                    }
                    int i17 = i15 - i16;
                    int c2 = g1g.c();
                    if (c2 > 0) {
                        i4 = Math.min(i17, c2);
                        ypf.c(i4, g1g);
                    } else {
                        i4 = ypf.a(gf4, i17, false);
                    }
                    this.R += i4;
                    this.S += i4;
                }
            } else {
                g1g g1g5 = this.f;
                byte[] bArr4 = g1g5.a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i18 = ih8.Y;
                int i19 = 4 - i18;
                while (this.R < i15) {
                    int i20 = this.T;
                    if (i20 == 0) {
                        int min = Math.min(i18, g1g.c());
                        gf4.j(bArr4, i19 + min, i18 - min, false);
                        if (min > 0) {
                            g1g.g(i19, bArr4, min);
                        }
                        this.R += i18;
                        g1g5.H(0);
                        this.T = g1g5.y();
                        g1g g1g6 = this.e;
                        g1g6.H(0);
                        ypf.c(4, g1g6);
                        this.S += 4;
                    } else {
                        int c3 = g1g.c();
                        if (c3 > 0) {
                            i3 = Math.min(i20, c3);
                            ypf.c(i3, g1g);
                        } else {
                            i3 = ypf.a(gf4, i20, false);
                        }
                        this.R += i3;
                        this.S += i3;
                        this.T -= i3;
                    }
                }
            }
            if ("A_VORBIS".equals(ih8.b)) {
                g1g g1g7 = this.h;
                g1g7.H(0);
                ypf.c(4, g1g7);
                this.S += 4;
            }
            int i21 = this.S;
            j();
            return i21;
        }
    }

    public final void m(gf4 gf4, byte[] bArr, int i2) {
        int length = bArr.length + i2;
        g1g g1g = this.k;
        byte[] bArr2 = g1g.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i2);
            g1g.F(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        gf4.j(g1g.a, bArr.length, i2, false);
        g1g.H(0);
        g1g.G(length);
    }

    public final void release() {
    }
}
