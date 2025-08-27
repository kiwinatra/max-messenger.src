package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;

/* renamed from: x98  reason: default package */
public final /* synthetic */ class x98 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oa8 b;

    public /* synthetic */ x98(oa8 oa8, int i) {
        this.a = i;
        this.b = oa8;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new k26(bs0.D(new k26(new fs5(1, this.b.b.g()), 22), new SuspendLambda(2, (Continuation<Object>) null)), 23);
            case 1:
                oa8 oa8 = this.b;
                oa8.y.setValue(CollectionsKt.toList((List) oa8.x.take()));
                return Unit.INSTANCE;
            default:
                oa8 oa82 = this.b;
                oa82.w.setValue(CollectionsKt.toList((List) oa82.v.take()));
                return Unit.INSTANCE;
        }
    }
}
