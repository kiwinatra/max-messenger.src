package one.me.sdk.richvector;

import android.graphics.Path;
import androidx.annotation.Keep;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u00020\u00038gX¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038gX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00038gX¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lone/me/sdk/richvector/VectorPath;", "Lone/me/sdk/richvector/AnimationTarget;", "fillColor", "", "getFillColor", "()I", "setFillColor", "(I)V", "strokeColor", "getStrokeColor", "setStrokeColor", "strokeWidth", "", "getStrokeWidth", "()F", "setStrokeWidth", "(F)V", "strokeAlpha", "getStrokeAlpha", "setStrokeAlpha", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "rich-vector_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Keep
public interface VectorPath extends AnimationTarget {
    int getFillColor();

    Path getPath();

    int getStrokeAlpha();

    int getStrokeColor();

    float getStrokeWidth();

    void setFillColor(int i);

    void setStrokeAlpha(int i);

    void setStrokeColor(int i);

    void setStrokeWidth(float f);
}
