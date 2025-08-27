package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ff0  reason: default package */
public final class ff0 {
    public final Lazy a;

    public ff0(Lazy lazy) {
        this.a = lazy;
    }

    public static final o5f a(ff0 ff0, byte[] bArr, l1g l1g) {
        ff0.getClass();
        String str = new String(bArr, Charsets.UTF_8);
        int i = l1g.b;
        m5f m5f = m5f.a;
        o5f o5f = new o5f(str, i, l1g.c);
        o5f.setAlpha(RangesKt.coerceIn((int) (l1g.d * ((float) KotlinVersion.MAX_COMPONENT_VALUE)), 0, (int) KotlinVersion.MAX_COMPONENT_VALUE));
        o5f.a.g.setXfermode(new PorterDuffXfermode(l1g.e ? PorterDuff.Mode.OVERLAY : PorterDuff.Mode.SRC_OVER));
        Object a2 = mp0.a(lp0.a);
        o5f.setColorFilter(a2 != null ? kp0.a(l1g.f, a2) : null);
        return o5f;
    }

    public static LinkedHashMap b(Context context, kf0 kf0) {
        k1g k1g;
        kf0 kf02 = kf0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            InputStream open = context.getAssets().open("themes.json");
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            try {
                JSONArray jSONArray = new JSONArray(new String(bArr, Charsets.UTF_8));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    kf0 kf03 = new kf0(jSONObject.getString("name"));
                    if (kf02 == null || Intrinsics.areEqual((Object) kf02, (Object) kf03)) {
                        JSONObject jSONObject2 = jSONObject.has("pattern") ? jSONObject.getJSONObject("pattern") : null;
                        JSONObject jSONObject3 = jSONObject.has("gradient") ? jSONObject.getJSONObject("gradient") : null;
                        l1g l1g = jSONObject2 != null ? new l1g(jSONObject2.getString("image"), MathKt.roundToInt(((float) jSONObject2.getInt("width")) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) jSONObject2.getInt("height")) * vo4.c().getDisplayMetrics().density), (float) jSONObject2.getDouble("opacity"), jSONObject2.getBoolean("is_overlay"), Color.parseColor(jSONObject2.getString("color"))) : null;
                        if (jSONObject3 != null) {
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("colors");
                            ArrayList arrayList = new ArrayList();
                            int length2 = jSONArray2.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                arrayList.add(Integer.valueOf(Color.parseColor(jSONArray2.getString(i2))));
                            }
                            if (arrayList.size() > 1) {
                                k1g = new k1g(CollectionsKt.toIntArray(arrayList), (float) jSONObject3.getDouble("angle"));
                            } else {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                        } else {
                            k1g = null;
                        }
                        linkedHashMap.put(kf03, new m1g(l1g, k1g, CollectionsKt.emptyList()));
                    }
                }
            } catch (JSONException e) {
                z68.c("BackgroundDataLoader", "parse theme json failed: " + e, new Object[0]);
            }
        } catch (IOException e2) {
            z68.c("BackgroundDataLoader", "load assets failed: " + e2, new Object[0]);
        }
        return linkedHashMap;
    }

    public final Object c(Context context, l1g l1g, Continuation continuation) {
        return ev0.I(((osa) ((gaf) this.a.getValue())).b(), new ef0(this, context, l1g, (Continuation) null), continuation);
    }
}
