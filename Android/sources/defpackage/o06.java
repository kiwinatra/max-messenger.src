package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.math.MathKt;

/* renamed from: o06  reason: default package */
public final class o06 extends pzc {
    public final TextView D0;
    public final scf E0;
    public final /* synthetic */ p06 F0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o06(p06 p06, View view) {
        super(view);
        scf scf;
        this.F0 = p06;
        TextView textView = (TextView) view.findViewById(lic.item_folder_filter__name);
        this.D0 = textView;
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        this.E0 = scf;
        textView.setTextColor(scf.G);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = (float) MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
        }
        int i2 = scf.J;
        textView.setBackground(i8b.g(i2, scf.j, i2, fArr));
    }
}
