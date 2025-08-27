package defpackage;

import java.util.concurrent.Executor;

/* renamed from: rrg  reason: default package */
public final /* synthetic */ class rrg implements eo1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce b;
    public final /* synthetic */ yrg c;

    public /* synthetic */ rrg(ce ceVar, db0 db0, int i) {
        this.a = i;
        this.b = ceVar;
        this.c = db0;
    }

    public final Object r(do1 do1) {
        switch (this.a) {
            case 0:
                ce ceVar = this.b;
                ceVar.getClass();
                ((Executor) ceVar.c).execute(new srg(ceVar, do1, this.c, 0));
                return "setZoomRatio";
            default:
                ce ceVar2 = this.b;
                ceVar2.getClass();
                ((Executor) ceVar2.c).execute(new srg(ceVar2, do1, this.c, 1));
                return "setLinearZoom";
        }
    }
}
