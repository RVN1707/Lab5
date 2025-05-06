package org.example.exemplars;

public class LocationTo {
    private Long x;
    private Long y; //Поле не может быть null
    private Float z;

    public LocationTo(Long x, Long y, Float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Long getX() {
        return x;
    }

    public Long getY() {
        return y;
    }

    public Float getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "LocationTo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
