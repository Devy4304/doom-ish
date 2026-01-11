package doom;

public interface TUIElement {
    String requestTUIData(int row);
    String getElementName();

    int getWidth();
    int getHeight();
}
