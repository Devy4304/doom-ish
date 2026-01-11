package doom;

public class TUIReservation {
    public TUIElement owner;
    public Vec2 topLeftCornerPosition;
    public Vec2 dimensions;

    public TUIReservation(TUIElement owner, Vec2 topLeftCornerPosition, Vec2 dimensions) {
        this.owner = owner;
        this.topLeftCornerPosition = topLeftCornerPosition;
        this.dimensions = dimensions;
    }

    public String getRow(int row) throws TUIException {
        String data = owner.requestTUIData(row);
        if (data.length() != dimensions.x) {
            throw new TUIException("TUI data returned from " + owner.getElementName() + " was not the required length.");
        }
        return data;
    }
}
