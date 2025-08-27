package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: aa9  reason: default package */
public final class aa9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessageContextMenuBottomSheet b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aa9(Continuation continuation, MessageContextMenuBottomSheet messageContextMenuBottomSheet) {
        super(2, continuation);
        this.b = messageContextMenuBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        aa9 aa9 = new aa9(continuation, this.b);
        aa9.a = obj;
        return aa9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((aa9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        KProperty[] kPropertyArr = MessageContextMenuBottomSheet.X0;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.b;
        messageContextMenuBottomSheet.getClass();
        if (v5a instanceof pa4) {
            messageContextMenuBottomSheet.i0(true);
            zr0 zr0 = new zr0((zx3) messageContextMenuBottomSheet, (Function0) new x99(messageContextMenuBottomSheet, v5a));
            if (messageContextMenuBottomSheet.getRouter() != null) {
                messageContextMenuBottomSheet.getRouter().a(zr0);
            } else {
                messageContextMenuBottomSheet.addLifecycleListener(new la(messageContextMenuBottomSheet, zr0, 7));
            }
        }
        return Unit.INSTANCE;
    }
}
