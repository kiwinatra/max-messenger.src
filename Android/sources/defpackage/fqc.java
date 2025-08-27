package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.hardware.camera2.CameraDevice;
import android.net.Uri;
import android.os.SystemClock;
import android.text.Spanned;
import android.util.Size;
import android.view.View;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.math.MathKt;
import kotlin.uuid.Uuid;
import org.apache.http.HttpStatus;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: fqc  reason: default package */
public abstract class fqc {
    public static final xl0 a = new xl0(0);
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static boolean e;
    public static long f;
    public static final /* synthetic */ int g = 0;

    public static boolean A(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean B(XmlPullParser xmlPullParser, String str) {
        return A(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static void C(int i, int i2) {
        int i3;
        if (i2 == -1) {
            int[] A = tr1.A(11);
            int length = A.length;
            int i4 = 0;
            while (i4 < length) {
                switch (A[i4]) {
                    case 1:
                        i3 = 10000;
                        break;
                    case 2:
                        i3 = 10001;
                        break;
                    case 3:
                        i3 = 10002;
                        break;
                    case 4:
                        i3 = 10003;
                        break;
                    case 5:
                        i3 = 10004;
                        break;
                    case 6:
                        i3 = 10005;
                        break;
                    case 7:
                        i3 = 10006;
                        break;
                    case 8:
                        i3 = 10007;
                        break;
                    case 9:
                        i3 = 10008;
                        break;
                    case 10:
                        i3 = 10009;
                        break;
                    case 11:
                        i3 = 10010;
                        break;
                    default:
                        throw null;
                }
                if (i3 != i) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public static long J(int i, byte[] bArr) {
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        byte b4 = bArr[i + 2];
        byte b5 = bArr[i + 3];
        byte b6 = b2 & true;
        int i2 = b2;
        if (b6 == true) {
            i2 = (b2 & ByteCompanionObject.MAX_VALUE) + ByteCompanionObject.MIN_VALUE;
        }
        byte b7 = b3 & true;
        int i3 = b3;
        if (b7 == true) {
            i3 = (b3 & ByteCompanionObject.MAX_VALUE) + ByteCompanionObject.MIN_VALUE;
        }
        byte b8 = b4 & true;
        int i4 = b4;
        if (b8 == true) {
            i4 = (b4 & ByteCompanionObject.MAX_VALUE) + ByteCompanionObject.MIN_VALUE;
        }
        byte b9 = b5 & true;
        int i5 = b5;
        if (b9 == true) {
            i5 = (b5 & ByteCompanionObject.MAX_VALUE) + Uuid.SIZE_BITS;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    public static long K(int i, byte[] bArr) {
        long J = J(i, bArr);
        long J2 = J(i + 4, bArr);
        if (J == 0 && J2 == 0) {
            return 0;
        }
        return ((J2 * 1000) / 4294967296L) + ((J - 2208988800L) * 1000);
    }

    public static void L(int i, tj3 tj3, l8c l8c, boolean z) {
        float f2 = tj3.d0;
        aj3 aj3 = tj3.I;
        int d2 = aj3.f.d();
        aj3 aj32 = tj3.K;
        int d3 = aj32.f.d();
        int e2 = aj3.e() + d2;
        int e3 = d3 - aj32.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int q = tj3.q();
        int i2 = (d3 - d2) - q;
        if (d2 > d3) {
            i2 = (d2 - d3) - q;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * ((float) i2)) + 0.5f : f2 * ((float) i2))) + d2;
        int i4 = i3 + q;
        if (d2 > d3) {
            i4 = i3 - q;
        }
        tj3.J(i3, i4);
        v(i + 1, tj3, l8c, z);
    }

    public static void M(int i, tj3 tj3, l8c l8c, tj3 tj32, boolean z) {
        float f2 = tj32.d0;
        aj3 aj3 = tj32.I;
        int e2 = aj3.e() + aj3.f.d();
        aj3 aj32 = tj32.K;
        int d2 = aj32.f.d() - aj32.e();
        if (d2 >= e2) {
            int q = tj32.q();
            if (tj32.g0 != 8) {
                int i2 = tj32.r;
                if (i2 == 2) {
                    q = (int) (tj32.d0 * 0.5f * ((float) (tj3 instanceof uj3 ? tj3.q() : tj3.T.q())));
                } else if (i2 == 0) {
                    q = d2 - e2;
                }
                q = Math.max(tj32.u, q);
                int i3 = tj32.v;
                if (i3 > 0) {
                    q = Math.min(i3, q);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((float) ((d2 - e2) - q))) + 0.5f));
            tj32.J(i4, q + i4);
            v(i + 1, tj32, l8c, z);
        }
    }

    public static void N(int i, tj3 tj3, l8c l8c) {
        float f2 = tj3.e0;
        aj3 aj3 = tj3.J;
        int d2 = aj3.f.d();
        aj3 aj32 = tj3.L;
        int d3 = aj32.f.d();
        int e2 = aj3.e() + d2;
        int e3 = d3 - aj32.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int k = tj3.k();
        int i2 = (d3 - d2) - k;
        if (d2 > d3) {
            i2 = (d2 - d3) - k;
        }
        int i3 = (int) (i2 > 0 ? (f2 * ((float) i2)) + 0.5f : f2 * ((float) i2));
        int i4 = d2 + i3;
        int i5 = i4 + k;
        if (d2 > d3) {
            i4 = d2 - i3;
            i5 = i4 - k;
        }
        tj3.K(i4, i5);
        T(i + 1, tj3, l8c);
    }

    public static void O(int i, tj3 tj3, l8c l8c, tj3 tj32) {
        float f2 = tj32.e0;
        aj3 aj3 = tj32.J;
        int e2 = aj3.e() + aj3.f.d();
        aj3 aj32 = tj32.L;
        int d2 = aj32.f.d() - aj32.e();
        if (d2 >= e2) {
            int k = tj32.k();
            if (tj32.g0 != 8) {
                int i2 = tj32.s;
                if (i2 == 2) {
                    k = (int) (f2 * 0.5f * ((float) (tj3 instanceof uj3 ? tj3.k() : tj3.T.k())));
                } else if (i2 == 0) {
                    k = d2 - e2;
                }
                k = Math.max(tj32.x, k);
                int i3 = tj32.y;
                if (i3 > 0) {
                    k = Math.min(i3, k);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((float) ((d2 - e2) - k))) + 0.5f));
            tj32.K(i4, k + i4);
            T(i + 1, tj32, l8c);
        }
    }

    public static RectF P(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i = 1; i < fArr.length; i += 2) {
            float round = ((float) Math.round(fArr[i - 1] * 10.0f)) / 10.0f;
            float round2 = ((float) Math.round(fArr[i] * 10.0f)) / 10.0f;
            float f2 = rectF.left;
            if (round < f2) {
                f2 = round;
            }
            rectF.left = f2;
            float f3 = rectF.top;
            if (round2 < f3) {
                f3 = round2;
            }
            rectF.top = f3;
            float f4 = rectF.right;
            if (round <= f4) {
                round = f4;
            }
            rectF.right = round;
            float f5 = rectF.bottom;
            if (round2 <= f5) {
                round2 = f5;
            }
            rectF.bottom = round2;
        }
        rectF.sort();
        return rectF;
    }

    public static final void S(fwf fwf) {
        fwf.e(yqf.class, new jye(2));
        fwf.e(jxf.class, new jye(3));
        fwf.e(zqf.class, new jye(4));
        fwf.e(h5f.class, new jye(5));
        fwf.e(l5f.class, new jye(6));
        fwf.e(a57.class, new jye(7));
        fwf.e(w47.class, new jye(8));
        fwf.e(k4f.class, new jye(9));
        fwf.e(tt0.class, new jye(10));
        fwf.e(xlf.class, new qid(26));
        fwf.c(dn4.class, new qid(25));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        r10 = r15.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        r10 = r9.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void T(int r16, defpackage.tj3 r17, defpackage.l8c r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r0.n
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            boolean r2 = r0 instanceof defpackage.uj3
            if (r2 != 0) goto L_0x0022
            boolean r2 = r17.z()
            if (r2 == 0) goto L_0x0022
            boolean r2 = d(r17)
            if (r2 == 0) goto L_0x0022
            xl0 r2 = new xl0
            r3 = 0
            r2.<init>(r3)
            defpackage.uj3.V(r0, r1, r2)
        L_0x0022:
            r2 = 3
            aj3 r3 = r0.i(r2)
            r4 = 5
            aj3 r4 = r0.i(r4)
            int r5 = r3.d()
            int r6 = r4.d()
            java.util.HashSet r7 = r3.a
            r8 = 1
            if (r7 == 0) goto L_0x0102
            boolean r3 = r3.c
            if (r3 == 0) goto L_0x0102
            java.util.Iterator r3 = r7.iterator()
        L_0x0041:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0102
            java.lang.Object r7 = r3.next()
            aj3 r7 = (defpackage.aj3) r7
            tj3 r12 = r7.d
            int r13 = r16 + 1
            boolean r14 = d(r12)
            boolean r15 = r12.z()
            if (r15 == 0) goto L_0x0066
            if (r14 == 0) goto L_0x0066
            xl0 r15 = new xl0
            r9 = 0
            r15.<init>(r9)
            defpackage.uj3.V(r12, r1, r15)
        L_0x0066:
            aj3 r9 = r12.J
            aj3 r15 = r12.L
            if (r7 != r9) goto L_0x0074
            aj3 r10 = r15.f
            if (r10 == 0) goto L_0x0074
            boolean r10 = r10.c
            if (r10 != 0) goto L_0x007e
        L_0x0074:
            if (r7 != r15) goto L_0x0080
            aj3 r10 = r9.f
            if (r10 == 0) goto L_0x0080
            boolean r10 = r10.c
            if (r10 == 0) goto L_0x0080
        L_0x007e:
            r10 = r8
            goto L_0x0081
        L_0x0080:
            r10 = 0
        L_0x0081:
            int[] r11 = r12.p0
            r11 = r11[r8]
            if (r11 != r2) goto L_0x00bb
            if (r14 == 0) goto L_0x008a
            goto L_0x00bb
        L_0x008a:
            if (r11 != r2) goto L_0x0041
            int r7 = r12.y
            if (r7 < 0) goto L_0x0041
            int r7 = r12.x
            if (r7 < 0) goto L_0x0041
            int r7 = r12.g0
            r9 = 8
            if (r7 == r9) goto L_0x00a5
            int r7 = r12.s
            if (r7 != 0) goto L_0x0041
            float r7 = r12.W
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0041
        L_0x00a5:
            boolean r7 = r12.y()
            if (r7 != 0) goto L_0x0041
            boolean r7 = r12.F
            if (r7 != 0) goto L_0x0041
            if (r10 == 0) goto L_0x0041
            boolean r7 = r12.y()
            if (r7 != 0) goto L_0x0041
            O(r13, r0, r1, r12)
            goto L_0x0041
        L_0x00bb:
            boolean r11 = r12.z()
            if (r11 == 0) goto L_0x00c3
            goto L_0x0041
        L_0x00c3:
            if (r7 != r9) goto L_0x00db
            aj3 r11 = r15.f
            if (r11 != 0) goto L_0x00db
            int r7 = r9.e()
            int r7 = r7 + r5
            int r9 = r12.k()
            int r9 = r9 + r7
            r12.K(r7, r9)
            T(r13, r12, r1)
            goto L_0x0041
        L_0x00db:
            if (r7 != r15) goto L_0x00f5
            aj3 r7 = r9.f
            if (r7 != 0) goto L_0x00f5
            int r7 = r15.e()
            int r7 = r5 - r7
            int r9 = r12.k()
            int r9 = r7 - r9
            r12.K(r9, r7)
            T(r13, r12, r1)
            goto L_0x0041
        L_0x00f5:
            if (r10 == 0) goto L_0x0041
            boolean r7 = r12.y()
            if (r7 != 0) goto L_0x0041
            N(r13, r12, r1)
            goto L_0x0041
        L_0x0102:
            boolean r3 = r0 instanceof defpackage.iv6
            if (r3 == 0) goto L_0x0107
            return
        L_0x0107:
            java.util.HashSet r3 = r4.a
            if (r3 == 0) goto L_0x01df
            boolean r4 = r4.c
            if (r4 == 0) goto L_0x01df
            java.util.Iterator r3 = r3.iterator()
        L_0x0113:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01df
            java.lang.Object r4 = r3.next()
            aj3 r4 = (defpackage.aj3) r4
            tj3 r5 = r4.d
            int r7 = r16 + 1
            boolean r9 = d(r5)
            boolean r10 = r5.z()
            if (r10 == 0) goto L_0x0138
            if (r9 == 0) goto L_0x0138
            xl0 r10 = new xl0
            r11 = 0
            r10.<init>(r11)
            defpackage.uj3.V(r5, r1, r10)
        L_0x0138:
            aj3 r10 = r5.J
            aj3 r11 = r5.L
            if (r4 != r10) goto L_0x0146
            aj3 r12 = r11.f
            if (r12 == 0) goto L_0x0146
            boolean r12 = r12.c
            if (r12 != 0) goto L_0x0150
        L_0x0146:
            if (r4 != r11) goto L_0x0152
            aj3 r12 = r10.f
            if (r12 == 0) goto L_0x0152
            boolean r12 = r12.c
            if (r12 == 0) goto L_0x0152
        L_0x0150:
            r12 = r8
            goto L_0x0153
        L_0x0152:
            r12 = 0
        L_0x0153:
            int[] r13 = r5.p0
            r13 = r13[r8]
            if (r13 != r2) goto L_0x015b
            if (r9 == 0) goto L_0x015f
        L_0x015b:
            r9 = 8
            r13 = 0
            goto L_0x0198
        L_0x015f:
            if (r13 != r2) goto L_0x0195
            int r4 = r5.y
            if (r4 < 0) goto L_0x0195
            int r4 = r5.x
            if (r4 < 0) goto L_0x0195
            int r4 = r5.g0
            r9 = 8
            if (r4 == r9) goto L_0x017d
            int r4 = r5.s
            if (r4 != 0) goto L_0x017b
            float r4 = r5.W
            r13 = 0
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x0113
            goto L_0x017e
        L_0x017b:
            r13 = 0
            goto L_0x0113
        L_0x017d:
            r13 = 0
        L_0x017e:
            boolean r4 = r5.y()
            if (r4 != 0) goto L_0x0113
            boolean r4 = r5.F
            if (r4 != 0) goto L_0x0113
            if (r12 == 0) goto L_0x0113
            boolean r4 = r5.y()
            if (r4 != 0) goto L_0x0113
            O(r7, r0, r1, r5)
            goto L_0x0113
        L_0x0195:
            r9 = 8
            goto L_0x017b
        L_0x0198:
            boolean r14 = r5.z()
            if (r14 == 0) goto L_0x01a0
            goto L_0x0113
        L_0x01a0:
            if (r4 != r10) goto L_0x01b8
            aj3 r14 = r11.f
            if (r14 != 0) goto L_0x01b8
            int r4 = r10.e()
            int r4 = r4 + r6
            int r10 = r5.k()
            int r10 = r10 + r4
            r5.K(r4, r10)
            T(r7, r5, r1)
            goto L_0x0113
        L_0x01b8:
            if (r4 != r11) goto L_0x01d2
            aj3 r4 = r10.f
            if (r4 != 0) goto L_0x01d2
            int r4 = r11.e()
            int r4 = r6 - r4
            int r10 = r5.k()
            int r10 = r4 - r10
            r5.K(r10, r4)
            T(r7, r5, r1)
            goto L_0x0113
        L_0x01d2:
            if (r12 == 0) goto L_0x0113
            boolean r4 = r5.y()
            if (r4 != 0) goto L_0x0113
            N(r7, r5, r1)
            goto L_0x0113
        L_0x01df:
            r3 = 6
            aj3 r3 = r0.i(r3)
            java.util.HashSet r4 = r3.a
            if (r4 == 0) goto L_0x0254
            boolean r4 = r3.c
            if (r4 == 0) goto L_0x0254
            int r4 = r3.d()
            java.util.HashSet r3 = r3.a
            java.util.Iterator r3 = r3.iterator()
        L_0x01f6:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0254
            java.lang.Object r5 = r3.next()
            aj3 r5 = (defpackage.aj3) r5
            tj3 r6 = r5.d
            int r7 = r16 + 1
            boolean r9 = d(r6)
            boolean r10 = r6.z()
            if (r10 == 0) goto L_0x021b
            if (r9 == 0) goto L_0x021b
            xl0 r10 = new xl0
            r11 = 0
            r10.<init>(r11)
            defpackage.uj3.V(r6, r1, r10)
        L_0x021b:
            int[] r10 = r6.p0
            r10 = r10[r8]
            if (r10 != r2) goto L_0x0223
            if (r9 == 0) goto L_0x01f6
        L_0x0223:
            boolean r9 = r6.z()
            if (r9 == 0) goto L_0x022a
            goto L_0x01f6
        L_0x022a:
            aj3 r9 = r6.M
            if (r5 != r9) goto L_0x01f6
            int r5 = r5.e()
            int r5 = r5 + r4
            boolean r10 = r6.E
            if (r10 != 0) goto L_0x0238
            goto L_0x0250
        L_0x0238:
            int r10 = r6.a0
            int r10 = r5 - r10
            int r11 = r6.V
            int r11 = r11 + r10
            r6.Z = r10
            aj3 r12 = r6.J
            r12.l(r10)
            aj3 r10 = r6.L
            r10.l(r11)
            r9.l(r5)
            r6.l = r8
        L_0x0250:
            T(r7, r6, r1)
            goto L_0x01f6
        L_0x0254:
            r0.n = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqc.T(int, tj3, l8c):void");
    }

    public static final xm6 a(Context context) {
        Size A = h88.A(context);
        Pair pair = context.getResources().getConfiguration().orientation == 1 ? TuplesKt.to(Integer.valueOf(A.getWidth()), Integer.valueOf(A.getHeight())) : TuplesKt.to(Integer.valueOf(A.getHeight()), Integer.valueOf(A.getWidth()));
        int intValue = ((Number) pair.component1()).intValue();
        int intValue2 = ((Number) pair.component2()).intValue();
        int max = Math.max(3, intValue / context.getResources().getDimensionPixelSize(rya.a));
        int i = intValue / max;
        int roundToInt = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
        int roundToInt2 = MathKt.roundToInt(((double) ((A.getWidth() / max) - ((max - 1) * roundToInt))) * 0.7d);
        int roundToInt3 = MathKt.roundToInt(Math.ceil(((double) ((intValue2 * max) / i)) * 1.8d));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(rya.b);
        return new xm6(i, roundToInt3, max, roundToInt, roundToInt2, dimensionPixelSize <= 0 ? null : new v3d(c44.DEFAULT_ASPECT_RATIO, dimensionPixelSize, dimensionPixelSize, 12));
    }

    public static long b() {
        DatagramSocket datagramSocket;
        long j;
        synchronized (d) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j = currentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j2 = currentTimeMillis / 1000;
                long j3 = currentTimeMillis - (j2 * 1000);
                long j4 = j2 + 2208988800L;
                j = currentTimeMillis;
                bArr[40] = (byte) ((int) (j4 >> 24));
                bArr[41] = (byte) ((int) (j4 >> 16));
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) ((int) (j4 >> 8));
                    bArr[43] = (byte) ((int) j4);
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) ((int) (j5 >> 24));
                    bArr[45] = (byte) ((int) (j5 >> 16));
                    bArr[46] = (byte) ((int) (j5 >> 8));
                    bArr[47] = (byte) ((int) (Math.random() * 255.0d));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j6 = (elapsedRealtime2 - elapsedRealtime) + j;
            byte b2 = bArr[0];
            byte b3 = bArr[1] & UByte.MAX_VALUE;
            long K = K(24, bArr);
            long K2 = K(32, bArr);
            long K3 = K(40, bArr);
            e((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), b3, K3);
            long j7 = (j6 + (((K3 - j6) + (K2 - K)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j7;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
            Throwable th22 = th;
            datagramSocket.close();
            throw th22;
        }
    }

    public static final int c(Spanned spanned) {
        Object[] objArr;
        int hashCode = spanned.toString().hashCode();
        try {
            objArr = spanned.getSpans(0, spanned.length(), Object.class);
        } catch (Throwable unused) {
            objArr = null;
        }
        if (objArr == null) {
            return hashCode;
        }
        int length = (hashCode * 31) + objArr.length;
        for (Object obj : objArr) {
            if (obj != null) {
                if (obj != spanned) {
                    length = (length * 31) + obj.hashCode();
                }
                int spanStart = spanned.getSpanStart(obj);
                length = spanned.getSpanFlags(obj) + ((spanned.getSpanEnd(obj) + ((spanStart + (length * 31)) * 31)) * 31);
            }
        }
        return length;
    }

    public static boolean d(tj3 tj3) {
        int[] iArr = tj3.p0;
        int i = iArr[0];
        int i2 = iArr[1];
        tj3 tj32 = tj3.T;
        uj3 uj3 = tj32 != null ? (uj3) tj32 : null;
        if (uj3 != null) {
            int i3 = uj3.p0[0];
        }
        if (uj3 != null) {
            int i4 = uj3.p0[1];
        }
        boolean z = i == 1 || tj3.A() || i == 2 || (i == 3 && tj3.r == 0 && tj3.W == c44.DEFAULT_ASPECT_RATIO && tj3.t(0)) || (i == 3 && tj3.r == 1 && tj3.u(0, tj3.q()));
        boolean z2 = i2 == 1 || tj3.B() || i2 == 2 || (i2 == 3 && tj3.s == 0 && tj3.W == c44.DEFAULT_ASPECT_RATIO && tj3.t(1)) || (i2 == 3 && tj3.s == 1 && tj3.u(1, tj3.k()));
        if (tj3.W <= c44.DEFAULT_ASPECT_RATIO || (!z && !z2)) {
            return z && z2;
        }
        return true;
    }

    public static void e(byte b2, byte b3, int i, long j) {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        } else if (b3 != 4 && b3 != 5) {
            throw new IOException(wj6.h(b3, "SNTP: Untrusted mode: "));
        } else if (i == 0 || i > 15) {
            throw new IOException(wj6.h(i, "SNTP: Untrusted stratum: "));
        } else if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static final Object h(ds5 ds5, Continuation continuation, Function0 function0, Function3 function3, bs5[] bs5Arr) {
        b63 b63 = new b63(ds5, (Continuation) null, function0, function3, bs5Arr);
        dgd dgd = new dgd(continuation, continuation.getContext());
        Object W = bs0.W(dgd, dgd, b63);
        if (W == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return W == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? W : Unit.INSTANCE;
    }

    public static final rp6 i(ue1 ue1, boolean z) {
        try {
            return tf6.l(ue1, new JSONObject().put("sdk", (Object) new JSONObject().put("type", (Object) "bad-net").put("value", z)));
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static CameraDevice.StateCallback j(ArrayList arrayList) {
        return arrayList.isEmpty() ? new CameraDevice.StateCallback() : arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new gu1(arrayList);
    }

    public static final double k(double d2, double d3, double d4, double d5) {
        return Math.sqrt(Math.pow(d3 - d5, 2.0d) + Math.pow(d2 - d4, 2.0d));
    }

    public static void l(View view, bi7 bi7) {
        ci7 ci7 = new ci7(bi7, new mbg(view), new tag(view), false, view);
        WeakHashMap weakHashMap = gag.a;
        v9g.u(view, ci7);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new di7(0));
        }
    }

    public static String m(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static float[] n(RectF rectF) {
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        return new float[]{f2, f3, f4, f3, f4, f5, f2, f5};
    }

    public static HashMap o() {
        HashMap hashMap = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        hashMap.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList n = g63.n(36, hashMap, g63.n(34, hashMap, g63.n(33, hashMap, g63.n(32, hashMap, g63.n(31, hashMap, g63.n(30, hashMap, g63.n(27, hashMap, g63.n(20, hashMap, g63.n(7, hashMap, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        n.add("VA");
        hashMap.put(39, n);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList n2 = g63.n(43, hashMap, g63.n(41, hashMap, g63.n(40, hashMap, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        n2.add("GG");
        n2.add("IM");
        n2.add("JE");
        hashMap.put(44, n2);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList n3 = g63.n(46, hashMap, g63.n(45, hashMap, arrayList4, 1, "SE"), 2, "NO");
        n3.add("SJ");
        hashMap.put(47, n3);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList n4 = g63.n(60, hashMap, g63.n(58, hashMap, g63.n(57, hashMap, g63.n(56, hashMap, g63.n(55, hashMap, g63.n(54, hashMap, g63.n(53, hashMap, g63.n(52, hashMap, g63.n(51, hashMap, g63.n(49, hashMap, g63.n(48, hashMap, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        n4.add("CC");
        n4.add("CX");
        hashMap.put(61, n4);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList n5 = g63.n(211, hashMap, g63.n(98, hashMap, g63.n(95, hashMap, g63.n(94, hashMap, g63.n(93, hashMap, g63.n(92, hashMap, g63.n(91, hashMap, g63.n(90, hashMap, g63.n(86, hashMap, g63.n(84, hashMap, g63.n(82, hashMap, g63.n(81, hashMap, g63.n(66, hashMap, g63.n(65, hashMap, g63.n(64, hashMap, g63.n(63, hashMap, g63.n(62, hashMap, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        n5.add("EH");
        hashMap.put(212, n5);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList n6 = g63.n(261, hashMap, g63.n(260, hashMap, g63.n(258, hashMap, g63.n(257, hashMap, g63.n(256, hashMap, g63.n(KotlinVersion.MAX_COMPONENT_VALUE, hashMap, g63.n(254, hashMap, g63.n(253, hashMap, g63.n(252, hashMap, g63.n(251, hashMap, g63.n(250, hashMap, g63.n(249, hashMap, g63.n(248, hashMap, g63.n(247, hashMap, g63.n(246, hashMap, g63.n(245, hashMap, g63.n(244, hashMap, g63.n(243, hashMap, g63.n(242, hashMap, g63.n(241, hashMap, g63.n(240, hashMap, g63.n(239, hashMap, g63.n(238, hashMap, g63.n(237, hashMap, g63.n(236, hashMap, g63.n(235, hashMap, g63.n(234, hashMap, g63.n(233, hashMap, g63.n(232, hashMap, g63.n(231, hashMap, g63.n(230, hashMap, g63.n(229, hashMap, g63.n(228, hashMap, g63.n(227, hashMap, g63.n(226, hashMap, g63.n(225, hashMap, g63.n(224, hashMap, g63.n(223, hashMap, g63.n(222, hashMap, g63.n(221, hashMap, g63.n(220, hashMap, g63.n(218, hashMap, g63.n(216, hashMap, g63.n(213, hashMap, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        n6.add("YT");
        hashMap.put(262, n6);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList n7 = g63.n(269, hashMap, g63.n(268, hashMap, g63.n(267, hashMap, g63.n(266, hashMap, g63.n(265, hashMap, g63.n(264, hashMap, g63.n(263, hashMap, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        n7.add("TA");
        hashMap.put(290, n7);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList n8 = g63.n(357, hashMap, g63.n(356, hashMap, g63.n(355, hashMap, g63.n(354, hashMap, g63.n(353, hashMap, g63.n(352, hashMap, g63.n(351, hashMap, g63.n(350, hashMap, g63.n(299, hashMap, g63.n(298, hashMap, g63.n(297, hashMap, g63.n(291, hashMap, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        n8.add("AX");
        hashMap.put(358, n8);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList n9 = g63.n(509, hashMap, g63.n(508, hashMap, g63.n(HttpStatus.SC_INSUFFICIENT_STORAGE, hashMap, g63.n(506, hashMap, g63.n(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, hashMap, g63.n(HttpStatus.SC_GATEWAY_TIMEOUT, hashMap, g63.n(HttpStatus.SC_SERVICE_UNAVAILABLE, hashMap, g63.n(HttpStatus.SC_BAD_GATEWAY, hashMap, g63.n(HttpStatus.SC_NOT_IMPLEMENTED, hashMap, g63.n(500, hashMap, g63.n(HttpStatus.SC_LOCKED, hashMap, g63.n(421, hashMap, g63.n(HttpStatus.SC_METHOD_FAILURE, hashMap, g63.n(389, hashMap, g63.n(387, hashMap, g63.n(386, hashMap, g63.n(385, hashMap, g63.n(383, hashMap, g63.n(382, hashMap, g63.n(381, hashMap, g63.n(380, hashMap, g63.n(378, hashMap, g63.n(377, hashMap, g63.n(376, hashMap, g63.n(375, hashMap, g63.n(374, hashMap, g63.n(373, hashMap, g63.n(372, hashMap, g63.n(371, hashMap, g63.n(370, hashMap, g63.n(359, hashMap, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        n9.add("BL");
        n9.add("MF");
        hashMap.put(590, n9);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList n10 = g63.n(598, hashMap, g63.n(597, hashMap, g63.n(596, hashMap, g63.n(595, hashMap, g63.n(594, hashMap, g63.n(593, hashMap, g63.n(592, hashMap, g63.n(591, hashMap, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        n10.add("BQ");
        hashMap.put(599, n10);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        hashMap.put(998, g63.n(996, hashMap, g63.n(995, hashMap, g63.n(994, hashMap, g63.n(993, hashMap, g63.n(992, hashMap, g63.n(979, hashMap, g63.n(977, hashMap, g63.n(976, hashMap, g63.n(975, hashMap, g63.n(974, hashMap, g63.n(973, hashMap, g63.n(972, hashMap, g63.n(971, hashMap, g63.n(970, hashMap, g63.n(968, hashMap, g63.n(967, hashMap, g63.n(966, hashMap, g63.n(965, hashMap, g63.n(964, hashMap, g63.n(963, hashMap, g63.n(962, hashMap, g63.n(961, hashMap, g63.n(960, hashMap, g63.n(888, hashMap, g63.n(886, hashMap, g63.n(883, hashMap, g63.n(882, hashMap, g63.n(881, hashMap, g63.n(880, hashMap, g63.n(878, hashMap, g63.n(870, hashMap, g63.n(856, hashMap, g63.n(855, hashMap, g63.n(853, hashMap, g63.n(852, hashMap, g63.n(850, hashMap, g63.n(808, hashMap, g63.n(800, hashMap, g63.n(692, hashMap, g63.n(691, hashMap, g63.n(690, hashMap, g63.n(689, hashMap, g63.n(688, hashMap, g63.n(687, hashMap, g63.n(686, hashMap, g63.n(685, hashMap, g63.n(683, hashMap, g63.n(682, hashMap, g63.n(681, hashMap, g63.n(680, hashMap, g63.n(679, hashMap, g63.n(678, hashMap, g63.n(677, hashMap, g63.n(676, hashMap, g63.n(675, hashMap, g63.n(674, hashMap, g63.n(673, hashMap, g63.n(672, hashMap, g63.n(670, hashMap, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return hashMap;
    }

    public static final vu7 p(jv7 jv7) {
        return i8b.t(jv7.getLifecycle());
    }

    public static final iod r(Object obj) {
        if (obj != ae3.a) {
            return (iod) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final String s(scf scf, Context context) {
        int i;
        if (scf instanceof vi4) {
            i = qad.Y8;
        } else if (scf instanceof o84) {
            i = qad.X8;
        } else if (scf instanceof hu6) {
            i = qad.Z8;
        } else if (scf instanceof q09) {
            return scf.a;
        } else {
            if (!(scf instanceof l9a)) {
                return scf.a;
            }
            i = qad.a9;
        }
        return context.getString(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r11 = r10.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        r11 = r8.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void v(int r17, defpackage.tj3 r18, defpackage.l8c r19, boolean r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.m
            if (r3 == 0) goto L_0x000b
            return
        L_0x000b:
            boolean r3 = r0 instanceof defpackage.uj3
            if (r3 != 0) goto L_0x0024
            boolean r3 = r18.z()
            if (r3 == 0) goto L_0x0024
            boolean r3 = d(r18)
            if (r3 == 0) goto L_0x0024
            xl0 r3 = new xl0
            r4 = 0
            r3.<init>(r4)
            defpackage.uj3.V(r0, r1, r3)
        L_0x0024:
            r3 = 2
            aj3 r3 = r0.i(r3)
            r4 = 4
            aj3 r4 = r0.i(r4)
            int r5 = r3.d()
            int r6 = r4.d()
            java.util.HashSet r7 = r3.a
            r9 = 0
            if (r7 == 0) goto L_0x0103
            boolean r3 = r3.c
            if (r3 == 0) goto L_0x0103
            java.util.Iterator r3 = r7.iterator()
        L_0x0043:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0103
            java.lang.Object r7 = r3.next()
            aj3 r7 = (defpackage.aj3) r7
            tj3 r13 = r7.d
            int r14 = r17 + 1
            boolean r15 = d(r13)
            boolean r16 = r13.z()
            if (r16 == 0) goto L_0x0068
            if (r15 == 0) goto L_0x0068
            xl0 r8 = new xl0
            r10 = 0
            r8.<init>(r10)
            defpackage.uj3.V(r13, r1, r8)
        L_0x0068:
            aj3 r8 = r13.I
            aj3 r10 = r13.K
            if (r7 != r8) goto L_0x0076
            aj3 r11 = r10.f
            if (r11 == 0) goto L_0x0076
            boolean r11 = r11.c
            if (r11 != 0) goto L_0x0080
        L_0x0076:
            if (r7 != r10) goto L_0x0082
            aj3 r11 = r8.f
            if (r11 == 0) goto L_0x0082
            boolean r11 = r11.c
            if (r11 == 0) goto L_0x0082
        L_0x0080:
            r11 = 1
            goto L_0x0083
        L_0x0082:
            r11 = r9
        L_0x0083:
            int[] r12 = r13.p0
            r12 = r12[r9]
            r9 = 3
            if (r12 != r9) goto L_0x00be
            if (r15 == 0) goto L_0x008d
            goto L_0x00be
        L_0x008d:
            if (r12 != r9) goto L_0x00c4
            int r7 = r13.v
            if (r7 < 0) goto L_0x00c4
            int r7 = r13.u
            if (r7 < 0) goto L_0x00c4
            int r7 = r13.g0
            r8 = 8
            if (r7 == r8) goto L_0x00a8
            int r7 = r13.r
            if (r7 != 0) goto L_0x00c4
            float r7 = r13.W
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x00c4
        L_0x00a8:
            boolean r7 = r13.x()
            if (r7 != 0) goto L_0x00c4
            boolean r7 = r13.F
            if (r7 != 0) goto L_0x00c4
            if (r11 == 0) goto L_0x00c4
            boolean r7 = r13.x()
            if (r7 != 0) goto L_0x00c4
            M(r14, r0, r1, r13, r2)
            goto L_0x00c4
        L_0x00be:
            boolean r9 = r13.z()
            if (r9 == 0) goto L_0x00c7
        L_0x00c4:
            r9 = 0
            goto L_0x0043
        L_0x00c7:
            if (r7 != r8) goto L_0x00de
            aj3 r9 = r10.f
            if (r9 != 0) goto L_0x00de
            int r7 = r8.e()
            int r7 = r7 + r5
            int r8 = r13.q()
            int r8 = r8 + r7
            r13.J(r7, r8)
            v(r14, r13, r1, r2)
            goto L_0x00c4
        L_0x00de:
            if (r7 != r10) goto L_0x00f7
            aj3 r7 = r8.f
            if (r7 != 0) goto L_0x00f7
            int r7 = r10.e()
            int r7 = r5 - r7
            int r8 = r13.q()
            int r8 = r7 - r8
            r13.J(r8, r7)
            v(r14, r13, r1, r2)
            goto L_0x00c4
        L_0x00f7:
            if (r11 == 0) goto L_0x00c4
            boolean r7 = r13.x()
            if (r7 != 0) goto L_0x00c4
            L(r14, r13, r1, r2)
            goto L_0x00c4
        L_0x0103:
            boolean r3 = r0 instanceof defpackage.iv6
            if (r3 == 0) goto L_0x0108
            return
        L_0x0108:
            java.util.HashSet r3 = r4.a
            if (r3 == 0) goto L_0x01e3
            boolean r4 = r4.c
            if (r4 == 0) goto L_0x01e3
            java.util.Iterator r3 = r3.iterator()
        L_0x0114:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01e3
            java.lang.Object r4 = r3.next()
            aj3 r4 = (defpackage.aj3) r4
            tj3 r5 = r4.d
            r7 = 1
            int r8 = r17 + 1
            boolean r7 = d(r5)
            boolean r9 = r5.z()
            if (r9 == 0) goto L_0x013a
            if (r7 == 0) goto L_0x013a
            xl0 r9 = new xl0
            r10 = 0
            r9.<init>(r10)
            defpackage.uj3.V(r5, r1, r9)
        L_0x013a:
            aj3 r9 = r5.I
            aj3 r10 = r5.K
            if (r4 != r9) goto L_0x0148
            aj3 r11 = r10.f
            if (r11 == 0) goto L_0x0148
            boolean r11 = r11.c
            if (r11 != 0) goto L_0x0152
        L_0x0148:
            if (r4 != r10) goto L_0x0154
            aj3 r11 = r9.f
            if (r11 == 0) goto L_0x0154
            boolean r11 = r11.c
            if (r11 == 0) goto L_0x0154
        L_0x0152:
            r11 = 1
            goto L_0x0155
        L_0x0154:
            r11 = 0
        L_0x0155:
            int[] r12 = r5.p0
            r13 = 0
            r12 = r12[r13]
            r14 = 3
            if (r12 != r14) goto L_0x015f
            if (r7 == 0) goto L_0x0163
        L_0x015f:
            r7 = 8
            r12 = 0
            goto L_0x019c
        L_0x0163:
            if (r12 != r14) goto L_0x0199
            int r4 = r5.v
            if (r4 < 0) goto L_0x0199
            int r4 = r5.u
            if (r4 < 0) goto L_0x0199
            int r4 = r5.g0
            r7 = 8
            if (r4 == r7) goto L_0x0181
            int r4 = r5.r
            if (r4 != 0) goto L_0x017f
            float r4 = r5.W
            r12 = 0
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0114
            goto L_0x0182
        L_0x017f:
            r12 = 0
            goto L_0x0114
        L_0x0181:
            r12 = 0
        L_0x0182:
            boolean r4 = r5.x()
            if (r4 != 0) goto L_0x0114
            boolean r4 = r5.F
            if (r4 != 0) goto L_0x0114
            if (r11 == 0) goto L_0x0114
            boolean r4 = r5.x()
            if (r4 != 0) goto L_0x0114
            M(r8, r0, r1, r5, r2)
            goto L_0x0114
        L_0x0199:
            r7 = 8
            goto L_0x017f
        L_0x019c:
            boolean r15 = r5.z()
            if (r15 == 0) goto L_0x01a4
            goto L_0x0114
        L_0x01a4:
            if (r4 != r9) goto L_0x01bc
            aj3 r15 = r10.f
            if (r15 != 0) goto L_0x01bc
            int r4 = r9.e()
            int r4 = r4 + r6
            int r9 = r5.q()
            int r9 = r9 + r4
            r5.J(r4, r9)
            v(r8, r5, r1, r2)
            goto L_0x0114
        L_0x01bc:
            if (r4 != r10) goto L_0x01d6
            aj3 r4 = r9.f
            if (r4 != 0) goto L_0x01d6
            int r4 = r10.e()
            int r4 = r6 - r4
            int r9 = r5.q()
            int r9 = r4 - r9
            r5.J(r9, r4)
            v(r8, r5, r1, r2)
            goto L_0x0114
        L_0x01d6:
            if (r11 == 0) goto L_0x0114
            boolean r4 = r5.x()
            if (r4 != 0) goto L_0x0114
            L(r8, r5, r1, r2)
            goto L_0x0114
        L_0x01e3:
            r1 = 1
            r0.m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqc.v(int, tj3, l8c, boolean):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int w(java.lang.String r23) {
        /*
            r0 = 21
            r1 = 20
            r2 = 19
            r3 = 18
            r4 = 17
            r5 = 16
            r6 = 15
            r7 = 14
            r8 = 13
            r9 = 12
            r12 = 9
            r13 = 8
            r14 = 7
            r15 = 6
            r16 = 5
            r17 = 4
            r18 = 3
            r19 = 1
            r20 = 0
            r21 = -1
            if (r23 != 0) goto L_0x0029
            return r21
        L_0x0029:
            java.lang.String r11 = defpackage.vq9.l(r23)
            r11.getClass()
            int r22 = r11.hashCode()
            switch(r22) {
                case -2123537834: goto L_0x01ce;
                case -1662384011: goto L_0x01c1;
                case -1662384007: goto L_0x01b5;
                case -1662095187: goto L_0x01a8;
                case -1606874997: goto L_0x019b;
                case -1487656890: goto L_0x018e;
                case -1487464693: goto L_0x0182;
                case -1487464690: goto L_0x0176;
                case -1487394660: goto L_0x0169;
                case -1487018032: goto L_0x015c;
                case -1248337486: goto L_0x014e;
                case -1079884372: goto L_0x0140;
                case -1004728940: goto L_0x0133;
                case -879272239: goto L_0x0126;
                case -879258763: goto L_0x0119;
                case -387023398: goto L_0x010c;
                case -43467528: goto L_0x00ff;
                case 13915911: goto L_0x00f2;
                case 187078296: goto L_0x00e5;
                case 187078297: goto L_0x00d8;
                case 187078669: goto L_0x00cb;
                case 187090232: goto L_0x00be;
                case 187091926: goto L_0x00b0;
                case 187099443: goto L_0x00a3;
                case 1331848029: goto L_0x0096;
                case 1503095341: goto L_0x0089;
                case 1504578661: goto L_0x007c;
                case 1504619009: goto L_0x006f;
                case 1504824762: goto L_0x0062;
                case 1504831518: goto L_0x0055;
                case 1505118770: goto L_0x0048;
                case 2039520277: goto L_0x003b;
                default: goto L_0x0037;
            }
        L_0x0037:
            r10 = r21
            goto L_0x01da
        L_0x003b:
            java.lang.String r10 = "video/x-matroska"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0044
            goto L_0x0037
        L_0x0044:
            r10 = 31
            goto L_0x01da
        L_0x0048:
            java.lang.String r10 = "audio/webm"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0051
            goto L_0x0037
        L_0x0051:
            r10 = 30
            goto L_0x01da
        L_0x0055:
            java.lang.String r10 = "audio/mpeg"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x005e
            goto L_0x0037
        L_0x005e:
            r10 = 29
            goto L_0x01da
        L_0x0062:
            java.lang.String r10 = "audio/midi"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x006b
            goto L_0x0037
        L_0x006b:
            r10 = 28
            goto L_0x01da
        L_0x006f:
            java.lang.String r10 = "audio/flac"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0078
            goto L_0x0037
        L_0x0078:
            r10 = 27
            goto L_0x01da
        L_0x007c:
            java.lang.String r10 = "audio/eac3"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0085
            goto L_0x0037
        L_0x0085:
            r10 = 26
            goto L_0x01da
        L_0x0089:
            java.lang.String r10 = "audio/3gpp"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0092
            goto L_0x0037
        L_0x0092:
            r10 = 25
            goto L_0x01da
        L_0x0096:
            java.lang.String r10 = "video/mp4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x009f
            goto L_0x0037
        L_0x009f:
            r10 = 24
            goto L_0x01da
        L_0x00a3:
            java.lang.String r10 = "audio/wav"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ac
            goto L_0x0037
        L_0x00ac:
            r10 = 23
            goto L_0x01da
        L_0x00b0:
            java.lang.String r10 = "audio/ogg"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ba
            goto L_0x0037
        L_0x00ba:
            r10 = 22
            goto L_0x01da
        L_0x00be:
            java.lang.String r10 = "audio/mp4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00c8
            goto L_0x0037
        L_0x00c8:
            r10 = r0
            goto L_0x01da
        L_0x00cb:
            java.lang.String r10 = "audio/amr"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00d5
            goto L_0x0037
        L_0x00d5:
            r10 = r1
            goto L_0x01da
        L_0x00d8:
            java.lang.String r10 = "audio/ac4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00e2
            goto L_0x0037
        L_0x00e2:
            r10 = r2
            goto L_0x01da
        L_0x00e5:
            java.lang.String r10 = "audio/ac3"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ef
            goto L_0x0037
        L_0x00ef:
            r10 = r3
            goto L_0x01da
        L_0x00f2:
            java.lang.String r10 = "video/x-flv"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00fc
            goto L_0x0037
        L_0x00fc:
            r10 = r4
            goto L_0x01da
        L_0x00ff:
            java.lang.String r10 = "application/webm"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0109
            goto L_0x0037
        L_0x0109:
            r10 = r5
            goto L_0x01da
        L_0x010c:
            java.lang.String r10 = "audio/x-matroska"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0116
            goto L_0x0037
        L_0x0116:
            r10 = r6
            goto L_0x01da
        L_0x0119:
            java.lang.String r10 = "image/png"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0123
            goto L_0x0037
        L_0x0123:
            r10 = r7
            goto L_0x01da
        L_0x0126:
            java.lang.String r10 = "image/bmp"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0130
            goto L_0x0037
        L_0x0130:
            r10 = r8
            goto L_0x01da
        L_0x0133:
            java.lang.String r10 = "text/vtt"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x013d
            goto L_0x0037
        L_0x013d:
            r10 = r9
            goto L_0x01da
        L_0x0140:
            java.lang.String r10 = "video/x-msvideo"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x014a
            goto L_0x0037
        L_0x014a:
            r10 = 11
            goto L_0x01da
        L_0x014e:
            java.lang.String r10 = "application/mp4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0158
            goto L_0x0037
        L_0x0158:
            r10 = 10
            goto L_0x01da
        L_0x015c:
            java.lang.String r10 = "image/webp"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0166
            goto L_0x0037
        L_0x0166:
            r10 = r12
            goto L_0x01da
        L_0x0169:
            java.lang.String r10 = "image/jpeg"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0173
            goto L_0x0037
        L_0x0173:
            r10 = r13
            goto L_0x01da
        L_0x0176:
            java.lang.String r10 = "image/heif"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0180
            goto L_0x0037
        L_0x0180:
            r10 = r14
            goto L_0x01da
        L_0x0182:
            java.lang.String r10 = "image/heic"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x018c
            goto L_0x0037
        L_0x018c:
            r10 = r15
            goto L_0x01da
        L_0x018e:
            java.lang.String r10 = "image/avif"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0198
            goto L_0x0037
        L_0x0198:
            r10 = r16
            goto L_0x01da
        L_0x019b:
            java.lang.String r10 = "audio/amr-wb"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01a5
            goto L_0x0037
        L_0x01a5:
            r10 = r17
            goto L_0x01da
        L_0x01a8:
            java.lang.String r10 = "video/webm"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01b2
            goto L_0x0037
        L_0x01b2:
            r10 = r18
            goto L_0x01da
        L_0x01b5:
            java.lang.String r10 = "video/mp2t"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01bf
            goto L_0x0037
        L_0x01bf:
            r10 = 2
            goto L_0x01da
        L_0x01c1:
            java.lang.String r10 = "video/mp2p"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01cb
            goto L_0x0037
        L_0x01cb:
            r10 = r19
            goto L_0x01da
        L_0x01ce:
            java.lang.String r10 = "audio/eac3-joc"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01d8
            goto L_0x0037
        L_0x01d8:
            r10 = r20
        L_0x01da:
            switch(r10) {
                case 0: goto L_0x01f6;
                case 1: goto L_0x01f3;
                case 2: goto L_0x01f0;
                case 3: goto L_0x01ef;
                case 4: goto L_0x01ee;
                case 5: goto L_0x01ed;
                case 6: goto L_0x01ec;
                case 7: goto L_0x01ec;
                case 8: goto L_0x01eb;
                case 9: goto L_0x01ea;
                case 10: goto L_0x01e9;
                case 11: goto L_0x01e8;
                case 12: goto L_0x01e7;
                case 13: goto L_0x01e6;
                case 14: goto L_0x01e5;
                case 15: goto L_0x01ef;
                case 16: goto L_0x01ef;
                case 17: goto L_0x01e4;
                case 18: goto L_0x01f6;
                case 19: goto L_0x01e3;
                case 20: goto L_0x01ee;
                case 21: goto L_0x01e9;
                case 22: goto L_0x01e2;
                case 23: goto L_0x01e1;
                case 24: goto L_0x01e9;
                case 25: goto L_0x01ee;
                case 26: goto L_0x01f6;
                case 27: goto L_0x01e0;
                case 28: goto L_0x01df;
                case 29: goto L_0x01de;
                case 30: goto L_0x01ef;
                case 31: goto L_0x01ef;
                default: goto L_0x01dd;
            }
        L_0x01dd:
            return r21
        L_0x01de:
            return r14
        L_0x01df:
            return r6
        L_0x01e0:
            return r17
        L_0x01e1:
            return r9
        L_0x01e2:
            return r12
        L_0x01e3:
            return r19
        L_0x01e4:
            return r16
        L_0x01e5:
            return r4
        L_0x01e6:
            return r2
        L_0x01e7:
            return r8
        L_0x01e8:
            return r5
        L_0x01e9:
            return r13
        L_0x01ea:
            return r3
        L_0x01eb:
            return r7
        L_0x01ec:
            return r1
        L_0x01ed:
            return r0
        L_0x01ee:
            return r18
        L_0x01ef:
            return r15
        L_0x01f0:
            r0 = 11
            return r0
        L_0x01f3:
            r0 = 10
            return r0
        L_0x01f6:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqc.w(java.lang.String):int");
    }

    public static int x(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final boolean y(Object obj) {
        return obj == ae3.a;
    }

    public static boolean z(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public abstract void D();

    public void E() {
    }

    public void F(View view, int i) {
    }

    public void G(int i) {
    }

    public void H(View view, int i, int i2, int i3) {
    }

    public abstract void I(View view, float f2, float f3);

    public abstract boolean Q(View view, int i);

    public abstract void R();

    public int f(View view, int i) {
        return 0;
    }

    public int g(View view, int i) {
        return 0;
    }

    public int q(int i) {
        return i;
    }

    public int t(View view) {
        return 0;
    }

    public int u(View view) {
        return 0;
    }
}
