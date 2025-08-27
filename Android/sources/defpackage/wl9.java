package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.messages.list.loader.MessageModel;

/* renamed from: wl9  reason: default package */
public final class wl9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ en9 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wl9(en9 en9, Continuation continuation) {
        super(2, continuation);
        this.b = en9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wl9(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wl9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        en9 en9 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList c = ((wj9) en9.l1.getValue()).c();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(c, 10));
            Iterator it = c.iterator();
            while (it.hasNext()) {
                arrayList.add(Boxing.boxLong(((MessageModel) it.next()).a));
            }
            long j = en9.b.a;
            this.a = 1;
            obj = ((wo9) en9.G0.getValue()).b(j, arrayList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!((Boolean) obj).booleanValue()) {
            gc8 c2 = ((osa) en9.w).c();
            vl9 vl9 = new vl9(en9, (Continuation) null);
            this.a = 2;
            if (ev0.I(c2, vl9, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
