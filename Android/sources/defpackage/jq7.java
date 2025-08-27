package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* renamed from: jq7  reason: default package */
public final class jq7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ KeyboardEmojiWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jq7(KeyboardEmojiWidget keyboardEmojiWidget, Continuation continuation) {
        super(2, continuation);
        this.b = keyboardEmojiWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        jq7 jq7 = new jq7(this.b, continuation);
        jq7.a = obj;
        return jq7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jq7) create((g45) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        g45 g45 = (g45) this.a;
        KProperty[] kPropertyArr = KeyboardEmojiWidget.y;
        KeyboardEmojiWidget keyboardEmojiWidget = this.b;
        RecyclerView c0 = keyboardEmojiWidget.c0();
        int i = g45.b;
        if (i >= 0) {
            c0.G0();
            GridLayoutManager u = y7e.u(c0);
            if (u != null) {
                u.m1(i, 0);
            }
        }
        RecyclerView d0 = keyboardEmojiWidget.d0();
        int i2 = g45.c;
        if (i2 >= 0) {
            d0.G0();
            d0.z0(i2);
        }
        if (g45.b >= 0) {
            keyboardEmojiWidget.c0().a0();
        }
        return Unit.INSTANCE;
    }
}
