package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

/* renamed from: is  reason: default package */
public final class is implements ReadWriteProperty {
    public static final Object o = new Object();
    public final String a;
    public final Class b;
    public final Object c;

    public is(Class cls, Object obj, String str) {
        this.a = str;
        this.b = cls;
        this.c = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(one.me.sdk.arch.Widget r7) {
        /*
            r6 = this;
            android.os.Bundle r0 = r7.getArgs()
            java.lang.String r1 = r6.a
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x0015
            java.lang.Object r2 = o
            java.lang.Object r3 = r6.c
            if (r3 == r2) goto L_0x0015
        L_0x0012:
            r0 = r3
            goto L_0x016b
        L_0x0015:
            android.os.Bundle r7 = r7.getArgs()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class r6 = r6.b
            r3 = 0
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r4)     // Catch:{ all -> 0x0169 }
            if (r4 != 0) goto L_0x015b
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x0169 }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r4)     // Catch:{ all -> 0x0169 }
            if (r5 != 0) goto L_0x015b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r4)     // Catch:{ all -> 0x0169 }
            if (r4 == 0) goto L_0x0036
            goto L_0x015b
        L_0x0036:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            if (r4 != 0) goto L_0x0156
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r3)     // Catch:{ all -> 0x0169 }
            if (r4 != 0) goto L_0x0156
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            if (r2 == 0) goto L_0x004a
            goto L_0x0156
        L_0x004a:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            if (r2 != 0) goto L_0x0147
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0169 }
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            if (r4 != 0) goto L_0x0147
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            if (r2 == 0) goto L_0x0062
            goto L_0x0147
        L_0x0062:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            if (r2 != 0) goto L_0x0138
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0169 }
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            if (r4 != 0) goto L_0x0138
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            if (r2 == 0) goto L_0x007a
            goto L_0x0138
        L_0x007a:
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            if (r2 != 0) goto L_0x0129
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ all -> 0x0169 }
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            if (r4 != 0) goto L_0x0129
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            if (r2 == 0) goto L_0x0092
            goto L_0x0129
        L_0x0092:
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            if (r2 != 0) goto L_0x011a
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch:{ all -> 0x0169 }
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            if (r4 != 0) goto L_0x011a
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            if (r2 == 0) goto L_0x00aa
            goto L_0x011a
        L_0x00aa:
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            if (r2 == 0) goto L_0x00c6
            java.lang.String r6 = r7.getString(r1)     // Catch:{ all -> 0x0169 }
            if (r6 == 0) goto L_0x0169
            java.lang.String r7 = ","
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch:{ all -> 0x0169 }
            r1 = 4
            r2 = 1
            java.util.List r3 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r6, (java.lang.String[]) r7, (boolean) r2, 0, (int) r1, (java.lang.Object) null)     // Catch:{ all -> 0x0169 }
            goto L_0x0169
        L_0x00c6:
            java.lang.Class<java.lang.Integer[]> r2 = java.lang.Integer[].class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)     // Catch:{ all -> 0x0169 }
            r4 = 0
            if (r2 == 0) goto L_0x00f1
            java.lang.String[] r6 = r7.getStringArray(r1)     // Catch:{ all -> 0x0169 }
            if (r6 == 0) goto L_0x0169
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0169 }
            int r1 = r6.length     // Catch:{ all -> 0x0169 }
            r7.<init>(r1)     // Catch:{ all -> 0x0169 }
            int r1 = r6.length     // Catch:{ all -> 0x0169 }
        L_0x00dc:
            if (r4 >= r1) goto L_0x00ee
            r2 = r6[r4]     // Catch:{ all -> 0x0169 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0169 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0169 }
            r7.add(r2)     // Catch:{ all -> 0x0169 }
            int r4 = r4 + 1
            goto L_0x00dc
        L_0x00ee:
            r3 = r7
            goto L_0x0169
        L_0x00f1:
            java.lang.Class<hv0> r2 = defpackage.hv0.class
            boolean r2 = r2.isAssignableFrom(r6)     // Catch:{ all -> 0x0169 }
            if (r2 == 0) goto L_0x0169
            java.lang.String r7 = r7.getString(r1)     // Catch:{ all -> 0x0169 }
            java.lang.Object[] r6 = r6.getEnumConstants()     // Catch:{ all -> 0x0169 }
            if (r6 == 0) goto L_0x0106
            r6 = r6[r4]     // Catch:{ all -> 0x0169 }
            goto L_0x0107
        L_0x0106:
            r6 = r3
        L_0x0107:
            boolean r1 = r6 instanceof defpackage.hv0     // Catch:{ all -> 0x0169 }
            if (r1 == 0) goto L_0x010e
            hv0 r6 = (defpackage.hv0) r6     // Catch:{ all -> 0x0169 }
            goto L_0x010f
        L_0x010e:
            r6 = r3
        L_0x010f:
            if (r6 == 0) goto L_0x0169
            if (r7 != 0) goto L_0x0115
            java.lang.String r7 = ""
        L_0x0115:
            java.lang.Object r3 = r6.a(r7)     // Catch:{ all -> 0x0169 }
            goto L_0x0169
        L_0x011a:
            java.lang.String r6 = r7.getString(r1)     // Catch:{ all -> 0x0169 }
            if (r6 == 0) goto L_0x0169
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ all -> 0x0169 }
            java.lang.Float r3 = java.lang.Float.valueOf(r6)     // Catch:{ all -> 0x0169 }
            goto L_0x0169
        L_0x0129:
            java.lang.String r6 = r7.getString(r1)     // Catch:{ all -> 0x0169 }
            if (r6 == 0) goto L_0x0169
            double r6 = java.lang.Double.parseDouble(r6)     // Catch:{ all -> 0x0169 }
            java.lang.Double r3 = java.lang.Double.valueOf(r6)     // Catch:{ all -> 0x0169 }
            goto L_0x0169
        L_0x0138:
            java.lang.String r6 = r7.getString(r1)     // Catch:{ all -> 0x0169 }
            if (r6 == 0) goto L_0x0169
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ all -> 0x0169 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0169 }
            goto L_0x0169
        L_0x0147:
            java.lang.String r6 = r7.getString(r1)     // Catch:{ all -> 0x0169 }
            if (r6 == 0) goto L_0x0169
            boolean r6 = java.lang.Boolean.parseBoolean(r6)     // Catch:{ all -> 0x0169 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0169 }
            goto L_0x0169
        L_0x0156:
            java.lang.String r3 = r7.getString(r1)     // Catch:{ all -> 0x0169 }
            goto L_0x0169
        L_0x015b:
            java.lang.String r6 = r7.getString(r1)     // Catch:{ all -> 0x0169 }
            if (r6 == 0) goto L_0x0169
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x0169 }
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0169 }
        L_0x0169:
            if (r3 != 0) goto L_0x0012
        L_0x016b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is.a(one.me.sdk.arch.Widget):java.lang.Object");
    }

    public final void b(Widget widget, Object obj) {
        Bundle args = widget.getArgs();
        String str = this.a;
        if (obj == null) {
            args.remove(str);
            return;
        }
        Class cls = this.b;
        if (!Intrinsics.areEqual((Object) cls, (Object) Boolean.class)) {
            Class cls2 = Boolean.TYPE;
            if (!Intrinsics.areEqual((Object) cls, (Object) cls2) && !Intrinsics.areEqual((Object) cls, (Object) cls2)) {
                if (Intrinsics.areEqual((Object) cls, (Object) boolean[].class)) {
                    args.putBooleanArray(str, (boolean[]) obj);
                    return;
                }
                if (!Intrinsics.areEqual((Object) cls, (Object) Character.class)) {
                    Class cls3 = Character.TYPE;
                    if (!Intrinsics.areEqual((Object) cls, (Object) cls3) && !Intrinsics.areEqual((Object) cls, (Object) cls3)) {
                        if (Intrinsics.areEqual((Object) cls, (Object) char[].class)) {
                            args.putCharArray(str, (char[]) obj);
                            return;
                        } else if (Intrinsics.areEqual((Object) cls, (Object) CharSequence.class)) {
                            args.putCharSequence(str, (CharSequence) obj);
                            return;
                        } else if (Intrinsics.areEqual((Object) cls, (Object) CharSequence[].class)) {
                            args.putCharSequenceArray(str, (CharSequence[]) obj);
                            return;
                        } else {
                            Class<String> cls4 = String.class;
                            if (Intrinsics.areEqual((Object) cls, (Object) cls4) || Intrinsics.areEqual((Object) cls, (Object) null) || Intrinsics.areEqual((Object) cls, (Object) cls4)) {
                                args.putString(str, (String) obj);
                                return;
                            } else if (Intrinsics.areEqual((Object) cls, (Object) String[].class)) {
                                args.putStringArray(str, (String[]) obj);
                                return;
                            } else {
                                if (!Intrinsics.areEqual((Object) cls, (Object) Integer.class)) {
                                    Class cls5 = Integer.TYPE;
                                    if (!Intrinsics.areEqual((Object) cls, (Object) cls5) && !Intrinsics.areEqual((Object) cls, (Object) cls5)) {
                                        if (Intrinsics.areEqual((Object) cls, (Object) int[].class)) {
                                            args.putIntArray(str, (int[]) obj);
                                            return;
                                        }
                                        if (!Intrinsics.areEqual((Object) cls, (Object) Long.class)) {
                                            Class cls6 = Long.TYPE;
                                            if (!Intrinsics.areEqual((Object) cls, (Object) cls6) && !Intrinsics.areEqual((Object) cls, (Object) cls6)) {
                                                if (Intrinsics.areEqual((Object) cls, (Object) long[].class)) {
                                                    args.putLongArray(str, (long[]) obj);
                                                    return;
                                                }
                                                if (!Intrinsics.areEqual((Object) cls, (Object) Float.class)) {
                                                    Class cls7 = Float.TYPE;
                                                    if (!Intrinsics.areEqual((Object) cls, (Object) cls7) && !Intrinsics.areEqual((Object) cls, (Object) cls7)) {
                                                        if (Intrinsics.areEqual((Object) cls, (Object) float[].class)) {
                                                            args.putFloatArray(str, (float[]) obj);
                                                            return;
                                                        }
                                                        if (!Intrinsics.areEqual((Object) cls, (Object) Double.class)) {
                                                            Class cls8 = Double.TYPE;
                                                            if (!Intrinsics.areEqual((Object) cls, (Object) cls8) && !Intrinsics.areEqual((Object) cls, (Object) cls8)) {
                                                                if (Intrinsics.areEqual((Object) cls, (Object) double[].class)) {
                                                                    args.putDoubleArray(str, (double[]) obj);
                                                                    return;
                                                                }
                                                                if (!Intrinsics.areEqual((Object) cls, (Object) Short.class)) {
                                                                    Class cls9 = Short.TYPE;
                                                                    if (!Intrinsics.areEqual((Object) cls, (Object) cls9) && !Intrinsics.areEqual((Object) cls, (Object) cls9)) {
                                                                        if (Intrinsics.areEqual((Object) cls, (Object) short[].class)) {
                                                                            args.putShortArray(str, (short[]) obj);
                                                                            return;
                                                                        }
                                                                        if (!Intrinsics.areEqual((Object) cls, (Object) Byte.class)) {
                                                                            Class cls10 = Byte.TYPE;
                                                                            if (!Intrinsics.areEqual((Object) cls, (Object) cls10) && !Intrinsics.areEqual((Object) cls, (Object) cls10)) {
                                                                                if (Intrinsics.areEqual((Object) cls, (Object) byte[].class)) {
                                                                                    args.putByteArray(str, (byte[]) obj);
                                                                                    return;
                                                                                } else if (Intrinsics.areEqual((Object) cls, (Object) Parcelable[].class)) {
                                                                                    args.putParcelableArray(str, (Parcelable[]) obj);
                                                                                    return;
                                                                                } else if (Intrinsics.areEqual((Object) cls, (Object) Bundle.class)) {
                                                                                    args.putBundle(str, (Bundle) obj);
                                                                                    return;
                                                                                } else if (Intrinsics.areEqual((Object) cls, (Object) Size.class)) {
                                                                                    args.putSize(str, (Size) obj);
                                                                                    return;
                                                                                } else if (Intrinsics.areEqual((Object) cls, (Object) SizeF.class)) {
                                                                                    args.putSizeF(str, (SizeF) obj);
                                                                                    return;
                                                                                } else if (Intrinsics.areEqual((Object) cls, (Object) ArrayList.class)) {
                                                                                    ArrayList arrayList = (ArrayList) obj;
                                                                                    if (!arrayList.isEmpty()) {
                                                                                        Object first = CollectionsKt.first(arrayList);
                                                                                        if (first instanceof String) {
                                                                                            args.putStringArrayList(str, arrayList);
                                                                                            return;
                                                                                        } else if (first instanceof Parcelable) {
                                                                                            args.putParcelableArrayList(str, arrayList);
                                                                                            return;
                                                                                        } else if (first instanceof CharSequence) {
                                                                                            args.putCharSequenceArrayList(str, arrayList);
                                                                                            return;
                                                                                        } else if (first instanceof Integer) {
                                                                                            args.putIntegerArrayList(str, arrayList);
                                                                                            return;
                                                                                        } else {
                                                                                            throw new UnsupportedOperationException(String.format("ArrayList with type of `%s` is not supported!", Arrays.copyOf(new Object[]{CollectionsKt.first(arrayList).getClass()}, 1)));
                                                                                        }
                                                                                    } else {
                                                                                        return;
                                                                                    }
                                                                                } else if (Intrinsics.areEqual((Object) cls, (Object) SparseArray.class)) {
                                                                                    SparseArray sparseArray = (SparseArray) obj;
                                                                                    if (sparseArray.size() != 0) {
                                                                                        Object valueAt = sparseArray.valueAt(0);
                                                                                        if (valueAt instanceof Parcelable) {
                                                                                            args.putSparseParcelableArray(str, sparseArray);
                                                                                            return;
                                                                                        }
                                                                                        throw new UnsupportedOperationException(String.format("SparseArray with type of `%s` is not supported!", Arrays.copyOf(new Object[]{valueAt.getClass()}, 1)));
                                                                                    }
                                                                                    return;
                                                                                } else if (IBinder.class.isAssignableFrom(cls)) {
                                                                                    args.putBinder(str, (IBinder) obj);
                                                                                    return;
                                                                                } else if (Parcelable.class.isAssignableFrom(cls)) {
                                                                                    args.putParcelable(str, (Parcelable) obj);
                                                                                    return;
                                                                                } else if (Serializable.class.isAssignableFrom(cls)) {
                                                                                    args.putSerializable(str, (Serializable) obj);
                                                                                    return;
                                                                                } else {
                                                                                    throw new UnsupportedOperationException(String.format("Value of `%s` type is not supported", Arrays.copyOf(new Object[]{cls}, 1)));
                                                                                }
                                                                            }
                                                                        }
                                                                        args.putByte(str, ((Byte) obj).byteValue());
                                                                        return;
                                                                    }
                                                                }
                                                                args.putShort(str, ((Short) obj).shortValue());
                                                                return;
                                                            }
                                                        }
                                                        args.putDouble(str, ((Double) obj).doubleValue());
                                                        return;
                                                    }
                                                }
                                                args.putFloat(str, ((Float) obj).floatValue());
                                                return;
                                            }
                                        }
                                        args.putLong(str, ((Long) obj).longValue());
                                        return;
                                    }
                                }
                                args.putInt(str, ((Integer) obj).intValue());
                                return;
                            }
                        }
                    }
                }
                args.putChar(str, ((Character) obj).charValue());
                return;
            }
        }
        args.putBoolean(str, ((Boolean) obj).booleanValue());
    }

    public final /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return a((Widget) obj);
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
        b((Widget) obj, obj2);
    }

    public /* synthetic */ is(Class cls, String str) {
        this(cls, o, str);
    }
}
