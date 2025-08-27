package defpackage;

import android.os.AsyncTask;

/* renamed from: sm7  reason: default package */
public final class sm7 extends AsyncTask {
    public final /* synthetic */ an7 a;

    public sm7(an7 an7) {
        this.a = an7;
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        while (true) {
            an7 an7 = this.a;
            vm7 dequeueWork = an7.dequeueWork();
            if (dequeueWork == null) {
                return null;
            }
            an7.onHandleWork(dequeueWork.getIntent());
            dequeueWork.e();
        }
    }

    public final void onCancelled(Object obj) {
        Void voidR = (Void) obj;
        this.a.processorFinished();
    }

    public final void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        this.a.processorFinished();
    }
}
