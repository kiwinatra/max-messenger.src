package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: r2g  reason: default package */
public abstract class r2g {
    public final ts a;
    public final ts b;
    public final ts c;

    public r2g(ts tsVar, ts tsVar2, ts tsVar3) {
        this.a = tsVar;
        this.b = tsVar2;
        this.c = tsVar3;
    }

    public abstract s2g a();

    public final Class b(Class cls) {
        String name = cls.getName();
        ts tsVar = this.c;
        Class cls2 = (Class) tsVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        String name2 = cls.getPackage().getName();
        String simpleName = cls.getSimpleName();
        Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
        tsVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        ts tsVar = this.a;
        Method method = (Method) tsVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Class<r2g> cls = r2g.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        tsVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        ts tsVar = this.b;
        Method method = (Method) tsVar.get(name);
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod("write", new Class[]{cls, r2g.class});
        tsVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((s2g) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((s2g) this).e.readParcelable(s2g.class.getClassLoader());
    }

    public final t2g h() {
        String readString = ((s2g) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (t2g) c(readString).invoke((Object) null, new Object[]{a()});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((s2g) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((s2g) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(t2g t2g) {
        if (t2g == null) {
            ((s2g) this).e.writeString((String) null);
            return;
        }
        try {
            ((s2g) this).e.writeString(b(t2g.getClass()).getName());
            s2g a2 = a();
            try {
                d(t2g.getClass()).invoke((Object) null, new Object[]{t2g, a2});
                int i = a2.i;
                if (i >= 0) {
                    int i2 = a2.d.get(i);
                    Parcel parcel = a2.e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(t2g.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
