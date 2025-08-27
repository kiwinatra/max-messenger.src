package defpackage;

import android.graphics.Bitmap;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Result;

/* renamed from: q97  reason: default package */
public final class q97 extends ri0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public q97(lw1 lw1, i0 i0Var, x0d x0d) {
        this.b = lw1;
        this.c = i0Var;
        this.d = x0d;
    }

    public void d() {
        switch (this.a) {
            case 1:
                kw1 kw1 = (kw1) this.b;
                if (kw1.isActive()) {
                    kw1.q(new Throwable("Cancelled with fresco pipeline"));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void e(i0 i0Var) {
        switch (this.a) {
            case 0:
                ((s97) this.d).b((r97) this.b);
                return;
            default:
                kw1 kw1 = (kw1) this.b;
                if (kw1.isActive()) {
                    kw1.resumeWith(Result.m23constructorimpl((Object) null));
                    return;
                }
                return;
        }
    }

    public final void g(Bitmap bitmap) {
        Object obj = this.d;
        FileOutputStream fileOutputStream = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                r97 r97 = (r97) obj3;
                s97 s97 = (s97) obj;
                if (bitmap == null) {
                    z68.f("s97", "onNewResultImpl: bitmap is null in shareWebpImage", (Throwable) null);
                    s97.b(r97);
                    return;
                }
                try {
                    String absolutePath = ((ln5) obj2).a("png").getAbsolutePath();
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    s97.getClass();
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(absolutePath);
                        try {
                            bitmap.compress(compressFormat, 100, fileOutputStream2);
                            j4b.j(fileOutputStream2);
                            if (r97 != null) {
                                s97.c(new uo5(11, (Object) r97, (Object) absolutePath));
                                return;
                            }
                            return;
                        } catch (IOException e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                            try {
                                z68.f("s97", "saveBitmap failure!", e);
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                j4b.j(fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            j4b.j(fileOutputStream);
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        z68.f("s97", "saveBitmap failure!", e);
                        throw e;
                    }
                } catch (Exception e3) {
                    z68.f("s97", "onNewResultImpl: failed to save webp image", e3);
                    s97.b(r97);
                    return;
                }
            default:
                kw1 kw1 = (kw1) obj3;
                if (!kw1.isActive()) {
                    if (bitmap != null) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                } else if (!((i0) obj2).h()) {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    kw1.resumeWith(Result.m23constructorimpl((Object) null));
                    return;
                } else if (bitmap == null) {
                    kw1.resumeWith(Result.m23constructorimpl((Object) null));
                    return;
                } else {
                    Result.Companion companion = Result.Companion;
                    ce6 ce6 = ((x0d) obj).c;
                    kw1.resumeWith(Result.m23constructorimpl(new de6(ce6.b, ce6.c, bitmap)));
                    return;
                }
        }
    }

    public q97(s97 s97, r97 r97, ln5 ln5) {
        this.d = s97;
        this.b = r97;
        this.c = ln5;
    }
}
