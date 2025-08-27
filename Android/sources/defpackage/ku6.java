package defpackage;

import android.view.View;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ku6  reason: default package */
public final class ku6 extends ryg {
    public final /* synthetic */ int j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku6(int i) {
        super(11);
        this.j = i;
    }

    public final int n(View view, int i, int i2) {
        switch (this.j) {
            case 0:
                return IntCompanionObject.MIN_VALUE;
            case 1:
                return 0;
            case 2:
                return i;
            case 3:
                return i >> 1;
            case 4:
                if (view.getVisibility() == 8) {
                    return 0;
                }
                int baseline = view.getBaseline();
                return baseline == -1 ? IntCompanionObject.MIN_VALUE : baseline;
            default:
                return IntCompanionObject.MIN_VALUE;
        }
    }

    public qu6 o() {
        switch (this.j) {
            case 4:
                return new qu6();
            default:
                return super.o();
        }
    }

    public final String r() {
        switch (this.j) {
            case 0:
                return "UNDEFINED";
            case 1:
                return "LEADING";
            case 2:
                return "TRAILING";
            case 3:
                return "CENTER";
            case 4:
                return "BASELINE";
            default:
                return "FILL";
        }
    }

    public final int s(View view, int i) {
        switch (this.j) {
            case 0:
                return IntCompanionObject.MIN_VALUE;
            case 1:
                return 0;
            case 2:
                return i;
            case 3:
                return i >> 1;
            case 4:
                return 0;
            default:
                return 0;
        }
    }

    public int y(int i, int i2) {
        switch (this.j) {
            case 5:
                return i2;
            default:
                return i;
        }
    }
}
