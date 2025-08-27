package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.ok.messages.calls.views.CallRendererView;
import ru.ok.messages.calls.views.IncomingCallControlsView;

/* renamed from: ng1  reason: default package */
public final /* synthetic */ class ng1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ng1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        ViewParent parent2;
        i7b i7b;
        bpe bpe;
        y36 y36;
        ou4 ou4;
        yl7 yl7;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((CallRendererView) obj).w.getClass();
                return false;
            case 1:
                gga gga = CallScreen.J0;
                if (motionEvent == null) {
                    return false;
                }
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
                    if (motionEvent.getAction() != 1 || eventTime >= 100) {
                        return false;
                    }
                    CallScreen callScreen = (CallScreen) obj;
                    if (!callScreen.p0().j(callScreen.l0().g)) {
                        return false;
                    }
                    CallScreen.f0(callScreen);
                }
                return true;
            case 2:
                int action = motionEvent.getAction();
                tt3 tt3 = (tt3) obj;
                if (!((action != 0 && action != 2) || (parent = tt3.a.getParent()) == null || (parent2 = parent.getParent()) == null)) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                return tt3.a.onTouchEvent(motionEvent);
            case 3:
                kx4 kx4 = (kx4) obj;
                kx4.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - kx4.o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        kx4.m = false;
                    }
                    kx4.u();
                    kx4.m = true;
                    kx4.o = System.currentTimeMillis();
                }
                return false;
            case 4:
                r25 r25 = (r25) obj;
                r25.getClass();
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    q25 q25 = r25.F0;
                    if (!(q25 == null || (i7b = (i7b) ((t26) q25).z) == null || (bpe = ((cpe) i7b).G0) == null)) {
                        bpe.b0();
                    }
                    if (o54.y(r25.P0)) {
                        lja s = jha.o(300, 50, TimeUnit.MILLISECONDS, xfd.a()).s(qe.a());
                        or7 or7 = new or7(new rt3(20, (Object) r25), new lw4(2), m58.e);
                        s.a(or7);
                        r25.P0 = or7;
                    }
                    r25.L0.setPressed(true);
                } else if (action2 != 1 && action2 != 3) {
                    return false;
                } else {
                    o54.k(r25.P0);
                    r25.L0.setPressed(false);
                }
                return true;
            case 5:
                if (!(motionEvent.getAction() != 0 || (ou4 = y36.F0) == null || (yl7 = (yl7) ((g46) ou4).a.element) == null)) {
                    yl7.t((y36 = (y36) obj));
                }
                return false;
            case 6:
                int i = IncomingCallControlsView.D0;
                int action3 = motionEvent.getAction();
                if (action3 == 0 || action3 == 5) {
                    ((Runnable) obj).run();
                }
                return false;
            case 7:
                sq7 sq7 = (sq7) obj;
                if (sq7.o != null) {
                    int action4 = motionEvent.getAction();
                    if (action4 == 0) {
                        sq7.o.F();
                    } else if (action4 == 1) {
                        sq7.o.i();
                    }
                }
                return false;
            case 8:
                pk4 pk4 = ((ok8) obj).S0;
                return (pk4 == null || ((ValueAnimator) pk4.e) == null) ? false : true;
            case 9:
                KProperty[] kPropertyArr = MessageWriteWidget.C0;
                mh9 h0 = ((MessageWriteWidget) obj).h0();
                h0.getClass();
                xag.h(h0.I0, new wg9(qvc.a, motionEvent));
                return true;
            case 10:
                EditText editText = (EditText) obj;
                Drawable drawable = editText.getCompoundDrawables()[2];
                if (drawable == null || motionEvent.getRawX() < ((float) (((editText.getRight() - editText.getPaddingRight()) - drawable.getBounds().width()) - editText.getCompoundDrawablePadding()))) {
                    return false;
                }
                int action5 = motionEvent.getAction();
                if (action5 != 0) {
                    if (action5 != 1) {
                        return false;
                    }
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                }
                return true;
            case 11:
                return ((Boolean) ((Function2) obj).invoke(view, motionEvent)).booleanValue();
            default:
                ScaleGestureDetector scaleGestureDetector = ((VideoMessageWidget) obj).z;
                if (scaleGestureDetector != null) {
                    scaleGestureDetector.onTouchEvent(motionEvent);
                }
                return true;
        }
    }
}
