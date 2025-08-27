package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt;

/* renamed from: kh7  reason: default package */
public final class kh7 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ int b;
    public /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kh7(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = i;
                super(3, continuation);
                return;
            default:
                return;
        }
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                kh7 kh7 = new kh7(3, (Continuation) obj3, 0);
                kh7.c = (String) obj;
                kh7.b = intValue;
                return kh7.invokeSuspend(Unit.INSTANCE);
            default:
                k2b k2b = (k2b) obj2;
                kh7 kh72 = new kh7(this.b, (Continuation) obj3, 1);
                kh72.c = (ImageView) obj;
                return kh72.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = true;
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                int i2 = this.b;
                if (!(((String) this.c).length() == i2 || i2 == -1)) {
                    z = false;
                }
                return Boxing.boxBoolean(z);
            default:
                ResultKt.throwOnFailure(obj);
                ImageView imageView = (ImageView) this.c;
                int i3 = cad.F;
                js9 js9 = fu4.k;
                int i4 = js9.f(imageView).getIcon().i;
                Drawable b2 = ew3.b(imageView.getContext(), i3);
                iq.a0(b2, i4);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                int i5 = this.b;
                shapeDrawable.setIntrinsicWidth(i5);
                shapeDrawable.setIntrinsicHeight(i5);
                shapeDrawable.setTint(js9.e(imageView.getContext()).f().c().a.g);
                int roundToInt = (i5 - MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density)) / 2;
                int roundToInt2 = (i5 - MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density)) / 2;
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, b2});
                layerDrawable.setLayerInset(1, roundToInt, roundToInt2, roundToInt, roundToInt2);
                imageView.setImageDrawable(layerDrawable);
                return Unit.INSTANCE;
        }
    }
}
