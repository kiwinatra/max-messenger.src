package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: fi9  reason: default package */
public final class fi9 implements bs5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ MessageWriteWidget c;

    public /* synthetic */ fi9(etc etc, MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = etc;
        this.c = messageWriteWidget;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object e = this.b.e(new ei9(ds5, this.c, 0), continuation);
                return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
            default:
                Object e2 = this.b.e(new ei9(ds5, this.c, 1), continuation);
                return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
        }
    }
}
