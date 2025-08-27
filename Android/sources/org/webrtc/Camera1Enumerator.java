package org.webrtc;

import android.hardware.Camera;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

public class Camera1Enumerator implements CameraEnumerator {
    private static final String TAG = "Camera1Enumerator";
    private static List<List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats;
    private final boolean captureToTexture;

    public Camera1Enumerator() {
        this(true);
    }

    public static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(List<int[]> list) {
        ArrayList arrayList = new ArrayList();
        for (int[] next : list) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(next[0], next[1]));
        }
        return arrayList;
    }

    public static List<Size> convertSizes(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Camera.Size next : list) {
            arrayList.add(new Size(next.width, next.height));
        }
        return arrayList;
    }

    private static List<CameraEnumerationAndroid.CaptureFormat> enumerateFormats(int i) {
        int i2;
        Logging.d(TAG, "Get supported formats for camera index " + i + ".");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Camera camera = null;
        try {
            Logging.d(TAG, "Opening camera with index " + i);
            Camera open = Camera.open(i);
            Camera.Parameters parameters = open.getParameters();
            open.release();
            ArrayList arrayList = new ArrayList();
            try {
                List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                int i3 = 0;
                if (supportedPreviewFpsRange != null) {
                    int[] iArr = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                    i3 = iArr[0];
                    i2 = iArr[1];
                } else {
                    i2 = 0;
                }
                for (Camera.Size next : parameters.getSupportedPreviewSizes()) {
                    arrayList.add(new CameraEnumerationAndroid.CaptureFormat(next.width, next.height, i3, i2));
                }
            } catch (Exception e) {
                Logging.e(TAG, "getSupportedFormats() failed on camera index " + i, e);
            }
            Logging.d(TAG, "Get supported formats for camera index " + i + " done. Time spent: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms.");
            return arrayList;
        } catch (RuntimeException e2) {
            Logging.e(TAG, "Open camera failed on camera index " + i, e2);
            ArrayList arrayList2 = new ArrayList();
            if (camera != null) {
                camera.release();
            }
            return arrayList2;
        } catch (Throwable th) {
            if (camera != null) {
                camera.release();
            }
            throw th;
        }
    }

    public static int getCameraIndex(String str) {
        Logging.d(TAG, "getCameraIndex: " + str);
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            if (str.equals(getDeviceName(i))) {
                return i;
            }
        }
        throw new IllegalArgumentException(g63.j("No such camera: ", str, ", have: ", Arrays.toString(getDeviceNamesS())));
    }

    private static Camera.CameraInfo getCameraInfo(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
            return cameraInfo;
        } catch (Exception e) {
            Logging.e(TAG, "getCameraInfo failed on index " + i, e);
            return null;
        }
    }

    public static String getDeviceName(int i) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i);
        if (cameraInfo == null) {
            return null;
        }
        String str = cameraInfo.facing == 1 ? "front" : "back";
        int i2 = cameraInfo.orientation;
        return "Camera " + i + ", Facing " + str + ", Orientation " + i2;
    }

    private static String[] getDeviceNamesS() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            String deviceName = getDeviceName(i);
            if (deviceName != null) {
                arrayList.add(deviceName);
                Logging.d(TAG, "Index: " + i + ". " + deviceName);
            } else {
                Logging.e(TAG, "Index: " + i + ". Failed to query camera name.");
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera1Capturer(str, cameraEventsHandler, this.captureToTexture);
    }

    public String[] getDeviceNames() {
        return getDeviceNamesS();
    }

    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(getCameraIndex(str));
    }

    public boolean isBackFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 0;
    }

    public boolean isFrontFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 1;
    }

    public Camera1Enumerator(boolean z) {
        this.captureToTexture = z;
    }

    public static synchronized List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i) {
        List<CameraEnumerationAndroid.CaptureFormat> list;
        synchronized (Camera1Enumerator.class) {
            try {
                if (cachedSupportedFormats == null) {
                    cachedSupportedFormats = new ArrayList();
                    for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
                        cachedSupportedFormats.add(enumerateFormats(i2));
                    }
                }
                list = cachedSupportedFormats.get(i);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return list;
    }

    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper) {
        return new Camera1Capturer(str, cameraEventsHandler, captureFormatHelper, this.captureToTexture);
    }
}
