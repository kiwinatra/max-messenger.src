package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: l30  reason: default package */
public final class l30 extends BroadcastReceiver implements Runnable {
    public final /* synthetic */ int a;
    public final Handler b;
    public final Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ l30(Object obj, Handler handler, Object obj2, int i) {
        this.a = i;
        this.o = obj;
        this.b = handler;
        this.c = obj2;
    }

    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.b.post(this);
                    return;
                }
                return;
            default:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.b.post(this);
                    return;
                }
                return;
        }
    }

    public final void run() {
        switch (this.a) {
            case 0:
                if (((he) this.o).b) {
                    ((mc5) this.c).a.D1(-1, 3, false);
                    return;
                }
                return;
            default:
                if (((he) this.o).b) {
                    ((nc5) this.c).a.G1(-1, 3, false);
                    return;
                }
                return;
        }
    }
}
