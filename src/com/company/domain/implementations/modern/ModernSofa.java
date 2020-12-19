package com.company.domain.implementations.modern;

import com.company.domain.interfaces.Sofa;

public class ModernSofa implements Sofa {

    private boolean hasLegs = true;

    private boolean sitOn = true;

    private boolean hasFillings = true;

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
