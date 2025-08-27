package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f12  reason: default package */
public abstract class f12 implements lj6 {
    public final CoroutineContext a;
    public final int b;
    public final cu0 c;

    public f12(CoroutineContext coroutineContext, int i, cu0 cu0) {
        this.a = coroutineContext;
        this.b = i;
        this.c = cu0;
    }

    public Object e(ds5 ds5, Continuation continuation) {
        Object d = e14.d(new d12(ds5, this, (Continuation) null), continuation);
        return d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? d : Unit.INSTANCE;
    }

    public final bs5 f(CoroutineContext coroutineContext, int i, cu0 cu0) {
        CoroutineContext coroutineContext2 = this.a;
        CoroutineContext plus = coroutineContext.plus(coroutineContext2);
        cu0 cu02 = cu0.a;
        cu0 cu03 = this.c;
        int i2 = this.b;
        if (cu0 == cu02) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = IntCompanionObject.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            cu0 = cu03;
        }
        return (Intrinsics.areEqual((Object) plus, (Object) coroutineContext2) && i == i2 && cu0 == cu03) ? this : j(plus, i, cu0);
    }

    public String h() {
        return null;
    }

    public abstract Object i(cwb cwb, Continuation continuation);

    public abstract f12 j(CoroutineContext coroutineContext, int i, cu0 cu0);

    public bs5 k() {
        return null;
    }

    public wtc l(d14 d14) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        f14 f14 = f14.c;
        e12 e12 = new e12(this, (Continuation) null);
        zvb zvb = new zvb(o04.b(d14, this.a), o54.a(i, 4, this.c));
        zvb.j0(f14, zvb, e12);
        return zvb;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String h = h();
        if (h != null) {
            arrayList.add(h);
        }
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext = this.a;
        if (coroutineContext != emptyCoroutineContext) {
            arrayList.add("context=" + coroutineContext);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        cu0 cu0 = cu0.a;
        cu0 cu02 = this.c;
        if (cu02 != cu0) {
            arrayList.add("onBufferOverflow=" + cu02);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return g63.l(sb, CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), ']');
    }
}
