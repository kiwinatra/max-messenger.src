package defpackage;

import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* renamed from: o34  reason: default package */
public final class o34 implements ReadWriteProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ hdd b;

    public /* synthetic */ o34(hdd hdd, int i) {
        this.a = i;
        this.b = hdd;
    }

    public final Object getValue(Object obj, KProperty kProperty) {
        switch (this.a) {
            case 0:
                Object b2 = this.b.b("CreateChannelViewModel:relative_crop");
                if (b2 == null) {
                    return null;
                }
                return b2;
            default:
                Object b3 = this.b.b("isMuted");
                return b3 == null ? Boolean.FALSE : b3;
        }
    }

    public final void setValue(Object obj, KProperty kProperty, Object obj2) {
        switch (this.a) {
            case 0:
                getValue(obj, kProperty);
                this.b.c(obj2, "CreateChannelViewModel:relative_crop");
                return;
            default:
                getValue(obj, kProperty);
                this.b.c(obj2, "isMuted");
                return;
        }
    }
}
