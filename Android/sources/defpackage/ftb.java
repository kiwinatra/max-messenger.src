package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* renamed from: ftb  reason: default package */
public final class ftb extends pzc {
    public final Drawable D0;
    public final ColorStateList E0;
    public final SparseArray F0;
    public boolean G0;
    public boolean H0;

    public ftb(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.F0 = sparseArray;
        TextView textView = (TextView) view.findViewById(16908310);
        sparseArray.put(16908310, textView);
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        int i = vfc.icon_frame;
        sparseArray.put(i, view.findViewById(i));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.D0 = view.getBackground();
        if (textView != null) {
            this.E0 = textView.getTextColors();
        }
    }

    public final View M(int i) {
        SparseArray sparseArray = this.F0;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.a.findViewById(i);
        if (findViewById != null) {
            sparseArray.put(i, findViewById);
        }
        return findViewById;
    }
}
