package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: ji9  reason: default package */
public final class ji9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessageWriteWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ji9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.b = messageWriteWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ji9 ji9 = new ji9(continuation, this.b);
        ji9.a = obj;
        return ji9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ji9) create((i0f) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        i0f i0f = (i0f) this.a;
        MessageWriteWidget messageWriteWidget = this.b;
        mw3 mw3 = messageWriteWidget.z0;
        if (mw3 != null) {
            mw3.dismiss();
        }
        if (i0f != null) {
            o0f o0f = i0f.b;
            if (!o0f.w.isEmpty()) {
                Iterable iterable = o0f.w;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                int i = 0;
                for (Object next : iterable) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(new ow3(i, (ngf) new mgf((String) next), (Integer) null, (Integer) null, 28));
                    i = i2;
                }
                mw3 build = m58.b(ix3.a).o(i0f.a).h(arrayList).d().build();
                build.o(messageWriteWidget);
                messageWriteWidget.z0 = build;
            }
        }
        return Unit.INSTANCE;
    }
}
