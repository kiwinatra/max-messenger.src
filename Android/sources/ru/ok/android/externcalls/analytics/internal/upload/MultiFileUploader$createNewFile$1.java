package ru.ok.android.externcalls.analytics.internal.upload;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class MultiFileUploader$createNewFile$1 extends Lambda implements Function0<File> {
    final /* synthetic */ MultiFileUploader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiFileUploader$createNewFile$1(MultiFileUploader multiFileUploader) {
        super(0);
        this.this$0 = multiFileUploader;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (r2 == null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File invoke() {
        /*
            r6 = this;
            ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r0 = r6.this$0
            javax.inject.Provider r0 = r0.getStorage()
            java.lang.Object r0 = r0.get()
            java.io.File r0 = (java.io.File) r0
            ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r1 = r6.this$0
            ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader$StorageInfo r1 = r1.getStorageInfo()
            java.util.List r2 = r1.getAllFiles()
            int r2 = r2.size()
            ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r3 = r6.this$0
            int r3 = r3.fileCountLimit
            if (r2 < r3) goto L_0x0038
            java.io.File r2 = r1.getOldestFile()
            if (r2 == 0) goto L_0x0033
            ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r3 = r6.this$0
            r3.dropOldestFile(r2)
            java.util.List r2 = r3.getAllFiles()
            if (r2 != 0) goto L_0x003c
        L_0x0033:
            java.util.List r2 = r1.getAllFiles()
            goto L_0x003c
        L_0x0038:
            java.util.List r2 = r1.getAllFiles()
        L_0x003c:
            ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r1 = r6.this$0
            java.lang.String r1 = r1.calcBestNameForNewFile(r2)
            ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r6 = r6.this$0
            ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger r6 = r6.getLogger()
            java.util.Collection r2 = (java.util.Collection) r2
            long r2 = ru.ok.android.externcalls.analytics.internal.utils.Files.length((java.util.Collection<java.io.File>) r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Propose new file for upload cache: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r5 = ", total files size: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "CallAnalyticsUploaderV2"
            r6.d(r3, r2)
            java.io.File r6 = new java.io.File
            r6.<init>(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader$createNewFile$1.invoke():java.io.File");
    }
}
