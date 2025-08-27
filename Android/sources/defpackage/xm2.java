package defpackage;

import android.os.Bundle;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: xm2  reason: default package */
public final class xm2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xm2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xm2 xm2 = new xm2(continuation, this.b);
        xm2.a = obj;
        return xm2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xm2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        eo2 eo2 = (eo2) this.a;
        boolean z = eo2 instanceof bo2;
        ChatScreen chatScreen = this.b;
        if (z) {
            bo2 bo2 = (bo2) eo2;
            List list = bo2.a;
            KProperty[] kPropertyArr = ChatScreen.d1;
            chatScreen.getClass();
            m58.b(ix3.a).h(list).m(bo2.b).o(bo2.c).d().build().o(chatScreen);
        } else if (eo2 instanceof do2) {
            chatScreen.v.c(rq1.CHAT_HEAD, false);
            ((lf1) chatScreen.a1.getValue()).j(((do2) eo2).a, false, new zj2(1, eo2));
        } else if (eo2 instanceof co2) {
            co2 co2 = (co2) eo2;
            ChatScreen.G0(this.b, Boxing.boxInt(co2.a), (String) null, co2.b, co2.c, 2);
        } else if (eo2 instanceof zn2) {
            KProperty[] kPropertyArr2 = BottomSheetWidget.v0;
            zn2 zn2 = (zn2) eo2;
            e9d e9d = null;
            ng3 a2 = b0h.a(zn2.a, (Bundle) null, 6);
            zn2.b.forEach(new mn2(new nj2(1, a2, ng3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 1), 0));
            ConfirmationBottomSheet e = a2.e();
            e.setTargetController(chatScreen);
            zx3 zx3 = chatScreen;
            while (zx3.getParentController() != null) {
                zx3 = zx3.getParentController();
            }
            l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
            if (l9d != null) {
                e9d = l9d.K();
            }
            e.p0(chatScreen);
            if (e9d != null) {
                i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d, true, "BottomSheetWidget");
                e9d.G(i9d);
            }
        } else if (eo2 instanceof ao2) {
            ao2 ao2 = (ao2) eo2;
            KProperty[] kPropertyArr3 = ChatScreen.d1;
            MessageWriteWidget r0 = chatScreen.r0();
            if (r0 != null) {
                CharSequence charSequence = ao2.a;
                r0.d0().setText(charSequence);
                if (!(charSequence == null || charSequence.length() == 0)) {
                    dc9 d0 = r0.d0();
                    int length = charSequence.length();
                    if (length == -1) {
                        d0.getClass();
                    } else {
                        bc9 bc9 = d0.c;
                        bc9.setSelection(Math.min(length, bc9.length()));
                    }
                }
            }
            ((v0f) chatScreen.z0.getValue()).k(ao2.a);
            Long l = ao2.b;
            if (l != null) {
                chatScreen.q0().u(l);
            } else {
                Long l2 = ao2.c;
                if (l2 != null) {
                    chatScreen.q0().t(l2, false);
                }
            }
        } else if (Intrinsics.areEqual((Object) eo2, (Object) yn2.a)) {
            KProperty[] kPropertyArr4 = ChatScreen.d1;
            chatScreen.w0().d();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
