package ru.ok.messages.gallery.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import ru.ok.messages.views.widgets.quickcamera.QuickCameraView;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/messages/gallery/view/CameraContainerView;", "Landroid/widget/FrameLayout;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class CameraContainerView extends FrameLayout {
    @JvmOverloads
    public CameraContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof QuickCameraView) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalArgumentException("child must be QuickCameraView instance".toString());
    }
}
