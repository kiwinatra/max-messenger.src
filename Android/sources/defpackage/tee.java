package defpackage;

import android.animation.ValueAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: tee  reason: default package */
public final /* synthetic */ class tee implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ afe b;
    public final /* synthetic */ int c;

    public /* synthetic */ tee(afe afe, int i, int i2) {
        this.a = i2;
        this.b = afe;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        afe afe = this.b;
        lg7 lg7 = (lg7) obj;
        switch (this.a) {
            case 0:
                afe.getClass();
                if (lg7 != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, c44.DEFAULT_ASPECT_RATIO});
                    ofFloat.setDuration(200);
                    ofFloat.addUpdateListener(new uee(lg7, 0));
                    ofFloat.addListener(new zg(lg7, i, 3));
                    ofFloat.start();
                }
                return Unit.INSTANCE;
            case 1:
                afe.getClass();
                afe.a(lg7, i);
                return Unit.INSTANCE;
            default:
                afe.getClass();
                afe.a(lg7, i);
                return Unit.INSTANCE;
        }
    }
}
