package ru.ok.android.externcalls.sdk.video.internal;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/ScreenCaptureManagerImpl;", "Lru/ok/android/externcalls/sdk/video/ScreenCaptureManager;", "Lhz0;", "call", "<init>", "(Lhz0;)V", "", "enabled", "isFastScreenShareEnabled", "", "setScreenCaptureEnabled", "(ZZ)V", "setAudioCaptureEnabled", "(Z)V", "Lhz0;", "isScreenCaptureEnabled", "()Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ScreenCaptureManagerImpl implements ScreenCaptureManager {
    private final hz0 call;

    public ScreenCaptureManagerImpl(hz0 hz0) {
        this.call = hz0;
    }

    public boolean isScreenCaptureEnabled() {
        return this.call.w1.b;
    }

    public void setAudioCaptureEnabled(boolean z) {
        this.call.D(z);
    }

    public void setScreenCaptureEnabled(boolean z, boolean z2) {
        hz0 hz0 = this.call;
        if (hz0.i() && hz0.i()) {
            if (z) {
                hz0.v("rtc.screencapture.enabled");
            }
            mc1 mc1 = hz0.J1;
            mc1.getClass();
            if (!z || mc1.d(new mo1(2, mc1.i))) {
                mz9 mz9 = hz0.w1;
                if (mz9.b != z) {
                    mz9.b = z;
                    mz9.c = z2;
                    mz9.a();
                    hz0.x();
                    hz0.k(b51.v, (Object) null);
                }
                gm1 gm1 = hz0.r1;
                if (gm1 != null) {
                    kbb kbb = (!mz9.b || hz0.b2) ? hz0.k2 : hz0.j2;
                    if (kbb != null) {
                        if (gm1.I()) {
                            gm1 gm12 = hz0.r1;
                            gm12.z0 = kbb;
                            jj8 jj8 = gm12.v0;
                            if (jj8 != null) {
                                jj8.e(kbb);
                            }
                        } else {
                            gm1 gm13 = hz0.r1;
                            gm13.z0 = kbb;
                            jj8 jj82 = gm13.v0;
                            if (jj82 != null) {
                                jj82.e(kbb);
                            } else {
                                gm13.T(kbb);
                            }
                        }
                    }
                }
            }
        }
        if (!z) {
            hz0.D(false);
        }
    }
}
