package defpackage;

import android.content.Context;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Lazy;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: yd9  reason: default package */
public final class yd9 {
    public final int a;
    public final Lazy b;
    public final Lazy c;
    public final Context d;
    public final boolean e;

    public yd9(Context context, Lazy lazy, Lazy lazy2, fn4 fn4, int i) {
        this.a = i;
        this.b = lazy;
        this.c = lazy2;
        this.d = context.getApplicationContext();
        this.e = fn4.b().compareTo(kn4.v) >= 0;
    }

    public final xd9 a(byte[] bArr) {
        qqc qqc;
        byte[] bArr2 = b.a;
        try {
            Protos.MessageReactions parseFrom = Protos.MessageReactions.parseFrom(bArr);
            ArrayList arrayList = new ArrayList();
            int length = parseFrom.reactions.length;
            for (int i = 0; i < length; i++) {
                Protos.ReactionData reactionData = parseFrom.reactions[i].reaction;
                int i2 = reactionData.type;
                rqc.b.getClass();
                arrayList.add(new wd9(new qqc(bk3.m(i2), b(reactionData.reaction)), parseFrom.reactions[i].count));
            }
            int i3 = parseFrom.totalCount;
            Protos.ReactionData reactionData2 = parseFrom.yourReaction;
            if (reactionData2 == null) {
                qqc = null;
            } else {
                int i4 = reactionData2.type;
                rqc.b.getClass();
                qqc = new qqc(bk3.m(i4), b(parseFrom.yourReaction.reaction));
            }
            return new xd9(arrayList, i3, qqc);
        } catch (InvalidProtocolBufferNanoException e2) {
            throw new IOException(e2);
        }
    }

    public final hqc b(String str) {
        return new hqc(((u25) this.b.getValue()).e(str, this.d.getResources().getDimensionPixelSize(this.a)));
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [xd9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedHashMap c(java.util.Map r10) {
        /*
            r9 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r10.size()
            int r1 = kotlin.collections.MapsKt.mapCapacity(r1)
            r0.<init>(r1)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0015:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0070
            java.lang.Object r1 = r10.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            ud9 r1 = (defpackage.ud9) r1
            r3 = 0
            if (r1 == 0) goto L_0x006c
            java.util.List r4 = r1.a
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r4, 10)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x003f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x005c
            java.lang.Object r6 = r4.next()
            pd9 r6 = (defpackage.pd9) r6
            wd9 r7 = new wd9
            nd9 r8 = r6.a
            qqc r8 = r9.d(r8)
            int r6 = r6.b
            r7.<init>(r8, r6)
            r5.add(r7)
            goto L_0x003f
        L_0x005c:
            nd9 r4 = r1.c
            if (r4 == 0) goto L_0x0064
            qqc r3 = r9.d(r4)
        L_0x0064:
            xd9 r4 = new xd9
            int r1 = r1.b
            r4.<init>(r5, r1, r3)
            r3 = r4
        L_0x006c:
            r0.put(r2, r3)
            goto L_0x0015
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd9.c(java.util.Map):java.util.LinkedHashMap");
    }

    public final qqc d(nd9 nd9) {
        bk3 bk3 = rqc.b;
        int i = nd9.a.a;
        bk3.getClass();
        return new qqc(bk3.m(i), b(nd9.b));
    }
}
