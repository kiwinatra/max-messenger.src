package defpackage;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: bi9  reason: default package */
public final class bi9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessageWriteWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bi9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.b = messageWriteWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bi9 bi9 = new bi9(continuation, this.b);
        bi9.a = obj;
        return bi9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bi9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        vg9 vg9;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        sg9 sg9 = (sg9) this.a;
        KProperty[] kPropertyArr = MessageWriteWidget.C0;
        MessageWriteWidget messageWriteWidget = this.b;
        messageWriteWidget.getClass();
        String str = null;
        CharSequence charSequence = sg9 != null ? sg9.b : null;
        if (sg9 == null) {
            charSequence = null;
        }
        if (sg9 == null) {
            dc9 d0 = messageWriteWidget.d0();
            sb9 sb9 = sb9.a;
            d0.setRightOuterIconActionState(new vb9());
            messageWriteWidget.d0().setText((CharSequence) null);
            messageWriteWidget.d0().setRightInnerIconVisible(true);
        } else {
            messageWriteWidget.d0().setRightOuterIconActionState(sg9.d ? xb9.a : yb9.a);
            if (sg9.e) {
                messageWriteWidget.d0().setText((CharSequence) null);
                messageWriteWidget.d0().f(charSequence);
            }
            messageWriteWidget.d0().setRightInnerIconVisible(false);
        }
        messageWriteWidget.i0().k(charSequence);
        messageWriteWidget.k0(sg9 != null ? sg9.c : null);
        sn0 sn0 = messageWriteWidget.v0;
        if (y7e.L(sn0)) {
            messageWriteWidget.e0().setCounter((Integer) null);
            if (!(sg9 == null || (vg9 = sg9.c) == null)) {
                str = vg9.d;
            }
            if (!(str == null || str.length() == 0)) {
                messageWriteWidget.e0().setDrawOverlay(true);
            }
            messageWriteWidget.e0().setImageClickListener(new oh9(messageWriteWidget, 0));
        } else if (sn0.isInitialized()) {
            occ occ = (occ) sn0.getValue();
            messageWriteWidget.e0().setImageClickListener((View.OnClickListener) null);
        }
        return Unit.INSTANCE;
    }
}
