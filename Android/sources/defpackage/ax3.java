package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.widget.EditText;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ax3  reason: default package */
public final class ax3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ soc b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ax3(soc soc, Continuation continuation) {
        super(2, continuation);
        this.b = soc;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ax3 ax3 = new ax3(this.b, continuation);
        ax3.a = obj;
        return ax3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ax3) create((bx3) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        bx3 bx3 = (bx3) this.a;
        soc soc = this.b;
        if (((hff) soc.v) != null) {
            int i = bx3.a;
            EditText editText = (EditText) soc.c;
            if (i == editText.getSelectionStart() && bx3.b == editText.getSelectionEnd()) {
                soc.m(editText.getText().toString(), editText.hasSelection(), ((ClipboardManager) ((Context) soc.b).getSystemService("clipboard")).hasPrimaryClip(), false);
            }
        }
        return Unit.INSTANCE;
    }
}
