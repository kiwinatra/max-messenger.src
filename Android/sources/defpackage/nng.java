package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: nng  reason: default package */
public final class nng extends b8 implements k69 {
    public final Context c;
    public final m69 o;
    public a8 v;
    public WeakReference w;
    public final /* synthetic */ ong x;

    public nng(ong ong, Context context, p7d p7d) {
        this.x = ong;
        this.c = context;
        this.v = p7d;
        m69 m69 = new m69(context);
        m69.Z = 1;
        this.o = m69;
        m69.v = this;
    }

    public final void a() {
        ong ong = this.x;
        if (ong.E == this) {
            if (ong.L) {
                ong.F = this;
                ong.G = this.v;
            } else {
                this.v.i(this);
            }
            this.v = null;
            ong.h0(false);
            ActionBarContextView actionBarContextView = ong.B;
            if (actionBarContextView.w0 == null) {
                actionBarContextView.e();
            }
            ong.y.setHideOnContentScrollEnabled(ong.Q);
            ong.E = null;
        }
    }

    public final View b() {
        WeakReference weakReference = this.w;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final m69 c() {
        return this.o;
    }

    public final MenuInflater d() {
        return new c3f(this.c);
    }

    public final CharSequence e() {
        return this.x.B.getSubtitle();
    }

    public final CharSequence f() {
        return this.x.B.getTitle();
    }

    public final void g() {
        if (this.x.E == this) {
            m69 m69 = this.o;
            m69.w();
            try {
                this.v.p(this, m69);
            } finally {
                m69.v();
            }
        }
    }

    public final boolean h(m69 m69, MenuItem menuItem) {
        a8 a8Var = this.v;
        if (a8Var != null) {
            return a8Var.b(this, menuItem);
        }
        return false;
    }

    public final boolean i() {
        return this.x.B.E0;
    }

    public final void j(View view) {
        this.x.B.setCustomView(view);
        this.w = new WeakReference(view);
    }

    public final void k(int i) {
        l(this.x.w.getResources().getString(i));
    }

    public final void l(CharSequence charSequence) {
        this.x.B.setSubtitle(charSequence);
    }

    public final void m(int i) {
        n(this.x.w.getResources().getString(i));
    }

    public final void n(CharSequence charSequence) {
        this.x.B.setTitle(charSequence);
    }

    public final void o(m69 m69) {
        if (this.v != null) {
            g();
            w7 w7Var = this.x.B.o;
            if (w7Var != null) {
                w7Var.k();
            }
        }
    }

    public final void p(boolean z) {
        this.a = z;
        this.x.B.setTitleOptional(z);
    }
}
