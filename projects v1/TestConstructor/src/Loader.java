public class Loader {

    public static void main(String[] args) {


    class Box {
        int width; // ширина коробки
        int height; // высота коробки
        int depth; // глубина коробки

        // Конструктор
        Box() {
            width = 10;
            height = 10;
            depth = 10;
        }

        // вычисляем объём коробки
        int getVolume() {
            return width * height * depth;
        }
        Box catBox = new Box();
        mInfoTextView.setText("Объём коробки: " + catBox.getVolume());
    }
    }
}
