package defpackage;

import android.app.Activity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.arch.Widget;

/* renamed from: cq3  reason: default package */
public final class cq3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ContactListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cq3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.b = contactListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        cq3 cq3 = new cq3(this.b, continuation);
        cq3.a = obj;
        return cq3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cq3) create((v5a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        ContactListWidget contactListWidget = this.b;
        kr7.z(contactListWidget);
        if (v5a instanceof pa4) {
            vt3.b.Y0((pa4) v5a);
        } else if (v5a instanceof b4b) {
            e0b e0b = new e0b((Widget) contactListWidget);
            e0b.i("Ещё не реализовано");
            e0b.j();
        } else if (v5a instanceof qje) {
            KProperty[] kPropertyArr = ContactListWidget.N0;
            qje qje = (qje) v5a;
            ((tq1) contactListWidget.c.getValue()).c(rq1.CONTACT, qje.c);
            Activity activity = contactListWidget.getActivity();
            if (activity != null) {
                kr7.A(activity);
            }
            long j = qje.b;
            boolean z = qje.c;
            ((lf1) contactListWidget.z0.getValue()).j(j, z, new aq3(j, z));
        }
        return Unit.INSTANCE;
    }
}
