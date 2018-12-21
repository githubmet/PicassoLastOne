package hikmetanil.picassolastone.transform;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.squareup.picasso.Transformation;

public class P007Transform implements Transformation {
    @Override
    public Bitmap transform(Bitmap source) {

        Canvas canvas=new Canvas(source);
        Paint paint=new Paint();
        paint.setARGB(255,255,0,0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);

        canvas.drawRect(0,0,400,400,paint);
        return source;
    }

    @Override
    public String key() {
        return "frame";
    }
}
