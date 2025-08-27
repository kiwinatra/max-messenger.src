package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.WorkRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.messages.media.mediabar.FrgLocalGif;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalPhoto;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* renamed from: it8  reason: default package */
public final class it8 extends tyc implements bne {
    public final xg0 X;
    public boolean Y;
    public boolean Z;
    public final ju7 o;
    public final c v;
    public final List v0;
    public final ya8 w = new ya8((Object) null);
    public final a48 w0;
    public final ya8 x = new ya8((Object) null);
    public final HashMap x0;
    public final ya8 y = new ya8((Object) null);
    public we8 z;

    /* JADX WARNING: type inference failed for: r1v3, types: [xg0, java.lang.Object] */
    public it8(b bVar, ArrayList arrayList, a48 a48) {
        ed6 v2 = bVar.v();
        ju7 lifecycle = bVar.getLifecycle();
        ? obj = new Object();
        obj.a = new CopyOnWriteArrayList();
        this.X = obj;
        this.Y = false;
        this.Z = false;
        this.v = v2;
        this.o = lifecycle;
        C(true);
        this.v0 = arrayList;
        this.w0 = a48;
        this.x0 = new HashMap();
    }

    public static void E(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public final boolean F(long j) {
        return j >= 0 && j < ((long) j());
    }

    public final void G() {
        ya8 ya8;
        ya8 ya82;
        a aVar;
        View W1;
        if (this.Z && !this.v.Q()) {
            ws wsVar = new ws(0);
            int i = 0;
            while (true) {
                ya8 = this.w;
                int k = ya8.k();
                ya82 = this.y;
                if (i >= k) {
                    break;
                }
                long h = ya8.h(i);
                if (!F(h)) {
                    wsVar.add(Long.valueOf(h));
                    ya82.j(h);
                }
                i++;
            }
            if (!this.Y) {
                this.Z = false;
                for (int i2 = 0; i2 < ya8.k(); i2++) {
                    long h2 = ya8.h(i2);
                    if (ya82.g(h2) < 0 && ((aVar = (a) ya8.f(h2)) == null || (W1 = aVar.W1()) == null || W1.getParent() == null)) {
                        wsVar.add(Long.valueOf(h2));
                    }
                }
            }
            ps psVar = new ps(wsVar);
            while (psVar.hasNext()) {
                K(((Long) psVar.next()).longValue());
            }
        }
    }

    public final FrgLocalMedia H(long j) {
        WeakReference weakReference = (WeakReference) this.x0.get(Long.valueOf(j));
        if (weakReference != null) {
            return (FrgLocalMedia) weakReference.get();
        }
        return null;
    }

    public final Long I(int i) {
        Long l = null;
        int i2 = 0;
        while (true) {
            ya8 ya8 = this.y;
            if (i2 >= ya8.k()) {
                return l;
            }
            if (((Integer) ya8.l(i2)).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(ya8.h(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
            i2++;
        }
    }

    public final void J(nd6 nd6) {
        a aVar = (a) this.w.f(nd6.v);
        if (aVar != null) {
            FrameLayout frameLayout = (FrameLayout) nd6.a;
            View W1 = aVar.W1();
            if (aVar.a2() || W1 == null) {
                boolean a2 = aVar.a2();
                c cVar = this.v;
                if (a2 && W1 == null) {
                    ((CopyOnWriteArrayList) cVar.o.b).add(new tc6(new g6d(this, aVar, frameLayout)));
                } else if (!aVar.a2() || W1.getParent() == null) {
                    if (aVar.a2()) {
                        E(W1, frameLayout);
                    } else if (!cVar.Q()) {
                        ((CopyOnWriteArrayList) cVar.o.b).add(new tc6(new g6d(this, aVar, frameLayout)));
                        xg0 xg0 = this.X;
                        xg0.getClass();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = xg0.a.iterator();
                        if (!it.hasNext()) {
                            try {
                                aVar.N2(false);
                                xe0 xe0 = new xe0(cVar);
                                xe0.h(0, aVar, "f" + nd6.v, 1);
                                xe0.l(aVar, iu7.o);
                                xe0.f();
                                this.z.f(false);
                            } finally {
                                xg0.a(arrayList);
                            }
                        } else {
                            rae.w(it.next());
                            throw null;
                        }
                    } else if (!cVar.K) {
                        this.o.a(new pg4(this, nd6, false, 1));
                    }
                } else if (W1.getParent() != frameLayout) {
                    E(W1, frameLayout);
                }
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    public final void K(long j) {
        ViewParent parent;
        ya8 ya8 = this.w;
        a aVar = (a) ya8.f(j);
        if (aVar != null) {
            if (!(aVar.W1() == null || (parent = aVar.W1().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            boolean F = F(j);
            ya8 ya82 = this.x;
            if (!F) {
                ya82.j(j);
            }
            if (!aVar.a2()) {
                ya8.j(j);
                return;
            }
            c cVar = this.v;
            if (cVar.Q()) {
                this.Z = true;
                return;
            }
            boolean a2 = aVar.a2();
            xg0 xg0 = this.X;
            if (a2 && F(j)) {
                xg0.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = xg0.a.iterator();
                if (!it.hasNext()) {
                    mc6 c0 = cVar.c0(aVar);
                    xg0.a(arrayList);
                    ya82.i(j, c0);
                } else {
                    rae.w(it.next());
                    throw null;
                }
            }
            xg0.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = xg0.a.iterator();
            if (!it2.hasNext()) {
                try {
                    xe0 xe0 = new xe0(cVar);
                    xe0.j(aVar);
                    xe0.f();
                    ya8.j(j);
                } finally {
                    xg0.a(arrayList2);
                }
            } else {
                rae.w(it2.next());
                throw null;
            }
        }
    }

    public final Parcelable a() {
        ya8 ya8 = this.w;
        int k = ya8.k();
        ya8 ya82 = this.x;
        Bundle bundle = new Bundle(ya82.k() + k);
        for (int i = 0; i < ya8.k(); i++) {
            long h = ya8.h(i);
            a aVar = (a) ya8.f(h);
            if (aVar != null && aVar.a2()) {
                this.v.X(bundle, wj6.i(h, "f#"), aVar);
            }
        }
        for (int i2 = 0; i2 < ya82.k(); i2++) {
            long h2 = ya82.h(i2);
            if (F(h2)) {
                bundle.putParcelable(wj6.i(h2, "s#"), (Parcelable) ya82.f(h2));
            }
        }
        return bundle;
    }

    public final void c(Parcelable parcelable) {
        String next;
        ya8 ya8 = this.x;
        if (ya8.k() == 0) {
            ya8 ya82 = this.w;
            if (ya82.k() == 0) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(it8.class.getClassLoader());
                }
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean z2 = true;
                    if (it.hasNext()) {
                        next = it.next();
                        if (!next.startsWith("f#") || next.length() <= 2) {
                            z2 = false;
                        }
                        if (z2) {
                            ya82.i(Long.parseLong(next.substring(2)), this.v.H(next, bundle));
                        } else if (next.startsWith("s#") && next.length() > 2) {
                            long parseLong = Long.parseLong(next.substring(2));
                            mc6 mc6 = (mc6) bundle.getParcelable(next);
                            if (F(parseLong)) {
                                ya8.i(parseLong, mc6);
                            }
                        }
                    } else if (ya82.k() != 0) {
                        this.Z = true;
                        this.Y = true;
                        G();
                        Handler handler = new Handler(Looper.getMainLooper());
                        cf cfVar = new cf(25, this);
                        this.o.a(new pg4(2, handler, cfVar));
                        handler.postDelayed(cfVar, WorkRequest.MIN_BACKOFF_MILLIS);
                        return;
                    } else {
                        return;
                    }
                }
                throw new IllegalArgumentException("Unexpected key in savedState: ".concat(next));
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public final int j() {
        return this.v0.size();
    }

    public final long k(int i) {
        return (long) i;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, we8] */
    public final void r(RecyclerView recyclerView) {
        bs0.n(this.z == null);
        ? obj = new Object();
        obj.f = this;
        obj.a = -1;
        this.z = obj;
        ViewPager2 d = we8.d(recyclerView);
        obj.e = d;
        gi0 gi0 = new gi0(7, obj);
        obj.b = gi0;
        d.b(gi0);
        t45 t45 = new t45(3, obj);
        obj.c = t45;
        A(t45);
        qyc qyc = new qyc(6, obj);
        obj.d = qyc;
        this.o.a(qyc);
    }

    public final void s(pzc pzc, int i) {
        a aVar;
        Bundle bundle;
        nd6 nd6 = (nd6) pzc;
        long j = nd6.v;
        FrameLayout frameLayout = (FrameLayout) nd6.a;
        int id = frameLayout.getId();
        Long I = I(id);
        ya8 ya8 = this.y;
        if (!(I == null || I.longValue() == j)) {
            K(I.longValue());
            ya8.j(I.longValue());
        }
        ya8.i(j, Integer.valueOf(id));
        long j2 = (long) i;
        ya8 ya82 = this.w;
        if (ya82.g(j2) < 0) {
            d48 d48 = (d48) this.v0.get(i);
            String a = d48.a();
            a48 a48 = this.w0;
            String str = a48.w;
            Bundle bundle2 = null;
            boolean a2 = y64.a(a != null ? Uri.parse(a) : null, str != null ? Uri.parse(str) : null);
            HashMap hashMap = this.x0;
            int i2 = d48.a;
            long j3 = d48.b;
            if (i2 != 1) {
                if (i2 == 3) {
                    aVar = new FrgLocalVideo();
                    aVar.L2(FrgLocalMedia.i3(d48, a2, a48));
                    hashMap.put(Long.valueOf(j3), new WeakReference(aVar));
                } else {
                    throw new IllegalStateException(wj6.h(i2, "media type should be known, type = "));
                }
            } else if (d48.d()) {
                aVar = new FrgLocalGif();
                aVar.L2(FrgLocalMedia.i3(d48, a2, a48));
                hashMap.put(Long.valueOf(j3), new WeakReference(aVar));
            } else {
                aVar = new FrgLocalPhoto();
                aVar.L2(FrgLocalMedia.i3(d48, a2, a48));
                hashMap.put(Long.valueOf(j3), new WeakReference(aVar));
            }
            mc6 mc6 = (mc6) this.x.f(j2);
            if (aVar.D0 == null) {
                if (!(mc6 == null || (bundle = mc6.a) == null)) {
                    bundle2 = bundle;
                }
                aVar.b = bundle2;
                ya82.i(j2, aVar);
            } else {
                throw new IllegalStateException("Fragment already added");
            }
        }
        if (frameLayout.isAttachedToWindow()) {
            J(nd6);
        }
        G();
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        int i2 = nd6.D0;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new pzc(frameLayout);
    }

    public final void v(RecyclerView recyclerView) {
        we8 we8 = this.z;
        we8.getClass();
        we8.d(recyclerView).g((gi0) we8.b);
        it8 it8 = (it8) we8.f;
        it8.D((t45) we8.c);
        it8.o.b((qyc) we8.d);
        we8.e = null;
        this.z = null;
    }

    public final /* bridge */ /* synthetic */ boolean w(pzc pzc) {
        nd6 nd6 = (nd6) pzc;
        return true;
    }

    public final void x(pzc pzc) {
        J((nd6) pzc);
        G();
    }

    public final void z(pzc pzc) {
        Long I = I(((FrameLayout) ((nd6) pzc).a).getId());
        if (I != null) {
            K(I.longValue());
            this.y.j(I.longValue());
        }
    }
}
