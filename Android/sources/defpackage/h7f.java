package defpackage;

import android.os.Message;
import java.util.ArrayList;

/* renamed from: h7f  reason: default package */
public final class h7f {
    public Message a;

    public final void a() {
        this.a = null;
        ArrayList arrayList = j7f.b;
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
