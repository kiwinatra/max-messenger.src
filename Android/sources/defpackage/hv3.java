package defpackage;

import android.media.MediaDrm;
import android.media.metrics.MediaMetricsManager;
import android.view.ContentInfo;

/* renamed from: hv3  reason: default package */
public abstract /* synthetic */ class hv3 {
    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent e(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager g(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ ContentInfo.Builder j(ContentInfo contentInfo) {
        return new ContentInfo.Builder(contentInfo);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void m() {
        /*
            android.view.ContentInfo$Builder r0 = new android.view.ContentInfo$Builder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv3.m():void");
    }
}
