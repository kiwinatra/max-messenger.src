package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* renamed from: ekb  reason: default package */
public final class ekb extends jj0 {
    public final x15 v;
    public final Function1 w;

    public ekb(x15 x15, f fVar) {
        super((j4b) w63.H);
        this.v = x15;
        this.w = fVar;
    }

    public final int l(int i) {
        return ujc.row_folder_picker;
    }

    public final void s(pzc pzc, int i) {
        int i2;
        int i3;
        w16 w16 = (w16) E(i);
        fkb fkb = (fkb) pzc;
        n79.d(fkb.F0, w16.b, fkb.D0);
        CharSequence charSequence = w16.c;
        int length = charSequence.length();
        View view = fkb.a;
        CharSequence string = length == 0 ? view.getContext().getString(qad.B2) : charSequence;
        TextView textView = fkb.G0;
        textView.setText(string);
        if (charSequence.length() > 0) {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            i2 = j4b.k0(context).G;
        } else {
            Context context2 = view.getContext();
            Lazy lazy2 = scf.b0;
            i2 = j4b.k0(context2).N;
        }
        textView.setTextColor(i2);
        boolean z = w16.d;
        int i4 = z ? nad.M : w16.f ? nad.N : nad.H;
        ImageView imageView = fkb.H0;
        imageView.setImageResource(i4);
        boolean z2 = w16.e;
        if (!z || !z2) {
            i3 = (view.isInEditMode() ? vi4.f0 : j4b.k0(view.getContext())).N;
        } else {
            i3 = (view.isInEditMode() ? vi4.f0 : j4b.k0(view.getContext())).l;
        }
        imageView.setColorFilter(i3);
        imageView.setEnabled(z2);
        view.setAlpha(z2 ? 1.0f : 0.5f);
        view.setEnabled(z2);
        ct.G(view, 300, new h24(26, (Object) fkb, (Object) w16));
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        if (i == ujc.row_folder_picker) {
            return new fkb(inflate, this.v, (f) this.w);
        }
        throw new IllegalArgumentException(a81.j(i, "viewType = ", " not supported"));
    }
}
