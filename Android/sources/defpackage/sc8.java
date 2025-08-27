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

/* renamed from: sc8  reason: default package */
public final class sc8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MainScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sc8(MainScreen mainScreen, Continuation continuation) {
        super(2, continuation);
        this.b = mainScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        sc8 sc8 = new sc8(this.b, continuation);
        sc8.a = obj;
        return sc8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sc8) create((r14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = MainScreen.x;
        OneMeBottomBarView e0 = this.b.e0();
        int i = mva.e;
        int i2 = ((r14) this.a).a;
        e0.getClass();
        int i3 = 0;
        while (true) {
            if (!(i3 < e0.getChildCount())) {
                return Unit.INSTANCE;
            }
            int i4 = i3 + 1;
            View childAt = e0.getChildAt(i3);
            if (childAt != null) {
                Object w = vzg.w(childAt, jic.tag_tab_item);
                spa spa = w instanceof spa ? (spa) w : null;
                if (spa != null && spa.c == i) {
                    ((kr0) childAt).setCounter(i2);
                }
                i3 = i4;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
    }
}
