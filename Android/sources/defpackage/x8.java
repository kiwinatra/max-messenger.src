package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;
import one.me.chats.picker.ActChatPickerCompat;

/* renamed from: x8  reason: default package */
public final class x8 extends w8 {
    public final /* synthetic */ int a;

    public /* synthetic */ x8(int i) {
        this.a = i;
    }

    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        List list = null;
        switch (this.a) {
            case 0:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
            case 1:
                return (Intent) obj;
            case 2:
                return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (ui7) obj);
            case 3:
                ui7 ui7 = (ui7) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = ui7.b;
                if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        ui7 = new ui7(ui7.a, (Intent) null, ui7.c, ui7.o);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", ui7);
                if (Log.isLoggable("FragmentManager", 2)) {
                    intent.toString();
                }
                return intent;
            default:
                w9f w9f = (w9f) obj;
                String str = w9f.a;
                int i = u5.z0;
                int i2 = ActChatPickerCompat.y;
                Intent intent3 = new Intent(context, ActChatPickerCompat.class);
                intent3.putExtra("ru.ok.tamtam.extra_FOR_CHAT_FOLDER", true);
                intent3.putExtra("ru.ok.tamtam.extra.SHOW_DESCRIPTION", false);
                intent3.putExtra("ru.ok.tamtam.extra_FOLDER_ID", str);
                intent3.putExtra("picker_chat_controller_purpose", tkb.EDIT_FOLDER);
                List list2 = w9f.b;
                if (!list2.isEmpty()) {
                    list = list2;
                }
                if (list != null) {
                    intent3.putExtra("picker_chat_controller_preselected_chats", CollectionsKt.toLongArray(list));
                }
                return intent3;
        }
    }

    public xv1 b(Context context, Object obj) {
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                if (strArr.length == 0) {
                    return new xv1(2, (Object) MapsKt.emptyMap());
                }
                for (String d : strArr) {
                    if (q8.d(context, d) != 0) {
                        return null;
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(strArr.length), 16));
                for (String str : strArr) {
                    Pair pair = TuplesKt.to(str, Boolean.TRUE);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                return new xv1(2, (Object) linkedHashMap);
            default:
                return super.b(context, obj);
        }
    }

    public final Object c(int i, Intent intent) {
        long[] longArrayExtra;
        switch (this.a) {
            case 0:
                if (i != -1) {
                    return MapsKt.emptyMap();
                }
                if (intent == null) {
                    return MapsKt.emptyMap();
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return MapsKt.emptyMap();
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                int length = intArrayExtra.length;
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.add(Boolean.valueOf(intArrayExtra[i2] == 0));
                }
                return MapsKt.toMap(CollectionsKt.zip(ArraysKt.filterNotNull(stringArrayExtra), arrayList));
            case 1:
                return new u8(i, intent);
            case 2:
                return new u8(i, intent);
            case 3:
                return new u8(i, intent);
            default:
                t9f t9f = t9f.a;
                return (i != -1 || intent == null || intent.getStringExtra("ru.ok.tamtam.extra_FOLDER_ID") == null || (longArrayExtra = intent.getLongArrayExtra("ru.ok.tamtam.extra.CHAT_SERVER_IDS")) == null || longArrayExtra.length == 0) ? t9f : new u9f(ArraysKt.toList(longArrayExtra));
        }
    }
}
