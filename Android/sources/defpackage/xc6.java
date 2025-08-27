package defpackage;

import android.os.Bundle;
import androidx.fragment.app.c;

/* renamed from: xc6  reason: default package */
public final class xc6 implements zu7 {
    public final /* synthetic */ String a;
    public final /* synthetic */ hd6 b;
    public final /* synthetic */ ju7 c;
    public final /* synthetic */ c o;

    public xc6(c cVar, String str, hd6 hd6, ju7 ju7) {
        this.o = cVar;
        this.a = str;
        this.b = hd6;
        this.c = ju7;
    }

    public final void d(jv7 jv7, hu7 hu7) {
        Bundle bundle;
        hu7 hu72 = hu7.ON_START;
        c cVar = this.o;
        String str = this.a;
        if (hu7 == hu72 && (bundle = (Bundle) cVar.l.get(str)) != null) {
            this.b.b(str, bundle);
            cVar.l.remove(str);
        }
        if (hu7 == hu7.ON_DESTROY) {
            this.c.b(this);
            cVar.m.remove(str);
        }
    }
}
