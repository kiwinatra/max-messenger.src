package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.Size;

/* renamed from: cx1  reason: default package */
public final class cx1 implements CameraVideoCapturer.CaptureFormatHelper {
    public final voc a;

    public /* synthetic */ cx1(voc voc) {
        this.a = voc;
    }

    public a8g a(pf9 pf9) {
        int t0 = pf9.t0();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < t0; i4++) {
            if (i4 != 0) {
                boolean z = true;
                if (i4 == 1) {
                    i2 = pf9.w0();
                } else if (i4 != 2) {
                    try {
                        pf9.A();
                    } catch (Throwable th) {
                        this.a.log("VideoQualityUpdateNotificationParser", "Can't parse VideoQualityUpdate " + th);
                        return null;
                    }
                } else {
                    q1 B0 = pf9.B0();
                    if (!(B0.g() == 3)) {
                        continue;
                    } else {
                        int g = B0.g();
                        if (g != 0) {
                            if (g != 1) {
                                z = false;
                            }
                            if (!z) {
                                i3 = B0.q().f();
                            }
                        } else {
                            throw null;
                        }
                    }
                }
            } else {
                i = pf9.w0();
            }
        }
        return new a8g(new z7g(i, i2, i3));
    }

    public CameraEnumerationAndroid.CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List list, int i) {
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = super.getClosestSupportedFramerateRange(list, i);
        String m = a81.m("available fps ranges are ", CollectionsKt___CollectionsKt.joinToString$default(list, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        voc voc = this.a;
        voc.log("CaptureFormatHelper", m);
        voc.log("CaptureFormatHelper", "closest frame rate range for requested " + i + " is " + closestSupportedFramerateRange);
        return closestSupportedFramerateRange;
    }

    public Size getClosestSupportedSize(List list, int i, int i2) {
        Size closestSupportedSize = super.getClosestSupportedSize(list, i, i2);
        String m = a81.m("available frame sizes are ", CollectionsKt___CollectionsKt.joinToString$default(list, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        voc voc = this.a;
        voc.log("CaptureFormatHelper", m);
        voc.log("CaptureFormatHelper", "closest frame size range for requested " + i + "x" + i2 + " is " + closestSupportedSize);
        return closestSupportedSize;
    }
}
