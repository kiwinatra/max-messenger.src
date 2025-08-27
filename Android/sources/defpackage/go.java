package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: go  reason: default package */
public class go extends dc3 implements kn {
    public eo o;
    public final fo v;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public go(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            if (r6 != 0) goto L_0x0014
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int r3 = defpackage.hdc.dialogTheme
            r2.resolveAttribute(r3, r1, r0)
            int r1 = r1.resourceId
            goto L_0x0015
        L_0x0014:
            r1 = r6
        L_0x0015:
            r4.<init>(r5, r1)
            fo r1 = new fo
            r1.<init>(r4)
            r4.v = r1
            rn r4 = r4.d()
            if (r6 != 0) goto L_0x0035
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int r1 = defpackage.hdc.dialogTheme
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L_0x0035:
            r5 = r4
            eo r5 = (defpackage.eo) r5
            r5.c1 = r6
            r4.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go.<init>(android.content.Context, int):void");
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        eo eoVar = (eo) d();
        eoVar.v();
        ((ViewGroup) eoVar.J0.findViewById(16908290)).addView(view, layoutParams);
        eoVar.v0.a(eoVar.Z.getCallback());
    }

    public final rn d() {
        if (this.o == null) {
            qn qnVar = rn.a;
            this.o = new eo(getContext(), getWindow(), this, this);
        }
        return this.o;
    }

    public final void dismiss() {
        super.dismiss();
        d().d();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        fo foVar = this.v;
        if (foVar == null) {
            return false;
        }
        return foVar.a.f(keyEvent);
    }

    public final void e() {
        q8.M(getWindow().getDecorView(), this);
        iq.V(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(wic.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final View findViewById(int i) {
        eo eoVar = (eo) d();
        eoVar.v();
        return eoVar.Z.findViewById(i);
    }

    public final void invalidateOptionsMenu() {
        d().a();
    }

    public void onCreate(Bundle bundle) {
        eo eoVar = (eo) d();
        LayoutInflater from = LayoutInflater.from(eoVar.Y);
        if (from.getFactory() == null) {
            from.setFactory2(eoVar);
        } else {
            boolean z = from.getFactory2() instanceof eo;
        }
        super.onCreate(bundle);
        d().c();
    }

    public final void onStop() {
        super.onStop();
        eo eoVar = (eo) d();
        eoVar.z();
        b59 b59 = eoVar.x0;
        if (b59 != null) {
            b59.X(false);
        }
    }

    public void setContentView(int i) {
        e();
        d().g(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().k(charSequence);
    }

    public void setContentView(View view) {
        e();
        d().i(view);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        d().k(getContext().getString(i));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        d().j(view, layoutParams);
    }
}
