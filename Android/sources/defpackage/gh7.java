package defpackage;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: gh7  reason: default package */
public final class gh7 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gh7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onClick(View view) {
        Layout layout;
        Layout layout2;
        switch (this.a) {
            case 0:
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) this.b;
                ((nd) inputPhoneScreen.x.getValue()).f("MESSAGE_LINK_OPEN", "text");
                InputPhoneScreen.c0(inputPhoneScreen, q8.p(qad.o6, inputPhoneScreen.getContext()));
                return;
            case 1:
                InputPhoneScreen inputPhoneScreen2 = (InputPhoneScreen) this.b;
                ((nd) inputPhoneScreen2.x.getValue()).f("MESSAGE_LINK_OPEN", "text");
                InputPhoneScreen.c0(inputPhoneScreen2, q8.p(qad.p6, inputPhoneScreen2.getContext()));
                return;
            default:
                rd5 rd5 = (rd5) this.b;
                if (!rd5.w0) {
                    rd5.x0 = true;
                    rd5.x = rd5.z;
                    rd5.requestLayout();
                    return;
                } else if (!rd5.x0 && (layout = rd5.z) != null && (layout2 = rd5.y) != null) {
                    rd5.x0 = true;
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{layout2.getHeight(), layout.getHeight()});
                    ofInt.setInterpolator(new gh5());
                    ofInt.setDuration(200);
                    ofInt.addUpdateListener(new z00(10, (Object) rd5));
                    ofInt.addListener(new tf(1, rd5, layout));
                    ofInt.addListener(new uf(2, rd5));
                    ofInt.start();
                    return;
                } else {
                    return;
                }
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                fu4.k.f((rd5) this.b).getText().getClass();
                textPaint.setColor(-16745729);
                return;
        }
    }
}
