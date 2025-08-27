package one.me.sdk.richvector;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import one.me.sdk.richvector.internal.element.Shape;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001SB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010%H\u0017¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0005H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u00102J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0019\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0011H\u0016¢\u0006\u0004\b=\u0010\u0013J\u0019\u0010A\u001a\u0004\u0018\u00010>2\u0006\u00109\u001a\u000208H\u0000¢\u0006\u0004\b?\u0010@J\r\u0010B\u001a\u00020\u0016¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010DR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010ER\u0014\u0010F\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010DR\u0016\u0010I\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010DR\u0016\u0010J\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010DR\u0016\u0010K\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010DR\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0014\u0010P\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lone/me/sdk/richvector/EnhancedVectorDrawable;", "Landroid/graphics/drawable/Drawable;", "Lb2g;", "Landroid/content/Context;", "context", "", "resId", "<init>", "(Landroid/content/Context;I)V", "Landroid/content/res/Resources;", "resources", "(Landroid/content/res/Resources;I)V", "prototype", "(Lone/me/sdk/richvector/EnhancedVectorDrawable;)V", "Lone/me/sdk/richvector/internal/element/Shape;", "buildShape", "(I)Lone/me/sdk/richvector/internal/element/Shape;", "", "buildScaleMatrix", "()V", "scaleAllPaths", "scaleAllStrokes", "", "value", "dp", "(F)I", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "alpha", "setAlpha", "(I)V", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "getIntrinsicWidth", "getIntrinsicHeight", "Landroid/graphics/drawable/Drawable$ConstantState;", "getConstantState", "()Landroid/graphics/drawable/Drawable$ConstantState;", "", "name", "Lone/me/sdk/richvector/VectorPath;", "findPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/VectorPath;", "invalidatePath", "Lone/me/sdk/richvector/AnimationTarget;", "findTarget$rich_vector_release", "(Ljava/lang/String;)Lone/me/sdk/richvector/AnimationTarget;", "findTarget", "getPixelSize", "()F", "I", "Landroid/content/res/Resources;", "shape", "Lone/me/sdk/richvector/internal/element/Shape;", "left", "top", "width", "height", "scaleRatio", "F", "strokeRatio", "Landroid/graphics/Matrix;", "scaleMatrix", "Landroid/graphics/Matrix;", "Companion", "g75", "rich-vector_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEnhancedVectorDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnhancedVectorDrawable.kt\none/me/sdk/richvector/EnhancedVectorDrawable\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,176:1\n47#2,8:177\n*S KotlinDebug\n*F\n+ 1 EnhancedVectorDrawable.kt\none/me/sdk/richvector/EnhancedVectorDrawable\n*L\n64#1:177,8\n*E\n"})
@Keep
public class EnhancedVectorDrawable extends Drawable implements b2g {
    private static final g75 Companion = new Object();
    /* access modifiers changed from: private */
    public static final String TAG = "EnhancedVectorDrawable";
    private int height;
    private int left;
    /* access modifiers changed from: private */
    public final int resId;
    /* access modifiers changed from: private */
    public final Resources resources;
    private final Matrix scaleMatrix;
    private float scaleRatio;
    private final Shape shape;
    private float strokeRatio;
    private int top;
    private int width;

    public EnhancedVectorDrawable(Context context, int i) {
        this(context.getResources(), i);
    }

    private final void buildScaleMatrix() {
        Matrix matrix = this.scaleMatrix;
        matrix.reset();
        matrix.postTranslate((((float) this.width) / 2.0f) - (this.shape.getViewportWidth() / 2.0f), (((float) this.height) / 2.0f) - (this.shape.getViewportHeight() / 2.0f));
        float min = Math.min(((float) this.width) / this.shape.getViewportWidth(), ((float) this.height) / this.shape.getViewportHeight());
        this.scaleRatio = min;
        matrix.postScale(min, min, ((float) this.width) / 2.0f, ((float) this.height) / 2.0f);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [d33, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [d33, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0, types: [d33, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v8, types: [d33, java.lang.Object] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:95:0x0198=Splitter:B:95:0x0198, B:91:0x018e=Splitter:B:91:0x018e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final one.me.sdk.richvector.internal.element.Shape buildShape(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            r17 = this;
            z1g r0 = new z1g
            r0 = r17
            android.content.res.Resources r0 = r0.resources
            p3a r1 = defpackage.z1g.a
            java.lang.Object r2 = r1.a
            android.util.LruCache r2 = (android.util.LruCache) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            java.lang.Object r2 = r2.get(r3)
            one.me.sdk.richvector.internal.element.Shape r2 = (one.me.sdk.richvector.internal.element.Shape) r2
            if (r2 == 0) goto L_0x001f
            one.me.sdk.richvector.internal.element.Shape r0 = new one.me.sdk.richvector.internal.element.Shape
            r0.<init>(r2)
            goto L_0x01ac
        L_0x001f:
            r2 = r18
            android.content.res.XmlResourceParser r3 = r0.getXml(r2)
            d33 r0 = new d33
            r0.<init>()
            d33 r4 = new d33
            r4.<init>()
            d33 r5 = new d33
            r5.<init>()
            one.me.sdk.richvector.internal.element.Shape r16 = new one.me.sdk.richvector.internal.element.Shape
            r14 = 64
            r15 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.util.Stack r6 = new java.util.Stack
            r6.<init>()
            int r7 = r3.getEventType()     // Catch:{ XmlPullParserException -> 0x0197, IOException -> 0x018d }
            r9 = r16
            r10 = 0
            r11 = 0
        L_0x0052:
            r12 = 1
            if (r7 == r12) goto L_0x0189
            java.lang.String r13 = r3.getName()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r14 = 3
            r8 = 2
            if (r7 == r8) goto L_0x0127
            if (r7 == r14) goto L_0x0061
            goto L_0x0183
        L_0x0061:
            sq6 r7 = defpackage.x1g.b     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r7.getClass()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            x1g[] r7 = defpackage.x1g.values()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            int r14 = r7.length     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r8 = 0
        L_0x006c:
            if (r8 >= r14) goto L_0x007d
            r12 = r7[r8]     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            java.lang.String r15 = r12.a     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r13)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            if (r15 == 0) goto L_0x0079
            goto L_0x007e
        L_0x0079:
            int r8 = r8 + 1
            r12 = 1
            goto L_0x006c
        L_0x007d:
            r12 = 0
        L_0x007e:
            if (r12 != 0) goto L_0x0083
            r7 = -1
        L_0x0081:
            r8 = -1
            goto L_0x008c
        L_0x0083:
            int[] r7 = defpackage.y1g.$EnumSwitchMapping$0     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            int r8 = r12.ordinal()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r7 = r7[r8]     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            goto L_0x0081
        L_0x008c:
            if (r7 == r8) goto L_0x0183
            r8 = 1
            if (r7 == r8) goto L_0x0122
            r8 = 2
            if (r7 == r8) goto L_0x00f9
            java.lang.String r8 = "Required value was null."
            r12 = 3
            if (r7 == r12) goto L_0x00d1
            r12 = 4
            if (r7 != r12) goto L_0x00cb
            if (r11 == 0) goto L_0x00c1
            boolean r7 = r6.isEmpty()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            if (r7 == 0) goto L_0x00b6
            r9.addClipPath(r11)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            goto L_0x0183
        L_0x00a9:
            r0 = move-exception
            goto L_0x01ad
        L_0x00ac:
            r0 = move-exception
            r16 = r9
            goto L_0x018e
        L_0x00b1:
            r0 = move-exception
            r16 = r9
            goto L_0x0198
        L_0x00b6:
            java.lang.Object r7 = r6.peek()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            one.me.sdk.richvector.internal.element.GroupElement r7 = (one.me.sdk.richvector.internal.element.GroupElement) r7     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r7.addClipPath(r11)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            goto L_0x0183
        L_0x00c1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            java.lang.String r4 = r8.toString()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r0.<init>(r4)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            throw r0     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
        L_0x00cb:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            throw r0     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
        L_0x00d1:
            if (r10 == 0) goto L_0x00ef
            boolean r7 = r6.isEmpty()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            if (r7 == 0) goto L_0x00dd
            r9.addPath(r10)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            goto L_0x00e6
        L_0x00dd:
            java.lang.Object r7 = r6.peek()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            one.me.sdk.richvector.internal.element.GroupElement r7 = (one.me.sdk.richvector.internal.element.GroupElement) r7     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r7.addPath(r10)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
        L_0x00e6:
            android.graphics.Path r7 = r10.getPath()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r9.appendToFullPath(r7)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            goto L_0x0183
        L_0x00ef:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            java.lang.String r4 = r8.toString()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r0.<init>(r4)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            throw r0     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
        L_0x00f9:
            java.lang.Object r7 = r6.pop()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            one.me.sdk.richvector.internal.element.GroupElement r7 = (one.me.sdk.richvector.internal.element.GroupElement) r7     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            boolean r8 = r6.isEmpty()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            if (r8 == 0) goto L_0x010e
            r8 = 0
            r7.setParent(r8)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r9.addGroup(r7)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            goto L_0x0183
        L_0x010e:
            r8 = 0
            java.lang.Object r12 = r6.peek()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            one.me.sdk.richvector.internal.element.GroupElement r12 = (one.me.sdk.richvector.internal.element.GroupElement) r12     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r7.setParent(r12)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            java.lang.Object r12 = r6.peek()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            one.me.sdk.richvector.internal.element.GroupElement r12 = (one.me.sdk.richvector.internal.element.GroupElement) r12     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r12.addGroup(r7)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            goto L_0x0183
        L_0x0122:
            r8 = 0
            r9.buildTransformMatrices()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            goto L_0x0183
        L_0x0127:
            r8 = 0
            sq6 r7 = defpackage.x1g.b     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r7.getClass()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            x1g[] r7 = defpackage.x1g.values()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            int r12 = r7.length     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r14 = 0
        L_0x0133:
            if (r14 >= r12) goto L_0x0144
            r15 = r7[r14]     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            java.lang.String r8 = r15.a     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r13)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            if (r8 == 0) goto L_0x0140
            goto L_0x0145
        L_0x0140:
            int r14 = r14 + 1
            r8 = 0
            goto L_0x0133
        L_0x0144:
            r15 = 0
        L_0x0145:
            if (r15 != 0) goto L_0x014a
            r7 = -1
            r8 = -1
            goto L_0x0153
        L_0x014a:
            int[] r7 = defpackage.y1g.$EnumSwitchMapping$0     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            int r8 = r15.ordinal()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r8 = r7[r8]     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r7 = -1
        L_0x0153:
            if (r8 == r7) goto L_0x0183
            r7 = 1
            if (r8 == r7) goto L_0x0179
            r7 = 2
            if (r8 == r7) goto L_0x0171
            r7 = 3
            if (r8 == r7) goto L_0x016c
            r7 = 4
            if (r8 != r7) goto L_0x0166
            one.me.sdk.richvector.internal.element.ClipPathElement r11 = r5.s0(r3)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            goto L_0x0183
        L_0x0166:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            throw r0     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
        L_0x016c:
            one.me.sdk.richvector.internal.element.PathElement r10 = r4.u0(r3)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            goto L_0x0183
        L_0x0171:
            one.me.sdk.richvector.internal.element.GroupElement r7 = r0.t0(r3)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r6.push(r7)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            goto L_0x0183
        L_0x0179:
            d33 r7 = new d33     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            one.me.sdk.richvector.internal.element.Shape r7 = r7.v0(r3)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            r9 = r7
        L_0x0183:
            int r7 = r3.next()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00ac }
            goto L_0x0052
        L_0x0189:
            r3.close()
            goto L_0x019c
        L_0x018d:
            r0 = move-exception
        L_0x018e:
            r0.printStackTrace()     // Catch:{ all -> 0x00a9 }
        L_0x0191:
            r3.close()
            r9 = r16
            goto L_0x019c
        L_0x0197:
            r0 = move-exception
        L_0x0198:
            r0.printStackTrace()     // Catch:{ all -> 0x00a9 }
            goto L_0x0191
        L_0x019c:
            java.lang.Object r0 = r1.a
            android.util.LruCache r0 = (android.util.LruCache) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0.put(r1, r9)
            one.me.sdk.richvector.internal.element.Shape r0 = new one.me.sdk.richvector.internal.element.Shape
            r0.<init>(r9)
        L_0x01ac:
            return r0
        L_0x01ad:
            r3.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.richvector.EnhancedVectorDrawable.buildShape(int):one.me.sdk.richvector.internal.element.Shape");
    }

    private final int dp(float f) {
        return (int) (this.resources.getDisplayMetrics().density * f);
    }

    private final void scaleAllPaths() {
        this.shape.scaleAllPaths(this.scaleMatrix);
    }

    private final void scaleAllStrokes() {
        float min = Math.min(((float) this.width) / this.shape.getWidth(), ((float) this.height) / this.shape.getHeight());
        this.strokeRatio = min;
        this.shape.scaleAllStrokeWidth(min);
    }

    public void draw(Canvas canvas) {
        setAlpha(this.shape.getAlpha());
        int i = this.left;
        if (i == 0 && this.top == 0) {
            this.shape.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.translate((float) i, (float) this.top);
        try {
            this.shape.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public VectorPath findPath(String str) {
        return this.shape.findPath(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        r0 = r1.shape.findPath(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final one.me.sdk.richvector.AnimationTarget findTarget$rich_vector_release(java.lang.String r2) {
        /*
            r1 = this;
            one.me.sdk.richvector.internal.element.Shape r0 = r1.shape
            java.lang.String r0 = r0.getName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x000f
            one.me.sdk.richvector.internal.element.Shape r1 = r1.shape
            goto L_0x0028
        L_0x000f:
            one.me.sdk.richvector.internal.element.Shape r0 = r1.shape
            one.me.sdk.richvector.internal.element.GroupElement r0 = r0.findGroup(r2)
            if (r0 == 0) goto L_0x0019
        L_0x0017:
            r1 = r0
            goto L_0x0028
        L_0x0019:
            one.me.sdk.richvector.internal.element.Shape r0 = r1.shape
            one.me.sdk.richvector.internal.element.PathElement r0 = r0.findPath(r2)
            if (r0 == 0) goto L_0x0022
            goto L_0x0017
        L_0x0022:
            one.me.sdk.richvector.internal.element.Shape r1 = r1.shape
            one.me.sdk.richvector.internal.element.ClipPathElement r1 = r1.findClipPath(r2)
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.richvector.EnhancedVectorDrawable.findTarget$rich_vector_release(java.lang.String):one.me.sdk.richvector.AnimationTarget");
    }

    public Drawable.ConstantState getConstantState() {
        return new zf(this, 2);
    }

    public int getIntrinsicHeight() {
        return dp(this.shape.getHeight());
    }

    public int getIntrinsicWidth() {
        return dp(this.shape.getWidth());
    }

    public int getOpacity() {
        return -3;
    }

    public final float getPixelSize() {
        if (this.shape.getWidth() == c44.DEFAULT_ASPECT_RATIO || this.shape.getHeight() == c44.DEFAULT_ASPECT_RATIO || this.shape.getViewportHeight() == c44.DEFAULT_ASPECT_RATIO || this.shape.getViewportWidth() == c44.DEFAULT_ASPECT_RATIO) {
            return 1.0f;
        }
        int dp = dp(this.shape.getWidth());
        int dp2 = dp(this.shape.getHeight());
        return Math.min(this.shape.getViewportWidth() / ((float) dp), this.shape.getViewportHeight() / ((float) dp2));
    }

    public void invalidatePath() {
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (rect.width() != 0 && rect.height() != 0) {
            this.left = rect.left;
            this.top = rect.top;
            this.width = rect.width();
            this.height = rect.height();
            buildScaleMatrix();
            scaleAllPaths();
            scaleAllStrokes();
        }
    }

    public void setAlpha(int i) {
        this.shape.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Deprecated(message = "Not yet implemented. Use direct color change via EnhancedVectorDrawable::findPath")
    public void setTintList(ColorStateList colorStateList) {
    }

    @Deprecated(message = "Not yet implemented. Use direct color change via EnhancedVectorDrawable::findPath")
    public void setTintMode(PorterDuff.Mode mode) {
    }

    public EnhancedVectorDrawable(Resources resources2, int i) throws Resources.NotFoundException {
        Shape shape2;
        this.scaleRatio = 1.0f;
        this.strokeRatio = 1.0f;
        this.scaleMatrix = new Matrix();
        this.resources = resources2;
        this.resId = i;
        if (i != 0) {
            shape2 = buildShape(i);
        } else {
            Shape.Companion.getClass();
            shape2 = Shape.EMPTY;
        }
        this.shape = shape2;
        setBounds(0, 0, dp(shape2.getWidth()), dp(shape2.getHeight()));
    }

    public EnhancedVectorDrawable(EnhancedVectorDrawable enhancedVectorDrawable) {
        this.scaleRatio = 1.0f;
        this.strokeRatio = 1.0f;
        this.scaleMatrix = new Matrix();
        this.resources = enhancedVectorDrawable.resources;
        this.resId = enhancedVectorDrawable.resId;
        Shape shape2 = new Shape(enhancedVectorDrawable.shape);
        this.shape = shape2;
        setBounds(0, 0, dp(shape2.getWidth()), dp(shape2.getHeight()));
    }
}
