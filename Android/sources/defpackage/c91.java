package defpackage;

import android.content.Context;
import android.graphics.PointF;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* renamed from: c91  reason: default package */
public final class c91 implements b91, al1 {
    public final Lazy a;
    public final PointF b;
    public final Lazy c;

    public c91(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.c = LazyKt.lazy(LazyThreadSafetyMode.NONE, new ur(3, lazy));
        ((dq1) lazy2.getValue()).c(this);
        this.b = kne.y((Context) lazy.getValue());
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        super.onDestroyed(conversationDestroyedInfo);
        PointF y = kne.y((Context) this.a.getValue());
        PointF pointF = this.b;
        pointF.x = y.x;
        pointF.y = y.y;
    }
}
