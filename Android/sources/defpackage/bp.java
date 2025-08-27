package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: bp  reason: default package */
public final class bp extends vzg {
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ WeakReference i;
    public final /* synthetic */ gp j;

    public bp(gp gpVar, int i2, int i3, WeakReference weakReference) {
        this.j = gpVar;
        this.g = i2;
        this.h = i3;
        this.i = weakReference;
    }

    public final void A(Typeface typeface) {
        int i2 = this.g;
        if (i2 != -1) {
            typeface = fp.a(typeface, i2, (this.h & 2) != 0);
        }
        gp gpVar = this.j;
        if (gpVar.m) {
            gpVar.l = typeface;
            TextView textView = (TextView) this.i.get();
            if (textView == null) {
                return;
            }
            if (textView.isAttachedToWindow()) {
                textView.post(new cp((Object) textView, (Object) typeface, gpVar.j, 0));
            } else {
                textView.setTypeface(typeface, gpVar.j);
            }
        }
    }

    public final void z(int i2) {
    }
}
