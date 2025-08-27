package defpackage;

import ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl;

/* renamed from: os0  reason: default package */
public final /* synthetic */ class os0 implements Runnable {
    public final /* synthetic */ BrushWidthViewImpl a;
    public final /* synthetic */ float b;

    public /* synthetic */ os0(BrushWidthViewImpl brushWidthViewImpl, float f) {
        this.a = brushWidthViewImpl;
        this.b = f;
    }

    public final void run() {
        BrushWidthViewImpl brushWidthViewImpl = this.a;
        float f = brushWidthViewImpl.y0;
        float f2 = (this.b - f) / (brushWidthViewImpl.z0 - f);
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float f3 = brushWidthViewImpl.w0;
        brushWidthViewImpl.z = f3 - ((f3 - brushWidthViewImpl.v0) * f2);
        brushWidthViewImpl.invalidate();
    }
}
