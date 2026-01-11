package doom;

import java.util.ArrayList;

public class TUI {
    private int screenWidth;
    private int screenHeight;
    private ArrayList<TUIReservation> reservations;

    public TUI(int screenWidth, int screenHeight) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.reservations = new ArrayList<>();
    }

    public TUI() {
        screenWidth = 40;
        screenHeight = 40;
        this.reservations = new ArrayList<>();
    }
    
    public void drawTUI() throws TUIException {
        // Create a screen buffer filled with spaces
        char[][] buffer = new char[screenHeight][screenWidth];
        for (int row = 0; row < screenHeight; row++) {
            for (int col = 0; col < screenWidth; col++) {
                buffer[row][col] = ' ';
            }
        }

        // Draw each reservation into the buffer
        for (TUIReservation tr : reservations) {
            int left = tr.topLeftCornerPosition.x;
            int top = tr.topLeftCornerPosition.y;
            int width = tr.dimensions.x;
            int height = tr.dimensions.y;

            // Use half-open ranges: [left, left + width), [top, top + height)
            for (int dy = 0; dy < height; dy++) {
                int row = top + dy;
                if (row < 0 || row >= screenHeight) {
                    continue;
                }

                String rowData = tr.getRow(dy);
                int rowLen = rowData != null ? rowData.length() : 0;

                for (int dx = 0; dx < width && dx < rowLen; dx++) {
                    int col = left + dx;
                    if (col < 0 || col >= screenWidth) {
                        continue;
                    }

                    buffer[row][col] = rowData.charAt(dx);
                }
            }
        }

        // Print the buffer
        for (int row = 0; row < screenHeight; row++) {
            System.out.println(new String(buffer[row]));
        }
    }
}
