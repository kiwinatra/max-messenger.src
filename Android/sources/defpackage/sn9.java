package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: sn9  reason: default package */
public final class sn9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessagesListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sn9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.b = messagesListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        sn9 sn9 = new sn9(continuation, this.b);
        sn9.a = obj;
        return sn9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sn9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        dk9 dk9 = (dk9) this.a;
        KProperty[] kPropertyArr = MessagesListWidget.R0;
        MessagesListWidget messagesListWidget = this.b;
        messagesListWidget.getClass();
        e9d e9d = null;
        if (dk9 instanceof h8e) {
            h8e h8e = (h8e) dk9;
            KProperty[] kPropertyArr2 = BottomSheetWidget.v0;
            ng3 a2 = b0h.a(h8e.b, o54.f(TuplesKt.to("selected.messageIds.Action", CollectionsKt.toLongArray(h8e.a))), 4);
            a2.f(h8e.c);
            h8e.d.forEach(new lj2(new nj2(1, a2, ng3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 6), 6));
            ConfirmationBottomSheet e = a2.e();
            e.setTargetController(messagesListWidget);
            zx3 zx3 = messagesListWidget;
            while (zx3.getParentController() != null) {
                zx3 = zx3.getParentController();
            }
            l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
            if (l9d != null) {
                e9d = l9d.K();
            }
            e.p0(messagesListWidget);
            if (e9d != null) {
                i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d, true, "BottomSheetWidget");
                e9d.G(i9d);
            }
        } else if (dk9 instanceof n8e) {
            n8e n8e = (n8e) dk9;
            KProperty[] kPropertyArr3 = BottomSheetWidget.v0;
            ng3 a3 = b0h.a(n8e.e, o54.f(TuplesKt.to("selected.messageIds.Action", new long[]{n8e.a}), TuplesKt.to("bot.shareContact.confirm.keyboardId", n8e.b), TuplesKt.to("bot.shareContact.confirm.button", n8e.d), TuplesKt.to("bot.shareContact.confirm.buttonPosition", n8e.c)), 4);
            a3.f(n8e.f);
            n8e.g.forEach(new lj2(new nj2(1, a3, ng3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 7), 5));
            ConfirmationBottomSheet e2 = a3.e();
            e2.setTargetController(messagesListWidget);
            zx3 zx32 = messagesListWidget;
            while (zx32.getParentController() != null) {
                zx32 = zx32.getParentController();
            }
            l9d l9d2 = zx32 instanceof l9d ? (l9d) zx32 : null;
            if (l9d2 != null) {
                e9d = l9d2.K();
            }
            e2.p0(messagesListWidget);
            if (e9d != null) {
                i9d i9d2 = new i9d(e2, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d2, true, "BottomSheetWidget");
                e9d.G(i9d2);
            }
        } else if (dk9 instanceof m8e) {
            rk9 i0 = messagesListWidget.i0();
            long j = ((m8e) dk9).a;
            i0.getClass();
            xag.h(i0.z, new pk9(j));
        } else if (dk9 instanceof j8e) {
            rk9 i02 = messagesListWidget.i0();
            long j2 = ((j8e) dk9).a;
            i02.getClass();
            xag.h(i02.z, new ok9(j2));
        } else if (dk9 instanceof o8e) {
            o8e o8e = (o8e) dk9;
            CharSequence a4 = o8e.a.a(messagesListWidget.getContext());
            if (a4 != null) {
                e0b e0b = new e0b((Widget) messagesListWidget);
                e0b.i(a4);
                e0b.a(o8e.c);
                e0b.f(new o0b(o8e.b));
                e0b.j();
            }
        } else if (dk9 instanceof kd9) {
            qc7 qc7 = (qc7) vi9.a.getAccessor().j(qc7.class);
            if (qc7 != null) {
                qc7.f(SetsKt.setOf(new pc7(nc7.MADE_2_PIN, 1)), jgd.CHAT);
            }
        } else if (dk9 instanceof xa) {
            yrc yrc = messagesListWidget.Q0;
            if (yrc != null) {
                xa xaVar = (xa) dk9;
                yrc.e(xaVar.c, xaVar.a, xaVar.b);
            }
        } else if (Intrinsics.areEqual((Object) dk9, (Object) bcb.a)) {
            View view = messagesListWidget.getView();
            if (view != null) {
                b0h.K(view, qw6.CONFIRM);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
