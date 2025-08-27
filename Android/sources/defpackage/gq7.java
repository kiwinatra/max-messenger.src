package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* renamed from: gq7  reason: default package */
public final class gq7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ KeyboardEmojiWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gq7(KeyboardEmojiWidget keyboardEmojiWidget, Continuation continuation) {
        super(2, continuation);
        this.b = keyboardEmojiWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        gq7 gq7 = new gq7(this.b, continuation);
        gq7.a = obj;
        return gq7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gq7) create((f45) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        f45 f45 = (f45) this.a;
        KeyboardEmojiWidget keyboardEmojiWidget = this.b;
        keyboardEmojiWidget.w.G(f45.a);
        keyboardEmojiWidget.v.G(f45.b);
        return Unit.INSTANCE;
    }
}
