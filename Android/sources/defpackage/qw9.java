package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: qw9  reason: default package */
public final class qw9 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public qw9(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    public final void onCallbackDied(IInterface iInterface, Object obj) {
        m67 m67 = (m67) iInterface;
        this.a.b.remove((Integer) obj);
    }
}
