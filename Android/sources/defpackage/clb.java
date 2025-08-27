package defpackage;

import android.view.View;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.pinbars.PinBarsWidget;

/* renamed from: clb  reason: default package */
public final /* synthetic */ class clb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinBarsWidget b;

    public /* synthetic */ clb(PinBarsWidget pinBarsWidget, int i) {
        this.a = i;
        this.b = pinBarsWidget;
    }

    public final void onClick(View view) {
        Map map;
        ovf ovf;
        ovf ovf2;
        zlb zlb;
        boolean z = true;
        int i = 0;
        pa4 pa4 = null;
        PinBarsWidget pinBarsWidget = this.b;
        switch (this.a) {
            case 0:
                int i2 = PinBarsWidget.x;
                blb c0 = pinBarsWidget.c0();
                ((xy9) c0.z.b).w();
                c0.v.h();
                ymf ymf = pinBarsWidget.a;
                if (ymf != null) {
                    ymf.dismiss();
                }
                pinBarsWidget.a = null;
                return;
            case 1:
                int i3 = PinBarsWidget.x;
                bpb bpb = pinBarsWidget.c0().z;
                xy9 xy9 = (xy9) bpb.b;
                boolean z2 = xy9.z;
                u50 u50 = bpb.a;
                if (z2) {
                    ((xy9) u50.a).q();
                    return;
                } else if (xy9.y) {
                    ((xy9) u50.a).r();
                    return;
                } else {
                    return;
                }
            case 2:
                int i4 = PinBarsWidget.x;
                blb c02 = pinBarsWidget.c0();
                alb alb = c02.b;
                Long l = alb.c;
                if (alb.o != ta2.a) {
                    z = false;
                }
                cy9 n = ((xy9) c02.z.b).n();
                if (!(n == null || (map = n.c) == null)) {
                    Object obj = map.get("MediaMetadata.Extra.MESSAGE_ID");
                    Long l2 = obj instanceof Long ? (Long) obj : null;
                    if (l2 != null) {
                        long longValue = l2.longValue();
                        if (l == null) {
                            Object obj2 = map.get("MediaMetadata.Extra.CHAT_ID");
                            Long l3 = obj2 instanceof Long ? (Long) obj2 : null;
                            if (l3 != null) {
                                long longValue2 = l3.longValue();
                                olb.b.getClass();
                                pa4 = olb.n1(longValue2, longValue, z);
                            }
                        } else {
                            olb olb = olb.b;
                            long longValue3 = l.longValue();
                            olb.getClass();
                            pa4 = olb.n1(longValue3, longValue, z);
                        }
                    }
                }
                if (pa4 != null) {
                    xag.h(c02.Z, pa4);
                    return;
                }
                return;
            case 3:
                int i5 = PinBarsWidget.x;
                blb c03 = pinBarsWidget.c0();
                zx3 parentController = pinBarsWidget.getParentController();
                dlb dlb = parentController instanceof dlb ? (dlb) parentController : null;
                int measuredHeight = dlb != null ? ((ChatScreen) dlb).n0().getMeasuredHeight() : 0;
                rvf rvf = c03.o;
                if (rvf != null && (ovf = (ovf) rvf.i.a.getValue()) != null) {
                    ev0.v(rvf.a, ((osa) rvf.c).b(), (f14) null, new pvf(rvf, ovf.a, (Continuation) null), 2);
                    rvf.h.setValue((Object) null);
                    e0b e0b = (e0b) rvf.f.getValue();
                    e0b.c(new n0b(0, measuredHeight, 3));
                    e0b.f(new o0b(cad.B));
                    e0b.h(new igf(bxa.f));
                    e0b.j();
                    return;
                }
                return;
            case 4:
                int i6 = PinBarsWidget.x;
                rvf rvf2 = pinBarsWidget.c0().o;
                if (rvf2 != null && (ovf2 = (ovf) rvf2.i.a.getValue()) != null) {
                    ev0.v(rvf2.a, ((osa) rvf2.c).b(), (f14) null, new qvf(rvf2, ovf2.a, (Continuation) null), 2);
                    rvf2.h.setValue((Object) null);
                    return;
                }
                return;
            case 5:
                int i7 = PinBarsWidget.x;
                blb c04 = pinBarsWidget.c0();
                zx3 parentController2 = pinBarsWidget.getParentController();
                dlb dlb2 = parentController2 instanceof dlb ? (dlb) parentController2 : null;
                if (dlb2 != null) {
                    i = ((ChatScreen) dlb2).n0().getMeasuredHeight();
                }
                zlb zlb2 = c04.c;
                if (zlb2 != null) {
                    aje aje = zlb2.g;
                    if (aje == null || !aje.isActive()) {
                        zlb2.g = ev0.v(zlb2.d, ((osa) zlb2.b).b(), (f14) null, new ylb(zlb2, i, (Continuation) null), 2);
                        return;
                    }
                    return;
                }
                return;
            default:
                int i8 = PinBarsWidget.x;
                blb c05 = pinBarsWidget.c0();
                alb alb2 = c05.b;
                Long l4 = alb2.c;
                if (l4 != null && (zlb = c05.c) != null) {
                    long longValue4 = l4.longValue();
                    if (alb2.o != ta2.a) {
                        z = false;
                    }
                    Object value = zlb.h.getValue();
                    dmb dmb = value instanceof dmb ? (dmb) value : null;
                    if (dmb != null) {
                        olb.b.getClass();
                        pa4 = olb.n1(longValue4, dmb.a, z);
                    }
                    if (pa4 != null) {
                        xag.h(c05.Z, pa4);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
