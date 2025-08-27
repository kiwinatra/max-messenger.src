package defpackage;

import android.content.DialogInterface;

/* renamed from: lwg  reason: default package */
public abstract class lwg implements DialogInterface.OnClickListener {
    public abstract void a();

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0006 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r1, int r2) {
        /*
            r0 = this;
            r0.a()     // Catch:{ ActivityNotFoundException -> 0x0006 }
            goto L_0x000d
        L_0x0004:
            r0 = move-exception
            goto L_0x0011
        L_0x0006:
            java.lang.String r0 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x0004 }
            java.lang.String r2 = "generic"
            r0.contains(r2)     // Catch:{ all -> 0x0004 }
        L_0x000d:
            r1.dismiss()
            return
        L_0x0011:
            r1.dismiss()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwg.onClick(android.content.DialogInterface, int):void");
    }
}
