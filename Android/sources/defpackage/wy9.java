package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* renamed from: wy9  reason: default package */
public final class wy9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ xy9 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wy9(xy9 xy9, Continuation continuation) {
        super(2, continuation);
        this.a = xy9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wy9(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wy9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        gob c;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xy9 xy9 = this.a;
        xme xme = xy9.u;
        qo8 qo8 = xy9.o;
        long j = -1;
        xme.setValue(Boxing.boxLong(qo8 != null ? qo8.h() : -1));
        qo8 qo82 = xy9.o;
        xy9.w.setValue(Boxing.boxLong(qo82 != null ? qo82.T() : -1));
        qo8 qo83 = xy9.o;
        boolean z = true;
        int playbackState = qo83 != null ? qo83.getPlaybackState() : 1;
        xy9.x = playbackState;
        xy9.A = playbackState == 2;
        xy9.C = playbackState == 4;
        qo8 qo84 = xy9.o;
        boolean z2 = qo84 != null && qo84.a();
        xy9.z = z2;
        if (z2 || xy9.x != 3) {
            z = false;
        }
        xy9.y = z;
        qo8 qo85 = xy9.o;
        if (qo85 != null) {
            qo85.k();
        }
        qo8 qo86 = xy9.o;
        us8 us8 = null;
        xy9.D = qo86 != null ? qo86.C0() : null;
        qo8 qo87 = xy9.o;
        int i = -1;
        xy9.E = xy9.d(xy9, qo87 != null ? qo87.B0() : -1);
        qo8 qo88 = xy9.o;
        if (qo88 != null) {
            i = qo88.D0();
        }
        xy9.d(xy9, i);
        qo8 qo89 = xy9.o;
        if (qo89 != null) {
            qo89.q0();
        }
        qo8 qo810 = xy9.o;
        if (qo810 != null) {
            qo810.getRepeatMode();
        }
        qo8 qo811 = xy9.o;
        if (qo811 != null) {
            us8 = qo811.y0();
        }
        xy9.F = us8;
        qo8 qo812 = xy9.o;
        if (qo812 != null) {
            j = qo812.e();
        }
        xy9.G = j;
        qo8 qo813 = xy9.o;
        xy9.H = (qo813 == null || (c = qo813.c()) == null) ? 1.0f : c.a;
        qo8 qo814 = xy9.o;
        if (qo814 != null) {
            qo814.G0();
        }
        xy9.J.setValue(Boxing.boxFloat(RangesKt.coerceIn((float) (((Number) xy9.u.getValue()).doubleValue() / ((double) xy9.G)), (float) c44.DEFAULT_ASPECT_RATIO, 1.0f)));
        return Unit.INSTANCE;
    }
}
