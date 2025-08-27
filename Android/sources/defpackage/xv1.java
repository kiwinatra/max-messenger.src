package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContentInfo;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.random.Random;
import one.me.calls.ui.view.mode.grid.CallGridLayoutManager;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.LangUtils;

/* renamed from: xv1  reason: default package */
public final class xv1 implements rv, b4d, x51, pf1, qk3, iv3, r15, v8, vu, i68 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ xv1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void A(String str, String str2) {
        ((HashMap) this.b).put(str, str2);
    }

    public void a(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 11:
                bxf bxf = (bxf) obj;
                kz1 kz1 = (kz1) this.b;
                kz1.getClass();
                if (bxf.a()) {
                    String str = bxf.h.a;
                    hud hud = kz1.a;
                    if (hud == null) {
                        hud = null;
                    }
                    long j = kz1.o;
                    a32 a32 = (a32) ((my2) ((qx2) hud.p0.getValue())).o(j).a.getValue();
                    if (a32 != null) {
                        np2 np2 = r2;
                        np2 np22 = new np2(a32.b.a, 0, (String) null, false, (String) null, (HashMap) null, (String) null, str, kz1.v, (Long) null, false, 0);
                        kc3 kc3 = kz1.y;
                        if (kc3 != null) {
                            fce U = ((jna) kz1.a()).U(np2, ((kbf) kz1.r()).a());
                            hud hud2 = kz1.a;
                            if (hud2 == null) {
                                hud2 = null;
                            }
                            gcf gcf = (gcf) hud2.o0.getValue();
                            gcf.getClass();
                            dx5 k = U.k(new ecf(gcf, 3, 0));
                            ao1 ao1 = new ao1(3, new vs6(10, (Object) kz1), new rt6(10, (Object) kz1));
                            k.l(ao1);
                            kc3.a(ao1);
                            return;
                        }
                        return;
                    }
                    z68.f(kz1.x, wj6.i(j, "updateChatAvatar: chat not found, chatId="), (Throwable) null);
                    kz1.A();
                    return;
                }
                return;
            default:
                z68.f(((ef9) this.b).c, "postProcessText: failed", (Throwable) obj);
                return;
        }
    }

    public zz7 apply(Object obj) {
        return hd8.E(((bj6) this.b).apply(obj));
    }

    public void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        try {
            ((yn0) this.b).a(bitmap);
        } finally {
            bitmap.recycle();
        }
    }

    public lv3 build() {
        return new lv3(new y35(((ContentInfo.Builder) this.b).build()));
    }

    public void c(ClipData clipData) {
        ((ContentInfo.Builder) this.b).setClip(clipData);
    }

    public int d() {
        return ((CallGridLayoutManager) this.b).M.getResources().getDisplayMetrics().heightPixels;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.PointF e() {
        /*
            r1 = this;
            java.lang.Object r1 = r1.b
            rf1 r1 = (defpackage.rf1) r1
            pf1 r0 = r1.getApplicationPipDepended()
            if (r0 == 0) goto L_0x0010
            android.graphics.PointF r0 = r0.e()
            if (r0 != 0) goto L_0x0018
        L_0x0010:
            android.content.Context r1 = r1.getContext()
            android.graphics.PointF r0 = defpackage.kne.y(r1)
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv1.e():android.graphics.PointF");
    }

    public void f() {
        try {
            ((qk3) this.b).accept(Boolean.TRUE);
        } catch (Throwable th) {
            z68.f("g68", "checkLocationSettingsAndPermissions", th);
        }
    }

    public void g(Exception exc) {
        try {
            ((qk3) this.b).accept(Boolean.FALSE);
        } catch (Throwable th) {
            z68.f("g68", "checkLocationSettingsAndPermissions", th);
        }
    }

    public void h(kv0 kv0) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new td3(0, "EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new ktg(this, kv0, threadPoolExecutor, 29));
    }

    public void i(String str, String str2, mm5 mm5) {
        ((ArrayList) this.b).add(new g57(str, str2, (String) mm5.b, mm5));
    }

    public void j(String str, String str2) {
        ((ArrayList) this.b).add(new g57(str, (String) null, (String) null, pf6.i(HTTP.PLAIN_TEXT_TYPE, str2)));
    }

    public void k(int i, int i2, gf4 gf4) {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        gf4 gf42 = gf4;
        kh8 kh8 = (kh8) this.b;
        SparseArray sparseArray = kh8.c;
        int i9 = 4;
        int i10 = 0;
        int i11 = 1;
        if (i7 == 161 || i7 == 163) {
            int i12 = kh8.G;
            g1g g1g = kh8.g;
            if (i12 == 0) {
                g1g g1g2 = kh8.b;
                kh8.M = (int) g1g2.B(gf42, false, true, 8);
                kh8.N = g1g2.c;
                kh8.I = -9223372036854775807L;
                kh8.G = 1;
                g1g.E(0);
            }
            ih8 ih8 = (ih8) sparseArray.get(kh8.M);
            if (ih8 == null) {
                gf42.z(i8 - kh8.N);
                kh8.G = 0;
                return;
            }
            ih8.X.getClass();
            if (kh8.G == 1) {
                kh8.f(gf42, 3);
                int i13 = (g1g.a[2] & 6) >> 1;
                if (i13 == 0) {
                    kh8.K = 1;
                    int[] iArr = kh8.L;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    kh8.L = iArr;
                    iArr[0] = (i8 - kh8.N) - 3;
                } else {
                    kh8.f(gf42, 4);
                    int i14 = (g1g.a[3] & UByte.MAX_VALUE) + 1;
                    kh8.K = i14;
                    int[] iArr2 = kh8.L;
                    if (iArr2 == null) {
                        iArr2 = new int[i14];
                    } else if (iArr2.length < i14) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i14)];
                    }
                    kh8.L = iArr2;
                    if (i13 == 2) {
                        int i15 = kh8.K;
                        Arrays.fill(iArr2, 0, i15, ((i8 - kh8.N) - 4) / i15);
                    } else if (i13 == 1) {
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i4 = kh8.K - 1;
                            if (i16 >= i4) {
                                break;
                            }
                            kh8.L[i16] = 0;
                            while (true) {
                                i5 = i9 + 1;
                                kh8.f(gf42, i5);
                                byte b2 = g1g.a[i9] & UByte.MAX_VALUE;
                                int[] iArr3 = kh8.L;
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
                        kh8.L[i4] = ((i8 - kh8.N) - i9) - i17;
                    } else if (i13 == 3) {
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            int i20 = kh8.K - i11;
                            if (i18 >= i20) {
                                kh8.L[i20] = ((i8 - kh8.N) - i9) - i19;
                                break;
                            }
                            kh8.L[i18] = i10;
                            int i21 = i9 + 1;
                            kh8.f(gf42, i21);
                            if (g1g.a[i9] != 0) {
                                int i22 = i10;
                                int i23 = 8;
                                while (true) {
                                    if (i22 >= i23) {
                                        j = 0;
                                        i9 = i21;
                                        break;
                                    }
                                    int i24 = i11 << (7 - i22);
                                    if ((g1g.a[i9] & i24) != 0) {
                                        int i25 = i21 + i22;
                                        kh8.f(gf42, i25);
                                        j = (long) (g1g.a[i9] & UByte.MAX_VALUE & (~i24));
                                        while (i21 < i25) {
                                            j = (j << 8) | ((long) (g1g.a[i21] & UByte.MAX_VALUE));
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
                                    int[] iArr4 = kh8.L;
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
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Unexpected lacing value: ");
                        sb.append(i13);
                        throw ParserException.a(sb.toString(), (RuntimeException) null);
                    }
                }
                byte[] bArr = g1g.a;
                kh8.H = kh8.k((long) ((bArr[1] & UByte.MAX_VALUE) | (bArr[0] << 8))) + kh8.B;
                kh8.O = (ih8.d == 2 || (i7 == 163 && (g1g.a[2] & ByteCompanionObject.MIN_VALUE) == 128)) ? 1 : 0;
                kh8.G = 2;
                kh8.J = 0;
                i3 = 163;
            } else {
                i3 = 163;
            }
            if (i7 == i3) {
                while (true) {
                    int i28 = kh8.J;
                    if (i28 < kh8.K) {
                        kh8.c(ih8, kh8.H + ((long) ((kh8.J * ih8.e) / 1000)), kh8.O, kh8.l(gf42, ih8, kh8.L[i28]), 0);
                        kh8.J++;
                    } else {
                        kh8.G = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i29 = kh8.J;
                    if (i29 < kh8.K) {
                        int[] iArr5 = kh8.L;
                        iArr5[i29] = kh8.l(gf42, ih8, iArr5[i29]);
                        kh8.J++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i7 != 165) {
            if (i7 == 16877) {
                kh8.b(i7);
                ih8 ih82 = kh8.u;
                int i30 = ih82.g;
                if (i30 == 1685485123 || i30 == 1685480259) {
                    byte[] bArr2 = new byte[i8];
                    ih82.N = bArr2;
                    gf42.j(bArr2, 0, i8, false);
                    return;
                }
                gf42.z(i8);
            } else if (i7 == 16981) {
                kh8.b(i7);
                ih8 ih83 = kh8.u;
                byte[] bArr3 = new byte[i8];
                ih83.i = bArr3;
                gf42.j(bArr3, 0, i8, false);
            } else if (i7 == 18402) {
                byte[] bArr4 = new byte[i8];
                gf42.j(bArr4, 0, i8, false);
                kh8.b(i7);
                kh8.u.j = new wpf(1, 0, 0, bArr4);
            } else if (i7 == 21419) {
                g1g g1g3 = kh8.i;
                Arrays.fill(g1g3.a, (byte) 0);
                gf42.j(g1g3.a, 4 - i8, i8, false);
                g1g3.H(0);
                kh8.w = (int) g1g3.w();
            } else if (i7 == 25506) {
                kh8.b(i7);
                ih8 ih84 = kh8.u;
                byte[] bArr5 = new byte[i8];
                ih84.k = bArr5;
                gf42.j(bArr5, 0, i8, false);
            } else if (i7 == 30322) {
                kh8.b(i7);
                ih8 ih85 = kh8.u;
                byte[] bArr6 = new byte[i8];
                ih85.v = bArr6;
                gf42.j(bArr6, 0, i8, false);
            } else {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unexpected id: ");
                sb2.append(i7);
                throw ParserException.a(sb2.toString(), (RuntimeException) null);
            }
        } else if (kh8.G == 2) {
            ih8 ih86 = (ih8) sparseArray.get(kh8.M);
            if (kh8.P != 4 || !"V_VP9".equals(ih86.b)) {
                gf42.z(i8);
                return;
            }
            g1g g1g4 = kh8.n;
            g1g4.E(i8);
            gf42.j(g1g4.a, 0, i8, false);
        }
    }

    public void l(float f, float f2) {
        rf1 rf1 = (rf1) this.b;
        pf1 applicationPipDepended = rf1.getApplicationPipDepended();
        if (applicationPipDepended != null) {
            applicationPipDepended.l(f, f2);
        }
        PointF pointF = rf1.v;
        pointF.x = f;
        pointF.y = f2;
    }

    public t64 m() {
        t64 t64 = new t64((Map) (HashMap) this.b);
        t64.f(t64);
        return t64;
    }

    public u05 n() {
        return new u05(String.format("------------%016x", Arrays.copyOf(new Object[]{Long.valueOf(Random.Default.nextLong())}, 1)), CollectionsKt.toList((ArrayList) this.b));
    }

    public up4 o(kp4 kp4) {
        ((sx6) this.b).getClass();
        int i = kp4.a;
        r2f r2f = kp4.c;
        String str = kp4.b;
        o9a o9a = kp4.h;
        ty4 ty4 = new ty4(i, r2f, str, o9a);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return new up4(ty4, kp4.g, new ap0(kp4.f, kp4.e, kp4.d), kp4.i, o9a, newSingleThreadExecutor);
    }

    public void onActivityResult(Object obj) {
        a c;
        u8 u8Var = (u8) obj;
        c cVar = (c) this.b;
        zc6 zc6 = (zc6) cVar.G.pollLast();
        if (zc6 != null && (c = cVar.c.c(zc6.a)) != null) {
            c.f2(zc6.b, u8Var.a, u8Var.b);
        }
    }

    public void p(int i, long j) {
        kh8 kh8 = (kh8) this.b;
        kh8.getClass();
        if (i != 20529) {
            if (i != 20530) {
                boolean z = true;
                int i2 = 3;
                switch (i) {
                    case 131:
                        kh8.b(i);
                        kh8.u.d = (int) j;
                        return;
                    case 136:
                        kh8.b(i);
                        ih8 ih8 = kh8.u;
                        if (j != 1) {
                            z = false;
                        }
                        ih8.V = z;
                        return;
                    case 155:
                        kh8.I = kh8.k(j);
                        return;
                    case 159:
                        kh8.b(i);
                        kh8.u.O = (int) j;
                        return;
                    case 176:
                        kh8.b(i);
                        kh8.u.m = (int) j;
                        return;
                    case 179:
                        kh8.a(i);
                        kh8.C.a(kh8.k(j));
                        return;
                    case 186:
                        kh8.b(i);
                        kh8.u.n = (int) j;
                        return;
                    case 215:
                        kh8.b(i);
                        kh8.u.c = (int) j;
                        return;
                    case 231:
                        kh8.B = kh8.k(j);
                        return;
                    case 238:
                        kh8.P = (int) j;
                        return;
                    case 241:
                        if (!kh8.E) {
                            kh8.a(i);
                            kh8.D.a(j);
                            kh8.E = true;
                            return;
                        }
                        return;
                    case 251:
                        kh8.Q = true;
                        return;
                    case 16871:
                        kh8.b(i);
                        kh8.u.g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw ParserException.a(sb.toString(), (RuntimeException) null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw ParserException.a(sb2.toString(), (RuntimeException) null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw ParserException.a(sb3.toString(), (RuntimeException) null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw ParserException.a(sb4.toString(), (RuntimeException) null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw ParserException.a(sb5.toString(), (RuntimeException) null);
                        }
                        return;
                    case 21420:
                        kh8.x = j + kh8.q;
                        return;
                    case 21432:
                        int i3 = (int) j;
                        kh8.b(i);
                        if (i3 == 0) {
                            kh8.u.w = 0;
                            return;
                        } else if (i3 == 1) {
                            kh8.u.w = 2;
                            return;
                        } else if (i3 == 3) {
                            kh8.u.w = 1;
                            return;
                        } else if (i3 == 15) {
                            kh8.u.w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        kh8.b(i);
                        kh8.u.o = (int) j;
                        return;
                    case 21682:
                        kh8.b(i);
                        kh8.u.q = (int) j;
                        return;
                    case 21690:
                        kh8.b(i);
                        kh8.u.p = (int) j;
                        return;
                    case 21930:
                        kh8.b(i);
                        ih8 ih82 = kh8.u;
                        if (j != 1) {
                            z = false;
                        }
                        ih82.U = z;
                        return;
                    case 21998:
                        kh8.b(i);
                        kh8.u.f = (int) j;
                        return;
                    case 22186:
                        kh8.b(i);
                        kh8.u.R = j;
                        return;
                    case 22203:
                        kh8.b(i);
                        kh8.u.S = j;
                        return;
                    case 25188:
                        kh8.b(i);
                        kh8.u.P = (int) j;
                        return;
                    case 30321:
                        kh8.b(i);
                        int i4 = (int) j;
                        if (i4 == 0) {
                            kh8.u.r = 0;
                            return;
                        } else if (i4 == 1) {
                            kh8.u.r = 1;
                            return;
                        } else if (i4 == 2) {
                            kh8.u.r = 2;
                            return;
                        } else if (i4 == 3) {
                            kh8.u.r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        kh8.b(i);
                        kh8.u.e = (int) j;
                        return;
                    case 2807729:
                        kh8.r = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                kh8.b(i);
                                int i5 = (int) j;
                                if (i5 == 1) {
                                    kh8.u.A = 2;
                                    return;
                                } else if (i5 == 2) {
                                    kh8.u.A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                kh8.b(i);
                                int i6 = (int) j;
                                if (i6 != 1) {
                                    if (i6 == 16) {
                                        i2 = 6;
                                    } else if (i6 == 18) {
                                        i2 = 7;
                                    } else if (!(i6 == 6 || i6 == 7)) {
                                        i2 = -1;
                                    }
                                }
                                if (i2 != -1) {
                                    kh8.u.z = i2;
                                    return;
                                }
                                return;
                            case 21947:
                                kh8.b(i);
                                kh8.u.x = true;
                                int a2 = l53.a((int) j);
                                if (a2 != -1) {
                                    kh8.u.y = a2;
                                    return;
                                }
                                return;
                            case 21948:
                                kh8.b(i);
                                kh8.u.B = (int) j;
                                return;
                            case 21949:
                                kh8.b(i);
                                kh8.u.C = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j);
                sb6.append(" not supported");
                throw ParserException.a(sb6.toString(), (RuntimeException) null);
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw ParserException.a(sb7.toString(), (RuntimeException) null);
        }
    }

    public void q() {
        zx3 zx3 = (zx3) this.b;
        zx3.viewIsAttached = true;
        zx3.viewWasDetached = false;
        zx3.attach(zx3.view);
    }

    public void r(boolean z) {
        zx3 zx3 = (zx3) this.b;
        zx3.viewIsAttached = false;
        zx3.viewWasDetached = true;
        if (!zx3.isDetachFrozen) {
            zx3.detach(zx3.view, false, z);
        }
    }

    public Unit s(long j, List list) {
        ((sa3) ((ra3) this.b)).R(list);
        return Unit.INSTANCE;
    }

    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public void setFlags(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    public void t(Object obj, boolean z) {
        qx0 qx0 = (qx0) obj;
        eud eud = (eud) this.b;
        synchronized (eud) {
            if (z) {
                try {
                    ((LinkedHashSet) eud.v).add(qx0);
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            } else {
                ((LinkedHashSet) eud.v).remove(qx0);
            }
        }
    }

    public void u() {
        long j;
        n64 n64 = (n64) this.b;
        synchronized (h88.f) {
            try {
                j = h88.g ? h88.h : -9223372036854775807L;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        n64.L = j;
        n64.s(true);
    }

    public void v() {
        zx3 zx3 = (zx3) this.b;
        if (!zx3.isDetachFrozen) {
            zx3.detach(zx3.view, false, false);
        }
    }

    public void w(Object obj, String str) {
        HashMap hashMap = (HashMap) this.b;
        if (obj == null) {
            hashMap.put(str, (Object) null);
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
            hashMap.put(str, obj);
            return;
        }
        int i = 0;
        if (cls == boolean[].class) {
            boolean[] zArr = (boolean[]) obj;
            t64 t64 = t64.b;
            Boolean[] boolArr = new Boolean[zArr.length];
            while (i < zArr.length) {
                boolArr[i] = Boolean.valueOf(zArr[i]);
                i++;
            }
            hashMap.put(str, boolArr);
        } else if (cls == byte[].class) {
            byte[] bArr = (byte[]) obj;
            t64 t642 = t64.b;
            Byte[] bArr2 = new Byte[bArr.length];
            while (i < bArr.length) {
                bArr2[i] = Byte.valueOf(bArr[i]);
                i++;
            }
            hashMap.put(str, bArr2);
        } else if (cls == int[].class) {
            int[] iArr = (int[]) obj;
            t64 t643 = t64.b;
            Integer[] numArr = new Integer[iArr.length];
            while (i < iArr.length) {
                numArr[i] = Integer.valueOf(iArr[i]);
                i++;
            }
            hashMap.put(str, numArr);
        } else if (cls == long[].class) {
            long[] jArr = (long[]) obj;
            t64 t644 = t64.b;
            Long[] lArr = new Long[jArr.length];
            while (i < jArr.length) {
                lArr[i] = Long.valueOf(jArr[i]);
                i++;
            }
            hashMap.put(str, lArr);
        } else if (cls == float[].class) {
            float[] fArr = (float[]) obj;
            t64 t645 = t64.b;
            Float[] fArr2 = new Float[fArr.length];
            while (i < fArr.length) {
                fArr2[i] = Float.valueOf(fArr[i]);
                i++;
            }
            hashMap.put(str, fArr2);
        } else if (cls == double[].class) {
            double[] dArr = (double[]) obj;
            t64 t646 = t64.b;
            Double[] dArr2 = new Double[dArr.length];
            while (i < dArr.length) {
                dArr2[i] = Double.valueOf(dArr[i]);
                i++;
            }
            hashMap.put(str, dArr2);
        } else {
            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
        }
    }

    public void x(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            w(entry.getValue(), (String) entry.getKey());
        }
    }

    public void y(String str, boolean z) {
        ((HashMap) this.b).put(str, Boolean.valueOf(z));
    }

    public void z(long j, String str) {
        ((HashMap) this.b).put(str, Long.valueOf(j));
    }

    public xv1(Context context) {
        this.a = 18;
        this.b = context.getApplicationContext();
    }

    public xv1(ClipData clipData, int i) {
        this.a = 13;
        this.b = n30.k(clipData, i);
    }

    public xv1(lv3 lv3) {
        this.a = 13;
        hv3.m();
        ContentInfo i = lv3.a.i();
        Objects.requireNonNull(i);
        this.b = hv3.j(n30.m(i));
    }

    public xv1(int i) {
        this.a = i;
        switch (i) {
            case LangUtils.HASH_SEED:
                return;
            case 23:
                this.b = new ArrayList();
                return;
            case 28:
                this.b = new CopyOnWriteArraySet();
                return;
            default:
                this.b = new HashMap();
                return;
        }
    }
}
