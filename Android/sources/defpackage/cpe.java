package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.stickers.view.ScrollChangedTabs;

/* renamed from: cpe  reason: default package */
public final class cpe extends ConstraintLayout implements r8f, i7b, l8f, f8b {
    public static final /* synthetic */ int V0 = 0;
    public xoe E0;
    public voe F0;
    public bpe G0;
    public k7b H0;
    public ise I0;
    public View J0;
    public View K0;
    public ScrollChangedTabs L0;
    public ViewPager2 M0;
    public View N0;
    public ImageButton O0;
    public t26 P0;
    public or7 Q0;
    public or7 R0;
    public ao1 S0;
    public boolean T0;
    public boolean U0;

    public cpe(Context context) {
        super(context);
        View.inflate(getContext(), ljc.emoji_panel_view, this);
    }

    public final void E(o8f o8f) {
        if (this.T0 || o8f.e != 0) {
            this.T0 = true;
            if (o8f != null) {
                Object obj = o8f.a;
                if (obj instanceof g7b) {
                    g7b g7b = (g7b) obj;
                    bpe bpe = this.G0;
                    if (bpe != null) {
                        bpe.H0(g7b.a);
                        p7b p7b = p7b.STICKER;
                        p7b p7b2 = g7b.b;
                        if (p7b2 == p7b || p7b2 == p7b.SET || p7b2 == p7b.SIMILAR) {
                            this.G0.f0();
                        }
                    }
                }
            }
        }
    }

    public final void L() {
        if (this.H0 == null) {
            o54.k(this.Q0);
            o54.k(this.R0);
            return;
        }
        boolean y = o54.y(this.Q0);
        dj6 dj6 = m58.e;
        if (y) {
            jha a = this.H0.a();
            yoe yoe = new yoe(this, 3);
            a.getClass();
            lja s = new yia(a, yoe, 3).x(xfd.b()).s(qe.a());
            or7 or7 = new or7(new yoe(this, 4), new mqd(23), dj6);
            s.a(or7);
            this.Q0 = or7;
        }
        if (o54.y(this.R0)) {
            lja b = this.H0.b();
            or7 or72 = new or7(new yoe(this, 5), m58.g, dj6);
            b.a(or72);
            this.R0 = or72;
        }
    }

    public final o8f M(long j) {
        for (int i = 0; i < this.L0.getTabCount(); i++) {
            o8f h = this.L0.h(i);
            if (h != null) {
                Object obj = h.a;
                if ((obj instanceof g7b) && ((g7b) obj).a == j) {
                    return h;
                }
            }
        }
        return null;
    }

    public final void N(gb8 gb8, boolean z) {
        this.J0 = findViewById(tic.emoji_panel_view__top_separator);
        View findViewById = findViewById(tic.emoji_panel_view__cs_tabs_holder);
        this.K0 = findViewById;
        if (z) {
            findViewById.setVisibility(8);
        }
        ScrollChangedTabs scrollChangedTabs = (ScrollChangedTabs) findViewById(tic.emoji_view__tl_tabs);
        this.L0 = scrollChangedTabs;
        scrollChangedTabs.setUnboundedRipple(true);
        this.L0.setSelectedTabIndicatorHeight((int) ld9.r(getContext(), 2.0f));
        this.L0.a(this);
        this.L0.setOnScrollListener(new yoe(this, 6));
        this.P0 = new t26(this.E0, this.F0, this.I0, gb8, this);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(tic.emoji_view__vp_pages);
        this.M0 = viewPager2;
        viewPager2.setAdapter(this.P0);
        this.N0 = findViewById(tic.emoji_view__delimiter);
        ImageButton imageButton = (ImageButton) findViewById(tic.emoji_view__ib_add);
        this.O0 = imageButton;
        o54.h(imageButton, new ape(this, 0));
        new m56(this.L0, this.M0, false, this).d();
    }

    public final void O(List list, List list2) {
        boolean z;
        g7b g7b;
        boolean z2 = true;
        int i = 0;
        if (list.size() == list2.size()) {
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    z = false;
                    break;
                }
                g7b g7b2 = (g7b) list.get(i2);
                g7b g7b3 = (g7b) list2.get(i2);
                if (g7b2.a != g7b3.a || g7b2.b != g7b3.b || !TextUtils.equals(g7b2.d, g7b3.d)) {
                    break;
                }
                i2++;
            }
        }
        z = true;
        o8f o8f = null;
        if (z) {
            int selectedTabPosition = this.L0.getSelectedTabPosition();
            g7b = selectedTabPosition >= 0 ? this.L0.h(selectedTabPosition).a : null;
            this.L0.k();
            tyc adapter = this.M0.getAdapter();
            if (adapter != null) {
                int j = adapter.j();
                for (int i3 = 0; i3 < j; i3++) {
                    o8f i4 = this.L0.i();
                    k(i4, i3);
                    this.L0.b(i4, false);
                }
            }
        } else {
            g7b = null;
        }
        if (this.U0) {
            ArrayList<o8f> arrayList = null;
            for (int i5 = 0; i5 < this.L0.getTabCount(); i5++) {
                o8f h = this.L0.h(i5);
                if (h != null && h.a == "PROGRESS") {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(h);
                }
            }
            if (arrayList != null) {
                for (o8f o8f2 : arrayList) {
                    ScrollChangedTabs scrollChangedTabs = this.L0;
                    scrollChangedTabs.getClass();
                    if (o8f2.g == scrollChangedTabs) {
                        int i6 = o8f2.e;
                        o8f o8f3 = scrollChangedTabs.c;
                        int i7 = o8f3 != null ? o8f3.e : 0;
                        scrollChangedTabs.l(i6);
                        ArrayList arrayList2 = scrollChangedTabs.b;
                        o8f o8f4 = (o8f) arrayList2.remove(i6);
                        int i8 = -1;
                        if (o8f4 != null) {
                            o8f4.g = null;
                            o8f4.h = null;
                            o8f4.a = null;
                            o8f4.b = null;
                            o8f4.i = -1;
                            o8f4.c = null;
                            o8f4.d = null;
                            o8f4.e = -1;
                            o8f4.f = null;
                            TabLayout.j1.b(o8f4);
                        }
                        int size = arrayList2.size();
                        for (int i9 = i6; i9 < size; i9++) {
                            if (((o8f) arrayList2.get(i9)).e == scrollChangedTabs.a) {
                                i8 = i9;
                            }
                            ((o8f) arrayList2.get(i9)).e = i9;
                        }
                        scrollChangedTabs.a = i8;
                        if (i7 == i6) {
                            scrollChangedTabs.m(arrayList2.isEmpty() ? null : (o8f) arrayList2.get(Math.max(0, i6 - 1)), true);
                        }
                    } else {
                        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
                    }
                }
            }
            this.T0 = true;
        } else {
            int i10 = 0;
            while (true) {
                if (i10 < this.L0.getTabCount()) {
                    o8f h2 = this.L0.h(i10);
                    if (h2 != null && h2.a == "PROGRESS") {
                        break;
                    }
                    i10++;
                } else {
                    int r = (int) ld9.r(getContext(), 24.0f);
                    ProgressBar progressBar = new ProgressBar(getContext());
                    progressBar.setLayoutParams(new FrameLayout.LayoutParams(r, r));
                    if (this.E0 != null) {
                        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                        if (indeterminateDrawable == null) {
                            indeterminateDrawable = progressBar.getProgressDrawable();
                        }
                        if (indeterminateDrawable != null) {
                            ru4.g(indeterminateDrawable, this.E0.e);
                            ru4.i(indeterminateDrawable, PorterDuff.Mode.SRC_IN);
                        }
                    }
                    o8f i11 = this.L0.i();
                    i11.f = progressBar;
                    i11.c();
                    i11.h.setBackgroundColor(0);
                    i11.h.setEnabled(false);
                    i11.a = "PROGRESS";
                    ScrollChangedTabs scrollChangedTabs2 = this.L0;
                    scrollChangedTabs2.b(i11, scrollChangedTabs2.b.isEmpty());
                }
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 < this.L0.getTabCount()) {
                o8f h3 = this.L0.h(i12);
                if (h3 != null && h3.a == "SETTINGS") {
                    break;
                }
                i12++;
            } else {
                ImageButton imageButton = new ImageButton(getContext());
                imageButton.setImageResource(ifc.ic_settings_2_24);
                xoe xoe = this.E0;
                if (xoe != null) {
                    imageButton.setBackground(xoe.a(xoe.c));
                    imageButton.setColorFilter(this.E0.g, PorterDuff.Mode.SRC_IN);
                }
                o54.h(imageButton, new ape(this, 1));
                o8f i13 = this.L0.i();
                i13.f = imageButton;
                i13.c();
                i13.h.setBackgroundColor(0);
                i13.h.setEnabled(false);
                i13.a = "SETTINGS";
                ScrollChangedTabs scrollChangedTabs3 = this.L0;
                scrollChangedTabs3.b(i13, scrollChangedTabs3.b.isEmpty());
                this.L0.post(new zoe(this, 0));
            }
        }
        bpe bpe = this.G0;
        if (bpe != null && !this.T0) {
            long h1 = bpe.h1();
            if (M(h1) != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= this.L0.getTabCount()) {
                        z2 = false;
                        break;
                    }
                    o8f h4 = this.L0.h(i14);
                    if (h4 != null) {
                        Object obj = h4.a;
                        if ((obj instanceof g7b) && ((g7b) obj).a == h1) {
                            this.M0.setPageTransformer(new dbe(15));
                            this.M0.e(i14, false);
                            this.M0.post(new zoe(this, 1));
                            break;
                        }
                    }
                    i14++;
                }
                this.T0 = z2;
                return;
            }
        }
        if (g7b != null) {
            if (!(g7b instanceof g7b)) {
                while (true) {
                    if (i >= this.L0.getTabCount()) {
                        break;
                    }
                    o8f h5 = this.L0.h(i);
                    if (h5.a == g7b) {
                        o8f = h5;
                        break;
                    }
                    i++;
                }
            } else {
                o8f = M(g7b.a);
            }
            if (o8f != null) {
                this.L0.post(new s6e(5, this, o8f));
            }
        }
    }

    public final List P(List list) {
        List list2 = ((ov) this.P0.o).f;
        int currentItem = this.M0.getCurrentItem();
        if (currentItem == 0 && list2.isEmpty()) {
            return list;
        }
        g7b g7b = (g7b) list2.get(currentItem);
        p7b p7b = g7b.b;
        p7b p7b2 = p7b.RECENTS;
        if (p7b == p7b2) {
            ArrayList arrayList = new ArrayList(list);
            ListIterator listIterator = arrayList.listIterator();
            while (true) {
                if (listIterator.hasNext()) {
                    if (((g7b) listIterator.next()).b == p7b2) {
                        listIterator.set(g7b);
                        break;
                    }
                } else {
                    arrayList.add(currentItem, g7b);
                    break;
                }
            }
            return arrayList;
        }
        p7b p7b3 = p7b.SIMILAR;
        if (p7b != p7b3) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list);
        ListIterator listIterator2 = arrayList2.listIterator();
        while (true) {
            if (listIterator2.hasNext()) {
                if (((g7b) listIterator2.next()).b == p7b3) {
                    listIterator2.set(g7b);
                    break;
                }
            } else {
                arrayList2.add(currentItem, g7b);
                break;
            }
        }
        return arrayList2;
    }

    public final void h(o8f o8f) {
        Object obj = o8f.a;
        if (obj instanceof g7b) {
            g7b g7b = (g7b) obj;
            o54.k(this.S0);
            if (this.H0 != null) {
                p7b p7b = g7b.b;
                if (p7b == p7b.RECENTS || p7b == p7b.SIMILAR) {
                    fce j = new nia(jha.A(300, TimeUnit.MILLISECONDS, xfd.a()).m(new yoe(this, 0), IntCompanionObject.MAX_VALUE).m(new yoe(this, 1), IntCompanionObject.MAX_VALUE)).n(xfd.a()).j(qe.a());
                    ao1 ao1 = new ao1(3, new yoe(this, 2), new mqd(23));
                    j.l(ao1);
                    this.S0 = ao1;
                }
            }
        }
    }

    public final void k(o8f o8f, int i) {
        SimpleDraweeView simpleDraweeView;
        g7b g7b = (g7b) ((ov) this.P0.o).f.get(i);
        View view = o8f.f;
        if (view instanceof SimpleDraweeView) {
            simpleDraweeView = (SimpleDraweeView) view;
        } else {
            simpleDraweeView = new SimpleDraweeView(getContext());
            if (g7b.b == p7b.SET) {
                int r = (int) ld9.r(getContext(), 28.0f);
                simpleDraweeView.setLayoutParams(new ViewGroup.LayoutParams(r, r));
            } else {
                int r2 = (int) ld9.r(getContext(), 24.0f);
                simpleDraweeView.setLayoutParams(new ViewGroup.LayoutParams(r2, r2));
            }
            o8f.a(simpleDraweeView);
        }
        if (g7b.c != null) {
            xoe xoe = this.E0;
            if (xoe != null) {
                simpleDraweeView.setColorFilter(xoe.g, PorterDuff.Mode.SRC_IN);
            }
            ((sp6) simpleDraweeView.getHierarchy()).i(g7b.c, 1);
            simpleDraweeView.setController((gv4) null);
        } else {
            String str = g7b.d;
            if (!TextUtils.isEmpty(str)) {
                simpleDraweeView.setColorFilter((ColorFilter) null);
                ((sp6) simpleDraweeView.getHierarchy()).i((Drawable) null, 1);
                simpleDraweeView.setImageURI(str);
            } else {
                throw new IllegalArgumentException("EmojiPage have to have iconRes or iconUrl");
            }
        }
        xoe xoe2 = this.E0;
        if (xoe2 != null) {
            o8f.h.setBackground(xoe.a(xoe2.c));
        }
        o8f.h.setEnabled(true);
        o8f.a = g7b;
    }

    public void setAnimojiRepository(fk fkVar) {
        t26 t26 = this.P0;
        if (t26 != null) {
            t26.Y = fkVar;
        }
    }

    public void setEmojiParser(u25 u25) {
        t26 t26 = this.P0;
        if (t26 != null) {
            t26.Z = u25;
        }
    }

    public void setListener(bpe bpe) {
        this.G0 = bpe;
    }

    public void setLocalization(voe voe) {
        if (!Objects.equals(voe, this.F0)) {
            this.F0 = voe;
            if (voe != null) {
                t26 t26 = this.P0;
                if (!voe.equals((voe) t26.x)) {
                    t26.x = voe;
                    t26.m();
                }
            }
        }
    }

    public void setPageProvider(k7b k7b) {
        if (!Objects.equals(k7b, this.H0)) {
            this.H0 = k7b;
            L();
        }
    }

    public void setStickers(ise ise) {
        if (this.I0 != ise) {
            this.I0 = ise;
            t26 t26 = this.P0;
            if (((ise) t26.y) != ise) {
                t26.y = ise;
                t26.m();
            }
        }
    }

    public void setTheme(xoe xoe) {
        if (!Objects.equals(xoe, this.E0)) {
            this.E0 = xoe;
            if (xoe != null) {
                setBackgroundColor(xoe.a);
                this.J0.setBackgroundColor(this.E0.f);
                this.K0.setBackgroundColor(this.E0.b);
                this.L0.setTabRippleColor(ColorStateList.valueOf(this.E0.h));
                this.L0.setSelectedTabIndicatorColor(this.E0.e);
                this.L0.setBackgroundColor(this.E0.b);
                this.N0.setBackgroundColor(this.E0.f);
                this.O0.setImageDrawable(xoe.a(this.E0.r));
                Drawable a = xoe.a(this.E0.c);
                if (a instanceof RippleDrawable) {
                    ((RippleDrawable) a).setRadius((int) ld9.r(getContext(), 22.0f));
                }
                this.O0.setBackground(a);
                this.O0.setColorFilter(this.E0.e, PorterDuff.Mode.SRC_IN);
                t26 t26 = this.P0;
                xoe xoe2 = this.E0;
                if (!Objects.equals(xoe2, (xoe) t26.w)) {
                    t26.w = xoe2;
                    if (t26.j() > 0) {
                        t26.m();
                    }
                }
            }
        }
    }
}
