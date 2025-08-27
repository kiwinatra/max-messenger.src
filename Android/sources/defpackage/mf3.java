package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: mf3  reason: default package */
public final class mf3 extends ContinuationImpl {
    public ConfirmPhoneScreen a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ConfirmPhoneScreen c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mf3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(continuation);
        this.c = confirmPhoneScreen;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return ConfirmPhoneScreen.c0(this.c, (see) null, this);
    }
}
