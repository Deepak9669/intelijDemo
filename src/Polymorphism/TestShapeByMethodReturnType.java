package Polymorphism;

public class TestShapeByMethodReturnType {

    public static void main(String[] args) {

        Shape[] s = new Shape[3];

        s[0] = Shape.getShape(1);
        s[1] = Shape.getShape(1);
        s[2] = Shape.getShape(1);

        }

        Circle c = (Circle) s[0];
        c.setRadius(5);

        Rectangle r = (Rectangle) s[1];
        r.setLength(5);
        r.setWidth(4);

        Triangle t = (Triangle) s[2];
        t.setBase(4);
        t.setHeight(6);

        for (int i = 0; i < s.length; i++) {
            System.out.println("area :" + s[i].area());

        }

    }

    }
