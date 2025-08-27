package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: zie  reason: default package */
public final class zie extends b8 implements k69 {
    public Context c;
    public ActionBarContextView o;
    public a8 v;
    public WeakReference w;
    public boolean x;
    public m69 y;

    public final void a() {
        if (!this.x) {
            this.x = true;
            this.v.i(this);
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
        return this.y;
    }

    public final MenuInflater d() {
        return new c3f(this.o.getContext());
    }

    public final CharSequence e() {
        return this.o.getSubtitle();
    }

    public final CharSequence f() {
        return this.o.getTitle();
    }

    public final void g() {
        this.v.p(this, this.y);
    }

    public final boolean h(m69 m69, MenuItem menuItem) {
        return this.v.b(this, menuItem);
    }

    public final boolean i() {
        return this.o.E0;
    }

    public final void j(View view) {
        this.o.setCustomView(view);
        this.w = view != null ? new WeakReference(view) : null;
    }

    public final void k(int i) {
        l(this.c.getString(i));
    }

    public final void l(CharSequence charSequence) {
        this.o.setSubtitle(charSequence);
    }

    public final void m(int i) {
        n(this.c.getString(i));
    }

    public final void n(CharSequence charSequence) {
        this.o.setTitle(charSequence);
    }

    public final void o(m69 m69) {
        g();
        w7 w7Var = this.o.o;
        if (w7Var != null) {
            w7Var.k();
        }
    }

    public final void p(boolean z) {
        this.a = z;
        this.o.setTitleOptional(z);
    }
}
