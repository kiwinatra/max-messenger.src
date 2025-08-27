package defpackage;

import android.util.AttributeSet;
import android.view.ViewStub;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import one.me.calls.ui.ui.call.CallScreen;
import ru.ok.tamtam.nano.Protos;

/* renamed from: yg1  reason: default package */
public final /* synthetic */ class yg1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallScreen b;

    public /* synthetic */ yg1(CallScreen callScreen, int i) {
        this.a = i;
        this.b = callScreen;
    }

    public final Object invoke() {
        CallScreen callScreen = this.b;
        switch (this.a) {
            case 0:
                gga gga = CallScreen.J0;
                return te8.m(callScreen.getContext());
            case 1:
                gga gga2 = CallScreen.J0;
                oh1 oh1 = oh1.a;
                Lazy h = oh1.getAccessor().h(tq1.class);
                Lazy lazy = rjd.a;
                Lazy h2 = oh1.getAccessor().h(hl1.class);
                Lazy lazy2 = callScreen.c;
                return new jj1(h, (qcb) callScreen.o.getValue(), (ap1) oh1.getAccessor().g(ap1.class), new q01(h2, (wgd) lazy2.getValue()), new l91((qcb) callScreen.o.getValue()), new hl1(callScreen.getContext()), (wgd) lazy2.getValue(), oh1.getAccessor().h(x23.class), oh1.getAccessor().h(uj5.class));
            case 2:
                gga gga3 = CallScreen.J0;
                zy3 zy3 = new zy3();
                zy3.h = new zg1(callScreen, 1);
                zy3.i = new zg1(callScreen, 2);
                return zy3;
            case 3:
                gga gga4 = CallScreen.J0;
                ViewStub viewStub = new ViewStub(callScreen.getContext());
                viewStub.setId(kgc.call_bottom_unavailable_control);
                return viewStub;
            case 4:
                gga gga5 = CallScreen.J0;
                p11 p11 = new p11(callScreen.getContext(), (AttributeSet) null);
                p11.setLayoutParams(new fj3(-1, 0));
                p11.setVisibility(8);
                return p11;
            case 5:
                gga gga6 = CallScreen.J0;
                return new nh1(callScreen);
            case 6:
                gga gga7 = CallScreen.J0;
                return new dh1(callScreen);
            case 7:
                gga gga8 = CallScreen.J0;
                return new mh1(callScreen);
            case 8:
                gga gga9 = CallScreen.J0;
                return Integer.valueOf(((wgd) callScreen.c.getValue()).a);
            case 9:
                gga gga10 = CallScreen.J0;
                return new ng1(1, callScreen);
            case 10:
                mmb mmb = callScreen.Y;
                Lazy lazy3 = callScreen.A0;
                Lazy lazy4 = callScreen.Z;
                return new xc1(mmb, (nh1) callScreen.x0.getValue(), (dh1) callScreen.y0.getValue(), (mh1) callScreen.z0.getValue(), (lk1) callScreen.v.getValue(), lazy3, lazy4, (ll1) callScreen.p0().N0.getValue(), (p6g) callScreen.p0().J0.getValue(), (b) callScreen.p0().M0.getValue());
            case 11:
                gga gga11 = CallScreen.J0;
                ViewPager2 viewPager2 = new ViewPager2(callScreen.getContext());
                viewPager2.setId(kgc.call_modes_view_pager);
                viewPager2.setAdapter((xc1) callScreen.B0.getValue());
                viewPager2.setLayoutParams(new fj3(-1, -1));
                viewPager2.setOrientation(1);
                return viewPager2;
            case 12:
                gga gga12 = CallScreen.J0;
                ViewStub viewStub2 = new ViewStub(callScreen.getContext());
                viewStub2.setId(kgc.call_user_talking_view_label);
                return viewStub2;
            case 13:
                gga gga13 = CallScreen.J0;
                jk1 jk1 = new jk1(callScreen.getContext(), (AttributeSet) null);
                jk1.setLayoutParams(new fj3(-1, -2));
                jk1.setVisibility(8);
                boolean isLaidOut = jk1.isLaidOut();
                mmb mmb2 = callScreen.Y;
                if (!isLaidOut || jk1.isLayoutRequested()) {
                    jk1.addOnLayoutChangeListener(new ch1(callScreen, 0));
                } else {
                    mmb2.c();
                }
                jk1.setControlsMediator(callScreen.l0());
                jk1.setCallSpeakerMediator((lk1) callScreen.v.getValue());
                jk1.setPipBoundariesController(mmb2);
                callScreen.l0().a.add(jk1);
                mmb2.a(jk1, lmb.a);
                return jk1;
            case Protos.Attaches.Attach.LOCATION:
                gga gga14 = CallScreen.J0;
                ViewStub viewStub3 = new ViewStub(callScreen.getContext());
                viewStub3.setId(kgc.call_change_mode_tip_view);
                return viewStub3;
            default:
                gga gga15 = CallScreen.J0;
                t11 t11 = new t11(callScreen.getContext());
                t11.setVisibility(8);
                t11.setTranslationY(vo4.c().getDisplayMetrics().density * -50.0f);
                return t11;
        }
    }
}
