package defpackage;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: pw8  reason: default package */
public final class pw8 {
    public final hw8 a;
    public final int b;
    public final rw8 c;
    public final rw8 d;
    public final rw8 e;
    public final ArrayList f;
    public final WeakReference g;
    public final zz7 h = null;
    public boolean i = false;
    public boolean j = false;

    public pw8(ow8 ow8, rw8 rw8, hw8 hw8, int i2, rw8 rw82, ArrayList arrayList) {
        ArrayList arrayList2 = null;
        this.g = new WeakReference(ow8);
        this.d = rw8;
        this.a = hw8;
        this.b = i2;
        this.c = ow8.r;
        this.e = rw82;
        this.f = arrayList != null ? new ArrayList(arrayList) : arrayList2;
        ow8.m.postDelayed(new y86(28, (Object) this), 15000);
    }

    public final void a() {
        zz7 zz7;
        sw8.b();
        if (!this.i && !this.j) {
            WeakReference weakReference = this.g;
            ow8 ow8 = (ow8) weakReference.get();
            hw8 hw8 = this.a;
            if (ow8 != null && ow8.z == this && ((zz7 = this.h) == null || !zz7.isCancelled())) {
                this.i = true;
                ow8.z = null;
                ow8 ow82 = (ow8) weakReference.get();
                int i2 = this.b;
                rw8 rw8 = this.c;
                if (ow82 != null && ow82.r == rw8) {
                    Message obtainMessage = ow82.m.obtainMessage(263, rw8);
                    obtainMessage.arg1 = i2;
                    obtainMessage.sendToTarget();
                    hw8 hw82 = ow82.s;
                    if (hw82 != null) {
                        hw82.h(i2);
                        ow82.s.d();
                    }
                    HashMap hashMap = ow82.v;
                    if (!hashMap.isEmpty()) {
                        for (hw8 hw83 : hashMap.values()) {
                            hw83.h(i2);
                            hw83.d();
                        }
                        hashMap.clear();
                    }
                    ow82.s = null;
                }
                ow8 ow83 = (ow8) weakReference.get();
                if (ow83 != null) {
                    rw8 rw82 = this.d;
                    ow83.r = rw82;
                    ow83.s = hw8;
                    mw8 mw8 = ow83.m;
                    rw8 rw83 = this.e;
                    if (rw83 == null) {
                        Message obtainMessage2 = mw8.obtainMessage(262, new v7b(rw8, rw82));
                        obtainMessage2.arg1 = i2;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = mw8.obtainMessage(264, new v7b(rw83, rw82));
                        obtainMessage3.arg1 = i2;
                        obtainMessage3.sendToTarget();
                    }
                    ow83.v.clear();
                    ow83.g();
                    ow83.k();
                    ArrayList arrayList = this.f;
                    if (arrayList != null) {
                        ow83.r.n(arrayList);
                    }
                }
            } else if (!this.i && !this.j) {
                this.j = true;
                if (hw8 != null) {
                    hw8.h(0);
                    hw8.d();
                }
            }
        }
    }
}
