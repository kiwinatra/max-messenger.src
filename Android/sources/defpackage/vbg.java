package defpackage;

import android.view.View;

/* renamed from: vbg  reason: default package */
public final class vbg implements czc {
    public final void b(View view) {
    }

    public final void d(View view) {
        bzc bzc = (bzc) view.getLayoutParams();
        if (bzc.width != -1 || bzc.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
