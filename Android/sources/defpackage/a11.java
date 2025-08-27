package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* renamed from: a11  reason: default package */
public final /* synthetic */ class a11 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ b11 c;

    public /* synthetic */ a11(Context context, b11 b11, int i) {
        this.a = i;
        this.b = context;
        this.c = b11;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                z01 z01 = new z01(this.b);
                b11 b11 = this.c;
                ViewGroup.LayoutParams layoutParams = b11.getLayoutParams();
                z01.setGravity(1);
                z01.setLayoutParams(layoutParams);
                b11.removeAllViews();
                b11.addView(z01);
                return z01;
            default:
                v01 v01 = new v01(this.b, (AttributeSet) null);
                b11 b112 = this.c;
                v01.setLayoutParams(b112.getLayoutParams());
                b112.removeAllViews();
                b112.addView(v01);
                return v01;
        }
    }
}
