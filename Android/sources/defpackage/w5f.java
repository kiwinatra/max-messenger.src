package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: w5f  reason: default package */
public final class w5f extends FrameLayout implements h6f {
    public final /* synthetic */ i6f a = new Object();

    /* JADX WARNING: type inference failed for: r1v1, types: [i6f, java.lang.Object] */
    public w5f(Context context) {
        super(context);
    }

    public final void a() {
        this.a.a();
    }

    public Function0<Unit> getOnRequestInterceptTouchEvent() {
        return this.a.b;
    }

    public Function1<MotionEvent, Boolean> getOnTouch() {
        return this.a.a;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Function1 onTouch = this.a.getOnTouch();
        return (onTouch != null ? ((Boolean) onTouch.invoke(motionEvent)).booleanValue() : false) || Boolean.valueOf(super.onInterceptTouchEvent(motionEvent)).booleanValue();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Function1 onTouch = this.a.getOnTouch();
        return (onTouch != null ? ((Boolean) onTouch.invoke(motionEvent)).booleanValue() : false) || Boolean.valueOf(super.onTouchEvent(motionEvent)).booleanValue();
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        a();
    }

    public void setOnRequestInterceptTouchEvent(Function0<Unit> function0) {
        this.a.b = function0;
    }

    public void setOnTouch(Function1<? super MotionEvent, Boolean> function1) {
        this.a.a = function1;
    }
}
