package defpackage;

import android.os.Message;
import java.util.ArrayList;

/* renamed from: i7f  reason: default package */
public final class i7f {
    public Message a;

    public final void a() {
        this.a = null;
        ArrayList arrayList = k7f.b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
