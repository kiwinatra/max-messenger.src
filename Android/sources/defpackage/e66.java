package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e66  reason: default package */
public final class e66 implements ezc {
    public final void a(MotionEvent motionEvent) {
    }

    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2) {
            return false;
        }
        recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    public final void e(boolean z) {
    }
}
