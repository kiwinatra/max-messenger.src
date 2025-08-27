package one.me.sdk.richvector.internal.element;

import android.graphics.Canvas;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH&J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH&J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Lone/me/sdk/richvector/internal/element/ElementHolder;", "", "groupElements", "", "Lone/me/sdk/richvector/internal/element/GroupElement;", "getGroupElements", "()Ljava/util/List;", "pathElements", "Lone/me/sdk/richvector/internal/element/PathElement;", "getPathElements", "clipPathElements", "Lone/me/sdk/richvector/internal/element/ClipPathElement;", "getClipPathElements", "addGroup", "", "element", "addPath", "addClipPath", "scaleAllStrokeWidth", "ratio", "", "draw", "canvas", "Landroid/graphics/Canvas;", "findPath", "name", "", "findGroup", "findClipPath", "rich-vector_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Keep
public interface ElementHolder {
    void addClipPath(ClipPathElement clipPathElement);

    void addGroup(GroupElement groupElement);

    void addPath(PathElement pathElement);

    void draw(Canvas canvas);

    ClipPathElement findClipPath(String str);

    GroupElement findGroup(String str);

    PathElement findPath(String str);

    List<ClipPathElement> getClipPathElements();

    List<GroupElement> getGroupElements();

    List<PathElement> getPathElements();

    void scaleAllStrokeWidth(float f);
}
