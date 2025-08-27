package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: fk0  reason: default package */
public final class fk0 extends ws9 {
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            rae.w(pair.first);
            u4d u4d = (u4d) pair.second;
            try {
                throw null;
            } catch (RuntimeException e) {
                qv0 qv0 = BasePendingResult.o;
                throw e;
            }
        } else if (i != 2) {
            Log.wtf("BasePendingResult", wj6.h(i, "Don't know how to handle message: "), new Exception());
        } else {
            ((BasePendingResult) message.obj).V(Status.y);
        }
    }
}
