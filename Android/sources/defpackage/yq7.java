package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: yq7  reason: default package */
public final class yq7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ KeyboardStickersWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yq7(KeyboardStickersWidget keyboardStickersWidget, Continuation continuation) {
        super(2, continuation);
        this.b = keyboardStickersWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yq7 yq7 = new yq7(this.b, continuation);
        yq7.a = obj;
        return yq7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yq7) create((qve) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        qve qve = (qve) this.a;
        KProperty[] kPropertyArr = KeyboardStickersWidget.z;
        KeyboardStickersWidget keyboardStickersWidget = this.b;
        EndlessRecyclerView2 c0 = keyboardStickersWidget.c0();
        int i = qve.b;
        if (i >= 0) {
            c0.G0();
            GridLayoutManager u = y7e.u(c0);
            if (u != null) {
                u.m1(i, 0);
            }
        }
        RecyclerView d0 = keyboardStickersWidget.d0();
        int i2 = qve.c;
        if (i2 >= 0) {
            d0.G0();
            d0.z0(i2);
        }
        return Unit.INSTANCE;
    }
}
