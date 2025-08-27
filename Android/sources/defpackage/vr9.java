package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: vr9  reason: default package */
public final class vr9 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ is9 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vr9(is9 is9, Continuation continuation) {
        super(2, continuation);
        this.c = is9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vr9 vr9 = new vr9(this.c, continuation);
        vr9.b = obj;
        return vr9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vr9) create((va8) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            va8 va8 = (va8) this.b;
            jz9 jz9 = new jz9(va8.d);
            long[] jArr = va8.b;
            long[] jArr2 = va8.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr2[i2];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                jz9.e(jArr[(i2 << 3) + i4]);
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            is9 is9 = this.c;
            List b2 = is9.b(jz9);
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(10, DurationUnit.SECONDS);
            this.a = 1;
            if (is9.l(duration, b2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
