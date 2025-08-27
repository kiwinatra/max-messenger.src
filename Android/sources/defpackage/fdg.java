package defpackage;

import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: fdg  reason: default package */
public final class fdg implements yn1, ima {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ fdg(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public boolean a(String str, String str2, yoc yoc, voc voc) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        boolean containsKey = linkedHashMap.containsKey(str);
        String str3 = (String) linkedHashMap.put(str, str2);
        if (!containsKey || !Objects.equals(str3, str2)) {
            return true;
        }
        voc.log("CodecPrefUtil", "parameter " + str + " value did not change");
        return false;
    }

    public void h(jtc jtc, k4d k4d) {
        int i;
        boolean isSuccessful = k4d.isSuccessful();
        npg npg = (npg) this.b;
        if (isSuccessful) {
            String V = k4d.x.V();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(V);
                JSONObject jSONObject2 = jSONObject.getJSONObject(MediaStreamTrack.VIDEO_TRACK_KIND);
                jSONObject2.getLong("duration");
                jSONObject2.getString("title");
                JSONObject jSONObject3 = jSONObject2.getJSONObject("owner");
                jSONObject3.optString("account_type");
                jSONObject3.optString("name");
                jSONObject3.optString("img");
                jSONObject3.optString("img_2x");
                jSONObject3.optString("url");
                jSONObject3.optLong("id");
                JSONObject jSONObject4 = jSONObject2.getJSONObject("thumbs");
                Iterator<String> keys = jSONObject4.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap2.put(next, jSONObject4.getString(next));
                }
                JSONArray jSONArray = jSONObject.getJSONObject("request").getJSONObject("files").getJSONArray("progressive");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject5 = jSONArray.getJSONObject(i2);
                    hashMap.put(jSONObject5.getString("quality"), jSONObject5.getString("url"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            pbe pbe = (pbe) ((ube) npg.b);
            if (!pbe.f()) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    try {
                        i = Integer.parseInt(str.replace("p", ""));
                    } catch (Exception e2) {
                        z68.f("gdg", "failed to parse quality string: " + str, e2);
                        i = 0;
                    }
                    arrayList.add(new hk5(3, -1, i, 0, (String) entry.getValue()));
                }
                if (arrayList.isEmpty()) {
                    pbe.onError(new FetcherException(4, "No supported quality"));
                }
                ((gdg) npg.c).getClass();
                pbe.a(new jk5("Vimeo", arrayList));
                return;
            }
            return;
        }
        ((p9a) this.c).getClass();
        int i3 = k4d.o;
        if (i3 == 403) {
            new IOException("Video has restricted playback");
        } else if (i3 != 404) {
            new IOException("An unknown error occurred");
        } else {
            new IOException("Video could not be found");
        }
        npg.N();
    }

    public void o(jtc jtc, IOException iOException) {
        ((npg) this.b).N();
    }

    public void q(Task task) {
        x7h x7h = (x7h) this.b;
        qdf qdf = (qdf) this.c;
        synchronized (x7h.f) {
            x7h.e.remove(qdf);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.b);
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                if (linkedHashMap.isEmpty()) {
                    return sb.toString();
                }
                sb.append(' ');
                boolean z = true;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(';');
                    }
                    sb.append((String) entry.getKey());
                    String str = (String) entry.getValue();
                    if (str != null) {
                        sb.append('=');
                        sb.append(str);
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public fdg(String str, LinkedHashMap linkedHashMap) {
        this.a = 1;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.c = linkedHashMap2;
        this.b = str;
        if (linkedHashMap != null) {
            linkedHashMap2.putAll(linkedHashMap);
        }
    }
}
