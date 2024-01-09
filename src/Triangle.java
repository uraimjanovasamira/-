public class Triangle {
        double a;
        double b;
        double c;

        void area() {
            //Формула Герона
            double halfMeter = (a + b + c) / 2;
            double formula = Math.sqrt(halfMeter * (halfMeter - a) * (halfMeter - b) * (halfMeter - c));
            System.out.println("Площадь треугольника-" + formula);
        }

    }

