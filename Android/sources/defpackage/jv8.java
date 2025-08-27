package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.mediarouter.app.d;

/* renamed from: jv8  reason: default package */
public final class jv8 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View o;

    public /* synthetic */ jv8(View view, int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.o = view;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        View view = this.o;
        int i = this.c;
        int i2 = this.b;
        switch (this.a) {
            case 0:
                d.o(view, i2 - ((int) (((float) (i2 - i)) * f)));
                return;
            default:
                int i3 = dw8.c1;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i + ((int) (((float) (i2 - i)) * f));
                view.setLayoutParams(layoutParams);
                return;
        }
    }
}
