package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: i6f  reason: default package */
public final class i6f implements h6f {
    public Function1 a;
    public Function0 b;

    public final Function0 getOnRequestInterceptTouchEvent() {
        return this.b;
    }

    public final Function1 getOnTouch() {
        return this.a;
    }

    public final void setOnRequestInterceptTouchEvent(Function0 function0) {
        this.b = function0;
    }

    public final void setOnTouch(Function1 function1) {
        this.a = function1;
    }
}
