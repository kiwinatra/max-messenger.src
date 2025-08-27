package ru.ok.android.externcalls.sdk.video;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/video/CameraManager;", "", "Ldv1;", "cameraParams", "", "switchCamera", "(Ldv1;)V", "", "isCapturingFromFrontCamera", "()Z", "", "getNumberOfCameras", "()I", "numberOfCameras", "isCameraEnabled", "setCameraEnabled", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface CameraManager {
    int getNumberOfCameras();

    boolean isCameraEnabled();

    boolean isCapturingFromFrontCamera();

    void setCameraEnabled(boolean z);

    void switchCamera(dv1 dv1);
}
