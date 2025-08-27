package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import one.me.rlottie.RLottieDrawable;
import ru.ok.tamtam.stickers.view.RecyclerAutofitGridView;

/* renamed from: r25  reason: default package */
public final class r25 extends ConstraintLayout implements h15 {
    public static final /* synthetic */ int S0 = 0;
    public xoe E0;
    public q25 F0;
    public ise G0;
    public View H0;
    public TabLayout I0;
    public RecyclerAutofitGridView J0;
    public View K0;
    public ImageButton L0;
    public lw9 M0;
    public ArrayList N0;
    public ArrayList O0;
    public or7 P0;
    public fk Q0;
    public u25 R0;

    public final void d(e15 e15) {
        i7b i7b;
        bpe bpe;
        q25 q25 = this.F0;
        if (q25 != null && (i7b = (i7b) ((t26) q25).z) != null && (bpe = ((cpe) i7b).G0) != null) {
            bpe.d(e15);
        }
    }

    public final void f(e15 e15, e15 e152) {
        ArrayList arrayList;
        int i;
        j15 j15;
        i7b i7b;
        bpe bpe;
        q25 q25 = this.F0;
        if (!(q25 == null || (i7b = (i7b) ((t26) q25).z) == null || (bpe = ((cpe) i7b).G0) == null)) {
            bpe.f(e15, e152);
        }
        if (!TextUtils.equals(e15.c, e152.c) && (arrayList = this.N0) != null && (i = e15.a) > 0 && i < arrayList.size() && (j15 = (j15) this.N0.get(i)) != null) {
            String str = e15.f;
            RLottieDrawable rLottieDrawable = e15.g;
            int i2 = e15.a;
            int i3 = e15.b;
            j15.w.set(i3, new e15(i2, i3, e152.c, e15.d, e15.e, str, rLottieDrawable));
            j15.a.d(i3, 1, (Object) null);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o54.k(this.P0);
    }

    public void setAnimojiRepository(fk fkVar) {
        this.Q0 = fkVar;
    }

    public void setEmojiParser(u25 u25) {
        this.R0 = u25;
    }

    public void setListener(q25 q25) {
        this.F0 = q25;
    }

    public void setStickers(ise ise) {
        if (this.G0 != ise) {
            this.G0 = ise;
            if (ise != null) {
                boolean I = ld9.I(getContext());
                r3 r3Var = ise.a;
                if (I) {
                    this.J0.setDefaultColumns(r3Var.b * 2);
                } else {
                    this.J0.setDefaultColumns(r3Var.c * 2);
                }
            }
            requestLayout();
        }
    }

    public void setTheme(xoe xoe) {
        if (!Objects.equals(xoe, this.E0)) {
            this.E0 = xoe;
            if (xoe != null) {
                setBackgroundColor(xoe.a);
                this.H0.setBackgroundColor(this.E0.b);
                this.I0.setTabRippleColor(ColorStateList.valueOf(this.E0.h));
                this.I0.setSelectedTabIndicatorColor(this.E0.e);
                this.I0.setTabIconTint(this.E0.i);
                this.I0.setBackgroundColor(this.E0.b);
                ArrayList arrayList = this.N0;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((j15) it.next()).F(this.E0);
                    }
                }
                this.K0.setBackgroundColor(this.E0.f);
                Drawable a = xoe.a(this.E0.c);
                if (a instanceof RippleDrawable) {
                    ((RippleDrawable) a).setRadius((int) ld9.r(getContext(), 22.0f));
                }
                this.L0.setBackground(a);
                this.L0.setColorFilter(this.E0.g, PorterDuff.Mode.SRC_IN);
            }
        }
    }
}
