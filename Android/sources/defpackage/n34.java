package defpackage;

import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: n34  reason: default package */
public final class n34 implements ReadWriteProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ hdd b;

    public /* synthetic */ n34(hdd hdd, int i) {
        this.a = i;
        this.b = hdd;
    }

    public final Object getValue(Object obj, KProperty kProperty) {
        switch (this.a) {
            case 0:
                Object b2 = this.b.b("CreateChannelViewModel:create_channel_request_id");
                if (b2 == null) {
                    return 0L;
                }
                return b2;
            default:
                Object b3 = this.b.b(ApiProtocol.PARAM_IS_VIDEO);
                return b3 == null ? Boolean.FALSE : b3;
        }
    }

    public final void setValue(Object obj, KProperty kProperty, Object obj2) {
        switch (this.a) {
            case 0:
                getValue(obj, kProperty);
                this.b.c(obj2, "CreateChannelViewModel:create_channel_request_id");
                return;
            default:
                getValue(obj, kProperty);
                this.b.c(obj2, ApiProtocol.PARAM_IS_VIDEO);
                return;
        }
    }
}
