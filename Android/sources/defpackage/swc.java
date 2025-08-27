package defpackage;

import android.graphics.drawable.InsetDrawable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: swc  reason: default package */
public final /* synthetic */ class swc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ swc(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    public final Object invoke() {
        Lazy h;
        RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = RecordControlsWidget.g1;
                int ordinal = recordControlsWidget.C0().ordinal();
                Class<dy9> cls = dy9.class;
                Class<gaf> cls2 = gaf.class;
                if (ordinal == 0) {
                    wqg wqg = wqg.a;
                    return new c50(wqg.getAccessor().h(cls2), wqg.getAccessor().h(cls));
                } else if (ordinal == 1) {
                    wqg wqg2 = wqg.a;
                    return new c50(wqg2.getAccessor().h(cls2), wqg2.getAccessor().h(cls));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            case 1:
                KProperty[] kPropertyArr2 = RecordControlsWidget.g1;
                if (recordControlsWidget.C0() == qvc.b) {
                    return new a80();
                }
                return null;
            case 2:
                KProperty[] kPropertyArr3 = RecordControlsWidget.g1;
                qvc C0 = recordControlsWidget.C0();
                yvc yvc = (yvc) recordControlsWidget.b.getValue();
                int ordinal2 = recordControlsWidget.C0().ordinal();
                if (ordinal2 == 0) {
                    h = wqg.a.getAccessor().h(y6g.class);
                } else if (ordinal2 == 1) {
                    h = wqg.a.getAccessor().h(t60.class);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return new pwc(C0, yvc, h, LazyKt.lazy(new swc(recordControlsWidget, 0)), LazyKt.lazy(new swc(recordControlsWidget, 1)));
            case 3:
                KProperty[] kPropertyArr4 = RecordControlsWidget.g1;
                return ew3.b(recordControlsWidget.getContext(), cad.K1);
            case 4:
                KProperty[] kPropertyArr5 = RecordControlsWidget.g1;
                return ew3.b(recordControlsWidget.getContext(), cad.L0);
            case 5:
                KProperty[] kPropertyArr6 = RecordControlsWidget.g1;
                return ew3.b(recordControlsWidget.getContext(), cad.a1);
            case 6:
                KProperty[] kPropertyArr7 = RecordControlsWidget.g1;
                return ew3.b(recordControlsWidget.getContext(), cad.W0);
            default:
                KProperty[] kPropertyArr8 = RecordControlsWidget.g1;
                float f = (float) 2;
                return new InsetDrawable(ew3.b(recordControlsWidget.getContext(), cad.p), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        }
    }
}
