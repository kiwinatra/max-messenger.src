package defpackage;

import android.content.Intent;

/* renamed from: um7  reason: default package */
public final class um7 implements vm7 {
    public final Intent a;
    public final int b;
    public final /* synthetic */ an7 c;

    public um7(an7 an7, Intent intent, int i) {
        this.c = an7;
        this.a = intent;
        this.b = i;
    }

    public final void e() {
        this.c.stopSelf(this.b);
    }

    public final Intent getIntent() {
        return this.a;
    }
}
