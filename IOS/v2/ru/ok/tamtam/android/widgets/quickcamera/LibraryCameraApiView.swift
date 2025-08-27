package ru.ok.tamtam.android.widgets.quickcamera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.concurrent.ExecutorService;

public class LibraryCameraApiView extends FrameLayout implements at1 {
    public LibraryCameraApiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        View view = new View(context);
        view.setKeepScreenOn(true);
        addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(File file) {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d(ExecutorService executorService) {
    }

    public final void e() {
    }

    public final void f(boolean z) {
    }

    public final boolean g() {
        return true;
    }

    public View getRootView() {
        return this;
    }

    public final boolean h() {
        return false;
    }

    public final void i() {
    }

    public final boolean j() {
        return false;
    }

    public final void k() {
    }

    public final void l() {
    }

    public final boolean m() {
        return false;
    }

    public final boolean n() {
        return false;
    }

    public final boolean o() {
        return false;
    }

    public void setCameraListener(uu1 uu1) {
    }

    public void setFlash(String str) {
    }

    public void setPictureSize(nbc nbc) {
    }

    public void setVideoQuality(u7g u7g) {
    }
}
