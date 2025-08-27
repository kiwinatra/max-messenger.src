package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ru.ok.messages.calls.views.CallGridView;

/* renamed from: i61  reason: default package */
public final class i61 extends RecyclerView {
    public ro4 T1;
    public int U1;
    public int V1;
    public GridLayoutManager W1;
    public boolean X1;
    public int Y1;
    public int Z1;
    public boolean a2;

    private Bundle getAdapterControllerRestoredState() {
        return null;
    }

    public final int H0(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i3 == 2 && this.a2) {
            i4 = (int) ((((float) i) / 2.0f) - ((float) i2));
            i5 = this.T1.b;
        } else if (i3 != 2 && (!this.a2 || i3 != 1)) {
            return 0;
        } else {
            i4 = (int) (((float) (i - i2)) / 2.0f);
            i5 = this.T1.b;
        }
        return i4 - i5;
    }

    public v51 getAdapterController() {
        return null;
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentItemsPaddingLeft() {
        return this.Z1;
    }

    public int getCurrentItemsPaddingTop() {
        return this.Y1;
    }

    public int getSpanCount() {
        return this.W1.F;
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        float ceil;
        ro4 ro4;
        float f;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = 0;
        int i5 = 1;
        this.a2 = size > size2;
        int count = getCount();
        if (this.a2 || !(count == 3 || count == 4)) {
            this.W1.n1(0);
        } else {
            this.W1.n1(1);
        }
        int i6 = this.W1.p;
        if (this.a2 || getCount() == 1) {
            this.W1.z1(1);
        } else {
            this.W1.z1(2);
        }
        int spanCount = getSpanCount();
        int count2 = getCount();
        boolean z = this.X1;
        if (z || count2 != 2 || size >= size2) {
            if (z) {
                i3 = 1;
            } else {
                int i7 = size / this.V1;
                if (i7 > 4) {
                    i7--;
                }
                if (i7 > count2 && count2 != 0) {
                    i7 = count2;
                }
                if (!this.a2 && i7 > 2) {
                    i7 = 2;
                }
                i3 = Math.max(1, i7);
            }
            int i8 = (size - (this.U1 * 2)) / i3;
            if (i8 > size2) {
                i8 = size2;
            }
            int i9 = this.X1;
            if (i9 == 0 && count2 <= 2 && this.a2) {
                i8 = (int) (((double) i8) * 0.7d);
            }
            if (count2 < i9) {
                i9 = count2;
            }
            if (!this.a2) {
                i5 = (int) Math.ceil((double) (((float) i9) / ((float) spanCount)));
            }
            int i10 = (int) ((((float) size2) / 2.0f) - (((float) (i5 * i8)) / 2.0f));
            if (i10 >= 0) {
                i4 = i10 - this.T1.b;
            }
            this.Y1 = i4;
            this.Z1 = H0(size, i8, count2);
            throw null;
        }
        int i11 = size - (this.U1 * 2);
        if (i11 > size2) {
            i11 = size2;
        }
        int i12 = (int) (((double) i11) * 0.82d);
        boolean z2 = false;
        do {
            if (z2) {
                i12 = (int) (((double) i12) * 0.9d);
            } else {
                z2 = true;
            }
            ceil = (float) ((this.a2 ? 1 : (int) Math.ceil((double) (((float) (count2 < 0 ? count2 : 0)) / ((float) 1)))) * i12);
            ro4 = this.T1;
            f = (float) size2;
        } while (((float) ro4.C) + ceil >= f);
        int i13 = (int) ((f / 2.0f) - (ceil / 2.0f));
        if (i13 >= 0) {
            i4 = i13 - ro4.b;
        }
        this.Y1 = i4;
        this.Z1 = H0(size, i12, count2);
        throw null;
    }

    public void setBottomListener(g61 g61) {
    }

    public void setCallParticipants(List<ye1> list) {
        int i = CallGridView.w0;
        z68.c("ru.ok.messages.calls.views.CallGridView", "setCallParticipants: %d", Integer.valueOf(list.size()));
        throw null;
    }

    public void setDebugMode(boolean z) {
        throw null;
    }

    public void setFocusedParticipant(long j) {
        boolean z = j != 0;
        this.X1 = z;
        if (z) {
            setPadding(0, 0, 0, 0);
        } else {
            int i = this.U1;
            setPadding(i, i, i, i);
        }
        throw null;
    }

    public void setListener(h61 h61) {
        throw null;
    }
}
