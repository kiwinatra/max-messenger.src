package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ru.ok.messages.calls.views.CallGridView;

/* renamed from: q61  reason: default package */
public final class q61 implements ezc {
    public final vs6 a;
    public final /* synthetic */ CallGridView b;

    public q61(CallGridView callGridView) {
        this.b = callGridView;
        this.a = new vs6(callGridView.getContext(), (GestureDetector.OnGestureListener) new q00(3, this));
    }

    public final void a(MotionEvent motionEvent) {
    }

    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        ((GestureDetector) this.a.b).onTouchEvent(motionEvent);
        return false;
    }

    public final void e(boolean z) {
    }
}
