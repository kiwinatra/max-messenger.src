package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;

/* renamed from: bv8  reason: default package */
public final class bv8 extends AsyncTask {
    public final int a;
    public final Context b;
    public final /* synthetic */ cv8 c;

    public bv8(cv8 cv8, int i, Context context) {
        this.c = cv8;
        this.a = i;
        this.b = context;
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        SparseArray sparseArray = cv8.D0;
        int i = this.a;
        if (((Drawable.ConstantState) sparseArray.get(i)) == null) {
            return iq.D(this.b, i);
        }
        return null;
    }

    public final void onCancelled(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            cv8.D0.put(this.a, drawable.getConstantState());
        }
        this.c.x = null;
    }

    public final void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        int i = this.a;
        cv8 cv8 = this.c;
        if (drawable != null) {
            cv8.D0.put(i, drawable.getConstantState());
            cv8.x = null;
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) cv8.D0.get(i);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            cv8.x = null;
        }
        cv8.setRemoteIndicatorDrawableInternal(drawable);
    }
}
