package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;
import one.me.sdk.uikit.common.views.EmptySearchView;

/* renamed from: nb  reason: default package */
public final class nb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AdminsFromContactsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nb(Continuation continuation, AdminsFromContactsScreen adminsFromContactsScreen) {
        super(2, continuation);
        this.b = adminsFromContactsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        nb nbVar = new nb(continuation, this.b);
        nbVar.a = obj;
        return nbVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nb) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        KProperty[] kPropertyArr = AdminsFromContactsScreen.X;
        AdminsFromContactsScreen adminsFromContactsScreen = this.b;
        boolean j = ((xb) adminsFromContactsScreen.c.getValue()).j();
        if (j) {
            RecyclerView d0 = adminsFromContactsScreen.d0();
            nwe nwe = adminsFromContactsScreen.x;
            if (nwe != null) {
                d0.r0(nwe);
            }
            adminsFromContactsScreen.x = null;
        } else {
            RecyclerView d02 = adminsFromContactsScreen.d0();
            nwe nwe2 = adminsFromContactsScreen.x;
            if (nwe2 != null) {
                d02.r0(nwe2);
            }
            adminsFromContactsScreen.x = null;
            adminsFromContactsScreen.c0(adminsFromContactsScreen.d0());
        }
        int i = 0;
        boolean z = j && list.isEmpty();
        ((EmptySearchView) adminsFromContactsScreen.v.getValue(adminsFromContactsScreen, AdminsFromContactsScreen.X[2])).setVisibility(z ? 0 : 8);
        RecyclerView d03 = adminsFromContactsScreen.d0();
        if (!(!z)) {
            i = 8;
        }
        d03.setVisibility(i);
        adminsFromContactsScreen.z.G(list);
        return Unit.INSTANCE;
    }
}
