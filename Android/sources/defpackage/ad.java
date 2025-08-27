package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: ad  reason: default package */
public final class ad extends Handler {
    public final /* synthetic */ int a = 0;
    public WeakReference b;

    public /* synthetic */ ad() {
    }

    public final void handleMessage(Message message) {
        fw8 fw8;
        Message message2 = message;
        switch (this.a) {
            case 0:
                int i = message2.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message2.obj).onClick((DialogInterface) this.b.get(), message2.what);
                    return;
                } else if (i == 1) {
                    ((DialogInterface) message2.obj).dismiss();
                    return;
                } else {
                    return;
                }
            default:
                yzc yzc = (yzc) this.b.get();
                if (yzc != null) {
                    int i2 = message2.what;
                    int i3 = message2.arg1;
                    int i4 = message2.arg2;
                    Object obj = message2.obj;
                    Bundle peekData = message.peekData();
                    SparseArray sparseArray = yzc.h;
                    b0d b0d = null;
                    d0d d0d = yzc.i;
                    switch (i2) {
                        case 0:
                            if (i3 == yzc.g) {
                                yzc.g = 0;
                                if (d0d.w0 == yzc) {
                                    if (d0d.z0) {
                                        d0d.toString();
                                    }
                                    d0d.l();
                                }
                            }
                            if (((a0d) sparseArray.get(i3)) != null) {
                                sparseArray.remove(i3);
                                return;
                            }
                            return;
                        case 1:
                            return;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (yzc.f == 0 && i3 == yzc.g && i4 >= 1) {
                                    yzc.g = 0;
                                    yzc.f = i4;
                                    jw8 b2 = jw8.b(bundle);
                                    if (d0d.w0 == yzc) {
                                        if (d0d.z0) {
                                            d0d.toString();
                                            Objects.toString(b2);
                                        }
                                        d0d.g(b2);
                                    }
                                    if (d0d.w0 == yzc) {
                                        d0d.x0 = true;
                                        ArrayList arrayList = d0d.Y;
                                        int size = arrayList.size();
                                        for (int i5 = 0; i5 < size; i5++) {
                                            ((zzc) arrayList.get(i5)).b(d0d.w0);
                                        }
                                        pv8 pv8 = d0d.v;
                                        if (pv8 != null) {
                                            yzc yzc2 = d0d.w0;
                                            int i6 = yzc2.d;
                                            yzc2.d = i6 + 1;
                                            yzc2.b(10, i6, 0, pv8.a, (Bundle) null);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                a0d a0d = (a0d) sparseArray.get(i3);
                                if (a0d != null) {
                                    sparseArray.remove(i3);
                                    a0d.a(bundle2);
                                    return;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                if (peekData != null) {
                                    peekData.getString("error");
                                }
                                Bundle bundle3 = (Bundle) obj;
                                if (((a0d) sparseArray.get(i3)) != null) {
                                    sparseArray.remove(i3);
                                    Objects.toString(bundle3);
                                    return;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (yzc.f != 0) {
                                    jw8 b3 = jw8.b(bundle4);
                                    if (d0d.w0 == yzc) {
                                        if (d0d.z0) {
                                            d0d.toString();
                                            Objects.toString(b3);
                                        }
                                        d0d.g(b3);
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                a0d a0d2 = (a0d) sparseArray.get(i3);
                                if (bundle5 != null && bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i3);
                                    a0d2.a(bundle5);
                                    break;
                                } else {
                                    a0d2.getClass();
                                    Objects.toString(bundle5);
                                    break;
                                }
                            }
                            break;
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (yzc.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    nv8 nv8 = bundle7 != null ? new nv8(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = parcelableArrayList.iterator();
                                    while (it.hasNext()) {
                                        Bundle bundle8 = (Bundle) it.next();
                                        if (bundle8 == null) {
                                            fw8 = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            fw8 = new fw8(bundle9 != null ? new nv8(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(fw8);
                                    }
                                    if (d0d.w0 == yzc) {
                                        if (d0d.z0) {
                                            d0d.toString();
                                            Objects.toString(arrayList2);
                                        }
                                        Iterator it2 = d0d.Y.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                zzc zzc = (zzc) it2.next();
                                                if (zzc.a() == i4) {
                                                    b0d = zzc;
                                                }
                                            }
                                        }
                                        if (b0d instanceof b0d) {
                                            b0d.l(nv8, arrayList2);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 8:
                            if (d0d.w0 == yzc) {
                                ArrayList arrayList3 = d0d.Y;
                                Iterator it3 = arrayList3.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zzc zzc2 = (zzc) it3.next();
                                        if (zzc2.a() == i4) {
                                            b0d = zzc2;
                                        }
                                    }
                                }
                                y3a y3a = d0d.y0;
                                if (y3a != null && (b0d instanceof hw8)) {
                                    hw8 hw8 = (hw8) b0d;
                                    ow8 ow8 = (ow8) ((e0d) ((cy3) y3a.b).c);
                                    if (ow8.s == hw8) {
                                        ow8.h(ow8.c(), 2);
                                    }
                                }
                                arrayList3.remove(b0d);
                                b0d.c();
                                d0d.m();
                                break;
                            }
                            break;
                    }
                    if (d0d.z0) {
                        message.toString();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ad(yzc yzc) {
        this.b = new WeakReference(yzc);
    }
}
