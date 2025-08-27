package defpackage;

import android.view.View;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: ex2  reason: default package */
public final class ex2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatsListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ex2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.b = chatsListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ex2 ex2 = new ex2(continuation, this.b);
        ex2.a = obj;
        return ex2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ex2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        View view;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xo3 xo3 = (xo3) this.a;
        boolean z = xo3 instanceof g8e;
        ChatsListWidget chatsListWidget = this.b;
        if (z) {
            g8e g8e = (g8e) xo3;
            KProperty[] kPropertyArr = ChatsListWidget.I0;
            chatsListWidget.getClass();
            KProperty[] kPropertyArr2 = BottomSheetWidget.v0;
            ng3 a2 = b0h.a(g8e.b, o54.f(TuplesKt.to("selected.contactId.Action", Long.valueOf(g8e.a))), 4);
            a2.f(g8e.c);
            g8e.d.forEach(new lj2(new nj2(1, a2, ng3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 4), 3));
            ConfirmationBottomSheet e = a2.e();
            e.setTargetController(chatsListWidget);
            zx3 zx3 = chatsListWidget;
            while (zx3.getParentController() != null) {
                zx3 = zx3.getParentController();
            }
            e9d e9d = null;
            l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
            if (l9d != null) {
                e9d = l9d.K();
            }
            e.p0(chatsListWidget);
            if (e9d != null) {
                i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d, true, "BottomSheetWidget");
                e9d.G(i9d);
            }
        } else if (xo3 instanceof f8e) {
            f8e f8e = (f8e) xo3;
            KProperty[] kPropertyArr3 = ChatsListWidget.I0;
            chatsListWidget.getClass();
            CharSequence a3 = f8e.a.a(chatsListWidget.getContext());
            if (a3 != null) {
                e0b e0b = new e0b((Widget) chatsListWidget);
                e0b.i(a3);
                e0b.f(r0b.a);
                e0b.g(t0b.a);
                zx3 parentController = chatsListWidget.getParentController();
                e0b.c(new n0b(0, (parentController == null || (view = parentController.getView()) == null) ? 0 : view.getPaddingBottom(), 3));
                e0b.d(new vw2(f8e, 0));
                e0b.j();
            }
        }
        return Unit.INSTANCE;
    }
}
