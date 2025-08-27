package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import one.me.messages.list.loader.MessageModel;

/* renamed from: wj9  reason: default package */
public final class wj9 implements ck9 {
    public static final wj9 o = new wj9(CollectionsKt.emptyList(), true, true);
    public final List a;
    public final boolean b;
    public final boolean c;

    public wj9(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public static String a(MessageModel messageModel) {
        if (messageModel == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("MessageModel(messageId=");
        sb.append(messageModel.a);
        sb.append(", serverId=");
        sb.append(messageModel.b);
        sb.append(", sortTime=");
        return wj6.m(sb, messageModel.c, ")");
    }

    public final List b() {
        return this.a;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.a) {
            if (((MessageModel) next).x == hcg.Error) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj9)) {
            return false;
        }
        wj9 wj9 = (wj9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wj9.a) && this.b == wj9.b && this.c == wj9.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + g63.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        List list = this.a;
        int size = list.size();
        String a2 = a((MessageModel) CollectionsKt.firstOrNull(list));
        String a3 = a((MessageModel) CollectionsKt.lastOrNull(list));
        return StringsKt.trimIndent("\n        MessagesList(\n            hasNext=" + this.b + ",\n            hasPrev=" + this.c + ",\n            messages=Messages(size=" + size + ", first=" + a2 + ", last=" + a3 + ")\n        ) \n        ");
    }
}
