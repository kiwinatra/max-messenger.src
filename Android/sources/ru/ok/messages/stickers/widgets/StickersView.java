package ru.ok.messages.stickers.widgets;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;

public class StickersView extends LinearLayout implements xqe, r8f {
    public static final /* synthetic */ int A0 = 0;
    public nve a;
    public ise b;
    public gb8 c;
    public final ViewPager2 o;
    public final rse v;
    public final int v0;
    public final ImageView w;
    public final ltb w0 = ym.v.c();
    public final TabLayout x;
    public final d6a x0 = new d6a(9, (Object) ((qra) ym.e()).c());
    public final View y;
    public boolean y0;
    public final int z;
    public final ArrayList z0;

    public StickersView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ArrayList arrayList = new ArrayList();
        this.z0 = arrayList;
        getContext();
        ro4 b2 = ro4.b();
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(ujc.view_stickers, this);
        this.z = getResources().getDimensionPixelOffset(ydc.stickers_puller_height_chat);
        this.v0 = getResources().getDimensionPixelOffset(ydc.stickers_puller_shadow_height_chat);
        this.w = (ImageView) findViewById(lic.view_stickers__iv_puller);
        arrayList.add(ose.STICKER_SETS);
        rse rse = new rse(arrayList, this, this.b, this.c);
        this.v = rse;
        rse.C(true);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(lic.view_stickers__pager);
        this.o = viewPager2;
        viewPager2.setAdapter(rse);
        viewPager2.setCurrentItem(getDefaultTab());
        viewPager2.b(new gi0(10, this));
        TabLayout tabLayout = (TabLayout) findViewById(lic.view_stickers__tabs);
        this.x = tabLayout;
        tabLayout.setSelectedTabIndicatorHeight(b2.b);
        new m56(tabLayout, viewPager2, true, this).d();
        this.y = findViewById(lic.view_stickers__tabs_shadow);
        a();
    }

    private int getDefaultTab() {
        ose ose;
        String string = this.w0.a.g.getString("app.stickers.tab.default", "STICKERS");
        ose[] values = ose.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ose = ose.STICKERS;
                break;
            }
            ose = values[i];
            if (ose.a.equalsIgnoreCase(string)) {
                break;
            }
            i++;
        }
        ose ose2 = ose.STICKER_SETS;
        ArrayList arrayList = this.z0;
        ose ose3 = ose == ose2 ? (ose) arrayList.get(0) : !arrayList.contains(ose) ? (ose) arrayList.get(0) : (ose) arrayList.get(0);
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (arrayList.get(i3) == ose3) {
                i2 = i3;
            }
        }
        return i2;
    }

    public final void A(xr6 xr6) {
        nve nve = this.a;
        if (nve != null) {
            ((j4a) nve).A(xr6);
            ((j4a) this.a).f0();
        }
    }

    public final void a() {
        Context context = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        this.o.setBackgroundColor(k0.n);
        Drawable b2 = ew3.b(getContext(), nad.a);
        int i = k0.n;
        this.y.setBackground(new cv4(b2, new ColorDrawable(i)));
        ImageView imageView = this.w;
        imageView.setBackgroundColor(i);
        imageView.setColorFilter(j4b.l0(0.7f, k0.x), PorterDuff.Mode.SRC_IN);
        TabLayout tabLayout = this.x;
        tabLayout.setBackgroundColor(i);
        tabLayout.setTabTextColors(TabLayout.f(k0.N, k0.G));
        tabLayout.setSelectedTabIndicatorColor(k0.l);
        for (c0 c0Var : this.v.o.values()) {
            if (c0Var != null) {
                c0Var.c();
            }
        }
    }

    public int getCellHeight() {
        c0 E = this.v.E((ose) this.z0.get(this.o.getCurrentItem()));
        if (E == null) {
            return 0;
        }
        return E.getCellHeight();
    }

    public ose getCurrentInputType() {
        return (ose) this.z0.get(this.o.getCurrentItem());
    }

    public oqe getLastVisibleStickerSet() {
        c0 E = this.v.E(ose.STICKER_SETS);
        if (!(E instanceof yqe)) {
            return null;
        }
        return ((yqe) E).getLastVisibleStickerSet();
    }

    public int getPullerlHeight() {
        if (getVisibility() == 0 && this.w.getVisibility() == 0) {
            return this.z + this.v0;
        }
        return 0;
    }

    public String getSearchHint() {
        return ((ose) this.z0.get(this.o.getCurrentItem())).ordinal() != 1 ? getContext().getString(qad.x8) : getContext().getString(qad.t7);
    }

    public final void j(long j, boolean z2) {
        nve nve = this.a;
        if (nve != null) {
            ((j4a) nve).j(j, z2);
        }
    }

    public final void k(o8f o8f, int i) {
        ose ose = (ose) this.z0.get(i);
        int ordinal = ose.ordinal();
        if (ordinal == 0) {
            o8f.b(getContext().getString(qad.Q9).toUpperCase());
        } else if (ordinal == 1) {
            o8f.b(getContext().getString(qad.z3).toUpperCase());
        } else if (ordinal == 2) {
            o8f.b(getContext().getString(qad.N9).toUpperCase());
        } else {
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException("Unexpected value: " + ose);
        }
    }

    public final void n(long j) {
        nve nve = this.a;
        if (nve != null) {
            ((j4a) nve).n(j);
            ((j4a) this.a).f0();
        }
    }

    public final void p() {
        nve nve = this.a;
        if (nve != null) {
            ((j4a) nve).f0();
        }
    }

    public final boolean q(ose ose) {
        nve nve = this.a;
        return nve != null && ((j4a) nve).q(ose);
    }

    public final void s(ose ose) {
        nve nve = this.a;
        if (nve != null) {
            ((j4a) nve).s(ose);
        }
    }

    public void setListVisible(boolean z2) {
        for (c0 c0Var : this.v.o.values()) {
            if (c0Var != null) {
                c0Var.setVisibility(z2 ? 0 : 4);
            }
        }
    }

    public void setListener(nve nve) {
        this.a = nve;
        if (nve != null) {
            ((j4a) nve).e0();
        }
    }

    public void setLottieLayer(gb8 gb8) {
        if (!Objects.equals(gb8, this.c)) {
            this.c = gb8;
            rse rse = this.v;
            if (!Objects.equals(gb8, rse.y)) {
                rse.y = gb8;
                rse.m();
            }
        }
    }

    public void setPullerVisible(boolean z2) {
        this.w.setVisibility(z2 ? 0 : 4);
    }

    public void setSearchHintVisible(boolean z2) {
        for (c0 c0Var : this.v.o.values()) {
            if (c0Var != null) {
                c0Var.setSearchHintVisible(z2);
            }
        }
    }

    public void setState(int i) {
        c0 E = this.v.E(ose.STICKERS);
        if (E instanceof nse) {
            ((nse) E).setState(i);
        }
    }

    public void setStickers(ise ise) {
        if (this.b != ise) {
            this.b = ise;
            rse rse = this.v;
            if (rse.x != ise) {
                rse.x = ise;
                rse.m();
            }
        }
    }

    public void setTabsVisible(boolean z2) {
        ViewPager2 viewPager2 = this.o;
        View view = this.y;
        TabLayout tabLayout = this.x;
        if (z2) {
            tabLayout.setVisibility(0);
            view.setVisibility(0);
            viewPager2.setUserInputEnabled(true);
            return;
        }
        tabLayout.setVisibility(8);
        view.setVisibility(8);
        viewPager2.setUserInputEnabled(false);
    }

    public final void t(boe boe, String str) {
        Parcelable.Creator<goe> creator = goe.CREATOR;
        nve nve = this.a;
        if (nve != null) {
            ((j4a) nve).t(boe, str);
        }
    }

    public final void z(boe boe, String str, goe goe) {
        nve nve = this.a;
        if (nve != null) {
            ((j4a) nve).z(boe, str, goe);
            ((j4a) this.a).f0();
        }
    }

    public void setStickers(List<vte> list) {
        c0 E = this.v.E(ose.STICKERS);
        if (E instanceof nse) {
            ((nse) E).setSections(list);
        }
    }
}
