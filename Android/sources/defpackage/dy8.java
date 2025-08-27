package defpackage;

import android.os.RemoteException;
import android.util.SparseBooleanArray;

/* renamed from: dy8  reason: default package */
public final /* synthetic */ class dy8 implements Runnable {
    public final /* synthetic */ iy8 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ly8 c;
    public final /* synthetic */ hy8 o;
    public final /* synthetic */ boolean v;

    public /* synthetic */ dy8(iy8 iy8, int i, ly8 ly8, hy8 hy8, boolean z) {
        this.a = iy8;
        this.b = i;
        this.c = ly8;
        this.o = hy8;
        this.v = z;
    }

    public final void run() {
        iy8 iy8 = this.a;
        yx8 yx8 = iy8.w;
        if (!yx8.i()) {
            boolean isActive = iy8.X.a.a.isActive();
            int i = this.b;
            ly8 ly8 = this.c;
            if (!isActive) {
                StringBuilder o2 = wj6.o(i, "Ignore incoming player command before initialization. command=", ", pid=");
                o2.append(ly8.a.b);
                i8b.V(o2.toString());
                return;
            }
            cx8 Y = iy8.Y(ly8);
            if (iy8.v.q(Y, i)) {
                yx8.s(Y);
                yx8.e.getClass();
                try {
                    this.o.b(Y);
                } catch (RemoteException e) {
                    i8b.W("Exception in " + Y, e);
                }
                if (this.v) {
                    new SparseBooleanArray().append(i, true);
                    yx8.p(Y);
                }
            } else if (i == 1 && !yx8.s.q()) {
                i8b.V("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            }
        }
    }
}
