package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chats.picker.PickerChatController;

/* renamed from: xgb  reason: default package */
public final class xgb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickerChatController b;
    public final /* synthetic */ LinearLayout c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xgb(PickerChatController pickerChatController, LinearLayout linearLayout, Continuation continuation) {
        super(2, continuation);
        this.b = pickerChatController;
        this.c = linearLayout;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xgb xgb = new xgb(this.b, this.c, continuation);
        xgb.a = obj;
        return xgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xgb) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int size = ((Set) this.a).size();
        PickerChatController pickerChatController = this.b;
        boolean z = ((View) pickerChatController.X.getValue()).getVisibility() == 0;
        sn0 sn0 = pickerChatController.X;
        u90 u90 = pickerChatController.Y;
        LinearLayout linearLayout = this.c;
        if (!z && size > 0) {
            esf.a(linearLayout, u90);
            if (sn0.isInitialized()) {
                ((View) sn0.getValue()).setVisibility(0);
            }
        } else if (z && size == 0) {
            esf.a(linearLayout, u90);
            h88.D(sn0);
            e9d e9d = pickerChatController.w0;
            if (e9d == null || !e9d.n()) {
                int i = pq7.a;
                if (pq7.b(pq7.c)) {
                    pickerChatController.x0.k();
                }
            } else {
                pickerChatController.f0().A0.C(og9.a);
            }
        }
        return Unit.INSTANCE;
    }
}
