package one.me.sdk.richvector.internal.element;

import android.graphics.Canvas;
import android.graphics.Matrix;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import one.me.sdk.richvector.AnimationTarget;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010B\u001d\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0000\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000f\u0010\u0012J\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020/2\u0006\u0010*\u001a\u00020+J\b\u00101\u001a\u00020\u0004H\u0016J\b\u00102\u001a\u00020/H\u0002J\u0011\u00103\u001a\u00020/2\u0006\u00104\u001a\u000205H\u0001J\u0011\u00106\u001a\u00020/2\u0006\u00104\u001a\u00020\u0000H\u0001J\u0011\u00107\u001a\u00020/2\u0006\u00104\u001a\u000208H\u0001J\u0011\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020;H\u0001J\u0013\u0010<\u001a\u0004\u0018\u0001052\u0006\u0010\u0003\u001a\u00020\u0004H\u0001J\u0013\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0001J\u0013\u0010>\u001a\u0004\u0018\u0001082\u0006\u0010\u0003\u001a\u00020\u0004H\u0001J\u0011\u0010?\u001a\u00020/2\u0006\u0010@\u001a\u00020\u0006H\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR$\u0010\t\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR$\u0010\n\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R\u000f\u0010A\u001a\b\u0012\u0004\u0012\u0002050BX\u0005R\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00000BX\u0005R\u000f\u0010D\u001a\b\u0012\u0004\u0012\u0002080BX\u0005¨\u0006E"}, d2 = {"Lone/me/sdk/richvector/internal/element/GroupElement;", "Lone/me/sdk/richvector/internal/element/ElementHolder;", "Lone/me/sdk/richvector/AnimationTarget;", "name", "", "pivotX", "", "pivotY", "rotation", "scaleX", "scaleY", "translateX", "translateY", "parent", "elementHolder", "<init>", "(Ljava/lang/String;FFFFFFFLone/me/sdk/richvector/internal/element/GroupElement;Lone/me/sdk/richvector/internal/element/ElementHolder;)V", "prototype", "(Lone/me/sdk/richvector/internal/element/GroupElement;Lone/me/sdk/richvector/internal/element/GroupElement;)V", "getName", "()Ljava/lang/String;", "getParent", "()Lone/me/sdk/richvector/internal/element/GroupElement;", "setParent", "(Lone/me/sdk/richvector/internal/element/GroupElement;)V", "value", "getPivotX", "()F", "setPivotX", "(F)V", "getPivotY", "setPivotY", "getRotation", "setRotation", "getScaleX", "setScaleX", "getScaleY", "setScaleY", "getTranslateX", "setTranslateX", "getTranslateY", "setTranslateY", "scaleMatrix", "Landroid/graphics/Matrix;", "originalTransformMatrix", "finalTransformMatrix", "buildTransformMatrix", "", "scaleAllPaths", "toString", "invalidateTransforms", "addClipPath", "element", "Lone/me/sdk/richvector/internal/element/ClipPathElement;", "addGroup", "addPath", "Lone/me/sdk/richvector/internal/element/PathElement;", "draw", "canvas", "Landroid/graphics/Canvas;", "findClipPath", "findGroup", "findPath", "scaleAllStrokeWidth", "ratio", "clipPathElements", "", "groupElements", "pathElements", "rich-vector_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGroupElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupElement.kt\none/me/sdk/richvector/internal/element/GroupElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1#2:123\n1863#3,2:124\n1863#3,2:126\n1863#3,2:128\n1863#3,2:130\n1863#3,2:132\n1863#3,2:134\n1863#3,2:136\n*S KotlinDebug\n*F\n+ 1 GroupElement.kt\none/me/sdk/richvector/internal/element/GroupElement\n*L\n77#1:124,2\n80#1:126,2\n83#1:128,2\n99#1:130,2\n117#1:132,2\n118#1:134,2\n119#1:136,2\n*E\n"})
@Keep
public final class GroupElement implements ElementHolder, AnimationTarget {
    private final /* synthetic */ ElementHolder $$delegate_0;
    private final Matrix finalTransformMatrix;
    private final String name;
    private final Matrix originalTransformMatrix;
    private GroupElement parent;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private final Matrix scaleMatrix;
    private float scaleX;
    private float scaleY;
    private float translateX;
    private float translateY;

    public GroupElement(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, GroupElement groupElement, ElementHolder elementHolder) {
        this.$$delegate_0 = elementHolder;
        this.name = str;
        this.parent = groupElement;
        this.pivotX = f;
        this.pivotY = f2;
        this.rotation = f3;
        this.scaleX = f4;
        this.scaleY = f5;
        this.translateX = f6;
        this.translateY = f7;
        this.scaleMatrix = new Matrix();
        this.originalTransformMatrix = new Matrix();
        this.finalTransformMatrix = new Matrix();
    }

    private final void invalidateTransforms() {
        this.finalTransformMatrix.set(this.originalTransformMatrix);
        this.finalTransformMatrix.postConcat(this.scaleMatrix);
        for (GroupElement scaleAllPaths : getGroupElements()) {
            scaleAllPaths.scaleAllPaths(this.scaleMatrix);
        }
        for (PathElement transform : getPathElements()) {
            transform.transform(this.finalTransformMatrix);
        }
        for (ClipPathElement transform2 : getClipPathElements()) {
            transform2.transform(this.finalTransformMatrix);
        }
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

    public final void buildTransformMatrix() {
        Matrix matrix = this.originalTransformMatrix;
        matrix.reset();
        matrix.postScale(this.scaleX, this.scaleY, this.pivotX, this.pivotY);
        matrix.postRotate(this.rotation, this.pivotX, this.pivotY);
        matrix.postTranslate(this.translateX, this.translateY);
        GroupElement groupElement = this.parent;
        if (groupElement != null) {
            this.originalTransformMatrix.postConcat(groupElement.originalTransformMatrix);
        }
        for (GroupElement buildTransformMatrix : getGroupElements()) {
            buildTransformMatrix.buildTransformMatrix();
        }
        invalidateTransforms();
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

    public List<ClipPathElement> getClipPathElements() {
        return this.$$delegate_0.getClipPathElements();
    }

    public List<GroupElement> getGroupElements() {
        return this.$$delegate_0.getGroupElements();
    }

    public final String getName() {
        return this.name;
    }

    public final GroupElement getParent() {
        return this.parent;
    }

    public List<PathElement> getPathElements() {
        return this.$$delegate_0.getPathElements();
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getTranslateX() {
        return this.translateX;
    }

    public final float getTranslateY() {
        return this.translateY;
    }

    public final void scaleAllPaths(Matrix matrix) {
        this.scaleMatrix.set(matrix);
        invalidateTransforms();
    }

    public void scaleAllStrokeWidth(float f) {
        this.$$delegate_0.scaleAllStrokeWidth(f);
    }

    public final void setParent(GroupElement groupElement) {
        this.parent = groupElement;
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
        buildTransformMatrix();
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
        buildTransformMatrix();
    }

    public final void setRotation(float f) {
        this.rotation = f;
        buildTransformMatrix();
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
        buildTransformMatrix();
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
        buildTransformMatrix();
    }

    public final void setTranslateX(float f) {
        this.translateX = f;
        buildTransformMatrix();
    }

    public final void setTranslateY(float f) {
        this.translateY = f;
        buildTransformMatrix();
    }

    public String toString() {
        String str;
        String str2 = this.name;
        GroupElement groupElement = this.parent;
        if (groupElement != null) {
            str = GroupElement.class.getCanonicalName() + "(name=" + groupElement.name + ")";
        } else {
            str = null;
        }
        float f = this.pivotX;
        float f2 = this.pivotY;
        float f3 = this.rotation;
        float f4 = this.scaleX;
        float f5 = this.scaleY;
        float f6 = this.translateX;
        float f7 = this.translateY;
        Matrix matrix = this.scaleMatrix;
        Matrix matrix2 = this.originalTransformMatrix;
        Matrix matrix3 = this.finalTransformMatrix;
        List<GroupElement> groupElements = getGroupElements();
        List<PathElement> pathElements = getPathElements();
        List<ClipPathElement> clipPathElements = getClipPathElements();
        StringBuilder r = rae.r("GroupElement(name=", str2, ", parent=", str, ", pivotX=");
        r.append(f);
        r.append(", pivotY=");
        r.append(f2);
        r.append(", rotation=");
        r.append(f3);
        r.append(", scaleX=");
        r.append(f4);
        r.append(", scaleY=");
        r.append(f5);
        r.append(", translateX=");
        r.append(f6);
        r.append(", translateY=");
        r.append(f7);
        r.append(", scaleMatrix=");
        r.append(matrix);
        r.append(", originalTransformMatrix=");
        r.append(matrix2);
        r.append(", finalTransformMatrix=");
        r.append(matrix3);
        r.append(", groupElements=");
        r.append(groupElements);
        r.append(", pathElements=");
        r.append(pathElements);
        r.append(", clipPathElements=");
        return tr1.l(r, clipPathElements, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GroupElement(java.lang.String r14, float r15, float r16, float r17, float r18, float r19, float r20, float r21, one.me.sdk.richvector.internal.element.GroupElement r22, one.me.sdk.richvector.internal.element.ElementHolder r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r11 = r1
            goto L_0x000b
        L_0x0009:
            r11 = r22
        L_0x000b:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0016
            one.me.sdk.richvector.internal.element.ElementHolderImpl r0 = new one.me.sdk.richvector.internal.element.ElementHolderImpl
            r0.<init>()
            r12 = r0
            goto L_0x0018
        L_0x0016:
            r12 = r23
        L_0x0018:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.richvector.internal.element.GroupElement.<init>(java.lang.String, float, float, float, float, float, float, float, one.me.sdk.richvector.internal.element.GroupElement, one.me.sdk.richvector.internal.element.ElementHolder, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GroupElement(GroupElement groupElement, GroupElement groupElement2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(groupElement, (i & 2) != 0 ? null : groupElement2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GroupElement(one.me.sdk.richvector.internal.element.GroupElement r12, one.me.sdk.richvector.internal.element.GroupElement r13) {
        /*
            r11 = this;
            java.lang.String r1 = r12.name
            float r2 = r12.pivotX
            float r3 = r12.pivotY
            float r4 = r12.rotation
            float r5 = r12.scaleX
            float r6 = r12.scaleY
            float r7 = r12.translateX
            float r8 = r12.translateY
            if (r13 != 0) goto L_0x0020
            one.me.sdk.richvector.internal.element.GroupElement r13 = r12.parent
            r0 = 0
            if (r13 == 0) goto L_0x001e
            one.me.sdk.richvector.internal.element.GroupElement r9 = new one.me.sdk.richvector.internal.element.GroupElement
            r10 = 2
            r9.<init>(r13, r0, r10, r0)
            goto L_0x0021
        L_0x001e:
            r9 = r0
            goto L_0x0021
        L_0x0020:
            r9 = r13
        L_0x0021:
            one.me.sdk.richvector.internal.element.ElementHolderImpl r10 = new one.me.sdk.richvector.internal.element.ElementHolderImpl
            r10.<init>()
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            android.graphics.Matrix r13 = r11.scaleMatrix
            android.graphics.Matrix r0 = r12.scaleMatrix
            r13.set(r0)
            android.graphics.Matrix r13 = r11.originalTransformMatrix
            android.graphics.Matrix r0 = r12.originalTransformMatrix
            r13.set(r0)
            android.graphics.Matrix r13 = r11.finalTransformMatrix
            android.graphics.Matrix r0 = r12.finalTransformMatrix
            r13.set(r0)
            java.util.List r13 = r12.getGroupElements()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
        L_0x0049:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r13.next()
            one.me.sdk.richvector.internal.element.GroupElement r0 = (one.me.sdk.richvector.internal.element.GroupElement) r0
            java.util.List r1 = r11.getGroupElements()
            java.util.List r1 = kotlin.jvm.internal.TypeIntrinsics.asMutableList(r1)
            one.me.sdk.richvector.internal.element.GroupElement r2 = new one.me.sdk.richvector.internal.element.GroupElement
            r2.<init>(r0, r11)
            r1.add(r2)
            goto L_0x0049
        L_0x0066:
            java.util.List r13 = r12.getPathElements()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
        L_0x0070:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r13.next()
            one.me.sdk.richvector.internal.element.PathElement r0 = (one.me.sdk.richvector.internal.element.PathElement) r0
            java.util.List r1 = r11.getPathElements()
            java.util.List r1 = kotlin.jvm.internal.TypeIntrinsics.asMutableList(r1)
            one.me.sdk.richvector.internal.element.PathElement r2 = new one.me.sdk.richvector.internal.element.PathElement
            r2.<init>(r0)
            r1.add(r2)
            goto L_0x0070
        L_0x008d:
            java.util.List r12 = r12.getClipPathElements()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x0097:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00b4
            java.lang.Object r13 = r12.next()
            one.me.sdk.richvector.internal.element.ClipPathElement r13 = (one.me.sdk.richvector.internal.element.ClipPathElement) r13
            java.util.List r0 = r11.getClipPathElements()
            java.util.List r0 = kotlin.jvm.internal.TypeIntrinsics.asMutableList(r0)
            one.me.sdk.richvector.internal.element.ClipPathElement r1 = new one.me.sdk.richvector.internal.element.ClipPathElement
            r1.<init>(r13)
            r0.add(r1)
            goto L_0x0097
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.richvector.internal.element.GroupElement.<init>(one.me.sdk.richvector.internal.element.GroupElement, one.me.sdk.richvector.internal.element.GroupElement):void");
    }
}
