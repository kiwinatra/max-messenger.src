package ru.ok.messages.settings.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.messages.settings.FrgAppearanceSettings;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ok/messages/settings/view/ExtraTextSizeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lbif;", "", "Lnf5;", "listener", "", "setListener", "(Lnf5;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nExtraTextSizeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtraTextSizeView.kt\nru/ok/messages/settings/view/ExtraTextSizeView\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,76:1\n92#2:77\n60#2:78\n105#2:79\n84#2:80\n50#2:81\n36#2:82\n92#2:83\n60#2:84\n105#2:85\n84#2:86\n50#2:87\n36#2:88\n*S KotlinDebug\n*F\n+ 1 ExtraTextSizeView.kt\nru/ok/messages/settings/view/ExtraTextSizeView\n*L\n43#1:77\n43#1:78\n43#1:79\n43#1:80\n43#1:81\n43#1:82\n46#1:83\n46#1:84\n46#1:85\n46#1:86\n46#1:87\n46#1:88\n*E\n"})
public final class ExtraTextSizeView extends ConstraintLayout implements bif, ek0 {
    public final TextView E0;
    public final SliderWithCustomTicks F0;
    public final TextView G0;
    public final TextView H0;
    public nf5 I0;
    public float J0;

    @JvmOverloads
    public ExtraTextSizeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, ujc.cl_extra_text_size_view, this);
        TextView textView = (TextView) findViewById(lic.cl_extra_text_size_view__header);
        this.E0 = textView;
        textView.setText(context.getString(qad.o3));
        SliderWithCustomTicks sliderWithCustomTicks = (SliderWithCustomTicks) findViewById(lic.cl_extra_text_size_view__slider);
        this.F0 = sliderWithCustomTicks;
        float floatValue = ((Number) cvg.b().a.getValue()).floatValue();
        sliderWithCustomTicks.setValue(floatValue);
        this.J0 = floatValue;
        sliderWithCustomTicks.y0.add(this);
        TextView textView2 = (TextView) findViewById(lic.cl_extra_text_size_view__tv_small);
        this.G0 = textView2;
        int i = mad.b;
        float valueFrom = sliderWithCustomTicks.getValueFrom();
        getContext();
        textView2.setTextSize(0, TypedValue.applyDimension(2, valueFrom, vo4.c().getDisplayMetrics()) + ((float) getContext().getResources().getDimensionPixelSize(i)));
        TextView textView3 = (TextView) findViewById(lic.cl_extra_text_size_view__tv_big);
        this.H0 = textView3;
        float valueTo = sliderWithCustomTicks.getValueTo();
        getContext();
        textView3.setTextSize(0, TypedValue.applyDimension(2, valueTo, vo4.c().getDisplayMetrics()) + ((float) getContext().getResources().getDimensionPixelSize(i)));
        setClipChildren(false);
        setClipToPadding(false);
        c();
    }

    public final void A(Object obj, float f, boolean z) {
        wde wde = (wde) obj;
        if (z) {
            nf5 nf5 = this.I0;
            if (nf5 != null) {
                int i = (this.J0 > f ? 1 : (this.J0 == f ? 0 : -1));
                FrgAppearanceSettings frgAppearanceSettings = (FrgAppearanceSettings) ((lc5) nf5).b;
                if (i == 0) {
                    frgAppearanceSettings.getClass();
                } else {
                    frgAppearanceSettings.H1 = true;
                    hq hqVar = frgAppearanceSettings.Q1;
                    cn5 cn5 = (cn5) hqVar.g.edit();
                    cn5.putFloat("app.extra.text.size.sp", f);
                    cn5.apply();
                    hqVar.h.d(Float.valueOf(f));
                }
            }
            this.J0 = f;
        }
    }

    public final void c() {
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(getContext());
        this.E0.setTextColor(k0.l);
        int i = k0.n;
        setBackgroundColor(i);
        this.F0.setBackgroundColor(i);
        TextView textView = this.G0;
        int i2 = k0.G;
        textView.setTextColor(i2);
        this.H0.setTextColor(i2);
    }

    public final void setListener(nf5 nf5) {
        this.I0 = nf5;
    }
}
