package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.c;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: we  reason: default package */
public final class we extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntentSender b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Intent o;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Bundle y;
    public final /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we(Object obj, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle, int i5) {
        super(0);
        this.a = i5;
        this.z = obj;
        this.b = intentSender;
        this.c = i;
        this.o = intent;
        this.v = i2;
        this.w = i3;
        this.x = i4;
        this.y = bundle;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = (AndroidXLifecycleHandlerImpl) this.z;
                if (androidXLifecycleHandlerImpl.E0 != null) {
                    boolean isLoggable = Log.isLoggable("FragmentManager", 2);
                    IntentSender intentSender = this.b;
                    Intent intent = this.o;
                    Bundle bundle = this.y;
                    if (isLoggable) {
                        androidXLifecycleHandlerImpl.toString();
                        Objects.toString(intentSender);
                        Objects.toString(intent);
                        Objects.toString(bundle);
                    }
                    c Q1 = androidXLifecycleHandlerImpl.Q1();
                    d9 d9Var = Q1.E;
                    int i = this.c;
                    int i2 = this.v;
                    int i3 = this.w;
                    if (d9Var != null) {
                        if (bundle != null) {
                            if (intent == null) {
                                intent = new Intent();
                                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                            }
                            if (Log.isLoggable("FragmentManager", 2)) {
                                bundle.toString();
                                intent.toString();
                                Objects.toString(androidXLifecycleHandlerImpl);
                            }
                            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                        }
                        ui7 ui7 = new ui7(intentSender, intent, i2, i3);
                        Q1.G.addLast(new zc6(androidXLifecycleHandlerImpl.w, i));
                        if (Log.isLoggable("FragmentManager", 2)) {
                            androidXLifecycleHandlerImpl.toString();
                        }
                        Q1.E.a(ui7);
                    } else {
                        oc6 oc6 = Q1.w;
                        if (i == -1) {
                            Activity activity = oc6.v0;
                            if (activity != null) {
                                activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, this.x, bundle);
                            } else {
                                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
                            }
                        } else {
                            oc6.getClass();
                            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("Fragment " + androidXLifecycleHandlerImpl + " not attached to Activity");
            default:
                ((bob) this.z).startIntentSenderForResult(this.b, this.c, this.o, this.v, this.w, this.x, this.y);
                return Unit.INSTANCE;
        }
    }
}
