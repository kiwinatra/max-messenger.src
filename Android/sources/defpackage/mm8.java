package defpackage;

import android.os.IBinder;
import java.util.HashMap;

/* renamed from: mm8  reason: default package */
public final class mm8 implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final ly8 d;
    public final um8 e;
    public final HashMap f = new HashMap();
    public final /* synthetic */ sy8 g;

    public mm8(sy8 sy8, String str, int i, int i2, vm8 vm8) {
        this.g = sy8;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = new ly8(str, i, i2);
        this.e = vm8;
    }

    public final void binderDied() {
        this.g.x.post(new tj7(8, this));
    }
}
