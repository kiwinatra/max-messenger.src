package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.mediapicker.MediaPickerScreen;

/* renamed from: au8  reason: default package */
public final class au8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaPickerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au8(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.b = mediaPickerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        au8 au8 = new au8(continuation, this.b);
        au8.a = obj;
        return au8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((au8) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        nm6 nm6 = (nm6) this.a;
        if (nm6 instanceof jm6) {
            KProperty[] kPropertyArr = MediaPickerScreen.z0;
            gu8 gu8 = (gu8) this.b.y.getValue();
            xag.g(gu8, ((osa) ((gaf) gu8.v.getValue())).b(), (f14) null, new eu8(gu8, ((jm6) nm6).c, (Continuation) null), 2);
        }
        return Unit.INSTANCE;
    }
}
