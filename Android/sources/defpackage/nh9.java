package defpackage;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: nh9  reason: default package */
public final /* synthetic */ class nh9 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ nh9(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    public final Object invoke() {
        MessageWriteWidget messageWriteWidget = this.b;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((hq) ((fq) messageWriteWidget.w.getValue())).g.getBoolean("app.messages.send.by.enter", false));
            case 1:
                KProperty[] kPropertyArr = MessageWriteWidget.C0;
                edb edb = (edb) messageWriteWidget.y.getValue();
                eng eng = new eng(messageWriteWidget, 1);
                int i = aza.b;
                edb.getClass();
                String[] strArr = edb.h;
                int i2 = bmc.permissions_audio_title;
                int i3 = aza.e;
                if (edb.i(eng, strArr)) {
                    eng.c(strArr, 160, i2, i, i3);
                } else {
                    edb.f(eng, strArr, 160);
                }
                return Unit.INSTANCE;
            case 2:
                KProperty[] kPropertyArr2 = MessageWriteWidget.C0;
                ((edb) messageWriteWidget.y.getValue()).h(new eng(messageWriteWidget, 1));
                return Unit.INSTANCE;
            default:
                KProperty[] kPropertyArr3 = MessageWriteWidget.C0;
                occ occ = new occ(messageWriteWidget.getContext());
                occ.setLayoutParams(new ViewGroup.LayoutParams(-1, MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density)));
                occ.setRightIconDrawable(ew3.b(occ.getContext(), cad.t0));
                occ.setRightIconClickListener(new oh9(messageWriteWidget, 1));
                b0h.H(occ, new mh0(3, (Continuation) null, 9));
                if (!occ.isLaidOut() || occ.isLayoutRequested()) {
                    occ.addOnLayoutChangeListener(new nn1(6, occ, messageWriteWidget));
                } else if (wgf.d(occ.getTitleView())) {
                    MessageWriteWidget.m0(occ, true);
                }
                return occ;
        }
    }
}
