package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.List;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;

/* renamed from: b81  reason: default package */
public final class b81 extends FrameLayout implements oi1 {
    public final /* synthetic */ CallIncomingScreen a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b81(CallIncomingScreen callIncomingScreen, Context context) {
        super(context);
        this.a = callIncomingScreen;
        setId(kgc.call_screen_incoming_container_id);
        setBackgroundColor(l2b.d.i);
        tm1 tm1 = new tm1(getContext(), (AttributeSet) null);
        tm1.setId(kgc.call_incoming_avatar);
        tm1.setMode(pm1.a);
        tm1.setBackgroundState(qm1.b);
        addView(tm1, -1, -1);
    }

    public final void C(long j, List list, boolean z) {
        u9a u9a = CallIncomingScreen.x;
        CallIncomingScreen callIncomingScreen = this.a;
        callIncomingScreen.getClass();
        ((tm1) callIncomingScreen.c.getValue(callIncomingScreen, CallIncomingScreen.y[0])).C(j, list, z);
    }

    public final void a(boolean z) {
        if (z) {
            CallIncomingScreen callIncomingScreen = this.a;
            if (callIncomingScreen.getView() != null) {
                ((tm1) callIncomingScreen.c.getValue(callIncomingScreen, CallIncomingScreen.y[0])).a(z);
            }
        }
    }
}
