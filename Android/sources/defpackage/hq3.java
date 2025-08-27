package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.contactlist.ContactListWidget;

/* renamed from: hq3  reason: default package */
public final class hq3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ContactListWidget b;
    public final /* synthetic */ qs6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hq3(ContactListWidget contactListWidget, qs6 qs6, Continuation continuation) {
        super(2, continuation);
        this.b = contactListWidget;
        this.c = qs6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new hq3(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hq3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
        KProperty[] kPropertyArr2 = ContactListWidget.N0;
        int ordinal = contactListWidget.f0().b.ordinal();
        if (ordinal == 0) {
            contactListWidget.z(qs6.a, false);
        } else if (ordinal == 1) {
            vt3 vt3 = vt3.b;
            long j = qs6.a;
            vt3.getClass();
            String str = ":profile?id=" + j + "&type=contact";
            Unit unit = Unit.INSTANCE;
            vt3.W0().b(str, (Bundle) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
