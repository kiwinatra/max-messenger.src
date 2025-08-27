package defpackage;

import android.location.Location;
import com.google.android.gms.tasks.Task;

/* renamed from: jt6  reason: default package */
public final /* synthetic */ class jt6 implements ima, lma {
    public final /* synthetic */ b8d a;

    public /* synthetic */ jt6(b8d b8d) {
        this.a = b8d;
    }

    public void onFailure(Exception exc) {
        ((c68) this.a.a).w();
    }

    public void q(Task task) {
        boolean h = task.h();
        b8d b8d = this.a;
        if (!h || task.f() == null) {
            ((c68) b8d.a).w();
            return;
        }
        Location location = (Location) task.f();
        ((c68) b8d.a).L(new s58(location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getAccuracy(), location.getBearing(), location.getSpeed()));
    }
}
