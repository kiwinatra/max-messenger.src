package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.contactlist.ContactListWidget;

/* renamed from: gq3  reason: default package */
public final class gq3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ContactListWidget b;
    public final /* synthetic */ qs6 c;
    public final /* synthetic */ boolean o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gq3(ContactListWidget contactListWidget, qs6 qs6, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = contactListWidget;
        this.c = qs6;
        this.o = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gq3(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gq3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        qs6 qs6 = this.c;
        ContactListWidget contactListWidget = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = ContactListWidget.N0;
            yp3 f0 = contactListWidget.f0();
            fo3 fo3 = qs6.w;
            this.a = 1;
            Object I = ev0.I(((osa) f0.c).b(), new sp3(f0, fo3, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        contactListWidget.z(qs6.a, this.o);
        return Unit.INSTANCE;
    }
}
