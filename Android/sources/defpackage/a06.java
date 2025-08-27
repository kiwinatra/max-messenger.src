package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: a06  reason: default package */
public final class a06 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ m06 b;
    public final /* synthetic */ Lazy c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a06(m06 m06, Lazy lazy, Continuation continuation) {
        super(2, continuation);
        this.b = m06;
        this.c = lazy;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new a06(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a06) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        vk3 m;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            m06 m06 = this.b;
            KProperty[] kPropertyArr = m06.D0;
            long j = this.b.c;
            this.a = 1;
            obj2 = ((my2) ((qx2) m06.y.getValue())).m(j, this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a32 a32 = (a32) obj2;
        zx5 zx5 = this.b.A0;
        String str = null;
        Set set = zx5 != null ? zx5.A0 : null;
        if (set == null) {
            set = SetsKt.emptySet();
        }
        jz5 jz5 = new jz5((mgf) null, !set.contains(a26.NO_TITLE_EDIT));
        if (a32 == null) {
            this.b.v0.setValue(CollectionsKt.listOf(jz5, new l16(2)));
            return Unit.INSTANCE;
        }
        this.b.y0.updateAndGet(new y22(a32, 1));
        m06 m062 = this.b;
        Lazy lazy = this.c;
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(jz5);
        createListBuilder.add(new l16(536870914));
        Uri m2 = m06.m(a32, (x23) m062.w.getValue());
        long j2 = a32.b.a;
        if (m2 != null) {
            str = m2.toString();
        }
        String str2 = str;
        ((vb2) ((fq2) lazy.getValue())).getClass();
        a32.l0();
        CharSequence charSequence = a32.X;
        long g = a32.g();
        a32.m0();
        createListBuilder.add(new m16(j2, str2, charSequence, g, a32.v0, a32.Y() || ((m = a32.m()) != null && m.z()), -2147483644));
        this.b.v0.setValue(CollectionsKt.build(createListBuilder));
        return Unit.INSTANCE;
    }
}
