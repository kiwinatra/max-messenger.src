package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: nm7  reason: default package */
public final class nm7 extends wnb {
    public static final boolean c;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0.intValue() >= 9) goto L_0x001b;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r0)
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x001d
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L_0x0025
        L_0x001b:
            r2 = r3
            goto L_0x0025
        L_0x001d:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r1)     // Catch:{ NoSuchMethodException -> 0x0025 }
            goto L_0x001b
        L_0x0025:
            c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm7.<clinit>():void");
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((y8c) next) != y8c.HTTP_1_0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((y8c) it.next()).a);
        }
        Object[] array = arrayList2.toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final String f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
