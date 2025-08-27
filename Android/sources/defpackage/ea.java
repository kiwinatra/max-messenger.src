package defpackage;

import android.os.Bundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;

/* renamed from: ea  reason: default package */
public final class ea extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AddChatAdminsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ea(Continuation continuation, AddChatAdminsScreen addChatAdminsScreen) {
        super(2, continuation);
        this.b = addChatAdminsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ea eaVar = new ea(continuation, this.b);
        eaVar.a = obj;
        return eaVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ea) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        g49 g49 = (g49) this.a;
        if (g49 instanceof c49) {
            r4c r4c = r4c.b;
            KProperty[] kPropertyArr = AddChatAdminsScreen.w0;
            long c0 = this.b.c0();
            long j = ((c49) g49).a;
            r4c.getClass();
            StringBuilder sb = new StringBuilder(":profile/edit/admin_permission?chat_id=");
            sb.append(c0);
            sb.append("&contact_id=");
            String m = wj6.m(sb, j, "&permissions_type=setup_new_admin");
            Unit unit = Unit.INSTANCE;
            r4c.W0().b(m, (Bundle) null);
        }
        return Unit.INSTANCE;
    }
}
