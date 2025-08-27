package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* renamed from: mt1  reason: default package */
public final class mt1 {
    public final ArrayList a;
    public final ArrayList b;
    public final xga c;
    public final fbf d;
    public final voc e;
    public final CopyOnWriteArraySet f = new CopyOnWriteArraySet();
    public final Object g = new Object();
    public volatile String h = null;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public int l;
    public int m;
    public int n;

    public mt1(wga wga, CameraVideoCapturer cameraVideoCapturer, fbf fbf, ArrayList arrayList, ArrayList arrayList2, boolean z, voc voc) {
        ArrayList arrayList3 = new ArrayList();
        this.a = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.b = arrayList4;
        this.e = voc;
        voc voc2 = ((dd4) wga).a;
        this.c = new xga(0, new cab(cameraVideoCapturer, new kv1(voc2), voc2));
        this.d = fbf;
        arrayList3.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        this.i = z;
    }

    public final void a() {
        boolean z;
        ArrayList<CameraEnumerationAndroid.CaptureFormat> arrayList;
        synchronized (this.g) {
            try {
                z = this.i;
                arrayList = z ? this.a : this.b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.e.log("CameraCapturerAdapter", "select capture format for ".concat(z ? "front camera" : "back camera"));
        boolean z2 = ur9.a;
        if (!arrayList.isEmpty()) {
            ed7 ed7 = new ed7(16);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (CameraEnumerationAndroid.CaptureFormat captureFormat : arrayList) {
                int i2 = captureFormat.width;
                if (i2 >= 500) {
                    int i3 = captureFormat.height;
                    if (i2 * i3 <= 921600) {
                        float f2 = ((float) i2) / ((float) i3);
                        if (Math.abs(f2 - 1.7777778f) < 0.1f) {
                            arrayList2.add(captureFormat);
                        } else if (((double) f2) > 1.1d && !z) {
                            arrayList3.add(captureFormat);
                        }
                    }
                }
            }
            Collections.sort(arrayList2, ed7);
            Collections.sort(arrayList3, ed7);
            CameraEnumerationAndroid.CaptureFormat captureFormat2 = arrayList2.size() > 0 ? (CameraEnumerationAndroid.CaptureFormat) arrayList2.get(0) : arrayList3.size() > 0 ? (CameraEnumerationAndroid.CaptureFormat) arrayList3.get(0) : (CameraEnumerationAndroid.CaptureFormat) arrayList.get(arrayList.size() - 1);
            int round = Math.round(((float) captureFormat2.framerate.max) / 1000.0f);
            int i4 = (round <= 0 || round > 60) ? 30 : round;
            voc voc = this.e;
            StringBuilder sb = new StringBuilder("capture format selected, size: ");
            sb.append(captureFormat2.width);
            sb.append("x");
            g63.o(sb, captureFormat2.height, ", frame rate: ", round, ", actual frame rate: ");
            sb.append(i4);
            voc.log("CameraCapturerAdapter", sb.toString());
            int i5 = captureFormat2.width;
            int i6 = captureFormat2.height;
            int round2 = i4 < 1000 ? i4 : Math.round(((float) i4) / 1000.0f);
            if (round2 != i4) {
                String h2 = g63.h("Unexpected frame rate requested: ", i4, round2, ", truncated to ");
                this.e.reportException("CameraCapturerAdapter", h2, new IllegalArgumentException(h2));
            }
            voc voc2 = this.e;
            StringBuilder n2 = a81.n("changeFormat, ", i5, "x", i6, "@");
            n2.append(round2);
            voc2.log("CameraCapturerAdapter", n2.toString());
            if (!(this.n == i5 && this.m == i6 && this.l == round2)) {
                this.l = round2;
                this.m = i6;
                this.n = i5;
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    v48 v48 = (v48) it.next();
                    if (this != v48.r) {
                        v48.n.reportException("OKRTCLmsAdapter", "camera.format.change", new RuntimeException("Wrong camera capturer"));
                    }
                    b8g b8g = v48.y;
                    ((voc) b8g.c).log("VideoRecord", g63.h("Camera capture dimensions were changed to ", i5, i6, "x"));
                    b8g.Y.width = i5;
                    b8g.Y.height = i6;
                    b8g.u();
                }
                if (this.k) {
                    this.e.log("CameraCapturerAdapter", "Camera is already started, just change capture format");
                    ((CameraVideoCapturer) this.c.b).changeCaptureFormat(i5, i6, round2);
                }
            }
            this.e.log("CameraCapturerAdapter", "start");
            if (this.k) {
                this.e.log("CameraCapturerAdapter", "Camera is already started");
                return;
            }
            if (this.n == 0 || this.m == 0 || this.l == 0) {
                voc voc3 = this.e;
                voc3.log("CameraCapturerAdapter", "start camera capture invalid arguments: " + this.n + "x" + this.m + "@" + this.l);
            }
            try {
                ((CameraVideoCapturer) this.c.b).startCapture(this.n, this.m, this.l);
                this.k = true;
            } catch (RuntimeException e2) {
                this.e.reportException("CameraCapturerAdapter", "Camera start was interrupted", e2);
                Thread.currentThread().interrupt();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void b() {
        this.e.log("CameraCapturerAdapter", "stop");
        if (!this.k) {
            this.e.log("CameraCapturerAdapter", "Camera is already stopped");
            return;
        }
        try {
            ((CameraVideoCapturer) this.c.b).stopCapture();
            this.k = false;
        } catch (InterruptedException e2) {
            this.e.reportException("CameraCapturerAdapter", "Camera stop was interrupted", e2);
            Thread.currentThread().interrupt();
        }
    }
}
