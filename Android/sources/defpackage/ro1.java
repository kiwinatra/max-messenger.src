package defpackage;

import java.util.concurrent.Executor;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: ro1  reason: default package */
public final /* synthetic */ class ro1 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ro1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                CallsAudioManagerV3Impl.startTrackingAudioDevices$lambda$4$lambda$3((CallsAudioManagerV3Impl) this.b, runnable);
                return;
            case 1:
                v0g.W(((yo8) this.b).y, runnable);
                return;
            default:
                v0g.W(((yx8) this.b).l, runnable);
                return;
        }
    }
}
