package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: yrf  reason: default package */
public abstract class yrf implements Cloneable {
    public static final Animator[] M0 = new Animator[0];
    public static final int[] N0 = {2, 1, 3, 4};
    public static final ece O0 = new ece(20);
    public static final ThreadLocal P0 = new ThreadLocal();
    public Animator[] A0 = M0;
    public int B0 = 0;
    public boolean C0 = false;
    public boolean D0 = false;
    public yrf E0 = null;
    public ArrayList F0 = null;
    public ArrayList G0 = new ArrayList();
    public c9e H0;
    public f6e I0;
    public ece J0 = O0;
    public long K0;
    public long L0;
    public qpg X = new qpg(12);
    public qpg Y = new qpg(12);
    public gsf Z = null;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator o = null;
    public final ArrayList v = new ArrayList();
    public final int[] v0 = N0;
    public final ArrayList w = new ArrayList();
    public ArrayList w0;
    public ArrayList x = null;
    public ArrayList x0;
    public ArrayList y = null;
    public xrf[] y0;
    public ArrayList z = null;
    public final ArrayList z0 = new ArrayList();

    public static void d(qpg qpg, View view, isf isf) {
        ((ts) qpg.a).put(view, isf);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) qpg.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = gag.a;
        String k = v9g.k(view);
        if (k != null) {
            ts tsVar = (ts) qpg.o;
            if (tsVar.containsKey(k)) {
                tsVar.put(k, (Object) null);
            } else {
                tsVar.put(k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                ya8 ya8 = (ya8) qpg.c;
                if (ya8.g(itemIdAtPosition) >= 0) {
                    View view2 = (View) ya8.f(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        ya8.i(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                ya8.i(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [qae, java.lang.Object, ts] */
    public static ts t() {
        ThreadLocal threadLocal = P0;
        ts tsVar = (ts) threadLocal.get();
        if (tsVar != null) {
            return tsVar;
        }
        ? qae = new qae();
        threadLocal.set(qae);
        return qae;
    }

    public static boolean z(isf isf, isf isf2, String str) {
        Object obj = isf.a.get(str);
        Object obj2 = isf2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void A(yrf yrf, xff xff, boolean z2) {
        yrf yrf2 = this.E0;
        if (yrf2 != null) {
            yrf2.A(yrf, xff, z2);
        }
        ArrayList arrayList = this.F0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.F0.size();
            xrf[] xrfArr = this.y0;
            if (xrfArr == null) {
                xrfArr = new xrf[size];
            }
            this.y0 = null;
            xrf[] xrfArr2 = (xrf[]) this.F0.toArray(xrfArr);
            for (int i = 0; i < size; i++) {
                xff.a(xrfArr2[i], yrf, z2);
                xrfArr2[i] = null;
            }
            this.y0 = xrfArr2;
        }
    }

    public void B(View view) {
        if (!this.D0) {
            ArrayList arrayList = this.z0;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0);
            this.A0 = M0;
            for (int i = size - 1; i >= 0; i--) {
                Animator animator = animatorArr[i];
                animatorArr[i] = null;
                animator.pause();
            }
            this.A0 = animatorArr;
            A(this, xff.v, false);
            this.C0 = true;
        }
    }

    public void C() {
        ts t = t();
        this.K0 = 0;
        for (int i = 0; i < this.G0.size(); i++) {
            Animator animator = (Animator) this.G0.get(i);
            urf urf = (urf) t.get(animator);
            if (!(animator == null || urf == null)) {
                long j = this.c;
                int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                Animator animator2 = urf.f;
                if (i2 >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.o;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.z0.add(animator);
                this.K0 = Math.max(this.K0, vrf.a(animator));
            }
        }
        this.G0.clear();
    }

    public yrf D(xrf xrf) {
        yrf yrf;
        ArrayList arrayList = this.F0;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(xrf) && (yrf = this.E0) != null) {
            yrf.D(xrf);
        }
        if (this.F0.size() == 0) {
            this.F0 = null;
        }
        return this;
    }

    public void E(View view) {
        this.w.remove(view);
    }

    public void F(View view) {
        if (this.C0) {
            if (!this.D0) {
                ArrayList arrayList = this.z0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0);
                this.A0 = M0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.A0 = animatorArr;
                A(this, xff.w, false);
            }
            this.C0 = false;
        }
    }

    public void G() {
        O();
        ts t = t();
        Iterator it = this.G0.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (t.containsKey(animator)) {
                O();
                if (animator != null) {
                    animator.addListener(new wh(this, t, false, 7));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.o;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new z6(15, (Object) this));
                    animator.start();
                }
            }
        }
        this.G0.clear();
        o();
    }

    public void H(long j, long j2) {
        long j3 = j;
        long j4 = this.K0;
        boolean z2 = j3 < j2;
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if ((i < 0 && j3 >= 0) || (j2 > j4 && j3 <= j4)) {
            this.D0 = false;
            A(this, xff.b, z2);
        }
        ArrayList arrayList = this.z0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0);
        this.A0 = M0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            vrf.b(animator, Math.min(Math.max(0, j3), vrf.a(animator)));
        }
        this.A0 = animatorArr;
        int i3 = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
        if ((i3 > 0 && j2 <= j4) || (j3 < 0 && i >= 0)) {
            if (i3 > 0) {
                this.D0 = true;
            }
            A(this, xff.c, z2);
        }
    }

    public void I(long j) {
        this.c = j;
    }

    public void J(f6e f6e) {
        this.I0 = f6e;
    }

    public void K(TimeInterpolator timeInterpolator) {
        this.o = timeInterpolator;
    }

    public void L(ece ece) {
        if (ece == null) {
            this.J0 = O0;
        } else {
            this.J0 = ece;
        }
    }

    public void M(c9e c9e) {
        this.H0 = c9e;
    }

    public void N(long j) {
        this.b = j;
    }

    public final void O() {
        if (this.B0 == 0) {
            A(this, xff.b, false);
            this.D0 = false;
        }
        this.B0++;
    }

    public String P(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.o != null) {
            sb.append("interp(");
            sb.append(this.o);
            sb.append(") ");
        }
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        ArrayList arrayList2 = this.w;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(xrf xrf) {
        if (this.F0 == null) {
            this.F0 = new ArrayList();
        }
        this.F0.add(xrf);
    }

    public void b(int i) {
        if (i != 0) {
            this.v.add(Integer.valueOf(i));
        }
    }

    public void c(View view) {
        this.w.add(view);
    }

    public void e() {
        ArrayList arrayList = this.z0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0);
        this.A0 = M0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.A0 = animatorArr;
        A(this, xff.o, false);
    }

    public abstract void f(isf isf);

    public final void g(View view, boolean z2) {
        if (view != null) {
            int id = view.getId();
            ArrayList arrayList = this.x;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                if (view.getParent() instanceof ViewGroup) {
                    isf isf = new isf(view);
                    if (z2) {
                        i(isf);
                    } else {
                        f(isf);
                    }
                    isf.c.add(this);
                    h(isf);
                    if (z2) {
                        d(this.X, view, isf);
                    } else {
                        d(this.Y, view, isf);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList2 = this.y;
                    if (arrayList2 == null || !arrayList2.contains(Integer.valueOf(id))) {
                        ArrayList arrayList3 = this.z;
                        if (arrayList3 == null || !arrayList3.contains(view)) {
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                                g(viewGroup.getChildAt(i), z2);
                            }
                        }
                    }
                }
            }
        }
    }

    public void h(isf isf) {
        if (this.H0 != null) {
            HashMap hashMap = isf.a;
            if (!hashMap.isEmpty()) {
                this.H0.getClass();
                String[] strArr = c9e.c;
                for (int i = 0; i < 2; i++) {
                    if (!hashMap.containsKey(strArr[i])) {
                        this.H0.getClass();
                        Integer num = (Integer) hashMap.get("android:visibility:visibility");
                        View view = isf.b;
                        if (num == null) {
                            num = Integer.valueOf(view.getVisibility());
                        }
                        hashMap.put("android:visibilityPropagation:visibility", num);
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        int round = Math.round(view.getTranslationX()) + iArr[0];
                        iArr[0] = round;
                        iArr[0] = (view.getWidth() / 2) + round;
                        int round2 = Math.round(view.getTranslationY()) + iArr[1];
                        iArr[1] = round2;
                        iArr[1] = (view.getHeight() / 2) + round2;
                        hashMap.put("android:visibilityPropagation:center", iArr);
                        return;
                    }
                }
            }
        }
    }

    public abstract void i(isf isf);

    public final void j(ViewGroup viewGroup, boolean z2) {
        k(z2);
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        ArrayList arrayList2 = this.w;
        if (size > 0 || arrayList2.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
                if (findViewById != null) {
                    isf isf = new isf(findViewById);
                    if (z2) {
                        i(isf);
                    } else {
                        f(isf);
                    }
                    isf.c.add(this);
                    h(isf);
                    if (z2) {
                        d(this.X, findViewById, isf);
                    } else {
                        d(this.Y, findViewById, isf);
                    }
                }
            }
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                View view = (View) arrayList2.get(i2);
                isf isf2 = new isf(view);
                if (z2) {
                    i(isf2);
                } else {
                    f(isf2);
                }
                isf2.c.add(this);
                h(isf2);
                if (z2) {
                    d(this.X, view, isf2);
                } else {
                    d(this.Y, view, isf2);
                }
            }
            return;
        }
        g(viewGroup, z2);
    }

    public final void k(boolean z2) {
        if (z2) {
            ((ts) this.X.a).clear();
            ((SparseArray) this.X.b).clear();
            ((ya8) this.X.c).a();
            return;
        }
        ((ts) this.Y.a).clear();
        ((SparseArray) this.Y.b).clear();
        ((ya8) this.Y.c).a();
    }

    /* renamed from: l */
    public yrf clone() {
        try {
            yrf yrf = (yrf) super.clone();
            yrf.G0 = new ArrayList();
            yrf.X = new qpg(12);
            yrf.Y = new qpg(12);
            yrf.w0 = null;
            yrf.x0 = null;
            yrf.getClass();
            yrf.E0 = this;
            yrf.F0 = null;
            return yrf;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator m(ViewGroup viewGroup, isf isf, isf isf2) {
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [urf, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a5, code lost:
        if (r27.getLayoutDirection() == 1) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a9, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b6, code lost:
        if (r27.getLayoutDirection() == 1) goto L_0x01a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(android.view.ViewGroup r27, defpackage.qpg r28, defpackage.qpg r29, java.util.ArrayList r30, java.util.ArrayList r31) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            ts r2 = t()
            android.util.SparseIntArray r3 = new android.util.SparseIntArray
            r3.<init>()
            int r4 = r30.size()
            yrf r5 = r26.s()
            r5.getClass()
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
        L_0x001e:
            if (r9 >= r4) goto L_0x025d
            r10 = r30
            java.lang.Object r11 = r10.get(r9)
            isf r11 = (defpackage.isf) r11
            r12 = r31
            java.lang.Object r13 = r12.get(r9)
            isf r13 = (defpackage.isf) r13
            if (r11 == 0) goto L_0x003b
            java.util.ArrayList r15 = r11.c
            boolean r15 = r15.contains(r0)
            if (r15 != 0) goto L_0x003b
            r11 = 0
        L_0x003b:
            if (r13 == 0) goto L_0x0046
            java.util.ArrayList r15 = r13.c
            boolean r15 = r15.contains(r0)
            if (r15 != 0) goto L_0x0046
            r13 = 0
        L_0x0046:
            if (r11 != 0) goto L_0x0052
            if (r13 != 0) goto L_0x0052
        L_0x004a:
            r18 = r4
            r20 = r9
        L_0x004e:
            r17 = 0
            goto L_0x0255
        L_0x0052:
            if (r11 == 0) goto L_0x005c
            if (r13 == 0) goto L_0x005c
            boolean r15 = r0.x(r11, r13)
            if (r15 == 0) goto L_0x004a
        L_0x005c:
            android.animation.Animator r15 = r0.m(r1, r11, r13)
            if (r15 == 0) goto L_0x004a
            java.lang.String r14 = r0.a
            if (r13 == 0) goto L_0x00e3
            java.lang.String[] r6 = r26.u()
            android.view.View r5 = r13.b
            r18 = r4
            if (r6 == 0) goto L_0x00dc
            int r4 = r6.length
            if (r4 <= 0) goto L_0x00dc
            isf r4 = new isf
            r4.<init>(r5)
            r10 = r29
            java.lang.Object r12 = r10.a
            ts r12 = (defpackage.ts) r12
            java.lang.Object r12 = r12.get(r5)
            isf r12 = (defpackage.isf) r12
            if (r12 == 0) goto L_0x00a7
            r19 = r15
            r10 = 0
        L_0x0089:
            int r15 = r6.length
            if (r10 >= r15) goto L_0x00a4
            java.util.HashMap r15 = r4.a
            r20 = r9
            r9 = r6[r10]
            r21 = r6
            java.util.HashMap r6 = r12.a
            java.lang.Object r6 = r6.get(r9)
            r15.put(r9, r6)
            int r10 = r10 + 1
            r9 = r20
            r6 = r21
            goto L_0x0089
        L_0x00a4:
            r20 = r9
            goto L_0x00ab
        L_0x00a7:
            r20 = r9
            r19 = r15
        L_0x00ab:
            int r6 = r2.c
            r9 = 0
        L_0x00ae:
            if (r9 >= r6) goto L_0x00d9
            java.lang.Object r10 = r2.f(r9)
            android.animation.Animator r10 = (android.animation.Animator) r10
            java.lang.Object r10 = r2.get(r10)
            urf r10 = (defpackage.urf) r10
            isf r12 = r10.c
            if (r12 == 0) goto L_0x00d6
            android.view.View r12 = r10.a
            if (r12 != r5) goto L_0x00d6
            java.lang.String r12 = r10.b
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x00d6
            isf r10 = r10.c
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L_0x00d6
            r15 = 0
            goto L_0x00ec
        L_0x00d6:
            int r9 = r9 + 1
            goto L_0x00ae
        L_0x00d9:
            r15 = r19
            goto L_0x00ec
        L_0x00dc:
            r20 = r9
            r19 = r15
            r15 = r19
            goto L_0x00eb
        L_0x00e3:
            r18 = r4
            r20 = r9
            r19 = r15
            android.view.View r5 = r11.b
        L_0x00eb:
            r4 = 0
        L_0x00ec:
            if (r15 == 0) goto L_0x004e
            c9e r6 = r0.H0
            if (r6 == 0) goto L_0x0232
            if (r11 != 0) goto L_0x00fe
            if (r13 != 0) goto L_0x00fe
            r28 = r2
            r9 = 0
            r17 = 0
            goto L_0x0223
        L_0x00fe:
            f6e r12 = r0.I0
            if (r12 != 0) goto L_0x0104
            r12 = 0
            goto L_0x0108
        L_0x0104:
            android.graphics.Rect r12 = r12.z()
        L_0x0108:
            r19 = -1
            if (r13 == 0) goto L_0x0128
            r21 = 8
            if (r11 != 0) goto L_0x0111
            goto L_0x0122
        L_0x0111:
            java.util.HashMap r9 = r11.a
            java.lang.String r10 = "android:visibilityPropagation:visibility"
            java.lang.Object r9 = r9.get(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L_0x011e
            goto L_0x0122
        L_0x011e:
            int r21 = r9.intValue()
        L_0x0122:
            if (r21 != 0) goto L_0x0125
            goto L_0x0128
        L_0x0125:
            r11 = r13
            r9 = 1
            goto L_0x012a
        L_0x0128:
            r9 = r19
        L_0x012a:
            java.lang.String r10 = "android:visibilityPropagation:center"
            if (r11 != 0) goto L_0x0131
        L_0x012e:
            r13 = r19
            goto L_0x0140
        L_0x0131:
            java.util.HashMap r13 = r11.a
            java.lang.Object r13 = r13.get(r10)
            int[] r13 = (int[]) r13
            if (r13 != 0) goto L_0x013c
            goto L_0x012e
        L_0x013c:
            r17 = 0
            r13 = r13[r17]
        L_0x0140:
            if (r11 != 0) goto L_0x0144
        L_0x0142:
            r11 = 1
            goto L_0x0152
        L_0x0144:
            java.util.HashMap r11 = r11.a
            java.lang.Object r10 = r11.get(r10)
            int[] r10 = (int[]) r10
            if (r10 != 0) goto L_0x014f
            goto L_0x0142
        L_0x014f:
            r11 = 1
            r19 = r10[r11]
        L_0x0152:
            r10 = 2
            int[] r11 = new int[r10]
            r1.getLocationOnScreen(r11)
            r17 = 0
            r21 = r11[r17]
            float r22 = r27.getTranslationX()
            int r22 = java.lang.Math.round(r22)
            int r22 = r22 + r21
            r16 = 1
            r11 = r11[r16]
            float r21 = r27.getTranslationY()
            int r21 = java.lang.Math.round(r21)
            int r21 = r21 + r11
            int r11 = r27.getWidth()
            int r11 = r11 + r22
            int r23 = r27.getHeight()
            int r23 = r23 + r21
            if (r12 == 0) goto L_0x018b
            int r10 = r12.centerX()
            int r12 = r12.centerY()
            goto L_0x0197
        L_0x018b:
            int r12 = r22 + r11
            int r12 = r12 / r10
            int r24 = r21 + r23
            int r10 = r24 / 2
            r25 = r12
            r12 = r10
            r10 = r25
        L_0x0197:
            int r1 = r6.b
            r28 = r2
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 != r2) goto L_0x01ac
            int r1 = r27.getLayoutDirection()
            r2 = 1
            if (r1 != r2) goto L_0x01a9
        L_0x01a7:
            r1 = 5
            goto L_0x01aa
        L_0x01a9:
            r1 = 3
        L_0x01aa:
            r2 = 3
            goto L_0x01b9
        L_0x01ac:
            r2 = 8388613(0x800005, float:1.175495E-38)
            if (r1 != r2) goto L_0x01aa
            int r1 = r27.getLayoutDirection()
            r2 = 1
            if (r1 != r2) goto L_0x01a7
            goto L_0x01a9
        L_0x01b9:
            if (r1 == r2) goto L_0x01e7
            r2 = 5
            if (r1 == r2) goto L_0x01dd
            r2 = 48
            if (r1 == r2) goto L_0x01d3
            r2 = 80
            if (r1 == r2) goto L_0x01c9
            r1 = r17
            goto L_0x01ef
        L_0x01c9:
            int r19 = r19 - r21
            int r10 = r10 - r13
            int r1 = java.lang.Math.abs(r10)
            int r1 = r1 + r19
            goto L_0x01ef
        L_0x01d3:
            int r23 = r23 - r19
            int r10 = r10 - r13
            int r1 = java.lang.Math.abs(r10)
            int r1 = r1 + r23
            goto L_0x01ef
        L_0x01dd:
            int r13 = r13 - r22
            int r12 = r12 - r19
            int r1 = java.lang.Math.abs(r12)
            int r1 = r1 + r13
            goto L_0x01ef
        L_0x01e7:
            int r11 = r11 - r13
            int r12 = r12 - r19
            int r1 = java.lang.Math.abs(r12)
            int r1 = r1 + r11
        L_0x01ef:
            float r1 = (float) r1
            int r2 = r6.b
            r10 = 3
            if (r2 == r10) goto L_0x0207
            r10 = 5
            if (r2 == r10) goto L_0x0207
            r10 = 8388611(0x800003, float:1.1754948E-38)
            if (r2 == r10) goto L_0x0207
            r10 = 8388613(0x800005, float:1.175495E-38)
            if (r2 == r10) goto L_0x0207
            int r2 = r27.getHeight()
            goto L_0x020b
        L_0x0207:
            int r2 = r27.getWidth()
        L_0x020b:
            float r2 = (float) r2
            float r1 = r1 / r2
            long r10 = r0.c
            r12 = 0
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x0217
            r10 = 300(0x12c, double:1.48E-321)
        L_0x0217:
            long r12 = (long) r9
            long r10 = r10 * r12
            float r2 = (float) r10
            float r6 = r6.a
            float r2 = r2 / r6
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            long r9 = (long) r1
        L_0x0223:
            java.util.ArrayList r1 = r0.G0
            int r1 = r1.size()
            int r2 = (int) r9
            r3.put(r1, r2)
            long r7 = java.lang.Math.min(r9, r7)
            goto L_0x0236
        L_0x0232:
            r28 = r2
            r17 = 0
        L_0x0236:
            urf r1 = new urf
            android.view.WindowId r2 = r27.getWindowId()
            r1.<init>()
            r1.a = r5
            r1.b = r14
            r1.c = r4
            r1.d = r2
            r1.e = r0
            r1.f = r15
            r2 = r28
            r2.put(r15, r1)
            java.util.ArrayList r1 = r0.G0
            r1.add(r15)
        L_0x0255:
            int r9 = r20 + 1
            r1 = r27
            r4 = r18
            goto L_0x001e
        L_0x025d:
            r17 = 0
            int r1 = r3.size()
            if (r1 == 0) goto L_0x0294
            r5 = r17
        L_0x0267:
            int r1 = r3.size()
            if (r5 >= r1) goto L_0x0294
            int r1 = r3.keyAt(r5)
            java.util.ArrayList r4 = r0.G0
            java.lang.Object r1 = r4.get(r1)
            android.animation.Animator r1 = (android.animation.Animator) r1
            java.lang.Object r1 = r2.get(r1)
            urf r1 = (defpackage.urf) r1
            int r4 = r3.valueAt(r5)
            long r9 = (long) r4
            long r9 = r9 - r7
            android.animation.Animator r4 = r1.f
            long r11 = r4.getStartDelay()
            long r11 = r11 + r9
            android.animation.Animator r1 = r1.f
            r1.setStartDelay(r11)
            int r5 = r5 + 1
            goto L_0x0267
        L_0x0294:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrf.n(android.view.ViewGroup, qpg, qpg, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void o() {
        int i = this.B0 - 1;
        this.B0 = i;
        if (i == 0) {
            A(this, xff.c, false);
            for (int i2 = 0; i2 < ((ya8) this.X.c).k(); i2++) {
                View view = (View) ((ya8) this.X.c).l(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((ya8) this.Y.c).k(); i3++) {
                View view2 = (View) ((ya8) this.Y.c).l(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.D0 = true;
        }
    }

    public void p(int i) {
        ArrayList arrayList = this.x;
        if (i > 0) {
            Integer valueOf = Integer.valueOf(i);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(valueOf)) {
                arrayList.add(valueOf);
            }
        }
        this.x = arrayList;
    }

    public void q(ViewGroup viewGroup) {
        ts t = t();
        int i = t.c;
        if (viewGroup != null && i != 0) {
            WindowId windowId = viewGroup.getWindowId();
            ts tsVar = new ts(t);
            t.clear();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                urf urf = (urf) tsVar.i(i2);
                if (urf.a != null && windowId.equals(urf.d)) {
                    ((Animator) tsVar.f(i2)).end();
                }
            }
        }
    }

    public final isf r(View view, boolean z2) {
        gsf gsf = this.Z;
        if (gsf != null) {
            return gsf.r(view, z2);
        }
        ArrayList arrayList = z2 ? this.w0 : this.x0;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            isf isf = (isf) arrayList.get(i);
            if (isf == null) {
                return null;
            }
            if (isf.b == view) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        return (isf) (z2 ? this.x0 : this.w0).get(i);
    }

    public final yrf s() {
        gsf gsf = this.Z;
        return gsf != null ? gsf.s() : this;
    }

    public final String toString() {
        return P("");
    }

    public String[] u() {
        return null;
    }

    public final isf v(View view, boolean z2) {
        gsf gsf = this.Z;
        if (gsf != null) {
            return gsf.v(view, z2);
        }
        return (isf) ((ts) (z2 ? this.X : this.Y).a).get(view);
    }

    public boolean w() {
        return !this.z0.isEmpty();
    }

    public boolean x(isf isf, isf isf2) {
        if (isf == null || isf2 == null) {
            return false;
        }
        String[] u = u();
        if (u != null) {
            int length = u.length;
            int i = 0;
            while (i < length) {
                if (!z(isf, isf2, u[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String z2 : isf.a.keySet()) {
            if (z(isf, isf2, z2)) {
            }
        }
        return false;
        return true;
    }

    public final boolean y(View view) {
        int id = view.getId();
        ArrayList arrayList = this.x;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList2 = this.v;
        int size = arrayList2.size();
        ArrayList arrayList3 = this.w;
        return (size == 0 && arrayList3.size() == 0) || arrayList2.contains(Integer.valueOf(id)) || arrayList3.contains(view);
    }
}
