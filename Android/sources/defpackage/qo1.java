package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: qo1  reason: default package */
public final /* synthetic */ class qo1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallsAudioManagerV3Impl b;

    public /* synthetic */ qo1(CallsAudioManagerV3Impl callsAudioManagerV3Impl, int i) {
        this.a = i;
        this.b = callsAudioManagerV3Impl;
    }

    public final void run() {
        int i = this.a;
        CallsAudioManagerV3Impl callsAudioManagerV3Impl = this.b;
        switch (i) {
            case 0:
                CallsAudioManagerV3Impl.recoverDeviceByTypeRunnable$lambda$0(callsAudioManagerV3Impl);
                return;
            case 1:
                callsAudioManagerV3Impl.syncWithSystemCommunicationDevice();
                return;
            default:
                callsAudioManagerV3Impl.trySetCommunicationDeviceAgain();
                return;
        }
    }
}
