package defpackage;

import android.graphics.Point;
import android.view.View;

/* renamed from: bn1  reason: default package */
public final /* synthetic */ class bn1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn1 b;

    public /* synthetic */ bn1(gn1 gn1, int i) {
        this.a = i;
        this.b = gn1;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                gn1 gn1 = this.b;
                dn1 dn1 = gn1.Z0;
                if (dn1 != null) {
                    ze1 ze1 = gn1.e1;
                    int[] iArr = new int[2];
                    gn1.M0.getLocationOnScreen(iArr);
                    dn1.k(ze1, new Point(iArr[0], iArr[1]));
                    return;
                }
                return;
            case 1:
                gn1 gn12 = this.b;
                dn1 dn12 = gn12.Z0;
                if (dn12 != null) {
                    dn12.m(gn12.e1);
                    return;
                }
                return;
            default:
                dn1 dn13 = this.b.Z0;
                if (dn13 != null) {
                    dn13.y();
                    return;
                }
                return;
        }
    }
}
