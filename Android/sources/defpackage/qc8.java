package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.main.MainScreen;

/* renamed from: qc8  reason: default package */
public final class qc8 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MainScreen a;
    public final /* synthetic */ pc8 b;
    public final /* synthetic */ fu4 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qc8(MainScreen mainScreen, pc8 pc8, fu4 fu4, Continuation continuation) {
        super(2, continuation);
        this.a = mainScreen;
        this.b = pc8;
        this.c = fu4;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qc8(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qc8) create((k2b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        fu4 fu4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Iterator it = this.a.c.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fu4 = this.c;
            if (!hasNext) {
                break;
            }
            ViewGroup viewGroup = (ViewGroup) ((Map.Entry) it.next()).getValue();
            if (!viewGroup.isAttachedToWindow()) {
                fu4.e(fu4, viewGroup);
            }
        }
        pc8 pc8 = this.b;
        if (!pc8.isAttachedToWindow()) {
            fu4.e(fu4, pc8);
        }
        return Unit.INSTANCE;
    }
}
