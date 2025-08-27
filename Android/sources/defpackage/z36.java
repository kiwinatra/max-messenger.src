package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* renamed from: z36  reason: default package */
public final /* synthetic */ class z36 implements Function3 {
    public final /* synthetic */ int a;

    public /* synthetic */ z36(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                x16 x16 = (x16) obj2;
                ((Integer) obj3).intValue();
                return Unit.INSTANCE;
            case 1:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                k2b k2b = (k2b) obj3;
                Drawable drawable = ((ImageView) obj).getDrawable();
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = drawable instanceof EnhancedAnimatedVectorDrawable ? (EnhancedAnimatedVectorDrawable) drawable : null;
                if (enhancedAnimatedVectorDrawable != null) {
                    hi7.Y(enhancedAnimatedVectorDrawable, "left_dot", k2b.c().g);
                    hi7.Y(enhancedAnimatedVectorDrawable, "middle_dot", k2b.c().g);
                    hi7.Y(enhancedAnimatedVectorDrawable, "right_dot", k2b.c().g);
                    if (booleanValue) {
                        k2b.getIcon().a.a.getClass();
                        i = -16745729;
                    } else {
                        i = k2b.getIcon().a.a.a;
                    }
                    hi7.Y(enhancedAnimatedVectorDrawable, "shape", i);
                }
                return Unit.INSTANCE;
            default:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                k2b k2b2 = (k2b) obj3;
                Drawable drawable2 = ((ImageView) obj).getDrawable();
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable2 = drawable2 instanceof EnhancedAnimatedVectorDrawable ? (EnhancedAnimatedVectorDrawable) drawable2 : null;
                if (enhancedAnimatedVectorDrawable2 != null) {
                    hi7.Y(enhancedAnimatedVectorDrawable2, "cutout", k2b2.c().g);
                    if (booleanValue2) {
                        k2b2.getIcon().a.a.getClass();
                        i2 = -16745729;
                    } else {
                        i2 = k2b2.getIcon().a.a.a;
                    }
                    hi7.Y(enhancedAnimatedVectorDrawable2, "gear", i2);
                }
                return Unit.INSTANCE;
        }
    }
}
