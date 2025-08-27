package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.ByteCompanionObject;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: y35  reason: default package */
public final class y35 implements vz7, rv, x51, qk3, ojb, hw1, kv3, v8, mj6 {
    public static final int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ y35(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        swd swd = (swd) obj;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 11:
                Throwable th = (Throwable) obj;
                kz1 kz1 = (kz1) this.b;
                z68.f(kz1.x, "onUploadFailed: failed", th);
                eef t = kz1.t();
                long j = kz1.b;
                t.d(j);
                kz1.B();
                kz1.A();
                kz1.u().c(new hj0(j, th instanceof TamErrorException ? ((TamErrorException) th).a : new qaf("internal-error", th.toString(), (String) null)));
                return;
            default:
                z68.f(((vj9) this.b).b, "postProcessText: failed", (Throwable) obj);
                return;
        }
    }

    public ClipData b() {
        return ((ContentInfo) this.b).getClip();
    }

    public void c(int i, int i2) {
        ((tyc) this.b).n(i, i2);
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int d() {
        /*
            r4 = this;
            java.lang.Object r4 = r4.b
            a61 r4 = (defpackage.a61) r4
            androidx.viewpager2.widget.ViewPager2 r4 = r4.H0
            int r0 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            r3 = 0
            if (r2 == 0) goto L_0x0016
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            r2 = 0
            if (r1 == 0) goto L_0x001d
            int r1 = r1.topMargin
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            int r0 = r0 - r1
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r1 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x002a
            r3 = r4
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
        L_0x002a:
            if (r3 == 0) goto L_0x002e
            int r2 = r3.bottomMargin
        L_0x002e:
            int r0 = r0 - r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y35.d():int");
    }

    public Uri e() {
        return ((ContentInfo) this.b).getLinkUri();
    }

    public void f(int i, int i2) {
        ((tyc) this.b).o(i, i2);
    }

    public void g(Throwable th) {
        i8b.W("custom command " + ((String) this.b) + " produced an error: " + th.getMessage(), th);
    }

    public Bundle getExtras() {
        return ((ContentInfo) this.b).getExtras();
    }

    public int getFlags() {
        return ((ContentInfo) this.b).getFlags();
    }

    public void h(int i, int i2) {
        ((tyc) this.b).q(i, i2);
    }

    public ContentInfo i() {
        return (ContentInfo) this.b;
    }

    public void j(Typeface typeface) {
        e53 e53 = (e53) this.b;
        if (e53.m(typeface)) {
            e53.i(false);
        }
    }

    public bs5 k(long j) {
        return bs0.L(new on2(((my2) ((qx2) ((Lazy) this.b).getValue())).o(j), 28), new bs2(j, (Continuation) null));
    }

    public int l() {
        return ((ContentInfo) this.b).getSource();
    }

    public void m(int i, int i2, Object obj) {
        ((tyc) this.b).a.d(i, i2, obj);
    }

    public void n(int i, boolean z) {
        vq5 vq5 = (vq5) this.b;
        if (z) {
            vq5.a(i);
        } else {
            vq5.getClass();
        }
    }

    public void o(int i, int i2, hf4 hf4) {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        hf4 hf42 = hf4;
        lh8 lh8 = (lh8) this.b;
        SparseArray sparseArray = lh8.c;
        int i9 = 4;
        int i10 = 0;
        int i11 = 1;
        if (i7 == 161 || i7 == 163) {
            int i12 = lh8.R0;
            l8b l8b = lh8.z;
            if (i12 == 0) {
                g1g g1g = lh8.b;
                lh8.X0 = (int) g1g.C(hf42, false, true, 8);
                lh8.Y0 = g1g.c;
                lh8.T0 = -9223372036854775807L;
                lh8.R0 = 1;
                l8b.D(0);
            }
            jh8 jh8 = (jh8) sparseArray.get(lh8.X0);
            if (jh8 == null) {
                hf42.z(i8 - lh8.Y0);
                lh8.R0 = 0;
                return;
            }
            jh8.Y.getClass();
            if (lh8.R0 == 1) {
                lh8.f(hf42, 3);
                int i13 = (l8b.a[2] & 6) >> 1;
                if (i13 == 0) {
                    lh8.V0 = 1;
                    int[] iArr = lh8.W0;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    lh8.W0 = iArr;
                    iArr[0] = (i8 - lh8.Y0) - 3;
                } else {
                    lh8.f(hf42, 4);
                    int i14 = (l8b.a[3] & UByte.MAX_VALUE) + 1;
                    lh8.V0 = i14;
                    int[] iArr2 = lh8.W0;
                    if (iArr2 == null) {
                        iArr2 = new int[i14];
                    } else if (iArr2.length < i14) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i14)];
                    }
                    lh8.W0 = iArr2;
                    if (i13 == 2) {
                        int i15 = lh8.V0;
                        Arrays.fill(iArr2, 0, i15, ((i8 - lh8.Y0) - 4) / i15);
                    } else if (i13 == 1) {
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i4 = lh8.V0 - 1;
                            if (i16 >= i4) {
                                break;
                            }
                            lh8.W0[i16] = 0;
                            while (true) {
                                i5 = i9 + 1;
                                lh8.f(hf42, i5);
                                byte b2 = l8b.a[i9] & UByte.MAX_VALUE;
                                int[] iArr3 = lh8.W0;
                                i6 = iArr3[i16] + b2;
                                iArr3[i16] = i6;
                                if (b2 != 255) {
                                    break;
                                }
                                i9 = i5;
                            }
                            i17 += i6;
                            i16++;
                            i9 = i5;
                        }
                        lh8.W0[i4] = ((i8 - lh8.Y0) - i9) - i17;
                    } else if (i13 == 3) {
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            int i20 = lh8.V0 - i11;
                            if (i18 >= i20) {
                                lh8.W0[i20] = ((i8 - lh8.Y0) - i9) - i19;
                                break;
                            }
                            lh8.W0[i18] = i10;
                            int i21 = i9 + 1;
                            lh8.f(hf42, i21);
                            if (l8b.a[i9] != 0) {
                                int i22 = i10;
                                int i23 = 8;
                                while (true) {
                                    if (i22 >= i23) {
                                        j = 0;
                                        i9 = i21;
                                        break;
                                    }
                                    int i24 = i11 << (7 - i22);
                                    if ((l8b.a[i9] & i24) != 0) {
                                        int i25 = i21 + i22;
                                        lh8.f(hf42, i25);
                                        j = (long) (l8b.a[i9] & UByte.MAX_VALUE & (~i24));
                                        while (i21 < i25) {
                                            j = (j << 8) | ((long) (l8b.a[i21] & UByte.MAX_VALUE));
                                            i21++;
                                            i25 = i25;
                                        }
                                        int i26 = i25;
                                        if (i18 > 0) {
                                            j -= (1 << ((i22 * 7) + 6)) - 1;
                                        }
                                        i9 = i26;
                                    } else {
                                        i22++;
                                        i23 = 8;
                                        i11 = 1;
                                    }
                                }
                                if (j >= -2147483648L && j <= 2147483647L) {
                                    int i27 = (int) j;
                                    int[] iArr4 = lh8.W0;
                                    if (i18 != 0) {
                                        i27 += iArr4[i18 - 1];
                                    }
                                    iArr4[i18] = i27;
                                    i19 += i27;
                                    i18++;
                                    i10 = 0;
                                    i11 = 1;
                                }
                            } else {
                                throw ParserException.a("No valid varint length mask found", (RuntimeException) null);
                            }
                        }
                        throw ParserException.a("EBML lacing sample size out of range.", (RuntimeException) null);
                    } else {
                        throw ParserException.a("Unexpected lacing value: " + i13, (RuntimeException) null);
                    }
                }
                byte[] bArr = l8b.a;
                lh8.S0 = lh8.i((long) ((bArr[1] & UByte.MAX_VALUE) | (bArr[0] << 8))) + lh8.M0;
                lh8.Z0 = (jh8.d == 2 || (i7 == 163 && (l8b.a[2] & ByteCompanionObject.MIN_VALUE) == 128)) ? 1 : 0;
                lh8.R0 = 2;
                lh8.U0 = 0;
                i3 = 163;
            } else {
                i3 = 163;
            }
            if (i7 == i3) {
                while (true) {
                    int i28 = lh8.U0;
                    if (i28 < lh8.V0) {
                        lh8.c(jh8, lh8.S0 + ((long) ((lh8.U0 * jh8.e) / 1000)), lh8.Z0, lh8.j(hf42, jh8, lh8.W0[i28], false), 0);
                        lh8.U0++;
                    } else {
                        lh8.R0 = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i29 = lh8.U0;
                    if (i29 < lh8.V0) {
                        int[] iArr5 = lh8.W0;
                        iArr5[i29] = lh8.j(hf42, jh8, iArr5[i29], true);
                        lh8.U0++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i7 != 165) {
            if (i7 == 16877) {
                lh8.b(i7);
                jh8 jh82 = lh8.F0;
                int i30 = jh82.g;
                if (i30 == 1685485123 || i30 == 1685480259) {
                    byte[] bArr2 = new byte[i8];
                    jh82.O = bArr2;
                    hf42.j(bArr2, 0, i8, false);
                    return;
                }
                hf42.z(i8);
            } else if (i7 == 16981) {
                lh8.b(i7);
                jh8 jh83 = lh8.F0;
                byte[] bArr3 = new byte[i8];
                jh83.i = bArr3;
                hf42.j(bArr3, 0, i8, false);
            } else if (i7 == 18402) {
                byte[] bArr4 = new byte[i8];
                hf42.j(bArr4, 0, i8, false);
                lh8.b(i7);
                lh8.F0.j = new xpf(1, 0, 0, bArr4);
            } else if (i7 == 21419) {
                l8b l8b2 = lh8.Y;
                Arrays.fill(l8b2.a, (byte) 0);
                hf42.j(l8b2.a, 4 - i8, i8, false);
                l8b2.G(0);
                lh8.H0 = (int) l8b2.w();
            } else if (i7 == 25506) {
                lh8.b(i7);
                jh8 jh84 = lh8.F0;
                byte[] bArr5 = new byte[i8];
                jh84.k = bArr5;
                hf42.j(bArr5, 0, i8, false);
            } else if (i7 == 30322) {
                lh8.b(i7);
                jh8 jh85 = lh8.F0;
                byte[] bArr6 = new byte[i8];
                jh85.w = bArr6;
                hf42.j(bArr6, 0, i8, false);
            } else {
                throw ParserException.a("Unexpected id: " + i7, (RuntimeException) null);
            }
        } else if (lh8.R0 == 2) {
            jh8 jh86 = (jh8) sparseArray.get(lh8.X0);
            if (lh8.a1 != 4 || !"V_VP9".equals(jh86.b)) {
                hf42.z(i8);
                return;
            }
            l8b l8b3 = lh8.y0;
            l8b3.D(i8);
            hf42.j(l8b3.a, 0, i8, false);
        }
    }

    public void onActivityResult(Object obj) {
        a c2;
        u8 u8Var = (u8) obj;
        c cVar = (c) this.b;
        zc6 zc6 = (zc6) cVar.G.pollFirst();
        if (zc6 != null && (c2 = cVar.c.c(zc6.a)) != null) {
            c2.f2(zc6.b, u8Var.a, u8Var.b);
        }
    }

    public void p(int i, long j) {
        lh8 lh8 = (lh8) this.b;
        lh8.getClass();
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        lh8.b(i);
                        lh8.F0.d = (int) j;
                        return;
                    case 136:
                        lh8.b(i);
                        jh8 jh8 = lh8.F0;
                        if (j == 1) {
                            z = true;
                        }
                        jh8.W = z;
                        return;
                    case 155:
                        lh8.T0 = lh8.i(j);
                        return;
                    case 159:
                        lh8.b(i);
                        lh8.F0.P = (int) j;
                        return;
                    case 176:
                        lh8.b(i);
                        lh8.F0.m = (int) j;
                        return;
                    case 179:
                        lh8.a(i);
                        lh8.N0.a(lh8.i(j));
                        return;
                    case 186:
                        lh8.b(i);
                        lh8.F0.n = (int) j;
                        return;
                    case 215:
                        lh8.b(i);
                        lh8.F0.c = (int) j;
                        return;
                    case 231:
                        lh8.M0 = lh8.i(j);
                        return;
                    case 238:
                        lh8.a1 = (int) j;
                        return;
                    case 241:
                        if (!lh8.P0) {
                            lh8.a(i);
                            lh8.O0.a(j);
                            lh8.P0 = true;
                            return;
                        }
                        return;
                    case 251:
                        lh8.b1 = true;
                        return;
                    case 16871:
                        lh8.b(i);
                        lh8.F0.g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw ParserException.a("ContentCompAlgo " + j + " not supported", (RuntimeException) null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw ParserException.a("DocTypeReadVersion " + j + " not supported", (RuntimeException) null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw ParserException.a("EBMLReadVersion " + j + " not supported", (RuntimeException) null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw ParserException.a("ContentEncAlgo " + j + " not supported", (RuntimeException) null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw ParserException.a("AESSettingsCipherMode " + j + " not supported", (RuntimeException) null);
                        }
                        return;
                    case 21420:
                        lh8.I0 = j + lh8.B0;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        lh8.b(i);
                        if (i2 == 0) {
                            lh8.F0.x = 0;
                            return;
                        } else if (i2 == 1) {
                            lh8.F0.x = 2;
                            return;
                        } else if (i2 == 3) {
                            lh8.F0.x = 1;
                            return;
                        } else if (i2 == 15) {
                            lh8.F0.x = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        lh8.b(i);
                        lh8.F0.p = (int) j;
                        return;
                    case 21682:
                        lh8.b(i);
                        lh8.F0.r = (int) j;
                        return;
                    case 21690:
                        lh8.b(i);
                        lh8.F0.q = (int) j;
                        return;
                    case 21930:
                        lh8.b(i);
                        jh8 jh82 = lh8.F0;
                        if (j == 1) {
                            z = true;
                        }
                        jh82.V = z;
                        return;
                    case 21938:
                        lh8.b(i);
                        jh8 jh83 = lh8.F0;
                        jh83.y = true;
                        jh83.o = (int) j;
                        return;
                    case 21998:
                        lh8.b(i);
                        lh8.F0.f = (int) j;
                        return;
                    case 22186:
                        lh8.b(i);
                        lh8.F0.S = j;
                        return;
                    case 22203:
                        lh8.b(i);
                        lh8.F0.T = j;
                        return;
                    case 25188:
                        lh8.b(i);
                        lh8.F0.Q = (int) j;
                        return;
                    case 30114:
                        lh8.c1 = j;
                        return;
                    case 30321:
                        lh8.b(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            lh8.F0.s = 0;
                            return;
                        } else if (i3 == 1) {
                            lh8.F0.s = 1;
                            return;
                        } else if (i3 == 2) {
                            lh8.F0.s = 2;
                            return;
                        } else if (i3 == 3) {
                            lh8.F0.s = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        lh8.b(i);
                        lh8.F0.e = (int) j;
                        return;
                    case 2807729:
                        lh8.C0 = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                lh8.b(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    lh8.F0.B = 2;
                                    return;
                                } else if (i4 == 2) {
                                    lh8.F0.B = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                lh8.b(i);
                                int i5 = m53.i((int) j);
                                if (i5 != -1) {
                                    lh8.F0.A = i5;
                                    return;
                                }
                                return;
                            case 21947:
                                lh8.b(i);
                                lh8.F0.y = true;
                                int h = m53.h((int) j);
                                if (h != -1) {
                                    lh8.F0.z = h;
                                    return;
                                }
                                return;
                            case 21948:
                                lh8.b(i);
                                lh8.F0.C = (int) j;
                                return;
                            case 21949:
                                lh8.b(i);
                                lh8.F0.D = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw ParserException.a("ContentEncodingScope " + j + " not supported", (RuntimeException) null);
            }
        } else if (j != 0) {
            throw ParserException.a("ContentEncodingOrder " + j + " not supported", (RuntimeException) null);
        }
    }

    public void q() {
        long j;
        o64 o64 = (o64) this.b;
        synchronized (fqc.d) {
            try {
                j = fqc.e ? fqc.f : -9223372036854775807L;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        o64.L = j;
        o64.y(true);
    }

    public rp9 r(gf4 gf4, o77 o77) {
        g1g g1g = (g1g) this.b;
        rp9 rp9 = null;
        int i = 0;
        while (true) {
            try {
                gf4.q(g1g.a, 0, 10, false);
                g1g.H(0);
                if (g1g.x() != 4801587) {
                    break;
                }
                g1g.I(3);
                int u = g1g.u();
                int i2 = u + 10;
                if (rp9 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(g1g.a, 0, bArr, 0, 10);
                    gf4.q(bArr, 10, u, false);
                    rp9 = new r77(o77).T(i2, bArr);
                } else {
                    gf4.a(u, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        gf4.w = 0;
        gf4.a(i, false);
        return rp9;
    }

    public Unit s(long j, List list) {
        ((sa3) ((ra3) this.b)).R(list);
        return Unit.INSTANCE;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, jh8] */
    public void t(int i, long j, long j2) {
        lh8 lh8 = (lh8) this.b;
        n79.o(lh8.m1);
        if (i == 160) {
            lh8.b1 = false;
            lh8.c1 = 0;
        } else if (i == 174) {
            ? obj = new Object();
            obj.m = -1;
            obj.n = -1;
            obj.o = -1;
            obj.p = -1;
            obj.q = -1;
            obj.r = 0;
            obj.s = -1;
            obj.t = c44.DEFAULT_ASPECT_RATIO;
            obj.u = c44.DEFAULT_ASPECT_RATIO;
            obj.v = c44.DEFAULT_ASPECT_RATIO;
            obj.w = null;
            obj.x = -1;
            obj.y = false;
            obj.z = -1;
            obj.A = -1;
            obj.B = -1;
            obj.C = 1000;
            obj.D = 200;
            obj.E = -1.0f;
            obj.F = -1.0f;
            obj.G = -1.0f;
            obj.H = -1.0f;
            obj.I = -1.0f;
            obj.J = -1.0f;
            obj.K = -1.0f;
            obj.L = -1.0f;
            obj.M = -1.0f;
            obj.N = -1.0f;
            obj.P = 1;
            obj.Q = -1;
            obj.R = 8000;
            obj.S = 0;
            obj.T = 0;
            obj.W = true;
            obj.X = "eng";
            lh8.F0 = obj;
        } else if (i == 187) {
            lh8.P0 = false;
        } else if (i == 19899) {
            lh8.H0 = -1;
            lh8.I0 = -1;
        } else if (i == 20533) {
            lh8.b(i);
            lh8.F0.h = true;
        } else if (i == 21968) {
            lh8.b(i);
            lh8.F0.y = true;
        } else if (i == 408125543) {
            long j3 = lh8.B0;
            if (j3 == -1 || j3 == j) {
                lh8.B0 = j;
                lh8.A0 = j2;
                return;
            }
            throw ParserException.a("Multiple Segment elements not supported", (RuntimeException) null);
        } else if (i == 475249515) {
            lh8.N0 = new pa8(1);
            lh8.O0 = new pa8(1);
        } else if (i != 524531317 || lh8.G0) {
        } else {
            if (!lh8.o || lh8.K0 == -1) {
                lh8.m1.M(new me0(lh8.E0));
                lh8.G0 = true;
                return;
            }
            lh8.J0 = true;
        }
    }

    public String toString() {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ y35(int i, boolean z) {
        this.a = i;
    }

    public y35(p67 p67) {
        this.a = 6;
        vzg.m(p67);
        this.b = p67;
    }

    public y35(Map map) {
        this.a = 19;
        this.b = map;
        map.size();
    }

    public y35(Context context) {
        this.a = 20;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setId(fza.a);
        oneMeDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        sp6 sp6 = (sp6) oneMeDraweeView.getHierarchy();
        int i = eza.a;
        ydd ydd = ydd.n;
        sp6.i(sp6.b.getDrawable(i), 1);
        vdd f = sp6.f(1);
        if (!hsg.k(f.v, ydd)) {
            f.v = ydd;
            f.w = null;
            f.p();
            f.invalidateSelf();
        }
        this.b = oneMeDraweeView;
    }

    public y35(Resources resources) {
        InputStream openRawResource;
        Throwable th;
        this.a = 0;
        Class<y35> cls = y35.class;
        z68.a(cls.getName(), "Create emoji tree from bin. Start");
        try {
            openRawResource = resources.openRawResource(qya.a);
            byte[] bArr = new byte[4];
            openRawResource.read(bArr);
            int i = 0;
            char c2 = 8;
            this.b = new long[((bArr[3] & UByte.MAX_VALUE) | (bArr[0] << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8))];
            byte[] bArr2 = new byte[(openRawResource.available() & -8)];
            int i2 = 0;
            while (true) {
                int read = openRawResource.read(bArr2);
                if (read != -1) {
                    int i3 = read / 8;
                    int i4 = i;
                    while (i4 < i3) {
                        int i5 = i4 * 8;
                        ((long[]) this.b)[i2 + i4] = ((((long) bArr2[i5 + 1]) & 255) << 48) | (((long) bArr2[i5]) << 56) | ((((long) bArr2[i5 + 2]) & 255) << 40) | ((((long) bArr2[i5 + 3]) & 255) << 32) | ((((long) bArr2[i5 + 4]) & 255) << 24) | ((((long) bArr2[i5 + 5]) & 255) << 16) | ((((long) bArr2[i5 + 6]) & 255) << 8) | (((long) bArr2[i5 + 7]) & 255);
                        i4++;
                        c2 = 8;
                    }
                    char c3 = c2;
                    i2 += i3;
                    i = 0;
                } else {
                    z68.a(cls.getName(), "Create emoji tree from bin. Finish. Size:" + ((long[]) this.b).length);
                    openRawResource.close();
                    return;
                }
            }
        } catch (IOException e) {
            z68.f(cls.getName(), "Can't create emoji tree from bin", e);
            throw e;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public y35(ContentInfo contentInfo) {
        this.a = 14;
        contentInfo.getClass();
        this.b = n30.m(contentInfo);
    }

    public y35(int i) {
        Object obj;
        this.a = i;
        switch (i) {
            case 5:
                this.b = new CopyOnWriteArrayList();
                return;
            case 10:
                pz9 c2 = pz9.c();
                this.b = c2;
                Object obj2 = null;
                try {
                    obj = c2.n(cdf.h0);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Class cls = (Class) obj;
                Class<uv1> cls2 = uv1.class;
                if (cls == null || cls.equals(cls2)) {
                    la0 la0 = cdf.h0;
                    pz9 pz9 = (pz9) this.b;
                    pz9.f(la0, cls2);
                    try {
                        obj2 = pz9.n(cdf.g0);
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (obj2 == null) {
                        pz9.f(cdf.g0, cls2.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            case 16:
                this.b = null;
                return;
            case 23:
                this.b = new g1g(10);
                return;
            case 25:
                Process.getStartElapsedRealtime();
                this.b = new ArrayDeque();
                return;
            default:
                this.b = new vq5(1);
                return;
        }
    }
}
