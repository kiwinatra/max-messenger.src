package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.sdk.arch.Widget;

/* renamed from: n02  reason: default package */
public final class n02 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChangeOwnerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n02(Continuation continuation, ChangeOwnerScreen changeOwnerScreen) {
        super(2, continuation);
        this.b = changeOwnerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        n02 n02 = new n02(continuation, this.b);
        n02.a = obj;
        return n02;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n02) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        g49 g49 = (g49) this.a;
        boolean z = g49 instanceof c49;
        ChangeOwnerScreen changeOwnerScreen = this.b;
        if (z) {
            KProperty[] kPropertyArr = ChangeOwnerScreen.X;
            t02 t02 = (t02) changeOwnerScreen.w.getValue();
            long j = ((c49) g49).a;
            boolean d0 = changeOwnerScreen.d0();
            vk3 vk3 = (vk3) ((eu3) t02.v.getValue()).c(j).a.getValue();
            String f = vk3 != null ? vk3.f() : null;
            if (f == null) {
                f = "";
            }
            a32 a32 = (a32) ((my2) ((qx2) t02.o.getValue())).o(t02.b).a.getValue();
            if (a32 != null) {
                xag.h(t02.x, new r02(new igf(d0 ? lxa.e0 : lxa.l0), a32.K() ? new kgf(lxa.h0, ArraysKt.toList((T[]) new Object[]{f, a32.r()})) : new kgf(lxa.j0, ArraysKt.toList((T[]) new Object[]{a32.r(), f})), j));
            }
        } else if (g49 instanceof f49) {
            e0b e0b = new e0b((Widget) changeOwnerScreen);
            e0b.i(q8.p(qad.E8, changeOwnerScreen.getContext()));
            e0b.j();
        }
        return Unit.INSTANCE;
    }
}
