package defpackage;

import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: dr5  reason: default package */
public final class dr5 {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public dr5(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public static void a(dr5 dr5) {
        FlexboxLayoutManager flexboxLayoutManager = dr5.h;
        if (flexboxLayoutManager.c1() || !flexboxLayoutManager.t) {
            dr5.c = dr5.e ? flexboxLayoutManager.B.h() : flexboxLayoutManager.B.m();
        } else {
            dr5.c = dr5.e ? flexboxLayoutManager.B.h() : flexboxLayoutManager.n - flexboxLayoutManager.B.m();
        }
    }

    public static void b(dr5 dr5) {
        dr5.a = -1;
        dr5.b = -1;
        dr5.c = IntCompanionObject.MIN_VALUE;
        boolean z = false;
        dr5.f = false;
        dr5.g = false;
        FlexboxLayoutManager flexboxLayoutManager = dr5.h;
        if (flexboxLayoutManager.c1()) {
            int i = flexboxLayoutManager.q;
            if (i == 0) {
                if (flexboxLayoutManager.p == 1) {
                    z = true;
                }
                dr5.e = z;
                return;
            }
            if (i == 2) {
                z = true;
            }
            dr5.e = z;
            return;
        }
        int i2 = flexboxLayoutManager.q;
        if (i2 == 0) {
            if (flexboxLayoutManager.p == 3) {
                z = true;
            }
            dr5.e = z;
            return;
        }
        if (i2 == 2) {
            z = true;
        }
        dr5.e = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.a);
        sb.append(", mFlexLinePosition=");
        sb.append(this.b);
        sb.append(", mCoordinate=");
        sb.append(this.c);
        sb.append(", mPerpendicularCoordinate=");
        sb.append(this.d);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.e);
        sb.append(", mValid=");
        sb.append(this.f);
        sb.append(", mAssignedFromSavedState=");
        return wzf.l(sb, this.g, '}');
    }
}
