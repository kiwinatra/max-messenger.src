package defpackage;

import android.graphics.Bitmap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: k35  reason: default package */
public final class k35 extends SuspendLambda implements Function2 {
    public Bitmap a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ int o;
    public final /* synthetic */ m35 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k35(int i, m35 m35, Continuation continuation) {
        super(2, continuation);
        this.o = i;
        this.v = m35;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        k35 k35 = new k35(this.o, this.v, continuation);
        k35.c = obj;
        return k35;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k35) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        Bitmap bitmap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 = (d14) this.c;
            String name = d14.getClass().getName();
            int i2 = this.o;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.o, name, wj6.h(i2, "start extracting sprite by index: "), (Throwable) null);
            }
            Bitmap D = o54.D(this.o, this.v.b);
            m35 m35 = this.v;
            int i3 = this.o;
            ((Bitmap[]) m35.a.b)[i3] = D;
            n6e n6e = m35.d;
            Integer boxInt = Boxing.boxInt(i3);
            this.c = d14;
            this.a = D;
            this.b = 1;
            if (n6e.a(boxInt, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            bitmap = D;
        } else if (i == 1) {
            bitmap = this.a;
            d14 = (d14) this.c;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String name2 = d14.getClass().getName();
        int i4 = this.o;
        a67 a672 = z68.b;
        if (a672 != null && a672.c()) {
            w78 w78 = w78.o;
            if (bitmap == null) {
                z = false;
            }
            a672.d(w78, name2, "finish extracting sprite by index: " + i4 + " , sprite exist: " + z, (Throwable) null);
        }
        return Unit.INSTANCE;
    }
}
