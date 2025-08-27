package defpackage;

import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* renamed from: m34  reason: default package */
public final class m34 implements ReadWriteProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ hdd b;

    public /* synthetic */ m34(hdd hdd, int i) {
        this.a = i;
        this.b = hdd;
    }

    public final Object getValue(Object obj, KProperty kProperty) {
        switch (this.a) {
            case 0:
                Object b2 = this.b.b("CreateChannelViewModel:cropped_icon_path");
                if (b2 == null) {
                    return null;
                }
                return b2;
            default:
                Object b3 = this.b.b("needCallDialog");
                return b3 == null ? Boolean.FALSE : b3;
        }
    }

    public final void setValue(Object obj, KProperty kProperty, Object obj2) {
        switch (this.a) {
            case 0:
                getValue(obj, kProperty);
                this.b.c(obj2, "CreateChannelViewModel:cropped_icon_path");
                return;
            default:
                getValue(obj, kProperty);
                this.b.c(obj2, "needCallDialog");
                return;
        }
    }
}
