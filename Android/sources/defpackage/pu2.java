package defpackage;

import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: pu2  reason: default package */
public final class pu2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatsListSearchScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pu2(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.b = chatsListSearchScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        pu2 pu2 = new pu2(continuation, this.b);
        pu2.a = obj;
        return pu2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pu2) create((zs2) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zs2 zs2 = (zs2) this.a;
        boolean z = zs2 instanceof iid;
        ChatsListSearchScreen chatsListSearchScreen = this.b;
        if (z) {
            KProperty[] kPropertyArr = ChatsListSearchScreen.F0;
            chatsListSearchScreen.g0();
            ((iid) zs2).getClass();
            qc7 qc7 = (qc7) cs2.a.getAccessor().j(qc7.class);
            if (qc7 != null) {
                qc7.f(SetsKt.setOf(new pc7(nc7.MADE_2_PIN, 1)), jgd.CHATS_LIST_SEARCH_RESULT);
            }
        } else if (zs2 instanceof q8e) {
            CharSequence a2 = ((q8e) zs2).a.a(chatsListSearchScreen.getContext());
            if (a2 == null) {
                return Unit.INSTANCE;
            }
            z3a z3a = chatsListSearchScreen.E0;
            if (z3a != null) {
                z3a.o();
            }
            e0b e0b = new e0b((Widget) chatsListSearchScreen);
            e0b.i(a2);
            chatsListSearchScreen.E0 = e0b.j();
        } else if (zs2 instanceof i8e) {
            i8e i8e = (i8e) zs2;
            KProperty[] kPropertyArr2 = ChatsListSearchScreen.F0;
            chatsListSearchScreen.getClass();
            KProperty[] kPropertyArr3 = BottomSheetWidget.v0;
            ng3 a3 = b0h.a(i8e.b, o54.f(TuplesKt.to("selected.chatId.Action", Long.valueOf(i8e.a))), 4);
            a3.f(i8e.c);
            i8e.d.forEach(new lj2(new nj2(1, a3, ng3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 2), 1));
            ConfirmationBottomSheet e = a3.e();
            e.setTargetController(chatsListSearchScreen);
            zx3 zx3 = chatsListSearchScreen;
            while (zx3.getParentController() != null) {
                zx3 = zx3.getParentController();
            }
            e9d e9d = null;
            l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
            if (l9d != null) {
                e9d = l9d.K();
            }
            e.p0(chatsListSearchScreen);
            if (e9d != null) {
                i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d, true, "BottomSheetWidget");
                e9d.G(i9d);
            }
        }
        return Unit.INSTANCE;
    }
}
