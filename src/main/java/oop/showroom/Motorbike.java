package oop.showroom;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Motorbike extends Vehicle{
    private MotorbikeType motorbikeType;
    private String motorbikeDrive;

    @Override
    Object getSimpleVehicle() {
        return null;
    }
    static class SimpleMotorbike {
        private final BrandType brandType;
        private final MotorbikeType motorbikeType;

        public SimpleMotorbike(Motorbike motorbike) {
            this.brandType = motorbike.getBrand();
            this.motorbikeType = motorbike.getMotorbikeType();
        }

        @Override
        public String toString() {
            return "SimpleMotorbike{" +
                    "brandType=" + brandType +
                    ", motorbikeType=" + motorbikeType +
                    '}';
        }
    }
    }
}
