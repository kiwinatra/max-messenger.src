package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* renamed from: hha  reason: default package */
public final class hha extends hvg implements p67 {
    public final Object d;

    public hha(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 4);
        this.d = obj;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [p67, bvg] */
    public static p67 L0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof p67 ? (p67) queryLocalInterface : new bvg(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }

    public static Object M0(p67 p67) {
        if (p67 instanceof hha) {
            return ((hha) p67).d;
        }
        IBinder asBinder = p67.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            vzg.m(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException(wj6.h(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
    }
}
