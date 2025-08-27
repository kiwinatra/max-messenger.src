package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

/* renamed from: pjf  reason: default package */
public final class pjf extends n23 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ijf f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pjf(Context context, int i, ijf ijf, int i2) {
        super(context, i);
        this.e = i2;
        this.f = ijf;
    }

    public final void d(View view, g4 g4Var) {
        switch (this.e) {
            case 0:
                super.d(view, g4Var);
                Resources resources = view.getResources();
                ijf ijf = this.f;
                g4Var.j(resources.getString(ijf.c == 1 ? ymc.material_hour_24h_suffix : ymc.material_hour_suffix, new Object[]{String.valueOf(ijf.b())}));
                return;
            default:
                super.d(view, g4Var);
                g4Var.j(view.getResources().getString(ymc.material_minute_suffix, new Object[]{String.valueOf(this.f.v)}));
                return;
        }
    }
}
