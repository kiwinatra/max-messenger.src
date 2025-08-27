package com.facebook.fresco.ui.common;

import com.facebook.fresco.ui.common.ControllerListener2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0005\b\u0016\u0018\u0000 +*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\t0\u0007H\b¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0004J+\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00018\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J+\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b&\u0010'R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/facebook/fresco/ui/common/ForwardingControllerListener2;", "I", "Lcom/facebook/fresco/ui/common/a;", "<init>", "()V", "", "methodName", "Lkotlin/Function1;", "Lcom/facebook/fresco/ui/common/ControllerListener2;", "", "block", "forEachListener", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "listener", "addListener", "(Lcom/facebook/fresco/ui/common/ControllerListener2;)V", "removeListener", "removeAllListeners", "id", "", "callerContext", "Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;", "extras", "onSubmit", "(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", "imageInfo", "extraData", "onFinalImageSet", "", "throwable", "onFailure", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", "onRelease", "(Ljava/lang/String;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", "onIntermediateImageSet", "(Ljava/lang/String;Ljava/lang/Object;)V", "onIntermediateImageFailed", "(Ljava/lang/String;)V", "onEmptyEvent", "(Ljava/lang/Object;)V", "", "listeners", "Ljava/util/List;", "Companion", "pb6", "ui-common_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nForwardingControllerListener2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingControllerListener2.kt\ncom/facebook/fresco/ui/common/ForwardingControllerListener2\n*L\n1#1,84:1\n35#1,16:85\n35#1,16:101\n35#1,16:117\n35#1,16:133\n35#1,16:149\n35#1,16:165\n35#1,16:181\n*S KotlinDebug\n*F\n+ 1 ForwardingControllerListener2.kt\ncom/facebook/fresco/ui/common/ForwardingControllerListener2\n*L\n53#1:85,16\n57#1:101,16\n61#1:117,16\n65#1:133,16\n69#1:149,16\n73#1:165,16\n77#1:181,16\n*E\n"})
public class ForwardingControllerListener2<I> extends a {
    public static final pb6 Companion = new Object();
    private static final String TAG = "FwdControllerListener2";
    private final List<ControllerListener2<I>> listeners = new ArrayList(2);

    private final void forEachListener(String str, Function1<? super ControllerListener2<I>, Unit> function1) {
        int size = this.listeners.size();
        int i = 0;
        while (i < size) {
            try {
                try {
                    function1.invoke(this.listeners.get(i));
                    Unit unit = Unit.INSTANCE;
                } catch (Exception unused) {
                    new StringBuilder("InternalListener exception in ").append(str);
                }
                i++;
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    public final synchronized void addListener(ControllerListener2<I> controllerListener2) {
        this.listeners.add(controllerListener2);
    }

    public void onEmptyEvent(Object obj) {
        int size = this.listeners.size();
        int i = 0;
        while (i < size) {
            try {
                try {
                    this.listeners.get(i).onEmptyEvent(obj);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception unused) {
                }
                i++;
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    public void onFailure(String str, Throwable th, ControllerListener2.Extras extras) {
        int size = this.listeners.size();
        int i = 0;
        while (i < size) {
            try {
                try {
                    this.listeners.get(i).onFailure(str, th, extras);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception unused) {
                }
                i++;
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    public void onFinalImageSet(String str, I i, ControllerListener2.Extras extras) {
        int size = this.listeners.size();
        int i2 = 0;
        while (i2 < size) {
            try {
                try {
                    this.listeners.get(i2).onFinalImageSet(str, i, extras);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception unused) {
                }
                i2++;
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    public void onIntermediateImageFailed(String str) {
        int size = this.listeners.size();
        int i = 0;
        while (i < size) {
            try {
                try {
                    this.listeners.get(i).onIntermediateImageFailed(str);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception unused) {
                }
                i++;
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    public void onIntermediateImageSet(String str, I i) {
        int size = this.listeners.size();
        int i2 = 0;
        while (i2 < size) {
            try {
                try {
                    this.listeners.get(i2).onIntermediateImageSet(str, i);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception unused) {
                }
                i2++;
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    public void onRelease(String str, ControllerListener2.Extras extras) {
        int size = this.listeners.size();
        int i = 0;
        while (i < size) {
            try {
                try {
                    this.listeners.get(i).onRelease(str, extras);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception unused) {
                }
                i++;
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    public void onSubmit(String str, Object obj, ControllerListener2.Extras extras) {
        int size = this.listeners.size();
        int i = 0;
        while (i < size) {
            try {
                try {
                    this.listeners.get(i).onSubmit(str, obj, extras);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception unused) {
                }
                i++;
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    public final synchronized void removeAllListeners() {
        this.listeners.clear();
    }

    public final synchronized void removeListener(ControllerListener2<I> controllerListener2) {
        this.listeners.remove(controllerListener2);
    }
}
