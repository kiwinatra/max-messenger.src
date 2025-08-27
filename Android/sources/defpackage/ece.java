package defpackage;

import android.graphics.Path;
import android.hardware.camera2.CaptureResult;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Trace;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* renamed from: ece  reason: default package */
public final class ece implements zi6, a07, qk3, h79, ds6, it1, d1g, gze, zn8, do0, gn8 {
    public static final ece b = new ece(1);
    public static final ece c = new ece(2);
    public static final ece o = new ece(3);
    public static final ece v = new ece(4);
    public static final ece w = new ece(5);
    public final /* synthetic */ int a;

    public /* synthetic */ ece(int i) {
        this.a = i;
    }

    public static MediaCodec E(en8 en8) {
        en8.a.getClass();
        String str = en8.a.a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static Path F(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public y33 A(int i) {
        return null;
    }

    public CaptureResult B() {
        return null;
    }

    public ft1 C() {
        return ft1.a;
    }

    public int D(ea6 ea6) {
        String str = ea6.n;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                case 6:
                case 7:
                    return 1;
            }
        }
        throw new IllegalArgumentException(a81.m("Unsupported MIME type: ", str));
    }

    public MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public boolean a0(m69 m69) {
        return false;
    }

    public void accept(Object obj) {
        hga.d.getClass();
        z68.b(hga.f, "cleanUpToTime: failed to remove sent analytics entries", (Throwable) obj);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                lfd lfd = (lfd) obj;
                return ((kbf) ((jbf) xd3.g.getValue())).b();
            default:
                List list = (List) obj;
                return list.isEmpty() ? uh8.a : nh8.e(list);
        }
    }

    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    public void clear() {
    }

    public a9f d() {
        return a9f.b;
    }

    public boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public int f() {
        return MediaCodecList.getCodecCount();
    }

    public boolean g() {
        return false;
    }

    public long getTimestamp() {
        return -1;
    }

    public in8 h(en8 en8) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = E(en8);
            Trace.beginSection("configureCodec");
            mediaCodec.configure(en8.b, en8.d, en8.e, 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new w28(mediaCodec);
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    public int i(Object obj) {
        return ((v33) obj).getSizeInBytes();
    }

    public boolean j() {
        return false;
    }

    public boolean k(ea6 ea6) {
        String str = ea6.n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    public gt1 l() {
        return gt1.a;
    }

    public void m(m69 m69, boolean z) {
    }

    public int n() {
        return 1;
    }

    public boolean o(int i) {
        return false;
    }

    public long p() {
        return 0;
    }

    public y33 q() {
        return null;
    }

    public void s(int i, y33 y33) {
    }

    public ize t(ea6 ea6) {
        String str = ea6.n;
        if (str != null) {
            List list = ea6.q;
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return new ay2(list);
                case 1:
                    return new srd(9);
                case 2:
                    return new b8d(26);
                case 3:
                    return new ox0(27);
                case 4:
                    return new euf(list);
                case 5:
                    return new whe(list);
                case 6:
                    return new nye();
                case 7:
                    return new wtf();
            }
        }
        throw new IllegalArgumentException(a81.m("Unsupported MIME type: ", str));
    }

    public void u(int i, y33 y33) {
    }

    public et1 x() {
        return et1.a;
    }

    public y33 y() {
        return null;
    }

    public boolean z(long j) {
        return true;
    }
}
