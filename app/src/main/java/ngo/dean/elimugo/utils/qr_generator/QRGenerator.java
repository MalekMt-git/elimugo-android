package ngo.dean.elimugo.utils.qr_generator;

import android.graphics.Bitmap;

import javax.inject.Inject;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.WHITE;

public class QRGenerator {

    private static final int SIZE = 600; // TODO: This should change depending on the device

    @Inject
    public QRGenerator() { }

    public static Bitmap createQRCode(String contents) {
        BitMatrix matrix = generateMatrix(contents);
        if (matrix != null) {
            return matrixToBitmap(matrix);
        }
        return null;
    }

    private static BitMatrix generateMatrix(String contents) {
        try {
            return new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, SIZE, SIZE);
        } catch (WriterException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Bitmap matrixToBitmap(BitMatrix matrix) {
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int[] pixels = new int[width * height];
        for (int y = 0; y < height; y++) {
            int offset = y * width;
            for(int x = 0; x < width; x++) {
                pixels[offset + x] = matrix.get(x, y) ? BLACK : WHITE;
            }
        }
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        bitmap.setPixels(pixels, 0, SIZE, 0, 0, width, height);
        return bitmap;
    }
}
