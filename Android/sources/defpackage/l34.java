package defpackage;

import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* renamed from: l34  reason: default package */
public final class l34 implements ReadWriteProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ hdd b;

    public /* synthetic */ l34(hdd hdd, int i) {
        this.a = i;
        this.b = hdd;
    }

    public final Object getValue(Object obj, KProperty kProperty) {
        switch (this.a) {
            case 0:
                Object b2 = this.b.b("CreateChannelViewModel:icon_path");
                if (b2 == null) {
                    return null;
                }
                return b2;
            default:
                Object b3 = this.b.b("lastStarCall");
                if (b3 == null) {
                    return null;
                }
                return b3;
        }
    }

    public final void setValue(Object obj, KProperty kProperty, Object obj2) {
        switch (this.a) {
            case 0:
                getValue(obj, kProperty);
                this.b.c(obj2, "CreateChannelViewModel:icon_path");
                return;
            default:
                getValue(obj, kProperty);
                this.b.c(obj2, "lastStarCall");
                return;
        }
    }
}
