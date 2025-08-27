package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: b33  reason: default package */
public class b33 implements hmf {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object o;
    public Object v;
    public Object w;
    public Object x;
    public Object y;

    public /* synthetic */ b33(l72 l72, gaf gaf, r1f r1f, o1f o1f) {
        this.a = l72;
        this.b = gaf;
        this.c = r1f;
        this.o = o1f;
    }

    public void a(scf scf) {
        this.v = scf;
        iq.g(scf, ((Toolbar) this.c).getMenu(), (Integer) null);
        TextView textView = (TextView) this.w;
        TextView textView2 = (TextView) this.x;
        d53 d53 = (d53) this.o;
        iq.l(scf, (Toolbar) this.c, textView, textView2, d53 == null, scf.G, scf.N);
        if (d53 != null) {
            d53.c();
        }
    }

    public MenuItem b(int i) {
        Toolbar toolbar = (Toolbar) this.c;
        if (toolbar != null) {
            return toolbar.getMenu().findItem(i);
        }
        return null;
    }

    public void c() {
        Toolbar toolbar = (Toolbar) this.c;
        if (toolbar != null) {
            fj fjVar = (fj) this.b;
            if (fjVar.r() != null) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = vo4.a(fjVar.r());
                toolbar.setLayoutParams(layoutParams);
            }
        }
    }

    public void d(CharSequence charSequence) {
        d53 d53 = (d53) this.o;
        if (d53 != null) {
            d53.setCollapsingSubtitle(charSequence);
        }
    }

    public void e(CharSequence charSequence) {
        d53 d53 = (d53) this.o;
        if (d53 != null) {
            d53.setCollapsingTitle(charSequence);
        }
    }

    public void f(int i, boolean z) {
        MenuItem b2 = b(i);
        if (b2 != null) {
            b2.setVisible(z);
            View actionView = b2.getActionView();
            if (actionView != null) {
                actionView.setVisibility(z ? 0 : 8);
            }
        }
    }

    public void g(int i) {
        int i2 = ((scf) this.v).x;
        Toolbar toolbar = (Toolbar) this.c;
        if (toolbar != null) {
            toolbar.setNavigationIcon(i);
            h(i2);
        }
    }

    public void h(int i) {
        Drawable navigationIcon = ((Toolbar) this.c).getNavigationIcon();
        if (navigationIcon != null) {
            iq.a0(navigationIcon, i);
        }
    }

    public void i(View.OnClickListener onClickListener) {
        Toolbar toolbar = (Toolbar) this.c;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(onClickListener);
        }
    }

    public void j(int i, hmf hmf) {
        Toolbar toolbar = (Toolbar) this.c;
        if (toolbar != null) {
            toolbar.getMenu().clear();
            toolbar.m(i);
            if (hmf != null) {
                new gb3(9, toolbar).z(300, TimeUnit.MILLISECONDS).s(qe.a()).a(new or7(new nqd(28, hmf), m58.g, m58.e));
            }
            iq.g((scf) this.v, toolbar.getMenu(), (Integer) null);
        }
    }

    public void k(int i) {
        String str;
        fj fjVar = (fj) this.b;
        if (i == 0) {
            fjVar.getClass();
            str = "";
        } else if (((WeakReference) fjVar.c).get() != null) {
            str = ((hn) ((WeakReference) fjVar.c).get()).getString(i);
        } else {
            WeakReference weakReference = (WeakReference) fjVar.b;
            if (weakReference.get() != null) {
                str = ((a) weakReference.get()).S1(i);
            } else {
                throw new IllegalStateException("ContextWeakWrapper should have Activity or Fragment");
            }
        }
        TextView textView = (TextView) this.w;
        if (textView != null && i != -1) {
            textView.setText(str);
        }
    }

    public void l(String str) {
        TextView textView = (TextView) this.w;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void m(int i) {
        Toolbar toolbar = (Toolbar) this.c;
        if (toolbar != null) {
            toolbar.setVisibility(i);
        }
    }

    public void n() {
        b r = ((fj) this.b).r();
        Toolbar toolbar = (Toolbar) this.c;
        if (toolbar != null && r != null) {
            eo eoVar = (eo) ((hn) r).A();
            if (eoVar.X instanceof Activity) {
                eoVar.z();
                b59 b59 = eoVar.x0;
                if (!(b59 instanceof ong)) {
                    eoVar.y0 = null;
                    if (b59 != null) {
                        b59.N();
                    }
                    eoVar.x0 = null;
                    Object obj = eoVar.X;
                    jmf jmf = new jmf(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : eoVar.z0, eoVar.v0);
                    eoVar.x0 = jmf;
                    eoVar.v0.b = jmf.y;
                    toolbar.setBackInvokedCallbackEnabled(true);
                    eoVar.a();
                    return;
                }
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
        }
    }

    public void o() {
        i53 i53 = (i53) ((d53) this.o);
        if (i53 != null) {
            i53.setContentScrim(new ColorDrawable(((scf) this.v).I));
            i53.setCollapsedTitleTextColor(((scf) this.v).G);
            i53.setExpandedTitleColor(((scf) this.v).G);
            i53.setBackgroundColor(((scf) this.v).O);
            i53.setContentScrimColor(((scf) this.v).O);
            ((Toolbar) this.c).addOnLayoutChangeListener(new mx1(4, this));
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return true;
    }

    public b33(Account account, Set set, String str, String str2) {
        g9e g9e = g9e.a;
        this.a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.o = emptyMap;
        this.v = str;
        this.w = str2;
        this.x = g9e;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = emptyMap.values().iterator();
        if (!it.hasNext()) {
            this.c = Collections.unmodifiableSet(hashSet);
        } else {
            rae.w(it.next());
            throw null;
        }
    }

    public b33(l46 l46, l46 l462, l46 l463, l46 l464, l46 l465, l46 l466, l46 l467, l46 l468) {
        this.a = l46;
        this.b = l462;
        this.c = l463;
        this.o = l464;
        this.v = l465;
        this.w = l466;
        this.x = l467;
        this.y = l468;
    }

    public b33(obd obd) {
        fj fjVar = (fj) obd.c;
        d53 d53 = (d53) obd.v;
        jkd jkd = (jkd) obd.w;
        scf scf = (scf) obd.x;
        boolean z = obd.a;
        if (((WeakReference) fjVar.c).get() != null) {
            Context context = (Context) ((WeakReference) fjVar.c).get();
        } else {
            WeakReference weakReference = (WeakReference) fjVar.b;
            if (weakReference.get() != null) {
                ((a) weakReference.get()).O1();
            } else {
                throw new IllegalStateException("ContextWeakWrapper should have Activity or Fragment");
            }
        }
        ro4.b();
        this.b = fjVar;
        Toolbar toolbar = (Toolbar) obd.o;
        this.c = toolbar;
        this.o = d53;
        this.a = jkd;
        this.v = scf;
        m(z ? 0 : 8);
        toolbar.findViewById(lic.toolbar);
        this.y = toolbar.findViewById(lic.toolbar__wrapper_title);
        TextView textView = (TextView) toolbar.findViewById(obd.b);
        this.w = textView;
        if (textView != null) {
            cvg.x(textView).b();
        }
        this.x = (TextView) toolbar.findViewById(lic.toolbar_subtitle);
        TamAvatarView tamAvatarView = (TamAvatarView) toolbar.findViewById(lic.toolbar_avatar);
        if (((TextView) this.w) != null) {
            toolbar.setContentInsetStartWithNavigation(0);
            TextView textView2 = (TextView) this.w;
            textView2.getContext();
            iq.t(textView2, ro4.a(8.0f));
            TextView textView3 = (TextView) this.x;
            if (textView3 != null) {
                ((TextView) this.w).getContext();
                iq.t(textView3, ro4.a(8.0f));
            }
        }
        scf scf2 = (scf) this.v;
        iq.l(scf2, toolbar, (TextView) this.w, (TextView) this.x, d53 == null, scf2.G, scf2.N);
        toolbar.m(wjc.menu_empty);
        toolbar.setOnMenuItemClickListener(this);
        y64.n(toolbar, new ivc(8, this));
    }
}
