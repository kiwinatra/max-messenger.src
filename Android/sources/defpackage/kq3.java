package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.contactlist.ContactListWidget;

/* renamed from: kq3  reason: default package */
public final class kq3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ContactListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kq3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.b = contactListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        kq3 kq3 = new kq3(this.b, continuation);
        kq3.a = obj;
        return kq3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kq3) create((po3) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        po3 po3 = (po3) this.a;
        KProperty[] kPropertyArr = ContactListWidget.N0;
        ContactListWidget contactListWidget = this.b;
        contactListWidget.i0();
        CharSequence d0 = contactListWidget.d0();
        t56 t56 = contactListWidget.x;
        t56 t562 = contactListWidget.w;
        t56 t563 = contactListWidget.v;
        if (d0 == null || d0.length() == 0) {
            t563.G(((po3) contactListWidget.f0().v0.a.getValue()).a);
            t562.G(CollectionsKt.emptyList());
            t56.G(((po3) contactListWidget.f0().v0.a.getValue()).c);
            return Unit.INSTANCE;
        }
        t563.G(po3.a);
        t562.G(po3.b);
        t56.G(po3.c);
        return Unit.INSTANCE;
    }
}
