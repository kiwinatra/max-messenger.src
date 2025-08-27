package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.io.Serializable;

/* renamed from: o67  reason: default package */
public final class o67 {
    public final Object a;
    public boolean b;
    public int c;
    public final Object d;
    public Serializable e;
    public Cloneable f;
    public Cloneable g;
    public Object h;

    /* JADX WARNING: type inference failed for: r1v2, types: [float[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Cloneable, float[]] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Cloneable, float[]] */
    public o67() {
        this.a = new int[2];
        this.d = new float[2];
        this.e = new float[2];
        this.f = new float[2];
        this.g = new float[2];
        this.h = null;
        c();
    }

    public void a() {
        ts tsVar = ((sy8) this.h).v;
        mm8 mm8 = (mm8) this.d;
        um8 um8 = mm8.e;
        um8.getClass();
        if (tsVar.get(((vm8) um8).a.getBinder()) != mm8) {
            int i = sy8.Z;
            return;
        }
        int i2 = this.c & 1;
        Bundle bundle = (Bundle) this.f;
        if (i2 != 0) {
            int i3 = sy8.Z;
        }
        try {
            vm8 vm8 = (vm8) mm8.e;
            vm8.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", (String) this.e);
            bundle2.putBundle("data_options", bundle);
            bundle2.putBundle("data_notify_children_changed_options", (Bundle) this.g);
            vm8.a(3, bundle2);
        } catch (RemoteException unused) {
        }
    }

    public void b(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = (byte[]) this.e;
            if (bArr == bArr2 || bArr.length >= bArr2.length) {
                this.e = null;
                ((eu0) this.d).a.set(0, bArr);
                return;
            }
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
    }

    public void c() {
        this.b = false;
        this.c = 0;
        for (int i = 0; i < 2; i++) {
            ((int[]) this.a)[i] = -1;
        }
    }

    public void d() {
        if (!this.b) {
            this.b = true;
            a();
            return;
        }
        throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.a);
    }

    public void e() {
        ik4 ik4;
        if (this.b) {
            this.b = false;
            ata ata = (ata) this.h;
            if (ata != null && (ik4 = (ik4) ata.c) != null && !ik4.o) {
                ik4.X.set(ik4.Y);
            }
        }
    }

    public o67(eu0 eu0, Object obj, boolean z) {
        this.d = eu0;
        this.a = obj;
        this.b = z;
    }

    public o67(sy8 sy8, Object obj, mm8 mm8, String str, Bundle bundle) {
        this.h = sy8;
        this.d = mm8;
        this.e = str;
        this.f = bundle;
        this.g = null;
        this.a = obj;
    }
}
