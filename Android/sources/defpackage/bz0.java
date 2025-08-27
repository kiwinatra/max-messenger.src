package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import ru.ok.android.externcalls.sdk.dev.internal.MediaDumpManagerImpl;

/* renamed from: bz0  reason: default package */
public final /* synthetic */ class bz0 implements n9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bz0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                return;
            case 1:
                voc voc = (voc) ((j50) this.b).v;
                if (jSONObject == null || !"command-discarded".equals(jSONObject.optString("error"))) {
                    voc.log("MediaSettingsSender", "change-media-settings error" + jSONObject);
                    return;
                }
                voc.log("MediaSettingsSender", "change-media-settings command was merged with ongoing one");
                return;
            default:
                MediaDumpManagerImpl.requestMediaDump$lambda$0((MediaDumpManager.RemoteMediaDumpRequestListener) this.b, jSONObject);
                return;
        }
    }
}
