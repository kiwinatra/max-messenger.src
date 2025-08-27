package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import java.lang.reflect.Field;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSink;
import org.webrtc.YuvConverter;

/* renamed from: cab  reason: default package */
public final class cab implements CameraVideoCapturer {
    public final CameraVideoCapturer a;
    public final kv1 b;
    public final voc c;
    public YuvConverter o;
    public SurfaceTextureHelper v;
    public volatile VideoSink w;

    public cab(CameraVideoCapturer cameraVideoCapturer, kv1 kv1, voc voc) {
        this.a = cameraVideoCapturer;
        this.b = kv1;
        this.c = voc;
    }

    public final void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        this.c.log("PatchedVideoCapturer", "addMediaRecorderToCamera");
    }

    public final void changeCaptureFormat(int i, int i2, int i3) {
        this.a.changeCaptureFormat(i, i2, i3);
    }

    public final void dispose() {
        this.a.dispose();
    }

    public final void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        voc voc = this.c;
        voc.log("PatchedVideoCapturer", "initialize");
        if (this.v == null) {
            this.v = surfaceTextureHelper;
            try {
                Field declaredField = SurfaceTextureHelper.class.getDeclaredField("yuvConverter");
                declaredField.setAccessible(true);
                this.o = (YuvConverter) declaredField.get(surfaceTextureHelper);
            } catch (NoSuchFieldException e) {
                voc.logException("PatchedVideoCapturer", "Cant get yuv converter", e);
            } catch (IllegalAccessException e2) {
                voc.logException("PatchedVideoCapturer", "Cant get yuv converter", e2);
            }
            this.a.initialize(surfaceTextureHelper, context, new npg(this, capturerObserver, false, 18));
            return;
        }
        throw new IllegalStateException("Repeated initialization".toString());
    }

    public final boolean isScreencast() {
        this.c.log("PatchedVideoCapturer", "isScreencast");
        return this.a.isScreencast();
    }

    public final void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        this.c.log("PatchedVideoCapturer", "removeMediaRecorderFromCamera");
    }

    public final void startCapture(int i, int i2, int i3) {
        this.c.log("PatchedVideoCapturer", "startCapture");
        this.a.startCapture(i, i2, i3);
    }

    public final void stopCapture() {
        this.c.log("PatchedVideoCapturer", "stopCapture");
        this.a.stopCapture();
    }

    public final void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        this.c.log("PatchedVideoCapturer", "switchCamera");
        this.a.switchCamera(cameraSwitchHandler);
    }

    public final void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        this.c.log("PatchedVideoCapturer", "switchCamera");
        this.a.switchCamera(cameraSwitchHandler, str);
    }
}
