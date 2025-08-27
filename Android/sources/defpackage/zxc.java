package defpackage;

import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;

/* renamed from: zxc  reason: default package */
public final /* synthetic */ class zxc implements n9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordManagerImpl b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ zxc(RecordManagerImpl recordManagerImpl, Function1 function1, int i) {
        this.a = i;
        this.b = recordManagerImpl;
        this.c = function1;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                RecordManagerImpl.stopRecord$lambda$3(this.b, this.c, jSONObject);
                return;
            default:
                RecordManagerImpl.startRecord$lambda$1(this.b, this.c, jSONObject);
                return;
        }
    }
}
