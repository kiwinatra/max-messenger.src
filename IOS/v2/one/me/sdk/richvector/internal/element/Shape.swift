package one.me.sdk.richvector.internal.element;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import one.me.sdk.richvector.AnimationTarget;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001JBC\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010'\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00132\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0003H\u0016¢\u0006\u0004\b3\u00104R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b6\u00104R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b:\u00109R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b@\u00109R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\bA\u00109R\u0014\u0010B\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u00100\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010DR\u0011\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00190E8\u0016X\u0005R\u0011\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00110E8\u0016X\u0005R\u0011\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00160E8\u0016X\u0005¨\u0006K"}, d2 = {"Lone/me/sdk/richvector/internal/element/Shape;", "Lone/me/sdk/richvector/internal/element/ElementHolder;", "Lone/me/sdk/richvector/AnimationTarget;", "", "name", "", "viewportWidth", "viewportHeight", "", "alpha", "width", "height", "elementHolder", "<init>", "(Ljava/lang/String;FFIFFLone/me/sdk/richvector/internal/element/ElementHolder;)V", "prototype", "(Lone/me/sdk/richvector/internal/element/Shape;)V", "Lone/me/sdk/richvector/internal/element/GroupElement;", "element", "", "addGroup", "(Lone/me/sdk/richvector/internal/element/GroupElement;)V", "Lone/me/sdk/richvector/internal/element/PathElement;", "addPath", "(Lone/me/sdk/richvector/internal/element/PathElement;)V", "Lone/me/sdk/richvector/internal/element/ClipPathElement;", "addClipPath", "(Lone/me/sdk/richvector/internal/element/ClipPathElement;)V", "ratio", "scaleAllStrokeWidth", "(F)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "findPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/internal/element/PathElement;", "findGroup", "(Ljava/lang/String;)Lone/me/sdk/richvector/internal/element/GroupElement;", "findClipPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/internal/element/ClipPathElement;", "Landroid/graphics/Path;", "path", "appendToFullPath", "(Landroid/graphics/Path;)V", "buildTransformMatrices", "()V", "Landroid/graphics/Matrix;", "scaleMatrix", "scaleAllPaths", "(Landroid/graphics/Matrix;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", "F", "getViewportWidth", "()F", "getViewportHeight", "I", "getAlpha", "()I", "setAlpha", "(I)V", "getWidth", "getHeight", "fullPath", "Landroid/graphics/Path;", "Landroid/graphics/Matrix;", "", "clipPathElements", "groupElements", "pathElements", "Companion", "i4e", "rich-vector_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shape.kt\none/me/sdk/richvector/internal/element/Shape\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1863#2,2:57\n1863#2,2:59\n1863#2,2:61\n1863#2,2:63\n*S KotlinDebug\n*F\n+ 1 Shape.kt\none/me/sdk/richvector/internal/element/Shape\n*L\n37#1:57,2\n43#1:59,2\n44#1:61,2\n45#1:63,2\n*E\n"})
@Keep
public final class Shape implements ElementHolder, AnimationTarget {
    public static final i4e Companion = new Object();
    /* access modifiers changed from: private */
    public static final Shape EMPTY = new Shape((String) null, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 0, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (ElementHolder) null, 64, (DefaultConstructorMarker) null);
    private final /* synthetic */ ElementHolder $$delegate_0;
    private int alpha;
    private final Path fullPath;
    private final float height;
    private final String name;
    private final Matrix scaleMatrix;
    private final float viewportHeight;
    private final float viewportWidth;
    private final float width;

    public Shape(String str, float f, float f2, int i, float f3, float f4, ElementHolder elementHolder) {
        this.$$delegate_0 = elementHolder;
        this.name = str;
        this.viewportWidth = f;
        this.viewportHeight = f2;
        this.alpha = i;
        this.width = f3;
        this.height = f4;
        this.fullPath = new Path();
        this.scaleMatrix = new Matrix();
    }

    public void addClipPath(ClipPathElement clipPathElement) {
        this.$$delegate_0.addClipPath(clipPathElement);
    }

    public void addGroup(GroupElement groupElement) {
        this.$$delegate_0.addGroup(groupElement);
    }

    public void addPath(PathElement pathElement) {
        this.$$delegate_0.addPath(pathElement);
    }

    public final void appendToFullPath(Path path) {
        this.fullPath.addPath(path);
    }

    public final void buildTransformMatrices() {
        for (GroupElement buildTransformMatrix : getGroupElements()) {
            buildTransformMatrix.buildTransformMatrix();
        }
    }

    public void draw(Canvas canvas) {
        this.$$delegate_0.draw(canvas);
    }

    public ClipPathElement findClipPath(String str) {
        return this.$$delegate_0.findClipPath(str);
    }

    public GroupElement findGroup(String str) {
        return this.$$delegate_0.findGroup(str);
    }

    public PathElement findPath(String str) {
        return this.$$delegate_0.findPath(str);
    }

    public final int getAlpha() {
        return this.alpha;
    }

    public List<ClipPathElement> getClipPathElements() {
        return this.$$delegate_0.getClipPathElements();
    }

    public List<GroupElement> getGroupElements() {
        return this.$$delegate_0.getGroupElements();
    }

    public final float getHeight() {
        return this.height;
    }

    public final String getName() {
        return this.name;
    }

    public List<PathElement> getPathElements() {
        return this.$$delegate_0.getPathElements();
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public final float getWidth() {
        return this.width;
    }

    public final void scaleAllPaths(Matrix matrix) {
        this.scaleMatrix.set(matrix);
        for (GroupElement scaleAllPaths : getGroupElements()) {
            scaleAllPaths.scaleAllPaths(matrix);
        }
        for (PathElement transform : getPathElements()) {
            transform.transform(matrix);
        }
        for (ClipPathElement transform2 : getClipPathElements()) {
            transform2.transform(matrix);
        }
    }

    public void scaleAllStrokeWidth(float f) {
        this.$$delegate_0.scaleAllStrokeWidth(f);
    }

    public final void setAlpha(int i) {
        this.alpha = i;
    }

    public String toString() {
        String str = this.name;
        float f = this.viewportWidth;
        float f2 = this.viewportHeight;
        int i = this.alpha;
        float f3 = this.width;
        float f4 = this.height;
        Path path = this.fullPath;
        Matrix matrix = this.scaleMatrix;
        List<GroupElement> groupElements = getGroupElements();
        List<PathElement> pathElements = getPathElements();
        List<ClipPathElement> clipPathElements = getClipPathElements();
        StringBuilder sb = new StringBuilder("Shape(name=");
        sb.append(str);
        sb.append(", viewportWidth=");
        sb.append(f);
        sb.append(", viewportHeight=");
        sb.append(f2);
        sb.append(", alpha=");
        sb.append(i);
        sb.append(", width=");
        sb.append(f3);
        sb.append(", height=");
        sb.append(f4);
        sb.append(", fullPath=");
        sb.append(path);
        sb.append(", scaleMatrix=");
        sb.append(matrix);
        sb.append(", groupElements=");
        sb.append(groupElements);
        sb.append(", pathElements=");
        sb.append(pathElements);
        sb.append(", clipPathElements=");
        return tr1.l(sb, clipPathElements, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Shape(String str, float f, float f2, int i, float f3, float f4, ElementHolder elementHolder, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, f2, i, f3, f4, (i2 & 64) != 0 ? new ElementHolderImpl() : elementHolder);
    }

    public Shape(Shape shape) {
        this(shape.name, shape.viewportWidth, shape.viewportHeight, shape.alpha, shape.width, shape.height, new ElementHolderImpl(shape));
        this.fullPath.set(shape.fullPath);
        this.scaleMatrix.set(shape.scaleMatrix);
    }
}
