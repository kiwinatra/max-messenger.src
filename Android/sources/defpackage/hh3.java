package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: hh3  reason: default package */
public final /* synthetic */ class hh3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx8 b;
    public final /* synthetic */ cx8 c;

    public /* synthetic */ hh3(yx8 yx8, cx8 cx8, int i) {
        this.a = i;
        this.b = yx8;
        this.c = cx8;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                yx8 yx8 = this.b;
                if (!yx8.i()) {
                    if (yx8.z) {
                        cx8 cx8 = this.c;
                        if (!yx8.j(cx8)) {
                            if (yx8.h(cx8)) {
                                yx8.z = false;
                            }
                        } else {
                            return;
                        }
                    }
                    yx8.e.getClass();
                    return;
                }
                return;
            case 1:
                this.b.g.M0(this.c, IntCompanionObject.MIN_VALUE, 12, hz8.O0(new vx8(13)));
                return;
            case 2:
                this.b.g.M0(this.c, IntCompanionObject.MIN_VALUE, 11, hz8.O0(new vx8(8)));
                return;
            case 3:
                this.b.g.M0(this.c, IntCompanionObject.MIN_VALUE, 3, hz8.O0(new vx8(20)));
                return;
            case 4:
                this.b.g.M0(this.c, IntCompanionObject.MIN_VALUE, 1, hz8.O0(new vx8(5)));
                return;
            case 5:
                hz8 hz8 = this.b.g;
                hz8.getClass();
                cx8 cx82 = this.c;
                hz8.M0(cx82, IntCompanionObject.MIN_VALUE, 1, hz8.O0(new g18(16, hz8, cx82)));
                return;
            case 6:
                hz8 hz82 = this.b.g;
                hz82.getClass();
                cx8 cx83 = this.c;
                hz82.M0(cx83, IntCompanionObject.MIN_VALUE, 1, hz8.O0(new g18(16, hz82, cx83)));
                return;
            case 7:
                this.b.g.M0(this.c, IntCompanionObject.MIN_VALUE, 1, hz8.O0(new vx8(5)));
                return;
            case 8:
                this.b.g.M0(this.c, IntCompanionObject.MIN_VALUE, 9, hz8.O0(new vx8(14)));
                return;
            default:
                this.b.g.M0(this.c, IntCompanionObject.MIN_VALUE, 7, hz8.O0(new vx8(10)));
                return;
        }
    }
}
