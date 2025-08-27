package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.ImageCaptureException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: pk4  reason: default package */
public final class pk4 implements ug, lsf {
    public static pk4 f;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public pk4(int i) {
        switch (i) {
            case 4:
                this.a = new Object();
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new ArrayDeque();
                return;
            default:
                this.a = new Object();
                this.e = new cf(15, this);
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.b = new Handler(Looper.getMainLooper());
                return;
        }
    }

    public static synchronized pk4 x() {
        pk4 pk4;
        synchronized (pk4.class) {
            try {
                if (f == null) {
                    f = new pk4(0);
                }
                pk4 = f;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return pk4;
    }

    public void A(ha7 ha7) {
        ev0.g();
        if (((qvb) this.a) == null) {
            Objects.toString(ha7);
            ha7.close();
            return;
        }
        a9f d2 = ha7.getImageInfo().d();
        if (((Integer) d2.a.get(((qvb) this.a).g)) == null) {
            ha7.close();
            return;
        }
        ev0.g();
        ub0 ub0 = (ub0) this.c;
        Objects.requireNonNull(ub0);
        ub0.a.accept(new vb0((qvb) this.a, ha7));
        qvb qvb = (qvb) this.a;
        this.a = null;
        int i = qvb.j;
        k3d k3d = qvb.f;
        if (!(i == -1 || i == 100)) {
            qvb.j = 100;
            k3d.getClass();
            ev0.g();
            if (!k3d.g) {
                rc0 rc0 = k3d.a;
                rc0.getClass();
                rc0.b.execute(new l9f(rc0));
            }
        }
        k3d.getClass();
        ev0.g();
        if (!k3d.g) {
            if (!k3d.h) {
                ev0.g();
                if (!k3d.g && !k3d.h) {
                    k3d.h = true;
                    xv1 xv1 = k3d.a.c;
                }
            }
            k3d.e.b((Object) null);
        }
    }

    public void B(qvb qvb) {
        ev0.g();
        boolean z = false;
        bs0.r("only one capture stage is supported.", qvb.h.size() == 1);
        if (w() > 0) {
            z = true;
        }
        bs0.r("Too many acquire images. Close image to be able to process next.", z);
        this.a = qvb;
        hd8.a(qvb.i, new dm4(this, qvb, false, 7), ryg.j());
    }

    public void C(lu7 lu7) {
        synchronized (this.a) {
            try {
                jv7 e2 = lu7.e();
                rv1 rv1 = lu7.c;
                hb0 hb0 = new hb0(e2, rv1.s(rv1.A0, rv1.B0));
                nu7 y = y(e2);
                Set hashSet = y != null ? (Set) ((HashMap) this.c).get(y) : new HashSet();
                hashSet.add(hb0);
                ((HashMap) this.b).put(hb0, lu7);
                if (y == null) {
                    nu7 nu7 = new nu7(e2, this);
                    ((HashMap) this.c).put(nu7, hashSet);
                    e2.getLifecycle().a(nu7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [kq9, java.lang.Object] */
    public void D(ta0 ta0) {
        Object obj = new Object();
        tc0 tc0 = (tc0) this.a;
        if (tc0 != null) {
            String str = (String) this.b;
            if (str != null) {
                krf krf = (krf) this.d;
                if (krf != null) {
                    l65 l65 = (l65) this.c;
                    if (l65 != null) {
                        qsf qsf = (qsf) this.e;
                        qsf.getClass();
                        tub tub = tub.a;
                        g6d a2 = tc0.a();
                        a2.y(tc0.a);
                        a2.o = tub;
                        a2.c = tc0.b;
                        tc0 k = a2.k();
                        ? obj2 = new Object();
                        obj2.w = new HashMap();
                        obj2.o = Long.valueOf(qsf.a.a());
                        obj2.v = Long.valueOf(qsf.b.a());
                        obj2.a = str;
                        obj2.c = new l55(l65, (byte[]) krf.apply(ta0.a));
                        obj2.b = null;
                        ua0 b2 = obj2.b();
                        ci4 ci4 = (ci4) qsf.c;
                        ci4.getClass();
                        ci4.b.execute(new jh3(1, ci4, k, obj, b2));
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }

    public void E(qc0 qc0) {
        boolean z;
        ev0.g();
        qvb qvb = (qvb) this.a;
        if (qvb != null && qvb.a == qc0.a) {
            k3d k3d = qvb.f;
            k3d.getClass();
            ev0.g();
            if (!k3d.g) {
                rc0 rc0 = k3d.a;
                rc0.getClass();
                ev0.g();
                int i = rc0.a;
                if (i > 0) {
                    z = true;
                    rc0.a = i - 1;
                } else {
                    z = false;
                }
                ImageCaptureException imageCaptureException = qc0.b;
                if (!z) {
                    ev0.g();
                    rc0.getClass();
                    rc0.b.execute(new s6e(9, rc0, imageCaptureException));
                }
                k3d.a();
                k3d.e.d(imageCaptureException);
                if (z) {
                    k9f k9f = k3d.b;
                    k9f.getClass();
                    ev0.g();
                    k9f.a.addFirst(rc0);
                    k9f.c();
                }
            }
        }
    }

    public void F(jv7 jv7) {
        synchronized (this.a) {
            try {
                if (z(jv7)) {
                    if (((ArrayDeque) this.d).isEmpty()) {
                        ((ArrayDeque) this.d).push(jv7);
                    } else {
                        mqf mqf = (mqf) this.e;
                        if (mqf == null || mqf.b != 2) {
                            jv7 jv72 = (jv7) ((ArrayDeque) this.d).peek();
                            if (!jv7.equals(jv72)) {
                                H(jv72);
                                ((ArrayDeque) this.d).remove(jv7);
                                ((ArrayDeque) this.d).push(jv7);
                            }
                        }
                    }
                    K(jv7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void G(jv7 jv7) {
        synchronized (this.a) {
            try {
                ((ArrayDeque) this.d).remove(jv7);
                H(jv7);
                if (!((ArrayDeque) this.d).isEmpty()) {
                    K((jv7) ((ArrayDeque) this.d).peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void H(jv7 jv7) {
        synchronized (this.a) {
            try {
                nu7 y = y(jv7);
                if (y != null) {
                    for (hb0 hb0 : (Set) ((HashMap) this.c).get(y)) {
                        lu7 lu7 = (lu7) ((HashMap) this.b).get(hb0);
                        lu7.getClass();
                        lu7.o();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void I(Collection collection) {
        synchronized (this.a) {
            for (hb0 hb0 : ((HashMap) this.b).keySet()) {
                lu7 lu7 = (lu7) ((HashMap) this.b).get(hb0);
                boolean z = !lu7.h().isEmpty();
                synchronized (lu7.a) {
                    ArrayList arrayList = new ArrayList(collection);
                    arrayList.retainAll(lu7.c.v());
                    lu7.c.y(arrayList);
                }
                if (z) {
                    if (lu7.h().isEmpty()) {
                        G(lu7.e());
                    }
                }
            }
        }
    }

    public void J() {
        synchronized (this.a) {
            for (hb0 hb0 : ((HashMap) this.b).keySet()) {
                lu7 lu7 = (lu7) ((HashMap) this.b).get(hb0);
                synchronized (lu7.a) {
                    rv1 rv1 = lu7.c;
                    rv1.y((ArrayList) rv1.v());
                }
                G(lu7.e());
            }
        }
    }

    public void K(jv7 jv7) {
        synchronized (this.a) {
            try {
                for (hb0 hb0 : (Set) ((HashMap) this.c).get(y(jv7))) {
                    lu7 lu7 = (lu7) ((HashMap) this.b).get(hb0);
                    lu7.getClass();
                    if (!lu7.h().isEmpty()) {
                        lu7.p();
                    }
                }
            } finally {
            }
        }
    }

    public dm4 a(View view) {
        return new dm4(view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(f()).setDuration(200).withStartAction(new vg(view, 1)));
    }

    public long b() {
        return 200;
    }

    public dm4 c(View view) {
        return new dm4(view.animate().scaleX(c44.DEFAULT_ASPECT_RATIO).scaleY(c44.DEFAULT_ASPECT_RATIO).alpha(c44.DEFAULT_ASPECT_RATIO).setInterpolator(l()).setDuration(200).withEndAction(new vg(view, 3)));
    }

    public Interpolator d() {
        if (((fh5) this.b) == null) {
            this.b = new fh5(1);
        }
        return (fh5) this.b;
    }

    public dm4 e(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, c44.DEFAULT_ASPECT_RATIO, 0, c44.DEFAULT_ASPECT_RATIO, 1, -1.0f, 1, c44.DEFAULT_ASPECT_RATIO);
        translateAnimation.setInterpolator(d());
        translateAnimation.setDuration(200);
        translateAnimation.setAnimationListener(new wg(view, 2));
        view.startAnimation(translateAnimation);
        return new dm4(translateAnimation);
    }

    public Interpolator f() {
        if (((OvershootInterpolator) this.e) == null) {
            this.e = new OvershootInterpolator();
        }
        return (OvershootInterpolator) this.e;
    }

    public dm4 g(View view) {
        return new dm4(view.animate().alpha(c44.DEFAULT_ASPECT_RATIO).setInterpolator(l()).setDuration(200).withEndAction(new vg(view, 2)));
    }

    public long h() {
        return 150;
    }

    public dm4 i(View view) {
        return new dm4(view.animate().alpha(1.0f).setInterpolator(d()).setDuration(200).withStartAction(new vg(view, 0)));
    }

    public dm4 j(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, c44.DEFAULT_ASPECT_RATIO, 0, c44.DEFAULT_ASPECT_RATIO, 1, 1.0f, 1, c44.DEFAULT_ASPECT_RATIO);
        translateAnimation.setInterpolator(d());
        translateAnimation.setDuration(200);
        translateAnimation.setAnimationListener(new wg(view, 0));
        view.startAnimation(translateAnimation);
        return new dm4(translateAnimation);
    }

    public Interpolator k() {
        if (((LinearInterpolator) this.a) == null) {
            this.a = new LinearInterpolator();
        }
        return (LinearInterpolator) this.a;
    }

    public Interpolator l() {
        if (((fh5) this.c) == null) {
            this.c = new fh5(0);
        }
        return (fh5) this.c;
    }

    public dm4 m(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, c44.DEFAULT_ASPECT_RATIO, 0, c44.DEFAULT_ASPECT_RATIO, 1, c44.DEFAULT_ASPECT_RATIO, 1, 1.0f);
        translateAnimation.setInterpolator(l());
        translateAnimation.setDuration(200);
        translateAnimation.setAnimationListener(new wg(view, 1));
        view.startAnimation(translateAnimation);
        return new dm4(translateAnimation);
    }

    public Interpolator n() {
        if (((gh5) this.d) == null) {
            this.d = new gh5();
        }
        return (gh5) this.d;
    }

    public dm4 o(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, c44.DEFAULT_ASPECT_RATIO, 0, c44.DEFAULT_ASPECT_RATIO, 1, c44.DEFAULT_ASPECT_RATIO, 1, -1.0f);
        translateAnimation.setInterpolator(l());
        translateAnimation.setDuration(200);
        translateAnimation.setAnimationListener(new wg(view, 3));
        view.startAnimation(translateAnimation);
        return new dm4(translateAnimation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0095, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(defpackage.lu7 r5, defpackage.dcg r6, java.util.List r7, java.util.Collection r8, defpackage.mqf r9) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            boolean r1 = r8.isEmpty()     // Catch:{ all -> 0x001a }
            r1 = r1 ^ 1
            defpackage.bs0.n(r1)     // Catch:{ all -> 0x001a }
            r4.e = r9     // Catch:{ all -> 0x001a }
            jv7 r9 = r5.e()     // Catch:{ all -> 0x001a }
            nu7 r1 = r4.y(r9)     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r4 = move-exception
            goto L_0x00a7
        L_0x001d:
            java.lang.Object r2 = r4.c     // Catch:{ all -> 0x001a }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x001a }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r4.e     // Catch:{ all -> 0x001a }
            mqf r2 = (defpackage.mqf) r2     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x0032
            int r2 = r2.b     // Catch:{ all -> 0x001a }
            r3 = 2
            if (r2 == r3) goto L_0x0068
        L_0x0032:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x001a }
        L_0x0036:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x001a }
            hb0 r2 = (defpackage.hb0) r2     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r4.b     // Catch:{ all -> 0x001a }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x001a }
            lu7 r2 = (defpackage.lu7) r2     // Catch:{ all -> 0x001a }
            r2.getClass()     // Catch:{ all -> 0x001a }
            boolean r3 = r2.equals(r5)     // Catch:{ all -> 0x001a }
            if (r3 != 0) goto L_0x0036
            java.util.List r2 = r2.h()     // Catch:{ all -> 0x001a }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x0060
            goto L_0x0036
        L_0x0060:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x001a }
            java.lang.String r5 = "Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner."
            r4.<init>(r5)     // Catch:{ all -> 0x001a }
            throw r4     // Catch:{ all -> 0x001a }
        L_0x0068:
            rv1 r1 = r5.c     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0099 }
            java.lang.Object r2 = r1.Z     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0099 }
            monitor-enter(r2)     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0099 }
            r1.z = r6     // Catch:{ all -> 0x009e }
            monitor-exit(r2)     // Catch:{ all -> 0x009e }
            rv1 r6 = r5.c     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0099 }
            java.lang.Object r1 = r6.Z     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0099 }
            monitor-enter(r1)     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0099 }
            r6.X = r7     // Catch:{ all -> 0x009b }
            monitor-exit(r1)     // Catch:{ all -> 0x009b }
            java.lang.Object r6 = r5.a     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0099 }
            monitor-enter(r6)     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0099 }
            rv1 r5 = r5.c     // Catch:{ all -> 0x0096 }
            r5.d(r8)     // Catch:{ all -> 0x0096 }
            monitor-exit(r6)     // Catch:{ all -> 0x0096 }
            ju7 r5 = r9.getLifecycle()     // Catch:{ all -> 0x001a }
            lv7 r5 = (defpackage.lv7) r5     // Catch:{ all -> 0x001a }
            iu7 r5 = r5.d     // Catch:{ all -> 0x001a }
            iu7 r6 = defpackage.iu7.o     // Catch:{ all -> 0x001a }
            boolean r5 = r5.a(r6)     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x0094
            r4.F(r9)     // Catch:{ all -> 0x001a }
        L_0x0094:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x0096:
            r4 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0096 }
            throw r4     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0099 }
        L_0x0099:
            r4 = move-exception
            goto L_0x00a1
        L_0x009b:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009b }
            throw r4     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0099 }
        L_0x009e:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009e }
            throw r4     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0099 }
        L_0x00a1:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x001a }
            r5.<init>(r4)     // Catch:{ all -> 0x001a }
            throw r5     // Catch:{ all -> 0x001a }
        L_0x00a7:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk4.p(lu7, dcg, java.util.List, java.util.Collection, mqf):void");
    }

    public void q(ok4 ok4) {
        synchronized (this.a) {
            ((ArrayList) this.c).remove(ok4);
        }
    }

    public void r(int i, View view, boolean z) {
        b4a b4a = (b4a) this.a;
        if (!b4a.Z()) {
            if (z) {
                View view2 = (View) b4a.c;
                if (view2 != null) {
                    float translationY = view2.getTranslationY();
                    Rect rect = rcg.a;
                    rcg.d(rect, (Toolbar) this.b);
                    if (translationY < ((float) rect.bottom)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            view.setTranslationY((float) i);
        }
    }

    public void s(int i, boolean z, boolean z2) {
        View view = (View) ((b4a) this.a).c;
        if (view != null) {
            if (z) {
                ch chVar = (ch) this.c;
                if (chVar.q()) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(int) view.getTranslationY(), i});
                    ofInt.addUpdateListener(new hg(view, 3));
                    ofInt.addListener(new n33(4));
                    ofInt.setDuration(chVar.a.b());
                    ofInt.start();
                    return;
                }
            }
            r(i, view, z2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a5, code lost:
        if (r1 <= r4.bottom) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t(int r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            r16 = this;
            r11 = r16
            r12 = r21
            java.lang.Object r0 = r11.a
            b4a r0 = (defpackage.b4a) r0
            r1 = r0
            q2 r1 = (defpackage.q2) r1
            java.lang.Object r2 = r1.c
            r10 = r2
            android.view.View r10 = (android.view.View) r10
            if (r10 != 0) goto L_0x0013
            return
        L_0x0013:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r20 == 0) goto L_0x0075
            java.lang.Object r3 = r11.c
            r13 = r3
            ch r13 = (defpackage.ch) r13
            boolean r3 = r13.q()
            if (r3 == 0) goto L_0x0075
            int r6 = r10.getMeasuredWidth()
            int r8 = r10.getMeasuredHeight()
            float r0 = r10.getY()
            int r4 = (int) r0
            android.animation.IntEvaluator r3 = new android.animation.IntEvaluator
            r3.<init>()
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r14 = android.animation.ValueAnimator.ofFloat(r0)
            r11.e = r14
            lbc r15 = new lbc
            r0 = r15
            r1 = r16
            r2 = r21
            r5 = r19
            r7 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.addUpdateListener(r15)
            java.lang.Object r0 = r11.e
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            yy3 r1 = new yy3
            r2 = 3
            r1.<init>(r11, r12, r2)
            r0.addListener(r1)
            java.lang.Object r0 = r11.e
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            ug r1 = r13.a
            long r1 = r1.b()
            r0.setDuration(r1)
            java.lang.Object r0 = r11.e
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.start()
            goto L_0x00d0
        L_0x0075:
            android.view.ViewGroup$LayoutParams r3 = r10.getLayoutParams()
            r4 = r17
            r3.width = r4
            android.view.ViewGroup$LayoutParams r3 = r10.getLayoutParams()
            r4 = r18
            r3.height = r4
            java.lang.Object r1 = r1.c
            android.view.View r1 = (android.view.View) r1
            r3 = 0
            if (r1 != 0) goto L_0x008f
        L_0x008c:
            r1 = r19
            goto L_0x00a8
        L_0x008f:
            android.graphics.Rect r4 = defpackage.rcg.a
            defpackage.rcg.d(r4, r1)
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x008c
            int r1 = r4.bottom
            java.lang.Object r5 = r11.b
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            defpackage.rcg.d(r4, r5)
            int r4 = r4.bottom
            if (r1 > r4) goto L_0x008c
            goto L_0x00ab
        L_0x00a8:
            r11.r(r1, r10, r3)
        L_0x00ab:
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            java.lang.Object r2 = r11.d
            mbc r2 = (defpackage.mbc) r2
            ok8 r2 = (defpackage.ok8) r2
            r2.v(r1, r12)
            if (r12 == 0) goto L_0x00bc
            r3 = 8
        L_0x00bc:
            androidx.appcompat.widget.Toolbar r1 = r2.L0
            r1.setVisibility(r3)
            android.view.View r1 = r2.K0
            r1.setVisibility(r3)
            if (r12 == 0) goto L_0x00cb
            v3a r1 = defpackage.v3a.b
            goto L_0x00cd
        L_0x00cb:
            v3a r1 = defpackage.v3a.a
        L_0x00cd:
            r0.i0(r1)
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk4.t(int, int, int, boolean, boolean):void");
    }

    public void u(su1 su1, su1 su12, q3f q3f, q3f q3f2, Map.Entry entry) {
        q3f q3f3 = (q3f) entry.getValue();
        kc0 kc0 = new kc0(q3f.g.a, ((oa0) entry.getKey()).a.d, q3f.c ? su1 : null, ((oa0) entry.getKey()).a.f, ((oa0) entry.getKey()).a.g);
        kc0 kc02 = new kc0(q3f2.g.a, ((oa0) entry.getKey()).b.d, q3f2.c ? su12 : null, ((oa0) entry.getKey()).b.f, ((oa0) entry.getKey()).b.g);
        int i = ((oa0) entry.getKey()).a.c;
        q3f3.getClass();
        ev0.g();
        q3f3.b();
        bs0.r("Consumer can only be linked once.", !q3f3.j);
        q3f3.j = true;
        p3f p3f = q3f3.l;
        hd8.a(hd8.b0(p3f.c(), new o3f(q3f3, p3f, i, kc0, kc02), ryg.G()), new ox0(this, q3f3, false, 10), ryg.G());
    }

    public lu7 v(jv7 jv7, rv1 rv1) {
        synchronized (this.a) {
            try {
                bs0.m("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", ((HashMap) this.b).get(new hb0(jv7, rv1.v)) == null);
                lu7 lu7 = new lu7(jv7, rv1);
                if (((ArrayList) rv1.v()).isEmpty()) {
                    lu7.o();
                }
                if (((lv7) jv7.getLifecycle()).d == iu7.a) {
                    return lu7;
                }
                C(lu7);
                return lu7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int w() {
        int o;
        ev0.g();
        bs0.r("The ImageReader is not initialized.", ((obd) this.b) != null);
        obd obd = (obd) this.b;
        synchronized (obd.c) {
            o = ((ja7) obd.o).o() - obd.b;
        }
        return o;
    }

    public nu7 y(jv7 jv7) {
        synchronized (this.a) {
            try {
                for (nu7 nu7 : ((HashMap) this.c).keySet()) {
                    if (jv7.equals(nu7.b)) {
                        return nu7;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean z(jv7 jv7) {
        synchronized (this.a) {
            try {
                nu7 y = y(jv7);
                if (y == null) {
                    return false;
                }
                for (hb0 hb0 : (Set) ((HashMap) this.c).get(y)) {
                    lu7 lu7 = (lu7) ((HashMap) this.b).get(hb0);
                    lu7.getClass();
                    if (!lu7.h().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ pk4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }
}
