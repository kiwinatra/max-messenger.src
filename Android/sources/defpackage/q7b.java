package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;

/* renamed from: q7b  reason: default package */
public abstract class q7b {
    public final DataSetObservable a = new DataSetObservable();
    public DataSetObserver b;

    public abstract void a(ViewGroup viewGroup, int i, Object obj);

    public abstract void b();

    public abstract int c();

    public int d(Object obj) {
        return -1;
    }

    public CharSequence e(int i) {
        return null;
    }

    public abstract a f(ViewGroup viewGroup, int i);

    public abstract boolean g(View view, Object obj);

    public final void h() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.a.notifyChanged();
    }

    public abstract void i(Parcelable parcelable, ClassLoader classLoader);

    public abstract Parcelable j();

    public abstract void k(Object obj);

    public abstract void l(ViewGroup viewGroup);
}
