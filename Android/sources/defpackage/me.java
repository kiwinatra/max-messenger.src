package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.text.Typography;

/* renamed from: me  reason: default package */
public final class me implements ggd {
    public final Context b;
    public final jab c;
    public final String d = "MAX";
    public final zs7 e;
    public final Lazy f;

    public me(Context context, jab jab, zs7 zs7) {
        this.b = context;
        this.c = jab;
        this.e = zs7;
        this.f = LazyKt.lazy(new j6(5, this));
    }

    public final ContentValues c(String str, String str2, sq9 sq9) {
        long currentTimeMillis = System.currentTimeMillis();
        File file = new File(str, this.d);
        Pair pair = TuplesKt.to("_display_name", str2);
        Pair pair2 = TuplesKt.to("mime_type", sq9.a);
        Pair pair3 = TuplesKt.to("date_added", Long.valueOf(currentTimeMillis));
        Pair pair4 = TuplesKt.to("date_modified", Long.valueOf(currentTimeMillis));
        String str3 = File.separator;
        Pair[] pairArr = {pair, pair2, pair3, pair4, TuplesKt.to("relative_path", file + str3)};
        ContentValues contentValues = new ContentValues(5);
        for (int i = 0; i < 5; i++) {
            Pair pair5 = pairArr[i];
            String str4 = (String) pair5.component1();
            Object component2 = pair5.component2();
            if (component2 == null) {
                contentValues.putNull(str4);
            } else if (component2 instanceof String) {
                contentValues.put(str4, (String) component2);
            } else if (component2 instanceof Integer) {
                contentValues.put(str4, (Integer) component2);
            } else if (component2 instanceof Long) {
                contentValues.put(str4, (Long) component2);
            } else if (component2 instanceof Boolean) {
                contentValues.put(str4, (Boolean) component2);
            } else if (component2 instanceof Float) {
                contentValues.put(str4, (Float) component2);
            } else if (component2 instanceof Double) {
                contentValues.put(str4, (Double) component2);
            } else if (component2 instanceof byte[]) {
                contentValues.put(str4, (byte[]) component2);
            } else if (component2 instanceof Byte) {
                contentValues.put(str4, (Byte) component2);
            } else if (component2 instanceof Short) {
                contentValues.put(str4, (Short) component2);
            } else {
                String canonicalName = component2.getClass().getCanonicalName();
                throw new IllegalArgumentException("Illegal value type " + canonicalName + " for key \"" + str4 + Typography.quote);
            }
        }
        return contentValues;
    }

    public final Uri d(hgd hgd, String str) {
        ContentValues c2 = c(hgd.i(), str, hgd.b());
        Integer j = hgd.j();
        if (j != null) {
            c2.put("_size", Integer.valueOf(j.intValue()));
        }
        Integer width = hgd.getWidth();
        if (width != null) {
            c2.put("width", Integer.valueOf(width.intValue()));
        }
        Integer height = hgd.getHeight();
        if (height != null) {
            c2.put("height", Integer.valueOf(height.intValue()));
        }
        c2.put("is_pending", 1);
        Lazy lazy = this.f;
        Uri insert = ((ContentResolver) lazy.getValue()).insert(hgd.g(), c2);
        if (insert == null) {
            return null;
        }
        hgd.c((ContentResolver) lazy.getValue(), insert);
        c2.clear();
        c2.put("is_pending", 0);
        ((ContentResolver) lazy.getValue()).update(insert, c2, (String) null, (String[]) null);
        Context context = this.b;
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(insert);
        intent.addFlags(1);
        try {
            context.sendBroadcast(intent);
        } catch (Exception e2) {
            fgd fgd = fgd.a;
            String str2 = fgd.b;
            z68.f(str2, "sendBroadcastToGallery: failed for uri " + insert, e2);
        }
        return insert;
    }
}
