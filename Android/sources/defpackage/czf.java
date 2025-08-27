package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.io.CloseableKt;

/* renamed from: czf  reason: default package */
public final class czf implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ czf(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Object, l4g] */
    /* JADX WARNING: type inference failed for: r5v10, types: [m4g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v25, types: [qae, ts] */
    /* JADX WARNING: type inference failed for: r10v2, types: [qae, ts] */
    public final Object call() {
        Cursor o;
        Throwable th;
        switch (this.a) {
            case 0:
                dzf dzf = (dzf) this.c;
                t5d t5d = dzf.e;
                i6d i6d = dzf.a;
                gf6 E = t5d.E();
                String str = (String) this.b;
                if (str == null) {
                    E.X(1);
                } else {
                    E.h(1, str);
                }
                try {
                    i6d.c();
                    E.n();
                    i6d.r();
                    i6d.l();
                    t5d.S(E);
                    return null;
                } catch (Throwable th2) {
                    t5d.S(E);
                    throw th2;
                }
            case 1:
                o4g o4g = (o4g) this.c;
                i6d i6d2 = o4g.a;
                i6d2.c();
                try {
                    o4g.b.c0((m4g) this.b);
                    i6d2.r();
                    i6d2.l();
                    return null;
                } catch (Throwable th3) {
                    i6d2.l();
                    throw th3;
                }
            case 2:
                Object obj = null;
                Cursor o2 = ((o4g) this.c).a.o((d7d) this.b, (CancellationSignal) null);
                try {
                    int u = kne.u(o2, "finished");
                    int u2 = kne.u(o2, "prepared_path");
                    int u3 = kne.u(o2, "result_path");
                    int u4 = kne.u(o2, "source_uri");
                    int u5 = kne.u(o2, "quality");
                    int u6 = kne.u(o2, "start_trim_position");
                    int u7 = kne.u(o2, "end_trim_position");
                    int u8 = kne.u(o2, "mute");
                    if (o2.moveToFirst()) {
                        ? obj2 = new Object();
                        if (o2.isNull(u4)) {
                            obj2.a = null;
                        } else {
                            obj2.a = o2.getString(u4);
                        }
                        obj2.b = qac.values()[(o2.isNull(u5) ? null : Integer.valueOf(o2.getInt(u5))).intValue()];
                        obj2.c = o2.getFloat(u6);
                        obj2.d = o2.getFloat(u7);
                        boolean z = false;
                        obj2.e = o2.getInt(u8) != 0;
                        ? obj3 = new Object();
                        if (o2.getInt(u) != 0) {
                            z = true;
                        }
                        obj3.b = z;
                        if (o2.isNull(u2)) {
                            obj3.c = null;
                        } else {
                            obj3.c = o2.getString(u2);
                        }
                        if (o2.isNull(u3)) {
                            obj3.d = null;
                        } else {
                            obj3.d = o2.getString(u3);
                        }
                        obj3.a = obj2;
                        obj = obj3;
                    }
                    o2.close();
                    return obj;
                } catch (Throwable th4) {
                    o2.close();
                    throw th4;
                }
            default:
                ypg ypg = (ypg) this.c;
                i6d i6d3 = (i6d) ypg.a;
                i6d3.c();
                try {
                    o = i6d3.o((d7d) this.b, (CancellationSignal) null);
                    if (o instanceof AbstractWindowedCursor) {
                        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) o;
                        int count = abstractWindowedCursor.getCount();
                        if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                            try {
                                MatrixCursor matrixCursor = new MatrixCursor(o.getColumnNames(), o.getCount());
                                while (o.moveToNext()) {
                                    Object[] objArr = new Object[o.getColumnCount()];
                                    int columnCount = o.getColumnCount();
                                    for (int i = 0; i < columnCount; i++) {
                                        int type = o.getType(i);
                                        if (type == 0) {
                                            objArr[i] = null;
                                        } else if (type == 1) {
                                            objArr[i] = Long.valueOf(o.getLong(i));
                                        } else if (type == 2) {
                                            objArr[i] = Double.valueOf(o.getDouble(i));
                                        } else if (type == 3) {
                                            objArr[i] = o.getString(i);
                                        } else if (type == 4) {
                                            objArr[i] = o.getBlob(i);
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                CloseableKt.closeFinally(o, (Throwable) null);
                                o = matrixCursor;
                            } catch (Throwable th5) {
                                Throwable th6 = th5;
                                CloseableKt.closeFinally(o, th);
                                throw th6;
                            }
                        }
                    }
                    ? qae = new qae(0);
                    ? qae2 = new qae(0);
                    while (o.moveToNext()) {
                        String string = o.getString(0);
                        if (((ArrayList) qae.get(string)) == null) {
                            qae.put(string, new ArrayList());
                        }
                        String string2 = o.getString(0);
                        if (((ArrayList) qae2.get(string2)) == null) {
                            qae2.put(string2, new ArrayList());
                        }
                    }
                    o.moveToPosition(-1);
                    ypg.b(qae);
                    ypg.a(qae2);
                    ArrayList arrayList = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        String string3 = o.isNull(0) ? null : o.getString(0);
                        xog K = o5a.K(o.getInt(1));
                        t64 a2 = t64.a(o.isNull(2) ? null : o.getBlob(2));
                        int i2 = o.getInt(3);
                        int i3 = o.getInt(4);
                        ArrayList arrayList2 = (ArrayList) qae.get(o.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = arrayList2;
                        ArrayList arrayList4 = (ArrayList) qae2.get(o.getString(0));
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList.add(new wpg(string3, K, a2, i2, i3, arrayList3, arrayList4));
                    }
                    i6d3.r();
                    o.close();
                    i6d3.l();
                    return arrayList;
                } catch (Throwable th7) {
                    i6d3.l();
                    throw th7;
                }
        }
    }

    public void finalize() {
        switch (this.a) {
            case 2:
                ((d7d) this.b).o();
                return;
            case 3:
                ((d7d) this.b).o();
                return;
            default:
                super.finalize();
                return;
        }
    }
}
