package defpackage;

import android.content.Context;
import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: fp3  reason: default package */
public final class fp3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ kp3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fp3(Object obj, Continuation continuation, kp3 kp3) {
        super(2, continuation);
        this.a = obj;
        this.b = kp3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fp3(this.a, continuation, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fp3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        vk3 vk3 = (vk3) this.a;
        kp3 kp3 = this.b;
        mtb b2 = ((ptb) kp3.e.getValue()).b(vk3.r());
        boolean g = ((ptb) kp3.e.getValue()).g(vk3.r());
        String t = vk3.t(kl0.b);
        if (vk3.y()) {
            charSequence = null;
        } else {
            boolean z = vk3.w;
            Context context = kp3.c;
            charSequence = z ? context.getString(jad.I) : (!vk3.x() || !vk3.A()) ? vk3.x() ? context.getString(qad.J) : ((rtb) kp3.f.getValue()).d(vk3, true) : context.getString(qad.T8);
        }
        long r = vk3.r();
        String f = vk3.f();
        if (f != null) {
            return new zo3(r, (CharSequence) f, hhf.b(vk3.j()), CollectionsKt.listOf(Boxing.boxLong(vk3.s())), charSequence, (CharSequence) null, t != null ? Uri.parse(t) : null, g, vk3.z(), vk3.q(), vk3.w, (qdb) null, (Boolean) null, b2.b, vk3.x(), 14336);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
