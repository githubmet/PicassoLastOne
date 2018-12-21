package hikmetanil.picassolastone.transform;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.squareup.picasso.Transformation;

public class P008Transform implements Transformation {
    @Override
    public Bitmap transform(Bitmap source) {

        Canvas canvas=new Canvas(source);
        Paint paint=new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(150);
        paint.setARGB(255,255,255,255);
        canvas.drawCircle(200,200,200,paint);

        return source;
    }

    @Override
    public String key() {
        return "circle";
    }
}
