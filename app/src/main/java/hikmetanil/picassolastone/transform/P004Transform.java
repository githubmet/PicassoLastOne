package hikmetanil.picassolastone.transform;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.squareup.picasso.Transformation;

public class P004Transform implements Transformation {
    @Override
    public Bitmap transform(Bitmap source) {

        Canvas canvas=new Canvas(source);
        Paint paint=new Paint();
        paint.setARGB(255,255,0,0); //paint.setColor(Color.RED);
        paint.setStrokeWidth(10f);
        paint.setStyle(Paint.Style.STROKE);

        canvas.drawLine(0,0,400,400,paint);
        canvas.drawLine(0,400,400,0,paint);

        return source;
    }

    @Override
    public String key() {
        return "deneme";
    }
}
