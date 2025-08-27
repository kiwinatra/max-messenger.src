package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import java.util.WeakHashMap;
import kotlin.Deprecated;

/* renamed from: ac3  reason: default package */
public abstract class ac3 extends Activity implements jv7, cq7 {
    private final qae extraDataMap = new qae();
    private final lv7 lifecycleRegistry = new lv7(this);

    public void V() {
        finish();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        WeakHashMap weakHashMap = gag.a;
        return superDispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        WeakHashMap weakHashMap = gag.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Deprecated(message = "Use {@link View#getTag(int)} with the window's decor view.")
    public <T extends ub3> T getExtraData(Class<T> cls) {
        rae.w(this.extraDataMap.get(cls));
        return null;
    }

    public ju7 getLifecycle() {
        return this.lifecycleRegistry;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = o2d.a;
        ryg.D(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        lv7 lv7 = this.lifecycleRegistry;
        iu7 iu7 = iu7.c;
        lv7.d("setCurrentState");
        lv7.f(iu7);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    public void putExtraData(ub3 ub3) {
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r3.equals("--contentcapture") == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r3.equals("--list-dumpables") == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r3.equals("--dump-dumpable") == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (android.os.Build.VERSION.SDK_INT < 31) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r3.equals("--autofill") == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldDumpInternalState(java.lang.String[] r3) {
        /*
            r2 = this;
            r2 = 1
            r0 = 0
            if (r3 == 0) goto L_0x004f
            int r1 = r3.length
            if (r1 != 0) goto L_0x0008
            goto L_0x004f
        L_0x0008:
            r3 = r3[r0]
            int r1 = r3.hashCode()
            switch(r1) {
                case -645125871: goto L_0x003f;
                case 100470631: goto L_0x002f;
                case 472614934: goto L_0x0026;
                case 1159329357: goto L_0x001d;
                case 1455016274: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x004f
        L_0x0012:
            java.lang.String r1 = "--autofill"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x001b
            goto L_0x004f
        L_0x001b:
            r0 = r2
            goto L_0x004f
        L_0x001d:
            java.lang.String r1 = "--contentcapture"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x001b
            goto L_0x004f
        L_0x0026:
            java.lang.String r1 = "--list-dumpables"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0038
            goto L_0x004f
        L_0x002f:
            java.lang.String r1 = "--dump-dumpable"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0038
            goto L_0x004f
        L_0x0038:
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r3 < r1) goto L_0x004f
            goto L_0x001b
        L_0x003f:
            java.lang.String r1 = "--translation"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0048
            goto L_0x004f
        L_0x0048:
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r3 < r1) goto L_0x004f
            goto L_0x001b
        L_0x004f:
            r2 = r2 ^ r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac3.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
