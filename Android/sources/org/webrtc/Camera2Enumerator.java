package org.webrtc;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

public class Camera2Enumerator implements CameraEnumerator {
    private static final double NANO_SECONDS_PER_SECOND = 1.0E9d;
    private static final String TAG = "Camera2Enumerator";
    private static final Map<String, List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats = new HashMap();
    final CameraManager cameraManager;
    final Context context;

    public Camera2Enumerator(Context context2) {
        this.context = context2;
        this.cameraManager = (CameraManager) context2.getSystemService("camera");
    }

    public static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(Range<Integer>[] rangeArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (Range<Integer> range : rangeArr) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(range.getLower().intValue() * i, range.getUpper().intValue() * i));
        }
        return arrayList;
    }

    private static List<Size> convertSizes(Size[] sizeArr) {
        if (sizeArr == null || sizeArr.length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(sizeArr.length);
        for (Size size : sizeArr) {
            arrayList.add(new Size(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    private CameraCharacteristics getCameraCharacteristics(String str) {
        try {
            return this.cameraManager.getCameraCharacteristics(str);
        } catch (CameraAccessException | RuntimeException e) {
            Logging.e(TAG, "Camera access exception", e);
            return null;
        }
    }

    public static int getFpsUnitFactor(Range<Integer>[] rangeArr) {
        return (rangeArr.length != 0 && rangeArr[0].getUpper().intValue() >= 1000) ? 1 : 1000;
    }

    public static List<Size> getSupportedSizes(CameraCharacteristics cameraCharacteristics) {
        ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        return convertSizes(((StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class));
    }

    public static boolean isSupported(Context context2) {
        CameraManager cameraManager2 = (CameraManager) context2.getSystemService("camera");
        try {
            for (String cameraCharacteristics : cameraManager2.getCameraIdList()) {
                if (((Integer) cameraManager2.getCameraCharacteristics(cameraCharacteristics).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                    return false;
                }
            }
            return true;
        } catch (CameraAccessException | RuntimeException e) {
            Logging.e(TAG, "Failed to check if camera2 is supported", e);
            return false;
        }
    }

    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper) {
        return new Camera2Capturer(this.context, str, cameraEventsHandler, captureFormatHelper);
    }

    public String[] getDeviceNames() {
        try {
            return this.cameraManager.getCameraIdList();
        } catch (CameraAccessException e) {
            Logging.e(TAG, "Camera access exception", e);
            return new String[0];
        }
    }

    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(this.context, str);
    }

    public boolean isBackFacing(String str) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        return cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }

    public boolean isFrontFacing(String str) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        return cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    public static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(Context context2, String str) {
        return getSupportedFormats((CameraManager) context2.getSystemService("camera"), str);
    }

    public static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(CameraManager cameraManager2, String str) {
        long j;
        int i;
        Map<String, List<CameraEnumerationAndroid.CaptureFormat>> map = cachedSupportedFormats;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    List<CameraEnumerationAndroid.CaptureFormat> list = map.get(str);
                    return list;
                }
                Logging.d(TAG, "Get supported formats for camera index " + str + ".");
                long elapsedRealtime = SystemClock.elapsedRealtime();
                CameraCharacteristics cameraCharacteristics = cameraManager2.getCameraCharacteristics(str);
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = convertFramerates(rangeArr, getFpsUnitFactor(rangeArr));
                List<Size> supportedSizes = getSupportedSizes(cameraCharacteristics);
                int i2 = 0;
                for (CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange : convertFramerates) {
                    i2 = Math.max(i2, framerateRange.max);
                }
                ArrayList arrayList = new ArrayList();
                for (Size next : supportedSizes) {
                    try {
                        j = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, new Size(next.width, next.height));
                    } catch (Exception unused) {
                        j = 0;
                    }
                    if (j == 0) {
                        i = i2;
                    } else {
                        i = ((int) Math.round(NANO_SECONDS_PER_SECOND / ((double) j))) * 1000;
                    }
                    arrayList.add(new CameraEnumerationAndroid.CaptureFormat(next.width, next.height, 0, i));
                    Logging.d(TAG, "Format: " + next.width + "x" + next.height + "@" + i);
                }
                cachedSupportedFormats.put(str, arrayList);
                Logging.d(TAG, "Get supported formats for camera index " + str + " done. Time spent: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms.");
                return arrayList;
            } catch (Exception e) {
                Logging.e(TAG, "getCameraCharacteristics()", e);
                return new ArrayList();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
