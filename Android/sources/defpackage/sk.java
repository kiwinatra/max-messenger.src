package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import one.me.rlottie.RLottieDrawable;

/* renamed from: sk  reason: default package */
public final /* synthetic */ class sk implements Function1 {
    public final /* synthetic */ uk a;
    public final /* synthetic */ Canvas b;
    public final /* synthetic */ Ref.IntRef c;
    public final /* synthetic */ Paint o;
    public final /* synthetic */ float v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    public /* synthetic */ sk(uk ukVar, Canvas canvas, Ref.IntRef intRef, Paint paint, float f, int i, int i2) {
        this.a = ukVar;
        this.b = canvas;
        this.c = intRef;
        this.o = paint;
        this.v = f;
        this.w = i;
        this.x = i2;
    }

    public final Object invoke(Object obj) {
        Canvas canvas;
        Paint paint = this.o;
        Canvas canvas2 = (Canvas) obj;
        int i = this.c.element;
        float f = (float) this.w;
        float f2 = (float) this.x;
        uk ukVar = this.a;
        RLottieDrawable rLottieDrawable = ukVar.a;
        Canvas canvas3 = this.b;
        canvas3.save();
        boolean z = ii.b;
        Lazy lazy = uk.Z;
        if (z) {
            ii.a.getClass();
        }
        float f3 = (float) ukVar.w;
        float f4 = this.v;
        canvas3.translate(f4 + f3, f - f3);
        Paint paint2 = ukVar.Y;
        if (paint2 != null) {
            paint2.setColor(-16776961);
            paint2.setAlpha(80);
            canvas3.drawRect(ukVar.z, paint2);
        }
        try {
            canvas = ((Picture) uk.Z.getValue()).beginRecording(rLottieDrawable.getBounds().width(), rLottieDrawable.getBounds().height());
        } catch (IllegalStateException unused) {
            Lazy lazy2 = uk.Z;
            ((Picture) lazy2.getValue()).endRecording();
            canvas = ((Picture) lazy2.getValue()).beginRecording(rLottieDrawable.getBounds().width(), rLottieDrawable.getBounds().height());
        }
        try {
            rLottieDrawable.draw(canvas, paint);
        } catch (IllegalStateException e) {
            e.toString();
            Lazy lazy3 = uk.Z;
            ii.a.getClass();
            if (StringsKt__StringsKt.contains$default((CharSequence) e.toString(), (CharSequence) "Underflow in restore", false, 2, (Object) null) && rLottieDrawable.isRunning()) {
                rLottieDrawable.invalidateInternal();
            }
        }
        ((Picture) uk.Z.getValue()).endRecording();
        ukVar.y = true;
        canvas3.restore();
        ukVar.a(canvas3, i, paint, rLottieDrawable.getRenderingBitmap(), f4, f2);
        return Unit.INSTANCE;
    }
}
