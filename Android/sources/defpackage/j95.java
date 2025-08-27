package defpackage;

import java.util.Collection;
import java.util.Comparator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* renamed from: j95  reason: default package */
public final class j95 implements Comparator {
    public static final of3 c = new of3(12);
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ j95(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b6, code lost:
        r4 = r3.a(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L_0x00ad;
                case 1: goto L_0x0079;
                case 2: goto L_0x0032;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.util.Rational r4 = (android.util.Rational) r4
            android.util.Rational r5 = (android.util.Rational) r5
            float r4 = r4.floatValue()
            java.lang.Object r3 = r3.b
            android.util.Rational r3 = (android.util.Rational) r3
            float r0 = r3.floatValue()
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x001b
            float r0 = r0 / r4
            goto L_0x001d
        L_0x001b:
            float r0 = r4 / r0
        L_0x001d:
            float r4 = r5.floatValue()
            float r3 = r3.floatValue()
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x002b
            float r3 = r3 / r4
            goto L_0x002d
        L_0x002b:
            float r3 = r4 / r3
        L_0x002d:
            int r3 = java.lang.Float.compare(r3, r0)
            return r3
        L_0x0032:
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            boolean r0 = r4.A0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.A0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L_0x0049
            goto L_0x0078
        L_0x0049:
            boolean r0 = r4.isPressed()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.isPressed()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L_0x0060
            goto L_0x0078
        L_0x0060:
            java.lang.Object r3 = r3.b
            com.google.android.material.button.MaterialButtonToggleGroup r3 = (com.google.android.material.button.MaterialButtonToggleGroup) r3
            int r4 = r3.indexOfChild(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r3 = r3.indexOfChild(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r0 = r4.compareTo(r3)
        L_0x0078:
            return r0
        L_0x0079:
            wk6 r5 = (defpackage.wk6) r5
            java.lang.Object r3 = r3.b
            yd7 r3 = (defpackage.yd7) r3
            java.util.concurrent.ConcurrentHashMap r0 = r3.z0
            vk6 r5 = r5.a
            java.lang.Object r5 = r0.get(r5)
            k48 r5 = (defpackage.k48) r5
            r0 = 0
            if (r5 == 0) goto L_0x0093
            long r1 = r5.v
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            goto L_0x0094
        L_0x0093:
            r5 = r0
        L_0x0094:
            wk6 r4 = (defpackage.wk6) r4
            java.util.concurrent.ConcurrentHashMap r3 = r3.z0
            vk6 r4 = r4.a
            java.lang.Object r3 = r3.get(r4)
            k48 r3 = (defpackage.k48) r3
            if (r3 == 0) goto L_0x00a8
            long r3 = r3.v
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
        L_0x00a8:
            int r3 = kotlin.comparisons.ComparisonsKt.compareValues(r5, r0)
            return r3
        L_0x00ad:
            java.lang.Object r3 = r3.b
            nz9 r3 = (defpackage.nz9) r3
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == 0) goto L_0x00c1
            int r4 = r3.a(r4)
            if (r4 < 0) goto L_0x00c1
            int[] r1 = r3.c
            r4 = r1[r4]
            goto L_0x00c2
        L_0x00c1:
            r4 = r0
        L_0x00c2:
            if (r5 == 0) goto L_0x00ce
            int r5 = r3.a(r5)
            if (r5 < 0) goto L_0x00ce
            int[] r3 = r3.c
            r0 = r3[r5]
        L_0x00ce:
            int r3 = kotlin.jvm.internal.Intrinsics.compare((int) r4, (int) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j95.compare(java.lang.Object, java.lang.Object):int");
    }

    public j95(Collection collection) {
        this.a = 0;
        Sequence<IndexedValue> withIndex = SequencesKt.withIndex(SequencesKt.map(CollectionsKt.asSequence(collection), (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(c, 1)));
        nz9 nz9 = new nz9(collection.size());
        for (IndexedValue indexedValue : withIndex) {
            nz9.d(indexedValue.getIndex(), indexedValue.getValue());
        }
        this.b = nz9;
    }
}
