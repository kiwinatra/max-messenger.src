package defpackage;

import com.google.android.gms.tasks.Task;

/* renamed from: st6  reason: default package */
public final /* synthetic */ class st6 implements ima, lma, hma {
    public final /* synthetic */ wt6 a;

    public /* synthetic */ st6(wt6 wt6) {
        this.a = wt6;
    }

    public void onFailure(Exception exc) {
        wt6 wt6 = this.a;
        z68.h(wt6.e, new Error("startRetriever: failed", exc), (String) null, new Object[0]);
        wt6.i = null;
    }

    public void q(Task task) {
        wt6 wt6 = this.a;
        z68.c(wt6.e, "retriever is complete", new Object[0]);
        wt6.i = null;
    }

    public void r() {
        wt6 wt6 = this.a;
        z68.c(wt6.e, "startRetriever: canceled", new Object[0]);
        wt6.i = null;
    }
}
