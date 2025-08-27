package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.math.MathKt;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* renamed from: npc  reason: default package */
public final class npc extends ChipGroup implements phf {
    public mpc x0;
    public final LinkedHashMap y0 = new LinkedHashMap();
    public final Lazy z0;

    public npc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new a1b(context, 15));
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setChipSpacingVertical(MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density));
        setSingleLine(false);
        setSingleSelection(false);
        setPaddingRelative(0, 0, 0, MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
    }

    private final ContextThemeWrapper getMaterialThemeWrapper() {
        return (ContextThemeWrapper) this.z0.getValue();
    }

    private final void setChipStyle(Chip chip) {
        boolean isChecked = chip.isChecked();
        js9 js9 = fu4.k;
        if (isChecked) {
            chip.setChipBackgroundColor(ColorStateList.valueOf(js9.e(chip.getContext()).f().c().a.f));
            chip.setTextColor(js9.e(chip.getContext()).f().getText().a);
            return;
        }
        chip.setChipBackgroundColor(ColorStateList.valueOf(js9.e(chip.getContext()).f().c().k));
        chip.setTextColor(js9.e(chip.getContext()).f().getText().e);
    }

    public final void a(int i, String str) {
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.y0;
        if (!linkedHashMap.containsKey(valueOf)) {
            Chip chip = new Chip(getMaterialThemeWrapper(), (AttributeSet) null);
            chip.setId(Integer.hashCode(i));
            chip.setText(str);
            chip.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            chip.setTextAlignment(4);
            puf.k.a(chip.getPaint(), chip.getResources().getDisplayMetrics(), uy4.b);
            chip.setClickable(true);
            chip.setCheckable(true);
            chip.setChecked(false);
            chip.setCheckedIcon((Drawable) null);
            chip.setEnsureMinTouchTargetSize(false);
            b(chip, chip.isChecked(), i);
            chip.setOnCheckedChangeListener(new lpc(this, chip, i));
            for (Map.Entry value : linkedHashMap.entrySet()) {
                ((Chip) value.getValue()).setChecked(false);
            }
            linkedHashMap.put(Integer.valueOf(i), chip);
            addView(chip);
        }
    }

    public final void b(Chip chip, boolean z, int i) {
        if (z) {
            mpc mpc = this.x0;
            if (mpc != null) {
                fg1 r0 = ((CallRateBottomSheet) mpc).r0();
                xme xme = r0.x;
                qi7 qi7 = ((dg1) xme.getValue()).b;
                ez9 ez9 = new ez9();
                ez9.c(qi7);
                ez9.b(i);
                xme.m((Object) null, dg1.a((dg1) xme.getValue(), (Integer) null, ez9, (CharSequence) null, 5));
                kpc.b.getClass();
                if (dbe.g(i) == kpc.OTHER) {
                    xag.h(r0.x0, ag1.a);
                    igf igf = new igf(sqa.J);
                    xme xme2 = r0.y;
                    xme2.getClass();
                    xme2.m((Object) null, igf);
                }
            }
        } else {
            mpc mpc2 = this.x0;
            if (mpc2 != null) {
                xme xme3 = ((CallRateBottomSheet) mpc2).r0().x;
                qi7 qi72 = ((dg1) xme3.getValue()).b;
                ez9 ez92 = new ez9();
                ez92.c(qi72);
                ez92.h(i);
                xme3.m((Object) null, dg1.a((dg1) xme3.getValue(), (Integer) null, ez92, (CharSequence) null, 5));
            }
            chip.setOnTouchListener((View.OnTouchListener) null);
        }
        setChipStyle(chip);
    }

    public final void onDetachedFromWindow() {
        this.y0.clear();
        super.onDetachedFromWindow();
    }

    public final void onThemeChanged(k2b k2b) {
        for (Map.Entry value : this.y0.entrySet()) {
            setChipStyle((Chip) value.getValue());
        }
    }

    public final void setListener(mpc mpc) {
        this.x0 = mpc;
    }
}
