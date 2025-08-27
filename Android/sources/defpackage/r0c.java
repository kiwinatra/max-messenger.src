package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.arch.Widget;

/* renamed from: r0c  reason: default package */
public final class r0c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileEditScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0c(ProfileEditScreen profileEditScreen, Continuation continuation) {
        super(2, continuation);
        this.b = profileEditScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        r0c r0c = new r0c(this.b, continuation);
        r0c.a = obj;
        return r0c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r0c) create((x0c) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        x0c x0c = (x0c) this.a;
        if (x0c instanceof x0c) {
            ngf ngf = x0c.a;
            ProfileEditScreen profileEditScreen = this.b;
            CharSequence a2 = ngf.a(profileEditScreen.getContext());
            if (a2 == null) {
                return Unit.INSTANCE;
            }
            e0b e0b = new e0b((Widget) profileEditScreen);
            e0b.f(r0b.a);
            e0b.i(a2);
            e0b.g(t0b.a);
            e0b.c(new n0b(0, x0c.b, 3));
            e0b.d(x0c.c);
            e0b.j();
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
