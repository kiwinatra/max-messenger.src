package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.functions.Function0;

/* renamed from: cq6  reason: default package */
public final class cq6 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ cq6(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                this.b.invoke();
                return true;
            default:
                this.b.invoke();
                return true;
        }
    }
}
