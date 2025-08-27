package defpackage;

import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: vy0  reason: default package */
public final /* synthetic */ class vy0 implements n9e {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    public /* synthetic */ vy0(hz0 hz0, ue1 ue1, n9e n9e) {
        this.b = hz0;
        this.c = ue1;
        this.o = null;
        this.v = n9e;
    }

    public final void k(JSONObject jSONObject) {
        n9e n9e;
        switch (this.a) {
            case 0:
                ue1 ue1 = (ue1) this.c;
                hz0 hz0 = (hz0) this.b;
                voc voc = hz0.T0;
                voc.log("OKRTCCall", "handle response from signaling on add-participant command");
                try {
                    int i = ftg.b[tr1.y(hz0.y(ue1, jSONObject.optJSONObject("participant")))];
                    if (i == 1) {
                        n9e n9e2 = (n9e) this.o;
                        if (n9e2 != null) {
                            n9e2.k(jSONObject);
                            return;
                        }
                        return;
                    } else if (i == 2 && (n9e = (n9e) this.v) != null) {
                        n9e.k(new JSONObject().put("error", (Object) "state.accepted"));
                        return;
                    } else {
                        return;
                    }
                } catch (JSONException e) {
                    voc.reportException("OKRTCCall", "add.participant.success", e);
                    return;
                }
            default:
                zwd zwd = (zwd) ((rt6) this.c).b;
                xe8 xe8 = (xe8) this.b;
                xe8.getClass();
                JSONObject optJSONObject = jSONObject.optJSONObject(MultiFileUploader.CHUNK_FILE_NAME_PREFIX);
                cae y = optJSONObject != null ? ((zqd) xe8.b).y(optJSONObject, zwd) : null;
                if (y == null) {
                    ((Function1) this.o).invoke(new RuntimeException("Can't parse chunk " + jSONObject));
                    return;
                }
                ((Function1) this.v).invoke(y);
                return;
        }
    }

    public /* synthetic */ vy0(xe8 xe8, rt6 rt6, hq7 hq7, o14 o14) {
        this.b = xe8;
        this.c = rt6;
        this.o = hq7;
        this.v = o14;
    }
}
