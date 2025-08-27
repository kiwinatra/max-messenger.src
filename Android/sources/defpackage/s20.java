package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.attaches.fragments.FrgAttachUnknown;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;

/* renamed from: s20  reason: default package */
public final class s20 extends gq5 {
    public final c i;
    public final ArrayList j = new ArrayList();
    public final List k;
    public final Context l;
    public final boolean m;
    public final boolean n;
    public final HashMap o = new HashMap();
    public String p;
    public String q;

    public s20(ed6 ed6, List list, Context context, boolean z, boolean z2) {
        super(ed6);
        this.i = ed6;
        this.k = list;
        this.l = context;
        this.m = z;
        this.n = z2;
    }

    public final void a(ViewGroup viewGroup, int i2, Object obj) {
        super.a(viewGroup, i2, obj);
        v7b r = r(i2);
        if (r != null) {
            this.o.remove(((l20) r.a).q);
        }
    }

    public final int c() {
        return this.j.size();
    }

    public final int d(Object obj) {
        int indexOf;
        if (!(obj instanceof FrgAttachView) || (indexOf = this.j.indexOf(((FrgAttachView) obj).D1.q)) == -1) {
            return -2;
        }
        return indexOf;
    }

    public final a m(int i2) {
        a aVar;
        v7b r = r(i2);
        Object obj = r.a;
        l20 l20 = (l20) obj;
        boolean z = l20.s;
        Object obj2 = r.b;
        if (z || (l20.a != g20.c && !ld8.W(l20))) {
            l20 l202 = (l20) obj;
            if (l202.s || (l202.a != g20.o && !ld8.Y(l202))) {
                String b = l202.s ? fhf.b(ym.v, l202) : this.l.getString(qad.ga);
                FrgAttachUnknown frgAttachUnknown = new FrgAttachUnknown();
                Bundle i3 = FrgAttachView.i3(l202, (a89) obj2, false, false, false);
                i3.putString("ru.ok.tamtam.extra.TEXT", b);
                frgAttachUnknown.L2(i3);
                aVar = frgAttachUnknown;
            } else {
                boolean equals = TextUtils.equals(l202.q, this.q);
                if (equals) {
                    this.q = null;
                }
                Bundle i32 = FrgAttachView.i3(l202, (a89) obj2, false, l202.q.equals(this.p), false);
                i32.putBoolean("ru.ok.tamtam.extra.PLAY_AT_START", equals);
                aVar = new FrgAttachVideo();
                aVar.L2(i32);
            }
        } else {
            l20 l203 = (l20) obj;
            boolean equals2 = l203.q.equals(this.p);
            Bundle i33 = FrgAttachView.i3(l203, (a89) obj2, false, equals2, equals2 && this.m);
            aVar = new FrgAttachPhoto();
            aVar.L2(i33);
        }
        aVar.x.putBoolean("ru.ok.tamtam.extra.COMPAT_MODE", this.n);
        this.o.put(((l20) obj).q, new WeakReference(aVar));
        return aVar;
    }

    public final String n(int i2) {
        return (String) this.j.get(i2);
    }

    public final void o(Bundle bundle) {
        Bundle bundle2;
        l20 a;
        super.o(bundle);
        for (String str : bundle.keySet()) {
            if (!TextUtils.isEmpty(str) && str.startsWith("f")) {
                a H = this.i.H(str, bundle);
                if (!(!(H instanceof FrgAttachView) || (bundle2 = H.x) == null || (a = qe8.a(bundle2.getByteArray("ru.ok.tamtam.extra.PHOTO_ATTACH"))) == null)) {
                    this.o.put(a.q, new WeakReference((FrgAttachView) H));
                }
            }
        }
    }

    public final void p(List list, boolean z) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((a89) list.get(i2)).a.x0.G();
        }
        List<a89> list2 = this.k;
        if (z) {
            list2.addAll(list);
        } else {
            list2.addAll(0, list);
        }
        ArrayList arrayList = this.j;
        arrayList.clear();
        for (a89 a89 : list2) {
            for (int i3 = 0; i3 < a89.a.x0.G(); i3++) {
                arrayList.add(a89.a.x0.F(i3).q);
            }
        }
    }

    public final FrgAttachView q(String str) {
        WeakReference weakReference = (WeakReference) this.o.get(str);
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return (FrgAttachView) weakReference.get();
    }

    public final v7b r(int i2) {
        int i3 = 0;
        for (a89 a89 : this.k) {
            if (a89 != null) {
                ha9 ha9 = a89.a;
                if (!ha9.o()) {
                    continue;
                } else {
                    for (int i4 = 0; i4 < ha9.x0.G(); i4++) {
                        l20 F = ha9.x0.F(i4);
                        if (i3 == i2) {
                            if (F.g()) {
                                c20 c20 = F.g;
                                if (c20.b()) {
                                    F = c20.g;
                                }
                            }
                            return new v7b(F, a89);
                        }
                        i3++;
                    }
                    continue;
                }
            }
        }
        return null;
    }
}
