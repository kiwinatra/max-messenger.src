package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* renamed from: ea6  reason: default package */
public final class ea6 {
    public static final ea6 M = new ba6().a();
    public static final String N = Integer.toString(0, 36);
    public static final String O = Integer.toString(1, 36);
    public static final String P = Integer.toString(2, 36);
    public static final String Q = Integer.toString(3, 36);
    public static final String R = Integer.toString(4, 36);
    public static final String S = Integer.toString(5, 36);
    public static final String T = Integer.toString(6, 36);
    public static final String U = Integer.toString(7, 36);
    public static final String V = Integer.toString(8, 36);
    public static final String W = Integer.toString(9, 36);
    public static final String X = Integer.toString(10, 36);
    public static final String Y = Integer.toString(11, 36);
    public static final String Z = Integer.toString(12, 36);
    public static final String a0 = Integer.toString(13, 36);
    public static final String b0 = Integer.toString(14, 36);
    public static final String c0 = Integer.toString(15, 36);
    public static final String d0 = Integer.toString(16, 36);
    public static final String e0 = Integer.toString(17, 36);
    public static final String f0 = Integer.toString(18, 36);
    public static final String g0 = Integer.toString(19, 36);
    public static final String h0 = Integer.toString(20, 36);
    public static final String i0 = Integer.toString(21, 36);
    public static final String j0 = Integer.toString(22, 36);
    public static final String k0 = Integer.toString(23, 36);
    public static final String l0 = Integer.toString(24, 36);
    public static final String m0 = Integer.toString(25, 36);
    public static final String n0 = Integer.toString(26, 36);
    public static final String o0 = Integer.toString(27, 36);
    public static final String p0 = Integer.toString(28, 36);
    public static final String q0 = Integer.toString(29, 36);
    public static final String r0 = Integer.toString(30, 36);
    public static final String s0 = Integer.toString(31, 36);
    public static final String t0 = Integer.toString(32, 36);
    public final m53 A;
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
    public int L;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final sp9 k;
    public final Object l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final yv4 r;
    public final long s;
    public final int t;
    public final int u;
    public final float v;
    public final int w;
    public final float x;
    public final byte[] y;
    public final int z;

    public ea6(ba6 ba6) {
        boolean z2;
        String str;
        this.a = ba6.a;
        String T2 = v0g.T(ba6.d);
        this.d = T2;
        int i2 = 0;
        if (ba6.c.isEmpty() && ba6.b != null) {
            this.c = tb7.t(new lr7(T2, ba6.b));
            this.b = ba6.b;
        } else if (ba6.c.isEmpty() || ba6.b != null) {
            if (!ba6.c.isEmpty() || ba6.b != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= ba6.c.size()) {
                        z2 = false;
                        break;
                    } else if (((lr7) ba6.c.get(i3)).b.equals(ba6.b)) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            z2 = true;
            n79.n(z2);
            this.c = ba6.c;
            this.b = ba6.b;
        } else {
            List list = ba6.c;
            this.c = list;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((lr7) list.get(0)).b;
                    break;
                }
                lr7 lr7 = (lr7) it.next();
                if (TextUtils.equals(lr7.a, T2)) {
                    str = lr7.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = ba6.e;
        this.f = ba6.f;
        int i4 = ba6.g;
        this.g = i4;
        int i5 = ba6.h;
        this.h = i5;
        this.i = i5 != -1 ? i5 : i4;
        this.j = ba6.i;
        this.k = ba6.j;
        this.l = ba6.k;
        this.m = ba6.l;
        this.n = ba6.m;
        this.o = ba6.n;
        this.p = ba6.o;
        List list2 = ba6.p;
        this.q = list2 == null ? Collections.emptyList() : list2;
        yv4 yv4 = ba6.q;
        this.r = yv4;
        this.s = ba6.r;
        this.t = ba6.s;
        this.u = ba6.t;
        this.v = ba6.u;
        int i6 = ba6.v;
        this.w = i6 == -1 ? 0 : i6;
        float f2 = ba6.w;
        this.x = f2 == -1.0f ? 1.0f : f2;
        this.y = ba6.x;
        this.z = ba6.y;
        this.A = ba6.z;
        this.B = ba6.A;
        this.C = ba6.B;
        this.D = ba6.C;
        int i7 = ba6.D;
        this.E = i7 == -1 ? 0 : i7;
        int i8 = ba6.E;
        this.F = i8 != -1 ? i8 : i2;
        this.G = ba6.F;
        this.H = ba6.G;
        this.I = ba6.H;
        this.J = ba6.I;
        int i9 = ba6.J;
        if (i9 != 0 || yv4 == null) {
            this.K = i9;
        } else {
            this.K = 1;
        }
    }

    public static String e(ea6 ea6) {
        String str;
        String str2;
        int i2;
        if (ea6 == null) {
            return "null";
        }
        StringBuilder o2 = tr1.o("id=");
        o2.append(ea6.a);
        o2.append(", mimeType=");
        o2.append(ea6.n);
        String str3 = ea6.m;
        if (str3 != null) {
            o2.append(", container=");
            o2.append(str3);
        }
        int i3 = ea6.i;
        if (i3 != -1) {
            o2.append(", bitrate=");
            o2.append(i3);
        }
        String str4 = ea6.j;
        if (str4 != null) {
            o2.append(", codecs=");
            o2.append(str4);
        }
        yv4 yv4 = ea6.r;
        if (yv4 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i4 = 0; i4 < yv4.o; i4++) {
                UUID uuid = yv4.a[i4].b;
                if (uuid.equals(zw0.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(zw0.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(zw0.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(zw0.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(zw0.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            o2.append(", drm=[");
            new kn5(String.valueOf(','), 2).a(o2, linkedHashSet.iterator());
            o2.append(']');
        }
        int i5 = ea6.t;
        if (!(i5 == -1 || (i2 = ea6.u) == -1)) {
            o2.append(", res=");
            o2.append(i5);
            o2.append("x");
            o2.append(i2);
        }
        m53 m53 = ea6.A;
        if (m53 != null) {
            int i6 = m53.f;
            int i7 = m53.e;
            if (!(i7 == -1 || i6 == -1) || m53.e()) {
                o2.append(", color=");
                if (m53.e()) {
                    String c2 = m53.c(m53.a);
                    String b2 = m53.b(m53.b);
                    String d2 = m53.d(m53.c);
                    int i8 = v0g.a;
                    Locale locale = Locale.US;
                    str = c2 + "/" + b2 + "/" + d2;
                } else {
                    str = "NA/NA/NA";
                }
                if (i7 == -1 || i6 == -1) {
                    str2 = "NA/NA";
                } else {
                    str2 = i7 + "/" + i6;
                }
                o2.append(str + "/" + str2);
            }
        }
        float f2 = ea6.v;
        if (f2 != -1.0f) {
            o2.append(", fps=");
            o2.append(f2);
        }
        int i9 = ea6.B;
        if (i9 != -1) {
            o2.append(", channels=");
            o2.append(i9);
        }
        int i10 = ea6.C;
        if (i10 != -1) {
            o2.append(", sample_rate=");
            o2.append(i10);
        }
        String str5 = ea6.d;
        if (str5 != null) {
            o2.append(", language=");
            o2.append(str5);
        }
        List list = ea6.c;
        if (!list.isEmpty()) {
            o2.append(", labels=[");
            new kn5(String.valueOf(','), 2).a(o2, list.iterator());
            o2.append("]");
        }
        int i11 = ea6.e;
        if (i11 != 0) {
            o2.append(", selectionFlags=[");
            kn5 kn5 = new kn5(String.valueOf(','), 2);
            int i12 = v0g.a;
            ArrayList arrayList = new ArrayList();
            if ((i11 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i11 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i11 & 2) != 0) {
                arrayList.add("forced");
            }
            kn5.a(o2, arrayList.iterator());
            o2.append("]");
        }
        int i13 = ea6.f;
        if (i13 != 0) {
            o2.append(", roleFlags=[");
            kn5 kn52 = new kn5(String.valueOf(','), 2);
            int i14 = v0g.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i13 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((2 & i13) != 0) {
                arrayList2.add("alt");
            }
            if ((i13 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i13 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i13 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i13 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i13 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i13 & Uuid.SIZE_BITS) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i13 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i13 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i13 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i13 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i13 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i13 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i13 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            kn52.a(o2, arrayList2.iterator());
            o2.append("]");
        }
        Object obj = ea6.l;
        if (obj != null) {
            o2.append(", customData=");
            o2.append(obj);
        }
        return o2.toString();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ba6, java.lang.Object] */
    public final ba6 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.j;
        obj.j = this.k;
        obj.k = this.l;
        obj.l = this.m;
        obj.m = this.n;
        obj.n = this.o;
        obj.o = this.p;
        obj.p = this.q;
        obj.q = this.r;
        obj.r = this.s;
        obj.s = this.t;
        obj.t = this.u;
        obj.u = this.v;
        obj.v = this.w;
        obj.w = this.x;
        obj.x = this.y;
        obj.y = this.z;
        obj.z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.C = this.D;
        obj.D = this.E;
        obj.E = this.F;
        obj.F = this.G;
        obj.G = this.H;
        obj.H = this.I;
        obj.I = this.J;
        obj.J = this.K;
        return obj;
    }

    public final int b() {
        int i2;
        int i3 = this.t;
        if (i3 == -1 || (i2 = this.u) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public final boolean c(ea6 ea6) {
        List list = this.q;
        if (list.size() != ea6.q.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals((byte[]) list.get(i2), (byte[]) ea6.q.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final Bundle d(boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putString(N, this.a);
        bundle.putString(O, this.b);
        List<lr7> list = this.c;
        ArrayList arrayList = new ArrayList(list.size());
        for (lr7 lr7 : list) {
            lr7.getClass();
            Bundle bundle2 = new Bundle();
            String str = lr7.a;
            if (str != null) {
                bundle2.putString(lr7.c, str);
            }
            bundle2.putString(lr7.d, lr7.b);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(t0, arrayList);
        bundle.putString(P, this.d);
        bundle.putInt(Q, this.e);
        bundle.putInt(R, this.f);
        bundle.putInt(S, this.g);
        bundle.putInt(T, this.h);
        bundle.putString(U, this.j);
        if (!z2) {
            bundle.putParcelable(V, this.k);
        }
        bundle.putString(W, this.m);
        bundle.putString(X, this.n);
        bundle.putInt(Y, this.o);
        int i2 = 0;
        while (true) {
            List list2 = this.q;
            if (i2 >= list2.size()) {
                break;
            }
            bundle.putByteArray(Z + "_" + Integer.toString(i2, 36), (byte[]) list2.get(i2));
            i2++;
        }
        bundle.putParcelable(a0, this.r);
        bundle.putLong(b0, this.s);
        bundle.putInt(c0, this.t);
        bundle.putInt(d0, this.u);
        bundle.putFloat(e0, this.v);
        bundle.putInt(f0, this.w);
        bundle.putFloat(g0, this.x);
        bundle.putByteArray(h0, this.y);
        bundle.putInt(i0, this.z);
        m53 m53 = this.A;
        if (m53 != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt(m53.j, m53.a);
            bundle3.putInt(m53.k, m53.b);
            bundle3.putInt(m53.l, m53.c);
            bundle3.putByteArray(m53.m, m53.d);
            bundle3.putInt(m53.n, m53.e);
            bundle3.putInt(m53.o, m53.f);
            bundle.putBundle(j0, bundle3);
        }
        bundle.putInt(k0, this.B);
        bundle.putInt(l0, this.C);
        bundle.putInt(m0, this.D);
        bundle.putInt(n0, this.E);
        bundle.putInt(o0, this.F);
        bundle.putInt(p0, this.G);
        bundle.putInt(r0, this.I);
        bundle.putInt(s0, this.J);
        bundle.putInt(q0, this.K);
        return bundle;
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj == null || ea6.class != obj.getClass()) {
            return false;
        }
        ea6 ea6 = (ea6) obj;
        int i3 = this.L;
        if (i3 == 0 || (i2 = ea6.L) == 0 || i3 == i2) {
            return this.e == ea6.e && this.f == ea6.f && this.g == ea6.g && this.h == ea6.h && this.o == ea6.o && this.s == ea6.s && this.t == ea6.t && this.u == ea6.u && this.w == ea6.w && this.z == ea6.z && this.B == ea6.B && this.C == ea6.C && this.D == ea6.D && this.E == ea6.E && this.F == ea6.F && this.G == ea6.G && this.I == ea6.I && this.J == ea6.J && this.K == ea6.K && Float.compare(this.v, ea6.v) == 0 && Float.compare(this.x, ea6.x) == 0 && Objects.equals(this.a, ea6.a) && Objects.equals(this.b, ea6.b) && this.c.equals(ea6.c) && Objects.equals(this.j, ea6.j) && Objects.equals(this.m, ea6.m) && Objects.equals(this.n, ea6.n) && Objects.equals(this.d, ea6.d) && Arrays.equals(this.y, ea6.y) && Objects.equals(this.k, ea6.k) && Objects.equals(this.A, ea6.A) && Objects.equals(this.r, ea6.r) && c(ea6) && Objects.equals(this.l, ea6.l);
        }
        return false;
    }

    public final ea6 f(ea6 ea6) {
        String str;
        float f2;
        String str2;
        int i2;
        int i3;
        ea6 ea62 = ea6;
        if (this == ea62) {
            return this;
        }
        int g2 = vq9.g(this.n);
        String str3 = ea62.a;
        String str4 = ea62.b;
        if (str4 == null) {
            str4 = this.b;
        }
        List list = ea62.c;
        if (list.isEmpty()) {
            list = this.c;
        }
        if (!(g2 == 3 || g2 == 1) || (str = ea62.d) == null) {
            str = this.d;
        }
        int i4 = this.g;
        if (i4 == -1) {
            i4 = ea62.g;
        }
        int i5 = this.h;
        if (i5 == -1) {
            i5 = ea62.h;
        }
        String str5 = this.j;
        if (str5 == null) {
            String v2 = v0g.v(g2, ea62.j);
            if (v0g.e0(v2).length == 1) {
                str5 = v2;
            }
        }
        sp9 sp9 = ea62.k;
        sp9 sp92 = this.k;
        if (sp92 != null) {
            sp9 = sp92.b(sp9);
        }
        float f3 = this.v;
        if (f3 == -1.0f && g2 == 2) {
            f3 = ea62.v;
        }
        int i6 = this.e | ea62.e;
        int i7 = this.f | ea62.f;
        ArrayList arrayList = new ArrayList();
        yv4 yv4 = ea62.r;
        if (yv4 != null) {
            wv4[] wv4Arr = yv4.a;
            int length = wv4Arr.length;
            f2 = f3;
            int i8 = 0;
            while (i8 < length) {
                int i9 = length;
                wv4 wv4 = wv4Arr[i8];
                wv4[] wv4Arr2 = wv4Arr;
                if (wv4.v != null) {
                    arrayList.add(wv4);
                }
                i8++;
                length = i9;
                wv4Arr = wv4Arr2;
            }
            str2 = yv4.c;
        } else {
            f2 = f3;
            str2 = null;
        }
        yv4 yv42 = this.r;
        if (yv42 != null) {
            if (str2 == null) {
                str2 = yv42.c;
            }
            int size = arrayList.size();
            wv4[] wv4Arr3 = yv42.a;
            int length2 = wv4Arr3.length;
            int i10 = 0;
            while (true) {
                String str6 = str2;
                if (i10 >= length2) {
                    break;
                }
                wv4 wv42 = wv4Arr3[i10];
                wv4[] wv4Arr4 = wv4Arr3;
                if (wv42.v != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            i2 = size;
                            i3 = length2;
                            arrayList.add(wv42);
                            break;
                        }
                        i2 = size;
                        i3 = length2;
                        if (((wv4) arrayList.get(i11)).b.equals(wv42.b)) {
                            break;
                        }
                        i11++;
                        length2 = i3;
                        size = i2;
                    }
                } else {
                    i2 = size;
                    i3 = length2;
                }
                i10++;
                str2 = str6;
                wv4Arr3 = wv4Arr4;
                length2 = i3;
                size = i2;
            }
        }
        yv4 yv43 = arrayList.isEmpty() ? null : new yv4(str2, arrayList);
        ba6 a2 = a();
        a2.a = str3;
        a2.b = str4;
        a2.c = tb7.p(list);
        a2.d = str;
        a2.e = i6;
        a2.f = i7;
        a2.g = i4;
        a2.h = i5;
        a2.i = str5;
        a2.j = sp9;
        a2.q = yv43;
        a2.u = f2;
        ea6 ea63 = ea6;
        a2.H = ea63.I;
        a2.I = ea63.J;
        return new ea6(a2);
    }

    public final int hashCode() {
        if (this.L == 0) {
            int i2 = 0;
            String str = this.a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
            String str4 = this.j;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            sp9 sp9 = this.k;
            int hashCode5 = (hashCode4 + (sp9 == null ? 0 : sp9.hashCode())) * 31;
            Object obj = this.l;
            int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.m;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            this.L = ((((((((((((((((((((Float.floatToIntBits(this.x) + ((((Float.floatToIntBits(this.v) + ((((((((((hashCode7 + i2) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.t) * 31) + this.u) * 31)) * 31) + this.w) * 31)) * 31) + this.z) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K;
        }
        return this.L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.t);
        sb.append(", ");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.A);
        sb.append("], [");
        sb.append(this.B);
        sb.append(", ");
        return wj6.l(sb, this.C, "])");
    }
}
