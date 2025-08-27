package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import ru.ok.messages.search.KeyboardHandlerSearchView;
import ru.ok.messages.stickers.widgets.StickerSlideRelativeLayout;
import ru.ok.messages.stickers.widgets.StickersView;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: j4a  reason: default package */
public final class j4a extends q2 implements qre, nve, bif, ikd, hmf, f2a {
    public final yva X;
    public final d6a Y;
    public final ise Z;
    public final s3a o;
    public final View v;
    public final gb8 v0;
    public final View w;
    public StickerSlideRelativeLayout w0;
    public final u2f x;
    public StickersView x0;
    public final ViewStub y;
    public b33 y0;
    public final fj z;
    public jkd z0;

    public j4a(Context context, s3a s3a, View view, View view2, ViewStub viewStub, g18 g18, yva yva, fj fjVar, d6a d6a, ise ise, gb8 gb8) {
        super(context);
        this.o = s3a;
        this.v = view2;
        this.w = view;
        this.x = g18;
        this.y = viewStub;
        this.X = yva;
        this.z = fjVar;
        this.Y = d6a;
        this.Z = ise;
        this.v0 = gb8;
    }

    public final void A(xr6 xr6) {
        N(new a0(13, xr6));
    }

    public final void M() {
        StickerSlideRelativeLayout stickerSlideRelativeLayout = (StickerSlideRelativeLayout) ((View) this.c).findViewById(lic.stickers_layout);
        this.w0 = stickerSlideRelativeLayout;
        stickerSlideRelativeLayout.setBottomView(this.o);
        this.w0.setListener(this);
        StickersView stickersView = (StickersView) ((View) this.c).findViewById(lic.view_stickers);
        this.x0 = stickersView;
        stickersView.setListener(this);
        this.x0.setStickers(this.Z);
        this.x0.setLottieLayer(this.v0);
    }

    public final void P0() {
        ose currentInputType = this.x0.getCurrentInputType();
        int ordinal = currentInputType.ordinal();
        d6a d6a = this.Y;
        if (ordinal == 0) {
            ((nd) d6a.b).e("STICKERS_SEARCH_OPEN_FROM_STOREFRONT");
        } else if (ordinal != 1) {
            Locale locale = Locale.ENGLISH;
            z68.e("j4a", "Unknown input type " + currentInputType);
        } else {
            ((nd) d6a.b).e("GIFS_SEARCH_OPEN_FROM_STOREFRONT");
        }
        f0();
    }

    public final void Y0(String str) {
        N(new a0(14, str));
        f0();
    }

    public final CharSequence Z() {
        c0();
        KeyboardHandlerSearchView e = this.z0.e();
        return e != null ? e.getQuery() : "";
    }

    public final void a0() {
        View view;
        this.w0.e(rre.a);
        for (c0 c0Var : this.x0.v.o.values()) {
            if (c0Var != null) {
                c0Var.a.z0(0);
            }
        }
        s3a s3a = this.o;
        if (!(s3a == null || !s3a.g0() || (view = this.w) == null)) {
            view.setVisibility(0);
        }
        View view2 = this.v;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    public final void c() {
        this.x0.a();
    }

    public final void c0() {
        ju7 lifecycle;
        if (this.y0 == null || this.z0 == null) {
            Lazy lazy = scf.b0;
            Context context = (Context) this.b;
            scf k0 = j4b.k0(context);
            int i = lic.menu_search__search;
            String searchHint = this.x0.getSearchHint();
            fj fjVar = this.z;
            hn hnVar = (hn) ((WeakReference) fjVar.c).get();
            a aVar = (a) ((WeakReference) fjVar.b).get();
            if (aVar != null) {
                od6 od6 = (od6) aVar.X1();
                od6.b();
                lifecycle = od6.v;
            } else {
                lifecycle = hnVar != null ? hnVar.getLifecycle() : null;
            }
            jkd jkd = new jkd(this.z, i, searchHint, k0, (hkd) null, this.X, lifecycle);
            this.z0 = jkd;
            jkd.X = this;
            Toolbar toolbar = (Toolbar) this.y.inflate();
            obd obd = new obd(fjVar, toolbar);
            obd.x = k0;
            obd.w = this.z0;
            obd.a = false;
            b33 b33 = new b33(obd);
            this.y0 = b33;
            this.z0.i(context, true, b33);
            toolbar.getMenu().add(0, lic.setting_message_stickers, 0, qad.o5);
            Toolbar toolbar2 = (Toolbar) this.y0.c;
            if (toolbar2 != null) {
                toolbar2.setOnMenuItemClickListener(this);
            }
            toolbar.setNavigationIcon(nad.X);
            iq.m(k0, (Toolbar) this.y0.c, (TextView) toolbar.findViewById(lic.toolbar_title), 48);
            toolbar.setNavigationOnClickListener(new i4a(this, 0));
            b33 b332 = this.y0;
            i4a i4a = new i4a(this, 1);
            Toolbar toolbar3 = (Toolbar) b332.c;
            if (toolbar3 != null) {
                toolbar3.setOnClickListener(i4a);
            }
        }
    }

    public final boolean d0() {
        return this.w0.getState() == rre.a;
    }

    public final void e0() {
        String str;
        int ordinal = this.x0.getCurrentInputType().ordinal();
        Context context = (Context) this.b;
        if (ordinal == 0) {
            str = context.getString(qad.Q9);
        } else if (ordinal == 1) {
            str = context.getString(qad.t7);
        } else if (ordinal == 2) {
            str = context.getString(qad.M9);
        } else {
            Locale locale = Locale.ENGLISH;
            ose currentInputType = this.x0.getCurrentInputType();
            throw new IllegalStateException("Unexpected value: " + currentInputType);
        }
        c0();
        b33 b33 = this.y0;
        sx8 sx8 = new sx8(11, this, str);
        Toolbar toolbar = (Toolbar) b33.c;
        if (toolbar != null) {
            toolbar.post(sx8);
        }
        c0();
        jkd jkd = this.z0;
        String searchHint = this.x0.getSearchHint();
        KeyboardHandlerSearchView e = jkd.e();
        if (e != null && !searchHint.isEmpty()) {
            e.setQueryHint(searchHint);
        }
        N(new l3a(14));
    }

    public final void f0() {
        N(new l3a(13));
    }

    public final void j(long j, boolean z2) {
        N(new h4a(j, z2));
    }

    public final void n(long j) {
        for (a2a a2a : (Set) this.a) {
            ype W = a2a.W();
            n99 n99 = a2a.v.a.b;
            FrgBase frgBase = n99.w;
            if (frgBase.O1() != null) {
                v6.U(frgBase.O1(), j, n99.y.a, W, n99.c.a());
            }
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != lic.setting_message_stickers) {
            return false;
        }
        v6.T((Context) this.b);
        return true;
    }

    public final void p() {
        f0();
    }

    public final boolean q(ose ose) {
        boolean z2;
        int ordinal = ose.ordinal();
        Set<a2a> set = (Set) this.a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    Locale locale = Locale.ENGLISH;
                    throw new IllegalStateException("Unexpected value: " + ose);
                } else if ((set instanceof Collection) && set.isEmpty()) {
                    return false;
                } else {
                    for (a2a a2a : set) {
                        try {
                            if (a2a.o.a()) {
                                return true;
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    return false;
                }
            } else if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            } else {
                for (a2a a2a2 : set) {
                    try {
                        String str = a2a2.c.E1;
                        if (str == null || str.equals("0")) {
                            z2 = false;
                            continue;
                        } else {
                            z2 = true;
                            continue;
                        }
                        if (z2) {
                            return true;
                        }
                    } catch (Throwable th2) {
                        throw new RuntimeException(th2);
                    }
                }
                return false;
            }
        } else if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        } else {
            for (a2a a2a3 : set) {
                try {
                    if (a2a3.b.L1) {
                        return true;
                    }
                } catch (Throwable th3) {
                    throw new RuntimeException(th3);
                }
            }
            return false;
        }
    }

    public final void s(ose ose) {
        int ordinal = ose.ordinal();
        Set<a2a> set = (Set) this.a;
        if (ordinal == 0) {
            for (a2a a2a : set) {
                a2a.b.i3();
            }
        } else if (ordinal == 1) {
            N(new l3a(11));
        } else if (ordinal == 2) {
            for (a2a a2a2 : set) {
                a2a2.o.c();
            }
        } else {
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException("Unexpected value: " + ose);
        }
    }

    public final void t(boe boe, String str) {
        Parcelable.Creator<goe> creator = goe.CREATOR;
        Parcelable.Creator<goe> creator2 = goe.CREATOR;
        Iterator it = ((Set) this.a).iterator();
        if (it.hasNext()) {
            a2a a2a = (a2a) it.next();
            a2a.W();
            a2a.v.c();
            throw null;
        }
    }

    public final void z(boe boe, String str, goe goe) {
        boe c;
        for (a2a a2a : (Set) this.a) {
            if (a2a.U() && (c = a2a.x.c(boe.a)) != null) {
                a2a.Y(c);
            }
        }
    }
}
