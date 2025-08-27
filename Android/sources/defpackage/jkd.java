package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.search.KeyboardHandlerSearchView;

/* renamed from: jkd  reason: default package */
public final class jkd implements kq7, fr7, ng4 {
    public ikd X;
    public final hr7 Y;
    public boolean Z = true;
    public final yva a;
    public final String b;
    public final fj c;
    public final scf o;
    public final int v;
    public String w = "";
    public or7 x;
    public boolean y;
    public Toolbar z;

    public jkd(fj fjVar, int i, String str, scf scf, hkd hkd, yva yva, ju7 ju7) {
        this.c = fjVar;
        this.v = i;
        this.b = str;
        this.a = yva;
        this.o = scf;
        if (ju7 != null) {
            ju7.a(this);
            hr7 hr7 = new hr7(1, fjVar.r().getWindow().getDecorView(), this);
            this.Y = hr7;
            ju7.a(hr7);
            return;
        }
        this.Y = null;
    }

    public final void P() {
        this.Z = true;
    }

    public final void a(Toolbar toolbar) {
        Menu menu = toolbar.getMenu();
        if (menu.findItem(lic.menu_search__search) == null) {
            MenuItem add = menu.add(0, lic.menu_search__search, 1, qad.n5);
            add.setIcon(nad.t1);
            add.setShowAsAction(10);
            add.setActionView(ujc.layout_search_view);
            iq.g(this.o, menu, (Integer) null);
        }
    }

    public final ikd b() {
        ikd ikd = this.X;
        if (ikd != null) {
            return ikd;
        }
        fj fjVar = this.c;
        a aVar = (a) ((WeakReference) fjVar.b).get();
        if (aVar instanceof ikd) {
            return (ikd) aVar;
        }
        b r = fjVar.r();
        if (r instanceof ikd) {
            return (ikd) r;
        }
        return null;
    }

    public final MenuItem c() {
        Toolbar toolbar = this.z;
        if (toolbar == null) {
            return null;
        }
        return toolbar.getMenu().findItem(this.v);
    }

    public final KeyboardHandlerSearchView e() {
        MenuItem c2 = c();
        if (c2 == null) {
            return null;
        }
        return (KeyboardHandlerSearchView) c2.getActionView();
    }

    public final void f(String str, Bundle bundle) {
        this.w = bundle.getString(str.concat("ru.ok.tamtam.extra.SEARCH_QUERY"), "");
        this.Z = bundle.getBoolean("ru.ok.tamtam.extra.KEYBOARD_VISIBLE");
        boolean z2 = bundle.getBoolean(str.concat("ru.ok.tamtam.extra.SEARCH_VISIBLE"), false);
        this.y = z2;
        if (z2 && e() != null) {
            h(this.w);
        }
    }

    public final void g(String str, Bundle bundle) {
        String concat = str.concat("ru.ok.tamtam.extra.SEARCH_QUERY");
        KeyboardHandlerSearchView e = e();
        bundle.putString(concat, (e != null ? e.getQuery() : "").toString());
        bundle.putBoolean(str.concat("ru.ok.tamtam.extra.SEARCH_VISIBLE"), this.y);
        bundle.putBoolean("ru.ok.tamtam.extra.KEYBOARD_VISIBLE", this.Z);
    }

    public final void h(String str) {
        this.w = str;
        or7 or7 = this.x;
        if (or7 != null && !or7.f()) {
            or7 or72 = this.x;
            or72.getClass();
            qq4.a(or72);
        }
        MenuItem c2 = c();
        if (c2 != null) {
            c2.expandActionView();
            KeyboardHandlerSearchView keyboardHandlerSearchView = (KeyboardHandlerSearchView) c2.getActionView();
            CharSequence c3 = this.a.k.c(str);
            if (keyboardHandlerSearchView != null) {
                keyboardHandlerSearchView.setQuery(c3, true);
                k(keyboardHandlerSearchView);
                return;
            }
            return;
        }
        throw new IllegalStateException("SearchItem is null");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: jv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: jv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: jv} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(android.content.Context r2, boolean r3, defpackage.b33 r4) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x000d
            java.lang.Object r2 = r4.c
            androidx.appcompat.widget.Toolbar r2 = (androidx.appcompat.widget.Toolbar) r2
            r1.a(r2)
            r1.j(r2)
            goto L_0x0042
        L_0x000d:
            java.lang.Object r3 = r4.c
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            r1.a(r3)
            o5h r4 = new o5h
            r0 = 1
            r4.<init>(r2, r0)
            int r2 = defpackage.ujc.layout_search_view
            fkd r0 = new fkd
            r0.<init>(r1, r3)
            java.lang.Object r1 = r4.c
            kv r1 = (defpackage.kv) r1
            xqb r3 = r1.b
            java.lang.Object r3 = r3.c()
            jv r3 = (defpackage.jv) r3
            if (r3 != 0) goto L_0x0034
            jv r3 = new jv
            r3.<init>()
        L_0x0034:
            r3.a = r4
            r3.c = r2
            r2 = 0
            r3.b = r2
            r3.e = r0
            java.util.concurrent.ArrayBlockingQueue r1 = r1.a     // Catch:{ InterruptedException -> 0x0043 }
            r1.put(r3)     // Catch:{ InterruptedException -> 0x0043 }
        L_0x0042:
            return
        L_0x0043:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Failed to enqueue async inflate request"
            r2.<init>(r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkd.i(android.content.Context, boolean, b33):void");
    }

    public final void j(Toolbar toolbar) {
        this.z = toolbar;
        KeyboardHandlerSearchView e = e();
        if (e != null) {
            e.setListener(this);
            hn4 n = ((qra) ym.e()).n();
            Context context = e.getContext();
            n.getClass();
            e.setMaxWidth(hn4.k(context).getHeight());
            e.setQueryHint(this.b);
            EditText editText = (EditText) e.findViewById(egc.search_src_text);
            scf scf = this.o;
            editText.setTextColor(scf.G);
            editText.setHintTextColor(scf.N);
            iq.W(editText, scf.l);
            ((ImageView) e.findViewById(egc.search_close_btn)).setColorFilter(scf.x);
            MenuItem c2 = c();
            if (c2 != null) {
                c2.setOnActionExpandListener(new x69(1, this, e));
            }
        }
    }

    public final void k(KeyboardHandlerSearchView keyboardHandlerSearchView) {
        lja s = new imd(keyboardHandlerSearchView, 0).i(200, TimeUnit.MILLISECONDS).s(qe.a());
        or7 or7 = new or7(new y3a(28, (Object) this), m58.g, m58.e);
        Objects.requireNonNull(or7, "observer is null");
        try {
            s.a(new nka(or7));
            this.x = or7;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            hd8.Z(th);
            n54.D(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final void onDestroy(jv7 jv7) {
        jv7.getLifecycle().b(this);
        ju7 lifecycle = jv7.getLifecycle();
        hr7 hr7 = this.Y;
        hr7.getClass();
        lifecycle.b(hr7);
    }

    public final void onResume(jv7 jv7) {
        KeyboardHandlerSearchView e = e();
        if (!this.Z && e != null) {
            e.clearFocus();
        }
    }
}
