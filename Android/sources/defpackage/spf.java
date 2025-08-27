package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: spf  reason: default package */
public final class spf {
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public final int a;
    public final String b;
    public final int c;
    public final ea6[] d;
    public int e;

    static {
        int i = v0g.a;
    }

    public spf(String str, ea6... ea6Arr) {
        int i = 1;
        n79.g(ea6Arr.length > 0);
        this.b = str;
        this.d = ea6Arr;
        this.a = ea6Arr.length;
        int g2 = vq9.g(ea6Arr[0].n);
        this.c = g2 == -1 ? vq9.g(ea6Arr[0].m) : g2;
        String str2 = ea6Arr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i2 = ea6Arr[0].f | 16384;
        while (i < ea6Arr.length) {
            String str3 = ea6Arr[i].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                e("languages", i, ea6Arr[0].d, ea6Arr[i].d);
                return;
            } else if (i2 != (ea6Arr[i].f | 16384)) {
                e("role flags", i, Integer.toBinaryString(ea6Arr[0].f), Integer.toBinaryString(ea6Arr[i].f));
                return;
            } else {
                i++;
            }
        }
    }

    public static spf b(Bundle bundle) {
        k0d k0d;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f);
        if (parcelableArrayList == null) {
            lx5 lx5 = tb7.b;
            k0d = k0d.v;
        } else {
            k0d = ev0.m(new xff(7), parcelableArrayList);
        }
        return new spf(bundle.getString(g, ""), (ea6[]) k0d.toArray(new ea6[0]));
    }

    public static void e(String str, int i, String str2, String str3) {
        StringBuilder r = rae.r("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        r.append(str3);
        r.append("' (track ");
        r.append(i);
        r.append(")");
        i8b.p("", new IllegalStateException(r.toString()));
    }

    public final spf a(String str) {
        return new spf(str, this.d);
    }

    public final ea6 c() {
        return this.d[0];
    }

    public final int d(ea6 ea6) {
        int i = 0;
        while (true) {
            ea6[] ea6Arr = this.d;
            if (i >= ea6Arr.length) {
                return -1;
            }
            if (ea6 == ea6Arr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || spf.class != obj.getClass()) {
            return false;
        }
        spf spf = (spf) obj;
        return this.b.equals(spf.b) && Arrays.equals(this.d, spf.d);
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        ea6[] ea6Arr = this.d;
        ArrayList arrayList = new ArrayList(ea6Arr.length);
        for (ea6 d2 : ea6Arr) {
            arrayList.add(d2.d(true));
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + g63.d(527, 31, this.b);
        }
        return this.e;
    }
}
