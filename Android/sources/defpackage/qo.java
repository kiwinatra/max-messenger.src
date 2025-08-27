package defpackage;

import android.view.View;

/* renamed from: qo  reason: default package */
public final class qo extends ub6 {
    public final /* synthetic */ xo X;
    public final /* synthetic */ ap Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qo(ap apVar, View view, xo xoVar) {
        super(view);
        this.Y = apVar;
        this.X = xoVar;
    }

    public final s8e b() {
        return this.X;
    }

    public final boolean c() {
        ap apVar = this.Y;
        if (apVar.getInternalPopup().a()) {
            return true;
        }
        apVar.w.m(apVar.getTextDirection(), apVar.getTextAlignment());
        return true;
    }
}
