package defpackage;

import android.view.View;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.contactlist.ContactListWidget;

/* renamed from: lq3  reason: default package */
public final class lq3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ContactListWidget b;
    public final /* synthetic */ long c;
    public final /* synthetic */ View o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lq3(ContactListWidget contactListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.b = contactListWidget;
        this.c = j;
        this.o = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new lq3(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lq3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        List list = null;
        long j = this.c;
        ContactListWidget contactListWidget = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = ContactListWidget.N0;
            yp3 f0 = contactListWidget.f0();
            this.a = 1;
            obj = ev0.I(((osa) f0.c).a(), new rp3(f0, j, (Continuation) null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!((List) obj).isEmpty()) {
            list = obj;
        }
        List list2 = list;
        if (list2 != null) {
            Long boxLong = Boxing.boxLong(j);
            KProperty[] kPropertyArr2 = ContactListWidget.N0;
            contactListWidget.getClass();
            KProperty kProperty = ContactListWidget.N0[4];
            contactListWidget.H0.b(contactListWidget, boxLong);
            m58.b(ix3.b).h(list2).o(this.o).k(vo4.c().getDisplayMetrics().density * 12.0f).build().o(contactListWidget);
        }
        return Unit.INSTANCE;
    }
}
