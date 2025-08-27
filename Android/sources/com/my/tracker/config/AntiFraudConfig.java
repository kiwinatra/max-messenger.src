package com.my.tracker.config;

import com.my.tracker.obfuscated.m1;

public final class AntiFraudConfig {
    public final boolean useGyroscope;
    public final boolean useLightSensor;
    public final boolean useMagneticFieldSensor;
    public final boolean usePressureSensor;
    public final boolean useProximitySensor;

    public static final class Builder {
        boolean a = m1.a;
        boolean b = true;
        boolean c = true;
        boolean d = true;
        boolean e = m1.b;

        public AntiFraudConfig build() {
            return new AntiFraudConfig(this.a, this.b, this.c, this.d, this.e);
        }

        public Builder useGyroscopeSensor(boolean z) {
            this.c = z;
            return this;
        }

        public Builder useLightSensor(boolean z) {
            this.a = z;
            return this;
        }

        public Builder useMagneticFieldSensor(boolean z) {
            this.b = z;
            return this;
        }

        public Builder usePressureSensor(boolean z) {
            this.d = z;
            return this;
        }

        public Builder useProximitySensor(boolean z) {
            this.e = z;
            return this;
        }
    }

    public AntiFraudConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.useLightSensor = z;
        this.useMagneticFieldSensor = z2;
        this.useGyroscope = z3;
        this.usePressureSensor = z4;
        this.useProximitySensor = z5;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
