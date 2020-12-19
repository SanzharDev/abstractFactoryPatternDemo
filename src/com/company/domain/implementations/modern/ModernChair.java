package com.company.domain.implementations.modern;

import com.company.domain.interfaces.Chair;

public class ModernChair implements Chair {

    private boolean hasLegs = true;

    private boolean sitOn = true;

    public void setHasLegs(boolean hasLegs) {
        this.hasLegs = hasLegs;
    }

    public void setSitOn(boolean sitOn) {
        this.sitOn = sitOn;
    }

    @Override
    public boolean hasLegs() {
        return hasLegs;
    }

    @Override
    public boolean sitOn() {
        return sitOn;
    }
}
