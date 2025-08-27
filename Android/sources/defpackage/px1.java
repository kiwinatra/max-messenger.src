package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: px1  reason: default package */
public final class px1 extends ty {
    public final /* synthetic */ int c;
    public final /* synthetic */ CarouselLayoutManager o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public px1(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 4);
        this.c = i;
        switch (i) {
            case 1:
                this.o = carouselLayoutManager;
                super(0, 4);
                return;
            default:
                this.o = carouselLayoutManager;
                return;
        }
    }

    public final int i() {
        switch (this.c) {
            case 0:
                return this.o.o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.o;
                return carouselLayoutManager.o - carouselLayoutManager.I();
        }
    }

    public final int j() {
        switch (this.c) {
            case 0:
                return this.o.J();
            default:
                return 0;
        }
    }

    public final int l() {
        switch (this.c) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.o;
                return carouselLayoutManager.n - carouselLayoutManager.K();
            default:
                return this.o.n;
        }
    }

    public final int m() {
        switch (this.c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.o;
                if (carouselLayoutManager.O0()) {
                    return carouselLayoutManager.n;
                }
                return 0;
        }
    }

    public final int n() {
        switch (this.c) {
            case 0:
                return 0;
            default:
                return this.o.L();
        }
    }
}
