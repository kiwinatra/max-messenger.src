package defpackage;

import android.os.Bundle;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: bx2  reason: default package */
public final class bx2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatsListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bx2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.b = chatsListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bx2 bx2 = new bx2(continuation, this.b);
        bx2.a = obj;
        return bx2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bx2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        View view;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zs2 zs2 = (zs2) this.a;
        boolean z = zs2 instanceof iid;
        ChatsListWidget chatsListWidget = this.b;
        if (z) {
            KProperty[] kPropertyArr = ChatsListWidget.I0;
            chatsListWidget.e0().z0(0);
            ((iid) zs2).getClass();
            qc7 qc7 = (qc7) cs2.a.getAccessor().j(qc7.class);
            if (qc7 != null) {
                qc7.f(SetsKt.setOf(new pc7(nc7.MADE_2_PIN, 1)), jgd.CHATS_LIST_TAB);
            }
        } else if (zs2 instanceof q8e) {
            CharSequence a2 = ((q8e) zs2).a.a(chatsListWidget.getContext());
            if (a2 != null) {
                e0b e0b = new e0b((Widget) chatsListWidget);
                e0b.i(a2);
                e0b.j();
            }
        } else {
            e9d e9d = null;
            if (zs2 instanceof i8e) {
                i8e i8e = (i8e) zs2;
                KProperty[] kPropertyArr2 = ChatsListWidget.I0;
                chatsListWidget.getClass();
                KProperty[] kPropertyArr3 = BottomSheetWidget.v0;
                ng3 a3 = b0h.a(i8e.b, o54.f(TuplesKt.to("selected.chatId.Action", Long.valueOf(i8e.a))), 4);
                a3.f(i8e.c);
                i8e.d.forEach(new lj2(new nj2(1, a3, ng3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 3), 2));
                ConfirmationBottomSheet e = a3.e();
                e.setTargetController(chatsListWidget);
                zx3 zx3 = chatsListWidget;
                while (zx3.getParentController() != null) {
                    zx3 = zx3.getParentController();
                }
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
            } else if (zs2 instanceof e8e) {
                CharSequence a4 = ((e8e) zs2).a.a(chatsListWidget.getContext());
                if (a4 != null) {
                    e0b e0b2 = new e0b((Widget) chatsListWidget);
                    e0b2.f(r0b.a);
                    e0b2.i(a4);
                    e0b2.g(t0b.a);
                    zx3 parentController = chatsListWidget.getParentController();
                    e0b2.c(new n0b(0, (parentController == null || (view = parentController.getView()) == null) ? 0 : view.getPaddingBottom(), 3));
                    e0b2.d(new vs6(11, (Object) zs2));
                    e0b2.j();
                }
            } else if (zs2 instanceof h23) {
                KProperty[] kPropertyArr4 = BottomSheetWidget.v0;
                ng3 a5 = b0h.a(new igf(clc.chat_list_confirm_clear_saved_messages_history_title), (Bundle) null, 6);
                a5.f(new igf(clc.chat_list_confirm_clear_saved_messages_history_subtitle));
                a5.b(ngc.oneme_saved_messages_clear_history, new igf(clc.chat_list_confirm_clear_saved_messages_history_negative_button));
                a5.c(oad.a, new igf(qad.m0));
                ConfirmationBottomSheet e2 = a5.e();
                e2.setTargetController(chatsListWidget);
                zx3 zx32 = chatsListWidget;
                while (zx32.getParentController() != null) {
                    zx32 = zx32.getParentController();
                }
                l9d l9d2 = zx32 instanceof l9d ? (l9d) zx32 : null;
                if (l9d2 != null) {
                    e9d = l9d2.K();
                }
                e2.p0(chatsListWidget);
                if (e9d != null) {
                    i9d i9d2 = new i9d(e2, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d2, true, "BottomSheetWidget");
                    e9d.G(i9d2);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
