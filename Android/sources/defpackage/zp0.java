package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;

/* renamed from: zp0  reason: default package */
public final class zp0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public zp0(aq0 aq0, Context context, boolean z) {
        this.c = aq0;
        this.o = context;
        this.b = z;
    }

    private final void a(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                aq0 aq0 = (aq0) this.c;
                if (aq0.c == null) {
                    aq0.c = (this.b || Build.VERSION.SDK_INT < 31) ? new ccf((Context) this.o) : new nob(2);
                }
                aq0.b(aq0.b);
                return;
            default:
                if (!this.b) {
                    m9g m9g = (m9g) this.o;
                    if (m9g.w != null) {
                        this.b = true;
                        m9g m9g2 = (m9g) ((bpa) this.c).b;
                        m9g2.b = true;
                        m9g2.b();
                        view.removeOnAttachStateChangeListener(this);
                        m9g.w = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                aq0 aq0 = (aq0) this.c;
                aq0.b(false);
                aq0.f = false;
                Bitmap bitmap = aq0.g;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                aq0.g = null;
                aq0.h = null;
                wp0 wp0 = aq0.c;
                if (wp0 != null) {
                    wp0.c();
                }
                aq0.c = null;
                return;
            default:
                return;
        }
    }

    public zp0(m9g m9g, bpa bpa) {
        this.o = m9g;
        this.c = bpa;
        this.b = false;
    }
}
