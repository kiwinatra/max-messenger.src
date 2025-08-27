package one.me.rlottie;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.apache.http.HttpStatus;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a,\u0010\b\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a\"\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a\"\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u0012\u0010\u0013\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0001\u001a\u0012\u0010\u0016\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0001\u001a\n\u0010\u0018\u001a\u00020\u0014*\u00020\u0002¨\u0006\u0019"}, d2 = {"setAssetsRes", "", "Lone/me/rlottie/RLottieImageView;", "assetsResName", "", "width", "", "height", "setRawRes", "rawResId", "cacheName", "setFile", "file", "Ljava/io/File;", "setUrl", "url", "setLottieDrawable", "lottieDrawable", "Lone/me/rlottie/RLottieDrawable;", "restartDownloadFromUrl", "", "networkFetchEnabled", "setDebug", "debug", "release", "rlottie_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName(name = "RLottieImageViewUtils")
public final class RLottieImageViewUtils {
    public static final void release(RLottieImageView rLottieImageView) {
        rLottieImageView.stopAnimation();
        RLottieDrawable rLottieDrawable = rLottieImageView.b;
        if (rLottieDrawable != null) {
            rLottieDrawable.recycle(a.b());
        }
        rLottieImageView.clearAnimationDrawable();
    }

    public static final void restartDownloadFromUrl(RLottieImageView rLottieImageView, boolean z) {
        RLottieDrawable rLottieDrawable = rLottieImageView.b;
        if (rLottieDrawable != null) {
            RLottieDrawableUtils.restartDownloadFromUrl(rLottieDrawable, z);
        }
    }

    public static final boolean setAssetsRes(RLottieImageView rLottieImageView, String str, int i, int i2) {
        return setLottieDrawable(rLottieImageView, RLottieFactory.createByAsset$default(rLottieImageView.getContext(), str, (String) null, i, i2, false, false, false, false, false, 964, (Object) null));
    }

    public static final void setDebug(RLottieImageView rLottieImageView, boolean z) {
    }

    public static final boolean setFile(RLottieImageView rLottieImageView, File file, int i, int i2) {
        return setLottieDrawable(rLottieImageView, RLottieFactory.createByFile$default(file, false, i, i2, false, false, false, false, 242, (Object) null));
    }

    public static final boolean setLottieDrawable(RLottieImageView rLottieImageView, RLottieDrawable rLottieDrawable) {
        RLottieDrawable rLottieDrawable2 = rLottieImageView.b;
        if (rLottieDrawable2 != null && rLottieDrawable2 == rLottieDrawable) {
            return false;
        }
        rLottieImageView.setImageDrawable(rLottieDrawable);
        return true;
    }

    public static final boolean setRawRes(RLottieImageView rLottieImageView, int i, String str, int i2, int i3) {
        return setLottieDrawable(rLottieImageView, RLottieFactory.createByRawRes$default(i, str, i2, i3, false, false, false, false, false, 496, (Object) null));
    }

    public static final boolean setUrl(RLottieImageView rLottieImageView, String str, int i, int i2) {
        return setLottieDrawable(rLottieImageView, RLottieFactory.createByUrl$default(str, i, i2, false, false, false, false, false, false, HttpStatus.SC_GATEWAY_TIMEOUT, (Object) null));
    }
}
