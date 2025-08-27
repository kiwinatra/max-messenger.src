package defpackage;

import com.google.android.gms.tasks.Task;

/* renamed from: mt6  reason: default package */
public final /* synthetic */ class mt6 implements ima, lma {
    public final /* synthetic */ i68 a;

    public /* synthetic */ mt6(i68 i68) {
        this.a = i68;
    }

    public void onFailure(Exception exc) {
        this.a.g(exc);
    }

    public void q(Task task) {
        boolean h = task.h();
        i68 i68 = this.a;
        if (h) {
            i68.f();
        } else {
            i68.g((Exception) null);
        }
    }
}
