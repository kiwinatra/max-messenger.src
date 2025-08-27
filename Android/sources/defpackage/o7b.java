package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import java.util.Locale;

/* renamed from: o7b  reason: default package */
public final class o7b extends xbg {
    public final LinearLayoutManager a;
    public ybg b;

    public o7b(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    public final void a(int i) {
    }

    public final void b(int i, float f, int i2) {
        if (this.b != null) {
            float f2 = -f;
            int i3 = 0;
            while (true) {
                LinearLayoutManager linearLayoutManager = this.a;
                if (i3 < linearLayoutManager.w()) {
                    View v = linearLayoutManager.v(i3);
                    if (v != null) {
                        this.b.c(v, ((float) (a.M(v) - i)) + f2);
                        i3++;
                    } else {
                        Locale locale = Locale.US;
                        throw new IllegalStateException(a81.l("LayoutManager returned a null child at pos ", i3, "/", linearLayoutManager.w(), " while transforming pages"));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void c(int i) {
    }
}
