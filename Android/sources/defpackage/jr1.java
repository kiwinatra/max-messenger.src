package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: jr1  reason: default package */
public final class jr1 extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public jr1(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = m5a.F(new y3a(23, (Object) this));
                return;
            default:
                this.c = null;
                this.b = new HashMap();
                return;
        }
    }

    public void a(CaptureRequest captureRequest, List list) {
        HashMap hashMap = (HashMap) this.b;
        List list2 = (List) hashMap.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list2.size() + list.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            hashMap.put(captureRequest, arrayList);
            return;
        }
        hashMap.put(captureRequest, list);
    }

    public void b() {
        do1 do1 = (do1) this.c;
        if (do1 != null) {
            do1.b((Object) null);
            this.c = null;
        }
    }

    public List c(CaptureRequest captureRequest) {
        List list = (List) ((HashMap) this.b).get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        switch (this.a) {
            case 1:
                for (CameraCaptureSession.CaptureCallback onCaptureBufferLost : c(captureRequest)) {
                    onCaptureBufferLost.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                }
                return;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                return;
        }
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case 0:
                ((Executor) this.c).execute(new ir1(0, this, totalCaptureResult));
                return;
            case 1:
                for (CameraCaptureSession.CaptureCallback onCaptureCompleted : c(captureRequest)) {
                    onCaptureCompleted.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            default:
                b();
                return;
        }
    }

    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.a) {
            case 1:
                for (CameraCaptureSession.CaptureCallback onCaptureFailed : c(captureRequest)) {
                    onCaptureFailed.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                return;
            case 2:
                b();
                return;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                return;
        }
    }

    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.a) {
            case 1:
                for (CameraCaptureSession.CaptureCallback onCaptureProgressed : c(captureRequest)) {
                    onCaptureProgressed.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                return;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
        }
    }

    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        switch (this.a) {
            case 1:
                for (List<CameraCaptureSession.CaptureCallback> it : ((HashMap) this.b).values()) {
                    for (CameraCaptureSession.CaptureCallback onCaptureSequenceAborted : it) {
                        onCaptureSequenceAborted.onCaptureSequenceAborted(cameraCaptureSession, i);
                    }
                }
                hx1 hx1 = (hx1) this.c;
                if (hx1 != null) {
                    hx1.a();
                    return;
                }
                return;
            case 2:
                b();
                return;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                return;
        }
    }

    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        switch (this.a) {
            case 1:
                for (List<CameraCaptureSession.CaptureCallback> it : ((HashMap) this.b).values()) {
                    for (CameraCaptureSession.CaptureCallback onCaptureSequenceCompleted : it) {
                        onCaptureSequenceCompleted.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    }
                }
                hx1 hx1 = (hx1) this.c;
                if (hx1 != null) {
                    hx1.a();
                    return;
                }
                return;
            case 2:
                b();
                return;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                return;
        }
    }

    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        switch (this.a) {
            case 1:
                for (CameraCaptureSession.CaptureCallback onCaptureStarted : c(captureRequest)) {
                    onCaptureStarted.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                }
                return;
            case 2:
                b();
                return;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                return;
        }
    }

    public jr1(tsd tsd) {
        this.a = 0;
        this.b = new HashSet();
        this.c = tsd;
    }
}
