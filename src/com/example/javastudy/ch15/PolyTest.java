package com.example.javastudy.ch15;

interface Chargeable {
    void charge();
}


public class PolyTest {
    Object[] objs = {new Phone(), new HandPhone(), 
                     new Camera(), new DigitalCamera()};

    void badCase() {
        for (Object obj : objs) {
            if (obj instanceof HandPhone) {
                HandPhone phone = (HandPhone) obj;
                phone.charge();
            } else if (obj instanceof DigitalCamera) {
                DigitalCamera camera = (DigitalCamera) obj;
                camera.charge();
            }
        }
    }

    void goodCase() {
        // TODO: 3. Chargeable한 요소들을 찾아서 충전하세요.
        // END:
    }

}
