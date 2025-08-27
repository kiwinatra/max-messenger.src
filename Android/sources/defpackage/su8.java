package defpackage;

import android.media.RouteDiscoveryPreference;
import java.util.ArrayList;

/* renamed from: su8  reason: default package */
public abstract /* synthetic */ class su8 {
    public static /* synthetic */ RouteDiscoveryPreference.Builder f(ArrayList arrayList) {
        return new RouteDiscoveryPreference.Builder(arrayList, false);
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder g(ArrayList arrayList, boolean z) {
        return new RouteDiscoveryPreference.Builder(arrayList, z);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void n() {
        /*
            android.media.RouteDiscoveryPreference$Builder r0 = new android.media.RouteDiscoveryPreference$Builder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su8.n():void");
    }
}
