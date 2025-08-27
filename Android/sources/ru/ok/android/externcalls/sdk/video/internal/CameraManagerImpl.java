package ru.ok.android.externcalls.sdk.video.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.ok.android.externcalls.sdk.video.CameraManager;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00058V@VX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/CameraManagerImpl;", "Lru/ok/android/externcalls/sdk/video/CameraManager;", "Lhz0;", "call", "Lkotlin/Function0;", "", "isInited", "isPrepared", "<init>", "(Lhz0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Ldv1;", "cameraParams", "", "switchCamera", "(Ldv1;)V", "Lhz0;", "Lkotlin/jvm/functions/Function0;", "isCapturingFromFrontCamera", "()Z", "", "getNumberOfCameras", "()I", "numberOfCameras", "value", "isCameraEnabled", "setCameraEnabled", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class CameraManagerImpl implements CameraManager {
    private final hz0 call;
    private final Function0<Boolean> isInited;
    private final Function0<Boolean> isPrepared;

    public CameraManagerImpl(hz0 hz0, Function0<Boolean> function0, Function0<Boolean> function02) {
        this.call = hz0;
        this.isInited = function0;
        this.isPrepared = function02;
    }

    public int getNumberOfCameras() {
        if (this.isInited.invoke().booleanValue()) {
            return this.call.M0;
        }
        return 0;
    }

    public boolean isCameraEnabled() {
        return this.call.w1.f;
    }

    public boolean isCapturingFromFrontCamera() {
        return this.call.j1.c() == 1;
    }

    public void setCameraEnabled(boolean z) {
        if (this.isPrepared.invoke().booleanValue()) {
            this.call.G(z);
        }
    }

    public void switchCamera(dv1 dv1) {
        hz0 hz0 = this.call;
        if (hz0.i() && hz0.l1.d) {
            hz0.T0.log("OKRTCCall", "switchCamera");
            hz0.v("rtc.switch_camera");
            d dVar = hz0.j1;
            dVar.Y.log("SlmsSource", "switchCamera");
            dVar.c.a.execute(new c(0, dVar, dv1));
        }
    }
}
