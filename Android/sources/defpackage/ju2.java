package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: ju2  reason: default package */
public final class ju2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ChatsListSearchScreen b;
    public final /* synthetic */ ge9 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ju2(ChatsListSearchScreen chatsListSearchScreen, ge9 ge9, Continuation continuation) {
        super(2, continuation);
        this.b = chatsListSearchScreen;
        this.c = ge9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ju2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ju2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        ge9 ge9 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = ChatsListSearchScreen.F0;
            ov2 d0 = this.b.d0();
            long j = ge9.w.a;
            this.a = 1;
            obj = ev0.I(((osa) d0.x).b(), new zu2(d0, j, ge9.v, (Continuation) null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Long l = (Long) obj;
        if (l != null) {
            ox2.p1(ox2.b, ge9.w.a, "local", Boxing.boxLong(l.longValue()), (Long) null, ge9.b, (String) null, 104);
        }
        return Unit.INSTANCE;
    }
}
