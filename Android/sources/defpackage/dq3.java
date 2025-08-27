package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: dq3  reason: default package */
public final class dq3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ContactListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dq3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.b = contactListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dq3 dq3 = new dq3(this.b, continuation);
        dq3.a = obj;
        return dq3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dq3) create((xo3) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xo3 xo3 = (xo3) this.a;
        boolean z = xo3 instanceof ma;
        e9d e9d = null;
        ContactListWidget contactListWidget = this.b;
        if (z) {
            KProperty[] kPropertyArr = ContactListWidget.N0;
            if (contactListWidget.c0().b(edb.e)) {
                z5a.g((z5a) contactListWidget.b.getValue(), jgd.CONTACTS_ADD);
                vt3 vt3 = vt3.b;
                vt3.getClass();
                Unit unit = Unit.INSTANCE;
                vt3.W0().b(":contact-list/create-contact", (Bundle) null);
            } else {
                contactListWidget.h0();
            }
        } else if (xo3 instanceof g8e) {
            g8e g8e = (g8e) xo3;
            KProperty[] kPropertyArr2 = ContactListWidget.N0;
            contactListWidget.getClass();
            KProperty[] kPropertyArr3 = BottomSheetWidget.v0;
            ng3 a2 = b0h.a(g8e.b, o54.f(TuplesKt.to("selected.contactId.Action", Long.valueOf(g8e.a))), 4);
            a2.f(g8e.c);
            g8e.d.forEach(new lj2(new nj2(1, a2, ng3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 5), 4));
            ConfirmationBottomSheet e = a2.e();
            e.setTargetController(contactListWidget);
            zx3 zx3 = contactListWidget;
            while (zx3.getParentController() != null) {
                zx3 = zx3.getParentController();
            }
            l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
            if (l9d != null) {
                e9d = l9d.K();
            }
            e.p0(contactListWidget);
            if (e9d != null) {
                i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d, true, "BottomSheetWidget");
                e9d.G(i9d);
            }
        } else if (xo3 instanceof f8e) {
            f8e f8e = (f8e) xo3;
            KProperty[] kPropertyArr4 = ContactListWidget.N0;
            contactListWidget.getClass();
            CharSequence a3 = f8e.a.a(contactListWidget.getContext());
            if (a3 != null) {
                e0b e0b = new e0b((Widget) contactListWidget);
                e0b.i(a3);
                e0b.f(r0b.a);
                e0b.g(t0b.a);
                e0b.d(new vw2(f8e, 1));
                e0b.j();
            }
        } else if (xo3 instanceof q34) {
            vt3 vt32 = vt3.b;
            vt32.getClass();
            Unit unit2 = Unit.INSTANCE;
            vt32.W0().b(":start-conversation/chat", (Bundle) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
