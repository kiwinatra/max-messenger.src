package ru.ok.messages.views.fragments.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.messages.views.dialogs.ProgressDialog;

public abstract class FrgBase extends a implements xhf, vuf, dq7 {
    public final xme A1 = f6e.a((Object) null);
    public final String l1 = getClass().getSimpleName();
    public ro4 m1;
    public boolean n1 = true;
    public boolean o1 = false;
    public dm4 p1;
    public sjd q1;
    public scf r1;
    public final HashSet s1 = new HashSet();
    public t8 t1;
    public gdb u1;
    public long v1 = 0;
    public ProgressDialog w1;
    public dac x1;
    public kc3 y1;
    public ArrayList z1;

    public FrgBase() {
    }

    public final void B2(Bundle bundle) {
        this.Q0 = true;
    }

    public final scf K0() {
        return this.r1;
    }

    public void T0(ij0 ij0) {
        ryg.S(this.s1, ij0, true);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, kc3] */
    public final void T2(mq4 mq4) {
        if (this.y1 == null) {
            this.y1 = new Object();
        }
        this.y1.a(mq4);
    }

    public final void U2() {
        m5 X2 = X2();
        if (X2 != null) {
            X2.finish();
        }
    }

    public String V2() {
        return null;
    }

    public final Object W2(String str, u2f u2f) {
        b M1 = M1();
        if (M1 instanceof m5) {
            m5 m5Var = (m5) M1;
            Object obj = m5Var.y0.get(str);
            if (obj != null) {
                return obj;
            }
            Object obj2 = u2f.get();
            m5Var.y0.put(str, obj2);
            return obj2;
        } else if (M1 == null) {
            throw new IllegalStateException("Activity is null when tried to get retained object");
        } else {
            throw new IllegalStateException("Activity must be a child ActBase, activity is " + M1);
        }
    }

    public final m5 X2() {
        if (M1() == null || M1().isFinishing()) {
            return null;
        }
        return (m5) M1();
    }

    public final b33 Y2() {
        b M1 = M1();
        if (!(M1 instanceof kmf)) {
            return null;
        }
        kmf kmf = (kmf) M1;
        if (kmf.q1() != null) {
            return kmf.q1();
        }
        return null;
    }

    public void Z2(View view) {
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [androidx.fragment.app.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a3() {
        /*
            r4 = this;
            ru.ok.messages.views.dialogs.ProgressDialog r0 = r4.w1
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0015
            r0.T2(r2, r2)     // Catch:{ Exception -> 0x000a }
            goto L_0x0012
        L_0x000a:
            r0 = move-exception
            java.lang.String r2 = r4.l1
            java.lang.String r3 = "Can't hideProgressDialog"
            defpackage.z68.f(r2, r3, r0)
        L_0x0012:
            r4.w1 = r1
            goto L_0x002f
        L_0x0015:
            androidx.fragment.app.c r4 = r4.D0
            if (r4 == 0) goto L_0x002f
            java.lang.String r0 = "ru.ok.messages.views.dialogs.ProgressDialog"
            androidx.fragment.app.a r4 = r4.E(r0)
            boolean r0 = r4 instanceof ru.ok.messages.views.dialogs.ProgressDialog
            if (r0 == 0) goto L_0x0026
            r1 = r4
            ru.ok.messages.views.dialogs.ProgressDialog r1 = (ru.ok.messages.views.dialogs.ProgressDialog) r1
        L_0x0026:
            if (r1 == 0) goto L_0x002f
            boolean r4 = r1.D1
            if (r4 == 0) goto L_0x002f
            r1.T2(r2, r2)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.fragments.base.FrgBase.a3():void");
    }

    public void b3(int i, int i2, Intent intent) {
    }

    public void c3(m5 m5Var) {
        this.n1 = false;
    }

    public boolean d3() {
        return false;
    }

    public void e3(int i, String[] strArr, int[] iArr) {
    }

    public final void f2(int i, int i2, Intent intent) {
        super.f2(i, i2, intent);
        if (isActive()) {
            b3(i, i2, intent);
        } else {
            this.t1 = new t8(i, i2, intent);
        }
    }

    public final ProgressDialog f3(int i, boolean z) {
        if (!isActive()) {
            return null;
        }
        a3();
        ProgressDialog b3 = ProgressDialog.b3(S1(i), z, this.D0, (String) null);
        this.w1 = b3;
        return b3;
    }

    public final void g2(Activity activity) {
        this.Q0 = true;
        z68.c(this.l1, "lifecycle: onAttach", new Object[0]);
        if (activity instanceof m5) {
            this.n1 = true;
            c3((m5) activity);
            return;
        }
        throw new IllegalStateException("Use FrgBase only in ActBase subclasses.");
    }

    public final ProgressDialog g3(boolean z) {
        return f3(qad.B1, z);
    }

    public void i2(Bundle bundle) {
        m5 m5Var = (m5) M1();
        dm4 dm4 = m5Var.x;
        this.p1 = dm4;
        ((qra) ((id3) dm4.b)).getClass();
        this.q1 = sjd.a;
        this.r1 = m5Var.K0();
        this.m1 = (ro4) this.p1.c;
        super.i2(bundle);
        z68.c(this.l1, "lifecycle: onCreate", new Object[0]);
        if (!this.n1) {
            if (bundle != null) {
                ryg.L(bundle, this.s1);
            }
            ((qra) ((id3) this.p1.b)).J().d(this);
            this.z1 = new ArrayList();
            return;
        }
        throw new IllegalStateException("super.onAttachBase() not called");
    }

    public boolean isActive() {
        return this.o1;
    }

    public void l2() {
        z68.c(this.l1, "lifecycle: onDestroy", new Object[0]);
        ((qra) ((id3) this.p1.b)).J().f(this);
        this.Q0 = true;
        this.z1.clear();
    }

    public void m2() {
        z68.a(this.l1, "lifecycle: onDestroyView");
        kc3 kc3 = this.y1;
        if (kc3 != null) {
            kc3.d();
        }
        this.Q0 = true;
    }

    public void n0() {
        a3();
    }

    public void n2() {
        this.Q0 = true;
        z68.a(this.l1, "lifecycle: onDetach");
    }

    public void p2(boolean z) {
        z68.c(this.l1, "onHiddenChanged %b", Boolean.valueOf(z));
        xme xme = this.A1;
        Boolean valueOf = Boolean.valueOf(z);
        xme.getClass();
        xme.m((Object) null, valueOf);
    }

    public boolean t(int i, KeyEvent keyEvent) {
        Iterator it = this.z1.iterator();
        while (it.hasNext()) {
            if (((dq7) it.next()).t(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public void t2() {
        this.Q0 = true;
        z68.a(this.l1, "lifecycle: onPause");
        this.o1 = false;
        if (!TextUtils.isEmpty(V2())) {
            ((qra) ((id3) this.p1.b)).c().k(SystemClock.elapsedRealtime() - this.v1, V2());
        }
    }

    public void v2(int i, String[] strArr, int[] iArr) {
        n54.E(O1(), strArr, iArr);
        if (isActive()) {
            dac dac = this.x1;
            if (dac != null) {
                dac.d(new gdb(i, strArr, iArr));
            }
            e3(i, strArr, iArr);
            return;
        }
        this.u1 = new gdb(i, strArr, iArr);
    }

    public void w2() {
        this.Q0 = true;
        String str = this.l1;
        z68.c(str, "lifecycle: onResume", new Object[0]);
        StringBuilder sb = new StringBuilder("unhandled events: ");
        HashSet hashSet = this.s1;
        sb.append(hashSet.size());
        z68.c(str, sb.toString(), new Object[0]);
        this.o1 = true;
        this.v1 = SystemClock.elapsedRealtime();
        if (((sjd) tr1.h((qra) ((id3) this.p1.b))).e().e()) {
            jd8 J = ((qra) ((id3) this.p1.b)).J();
            int i = ryg.i;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                J.c((ij0) it.next());
            }
            hashSet.clear();
        }
        gdb gdb = this.u1;
        if (gdb != null) {
            dac dac = this.x1;
            if (dac != null) {
                dac.d(gdb);
            }
            gdb gdb2 = this.u1;
            e3(gdb2.a, gdb2.b, gdb2.c);
            this.u1 = null;
        }
        t8 t8Var = this.t1;
        if (t8Var != null) {
            b3(t8Var.a, t8Var.b, t8Var.c);
            this.t1 = null;
        }
    }

    public void x2(Bundle bundle) {
        HashSet hashSet = this.s1;
        int i = ryg.i;
        z68.a("ryg", "onSaveInstanceState");
        bundle.putSerializable("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS", new ArrayList(hashSet));
    }

    public void y2() {
        this.Q0 = true;
        z68.a(this.l1, "lifecycle: onStart");
    }

    public void z2() {
        this.Q0 = true;
        z68.a(this.l1, "lifecycle: onStop");
    }

    public FrgBase(int i) {
        super(i);
    }
}
