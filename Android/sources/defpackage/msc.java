package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: msc  reason: default package */
public final class msc extends SuspendLambda implements Function2 {
    public final /* synthetic */ ReactionsViewModel a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public msc(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.a = reactionsViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new msc(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((msc) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ReactionsViewModel reactionsViewModel = this.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, "ru.ok.onechat.reactions.ReactionsViewModel", wj6.k("defaultReactions = [", CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.take((List) reactionsViewModel.v.getValue(), 8), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null), "]"), (Throwable) null);
        }
        a32 m = this.a.m();
        if (m != null) {
            ReactionsViewModel reactionsViewModel2 = this.a;
            long j = m.b.l0;
            hdd hdd = reactionsViewModel2.h;
            if (hdd != null) {
                hdd.c(Long.valueOf(j), "lastReactedMessageId");
            }
        }
        return Unit.INSTANCE;
    }
}
