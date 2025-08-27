package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: d5e  reason: default package */
public final class d5e extends SuspendLambda implements Function2 {
    public List a;
    public int b;
    public final /* synthetic */ e5e c;
    public final /* synthetic */ CharSequence o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d5e(e5e e5e, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.c = e5e;
        this.o = charSequence;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new d5e(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d5e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        CharSequence charSequence = this.o;
        e5e e5e = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List a2 = ((ar6) e5e.f.getValue()).a((a32) null, charSequence);
            this.a = a2;
            this.b = 1;
            Object c2 = e5e.c.c(this);
            if (c2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            List list2 = a2;
            obj = c2;
            list = list2;
        } else if (i == 1) {
            list = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q5e q5e = (q5e) e5e.e.getValue();
        List list3 = CollectionsKt.toList((Set) obj);
        if (charSequence == null) {
            charSequence = "";
        }
        q5e.b(e5e.a, list3, charSequence.toString(), list);
        return Unit.INSTANCE;
    }
}
