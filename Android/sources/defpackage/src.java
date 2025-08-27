package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: src  reason: default package */
public final class src extends bbe {
    public static TimeInterpolator E;
    public final long A;
    public final float B;
    public final float C;
    public final float D;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final LinkedHashMap o = new LinkedHashMap();
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final float s;
    public final float t;
    public final float u;
    public final float v;
    public final float w;
    public final long x;
    public final long y;
    public final long z;

    public src(zrc zrc) {
        this.g = false;
        Resources resources = zrc.getContext().getResources();
        this.x = (long) resources.getInteger(ajc.onechat_react_scale_1_step_duration);
        this.y = (long) resources.getInteger(ajc.onechat_react_scale_2_step_duration);
        this.z = (long) resources.getInteger(ajc.onechat_react_scale_3_step_duration);
        this.A = (long) resources.getInteger(ajc.onechat_react_scale_4_step_duration);
        this.c = (long) resources.getInteger(ajc.onechat_react_add_duration);
        this.f = (long) resources.getInteger(ajc.onechat_react_change_duration);
        this.d = (long) resources.getInteger(ajc.onechat_react_remove_duration);
        this.e = (long) resources.getInteger(ajc.onechat_react_move_duration);
        TypedValue typedValue = new TypedValue();
        resources.getValue(xdc.onechat_react_move_tension, typedValue, true);
        this.s = typedValue.getFloat();
        resources.getValue(xdc.onechat_react_change_tension, typedValue, true);
        this.t = typedValue.getFloat();
        resources.getValue(xdc.onechat_react_add_tension, typedValue, true);
        this.u = typedValue.getFloat();
        resources.getValue(xdc.onechat_react_next_move_delay_coef, typedValue, true);
        this.v = typedValue.getFloat();
        resources.getValue(xdc.onechat_react_next_change_delay_coef, typedValue, true);
        this.w = typedValue.getFloat();
        resources.getValue(xdc.onechat_react_scale_1_step, typedValue, true);
        this.B = typedValue.getFloat();
        resources.getValue(xdc.onechat_react_scale_2_step, typedValue, true);
        this.C = typedValue.getFloat();
        resources.getValue(xdc.onechat_react_scale_3_step, typedValue, true);
        this.D = typedValue.getFloat();
    }

    public final void A(pzc pzc) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        pzc.a.animate().setInterpolator(E);
        j(pzc);
    }

    public final boolean b(pzc pzc, pzc pzc2, ft ftVar, ft ftVar2) {
        if (!(ftVar instanceof prc) || !(pzc2 instanceof grc)) {
            return super.b(pzc, pzc2, ftVar, ftVar2);
        }
        v(pzc2, true, false);
        return true;
    }

    public final boolean f(pzc pzc, List list) {
        return !list.isEmpty() || u(pzc);
    }

    public final void j(pzc pzc) {
        View view = pzc.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            rrc rrc = (rrc) arrayList.get(size);
            if (rrc.a == pzc) {
                rrc.a();
                h(pzc);
                arrayList.remove(size);
            }
        }
        y(pzc, this.k);
        if (this.h.remove(pzc)) {
            view.setAlpha(1.0f);
            h(pzc);
        }
        LinkedHashMap linkedHashMap = this.o;
        Animator animator = (Animator) linkedHashMap.get(pzc);
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList2 = this.i;
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            orc orc = (orc) it.next();
            if (orc.a == pzc && arrayList2.remove(orc)) {
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                g(pzc);
                break;
            }
        }
        ArrayList arrayList3 = this.n;
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList4 = (ArrayList) arrayList3.get(size2);
            y(pzc, arrayList4);
            if (arrayList4.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        ArrayList arrayList5 = this.m;
        for (int size3 = arrayList5.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                rrc rrc2 = (rrc) arrayList6.get(size4);
                if (rrc2.a == pzc) {
                    rrc2.a();
                    h(pzc);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList7 = this.l;
        for (int size5 = arrayList7.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size5);
            int size6 = arrayList8.size() - 1;
            while (true) {
                if (size6 < 0) {
                    break;
                }
                orc orc2 = (orc) arrayList8.get(size6);
                if (orc2.a == pzc) {
                    arrayList8.remove(orc2);
                    orc2.a();
                    g(pzc);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(size5);
                    }
                } else {
                    size6--;
                }
            }
        }
        this.q.remove(pzc);
        linkedHashMap.containsKey(pzc);
        this.r.remove(pzc);
        this.p.remove(pzc);
        x();
    }

    public final void k() {
        ArrayList arrayList = this.j;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            rrc rrc = (rrc) arrayList.get(size);
            rrc.a();
            h(rrc.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            h((pzc) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            orc orc = (orc) arrayList3.get(size3);
            orc.a();
            h(orc.a);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            qrc qrc = (qrc) arrayList4.get(size4);
            pzc pzc = qrc.a;
            if (pzc != null) {
                z(qrc, pzc);
            }
            pzc pzc2 = qrc.b;
            if (pzc2 != null) {
                z(qrc, pzc2);
            }
        }
        arrayList4.clear();
        if (n()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    rrc rrc2 = (rrc) arrayList6.get(size6);
                    rrc2.a();
                    h(rrc2.a);
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
                    orc orc2 = (orc) arrayList8.get(size8);
                    pzc pzc3 = orc2.a;
                    orc2.a();
                    h(pzc3);
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
                    qrc qrc2 = (qrc) arrayList10.get(size10);
                    pzc pzc4 = qrc2.a;
                    if (pzc4 != null) {
                        z(qrc2, pzc4);
                    }
                    pzc pzc5 = qrc2.b;
                    if (pzc5 != null) {
                        z(qrc2, pzc5);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            w(this.q);
            w(this.p);
            LinkedHashMap linkedHashMap = this.o;
            ArrayList arrayList11 = new ArrayList(linkedHashMap.keySet());
            for (int size11 = arrayList11.size() - 1; size11 >= 0; size11--) {
                Animator animator = (Animator) linkedHashMap.get((pzc) arrayList11.get(size11));
                if (animator != null) {
                    animator.cancel();
                }
            }
            w(this.r);
            i();
        }
    }

    public final boolean n() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    public final ft o(lzc lzc, pzc pzc, int i2, List list) {
        if (i2 == 2 && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        return super.o(lzc, pzc, i2, list);
    }

    public final void p() {
        float f;
        boolean z2;
        ArrayList arrayList;
        Iterator it;
        float f2;
        ArrayList arrayList2 = this.h;
        boolean z3 = !arrayList2.isEmpty();
        ArrayList arrayList3 = this.j;
        boolean z4 = !arrayList3.isEmpty();
        ArrayList arrayList4 = this.k;
        boolean z5 = !arrayList4.isEmpty();
        ArrayList arrayList5 = this.i;
        boolean z6 = !arrayList5.isEmpty();
        if (z3 || z4 || z6 || z5) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                f = c44.DEFAULT_ASPECT_RATIO;
                if (!hasNext) {
                    break;
                }
                pzc pzc = (pzc) it2.next();
                View view = pzc.a;
                ViewPropertyAnimator animate = view.animate();
                this.q.add(pzc);
                hg4 hg4 = r0;
                hg4 hg42 = new hg4(this, pzc, animate, view, 2);
                animate.setDuration(this.d).alpha(c44.DEFAULT_ASPECT_RATIO).setListener(hg4).start();
            }
            arrayList2.clear();
            if (z4) {
                ArrayList arrayList6 = new ArrayList(arrayList3);
                ArrayList arrayList7 = this.m;
                arrayList7.add(arrayList6);
                arrayList3.clear();
                Iterator it3 = arrayList6.iterator();
                long j2 = 0;
                while (it3.hasNext()) {
                    rrc rrc = (rrc) it3.next();
                    pzc pzc2 = rrc.a;
                    View view2 = pzc2.a;
                    int i2 = rrc.d - rrc.b;
                    int i3 = rrc.e - rrc.c;
                    if (i2 != 0) {
                        view2.animate().translationX(f);
                    }
                    if (i3 != 0) {
                        view2.animate().translationY(f);
                    }
                    ViewPropertyAnimator animate2 = view2.animate();
                    this.p.add(pzc2);
                    long j3 = j2;
                    ViewPropertyAnimator duration = animate2.setInterpolator(new OvershootInterpolator(this.s)).setStartDelay(j2).setDuration(this.e);
                    int i4 = i2;
                    ig4 ig4 = r0;
                    ig4 ig42 = new ig4(this, pzc2, i4, view2, i3, animate2, 1);
                    duration.setListener(ig4).start();
                    j2 = (long) ((this.v * ((float) this.e)) + ((float) j3));
                    arrayList7 = arrayList7;
                    arrayList5 = arrayList5;
                    z6 = z6;
                    f = c44.DEFAULT_ASPECT_RATIO;
                }
                arrayList = arrayList5;
                z2 = z6;
                arrayList6.clear();
                arrayList7.remove(arrayList6);
            } else {
                arrayList = arrayList5;
                z2 = z6;
            }
            if (z5) {
                ArrayList arrayList8 = new ArrayList(arrayList4);
                ArrayList arrayList9 = this.n;
                arrayList9.add(arrayList8);
                arrayList4.clear();
                Iterator it4 = arrayList8.iterator();
                long j4 = 0;
                while (it4.hasNext()) {
                    qrc qrc = (qrc) it4.next();
                    pzc pzc3 = qrc.a;
                    View view3 = pzc3 == null ? null : pzc3.a;
                    pzc pzc4 = qrc.b;
                    View view4 = pzc4 != null ? pzc4.a : null;
                    ArrayList arrayList10 = this.r;
                    float f3 = this.t;
                    if (view3 != null) {
                        ViewPropertyAnimator duration2 = view3.animate().setDuration(this.f);
                        arrayList10.add(qrc.a);
                        nrc nrc = r0;
                        ViewPropertyAnimator interpolator = duration2.translationX((float) (qrc.e - qrc.c)).translationY((float) (qrc.f - qrc.d)).alpha(c44.DEFAULT_ASPECT_RATIO).setStartDelay(j4).setInterpolator(new OvershootInterpolator(f3));
                        it = it4;
                        f2 = f3;
                        nrc nrc2 = new nrc(this, qrc, duration2, view3, 0);
                        interpolator.setListener(nrc2).start();
                    } else {
                        it = it4;
                        f2 = f3;
                    }
                    if (view4 != null) {
                        ViewPropertyAnimator animate3 = view4.animate();
                        arrayList10.add(qrc.b);
                        animate3.setInterpolator(new OvershootInterpolator(f2)).translationX(c44.DEFAULT_ASPECT_RATIO).translationY(c44.DEFAULT_ASPECT_RATIO).setStartDelay(j4).setDuration(this.f).alpha(1.0f).setListener(new nrc(this, qrc, animate3, view4, 1)).start();
                    }
                    j4 = (long) ((this.w * ((float) this.e)) + ((float) j4));
                    it4 = it;
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
            if (z2) {
                ArrayList arrayList11 = arrayList;
                ArrayList arrayList12 = new ArrayList(arrayList11);
                ArrayList arrayList13 = this.l;
                arrayList13.add(arrayList12);
                arrayList11.clear();
                Iterator it5 = arrayList12.iterator();
                while (it5.hasNext()) {
                    orc orc = (orc) it5.next();
                    pzc pzc5 = orc.a;
                    View view5 = pzc5.a;
                    view5.animate().cancel();
                    float translationZ = view5.getTranslationZ();
                    if (pzc5.o == -1) {
                        pzc5.a.setTranslationZ(1000.0f);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.o.put(pzc5, animatorSet);
                    ArrayList arrayList14 = new ArrayList();
                    animatorSet.addListener(new mrc(this, orc, pzc5, translationZ));
                    boolean z7 = orc.b;
                    if (z7) {
                        Property property = View.SCALE_X;
                        float f4 = this.B;
                        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(property, new float[]{f4});
                        Property property2 = View.SCALE_Y;
                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view5, new PropertyValuesHolder[]{ofFloat, PropertyValuesHolder.ofFloat(property2, new float[]{f4})});
                        ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
                        ofPropertyValuesHolder.setDuration(this.x);
                        arrayList14.add(ofPropertyValuesHolder);
                        float f5 = this.C;
                        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view5, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(property, new float[]{f5}), PropertyValuesHolder.ofFloat(property2, new float[]{f5})});
                        ofPropertyValuesHolder2.setInterpolator(new AccelerateDecelerateInterpolator());
                        ofPropertyValuesHolder2.setDuration(this.y);
                        arrayList14.add(ofPropertyValuesHolder2);
                        float f6 = this.D;
                        ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(view5, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(property, new float[]{f6}), PropertyValuesHolder.ofFloat(property2, new float[]{f6})});
                        ofPropertyValuesHolder3.setDuration(this.z);
                        ofPropertyValuesHolder3.setInterpolator(new AccelerateDecelerateInterpolator());
                        arrayList14.add(ofPropertyValuesHolder3);
                    }
                    ObjectAnimator ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(view5, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f})});
                    ofPropertyValuesHolder4.setInterpolator(z7 ? new AccelerateDecelerateInterpolator() : new OvershootInterpolator(this.u));
                    ofPropertyValuesHolder4.setDuration(z7 ? this.A : this.c);
                    arrayList14.add(ofPropertyValuesHolder4);
                    animatorSet.playSequentially(arrayList14);
                    animatorSet.start();
                }
                arrayList12.clear();
                arrayList13.remove(arrayList12);
            }
        }
    }

    public final boolean q(pzc pzc) {
        if (pzc instanceof frc) {
            return true;
        }
        v(pzc, false, true);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [qrc, java.lang.Object] */
    public final boolean r(pzc pzc, pzc pzc2, int i2, int i3, int i4, int i5) {
        if (pzc == pzc2) {
            return s(pzc, i2, i3, i4, i5);
        }
        View view = pzc.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        A(pzc);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        A(pzc2);
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

    /* JADX WARNING: type inference failed for: r3v0, types: [rrc, java.lang.Object] */
    public final boolean s(pzc pzc, int i2, int i3, int i4, int i5) {
        int translationX = i2 + ((int) pzc.a.getTranslationX());
        View view = pzc.a;
        int translationY = i3 + ((int) view.getTranslationY());
        A(pzc);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            h(pzc);
            return false;
        }
        ? obj = new Object();
        obj.a = pzc;
        obj.b = translationX;
        obj.c = translationY;
        obj.d = i4;
        obj.e = i5;
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        this.j.add(obj);
        return true;
    }

    public final void t(pzc pzc) {
        j(pzc);
        A(pzc);
        this.h.add(pzc);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [orc, java.lang.Object] */
    public final void v(pzc pzc, boolean z2, boolean z3) {
        A(pzc);
        ? obj = new Object();
        obj.a = pzc;
        obj.b = !z3;
        if (!(pzc instanceof frc)) {
            View view = pzc.a;
            if (z3) {
                view.setScaleX(c44.DEFAULT_ASPECT_RATIO);
                view.setScaleY(c44.DEFAULT_ASPECT_RATIO);
            } else {
                view.setScaleX(0.8f);
                view.setScaleY(0.8f);
            }
            if (z2) {
                view.setPivotX(((float) view.getMeasuredWidth()) * 0.5f);
            } else {
                view.setPivotX(c44.DEFAULT_ASPECT_RATIO);
            }
            view.setPivotY((float) view.getMeasuredHeight());
        }
        this.i.add(obj);
    }

    public final void w(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((pzc) list.get(size)).a.animate().cancel();
        }
    }

    public final void x() {
        if (!n()) {
            i();
        }
    }

    public final void y(pzc pzc, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            qrc qrc = (qrc) list.get(size);
            if (z(qrc, pzc) && qrc.a == null && qrc.b == null) {
                list.remove(qrc);
            }
        }
    }

    public final boolean z(qrc qrc, pzc pzc) {
        if (qrc.b == pzc) {
            qrc.b = null;
        } else if (qrc.a != pzc) {
            return false;
        } else {
            qrc.a = null;
        }
        pzc.a.setAlpha(1.0f);
        View view = pzc.a;
        view.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
        view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        h(pzc);
        return true;
    }
}
