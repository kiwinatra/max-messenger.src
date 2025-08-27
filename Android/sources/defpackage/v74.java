package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;

/* renamed from: v74  reason: default package */
public final class v74 implements owe {
    public final Function1 a;
    public uy4 b = uy4.b;

    public v74(hn9 hn9) {
        this.a = hn9;
    }

    public final Object a(int i) {
        if (i < 0) {
            return null;
        }
        return (CharSequence) this.a.invoke(Integer.valueOf(i));
    }

    public final iwe b(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.addView(new TextView(viewGroup.getContext()));
        return new b84(frameLayout, this.b);
    }

    public final void c(iwe iwe, int i) {
        ((b84) iwe).o.setText((CharSequence) a(i));
    }
}
