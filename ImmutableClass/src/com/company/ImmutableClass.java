package com.company;

public class ImmutableClass {
    private final String animal;
    private final String eyeColour;
    private final boolean hasWings;
    private final boolean hasTail;

    public ImmutableClass(String animal, String eyeColour, boolean hasWings, boolean hasTail) {
        this.animal = animal;
        this.eyeColour = eyeColour;
        this.hasWings = hasWings;
        this.hasTail = hasTail;
    }

    public final boolean isHasTail() {
        return this.hasTail;
    }

    public final boolean canFly() {
        return this.hasWings;
    }

    public final ImmutableClass setAnimal(String animal) {
        return new ImmutableClass(animal, this.eyeColour, this.hasWings, this.hasTail);
    }

    public final ImmutableClass setEyeColour(String eyeColour) {
        return new ImmutableClass(this.animal, eyeColour, this.hasWings, this.hasTail);
    }

    public final ImmutableClass setHasWings(boolean hasWings) {
        return new ImmutableClass(this.animal, this.eyeColour, hasWings, this.hasTail);
    }

    public final ImmutableClass setHasTail(boolean hasTail) {
        return new ImmutableClass(this.animal, this.eyeColour, this.hasWings, hasTail);
    }

    @Override
    public String toString() {
        return "Animal >> " + this.animal + " with " + this.eyeColour + " colour of eyes\n" + (isHasTail() ? "Has a tail. " : "Doesn't have a tail. ") + (canFly() ? "Can fly." : "Cannot fly.");
    }
}
