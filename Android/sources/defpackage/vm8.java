package defpackage;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;

/* renamed from: vm8  reason: default package */
public final class vm8 implements um8 {
    public final Messenger a;

    public vm8(Messenger messenger) {
        this.a = messenger;
    }

    public final void a(int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 2;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        this.a.send(obtain);
    }
}
