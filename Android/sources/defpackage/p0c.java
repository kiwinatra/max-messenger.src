package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.profileedit.ProfileEditScreen;

/* renamed from: p0c  reason: default package */
public final class p0c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileEditScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p0c(ProfileEditScreen profileEditScreen, Continuation continuation) {
        super(2, continuation);
        this.b = profileEditScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        p0c p0c = new p0c(this.b, continuation);
        p0c.a = obj;
        return p0c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p0c) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.v.G((List) this.a);
        return Unit.INSTANCE;
    }
}
