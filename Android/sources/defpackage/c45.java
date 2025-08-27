package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: c45  reason: default package */
public final class c45 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i45 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c45(i45 i45, Continuation continuation) {
        super(2, continuation);
        this.c = i45;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        c45 c45 = new c45(this.c, continuation);
        c45.b = obj;
        return c45;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c45) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ds5 ds5;
        Object[] objArr;
        int i;
        int i2;
        int i3;
        n25 n25;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.a;
        int i5 = 1;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            ds5 = (ds5) this.b;
            vs6 vs6 = this.c.c;
            this.b = ds5;
            this.a = 1;
            k45 k45 = (k45) vs6.b;
            k45.getClass();
            List createListBuilder = CollectionsKt.createListBuilder();
            int i6 = 0;
            while (i6 < 9) {
                Object[] objArr2 = gsg.a[i6];
                int length = objArr2.length;
                int i7 = 0;
                while (i7 < length) {
                    Object obj3 = objArr2[i7];
                    if (obj3 instanceof String) {
                        n25 n252 = r8;
                        i = i7;
                        i2 = length;
                        i3 = i6;
                        objArr = objArr2;
                        n25 n253 = new n25(i6, i5, (CharSequence) obj3, (List) null, k45.c((String) obj3), 0, 40);
                        createListBuilder.add(n252);
                    } else {
                        i = i7;
                        i2 = length;
                        i3 = i6;
                        objArr = objArr2;
                        if (obj3 instanceof Object[]) {
                            Object[] objArr3 = (Object[]) obj3;
                            if (objArr3[0] instanceof Object[]) {
                                String str = ((String[][]) objArr3)[0][0];
                                n25 = new n25(i3, i5, str, ArraysKt.flatten((Object[][]) objArr3), k45.c(str), 0, 32);
                            } else {
                                String str2 = ((String[]) objArr3)[0];
                                n25 = new n25(i3, i5, str2, ArraysKt.toList((T[]) objArr3), k45.c(str2), 0, 32);
                            }
                            createListBuilder.add(n25);
                        }
                    }
                    i5++;
                    i7 = i + 1;
                    i6 = i3;
                    length = i2;
                    objArr2 = objArr;
                }
                i6++;
            }
            obj2 = CollectionsKt.build(createListBuilder);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i4 == 1) {
            ds5 = (ds5) this.b;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else if (i4 == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.b = null;
        this.a = 2;
        if (ds5.a(obj2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
