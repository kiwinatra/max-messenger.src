package defpackage;

import android.os.Bundle;
import androidx.fragment.app.b;
import androidx.fragment.app.c;

/* renamed from: pb3  reason: default package */
public final /* synthetic */ class pb3 implements ldd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pb3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Bundle a() {
        b bVar;
        switch (this.a) {
            case 0:
                return bc3.u((bc3) this.b);
            case 1:
                break;
            case 2:
                return ((c) this.b).b0();
            default:
                return hdd.a((hdd) this.b);
        }
        do {
            bVar = (b) this.b;
        } while (b.w(bVar.v()));
        bVar.b.e(hu7.ON_STOP);
        return new Bundle();
    }
}
