package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.uuid.Uuid;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: ox2  reason: default package */
public final class ox2 extends j3h {
    public static final ox2 b = new j3h(8);

    public static Uri n1(ox2 ox2, long j, String str, Long l, Long l2, List list, String str2, Boolean bool, boolean z, int i) {
        int i2 = i;
        Boolean bool2 = null;
        Long l3 = (i2 & 4) != 0 ? null : l;
        Long l4 = (i2 & 8) != 0 ? null : l2;
        List list2 = (i2 & 16) != 0 ? null : list;
        String str3 = (i2 & 32) != 0 ? null : str2;
        if ((i2 & Uuid.SIZE_BITS) == 0) {
            bool2 = bool;
        }
        boolean z2 = (i2 & 256) != 0 ? false : z;
        ox2.getClass();
        zqd zqd = new zqd(9);
        zqd.b = ":chats";
        zqd.z(Long.valueOf(j), "id");
        String str4 = str;
        zqd.z(str, "type");
        if (z2) {
            zqd.z(Boolean.TRUE, "no_anim");
        }
        if (l3 != null) {
            zqd.z(Long.valueOf(l3.longValue()), "message_id");
        }
        if (l4 != null) {
            zqd.z(Long.valueOf(l4.longValue()), "load_mark");
        }
        if (list2 != null) {
            String p = CollectionsKt___CollectionsKt.joinToString$default(list2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
            ((ArrayList) zqd.c).add("highlights=" + p);
        }
        if (str3 != null) {
            zqd.z(str3, ApiProtocol.PARAM_PAYLOAD);
        }
        if (bool2 != null) {
            zqd.z(bool2, "open_search_field");
        }
        return zqd.p();
    }

    public static void p1(ox2 ox2, long j, String str, Long l, Long l2, List list, String str2, int i) {
        Long l3 = (i & 4) != 0 ? null : l;
        Long l4 = (i & 8) != 0 ? null : l2;
        List list2 = (i & 16) != 0 ? null : list;
        String str3 = (i & 32) != 0 ? null : str2;
        ox2.getClass();
        ox2.W0().c(n1(ox2, j, str, l3, l4, list2, str3, (Boolean) null, false, 320), (Bundle) null);
    }

    public final pa4 o1(long j) {
        return new pa4(wj6.j(j, ":chats?id=", "&type=local"));
    }
}
