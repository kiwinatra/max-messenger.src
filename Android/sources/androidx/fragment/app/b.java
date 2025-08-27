package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class b extends bc3 implements p8 {
    public final u6h a = new u6h(17, new oc6(this));
    public final lv7 b = new lv7(this);
    public boolean c;
    public boolean o;
    public boolean v = true;

    public b() {
        getSavedStateRegistry().c("android:support:lifecycle", new pb3(1, this));
        addOnConfigurationChangedListener(new nc6(this, 0));
        addOnNewIntentListener(new nc6(this, 1));
        addOnContextAvailableListener(new qb3(this, 1));
    }

    public static boolean w(c cVar) {
        boolean z = false;
        for (a aVar : cVar.c.f()) {
            if (aVar != null) {
                oc6 oc6 = aVar.E0;
                if ((oc6 == null ? null : oc6.z0) != null) {
                    z |= w(aVar.N1());
                }
                od6 od6 = aVar.c1;
                iu7 iu7 = iu7.o;
                iu7 iu72 = iu7.c;
                if (od6 != null) {
                    od6.b();
                    if (od6.v.d.a(iu7)) {
                        lv7 lv7 = aVar.c1.v;
                        lv7.d("setCurrentState");
                        lv7.f(iu72);
                        z = true;
                    }
                }
                if (aVar.b1.d.a(iu7)) {
                    lv7 lv72 = aVar.b1;
                    lv72.d("setCurrentState");
                    lv72.f(iu72);
                    z = true;
                }
            }
        }
        return z;
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.c);
            printWriter.print(" mResumed=");
            printWriter.print(this.o);
            printWriter.print(" mStopped=");
            printWriter.print(this.v);
            if (getApplication() != null) {
                new androidx.loader.app.b(this, getViewModelStore()).a(str2, printWriter);
            }
            ((oc6) this.a.b).y0.w(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.a.j();
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.e(hu7.ON_CREATE);
        ed6 ed6 = ((oc6) this.a.b).y0;
        ed6.I = false;
        ed6.J = false;
        ed6.P.h = false;
        ed6.u(1);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((oc6) this.a.b).y0.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        ((oc6) this.a.b).y0.l();
        this.b.e(hu7.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((oc6) this.a.b).y0.j();
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.o = false;
        ((oc6) this.a.b).y0.u(5);
        this.b.e(hu7.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        z();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.a.j();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        u6h u6h = this.a;
        u6h.j();
        super.onResume();
        this.o = true;
        ((oc6) u6h.b).y0.A(true);
    }

    public void onStart() {
        u6h u6h = this.a;
        u6h.j();
        super.onStart();
        this.v = false;
        boolean z = this.c;
        oc6 oc6 = (oc6) u6h.b;
        if (!z) {
            this.c = true;
            ed6 ed6 = oc6.y0;
            ed6.I = false;
            ed6.J = false;
            ed6.P.h = false;
            ed6.u(4);
        }
        oc6.y0.A(true);
        this.b.e(hu7.ON_START);
        ed6 ed62 = oc6.y0;
        ed62.I = false;
        ed62.J = false;
        ed62.P.h = false;
        ed62.u(5);
    }

    public final void onStateNotSaved() {
        this.a.j();
    }

    public void onStop() {
        super.onStop();
        this.v = true;
        do {
        } while (w(v()));
        ed6 ed6 = ((oc6) this.a.b).y0;
        ed6.J = true;
        ed6.P.h = true;
        ed6.u(4);
        this.b.e(hu7.ON_STOP);
    }

    public final ed6 v() {
        return ((oc6) this.a.b).y0;
    }

    public void z() {
        this.b.e(hu7.ON_RESUME);
        ed6 ed6 = ((oc6) this.a.b).y0;
        ed6.I = false;
        ed6.J = false;
        ed6.P.h = false;
        ed6.u(7);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((oc6) this.a.b).y0.f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
