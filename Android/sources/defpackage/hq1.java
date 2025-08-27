package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* renamed from: hq1  reason: default package */
public final class hq1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hq1(String str, Continuation continuation) {
        super(2, continuation);
        this.b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new hq1(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hq1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            z68.c("CallsNotification", "handle loading notification image", new Object[0]);
            String str = this.b;
            if (str == null || StringsKt.isBlank(str)) {
                z68.c("CallsNotification", "avatar for call push is empty", new Object[0]);
                return null;
            }
            z68.c("CallsNotification", "start loading call push avatar", new Object[0]);
            gq1 gq1 = new gq1(str, (Continuation) null);
            this.a = 1;
            obj = okf.c(500, gq1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
