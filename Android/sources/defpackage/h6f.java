package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: h6f  reason: default package */
public interface h6f {
    void a() {
        Function0 onRequestInterceptTouchEvent = getOnRequestInterceptTouchEvent();
        if (onRequestInterceptTouchEvent != null) {
            onRequestInterceptTouchEvent.invoke();
        }
    }

    Function0 getOnRequestInterceptTouchEvent();

    Function1 getOnTouch();

    void setOnRequestInterceptTouchEvent(Function0 function0);

    void setOnTouch(Function1 function1);
}
