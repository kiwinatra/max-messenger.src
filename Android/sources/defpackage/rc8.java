package defpackage;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.common.bottombar.OneMeBottomBarView;
import one.me.main.MainScreen;

/* renamed from: rc8  reason: default package */
public final class rc8 extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ MainScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rc8(MainScreen mainScreen, Continuation continuation) {
        super(2, continuation);
        this.b = mainScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        rc8 rc8 = new rc8(this.b, continuation);
        rc8.a = ((Boolean) obj).booleanValue();
        return rc8;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((rc8) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = this.a;
        KProperty[] kPropertyArr = MainScreen.x;
        OneMeBottomBarView e0 = this.b.e0();
        int i = mva.c;
        e0.getClass();
        int i2 = 0;
        while (true) {
            if (!(i2 < e0.getChildCount())) {
                break;
            }
            int i3 = i2 + 1;
            View childAt = e0.getChildAt(i2);
            if (childAt != null) {
                Object w = vzg.w(childAt, jic.tag_tab_item);
                spa spa = w instanceof spa ? (spa) w : null;
                if (spa != null && spa.c == i) {
                    if ((childAt.getVisibility() == 0) == z) {
                        break;
                    }
                    childAt.setVisibility(z ? 0 : 8);
                    float weightSum = e0.getWeightSum();
                    float f = (float) 1;
                    e0.setWeightSum(z ? weightSum + f : weightSum - f);
                }
                i2 = i3;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        return Unit.INSTANCE;
    }
}
