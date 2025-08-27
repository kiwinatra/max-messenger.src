package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;

/* renamed from: zq4  reason: default package */
public final class zq4 extends pzc {
    public final ro4 D0 = ro4.b();

    public zq4(View view) {
        super(view);
        view.getContext();
    }

    public final void M(xq4 xq4) {
        View view = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int ordinal = xq4.ordinal();
        ro4 ro4 = this.D0;
        if (ordinal == 0) {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            view.setBackgroundColor(j4b.k0(context).L);
            marginLayoutParams.height = ro4.a;
        } else if (ordinal == 1) {
            Context context2 = view.getContext();
            Lazy lazy2 = scf.b0;
            view.setBackgroundColor(j4b.k0(context2).I);
            marginLayoutParams.height = ro4.j;
        } else if (ordinal == 2) {
            Context context3 = view.getContext();
            Lazy lazy3 = scf.b0;
            view.setBackgroundColor(j4b.k0(context3).L);
            marginLayoutParams.height = ro4.a;
            int i = ro4.o;
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.setMarginStart(i);
        }
        view.setLayoutParams(marginLayoutParams);
    }
}
