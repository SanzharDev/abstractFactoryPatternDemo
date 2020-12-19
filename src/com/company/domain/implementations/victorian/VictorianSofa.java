package com.company.domain.implementations.victorian;

import com.company.domain.interfaces.Sofa;

public class VictorianSofa implements Sofa {

    private boolean hasLegs = true;

    private boolean sitOn = true;

    private boolean hasFillings = true;

    public void setHasLegs(boolean hasLegs) {
        this.hasLegs = hasLegs;
    }

    public void setSitOn(boolean sitOn) {
        this.sitOn = sitOn;
    }

    public void setHasFillings(boolean hasFillings) {
        this.hasFillings = hasFillings;
    }

    @Override
    public boolean hasLegs() {
        return hasLegs;
    }

    @Override
    public boolean sitOn() {
        return sitOn;
    }

    @Override
    public boolean hasFillings() {
        return hasFillings;
    }
}
