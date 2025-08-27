package one.me.sdk.richvector.internal.element;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import one.me.sdk.richvector.AnimationTarget;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\bJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lone/me/sdk/richvector/internal/element/ClipPathElement;", "Lone/me/sdk/richvector/AnimationTarget;", "name", "", "pathData", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "prototype", "(Lone/me/sdk/richvector/internal/element/ClipPathElement;)V", "getName", "()Ljava/lang/String;", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "path$delegate", "Lkotlin/Lazy;", "originalPath", "clipPaint", "Landroid/graphics/Paint;", "transform", "", "matrix", "Landroid/graphics/Matrix;", "rich-vector_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClipPathElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipPathElement.kt\none/me/sdk/richvector/internal/element/ClipPathElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
@Keep
public final class ClipPathElement implements AnimationTarget {
    private final Paint clipPaint;
    private final String name;
    private final Path originalPath;
    private final Lazy path$delegate;

    public ClipPathElement(String str, String str2) {
        this.name = str;
        this.path$delegate = LazyKt.lazy(new nm1(11, this));
        this.originalPath = str2 != null ? b59.p(str2) : new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.clipPaint = paint;
    }

    /* access modifiers changed from: private */
    public static final Path path_delegate$lambda$0(ClipPathElement clipPathElement) {
        return new Path(clipPathElement.originalPath);
    }

    public final String getName() {
        return this.name;
    }

    public final Path getPath() {
        return (Path) this.path$delegate.getValue();
    }

    public final void transform(Matrix matrix) {
        getPath().set(this.originalPath);
        getPath().transform(matrix);
    }

    public ClipPathElement(ClipPathElement clipPathElement) {
        this(clipPathElement.name, (String) null);
        this.originalPath.set(clipPathElement.originalPath);
        getPath().set(clipPathElement.getPath());
        this.clipPaint.set(clipPathElement.clipPaint);
    }
}
