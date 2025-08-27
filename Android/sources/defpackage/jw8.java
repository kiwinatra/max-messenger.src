package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* renamed from: jw8  reason: default package */
public final class jw8 {
    public final /* synthetic */ int a;
    public final boolean b;
    public final List c;

    public jw8(ArrayList arrayList, boolean z) {
        this.a = 0;
        this.c = arrayList == null ? Collections.emptyList() : arrayList;
        this.b = z;
    }

    public static jw8 b(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList2.add(bundle2 != null ? new nv8(bundle2) : null);
            }
            arrayList = arrayList2;
        }
        return new jw8(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.b) {
            return captureCallback;
        }
        jr1 jr1 = new jr1(2);
        List list = this.c;
        go1 go1 = (go1) jr1.b;
        list.add(go1);
        go1.b.d(new x55((Object) this, (Object) jr1, (Object) go1, 29), ryg.j());
        return new bs1(Arrays.asList(new CameraCaptureSession.CaptureCallback[]{jr1, captureCallback}));
    }

    public zz7 c() {
        List list = this.c;
        if (list.isEmpty()) {
            return xa7.c;
        }
        kz7 W = hd8.W(new ArrayList(list));
        es1 es1 = new es1(15);
        return hd8.J(hd8.b0(W, new xv1(22, (Object) es1), ryg.j()));
    }

    public void d() {
        LinkedList linkedList = new LinkedList(this.c);
        while (!linkedList.isEmpty()) {
            zz7 zz7 = (zz7) linkedList.poll();
            Objects.requireNonNull(zz7);
            zz7.cancel(true);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = this.c;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = true;
                    } else {
                        nv8 nv8 = (nv8) list.get(i);
                        if (nv8 != null && nv8.d()) {
                            i++;
                        }
                    }
                }
                return tr1.m(sb, z, " }");
            default:
                return super.toString();
        }
    }

    public jw8(boolean z) {
        this.a = 1;
        this.c = Collections.synchronizedList(new ArrayList());
        this.b = z;
    }
}
