package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: m5e  reason: default package */
public final class m5e extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ShareDataPickerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m5e(ShareDataPickerScreen shareDataPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.b = shareDataPickerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        m5e m5e = new m5e(this.b, continuation);
        m5e.a = obj;
        return m5e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m5e) create((f5e) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (Intrinsics.areEqual((Object) (f5e) this.a, (Object) f5e.a)) {
            ShareDataPickerScreen shareDataPickerScreen = this.b;
            String string = shareDataPickerScreen.getArgs().getString("tag");
            if (string != null) {
                zx3 g = shareDataPickerScreen.getRouter().g(string);
                if ((g instanceof p5e ? (p5e) g : null) != null) {
                    r4c.b.t1();
                }
            }
            a5e.b.W0().d();
        }
        return Unit.INSTANCE;
    }
}
