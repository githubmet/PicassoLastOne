package hikmetanil.picassolastone.transform;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.squareup.picasso.Transformation;

public class P006Transform implements Transformation {
    String flowerName;
    public P006Transform(String flowerName) {
        this.flowerName = flowerName;
    }

    @Override
    public Bitmap transform(Bitmap source) {

        Canvas canvas=new Canvas(source);
        Paint paint=new Paint();
        paint.setTextSize(40);
        paint.setARGB(255,255,255,0);
        canvas.drawText(flowerName,0,400,paint);
        return source;
    }

    @Override
    public String key() {
        return "source";
    }
}
