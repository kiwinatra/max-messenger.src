package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import one.me.main.MainScreen;

/* renamed from: hc8  reason: default package */
public final /* synthetic */ class hc8 implements ya4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hc8(ra4 ra4, Bundle bundle) {
        this.c = ra4;
        this.b = bundle;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                return new MainScreen(bb4.a(((ra4) this.c).a), this.b);
            default:
                return new pxb(this.b, (ArrayList) this.c);
        }
    }

    public /* synthetic */ hc8(Bundle bundle, ArrayList arrayList) {
        this.b = bundle;
        this.c = arrayList;
    }
}
