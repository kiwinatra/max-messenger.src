package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import one.me.login.welcome.WelcomeScreen;

/* renamed from: umg  reason: default package */
public final class umg extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ WelcomeScreen b;

    public /* synthetic */ umg(WelcomeScreen welcomeScreen, int i) {
        this.a = i;
        this.b = welcomeScreen;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                WelcomeScreen welcomeScreen = this.b;
                ((nd) welcomeScreen.o.getValue()).f("MESSAGE_LINK_OPEN", "text");
                WelcomeScreen.c0(welcomeScreen, q8.p(qad.o6, welcomeScreen.getContext()));
                return;
            default:
                WelcomeScreen welcomeScreen2 = this.b;
                ((nd) welcomeScreen2.o.getValue()).f("MESSAGE_LINK_OPEN", "text");
                WelcomeScreen.c0(welcomeScreen2, q8.p(qad.p6, welcomeScreen2.getContext()));
                return;
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
        }
    }
}
