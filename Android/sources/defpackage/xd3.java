package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: xd3  reason: default package */
public abstract class xd3 {
    public static final v95 a = new v95("common", 1, (long) MultiFileUploader.UPLOAD_NEXT_INTERVAL, true, true, 0, 64);
    public static final Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new oq2(13));
    public static final Lazy c = LazyKt.lazy(new oq2(14));
    public static final Lazy d = LazyKt.lazy(new oq2(15));
    public static final v95 e = new v95("computation", (Runtime.getRuntime().availableProcessors() * 2) - 1, (long) MultiFileUploader.UPLOAD_NEXT_INTERVAL, true, false, 0, 96);
    public static final Lazy f = LazyKt.lazy(new oq2(16));
    public static final Lazy g = LazyKt.lazy(new oq2(17));
    public static final Lazy h = LazyKt.lazy(new oq2(18));
    public static final Lazy i = LazyKt.lazy(new oq2(19));
}
