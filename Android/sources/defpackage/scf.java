package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: scf  reason: default package */
public class scf {
    public static final Lazy b0 = LazyKt.lazy(new dle(23));
    public static xhf c0;
    public static final xme d0;
    public static final etc e0;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final Integer W;
    public final Integer X;
    public final Integer Y;
    public final Integer Z;
    public final String a;
    public final Integer a0;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final x53 f;
    public final a93 g;
    public final ws0 h;
    public final ws0 i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    static {
        xme a2 = f6e.a((Object) null);
        d0 = a2;
        e0 = new etc(a2);
    }

    public scf(String str, String str2, boolean z2, int i2, String str3, x53 x53, a93 a93, ws0 ws0, ws0 ws02) {
        this.a = str;
        this.b = str2;
        this.c = z2;
        this.d = i2;
        this.e = str3;
        this.f = x53;
        this.g = a93;
        this.h = ws0;
        this.i = ws02;
        int i3 = x53.v;
        this.j = j4b.l0(0.15f, i3);
        this.k = z2 ? bnc.darkPopup : bnc.defaultPopup;
        this.l = x53.a;
        this.m = x53.b;
        this.n = x53.c;
        this.o = x53.e;
        this.p = x53.f;
        this.q = x53.Q;
        this.r = x53.R;
        this.s = x53.S;
        this.t = x53.h;
        this.u = x53.j;
        this.v = x53.k;
        this.w = x53.l;
        this.x = x53.m;
        this.y = x53.n;
        this.z = x53.o;
        this.A = x53.p;
        this.B = x53.q;
        this.C = x53.r;
        this.D = x53.s;
        this.E = x53.t;
        this.F = x53.u;
        this.G = i3;
        this.H = x53.w;
        this.I = x53.x;
        this.J = x53.y;
        this.K = x53.z;
        this.L = x53.A;
        this.M = x53.B;
        this.N = x53.C;
        this.O = x53.D;
        this.P = x53.E;
        this.Q = x53.F;
        this.R = x53.G;
        this.S = x53.H;
        this.T = x53.I;
        this.U = x53.J;
        this.V = x53.K;
        this.W = x53.L;
        this.X = x53.M;
        this.Y = x53.N;
        this.Z = x53.O;
        this.a0 = x53.P;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        kotlin.io.CloseableKt.closeFinally(r1, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.scf a(java.io.File r3) {
        /*
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r3)
            r1.<init>(r2, r0)
            java.lang.String r3 = r3.getPath()     // Catch:{ all -> 0x001d }
            java.lang.String r0 = kotlin.io.TextStreamsKt.readText(r1)     // Catch:{ all -> 0x001d }
            scf r3 = defpackage.h88.n(r0, r3)     // Catch:{ all -> 0x001d }
            r0 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r0)
            return r3
        L_0x001d:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001f }
        L_0x001f:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.scf.a(java.io.File):scf");
    }

    public static final boolean f(String str, boolean z2) {
        File file = new File(str);
        if (z2 && !file.isFile()) {
            return false;
        }
        if (!z2 || file.exists()) {
            return StringsKt__StringsJVMKt.endsWith$default(file.getName().toLowerCase(Locale.getDefault()), ".ttstyle", false, 2, (Object) null);
        }
        return false;
    }

    public static final scf g(Context context) {
        return j4b.k0(context);
    }

    public Uri b(Context context) {
        Uri.Builder scheme = new Uri.Builder().scheme("color");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return scheme.appendPath(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.y & 16777215)}, 1))).build();
    }

    public final ws0 c(boolean z2) {
        return z2 ? this.i : this.h;
    }

    public final RippleDrawable d() {
        return new RippleDrawable(ColorStateList.valueOf(this.j), (Drawable) null, (Drawable) null);
    }

    public final RippleDrawable e() {
        return i8b.H(0, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scf)) {
            return false;
        }
        scf scf = (scf) obj;
        if (Intrinsics.areEqual((Object) this.a, (Object) scf.a) && Intrinsics.areEqual((Object) this.b, (Object) scf.b) && this.c == scf.c && this.d == scf.d && Intrinsics.areEqual((Object) this.e, (Object) scf.e)) {
            return Intrinsics.areEqual((Object) this.f, (Object) scf.f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + g63.d((g63.e(g63.d(this.a.hashCode() * 31, 31, this.b), 31, this.c) + this.d) * 31, 31, this.e);
    }
}
