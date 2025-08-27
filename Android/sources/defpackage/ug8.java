package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: ug8  reason: default package */
public final class ug8 extends ye {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ ug8(View view, int i) {
        this.b = i;
        this.c = view;
    }

    public final void a(Drawable drawable) {
        switch (this.b) {
            case 0:
                ColorStateList colorStateList = ((wg8) this.c).A0;
                if (colorStateList != null) {
                    ru4.h(drawable, colorStateList);
                    return;
                }
                return;
            default:
                zaf zaf = (zaf) this.c;
                if (zaf.b) {
                    zaf.post(new mgd(23, zaf));
                    return;
                }
                return;
        }
    }

    public void b(Drawable drawable) {
        switch (this.b) {
            case 0:
                wg8 wg8 = (wg8) this.c;
                ColorStateList colorStateList = wg8.A0;
                if (colorStateList != null) {
                    ru4.g(drawable, colorStateList.getColorForState(wg8.E0, colorStateList.getDefaultColor()));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
