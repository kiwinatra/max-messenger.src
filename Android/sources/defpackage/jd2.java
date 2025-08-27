package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;

/* renamed from: jd2  reason: default package */
public final class jd2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatMediaDownloadBottomSheet b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jd2(Continuation continuation, ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet) {
        super(2, continuation);
        this.b = chatMediaDownloadBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        jd2 jd2 = new jd2(continuation, this.b);
        jd2.a = obj;
        return jd2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jd2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        float floatValue = ((Number) this.a).floatValue();
        KProperty[] kPropertyArr = ChatMediaDownloadBottomSheet.C0;
        ((a10) this.b.x0.getValue()).setLevel(MathKt.roundToInt(floatValue * ((float) 100)));
        return Unit.INSTANCE;
    }
}
