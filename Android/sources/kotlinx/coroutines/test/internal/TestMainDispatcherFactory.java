package kotlinx.coroutines.test.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/test/internal/TestMainDispatcherFactory;", "Lkc8;", "<init>", "()V", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTestMainDispatcherJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestMainDispatcherJvm.kt\nkotlinx/coroutines/test/internal/TestMainDispatcherFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n774#2:28\n865#2,2:29\n1971#2,14:31\n*S KotlinDebug\n*F\n+ 1 TestMainDispatcherJvm.kt\nkotlinx/coroutines/test/internal/TestMainDispatcherFactory\n*L\n9#1:28\n9#1:29,2\n10#1:31,14\n*E\n"})
public final class TestMainDispatcherFactory implements kc8 {
    public String a() {
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kc8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.gc8 b(java.util.List r5) {
        /*
            r4 = this;
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x000b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x001e
            java.lang.Object r1 = r5.next()
            r2 = r1
            kc8 r2 = (defpackage.kc8) r2
            if (r2 == r4) goto L_0x000b
            r0.add(r1)
            goto L_0x000b
        L_0x001e:
            java.util.Iterator r4 = r0.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L_0x002a
            r4 = 0
            goto L_0x0053
        L_0x002a:
            java.lang.Object r5 = r4.next()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L_0x0036
        L_0x0034:
            r4 = r5
            goto L_0x0053
        L_0x0036:
            r1 = r5
            kc8 r1 = (defpackage.kc8) r1
            int r1 = r1.c()
        L_0x003d:
            java.lang.Object r2 = r4.next()
            r3 = r2
            kc8 r3 = (defpackage.kc8) r3
            int r3 = r3.c()
            if (r1 >= r3) goto L_0x004c
            r5 = r2
            r1 = r3
        L_0x004c:
            boolean r2 = r4.hasNext()
            if (r2 != 0) goto L_0x003d
            goto L_0x0034
        L_0x0053:
            kc8 r4 = (defpackage.kc8) r4
            if (r4 != 0) goto L_0x0059
            ls9 r4 = defpackage.ls9.a
        L_0x0059:
            gc8 r4 = r4.b(r0)     // Catch:{ all -> 0x0063 }
            qef r5 = new qef
            r5.<init>(r4)
            return r5
        L_0x0063:
            r5 = move-exception
            r4.a()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.test.internal.TestMainDispatcherFactory.b(java.util.List):gc8");
    }

    public int c() {
        return IntCompanionObject.MAX_VALUE;
    }
}
