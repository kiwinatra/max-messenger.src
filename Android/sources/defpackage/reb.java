package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* renamed from: reb  reason: default package */
public class reb implements Externalizable {
    public seb A0 = null;
    public boolean B0;
    public seb C0 = null;
    public boolean D0;
    public seb E0 = null;
    public boolean F0;
    public seb G0 = null;
    public boolean H0;
    public seb I0 = null;
    public boolean J0;
    public seb K0 = null;
    public boolean L0;
    public seb M0 = null;
    public boolean N0;
    public seb O0 = null;
    public boolean P0;
    public seb Q0 = null;
    public String R0 = "";
    public int S0 = 0;
    public String T0 = "";
    public boolean U0;
    public String V0 = "";
    public boolean W0;
    public seb X = null;
    public String X0 = "";
    public boolean Y;
    public boolean Y0;
    public seb Z = null;
    public String Z0 = "";
    public boolean a;
    public boolean a1;
    public seb b = null;
    public String b1 = "";
    public boolean c;
    public boolean c1;
    public String d1 = "";
    public boolean e1 = false;
    public final ArrayList f1 = new ArrayList();
    public final ArrayList g1 = new ArrayList();
    public boolean h1 = false;
    public boolean i1;
    public String j1 = "";
    public boolean k1 = false;
    public seb o = null;
    public boolean v;
    public boolean v0;
    public seb w = null;
    public seb w0 = null;
    public boolean x;
    public boolean x0;
    public seb y = null;
    public seb y0 = null;
    public boolean z;
    public boolean z0;

    public void a(String str) {
        this.R0 = str;
    }

    public void b(String str) {
        this.T0 = str;
    }

    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            seb seb = new seb();
            seb.readExternal(objectInput);
            this.a = true;
            this.b = seb;
        }
        if (objectInput.readBoolean()) {
            seb seb2 = new seb();
            seb2.readExternal(objectInput);
            this.c = true;
            this.o = seb2;
        }
        if (objectInput.readBoolean()) {
            seb seb3 = new seb();
            seb3.readExternal(objectInput);
            this.v = true;
            this.w = seb3;
        }
        if (objectInput.readBoolean()) {
            seb seb4 = new seb();
            seb4.readExternal(objectInput);
            this.x = true;
            this.y = seb4;
        }
        if (objectInput.readBoolean()) {
            seb seb5 = new seb();
            seb5.readExternal(objectInput);
            this.z = true;
            this.X = seb5;
        }
        if (objectInput.readBoolean()) {
            seb seb6 = new seb();
            seb6.readExternal(objectInput);
            this.Y = true;
            this.Z = seb6;
        }
        if (objectInput.readBoolean()) {
            seb seb7 = new seb();
            seb7.readExternal(objectInput);
            this.v0 = true;
            this.w0 = seb7;
        }
        if (objectInput.readBoolean()) {
            seb seb8 = new seb();
            seb8.readExternal(objectInput);
            this.x0 = true;
            this.y0 = seb8;
        }
        if (objectInput.readBoolean()) {
            seb seb9 = new seb();
            seb9.readExternal(objectInput);
            this.z0 = true;
            this.A0 = seb9;
        }
        if (objectInput.readBoolean()) {
            seb seb10 = new seb();
            seb10.readExternal(objectInput);
            this.B0 = true;
            this.C0 = seb10;
        }
        if (objectInput.readBoolean()) {
            seb seb11 = new seb();
            seb11.readExternal(objectInput);
            this.D0 = true;
            this.E0 = seb11;
        }
        if (objectInput.readBoolean()) {
            seb seb12 = new seb();
            seb12.readExternal(objectInput);
            this.F0 = true;
            this.G0 = seb12;
        }
        if (objectInput.readBoolean()) {
            seb seb13 = new seb();
            seb13.readExternal(objectInput);
            this.H0 = true;
            this.I0 = seb13;
        }
        if (objectInput.readBoolean()) {
            seb seb14 = new seb();
            seb14.readExternal(objectInput);
            this.J0 = true;
            this.K0 = seb14;
        }
        if (objectInput.readBoolean()) {
            seb seb15 = new seb();
            seb15.readExternal(objectInput);
            this.L0 = true;
            this.M0 = seb15;
        }
        if (objectInput.readBoolean()) {
            seb seb16 = new seb();
            seb16.readExternal(objectInput);
            this.N0 = true;
            this.O0 = seb16;
        }
        if (objectInput.readBoolean()) {
            seb seb17 = new seb();
            seb17.readExternal(objectInput);
            this.P0 = true;
            this.Q0 = seb17;
        }
        a(objectInput.readUTF());
        this.S0 = objectInput.readInt();
        b(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.U0 = true;
            this.V0 = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.W0 = true;
            this.X0 = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.Y0 = true;
            this.Z0 = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.a1 = true;
            this.b1 = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.c1 = true;
            this.d1 = readUTF5;
        }
        this.e1 = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            peb peb = new peb();
            peb.readExternal(objectInput);
            this.f1.add(peb);
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            peb peb2 = new peb();
            peb2.readExternal(objectInput);
            this.g1.add(peb2);
        }
        this.h1 = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.i1 = true;
            this.j1 = readUTF6;
        }
        this.k1 = objectInput.readBoolean();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.a);
        if (this.a) {
            this.b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.c);
        if (this.c) {
            this.o.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.v);
        if (this.v) {
            this.w.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.x);
        if (this.x) {
            this.y.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.z);
        if (this.z) {
            this.X.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Y);
        if (this.Y) {
            this.Z.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.v0);
        if (this.v0) {
            this.w0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.x0);
        if (this.x0) {
            this.y0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.z0);
        if (this.z0) {
            this.A0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.B0);
        if (this.B0) {
            this.C0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.D0);
        if (this.D0) {
            this.E0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.F0);
        if (this.F0) {
            this.G0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.H0);
        if (this.H0) {
            this.I0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.J0);
        if (this.J0) {
            this.K0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.L0);
        if (this.L0) {
            this.M0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.N0);
        if (this.N0) {
            this.O0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.P0);
        if (this.P0) {
            this.Q0.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.R0);
        objectOutput.writeInt(this.S0);
        objectOutput.writeUTF(this.T0);
        objectOutput.writeBoolean(this.U0);
        if (this.U0) {
            objectOutput.writeUTF(this.V0);
        }
        objectOutput.writeBoolean(this.W0);
        if (this.W0) {
            objectOutput.writeUTF(this.X0);
        }
        objectOutput.writeBoolean(this.Y0);
        if (this.Y0) {
            objectOutput.writeUTF(this.Z0);
        }
        objectOutput.writeBoolean(this.a1);
        if (this.a1) {
            objectOutput.writeUTF(this.b1);
        }
        objectOutput.writeBoolean(this.c1);
        if (this.c1) {
            objectOutput.writeUTF(this.d1);
        }
        objectOutput.writeBoolean(this.e1);
        ArrayList arrayList = this.f1;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((peb) arrayList.get(i)).writeExternal(objectOutput);
        }
        int size2 = this.g1.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((peb) this.g1.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.h1);
        objectOutput.writeBoolean(this.i1);
        if (this.i1) {
            objectOutput.writeUTF(this.j1);
        }
        objectOutput.writeBoolean(this.k1);
    }
}
