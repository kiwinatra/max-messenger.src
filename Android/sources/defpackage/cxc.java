package defpackage;

import android.animation.IntEvaluator;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: cxc  reason: default package */
public final class cxc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ RecordControlsWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cxc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.b = recordControlsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        cxc cxc = new cxc(continuation, this.b);
        cxc.a = obj;
        return cxc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cxc) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        ArrayDeque arrayDeque;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        byte[] bArr2 = (byte[]) this.a;
        KProperty[] kPropertyArr = RecordControlsWidget.g1;
        RecordControlsWidget recordControlsWidget = this.b;
        c80 F0 = recordControlsWidget.F0();
        Long l = (Long) recordControlsWidget.D0().x0.a.getValue();
        long longValue = l != null ? l.longValue() : 0;
        F0.v = bArr2;
        F0.A0 = longValue;
        F0.w = 0;
        int i = 0;
        F0.x = false;
        Paint paint = F0.z;
        fu4.k.e(F0.getContext()).f().getIcon().getClass();
        paint.setColor(i8b.Y(0.5f, -16745729));
        Path path = F0.x0;
        if (!path.isEmpty()) {
            path.reset();
        }
        if (F0.getMeasuredWidth() != 0) {
            if (!(F0.getMeasuredWidth() == 0 || (bArr = F0.v) == null)) {
                ArrayDeque arrayDeque2 = F0.y0;
                IntEvaluator intEvaluator = c80.D0;
                if (arrayDeque2 == null) {
                    F0.y0 = new ArrayDeque(F0.getPeaksCount());
                    if (bArr.length > 1) {
                        byte[] bArr3 = F0.v;
                        if (bArr3 != null) {
                            for (byte b2 : ArraysKt.copyOfRange(bArr3, bArr3.length - Math.min(bArr3.length, F0.getPeaksCount()), bArr3.length)) {
                                Byte b3 = F0.z0;
                                byte intValue = (byte) c80.D0.evaluate(0.5f, Integer.valueOf(b3 != null ? b3.byteValue() : 0), Integer.valueOf(b2)).intValue();
                                ArrayDeque arrayDeque3 = F0.y0;
                                if (arrayDeque3 != null) {
                                    arrayDeque3.addLast(Byte.valueOf(intValue));
                                }
                                F0.z0 = Byte.valueOf(intValue);
                            }
                        }
                    }
                }
                byte[] bArr4 = F0.v;
                if (bArr4 != null) {
                    Byte b4 = F0.z0;
                    if (b4 == null) {
                        F0.z0 = (byte) 0;
                        ArrayDeque arrayDeque4 = F0.y0;
                        if (arrayDeque4 != null) {
                            arrayDeque4.addLast((byte) 0);
                        }
                    } else {
                        byte intValue2 = (byte) c80.D0.evaluate(0.5f, Integer.valueOf(b4.byteValue()), Integer.valueOf(ArraysKt.last(bArr4))).intValue();
                        ArrayDeque arrayDeque5 = F0.y0;
                        if (arrayDeque5 != null) {
                            i = arrayDeque5.size();
                        }
                        if (i == F0.getPeaksCount() && (arrayDeque = F0.y0) != null) {
                            Byte b5 = (Byte) arrayDeque.removeFirst();
                        }
                        ArrayDeque arrayDeque6 = F0.y0;
                        if (arrayDeque6 != null) {
                            arrayDeque6.addLast(Byte.valueOf(intValue2));
                        }
                        F0.z0 = Byte.valueOf(intValue2);
                    }
                }
            }
            ArrayDeque arrayDeque7 = F0.y0;
            float measuredHeight = ((float) F0.getMeasuredHeight()) / 2.0f;
            path.reset();
            if (arrayDeque7 != null && !arrayDeque7.isEmpty()) {
                float f = F0.o;
                float width = ((float) F0.getWidth()) - (f / 2.0f);
                int size = arrayDeque7.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        float measuredHeight2 = (((float) F0.getMeasuredHeight()) / 127.0f) * ((float) ((Number) arrayDeque7.get(size)).byteValue());
                        float f2 = F0.b;
                        if (measuredHeight2 < f2) {
                            measuredHeight2 = f2;
                        }
                        float f3 = measuredHeight2 / 2.0f;
                        path.moveTo(width, measuredHeight - f3);
                        path.lineTo(width, f3 + measuredHeight);
                        width = (width - f) - F0.c;
                        if (i2 < 0) {
                            break;
                        }
                        size = i2;
                    }
                }
            }
        }
        F0.postInvalidate();
        return Unit.INSTANCE;
    }
}
