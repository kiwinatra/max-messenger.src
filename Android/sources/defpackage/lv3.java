package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import java.util.ArrayList;

/* renamed from: lv3  reason: default package */
public final class lv3 {
    public final kv3 a;

    public lv3(kv3 kv3) {
        this.a = kv3;
    }

    public static ClipData a(ClipDescription clipDescription, ArrayList arrayList) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) arrayList.get(0));
        for (int i = 1; i < arrayList.size(); i++) {
            clipData.addItem((ClipData.Item) arrayList.get(i));
        }
        return clipData;
    }

    public final String toString() {
        return this.a.toString();
    }
}
