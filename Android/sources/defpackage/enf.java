package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: enf  reason: default package */
public abstract class enf extends pzc {
    public void M(n18 n18, boolean z, int i) {
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (z) {
            i = -1;
        }
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(i, view.getResources().getDimensionPixelOffset(ydc.chat_top_panel_height));
        } else {
            layoutParams.width = i;
        }
        view.setLayoutParams(layoutParams);
    }
}
