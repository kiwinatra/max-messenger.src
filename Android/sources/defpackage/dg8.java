package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* renamed from: dg8  reason: default package */
public final class dg8 extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ eg8 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dg8(eg8 eg8, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = eg8;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        eg8 eg8 = this.c;
        ColorStateList colorStateList2 = eg8.x0;
        ColorStateList colorStateList3 = null;
        if (!(colorStateList2 != null)) {
            colorStateList = null;
        } else {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.b = colorStateList;
        if (!(eg8.w0 == 0 || eg8.x0 == null)) {
            int[] iArr2 = {16843623, -16842919};
            int[] iArr3 = {16842913, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{w53.f(eg8.x0.getColorForState(iArr3, 0), eg8.w0), w53.f(eg8.x0.getColorForState(iArr2, 0), eg8.w0), eg8.w0});
        }
        this.a = colorStateList3;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            eg8 eg8 = this.c;
            RippleDrawable rippleDrawable = null;
            if (eg8.getText().toString().contentEquals(textView.getText()) && eg8.w0 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(eg8.w0);
                if (this.b != null) {
                    ru4.h(colorDrawable, this.a);
                    rippleDrawable = new RippleDrawable(this.b, colorDrawable, (Drawable) null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = gag.a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
