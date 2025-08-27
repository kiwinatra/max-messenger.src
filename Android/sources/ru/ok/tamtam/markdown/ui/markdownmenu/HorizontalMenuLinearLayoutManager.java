package ru.ok.tamtam.markdown.ui.markdownmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/tamtam/markdown/ui/markdownmenu/HorizontalMenuLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "markdown-ui_release"}, k = 1, mv = {2, 0, 0})
public final class HorizontalMenuLinearLayoutManager extends LinearLayoutManager {
    public final boolean e() {
        return false;
    }

    public final boolean f() {
        return false;
    }

    public final boolean g(bzc bzc) {
        return bzc != null;
    }

    public final bzc s() {
        bzc s = super.s();
        s1(s);
        return s;
    }

    public final void s1(bzc bzc) {
        bzc.width = MathKt.roundToInt(((double) ((this.n - K()) - J())) / ((double) G()));
    }

    public final bzc t(Context context, AttributeSet attributeSet) {
        bzc bzc = new bzc(context, attributeSet);
        s1(bzc);
        return bzc;
    }

    public final bzc u(ViewGroup.LayoutParams layoutParams) {
        bzc u = super.u(layoutParams);
        s1(u);
        return u;
    }
}
