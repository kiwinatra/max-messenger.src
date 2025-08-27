package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: d7  reason: default package */
public final class d7 extends View {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7(Context context, int i) {
        super(context);
        this.a = i;
    }

    public int getWindowSystemUiVisibility() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return super.getWindowSystemUiVisibility();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
