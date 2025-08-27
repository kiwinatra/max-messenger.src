package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.Objects;

/* renamed from: n6h  reason: default package */
public final class n6h implements ima {
    public final Object a;
    public final Object b;

    public n6h(m8g m8g, qdf qdf) {
        this.b = m8g;
        this.a = qdf;
    }

    public void q(Task task) {
        ((Map) ((m8g) this.b).b).remove((qdf) this.a);
    }

    public n6h(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.b = new k0h(iBinder);
            this.a = null;
        } else {
            "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
            throw new RemoteException();
        }
    }
}
