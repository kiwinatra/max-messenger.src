package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.UpdateAppearance;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: j0f  reason: default package */
public final class j0f extends ClickableSpan implements UpdateAppearance, phf {
    public static final /* synthetic */ int w = 0;
    public final Function0 a;
    public final o0f b;
    public final Function2 c;
    public int o = -16745729;
    public int v;

    public j0f(Function0 function0, o0f o0f, Function2 function2) {
        this.a = function0;
        this.b = o0f;
        this.c = function2;
        ((k2b) function0.invoke()).e().getClass();
        ((k2b) function0.invoke()).e().getClass();
        this.v = -16745729;
    }

    public final void onClick(View view) {
        this.c.invoke(view, this.b);
    }

    public final void onThemeChanged(k2b k2b) {
        k2b.e().getClass();
        this.o = -16745729;
        k2b.e().getClass();
        this.v = -16745729;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.o);
        textPaint.bgColor = w53.h(this.v, 80);
        textPaint.setUnderlineText(false);
    }
}
