package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: mg4  reason: default package */
public class mg4 extends bbe {
    public static TimeInterpolator s;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();

    public boolean f(pzc pzc, List list) {
        return !list.isEmpty() || u(pzc);
    }

    public void j(pzc pzc) {
        View view = pzc.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((lg4) arrayList.get(size)).a == pzc) {
                view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                view.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
                h(pzc);
                arrayList.remove(size);
            }
        }
        x(pzc, this.k);
        if (this.h.remove(pzc)) {
            view.setAlpha(1.0f);
            h(pzc);
        }
        if (this.i.remove(pzc)) {
            view.setAlpha(1.0f);
            g(pzc);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            x(pzc, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((lg4) arrayList5.get(size4)).a == pzc) {
                    view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                    view.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
                    h(pzc);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(pzc)) {
                view.setAlpha(1.0f);
                g(pzc);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(pzc);
        this.o.remove(pzc);
        this.r.remove(pzc);
        this.p.remove(pzc);
        w();
    }

    public final void k() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            lg4 lg4 = (lg4) arrayList.get(size);
            View view = lg4.a.a;
            view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
            view.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
            h(lg4.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            h((pzc) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            pzc pzc = (pzc) arrayList3.get(size3);
            pzc.a.setAlpha(1.0f);
            h(pzc);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            kg4 kg4 = (kg4) arrayList4.get(size4);
            pzc pzc2 = kg4.a;
            if (pzc2 != null) {
                y(kg4, pzc2);
            }
            pzc pzc3 = kg4.b;
            if (pzc3 != null) {
                y(kg4, pzc3);
            }
        }
        arrayList4.clear();
        if (n()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    lg4 lg42 = (lg4) arrayList6.get(size6);
                    View view2 = lg42.a.a;
                    view2.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                    view2.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
                    h(lg42.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    pzc pzc4 = (pzc) arrayList8.get(size8);
                    pzc4.a.setAlpha(1.0f);
                    h(pzc4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    kg4 kg42 = (kg4) arrayList10.get(size10);
                    pzc pzc5 = kg42.a;
                    if (pzc5 != null) {
                        y(kg42, pzc5);
                    }
                    pzc pzc6 = kg42.b;
                    if (pzc6 != null) {
                        y(kg42, pzc6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            v(this.q);
            v(this.p);
            v(this.o);
            v(this.r);
            i();
        }
    }

    public final boolean n() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    public final void p() {
        ArrayList arrayList = this.h;
        boolean z = !arrayList.isEmpty();
        ArrayList arrayList2 = this.j;
        boolean z2 = !arrayList2.isEmpty();
        ArrayList arrayList3 = this.k;
        boolean z3 = !arrayList3.isEmpty();
        ArrayList arrayList4 = this.i;
        boolean z4 = !arrayList4.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pzc pzc = (pzc) it.next();
                View view = pzc.a;
                ViewPropertyAnimator animate = view.animate();
                this.q.add(pzc);
                hg4 hg4 = r0;
                hg4 hg42 = new hg4(this, pzc, animate, view, 0);
                animate.setDuration(this.d).alpha(c44.DEFAULT_ASPECT_RATIO).setListener(hg4).start();
            }
            arrayList.clear();
            if (z2) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.m.add(arrayList5);
                arrayList2.clear();
                gg4 gg4 = new gg4(this, arrayList5, 0);
                if (z) {
                    View view2 = ((lg4) arrayList5.get(0)).a.a;
                    long j2 = this.d;
                    WeakHashMap weakHashMap = gag.a;
                    view2.postOnAnimationDelayed(gg4, j2);
                } else {
                    gg4.run();
                }
            }
            if (z3) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                this.n.add(arrayList6);
                arrayList3.clear();
                uj6 uj6 = new uj6((Object) this, (Object) arrayList6, false, 4);
                if (z) {
                    View view3 = ((kg4) arrayList6.get(0)).a.a;
                    long j3 = this.d;
                    WeakHashMap weakHashMap2 = gag.a;
                    view3.postOnAnimationDelayed(uj6, j3);
                } else {
                    uj6.run();
                }
            }
            if (z4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.l.add(arrayList7);
                arrayList4.clear();
                gg4 gg42 = new gg4(this, arrayList7, 1);
                if (z || z2 || z3) {
                    long j4 = 0;
                    long j5 = z ? this.d : 0;
                    long m2 = z2 ? m() : 0;
                    if (z3) {
                        j4 = l();
                    }
                    long max = Math.max(m2, j4) + j5;
                    View view4 = ((pzc) arrayList7.get(0)).a;
                    WeakHashMap weakHashMap3 = gag.a;
                    view4.postOnAnimationDelayed(gg42, max);
                    return;
                }
                gg42.run();
            }
        }
    }

    public boolean q(pzc pzc) {
        z(pzc);
        pzc.a.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        this.i.add(pzc);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [kg4, java.lang.Object] */
    public boolean r(pzc pzc, pzc pzc2, int i2, int i3, int i4, int i5) {
        if (pzc == pzc2) {
            return s(pzc, i2, i3, i4, i5);
        }
        View view = pzc.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        z(pzc);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        z(pzc2);
        View view2 = pzc2.a;
        view2.setTranslationX((float) (-((int) (((float) (i4 - i2)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i5 - i3)) - translationY))));
        view2.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        ArrayList arrayList = this.k;
        ? obj = new Object();
        obj.a = pzc;
        obj.b = pzc2;
        obj.c = i2;
        obj.d = i3;
        obj.e = i4;
        obj.f = i5;
        arrayList.add(obj);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [lg4, java.lang.Object] */
    public boolean s(pzc pzc, int i2, int i3, int i4, int i5) {
        View view = pzc.a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) pzc.a.getTranslationY());
        z(pzc);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            h(pzc);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        ArrayList arrayList = this.j;
        ? obj = new Object();
        obj.a = pzc;
        obj.b = translationX;
        obj.c = translationY;
        obj.d = i4;
        obj.e = i5;
        arrayList.add(obj);
        return true;
    }

    public void t(pzc pzc) {
        z(pzc);
        this.h.add(pzc);
    }

    public final void v(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((pzc) list.get(size)).a.animate().cancel();
        }
    }

    public final void w() {
        if (!n()) {
            i();
        }
    }

    public final void x(pzc pzc, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            kg4 kg4 = (kg4) list.get(size);
            if (y(kg4, pzc) && kg4.a == null && kg4.b == null) {
                list.remove(kg4);
            }
        }
    }

    public final boolean y(kg4 kg4, pzc pzc) {
        if (kg4.b == pzc) {
            kg4.b = null;
        } else if (kg4.a != pzc) {
            return false;
        } else {
            kg4.a = null;
        }
        pzc.a.setAlpha(1.0f);
        View view = pzc.a;
        view.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
        view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        h(pzc);
        return true;
    }

    public final void z(pzc pzc) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        pzc.a.animate().setInterpolator(s);
        j(pzc);
    }
}
