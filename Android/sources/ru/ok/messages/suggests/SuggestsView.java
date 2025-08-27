package ru.ok.messages.suggests;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/messages/suggests/SuggestsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lbif;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSuggestsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestsView.kt\nru/ok/messages/suggests/SuggestsView\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,59:1\n24#2:60\n49#3,2:61\n45#3:63\n310#4:64\n326#4,4:65\n311#4:69\n310#4:70\n326#4,4:71\n311#4:75\n*S KotlinDebug\n*F\n+ 1 SuggestsView.kt\nru/ok/messages/suggests/SuggestsView\n*L\n25#1:60\n41#1:61,2\n41#1:63\n50#1:64\n50#1:65,4\n50#1:69\n53#1:70\n53#1:71,4\n53#1:75\n*E\n"})
public final class SuggestsView extends ConstraintLayout implements bif {
    public final int E0 = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);

    @JvmOverloads
    public SuggestsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipChildren(true);
        setClipToPadding(true);
        setClipToOutline(true);
        setOutlineProvider(new a42(this, 5));
        c();
    }

    public final void c() {
        scf scf;
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        setBackgroundColor(scf.n);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        z68.c("Suggests2View", "onSizeChanged " + i + ", " + i2, new Object[0]);
        if (!h88.M(this) && i2 > ((View) getParent()).getHeight()) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
                setLayoutParams(layoutParams);
                View findViewById = findViewById(lic.suggests);
                ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -1;
                    findViewById.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
