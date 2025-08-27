package defpackage;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: lcg  reason: default package */
public final class lcg extends kd8 implements View.OnTouchListener {
    public final View b;
    public final Function1 c;
    public final cla o;

    public lcg(View view, Function1 function1, cla cla) {
        this.b = view;
        this.c = function1;
        this.o = cla;
    }

    public final void a() {
        this.b.setOnTouchListener((View.OnTouchListener) null);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        cla cla = this.o;
        if (this.a.get()) {
            return false;
        }
        try {
            if (!((Boolean) this.c.invoke(motionEvent)).booleanValue()) {
                return false;
            }
            cla.d(motionEvent);
            return true;
        } catch (Exception e) {
            cla.onError(e);
            dispose();
            return false;
        }
    }
}
