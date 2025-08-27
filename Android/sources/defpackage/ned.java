package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;
import kotlin.math.MathKt;

/* renamed from: ned  reason: default package */
public final class ned extends enf {
    public final AppCompatTextView D0;
    public final AppCompatImageButton E0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ned(android.view.ViewGroup r4) {
        /*
            r3 = this;
            android.view.LayoutInflater r0 = defpackage.f6e.s(r4)
            int r1 = defpackage.ujc.item_scheduled_messages_panel
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            r3.<init>(r4)
            int r0 = defpackage.lic.title
            android.view.View r0 = r4.findViewById(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            r3.D0 = r0
            int r0 = defpackage.lic.close_button
            android.view.View r4 = r4.findViewById(r0)
            androidx.appcompat.widget.AppCompatImageButton r4 = (androidx.appcompat.widget.AppCompatImageButton) r4
            r3.E0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ned.<init>(android.view.ViewGroup):void");
    }

    public final void M(n18 n18, boolean z, int i) {
        scf scf;
        super.M(n18, z, i);
        View view = this.a;
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        view.setBackground(i8b.f(scf.y, scf.j, 0, MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density)));
        AppCompatTextView appCompatTextView = this.D0;
        appCompatTextView.setTextColor(scf.G);
        int i2 = scf.x;
        appCompatTextView.setSupportCompoundDrawablesTintList(ColorStateList.valueOf(i2));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        AppCompatImageButton appCompatImageButton = this.E0;
        appCompatImageButton.setColorFilter(i2, mode);
        appCompatImageButton.setBackground(scf.d());
        appCompatTextView.setText((CharSequence) null);
        ct.G(view, 300, new led(this, 0));
        ct.G(appCompatImageButton, 300, new led(this, 1));
    }
}
