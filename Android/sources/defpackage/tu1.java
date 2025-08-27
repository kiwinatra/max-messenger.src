package defpackage;

import one.me.sdk.arch.Widget;

/* renamed from: tu1  reason: default package */
public final class tu1 implements jv7 {
    public final /* synthetic */ int a;
    public final lv7 b;

    public tu1() {
        this.a = 0;
        lv7 lv7 = new lv7(this);
        this.b = lv7;
        lv7.e(hu7.ON_CREATE);
    }

    public final ju7 getLifecycle() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public tu1(Widget widget) {
        this.a = 1;
        this.b = new lv7(this);
        widget.addLifecycleListener(new fa3(1, this));
    }
}
