package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.WeakHashMap;

/* renamed from: vg  reason: default package */
public final /* synthetic */ class vg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ vg(View view, int i) {
        this.a = i;
        this.b = view;
    }

    public final void run() {
        View view = this.b;
        switch (this.a) {
            case 0:
                view.setVisibility(0);
                return;
            case 1:
                view.setVisibility(0);
                return;
            case 2:
                view.setVisibility(8);
                view.setAlpha(1.0f);
                return;
            case 3:
                view.setVisibility(8);
                return;
            case 4:
                WeakHashMap weakHashMap = gag.a;
                t9g.c(view);
                return;
            case 5:
                view.requestApplyInsets();
                return;
            default:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
        }
    }
}
