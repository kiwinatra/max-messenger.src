package one.me.sdk.richvector.internal.element;

import android.graphics.Canvas;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006!"}, d2 = {"Lone/me/sdk/richvector/internal/element/ElementHolderImpl;", "Lone/me/sdk/richvector/internal/element/ElementHolder;", "<init>", "()V", "prototype", "(Lone/me/sdk/richvector/internal/element/ElementHolder;)V", "groupElements", "", "Lone/me/sdk/richvector/internal/element/GroupElement;", "getGroupElements", "()Ljava/util/List;", "pathElements", "Lone/me/sdk/richvector/internal/element/PathElement;", "getPathElements", "clipPathElements", "Lone/me/sdk/richvector/internal/element/ClipPathElement;", "getClipPathElements", "addGroup", "", "element", "addPath", "addClipPath", "scaleAllStrokeWidth", "ratio", "", "draw", "canvas", "Landroid/graphics/Canvas;", "findPath", "name", "", "findGroup", "findClipPath", "rich-vector_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nElementHolderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElementHolderImpl.kt\none/me/sdk/richvector/internal/element/ElementHolderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1863#2,2:57\n1863#2,2:59\n1863#2,2:61\n1863#2,2:63\n1863#2,2:65\n1863#2,2:67\n1863#2,2:69\n1863#2,2:71\n1#3:73\n*S KotlinDebug\n*F\n+ 1 ElementHolderImpl.kt\none/me/sdk/richvector/internal/element/ElementHolderImpl\n*L\n14#1:57,2\n17#1:59,2\n20#1:61,2\n38#1:63,2\n39#1:65,2\n43#1:67,2\n44#1:69,2\n45#1:71,2\n*E\n"})
@Keep
public final class ElementHolderImpl implements ElementHolder {
    private final List<ClipPathElement> clipPathElements;
    private final List<GroupElement> groupElements;
    private final List<PathElement> pathElements;

    public ElementHolderImpl() {
        this.groupElements = new ArrayList();
        this.pathElements = new ArrayList();
        this.clipPathElements = new ArrayList();
    }

    public void addClipPath(ClipPathElement clipPathElement) {
        getClipPathElements().add(clipPathElement);
    }

    public void addGroup(GroupElement groupElement) {
        getGroupElements().add(groupElement);
    }

    public void addPath(PathElement pathElement) {
        getPathElements().add(pathElement);
    }

    public void draw(Canvas canvas) {
        for (ClipPathElement path : getClipPathElements()) {
            canvas.clipPath(path.getPath());
        }
        for (GroupElement draw : getGroupElements()) {
            draw.draw(canvas);
        }
        for (PathElement draw2 : getPathElements()) {
            draw2.draw(canvas);
        }
    }

    public ClipPathElement findClipPath(String str) {
        Object obj;
        Iterator it = getClipPathElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((ClipPathElement) obj).getName(), (Object) str)) {
                break;
            }
        }
        ClipPathElement clipPathElement = (ClipPathElement) obj;
        if (clipPathElement != null) {
            return clipPathElement;
        }
        for (GroupElement findClipPath : getGroupElements()) {
            ClipPathElement findClipPath2 = findClipPath.findClipPath(str);
            if (findClipPath2 != null) {
                return findClipPath2;
            }
        }
        return null;
    }

    public GroupElement findGroup(String str) {
        Object obj;
        Iterator it = getGroupElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((GroupElement) obj).getName(), (Object) str)) {
                break;
            }
        }
        GroupElement groupElement = (GroupElement) obj;
        if (groupElement != null) {
            return groupElement;
        }
        for (GroupElement findGroup : getGroupElements()) {
            GroupElement findGroup2 = findGroup.findGroup(str);
            if (findGroup2 != null) {
                return findGroup2;
            }
        }
        return null;
    }

    public PathElement findPath(String str) {
        Object obj;
        Iterator it = getPathElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((PathElement) obj).getName(), (Object) str)) {
                break;
            }
        }
        PathElement pathElement = (PathElement) obj;
        if (pathElement != null) {
            return pathElement;
        }
        for (GroupElement findPath : getGroupElements()) {
            PathElement findPath2 = findPath.findPath(str);
            if (findPath2 != null) {
                return findPath2;
            }
        }
        return null;
    }

    public List<ClipPathElement> getClipPathElements() {
        return this.clipPathElements;
    }

    public List<GroupElement> getGroupElements() {
        return this.groupElements;
    }

    public List<PathElement> getPathElements() {
        return this.pathElements;
    }

    public void scaleAllStrokeWidth(float f) {
        for (GroupElement scaleAllStrokeWidth : getGroupElements()) {
            scaleAllStrokeWidth.scaleAllStrokeWidth(f);
        }
        for (PathElement strokeRatio : getPathElements()) {
            strokeRatio.setStrokeRatio(f);
        }
    }

    public ElementHolderImpl(ElementHolder elementHolder) {
        this();
        for (GroupElement groupElement : elementHolder.getGroupElements()) {
            getGroupElements().add(new GroupElement(groupElement, (GroupElement) null, 2, (DefaultConstructorMarker) null));
        }
        for (PathElement pathElement : elementHolder.getPathElements()) {
            getPathElements().add(new PathElement(pathElement));
        }
        for (ClipPathElement clipPathElement : elementHolder.getClipPathElements()) {
            getClipPathElements().add(new ClipPathElement(clipPathElement));
        }
    }
}
