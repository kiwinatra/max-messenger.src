package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;

/* renamed from: gi3  reason: default package */
public final class gi3 {
    public static final String l = Integer.toString(0, 36);
    public static final String m = Integer.toString(1, 36);
    public static final String n = Integer.toString(2, 36);
    public static final String o = Integer.toString(9, 36);
    public static final String p = Integer.toString(3, 36);
    public static final String q = Integer.toString(4, 36);
    public static final String r = Integer.toString(5, 36);
    public static final String s = Integer.toString(6, 36);
    public static final String t = Integer.toString(11, 36);
    public static final String u = Integer.toString(7, 36);
    public static final String v = Integer.toString(8, 36);
    public static final String w = Integer.toString(10, 36);
    public final int a;
    public final int b;
    public final i67 c;
    public final PendingIntent d;
    public final zvd e;
    public final pob f;
    public final pob g;
    public final Bundle h;
    public final Bundle i;
    public final ppb j;
    public final tb7 k;

    static {
        int i2 = v0g.a;
    }

    public gi3(int i2, int i3, i67 i67, PendingIntent pendingIntent, tb7 tb7, zvd zvd, pob pob, pob pob2, Bundle bundle, Bundle bundle2, ppb ppb) {
        this.a = i2;
        this.b = i3;
        this.c = i67;
        this.d = pendingIntent;
        this.k = tb7;
        this.e = zvd;
        this.f = pob;
        this.g = pob2;
        this.h = bundle;
        this.i = bundle2;
        this.j = ppb;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [g67, java.lang.Object] */
    public static gi3 a(Bundle bundle) {
        k0d k0d;
        i67 i67;
        IBinder binder = bundle.getBinder(w);
        if (binder instanceof fi3) {
            return ((fi3) binder).c;
        }
        int i2 = bundle.getInt(l, 0);
        int i3 = bundle.getInt(v, 0);
        IBinder binder2 = bundle.getBinder(m);
        binder2.getClass();
        IBinder iBinder = binder2;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(n);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(o);
        if (parcelableArrayList != null) {
            qb7 o2 = tb7.o();
            for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i4);
                bundle2.getClass();
                o2.a(e63.b(i3, bundle2));
            }
            k0d = o2.j();
        } else {
            lx5 lx5 = tb7.b;
            k0d = k0d.v;
        }
        k0d k0d2 = k0d;
        Bundle bundle3 = bundle.getBundle(p);
        zvd b2 = bundle3 == null ? zvd.b : zvd.b(bundle3);
        Bundle bundle4 = bundle.getBundle(r);
        pob c2 = bundle4 == null ? pob.b : pob.c(bundle4);
        Bundle bundle5 = bundle.getBundle(q);
        pob c3 = bundle5 == null ? pob.b : pob.c(bundle5);
        Bundle bundle6 = bundle.getBundle(s);
        Bundle bundle7 = bundle.getBundle(t);
        Bundle bundle8 = bundle.getBundle(u);
        ppb r2 = bundle8 == null ? ppb.F : ppb.r(i3, bundle8);
        int i5 = hz8.i;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof i67)) {
            ? obj = new Object();
            obj.c = iBinder;
            i67 = obj;
        } else {
            i67 = (i67) queryLocalInterface;
        }
        return new gi3(i2, i3, i67, pendingIntent, k0d2, b2, c3, c2, bundle6 == null ? Bundle.EMPTY : bundle6, bundle7 == null ? Bundle.EMPTY : bundle7, r2);
    }

    public final Bundle b(int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt(l, this.a);
        bundle.putBinder(m, this.c.asBinder());
        bundle.putParcelable(n, this.d);
        tb7 tb7 = this.k;
        if (!tb7.isEmpty()) {
            bundle.putParcelableArrayList(o, ev0.G(tb7, new zb2(8)));
        }
        zvd zvd = this.e;
        zvd.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList arrayList = new ArrayList();
        wvf m2 = zvd.a.iterator();
        while (m2.hasNext()) {
            arrayList.add(((yvd) m2.next()).b());
        }
        bundle2.putParcelableArrayList(zvd.c, arrayList);
        bundle.putBundle(p, bundle2);
        pob pob = this.f;
        bundle.putBundle(q, pob.f());
        pob pob2 = this.g;
        bundle.putBundle(r, pob2.f());
        bundle.putBundle(s, this.h);
        bundle.putBundle(t, this.i);
        bundle.putBundle(u, this.j.q(kne.A(pob, pob2), false, false).t(i2));
        bundle.putInt(v, this.b);
        return bundle;
    }
}
