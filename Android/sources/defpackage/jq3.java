package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.contactlist.ContactListWidget;

/* renamed from: jq3  reason: default package */
public final class jq3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ContactListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jq3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.b = contactListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        jq3 jq3 = new jq3(this.b, continuation);
        jq3.a = obj;
        return jq3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jq3) create((ngf) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ContactListWidget contactListWidget = this.b;
        CharSequence a2 = ((ngf) this.a).a(contactListWidget.getContext());
        String obj2 = a2 != null ? a2.toString() : null;
        if (obj2 == null) {
            obj2 = "";
        }
        pza searchView = contactListWidget.e0().getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(obj2);
        }
        return Unit.INSTANCE;
    }
}
