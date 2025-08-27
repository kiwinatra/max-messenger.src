package defpackage;

import android.text.Layout;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* renamed from: yrd  reason: default package */
public final class yrd extends fbf implements asd {
    public yrd() {
        super((Function1) new duc(5));
    }

    public final int g0() {
        if (!y7e.L((Lazy) this.c)) {
            return 0;
        }
        return g63.b((float) 4, vo4.c().getDisplayMetrics().density, L());
    }

    public final void setAlias(Layout layout) {
        if (layout == null) {
            Lazy lazy = (Lazy) this.c;
            if (lazy.isInitialized()) {
                ((zrd) lazy.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        ((zrd) Q()).setLayout(layout);
        Q().setVisibility(0);
        u();
    }

    public final void setAliasColor(int i) {
        Lazy lazy = (Lazy) this.c;
        if (lazy.isInitialized()) {
            ((zrd) lazy.getValue()).setTextColor(i);
        }
    }
}
