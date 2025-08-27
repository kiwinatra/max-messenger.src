package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* renamed from: sa6  reason: default package */
public final /* synthetic */ class sa6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ya6 b;

    public /* synthetic */ sa6(ya6 ya6, int i) {
        this.a = i;
        this.b = ya6;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Drawable b2 = ew3.b(this.b.g, cad.L1);
                if (b2 != null) {
                    return b2;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            default:
                Drawable b3 = ew3.b(this.b.g, cad.M1);
                if (b3 != null) {
                    return b3;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
