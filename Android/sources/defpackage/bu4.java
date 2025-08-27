package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.reflect.KProperty;

/* renamed from: bu4  reason: default package */
public final class bu4 {
    public static final /* synthetic */ KProperty[] f;
    public static final String g;
    public final lfd a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 d;
    public final AtomicBoolean e = new AtomicBoolean();

    static {
        Class<bu4> cls = bu4.class;
        f = new KProperty[]{wj6.p(cls, "authStorage", "getAuthStorage()Lru/ok/tamtam/AuthStorage;", 0), wj6.p(cls, "fileAttachUploader", "getFileAttachUploader()Lru/ok/tamtam/FileAttachUploader;", 0), wj6.p(cls, "draftUploadsRepository", "getDraftUploadsRepository()Lru/ok/tamtam/upload/drafts/DraftUploadsRepository;", 0)};
        g = cls.getName();
    }

    public bu4(lfd lfd, hs7 hs7, hs7 hs72, hs7 hs73) {
        this.a = lfd;
        this.b = hs72;
        this.c = hs7;
        this.d = hs73;
    }
}
