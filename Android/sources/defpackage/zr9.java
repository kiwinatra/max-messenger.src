package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zr9  reason: default package */
public final class zr9 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ws c;
    public final /* synthetic */ int o = 100;
    public final /* synthetic */ is9 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zr9(ws wsVar, is9 is9, Continuation continuation) {
        super(2, continuation);
        this.c = wsVar;
        this.v = is9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zr9 zr9 = new zr9(this.c, this.v, continuation);
        zr9.b = obj;
        return zr9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zr9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        long[] jArr;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.b;
            ws wsVar = this.c;
            int i2 = wsVar.c;
            is9 is9 = this.v;
            int i3 = this.o;
            if (i2 <= i3) {
                long[] longArray = CollectionsKt.toLongArray(wsVar);
                this.b = longArray;
                this.a = 1;
                is9.getClass();
                Object d = e14.d(new hs9(is9, (Continuation) null, longArray), this);
                if (d == coroutine_suspended) {
                    return coroutine_suspended;
                }
                long[] jArr2 = longArray;
                obj = d;
                jArr = jArr2;
            } else {
                Iterable<Object> chunked = CollectionsKt.chunked(wsVar, i3);
                jx3 a2 = e14.a(getContext());
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(chunked, 10));
                for (Object yr9 : chunked) {
                    arrayList.add(ev0.d(a2, (q04) null, new yr9(yr9, (Continuation) null, d14, is9), 3));
                }
                this.a = 2;
                obj = j4b.g(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (List) obj;
            }
        } else if (i == 1) {
            jArr = (long[]) this.b;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                z68.f("MissedContactsController", "fail", th);
                return null;
            }
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return (List) obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return CollectionsKt.listOf(TuplesKt.to(jArr, obj));
    }
}
