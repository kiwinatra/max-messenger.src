package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.chats.common.CommonChatsViewModel;

/* renamed from: r83  reason: default package */
public final class r83 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CommonChatsViewModel b;
    public final /* synthetic */ ke7 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r83(CommonChatsViewModel commonChatsViewModel, ke7 ke7, Continuation continuation) {
        super(2, continuation);
        this.b = commonChatsViewModel;
        this.c = ke7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        r83 r83 = new r83(this.b, this.c, continuation);
        r83.a = obj;
        return r83;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r83) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        q10 q10;
        ke7 ke7 = this.c;
        CommonChatsViewModel commonChatsViewModel = this.b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        try {
            Result.Companion companion = Result.Companion;
            obj2 = Result.m23constructorimpl((a89) commonChatsViewModel.k.a(ke7.c, false).f());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m29isFailureimpl(obj2)) {
            obj2 = null;
        }
        a89 a89 = (a89) obj2;
        if (a89 == null) {
            return Unit.INSTANCE;
        }
        l20 a2 = a89.a.a(g20.b);
        if (a2 == null || (q10 = a2.c) == null) {
            return Unit.INSTANCE;
        }
        if (q10.a == p10.v) {
            CommonChatsViewModel.k(commonChatsViewModel, ke7.b);
        }
        return Unit.INSTANCE;
    }
}
