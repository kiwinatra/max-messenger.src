package com.yalantis.ucrop.callback;

import android.graphics.Bitmap;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\t2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/yalantis/ucrop/callback/BitmapLoadCallback;", "", "Landroid/graphics/Bitmap;", "bitmap", "Lta5;", "exifInfo", "", "imageInputPath", "imageOutputPath", "", "onBitmapLoaded", "(Landroid/graphics/Bitmap;Lta5;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "bitmapWorkerException", "onFailure", "(Ljava/lang/Exception;)V", "photo-crop_release"}, k = 1, mv = {2, 0, 0})
public interface BitmapLoadCallback {
    void onBitmapLoaded(Bitmap bitmap, ta5 ta5, String str, String str2);

    void onFailure(Exception exc);
}
